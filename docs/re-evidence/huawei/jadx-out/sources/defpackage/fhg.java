package defpackage;

import android.os.Bundle;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fhg {
    private static final Object e = new Object();
    protected int d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f34051b = 0;
    private ISportDataCallback g = new ISportDataCallback() { // from class: fhg.5
        @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
        public void onSummary(MotionPathSimplify motionPathSimplify) {
        }

        @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
        public void getSportInfo(Bundle bundle) {
            synchronized (fhg.e) {
                try {
                    if (bundle != null) {
                        fhg.this.d(bundle);
                    } else {
                        ReleaseLogUtil.a("HWhealthLinkage_HealthFitnessInteractor", "sportDataCallback getSportInfo sportInfo is null");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected CourseLinkageLifecycle f34050a = new CourseLinkageLifecycle() { // from class: fhg.1
        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void start(int i, Bundle bundle) {
            fhg.this.d = i;
            if (bundle != null) {
                fhg.this.f34051b = bundle.getLong("startSportTime");
                ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", " startTime:", Long.valueOf(fhg.this.f34051b));
            }
            fhg.this.f();
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void resume(int i) {
            ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "mCourseLinkageLifecycle app resume, sportType:", Integer.valueOf(i));
            fhg.this.d = i;
            fhg.this.j();
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void pause(int i) {
            ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "mCourseLinkageLifecycle app pause, sportType:", Integer.valueOf(i));
            fhg.this.d = i;
            fhg.this.h();
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void stop(int i) {
            ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "mCourseLinkageLifecycle app stop, sportType:", Integer.valueOf(i));
            fhg.this.d = i;
            fhg.this.g();
        }
    };
    private IBaseResponseCallback f = new IBaseResponseCallback() { // from class: fhg.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "setOperatorHelperCallback setOperator err_code is ", Integer.valueOf(i));
            if (i == 100000) {
                fhz.d().e(true);
                CoachController.c().e(true);
            } else {
                fhz.d().e(false);
                CoachController.c().e(false);
            }
        }
    };
    private IBaseResponseCallback j = new IBaseResponseCallback() { // from class: fhg.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "setOperatorCallback setOperator err_code is ", Integer.valueOf(i));
            if (i == 100000) {
                fhz.d().e(true);
                fic.e().h();
                CoachController.c().e(true);
            } else {
                fhz.d().e(false);
                CoachController.c().e(false);
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f34052c = new IBaseResponseCallback() { // from class: fhg.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.d("HealthFitnessInteractor", "deliverRealTimeSportData err_code is ", Integer.valueOf(i));
        }
    };

    public void a() {
        ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "reset fitness interactor.");
        CoachController.c().e();
        this.d = 0;
        this.f34051b = 0L;
    }

    protected void f() {
        a(this.d, 1);
        if (fhz.d().j()) {
            fic.e().a();
        }
    }

    protected void h() {
        a(this.d, 2);
        fic.e().b();
        if (fhz.d().j()) {
            fic.e().c();
        }
    }

    protected void j() {
        a(this.d, 3);
        fic.e().h();
        if (fhz.d().j()) {
            fic.e().a();
        }
    }

    protected void g() {
        fhi.d().b();
        a(this.d, 4);
        fic.e().b();
        if (fhz.d().j()) {
            fic.e().c();
        }
    }

    protected void c() {
        CoachController.c().b(this.g);
        nwa.n().d(this.g);
        fic.e().c(new IBaseResponseCallback() { // from class: fhg.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "registerBluetoothStateListener invoke, bluetoothState = ", Integer.valueOf(i));
                if (fhz.d().j() && i == 4) {
                    synchronized (fhg.e) {
                        fhz.d().e(true);
                        int iB = CoachController.c().b();
                        ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "startSportTime=", Long.valueOf(fhg.this.f34051b), " currentState=", Integer.valueOf(iB), " linkStatus=", Boolean.valueOf(fhz.d().g()));
                        if (iB == 1) {
                            fhg fhgVar = fhg.this;
                            fhgVar.a(fhgVar.d, 5);
                            fic.e().a();
                        } else if (iB == 2) {
                            fhg fhgVar2 = fhg.this;
                            fhgVar2.a(fhgVar2.d, 6);
                            fic.e().c();
                        } else if (iB == 3) {
                            fhg fhgVar3 = fhg.this;
                            fhgVar3.a(fhgVar3.d, 4);
                            fic.e().c();
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int i2) {
        ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "notifyWearDeviceState sportType = ", Integer.valueOf(i), ", sportState = ", Integer.valueOf(i2));
        boolean zG = fhz.d().g();
        if (i2 != 1 && !zG) {
            ReleaseLogUtil.e("HWhealthLinkage_HealthFitnessInteractor", "failed to linkage.");
            return false;
        }
        if (i2 == 1 || zG) {
            ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "notifyWearDeviceState is linking");
            JSONObject jSONObject = new JSONObject();
            d(jSONObject, i, i2);
            if (i2 == 1 || i2 == 3) {
                fic.e().d(jSONObject, this.j);
                DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HealthFitnessInteractor");
                if (fkm.d(deviceInfo) && i2 == 3 && CoachController.c().a().getCourseSleepTime() > 0) {
                    fkm.a(CoachController.c().a(), 7, deviceInfo);
                }
            } else {
                DeviceInfo deviceInfo2 = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HealthFitnessInteractor");
                if (fkm.d(deviceInfo2)) {
                    ReleaseLogUtil.d("HWhealthLinkage_HealthFitnessInteractor", "recover course link");
                    fkm.d(CoachController.c().a(), deviceInfo2);
                }
                fic.e().d(jSONObject, this.f);
            }
        }
        return true;
    }

    private void d(JSONObject jSONObject, int i, int i2) {
        try {
            jSONObject.put("sport_type", 1);
            jSONObject.put(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE, i);
            jSONObject.put("operator_type", i2);
            jSONObject.put("operation_time", System.currentTimeMillis());
            if (fhz.d().j()) {
                jSONObject.put("start_time", this.f34051b);
                jSONObject.put("version", 1);
            }
        } catch (JSONException e2) {
            ReleaseLogUtil.a("HWhealthLinkage_HealthFitnessInteractor", "buildJsonObject JSONException ", LogAnonymous.b(e2));
            xjt.v("buildJsonObject JSONException：" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Bundle bundle) {
        if (fhz.d().h() && fhz.d().g()) {
            JSONObject jSONObject = new JSONObject();
            a(bundle, jSONObject);
            if (fhz.d().j()) {
                e(bundle, jSONObject);
                LogUtil.d("HealthFitnessInteractor", "sportInfo:", jSONObject.toString());
            }
            fic.e().e(jSONObject, this.f34052c);
        }
    }

    private void a(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            ReleaseLogUtil.a("HWhealthLinkage_HealthFitnessInteractor", "addOldSportData sportInfo is null");
            return;
        }
        try {
            jSONObject.put("exercise_duration", bundle.getInt("duration"));
            jSONObject.put("calorie", bundle.getInt("calorie"));
            jSONObject.put("distance", bundle.getInt("distance"));
            jSONObject.put("pace", bundle.getInt("pace"));
            jSONObject.put("speed", bundle.getFloat("speed"));
            jSONObject.put(HwExerciseConstants.JSON_NAME_ACTIVECALORIE, bundle.getInt(HwExerciseConstants.JSON_NAME_ACTIVECALORIE));
        } catch (JSONException e2) {
            ReleaseLogUtil.a("HWhealthLinkage_HealthFitnessInteractor", "add old sport data:", LogAnonymous.b(e2));
            xjt.v("add old sport data：" + e2.getMessage());
        }
    }

    private void e(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            ReleaseLogUtil.a("HWhealthLinkage_HealthFitnessInteractor", "addNewSportData sportInfo is null");
            return;
        }
        try {
            jSONObject.put("hr", bundle.getInt(IndoorEquipManagerApi.KEY_HEART_RATE));
            jSONObject.put("aerobic_te", bundle.getInt("aerobicExercise"));
            jSONObject.put("anaerobic_te", bundle.getInt("anaerobicExercise"));
            jSONObject.put("performance_condition", bundle.getInt("performanceIndicator"));
            jSONObject.put("operator_type", bundle.getInt("sportState"));
        } catch (JSONException e2) {
            ReleaseLogUtil.a("HWhealthLinkage_HealthFitnessInteractor", "add new sport data:", LogAnonymous.b(e2));
            xjt.v("add new sport data：" + e2.getMessage());
        }
    }
}
