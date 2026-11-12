package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
@hs(a = "update_item")
public class bl {

    @ht(a = "localPath", b = 6)
    public String h;

    @ht(a = "mCompleteCode", b = 2)
    public int j;

    @ht(a = "mState", b = 2)
    public int l;

    @ht(a = "title", b = 6)
    public String a = null;

    @ht(a = "url", b = 6)
    public String b = null;

    @ht(a = "mAdcode", b = 6)
    public String c = null;

    @ht(a = "fileName", b = 6)
    public String d = null;

    @ht(a = "version", b = 6)
    public String e = "";

    @ht(a = "lLocalLength", b = 5)
    public long f = 0;

    @ht(a = "lRemoteLength", b = 5)
    public long g = 0;

    @ht(a = "isProvince", b = 2)
    public int i = 0;

    @ht(a = "mCityCode", b = 6)
    public String k = "";

    @ht(a = "mPinyin", b = 6)
    public String m = "";

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public final String f() {
        return this.b;
    }

    public final int g() {
        return this.j;
    }

    public static String e(String str) {
        return "mAdcode='" + str + "'";
    }

    public static String f(String str) {
        return "mPinyin='" + str + "'";
    }

    public final void c(String str) {
        this.c = str;
    }

    public final void d(String str) {
        this.k = str;
    }
}
