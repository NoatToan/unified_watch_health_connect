package defpackage;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class w73 {
    public static double a(byte[] bArr) {
        return b(bArr, ByteOrder.LITTLE_ENDIAN);
    }

    public static double b(byte[] bArr, ByteOrder byteOrder) {
        return Double.longBitsToDouble(f(bArr, byteOrder));
    }

    public static int c(byte[] bArr) {
        return d(bArr, ByteOrder.LITTLE_ENDIAN);
    }

    public static int d(byte[] bArr, ByteOrder byteOrder) {
        int i;
        byte b2;
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            i = (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
            b2 = bArr[0];
        } else {
            i = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
            b2 = bArr[3];
        }
        return ((b2 & 255) << 24) | i;
    }

    public static long e(byte[] bArr) {
        return f(bArr, ByteOrder.LITTLE_ENDIAN);
    }

    public static long f(byte[] bArr, ByteOrder byteOrder) {
        long j = 0;
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            for (int i = 0; i < 8; i++) {
                j = (j << 8) | ((long) (bArr[i] & 255));
            }
        } else {
            for (int i2 = 7; i2 >= 0; i2--) {
                j = (j << 8) | ((long) (bArr[i2] & 255));
            }
        }
        return j;
    }

    public static short g(byte[] bArr) {
        return h(bArr, ByteOrder.LITTLE_ENDIAN);
    }

    public static short h(byte[] bArr, ByteOrder byteOrder) {
        int i;
        byte b2;
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            i = bArr[1] & 255;
            b2 = bArr[0];
        } else {
            i = bArr[0] & 255;
            b2 = bArr[1];
        }
        return (short) (((b2 & 255) << 8) | i);
    }

    public static byte[] i(double d, ByteOrder byteOrder) {
        return k(Double.doubleToLongBits(d), byteOrder);
    }

    public static byte[] j(int i, ByteOrder byteOrder) {
        return ByteOrder.LITTLE_ENDIAN == byteOrder ? new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)} : new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] k(long j, ByteOrder byteOrder) {
        byte[] bArr = new byte[8];
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            for (int i = 7; i >= 0; i--) {
                bArr[i] = (byte) (j & 255);
                j >>= 8;
            }
        } else {
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[i2] = (byte) (j & 255);
                j >>= 8;
            }
        }
        return bArr;
    }

    public static byte[] l(Number number) {
        return m(number, ByteOrder.LITTLE_ENDIAN);
    }

    public static byte[] m(Number number, ByteOrder byteOrder) {
        if (number instanceof Double) {
            return i(((Double) number).doubleValue(), byteOrder);
        }
        if (number instanceof Long) {
            return k(((Long) number).longValue(), byteOrder);
        }
        if (number instanceof Integer) {
            return j(((Integer) number).intValue(), byteOrder);
        }
        return number instanceof Short ? n(((Short) number).shortValue(), byteOrder) : i(number.doubleValue(), byteOrder);
    }

    public static byte[] n(short s, ByteOrder byteOrder) {
        byte[] bArr = new byte[2];
        if (ByteOrder.LITTLE_ENDIAN == byteOrder) {
            bArr[1] = (byte) (s & 255);
            bArr[0] = (byte) ((s >> 8) & 255);
        } else {
            bArr[0] = (byte) (s & 255);
            bArr[1] = (byte) ((s >> 8) & 255);
        }
        return bArr;
    }
}
