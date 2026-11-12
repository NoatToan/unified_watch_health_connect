package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public abstract class st implements tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f20283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gc f20284b;

    @Override // com.huawei.openalliance.ad.tf
    public void c() {
    }

    @Override // com.huawei.openalliance.ad.tf
    public void d() {
    }

    public void a(long j) {
        this.f20284b.a(com.huawei.openalliance.ad.utils.as.c() - j, a());
    }

    public st(Context context) {
        this.f20283a = context.getApplicationContext();
        this.f20284b = fb.a(context);
    }
}
