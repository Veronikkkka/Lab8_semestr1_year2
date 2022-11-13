package ua.edu.ucu.apps.demo.flower;

public class BoxDecorator extends ItemDecorator{
    @Override
    public double getPrice() {
        return this.item.getPrice() + 25;
    }
}
