package com.google.common.escape;

import com.google.common.base.Preconditions;
import defpackage.aob;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedCharEscaper extends CharEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    @CheckForNull
    protected abstract char[] escapeUnsafe(char c2);

    protected ArrayBasedCharEscaper(Map<Character, String> map, char c2, char c3) {
        this(aob.c(map), c2, c3);
    }

    protected ArrayBasedCharEscaper(aob aobVar, char c2, char c3) {
        Preconditions.checkNotNull(aobVar);
        char[][] cArrD = aobVar.d();
        this.replacements = cArrD;
        this.replacementsLength = cArrD.length;
        if (c3 < c2) {
            c3 = 0;
            c2 = 65535;
        }
        this.safeMin = c2;
        this.safeMax = c3;
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMax || cCharAt < this.safeMin) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.CharEscaper
    @CheckForNull
    protected final char[] escape(char c2) {
        char[] cArr;
        if (c2 < this.replacementsLength && (cArr = this.replacements[c2]) != null) {
            return cArr;
        }
        if (c2 < this.safeMin || c2 > this.safeMax) {
            return escapeUnsafe(c2);
        }
        return null;
    }
}
