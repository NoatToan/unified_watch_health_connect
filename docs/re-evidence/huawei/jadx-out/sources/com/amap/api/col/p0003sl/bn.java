package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
@kf(a = "update_item_download_info")
class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @kg(a = "mAdcode", b = 6)
    private String f2274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @kg(a = "fileLength", b = 5)
    private long f2275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @kg(a = "splitter", b = 2)
    private int f2276c;

    @kg(a = "startPos", b = 5)
    private long d;

    @kg(a = "endPos", b = 5)
    private long e;

    public bn() {
        this.f2274a = "";
        this.f2275b = 0L;
        this.f2276c = 0;
        this.d = 0L;
        this.e = 0L;
    }

    public bn(String str, long j, int i, long j2, long j3) {
        this.f2274a = str;
        this.f2275b = j;
        this.f2276c = i;
        this.d = j2;
        this.e = j3;
    }

    public static String a(String str) {
        return "mAdcode='" + str + "'";
    }
}
