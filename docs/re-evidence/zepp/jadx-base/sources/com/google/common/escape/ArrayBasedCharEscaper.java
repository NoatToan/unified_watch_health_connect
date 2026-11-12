package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
public abstract class ArrayBasedCharEscaper extends CharEscaper {
    private final char[][] c;
    private final int d;
    private final char e;
    private final char f;

    public ArrayBasedCharEscaper(Map<Character, String> map, char c, char c2) {
        this(ArrayBasedEscaperMap.create(map), c, c2);
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < this.d && this.c[cCharAt] != null) || cCharAt > this.f || cCharAt < this.e) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    public abstract char[] escapeUnsafe(char c);

    public ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c, char c2) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] cArrB = arrayBasedEscaperMap.b();
        this.c = cArrB;
        this.d = cArrB.length;
        if (c2 < c) {
            c2 = 0;
            c = CharCompanionObject.MAX_VALUE;
        }
        this.e = c;
        this.f = c2;
    }

    @Override // com.google.common.escape.CharEscaper
    public final char[] escape(char c) {
        char[] cArr;
        if (c < this.d && (cArr = this.c[c]) != null) {
            return cArr;
        }
        if (c < this.e || c > this.f) {
            return escapeUnsafe(c);
        }
        return null;
    }
}
