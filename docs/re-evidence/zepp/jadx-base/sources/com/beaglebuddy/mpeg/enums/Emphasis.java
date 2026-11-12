package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum Emphasis {
    NONE("None"),
    _50_15_MS("50/15 ms"),
    RESERVED("Reserved"),
    CCIT_J_17("CCIT J.17");

    private String name;

    Emphasis(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static Emphasis valueOf(int i) throws IllegalArgumentException {
        for (Emphasis emphasis : values()) {
            if (i == emphasis.ordinal()) {
                return emphasis;
            }
        }
        throw new IllegalArgumentException("Invalid emphasis " + i + ".  It must be 0 <= layer <= 3.");
    }
}
