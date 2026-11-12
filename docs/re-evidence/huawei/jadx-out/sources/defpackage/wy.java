package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import com.fasterxml.jackson.core.base.GeneratorBase;
import java.util.Arrays;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes21.dex */
public final class wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f52588a = wz.e();
    private static final byte[] d = wz.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final wy f52589b = new wy();

    public static wy d() {
        return f52589b;
    }

    public char[] b(String str) {
        int iA;
        char[] cArrH = new char[30];
        int[] iArrC = wz.c();
        int length = iArrC.length;
        int length2 = str.length();
        yh yhVarE = null;
        char[] cArrB = null;
        int i = 0;
        int i2 = 0;
        loop0: while (i2 < length2) {
            while (true) {
                char cCharAt = str.charAt(i2);
                if (cCharAt >= length || iArrC[cCharAt] == 0) {
                    if (i >= cArrH.length) {
                        if (yhVarE == null) {
                            yhVarE = yh.e(cArrH);
                        }
                        cArrH = yhVarE.h();
                        i = 0;
                    }
                    cArrH[i] = cCharAt;
                    i2++;
                    i++;
                    if (i2 >= length2) {
                        break loop0;
                    }
                }
            }
            if (cArrB == null) {
                cArrB = b();
            }
            char cCharAt2 = str.charAt(i2);
            int i3 = iArrC[cCharAt2];
            if (i3 < 0) {
                iA = b(cCharAt2, cArrB);
            } else {
                iA = a(i3, cArrB);
            }
            int i4 = i + iA;
            if (i4 > cArrH.length) {
                int length3 = cArrH.length - i;
                if (length3 > 0) {
                    System.arraycopy(cArrB, 0, cArrH, i, length3);
                }
                if (yhVarE == null) {
                    yhVarE = yh.e(cArrH);
                }
                cArrH = yhVarE.h();
                int i5 = iA - length3;
                System.arraycopy(cArrB, length3, cArrH, 0, i5);
                i = i5;
            } else {
                System.arraycopy(cArrB, 0, cArrH, i, iA);
                i = i4;
            }
            i2++;
        }
        if (yhVarE == null) {
            return Arrays.copyOfRange(cArrH, 0, i);
        }
        yhVarE.e(i);
        return yhVarE.b();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    public byte[] c(String str) {
        int i;
        int i2;
        int length = str.length();
        byte[] bArrA = new byte[60];
        xx xxVarA = null;
        int iC = 0;
        int i3 = 0;
        loop0: while (i3 < length) {
            int[] iArrC = wz.c();
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt > 127 || iArrC[cCharAt] != 0) {
                    break;
                }
                if (iC >= bArrA.length) {
                    if (xxVarA == null) {
                        xxVarA = xx.a(bArrA, iC);
                    }
                    bArrA = xxVarA.e();
                    iC = 0;
                }
                bArrA[iC] = (byte) cCharAt;
                i3++;
                iC++;
                if (i3 >= length) {
                    break loop0;
                }
            }
            if (xxVarA == null) {
                xxVarA = xx.a(bArrA, iC);
            }
            if (iC >= bArrA.length) {
                bArrA = xxVarA.e();
                iC = 0;
            }
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 <= 127) {
                i3 = i4;
                iC = c(cCharAt2, iArrC[cCharAt2], xxVarA, iC);
                bArrA = xxVarA.a();
            } else {
                if (cCharAt2 <= 2047) {
                    i = iC + 1;
                    bArrA[iC] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                } else {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        int i5 = iC + 1;
                        bArrA[iC] = (byte) ((cCharAt2 >> '\f') | 224);
                        if (i5 >= bArrA.length) {
                            bArrA = xxVarA.e();
                            i5 = 0;
                        }
                        bArrA[i5] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                        i = i5 + 1;
                    } else {
                        if (cCharAt2 > 56319) {
                            b(cCharAt2);
                        }
                        if (i4 >= length) {
                            b(cCharAt2);
                        }
                        int iA = a(cCharAt2, str.charAt(i4));
                        if (iA > 1114111) {
                            b(iA);
                        }
                        int i6 = iC + 1;
                        bArrA[iC] = (byte) ((iA >> 18) | 240);
                        if (i6 >= bArrA.length) {
                            bArrA = xxVarA.e();
                            i6 = 0;
                        }
                        int i7 = i6 + 1;
                        bArrA[i6] = (byte) (((iA >> 12) & 63) | 128);
                        if (i7 >= bArrA.length) {
                            bArrA = xxVarA.e();
                            i7 = 0;
                        }
                        bArrA[i7] = (byte) (((iA >> 6) & 63) | 128);
                        i4 = i3 + 2;
                        i = i7 + 1;
                        i2 = (iA & 63) | 128;
                    }
                    if (i >= bArrA.length) {
                        bArrA = xxVarA.e();
                        i = 0;
                    }
                    bArrA[i] = (byte) i2;
                    iC = i + 1;
                    i3 = i4;
                }
                i2 = (cCharAt2 & '?') | 128;
                if (i >= bArrA.length) {
                    bArrA = xxVarA.e();
                    i = 0;
                }
                bArrA[i] = (byte) i2;
                iC = i + 1;
                i3 = i4;
            }
        }
        if (xxVarA == null) {
            return Arrays.copyOfRange(bArrA, 0, iC);
        }
        return xxVarA.b(iC);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd A[SYNTHETIC] */
    public byte[] d(String str) {
        int i;
        int i2;
        int length = str.length();
        int length2 = 60;
        byte[] bArrE = new byte[60];
        xx xxVarA = null;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i4 < length) {
            int i5 = i4 + 1;
            int iCharAt = str.charAt(i4);
            while (iCharAt <= 127) {
                if (i3 >= length2) {
                    if (xxVarA == null) {
                        xxVarA = xx.a(bArrE, i3);
                    }
                    byte[] bArrE2 = xxVarA.e();
                    i3 = 0;
                    bArrE = bArrE2;
                    length2 = bArrE2.length;
                }
                int i6 = i3 + 1;
                bArrE[i3] = (byte) iCharAt;
                if (i5 >= length) {
                    i3 = i6;
                    break loop0;
                }
                iCharAt = str.charAt(i5);
                i5++;
                i3 = i6;
            }
            if (xxVarA == null) {
                xxVarA = xx.a(bArrE, i3);
            }
            if (i3 >= length2) {
                bArrE = xxVarA.e();
                length2 = bArrE.length;
                i3 = 0;
            }
            if (iCharAt < 2048) {
                i = i3 + 1;
                bArrE[i3] = (byte) ((iCharAt >> 6) | PsExtractor.AUDIO_STREAM);
            } else {
                if (iCharAt < 55296 || iCharAt > 57343) {
                    int i7 = i3 + 1;
                    bArrE[i3] = (byte) ((iCharAt >> 12) | 224);
                    if (i7 >= length2) {
                        bArrE = xxVarA.e();
                        length2 = bArrE.length;
                        i7 = 0;
                    }
                    bArrE[i7] = (byte) (((iCharAt >> 6) & 63) | 128);
                    i = i7 + 1;
                } else {
                    if (iCharAt > 56319) {
                        b(iCharAt);
                    }
                    if (i5 >= length) {
                        b(iCharAt);
                    }
                    iCharAt = a(iCharAt, str.charAt(i5));
                    if (iCharAt > 1114111) {
                        b(iCharAt);
                    }
                    int i8 = i3 + 1;
                    bArrE[i3] = (byte) ((iCharAt >> 18) | 240);
                    if (i8 >= length2) {
                        bArrE = xxVarA.e();
                        length2 = bArrE.length;
                        i8 = 0;
                    }
                    int i9 = i8 + 1;
                    bArrE[i8] = (byte) (((iCharAt >> 12) & 63) | 128);
                    if (i9 >= length2) {
                        bArrE = xxVarA.e();
                        length2 = bArrE.length;
                        i9 = 0;
                    }
                    bArrE[i9] = (byte) (((iCharAt >> 6) & 63) | 128);
                    i5++;
                    i2 = i9 + 1;
                }
                int i10 = i5;
                int i11 = iCharAt;
                i4 = i10;
                if (i2 >= length2) {
                    byte[] bArrE3 = xxVarA.e();
                    i2 = 0;
                    bArrE = bArrE3;
                    length2 = bArrE3.length;
                }
                bArrE[i2] = (byte) ((i11 & 63) | 128);
                i3 = i2 + 1;
            }
            i2 = i;
            int i12 = i5;
            int i13 = iCharAt;
            i4 = i12;
            if (i2 >= length2) {
                byte[] bArrE4 = xxVarA.e();
                i2 = 0;
                bArrE = bArrE4;
                length2 = bArrE4.length;
            }
            bArrE[i2] = (byte) ((i13 & 63) | 128);
            i3 = i2 + 1;
        }
        if (xxVarA == null) {
            return Arrays.copyOfRange(bArrE, 0, i3);
        }
        return xxVarA.b(i3);
    }

    private char[] b() {
        return new char[]{IOUtils.DIR_SEPARATOR_WINDOWS, 0, '0', '0', 0, 0};
    }

    private int b(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = f52588a;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    private int a(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private int c(int i, int i2, xx xxVar, int i3) {
        xxVar.a(i3);
        xxVar.c(92);
        if (i2 < 0) {
            xxVar.c(117);
            if (i > 255) {
                byte[] bArr = d;
                xxVar.c(bArr[i >> 12]);
                xxVar.c(bArr[(i >> 8) & 15]);
                i &= 255;
            } else {
                xxVar.c(48);
                xxVar.c(48);
            }
            byte[] bArr2 = d;
            xxVar.c(bArr2[i >> 4]);
            xxVar.c(bArr2[i & 15]);
        } else {
            xxVar.c((byte) i2);
        }
        return xxVar.b();
    }

    private static int a(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - GeneratorBase.SURR1_FIRST) << 10) + 65536 + (i2 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    private static void b(int i) {
        throw new IllegalArgumentException(xk.a(i));
    }
}
