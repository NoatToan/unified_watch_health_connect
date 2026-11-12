package aq2;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f12477a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12478b = new byte[128];

    static {
        int i14 = 0;
        while (true) {
            byte[] bArr = f12477a;
            if (i14 >= bArr.length) {
                byte[] bArr2 = f12478b;
                bArr2[65] = bArr2[97];
                bArr2[66] = bArr2[98];
                bArr2[67] = bArr2[99];
                bArr2[68] = bArr2[100];
                bArr2[69] = bArr2[101];
                bArr2[70] = bArr2[102];
                return;
            }
            f12478b[bArr[i14]] = (byte) i14;
            i14++;
        }
    }

    public static String a(byte[] bArr) {
        StringWriter stringWriter = new StringWriter();
        for (byte b14 : bArr) {
            int i14 = (b14 & UnsignedBytes.MAX_VALUE) >>> 4;
            byte[] bArr2 = f12477a;
            stringWriter.write(bArr2[i14]);
            stringWriter.write(bArr2[b14 & Ascii.SI]);
        }
        return stringWriter.toString();
    }

    public static byte[] b(String str) {
        byte[] bArr = f12478b;
        int i14 = 0;
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        if (str.length() % 2 != 0) {
            sn.a.l(str.length(), "invalid hex string, length of ", " is not an even number");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = str.length();
        while (length > 0 && c(str.charAt(length - 1))) {
            length--;
        }
        while (i14 < length) {
            while (i14 < length && c(str.charAt(i14))) {
                i14++;
            }
            int i15 = i14 + 1;
            try {
                byte b14 = bArr[str.charAt(i14)];
                while (i15 < length && c(str.charAt(i15))) {
                    i15++;
                }
                int i16 = i15 + 1;
                try {
                    byteArrayOutputStream.write((b14 << 4) | bArr[str.charAt(i15)]);
                    i14 = i16;
                } catch (StringIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("invalid hex string (" + str + "), invalid character at position: " + i16);
                }
            } catch (StringIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("invalid hex string (" + str + "), invalid character at position: " + i15);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean c(char c14) {
        return c14 == '\n' || c14 == '\r' || c14 == '\t' || c14 == ' ';
    }
}
