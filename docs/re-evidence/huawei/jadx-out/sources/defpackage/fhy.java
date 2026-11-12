package defpackage;

import android.os.Bundle;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f34070a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34072c;
    private IBaseResponseCallback d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private long m;
    private int n;
    private int o;
    private ISportDataCallback p;
    private IBaseResponseCallback q;
    private IBaseResponseCallback r;
    private int s;
    private int t;

    static class b {
        private static final fhy d = new fhy();
    }

    private fhy() {
        this.i = 0;
        this.f34071b = 0;
        this.f34072c = false;
        this.g = false;
        this.h = false;
        this.f = false;
        this.l = false;
        this.j = 0;
        this.s = 0;
        this.k = 0;
        this.p = new ISportDataCallback() { // from class: fhy.3
            @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
            public void onSummary(MotionPathSimplify motionPathSimplify) {
            }

            @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
            public void getSportInfo(Bundle bundle) {
                synchronized (fhy.f34070a) {
                    LogUtil.d("HWhealthLinkage_", "Bundle sportInfo = " + bundle);
                    if (bundle == null) {
                        LogUtil.a("HealthTrackInteractor", "sportDataCallback getSportInfo sportInfo is null");
                        xjt.v("sportInfo is null");
                        return;
                    }
                    try {
                        fhy fhyVar = fhy.this;
                        fhyVar.e = fhyVar.c(bundle.getInt("origintarget"));
                        fhy.this.n = bundle.getInt(BleConstants.SPORT_TYPE);
                        fhy.this.t = bundle.getInt("trackType");
                        int i = bundle.getInt("sportState");
                        if (i != 6) {
                            fhy.this.o = i;
                            fhy.this.k = bundle.getInt("runningCourseVersion");
                            if (fhy.this.f34071b == fhy.this.o) {
                                fhy.this.e(bundle);
                                fib.d().sendDataToDevice(bundle);
                                return;
                            }
                            LogUtil.a("HWhealthLinkage_", "------------------Before----------------");
                            ReleaseLogUtil.d("HWhealthLinkage_", "mReportTrackState is ", Integer.valueOf(fhy.this.o), ",mPreviousTrackState is ", Integer.valueOf(fhy.this.i), ",curTrackState is ", Integer.valueOf(fhy.this.f34071b));
                            fhy.this.g();
                            fhy.this.a(bundle);
                            LogUtil.a("HWhealthLinkage_", "------------------After----------------");
                            fhy fhyVar2 = fhy.this;
                            fhyVar2.i = fhyVar2.f34071b;
                            fhy fhyVar3 = fhy.this;
                            fhyVar3.f34071b = fhyVar3.o;
                            fhy.this.f34072c = false;
                            LogUtil.a("HWhealthLinkage_", "mPreviousTrackState is ", Integer.valueOf(fhy.this.i), " curTrackState is ", Integer.valueOf(fhy.this.f34071b));
                            fhy.this.e(bundle);
                            return;
                        }
                        LogUtil.j("HealthTrackInteractor", "sportDataCallback getSportInfo mReportTrackState is ", Integer.valueOf(i));
                    } catch (RuntimeException e) {
                        xjt.v("HealthTrackInteractor sportInfo RuntimeException" + e.getMessage());
                        throw e;
                    } catch (Exception e2) {
                        LogUtil.a("HealthTrackInteractor", "HealthTrackInteractor sportInfo Exception");
                        xjt.v("HealthTrackInteractor sportInfo Exception" + e2.getMessage());
                    }
                }
            }
        };
        this.d = new IBaseResponseCallback() { // from class: fhy.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HWhealthLinkage_", "err_code is " + i);
                LogUtil.d("HWhealthLinkage_", "objData is " + obj);
            }
        };
        this.r = new IBaseResponseCallback() { // from class: fhy.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "setOperatorCallback setOperator err_code is " + i);
                if (obj != null) {
                    LogUtil.d("HWhealthLinkage_", "objData is " + obj);
                }
                if (i != 100000 && !fhy.this.b()) {
                    fhz.d().e(false);
                    xjt.v("setOperatorCallback errCode not is SUCCEED");
                } else {
                    fhz.d().e(true);
                    fic.e().h();
                    ObserverManagerUtil.e("sport_with_link", new Object[0]);
                }
            }
        };
        this.q = new IBaseResponseCallback() { // from class: fhy.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "setOperatorHelperCallback setOperator err_code is " + i);
                if (obj != null) {
                    LogUtil.d("HWhealthLinkage_", "objData is " + obj);
                }
                if (i != 100000 && !fhy.this.b()) {
                    xjt.v("setOperatorHelperCallback errCode not is SUCCEED");
                    fhz.d().e(false);
                } else {
                    fhz.d().e(true);
                }
            }
        };
    }

    public static final fhy e() {
        return b.d;
    }

    public int a() {
        int i;
        synchronized (f34070a) {
            i = this.f34071b;
        }
        return i;
    }

    public void a(boolean z) {
        this.f34072c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        int i = this.o;
        if (i == 1) {
            d(bundle);
            return;
        }
        if (i == 2) {
            b(this.n);
        } else if (i == 3) {
            d(this.n);
        } else {
            LogUtil.a("HWhealthLinkage_", "getSportInfo other condition");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.h = fhz.d().h();
        this.g = fhz.d().i();
        this.f = fhz.d().f();
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HealthTrackInteractor");
        int i = this.n;
        if (i == 283) {
            this.h = false;
            this.l = true;
        }
        if (nyl.d(i) && (deviceInfo == null || !eey.d(deviceInfo, 0))) {
            this.h = false;
            this.l = true;
        }
        if (this.t == 1) {
            this.h = false;
            this.l = true;
        }
        LogUtil.a("HWhealthLinkage_", "mIsNewLinkStrategy:", Boolean.valueOf(this.h), "  mIsOldLinkStrategy:", Boolean.valueOf(this.g), "  mIsSupportHeartReport:", Boolean.valueOf(this.f), "  mSportType is:", Integer.valueOf(this.n), " mTrackType:", this.t + "deviceInfo:", deviceInfo);
    }

    private void d(Bundle bundle) {
        int i = this.f34071b;
        if (i == 0 || i == 3 || i == 7) {
            fhz.d().e(false);
            cre.a().b();
            fhh.b().a();
            this.m = bundle.getLong("sportStartTime");
            this.j = bundle.getInt("linkType");
            this.s = bundle.getInt("forbid_pause", 0);
            a(this.n);
            return;
        }
        e(this.n);
    }

    public boolean c() {
        LogUtil.a("HWhealthLinkage_", "registerTrackStateListener");
        nwa.n().b(this.p);
        ive.c().e(this.p, 1L);
        fic.e().c(new IBaseResponseCallback() { // from class: fhy.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HWhealthLinkage_", "registerBluetoothStateListener invoke, bluetoothState = ", Integer.valueOf(i));
                if (fhz.d().j() && i == 4) {
                    synchronized (fhy.f34070a) {
                        if (fhy.this.o != 1) {
                            if (fhy.this.o == 2) {
                                fhy fhyVar = fhy.this;
                                fhyVar.e(fhyVar.e, 6);
                                fic.e().c();
                            } else {
                                LogUtil.a("HWhealthLinkage_", "registerBluetoothStateListener other condition");
                            }
                        } else {
                            fhy fhyVar2 = fhy.this;
                            fhyVar2.e(fhyVar2.e, 5);
                            fic.e().a();
                        }
                    }
                }
            }
        });
        return true;
    }

    private void d(int i) {
        int i2;
        fhi.d().b();
        boolean z = this.g;
        if (z && this.e == 1) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is OldLinkStrategy and single track, stop sport");
            fic.e().b();
        } else if (z && ((i2 = this.e) == 2 || i2 == 4)) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is OldLinkStrategy and suggest plan, stop sport");
            if (!cre.a().h()) {
                e(this.e, 4);
            }
            fic.e().b();
        } else if (this.h) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is NewLinkStrategy, stop sport");
            e(this.e, 4);
            fic.e().b();
        } else if (this.l) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is SilentLinkStrategy, stop sport");
            fhz.d().e(false);
        } else if (this.f) {
            LogUtil.a("HWhealthLinkage_", "current link strategy only support heart rate, stop sport");
            fic.e().b();
        } else {
            LogUtil.a("HWhealthLinkage_", "stop sport other condition");
        }
        if (fhz.d().j()) {
            fic.e().c();
        }
        fib.d().closeReport(i, 4);
        fkt.d(false);
    }

    private void b(int i) {
        int i2;
        boolean z = this.g;
        if (z && this.e == 1) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is OldLinkStrategy and single track, pause sport");
            fic.e().b();
        } else if (z && ((i2 = this.e) == 2 || i2 == 4)) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is OldLinkStrategy and suggest plan, pause sport");
            e(this.e, 2);
            fic.e().b();
        } else if (this.h) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is NewLinkStrategy, pause sport");
            e(this.e, 2);
            fic.e().b();
        } else if (this.f) {
            LogUtil.a("HWhealthLinkage_", "current link strategy only support heart rate, pause sport");
            fic.e().b();
        } else {
            LogUtil.a("HWhealthLinkage_", "pause sport other condition");
        }
        if (fhz.d().j()) {
            fic.e().c();
        }
        fib.d().closeReport(i, 2);
    }

    private void e(int i) {
        int i2;
        boolean z = this.g;
        if (z && this.e == 1) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is OldLinkStrategy and single track, resume sport");
            fic.e().h();
        } else if (z && ((i2 = this.e) == 2 || i2 == 4)) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is OldLinkStrategy and suggest plan, resume sport");
            e(this.e, 3);
        } else if (this.h) {
            LogUtil.a("HWhealthLinkage_", "current link strategy is NewLinkStrategy, resume sport");
            e(this.e, 3);
        } else if (this.f) {
            LogUtil.a("HWhealthLinkage_", "current link strategy only support heart rate, resume sport");
            fic.e().h();
        } else {
            LogUtil.a("HWhealthLinkage_", "resume sport other condition");
        }
        if (fhz.d().j()) {
            fic.e().a();
        }
        fib.d().openReport(i, 3);
    }

    private void a(int i) {
        int i2;
        boolean z = this.g;
        if (z && this.e == 1) {
            ReleaseLogUtil.d("HWhealthLinkage_", "current link strategy is OldLinkStrategy and single track, start sport");
            fic.e().h();
        } else if (z && ((i2 = this.e) == 2 || i2 == 4)) {
            ReleaseLogUtil.d("HWhealthLinkage_", "current link strategy is OldLinkStrategy and suggest plan, start sport");
            e(this.e, 1);
        } else if (this.h) {
            ReleaseLogUtil.d("HWhealthLinkage_", "current link strategy is NewLinkStrategy, start sport");
            e(this.e, 1);
        } else if (this.l) {
            ReleaseLogUtil.d("HWhealthLinkage_", "current link strategy is SilentLinkStrategy, start sport");
            fhz.d().e(true);
            fic.e().j();
        } else if (this.f) {
            ReleaseLogUtil.d("HWhealthLinkage_", "only support heart rate, start sport");
            fic.e().h();
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_", "startSport other condition");
        }
        if (fhz.d().j()) {
            fic.e().a();
        }
        fib.d().openReport(i, 1);
        fkt.d(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(int i) {
        return (i == 4 && "0".equals(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), "new_run_course"))) ? 4 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Bundle bundle) {
        if (fhz.d().h() && fhz.d().g()) {
            JSONObject jSONObject = new JSONObject();
            try {
                e(bundle, jSONObject);
                if (fhz.d().j()) {
                    b(bundle, jSONObject);
                    a(bundle, jSONObject);
                    LogUtil.a("HealthTrackInteractor", "sportInfo toString", bundle);
                }
            } catch (JSONException e) {
                xjt.v("deliverRealTimeSportInfo exception " + e.getMessage());
                LogUtil.j("HWhealthLinkage_", e.getMessage());
            }
            fic.e().e(jSONObject, this.d);
        }
    }

    private void e(Bundle bundle, JSONObject jSONObject) throws JSONException {
        if (bundle == null) {
            LogUtil.a("HealthTrackInteractor", "addOldSportData sportInfo is null");
            return;
        }
        try {
            jSONObject.put("exercise_duration", ((Integer) bundle.get("duration")).intValue());
            if (bundle.get("pace") == null) {
                jSONObject.put("pace", 0);
            } else {
                jSONObject.put("pace", bundle.getInt("pace"));
            }
            if (bundle.get("speed") == null) {
                jSONObject.put("speed", 0);
            } else {
                jSONObject.put("speed", Math.round(bundle.getFloat("speed") * 10.0f));
            }
            if (bundle.get("speed_new") == null) {
                jSONObject.put("speed_new", 0);
            } else {
                jSONObject.put("speed_new", bundle.getInt("speed_new"));
            }
            if (bundle.get("avg_speed_new") == null) {
                jSONObject.put("avg_speed_new", 0);
            } else {
                jSONObject.put("avg_speed_new", bundle.getInt("avg_speed_new"));
            }
            jSONObject.put("calorie", ((Integer) bundle.get("calorie")).intValue());
            jSONObject.put("distance", ((Integer) bundle.get("distance")).intValue());
            if (bundle.get(HwExerciseConstants.JSON_NAME_ACTIVECALORIE) != null) {
                jSONObject.put(HwExerciseConstants.JSON_NAME_ACTIVECALORIE, bundle.getInt(HwExerciseConstants.JSON_NAME_ACTIVECALORIE));
            }
            jSONObject.put("linkage_power", bundle.getInt("power"));
            jSONObject.put("linkage_analog_power", bundle.getInt(HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER));
            jSONObject.put("linkage_slope", bundle.getInt("slope"));
            if (bundle.get("cadenceData") != null) {
                jSONObject.put("linkage_cadence", bundle.getInt("cadenceData"));
            }
            if (bundle.get(HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE) != null) {
                jSONObject.put("linkage_analog_cadence", bundle.getInt(HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE));
            }
            if (bundle.get("avgCadence") != null) {
                jSONObject.put("linkage_avg_cadence", bundle.getInt("avgCadence"));
            }
            if (bundle.get("avgAnalogCadence") != null) {
                jSONObject.put("linkage_avg_analog_cadence", bundle.getInt("avgAnalogCadence"));
            }
            jSONObject.put("linkage_real_avg_power", bundle.getInt("avgPower"));
            jSONObject.put("linkage_real_avg_analog_power", bundle.getInt("avgAnalogPower"));
            jSONObject.put("linkage_three_sec_power", bundle.getInt("threeSecPower"));
            jSONObject.put("linkage_three_sec_analog_power", bundle.getInt("threeSecAnalogPower"));
            if (bundle.get("avgSpeed") != null) {
                jSONObject.put("avg_speed", Math.round(bundle.getFloat("avgSpeed")));
            }
            if (bundle.get("maxSpeed") != null) {
                jSONObject.put("linkage_max_speed", Math.round(bundle.getFloat("maxSpeed")));
            }
        } catch (JSONException e) {
            xjt.v("addOldSportData JSONException" + e.getMessage());
            throw e;
        } catch (Exception e2) {
            LogUtil.a("HealthTrackInteractor", "addOldSportData Exception");
            xjt.v("addOldSportData Exception" + e2.getMessage());
        }
    }

    private void a(Bundle bundle, JSONObject jSONObject) throws JSONException {
        if (bundle == null) {
            LogUtil.a("HealthTrackInteractor", "addNewSportData sportInfo is null");
            return;
        }
        int i = bundle.getInt(BleConstants.SPORT_TYPE);
        if (i == 273) {
            jSONObject.put("linkage_cadence", bundle.getInt("cadence"));
        } else if (i == 274) {
            jSONObject.put("linkage_pulp_frequency", bundle.getFloat("paddleFrequency"));
            jSONObject.put("linkage_slurry", bundle.getInt("totalPaddle"));
        }
        if (nyl.d(i)) {
            jSONObject.put("linkage_power", bundle.getInt("power"));
            jSONObject.put("linkage_resistance_level", bundle.getInt("resistanceLevel"));
            jSONObject.put("linkage_resistance_level_max", bundle.getInt("resistanceMaxLevel"));
            jSONObject.put("linkage_resistance_level_min", bundle.getInt("resistanceMinLevel"));
        }
    }

    private void b(Bundle bundle, JSONObject jSONObject) throws JSONException {
        if (bundle == null) {
            LogUtil.a("HealthTrackInteractor", "addNewSportData sportInfo is null");
            return;
        }
        try {
            jSONObject.put("hr", bundle.getInt(IndoorEquipManagerApi.KEY_HEART_RATE));
            jSONObject.put("total_rise", bundle.getInt("totalCreep"));
            jSONObject.put("total_descend", bundle.getInt(BleConstants.TOTAL_DESCENT));
            jSONObject.put("altitude", bundle.getInt("altitude"));
            jSONObject.put("aerobic_te", bundle.getInt("aerobicExercise"));
            jSONObject.put("anaerobic_te", bundle.getInt("anaerobicExercise"));
            jSONObject.put("performance_condition", bundle.getInt("performanceIndicator"));
            jSONObject.put("operator_type", bundle.getInt("sportState"));
            jSONObject.put("running_course_number", bundle.getInt("runningActionIndex"));
            jSONObject.put("running_course_action_count", bundle.getInt("runningCourseNumber"));
            jSONObject.put("running_course_action_id", bundle.getString("runningActionId"));
            jSONObject.put("running_course_left_type", bundle.getInt("goalType"));
            jSONObject.put("running_course_content", bundle.getInt("goalGapValue"));
            jSONObject.put("step_cadence", bundle.getInt("stepRate"));
            jSONObject.put("step", bundle.getInt(MedalConstants.EVENT_STEPS));
        } catch (JSONException e) {
            xjt.v("addNewSportData JSONException" + e.getMessage());
            throw e;
        } catch (Exception e2) {
            LogUtil.a("HealthTrackInteractor", "addNewSportData Exception");
            xjt.v("addNewSportData Exception" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        List<DeviceCapability> listE;
        DeviceCapability deviceCapabilityI;
        if (fks.d().b(true) != null && (deviceCapabilityI = fks.d().i()) != null) {
            boolean zIsSupportExerciseAdvice = deviceCapabilityI.isSupportExerciseAdvice();
            boolean zIsSupportWorkoutExerciseDisplayLink = deviceCapabilityI.isSupportWorkoutExerciseDisplayLink();
            if (zIsSupportExerciseAdvice && !zIsSupportWorkoutExerciseDisplayLink) {
                return true;
            }
        }
        if (fks.d().b(false) == null || (listE = fks.d().e()) == null) {
            return false;
        }
        return d(false, listE);
    }

    private boolean d(boolean z, List<DeviceCapability> list) {
        for (DeviceCapability deviceCapability : list) {
            if (deviceCapability != null) {
                boolean zIsSupportExerciseAdvice = deviceCapability.isSupportExerciseAdvice();
                boolean zIsSupportWorkoutExerciseDisplayLink = deviceCapability.isSupportWorkoutExerciseDisplayLink();
                if (zIsSupportExerciseAdvice && !zIsSupportWorkoutExerciseDisplayLink) {
                    LogUtil.a("HWhealthLinkage_", "isExitOldLinkDevice has existed");
                    return true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i, int i2) {
        ReleaseLogUtil.d("HWhealthLinkage_", "notifyWearDeviceState sportType = " + i + ", sportState = " + i2 + ", deviceReportState=" + this.f34072c);
        if (this.f34072c) {
            if (i2 == 3) {
                fic.e().h();
            }
            return true;
        }
        boolean zG = fhz.d().g();
        if (i2 != 1 && !zG) {
            ReleaseLogUtil.e("HWhealthLinkage_", "failed to linkage and linking status is " + zG);
            xjt.v("sportState not is start " + i2);
            return false;
        }
        if (i2 == 1 || zG) {
            ReleaseLogUtil.d("HWhealthLinkage_", "notifyWearDeviceState is linking");
            JSONObject jSONObject = new JSONObject();
            d(jSONObject, i, i2);
            if (i2 == 1 || i2 == 3) {
                fic.e().d(jSONObject, this.r);
            } else {
                fic.e().d(jSONObject, this.q);
            }
        }
        return true;
    }

    private void d(JSONObject jSONObject, int i, int i2) {
        try {
            b(jSONObject, i, i2);
        } catch (JSONException e) {
            LogUtil.e("HWhealthLinkage_", "buildJsonObject JSONException ", e.getMessage());
            xjt.v("buildJsonObject JSONException" + e.getMessage());
        }
    }

    private void b(JSONObject jSONObject, int i, int i2) throws JSONException {
        jSONObject.put("sport_type", i);
        jSONObject.put("operator_type", i2);
        jSONObject.put(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE, this.n);
        jSONObject.put("operation_time", System.currentTimeMillis());
        if (fhz.d().j()) {
            jSONObject.put("start_time", this.m);
            jSONObject.put("version", this.j);
            int i3 = this.s;
            if (i3 == 1) {
                jSONObject.put("forbid_pause", i3);
            }
            jSONObject.put("run_course_version", this.k);
        }
    }
}
