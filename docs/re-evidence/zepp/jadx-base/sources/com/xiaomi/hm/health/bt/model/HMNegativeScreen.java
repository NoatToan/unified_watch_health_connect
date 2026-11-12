package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public enum HMNegativeScreen {
    DISABLE((byte) 0),
    ALIPAY((byte) 1);

    private byte mValue;

    HMNegativeScreen(byte value) {
        this.mValue = value;
    }

    public static HMNegativeScreen fromValue(byte value) {
        for (HMNegativeScreen hMNegativeScreen : values()) {
            if (hMNegativeScreen.getValue() == value) {
                return hMNegativeScreen;
            }
        }
        return DISABLE;
    }

    public byte getValue() {
        return this.mValue;
    }
}
