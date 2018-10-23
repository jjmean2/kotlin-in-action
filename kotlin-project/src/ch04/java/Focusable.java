package ch04.java;

public interface Focusable {
    default void setFocus(boolean b) {
        System.out.println("I " + (b ? "got" : "lost") + " focus.");
    }

    default void showOff() {
        System.out.println("I'm focusable!");
    }

}
