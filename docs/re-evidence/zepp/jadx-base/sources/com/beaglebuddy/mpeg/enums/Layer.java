package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum Layer {
    RESERVED("Reserved"),
    III("Layer III"),
    II("Layer II"),
    I("Layer I");

    private String name;

    Layer(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static Layer valueOf(int i) throws IllegalArgumentException {
        for (Layer layer : values()) {
            if (i == layer.ordinal()) {
                return layer;
            }
        }
        throw new IllegalArgumentException("Invalid MPEG layer " + i + ".  It must be 0 <= layer <= 3.");
    }
}
