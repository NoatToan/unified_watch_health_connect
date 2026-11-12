package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String strReverse = this._t1.reverse(str);
            return strReverse != null ? this._t2.reverse(strReverse) : strReverse;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    public static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }

    public static class a extends NameTransformer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7723b;

        public a(String str, String str2) {
            this.f7722a = str;
            this.f7723b = str2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (!str.startsWith(this.f7722a)) {
                return null;
            }
            String strSubstring = str.substring(this.f7722a.length());
            if (strSubstring.endsWith(this.f7723b)) {
                return strSubstring.substring(0, strSubstring.length() - this.f7723b.length());
            }
            return null;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.f7722a + "','" + this.f7723b + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.f7722a + str + this.f7723b;
        }
    }

    public static class b extends NameTransformer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7724a;

        public b(String str) {
            this.f7724a = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.startsWith(this.f7724a)) {
                return str.substring(this.f7724a.length());
            }
            return null;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.f7724a + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.f7724a + str;
        }
    }

    public static class c extends NameTransformer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7725a;

        public c(String str) {
            this.f7725a = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.endsWith(this.f7725a)) {
                return str.substring(0, str.length() - this.f7725a.length());
            }
            return null;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.f7725a + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str + this.f7725a;
        }
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(String str, String str2) {
        boolean z = false;
        boolean z2 = str != null && str.length() > 0;
        if (str2 != null && str2.length() > 0) {
            z = true;
        }
        if (z2) {
            return z ? new a(str, str2) : new b(str);
        }
        return z ? new c(str2) : NOP;
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);
}
