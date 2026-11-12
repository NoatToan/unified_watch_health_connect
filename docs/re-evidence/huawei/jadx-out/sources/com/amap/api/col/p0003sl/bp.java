package com.amap.api.col.p0003sl;

import com.huawei.openalliance.ad.constant.GlobalUtilKeys;
import com.huawei.openalliance.ad.db.bean.ContentResource;

/* JADX INFO: loaded from: classes4.dex */
@kf(a = "update_item")
public class bp {

    @kg(a = GlobalUtilKeys.LOCAL_PATH, b = 6)
    protected String h;

    @kg(a = "mCompleteCode", b = 2)
    protected int j;

    @kg(a = "mState", b = 2)
    public int l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @kg(a = "title", b = 6)
    protected String f2279a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @kg(a = "url", b = 6)
    protected String f2280b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @kg(a = "mAdcode", b = 6)
    protected String f2281c = null;

    @kg(a = ContentResource.FILE_NAME, b = 6)
    protected String d = null;

    @kg(a = "version", b = 6)
    protected String e = "";

    @kg(a = "lLocalLength", b = 5)
    protected long f = 0;

    @kg(a = "lRemoteLength", b = 5)
    protected long g = 0;

    @kg(a = "isProvince", b = 2)
    protected int i = 0;

    @kg(a = "mCityCode", b = 6)
    protected String k = "";

    @kg(a = "mPinyin", b = 6)
    public String m = "";

    public final String c() {
        return this.f2279a;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.f2281c;
    }

    public final void c(String str) {
        this.f2281c = str;
    }

    public final String f() {
        return this.f2280b;
    }

    public final int g() {
        return this.j;
    }

    public final void d(String str) {
        this.k = str;
    }

    public final String h() {
        return this.m;
    }

    public static String e(String str) {
        return "mAdcode='" + str + "'";
    }

    public static String f(String str) {
        return "mPinyin='" + str + "'";
    }
}
