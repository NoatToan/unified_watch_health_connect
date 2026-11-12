package d8;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private b() {
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            jArr[i14] = iArr[i14];
        }
        return jArr;
    }

    public static void c(a.b bVar, a.c cVar, int i14) throws IOException {
        byte[] bArr = new byte[8192];
        while (i14 > 0) {
            int iMin = Math.min(i14, 8192);
            int i15 = bVar.read(bArr, 0, iMin);
            if (i15 != iMin) {
                h.C("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            } else {
                i14 -= i15;
                cVar.write(bArr, 0, i15);
            }
        }
    }

    public static void d(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i14 = inputStream.read(bArr);
            if (i14 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i14);
            }
        }
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i14 = 0; i14 < bArr2.length; i14++) {
                if (bArr[i14] == bArr2[i14]) {
                }
            }
            return true;
        }
        return false;
    }
}
