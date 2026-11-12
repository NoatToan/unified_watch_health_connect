package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.CharCompanionObject;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
public final class Escapers {
    private static final Escaper a = new a();

    @Beta
    public static final class Builder {
        private final Map<Character, String> a;
        private char b;
        private char c;
        private String d;

        public class a extends ArrayBasedCharEscaper {
            private final char[] g;

            public a(Map map, char c, char c2) {
                super((Map<Character, String>) map, c, c2);
                this.g = Builder.this.d != null ? Builder.this.d.toCharArray() : null;
            }

            @Override // com.google.common.escape.ArrayBasedCharEscaper
            public char[] escapeUnsafe(char c) {
                return this.g;
            }
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        @CanIgnoreReturnValue
        public Builder addEscape(char c, String str) {
            Preconditions.checkNotNull(str);
            this.a.put(Character.valueOf(c), str);
            return this;
        }

        public Escaper build() {
            return new a(this.a, this.b, this.c);
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c, char c2) {
            this.b = c;
            this.c = c2;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(@NullableDecl String str) {
            this.d = str;
            return this;
        }

        private Builder() {
            this.a = new HashMap();
            this.b = (char) 0;
            this.c = CharCompanionObject.MAX_VALUE;
            this.d = null;
        }
    }

    public static class a extends CharEscaper {
        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            return (String) Preconditions.checkNotNull(str);
        }

        @Override // com.google.common.escape.CharEscaper
        public char[] escape(char c) {
            return null;
        }
    }

    public static class b extends UnicodeEscaper {
        public final /* synthetic */ CharEscaper c;

        public b(CharEscaper charEscaper) {
            this.c = charEscaper;
        }

        @Override // com.google.common.escape.UnicodeEscaper
        public char[] escape(int i) {
            if (i < 65536) {
                return this.c.escape((char) i);
            }
            char[] cArr = new char[2];
            Character.toChars(i, cArr, 0);
            char[] cArrEscape = this.c.escape(cArr[0]);
            char[] cArrEscape2 = this.c.escape(cArr[1]);
            if (cArrEscape == null && cArrEscape2 == null) {
                return null;
            }
            int length = cArrEscape != null ? cArrEscape.length : 1;
            char[] cArr2 = new char[(cArrEscape2 != null ? cArrEscape2.length : 1) + length];
            if (cArrEscape != null) {
                for (int i2 = 0; i2 < cArrEscape.length; i2++) {
                    cArr2[i2] = cArrEscape[i2];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (cArrEscape2 != null) {
                for (int i3 = 0; i3 < cArrEscape2.length; i3++) {
                    cArr2[length + i3] = cArrEscape2[i3];
                }
            } else {
                cArr2[length] = cArr[1];
            }
            return cArr2;
        }
    }

    private Escapers() {
    }

    public static UnicodeEscaper a(Escaper escaper) {
        Preconditions.checkNotNull(escaper);
        if (escaper instanceof UnicodeEscaper) {
            return (UnicodeEscaper) escaper;
        }
        if (escaper instanceof CharEscaper) {
            return c((CharEscaper) escaper);
        }
        throw new IllegalArgumentException("Cannot create a UnicodeEscaper from: " + escaper.getClass().getName());
    }

    private static String b(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    private static UnicodeEscaper c(CharEscaper charEscaper) {
        return new b(charEscaper);
    }

    public static String computeReplacement(CharEscaper charEscaper, char c) {
        return b(charEscaper.escape(c));
    }

    public static Escaper nullEscaper() {
        return a;
    }

    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i) {
        return b(unicodeEscaper.escape(i));
    }
}
