package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class auh extends ed2 {
    public String w;

    public auh(WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.w = "PhoneSportState";
        this.l = "xiaomiwear_app";
    }

    @Override // defpackage.ed2
    public void W() {
    }

    @Override // defpackage.kzc
    public void a(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.w, "resumeSport : " + i);
        sportRequestCallback.call(3, new SportResponseData(0, null, null));
        U(r(i, 3));
    }

    @Override // defpackage.kzc
    public void c(FinishSportData finishSportData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        int sportType = finishSportData.getSportType();
        super.d(sportType, wearableDeviceModel, sportRequestCallback);
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.w, "finishSportWithData : " + sportType);
        sportRequestCallback.call(4, new SportResponseData(0, null, null));
        if (finishSportData.getTrainingPlanFinishData() != null) {
            U(i0(sportType, 4, finishSportData));
        } else {
            U(r(sportType, 4));
        }
    }

    @Override // defpackage.ed2, defpackage.kzc
    public void d(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        super.d(i, wearableDeviceModel, sportRequestCallback);
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.w, "finishSport : " + i);
        sportRequestCallback.call(4, new SportResponseData(0, null, null));
        U(r(i, 4));
    }

    @Override // defpackage.ed2, defpackage.kzc
    public void e(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        super.e(sportRequestData, wearableDeviceModel, sportRequestCallback);
        FitnessLogUtils.i(this.w, "startSport : " + sportRequestData.sportType);
        SportData sportData = this.n;
        if (sportData == null) {
            Z(2);
        } else {
            Z(sportData.appLaunchType);
        }
        sportRequestCallback.call(1, new SportResponseData(0, null, null));
        U(r(sportRequestData.sportType, 1));
    }

    @Override // defpackage.ed2
    public void e0(SportRequestData sportRequestData, int i) {
        super.e0(sportRequestData, i);
    }

    @Override // defpackage.kzc
    public void f(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.w, "pauseSport : " + i);
        sportRequestCallback.call(2, new SportResponseData(0, null, null));
        U(r(i, 2));
    }

    @Override // defpackage.ed2
    public void g0() {
    }

    @Override // defpackage.kzc
    public void h(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
    }

    public final SportRequestData i0(int i, int i2, FinishSportData finishSportData) {
        return new SportRequestData.a().z(i).w(0).x(i2).C(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).E(FitnessDateUtils.getCurrentTZOffsetIn15min()).r(finishSportData).o();
    }

    @Override // defpackage.ed2
    public void q(boolean z, byte[] bArr) {
        super.q(z, bArr);
    }

    @Override // defpackage.ed2
    public boolean v(SportRequestData sportRequestData) {
        return jdn.h().i().distance >= 100;
    }

    @Override // defpackage.ed2
    public cen y() {
        return null;
    }
}
