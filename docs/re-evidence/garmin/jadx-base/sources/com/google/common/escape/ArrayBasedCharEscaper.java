package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedCharEscaper extends CharEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    public ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c14, char c15) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (c15 < c14) {
            c15 = 0;
            c14 = 65535;
        }
        this.safeMin = c14;
        this.safeMax = c15;
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMax || cCharAt < this.safeMin) {
                return escapeSlow(str, i14);
            }
        }
        return str;
    }

    public abstract char[] escapeUnsafe(char c14);

    public ArrayBasedCharEscaper(Map<Character, String> map, char c14, char c15) {
        this(ArrayBasedEscaperMap.create(map), c14, c15);
    }

    @Override // com.google.common.escape.CharEscaper
    public final char[] escape(char c14) {
        char[] cArr;
        if (c14 < this.replacementsLength && (cArr = this.replacements[c14]) != null) {
            return cArr;
        }
        if (c14 < this.safeMin || c14 > this.safeMax) {
            return escapeUnsafe(c14);
        }
        return null;
    }
}
