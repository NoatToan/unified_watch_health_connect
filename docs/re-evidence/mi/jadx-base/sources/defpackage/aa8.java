package defpackage;

import androidx.annotation.RequiresApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class aa8 {
    public static int a(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    public static byte[] b(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    public static byte[] d(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw c("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] e(InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw c(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw c("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static String f(InputStream inputStream, int i) throws IOException {
        return new String(d(inputStream, i), StandardCharsets.UTF_8);
    }

    public static long g(InputStream inputStream, int i) throws IOException {
        byte[] bArrD = d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrD[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static int h(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    public static long i(InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    public static int j(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    public static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static void m(OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] bArrB = b(bArr);
        q(outputStream, bArrB.length);
        outputStream.write(bArrB);
    }

    public static void n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void p(OutputStream outputStream, int i) throws IOException {
        o(outputStream, i, 2);
    }

    public static void q(OutputStream outputStream, long j) throws IOException {
        o(outputStream, j, 4);
    }

    public static void r(OutputStream outputStream, int i) throws IOException {
        o(outputStream, i, 1);
    }
}
