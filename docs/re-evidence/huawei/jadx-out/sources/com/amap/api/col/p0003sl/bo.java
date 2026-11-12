package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
@kf(a = "update_item_file")
class bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @kg(a = "mAdcode", b = 6)
    private String f2277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @kg(a = "file", b = 6)
    private String f2278b;

    public bo() {
        this.f2277a = "";
        this.f2278b = "";
    }

    public bo(String str, String str2) {
        this.f2277a = str;
        this.f2278b = str2;
    }

    public final String a() {
        return this.f2278b;
    }

    public static String a(String str) {
        return "mAdcode='" + str + "'";
    }
}
