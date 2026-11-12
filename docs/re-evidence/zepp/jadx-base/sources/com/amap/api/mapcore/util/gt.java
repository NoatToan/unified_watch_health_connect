package com.amap.api.mapcore.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
@hs(a = "a")
public final class gt {

    @ht(a = "a1", b = 6)
    private String a;

    @ht(a = "a2", b = 6)
    private String b;

    @ht(a = "a6", b = 2)
    private int c;

    @ht(a = "a3", b = 6)
    private String d;

    @ht(a = "a4", b = 6)
    private String e;

    @ht(a = "a5", b = 6)
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String[] l;

    public static class a {
        private String a;
        private String b;
        private String c;
        private String d;
        private boolean e = true;
        private String f = "standard";
        private String[] g = null;

        public a(String str, String str2, String str3) {
            this.a = str2;
            this.b = str2;
            this.d = str3;
            this.c = str;
        }

        public final a a(String[] strArr) {
            if (strArr != null) {
                this.g = (String[]) strArr.clone();
            }
            return this;
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final gt a() throws gi {
            if (this.g != null) {
                return new gt(this, (byte) 0);
            }
            throw new gi("sdk packages is null");
        }
    }

    public /* synthetic */ gt(a aVar, byte b) {
        this(aVar);
    }

    public final void a(boolean z) {
        this.c = z ? 1 : 0;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        if (TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.b)) {
            this.h = gu.c(this.b);
        }
        return this.h;
    }

    public final String d() {
        if (TextUtils.isEmpty(this.i) && !TextUtils.isEmpty(this.d)) {
            this.i = gu.c(this.d);
        }
        return this.i;
    }

    public final String e() {
        if (TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.f)) {
            this.k = gu.c(this.f);
        }
        if (TextUtils.isEmpty(this.k)) {
            this.k = "standard";
        }
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (gt.class != obj.getClass()) {
            return false;
        }
        try {
            return this.j.equals(((gt) obj).j) && this.g.equals(((gt) obj).g) && this.h.equals(((gt) obj).h);
        } catch (Throwable unused) {
        }
    }

    public final boolean f() {
        return this.c == 1;
    }

    public final String[] g() {
        String[] strArr = this.l;
        if ((strArr == null || strArr.length == 0) && !TextUtils.isEmpty(this.e)) {
            this.l = a(gu.c(this.e));
        }
        return (String[]) this.l.clone();
    }

    private gt() {
        this.c = 1;
        this.l = null;
    }

    public final String a() {
        if (TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.a)) {
            this.j = gu.c(this.a);
        }
        return this.j;
    }

    private gt(a aVar) {
        this.c = 1;
        this.l = null;
        this.g = aVar.a;
        this.h = aVar.b;
        this.j = aVar.c;
        this.i = aVar.d;
        this.c = aVar.e ? 1 : 0;
        this.k = aVar.f;
        this.l = aVar.g;
        this.b = gu.b(this.h);
        this.a = gu.b(this.j);
        this.d = gu.b(this.i);
        this.e = gu.b(a(this.l));
        this.f = gu.b(this.k);
    }

    private static String[] a(String str) {
        try {
            return str.split(";");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(";");
            }
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
