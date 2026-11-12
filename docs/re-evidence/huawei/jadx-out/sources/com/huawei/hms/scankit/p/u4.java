package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes10.dex */
public enum u4 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f16354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16355b;

    u4(int[] iArr, int i) {
        this.f16354a = iArr;
        this.f16355b = i;
    }

    public int b() {
        return this.f16355b;
    }

    public static u4 a(int i) {
        if (i == 0) {
            return TERMINATOR;
        }
        if (i == 1) {
            return NUMERIC;
        }
        if (i == 2) {
            return ALPHANUMERIC;
        }
        if (i == 3) {
            return STRUCTURED_APPEND;
        }
        if (i == 4) {
            return BYTE;
        }
        if (i == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i == 7) {
            return ECI;
        }
        if (i == 8) {
            return KANJI;
        }
        if (i == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i != 13) {
            throw new IllegalArgumentException();
        }
        return HANZI;
    }

    public int a(b8 b8Var) {
        char c2;
        int iF = b8Var.f();
        if (iF <= 9) {
            c2 = 0;
        } else {
            c2 = iF <= 26 ? (char) 1 : (char) 2;
        }
        return this.f16354a[c2];
    }
}
