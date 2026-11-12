package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class cvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f14768a = new byte[4096];

    public static int a(InputStream inputStream, byte[] bArr) throws IOException {
        return b(inputStream, bArr, 0, bArr.length);
    }

    public static int b(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i2 + i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        while (i3 != i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    public static long c(InputStream inputStream, long j) throws IOException {
        int iB;
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip == 0) {
                break;
            }
            j2 -= jSkip;
        }
        while (j2 > 0 && (iB = b(inputStream, f14768a, 0, (int) Math.min(j2, 4096L))) >= 1) {
            j2 -= (long) iB;
        }
        return j - j2;
    }
}
