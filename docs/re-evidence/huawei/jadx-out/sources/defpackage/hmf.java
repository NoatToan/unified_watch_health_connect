package defpackage;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36902a;
    private int aa;
    private int ab;
    private int ac;
    private float ad;
    private String ah;
    private int e;
    private boolean f;
    private FitWorkout g;
    private boolean j;
    private boolean m;
    private String p;
    private long t;
    private ArrayList<WorkoutRecord> u;
    private String y;
    private String z;
    private String af = "";
    private String ai = "";
    private boolean i = false;
    private boolean l = false;
    private int q = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36904c = "otherModel";
    private boolean h = false;
    private String s = "";
    private String w = "";
    private String v = "";
    private String x = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36903b = "";
    private String r = "";
    private String k = "";
    private String d = "";
    private boolean o = false;
    private boolean n = false;

    public hmf(Intent intent) {
        try {
            if (intent == null) {
                ReleaseLogUtil.d("Suggestion_TrainDetailIntentData", "TrainDetailIntentData intent null");
                return;
            }
            b(intent);
            d(intent);
            j(intent);
            h(intent);
            e(intent);
            c(intent);
            a(intent);
        } catch (BadParcelableException e) {
            LogUtil.e("Suggestion_TrainDetailIntentData", "get intent data failed with BadParcelableException", LogAnonymous.b(e));
        } catch (ArrayIndexOutOfBoundsException e2) {
            LogUtil.e("Suggestion_TrainDetailIntentData", "get intent data failed with ArrayIndexOutOfBoundsException", LogAnonymous.b(e2));
        }
    }

    private void a(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("bundlekey");
        if (bundleExtra != null) {
            this.m = bundleExtra.getBoolean("isshowbutton");
            this.ac = bundleExtra.getInt("track_type");
            this.ab = bundleExtra.getInt("track_target");
            this.ad = bundleExtra.getFloat("track_targetvalue");
        }
    }

    private void c(Intent intent) {
        this.s = intent.getStringExtra(WebViewHelp.BI_KEY_PULL_FROM);
        this.w = intent.getStringExtra("resourceId");
        this.v = intent.getStringExtra("resourceName");
        this.x = intent.getStringExtra("pullOrder");
        this.f36903b = intent.getStringExtra("algId");
        this.r = intent.getStringExtra("promoteTag");
        this.d = intent.getStringExtra(x2.AB_INFO);
        this.k = intent.getStringExtra("itemId");
        if (njy.b(this.u)) {
            if (TextUtils.isEmpty(this.u.get(0).acquirePlanId())) {
                LogUtil.j("Suggestion_TrainDetailIntentData", "getBiIntentData mPlanId null");
                return;
            }
            this.f36904c = "10";
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.e("Suggestion_TrainDetailIntentData", "bindRunPlanInfo, getCurrentPlan : planApi is null.");
                return;
            }
            IntPlan currentIntPlan = planApi.getCurrentIntPlan();
            if (currentIntPlan == null || currentIntPlan.getMetaInfo() == null) {
                return;
            }
            this.r = currentIntPlan.getMetaInfo().getName();
        }
    }

    private void b(Intent intent) {
        this.ai = intent.getStringExtra("version");
        this.af = intent.getStringExtra("workoutid");
        this.aa = intent.getIntExtra("userDefinedType", 0);
        this.n = intent.getBooleanExtra("isSendCourseDevice", false);
        Bundle bundleB = ipi.b(intent.getStringExtra("stretch"));
        if (bundleB != null) {
            try {
                this.u = (ArrayList) HiJsonUtil.d(bundleB.getString("workoutrecord"), new TypeToken<List<WorkoutRecord>>() { // from class: com.huawei.health.suggestion.ui.fitness.module.TrainDetailIntentData$1
                }.getType());
            } catch (JsonSyntaxException unused) {
                LogUtil.e("Suggestion_TrainDetailIntentData", "parse WorkoutRecord error");
            }
        } else {
            try {
                this.u = intent.getParcelableArrayListExtra("workoutrecord");
            } catch (ArrayIndexOutOfBoundsException unused2) {
                LogUtil.e("Suggestion_TrainDetailIntentData", "getPassedData ArrayIndexOutOfBoundsException");
            }
        }
        if (!njy.b((Object) this.u, WorkoutRecord.class)) {
            this.u = new ArrayList<>();
        }
        if (TextUtils.isEmpty(this.af) && njy.b(this.u)) {
            this.af = this.u.get(0).acquireWorkoutId();
            this.ai = this.u.get(0).acquireVersion();
        }
        this.j = intent.getBooleanExtra("isafterrun", false);
        this.i = intent.getBooleanExtra("ISFROMSCHEME", false);
        this.l = intent.getBooleanExtra("isNeedExecutImmediate", false);
        this.q = intent.getIntExtra("executImmediateErrorType", -1);
        this.t = intent.getLongExtra("plan_execute_time", 0L);
        this.h = intent.getBooleanExtra("finish", false);
        this.o = intent.getBooleanExtra("moveTaskToBack", false);
        this.f = intent.getBooleanExtra("ISPLANFIT", false);
        this.z = intent.getStringExtra("topic_name");
    }

    private void d(Intent intent) {
        String stringExtra = intent.getStringExtra("entrance");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f36904c = stringExtra;
    }

    private void j(Intent intent) {
        this.f36902a = intent.getStringExtra("entrance_type");
        this.ah = intent.getStringExtra("workout_package_id");
        this.y = intent.getStringExtra("resource_type");
        if (TextUtils.isEmpty(this.ah)) {
            this.e = 0;
        } else {
            this.e = 1;
        }
    }

    private void h(Intent intent) {
        this.y = intent.getStringExtra("resource_type");
        this.p = intent.getStringExtra("planTempId");
    }

    private void e(Intent intent) {
        if (!"entrance_custom_course".equals(this.f36904c)) {
            ReleaseLogUtil.a("Suggestion_TrainDetailIntentData", "getCustomCourseIntentData not custom course");
            return;
        }
        pce pceVar = (pce) HiJsonUtil.d(intent.getStringExtra("courseParameter"), pce.class);
        if (pceVar == null) {
            ReleaseLogUtil.a("Suggestion_TrainDetailIntentData", "getCustomCourseIntentData courseParameter null");
            return;
        }
        if (TextUtils.isEmpty(pceVar.c())) {
            ReleaseLogUtil.a("Suggestion_TrainDetailIntentData", "getCustomCourseIntentData workoutId null");
            return;
        }
        pce.d dVarD = pceVar.d();
        if (dVarD == null) {
            ReleaseLogUtil.a("Suggestion_TrainDetailIntentData", "getCustomCourseIntentData resource null");
            return;
        }
        pce.b bVar = (pce.b) HiJsonUtil.d(dVarD.a(), pce.b.class);
        if (bVar == null || njy.e(bVar.d())) {
            ReleaseLogUtil.a("Suggestion_TrainDetailIntentData", "getCustomCourseIntentData customCourseInfo null");
            return;
        }
        String strJ = dVarD.j();
        if (TextUtils.isEmpty(strJ)) {
            ReleaseLogUtil.a("Suggestion_TrainDetailIntentData", "getCustomCourseIntentData title is empty");
            strJ = "";
        }
        FitWorkout fitWorkout = new FitWorkout(pceVar.c(), strJ);
        this.g = fitWorkout;
        fitWorkout.setCourseActions(pea.a(bVar));
        this.af = this.g.acquireId();
        this.ai = this.g.accquireVersion();
        this.t = pceVar.b();
        this.aa = 1;
        WorkoutRecord workoutRecordD = pea.d(this.g, new pcd(pceVar.c()));
        ArrayList<WorkoutRecord> arrayList = new ArrayList<>();
        this.u = arrayList;
        arrayList.add(workoutRecordD);
        ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).updateCourseDbData(this.g);
    }

    public boolean ab() {
        return this.j;
    }

    public boolean z() {
        return this.i;
    }

    public boolean ah() {
        return this.l;
    }

    public int f() {
        return this.q;
    }

    public long i() {
        return this.t;
    }

    public int w() {
        return this.aa;
    }

    public String j() {
        return this.f36902a;
    }

    public String e() {
        return this.f36904c;
    }

    public String s() {
        return this.y;
    }

    public String aa() {
        return this.ah;
    }

    public int c() {
        return this.e;
    }

    public String o() {
        return this.p;
    }

    public String y() {
        return this.af;
    }

    public String u() {
        return this.ai;
    }

    public ArrayList<WorkoutRecord> n() {
        return this.u;
    }

    public boolean ad() {
        return this.h;
    }

    public String l() {
        return this.s;
    }

    public String t() {
        return this.w;
    }

    public String r() {
        return this.v;
    }

    public String k() {
        return this.x;
    }

    public String b() {
        return TextUtils.isEmpty(this.f36903b) ? "" : this.f36903b;
    }

    public String m() {
        return this.r;
    }

    public String d() {
        return this.d;
    }

    public String g() {
        return this.k;
    }

    public boolean ai() {
        return this.o;
    }

    public boolean ae() {
        return this.n;
    }

    public void e(String str) {
        this.s = str;
    }

    public boolean ac() {
        return this.f;
    }

    public String p() {
        return this.z;
    }

    public boolean af() {
        return this.m;
    }

    public int q() {
        return this.ac;
    }

    public int x() {
        return this.ab;
    }

    public float v() {
        return this.ad;
    }

    public FitWorkout h() {
        return this.g;
    }

    public Map<String, Object> a() {
        HashMap map = new HashMap(6);
        if (!TextUtils.isEmpty(this.s)) {
            map.put(WebViewHelp.BI_KEY_PULL_FROM, this.s);
        }
        if (!TextUtils.isEmpty(this.w)) {
            map.put("resourceId", this.w);
        }
        if (!TextUtils.isEmpty(this.v)) {
            map.put("resourceName", this.v);
        }
        if (!TextUtils.isEmpty(this.x)) {
            map.put("pullOrder", this.x);
        }
        if (!TextUtils.isEmpty(this.f36903b)) {
            map.put("algId", this.f36903b);
        }
        if (!TextUtils.isEmpty(this.r)) {
            map.put("promoteTag", this.r);
        }
        if (!TextUtils.isEmpty(this.d)) {
            map.put(x2.AB_INFO, this.d);
        }
        if (!TextUtils.isEmpty(this.k)) {
            map.put("itemId", this.k);
        }
        return map;
    }

    public String toString() {
        return "mWorkoutId=" + this.af + " mVersion=" + this.ai + " mIsAfterRun=" + this.j + " mIsFromScheme=" + this.i + " mIsNeedExecuteImmediate=" + this.l + " mNotDownloadBroadcastType=" + this.q + " mPlanStartTime=" + this.t + " mUserDefinedType=" + this.aa + " mEntranceType=" + this.f36902a + " mWorkoutPackageId=" + this.ah + " mResourceType=" + this.y + " mCourseBelongType=" + this.e + " mPlanTempId=" + this.p + " mEntranceStr=" + this.f36904c + " mIsFinish=" + this.h + " mPullFrom=" + this.s + " mResourceId=" + this.w + " mResourceName=" + this.v + " mPullOrder=" + this.x + " mAlgId=" + this.f36903b + " mPromoteTag=" + this.r + " mItemId=" + this.k + " mAbInfo=" + this.d + " mIsFitPlan=" + this.f + " mTopicName=" + this.z + " mTackType=" + this.ac + " mTrackTarget=" + this.ab + " mTrackTargetValue=" + this.ad;
    }
}
