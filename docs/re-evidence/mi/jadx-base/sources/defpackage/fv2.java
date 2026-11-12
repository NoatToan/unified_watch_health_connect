package defpackage;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.source.towear.SportConfigProvider;
import com.xiaomi.fitness.sport_manager.state.AutoState;
import com.xiaomi.fitness.sport_manager.state.data.BeanAndWristPostureData;
import com.xiaomi.fitness.sport_manager.state.device.DeviceSportStateRecord;
import com.xiaomi.fitness.sport_manager.utils.BeanSportUtils;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import com.xiaomi.fitness.sport_manager_export.utils.SportStateUtilsKt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class fv2 extends ed2 implements u0d {
    public static final Map<String, fv2> G = new HashMap();
    public final AtomicBoolean A;
    public int B;
    public x7r C;
    public String D;
    public int E;
    public final b F;
    public final Context w;
    public String x;
    public e6o y;
    public final AtomicBoolean z;

    public class a implements DeviceSyncCallback {
        public a() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
        public void onSyncError(String str, int i, String str2) {
            FitnessLogUtils.i(fv2.this.D, "onSyncError");
            ToastUtil.showShortToast(g1j.g);
        }

        @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
        public void onSyncSuccess(String str, int i, Object obj) {
            FitnessLogUtils.i(fv2.this.D, "onSyncSuccess");
            ToastUtil.showShortToast(g1j.f18472k);
        }
    }

    public static class b extends DataHandlerWrapper {
        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(String str, int i, s7r s7rVar) {
            if (i != 8 || s7rVar == null || s7rVar.u().p() == null) {
                return false;
            }
            int i2 = s7rVar.u().p().f;
            jdn.h().g().onReceive(i, s7rVar);
            return false;
        }
    }

    public fv2(WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.z = new AtomicBoolean(false);
        this.A = new AtomicBoolean(false);
        this.B = 2;
        this.D = "BleSportState";
        this.F = new b();
        FitnessLogUtils.i(this.D, "create BleSportState , deviceName :" + wearableDeviceModel.getDeviceInfo().getName() + ",did: " + wearableDeviceModel.getDeviceInfo().getDid() + ", this : " + this);
        this.w = AppUtil.getApp();
        this.x = wearableDeviceModel.getDeviceInfo().getDid();
        this.d = new Handler(Looper.getMainLooper());
        this.y = new e6o(wearableDeviceModel);
    }

    public static /* synthetic */ void x0() {
        f2o.x().i0();
    }

    public final /* synthetic */ void A0(z7r z7rVar) {
        FitnessLogUtils.i(this.D, "standalone : " + z7rVar.h);
        boolean zA = z7rVar.a();
        if (zA) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(z7rVar.d ? 2 : 1);
        }
        if (z7rVar.h) {
            return;
        }
        FitnessLogUtils.i(this.D, "hasOngoingSport:" + zA);
        if (zA) {
            this.B = z7rVar.f;
            if (z7rVar.g) {
                this.q = 0;
            } else {
                this.q = 1;
            }
        }
    }

    public void B0(kr9 kr9Var) {
    }

    public void C0(qr9 qr9Var) {
    }

    public void D0(z7r z7rVar) {
        U(new SportRequestData.a().E(z7rVar.f40997b).C(z7rVar.f40996a).z(z7rVar.c).x(1).w(this.q).o());
        if (z7rVar.d) {
            U(new SportRequestData.a().E(z7rVar.f40997b).C(z7rVar.f40996a).z(z7rVar.c).x(2).w(this.q).o());
        }
        this.h = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        this.i = z7rVar.e;
    }

    public void E0(int i, WearableDeviceModel wearableDeviceModel, int i2, SportRequestCallback sportRequestCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long tZOffsetInMilli = FitnessDateUtils.getTZOffsetInMilli(jCurrentTimeMillis);
        SportRequestData.a aVar = new SportRequestData.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        I0(aVar.B(jCurrentTimeMillis, timeUnit).D(tZOffsetInMilli, timeUnit).z(i).x(i2).o(), wearableDeviceModel, sportRequestCallback);
    }

    public void F0(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        I0(sportRequestData, wearableDeviceModel, sportRequestCallback);
    }

    public final void G0(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        if (sportRequestCallback != null) {
            sportRequestCallback.call(i, sportResponseData);
        }
    }

    public final void H0(final SportRequestData sportRequestData, final SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.D, "sendSportRequestToWear " + sportRequestData);
        this.y.sendSportRequestToWear(sportRequestData, new SportRequestCallback() { // from class: ev2
            @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
            public final void call(int i, SportResponseData sportResponseData) {
                this.f17089a.y0(sportRequestData, sportRequestCallback, i, sportResponseData);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    public void I0(final SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, final SportRequestCallback sportRequestCallback) {
        if (sportRequestData.sportType == 8) {
            this.q = 0;
            this.f = 8;
            q0(sportRequestData.sportState);
            U(sportRequestData);
            return;
        }
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.isLocal(wearableDeviceModel)) {
            H0(sportRequestData, sportRequestCallback);
        } else {
            sportDeviceModel.isSupportLaunchSport(wearableDeviceModel, sportRequestData.sportType, new i7r() { // from class: cv2
                @Override // defpackage.i7r
                public final void a(Boolean bool) {
                    this.f14765a.z0(sportRequestData, sportRequestCallback, bool);
                }
            });
        }
        this.q = 0;
        if (w0(sportRequestData)) {
            return;
        }
        U(sportRequestData);
    }

    public void J0() {
        if (SportDeviceModel.INSTANCE.isAccessoryDevice(this.f16512k.getDid())) {
            return;
        }
        if (this.p == null) {
            r0(this.B);
        }
        FitnessLogUtils.i(this.D, "startSendDataToWear : " + this.p);
        jdn.h().e(this.p.getClass(), this.p);
        f2o.x().h(this.p.getClass(), this.p);
    }

    public final void K0(byte[] bArr) {
        ToastUtil.showShortToast(g1j.h);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurDeviceModel = sportDeviceModel.curDeviceModel();
        if (wearableDeviceModelCurDeviceModel != null) {
            sportDeviceModel.fitnessSyncer().syncData(wearableDeviceModelCurDeviceModel.getDeviceInfo().getDid(), new a());
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
        if (this.C != null) {
            this.C = null;
        }
        this.z.set(false);
        this.A.set(false);
    }

    @Override // defpackage.kzc
    public void a(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.D, "resumeSport : " + i);
        if (ed2.x() == 3 || this.o != null) {
            E0(i, wearableDeviceModel, 3, sportRequestCallback);
        } else {
            U(r(i, 3));
        }
    }

    @Override // defpackage.u0d
    public int b(wsn wsnVar) {
        if (this.z.get()) {
            FitnessLogUtils.i(this.D, "checkWearSportRequest-has pending sport request: " + wsnVar);
            return 1;
        }
        FitnessLogUtils.i(this.D, "checkWearSportRequest: " + wsnVar);
        return n0(wsnVar);
    }

    @Override // defpackage.kzc
    public void c(FinishSportData finishSportData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.D, "finishSportWithData : " + finishSportData.getSportType());
        r(finishSportData.getSportType(), 4).finishSportData = finishSportData;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long tZOffsetInMilli = FitnessDateUtils.getTZOffsetInMilli(jCurrentTimeMillis);
        SportRequestData.a aVar = new SportRequestData.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        I0(aVar.B(jCurrentTimeMillis, timeUnit).D(tZOffsetInMilli, timeUnit).z(finishSportData.getSportType()).x(4).r(finishSportData).o(), wearableDeviceModel, sportRequestCallback);
    }

    @Override // defpackage.ed2
    public void c0(int i) {
        t0().m(i);
    }

    @Override // defpackage.ed2, defpackage.kzc
    public void d(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        super.d(i, wearableDeviceModel, sportRequestCallback);
        FitnessLogUtils.i(this.D, "finishSport : " + i);
        if (f2o.x().L() != 1 && !SportStateUtilsKt.isSupportWristPosture(i)) {
            E0(i, wearableDeviceModel, 4, sportRequestCallback);
            return;
        }
        FinishSportData finishSportData = new FinishSportData();
        finishSportData.setSportType(i);
        c(finishSportData, wearableDeviceModel, sportRequestCallback);
    }

    @Override // defpackage.ed2, defpackage.kzc
    public void e(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        super.e(sportRequestData, wearableDeviceModel, sportRequestCallback);
        if (sportRequestData == null) {
            return;
        }
        FitnessLogUtils.i(this.D, "SportRequestData : " + sportRequestData.toString());
        SportConfigProvider.get().setBestSportData();
        F0(sportRequestData, wearableDeviceModel, 1, sportRequestCallback);
    }

    @Override // defpackage.ed2
    public void e0(SportRequestData sportRequestData, int i) {
        r0(this.B);
        FitnessLogUtils.i(this.D, "startRecorder");
        if (this.p != null) {
            FitnessLogUtils.i(this.D, "startTime:" + sportRequestData.timeStamp + ", sportType : " + sportRequestData.sportType + ", launchType:" + i + ", sportVersion : " + this.B);
            jdn.h().e(this.p.getClass(), this.p);
            f2o.x().h(this.p.getClass(), this.p);
            this.p.f(sportRequestData, i);
        }
    }

    @Override // defpackage.kzc
    public void f(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.D, "pauseSport : " + i);
        if (ed2.x() == 3 || this.o != null) {
            E0(i, wearableDeviceModel, 2, sportRequestCallback);
        } else {
            U(r(i, 2));
        }
    }

    public void g(SportRequestData sportRequestData) {
        FinishSportData finishSportData;
        FitnessLogUtils.i(this.D, "onReceiveWearRequest: " + sportRequestData + ",SportVersion: " + sportRequestData.supportVersions);
        f2o.x().g = false;
        if (sportRequestData.sportState == 1) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(1);
            SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
            sportDeviceModel.addDeviceStatusListener(this);
            this.q = 1;
            Z(4);
            sportDeviceModel.setMotionRecognizer(false);
            SportConfigProvider.get().setBestSportData();
        }
        this.B = sportRequestData.supportVersions;
        sportRequestData.sportLaunchType = this.q;
        sportRequestData.isCommandFromDevice = true;
        if (sportRequestData.sportState == 4 && (finishSportData = sportRequestData.finishSportData) != null) {
            BeanAndWristPostureData.INSTANCE.setDeviceFinishMainExtraData(finishSportData.getExtraData());
        }
        if (v0(sportRequestData.sportType)) {
            V(sportRequestData);
        } else {
            U(sportRequestData);
        }
        J0();
        f2o.x().r().passiveNotifySportState(sportRequestData, this.q);
        if (sportRequestData.sportState == 4) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(4);
            this.d.postDelayed(new Runnable() { // from class: yu2
                @Override // java.lang.Runnable
                public final void run() {
                    fv2.x0();
                }
            }, 300L);
            SportDeviceModel.INSTANCE.setMotionRecognizer(true);
        }
        if (sportRequestData.sportState == 3) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(3);
            f2o.x().j = true;
            AutoState.get().setHandRestartTime(System.currentTimeMillis());
        }
        if (sportRequestData.sportState == 2) {
            DeviceSportStateRecord.INSTANCE.refreshDeviceSportState(2);
            f2o.x().j = false;
            AutoState.get().setHandRestartTime(0L);
        }
    }

    @Override // defpackage.ed2
    public void g0() {
        if (E() && this.q == 0) {
            FitnessLogUtils.i(this.D, "SportState.start syncWearSportStatus return");
        } else {
            FitnessLogUtils.i(this.D, "syncWearSportStatus");
            this.y.d(new bza() { // from class: av2
                @Override // defpackage.bza
                public final void a(z7r z7rVar) {
                    this.f3481a.A0(z7rVar);
                }
            });
        }
    }

    @Override // defpackage.kzc
    public void h(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i(this.D, "restartSport : " + i);
        if (this.s) {
            a(i, wearableDeviceModel, sportRequestCallback);
        }
        if (I(i)) {
            SportRequestData sportRequestDataR = r(i, 1);
            sportRequestDataR.isRestartSport = true;
            sportRequestDataR.accessoryWearMode = f2o.x().L();
            if (wearableDeviceModel != null) {
                sportRequestDataR.isAcessoryDevice = SportDeviceModel.INSTANCE.isAccessoryDevice(wearableDeviceModel.getDid());
            }
            FitnessLogUtils.i(this.D, "restartSport , sportType:" + i + ",wearModel:" + sportRequestDataR.accessoryWearMode);
            H0(sportRequestDataR, sportRequestCallback);
        }
        if (H(i)) {
            q0(3);
        }
    }

    @Override // defpackage.u0d
    public int i(SportRequestData sportRequestData) {
        if (this.z.get()) {
            FitnessLogUtils.i(this.D, "checkWearSportRequest-has pending sport request: " + sportRequestData);
            return 1;
        }
        FitnessLogUtils.i(this.D, "checkWearSportRequest: " + sportRequestData);
        return o0(sportRequestData);
    }

    public final boolean m0() {
        for (String str : G.keySet()) {
            if (G.get(str).E()) {
                FitnessLogUtils.w(this.D, "has ongoing sport, isCurrentSportDevice = " + TextUtils.equals(str, this.x));
                return true;
            }
        }
        return false;
    }

    public final int n0(wsn wsnVar) {
        boolean zSupportGpsSport = FitnessSportTypeUtils.INSTANCE.supportGpsSport(wsnVar.f38321a);
        if (zSupportGpsSport && !SportDeviceModel.INSTANCE.isPermissionGranted("android.permission.ACCESS_FINE_LOCATION")) {
            FitnessLogUtils.w(this.D, "no ACCESS_FINE_LOCATION permission");
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 29 && zSupportGpsSport && !u0(AppUtil.getApp())) {
            FitnessLogUtils.w(this.D, "no ACCESS_BACKGROUND_LOCATION permission");
            return 6;
        }
        if (!f2o.x().W()) {
            return 0;
        }
        FitnessLogUtils.w(this.D, "has ongoing sport, abort this request");
        return 2;
    }

    public final int o0(SportRequestData sportRequestData) {
        if (!FitnessSportTypeUtils.INSTANCE.supportSport(sportRequestData.sportType)) {
            FitnessLogUtils.w(this.D, "not support sport" + sportRequestData);
            return 4;
        }
        if (sportRequestData.sportState != 1 || !f2o.x().W()) {
            return p0(sportRequestData.sportState, sportRequestData.sportType);
        }
        FitnessLogUtils.w(this.D, "has other ongoing sport " + sportRequestData);
        return 2;
    }

    @Override // defpackage.ed2, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(String str) {
        super.onDisconnect(str);
        this.E = 0;
    }

    public final int p0(int i, int i2) {
        if (i == 1) {
            boolean zSupportGpsSport = FitnessSportTypeUtils.INSTANCE.supportGpsSport(i2);
            if (zSupportGpsSport && !e3b.b()) {
                FitnessLogUtils.w(this.D, "no gps permission");
                return 5;
            }
            if (Build.VERSION.SDK_INT >= 29 && zSupportGpsSport && !u0(AppUtil.getApp())) {
                FitnessLogUtils.w(this.D, "no background gps permission -- lack of accuracy");
                return 5;
            }
            if (!m0()) {
                return 0;
            }
            FitnessLogUtils.w(this.D, "has ongoing sport, abort this request");
            return 2;
        }
        if (!E()) {
            FitnessLogUtils.w(this.D, "state not match , no ongoing sport, requestState = " + i);
            return 3;
        }
        if (this.g != i) {
            return 0;
        }
        FitnessLogUtils.w(this.D, "state not match , equal sportState, requestState = " + i);
        return 3;
    }

    @Override // defpackage.ed2
    public void q(boolean z, byte[] bArr) {
        super.q(z, bArr);
        FitnessLogUtils.i(this.D, "BLE afterSportFitnish , validSport : " + z);
        if (!z || bArr == null || bArr.length <= 0) {
            return;
        }
        K0(bArr);
    }

    public void q0(int i) {
        if (i == 1 || i == 3) {
            SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
            sportDeviceModel.getDeviceSyncManager().addDataHandler(8, this.F);
            sportDeviceModel.startHr(null);
        }
        if (i == 2 || i == 4) {
            SportDeviceModel sportDeviceModel2 = SportDeviceModel.INSTANCE;
            sportDeviceModel2.getDeviceSyncManager().removeDataHandler(8, this.F);
            sportDeviceModel2.stopHr(null);
        }
    }

    public final void r0(int i) {
        if (i == 1 || i == 0) {
            this.p = new vv9();
        } else if (i == 2) {
            this.p = new xv9();
        }
    }

    public final int s0(SportResponseData sportResponseData) {
        int i = sportResponseData.selectVersion;
        z7r z7rVar = sportResponseData.wearSportStatus;
        int i2 = z7rVar != null ? z7rVar.f : i;
        FitnessLogUtils.i(this.D, "responseVersion:" + i + ", sportVersion:" + i2);
        return i2;
    }

    public e6o t0() {
        return this.y;
    }

    public boolean u0(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return ((AppOpsManager) context.getSystemService("appops")).unsafeCheckOpNoThrow("android:fine_location", context.getApplicationInfo().uid, context.getPackageName()) == 0;
    }

    @Override // defpackage.ed2
    public boolean v(SportRequestData sportRequestData) {
        boolean z;
        if (ed2.x() == 3) {
            if (jdn.h().i().distance >= 100) {
                FitnessLogUtils.i(this.D, "validSport:true");
                return true;
            }
            FitnessLogUtils.i(this.D, "validSport:false");
            return false;
        }
        byte[] bArr = sportRequestData.ids;
        if (bArr == null || bArr.length == 0) {
            z = jdn.h().i().distance >= 100;
            FitnessLogUtils.i(this.D, "dataIds == null || dataIds.length == 0 , validSport : " + z);
        } else {
            z = bArr.length % 7 == 0;
            FitnessLogUtils.i(this.D, "dataIds != null && dataIds.length ==" + bArr.length + ", validSport :" + z);
        }
        FitnessLogUtils.i(this.D, "finish sport, validSport = " + z);
        return z;
    }

    public boolean v0(int i) {
        return f2o.x().L() == 1 && SportStateUtilsKt.isSupportWristPosture(i) && f2o.x().r().isBeanConnect();
    }

    public boolean w0(SportRequestData sportRequestData) {
        int i;
        return f2o.x().L() == 1 || (i = sportRequestData.sportType) == 810 || i == 812 || SportStateUtilsKt.isSupportWristPosture(i);
    }

    @Override // defpackage.ed2
    public cen y() {
        return this.p;
    }

    public final /* synthetic */ void y0(SportRequestData sportRequestData, SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        FitnessLogUtils.i(this.D, "sendSportRequestToWear response: " + sportResponseData);
        if (sportRequestData.isRestartSport) {
            if (sportResponseData.isRequestSuccess()) {
                Z(3);
            } else {
                Z(2);
            }
            FitnessLogUtils.i(this.D, "this sport is restartSport");
            return;
        }
        G0(sportRequestCallback, i, sportResponseData);
        this.z.set(false);
        sportRequestData.code = sportResponseData.responseCode;
        if (sportResponseData.isRequestSuccess()) {
            this.B = s0(sportResponseData);
            sportRequestData.ids = sportResponseData.ids;
            if (sportRequestData.finishSportData != null && (BeanSportUtils.INSTANCE.isBeanSport() || SportStateUtilsKt.isSupportWristPosture(sportRequestData.sportType))) {
                sportRequestData.finishSportData.setExtraData(sportResponseData.extraData);
                if (this.f16512k.getDid().equals(SportDeviceModel.INSTANCE.curDeviceDid())) {
                    FitnessLogUtils.i(this.D, "did:" + this.x + "main_extraData:" + sportResponseData.extraData.toString());
                    BeanAndWristPostureData.INSTANCE.setAppFinishMainExtraData(sportResponseData.extraData);
                } else {
                    FitnessLogUtils.i(this.D, "did:" + this.x + "accessory_extraData:" + sportResponseData.extraData.toString());
                    BeanAndWristPostureData.INSTANCE.setAppFinishAccessoryExtraData(sportResponseData.extraData);
                }
            }
            this.q = 0;
            int i2 = sportRequestData.sportType;
            if (i2 == 8) {
                U(sportRequestData);
            } else if (v0(i2) && sportRequestData.sportState == 4) {
                V(sportRequestData);
                J0();
            } else if (w0(sportRequestData)) {
                U(sportRequestData);
                J0();
            } else {
                J0();
            }
            if (sportRequestData.accessoryWearMode == 2) {
                Z(2);
            } else {
                Z(3);
            }
        } else {
            Z(2);
            U(sportRequestData);
        }
        this.q = 0;
        sportRequestData.sportLaunchType = 0;
    }

    public final /* synthetic */ void z0(SportRequestData sportRequestData, SportRequestCallback sportRequestCallback, Boolean bool) {
        FitnessLogUtils.i(this.D, "ble device , start sport , isSupportLaunchSport : " + bool);
        if (bool.booleanValue()) {
            H0(sportRequestData, sportRequestCallback);
        } else {
            U(sportRequestData);
        }
    }
}
