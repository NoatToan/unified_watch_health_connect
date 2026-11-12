package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes41.dex */
public class nz extends jr<com.huawei.openalliance.ad.views.interfaces.s> implements oo<com.huawei.openalliance.ad.views.interfaces.s> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gk f19802c;
    private Context d;
    private oa e;
    private ht f;
    private boolean g = false;

    @Override // com.huawei.openalliance.ad.oo
    public boolean a(int i, boolean z) {
        hw.b("SloganPresenter", "loadSloganRecord " + i);
        b(i, z);
        return this.g;
    }

    @Override // com.huawei.openalliance.ad.oo
    public void a(ht htVar) {
        this.f = htVar;
    }

    private void b(int i, boolean z) {
        hw.b("SloganPresenter", "show default slogan");
        if (z) {
            nj njVar = new nj(this.f19802c, this.f);
            this.e = njVar;
            njVar.a();
        }
        d().a(i);
    }

    public nz(Context context, com.huawei.openalliance.ad.views.interfaces.s sVar, int i) {
        a(sVar);
        this.d = context.getApplicationContext();
        this.f19802c = fp.b(context);
    }
}
