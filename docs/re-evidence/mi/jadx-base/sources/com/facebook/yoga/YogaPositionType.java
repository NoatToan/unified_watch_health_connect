package com.facebook.yoga;

import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public enum YogaPositionType {
    RELATIVE(0),
    ABSOLUTE(1);

    private final int mIntValue;

    YogaPositionType(int i) {
        this.mIntValue = i;
    }

    public static YogaPositionType fromInt(int i) {
        if (i == 0) {
            return RELATIVE;
        }
        if (i == 1) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
