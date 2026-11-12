package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class UnicodeEscaper extends Escaper {
    private static final int DEST_PAD = 32;

    public static int codePointAt(CharSequence charSequence, int i14, int i15) {
        Preconditions.checkNotNull(charSequence);
        if (i14 >= i15) {
            e.v("Index exceeds specified range");
            return 0;
        }
        int i16 = i14 + 1;
        char cCharAt = charSequence.charAt(i14);
        if (cCharAt < 55296 || cCharAt > 57343) {
            return cCharAt;
        }
        if (cCharAt > 56319) {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + i14 + " in '" + ((Object) charSequence) + "'");
        }
        if (i16 == i15) {
            return -cCharAt;
        }
        char cCharAt2 = charSequence.charAt(i16);
        if (Character.isLowSurrogate(cCharAt2)) {
            return Character.toCodePoint(cCharAt, cCharAt2);
        }
        throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i16 + " in '" + ((Object) charSequence) + "'");
    }

    private static char[] growBuffer(char[] cArr, int i14, int i15) {
        if (i15 < 0) {
            h.q("Cannot increase internal buffer any further");
            return null;
        }
        char[] cArr2 = new char[i15];
        if (i14 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i14);
        }
        return cArr2;
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        int iNextEscapeIndex = nextEscapeIndex(str, 0, length);
        return iNextEscapeIndex == length ? str : escapeSlow(str, iNextEscapeIndex);
    }

    public abstract char[] escape(int i14);

    public final String escapeSlow(String str, int i14) {
        int length = str.length();
        char[] cArrCharBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int i15 = 0;
        int length2 = 0;
        while (i14 < length) {
            int iCodePointAt = codePointAt(str, i14, length);
            if (iCodePointAt < 0) {
                h.s("Trailing high surrogate at end of input");
                return null;
            }
            char[] cArrEscape = escape(iCodePointAt);
            int i16 = (Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1) + i14;
            if (cArrEscape != null) {
                int i17 = i14 - i15;
                int i18 = length2 + i17;
                int length3 = cArrEscape.length + i18;
                if (cArrCharBufferFromThreadLocal.length < length3) {
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, (length - i14) + length3 + 32);
                }
                if (i17 > 0) {
                    str.getChars(i15, i14, cArrCharBufferFromThreadLocal, length2);
                    length2 = i18;
                }
                if (cArrEscape.length > 0) {
                    System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, length2, cArrEscape.length);
                    length2 += cArrEscape.length;
                }
                i15 = i16;
            }
            i14 = nextEscapeIndex(str, i16, length);
        }
        int i19 = length - i15;
        if (i19 > 0) {
            int i24 = i19 + length2;
            if (cArrCharBufferFromThreadLocal.length < i24) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, i24);
            }
            str.getChars(i15, length, cArrCharBufferFromThreadLocal, length2);
            length2 = i24;
        }
        return new String(cArrCharBufferFromThreadLocal, 0, length2);
    }

    public int nextEscapeIndex(CharSequence charSequence, int i14, int i15) {
        while (i14 < i15) {
            int iCodePointAt = codePointAt(charSequence, i14, i15);
            if (iCodePointAt < 0 || escape(iCodePointAt) != null) {
                break;
            }
            i14 += Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1;
        }
        return i14;
    }
}
