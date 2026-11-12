package com.huawei.dnurse.sdk;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
class f extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DnurseDeviceTest f5482a;

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (this.f5482a.f == 7) {
            DnurseDeviceTest.k(this.f5482a);
            if (this.f5482a.D <= 0) {
                this.f5482a.L.cancel();
                this.f5482a.a(3000);
            } else {
                this.f5482a.J.onMeasuring(this.f5482a.f, this.f5482a.D);
            }
        }
    }

    f(DnurseDeviceTest dnurseDeviceTest) {
        this.f5482a = dnurseDeviceTest;
    }
}
