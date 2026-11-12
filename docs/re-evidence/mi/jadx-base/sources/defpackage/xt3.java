package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class xt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f39438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f39439b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;

    static {
        int i2;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f39438a = charArray;
        int length = charArray.length;
        f39439b = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            f39439b[i3] = (byte) f39438a[i3];
        }
        int[] iArr = new int[256];
        for (int i4 = 0; i4 < 32; i4++) {
            iArr[i4] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i5 = 128; i5 < 256; i5++) {
            if ((i5 & SportReportBaseParser.ReportType.avgFreq) == 192) {
                i2 = 2;
            } else if ((i5 & 240) == 224) {
                i2 = 3;
            } else {
                i2 = (i5 & 248) == 240 ? 4 : -1;
            }
            iArr2[i5] = i2;
        }
        d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i6 = 33; i6 < 256; i6++) {
            if (Character.isJavaIdentifierPart((char) i6)) {
                iArr3[i6] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        h = iArr7;
        int[] iArr8 = new int[128];
        for (int i7 = 0; i7 < 32; i7++) {
            iArr8[i7] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        i = iArr8;
        int[] iArr9 = new int[128];
        j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i8 = 0; i8 < 10; i8++) {
            j[i8 + 48] = i8;
        }
        for (int i9 = 0; i9 < 6; i9++) {
            int[] iArr10 = j;
            int i10 = i9 + 10;
            iArr10[i9 + 97] = i10;
            iArr10[i9 + 65] = i10;
        }
    }

    public static void a(StringBuilder sb, String str) {
        int[] iArr = i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb.append(cCharAt);
            } else {
                sb.append(AbstractJsonLexerKt.STRING_ESC);
                int i3 = iArr[cCharAt];
                if (i3 < 0) {
                    sb.append(AbstractJsonLexerKt.UNICODE_ESC);
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = f39438a;
                    sb.append(cArr[cCharAt >> 4]);
                    sb.append(cArr[cCharAt & 15]);
                } else {
                    sb.append((char) i3);
                }
            }
        }
    }

    public static int b(int i2) {
        if (i2 > 127) {
            return -1;
        }
        return j[i2];
    }

    public static byte[] c() {
        return (byte[]) f39439b.clone();
    }

    public static char[] d() {
        return (char[]) f39438a.clone();
    }

    public static int[] e() {
        return i;
    }

    public static int[] f() {
        return g;
    }

    public static int[] g() {
        return c;
    }

    public static int[] h() {
        return e;
    }

    public static int[] i() {
        return d;
    }

    public static int[] j() {
        return f;
    }
}
