//package sia.taco_cloud.converter;
//
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//import sia.taco_cloud.entity.Ingredient;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//@Component
//public class IngredientsByIdConverter implements Converter<String[], List<Ingredient>> {
//
//    private final IngredientByIdConverter ingredientByIdConverter;
//
//    public IngredientsByIdConverter(IngredientByIdConverter ingredientByIdConverter) {
//        this.ingredientByIdConverter = ingredientByIdConverter;
//    }
//
//    @Override
//    public List<Ingredient> convert(String[] source) {
//        return Arrays.stream(source)
//                .map(ingredientByIdConverter::convert)
//                .collect(Collectors.toList());
//    }
//}
