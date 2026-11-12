package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.remind.a;
import com.xiaomi.fitness.sport_eco_manager.service.SportKeepAliveClient;
import com.xiaomi.fitness.sport_eco_manager.state.AutoState;
import com.xiaomi.fitness.sport_eco_manager.state.device.DeviceSportStateRecord;
import com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportCourse;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class g2o implements gzc {
    public static g2o q;
    public dd2 d;
    public SportData e;
    public pne j;
    public SportCourse n;
    public boolean p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18512a = "SportStateCenter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap<String, dd2> f18513b = new ArrayMap<>();
    public final ArrayMap<Class<?>, ISportStateChangedListener> c = new ArrayMap<>();
    public Handler f = new Handler(Looper.getMainLooper());
    public int g = 0;
    public boolean h = false;
    public String i = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18514k = 0;
    public int l = 2000;
    public boolean m = true;
    public String o = "xiaomiwear_app";

    public g2o() {
        e(SportKeepAliveClient.class, SportKeepAliveClient.get());
    }

    public static g2o s() {
        if (q == null) {
            synchronized (g2o.class) {
                try {
                    if (q == null) {
                        q = new g2o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return q;
    }

    public dd2 A(EcoDeviceModel ecoDeviceModel) {
        dd2 dd2Var = this.d;
        if (dd2Var != null) {
            return dd2Var;
        }
        if (ecoDeviceModel != null) {
            SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
            if (sportDeviceModel.isDeviceConnected(ecoDeviceModel)) {
                dd2 dd2Var2 = this.f18513b.get(ecoDeviceModel.getDeviceInfo().getDid());
                if (dd2Var2 != null) {
                    return dd2Var2;
                }
                if (sportDeviceModel.isHuami(ecoDeviceModel)) {
                    smc smcVar = new smc(ecoDeviceModel);
                    this.f18513b.put(ecoDeviceModel.getDeviceInfo().getDid(), smcVar);
                    return smcVar;
                }
                if (sportDeviceModel.isBle(ecoDeviceModel)) {
                    gv2 gv2Var = new gv2(ecoDeviceModel);
                    this.f18513b.put(ecoDeviceModel.getDeviceInfo().getDid(), gv2Var);
                    return gv2Var;
                }
                buh buhVar = new buh(null);
                this.f18513b.put(ecoDeviceModel.getDeviceInfo().getDid(), buhVar);
                return buhVar;
            }
        }
        dd2 dd2Var3 = this.f18513b.get("xiaomiwear_app");
        if (dd2Var3 != null) {
            return dd2Var3;
        }
        buh buhVar2 = new buh(null);
        this.f18513b.put("xiaomiwear_app", buhVar2);
        return buhVar2;
    }

    public SportCourse B() {
        return this.n;
    }

    public den C() {
        return A(D()).v();
    }

    public EcoDeviceModel D() {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        EcoDeviceModel ecoDeviceModelCurDeviceModel = sportDeviceModel.curDeviceModel();
        if (ecoDeviceModelCurDeviceModel == null || !sportDeviceModel.isDeviceConnected(ecoDeviceModelCurDeviceModel) || com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel.INSTANCE.isNotSupportLinkForWear()) {
            return null;
        }
        return ecoDeviceModelCurDeviceModel;
    }

    public long E() {
        return A(D()).w();
    }

    public int F() {
        return A(D()).x();
    }

    public SportData G() {
        return odn.e().f();
    }

    public int H() {
        if (q() != null) {
            return ((q().y() == 0 || q().y() == 4) ? A(D()) : q()).y();
        }
        return A(D()).y();
    }

    public ArrayMap<Class<?>, ISportStateChangedListener> I() {
        return this.c;
    }

    public int J() {
        return A(D()).y() != 0 ? A(D()).y() : DeviceSportStateRecord.INSTANCE.getDeviceSportState();
    }

    public long K() {
        return A(D()).z();
    }

    public int L() {
        if (q() != null) {
            return ((q().y() == 0 || q().y() == 4) ? A(D()) : q()).A();
        }
        return A(D()).A();
    }

    public f6o M(EcoDeviceModel ecoDeviceModel) {
        gv2 gv2VarO;
        if (SportDeviceModel.INSTANCE.isBle(ecoDeviceModel) && (gv2VarO = o(ecoDeviceModel)) != null) {
            return gv2VarO.m0();
        }
        return null;
    }

    public int N() {
        return A(D()).y();
    }

    public boolean O() {
        FitnessLogUtils.i("SportStateCenter", "hasOngoingSport , deviceModel : " + D() + ",SportState : " + A(D()));
        if (D() != null) {
            FitnessLogUtils.i("SportStateCenter", "deviceConnected :" + D().getIsDeviceConnected() + ", model :" + D());
        }
        if (D() != null) {
            D().getIsDeviceConnected();
        }
        return A(D()).B();
    }

    public boolean P() {
        return this.d instanceof buh;
    }

    public final /* synthetic */ void Q() {
        this.g = -1;
        this.e = null;
        FitnessLogUtils.i("SportStateCenter", "remove the recover sport data");
        SportManagerPreference sportManagerPreference = SportManagerPreference.INSTANCE;
        sportManagerPreference.setKEY_RECOVER_SPORT_REPORT("");
        sportManagerPreference.setKEY_RECOVER_SPORT_RECORD_CACHE("");
        sportManagerPreference.setKEY_RECOVER_SPORT_RECORD_TEMP_CACHE("");
        sportManagerPreference.setKEY_RECOVER_SPORT_PAUSE_COUNT(0);
    }

    public final /* synthetic */ void R() {
        this.j = null;
    }

    public void S(EcoDeviceModel ecoDeviceModel) {
        if (ecoDeviceModel != null) {
            FitnessLogUtils.i("SportStateCenter", "onDestroy , remove this devicemodel , did : " + ecoDeviceModel.getDeviceInfo().getDid() + ",sportState : " + this.f18513b.get(ecoDeviceModel.getDeviceInfo().getDid()));
            this.d = null;
            this.f18513b.remove(ecoDeviceModel.getDeviceInfo().getDid());
        }
    }

    public void T() {
        this.d = null;
    }

    public void U(EcoDeviceModel ecoDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        this.m = false;
        AutoState.get().setHandRestartTime(0L);
        FitnessLogUtils.i("SportStateCenter", "pauseSport , SportType:" + i);
        if (SportDeviceModel.INSTANCE.isLocal(ecoDeviceModel)) {
            if (this.j == null) {
                h(ecoDeviceModel);
            }
            this.j.b(i, ecoDeviceModel, sportRequestCallback);
        } else {
            if (this.d == null) {
                this.d = A(ecoDeviceModel);
            }
            this.d.b(i, ecoDeviceModel, sportRequestCallback);
        }
    }

    public void V() {
        this.f.postDelayed(new Runnable() { // from class: d2o
            @Override // java.lang.Runnable
            public final void run() {
                this.f15011a.Q();
            }
        }, 1000L);
    }

    public void W(Class<?> cls, ISportStateChangedListener iSportStateChangedListener) {
        if (iSportStateChangedListener != null) {
            this.c.remove(cls);
            FitnessLogUtils.i("SportStateCenter", "removeSportStateChangedListener : " + iSportStateChangedListener + ",mSportStateChangedListenerArrayMap size :" + this.c.size());
        }
    }

    public void X(EcoDeviceModel ecoDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i("SportStateCenter", "restartSport , SportType:" + i);
        if (this.d == null) {
            this.d = A(ecoDeviceModel);
        }
        if (System.currentTimeMillis() - this.f18514k > this.l) {
            FitnessLogUtils.i("SportStateCenter", "curSportState : " + this.d);
            this.d.c(i, ecoDeviceModel, sportRequestCallback);
            this.f18514k = System.currentTimeMillis();
        }
    }

    public void Y(EcoDeviceModel ecoDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        this.m = true;
        AutoState.get().setHandRestartTime(System.currentTimeMillis());
        FitnessLogUtils.i("SportStateCenter", "resumeSport , SportType:" + i);
        if (SportDeviceModel.INSTANCE.isLocal(ecoDeviceModel)) {
            if (this.j == null) {
                h(ecoDeviceModel);
            }
            this.j.e(i, ecoDeviceModel, sportRequestCallback);
        } else {
            if (this.d == null) {
                this.d = A(ecoDeviceModel);
            }
            this.d.e(i, ecoDeviceModel, sportRequestCallback);
        }
    }

    public void Z(boolean z) {
        this.p = z;
        AutoState.get().switchAutoPause(z, L());
    }

    public void a0(psc pscVar) {
        if (q() != null) {
            q().T0(pscVar);
        }
    }

    public void b0(int i) {
        ene eneVarV = v(SportDeviceModel.INSTANCE.curGymDeviceModel());
        if (eneVarV != null) {
            eneVarV.U(i);
        }
    }

    public void c() {
        if (A(D()) != null) {
            A(D()).o();
        }
        if (q() != null) {
            q().S0(4);
        }
        V();
        AutoState.get().finishAutoPause();
        SportDeviceModel.INSTANCE.setMotionRecognizer(true);
    }

    public void c0(int i, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i("SportStateCenter", "setGymFtpPercentRpm=========02" + q());
        if (q() != null) {
            q().U0(i, sportRequestCallback);
        }
    }

    public void d(EcoDeviceModel ecoDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        this.h = true;
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i("SportStateCenter", "accidentFinishSport , SportType:" + i + "isAccidentStop :" + this.h);
        k0(ecoDeviceModel, i, sportRequestCallback);
        this.g = 0;
    }

    public void d0(boolean z, SportRequestCallback sportRequestCallback) {
        FitnessLogUtils.i("SportStateCenter", "setGymFtpTest=========02" + q());
        if (q() != null) {
            q().V0(z, sportRequestCallback);
        }
    }

    public void e(Class<?> cls, ISportStateChangedListener iSportStateChangedListener) {
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

    public void e0(int i, SportRequestCallback sportRequestCallback) {
        if (q() != null) {
            q().W0(i, sportRequestCallback);
        }
    }

    public void f(EcoDeviceModel ecoDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        U(ecoDeviceModel, i, sportRequestCallback);
        AutoState.get().setHandRestartTime(0L);
        this.m = true;
    }

    public void f0(float f, SportRequestCallback sportRequestCallback) {
        if (q() != null) {
            q().X0(f, sportRequestCallback);
        }
    }

    public void g(EcoDeviceModel ecoDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        Y(ecoDeviceModel, i, sportRequestCallback);
        AutoState.get().setHandRestartTime(0L);
        this.m = true;
    }

    public void g0(bsc bscVar) {
        if (q() != null) {
            q().Y0(bscVar);
        }
    }

    public final void h(EcoDeviceModel ecoDeviceModel) {
        this.j = new pne(v(ecoDeviceModel));
    }

    public void h0(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
        h(ecoDeviceModel);
        this.j.g(sportRequestData, ecoDeviceModel, sportRequestCallback);
    }

    public boolean i() {
        return A(D()).r() || (q() != null && q().r());
    }

    public void i0(EcoDeviceModel ecoDeviceModel, SportRequestData sportRequestData, azc azcVar, SportRequestCallback sportRequestCallback) {
        A(D()).V(azcVar);
        j0(ecoDeviceModel, sportRequestData, sportRequestCallback);
    }

    public boolean j() {
        if (q() == null) {
            return false;
        }
        return q().s();
    }

    public void j0(EcoDeviceModel ecoDeviceModel, SportRequestData sportRequestData, SportRequestCallback sportRequestCallback) {
        k();
        if (sportRequestData.sportCourse != null) {
            FitnessLogUtils.i("SportStateCenter", "sportCourse cal: " + sportRequestData.sportCourse.getCloudCourseReferenceCal());
            this.n = sportRequestData.sportCourse;
        }
        FitnessLogUtils.i("SportStateCenter", "startSport , SportType:" + sportRequestData.sportType + ",deviceModel: " + ecoDeviceModel);
        SportData sportDataZ = z();
        if (sportDataZ != null && sportDataZ.appLaunchType == 2) {
            dd2 dd2Var = this.f18513b.get("xiaomiwear_app");
            this.d = dd2Var;
            if (dd2Var == null) {
                buh buhVar = new buh(null);
                this.d = buhVar;
                this.f18513b.put("xiaomiwear_app", buhVar);
            }
            a.n().F(sportDataZ);
        }
        if (ecoDeviceModel == null) {
            this.o = "xiaomiwear_app";
        } else {
            this.o = ecoDeviceModel.getDid();
        }
        dd2 dd2VarA = A(ecoDeviceModel);
        this.d = dd2VarA;
        dd2VarA.g(sportRequestData, ecoDeviceModel, sportRequestCallback);
        SportDeviceModel.INSTANCE.setMotionRecognizer(false);
    }

    public final void k() {
        AutoState.get().setHandRestartTime(0L);
        this.m = true;
    }

    public final void k0(EcoDeviceModel ecoDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        if (!SportDeviceModel.INSTANCE.isLocal(ecoDeviceModel)) {
            if (this.d == null) {
                this.d = A(ecoDeviceModel);
            }
            this.d.h(i, ecoDeviceModel, sportRequestCallback);
        } else if (this.j != null) {
            FitnessLogUtils.d("SportStateCenter", "local sport stop");
            this.j.h(i, ecoDeviceModel, sportRequestCallback);
        }
        this.f.postDelayed(new Runnable() { // from class: b2o
            @Override // java.lang.Runnable
            public final void run() {
                this.f3720a.R();
            }
        }, 1000L);
    }

    public void l(EcoDeviceModel ecoDeviceModel) {
        h(ecoDeviceModel);
    }

    public void l0() {
        ene eneVarV = v(p(t()));
        if (eneVarV != null) {
            FitnessLogUtils.i("LocalSportState", "localSportState : " + eneVarV);
            eneVarV.Z0(p(t()));
        }
    }

    public void m(EcoDeviceModel ecoDeviceModel, int i, SportRequestCallback sportRequestCallback) {
        this.m = true;
        FitnessLogUtils.i("SportStateCenter", "finishSport , SportType:" + i);
        this.h = false;
        k0(ecoDeviceModel, i, sportRequestCallback);
        V();
        SportDeviceModel.INSTANCE.setMotionRecognizer(true);
    }

    public void m0() {
        SportData sportDataZ = z();
        FitnessLogUtils.i("SportStateCenter", "syncRecoverSport:" + sportDataZ);
        if (sportDataZ == null) {
            return;
        }
        boolean z = sportDataZ.distance >= 100;
        int i = sportDataZ.sportType;
        if (i == 3) {
            new e1l(AppUtil.getApp(), s().y(), sportDataZ.startTime, sportDataZ.timezone, sportDataZ.sportType, true).syncRecoverSport(z, sportDataZ);
        } else if (i == 6) {
            new aj2(AppUtil.getApp(), s().y(), sportDataZ.startTime, sportDataZ.timezone, sportDataZ.sportType, true).syncRecoverSport(z, sportDataZ);
        } else if (i == 7) {
            new ytk(AppUtil.getApp(), s().y(), sportDataZ.startTime, sportDataZ.timezone, sportDataZ.sportType, true).syncRecoverSport(z, sportDataZ);
        }
        V();
    }

    public int n() {
        return dd2.u();
    }

    public void n0() {
        A(D()).a0();
    }

    public gv2 o(EcoDeviceModel ecoDeviceModel) {
        if (!SportDeviceModel.INSTANCE.isBle(ecoDeviceModel)) {
            return null;
        }
        gv2 gv2Var = (gv2) this.f18513b.get(ecoDeviceModel.getDeviceInfo().getDid());
        if (gv2Var != null) {
            return gv2Var;
        }
        gv2 gv2Var2 = new gv2(ecoDeviceModel);
        this.f18513b.put(ecoDeviceModel.getDeviceInfo().getDid(), gv2Var2);
        return gv2Var2;
    }

    public void o0(SportRequestData sportRequestData) {
        ene eneVarV = v(SportDeviceModel.INSTANCE.curGymDeviceModel());
        if (eneVarV != null) {
            eneVarV.b0(sportRequestData);
            a.n().onSportStarted(sportRequestData.timeStamp, sportRequestData.timeZone, sportRequestData.sportType, sportRequestData.sportLaunchType);
        }
    }

    public EcoDeviceModel p(String str) {
        if (!llo.c(str)) {
            t();
        }
        EcoDeviceModel ecoDeviceModelCurGymDeviceModel = SportDeviceModel.INSTANCE.curGymDeviceModel();
        if (ecoDeviceModelCurGymDeviceModel == null || !ecoDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            return null;
        }
        return ecoDeviceModelCurGymDeviceModel;
    }

    public ene q() {
        EcoDeviceModel ecoDeviceModelCurGymDeviceModel = SportDeviceModel.INSTANCE.curGymDeviceModel();
        if (ecoDeviceModelCurGymDeviceModel == null || !ecoDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            return null;
        }
        return v(ecoDeviceModelCurGymDeviceModel);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public int r() {
        byte b2;
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        int iHashCode = key_gym_local_sport_type.hashCode();
        if (iHashCode != -1798122615) {
            if (iHashCode != -1454035281) {
                if (iHashCode == 1396900280 && key_gym_local_sport_type.equals("ksmb.treadmill.m1v1")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (key_gym_local_sport_type.equals("runmi.exbike.jscrm1")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
        } else if (key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        return (b2 == 0 || b2 == 1) ? 7 : 3;
    }

    public String t() {
        return this.i;
    }

    public int u() {
        ene eneVarV = v(SportDeviceModel.INSTANCE.curGymDeviceModel());
        if (eneVarV != null) {
            return eneVarV.y();
        }
        return 0;
    }

    @NotNull
    public ene v(EcoDeviceModel ecoDeviceModel) {
        if (!SportDeviceModel.INSTANCE.isLocal(ecoDeviceModel)) {
            return null;
        }
        ene eneVar = this.f18513b.get(ecoDeviceModel.getDeviceInfo().getDid()) instanceof ene ? (ene) this.f18513b.get(ecoDeviceModel.getDeviceInfo().getDid()) : null;
        if (eneVar != null) {
            return eneVar;
        }
        ene eneVar2 = new ene(ecoDeviceModel);
        this.f18513b.put(ecoDeviceModel.getDeviceInfo().getDid(), eneVar2);
        return eneVar2;
    }

    public pne w() {
        return this.j;
    }

    public int x() {
        return 100;
    }

    public String y() {
        return "xiaomiwear_app";
    }

    public SportData z() {
        int i = this.g;
        if (i == 1) {
            return this.e;
        }
        if (i == 0) {
            String key_recover_sport_report = SportManagerPreference.INSTANCE.getKEY_RECOVER_SPORT_REPORT();
            if (llo.c(key_recover_sport_report)) {
                this.g = 1;
                this.e = (SportData) h4b.d(key_recover_sport_report, SportData.class);
                FitnessLogUtils.i("SportStateCenter", "recover sport sportData : " + this.e.toString());
                return this.e;
            }
            FitnessLogUtils.i("SportStateCenter", "NO_RECOVER_SPORT");
            this.g = -1;
        }
        return null;
    }
}
