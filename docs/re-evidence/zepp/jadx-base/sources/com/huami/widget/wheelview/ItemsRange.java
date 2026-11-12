package com.huami.widget.wheelview;

/* JADX INFO: loaded from: classes17.dex */
public class ItemsRange {
    private int a;
    private int b;

    public ItemsRange() {
        this(0, 0);
    }

    public boolean contains(int i) {
        return i >= getFirst() && i <= getLast();
    }

    public int getCount() {
        return this.b;
    }

    public int getFirst() {
        return this.a;
    }

    public int getLast() {
        return (getFirst() + getCount()) - 1;
    }

    public ItemsRange(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
