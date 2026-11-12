package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
@hs(a = "update_item_download_info")
class bj {

    @ht(a = "mAdcode", b = 6)
    private String a;

    @ht(a = "fileLength", b = 5)
    private long b;

    @ht(a = "splitter", b = 2)
    private int c;

    @ht(a = "startPos", b = 5)
    private long d;

    @ht(a = "endPos", b = 5)
    private long e;

    public bj() {
        this.a = "";
        this.b = 0L;
        this.c = 0;
        this.d = 0L;
        this.e = 0L;
    }

    public static String a(String str) {
        return "mAdcode='" + str + "'";
    }

    public bj(String str, long j, int i, long j2, long j3) {
        this.a = "";
        this.b = 0L;
        this.c = 0;
        this.d = 0L;
        this.e = 0L;
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = j3;
    }
}
