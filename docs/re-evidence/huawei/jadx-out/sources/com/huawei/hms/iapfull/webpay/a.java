package com.huawei.hms.iapfull.webpay;

import com.huawei.hms.iapfull.f0;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f13783a;

    @Override // com.huawei.hms.iapfull.f0
    public void a(String str) {
        y0.a("WebPayPresenter", "onQueryGrsFail: GRS fail " + str);
        this.f13783a.a().a();
        this.f13783a.a().finish();
    }

    @Override // com.huawei.hms.iapfull.f0
    public void a() {
        b.a(this.f13783a);
    }

    a(b bVar) {
        this.f13783a = bVar;
    }
}
