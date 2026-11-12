package com.huawei.hms.iapfull.pay;

import com.huawei.hms.iapfull.f0;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f13740a;

    @Override // com.huawei.hms.iapfull.f0
    public void a(String str) {
        y0.a("PayPresenter", "onQueryGrsFail: GRS fail " + str);
        this.f13740a.a().a();
        this.f13740a.a().finish();
    }

    @Override // com.huawei.hms.iapfull.f0
    public void a() {
        j.a(this.f13740a);
    }

    h(j jVar) {
        this.f13740a = jVar;
    }
}
