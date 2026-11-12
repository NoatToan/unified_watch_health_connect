package com.huawei.dnurse.sdk;

/* JADX INFO: loaded from: classes4.dex */
class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DnurseDeviceTest f5481a;

    @Override // java.lang.Runnable
    public void run() {
        DnurseDeviceTest dnurseDeviceTest;
        int i;
        switch (this.f5481a.f) {
            case 1:
                if (!this.f5481a.H.f5468a) {
                    dnurseDeviceTest = this.f5481a;
                    i = 14;
                } else if (this.f5481a.G.b()) {
                    dnurseDeviceTest = this.f5481a;
                    i = 15;
                }
                dnurseDeviceTest.b(i);
            case 2:
                dnurseDeviceTest = this.f5481a;
                i = 16;
                dnurseDeviceTest.b(i);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                dnurseDeviceTest = this.f5481a;
                i = 17;
                dnurseDeviceTest.b(i);
                break;
        }
    }

    e(DnurseDeviceTest dnurseDeviceTest) {
        this.f5481a = dnurseDeviceTest;
    }
}
