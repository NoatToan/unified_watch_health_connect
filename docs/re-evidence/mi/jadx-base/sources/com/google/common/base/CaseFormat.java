package com.google.common.base;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.bk4;
import defpackage.c6i;
import defpackage.fk1;
import defpackage.pt3;
import java.io.Serializable;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class CaseFormat {
    private static final /* synthetic */ CaseFormat[] $VALUES;
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN = new a("LOWER_HYPHEN", 0, pt3.f('-'), "-");
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final pt3 wordBoundary;
    private final String wordSeparator;

    public final enum a extends CaseFormat {
        public a(String str, int i, pt3 pt3Var, String str2) {
            super(str, i, pt3Var, str2, null);
        }

        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            return caseFormat == CaseFormat.UPPER_UNDERSCORE ? fk1.g(str.replace('-', '_')) : super.convert(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
            return fk1.e(str);
        }
    }

    public static final class f extends bk4<String, String> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CaseFormat f8985b;
        public final CaseFormat c;

        public f(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.f8985b = (CaseFormat) c6i.o(caseFormat);
            this.c = (CaseFormat) c6i.o(caseFormat2);
        }

        @Override // defpackage.bk4
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String c(String str) {
            return this.f8985b.to(this.c, str);
        }

        @Override // defpackage.dua
        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f8985b.equals(fVar.f8985b) && this.c.equals(fVar.c);
        }

        public int hashCode() {
            return this.f8985b.hashCode() ^ this.c.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f8985b);
            String strValueOf2 = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(".converterTo(");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    private static /* synthetic */ CaseFormat[] $values() {
        return new CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    static {
        pt3 pt3VarF = pt3.f('_');
        String str = RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR;
        LOWER_UNDERSCORE = new CaseFormat("LOWER_UNDERSCORE", 1, pt3VarF, str) { // from class: com.google.common.base.CaseFormat.b
            {
                a aVar = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String convert(CaseFormat caseFormat, String str2) {
                if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                    return str2.replace('_', '-');
                }
                return caseFormat == CaseFormat.UPPER_UNDERSCORE ? fk1.g(str2) : super.convert(caseFormat, str2);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String str2) {
                return fk1.e(str2);
            }
        };
        String str2 = "";
        LOWER_CAMEL = new CaseFormat("LOWER_CAMEL", 2, pt3.d('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.c
            {
                a aVar = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeFirstWord(String str3) {
                return fk1.e(str3);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String str3) {
                return CaseFormat.firstCharOnlyToUpper(str3);
            }
        };
        UPPER_CAMEL = new CaseFormat("UPPER_CAMEL", 3, pt3.d('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.d
            {
                a aVar = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String str3) {
                return CaseFormat.firstCharOnlyToUpper(str3);
            }
        };
        UPPER_UNDERSCORE = new CaseFormat("UPPER_UNDERSCORE", 4, pt3.f('_'), str) { // from class: com.google.common.base.CaseFormat.e
            {
                a aVar = null;
            }

            @Override // com.google.common.base.CaseFormat
            public String convert(CaseFormat caseFormat, String str3) {
                if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                    return fk1.e(str3.replace('_', '-'));
                }
                return caseFormat == CaseFormat.LOWER_UNDERSCORE ? fk1.e(str3) : super.convert(caseFormat, str3);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String str3) {
                return fk1.g(str3);
            }
        };
        $VALUES = $values();
    }

    public /* synthetic */ CaseFormat(String str, int i, pt3 pt3Var, String str2, a aVar) {
        this(str, i, pt3Var, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char cF = fk1.f(str.charAt(0));
        String strE = fk1.e(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(strE).length() + 1);
        sb.append(cF);
        sb.append(strE);
        return sb.toString();
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }

    public String convert(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int length = 0;
        int iE = -1;
        while (true) {
            iE = this.wordBoundary.e(str, iE + 1);
            if (iE == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder(str.length() + (caseFormat.wordSeparator.length() * 4));
                sb.append(caseFormat.normalizeFirstWord(str.substring(length, iE)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(caseFormat.normalizeWord(str.substring(length, iE)));
            }
            sb.append(caseFormat.wordSeparator);
            length = this.wordSeparator.length() + iE;
        }
        if (length == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        Objects.requireNonNull(sb);
        sb.append(caseFormat.normalizeWord(str.substring(length)));
        return sb.toString();
    }

    public bk4<String, String> converterTo(CaseFormat caseFormat) {
        return new f(this, caseFormat);
    }

    public String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    public abstract String normalizeWord(String str);

    public final String to(CaseFormat caseFormat, String str) {
        c6i.o(caseFormat);
        c6i.o(str);
        return caseFormat == this ? str : convert(caseFormat, str);
    }

    private CaseFormat(String str, int i, pt3 pt3Var, String str2) {
        super(str, i);
        this.wordBoundary = pt3Var;
        this.wordSeparator = str2;
    }
}
