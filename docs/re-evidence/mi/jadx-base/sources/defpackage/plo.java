package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class plo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f30527a;

    public static class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                f30527a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                f30527a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            f30527a = "\n";
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char c;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            int i4 = i3 + 1;
            byte b2 = bArr[i2];
            if ((b2 & 240) == 240) {
                i3 += 2;
                i2 += 4;
            } else {
                if ((b2 & 224) == 224) {
                    i2 += 3;
                } else {
                    i2 = (b2 & 192) == 192 ? i2 + 2 : i2 + 1;
                }
                i3 = i4;
            }
        }
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i < bArr.length) {
            byte b3 = bArr[i];
            if ((b3 & 240) == 240) {
                int i6 = (((((b3 & 3) << 18) | ((bArr[i + 1] & 63) << 12)) | ((bArr[i + 2] & 63) << 6)) | (bArr[i + 3] & 63)) - 65536;
                char c2 = (char) ((i6 >> 10) | 55296);
                c = (char) ((i6 & 1023) | Utf8.LOG_SURROGATE_HEADER);
                cArr[i5] = c2;
                i += 4;
                i5++;
            } else if ((b3 & 224) == 224) {
                c = (char) (((b3 & 15) << 12) | ((bArr[i + 1] & 63) << 6) | (bArr[i + 2] & 63));
                i += 3;
            } else if ((b3 & 208) == 208 || (b3 & 192) == 192) {
                int i7 = (b3 & 31) << 6;
                byte b4 = bArr[i + 1];
                c = (char) (i7 | (b4 & 63));
                i += 2;
            } else {
                c = (char) (b3 & 255);
                i++;
            }
            cArr[i5] = c;
            i5++;
        }
        return new String(cArr);
    }

    public static String d() {
        return f30527a;
    }

    public static byte[] e(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String f(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static void g(char[] cArr, OutputStream outputStream) throws IOException {
        int i = 0;
        while (i < cArr.length) {
            char c = cArr[i];
            if (c < 128) {
                outputStream.write(c);
            } else if (c < 2048) {
                outputStream.write((c >> 6) | 192);
                outputStream.write((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                outputStream.write((c >> '\f') | SportReportBaseParser.ReportType.avgFreq);
                outputStream.write(((c >> 6) & 63) | 128);
                outputStream.write((c & '?') | 128);
            } else {
                i++;
                if (i >= cArr.length) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                char c2 = cArr[i];
                if (c > 56319) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                int i2 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                outputStream.write((i2 >> 18) | 240);
                outputStream.write(((i2 >> 12) & 63) | 128);
                outputStream.write(((i2 >> 6) & 63) | 128);
                outputStream.write((i2 & 63) | 128);
            }
            i++;
        }
    }

    public static byte[] h(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String i(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
