package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum sv {
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

    public byte t;

    sv(byte b2) {
        this.t = b2;
    }

    public byte a() {
        return this.t;
    }
}
