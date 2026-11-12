package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public enum HMDisplayType {
    ONLY_TIME((byte) 0),
    SIMPLE_CHINESE((byte) 1),
    TRAD_CHINESE((byte) 2),
    ENGLISH((byte) 3);

    public byte mType;

    HMDisplayType(byte type) {
        this.mType = (byte) 0;
        this.mType = type;
    }

    public static HMDisplayType from(byte type) {
        for (HMDisplayType hMDisplayType : values()) {
            if (hMDisplayType.getType() == type) {
                return hMDisplayType;
            }
        }
        return ONLY_TIME;
    }

    public byte getType() {
        return this.mType;
    }
}
