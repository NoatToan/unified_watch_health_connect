package com.xiaomi.hm.health.bt.profile.user;

/* JADX INFO: loaded from: classes18.dex */
public enum GenderExt {
    MALE((byte) 0),
    FEMALE((byte) 1),
    UNSPECIFIED((byte) 2);

    private byte mValue;

    GenderExt(byte value) {
        this.mValue = (byte) 0;
        this.mValue = value;
    }

    public static GenderExt fromValue(byte value) {
        if (value == 0) {
            return MALE;
        }
        return value == 1 ? FEMALE : UNSPECIFIED;
    }

    public byte getValue() {
        return this.mValue;
    }
}
