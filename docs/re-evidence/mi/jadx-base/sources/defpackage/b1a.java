package defpackage;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* JADX INFO: loaded from: classes5.dex */
public final class b1a {
    public static final int[][] c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorCorrectionLevel f3675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f3676b;

    public b1a(int i) {
        this.f3675a = ErrorCorrectionLevel.forBits((i >> 3) & 3);
        this.f3676b = (byte) (i & 7);
    }

    public static b1a a(int i, int i2) {
        b1a b1aVarB = b(i, i2);
        return b1aVarB != null ? b1aVarB : b(i ^ 21522, i2 ^ 21522);
    }

    public static b1a b(int i, int i2) {
        int iE;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new b1a(iArr[1]);
            }
            int iE2 = e(i, i5);
            if (iE2 < i3) {
                i4 = iArr[1];
                i3 = iE2;
            }
            if (i != i2 && (iE = e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = iE;
            }
        }
        if (i3 <= 3) {
            return new b1a(i4);
        }
        return null;
    }

    public static int e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    public byte c() {
        return this.f3676b;
    }

    public ErrorCorrectionLevel d() {
        return this.f3675a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b1a)) {
            return false;
        }
        b1a b1aVar = (b1a) obj;
        return this.f3675a == b1aVar.f3675a && this.f3676b == b1aVar.f3676b;
    }

    public int hashCode() {
        return (this.f3675a.ordinal() << 3) | this.f3676b;
    }
}
