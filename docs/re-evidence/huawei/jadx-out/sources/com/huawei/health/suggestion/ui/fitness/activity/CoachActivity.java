package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.DataPlatformApi;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.courseplanservice.api.SportServiceApi;
import com.huawei.health.device.datatype.SkippingTargetMode;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.health.suggestion.protobuf.CourseStateProto;
import com.huawei.health.suggestion.ui.fitness.helper.HwScreenFoldDisplayMode;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.health.suggestion.ui.fitness.module.CoachView;
import com.huawei.health.suggestion.ui.fitness.module.CoachViewInterface;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener;
import com.huawei.health.suggestion.ui.fitness.mvp.CaloriesConsumeHandler;
import com.huawei.health.suggestion.ui.fitness.viewmodel.CourseEquipmentViewModel;
import com.huawei.health.suggestion.ui.fitness.viewmodel.WorkoutRecordViewModel;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.btq;
import defpackage.btx;
import defpackage.buh;
import defpackage.emh;
import defpackage.gzx;
import defpackage.gzz;
import defpackage.hcb;
import defpackage.hcu;
import defpackage.hit;
import defpackage.hiu;
import defpackage.hiv;
import defpackage.hiz;
import defpackage.hjg;
import defpackage.hjt;
import defpackage.hkt;
import defpackage.hvp;
import defpackage.idy;
import defpackage.iei;
import defpackage.ien;
import defpackage.iog;
import defpackage.njy;
import defpackage.pck;
import defpackage.qrs;
import defpackage.xkf;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CoachActivity extends BaseCoachActivity implements SportLifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CoachView f9044a;
    private ArrayList<RecordAction> aa;
    private float ac;
    private String ad;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CoachData f9046c;
    private String d;
    private Context e;
    private hjt f;
    private int g;
    private Map<Long, Integer> h;
    private int i;
    private CourseEquipmentViewModel j;
    private boolean l;
    private int n;
    private boolean r;
    private boolean t;
    private List<Motion> u;
    private WorkoutRecord v;
    private int w;
    private long x;
    private CustomAlertDialog y;
    private float z;
    private boolean k = false;
    private boolean s = false;
    private boolean q = false;
    private boolean m = false;
    private Observer<Bundle> ab = new Observer() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity$$ExternalSyntheticLambda3
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.f9047b.c((Bundle) obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hiu.d f9045b = new hiu.d();
    private volatile boolean p = false;
    private String o = "NORMAL_MODE";

    /* JADX INFO: Access modifiers changed from: private */
    public int q() {
        return 5894;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public int setLoadingBackgroundColor() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    public void reloadView(final String str) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.3
            @Override // java.lang.Runnable
            public void run() {
                CoachActivity.this.o = str;
                CoachActivity.this.f9044a.d(CoachActivity.this.o);
                CoachActivity.this.ah();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public String getCurrFoldModel() {
        return this.o;
    }

    private static boolean c(Context context, boolean z) {
        boolean z2 = false;
        if (context == null) {
            LogUtil.e("Suggestion_CoachActivity", "context is null.");
            return false;
        }
        if (context.getSystemService("audio") instanceof AudioManager) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (!z ? audioManager.abandonAudioFocus(null) == 1 : audioManager.requestAudioFocus(null, 3, 1) == 1) {
                z2 = true;
            }
        }
        LogUtil.a("Suggestion_CoachActivity", "pauseMusic bMute=", Boolean.valueOf(z), " result=", Boolean.valueOf(z2));
        return z2;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity, com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("Suggestion_CoachActivity", "onCreate");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi != null) {
            courseApi.markFitnessCourseStatusOccupied();
        }
        super.onCreate(bundle);
        clearBackgroundDrawable();
        getWindow().addFlags(1152);
        this.e = this;
        this.mStartTrainTime = System.currentTimeMillis();
        this.h = new HashMap(10);
        this.g = getWindow().getDecorView().getSystemUiVisibility();
        if (!qrs.af(this.e)) {
            setRequestedOrientation(0);
        }
        t();
        startPlay();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        this.f9044a.as();
        this.f9044a.ao();
        if (qrs.af(this.e)) {
            return;
        }
        setRequestedOrientation(0);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_fitness_activity_coach);
        p();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public int getLoadingLayoutId() {
        return com.huawei.health.basefitnessadvice.R.layout.sug_loading_layout;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        this.f9044a = (CoachView) findViewById(R.id.cv_coua);
    }

    private void t() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.w = intent.getIntExtra("coachstartposition", 0);
                this.l = intent.getBooleanExtra("havenexttrain", false);
                this.k = intent.getBooleanExtra("isafterrun", false);
                this.x = intent.getLongExtra("plan_execute_time", 0L);
                String stringExtra = intent.getStringExtra("BASE_AUDIO_TIMBRE");
                this.d = stringExtra;
                xkf.r(stringExtra);
                if (intent.getParcelableExtra(ContentTemplateRecord.MOTIONS) != null) {
                    CoachData coachData = (CoachData) intent.getParcelableExtra(ContentTemplateRecord.MOTIONS);
                    this.f9046c = coachData;
                    checkBreachStatus(coachData);
                }
                this.r = intent.getBooleanExtra("ISPLANFIT", false);
                this.ad = intent.getStringExtra("workout_package_id");
                this.i = intent.getIntExtra("course_belong_type", 0);
                if (e(intent)) {
                    return;
                } else {
                    a(intent);
                }
            } catch (Exception e) {
                LogUtil.j("Suggestion_CoachActivity", LogAnonymous.b(e));
            }
        }
        y();
        d(intent);
        hcb.a().onChange(this.v.acquireWorkoutId(), 2, null);
        this.f9044a.setGender(1);
        this.f9044a.setMotions(this.u, this.w);
        final String strE = buh.e("is_first_to_coachacitivyt");
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(strE)) {
                    CoachActivity.this.f9044a.a(true);
                    buh.d("is_first_to_coachacitivyt", "notfirst");
                }
                CoachActivity.this.updateViewController();
            }
        });
        this.ac = hjg.a();
        this.mCaloriesConsumeHandler = new CaloriesConsumeHandler(CoachController.c().f(), this.t, new c(this.f9044a));
        this.f9044a.setCaloriesConsumeHandler(this.mCaloriesConsumeHandler);
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static class c implements CaloriesConsumeHandler.CaloriesRefreshCallback {
        private WeakReference<CoachView> d;

        c(CoachView coachView) {
            this.d = new WeakReference<>(coachView);
        }

        @Override // com.huawei.health.suggestion.ui.fitness.mvp.CaloriesConsumeHandler.CaloriesRefreshCallback
        public void onRefresh(final float f) {
            final CoachView coachView;
            WeakReference<CoachView> weakReference = this.d;
            if (weakReference == null || (coachView = weakReference.get()) == null) {
                return;
            }
            if (HandlerExecutor.c()) {
                coachView.e(f);
            } else {
                HandlerExecutor.b(new Runnable() { // from class: hfi
                    @Override // java.lang.Runnable
                    public final void run() {
                        coachView.e(f);
                    }
                });
            }
        }
    }

    private void d(Intent intent) {
        String strD;
        String strAcquireWorkoutName;
        WorkoutRecord workoutRecord = this.v;
        String strAcquireWorkId = "";
        if (workoutRecord == null) {
            strD = Constants.NULL;
            strAcquireWorkoutName = "";
        } else {
            strAcquireWorkoutName = workoutRecord.acquireWorkoutName();
            strD = iei.d(this.v);
        }
        CoachData coachData = this.f9046c;
        if (coachData != null) {
            strAcquireWorkId = coachData.acquireWorkId();
            this.f9044a.a(FitWorkout.acquireComeFrom(this.f9046c.acquireWorkId()));
        }
        hiu.d dVarC = hiu.c(intent, strAcquireWorkoutName, strAcquireWorkId, strD);
        this.f9045b = dVarC;
        CoachView coachView = this.f9044a;
        if (coachView != null) {
            coachView.d(dVarC);
        }
    }

    private void a(Intent intent) {
        if (!intent.hasExtra("IS_SUPPORT_RECORD") || intent.getIntExtra("IS_SUPPORT_RECORD", 0) == 0) {
            return;
        }
        getWindow().addFlags(8192);
        this.f9044a.setScreenCastVisibility(8);
    }

    private void p() {
        hjt hjtVarD = hjt.d(this);
        this.f = hjtVarD;
        hjtVarD.b(R.layout.sug_fitness_coach_dialog_exit).e(R.id.sug_coach_dialog_No, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachActivity.this.f9044a.setClickStop(false);
                CoachActivity.this.getWindow().getDecorView().setSystemUiVisibility(CoachActivity.this.q());
                CoachActivity.this.f.b();
                hiu.a(CoachActivity.this.f9045b, 7);
            }
        }).e(R.id.sug_coach_dialog_yse, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachActivity.this.f.b();
                hiu.a(CoachActivity.this.f9045b, 6);
                CoachActivity.this.s = true;
            }
        });
        this.f.a().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.6
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (CoachActivity.this.f9044a == null) {
                    return;
                }
                CoachActivity.this.f9044a.ap();
                if (CoachActivity.this.s) {
                    CoachActivity.this.s = false;
                    CoachActivity.this.ai();
                }
            }
        });
    }

    private boolean e(Intent intent) {
        WorkoutRecord workoutRecord = (WorkoutRecord) intent.getParcelableExtra("workoutrecord");
        this.v = workoutRecord;
        CoachData coachData = this.f9046c;
        if (coachData == null || workoutRecord == null) {
            LogUtil.e("Suggestion_CoachActivity", "mCoachData,mRecord is null");
            finish();
            return true;
        }
        List<Motion> listAcquireMotions = coachData.acquireMotions();
        this.u = listAcquireMotions;
        if (listAcquireMotions != null) {
            return false;
        }
        LogUtil.e("Suggestion_CoachActivity", "mMotions is null");
        finish();
        return true;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void updateViewController() {
        this.f9044a.e(new OnMotionChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.7
            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionOver(Motion motion, int i) {
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionReady(Motion motion, int i) {
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionChanged(Motion motion, int i) {
                CoachActivity.this.a(motion, i);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionStart(Motion motion, int i) {
                LogUtil.a("Suggestion_CoachActivity", "onMotionStart:", motion.acquireName(), Integer.valueOf(i));
                CoachActivity.this.mPlayStartTime = System.currentTimeMillis();
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionPause(Motion motion, int i) {
                CoachActivity.this.e(motion, i);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionContinue(Motion motion, int i) {
                CoachActivity.this.c(motion, i);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onGroupFinish(Motion motion, int i, int i2) {
                LogUtil.d("Suggestion_CoachActivity", "A group of action completed, Total: ", Integer.valueOf(i2));
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onTrainOver(boolean z) {
                if (z && CoachActivity.this.f9044a != null && !CoachActivity.this.f9044a.am()) {
                    hiu.a(CoachActivity.this.f9045b, 4);
                }
                CoachActivity.this.c(z);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onCustomBeave() {
                CoachActivity.this.l();
            }
        });
        this.f9044a.b(AudioConstant.BACKGROUND_MUSIC_CODE);
        finishLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Motion motion, int i) {
        LogUtil.a("Suggestion_CoachActivity", "onMotionChanged:", motion.acquireName(), Integer.valueOf(i));
        ac();
        if (this.t) {
            return;
        }
        this.f9044a.setCaloreHeartViewsVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Motion motion, int i) {
        this.mIsPauseStatus = true;
        this.mPauseTrainTime = System.currentTimeMillis();
        ReleaseLogUtil.d("Suggestion_CoachActivity", "onMotionPause:", motion.acquireName(), Integer.valueOf(i), " mPauseTrainTime:", Long.valueOf(this.mPauseTrainTime));
        ac();
        CourseEquipmentViewModel courseEquipmentViewModel = this.j;
        if (courseEquipmentViewModel == null || courseEquipmentViewModel.getSportStatus() == 2) {
            return;
        }
        this.j.onPauseSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Motion motion, int i) {
        ReleaseLogUtil.d("Suggestion_CoachActivity", "onMotionContinue:", motion.acquireName(), "position:", Integer.valueOf(i));
        this.mPlayStartTime = System.currentTimeMillis();
        dealLastPauseTime();
        this.mIsPauseStatus = false;
        CourseEquipmentViewModel courseEquipmentViewModel = this.j;
        if (courseEquipmentViewModel == null || courseEquipmentViewModel.getSportStatus() == 1 || this.s) {
            return;
        }
        this.j.onResumeSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        LogUtil.d("Suggestion_CoachActivity", "Training Completed");
        this.p = true;
        CourseEquipmentViewModel courseEquipmentViewModel = this.j;
        if (courseEquipmentViewModel != null) {
            courseEquipmentViewModel.m825x32b3e3a1();
        }
        if (!z) {
            if (w()) {
                return;
            }
            finish();
        } else {
            if (this.mHeartRateHandler != null && njy.b(this.mHeartRateHandler.getHeartRateList())) {
                hiv.e(this.h, this.mHeartRateHandler.getHeartRateList(), this.mIntensityHeartRateThreshold);
            }
            f();
        }
    }

    private void ac() {
        this.mPlayEndTime = System.currentTimeMillis();
        if (this.mPlayStartTime == 0 || this.mHeartRateHandler != null) {
            return;
        }
        hiv.c(this.h, this.mPlayStartTime, this.mPlayEndTime);
        u();
    }

    private void u() {
        this.mPlayStartTime = 0L;
        this.mPlayEndTime = 0L;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        CoachView coachView = this.f9044a;
        if (coachView != null && coachView.aj()) {
            LogUtil.a("Suggestion_CoachActivity", "onBackPressed isLocked true");
            return;
        }
        if (r()) {
            if (this.f9044a.ak()) {
                hiu.a(this.f9045b, 3);
            }
            this.f9044a.setClickStop(true);
            l();
            return;
        }
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        CoachView coachView = this.f9044a;
        if (coachView != null) {
            coachView.ae();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!this.f9044a.ak()) {
            s();
        } else {
            this.f9044a.finishTrain();
        }
    }

    private boolean r() {
        return this.f9044a.getTrainStation() == 191 || this.f9044a.getTrainStation() == 190;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity, android.app.Activity
    public void finish() {
        LogUtil.a("Suggestion_CoachActivity", "finish()");
        super.finish();
        if ((this.k && this.f9044a.ak()) || v()) {
            hcu.b().c();
        } else {
            if (this.l) {
                Intent intent = new Intent(this, (Class<?>) TrainDetail.class);
                intent.putExtra("finish", false);
                startActivity(intent);
                return;
            }
            LogUtil.d("Suggestion_CoachActivity", "Is not after run or have next train");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v() {
        return this.f9044a.ak() && this.t;
    }

    private void s() {
        hiu.a(this.f9045b, 5);
        this.f.b(this.o);
        this.f9044a.z();
        this.f9044a.aw();
    }

    private void f() {
        this.z = 0.0f;
        this.aa = new ArrayList<>(this.u.size());
        for (Motion motion : this.u) {
            if (motion != null) {
                int iAcquireProgress = motion.acquireProgress();
                this.aa.add(motion.getRecordAction());
                float fD = hiz.d(motion, iAcquireProgress);
                this.z += fD;
                LogUtil.d("Suggestion_CoachActivity", "rate：", Float.valueOf(fD), " duration：", Float.valueOf((motion.acquireDuration() * motion.acquireGroups()) / 1000.0f), " kcal：", Float.valueOf(((((motion.acquireCalorie() * fD) * motion.acquireDuration()) * motion.acquireGroups()) * this.ac) / 1000.0f), "--stand kcal2 ", Float.valueOf(motion.acquireCalorie()), "==times: ", Float.valueOf(motion.acquireDuration()), "  weight: ", Float.valueOf(this.ac));
            }
        }
        if (njy.e(this.u)) {
            LogUtil.j("Suggestion_CoachActivity", "mMotions is empty");
            return;
        }
        this.z = (this.z * 100.0f) / this.u.size();
        hiv.a(this.h);
        getWindow().clearFlags(1024);
        getWindow().getDecorView().setSystemUiVisibility(this.g);
        g();
    }

    private void g() {
        LogUtil.a("Suggestion_CoachActivity", "save record: name:", this.v.acquireWorkoutName(), "--saveFinishRate:", Integer.valueOf((int) this.z), "--saveActualCalorie:", Integer.valueOf((int) this.mCaloriesConsumeHandler.e()), "--saveDuring:", Long.valueOf(this.f9044a.y()), "--saveExerciseTime:", Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        this.v.saveCalorie(hit.e(this.u, this.ac));
        this.v.saveExerciseTime(Calendar.getInstance().getTimeInMillis());
        dealLastPauseTime();
        this.v.saveRecordType(!TextUtils.isEmpty(this.v.acquirePlanId()) ? 1 : 0);
        this.v.saveFinishRate(this.z);
        this.v.saveActualCalorie(this.mCaloriesConsumeHandler.e());
        this.v.setActiveCalorie(this.mCaloriesConsumeHandler.d());
        if (CoachController.c().f()) {
            this.v.setDuration((int) (CoachController.c().d() * 1000.0f));
        } else {
            this.v.setDuration((int) ((System.currentTimeMillis() - this.mStartTrainTime) - this.mPauseDuration));
        }
        this.v.saveActionSummary(new Gson().toJson(this.aa));
        if (w()) {
            runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.10
                @Override // java.lang.Runnable
                public void run() {
                    CoachActivity.this.ad();
                }
            });
        } else {
            ab();
        }
    }

    private boolean w() {
        this.q = ien.e(3);
        String strE = SharedPreferenceManager.e(btx.c(), String.valueOf(101010), "privacynotremind");
        LogUtil.a("Suggestion_CoachActivity", "dialog not remind:", strE);
        LogUtil.a("Suggestion_CoachActivity", "mValid:", Boolean.valueOf(this.f9044a.ak()));
        return (!this.f9044a.ak() || this.q || "true".equals(strE)) ? false : true;
    }

    private void ab() {
        pck pckVar = new pck();
        if (CoachController.c().f()) {
            if (this.mHeartRateHandler != null) {
                this.v.saveHeartRateDataList(this.mHeartRateHandler.getHeartRateList());
                this.v.saveInvalidHeartRateList(this.mHeartRateHandler.getInvalidHeartRateList());
                pckVar.a(this.mHeartRateHandler.getAverageHeartRate());
                int[] iArrB = new int[5];
                if (!gzz.a(this.mHRZoneConfig)) {
                    LogUtil.a("Suggestion_CoachActivity", "hrZoneConfig is valid");
                    pckVar.c(Arrays.toString(this.mHRZoneConfig));
                    iArrB = gzz.b(this.mHeartRateHandler.getHeartRateList(), this.mHRZoneConfig, this.v.getDuration(), this.v.acquireHeartRateConfig());
                }
                if (gzz.a(iArrB)) {
                    LogUtil.a("Suggestion_CoachActivity", "timeArea invalid:", Arrays.toString(iArrB));
                } else {
                    pckVar.h(iArrB[0]);
                    pckVar.g(iArrB[1]);
                    pckVar.f(iArrB[2]);
                    pckVar.j(iArrB[3]);
                    pckVar.i(iArrB[4]);
                    LogUtil.a("Suggestion_CoachActivity", "save heartRate timeArea:", Arrays.toString(iArrB));
                }
            }
            pckVar.c(this.mStartTrainTime);
            pckVar.l(this.mClassifyMethod);
            pckVar.n(this.mHeartRatePosture);
        }
        if (!TextUtils.isEmpty(this.v.acquirePlanId())) {
            this.v.setPlanTrainDate(DateFormatUtil.a(this.x));
        }
        pckVar.b(this.v.acquireCategory());
        if (this.t) {
            this.v.setSportRecordType(1);
        }
        this.v.setLinkWear(this.mCaloriesConsumeHandler.c());
        this.v.saveExtend(pckVar, false);
        this.v.saveWorkoutPackageId(this.ad);
        this.v.saveCourseBelongType(this.i);
        this.v.setStartTime(this.mStartTrainTime);
        af();
        if (!TextUtils.isEmpty(this.v.acquireWorkoutId())) {
            LogUtil.a("Suggestion_CoachActivity", "workoutId:", this.v.acquireWorkoutId());
            this.mCachedThreadPool.execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.11
                @Override // java.lang.Runnable
                public void run() {
                    CoachActivity coachActivity = CoachActivity.this;
                    coachActivity.e(coachActivity.v);
                }
            });
        }
        o();
        btq.e().e("WORKOUT_FINISHED");
    }

    private void af() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hff
            @Override // java.lang.Runnable
            public final void run() {
                this.f36701c.j();
            }
        });
    }

    public /* synthetic */ void j() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_CoachActivity", "saveAndFinish, updatePlanProgress : planApi is null.");
            return;
        }
        planApi.setPlanType(0);
        planApi.updatePlanProgress(this.v);
        if (!TextUtils.isEmpty(this.v.acquirePlanId()) && !FitnessExternalUtils.b()) {
            LogUtil.a("Suggestion_CoachActivity", "planId:", this.v.acquirePlanId());
            planApi.setPlanType(3);
            planApi.updatePlanProgress(this.v);
        }
        hvp.d(0, hvp.d(this.v.startTime()));
    }

    private void o() {
        this.mCachedThreadPool.execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.13
            @Override // java.lang.Runnable
            public void run() {
                DataPlatformApi dataPlatformApi = (DataPlatformApi) Services.d("CoursePlanService", DataPlatformApi.class);
                if (dataPlatformApi == null) {
                    LogUtil.j("Suggestion_CoachActivity", "executeThread dataPlatformApi is null.");
                    return;
                }
                boolean zC = CoachActivity.this.mCaloriesConsumeHandler != null ? CoachActivity.this.mCaloriesConsumeHandler.c() : false;
                if (!zC) {
                    dataPlatformApi.insertCalorieData(CoachActivity.this.e, CoachActivity.this.v);
                    dataPlatformApi.insertCaloriePoints(CoachActivity.this.e, CoachActivity.this.mCaloriesConsumeHandler.b());
                }
                ReleaseLogUtil.d("Suggestion_CoachActivity", "executeThread isFormWear:", Boolean.valueOf(zC));
                CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                if (courseApi != null) {
                    courseApi.saveCourseTrainstatis(CoachActivity.this.v);
                }
                LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
                if (loginInit.getUsetId() != null) {
                    RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
                    if (recordApi != null) {
                        recordApi.addRecordFor(loginInit.getUsetId(), CoachActivity.this.v, true);
                    } else {
                        LogUtil.j("Suggestion_CoachActivity", "executeThread recordApi is null.");
                    }
                }
            }
        });
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.5
            @Override // java.lang.Runnable
            public void run() {
                if (!CoachActivity.this.k) {
                    if (!CoachActivity.this.r) {
                        if (!CoachActivity.this.v()) {
                            CoachActivity.this.aa();
                        }
                    } else {
                        CoachActivity.this.finish();
                        return;
                    }
                } else {
                    hcu.b().c();
                    CoachActivity.this.k = false;
                }
                if (CoachActivity.this.f9044a.i().b() == -100) {
                    CoachActivity.this.finish();
                }
            }
        });
        WorkoutRecord workoutRecord = this.v;
        LogUtil.a("Suggestion_CoachActivity", "save record and updateprocess mRecord:", workoutRecord, "  is plan: ", Boolean.valueOf(!TextUtils.isEmpty(workoutRecord.acquirePlanId())));
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        try {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, (Class<?>) FitnessResultActivity.class);
            if (getIntent() != null && getIntent().getBundleExtra("bundlekey") != null) {
                intent.putExtra("bundlekey", getIntent().getBundleExtra("bundlekey"));
            }
            bundle.putParcelable("workout_record", this.v);
            bundle.putBoolean("is_show_rpe", true);
            bundle.putLong("plan_execute_time", this.x);
            intent.putExtras(bundle);
            intent.putExtra("entrance", 0);
            startActivity(intent);
            overridePendingTransition(R.anim.left_enter_short, R.anim.activity_no_animation_short);
        } catch (BadParcelableException | ConcurrentModificationException e) {
            LogUtil.e("Suggestion_CoachActivity", "bundle putParcelable failed with BadParcelableException or ConcurrentModification", LogAnonymous.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(WorkoutRecord workoutRecord) {
        FitWorkout workout;
        LogUtil.a("Suggestion_CoachActivity", "saveFitnessDataToOdmf");
        SportServiceApi sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class);
        if (sportServiceApi == null || (workout = sportServiceApi.getWorkout(workoutRecord.acquireWorkoutId())) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        Iterator<Attribute> it = workout.acquireClasses().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getName());
            sb.append(",");
        }
        if (sb.length() >= 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        StringBuilder sb2 = new StringBuilder(16);
        Iterator<Attribute> it2 = workout.acquireTrainingpoints().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next().getName());
            sb2.append(",");
        }
        if (sb2.length() >= 1) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        int duration = workoutRecord.getDuration() / 1000;
        String strD = DateFormatUtil.d(workoutRecord.acquireExerciseTime() - (((long) duration) * 1000), DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT);
        int iCeil = (int) Math.ceil(((double) workoutRecord.acquireActualCalorie()) / 1000.0d);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("SportType", 1001);
            jSONObject.put("SportStartTime", strD);
            jSONObject.put("SportDuration", duration);
            jSONObject.put("HeatQuantity", iCeil);
            jSONObject.put("BodyBuildingType", sb.toString());
            jSONObject.put("BodyBuildingPart", sb2.toString());
            ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).saveTrackDataToOdmf(jSONObject.toString());
        } catch (JSONException e) {
            LogUtil.e("Suggestion_CoachActivity", "Jsons parse error:", LogAnonymous.b(e));
        }
    }

    public void h() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_fitness_advice_no_record_tip)).a(getString(com.huawei.ui.commonui.R.string.IDS_user_permission_know), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachActivity.this.ai();
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
        LogUtil.a("Suggestion_CoachActivity", "showNoRecordDialog.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        if (this.k) {
            hcu.b().c();
            CoachController.c().d(CoachController.StatusSource.APP, 3);
            finish();
            return;
        }
        this.f9044a.finishTrain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        iog popOutWindowInfo = userProfileMgrApi.getPopOutWindowInfo(this.e, "privacy_sport_data_");
        int iE = popOutWindowInfo.e();
        long jA = popOutWindowInfo.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iE >= 3 || jCurrentTimeMillis - jA <= com.huawei.openalliance.ad.constant.Constants.ANALYSIS_EVENT_KEEP_TIME) {
            CoachView coachView = this.f9044a;
            if (coachView != null && coachView.i() != null) {
                this.f9044a.i().b(-100);
            }
            ab();
            return;
        }
        View viewInflate = View.inflate(this.e, R.layout.sug_fitness_coach_dialog_post_data, null);
        userProfileMgrApi.setPopOutWindowInfo(this.e, "privacy_sport_data_");
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.e).b(this.e.getString(R.string.sug_coach_dialog_exit_title)).a(viewInflate).a(com.huawei.ui.commonui.R.string.IDS_common_disagree, new DialogInterface.OnClickListener() { // from class: hfe
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f36700a.e(dialogInterface, i);
            }
        }).d(com.huawei.ui.commonui.R.string.IDS_user_permission_ok, new DialogInterface.OnClickListener() { // from class: hfc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f36698c.d(dialogInterface, i);
            }
        }).b();
        this.y = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.y.show();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        ab();
        this.y.dismiss();
    }

    public /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        this.q = true;
        ien.e(3, true);
        ab();
        this.y.dismiss();
    }

    private void k() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hex
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d();
            }
        });
    }

    public /* synthetic */ void d() {
        OpAnalyticsUtil.getInstance().setEventWithActionType(5, OperationKey.HEALTH_APP_RUN_END_2050006.value());
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("actiontype", String.valueOf(5));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_PVUV_85050001.value(), linkedHashMap);
        JSONObject jSONObject = new JSONObject();
        if (this.v == null) {
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        IntPlan currentIntPlan = planApi != null ? planApi.getCurrentIntPlan() : null;
        try {
            if (hkt.c(currentIntPlan, this.v.acquirePlanId())) {
                jSONObject.put("plan_name", currentIntPlan.getMetaInfo().getName());
                jSONObject.put("type", iei.c(currentIntPlan));
            }
            if (idy.d()) {
                jSONObject.put("start_time", this.mStartTrainTime);
            }
            jSONObject.put("course_version", this.v.acquireVersion());
            jSONObject.put("calories", (int) this.v.acquireActualCalorie());
            jSONObject.put("duration", this.v.getDuration());
            jSONObject.put("isAICourse", iei.d(this.v));
            WorkoutRecordViewModel.e(getIntent(), jSONObject);
            this.v.getBiJson(jSONObject);
            HashMap map = new HashMap(1);
            map.put("data", jSONObject.toString());
            idy.b("1120005", map);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_CoachActivity", "e = ", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity, com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("Suggestion_CoachActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (isSupportFoldingModel()) {
            String foldableState = HwScreenFoldDisplayMode.getFoldableState();
            this.o = foldableState;
            if ("HORIZONTAL_FOLDING_MODE".equals(foldableState)) {
                reloadView(this.o);
            }
        }
        if (gzx.e(this.f9044a)) {
            if (this.f9044a.getVisibility() == 0) {
                getWindow().getDecorView().setSystemUiVisibility(q());
            }
            if (!isLanguageChange() && this.m) {
                if (this.f9044a.i().b() == 192) {
                    LogUtil.a("Suggestion_CoachActivity", "onResume() play again");
                    this.f9044a.i().b(this.f9044a.x());
                    this.f9044a.f().setVisibility(4);
                }
                this.f9044a.ao();
            }
        }
        super.onResume();
        c(this.e, true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ReleaseLogUtil.d("Suggestion_CoachActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        if (gzx.e(this.f9044a)) {
            if (this.f9044a.an()) {
                this.m = true;
            } else {
                this.m = false;
            }
            this.f9044a.as();
        }
        super.onPause();
        c(this.e, false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity, com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("Suggestion_CoachActivity", "onDestroy");
        setRequestedOrientation(1);
        if (this.v != null) {
            hcb.a().onChange(this.v.acquireWorkoutId(), 3, null);
        }
        this.f9044a.ar();
        super.onDestroy();
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("Suggestion_CoachActivity", "onDestroy recordApi is null.");
            return;
        }
        recordApi.unregisterResultCallback();
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi != null) {
            courseApi.markFitnessCourseStatusAvailable();
        }
        CourseEquipmentViewModel courseEquipmentViewModel = this.j;
        if (courseEquipmentViewModel != null) {
            courseEquipmentViewModel.b(this);
            this.j.unregisterAll();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("Suggestion_CoachActivity", "onActivityResult ", Integer.valueOf(i), " ", Integer.valueOf(i2), " ", intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.f9044a == null) {
            LogUtil.e("Suggestion_CoachActivity", "mCoachView is null.");
            return;
        }
        if (CoachController.c().i() && !this.f9044a.ak()) {
            LogUtil.a("Suggestion_CoachActivity", "showNoRecordDialog.");
            if (this.m) {
                this.m = false;
                this.f9044a.av();
            }
            h();
            hiu.c(this.f9045b, 5, CoachController.StatusSource.NEW_LINK_WEAR);
            return;
        }
        this.f9044a.finishTrain();
        hiu.c(this.f9045b, 3, CoachController.StatusSource.NEW_LINK_WEAR);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    protected void refreshHeart() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hez
            @Override // java.lang.Runnable
            public final void run() {
                this.f36696c.e();
            }
        });
    }

    public /* synthetic */ void e() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        this.mClassifyMethod = gzz.d(this.mHeartRatePosture);
        gzz.a();
        this.mHRZoneConfig = gzz.d(this.mClassifyMethod, userProfileMgrApi.getLocalUserInfo(), this.mHeartRatePosture);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    protected void initStatusHandler() {
        this.mStatusHandler = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.fitness.activity.CoachActivity.4
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null || CoachActivity.this.f9044a == null) {
                    LogUtil.e("Suggestion_CoachActivity", "message null.or mCoachView null");
                    return;
                }
                super.handleMessage(message);
                int iB = CoachActivity.this.f9044a.i().b();
                int i = message.what;
                if (i == 1) {
                    if (iB == 194 || iB == 195 || (iB == 193 && !CoachController.c().h())) {
                        CoachActivity.this.m();
                    } else {
                        if (CoachActivity.this.f.c()) {
                            CoachActivity.this.f.b();
                        }
                        CoachActivity.this.f9044a.au();
                    }
                    hiu.c(CoachActivity.this.f9045b, 2, CoachController.StatusSource.NEW_LINK_WEAR);
                    return;
                }
                if (i == 2) {
                    CoachActivity.this.f9044a.av();
                    hiu.c(CoachActivity.this.f9045b, 1, CoachController.StatusSource.NEW_LINK_WEAR);
                } else {
                    if (i != 3) {
                        CoachActivity.this.e(message);
                        return;
                    }
                    if (iB == 194 || iB == 195 || iB == 193) {
                        CoachActivity.this.m();
                        CoachActivity.this.f9044a.z();
                    }
                    CoachActivity.this.z();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        if (!(message.obj instanceof CourseStateProto.CourseState)) {
            LogUtil.j("Suggestion_CoachActivity", "handleMessageOne msg.obj !instanceof CourseStateProto.CourseState");
            return;
        }
        CourseStateProto.CourseState courseState = (CourseStateProto.CourseState) message.obj;
        int i = message.what;
        if (i == 5) {
            n();
            return;
        }
        if (i == 6) {
            CoachView coachView = this.f9044a;
            coachView.b(coachView.m(), true, CoachController.StatusSource.NEW_LINK_WEAR);
        } else if (i == 8 && this.mVolumeInteractive != null) {
            this.mVolumeInteractive.a(courseState.getCurrentVolume());
            if (this.mVolumeInteractive.a()) {
                CoachController.c().e(CoachController.StatusSource.APP, courseState.toBuilder());
            }
        }
    }

    private void n() {
        CoachView coachView = this.f9044a;
        if (coachView == null) {
            LogUtil.j("Suggestion_CoachActivity", "changeToNextAction: mCoachView == null");
            return;
        }
        LogUtil.a("Suggestion_CoachActivity", "changeToNextAction getTrainStation:", Integer.valueOf(coachView.getTrainStation()), "mTempStation:", Integer.valueOf(this.f9044a.x()));
        if (this.f9044a.getTrainStation() == 193) {
            this.f9044a.al();
        } else if (this.f9044a.x() == 193 && this.f9044a.getTrainStation() == 192) {
            this.f9044a.al();
        } else {
            CoachView coachView2 = this.f9044a;
            coachView2.b(coachView2.n(), false, CoachController.StatusSource.NEW_LINK_WEAR);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    public CoachViewInterface getCoachView() {
        return this.f9044a;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setTahitiModelOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setDefaultOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        LogUtil.a("Suggestion_CoachActivity", "onConfigurationChanged, orientation = ", Integer.valueOf(i));
        if (isSupportFoldingModel()) {
            this.f9044a.d(this.o);
        }
        if (qrs.af(this.e) || i != 1) {
            return;
        }
        setRequestedOrientation(0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        LogUtil.a("Suggestion_CoachActivity", "onMultiWindowModeChanged isInMultiWindowMode: ", Boolean.valueOf(z));
        ah();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        CoachView coachView = this.f9044a;
        if (coachView == null || coachView.t() == null) {
            LogUtil.j("Suggestion_CoachActivity", "changeVideoChanged mCoachView == null || mCoachView.acquireMediaHelper() == null");
        } else {
            this.f9044a.post(new Runnable() { // from class: hew
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.i();
                }
            });
        }
    }

    public /* synthetic */ void i() {
        MediaPlayer mediaPlayerS = this.f9044a.t().s();
        if (mediaPlayerS == null) {
            LogUtil.j("Suggestion_CoachActivity", "changeVideoChanged mediaPlayer == null");
        } else {
            this.f9044a.t().b(mediaPlayerS, mediaPlayerS.getVideoWidth(), mediaPlayerS.getVideoHeight());
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    protected WorkoutRecord getCurrentWorkout() {
        return this.v;
    }

    private void y() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("KEY_INTENT_EQUIPMENT_TYPE", 0);
        this.n = intExtra;
        if (intExtra != 3) {
            return;
        }
        this.t = true;
        this.f9044a.setCaloreHeartViewsVisibility(0);
        x();
    }

    private void x() {
        CourseEquipmentViewModel courseEquipmentViewModel = (CourseEquipmentViewModel) new ViewModelProvider(this).get(CourseEquipmentViewModel.class);
        this.j = courseEquipmentViewModel;
        WorkoutRecord workoutRecord = this.v;
        if (workoutRecord == null) {
            LogUtil.j("Suggestion_CoachActivity", "initEquipmentViewModel mRecord == null");
            this.j.d(this.n, "", "");
        } else {
            courseEquipmentViewModel.d(this.n, workoutRecord.acquireWorkoutId(), this.v.acquireWorkoutName());
        }
        this.j.a(this.ab);
        this.j.observeSportLifeCycle("Suggestion_CoachActivity", this);
        emh.b().c(new SkippingTargetMode(9, 0, null));
        this.j.onStartSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j("Suggestion_CoachActivity", "notifyUpdateItemData bundle == null");
            return;
        }
        int i = bundle.getInt("fitnessRopeSpeed");
        int i2 = bundle.getInt("fitnessTime");
        int i3 = bundle.getInt("fitnessStumbling");
        int i4 = bundle.getInt("fitnessContinuousSkippingJump");
        int i5 = bundle.getInt("fitnessRopeTotalNumber");
        LogUtil.a("Suggestion_CoachActivity", "notifyUpdateItemData speed: ", Integer.valueOf(i), " time:", Integer.valueOf(i2), " stumbling:", Integer.valueOf(i3), " num:", Integer.valueOf(i4), " totalNumber: ", Integer.valueOf(i5));
        this.f9044a.c(i5, i);
        int i6 = bundle.getInt("fitnessCalories");
        LogUtil.a("Suggestion_CoachActivity", "notifyUpdateItemData kiloCalories: ", Integer.valueOf(i6));
        float f = i6 * 1000.0f;
        this.mCaloriesConsumeHandler.a(f, f, CaloriesConsumeHandler.CaloriesSource.EQUIPMENT);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        LogUtil.a("Suggestion_CoachActivity", "onStopSport mIsFinishPageHasBeenShowed:", Boolean.valueOf(this.p));
        if (this.p) {
            return;
        }
        this.p = true;
        this.f9044a.post(new Runnable() { // from class: hfa
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    public /* synthetic */ void c() {
        this.f9044a.finishTrain();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        LogUtil.a("Suggestion_CoachActivity", "onResumeSport SportStatus=", Integer.valueOf(this.j.getSportStatus()), " isPlaying:", Boolean.valueOf(this.f9044a.t().o()));
        this.j.onResumeSport();
        if (this.f9044a.getTrainStation() == 194) {
            m();
        } else {
            if (this.f9044a.t().o()) {
                return;
            }
            this.f9044a.post(new Runnable() { // from class: hfd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36699b.a();
                }
            });
        }
    }

    public /* synthetic */ void a() {
        this.f9044a.au();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        LogUtil.a("Suggestion_CoachActivity", "onPauseSport SportStatus=", Integer.valueOf(this.j.getSportStatus()), " isPlaying:", Boolean.valueOf(this.f9044a.t().o()));
        this.j.onPauseSport();
        if (this.f9044a.t().o()) {
            this.f9044a.post(new Runnable() { // from class: hfb
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b();
                }
            });
        }
    }

    public /* synthetic */ void b() {
        this.f9044a.av();
    }
}
