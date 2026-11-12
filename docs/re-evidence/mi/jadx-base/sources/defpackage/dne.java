package defpackage;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import android.util.Pair;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.device.data.BleSender;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import com.xiaomi.wearable.fitness.launch.device.gym.SportGymSender;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class dne extends fv2 {
    public String H;
    public WearableDeviceModel I;
    public cen J;
    public BleSender K;
    public AtomicBoolean L;
    public ptc M;
    public Pair<Boolean, Integer> N;

    public class a implements DeviceSyncCallback {
        public a() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
        public void onSyncError(String str, int i, String str2) {
            FitnessLogUtils.i(dne.this.H, "sync local device sport : error");
            try {
                jxc jxcVarJ = jdn.h().j();
                FitnessLogUtils.i(dne.this.H, "IRemoteSportSyncDataListener:" + jxcVarJ);
                if (jxcVarJ != null) {
                    jdn.h().j().onSync(false, dne.this.N == null, 0);
                    dne.this.N = null;
                }
            } catch (RemoteException e) {
                FitnessLogUtils.e(dne.this.H, "IRemoteSportSyncDataListener,e:" + e.toString());
                e.printStackTrace();
            }
        }

        @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
        public void onSyncSuccess(String str, int i, Object obj) {
            FitnessLogUtils.i(dne.this.H, "sync local device sport : success");
            try {
                jxc jxcVarJ = jdn.h().j();
                FitnessLogUtils.i(dne.this.H, "IRemoteSportSyncDataListener:" + jxcVarJ);
                if (jxcVarJ != null) {
                    jxc jxcVarJ2 = jdn.h().j();
                    int iIntValue = 0;
                    boolean z = dne.this.N == null;
                    if (dne.this.N != null) {
                        iIntValue = ((Integer) dne.this.N.second).intValue();
                    }
                    jxcVarJ2.onSync(true, z, iIntValue);
                    dne.this.N = null;
                }
            } catch (RemoteException e) {
                FitnessLogUtils.e(dne.this.H, "IRemoteSportSyncDataListener,e:" + e.toString());
                e.printStackTrace();
            }
        }
    }

    public dne(WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.H = "LocalSportState";
        this.L = new AtomicBoolean(false);
        this.I = wearableDeviceModel;
        this.J = new kab();
    }

    @Override // defpackage.fv2
    public void I0(final SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, final SportRequestCallback sportRequestCallback) {
        if (ed2.x() != 7 && ed2.x() != 6) {
            Z(6);
        }
        if (Q0() == null) {
            FitnessLogUtils.i(this.H, "sender is null , return");
            return;
        }
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = SportDeviceModel.INSTANCE.curGymDeviceModel();
        FitnessLogUtils.i(this.H, "deviceModelByMac : " + wearableDeviceModelCurGymDeviceModel + ",isConnected : " + wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected() + ",callback : " + sportRequestCallback);
        if (!wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected() && sportRequestCallback != null) {
            sportRequestCallback.call(0, new SportResponseData(1, null, null));
        }
        Q0().sendSportRequestToWear(sportRequestData, new SportRequestCallback() { // from class: ane
            @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
            public final void call(int i, SportResponseData sportResponseData) {
                this.f3281a.T0(sportRequestData, sportRequestCallback, i, sportResponseData);
            }
        });
    }

    public final BleSender Q0() {
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = SportDeviceModel.INSTANCE.curGymDeviceModel();
        WearableDeviceModel wearableDeviceModel = this.I;
        if (wearableDeviceModel == null) {
            return null;
        }
        if (wearableDeviceModel != wearableDeviceModelCurGymDeviceModel || this.K == null) {
            this.K = new SportGymSender(wearableDeviceModelCurGymDeviceModel);
            this.I = wearableDeviceModelCurGymDeviceModel;
        }
        if (!this.I.getDeviceInfo().getMac().equals(wearableDeviceModelCurGymDeviceModel.getDeviceInfo().getMac())) {
            this.K = new SportGymSender(wearableDeviceModelCurGymDeviceModel);
        }
        return this.K;
    }

    public SportGymSender R0() {
        return (SportGymSender) Q0();
    }

    @Override // defpackage.ed2
    public void S(SportRequestData sportRequestData, int i) {
        f2o.x().Q().remove(k0o.class);
        jdn.h().e(kab.class, this.J);
        boolean z = sportRequestData.isNotSport;
        Iterator<ISportStateChangedListener> it = f2o.x().Q().values().iterator();
        while (it.hasNext()) {
            it.next().onSportStarted(sportRequestData.code, sportRequestData.timeStamp, sportRequestData.timeZone, sportRequestData.sportType, i);
        }
    }

    public final boolean S0() {
        return (f2o.x().z() == 4 || f2o.x().z() == 0) ? false : true;
    }

    public final /* synthetic */ void T0(SportRequestData sportRequestData, SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        FitnessLogUtils.i(this.H, "GYM sendSportRequestToWear ,requestData :" + sportRequestData + " , responseCode : " + sportResponseData.responseCode);
        if (sportResponseData.isRequestSuccess()) {
            sportRequestData.timeStamp = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            U(sportRequestData);
            if (i == 4) {
                f2o.x().F(f2o.x().I()).a0(null);
            }
        }
        sportResponseData.isNotSport = sportRequestData.isNotSport;
        if (sportRequestCallback != null) {
            sportRequestCallback.call(i, sportResponseData);
        }
    }

    public final /* synthetic */ void U0(z7r z7rVar) {
        FitnessLogUtils.i(this.H, "standalone : " + z7rVar.h);
        boolean zA = z7rVar.a();
        FitnessLogUtils.i(this.H, "hasOngoingSport:" + zA + " , timeStamp : " + z7rVar.f40996a);
        if (zA) {
            D0(z7rVar);
        }
        this.L.set(false);
    }

    public void V0(gs9[] gs9VarArr) throws RemoteException {
        for (gs9 gs9Var : gs9VarArr) {
            FitnessLogUtils.i(this.H, "gymSetting.key:" + gs9Var.c + ", gymSetting.value :" + gs9Var.d);
            int i = gs9Var.c;
            if ((i == 1 || i == 2) && gs9Var.d == 1 && S0()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long tZOffsetInMilli = FitnessDateUtils.getTZOffsetInMilli(jCurrentTimeMillis);
                SportRequestData.a aVar = new SportRequestData.a();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                U(aVar.B(jCurrentTimeMillis, timeUnit).D(tZOffsetInMilli, timeUnit).z(3).x(4).o());
            }
        }
        FitnessLogUtils.i(this.H, "iLocalReceiveListener : " + this.M);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.curGymDeviceModel() == null || this.M == null) {
            return;
        }
        sportDeviceModel.hasLock(sportDeviceModel.curGymDeviceModel(), gs9VarArr, this.M);
    }

    public final void W0(int i) {
        if (i == 1) {
            f2o.x().h(com.xiaomi.fitness.sport_manager.remind.a.v().getClass(), com.xiaomi.fitness.sport_manager.remind.a.v());
            jdn.h().e(com.xiaomi.fitness.sport_manager.remind.a.v().getClass(), com.xiaomi.fitness.sport_manager.remind.a.v());
        }
    }

    public void X0(int i) {
        this.g = i;
        Y();
    }

    public void Y0(int i, SportRequestCallback sportRequestCallback) {
        if (Q0() != null) {
            Q0().setGymPace(i, sportRequestCallback);
        }
    }

    public void Z0(float f, SportRequestCallback sportRequestCallback) {
        if (Q0() != null) {
            Q0().setGymSpeed(f, sportRequestCallback);
        }
    }

    @Override // defpackage.fv2, defpackage.kzc
    public void a(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        if (B() != 3) {
            E0(i, null, 3, sportRequestCallback);
        }
    }

    public void a1(ptc ptcVar) {
        this.M = ptcVar;
    }

    public void b1(WearableDeviceModel wearableDeviceModel) {
        FitnessLogUtils.d(this.H, "localSportState1 : " + this);
        if (this.L.get()) {
            return;
        }
        this.L.set(true);
        new e6o(wearableDeviceModel).d(new bza() { // from class: yme
            @Override // defpackage.bza
            public final void a(z7r z7rVar) {
                this.f40324a.U0(z7rVar);
            }
        });
    }

    @Override // defpackage.fv2, defpackage.ed2, defpackage.kzc
    public void d(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.H, "sportType : " + i);
        if (B() != 4) {
            E0(i, null, 4, sportRequestCallback);
        }
    }

    @Override // defpackage.fv2, defpackage.ed2, defpackage.kzc
    public void e(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        if (!SportDeviceModel.INSTANCE.isLocal(wearableDeviceModel)) {
            FitnessLogUtils.i(this.H, "DeviceModel is not LocalSportDeviceModel");
            sportRequestCallback.call(sportRequestData.sportState, null);
        } else {
            FitnessLogUtils.i(this.H, "startSport");
            this.I = wearableDeviceModel;
            I0(sportRequestData, wearableDeviceModel, sportRequestCallback);
        }
    }

    @Override // defpackage.fv2, defpackage.kzc
    public void f(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        if (B() != 2) {
            E0(i, null, 2, sportRequestCallback);
        }
    }

    @Override // defpackage.fv2, defpackage.u0d
    @SuppressLint({"WrongConstant"})
    public void g(SportRequestData sportRequestData) {
        FitnessLogUtils.i(this.H, "receive gym request , sportRequestData : " + sportRequestData);
        W0(sportRequestData.sportState);
        U(sportRequestData);
        if (sportRequestData.sportState == 1) {
            if (this.J == null) {
                this.J = new kab();
            }
            Z(7);
            this.N = new Pair<>(Boolean.TRUE, Integer.valueOf(sportRequestData.timeStamp));
            f2o.x().o(SportDeviceModel.INSTANCE.curGymDeviceModel());
            if (f2o.x().I() != null && f2o.x().I().getIsDeviceConnected()) {
                f2o.x().F(f2o.x().I()).o = f2o.x().B().d;
            }
        }
        if (f2o.x().I() == null || !f2o.x().I().getIsDeviceConnected()) {
            return;
        }
        int i = sportRequestData.sportState;
        if (i == 1) {
            f2o.x().x0(f2o.x().I(), sportRequestData, null);
            return;
        }
        if (i == 2) {
            f2o.x().h0(f2o.x().I(), 3, null);
        } else if (i == 3) {
            f2o.x().m0(f2o.x().I(), 3, null);
        } else {
            if (i != 4) {
                return;
            }
            f2o.x().p(f2o.x().I(), 3, null);
        }
    }

    @Override // defpackage.fv2, defpackage.ed2
    @SuppressLint({"WrongConstant"})
    public void q(boolean z, byte[] bArr) {
        super.q(z, bArr);
        FitnessLogUtils.i(this.H, "afterSportFinish , validSport: " + z);
        Z(0);
        if (z) {
            WearableDeviceModel wearableDeviceModel = this.I;
            if (wearableDeviceModel == null) {
                FitnessLogUtils.i(this.H, "afterSportFinish , deviceModel == null");
                return;
            }
            SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
            if (!sportDeviceModel.isLocal(wearableDeviceModel)) {
                FitnessLogUtils.i(this.H, "deviceModel is not local");
                return;
            }
            WearableDeviceModel wearableDeviceModelCurGymDeviceModel = sportDeviceModel.curGymDeviceModel();
            FitnessLogUtils.i(this.H, "deviceModle is local device , did : " + this.I.getDeviceInfo().getDid() + " , cur deviceModel : " + wearableDeviceModelCurGymDeviceModel.getDid() + ",dataIds:" + bArr);
            sportDeviceModel.fitnessSyncer().syncData(this.I.getDeviceInfo().getDid(), new a());
            return;
        }
        FitnessLogUtils.i(this.H, "validSport : " + z);
        try {
            jxc jxcVarJ = jdn.h().j();
            FitnessLogUtils.i(this.H, "IRemoteSportSyncDataListener:" + jxcVarJ);
            if (jxcVarJ != null) {
                jxcVarJ.onSync(false, this.N == null, 0);
            }
            this.N = null;
        } catch (RemoteException e) {
            FitnessLogUtils.e(this.H, "IRemoteSportSyncDataListener,e:" + e.toString());
            e.printStackTrace();
        }
    }

    @Override // defpackage.fv2, defpackage.ed2
    public cen y() {
        return this.J;
    }
}
