package defpackage;

import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes12.dex */
public class nxv {
    private int b(int i) {
        return i & 15;
    }

    private int d(byte b2) {
        return b2 & 255;
    }

    private int e(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        return (i & i3) != 0 ? (i3 - (i & (i3 - 1))) * (-1) : i;
    }

    private int b(byte b2, byte b3) {
        return d(b2) + (d(b3) << 8);
    }

    private int c(byte b2, byte b3, byte b4) {
        return d(b2) + (d(b3) << 8) + (d(b4) << 16);
    }

    private int a(byte b2, byte b3, byte b4, byte b5) {
        return d(b2) + (d(b3) << 8) + (d(b4) << 16) + (d(b5) << 24);
    }

    protected int d(byte[] bArr, int i, int i2) {
        if (bArr == null || b(i) + i2 > bArr.length) {
            return -1;
        }
        if (i == 17) {
            return d(bArr[i2]);
        }
        if (i == 18) {
            return b(bArr[i2], bArr[i2 + 1]);
        }
        if (i == 20) {
            return a(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]);
        }
        if (i == 36) {
            return e(a(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]), 32);
        }
        if (i == 33) {
            return e(d(bArr[i2]), 8);
        }
        if (i == 34) {
            return e(b(bArr[i2], bArr[i2 + 1]), 16);
        }
        LogUtil.c("GattParser", "no formatType");
        return -1;
    }

    protected int d(byte[] bArr, int i) {
        if (bArr == null || i + 3 > bArr.length) {
            return -1;
        }
        return c(bArr[i], bArr[i + 1], bArr[i + 2]);
    }
}
