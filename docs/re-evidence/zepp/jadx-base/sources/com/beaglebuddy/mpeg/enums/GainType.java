package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum GainType {
    NOT_SET("not set"),
    RADIO("radio"),
    AUDIOPHILE("audiophile");

    private String name;

    GainType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static GainType valueOf(int i) throws IllegalArgumentException {
        for (GainType gainType : values()) {
            if (i == gainType.ordinal()) {
                return gainType;
            }
        }
        throw new IllegalArgumentException("Invalid LAME replay gain type, " + i + ".  It must be 0 <= type <= " + AUDIOPHILE.ordinal() + ".");
    }
}
