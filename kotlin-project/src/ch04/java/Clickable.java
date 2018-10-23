package ch04.java;

public interface Clickable {
    void click();
    default void showOff() {
        System.out.println("I'm clickable!");
    }
}
