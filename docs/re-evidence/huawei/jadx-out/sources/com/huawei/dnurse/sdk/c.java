package com.huawei.dnurse.sdk;

/* JADX INFO: loaded from: classes4.dex */
class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DnurseDeviceTest f5479a;

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5479a.f != 0) {
            if (!this.f5479a.G.a().booleanValue()) {
                this.f5479a.K.postDelayed(this.f5479a.f5466b, this.f5479a.q);
                return;
            }
            this.f5479a.b(0);
            if (this.f5479a.B) {
                this.f5479a.wakeupDevice();
            }
        }
    }

    c(DnurseDeviceTest dnurseDeviceTest) {
        this.f5479a = dnurseDeviceTest;
    }
}
