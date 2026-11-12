package com.google.common.escape;

import b71.i;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CharEscaper extends Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

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
        for (int i14 = 0; i14 < length; i14++) {
            if (escape(str.charAt(i14)) != null) {
                return escapeSlow(str, i14);
            }
        }
        return str;
    }

    public abstract char[] escape(char c14);

    public final String escapeSlow(String str, int i14) {
        int length = str.length();
        char[] cArrCharBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int length2 = cArrCharBufferFromThreadLocal.length;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            char[] cArrEscape = escape(str.charAt(i14));
            if (cArrEscape != null) {
                int length3 = cArrEscape.length;
                int i17 = i14 - i15;
                int i18 = i16 + i17;
                int i19 = i18 + length3;
                if (length2 < i19) {
                    length2 = i.b(length, i14, 2, i19);
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i16, length2);
                }
                if (i17 > 0) {
                    str.getChars(i15, i14, cArrCharBufferFromThreadLocal, i16);
                    i16 = i18;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, i16, length3);
                    i16 += length3;
                }
                i15 = i14 + 1;
            }
            i14++;
        }
        int i24 = length - i15;
        if (i24 > 0) {
            int i25 = i24 + i16;
            if (length2 < i25) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i16, i25);
            }
            str.getChars(i15, length, cArrCharBufferFromThreadLocal, i16);
            i16 = i25;
        }
        return new String(cArrCharBufferFromThreadLocal, 0, i16);
    }
}
