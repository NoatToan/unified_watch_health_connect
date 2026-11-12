package com.xiaomi.hm.health.bt.profile.sport;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SportTemperature {
    public static final int C = 0;
    public static final int F = 1;
    public static final int HIGH = 1;
    public static final int LOW = 2;
    public static final int UNKNOWN = 0;
    private int type;
    private int unit;
    private int value;

    public SportTemperature(int i, int i2, int i3) {
        this.type = i;
        this.unit = i2;
        this.value = i3;
    }

    public byte[] getBytes() {
        return new byte[]{(byte) this.type, (byte) this.unit, (byte) this.value};
    }

    public String toString() {
        return "SportTemperature{type=" + this.type + ", unit=" + this.unit + ", value=" + this.value + AbstractJsonLexerKt.END_OBJ;
    }
}
