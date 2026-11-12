package com.google.common.net;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;
import org.apache.commons.lang3.StringUtils;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class PercentEscaper extends UnicodeEscaper {
    private static final char[] PLUS_SIGN = {'+'};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    public PercentEscaper(String str, boolean z14) {
        Preconditions.checkNotNull(str);
        if (str.matches(".*[0-9A-Za-z].*")) {
            h.s("Alphanumeric characters are always 'safe' and should not be explicitly specified");
            throw null;
        }
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z14 && strConcat.contains(StringUtils.SPACE)) {
            h.s("plusForSpace cannot be specified when space is a 'safe' character");
            throw null;
        }
        this.plusForSpace = z14;
        this.safeOctets = createSafeOctets(strConcat);
    }

    private static boolean[] createSafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int iMax = -1;
        for (char c14 : charArray) {
            iMax = Math.max((int) c14, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c15 : charArray) {
            zArr[c15] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public char[] escape(int i14) {
        boolean[] zArr = this.safeOctets;
        if (i14 < zArr.length && zArr[i14]) {
            return null;
        }
        if (i14 == 32 && this.plusForSpace) {
            return PLUS_SIGN;
        }
        if (i14 <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{CoreConstants.PERCENT_CHAR, cArr[i14 >>> 4], cArr[i14 & 15]};
        }
        if (i14 <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            return new char[]{CoreConstants.PERCENT_CHAR, cArr2[(i14 >>> 10) | 12], cArr2[(i14 >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr2[((i14 >>> 4) & 3) | 8], cArr2[i14 & 15]};
        }
        if (i14 <= 65535) {
            char[] cArr3 = UPPER_HEX_DIGITS;
            return new char[]{CoreConstants.PERCENT_CHAR, 'E', cArr3[i14 >>> 12], CoreConstants.PERCENT_CHAR, cArr3[((i14 >>> 10) & 3) | 8], cArr3[(i14 >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr3[((i14 >>> 4) & 3) | 8], cArr3[i14 & 15]};
        }
        if (i14 <= 1114111) {
            char[] cArr4 = UPPER_HEX_DIGITS;
            return new char[]{CoreConstants.PERCENT_CHAR, 'F', cArr4[(i14 >>> 18) & 7], CoreConstants.PERCENT_CHAR, cArr4[((i14 >>> 16) & 3) | 8], cArr4[(i14 >>> 12) & 15], CoreConstants.PERCENT_CHAR, cArr4[((i14 >>> 10) & 3) | 8], cArr4[(i14 >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr4[((i14 >>> 4) & 3) | 8], cArr4[i14 & 15]};
        }
        h.s(j.h(i14, "Invalid unicode character value "));
        return null;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public int nextEscapeIndex(CharSequence charSequence, int i14, int i15) {
        Preconditions.checkNotNull(charSequence);
        while (i14 < i15) {
            char cCharAt = charSequence.charAt(i14);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i14++;
        }
        return i14;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return escapeSlow(str, i14);
            }
        }
        return str;
    }
}
