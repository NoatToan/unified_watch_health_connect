package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.exoplayer.ExoPlayer;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sportservice.SportBleStatus;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.protobuf.CourseStateProto;
import com.huawei.health.suggestion.ui.fitness.helper.HwScreenFoldDisplayMode;
import com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.health.suggestion.ui.fitness.module.CoachWifiBroadcastReceiver;
import com.huawei.health.suggestion.ui.fitness.module.LongCoachView;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.fitness.module.OnLongVideoChangeListener;
import com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener;
import com.huawei.health.suggestion.ui.fitness.mvp.CaloriesConsumeHandler;
import com.huawei.health.suggestion.ui.fitness.viewmodel.CourseEquipmentViewModel;
import com.huawei.health.suggestion.ui.fitness.viewmodel.WorkoutRecordViewModel;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.tencent.connect.share.QzonePublish;
import defpackage.btq;
import defpackage.btx;
import defpackage.buh;
import defpackage.gzx;
import defpackage.gzz;
import defpackage.hcb;
import defpackage.hcu;
import defpackage.hit;
import defpackage.hiu;
import defpackage.hiv;
import defpackage.hjg;
import defpackage.hjt;
import defpackage.hjy;
import defpackage.iei;
import defpackage.ien;
import defpackage.iog;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.xkf;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class LongCoachActivity extends BaseCoachActivity implements SportLifecycle, SportBleStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CoachData f9120a;
    private CustomAlertDialog aa;
    private String ab;
    private int ad;
    private float ae;
    private hjt af;
    private String ag;
    private BroadcastReceiver ah;
    private WorkoutRecordViewModel ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LongCoachView f9121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9122c;
    private String e;
    private int f;
    private Context g;
    private CourseEquipmentViewModel h;
    private int i;
    private int j;
    private boolean k;
    private hjt l;
    private int n;
    private Map<Long, Integer> o;
    private boolean r;
    private boolean u;
    private long v;
    private List<Motion> y;
    private boolean p = false;
    private boolean q = false;
    private boolean w = false;
    private boolean s = false;
    private boolean t = false;
    private Observer<Bundle> ac = new Observer() { // from class: com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity$$ExternalSyntheticLambda11
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.f9123c.e((Bundle) obj);
        }
    };
    private hiu.d d = new hiu.d();
    private String m = "NORMAL_MODE";
    private boolean x = false;
    private BroadcastReceiver z = new BroadcastReceiver() { // from class: com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity.10
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("Suggestion_LongCoachActivity", "intent is null");
                return;
            }
            ReleaseLogUtil.d("Suggestion_LongCoachActivity", "action=", intent.getAction(), " type=", intent.getStringExtra("sync_data_result_type"), " sync_id=", Long.valueOf(intent.getLongExtra("sync_data_result_id", 0L)), " result=", Boolean.valueOf(intent.getBooleanExtra("sync_data_result_success", true)));
        }
    };

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public int setLoadingBackgroundColor() {
        return 0;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        LogUtil.a("Suggestion_LongCoachActivity", "onMultiWindowModeChanged isInMultiWindowMode: ", Boolean.valueOf(z));
        al();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        LongCoachView longCoachView = this.f9121b;
        if (longCoachView == null || longCoachView.f() == null) {
            LogUtil.j("Suggestion_LongCoachActivity", "changeVideoChanged mCoachView == null || mCoachView.acquireMediaHelper() == null");
        } else {
            this.f9121b.post(new Runnable() { // from class: hge
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36722b.f();
                }
            });
        }
    }

    public /* synthetic */ void f() {
        ExoPlayer exoPlayerQ = this.f9121b.f().q();
        if (exoPlayerQ == null) {
            LogUtil.j("Suggestion_LongCoachActivity", "changeVideoChanged mediaPlayer == null");
        } else {
            this.f9121b.f().a(exoPlayerQ.getVideoSize());
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    public void reloadView(final String str) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity.5
            @Override // java.lang.Runnable
            public void run() {
                LongCoachActivity.this.m = str;
                LongCoachActivity.this.f9121b.b(LongCoachActivity.this.m);
                LongCoachActivity.this.al();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public String getCurrFoldModel() {
        return this.m;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity, com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi != null) {
            courseApi.markFitnessCourseStatusOccupied();
        }
        super.onCreate(bundle);
        clearBackgroundDrawable();
        getWindow().addFlags(1152);
        this.g = this;
        this.mStartTrainTime = System.currentTimeMillis();
        this.o = new HashMap(10);
        setVolumeControlStream(3);
        this.f = getWindow().getDecorView().getSystemUiVisibility();
        y();
        w();
        if (!qrs.af(this.g)) {
            setRequestedOrientation(0);
        }
        q();
        startPlay();
        this.f9121b.setValidListener(new Consumer() { // from class: hgi
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.d.c((Boolean) obj);
            }
        });
    }

    public /* synthetic */ void c(Boolean bool) {
        if (bool.booleanValue()) {
            LogUtil.a("Suggestion_LongCoachActivity", "save video");
            ab();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        this.f9121b.ao();
        this.f9121b.ar();
        if (qrs.af(this.g)) {
            return;
        }
        setRequestedOrientation(0);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_fitness_activity_coach_long_video);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public int getLoadingLayoutId() {
        return com.huawei.health.basefitnessadvice.R.layout.sug_loading_layout;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        this.f9121b = (LongCoachView) findViewById(R.id.sug_fitness_long_coach_view);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    protected boolean isNotSupportFitnessLinkage() {
        return this.t || this.r;
    }

    private void q() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                intent.getIntExtra("coachstartposition", 0);
                this.k = intent.getBooleanExtra("havenexttrain", false);
                boolean booleanExtra = intent.getBooleanExtra("isafterrun", false);
                this.p = booleanExtra;
                LogUtil.a("Suggestion_LongCoachActivity", "initCoachData mIsAfterRun = ", Boolean.valueOf(booleanExtra));
                this.v = intent.getLongExtra("plan_execute_time", 0L);
                if (intent.getParcelableExtra(ContentTemplateRecord.MOTIONS) != null) {
                    CoachData coachData = (CoachData) intent.getParcelableExtra(ContentTemplateRecord.MOTIONS);
                    this.f9120a = coachData;
                    checkBreachStatus(coachData);
                }
                this.f9122c = intent.getIntExtra("commodityFlag", 0);
                this.u = intent.getBooleanExtra("ISPLANFIT", false);
                this.ag = intent.getStringExtra("workout_package_id");
                this.ad = intent.getIntExtra(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, 0);
                this.ab = intent.getStringExtra("resource_type");
                this.j = intent.getIntExtra("course_belong_type", 0);
                if (a(intent)) {
                    return;
                }
                if (intent.getBooleanExtra("islinkedfitness", false)) {
                    this.f9121b.setDeviceConnected();
                }
                f(intent);
                e(intent);
                c(intent);
                d(intent);
            } catch (Exception e) {
                LogUtil.e("Suggestion_LongCoachActivity", LogAnonymous.b(e));
            }
        }
        e(this.i);
        ai();
        this.ae = hjg.a();
        this.mCaloriesConsumeHandler = new CaloriesConsumeHandler(CoachController.c().f(), this.r, new a(this.f9121b));
        this.f9121b.setCaloriesConsumeHandler(this.mCaloriesConsumeHandler);
        b(intent);
    }

    public static class a implements CaloriesConsumeHandler.CaloriesRefreshCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<LongCoachView> f9127a;

        a(LongCoachView longCoachView) {
            this.f9127a = new WeakReference<>(longCoachView);
        }

        @Override // com.huawei.health.suggestion.ui.fitness.mvp.CaloriesConsumeHandler.CaloriesRefreshCallback
        public void onRefresh(final float f) {
            final LongCoachView longCoachView;
            WeakReference<LongCoachView> weakReference = this.f9127a;
            if (weakReference == null || (longCoachView = weakReference.get()) == null) {
                return;
            }
            if (HandlerExecutor.c()) {
                longCoachView.c(f);
            } else {
                HandlerExecutor.b(new Runnable() { // from class: hgs
                    @Override // java.lang.Runnable
                    public final void run() {
                        longCoachView.c(f);
                    }
                });
            }
        }
    }

    private void ai() {
        CoachData coachData = this.f9120a;
        if (coachData != null) {
            this.f9121b.d(FitWorkout.acquireComeFrom(coachData.acquireWorkId()));
            this.f9121b.setCalorieStartTime(this.f9120a.getCalorieStartTime());
            ReleaseLogUtil.d("Suggestion_LongCoachActivity", "settingCoachView calorieStartTime:", Integer.valueOf(this.f9120a.getCalorieStartTime()));
        }
        hcb.a().onChange(this.ai.d().acquireWorkoutId(), 5, null);
        this.f9121b.setMotions(this.y);
        this.f9121b.t();
        final String strE = buh.e("is_first_to_coachacitivyt");
        runOnUiThread(new Runnable() { // from class: hgn
            @Override // java.lang.Runnable
            public final void run() {
                this.f36726a.b(strE);
            }
        });
    }

    public /* synthetic */ void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f9121b.a(true);
            buh.d("is_first_to_coachacitivyt", "notfirst");
        }
        updateViewController();
    }

    private void e(Intent intent) {
        String strAcquireWorkId;
        CoachData coachData = this.f9120a;
        if (coachData == null) {
            strAcquireWorkId = "";
        } else {
            strAcquireWorkId = coachData.acquireWorkId();
        }
        hiu.d dVarC = hiu.c(intent, this.e, strAcquireWorkId, iei.d(this.ai.d()));
        this.d = dVarC;
        if (this.f9121b != null) {
            dVarC.d(this.f9122c);
            this.f9121b.c(this.d);
        }
    }

    private void d(Intent intent) {
        if (!intent.hasExtra("IS_SUPPORT_RECORD") || intent.getIntExtra("IS_SUPPORT_RECORD", 0) == 0) {
            return;
        }
        getWindow().addFlags(8192);
        this.f9121b.setScreenCastVisibility(8);
    }

    private void c(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("equipment_course", false);
        this.i = intent.getIntExtra("KEY_INTENT_COURSE_ENTRANCE", 0);
        int intExtra = intent.getIntExtra("KEY_INTENT_EQUIPMENT_TYPE", 0);
        this.n = intExtra;
        LogUtil.a("Suggestion_LongCoachActivity", "initCoachData isEquipmentCourse = ", Boolean.valueOf(booleanExtra), " mCourseEntrance = ", Integer.valueOf(this.i), " mEquipmentType = ", Integer.valueOf(intExtra));
        boolean z = booleanExtra || this.i == 1;
        this.f9121b.setEquipmentCourseAndType(z, this.n);
        if (this.i == 1 && !this.t) {
            this.r = true;
            r();
        }
        if (!z || this.i == 1) {
            return;
        }
        JumpConnectHelper.c().e(true);
        LogUtil.a("Suggestion_LongCoachActivity", "initEquipmentData setLongCoachActivityRunning true");
    }

    private void r() {
        this.h = (CourseEquipmentViewModel) new ViewModelProvider(this).get(CourseEquipmentViewModel.class);
        WorkoutRecordViewModel workoutRecordViewModel = this.ai;
        if (workoutRecordViewModel == null || workoutRecordViewModel.d() == null) {
            LogUtil.j("Suggestion_LongCoachActivity", "initEquipmentViewModel mWorkoutRecordViewModel null");
            this.h.d(this.n, "", this.e);
        } else {
            this.h.d(this.n, this.ai.d().acquireWorkoutId(), this.e);
        }
        this.h.a(this.ac);
        this.f9121b.a(this.n);
        this.h.observeSportLifeCycle("Suggestion_LongCoachActivity", this);
        this.h.b((SportBleStatus) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j("Suggestion_LongCoachActivity", "notifyUpdateItemData bundle == null");
            return;
        }
        int i = bundle.getInt("fitnessCalories");
        LogUtil.a("Suggestion_LongCoachActivity", "notifyUpdateItemData kiloCalories: ", Integer.valueOf(i));
        float f = i * 1000.0f;
        this.mCaloriesConsumeHandler.a(f, f, CaloriesConsumeHandler.CaloriesSource.EQUIPMENT);
        this.f9121b.b(bundle);
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onConnected() {
        qpx.b(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_equip_blutooth_connected));
        LongCoachView longCoachView = this.f9121b;
        if (longCoachView != null) {
            longCoachView.setBlutoothConnected(true);
        }
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onInterrupted() {
        qpx.b(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_equip_blutooth_disconnected));
        LongCoachView longCoachView = this.f9121b;
        if (longCoachView != null) {
            longCoachView.setBlutoothConnected(false);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        this.f9121b.aw();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        this.f9121b.au();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        this.f9121b.aq();
    }

    private void f(Intent intent) {
        String stringExtra = intent.getStringExtra("coach_detail_picture");
        this.e = intent.getStringExtra("coach_detail_name");
        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(this.e)) {
            this.f9121b.setCoachPictureAndName(stringExtra, this.e);
        }
        int intExtra = intent.getIntExtra("long_coach_type", 3);
        this.t = FitWorkout.b.c(intExtra);
        this.f9121b.setVideoType(intExtra);
        this.f9121b.setVideoUrl(intent.getStringExtra("long_coach_video_url"));
        String stringExtra2 = intent.getStringExtra("long_coach_subtitle_url");
        LogUtil.a("Suggestion_LongCoachActivity", "subtitlesUrl null:", Boolean.valueOf(TextUtils.isEmpty(stringExtra2)));
        if (!TextUtils.isEmpty(stringExtra2)) {
            this.f9121b.setSrtFile(new File(xkf.n(stringExtra2)));
        }
        String backgroundMusicUrl = this.f9120a.getBackgroundMusicUrl();
        if (TextUtils.isEmpty(backgroundMusicUrl)) {
            LogUtil.a("Suggestion_LongCoachActivity", "backgroundUrl isEmpty");
        } else {
            this.f9121b.e(backgroundMusicUrl);
        }
    }

    private void b(Intent intent) {
        if (intent == null) {
            LogUtil.j("Suggestion_LongCoachActivity", "initShowCalorieOrHearRateView intent null");
            return;
        }
        if (this.t) {
            this.f9121b.c(0);
            this.f9121b.g(0);
            this.f9121b.setHeartRateAndCalorieVisibility(4);
            return;
        }
        this.f9121b.c(intent.getIntExtra("long_coach_need_calories", 0));
        boolean zAk = this.f9121b.ak();
        this.f9121b.g(intent.getIntExtra("long_coach_need_heart_rate", 0));
        if (zAk) {
            this.f9121b.setHeartRateAndCalorieVisibility(0);
        } else {
            this.f9121b.setHeartRateAndCalorieVisibility(4);
        }
    }

    private void e(int i) {
        int i2;
        this.l = hjt.d(this);
        if (i == 1) {
            i2 = R.layout.sug_fitness_coach_dialog_equipment_exit;
        } else {
            i2 = R.layout.sug_fitness_coach_dialog_exit;
        }
        this.l.b(i2).e(R.id.sug_coach_dialog_No, new View.OnClickListener() { // from class: hgk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36724c.e(view);
            }
        }).e(R.id.sug_coach_dialog_yse, new View.OnClickListener() { // from class: hgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
        this.l.a().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hgr
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f36729b.c(dialogInterface);
            }
        });
        s();
    }

    public /* synthetic */ void e(View view) {
        getWindow().getDecorView().setSystemUiVisibility(hjy.a());
        hiu.a(this.d, 7);
        this.f9121b.setClickStop(false);
        this.l.b();
        this.f9121b.ay();
    }

    public /* synthetic */ void c(View view) {
        this.l.b();
        hiu.a(this.d, 6);
        this.q = true;
        LongCoachView longCoachView = this.f9121b;
        if (longCoachView == null) {
            return;
        }
        longCoachView.av();
        if (this.q) {
            this.q = false;
            if (this.p) {
                hcu.b().c();
                CoachController.c().d(CoachController.StatusSource.APP, 3);
                finish();
                return;
            }
            this.f9121b.finishTrain();
        }
    }

    public /* synthetic */ void c(DialogInterface dialogInterface) {
        getWindow().getDecorView().setSystemUiVisibility(hjy.a());
        this.l.b();
        this.f9121b.ay();
    }

    private void s() {
        hjt hjtVarD = hjt.d(this);
        this.af = hjtVarD;
        hjtVarD.e(R.layout.sug_fitness_coach_dialog_exit).e(R.id.sug_dialog_tv_content, R.string.IDS_FitnessAdvice_use_rate_of_flow).d(R.id.sug_coach_dialog_yse, com.huawei.ui.commonui.R.string.IDS_apphelp_pwindows_continue_button).e(R.id.sug_coach_dialog_No, new View.OnClickListener() { // from class: hgg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        }).e(R.id.sug_coach_dialog_yse, new View.OnClickListener() { // from class: hgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36723c.a(view);
            }
        });
        this.af.a().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hgo
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f36727a.e(dialogInterface);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        getWindow().getDecorView().setSystemUiVisibility(hjy.a());
        this.af.b();
        CoachController.c().d(CoachController.StatusSource.APP, 3);
        this.f9121b.finishTrain();
        finish();
    }

    public /* synthetic */ void a(View view) {
        getWindow().getDecorView().setSystemUiVisibility(hjy.a());
        this.af.b();
        this.q = true;
        this.f9121b.setHasRemindMobileConnected(true);
        this.f9121b.ar();
        LogUtil.a("Suggestion_LongCoachActivity", "initWifiDialog isHasRemindMobileConnected true");
    }

    public /* synthetic */ void e(DialogInterface dialogInterface) {
        getWindow().getDecorView().setSystemUiVisibility(hjy.a());
        CoachController.c().d(CoachController.StatusSource.APP, 3);
        finish();
    }

    private boolean a(Intent intent) {
        WorkoutRecord workoutRecord = (WorkoutRecord) intent.getParcelableExtra("workoutrecord");
        WorkoutRecordViewModel workoutRecordViewModel = (WorkoutRecordViewModel) new ViewModelProvider(this).get(WorkoutRecordViewModel.class);
        this.ai = workoutRecordViewModel;
        workoutRecordViewModel.b(workoutRecord);
        CoachData coachData = this.f9120a;
        if (coachData == null || workoutRecord == null) {
            LogUtil.j("Suggestion_LongCoachActivity", "checkCoachData() mCoachData,mRecord is null");
            finish();
            return true;
        }
        List<Motion> listAcquireMotions = coachData.acquireMotions();
        this.y = listAcquireMotions;
        if (listAcquireMotions != null) {
            return false;
        }
        LogUtil.j("Suggestion_LongCoachActivity", "checkCoachData() mMotions is null");
        finish();
        return true;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void updateViewController() {
        this.f9121b.b(new OnMotionChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity.3
            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionOver(Motion motion, int i) {
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionReady(Motion motion, int i) {
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionChanged(Motion motion, int i) {
                LogUtil.d("Suggestion_LongCoachActivity", "motionChanged()", Integer.valueOf(i));
                LongCoachActivity.this.mPlayEndTime = System.currentTimeMillis();
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionStart(Motion motion, int i) {
                LongCoachActivity.this.mPlayStartTime = System.currentTimeMillis();
                ReleaseLogUtil.d("Suggestion_LongCoachActivity", "onMotionStart()", Integer.valueOf(i));
                LongCoachActivity.this.mIsPauseStatus = false;
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionPause(Motion motion, int i) {
                LongCoachActivity.this.mIsPauseStatus = true;
                LongCoachActivity.this.mPauseTrainTime = System.currentTimeMillis();
                LongCoachActivity.this.ad();
                ReleaseLogUtil.d("Suggestion_LongCoachActivity", "onMotionPause()", Integer.valueOf(i), "mPauseTrainTime:", Long.valueOf(LongCoachActivity.this.mPauseTrainTime));
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onMotionContinue(Motion motion, int i) {
                ReleaseLogUtil.d("Suggestion_LongCoachActivity", "onMotionContinue:", motion.acquireName(), "position:", Integer.valueOf(i));
                LongCoachActivity.this.mPlayStartTime = System.currentTimeMillis();
                LongCoachActivity.this.dealLastPauseTime();
                LongCoachActivity.this.mIsPauseStatus = false;
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onGroupFinish(Motion motion, int i, int i2) {
                LogUtil.d("Suggestion_LongCoachActivity", "onGroupFinish() A group of action completed, Total: ", Integer.valueOf(i2));
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onTrainOver(boolean z) {
                if (z && LongCoachActivity.this.f9121b != null && !LongCoachActivity.this.f9121b.z()) {
                    hiu.a(LongCoachActivity.this.d, 4);
                }
                LongCoachActivity.this.d(z);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnMotionChangeListener
            public void onCustomBeave() {
                LongCoachActivity.this.k();
            }
        });
        ac();
        finishLoading();
    }

    private void ac() {
        this.f9121b.setLongVideoChangeListener(new OnLongVideoChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity.2
            @Override // com.huawei.health.suggestion.ui.fitness.module.OnLongVideoChangeListener
            public void onLongExplanationVideoComplete(int i, int i2) {
                if (i2 > 0) {
                    LongCoachActivity.this.ai.a(Math.min(i, i2), i2, LongCoachActivity.this.getIntent(), LongCoachActivity.this.mStartTrainTime);
                    LongCoachActivity.this.finish();
                } else {
                    LongCoachActivity.this.finish();
                }
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnLongVideoChangeListener
            public void onLongExerciseVideoComplete(long j, int i) {
                if (i > 0) {
                    LongCoachActivity.this.ai.a(j, i, LongCoachActivity.this.getIntent(), LongCoachActivity.this.mStartTrainTime);
                } else {
                    LongCoachActivity.this.finish();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (!this.t && this.i == 1 && t()) {
            LogUtil.a("Suggestion_LongCoachActivity", "setTrainOver onStopSport");
            this.h.m825x32b3e3a1();
        }
        LogUtil.a("Suggestion_LongCoachActivity", "setTrainOver isValid: ", Boolean.valueOf(z));
        if (this.t) {
            LogUtil.a("Suggestion_LongCoachActivity", "setTrainOver isExplainCourse");
            finish();
        } else {
            if (!z) {
                if (v()) {
                    return;
                }
                LogUtil.a("Suggestion_LongCoachActivity", "setTrainOver finish()");
                finish();
                return;
            }
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        this.mPlayEndTime = System.currentTimeMillis();
        if (this.mPlayStartTime == 0 || this.mHeartRateHandler != null) {
            return;
        }
        LogUtil.d("Suggestion_LongCoachActivity", "saveFitnessIntensityToMap() mPlayStartTime != 0");
        hiv.c(this.o, this.mPlayStartTime, this.mPlayEndTime);
        u();
    }

    private void u() {
        this.mPlayStartTime = 0L;
        this.mPlayEndTime = 0L;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f9121b == null) {
            LogUtil.e("Suggestion_LongCoachActivity", "onBackPressed mCoachView null.");
            return;
        }
        if (p()) {
            return;
        }
        if (l()) {
            if (this.f9121b.am()) {
                hiu.a(this.d, 3);
            }
            this.f9121b.setClickStop(true);
            k();
            return;
        }
        i();
    }

    private boolean p() {
        LongCoachView longCoachView = this.f9121b;
        if (longCoachView == null || !longCoachView.ae()) {
            return false;
        }
        LogUtil.a("Suggestion_LongCoachActivity", "onBackPressed isLocked true");
        return true;
    }

    private void i() {
        LongCoachView longCoachView = this.f9121b;
        if (longCoachView != null) {
            longCoachView.aa();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (!this.f9121b.am() && !this.t) {
            m();
        } else {
            this.f9121b.finishTrain();
        }
    }

    private boolean t() {
        CourseEquipmentViewModel courseEquipmentViewModel = this.h;
        return (courseEquipmentViewModel == null || courseEquipmentViewModel.getSportStatus() == 3) ? false : true;
    }

    private boolean l() {
        return this.f9121b.getTrainStation() == 191 || this.f9121b.getTrainStation() == 190;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (((this.p && this.f9121b.am()) || x()) && !this.x) {
            this.x = true;
            hcu.b().c();
        } else if (this.k) {
            Intent intent = new Intent(this, (Class<?>) TrainDetail.class);
            intent.putExtra("finish", false);
            startActivity(intent);
        } else {
            LogUtil.d("Suggestion_LongCoachActivity", "finish() is not after run or have next train");
        }
        setRequestedOrientation(1);
    }

    private boolean x() {
        return this.f9121b.am() && this.r;
    }

    private void m() {
        LogUtil.a("Suggestion_LongCoachActivity", "ifExits");
        hiu.a(this.d, 5);
        this.l.b(this.m);
        this.f9121b.ax();
        this.f9121b.ba();
    }

    private void g() {
        dealLastPauseTime();
        this.ai.e(this.y, this.f9120a, this.mStartTrainTime, this.mPauseDuration, this.mLoadingDuration);
        if (!this.r && !this.t) {
            LogUtil.d("Suggestion_LongCoachActivity", "calculateTrain() saveFitnessIntensityToMap");
            z();
        }
        getWindow().clearFlags(1024);
        getWindow().getDecorView().setSystemUiVisibility(this.f);
        j();
    }

    private void z() {
        this.mPlayEndTime = System.currentTimeMillis();
        if (this.mHeartRateHandler != null && njy.b(this.mHeartRateHandler.getHeartRateList())) {
            hiv.e(this.o, this.mHeartRateHandler.getHeartRateList(), this.mIntensityHeartRateThreshold);
        } else if (this.mPlayStartTime != 0) {
            hiv.c(this.o, this.mPlayStartTime, this.mPlayEndTime);
        } else {
            LogUtil.j("Suggestion_LongCoachActivity", "saveIntensityToMap() no saveFitnessIntensityToMap");
        }
        hiv.a(this.o);
    }

    private void j() {
        this.ai.e(this.mCaloriesConsumeHandler.e(), this.mCaloriesConsumeHandler.d(), hit.e(this.y, this.ae), this.r);
        if (v()) {
            LogUtil.a("Suggestion_LongCoachActivity", "analyzeData showPrivacyDialog");
            runOnUiThread(new Runnable() { // from class: hgl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36725c.d();
                }
            });
        } else {
            LogUtil.a("Suggestion_LongCoachActivity", "analyzeData saveAndFinish");
            aa();
        }
    }

    private boolean v() {
        this.w = ien.e(3);
        String strE = SharedPreferenceManager.e(btx.c(), String.valueOf(101010), "privacynotremind");
        LogUtil.a("Suggestion_LongCoachActivity", "isNeedDialog() dialog not remind:", strE, "mValid:", Boolean.valueOf(this.f9121b.am()));
        return (!this.f9121b.am() || this.w || "true".equals(strE)) ? false : true;
    }

    private void aa() {
        this.ai.a(this.ag, this.j);
        WorkoutRecord workoutRecordE = this.ai.e(this.mHeartRateHandler, this.mStartTrainTime, this.mClassifyMethod, this.v, this.mHeartRatePosture, this.mHRZoneConfig);
        workoutRecordE.setLinkWear(this.mCaloriesConsumeHandler.c());
        this.ai.b(workoutRecordE, this.mCachedThreadPool);
        this.ai.b(this.g, this.mCachedThreadPool);
        this.ai.d(this.mCaloriesConsumeHandler.b(), this.mCachedThreadPool);
        n();
        btq.e().e("WORKOUT_FINISHED");
        ab();
    }

    private void ab() {
        if (TextUtils.isEmpty(this.ab)) {
            LogUtil.a("Suggestion_LongCoachActivity", "resource type is empty, return");
        } else {
            this.ai.c(this.ab, this.ad);
        }
    }

    private void n() {
        if (!this.p) {
            if (this.u) {
                finish();
                return;
            } else {
                LogUtil.a("Suggestion_LongCoachActivity", "executeThread : startFitnessResultActivity");
                if (!x()) {
                    af();
                }
            }
        } else {
            LogUtil.a("Suggestion_LongCoachActivity", "executeThread : showTrackAfterSketch");
            hcu.b().c();
            this.p = false;
        }
        if (this.f9121b.a().a() == -100) {
            LogUtil.a("Suggestion_LongCoachActivity", "executeThread : TRAIN_OVER");
            finish();
        }
        LogUtil.a("Suggestion_LongCoachActivity", "executeThread() save record and updateprocess mRecord:", this.ai.d(), "is plan: ", Boolean.valueOf(!TextUtils.isEmpty(this.ai.d().acquirePlanId())));
        this.ai.c(getIntent(), this.mStartTrainTime);
    }

    private void af() {
        try {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, (Class<?>) FitnessResultActivity.class);
            if (getIntent() != null && getIntent().getBundleExtra("bundlekey") != null) {
                intent.putExtra("bundlekey", getIntent().getBundleExtra("bundlekey"));
            }
            bundle.putParcelable("workout_record", this.ai.d());
            bundle.putBoolean("is_show_rpe", true);
            bundle.putLong("plan_execute_time", this.v);
            intent.putExtras(bundle);
            intent.putExtra("entrance", 0);
            startActivity(intent);
        } catch (BadParcelableException | ConcurrentModificationException e) {
            LogUtil.e("Suggestion_LongCoachActivity", "bundle putParcelable failed with BadParcelableException or ConcurrentModification", LogAnonymous.b(e));
        }
    }

    public void h() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_fitness_advice_no_record_tip)).a(getString(com.huawei.health.servicesui.R.string.IDS_user_permission_know), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!LongCoachActivity.this.p) {
                    LongCoachActivity.this.f9121b.finishTrain();
                    return;
                }
                hcu.b().c();
                CoachController.c().d(CoachController.StatusSource.APP, 3);
                LongCoachActivity.this.finish();
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
        LogUtil.a("Suggestion_LongCoachActivity", "showNoRecordDialog.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ag, reason: merged with bridge method [inline-methods] */
    public void d() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        iog popOutWindowInfo = userProfileMgrApi.getPopOutWindowInfo(this.g, "privacy_sport_data_");
        int iE = popOutWindowInfo.e();
        long jA = popOutWindowInfo.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iE >= 3 || jCurrentTimeMillis - jA <= Constants.ANALYSIS_EVENT_KEEP_TIME) {
            LongCoachView longCoachView = this.f9121b;
            if (longCoachView != null && longCoachView.a() != null) {
                this.f9121b.a().a(-100);
            }
            aa();
            return;
        }
        View viewInflate = View.inflate(this.g, R.layout.sug_fitness_coach_dialog_post_data, null);
        userProfileMgrApi.setPopOutWindowInfo(this.g, "privacy_sport_data_");
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.g).b(this.g.getString(R.string.sug_coach_dialog_exit_title)).a(viewInflate).a(com.huawei.ui.commonui.R.string.IDS_common_disagree, new DialogInterface.OnClickListener() { // from class: hgj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.e.b(dialogInterface, i);
            }
        }).d(com.huawei.ui.commonui.R.string.IDS_user_permission_ok, new DialogInterface.OnClickListener() { // from class: hgf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.d.e(dialogInterface, i);
            }
        }).b();
        this.aa = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.aa.show();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        aa();
        this.aa.dismiss();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        this.w = true;
        ien.e(3, true);
        aa();
        this.aa.dismiss();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity, com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("Suggestion_LongCoachActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (isSupportFoldingModel()) {
            String foldableState = HwScreenFoldDisplayMode.getFoldableState();
            this.m = foldableState;
            if ("HORIZONTAL_FOLDING_MODE".equals(foldableState)) {
                reloadView(this.m);
            }
        }
        if (gzx.e(this.f9121b)) {
            if (this.f9121b.getVisibility() == 0) {
                getWindow().getDecorView().setSystemUiVisibility(hjy.a());
            }
            if (!isLanguageChange() && this.s) {
                if (this.f9121b.a().a() == 192) {
                    LogUtil.a("Suggestion_LongCoachActivity", "onResume() play again");
                    this.f9121b.a().a(this.f9121b.q());
                    this.f9121b.d().setVisibility(4);
                }
                this.f9121b.ar();
            }
        }
        super.onResume();
        hjy.e(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ReleaseLogUtil.d("Suggestion_LongCoachActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        if (gzx.e(this.f9121b)) {
            if (this.f9121b.ai()) {
                this.s = true;
            } else {
                this.s = false;
            }
            this.f9121b.ao();
        }
        super.onPause();
        hjy.e(false);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity, com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("Suggestion_LongCoachActivity", "onDestroy");
        JumpConnectHelper.c().e(false);
        setRequestedOrientation(1);
        WorkoutRecordViewModel workoutRecordViewModel = this.ai;
        if (workoutRecordViewModel != null) {
            workoutRecordViewModel.b();
            this.ai.c(this);
        }
        CourseEquipmentViewModel courseEquipmentViewModel = this.h;
        if (courseEquipmentViewModel != null) {
            courseEquipmentViewModel.b((LifecycleOwner) this);
        }
        this.f9121b.at();
        super.onDestroy();
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("Suggestion_LongCoachActivity", "onDestroy recordApi is null.");
            return;
        }
        recordApi.unregisterResultCallback();
        ah();
        ae();
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_LongCoachActivity", "onDestroy : courseApi is null.");
        } else {
            courseApi.markFitnessCourseStatusAvailable();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("Suggestion_LongCoachActivity", "onActivityResult ", Integer.valueOf(i), " ", Integer.valueOf(i2), " ", intent);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    protected void refreshHeart() {
        WorkoutRecordViewModel workoutRecordViewModel = this.ai;
        if (workoutRecordViewModel == null || workoutRecordViewModel.d() == null) {
            return;
        }
        int iAcquireCategory = this.ai.d().acquireCategory();
        LogUtil.a("Suggestion_LongCoachActivity", "refreshHeart sportType = ", Integer.valueOf(iAcquireCategory));
        this.f9121b.setSportType(iAcquireCategory == 137 ? 137 : 10001);
        this.mHeartRatePosture = iAcquireCategory == 137 ? 4 : 1;
        ThreadPoolManager.c().execute(new Runnable() { // from class: hgb
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
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
        this.mStatusHandler = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity.4
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null || LongCoachActivity.this.f9121b == null) {
                    LogUtil.e("Suggestion_LongCoachActivity", "message null.or coach view null.");
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                if (i == 1) {
                    if (LongCoachActivity.this.l != null && LongCoachActivity.this.l.c()) {
                        LongCoachActivity.this.l.b();
                    }
                    LongCoachActivity.this.f9121b.ay();
                    hiu.c(LongCoachActivity.this.d, 2, CoachController.StatusSource.NEW_LINK_WEAR);
                    return;
                }
                if (i == 2) {
                    LongCoachActivity.this.f9121b.bb();
                    hiu.c(LongCoachActivity.this.d, 1, CoachController.StatusSource.NEW_LINK_WEAR);
                } else if (i != 3) {
                    LongCoachActivity.this.b(message);
                } else {
                    LongCoachActivity.this.o();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        if (!(message.obj instanceof CourseStateProto.CourseState)) {
            LogUtil.j("Suggestion_LongCoachActivity", "handleMessageOne !instanceof CourseStateProto.CourseState");
            return;
        }
        CourseStateProto.CourseState courseState = (CourseStateProto.CourseState) message.obj;
        int i = message.what;
        if (i == 5) {
            this.f9121b.v();
            return;
        }
        if (i == 6) {
            this.f9121b.x();
            return;
        }
        if (i == 8 && this.mVolumeInteractive != null) {
            this.mVolumeInteractive.a(courseState.getCurrentVolume());
            if (this.mVolumeInteractive.a()) {
                CoachController.c().e(CoachController.StatusSource.APP, courseState.toBuilder());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (CoachController.c().i() && !this.f9121b.am()) {
            LogUtil.a("Suggestion_LongCoachActivity", "showNoRecordDialog.");
            if (this.s) {
                this.s = false;
                this.f9121b.bb();
            }
            h();
            hiu.c(this.d, 5, CoachController.StatusSource.NEW_LINK_WEAR);
            return;
        }
        this.f9121b.finishTrain();
        hiu.c(this.d, 3, CoachController.StatusSource.NEW_LINK_WEAR);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setTahitiModelOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setDefaultOrientation() {
        setRequestedOrientation(0);
    }

    private void y() {
        if (this.ah == null) {
            this.ah = new CoachWifiBroadcastReceiver(this);
        }
        LogUtil.a("Suggestion_LongCoachActivity", "Enter registerWifiBroadcast()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.ah, intentFilter);
    }

    private void ah() {
        if (this.ah != null) {
            LogUtil.a("Suggestion_LongCoachActivity", "Enter unregisterWifiBroadcast()");
            try {
                unregisterReceiver(this.ah);
            } catch (IllegalArgumentException e) {
                LogUtil.j("Suggestion_LongCoachActivity", LogAnonymous.b(e));
            } catch (RuntimeException e2) {
                LogUtil.j("Suggestion_LongCoachActivity", LogAnonymous.b(e2));
            }
            this.ah = null;
        }
    }

    private void w() {
        LogUtil.a("Suggestion_LongCoachActivity", "Enter registerSyncBroadcast()");
        BroadcastManagerUtil.d(this.g, this.z, new IntentFilter("com.huawei.hihealth.action_sync_data_result"), "com.huawei.hihealth.DEFAULT_PERMISSION", null);
    }

    private void ae() {
        if (this.z != null) {
            LogUtil.a("Suggestion_LongCoachActivity", "Enter unregisterWifiBroadcast()");
            try {
                unregisterReceiver(this.z);
            } catch (IllegalArgumentException e) {
                LogUtil.j("Suggestion_LongCoachActivity", LogAnonymous.b(e));
            } catch (RuntimeException e2) {
                LogUtil.j("Suggestion_LongCoachActivity", LogAnonymous.b(e2));
            }
            this.z = null;
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LongCoachView getCoachView() {
        return this.f9121b;
    }

    public hjt b() {
        return this.af;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        LogUtil.a("Suggestion_LongCoachActivity", "onConfigurationChanged, orientation = ", Integer.valueOf(i));
        this.f9121b.b(this.m);
        if (qrs.ab(this.g) || (!qrs.af(this.g) && i == 1)) {
            setRequestedOrientation(0);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity
    protected WorkoutRecord getCurrentWorkout() {
        WorkoutRecordViewModel workoutRecordViewModel = this.ai;
        if (workoutRecordViewModel != null) {
            return workoutRecordViewModel.d();
        }
        return null;
    }

    public boolean c() {
        hjt hjtVar = this.af;
        return hjtVar != null && hjtVar.c();
    }
}
