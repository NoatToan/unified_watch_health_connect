package com.xiaomi.hm.health.bt.model;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public enum HMWeightUnit {
    KG((byte) 0),
    POUND((byte) 1),
    JIN((byte) 2);

    private byte mValue;

    HMWeightUnit(byte unit) {
        this.mValue = (byte) 0;
        this.mValue = unit;
    }

    @Nullable
    public static HMWeightUnit fromValue(byte unit) {
        for (HMWeightUnit hMWeightUnit : values()) {
            if (unit == hMWeightUnit.getValue()) {
                return hMWeightUnit;
            }
        }
        return null;
    }

    public byte getValue() {
        return this.mValue;
    }
}
