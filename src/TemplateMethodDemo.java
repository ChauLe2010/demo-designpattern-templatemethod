public class TemplateMethodDemo {
    public static void main(String[] args) {
        Meal mealHam=new HamburgerMeal();
        mealHam.doMeal();
        System.out.println();
        Meal mealTaco=new TacoMeal();
        mealTaco.doMeal();
    }
}
