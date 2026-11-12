package com.xiaomi.heart.bmp;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public enum MonitorResetCause {
    PRE_HEAT_ERROR,
    BEYOND_MARK_RANGE,
    BEYOND_MIN_AMPLITUDE;

    private String desc;

    public MonitorResetCause setDesc(String str) {
        this.desc = str;
        return this;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + "{desc='" + this.desc + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
