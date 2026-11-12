package gd;

import am.j;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private b() {
    }

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th3) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            deflater.end();
            throw th5;
        }
    }

    public static byte[] b(InputStream inputStream, int i14) throws IOException {
        byte[] bArr = new byte[i14];
        int i15 = 0;
        while (i15 < i14) {
            int i16 = inputStream.read(bArr, i15, i14 - i15);
            if (i16 < 0) {
                h.z(j.h(i14, "Not enough bytes to read: "));
                return null;
            }
            i15 += i16;
        }
        return bArr;
    }

    public static byte[] c(FileInputStream fileInputStream, int i14, int i15) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i15];
            byte[] bArr2 = new byte[2048];
            int i16 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i16 < i14) {
                int i17 = fileInputStream.read(bArr2);
                if (i17 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i14 + " bytes");
                }
                inflater.setInput(bArr2, 0, i17);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i15 - iInflate);
                    i16 += i17;
                } catch (DataFormatException e4) {
                    throw new IllegalStateException(e4.getMessage());
                }
            }
            if (i16 == i14) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i14 + " actual=" + i16);
        } catch (Throwable th3) {
            inflater.end();
            throw th3;
        }
    }

    public static long d(InputStream inputStream, int i14) throws IOException {
        byte[] bArrB = b(inputStream, i14);
        long j8 = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            j8 += ((long) (bArrB[i15] & UnsignedBytes.MAX_VALUE)) << (i15 * 8);
        }
        return j8;
    }

    public static void e(ByteArrayOutputStream byteArrayOutputStream, long j8, int i14) throws IOException {
        byte[] bArr = new byte[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            bArr[i15] = (byte) ((j8 >> (i15 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void f(ByteArrayOutputStream byteArrayOutputStream, int i14) throws IOException {
        e(byteArrayOutputStream, i14, 2);
    }
}
