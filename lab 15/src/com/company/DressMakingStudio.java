package com.company;

public class DressMakingStudio {
    public void dressMale(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof IMaleClothes) { //Оператор instanceof нужен, чтобы проверить, был ли объект, на который ссылается переменная X, создан на основе какого-либо класса Y
                System.out.println(clothe);
            }
        }
    }

    public void dressFemale(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof IFemaleClothes) {
                System.out.println(clothe);
            }
        }
    }

    public interface IFemaleClothes {
        default void dressFemale() {
            System.out.println("Одеваем женщину");
        }
    }

    public interface IMaleClothes {
        default void dressMale() {
            System.out.println("Одеваем мужчину");
        }
    }

    public static class Skirt extends Clothes implements IFemaleClothes {
        public Skirt(Sizes size, String color) {
            super(size, color);
        }

        public Skirt(Sizes size, String color, double cost) {
            super(size, color, cost);
        }

        @Override
        public String toString() {
            return "Юбка:" + "размер = " + getSize() + ", цена = " + getCost() + " рублей" + ", цвет = " + getColor();
        }
    }

    public static class TeeShirt extends Clothes implements IMaleClothes, IFemaleClothes {
        public TeeShirt(Sizes size, String color) {
            super(size, color);
        }

        public TeeShirt(Sizes size, String color, double cost) {
            super(size, color, cost);
        }

        @Override
        public String toString() {
            return "Футболка:" + "размер = " + getSize() + ", цена = " + getCost() + " рублей" + ", цвет = " + getColor();
        }
    }

    public static class Tie extends Clothes implements IMaleClothes {
        public Tie(Sizes size, String color) {
            super(size, color);
        }

        public Tie(Sizes size, String color, double cost) {
            super(size, color, cost);
        }

        @Override
        public String toString() {
            return "Галстук:" + "размер = " + getSize() + ", цена = " + getCost() + " рублей" + ", цвет = " + getColor();
        }
    }

    public static class Trousers extends Clothes implements IMaleClothes, IFemaleClothes {
        public Trousers(Sizes size, String color) {
            super(size, color);
        }

        public Trousers(Sizes size, String color, double cost) {
            super(size, color, cost);
        }

        @Override
        public String toString() {
            return "Штаны:" + "размер = " + getSize() + ", цена = " + getCost() + " рублей" + ", цвет = " + getColor();
        }
    }
}
