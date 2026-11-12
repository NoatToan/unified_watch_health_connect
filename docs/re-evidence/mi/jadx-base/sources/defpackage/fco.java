package defpackage;

import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;

/* JADX INFO: loaded from: classes10.dex */
public class fco implements lzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lzc f17657a;

    public fco(lzc lzcVar) {
        this.f17657a = lzcVar;
    }

    @Override // defpackage.lzc
    public void b(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        this.f17657a.b(i, ecoDeviceModel, sportRequestCallback);
    }

    @Override // defpackage.lzc
    public void e(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        this.f17657a.e(i, ecoDeviceModel, sportRequestCallback);
    }

    @Override // defpackage.lzc
    public void g(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        this.f17657a.g(sportRequestData, ecoDeviceModel, sportRequestCallback);
    }

    @Override // defpackage.lzc
    public void h(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        this.f17657a.h(i, ecoDeviceModel, sportRequestCallback);
    }
}
