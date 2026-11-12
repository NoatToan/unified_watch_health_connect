package com.xiaomi.hm.health.bt.profile.user;

/* JADX INFO: loaded from: classes11.dex */
public enum GenderExt {
    MALE((byte) 0),
    FEMALE((byte) 1),
    UNSPECIFIED((byte) 2);

    private byte mValue;

    GenderExt(byte b2) {
        this.mValue = b2;
    }

    public static GenderExt fromValue(byte b2) {
        if (b2 == 0) {
            return MALE;
        }
        return b2 == 1 ? FEMALE : UNSPECIFIED;
    }

    public byte getValue() {
        return this.mValue;
    }
}
