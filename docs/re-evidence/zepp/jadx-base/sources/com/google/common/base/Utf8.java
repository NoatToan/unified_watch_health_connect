package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible(emulated = true)
public final class Utf8 {
    private Utf8() {
    }

    private static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) == cCharAt) {
                        throw new IllegalArgumentException(c(i));
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    private static boolean b(byte[] bArr, int i, int i2) {
        byte b;
        while (i < i2) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i3 != i2 && b2 >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b2 < -16) {
                    int i4 = i3 + 1;
                    if (i4 < i2 && (b = bArr[i3]) <= -65 && ((b2 != -32 || b >= -96) && (b2 != -19 || -96 > b))) {
                        i = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return false;
                }
                if (i3 + 2 >= i2) {
                    return false;
                }
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                    int i6 = i5 + 1;
                    if (bArr[i5] <= -65) {
                        i3 = i6 + 1;
                        if (bArr[i6] > -65) {
                        }
                    }
                }
                return false;
            }
            i = i3;
        }
        return true;
    }

    private static String c(int i) {
        return "Unpaired surrogate at index " + i;
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iA = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iA += a(charSequence, i);
                break;
            }
            iA += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iA >= length) {
            return iA;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iA) + 4294967296L));
    }

    public static boolean isWellFormed(byte[] bArr) {
        return isWellFormed(bArr, 0, bArr.length);
    }

    public static boolean isWellFormed(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        Preconditions.checkPositionIndexes(i, i3, bArr.length);
        while (i < i3) {
            if (bArr[i] < 0) {
                return b(bArr, i, i3);
            }
            i++;
        }
        return true;
    }
}
