package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new e();

    public abstract String reverse(String str);

    public abstract String transform(String str);

    protected static final class e extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }

        protected e() {
        }
    }

    protected NameTransformer() {
    }

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z = false;
        boolean z2 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z = true;
        }
        if (z2) {
            if (z) {
                return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.4
                    @Override // com.fasterxml.jackson.databind.util.NameTransformer
                    public String transform(String str3) {
                        return str + str3 + str2;
                    }

                    @Override // com.fasterxml.jackson.databind.util.NameTransformer
                    public String reverse(String str3) {
                        if (!str3.startsWith(str)) {
                            return null;
                        }
                        String strSubstring = str3.substring(str.length());
                        if (strSubstring.endsWith(str2)) {
                            return strSubstring.substring(0, strSubstring.length() - str2.length());
                        }
                        return null;
                    }

                    public String toString() {
                        return "[PreAndSuffixTransformer('" + str + "','" + str2 + "')]";
                    }
                };
            }
            return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.2
                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String transform(String str3) {
                    return str + str3;
                }

                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String reverse(String str3) {
                    if (str3.startsWith(str)) {
                        return str3.substring(str.length());
                    }
                    return null;
                }

                public String toString() {
                    return "[PrefixTransformer('" + str + "')]";
                }
            };
        }
        if (z) {
            return new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.5
                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String transform(String str3) {
                    return str3 + str2;
                }

                @Override // com.fasterxml.jackson.databind.util.NameTransformer
                public String reverse(String str3) {
                    if (str3.endsWith(str2)) {
                        return str3.substring(0, str3.length() - str2.length());
                    }
                    return null;
                }

                public String toString() {
                    return "[SuffixTransformer('" + str2 + "')]";
                }
            };
        }
        return NOP;
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new a(nameTransformer, nameTransformer2);
    }

    public static class a extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final NameTransformer f4205a;
        protected final NameTransformer e;

        public a(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this.f4205a = nameTransformer;
            this.e = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.f4205a.transform(this.e.transform(str));
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String strReverse = this.f4205a.reverse(str);
            return strReverse != null ? this.e.reverse(strReverse) : strReverse;
        }

        public String toString() {
            return "[ChainedTransformer(" + this.f4205a + ", " + this.e + ")]";
        }
    }
}
