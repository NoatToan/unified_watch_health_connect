package ik;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static void a(int i14, int i15, byte[] bArr) {
        if (i15 > 255 || i15 < 0) {
            h.s("Value outside the bounds of unsigned 1 byte integer");
        } else {
            bArr[i14] = (byte) (i15 & 255);
        }
    }

    public static void b(int i14, int i15, byte[] bArr) {
        if (i15 > 65535 || i15 < 0) {
            h.s("Value outside the bounds of unsigned 2 byte integer");
        } else {
            bArr[i14] = (byte) (i15 & 255);
            bArr[i14 + 1] = (byte) ((i15 >> 8) & 255);
        }
    }

    public static void c(byte[] bArr, int i14, long j8) {
        if (j8 > 4294967295L || j8 < 0) {
            h.s("Value outside the bounds of unsigned 4 byte integer");
            return;
        }
        bArr[i14] = (byte) (j8 & 255);
        bArr[i14 + 1] = (byte) ((j8 >> 8) & 255);
        bArr[i14 + 2] = (byte) ((j8 >> 16) & 255);
        bArr[i14 + 3] = (byte) ((j8 >> 24) & 255);
    }

    public static int d(int i14, byte[] bArr) {
        return 65535 & ((bArr[i14] & UnsignedBytes.MAX_VALUE) + ((bArr[i14 + 1] << 8) & 65280));
    }

    public static int e(int i14, byte[] bArr) {
        return 16777215 & ((bArr[i14] & UnsignedBytes.MAX_VALUE) + ((bArr[i14 + 1] << 8) & 65280) + ((bArr[i14 + 2] << Ascii.DLE) & 16711680));
    }

    public static long f(int i14, byte[] bArr) {
        return 4294967295L & ((((long) bArr[i14]) & 255) + ((long) ((bArr[i14 + 1] << 8) & 65280)) + ((long) ((bArr[i14 + 2] << Ascii.DLE) & 16711680)) + ((long) ((bArr[i14 + 3] << Ascii.CAN) & (-16777216))));
    }
}
