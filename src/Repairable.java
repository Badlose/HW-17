public interface Repairable {

    default void updateTyre() {
        System.out.println("Тут нет колес");
    };

    default void checkEngine() {
        System.out.println("У данного транспортного средства нет двигателя. Нечего обслуживать");
    };

    default void checkTrailer() {
        System.out.println("У данного транспортного средства нет прицепа. Нечего обслуживать");
    };
}
