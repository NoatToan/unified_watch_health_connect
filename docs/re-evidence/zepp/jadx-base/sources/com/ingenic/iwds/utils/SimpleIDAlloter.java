package com.ingenic.iwds.utils;

/* JADX INFO: loaded from: classes18.dex */
public class SimpleIDAlloter {
    public static final int INVALID = 0;
    private int a = 0;

    private SimpleIDAlloter() {
    }

    public static boolean isValid(int i) {
        return i != 0;
    }

    public static SimpleIDAlloter newInstance() {
        return new SimpleIDAlloter();
    }

    public int allocation() {
        int i = this.a + 1;
        this.a = i;
        return i;
    }

    public void initialize() {
        this.a = 0;
    }
}
