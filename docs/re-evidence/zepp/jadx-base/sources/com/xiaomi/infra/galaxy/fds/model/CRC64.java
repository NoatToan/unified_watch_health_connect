package com.xiaomi.infra.galaxy.fds.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes22.dex */
public class CRC64 implements Checksum {
    private static final long b = -3932672073523589310L;
    private static final long[][] c = (long[][]) Array.newInstance((Class<?>) long.class, 8, 256);
    private static final int d = 64;
    private long a;

    static {
        for (int i = 0; i < 256; i++) {
            long j = i;
            for (int i2 = 0; i2 < 8; i2++) {
                j = (j & 1) == 1 ? (j >>> 1) ^ b : j >>> 1;
            }
            c[0][i] = j;
        }
        for (int i3 = 0; i3 < 256; i3++) {
            long j2 = c[0][i3];
            for (int i4 = 1; i4 < 8; i4++) {
                long[][] jArr = c;
                j2 = (j2 >>> 8) ^ jArr[0][(int) (255 & j2)];
                jArr[i4][i3] = j2;
            }
        }
    }

    public CRC64() {
        this.a = 0L;
    }

    private static void a(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 64; i++) {
            jArr[i] = b(jArr2, jArr2[i]);
        }
    }

    private static long b(long[] jArr, long j) {
        int i = 0;
        long j2 = 0;
        while (j != 0) {
            if ((j & 1) == 1) {
                j2 ^= jArr[i];
            }
            j >>>= 1;
            i++;
        }
        return j2;
    }

    public static CRC64 combine(CRC64 crc64, CRC64 crc65, long j) {
        return j == 0 ? new CRC64(crc64.getValue()) : new CRC64(combine(crc64.getValue(), crc65.getValue(), j));
    }

    public static CRC64 fromFile(File file) throws IOException {
        return fromInputStream(new FileInputStream(file));
    }

    public static CRC64 fromInputStream(InputStream inputStream) throws IOException {
        try {
            CRC64 crc64 = new CRC64();
            byte[] bArr = new byte[65536];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    inputStream.close();
                    return crc64;
                }
                crc64.update(bArr, 0, i);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[7 - i] = (byte) (this.a >>> (i * 8));
        }
        return bArr;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        return this.a;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        this.a = 0L;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        update((byte) (i & 255));
    }

    public void update(byte b2) {
        long j = ~this.a;
        this.a = j;
        long j2 = (j >>> 8) ^ c[0][((int) (((long) b2) ^ j)) & 255];
        this.a = j2;
        this.a = ~j2;
    }

    public CRC64(long j) {
        this.a = j;
    }

    public static long combine(long j, long j2, long j3) {
        if (j3 == 0) {
            return j;
        }
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        jArr2[0] = -3932672073523589310L;
        long j4 = 1;
        for (int i = 1; i < 64; i++) {
            jArr2[i] = j4;
            j4 <<= 1;
        }
        a(jArr, jArr2);
        a(jArr2, jArr);
        long jB = j;
        long j5 = j3;
        do {
            a(jArr, jArr2);
            if ((j5 & 1) == 1) {
                jB = b(jArr, jB);
            }
            long j6 = j5 >>> 1;
            if (j6 == 0) {
                break;
            }
            a(jArr2, jArr);
            if ((j6 & 1) == 1) {
                jB = b(jArr2, jB);
            }
            j5 = j6 >>> 1;
        } while (j5 != 0);
        return jB ^ j2;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        this.a = ~this.a;
        int i3 = i;
        int i4 = i2;
        while (i4 >= 8) {
            long[][] jArr = c;
            long[] jArr2 = jArr[7];
            long j = this.a;
            this.a = ((((((jArr[6][(int) (((long) (bArr[i3 + 1] & 255)) ^ ((j >>> 8) & 255))] ^ jArr2[(int) ((j & 255) ^ ((long) (bArr[i3] & 255)))]) ^ jArr[5][(int) (((j >>> 16) & 255) ^ ((long) (bArr[i3 + 2] & 255)))]) ^ jArr[4][(int) (((j >>> 24) & 255) ^ ((long) (bArr[i3 + 3] & 255)))]) ^ jArr[3][(int) (((j >>> 32) & 255) ^ ((long) (bArr[i3 + 4] & 255)))]) ^ jArr[2][(int) (((j >>> 40) & 255) ^ ((long) (bArr[i3 + 5] & 255)))]) ^ jArr[1][(int) ((255 & (j >>> 48)) ^ ((long) (bArr[i3 + 6] & 255)))]) ^ jArr[0][(int) ((j >>> 56) ^ ((long) (bArr[i3 + 7] & 255)))];
            i3 += 8;
            i4 -= 8;
        }
        while (i4 > 0) {
            long[] jArr3 = c[0];
            long j2 = this.a;
            this.a = (j2 >>> 8) ^ jArr3[(int) ((((long) bArr[i3]) ^ j2) & 255)];
            i3++;
            i4--;
        }
        this.a = ~this.a;
    }
}
