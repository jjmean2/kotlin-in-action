package ch04.java;

public class Button implements Clickable, Focusable {
    @Override
    public void click() {
        System.out.println("I was clicked");
    }

    @Override
    public void showOff() {
        Clickable.super.showOff();
        Focusable.super.showOff();
    }
}
