package defpackage;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;

/* JADX INFO: loaded from: classes10.dex */
public class eco implements kzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kzc f16505a;

    public eco(kzc kzcVar) {
        this.f16505a = kzcVar;
    }

    @Override // defpackage.kzc
    public void a(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        this.f16505a.a(i, wearableDeviceModel, sportRequestCallback);
    }

    @Override // defpackage.kzc
    public void d(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        this.f16505a.d(i, wearableDeviceModel, sportRequestCallback);
    }

    @Override // defpackage.kzc
    public void e(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        this.f16505a.e(sportRequestData, wearableDeviceModel, sportRequestCallback);
    }

    @Override // defpackage.kzc
    public void f(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        this.f16505a.f(i, wearableDeviceModel, sportRequestCallback);
    }
}
