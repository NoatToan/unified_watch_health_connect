package com.xiaomi.hm.health.bt.profile.speech;

/* JADX INFO: loaded from: classes18.dex */
public enum SpeechType {
    CHAT((byte) 0),
    ERROR((byte) 1),
    MIOT((byte) 2),
    REMINDER((byte) 3),
    ALARM((byte) 4),
    WEATHER((byte) 5),
    OPEN((byte) 6);

    private byte value;

    SpeechType(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return this.value;
    }
}
