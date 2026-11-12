package com.google.common.base;

import am.j;
import com.google.common.annotations.GwtCompatible;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Utf8 {
    private Utf8() {
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i14 = 0;
        while (i14 < length && charSequence.charAt(i14) < 128) {
            i14++;
        }
        int iEncodedLengthGeneral = length;
        while (i14 < length) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i14);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i14++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        com.google.protobuf.a.g(((long) iEncodedLengthGeneral) + 4294967296L);
        return 0;
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i14) {
        int length = charSequence.length();
        int i15 = 0;
        while (i14 < length) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt < 2048) {
                i15 += (127 - cCharAt) >>> 31;
            } else {
                i15 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i14) == cCharAt) {
                        h.s(unpairedSurrogateMsg(i14));
                        return 0;
                    }
                    i14++;
                }
            }
            i14++;
        }
        return i15;
    }

    public static boolean isWellFormed(byte[] bArr, int i14, int i15) {
        int i16 = i15 + i14;
        Preconditions.checkPositionIndexes(i14, i16, bArr.length);
        while (i14 < i16) {
            if (bArr[i14] < 0) {
                return isWellFormedSlowPath(bArr, i14, i16);
            }
            i14++;
        }
        return true;
    }

    private static boolean isWellFormedSlowPath(byte[] bArr, int i14, int i15) {
        byte b14;
        while (i14 < i15) {
            int i16 = i14 + 1;
            byte b15 = bArr[i14];
            if (b15 < 0) {
                if (b15 < -32) {
                    if (i16 != i15 && b15 >= -62) {
                        i14 += 2;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return false;
                }
                if (b15 < -16) {
                    int i17 = i14 + 2;
                    if (i17 < i15 && (b14 = bArr[i16]) <= -65 && ((b15 != -32 || b14 >= -96) && (b15 != -19 || -96 > b14))) {
                        i14 += 3;
                        if (bArr[i17] > -65) {
                        }
                    }
                    return false;
                }
                if (i14 + 3 >= i15) {
                    return false;
                }
                int i18 = i14 + 2;
                byte b16 = bArr[i16];
                if (b16 <= -65) {
                    if ((((b16 + 112) + (b15 << Ascii.FS)) >> 30) == 0) {
                        int i19 = i14 + 3;
                        if (bArr[i18] <= -65) {
                            i14 += 4;
                            if (bArr[i19] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
            i14 = i16;
        }
        return true;
    }

    private static String unpairedSurrogateMsg(int i14) {
        return j.h(i14, "Unpaired surrogate at index ");
    }

    public static boolean isWellFormed(byte[] bArr) {
        return isWellFormed(bArr, 0, bArr.length);
    }
}
