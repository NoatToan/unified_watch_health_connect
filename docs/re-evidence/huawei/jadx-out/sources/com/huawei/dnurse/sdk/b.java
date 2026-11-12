package com.huawei.dnurse.sdk;

/* JADX INFO: loaded from: classes4.dex */
class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DnurseDeviceTest f5478a;

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5478a.G.a().booleanValue()) {
            this.f5478a.b();
        } else {
            this.f5478a.K.postDelayed(this.f5478a.f5465a, this.f5478a.o);
        }
    }

    b(DnurseDeviceTest dnurseDeviceTest) {
        this.f5478a = dnurseDeviceTest;
    }
}
