package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    public ArrayBasedUnicodeEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, int i14, int i15, String str) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (i15 < i14) {
            i15 = -1;
            i14 = Integer.MAX_VALUE;
        }
        this.safeMin = i14;
        this.safeMax = i15;
        if (i14 >= 55296) {
            this.safeMinChar = (char) 65535;
            this.safeMaxChar = (char) 0;
        } else {
            this.safeMinChar = (char) i14;
            this.safeMaxChar = (char) Math.min(i15, 55295);
        }
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMaxChar || cCharAt < this.safeMinChar) {
                return escapeSlow(str, i14);
            }
        }
        return str;
    }

    public abstract char[] escapeUnsafe(int i14);

    @Override // com.google.common.escape.UnicodeEscaper
    public final int nextEscapeIndex(CharSequence charSequence, int i14, int i15) {
        while (i14 < i15) {
            char cCharAt = charSequence.charAt(i14);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMaxChar || cCharAt < this.safeMinChar) {
                break;
            }
            i14++;
        }
        return i14;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public final char[] escape(int i14) {
        char[] cArr;
        if (i14 < this.replacementsLength && (cArr = this.replacements[i14]) != null) {
            return cArr;
        }
        if (i14 < this.safeMin || i14 > this.safeMax) {
            return escapeUnsafe(i14);
        }
        return null;
    }

    public ArrayBasedUnicodeEscaper(Map<Character, String> map, int i14, int i15, String str) {
        this(ArrayBasedEscaperMap.create(map), i14, i15, str);
    }
}
