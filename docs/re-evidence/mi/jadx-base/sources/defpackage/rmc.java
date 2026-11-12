package defpackage;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.state.AutoState;
import com.xiaomi.fitness.sport_manager.state.data.HuamiDataReceive;
import com.xiaomi.fitness.sport_manager.state.device.DeviceSportStateRecord;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportKind;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class rmc extends ed2 {
    public static boolean y;
    public String w;
    public vjc x;

    public rmc(WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.w = "HuamiSportState";
    }

    private void l0(boolean z) {
        HuamiApiCaller huamiApiCaller = SportDeviceModel.getHuamiApiCaller();
        if (huamiApiCaller == null) {
            Logger.i(this.w, "finishStep: huami api = null");
        } else {
            huamiApiCaller.enableRealtimeStep(z);
        }
    }

    @Override // defpackage.ed2
    public void W() {
        this.f16511b = 0L;
    }

    @Override // defpackage.ed2
    @SuppressLint({"WrongConstant"})
    public void Y() {
        super.Y();
        W();
        this.f = 0;
        this.g = 0;
        this.c = 0.0d;
        y = false;
    }

    @Override // defpackage.kzc
    public void a(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.w, "resumeSport : " + i);
        SportDeviceModel.getHuamiApiCaller().sportResume((int) z());
        U(j0(i, 3, 0));
    }

    @Override // defpackage.ed2, defpackage.kzc
    public void d(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        super.d(i, wearableDeviceModel, sportRequestCallback);
        boolean zSportStop = SportDeviceModel.getHuamiApiCaller().sportStop();
        if (zSportStop) {
            v0();
            l0(false);
        }
        FitnessLogUtils.i(this.w, "finishSport , sportType: " + i + ", isStop Success : " + zSportStop);
        u0(i);
        vjc vjcVar = this.x;
        if (vjcVar != null) {
            vjcVar.e();
            this.x = null;
        }
    }

    @Override // defpackage.ed2, defpackage.kzc
    public void e(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        super.e(sportRequestData, wearableDeviceModel, sportRequestCallback);
        FitnessLogUtils.i(this.w, "huami startSport : " + sportRequestData.sportType);
        int i = sportRequestData.sportType;
        if (i == 8) {
            s0();
        } else {
            SportKind sportKindK0 = k0(i);
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            boolean zR0 = r0(sportRequestData.sportType, sportKindK0, 0);
            SportData sportData = this.n;
            boolean zSportStart = SportDeviceModel.getHuamiApiCaller().sportStart(seconds, sportData != null ? sportData.totalTime : 0);
            FitnessLogUtils.i(this.w, "huami startSport , sportType : " + sportRequestData.sportType + ",isSportConfig : " + zR0 + ",isStart : " + zSportStart);
            if (zSportStart) {
                Z(1);
                y = true;
                s0();
                q0();
                t0();
                FitnessLogUtils.i(this.w, "app_huami sport launch success");
            } else {
                Z(2);
                FitnessLogUtils.i(this.w, "app_huami sport launch fail , app alone sport");
            }
        }
        U(j0(sportRequestData.sportType, 1, 0));
    }

    @Override // defpackage.ed2
    public void e0(SportRequestData sportRequestData, int i) {
        super.e0(sportRequestData, i);
    }

    @Override // defpackage.kzc
    public void f(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.w, "pauseSport : " + i);
        SportDeviceModel.getHuamiApiCaller().sportPause();
        U(j0(i, 2, 0));
    }

    @Override // defpackage.ed2
    public void g0() {
    }

    @Override // defpackage.kzc
    public void h(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        if (I(i)) {
            r0(i, k0(i), 0);
            s0();
            boolean zSportStart = SportDeviceModel.getHuamiApiCaller().sportStart((int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), (int) z());
            FitnessLogUtils.i(this.w, "restartSport : " + i + ", isRestart : " + zSportStart);
            l0(true);
        }
        if (H(i)) {
            s0();
        }
    }

    public final SportRequestData j0(int i, int i2, int i3) {
        return new SportRequestData.a().z(i).w(i3).x(i2).C(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).E(FitnessDateUtils.getCurrentTZOffsetIn15min()).o();
    }

    public final SportKind k0(int i) {
        SportKind sportKind = SportKind.NONE;
        if (i == 1) {
            return SportKind.OUTDOOR;
        }
        if (i == 2) {
            return SportKind.WALK;
        }
        if (i != 3) {
            return i != 6 ? sportKind : SportKind.RIDING;
        }
        return SportKind.INDOOR;
    }

    public final /* synthetic */ void m0(int i, int i2, SportCommand sportCommand) {
        if (sportCommand.getCommand() == SportCommand.PAUSE.getCommand()) {
            f2o.x().j = false;
            AutoState.get().setHandRestartTime(0L);
            SportRequestData sportRequestDataJ0 = j0(i, 2, 0);
            U(sportRequestDataJ0);
            f2o.x().r().passiveNotifySportState(sportRequestDataJ0, i2);
            FitnessLogUtils.i(this.w, "sportConfig() --> SportCommand.PAUSE");
        }
        if (sportCommand.getCommand() == SportCommand.RESUME.getCommand()) {
            f2o.x().j = true;
            AutoState.get().setHandRestartTime(System.currentTimeMillis());
            SportRequestData sportRequestDataJ1 = j0(i, 3, 0);
            U(sportRequestDataJ1);
            f2o.x().r().passiveNotifySportState(sportRequestDataJ1, i2);
            FitnessLogUtils.i(this.w, "sportConfig() --> SportCommand.RESUME");
        }
        if (sportCommand.getCommand() == SportCommand.STOP.getCommand()) {
            f2o.x().j = true;
            f2o.x().g = false;
            SportRequestData sportRequestDataJ2 = j0(i, 4, 0);
            U(sportRequestDataJ2);
            f2o.x().r().passiveNotifySportState(sportRequestDataJ2, i2);
            u0(i);
            FitnessLogUtils.i(this.w, "sportConfig() --> SportCommand.STOP");
            f2o.x().i0();
            l0(false);
        }
    }

    @SuppressLint({"WrongConstant"})
    public void n0() {
        DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(1);
        b0(1);
        Z(5);
        U(j0(3, 1, 1));
        FitnessLogUtils.i(this.w, "start sport with huami device , don`t need gps");
    }

    @SuppressLint({"WrongConstant"})
    public void o0() {
        DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(1);
        SportDeviceModel.INSTANCE.addDeviceStatusListener(this);
        this.p = new vjc();
        b0(1);
        Z(5);
        U(j0(1, 1, 1));
        FitnessLogUtils.i(this.w, "onWearSportStartWithGPS()");
        f2o.x().d0();
    }

    @SuppressLint({"WrongConstant"})
    public void p0() {
        if (B() == 1 || B() == 2) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(4);
            SportDeviceModel.getHuamiApiCaller().deviceSportStop();
            U(j0(1, 4, 1));
            Y();
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.i(this.w, "onWearSportStop()");
        }
    }

    @Override // defpackage.ed2
    public void q(boolean z, byte[] bArr) {
        super.q(z, bArr);
    }

    public final void q0() {
        HuamiApiCaller huamiApiCaller = SportDeviceModel.getHuamiApiCaller();
        if (huamiApiCaller == null) {
            Logger.i(this.w, "openStep: huami api = null");
        } else {
            huamiApiCaller.enableRealtimeStep(true);
        }
    }

    public final boolean r0(final int i, SportKind sportKind, final int i2) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        return SportDeviceModel.getHuamiApiCaller().sendSportNoTimerConfig(sportKind, new IHMSportListener() { // from class: pmc
            @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
            public final void onSportCommand(SportCommand sportCommand) {
                this.f30536a.m0(i, i2, sportCommand);
            }
        });
    }

    public void s0() {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d(this.w, "startHuamiHr");
        if (SportDeviceModel.getHuamiCaller() != null) {
            SportDeviceModel.getHuamiCaller().startRealtimeMeasureHr(HuamiDataReceive.INSTANCE.get());
        }
    }

    public void t0() {
        vjc vjcVar = new vjc();
        this.x = vjcVar;
        this.p = vjcVar;
        f2o.x().h(this.p.getClass(), this.p);
        jdn.h().e(this.p.getClass(), this.p);
    }

    public void u0(int i) {
        U(j0(i, 4, 0));
        Y();
    }

    @Override // defpackage.ed2
    public boolean v(SportRequestData sportRequestData) {
        return jdn.h().i().distance >= 100;
    }

    public void v0() {
        if (SportDeviceModel.getHuamiCaller() != null) {
            SportDeviceModel.getHuamiCaller().stopRealtimeMeasureHr();
        }
    }

    @Override // defpackage.ed2
    public cen y() {
        return this.p;
    }
}
