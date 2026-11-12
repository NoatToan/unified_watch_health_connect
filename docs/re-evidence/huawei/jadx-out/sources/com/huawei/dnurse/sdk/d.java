package com.huawei.dnurse.sdk;

/* JADX INFO: loaded from: classes4.dex */
class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DnurseDeviceTest f5480a;

    @Override // java.lang.Runnable
    public void run() {
        this.f5480a.H.c();
        DnurseDeviceTest dnurseDeviceTest = this.f5480a;
        dnurseDeviceTest.a(dnurseDeviceTest.n);
    }

    d(DnurseDeviceTest dnurseDeviceTest) {
        this.f5480a = dnurseDeviceTest;
    }
}
