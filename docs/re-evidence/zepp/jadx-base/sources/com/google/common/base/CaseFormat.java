package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public abstract class CaseFormat {
    private static final /* synthetic */ CaseFormat[] $VALUES;
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    public static enum a extends CaseFormat {
        public a(String str, int i, CharMatcher charMatcher, String str2) {
            super(str, i, charMatcher, str2, null);
        }

        @Override // com.google.common.base.CaseFormat
        public String b(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            return caseFormat == CaseFormat.UPPER_UNDERSCORE ? Ascii.toUpperCase(str.replace('-', '_')) : super.b(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public String f(String str) {
            return Ascii.toLowerCase(str);
        }
    }

    public static final class f extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat c;
        private final CaseFormat d;

        public f(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.c = (CaseFormat) Preconditions.checkNotNull(caseFormat);
            this.d = (CaseFormat) Preconditions.checkNotNull(caseFormat2);
        }

        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String doBackward(String str) {
            return this.d.to(this.c, str);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.c.equals(fVar.c) && this.d.equals(fVar.d);
        }

        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String doForward(String str) {
            return this.c.to(this.d, str);
        }

        public int hashCode() {
            return this.c.hashCode() ^ this.d.hashCode();
        }

        public String toString() {
            return this.c + ".converterTo(" + this.d + ")";
        }
    }

    static {
        a aVar = new a("LOWER_HYPHEN", 0, CharMatcher.is('-'), Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        LOWER_HYPHEN = aVar;
        String str = "_";
        CaseFormat caseFormat = new CaseFormat("LOWER_UNDERSCORE", 1, CharMatcher.is('_'), str) { // from class: com.google.common.base.CaseFormat.b
            {
                a aVar2 = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String b(CaseFormat caseFormat2, String str2) {
                if (caseFormat2 == CaseFormat.LOWER_HYPHEN) {
                    return str2.replace('_', '-');
                }
                return caseFormat2 == CaseFormat.UPPER_UNDERSCORE ? Ascii.toUpperCase(str2) : super.b(caseFormat2, str2);
            }

            @Override // com.google.common.base.CaseFormat
            public String f(String str2) {
                return Ascii.toLowerCase(str2);
            }
        };
        LOWER_UNDERSCORE = caseFormat;
        String str2 = "";
        CaseFormat caseFormat2 = new CaseFormat("LOWER_CAMEL", 2, CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.c
            {
                a aVar2 = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String f(String str3) {
                return CaseFormat.c(str3);
            }
        };
        LOWER_CAMEL = caseFormat2;
        CaseFormat caseFormat3 = new CaseFormat("UPPER_CAMEL", 3, CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.d
            {
                a aVar2 = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String f(String str3) {
                return CaseFormat.c(str3);
            }
        };
        UPPER_CAMEL = caseFormat3;
        CaseFormat caseFormat4 = new CaseFormat("UPPER_UNDERSCORE", 4, CharMatcher.is('_'), str) { // from class: com.google.common.base.CaseFormat.e
            {
                a aVar2 = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String b(CaseFormat caseFormat5, String str3) {
                if (caseFormat5 == CaseFormat.LOWER_HYPHEN) {
                    return Ascii.toLowerCase(str3.replace('_', '-'));
                }
                return caseFormat5 == CaseFormat.LOWER_UNDERSCORE ? Ascii.toLowerCase(str3) : super.b(caseFormat5, str3);
            }

            @Override // com.google.common.base.CaseFormat
            public String f(String str3) {
                return Ascii.toUpperCase(str3);
            }
        };
        UPPER_UNDERSCORE = caseFormat4;
        $VALUES = new CaseFormat[]{aVar, caseFormat, caseFormat2, caseFormat3, caseFormat4};
    }

    public /* synthetic */ CaseFormat(String str, int i, CharMatcher charMatcher, String str2, a aVar) {
        this(str, i, charMatcher, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return Ascii.toUpperCase(str.charAt(0)) + Ascii.toLowerCase(str.substring(1));
    }

    private String e(String str) {
        return this == LOWER_CAMEL ? Ascii.toLowerCase(str) : f(str);
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }

    public String b(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int length = 0;
        int iIndexIn = -1;
        while (true) {
            iIndexIn = this.wordBoundary.indexIn(str, iIndexIn + 1);
            if (iIndexIn == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder(str.length() + (this.wordSeparator.length() * 4));
                sb.append(caseFormat.e(str.substring(length, iIndexIn)));
            } else {
                sb.append(caseFormat.f(str.substring(length, iIndexIn)));
            }
            sb.append(caseFormat.wordSeparator);
            length = this.wordSeparator.length() + iIndexIn;
        }
        if (length == 0) {
            return caseFormat.e(str);
        }
        sb.append(caseFormat.f(str.substring(length)));
        return sb.toString();
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
        return new f(this, caseFormat);
    }

    public abstract String f(String str);

    public final String to(CaseFormat caseFormat, String str) {
        Preconditions.checkNotNull(caseFormat);
        Preconditions.checkNotNull(str);
        return caseFormat == this ? str : b(caseFormat, str);
    }

    private CaseFormat(String str, int i, CharMatcher charMatcher, String str2) {
        super(str, i);
        this.wordBoundary = charMatcher;
        this.wordSeparator = str2;
    }
}
