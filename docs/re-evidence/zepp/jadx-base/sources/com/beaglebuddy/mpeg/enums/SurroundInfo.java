package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum SurroundInfo {
    NONE("none"),
    DPL_ENCODING("DPL encoding"),
    DPL2_ENCODING("DPL2 encoding"),
    AMBISONIC("Ambisonic"),
    UNKNOWN_1("unknown"),
    UNKNOWN_2("unknown"),
    UNKNOWN_3("unknown"),
    UNKNOWN_4("unknown"),
    RESERVED("reserved");

    private String name;

    SurroundInfo(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static SurroundInfo valueOf(int i) throws IllegalArgumentException {
        for (SurroundInfo surroundInfo : values()) {
            if (i == surroundInfo.ordinal()) {
                return surroundInfo;
            }
        }
        throw new IllegalArgumentException("Invalid surround info " + i + ".  It must be 0 <= surround info <= " + RESERVED.ordinal() + ".");
    }
}
