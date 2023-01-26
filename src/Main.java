import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия",
                "МКПП", "Седан", "А001АА", 4, true);
        Car audi = new Car ("AUDI", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия",
                "АКПП", "Седан", "А002АА", 4, true);
        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия",
                "АКПП", "Родстер", "003", 2, true);
        Car kia = new Car("KIA", "Sportage 4th gen", 2.4, "Красный", 2018, "Южная Корея",
                "АКПП", "Кроссовер", "004", 5, true);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея",
                "АКПП", "Купе", "005", 2, true);

        System.out.println(kia);
    }
}