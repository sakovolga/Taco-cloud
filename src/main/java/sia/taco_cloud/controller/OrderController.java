package sia.taco_cloud.controller;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import sia.taco_cloud.entity.TacoOrder;

@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder order, Errors errors,
                               SessionStatus sessionStatus) {
        if (errors.hasErrors()) {
            return "orderForm";
        }
        log.info("Order submitted: {}", order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
