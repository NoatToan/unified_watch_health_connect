package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
@hs(a = "update_item_file")
class bk {

    @ht(a = "mAdcode", b = 6)
    private String a;

    @ht(a = "file", b = 6)
    private String b;

    public bk() {
        this.a = "";
        this.b = "";
    }

    public final String a() {
        return this.b;
    }

    public static String a(String str) {
        return "mAdcode='" + str + "'";
    }

    public bk(String str, String str2) {
        this.a = "";
        this.b = "";
        this.a = str;
        this.b = str2;
    }
}
