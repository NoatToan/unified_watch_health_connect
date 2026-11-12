package com.huawei.hms.hatool;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    s0 f13400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    s0 f13401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f13402c;
    String d;

    @Deprecated
    public b c(boolean z) {
        v.a("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f13400a.j().c(z);
        this.f13401b.j().c(z);
        return this;
    }

    @Deprecated
    public b b(boolean z) {
        v.a("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f13400a.j().b(z);
        this.f13401b.j().b(z);
        return this;
    }

    public void a() {
        if (this.f13402c == null) {
            v.b("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        v.a("hmsSdk", "Builder.create() is execute.");
        z0 z0Var = new z0("_hms_config_tag");
        z0Var.b(new s0(this.f13400a));
        z0Var.a(new s0(this.f13401b));
        m.a().a(this.f13402c);
        g0.a().a(this.f13402c);
        q.c().a(z0Var);
        m.a().a(this.d);
    }

    @Deprecated
    public b a(boolean z) {
        v.a("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f13400a.j().a(z);
        this.f13401b.j().a(z);
        return this;
    }

    public b a(String str) {
        v.a("hmsSdk", "Builder.setAppID is execute");
        this.d = str;
        return this;
    }

    public b a(int i, String str) {
        v.a("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i);
        if (!p1.b(str)) {
            str = "";
        }
        if (i == 0) {
            this.f13400a.b(str);
            return this;
        }
        if (i != 1) {
            v.f("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
            return this;
        }
        this.f13401b.b(str);
        return this;
    }

    public b(Context context) {
        if (context != null) {
            this.f13402c = context.getApplicationContext();
        }
        this.f13400a = new s0();
        this.f13401b = new s0();
    }
}
