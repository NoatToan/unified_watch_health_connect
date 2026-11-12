package defpackage;

import java.util.Arrays;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes21.dex */
public final class wz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final int[] f52607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final int[] f52608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int[] f52609c;
    protected static final char[] d;
    protected static final byte[] e;
    protected static final int[] f;
    protected static final int[] g;
    protected static final int[] h;
    protected static final int[] i;
    protected static final int[] j;

    static {
        int i2;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        d = charArray;
        int length = charArray.length;
        e = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            e[i3] = (byte) d[i3];
        }
        int[] iArr = new int[256];
        for (int i4 = 0; i4 < 32; i4++) {
            iArr[i4] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f52607a = iArr;
        int[] iArr2 = new int[256];
        System.arraycopy(iArr, 0, iArr2, 0, 256);
        for (int i5 = 128; i5 < 256; i5++) {
            if ((i5 & 224) == 192) {
                i2 = 2;
            } else if ((i5 & 240) == 224) {
                i2 = 3;
            } else {
                i2 = (i5 & 248) == 240 ? 4 : -1;
            }
            iArr2[i5] = i2;
        }
        g = iArr2;
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
        f = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        j = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = g;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f52609c = iArr5;
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
        int[] iArr9 = new int[256];
        f52608b = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i8 = 0; i8 < 10; i8++) {
            f52608b[i8 + 48] = i8;
        }
        for (int i9 = 0; i9 < 6; i9++) {
            int[] iArr10 = f52608b;
            int i10 = i9 + 10;
            iArr10[i9 + 97] = i10;
            iArr10[i9 + 65] = i10;
        }
    }

    public static int[] a() {
        return f52607a;
    }

    public static int[] g() {
        return g;
    }

    public static int[] i() {
        return f;
    }

    public static int[] f() {
        return j;
    }

    public static int[] d() {
        return f52609c;
    }

    public static int[] c() {
        return i;
    }

    public static int[] d(int i2) {
        if (i2 == 34) {
            return i;
        }
        return c.f52610c.c(i2);
    }

    public static int c(int i2) {
        return f52608b[i2 & 255];
    }

    public static void b(StringBuilder sb, String str) {
        int[] iArr = i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb.append(cCharAt);
            } else {
                sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                int i3 = iArr[cCharAt];
                if (i3 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = d;
                    sb.append(cArr[cCharAt >> 4]);
                    sb.append(cArr[cCharAt & 15]);
                } else {
                    sb.append((char) i3);
                }
            }
        }
    }

    public static char[] e() {
        return (char[]) d.clone();
    }

    public static byte[] b() {
        return (byte[]) e.clone();
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f52610c = new c();
        private int[][] e = new int[128][];

        private c() {
        }

        public int[] c(int i) {
            int[] iArrCopyOf = this.e[i];
            if (iArrCopyOf == null) {
                iArrCopyOf = Arrays.copyOf(wz.i, 128);
                if (iArrCopyOf[i] == 0) {
                    iArrCopyOf[i] = -1;
                }
                this.e[i] = iArrCopyOf;
            }
            return iArrCopyOf;
        }
    }
}
