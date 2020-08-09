package com.alexander.komegunov.ships;

import com.alexander.komegunov.ships.types.Size;
import com.alexander.komegunov.ships.types.Type;

public class Ship {
    private int count;
    private final Size size;
    private final Type type;

    public Ship(Size size, Type type) {
        this.size = size;
        this.type = type;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countCheck() {
        return count < size.getValue();
    }

    public int getCount() {
        return count;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }
}