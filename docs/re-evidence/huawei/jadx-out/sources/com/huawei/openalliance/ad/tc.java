package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class tc extends st {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private te f20289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20290c;

    @Override // com.huawei.openalliance.ad.st, com.huawei.openalliance.ad.tf
    public void d() {
        this.f20289b.a();
    }

    @Override // com.huawei.openalliance.ad.st, com.huawei.openalliance.ad.tf
    public void c() {
        this.f20289b.b();
    }

    @Override // com.huawei.openalliance.ad.tf
    public void b() {
        super.a(fp.b(this.f20283a).bp());
    }

    @Override // com.huawei.openalliance.ad.tf
    public int a() {
        return this.f20290c;
    }

    public tc(Context context, int i) {
        super(context);
        this.f20289b = new sq(context);
        this.f20290c = i;
    }
}
