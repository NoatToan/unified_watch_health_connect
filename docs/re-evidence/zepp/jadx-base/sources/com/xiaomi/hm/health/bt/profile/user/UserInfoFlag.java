package com.xiaomi.hm.health.bt.profile.user;

/* JADX INFO: loaded from: classes18.dex */
public enum UserInfoFlag {
    BIRTH((byte) 1),
    GENDER((byte) 2),
    HEIGHT((byte) 4),
    WEIGHT((byte) 8),
    GOAL((byte) 16),
    LOCATION((byte) 32),
    UID((byte) 64),
    BASE((byte) 95),
    PERSON((byte) 79),
    ALL((byte) 127),
    READ((byte) -128),
    WRITE((byte) 0);

    private byte mValue;

    UserInfoFlag(byte value) {
        this.mValue = (byte) 0;
        this.mValue = value;
    }

    public byte getValue() {
        return this.mValue;
    }
}
