package com.airoha.android.lib.peq;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum Rate {
    R32(0),
    R441(1),
    R48(2),
    R16(3),
    R8(4),
    R882(5),
    R96(6);

    private static Map sMap = new HashMap();
    private short value;

    static {
        for (Rate rate : values()) {
            sMap.put(Short.valueOf(rate.value), rate);
        }
    }

    Rate(short s) {
        this.value = s;
    }

    public short getValue() {
        return this.value;
    }

    public static Rate valueOf(short s) {
        return (Rate) sMap.get(Short.valueOf(s));
    }
}
