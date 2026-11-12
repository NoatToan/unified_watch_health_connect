package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.linked.view.LinkedAppDetailView;

/* JADX INFO: loaded from: classes12.dex */
public class hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedAppDetailView f18879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gz f18880b;

    public boolean e() {
        LinkedAppDetailView linkedAppDetailView = this.f18879a;
        return linkedAppDetailView != null && linkedAppDetailView.getVisibility() == 0;
    }

    public void d() {
        LinkedAppDetailView linkedAppDetailView = this.f18879a;
        if (linkedAppDetailView != null) {
            linkedAppDetailView.setVisibility(8);
        }
    }

    public boolean c() {
        gz gzVar = this.f18880b;
        return (gzVar == null || gzVar.d() == 7) ? false : true;
    }

    public boolean b() {
        AdLandingPageData adLandingPageDataC;
        gz gzVar = this.f18880b;
        return (gzVar == null || (adLandingPageDataC = gzVar.c()) == null || adLandingPageDataC.getAppInfo() == null) ? false : true;
    }

    public void a(LinkedAppDetailView linkedAppDetailView) {
        this.f18879a = linkedAppDetailView;
    }

    public void a(gz gzVar) {
        this.f18880b = gzVar;
    }

    public void a() {
        if (this.f18879a == null || this.f18880b == null || !b()) {
            return;
        }
        this.f18879a.setAdLandingPageData(this.f18880b.c());
        this.f18879a.setContentRecord(this.f18880b.a());
        this.f18879a.setVisibility(0);
    }
}
