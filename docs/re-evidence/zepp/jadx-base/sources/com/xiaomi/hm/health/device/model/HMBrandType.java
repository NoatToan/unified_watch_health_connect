package com.xiaomi.hm.health.device.model;

/* JADX INFO: loaded from: classes18.dex */
public enum HMBrandType {
    BRAND_DEFAULT(-1),
    BRAND_MIJIA(0),
    BRAND_SHOES_LIGHT(1),
    BRAND_SHOES(2),
    BRAND_SHOES_SPRANDI(3),
    BRAND_SHOES_CHILD(4),
    BRAND_SHOES_KANGNAI(5),
    BRAND_SHOES_ANTELOPE(6);

    private int mValue;

    HMBrandType(int i) {
        this.mValue = i;
    }

    public static HMBrandType fromValue(int i) {
        for (HMBrandType hMBrandType : values()) {
            if (i == hMBrandType.getValue()) {
                return hMBrandType;
            }
        }
        return BRAND_DEFAULT;
    }

    public int getValue() {
        return this.mValue;
    }
}
