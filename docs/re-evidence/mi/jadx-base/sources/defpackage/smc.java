package defpackage;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.state.AutoState;
import com.xiaomi.fitness.sport_eco_manager.state.data.HuamiDataReceive;
import com.xiaomi.fitness.sport_eco_manager.state.device.DeviceSportStateRecord;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportKind;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class smc extends dd2 {
    public String t;
    public wjc u;

    public smc(EcoDeviceModel ecoDeviceModel) {
        super(ecoDeviceModel);
        this.t = "HuamiSportState";
    }

    private SportKind e0(int i) {
        SportKind sportKind = SportKind.NONE;
        if (i == 1) {
            return SportKind.OUTDOOR;
        }
        if (i == 2) {
            return SportKind.WALK;
        }
        if (i != 3) {
            return (i == 6 || i == 7) ? SportKind.RIDING : sportKind;
        }
        return SportKind.INDOOR;
    }

    private void f0(boolean z) {
        HuamiDevice huamiApiCaller = SportDeviceModel.getHuamiApiCaller();
        if (huamiApiCaller == null) {
            Logger.i(this.t, "finishStep: huami api = null");
        } else {
            huamiApiCaller.enableRealtimeStep(z);
        }
    }

    private void j0() {
        HuamiDevice huamiApiCaller = SportDeviceModel.getHuamiApiCaller();
        if (huamiApiCaller == null) {
            Logger.i(this.t, "openStep: huami api = null");
        } else {
            huamiApiCaller.enableRealtimeStep(true);
        }
    }

    private boolean k0(final int i, SportKind sportKind, int i2) {
        if (SportDeviceModel.getHuamiApiCaller() == null) {
            return false;
        }
        return SportDeviceModel.getHuamiApiCaller().sendSportNoTimerConfig(sportKind, new IHMSportListener() { // from class: qmc
            @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
            public final void onSportCommand(SportCommand sportCommand) {
                this.f31656a.g0(i, sportCommand);
            }
        });
    }

    @Override // defpackage.dd2
    public void S() {
        this.f15383b = 0L;
    }

    @Override // defpackage.dd2
    @SuppressLint({"WrongConstant"})
    public void T() {
        super.T();
        S();
        this.f = 0;
        this.g = 0;
        this.c = 0.0d;
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
        if (SportDeviceModel.getHuamiApiCaller().sportPause()) {
            R(d0(i, 2, 0));
        }
    }

    @Override // defpackage.lzc
    public void c(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        if (D(i)) {
            k0(i, e0(i), 0);
            l0();
            boolean zSportStart = SportDeviceModel.getHuamiApiCaller().sportStart((int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), (int) w());
            FitnessLogUtils.i(this.t, "restartSport : " + i + ", isRestart : " + zSportStart);
            f0(true);
        }
    }

    public final SportRequestData d0(int i, int i2, int i3) {
        return new SportRequestData.a().s(i).o(i3).p(i2).v(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).x(FitnessDateUtils.getCurrentTZOffsetIn15min()).j();
    }

    @Override // defpackage.lzc
    public void e(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(this.t, "resumeSport : " + i);
        if (SportDeviceModel.getHuamiApiCaller().sportResume((int) w())) {
            R(d0(i, 3, 0));
        }
    }

    @Override // defpackage.dd2, defpackage.lzc
    public void g(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        super.g(sportRequestData, ecoDeviceModel, sportRequestCallback);
        FitnessLogUtils.i(this.t, "huami startSport : " + sportRequestData.sportType);
        int i = sportRequestData.sportType;
        if (i == 8) {
            l0();
        } else {
            SportKind sportKindE0 = e0(i);
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            boolean zK0 = k0(sportRequestData.sportType, sportKindE0, 0);
            SportData sportData = this.m;
            boolean zSportStart = SportDeviceModel.getHuamiApiCaller().sportStart(seconds, sportData != null ? sportData.totalTime : 0);
            FitnessLogUtils.i(this.t, "huami startSport , sportType : " + sportRequestData.sportType + ",isSportConfig : " + zK0 + ",isStart : " + zSportStart);
            if (zSportStart) {
                U(1);
                l0();
                j0();
                m0();
                FitnessLogUtils.i(this.t, "app_huami sport launch success");
            } else {
                U(2);
                FitnessLogUtils.i(this.t, "app_huami sport launch fail , app alone sport");
            }
        }
        R(d0(sportRequestData.sportType, 1, 0));
    }

    public final /* synthetic */ void g0(int i, SportCommand sportCommand) {
        if (sportCommand.getCommand() == SportCommand.PAUSE.getCommand()) {
            g2o.s().m = false;
            AutoState.get().setHandRestartTime(0L);
            R(d0(i, 2, 0));
            FitnessLogUtils.i(this.t, "sportConfig() --> SportCommand.PAUSE");
        }
        if (sportCommand.getCommand() == SportCommand.RESUME.getCommand()) {
            g2o.s().m = true;
            AutoState.get().setHandRestartTime(System.currentTimeMillis());
            R(d0(i, 3, 0));
            FitnessLogUtils.i(this.t, "sportConfig() --> SportCommand.RESUME");
        }
        if (sportCommand.getCommand() == SportCommand.STOP.getCommand()) {
            g2o.s().m = true;
            g2o.s().h = false;
            R(d0(i, 4, 0));
            n0(i);
            FitnessLogUtils.i(this.t, "sportConfig() --> SportCommand.STOP");
            g2o.s().V();
            f0(false);
        }
    }

    @Override // defpackage.dd2, defpackage.lzc
    public void h(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        super.h(i, ecoDeviceModel, sportRequestCallback);
        boolean zSportStop = SportDeviceModel.getHuamiApiCaller().sportStop();
        if (zSportStop) {
            o0();
            f0(false);
        }
        FitnessLogUtils.i(this.t, "finishSport , sportType: " + i + ", isStop Success : " + zSportStop);
        n0(i);
        wjc wjcVar = this.u;
        if (wjcVar != null) {
            wjcVar.e();
            this.u = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    public void h0() {
        DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(1);
        W(1);
        U(5);
        R(d0(g2o.s().r(), 1, 1));
        FitnessLogUtils.i(this.t, "start sport with huami device , don`t need gps");
    }

    @SuppressLint({"WrongConstant"})
    public void i0() {
        if (y() == 1 || y() == 2) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(4);
            SportDeviceModel.getHuamiApiCaller().deviceSportStop();
            R(d0(1, 4, 1));
            T();
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.i(this.t, "onWearSportStop()");
        }
    }

    public void l0() {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d(this.t, "startHuamiHr");
        if (SportDeviceModel.getHuamiCaller() != null) {
            SportDeviceModel.getHuamiCaller().startRealtimeMeasureHr(HuamiDataReceive.INSTANCE.get());
        }
    }

    public void m0() {
        wjc wjcVar = new wjc();
        this.u = wjcVar;
        this.o = wjcVar;
        g2o.s().e(this.o.getClass(), this.o);
        kdn.f().d(this.o.getClass(), this.o);
    }

    public void n0(int i) {
        R(d0(i, 4, 0));
        T();
    }

    public void o0() {
        if (SportDeviceModel.getHuamiCaller() != null) {
            SportDeviceModel.getHuamiCaller().stopRealtimeMeasureHr();
        }
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
        return this.o;
    }
}
