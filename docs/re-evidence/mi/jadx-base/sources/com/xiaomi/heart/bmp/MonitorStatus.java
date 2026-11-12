package com.xiaomi.heart.bmp;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public enum MonitorStatus {
    PRE_CHECK,
    OK,
    FPS_JITTER,
    PRE_HEAT_ERROR,
    BEYOND_MARK_RANGE,
    BEYOND_MIN_AMPLITUDE,
    CHANNEL_DIFF_ERROR,
    CHECK_PLACE_ERROR,
    UPDATE_PLACE_ERROR;

    private String desc;

    public MonitorStatus setDesc(String str) {
        this.desc = str;
        return this;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + "{desc='" + this.desc + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
