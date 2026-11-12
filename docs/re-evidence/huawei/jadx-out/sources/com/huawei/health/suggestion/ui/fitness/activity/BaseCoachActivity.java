package com.huawei.health.suggestion.ui.fitness.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.google.gson.Gson;
import com.huawei.android.fsm.HwFoldScreenManagerEx;
import com.huawei.android.os.SystemPropertiesEx;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.basesport.helper.HeartRateConfigHelper;
import com.huawei.health.breathe.bean.BreatheBean;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.SuggestionBaseCallback;
import com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle;
import com.huawei.health.suggestion.protobuf.CourseStateProto;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.fitness.helper.HwScreenFoldDisplayMode;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.health.suggestion.ui.fitness.module.CoachViewInterface;
import com.huawei.health.suggestion.ui.fitness.mvp.CaloriesConsumeHandler;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.buh;
import defpackage.dfo;
import defpackage.hcg;
import defpackage.hdo;
import defpackage.iem;
import defpackage.ifv;
import defpackage.nsp;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Services;
import health.compact.a.SportIntensityUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseCoachActivity extends BaseStateActivity {
    private static final int SCHEDULE_TIME = 5000;
    private static final String TAG = "Suggestion_BaseCoachActivity";
    protected CaloriesConsumeHandler mCaloriesConsumeHandler;
    private long mCurrentHeartRateReportTime;
    private ScheduledExecutorService mExecutor;
    private HwScreenFoldDisplayMode.FoldableStateListener mFoldableStateListener;
    private HeartRateConfigHelper mHeartRateConfigHelper;
    protected hdo mHeartRateHandler;
    protected int mIntensityHeartRateThreshold;
    private NoTitleCustomAlertDialog mLanguageChangeHintDialog;
    protected long mPauseDuration;
    protected long mPauseTrainTime;
    private nsp mReportData;
    private volatile HwScreenFoldDisplayMode mScreenFoldDisplayMode;
    public long mStartTrainTime;
    protected Handler mStatusHandler;
    protected ifv mVolumeInteractive;
    public long mLoadingDuration = 0;
    public long mLoadingStartTime = 0;
    public long mLoadingEndTime = 0;
    protected int mClassifyMethod = 1;
    protected int mHeartRatePosture = 1;
    protected int[] mHRZoneConfig = new int[6];
    protected long mPlayStartTime = 0;
    protected long mPlayEndTime = 0;
    protected boolean mIsPauseStatus = false;
    private boolean mIsFirst = true;
    private String mOriginalLanguage = MLAsrConstants.LAN_ZH;
    private int mHeartRate = -1;
    private IReportDataCallback mReportDataCallback = new IReportDataCallback() { // from class: com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity.1
        @Override // com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback
        public void onChange(nsp nspVar) {
            BaseCoachActivity.this.mReportData = nspVar;
            if (nspVar != null) {
                nspVar.h(BaseCoachActivity.this.mHeartRate);
                CoachController.c().c(nspVar);
                if (BaseCoachActivity.this.mCaloriesConsumeHandler != null) {
                    BaseCoachActivity.this.mCaloriesConsumeHandler.a(nspVar.b(), nspVar.e(), CaloriesConsumeHandler.CaloriesSource.LINK_WEAR);
                }
                if (BaseCoachActivity.this.mHeartRateHandler != null) {
                    BaseCoachActivity.this.mHeartRateHandler.pushHeartRate(nspVar.j(), nspVar.m());
                    BaseCoachActivity.this.mCurrentHeartRateReportTime = nspVar.m();
                    return;
                }
                return;
            }
            LogUtil.e(BaseCoachActivity.TAG, "report data null.");
        }

        @Override // com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback
        public void onResult() {
            LogUtil.a(BaseCoachActivity.TAG, "report data onResult.");
        }
    };
    private SuggestionBaseCallback mHeartRateReportCallback = new AnonymousClass4();

    public abstract CoachViewInterface getCoachView();

    protected WorkoutRecord getCurrentWorkout() {
        return null;
    }

    protected abstract void initStatusHandler();

    protected boolean isNotSupportFitnessLinkage() {
        return false;
    }

    protected abstract void refreshHeart();

    public abstract void reloadView(String str);

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity$4, reason: invalid class name */
    public class AnonymousClass4 implements SuggestionBaseCallback {
        AnonymousClass4() {
        }

        @Override // com.huawei.health.suggestion.SuggestionBaseCallback
        public void onResponse(int i, Object obj) {
            if (obj == null) {
                LogUtil.j(BaseCoachActivity.TAG, "onResponse data == null");
                return;
            }
            if (obj instanceof HeartRateData) {
                HeartRateData heartRateData = (HeartRateData) obj;
                final int iAcquireHeartRate = heartRateData.acquireHeartRate();
                BaseCoachActivity.this.runOnUiThread(new Runnable() { // from class: her
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36693c.a(iAcquireHeartRate);
                    }
                });
                BaseCoachActivity.this.mCurrentHeartRateReportTime = System.currentTimeMillis();
                BaseCoachActivity.this.mHeartRate = iAcquireHeartRate;
                if (BaseCoachActivity.this.mReportData == null && CoachController.c().f()) {
                    CoachController.c().a(iAcquireHeartRate);
                    if (BaseCoachActivity.this.mHeartRateHandler != null) {
                        BaseCoachActivity.this.mHeartRateHandler.pushHeartRate(iAcquireHeartRate, heartRateData.acquireTime());
                    }
                }
            }
        }

        public /* synthetic */ void a(int i) {
            if (BaseCoachActivity.this.getCoachView() != null) {
                BaseCoachActivity.this.getCoachView().updateHeartRate(i);
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReleaseLogUtil.d(TAG, "onCreate");
        if (isSupportFoldingModel() && this.mFoldableStateListener == null) {
            LogUtil.j(TAG, "registerFoldableState");
            this.mFoldableStateListener = new HwScreenFoldDisplayMode.FoldableStateListener(this);
            this.mScreenFoldDisplayMode = new HwScreenFoldDisplayMode(this.mFoldableStateListener);
            HwFoldScreenManagerEx.registerFoldableState(this.mScreenFoldDisplayMode, 1);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public boolean isSupportFoldingModel() {
        if (!EnvironmentInfo.g()) {
            return false;
        }
        try {
            return SystemPropertiesEx.getBoolean("hw_mc.multiwindow.fat_hover", false);
        } catch (Exception e) {
            LogUtil.e(TAG, "isSupportFoldingModel Exception:", ExceptionUtils.c(e));
            return false;
        }
    }

    protected void startPlay() {
        ReleaseLogUtil.d(TAG, "startPlay");
        if (isNotSupportFitnessLinkage()) {
            LogUtil.a(TAG, "startPlay is explain Course Or Device Linkage Course");
            CoachController.c().d(false);
            return;
        }
        if (CoachController.c().f()) {
            CoachController.c().e();
            this.mHeartRateHandler = new hdo();
            setMaxHeartRate();
            hcg.e().a(this.mReportDataCallback);
            CoachController.c().a(0L);
            initInteractorSchedule();
            initStatusHandler();
            initCoachStatusCallback();
            CoachController.c().d(CoachController.StatusSource.APP, 1);
            refreshHeart();
            ifv ifvVar = new ifv();
            this.mVolumeInteractive = ifvVar;
            ifvVar.e();
        }
        hcg.e().d(this.mHeartRateReportCallback, true ^ CoachController.c().f());
        startCheckHeartRateReport();
        setTrainingCourse();
    }

    protected void stopPlay() {
        ReleaseLogUtil.d(TAG, "stopPlay");
        if (isNotSupportFitnessLinkage()) {
            LogUtil.a(TAG, "stopPlay ", "is explainCourse Or Device Linkage Course");
            return;
        }
        if (CoachController.c().f()) {
            hcg.e().c();
            Handler handler = this.mStatusHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }
        hcg.e().a(this.mHeartRateReportCallback, !CoachController.c().f());
        resetTimer();
        removeTrainingCourse();
    }

    protected void initCoachStatusCallback() {
        CoachController.c().c(CoachController.StatusSource.NEW_LINK_WEAR, new CourseLinkageLifecycle() { // from class: com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity.3
            @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
            public void start(int i, Bundle bundle) {
            }

            @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
            public void resume(int i) {
                ReleaseLogUtil.d(BaseCoachActivity.TAG, "sendMessage, wear command = resume");
                if (BaseCoachActivity.this.mStatusHandler != null) {
                    BaseCoachActivity.this.mStatusHandler.sendEmptyMessage(1);
                }
            }

            @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
            public void pause(int i) {
                ReleaseLogUtil.d(BaseCoachActivity.TAG, "sendMessage, wear command = pause");
                if (BaseCoachActivity.this.mStatusHandler != null) {
                    BaseCoachActivity.this.mStatusHandler.sendEmptyMessage(2);
                }
            }

            @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
            public void stop(int i) {
                ReleaseLogUtil.d(BaseCoachActivity.TAG, "sendMessage, wear command = stop");
                if (BaseCoachActivity.this.mStatusHandler != null) {
                    BaseCoachActivity.this.mStatusHandler.sendEmptyMessage(3);
                }
            }

            @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
            public void chapterForward(CourseStateProto.CourseState courseState) {
                BaseCoachActivity.this.sendMessage(5, courseState);
            }

            @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
            public void chapterBackward(CourseStateProto.CourseState courseState) {
                BaseCoachActivity.this.sendMessage(6, courseState);
            }

            @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
            public void volumeAdjust(CourseStateProto.CourseState courseState) {
                BaseCoachActivity.this.sendMessage(8, courseState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMessage(int i, CourseStateProto.CourseState courseState) {
        ReleaseLogUtil.d(TAG, "sendMessage, command = ", Integer.valueOf(i));
        if (this.mStatusHandler != null) {
            Message message = new Message();
            message.what = i;
            message.obj = courseState;
            this.mStatusHandler.sendMessage(message);
        }
    }

    protected void initInteractorSchedule() {
        if (this.mExecutor == null) {
            this.mExecutor = Executors.newSingleThreadScheduledExecutor();
        }
        this.mExecutor.scheduleAtFixedRate(new Runnable() { // from class: het
            @Override // java.lang.Runnable
            public final void run() {
                this.f36694b.m1226x31080461();
            }
        }, 500L, 1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: lambda$initInteractorSchedule$0$com-huawei-health-suggestion-ui-fitness-activity-BaseCoachActivity, reason: not valid java name */
    public /* synthetic */ void m1226x31080461() {
        int iB = CoachController.c().b();
        if (iB == 1) {
            CoachController.c().d(CoachController.c().d() + 1);
            hdo hdoVar = this.mHeartRateHandler;
            if (hdoVar != null) {
                hdoVar.saveHeartRate();
            }
            CoachController.c().a(CoachController.c().b(iB));
        }
        if (iB == 2) {
            this.mHeartRateHandler.e(true);
        }
    }

    protected void resetTimer() {
        ScheduledExecutorService scheduledExecutorService = this.mExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.mExecutor = null;
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ReleaseLogUtil.d(TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (this.mIsFirst) {
            this.mIsFirst = false;
            String strZ = CommonUtil.z();
            this.mOriginalLanguage = strZ;
            LogUtil.a(TAG, "onResume, mOriginalLanguage = ", strZ);
        }
        super.onResume();
    }

    protected boolean isLanguageChange() {
        if (this.mIsFirst) {
            return false;
        }
        if (!this.mOriginalLanguage.equals(CommonUtil.z())) {
            showChangeHintDialog();
            return true;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.mLanguageChangeHintDialog;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.mLanguageChangeHintDialog.dismiss();
        }
        return false;
    }

    private void showChangeHintDialog() {
        LogUtil.a(TAG, "showChangeHintDialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_coach_language_change_hint)).a(getString(R.string.IDS_hw_pressure_known).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: hev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36695c.m1228xdd2638e4(view);
            }
        }).c();
        this.mLanguageChangeHintDialog = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.mLanguageChangeHintDialog.show();
    }

    /* JADX INFO: renamed from: lambda$showChangeHintDialog$1$com-huawei-health-suggestion-ui-fitness-activity-BaseCoachActivity, reason: not valid java name */
    public /* synthetic */ void m1228xdd2638e4(View view) {
        if (getCoachView() != null) {
            LogUtil.a(TAG, "languageChange, coachView finishTrain.");
            getCoachView().finishTrain();
        } else {
            LogUtil.a(TAG, "languageChange, activity finish");
            finish();
        }
        this.mLanguageChangeHintDialog.dismiss();
    }

    @Override // android.app.Activity
    public void finish() {
        ReleaseLogUtil.d(TAG, "finish()");
        if (getIntent() != null && getIntent().getBooleanExtra("moveTaskToBack", false)) {
            moveTaskToBack(true);
        }
        super.finish();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ReleaseLogUtil.d(TAG, "BaseCoachActivity onDestroy");
        stopPlay();
        super.onDestroy();
        if (isNotSupportFitnessLinkage()) {
            LogUtil.a(TAG, "onDestroy ", "is explainCourse Or Device Linkage Course");
        } else {
            CoachController.c().c(CoachController.StatusSource.NEW_LINK_WEAR);
            ifv ifvVar = this.mVolumeInteractive;
            if (ifvVar != null) {
                ifvVar.c();
            }
        }
        if (!isSupportFoldingModel() || this.mScreenFoldDisplayMode == null) {
            return;
        }
        HwFoldScreenManagerEx.unregisterFoldableState(this.mScreenFoldDisplayMode);
    }

    private void startCheckHeartRateReport() {
        boolean zE = iem.e(this, iem.b());
        boolean zIsDeviceConnected = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).isDeviceConnected("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c");
        ReleaseLogUtil.d(TAG, "isConnectedHeartRateDeviceWear:", Boolean.valueOf(zE), "isNemo:", Boolean.valueOf(zIsDeviceConnected));
        if (zE || zIsDeviceConnected) {
            if (this.mExecutor == null) {
                this.mExecutor = Executors.newSingleThreadScheduledExecutor();
            }
            this.mExecutor.scheduleAtFixedRate(new AnonymousClass5(), 5000L, 5000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (System.currentTimeMillis() - BaseCoachActivity.this.mCurrentHeartRateReportTime > TimeUnit.SECONDS.toMillis(30L)) {
                BaseCoachActivity.this.runOnUiThread(new Runnable() { // from class: hey
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.e();
                    }
                });
            }
        }

        public /* synthetic */ void e() {
            BaseCoachActivity.this.getCoachView().updateHeartRate(-1);
        }
    }

    private void setTrainingCourse() {
        WorkoutRecord currentWorkout = getCurrentWorkout();
        if (currentWorkout == null || StringUtils.g(currentWorkout.acquirePlanId())) {
            return;
        }
        LogUtil.a(TAG, "setTrainingCourse, record = ", currentWorkout);
        buh.d("intPlanTrainingCourse", new Gson().toJson(currentWorkout));
    }

    private void removeTrainingCourse() {
        LogUtil.a(TAG, "removeTrainingCourse");
        buh.c("intPlanTrainingCourse");
    }

    private void setMaxHeartRate() {
        this.mHeartRateConfigHelper = new HeartRateConfigHelper(10001, new HeartRateConfigHelper.OnConfigHelperListener() { // from class: heu
            @Override // com.huawei.health.basesport.helper.HeartRateConfigHelper.OnConfigHelperListener
            public final void onInitComplete() {
                this.d.m1227x681ee275();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setMaxHeartRate$2$com-huawei-health-suggestion-ui-fitness-activity-BaseCoachActivity, reason: not valid java name */
    public /* synthetic */ void m1227x681ee275() {
        HeartRateConfigHelper heartRateConfigHelper = this.mHeartRateConfigHelper;
        if (heartRateConfigHelper == null) {
            LogUtil.a(TAG, "mHeartRateConfigHelper is null");
            return;
        }
        HeartZoneConf heartZoneConfC = heartRateConfigHelper.c();
        if (heartZoneConfC != null) {
            this.mIntensityHeartRateThreshold = SportIntensityUtil.b().b(heartZoneConfC);
        }
    }

    protected void checkBreachStatus(CoachData coachData) {
        if (coachData == null) {
            LogUtil.j(TAG, "checkBreachStatus, coachData is empty.");
        } else if (coachData.isBreathCourse()) {
            dfo.d(new BreatheBean());
        }
    }

    protected void dealLastPauseTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.d(TAG, "dealLastPauseTime mPauseDuration:", Long.valueOf(this.mPauseDuration), ":mPauseTrainTime", Long.valueOf(this.mPauseTrainTime), "mStartTrainTime:", Long.valueOf(this.mStartTrainTime), "now:", Long.valueOf(jCurrentTimeMillis), "mIsPauseStatus:", Boolean.valueOf(this.mIsPauseStatus));
        if (this.mIsPauseStatus) {
            long j = this.mPauseTrainTime;
            if (j != 0) {
                this.mPauseDuration = (this.mPauseDuration + jCurrentTimeMillis) - j;
            }
        }
    }
}
