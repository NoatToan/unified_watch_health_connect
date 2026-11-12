package defpackage;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;

/* JADX INFO: loaded from: classes9.dex */
public abstract class s10 implements byc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WearableDeviceModel f33148a;

    public s10(WearableDeviceModel wearableDeviceModel) {
        this.f33148a = wearableDeviceModel;
    }

    @Override // defpackage.byc
    public abstract /* synthetic */ void checkCRSStatus(ssg.b bVar);

    @Override // defpackage.byc
    public abstract /* synthetic */ void closeTai(ssg.b bVar);

    @Override // defpackage.byc
    public abstract /* synthetic */ void openTai(ssg.b bVar);

    @Override // defpackage.byc
    public abstract /* synthetic */ void pinStatus(ssg.b bVar);

    public void s() {
        u();
        this.f33148a = null;
    }

    public int t() throws Exception {
        return 0;
    }

    public void u() {
        tyo.g();
    }

    public yrg.a v(yrg.a aVar) throws Exception {
        return null;
    }
}
