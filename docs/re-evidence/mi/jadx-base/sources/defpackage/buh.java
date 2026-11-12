package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;

/* JADX INFO: loaded from: classes10.dex */
public class buh extends dd2 {
    public String t;

    public buh(EcoDeviceModel ecoDeviceModel) {
        super(ecoDeviceModel);
        this.t = "PhoneSportState";
        this.f15384k = "xiaomiwear_app";
    }

    @Override // defpackage.dd2
    public void S() {
    }

    @Override // defpackage.dd2
    public void Y(int i, int i2, int i3) {
        super.Y(i, i2, i3);
    }

    @Override // defpackage.dd2
    public void a0() {
    }

    @Override // defpackage.lzc
    public void b(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.t, "pauseSport : " + i);
        sportRequestCallback.call(2, new SportResponseData(0, null, null));
        R(q(i, 2));
    }

    @Override // defpackage.lzc
    public void c(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
    }

    @Override // defpackage.lzc
    public void e(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.t, "resumeSport : " + i);
        sportRequestCallback.call(3, new SportResponseData(0, null, null));
        R(q(i, 3));
    }

    @Override // defpackage.dd2, defpackage.lzc
    public void g(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        super.g(sportRequestData, ecoDeviceModel, sportRequestCallback);
        FitnessLogUtils.i(this.t, "startSport : " + sportRequestData.sportType);
        SportData sportData = this.m;
        if (sportData == null) {
            U(2);
        } else {
            U(sportData.appLaunchType);
        }
        sportRequestCallback.call(1, new SportResponseData(0, null, null));
        R(q(sportRequestData.sportType, 1));
    }

    @Override // defpackage.dd2, defpackage.lzc
    public void h(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        super.h(i, ecoDeviceModel, sportRequestCallback);
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.t, "finishSport : " + i);
        sportRequestCallback.call(4, new SportResponseData(0, null, null));
        R(q(i, 4));
    }

    @Override // defpackage.dd2
    public void p(boolean z, byte[] bArr) {
        super.p(z, bArr);
    }

    @Override // defpackage.dd2
    public boolean t(SportRequestData sportRequestData) {
        return kdn.f().g().distance >= 100;
    }

    @Override // defpackage.dd2
    public den v() {
        return null;
    }
}
