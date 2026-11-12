package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.source.towear.SportConfigProvider;
import com.xiaomi.fitness.sport_eco_manager.state.AutoState;
import com.xiaomi.fitness.sport_eco_manager.state.device.DeviceSportStateRecord;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class gv2 extends dd2 implements v0d {
    public static final Map<String, gv2> D = new HashMap();
    public String A;
    public int B;
    public final b C;
    public final Context t;
    public String u;
    public f6o v;
    public final AtomicBoolean w;
    public final AtomicBoolean x;
    public int y;
    public y7r z;

    public class a implements EcoDeviceSyncCallback {
        public a() {
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
        public void onSyncError(String str, int i, String str2) {
            FitnessLogUtils.i(gv2.this.A, "onSyncError");
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
        public void onSyncSuccess(String str, int i, Object obj) {
            FitnessLogUtils.i(gv2.this.A, "onSyncSuccess");
            ToastUtil.showShortToast(f1j.e);
        }
    }

    public static class b extends EcoDataHandlerWrapper {
        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper, com.xiaomi.fitness.eco.device.contact.export.EcoDataHandler
        public boolean handleEcoPacket(String str, int i, u7r u7rVar) {
            if (i != 8 || u7rVar == null || u7rVar.r().o() == null) {
                return false;
            }
            int i2 = u7rVar.r().o().f;
            kdn.f().e().g(i, u7rVar);
            return false;
        }
    }

    public gv2(EcoDeviceModel ecoDeviceModel) {
        super(ecoDeviceModel);
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.y = 2;
        this.A = "BleSportState";
        this.C = new b();
        FitnessLogUtils.i(this.A, "create BleSportState , deviceName :" + ecoDeviceModel.getDeviceInfo().getName() + ",did: " + ecoDeviceModel.getDeviceInfo().getDid() + ", this : " + this);
        this.t = AppUtil.getApp();
        this.u = ecoDeviceModel.getDeviceInfo().getDid();
        this.d = new Handler(Looper.getMainLooper());
        this.v = new f6o(ecoDeviceModel);
    }

    private boolean g0() {
        for (String str : D.keySet()) {
            if (D.get(str).B()) {
                FitnessLogUtils.w(this.A, "has ongoing sport, isCurrentSportDevice = " + TextUtils.equals(str, this.u));
                return true;
            }
        }
        return false;
    }

    private int i0(int i, int i2) {
        if (i == 1) {
            if (!g0()) {
                return 0;
            }
            FitnessLogUtils.w(this.A, "has ongoing sport, abort this request");
            return 2;
        }
        if (!B()) {
            FitnessLogUtils.w(this.A, "state not match , no ongoing sport, requestState = " + i);
            return 3;
        }
        int i3 = this.g;
        if (i3 == i) {
            FitnessLogUtils.w(this.A, "state not match , equal sportState, requestState = " + i);
            return 3;
        }
        if (i3 != 1 || i != 3) {
            return 0;
        }
        FitnessLogUtils.w(this.A, "state not match , sport has start, requestState = " + i);
        return 3;
    }

    private void j0(int i) {
        if (i == 1 || i == 3) {
            SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
            sportDeviceModel.getDeviceSyncManager().addDataHandler(8, this.C);
            sportDeviceModel.startHr(null);
        }
        if (i == 2 || i == 4) {
            SportDeviceModel sportDeviceModel2 = SportDeviceModel.INSTANCE;
            sportDeviceModel2.getDeviceSyncManager().removeDataHandler(8, this.C);
            sportDeviceModel2.stopHr(null);
        }
    }

    private void k0(int i) {
        if (i == 1 || i == 0) {
            this.o = new wv9();
        } else if (i == 2) {
            this.o = new yv9();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n0() {
        g2o.s().V();
    }

    private void z0(byte[] bArr) {
        ToastUtil.showShortToast(f1j.f17293b);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        EcoDeviceModel ecoDeviceModelCurDeviceModel = sportDeviceModel.curDeviceModel();
        if (ecoDeviceModelCurDeviceModel != null) {
            sportDeviceModel.fitnessSyncer().syncData(ecoDeviceModelCurDeviceModel.getDeviceInfo().getDid(), new a());
        }
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
        if (this.z != null) {
            this.z = null;
        }
        this.w.set(false);
        this.x.set(false);
    }

    @Override // defpackage.dd2
    public void Y(int i, int i2, int i3) {
        k0(this.y);
        FitnessLogUtils.i(this.A, "startRecorder");
        if (this.o != null) {
            FitnessLogUtils.i(this.A, "startTime:" + i + ", sportType : " + i2 + ", launchType:" + i3 + ", sportVersion : " + this.y);
            kdn.f().d(this.o.getClass(), this.o);
            g2o.s().e(this.o.getClass(), this.o);
            this.o.f(i, i2, i3);
        }
    }

    @Override // defpackage.dd2
    public void a0() {
        if (B() && this.p == 0) {
            FitnessLogUtils.i(this.A, "SportState.start syncWearSportStatus return");
        } else {
            FitnessLogUtils.i(this.A, "syncWearSportStatus");
            this.v.d(new cza() { // from class: xu2
                @Override // defpackage.cza
                public final void a(a8r a8rVar) {
                    this.f39468a.q0(a8rVar);
                }
            });
        }
    }

    @Override // defpackage.lzc
    public void b(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.A, "pauseSport : " + i);
        if (dd2.u() == 3 || this.n != null) {
            t0(i, ecoDeviceModel, 2, sportRequestCallback);
        } else {
            R(q(i, 2));
        }
    }

    @Override // defpackage.lzc
    public void c(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.A, "restartSport : " + i);
        if (D(i)) {
            w0(q(i, 1), sportRequestCallback);
        }
    }

    @Override // defpackage.v0d
    public int d(SportRequestData sportRequestData) {
        if (this.w.get()) {
            FitnessLogUtils.i(this.A, "checkWearSportRequest-has pending sport request: " + sportRequestData);
            return 1;
        }
        FitnessLogUtils.i(this.A, "checkWearSportRequest: " + sportRequestData);
        return h0(sportRequestData);
    }

    @Override // defpackage.lzc
    public void e(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.A, "resumeSport : " + i);
        if (dd2.u() == 3 || this.n != null) {
            t0(i, ecoDeviceModel, 3, sportRequestCallback);
        } else {
            R(q(i, 3));
        }
    }

    public void f(SportRequestData sportRequestData) {
        FitnessLogUtils.i(this.A, "onReceiveWearRequest: " + sportRequestData + ",SportVersion: " + sportRequestData.supportVersions);
        g2o.s().h = false;
        if (sportRequestData.sportState == 1) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(1);
            SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
            sportDeviceModel.addDeviceStatusListener(this);
            this.p = 1;
            U(4);
            sportDeviceModel.setMotionRecognizer(false);
            SportConfigProvider.get().setBestSportData();
        }
        this.y = sportRequestData.supportVersions;
        sportRequestData.sportLaunchType = this.p;
        sportRequestData.ids = sportRequestData.ids;
        R(sportRequestData);
        y0();
        if (sportRequestData.sportState == 4) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(4);
            this.d.postDelayed(new Runnable() { // from class: bv2
                @Override // java.lang.Runnable
                public final void run() {
                    gv2.n0();
                }
            }, 300L);
            SportDeviceModel.INSTANCE.setMotionRecognizer(true);
        }
        if (sportRequestData.sportState == 3) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(3);
            g2o.s().m = true;
            AutoState.get().setHandRestartTime(System.currentTimeMillis());
        }
        if (sportRequestData.sportState == 2) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(2);
            g2o.s().m = false;
            AutoState.get().setHandRestartTime(0L);
        }
    }

    @Override // defpackage.dd2, defpackage.lzc
    public void g(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        super.g(sportRequestData, ecoDeviceModel, sportRequestCallback);
        if (sportRequestData == null) {
            return;
        }
        FitnessLogUtils.i(this.A, "startSport : " + sportRequestData.sportType);
        SportConfigProvider.get().setBestSportData();
        u0(sportRequestData, ecoDeviceModel, 1, sportRequestCallback);
    }

    @Override // defpackage.dd2, defpackage.lzc
    public void h(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        super.h(i, ecoDeviceModel, sportRequestCallback);
        FitnessLogUtils.i(this.A, "finishSport : " + i);
        t0(i, ecoDeviceModel, 4, sportRequestCallback);
        R(q(i, 4));
    }

    public final int h0(SportRequestData sportRequestData) {
        if (!FitnessSportTypeUtils.INSTANCE.supportSport(sportRequestData.sportType)) {
            FitnessLogUtils.w(this.A, "not support sport" + sportRequestData);
            return 4;
        }
        if (sportRequestData.sportState != 1 || !g2o.s().O()) {
            return i0(sportRequestData.sportState, sportRequestData.sportType);
        }
        FitnessLogUtils.w(this.A, "has other ongoing sport " + sportRequestData);
        return 2;
    }

    public final int l0(SportResponseData sportResponseData) {
        int i = sportResponseData.selectVersion;
        a8r a8rVar = sportResponseData.wearSportStatus;
        int i2 = a8rVar != null ? a8rVar.f : i;
        FitnessLogUtils.i(this.A, "responseVersion:" + i + ", sportVersion:" + i2);
        return i2;
    }

    public f6o m0() {
        return this.v;
    }

    public final /* synthetic */ void o0(SportRequestCallback sportRequestCallback, SportRequestData sportRequestData, int i, SportResponseData sportResponseData) {
        FitnessLogUtils.i(this.A, "sendSportRequestToWear response: " + sportResponseData);
        v0(sportRequestCallback, i, sportResponseData);
        this.w.set(false);
        if (sportResponseData.isRequestSuccess()) {
            U(3);
            this.y = l0(sportResponseData);
            sportRequestData.ids = sportResponseData.ids;
            U(3);
            if (sportRequestData.sportType == 8) {
                this.p = 0;
                R(sportRequestData);
            } else {
                y0();
            }
        } else {
            U(2);
        }
        this.p = 0;
        sportRequestData.sportLaunchType = 0;
    }

    @Override // defpackage.dd2, com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(String str, String str2) {
        super.onDisconnect(str, str2);
        this.B = 0;
    }

    @Override // defpackage.dd2
    public void p(boolean z, byte[] bArr) {
        super.p(z, bArr);
        FitnessLogUtils.i(this.A, "BLE afterSportFitnish , validSport : " + z);
        if (!z || bArr == null || bArr.length <= 0) {
            return;
        }
        z0(bArr);
    }

    public final /* synthetic */ void p0(SportRequestData sportRequestData, SportRequestCallback sportRequestCallback, Boolean bool) {
        FitnessLogUtils.i(this.A, "ble device , start sport , isSupportLaunchSport : " + bool);
        if (bool.booleanValue()) {
            w0(sportRequestData, sportRequestCallback);
        }
    }

    public final /* synthetic */ void q0(a8r a8rVar) {
        FitnessLogUtils.i(this.A, "standalone : " + a8rVar.h);
        boolean zA = a8rVar.a();
        if (zA) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(a8rVar.d ? 2 : 1);
        }
        if (a8rVar.h) {
            return;
        }
        FitnessLogUtils.i(this.A, "hasOngoingSport:" + zA);
        if (zA) {
            this.y = a8rVar.f;
            if (a8rVar.g) {
                this.p = 0;
            } else {
                this.p = 1;
            }
            s0(a8rVar);
        }
    }

    public void r0(@NotNull a8r a8rVar) {
        if (B()) {
            R(new SportRequestData.a().x(a8rVar.f780b).v(a8rVar.f779a).s(a8rVar.c).p(4).o(this.p).j());
        }
    }

    public void s0(a8r a8rVar) {
        R(new SportRequestData.a().x(a8rVar.f780b).v(a8rVar.f779a).s(a8rVar.c).p(1).o(this.p).j());
        if (a8rVar.d) {
            R(new SportRequestData.a().x(a8rVar.f780b).v(a8rVar.f779a).s(a8rVar.c).p(2).o(this.p).j());
        }
        this.h = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        dd2.f15381r = a8rVar.e;
    }

    @Override // defpackage.dd2
    public boolean t(SportRequestData sportRequestData) {
        boolean z;
        byte[] bArr = sportRequestData.ids;
        if (bArr == null || bArr.length == 0) {
            z = kdn.f().g().distance >= 100;
            FitnessLogUtils.i(this.A, "dataIds == null || dataIds.length == 0 , validSport : " + z);
        } else {
            z = bArr.length % 7 == 0;
            FitnessLogUtils.i(this.A, "dataIds != null && dataIds.length ==" + bArr.length + ", validSport :" + z);
        }
        FitnessLogUtils.i(this.A, "finish sport, validSport = " + z);
        return z;
    }

    public void t0(int i, EcoDeviceModel ecoDeviceModel, int i2, SportRequestCallback sportRequestCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long tZOffsetInMilli = FitnessDateUtils.getTZOffsetInMilli(jCurrentTimeMillis);
        SportRequestData.a aVar = new SportRequestData.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x0(aVar.u(jCurrentTimeMillis, timeUnit).w(tZOffsetInMilli, timeUnit).s(i).p(i2).j(), ecoDeviceModel, sportRequestCallback);
    }

    public void u0(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        x0(sportRequestData, ecoDeviceModel, sportRequestCallback);
    }

    @Override // defpackage.dd2
    public den v() {
        return this.o;
    }

    public final void v0(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        if (sportRequestCallback != null) {
            sportRequestCallback.call(i, sportResponseData);
        }
    }

    public final void w0(final SportRequestData sportRequestData, final SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.A, "sendSportRequestToWear " + sportRequestData);
        this.v.sendSportRequestToWear(sportRequestData, new SportRequestCallback() { // from class: dv2
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback
            public final void call(int i, SportResponseData sportResponseData) {
                this.f15953a.o0(sportRequestCallback, sportRequestData, i, sportResponseData);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    public void x0(final SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, final SportRequestCallback sportRequestCallback) {
        if (sportRequestData.sportType == 8) {
            this.p = 0;
            this.f = 8;
            j0(sportRequestData.sportState);
            R(sportRequestData);
            return;
        }
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.isLocal(ecoDeviceModel)) {
            w0(sportRequestData, sportRequestCallback);
        } else {
            sportDeviceModel.isSupportLaunchSport(ecoDeviceModel, sportRequestData.sportType, new j7r() { // from class: zu2
                @Override // defpackage.j7r
                public final void a(Boolean bool) {
                    this.f41681a.p0(sportRequestData, sportRequestCallback, bool);
                }
            });
        }
        this.p = 0;
        R(sportRequestData);
    }

    public void y0() {
        if (this.o == null) {
            k0(this.y);
        }
        FitnessLogUtils.i(this.A, "startSendDataToWear : " + this.o);
        kdn.f().d(this.o.getClass(), this.o);
        g2o.s().e(this.o.getClass(), this.o);
    }
}
