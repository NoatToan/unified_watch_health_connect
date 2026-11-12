package x63;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import p005kotlin.jvm.internal.s;
import w63.b0;
import w63.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f189310a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f189311b = new byte[0];

    public static final int a(char c14) {
        if ('0' <= c14 && c14 < ':') {
            return c14 - '0';
        }
        if ('a' <= c14 && c14 < 'g') {
            return c14 - 'W';
        }
        if ('A' <= c14 && c14 < 'G') {
            return c14 - '7';
        }
        vb.h.s(tn.k.f("Unexpected hex digit: ", c14));
        return 0;
    }

    public static final byte[] b(String str) {
        int i14;
        char cCharAt;
        str.getClass();
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i15 = 0;
        while (i15 < length) {
            char cCharAt2 = str.charAt(i15);
            if (s.h(cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i16 = i15;
                while (i15 < length2) {
                    char cCharAt3 = str.charAt(i15);
                    if (s.h(cCharAt3, 128) < 0) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) cCharAt3;
                        i15++;
                        while (true) {
                            i16 = i17;
                            if (i15 >= length2 || s.h(str.charAt(i15), 128) >= 0) {
                                break;
                            }
                            i17 = i16 + 1;
                            bArr[i16] = (byte) str.charAt(i15);
                            i15++;
                        }
                    } else {
                        if (s.h(cCharAt3, 2048) < 0) {
                            bArr[i16] = (byte) ((cCharAt3 >> 6) | 192);
                            i16 += 2;
                            bArr[i16 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i16] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i16 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i16 += 3;
                            bArr[i16 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (s.h(cCharAt3, 56319) > 0 || length2 <= (i14 = i15 + 1) || 56320 > (cCharAt = str.charAt(i14)) || cCharAt >= 57344) {
                            bArr[i16] = 63;
                            i15++;
                            i16++;
                        } else {
                            int iCharAt = (str.charAt(i14) + (cCharAt3 << '\n')) - 56613888;
                            bArr[i16] = (byte) ((iCharAt >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr[i16 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i16 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i16 + 3] = (byte) ((iCharAt & 63) | 128);
                            i15 += 2;
                        }
                        i15++;
                    }
                }
                return Arrays.copyOf(bArr, i16);
            }
            bArr[i15] = (byte) cCharAt2;
            i15++;
        }
        return Arrays.copyOf(bArr, str.length());
    }

    public static final long c(b0 b0Var, w63.h hVar, int i14, long j8) {
        long j14;
        w63.e eVar = b0Var.f183329b;
        hVar.getClass();
        int i15 = i14;
        long j15 = i15;
        w63.b.b(hVar.d(), 0, j15);
        if (b0Var.f183330c) {
            vb.h.z("closed");
            return 0L;
        }
        long jMax = 0;
        while (true) {
            long jA = a.a(b0Var.f183329b, hVar, jMax, j8, i15);
            if (jA != -1) {
                return jA;
            }
            long j16 = eVar.f183349b;
            long j17 = (j16 - j15) + 1;
            if (j17 >= j8) {
                return -1L;
            }
            if (j16 < j8) {
                j14 = -1;
            } else {
                int iMax = (int) Math.max(1L, (j16 - j8) + 1);
                j14 = -1;
                int iMin = ((int) Math.min(j15, (eVar.f183349b - jMax) + 1)) - 1;
                if (iMax > iMin) {
                    return -1L;
                }
                while (!eVar.n(iMin, hVar, eVar.f183349b - ((long) iMin))) {
                    if (iMin == iMax) {
                        return -1L;
                    }
                    iMin--;
                }
            }
            if (b0Var.f183328a.read(eVar, 8192L) == j14) {
                return j14;
            }
            jMax = Math.max(jMax, j17);
            i15 = i14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static final int d(e0 e0Var, int i14) {
        int i15;
        int[] iArr = e0Var.f183360g;
        int i16 = i14 + 1;
        int length = e0Var.f183359f.length;
        iArr.getClass();
        int i17 = length - 1;
        int i18 = 0;
        while (i18 <= i17) {
            i15 = (i18 + i17) >>> 1;
            int i19 = iArr[i15];
            if (i19 < i16) {
                i18 = i15 + 1;
            } else {
                if (i19 <= i16) {
                    if (i15 >= 0) {
                        return i15;
                    }
                    return ~i15;
                }
                i17 = i15 - 1;
            }
        }
        i15 = (-i18) - 1;
        if (i15 >= 0) {
            return i15;
        }
        return ~i15;
    }
}
