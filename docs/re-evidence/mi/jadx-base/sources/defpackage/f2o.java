package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.ArrayMap;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.StringUtil;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.remind.a;
import com.xiaomi.fitness.sport_manager.service.SportKeepAliveClient;
import com.xiaomi.fitness.sport_manager.state.AccessoriesState;
import com.xiaomi.fitness.sport_manager.state.AutoState;
import com.xiaomi.fitness.sport_manager.state.RouteMatchManager;
import com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState;
import com.xiaomi.fitness.sport_manager.state.device.DeviceSportStateRecord;
import com.xiaomi.fitness.sport_manager.utils.BeanSportUtils;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportCourse;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.ISportReportDataListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class f2o implements fzc {
    public static f2o s;
    public SportData d;
    public qne i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SportCourse f17341k;
    public ISportReportDataListener m;
    public IAccessoriesState n;
    public int o;
    public SportRequestData p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ipc f17342r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17339a = "SportStateCenter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap<String, ed2> f17340b = new ArrayMap<>();
    public final ArrayMap<Class<?>, ISportStateChangedListener> c = new ArrayMap<>();
    public Handler e = new Handler(Looper.getMainLooper());
    public int f = 0;
    public boolean g = false;
    public String h = "";
    public boolean j = true;
    public String l = "xiaomiwear_app";

    public f2o() {
        h(SportKeepAliveClient.class, SportKeepAliveClient.get());
        this.n = new AccessoriesState();
    }

    public static f2o x() {
        if (s == null) {
            synchronized (f2o.class) {
                try {
                    if (s == null) {
                        s = new f2o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return s;
    }

    @NotNull
    public dne A(WearableDeviceModel wearableDeviceModel) {
        if (!SportDeviceModel.INSTANCE.isLocal(wearableDeviceModel)) {
            return null;
        }
        dne dneVar = this.f17340b.get(wearableDeviceModel.getDeviceInfo().getDid()) instanceof dne ? (dne) this.f17340b.get(wearableDeviceModel.getDeviceInfo().getDid()) : null;
        if (dneVar != null) {
            return dneVar;
        }
        dne dneVar2 = new dne(wearableDeviceModel);
        this.f17340b.put(wearableDeviceModel.getDeviceInfo().getDid(), dneVar2);
        return dneVar2;
    }

    public void A0() {
        dne dneVarA = A(v(y()));
        if (dneVarA != null) {
            FitnessLogUtils.i("LocalSportState", "localSportState : " + dneVarA);
            dneVarA.b1(v(y()));
        }
    }

    public qne B() {
        return this.i;
    }

    @SuppressLint({"WrongConstant"})
    public void B0() {
        SportData sportDataE = E();
        if (sportDataE == null) {
            return;
        }
        int i = 0;
        boolean z = sportDataE.distance >= 100;
        SportRequestData sportRequestDataO = new SportRequestData.a().C(sportDataE.startTime).E(sportDataE.timezone).z(sportDataE.sportType).H(sportDataE.wearMode).o();
        String strD = x().D();
        int i2 = sportDataE.sportType;
        if (i2 == 1 || i2 == 2) {
            new f1l(AppUtil.getApp(), strD, sportRequestDataO, Boolean.TRUE).syncRecoverSport(z, sportDataE);
            i = 22;
        } else if (i2 == 3) {
            new d1l(AppUtil.getApp(), strD, sportRequestDataO, Boolean.TRUE).syncRecoverSport(z, sportDataE);
            i = 3;
        } else if (i2 == 6) {
            new zi2(AppUtil.getApp(), strD, sportRequestDataO, Boolean.TRUE).syncRecoverSport(z, sportDataE);
            i = 23;
        }
        new eon(AppUtil.getApp(), strD, true, 2).u(sportDataE.startTime, sportDataE.timezone, i);
    }

    public int C() {
        return 100;
    }

    public void C0() {
        F(I()).g0();
    }

    public String D() {
        return "xiaomiwear_app";
    }

    public SportData E() {
        int i = this.f;
        if (i == 1) {
            return this.d;
        }
        if (i == 0) {
            String key_recover_sport_report = SportManagerPreference.INSTANCE.getKEY_RECOVER_SPORT_REPORT();
            if (StringUtil.isNotBlank(key_recover_sport_report)) {
                this.f = 1;
                this.d = (SportData) h4b.d(key_recover_sport_report, SportData.class);
                FitnessLogUtils.i("SportStateCenter", "recover sport sportData : " + this.d.toString());
                return this.d;
            }
            FitnessLogUtils.i("SportStateCenter", "NO_RECOVER_SPORT");
            this.f = -1;
        }
        return null;
    }

    public synchronized ed2 F(WearableDeviceModel wearableDeviceModel) {
        ed2 fv2Var;
        try {
            ed2 ed2Var = this.f17340b.get(this.l);
            if (ed2Var != null) {
                return ed2Var;
            }
            if (wearableDeviceModel != null) {
                SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
                if (sportDeviceModel.isDeviceConnected(wearableDeviceModel)) {
                    if (sportDeviceModel.isHuami(wearableDeviceModel)) {
                        fv2Var = new rmc(wearableDeviceModel);
                        this.f17340b.put(wearableDeviceModel.getDeviceInfo().getDid(), fv2Var);
                    } else {
                        fv2Var = new fv2(wearableDeviceModel);
                        this.f17340b.put(wearableDeviceModel.getDeviceInfo().getDid(), fv2Var);
                    }
                    return fv2Var;
                }
            }
            ed2 auhVar = this.f17340b.get("xiaomiwear_app");
            if (auhVar == null) {
                auhVar = new auh(null);
                this.f17340b.put("xiaomiwear_app", auhVar);
                FitnessLogUtils.i("SportStateCenter", "currentSportState:phone");
            }
            return auhVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public SportCourse G() {
        return this.f17341k;
    }

    public cen H() {
        return F(I()).y();
    }

    public WearableDeviceModel I() {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurDeviceModel = sportDeviceModel.curDeviceModel();
        if (wearableDeviceModelCurDeviceModel == null || !sportDeviceModel.isDeviceConnected(wearableDeviceModelCurDeviceModel)) {
            return null;
        }
        return wearableDeviceModelCurDeviceModel;
    }

    public long J() {
        return F(I()).z();
    }

    public int K() {
        FitnessLogUtils.d("sendDataToWear", "State:" + F(I()) + ",mode:" + I());
        return F(I()).A();
    }

    public int L() {
        return this.o;
    }

    public SportData M() {
        return ndn.i().j();
    }

    public ISportReportDataListener N() {
        return this.m;
    }

    public SportRequestData O() {
        return this.p;
    }

    public int P() {
        if (w() != null) {
            return ((w().B() == 0 || w().B() == 4) ? F(I()) : w()).B();
        }
        return F(I()).B();
    }

    public ArrayMap<Class<?>, ISportStateChangedListener> Q() {
        return this.c;
    }

    public int R() {
        return F(I()).B() != 0 ? F(I()).B() : DeviceSportStateRecord.INSTANCE.getDeviceSportState();
    }

    public long S() {
        return F(I()).C();
    }

    public int T() {
        if (w() != null) {
            return ((w().B() == 0 || w().B() == 4) ? F(I()) : w()).D();
        }
        return F(I()).D();
    }

    public e6o U(WearableDeviceModel wearableDeviceModel) {
        fv2 fv2VarU;
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if ((sportDeviceModel.isBle(wearableDeviceModel) || sportDeviceModel.isWearOS(wearableDeviceModel)) && (fv2VarU = u(wearableDeviceModel)) != null) {
            return fv2VarU.t0();
        }
        return null;
    }

    public int V() {
        return F(I()).B();
    }

    public boolean W() {
        return ed2.v;
    }

    public void X(WearableDeviceModel wearableDeviceModel) {
        if (wearableDeviceModel == null) {
            this.l = "xiaomiwear_app";
        } else {
            this.l = wearableDeviceModel.getDid();
        }
    }

    public boolean Y() {
        return F(I()) instanceof auh;
    }

    public boolean Z(String str) {
        return false;
    }

    public final /* synthetic */ void a0() {
        this.f = -1;
        this.d = null;
        FitnessLogUtils.i("SportStateCenter", "remove the recover sport data");
        SportManagerPreference sportManagerPreference = SportManagerPreference.INSTANCE;
        sportManagerPreference.setKEY_RECOVER_SPORT_REPORT("");
        sportManagerPreference.setKEY_RECOVER_SPORT_RECORD_CACHE("");
        sportManagerPreference.setKEY_RECOVER_SPORT_RECORD_TEMP_CACHE("");
        sportManagerPreference.setKEY_RECOVER_SPORT_GPS("");
        sportManagerPreference.setKEY_RECOVER_SPORT_PAUSE_COUNT(0);
    }

    public final /* synthetic */ void b0() {
        this.i = null;
    }

    public final /* synthetic */ void c0() {
        this.i = null;
    }

    public void d() {
        if (F(I()) != null) {
            F(I()).o();
        }
        if (w() != null) {
            w().X0(4);
        }
        i0();
        AutoState.get().finishAutoPause();
        SportDeviceModel.INSTANCE.setMotionRecognizer(true);
    }

    public void d0() {
        FitnessLogUtils.i("SportStateCenter", "IBgLocationPermissionListener : " + this.f17342r);
        FitnessPreference.INSTANCE.setDEVICE_LAUNCH_GPS_SPORT(true);
        try {
            ipc ipcVar = this.f17342r;
            if (ipcVar != null) {
                ipcVar.onApplyLocationPermission();
            }
        } catch (RemoteException e) {
            FitnessLogUtils.i("SportStateCenter", "IBgLocationPermissionListener , e:" + e);
            e.printStackTrace();
        }
    }

    public void e() {
        if (F(I()) == null || !W()) {
            return;
        }
        F(I()).p();
    }

    public void e0(WearableDeviceModel wearableDeviceModel) {
        if (wearableDeviceModel != null) {
            FitnessLogUtils.i("SportStateCenter", "onDestroy , remove this devicemodel , did : " + wearableDeviceModel.getDeviceInfo().getDid() + ",sportState : " + this.f17340b.get(wearableDeviceModel.getDeviceInfo().getDid()));
            this.f17340b.remove(wearableDeviceModel.getDeviceInfo().getDid());
        }
    }

    public void f(WearableDeviceModel wearableDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        this.g = true;
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i("SportStateCenter", "accidentFinishSport , SportType:" + i + "isAccidentStop :" + this.g);
        y0(wearableDeviceModel, i, sportRequestCallback);
        this.f = 0;
    }

    public void f0(int i, int i2) {
        Iterator<ISportStateChangedListener> it = this.c.values().iterator();
        while (it.hasNext()) {
            it.next().onSportSegment(i, i2);
        }
    }

    public void g(ipc ipcVar) {
        this.f17342r = ipcVar;
    }

    public void g0() {
        this.o = 0;
    }

    public void h(Class<?> cls, ISportStateChangedListener iSportStateChangedListener) {
        Iterator<ISportStateChangedListener> it = this.c.values().iterator();
        while (it.hasNext()) {
            if (iSportStateChangedListener == it.next()) {
                return;
            }
        }
        if (iSportStateChangedListener != null) {
            this.c.put(cls, iSportStateChangedListener);
            FitnessLogUtils.i("SportStateCenter", "addSportStateChangedListener : " + iSportStateChangedListener + ",mSportStateChangedListenerArrayMap size : " + this.c.size());
        }
    }

    public void h0(WearableDeviceModel wearableDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        this.j = false;
        AutoState.get().setHandRestartTime(0L);
        FitnessLogUtils.i("SportStateCenter", "pauseSport , SportType:" + i);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.isLocal(wearableDeviceModel)) {
            if (this.i == null) {
                k(wearableDeviceModel);
            }
            this.i.f(i, wearableDeviceModel, sportRequestCallback);
        } else {
            F(wearableDeviceModel).f(i, wearableDeviceModel, sportRequestCallback);
            IAccessoriesState iAccessoriesState = this.n;
            if (sportDeviceModel.curDeviceModel() == null) {
                sportRequestCallback = null;
            }
            iAccessoriesState.pauseAccessoriesSport(i, sportRequestCallback);
        }
    }

    public void i(WearableDeviceModel wearableDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        h0(wearableDeviceModel, i, sportRequestCallback);
        AutoState.get().setHandRestartTime(0L);
        this.j = true;
    }

    public void i0() {
        this.e.postDelayed(new Runnable() { // from class: a2o
            @Override // java.lang.Runnable
            public final void run() {
                this.f554a.a0();
            }
        }, 1000L);
    }

    public void j(WearableDeviceModel wearableDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        m0(wearableDeviceModel, i, sportRequestCallback);
        AutoState.get().setHandRestartTime(0L);
        this.j = true;
    }

    public void j0(Class<?> cls, ISportStateChangedListener iSportStateChangedListener) {
        if (iSportStateChangedListener != null) {
            this.c.remove(cls);
            FitnessLogUtils.i("SportStateCenter", "removeSportStateChangedListener : " + iSportStateChangedListener + ",mSportStateChangedListenerArrayMap size :" + this.c.size());
        }
    }

    public final void k(WearableDeviceModel wearableDeviceModel) {
        this.i = new qne(A(wearableDeviceModel));
    }

    public void k0() {
        F(I()).X();
    }

    public boolean l() {
        return F(I()).u() || (w() != null && w().u());
    }

    public void l0(WearableDeviceModel wearableDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i("SportStateCenter", "restartSport , SportType:" + i);
        String did = wearableDeviceModel.getDid();
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (did.equals(sportDeviceModel.curDeviceDid())) {
            F(wearableDeviceModel).h(i, wearableDeviceModel, sportRequestCallback);
            return;
        }
        IAccessoriesState iAccessoriesState = this.n;
        String did2 = wearableDeviceModel.getDid();
        if (sportDeviceModel.curDeviceModel() == null) {
            sportRequestCallback = null;
        }
        iAccessoriesState.restartAccessoriesSport(did2, i, sportRequestCallback);
    }

    public final void m() {
        AutoState.get().setHandRestartTime(0L);
        this.j = true;
    }

    public void m0(WearableDeviceModel wearableDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        this.j = true;
        AutoState.get().setHandRestartTime(System.currentTimeMillis());
        FitnessLogUtils.i("SportStateCenter", "resumeSport , SportType:" + i);
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.isLocal(wearableDeviceModel)) {
            if (this.i == null) {
                k(wearableDeviceModel);
            }
            this.i.a(i, wearableDeviceModel, sportRequestCallback);
        } else {
            F(wearableDeviceModel).a(i, wearableDeviceModel, sportRequestCallback);
            IAccessoriesState iAccessoriesState = this.n;
            if (sportDeviceModel.curDeviceModel() == null) {
                sportRequestCallback = null;
            }
            iAccessoriesState.resumeAccessoriesSport(i, sportRequestCallback);
        }
    }

    public final void n(SportRequestData sportRequestData) {
        if (sportRequestData.routeList != null) {
            RouteMatchManager routeMatchManager = RouteMatchManager.INSTANCE;
            routeMatchManager.startRouteMatch();
            routeMatchManager.routeMatchLoadStandardRoute(sportRequestData.routeList);
        }
    }

    public void n0(boolean z) {
        this.q = z;
        AutoState.get().switchAutoPause(z, T());
    }

    public void o(WearableDeviceModel wearableDeviceModel) {
        k(wearableDeviceModel);
    }

    public void o0(int i) {
        dne dneVarA = A(SportDeviceModel.INSTANCE.curGymDeviceModel());
        if (dneVarA != null) {
            dneVarA.Z(i);
        }
    }

    public void p(WearableDeviceModel wearableDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        this.j = true;
        FitnessLogUtils.i("SportStateCenter", "finishSport , SportType:" + i);
        this.g = false;
        y0(wearableDeviceModel, i, sportRequestCallback);
        i0();
        SportDeviceModel.INSTANCE.setMotionRecognizer(true);
    }

    public void p0(int i, SportRequestCallback sportRequestCallback) {
        if (w() != null) {
            w().Y0(i, sportRequestCallback);
        }
    }

    public void q(WearableDeviceModel wearableDeviceModel, FinishSportData finishSportData, SportRequestCallback sportRequestCallback) {
        this.j = true;
        FitnessLogUtils.i("SportStateCenter", "finishSport , SportType:" + finishSportData.getSportType() + "-finishData:" + finishSportData);
        this.g = false;
        z0(wearableDeviceModel, finishSportData, sportRequestCallback);
        i0();
        SportDeviceModel.INSTANCE.setMotionRecognizer(true);
    }

    public void q0(float f, SportRequestCallback sportRequestCallback) {
        if (w() != null) {
            w().Z0(f, sportRequestCallback);
        }
    }

    public IAccessoriesState r() {
        return this.n;
    }

    public void r0(ptc ptcVar) {
        if (w() != null) {
            w().a1(ptcVar);
        }
    }

    public int s() {
        return this.o == 1 ? 1 : 0;
    }

    public void s0(int i) {
        this.o = i;
    }

    public int t() {
        return ed2.x();
    }

    public void t0(ISportReportDataListener iSportReportDataListener) {
        this.m = iSportReportDataListener;
    }

    public fv2 u(WearableDeviceModel wearableDeviceModel) {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (!sportDeviceModel.isBle(wearableDeviceModel) && !sportDeviceModel.isWearOS(wearableDeviceModel)) {
            return null;
        }
        fv2 fv2Var = (fv2) this.f17340b.get(wearableDeviceModel.getDeviceInfo().getDid());
        if (fv2Var != null) {
            return fv2Var;
        }
        fv2 fv2Var2 = new fv2(wearableDeviceModel);
        this.f17340b.put(wearableDeviceModel.getDeviceInfo().getDid(), fv2Var2);
        return fv2Var2;
    }

    public void u0(int i) {
        F(I()).c0(i);
    }

    public WearableDeviceModel v(String str) {
        if (!StringUtil.isNotBlank(str)) {
            y();
        }
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = SportDeviceModel.INSTANCE.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || !wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            return null;
        }
        return wearableDeviceModelCurGymDeviceModel;
    }

    public void v0(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
        k(wearableDeviceModel);
        this.i.e(sportRequestData, wearableDeviceModel, sportRequestCallback);
    }

    public dne w() {
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = SportDeviceModel.INSTANCE.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || !wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            return null;
        }
        return A(wearableDeviceModelCurGymDeviceModel);
    }

    public void w0(WearableDeviceModel wearableDeviceModel, SportRequestData sportRequestData, zyc zycVar, SportRequestCallback sportRequestCallback) {
        Logger.d("SportStateCenter", "==========proxyInstance:" + zycVar + ",command: " + F(I()) + ",deviceModel:" + wearableDeviceModel + ",model:" + I());
        F(I()).a0(zycVar);
        x0(wearableDeviceModel, sportRequestData, sportRequestCallback);
    }

    public void x0(WearableDeviceModel wearableDeviceModel, SportRequestData sportRequestData, SportRequestCallback sportRequestCallback) {
        this.p = sportRequestData;
        m();
        n(sportRequestData);
        if (sportRequestData.sportCourse != null) {
            FitnessLogUtils.i("SportStateCenter", "sportCourse cal: " + sportRequestData.sportCourse.getCloudCourseReferenceCal());
            this.f17341k = sportRequestData.sportCourse;
        }
        FitnessLogUtils.i("SportStateCenter", "startSport , SportType:" + sportRequestData.sportType + ",deviceModel: " + wearableDeviceModel);
        SportData sportDataE = E();
        if (sportDataE != null && sportDataE.appLaunchType == 2) {
            a.v().L(sportDataE);
        }
        X(wearableDeviceModel);
        this.o = sportRequestData.accessoryWearMode;
        F(wearableDeviceModel).e(sportRequestData, wearableDeviceModel, sportRequestCallback);
        IAccessoriesState iAccessoriesState = this.n;
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.curDeviceModel() == null) {
            sportRequestCallback = null;
        }
        iAccessoriesState.startAccessoriesSport(sportRequestData, sportRequestCallback);
        BeanSportUtils.INSTANCE.configBeanSport();
        sportDeviceModel.setMotionRecognizer(false);
    }

    public String y() {
        return this.h;
    }

    public final void y0(WearableDeviceModel wearableDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (!sportDeviceModel.isLocal(wearableDeviceModel)) {
            F(wearableDeviceModel).d(i, wearableDeviceModel, sportRequestCallback);
            IAccessoriesState iAccessoriesState = this.n;
            if (sportDeviceModel.curDeviceModel() == null) {
                sportRequestCallback = null;
            }
            iAccessoriesState.finishAccessoriesSport(i, sportRequestCallback);
        } else if (this.i != null) {
            FitnessLogUtils.d("SportStateCenter", "local sport stop");
            this.i.d(i, wearableDeviceModel, sportRequestCallback);
        }
        this.e.postDelayed(new Runnable() { // from class: c2o
            @Override // java.lang.Runnable
            public final void run() {
                this.f4867a.b0();
            }
        }, 1000L);
    }

    public int z() {
        dne dneVarA = A(SportDeviceModel.INSTANCE.curGymDeviceModel());
        if (dneVarA != null) {
            return dneVarA.B();
        }
        return 0;
    }

    public final void z0(WearableDeviceModel wearableDeviceModel, FinishSportData finishSportData, SportRequestCallback sportRequestCallback) {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (!sportDeviceModel.isLocal(wearableDeviceModel)) {
            F(wearableDeviceModel).c(finishSportData, wearableDeviceModel, sportRequestCallback);
            IAccessoriesState iAccessoriesState = this.n;
            int sportType = finishSportData.getSportType();
            if (sportDeviceModel.curDeviceModel() == null) {
                sportRequestCallback = null;
            }
            iAccessoriesState.finishAccessoriesSport(sportType, sportRequestCallback);
        } else if (this.i != null) {
            FitnessLogUtils.d("SportStateCenter", "local sport stop");
            this.i.d(finishSportData.getSportType(), wearableDeviceModel, sportRequestCallback);
        }
        this.e.postDelayed(new Runnable() { // from class: e2o
            @Override // java.lang.Runnable
            public final void run() {
                this.f16199a.c0();
            }
        }, 1000L);
    }
}
