package com.huawei.hms.network.embedded;

/* JADX INFO: loaded from: classes34.dex */
public final class s9 {
    public static final String e = ":status";
    public static final String f = ":method";
    public static final String g = ":path";
    public static final String h = ":scheme";
    public static final String i = ":authority";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb f15352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb f15353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15354c;
    public static final eb d = eb.d(":");
    public static final eb j = eb.d(":status");
    public static final eb k = eb.d(":method");
    public static final eb l = eb.d(":path");
    public static final eb m = eb.d(":scheme");
    public static final eb n = eb.d(":authority");

    public String toString() {
        return f8.a("%s: %s", this.f15352a.n(), this.f15353b.n());
    }

    public int hashCode() {
        return ((this.f15352a.hashCode() + 527) * 31) + this.f15353b.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return this.f15352a.equals(s9Var.f15352a) && this.f15353b.equals(s9Var.f15353b);
    }

    public s9(String str, String str2) {
        this(eb.d(str), eb.d(str2));
    }

    public s9(eb ebVar, String str) {
        this(ebVar, eb.d(str));
    }

    public s9(eb ebVar, eb ebVar2) {
        this.f15352a = ebVar;
        this.f15353b = ebVar2;
        this.f15354c = ebVar.j() + 32 + ebVar2.j();
    }
}
