package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class ItemDecorator extends Item {
    public Item item;
    public abstract double getPrice();
}
