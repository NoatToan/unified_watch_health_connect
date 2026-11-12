package defpackage;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import android.util.Pair;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.device.data.BleSender;
import com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class ene extends gv2 {
    public String E;
    public EcoDeviceModel F;
    public den G;
    public BleSender H;
    public AtomicBoolean I;
    public bsc J;
    public psc K;
    public Pair<Boolean, Integer> L;

    public class a implements EcoDeviceSyncCallback {
        public a() {
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
        public void onSyncError(String str, int i, String str2) {
            FitnessLogUtils.i(ene.this.E, "sync local device sport : error is " + str2);
            try {
                fsc fscVarH = kdn.f().h();
                FitnessLogUtils.i(ene.this.E, "IEcoRemoteSportSyncDataListener:" + fscVarH);
                if (fscVarH != null) {
                    kdn.f().h().onSync(false, ene.this.L == null, 0);
                    ene.this.L = null;
                }
            } catch (RemoteException e) {
                FitnessLogUtils.e(ene.this.E, "IEcoRemoteSportSyncDataListener,e:" + e.toString());
                e.printStackTrace();
            }
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
        public void onSyncSuccess(String str, int i, Object obj) {
            FitnessLogUtils.i(ene.this.E, "sync local device sport : success");
            try {
                fsc fscVarH = kdn.f().h();
                FitnessLogUtils.i(ene.this.E, "IEcoRemoteSportSyncDataListener:" + fscVarH);
                if (fscVarH != null) {
                    fsc fscVarH2 = kdn.f().h();
                    int iIntValue = 0;
                    boolean z = ene.this.L == null;
                    if (ene.this.L != null) {
                        iIntValue = ((Integer) ene.this.L.second).intValue();
                    }
                    fscVarH2.onSync(true, z, iIntValue);
                    ene.this.L = null;
                }
            } catch (RemoteException e) {
                FitnessLogUtils.e(ene.this.E, "IEcoRemoteSportSyncDataListener,e:" + e.toString());
                e.printStackTrace();
            }
        }
    }

    public ene(EcoDeviceModel ecoDeviceModel) {
        super(ecoDeviceModel);
        this.E = "LocalSportState";
        this.I = new AtomicBoolean(false);
        this.F = ecoDeviceModel;
        this.G = new lab();
    }

    private boolean J0() {
        return (g2o.s().u() == 4 || g2o.s().u() == 0) ? false : true;
    }

    private void R0(int i) {
        if (i == 1) {
            g2o.s().e(com.xiaomi.fitness.sport_eco_manager.remind.a.n().getClass(), com.xiaomi.fitness.sport_eco_manager.remind.a.n());
            kdn.f().d(com.xiaomi.fitness.sport_eco_manager.remind.a.n().getClass(), com.xiaomi.fitness.sport_eco_manager.remind.a.n());
        }
    }

    public final boolean G0(SportRequestData sportRequestData) {
        byte[] bArr = sportRequestData.ids;
        boolean z = false;
        if (bArr == null || bArr.length == 0) {
            PhoneSportData phoneSportDataG = kdn.f().g();
            if (phoneSportDataG.type != 6 ? !(phoneSportDataG.jumpCount < 1 || phoneSportDataG.jumpDuration < 30) : phoneSportDataG.jumpCount >= 1) {
                z = true;
            }
            FitnessLogUtils.i(this.E, "dataIds == null || dataIds.length == 0 , validSport : " + z);
        } else {
            z = bArr.length % 7 == 0;
            FitnessLogUtils.i(this.E, "dataIds != null && dataIds.length ==" + bArr.length + ", validSport :" + z);
        }
        FitnessLogUtils.i(this.E, "finish sport, validSport = " + z);
        return z;
    }

    public final BleSender H0() {
        EcoDeviceModel ecoDeviceModelCurGymDeviceModel = SportDeviceModel.INSTANCE.curGymDeviceModel();
        EcoDeviceModel ecoDeviceModel = this.F;
        if (ecoDeviceModel == null) {
            return null;
        }
        if (ecoDeviceModel != ecoDeviceModelCurGymDeviceModel || this.H == null) {
            this.H = new SportGymSender(ecoDeviceModelCurGymDeviceModel);
            this.F = ecoDeviceModelCurGymDeviceModel;
        }
        if (!this.F.getDeviceInfo().getMac().equals(ecoDeviceModelCurGymDeviceModel.getDeviceInfo().getMac())) {
            this.H = new SportGymSender(ecoDeviceModelCurGymDeviceModel);
        }
        return this.H;
    }

    public SportGymSender I0() {
        return (SportGymSender) H0();
    }

    public final /* synthetic */ void K0() {
        U(0);
    }

    public final /* synthetic */ void L0(SportRequestData sportRequestData, SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        FitnessLogUtils.i(this.E, "GYM sendSportRequestToWear ,requestData :" + sportRequestData + " , responseCode : " + sportResponseData.responseCode);
        if (sportResponseData.isRequestSuccess()) {
            sportRequestData.timeStamp = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            R(sportRequestData);
            if (i == 4) {
                g2o.s().A(g2o.s().D()).V(null);
            }
        }
        sportResponseData.isNotSport = sportRequestData.isNotSport;
        if (sportRequestCallback != null) {
            sportRequestCallback.call(i, sportResponseData);
        }
    }

    public final /* synthetic */ void M0(a8r a8rVar) {
        FitnessLogUtils.i(this.E, "standalone : " + a8rVar.h);
        boolean zA = a8rVar.a();
        FitnessLogUtils.i(this.E, "hasOngoingSport:" + zA + " , timeStamp : " + a8rVar.f779a);
        if (zA) {
            s0(a8rVar);
        } else {
            r0(a8rVar);
        }
        this.I.set(false);
    }

    public void N0(ir9 ir9Var) throws RemoteException {
        if (ir9Var.c != 0) {
            FitnessLogUtils.i(this.E, "onReceiveDeviceDefault:" + ir9Var.c);
            SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
            if (sportDeviceModel.curGymDeviceModel() == null || this.J == null) {
                return;
            }
            sportDeviceModel.hasDeviceFault(sportDeviceModel.curGymDeviceModel(), ir9Var, this.J);
        }
    }

    public void O0(tr9[] tr9VarArr) {
        SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE().hashCode();
        FitnessLogUtils.i(this.E, "gymFtpTarget is $gymFtpTarget");
        for (tr9 tr9Var : tr9VarArr) {
            FitnessLogUtils.i(this.E, "Eco ftpTarget.targetPower:" + tr9Var.c + ", ftpTarget.targetPower :" + tr9Var.f);
        }
        FitnessLogUtils.i(this.E, "Eco iLocalReceiveListener : " + this.K);
        SportDeviceModel.INSTANCE.curGymDeviceModel();
    }

    public void P0(fs9[] fs9VarArr) throws RemoteException {
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        key_gym_local_sport_type.hashCode();
        int i = 3;
        switch (key_gym_local_sport_type) {
            case "yesoul.exbike.jsc01y":
            case "runmi.exbike.jscrm1":
                i = 7;
                break;
            case "yunmai.jmprope.sr803":
            case "yunmai.jmprope.sr805":
                i = 14;
                break;
            case "ksmb.treadmill.m1v1":
                break;
            default:
                i = 0;
                break;
        }
        for (fs9 fs9Var : fs9VarArr) {
            FitnessLogUtils.i(this.E, "Eco gymSetting.key:" + fs9Var.c + ", gymSetting.value :" + fs9Var.d);
            int i2 = fs9Var.c;
            if ((i2 == 1 || i2 == 2) && fs9Var.d == 1 && J0()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long tZOffsetInMilli = FitnessDateUtils.getTZOffsetInMilli(jCurrentTimeMillis);
                SportRequestData.a aVar = new SportRequestData.a();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                R(aVar.u(jCurrentTimeMillis, timeUnit).w(tZOffsetInMilli, timeUnit).s(i).p(4).j());
            }
        }
        FitnessLogUtils.i(this.E, "Eco iLocalReceiveListener : " + this.J);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.curGymDeviceModel() == null || this.J == null) {
            return;
        }
        sportDeviceModel.hasEcoGymSetting(sportDeviceModel.curGymDeviceModel(), fs9VarArr, this.J);
    }

    @Override // defpackage.dd2
    public void Q(SportRequestData sportRequestData, int i) {
        g2o.s().I().remove(j0o.class);
        kdn.f().d(lab.class, this.G);
        boolean z = sportRequestData.isNotSport;
        Iterator<ISportStateChangedListener> it = g2o.s().I().values().iterator();
        while (it.hasNext()) {
            it.next().onSportStarted(sportRequestData.timeStamp, sportRequestData.timeZone, sportRequestData.sportType, i);
        }
    }

    public void Q0(sr9 sr9Var) throws RemoteException {
        FitnessLogUtils.i(this.E, "gymFtpTarget is $gymFtpTarget");
        FitnessLogUtils.i(this.E, "Eco ftpState.lightOnNumber:" + sr9Var.f + ", ftpState.stage :" + sr9Var.d);
        String str = this.E;
        StringBuilder sb = new StringBuilder();
        sb.append("Eco iLocalReceiveListener : ");
        sb.append(this.K);
        FitnessLogUtils.i(str, sb.toString());
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.curGymDeviceModel() == null || this.K == null) {
            return;
        }
        sportDeviceModel.hasFtpState(sportDeviceModel.curGymDeviceModel(), sr9Var, this.K);
    }

    public void S0(int i) {
        this.g = i;
        T();
    }

    public void T0(psc pscVar) {
        this.K = pscVar;
    }

    public void U0(int i, SportRequestCallback sportRequestCallback) {
        if (H0() != null) {
            FitnessLogUtils.i(this.E, "setGymFtpPercentRpm=========03");
            H0().setGymFtpPercentRpm(i, sportRequestCallback);
        }
    }

    public void V0(boolean z, SportRequestCallback sportRequestCallback) {
        if (H0() != null) {
            FitnessLogUtils.i(this.E, "setGymFtpTest=========03");
            H0().setGymFtpTest(z, sportRequestCallback);
        }
    }

    public void W0(int i, SportRequestCallback sportRequestCallback) {
        if (H0() != null) {
            H0().setGymPace(i, sportRequestCallback);
        }
    }

    public void X0(float f, SportRequestCallback sportRequestCallback) {
        if (H0() != null) {
            H0().setGymSpeed(f, sportRequestCallback);
        }
    }

    public void Y0(bsc bscVar) {
        this.J = bscVar;
    }

    public void Z0(EcoDeviceModel ecoDeviceModel) {
        FitnessLogUtils.d(this.E, "localSportState1 : " + this);
        if (this.I.get()) {
            return;
        }
        this.I.set(true);
        new f6o(ecoDeviceModel).d(new cza() { // from class: zme
            @Override // defpackage.cza
            public final void a(a8r a8rVar) {
                this.f41459a.M0(a8rVar);
            }
        });
    }

    @Override // defpackage.gv2, defpackage.lzc
    public void b(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        if (y() != 2) {
            t0(i, null, 2, sportRequestCallback);
        }
    }

    @Override // defpackage.gv2, defpackage.lzc
    public void e(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        if (y() != 3) {
            t0(i, null, 3, sportRequestCallback);
        }
    }

    @Override // defpackage.gv2, defpackage.v0d
    @SuppressLint({"WrongConstant"})
    public void f(SportRequestData sportRequestData) {
        FitnessLogUtils.i(this.E, "receive gym request , sportRequestData : " + sportRequestData);
        R0(sportRequestData.sportState);
        R(sportRequestData);
        if (sportRequestData.sportState == 1) {
            if (this.G == null) {
                this.G = new lab();
            }
            U(7);
            this.L = new Pair<>(Boolean.TRUE, Integer.valueOf(sportRequestData.timeStamp));
            g2o.s().l(SportDeviceModel.INSTANCE.curGymDeviceModel());
            if (g2o.s().D() != null && g2o.s().D().getIsDeviceConnected()) {
                g2o.s().A(g2o.s().D()).n = g2o.s().w().d;
            }
        }
        int iR = g2o.s().r();
        if (g2o.s().D() == null || !g2o.s().D().getIsDeviceConnected()) {
            return;
        }
        int i = sportRequestData.sportState;
        if (i == 1) {
            g2o.s().j0(g2o.s().D(), sportRequestData, null);
            return;
        }
        if (i == 2) {
            g2o.s().U(g2o.s().D(), iR, null);
        } else if (i == 3) {
            g2o.s().Y(g2o.s().D(), iR, null);
        } else {
            if (i != 4) {
                return;
            }
            g2o.s().m(g2o.s().D(), iR, null);
        }
    }

    @Override // defpackage.gv2, defpackage.dd2, defpackage.lzc
    public void g(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        if (!SportDeviceModel.INSTANCE.isLocal(ecoDeviceModel)) {
            FitnessLogUtils.i(this.E, "DeviceModel is not LocalSportDeviceModel");
            sportRequestCallback.call(sportRequestData.sportState, null);
        } else {
            FitnessLogUtils.i(this.E, "startSport");
            this.F = ecoDeviceModel;
            x0(sportRequestData, ecoDeviceModel, sportRequestCallback);
        }
    }

    @Override // defpackage.gv2, defpackage.dd2, defpackage.lzc
    public void h(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.E, "sportType : " + i);
        if (y() != 4) {
            t0(i, null, 4, sportRequestCallback);
        }
    }

    @Override // defpackage.gv2, defpackage.dd2
    @SuppressLint({"WrongConstant"})
    public void p(boolean z, byte[] bArr) {
        super.p(z, bArr);
        FitnessLogUtils.i(this.E, "afterSportFinish , validSport: " + z);
        this.d.postDelayed(new Runnable() { // from class: cne
            @Override // java.lang.Runnable
            public final void run() {
                this.f5575a.K0();
            }
        }, VibrateModeProgressBar.sLongToLong);
        if (z) {
            EcoDeviceModel ecoDeviceModel = this.F;
            if (ecoDeviceModel == null) {
                FitnessLogUtils.i(this.E, "afterSportFinish , deviceModel == null");
                return;
            }
            SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
            if (!sportDeviceModel.isLocal(ecoDeviceModel)) {
                FitnessLogUtils.i(this.E, "deviceModel is not local");
                return;
            }
            EcoDeviceModel ecoDeviceModelCurGymDeviceModel = sportDeviceModel.curGymDeviceModel();
            FitnessLogUtils.i(this.E, "deviceModle is local device , did : " + this.F.getDeviceInfo().getDid() + " , cur deviceModel : " + ecoDeviceModelCurGymDeviceModel.getDeviceInfo().getModel() + ",dataIds:" + bArr);
            sportDeviceModel.fitnessSyncer().syncData(this.F.getDeviceInfo().getDid(), new a());
            return;
        }
        FitnessLogUtils.i(this.E, "validSport : " + z);
        try {
            fsc fscVarH = kdn.f().h();
            FitnessLogUtils.i(this.E, "IEcoRemoteSportSyncDataListener:" + fscVarH);
            if (fscVarH != null) {
                fscVarH.onSync(false, this.L == null, 0);
            }
            this.L = null;
        } catch (RemoteException e) {
            FitnessLogUtils.e(this.E, "IEcoRemoteSportSyncDataListener,e:" + e.toString());
            e.printStackTrace();
        }
    }

    @Override // defpackage.gv2, defpackage.dd2
    public boolean t(SportRequestData sportRequestData) {
        return this.f == 14 ? G0(sportRequestData) : super.t(sportRequestData);
    }

    @Override // defpackage.gv2, defpackage.dd2
    public den v() {
        return this.G;
    }

    @Override // defpackage.gv2
    public void x0(final SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, final SportRequestCallback sportRequestCallback) {
        if (dd2.u() != 7 && dd2.u() != 6) {
            U(6);
        }
        if (H0() == null) {
            FitnessLogUtils.i(this.E, "sender is null , return");
            return;
        }
        EcoDeviceModel ecoDeviceModelCurGymDeviceModel = SportDeviceModel.INSTANCE.curGymDeviceModel();
        FitnessLogUtils.i(this.E, "deviceModelByMac : " + ecoDeviceModelCurGymDeviceModel + ",isConnected : " + ecoDeviceModelCurGymDeviceModel.getIsDeviceConnected() + ",callback : " + sportRequestCallback);
        if (!ecoDeviceModelCurGymDeviceModel.getIsDeviceConnected() && sportRequestCallback != null) {
            sportRequestCallback.call(0, new SportResponseData(1, null, null));
        }
        H0().sendSportRequestToWear(sportRequestData, new SportRequestCallback() { // from class: bne
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback
            public final void call(int i, SportResponseData sportResponseData) {
                this.f4394a.L0(sportRequestData, sportRequestCallback, i, sportResponseData);
            }
        });
    }
}
