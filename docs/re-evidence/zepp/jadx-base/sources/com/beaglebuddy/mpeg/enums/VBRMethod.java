package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum VBRMethod {
    UNKNOWN("Unknown"),
    CBR("CBR"),
    ABR("ABR"),
    VBR_1("VBR 1"),
    VBR_2("VBR 2"),
    VBR_3("VBR 3"),
    VBR_4("VBR 4"),
    UNUSED_1("UNUSED"),
    CBR_2_PASS("CBR 2 Pass"),
    ABR_2_PASS("ABR 2 Pass"),
    UNUSED_2("UNUSED"),
    UNUSED_3("UNUSED"),
    UNUSED_4("UNUSED"),
    UNUSED_5("UNUSED"),
    UNUSED_6("UNUSED"),
    RESERVED("Reserved");

    private String name;

    VBRMethod(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static VBRMethod valueOf(int i) throws IllegalArgumentException {
        for (VBRMethod vBRMethod : values()) {
            if (i == vBRMethod.ordinal()) {
                return vBRMethod;
            }
        }
        throw new IllegalArgumentException("Invalid LAME VBR method " + i + ".  It must be 0 <= method <= 15.");
    }
}
