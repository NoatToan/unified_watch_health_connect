package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes41.dex */
public class ns extends np<com.huawei.openalliance.ad.views.interfaces.m> implements oi {
    private cv d;

    @Override // com.huawei.openalliance.ad.oi
    public void i() {
        this.f19384b.c();
    }

    @Override // com.huawei.openalliance.ad.np
    protected void b(String str) {
        ((com.huawei.openalliance.ad.views.interfaces.m) d()).d();
        hw.b("PPSVideoViewPresenter", "onMaterialLoaded - begin to load video");
        ((com.huawei.openalliance.ad.views.interfaces.m) d()).a(str);
    }

    @Override // com.huawei.openalliance.ad.oi
    public void a(boolean z) {
        this.f19384b.b(z);
    }

    @Override // com.huawei.openalliance.ad.oi
    public void a(long j, long j2, long j3, long j4) {
        this.f19384b.c(j, j2, (int) j3, (int) j4);
    }

    @Override // com.huawei.openalliance.ad.oi
    public void a(final long j, final long j2, final long j3) {
        if (this.d == null || j == 0 || j >= j3) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ns.1
            @Override // java.lang.Runnable
            public void run() {
                long j4 = j3;
                long j5 = j;
                long j6 = j2;
                long j7 = 0;
                if (j6 != 0 && j6 < j4) {
                    j7 = j4 - j6;
                }
                ns.this.d.a(ns.this.f19383a, j4 - j5, j7);
            }
        });
    }

    public ns(Context context, com.huawei.openalliance.ad.views.interfaces.m mVar, int i) {
        super(context, mVar, i);
        this.d = new com.huawei.openalliance.ad.analysis.c(context);
    }
}
