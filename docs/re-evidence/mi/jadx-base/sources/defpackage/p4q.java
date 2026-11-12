package defpackage;

import androidx.work.WorkInfo;

/* JADX INFO: loaded from: classes4.dex */
public class p4q {
    public static int a(byte[] bArr) {
        if (bArr.length != 4) {
            return -1;
        }
        return (bArr[3] & 255) | (((((((((bArr[0] & 255) << 8) & 65280) | (bArr[1] & 255)) << 8) & 16776960) | (bArr[2] & 255)) << 8) & WorkInfo.STOP_REASON_NOT_STOPPED);
    }

    public static long b(byte[] bArr) {
        if (bArr.length != 8) {
            return -1L;
        }
        return (((((((((((((((((((((((long) bArr[0]) & 255) << 8) & 65280) | (((long) bArr[1]) & 255)) << 8) & 16776960) | (((long) bArr[2]) & 255)) << 8) & 4294967040L) | (((long) bArr[3]) & 255)) << 8) & 1099511627520L) | (((long) bArr[4]) & 255)) << 8) & 281474976710400L) | (((long) bArr[5]) & 255)) << 8) & 72057594037927680L) | (((long) bArr[6]) & 255)) << 8) & (-256)) | (((long) bArr[7]) & 255);
    }

    public static short c(byte[] bArr) {
        if (bArr.length != 2) {
            return (short) -1;
        }
        return (short) ((bArr[1] & 255) | ((bArr[0] << 8) & 65280));
    }

    public static byte[] d(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] e(long j) {
        return new byte[]{(byte) ((j >> 56) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255)};
    }

    public static byte[] f(short s) {
        return new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)};
    }
}
