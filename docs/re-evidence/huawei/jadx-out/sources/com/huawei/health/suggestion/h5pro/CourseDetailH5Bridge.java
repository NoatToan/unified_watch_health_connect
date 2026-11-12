package com.huawei.health.suggestion.h5pro;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.core.app.ActivityCompat;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.devicemgr.api.constant.DataCallbackType;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.h5pro.core.WebViewConfigChangeListener;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.DeviceResponse;
import com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper;
import com.huawei.health.suggestion.ui.healthcourse.activity.ShortVideoActivity;
import com.huawei.health.suggestion.util.CourseEquipmentConnectionTipsUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.HealthCourseJumpParameter;
import defpackage.btw;
import defpackage.btx;
import defpackage.ecu;
import defpackage.gzd;
import defpackage.haf;
import defpackage.hip;
import defpackage.hjd;
import defpackage.hjs;
import defpackage.hkt;
import defpackage.iei;
import defpackage.iem;
import defpackage.ifz;
import defpackage.iov;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pda;
import defpackage.pea;
import defpackage.pel;
import defpackage.qpx;
import defpackage.xkf;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ProcessUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class CourseDetailH5Bridge extends JsBaseModule implements JumpConnectHelper.JumpActivityHandleInterface, CourseEquipmentConnectionTipsUtil.DevicesConnectDialogCallback, WebViewConfigChangeListener {
    private static final String COURSE_INFO = "courseInfo";
    private static final String COURSE_PARAMETER = "courseParameter";
    private static final String CURRENT_WEEK = "currentWeek";
    private static final int ERROR_CODE_FAIL = -1;
    private static final int FINISH_PROGRESS = 1;
    private static final String LANGUAGE = "language";
    private static final String PLAN_EXECUTE_TIME = "planExecuteTime";
    private static final String TAG = "Suggestion_CourseH5Repository";
    private pcd mCourseJumpParameter;
    private String mCurrentCourseInfo;
    private long mDeviceCallbackId;
    private DownloadUiCallback mDownloadUiCallback;
    private float mDownloaded;
    private FitWorkout mFitWorkout;
    private volatile boolean mIsCourseCancelled = false;
    private boolean mIsWorkoutDownloaded;
    private float mProgress;
    private float mUnDownloadedProgress;

    @JavascriptInterface
    public void pushCourseInfo(long j, String str) {
        ReleaseLogUtil.d(TAG, "pushCourseInfo enter", Long.valueOf(j), "courseInfo:", str);
        this.mCurrentCourseInfo = str;
        this.mIsCourseCancelled = false;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "pushCourseInfo courseInfo null");
            onFailureCallback(j, "pushCourseInfo courseInfo null", -1);
            return;
        }
        try {
            FitWorkout fitWorkoutC = pda.c(btx.b(), new JSONObject(str));
            this.mFitWorkout = fitWorkoutC;
            initCourseDb(fitWorkoutC);
            FitWorkout fitWorkout = this.mFitWorkout;
            if (fitWorkout != null) {
                if (this.mDownloadUiCallback != null && !fitWorkout.acquireId().equals(this.mDownloadUiCallback.mWorkoutId)) {
                    this.mDownloadUiCallback.mIsCancelDownload = true;
                }
                onSuccessCallback(j);
                return;
            }
            onFailureCallback(j, "pushCourseInfo fitWorkout null", -1);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG, "pushCourseInfo exception:", LogAnonymous.b(e));
        }
    }

    private void initCourseDb(FitWorkout fitWorkout) {
        ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).updateCourseDbData(fitWorkout);
    }

    @JavascriptInterface
    public void registerDeviceDataCallback(long j) {
        this.mDeviceCallbackId = j;
        ReleaseLogUtil.d(TAG, "registerDeviceDataCallback enter", Long.valueOf(j));
        ecu.d().registerDataCallback(new DeviceStateCallback(j), DataCallbackType.EXERCISE_ADVICE_MANAGER, TAG);
        ecu.d().registerDataCallback(new DeviceStateCallback(j), DataCallbackType.DEVICE_FONT_MANAGER, TAG);
    }

    @JavascriptInterface
    public void isRunCourseAbility(long j) {
        ecu.d().sendDeviceData(22, 12, null, null, TAG);
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void sendCmdToGetDeviceLan(long j) {
        ReleaseLogUtil.d(TAG, "sendCmdToGetDeviceLan callbackId", Long.valueOf(j));
        ecu.d().sendDeviceData(12, 2, null, null, TAG);
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void getDeviceInfo(long j) {
        ReleaseLogUtil.d(TAG, "getDeviceInfo callbackId", Long.valueOf(j));
        onSuccessCallback(j, ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG));
    }

    @JavascriptInterface
    public void isConnectedHeartRateDeviceWear(long j) {
        ReleaseLogUtil.d(TAG, "isConnectedHeartRateDeviceWear callbackId", Long.valueOf(j));
        onSuccessCallback(j, Boolean.valueOf(iem.e(BaseApplication.b().getApplicationContext(), ifz.a())));
    }

    @JavascriptInterface
    public void checkHeartRateDeviceStatus(final long j) {
        ReleaseLogUtil.d(TAG, "checkHeartRateDeviceStatus callbackId", Long.valueOf(j));
        new hjd(new Handler(), this.mContext).d(new IBaseResponseCallback() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1222x750b970c(j, i, obj);
            }
        }, false);
    }

    /* JADX INFO: renamed from: lambda$checkHeartRateDeviceStatus$0$com-huawei-health-suggestion-h5pro-CourseDetailH5Bridge, reason: not valid java name */
    /* synthetic */ void m1222x750b970c(long j, int i, Object obj) {
        onSuccessCallback(j, obj);
    }

    @JavascriptInterface
    public void openBluetooth(long j) {
        ReleaseLogUtil.d(TAG, "checkHeartRateDeviceStatus callbackId", Long.valueOf(j));
        try {
            if (ActivityCompat.checkSelfPermission(this.mContext, "android.permission.BLUETOOTH_CONNECT") != 0) {
                ReleaseLogUtil.d(TAG, "checkHeartRateDeviceStatus NO PERMISSION");
                BluetoothAdapter.getDefaultAdapter().enable();
            } else {
                onSuccessCallback(j);
            }
        } catch (RuntimeException e) {
            ReleaseLogUtil.a(TAG, "user choose open BT error :", LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void isSupportFaController(long j, int i) {
        ReleaseLogUtil.d(TAG, "isSupportFaController:", Integer.valueOf(i));
        onSuccessCallback(j, Boolean.valueOf(CourseControlManager.isSupportFaController(i)));
    }

    @JavascriptInterface
    public void registerInitFa(final long j, String str) {
        ReleaseLogUtil.d(TAG, "registerInitFa params", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("planId");
            long jOptLong = jSONObject.optLong(PLAN_EXECUTE_TIME);
            this.mFitWorkout = getFitWorkout(str);
            CourseControlManager.initFa(this.mContext, this.mFitWorkout, strOptString, jOptLong, new UiCallback<Integer>() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.j(CourseDetailH5Bridge.TAG, "registerInitFa errorCode:", Integer.valueOf(i), "errorInfo:", str2);
                    CourseDetailH5Bridge.this.onFailureCallback(j, str2, i);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(Integer num) {
                    LogUtil.j(CourseDetailH5Bridge.TAG, "registerInitFa onSuccess:", num);
                    CourseDetailH5Bridge.this.onSuccessCallback(j, num);
                }
            });
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG, "registerInitFa exception:", LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void isSupportAiCourse(long j, int i) {
        LogUtil.a(TAG, "isSupportAiCourse aiType", Integer.valueOf(i));
        onSuccessCallback(j, Boolean.valueOf(hkt.c(i)));
    }

    @JavascriptInterface
    public void getPaceZoneArray(long j) {
        int[] iArrD = haf.d();
        if (iArrD.length <= 1) {
            LogUtil.j(TAG, "getPaceZoneArray paceZoneArray is default");
            iArrD = haf.e();
        }
        onSuccessCallback(j, iArrD);
    }

    @JavascriptInterface
    public void sendCourseToDevice(long j, String str) {
        ReleaseLogUtil.d(TAG, "sendCourseToDevice enter", Long.valueOf(j), "courseInfo:", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "sendCourseToDevice courseInfo null");
            onFailureCallback(j, "sendCourseToDevice courseInfo null", -1);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(COURSE_INFO);
            String strOptString2 = jSONObject.optString("language");
            JSONObject jSONObject2 = new JSONObject(strOptString);
            if (TextUtils.isEmpty(strOptString2)) {
                strOptString2 = btx.b();
            }
            FitWorkout fitWorkoutC = pda.c(strOptString2, jSONObject2);
            if (fitWorkoutC != null) {
                ecu.d().pushFitRunCourseData(fitWorkoutC);
                onSuccessCallback(j);
            } else {
                onFailureCallback(j, "sendCourseToDevice mFitWorkout null", -1);
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG, "sendCourseToDevice exception:", LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void startAiCourse(long j, String str) {
        ReleaseLogUtil.d(TAG, "startAiCourse courseParameter：", str);
        this.mFitWorkout = getFitWorkout(str);
        this.mCourseJumpParameter = getCourseJumpParameter(str);
        if (isIllegalData(j, str)) {
            return;
        }
        AiSportVoiceHelper.getInstance().setHelperType(FitWorkout.acquireComeFrom(this.mFitWorkout.acquireId()));
        iei.a(1, this.mFitWorkout.acquireId(), this.mFitWorkout.acquireName());
        checkMultilingualAudio(j, true, new AnonymousClass2());
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge$2, reason: invalid class name */
    class AnonymousClass2 extends UiCallback<Integer> {
        AnonymousClass2() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j(CourseDetailH5Bridge.TAG, "checkMultilingualAudio errorInfo", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(Integer num) {
            if (ProcessUtil.e()) {
                if (CourseDetailH5Bridge.this.mIsCourseCancelled) {
                    ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "startAiCourse mIsCourseCancelled.");
                    return;
                } else {
                    HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge$2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m1225x97d979bf();
                        }
                    });
                    return;
                }
            }
            ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "startAiCourse isAppOnForeground false.");
        }

        /* JADX INFO: renamed from: lambda$onSuccess$1$com-huawei-health-suggestion-h5pro-CourseDetailH5Bridge$2, reason: not valid java name */
        /* synthetic */ void m1225x97d979bf() {
            pel.e().launchActivity(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge$2$$ExternalSyntheticLambda1
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context, Intent intent) {
                    return this.f$0.m1224x8723acfe(context, intent);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onSuccess$0$com-huawei-health-suggestion-h5pro-CourseDetailH5Bridge$2, reason: not valid java name */
        /* synthetic */ boolean m1224x8723acfe(Context context, Intent intent) {
            LogUtil.a(CourseDetailH5Bridge.TAG, "InteractiveTraining launchActivity");
            CourseControlManager.startAiCourse(CourseDetailH5Bridge.this.mContext, CourseDetailH5Bridge.this.mFitWorkout, CourseDetailH5Bridge.this.mCourseJumpParameter, CourseDetailH5Bridge.this.mIsWorkoutDownloaded);
            return false;
        }
    }

    @JavascriptInterface
    public void enterShortVideo(long j, String str) {
        ReleaseLogUtil.d(TAG, "enterShortVideo courseParameter：", str);
        if (!CommonUtil.ab(this.mContext)) {
            qpx.e(this.mContext, R.string.IDS_network_connect_error);
            ReleaseLogUtil.e(TAG, "network is not Connected");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG, "courseParameter is empty");
            return;
        }
        HealthCourseJumpParameter healthCourseJumpParameter = getHealthCourseJumpParameter(str);
        if (healthCourseJumpParameter == null) {
            ReleaseLogUtil.e(TAG, "courseParameter is error");
            return;
        }
        if (njy.e(healthCourseJumpParameter.getEssenceVideos()) && TextUtils.isEmpty(healthCourseJumpParameter.getSerialCourseId())) {
            ReleaseLogUtil.e(TAG, "courseParameter EssenceVideos or SerialCourseId is empty");
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) ShortVideoActivity.class);
        intent.putExtra("healthCourseJumpParameter", healthCourseJumpParameter);
        iov.d(this.mContext, intent);
    }

    @JavascriptInterface
    public void startSport(final long j, String str) {
        ReleaseLogUtil.d(TAG, "startCourse courseParameter：", str);
        this.mFitWorkout = getFitWorkout(str);
        this.mCourseJumpParameter = getCourseJumpParameter(str);
        if (isIllegalData(j, str)) {
            return;
        }
        checkMultilingualAudio(j, false, new UiCallback<Integer>() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.j(CourseDetailH5Bridge.TAG, "checkMultilingualAudio errorInfo", str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(Integer num) {
                if (ProcessUtil.e()) {
                    if (!CourseDetailH5Bridge.this.mIsCourseCancelled) {
                        if (!CourseDetailH5Bridge.this.mFitWorkout.isLongVideoCourse()) {
                            if (CourseDetailH5Bridge.this.mFitWorkout.isRunModelCourse()) {
                                CourseControlManager.startTrackActivity(CourseDetailH5Bridge.this.mContext, CourseDetailH5Bridge.this.mFitWorkout, CourseDetailH5Bridge.this.mCourseJumpParameter);
                                return;
                            } else {
                                CourseControlManager.startCoachActivity(CourseDetailH5Bridge.this.mContext, CourseDetailH5Bridge.this.mFitWorkout, CourseDetailH5Bridge.this.mCourseJumpParameter, false);
                                return;
                            }
                        }
                        CourseDetailH5Bridge courseDetailH5Bridge = CourseDetailH5Bridge.this;
                        courseDetailH5Bridge.starLongCoachActivity(j, courseDetailH5Bridge.mCourseJumpParameter);
                        return;
                    }
                    ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "startSport mIsCourseCancelled.");
                    return;
                }
                ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "startSport isAppOnForeground false.");
            }
        });
    }

    @JavascriptInterface
    public void startEquipment(long j, String str) {
        ReleaseLogUtil.d(TAG, "startEquipment courseParameter:", str);
        this.mFitWorkout = getFitWorkout(str);
        this.mCourseJumpParameter = getCourseJumpParameter(str);
        if (isIllegalData(j, str)) {
            return;
        }
        if (this.mCourseJumpParameter == null) {
            ReleaseLogUtil.e(TAG, "startCourse courseJumpParameter null");
            onFailureCallback(j, "startCourse courseJumpParameter null");
        } else {
            checkMultilingualAudio(j, false, new UiCallback<Integer>() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.j(CourseDetailH5Bridge.TAG, "checkMultilingualAudio errorInfo", str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(Integer num) {
                    if (ProcessUtil.e()) {
                        if (CourseDetailH5Bridge.this.mIsCourseCancelled) {
                            ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "startEquipment mIsCourseCancelled.");
                            return;
                        } else {
                            CourseEquipmentConnectionTipsUtil.b(CourseEquipmentConnectionTipsUtil.e(CourseDetailH5Bridge.this.mFitWorkout, CourseDetailH5Bridge.this.mCourseJumpParameter.e()), CourseDetailH5Bridge.TAG, CourseDetailH5Bridge.this);
                            return;
                        }
                    }
                    ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "startEquipment isAppOnForeground false.");
                }
            });
        }
    }

    @JavascriptInterface
    public void getCourseUnDownMediaFilesLength(long j, String str) {
        ReleaseLogUtil.d(TAG, "startEquipment courseParameter:", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            onSuccessCallback(j, Integer.valueOf(((CourseApi) Services.b("CoursePlanService", CourseApi.class)).getCourseMediaFilesLength(jSONObject.optString(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID), jSONObject.optString("version"))));
        } catch (JSONException e) {
            LogUtil.a(TAG, "getCourseUnDownMediaFilesLength exception", LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void isPlanNeedUpdate(long j, String str) {
        ReleaseLogUtil.d(TAG, "isPlanNeedUpdate courseParameter:", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            onSuccessCallback(j, Boolean.valueOf(btw.e(jSONObject.optInt(CURRENT_WEEK), jSONObject.optString("planId"))));
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG, "isPlanNeedUpdate exception", LogAnonymous.b(e));
            onFailureCallback(j, "isPlanNeedUpdate JSONException");
        }
    }

    @JavascriptInterface
    public void isConnectRopeDevice(long j) {
        boolean zB = CourseEquipmentConnectionTipsUtil.b();
        ReleaseLogUtil.d(TAG, "isConnectRopeDevice:", Boolean.valueOf(zB));
        onSuccessCallback(j, Boolean.valueOf(zB));
    }

    @JavascriptInterface
    public void getAvailableFaDevice(final long j) {
        ReleaseLogUtil.d(TAG, "getAvailableFaDevice:", Long.valueOf(j));
        ((DistributedApi) Services.b("DistributedService", DistributedApi.class)).getAvailableFaDevice(new UiCallback<List<?>>() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "getAvailableFaDevice errorCode:", Integer.valueOf(i), "errorInfo:", str);
                CourseDetailH5Bridge.this.onFailureCallback(j, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(List<?> list) {
                ReleaseLogUtil.d(CourseDetailH5Bridge.TAG, "getAvailableFaDevice", Boolean.valueOf(njy.e(list)));
                CourseDetailH5Bridge.this.onSuccessCallback(j, list);
            }
        });
    }

    @JavascriptInterface
    public void cancelDownloadCourseMediaFiles(long j, String str) {
        ReleaseLogUtil.d(TAG, "cancelDownloadCourseMediaFiles", Long.valueOf(j), "params:", str);
        this.mIsCourseCancelled = true;
        onSuccessCallback(j);
    }

    @Override // com.huawei.health.suggestion.util.CourseEquipmentConnectionTipsUtil.DevicesConnectDialogCallback
    public void devicesConnectDialogNavigation() {
        ReleaseLogUtil.d(TAG, "devicesConnectDialogNavigation");
        FitWorkout fitWorkout = this.mFitWorkout;
        if (fitWorkout == null) {
            ReleaseLogUtil.e(TAG, "devicesConnectDialogNavigation mFitWorkout == null");
        } else if (fitWorkout.isLongVideoCourse()) {
            CourseControlManager.startLongCoachActivity(this.mContext, this.mFitWorkout, this.mCourseJumpParameter);
        } else {
            CourseControlManager.startCoachActivity(this.mContext, this.mFitWorkout, this.mCourseJumpParameter, true);
        }
    }

    @Override // com.huawei.health.suggestion.util.CourseEquipmentConnectionTipsUtil.DevicesConnectDialogCallback
    public void devicesConnectDialogPositive() {
        ReleaseLogUtil.d(TAG, "devicesConnectDialogPositive");
        WorkoutRecord workoutRecordD = pea.d(this.mFitWorkout, this.mCourseJumpParameter);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(workoutRecordD);
        CourseControlManager.devicesConnectDialogPositive(this.mContext, this.mFitWorkout, this.mCourseJumpParameter, arrayList);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d(TAG, "onDestroy");
        FitWorkout fitWorkout = this.mFitWorkout;
        if (fitWorkout != null) {
            if (this.mIsWorkoutDownloaded) {
                this.mProgress = 1.0f;
            }
            ReleaseLogUtil.d(TAG, "onDestroy workoutId", fitWorkout.acquireId(), "mIsWorkoutDownloaded:", Boolean.valueOf(this.mIsWorkoutDownloaded));
            if (!CommonUtil.b(this.mProgress)) {
                pea.c(this.mFitWorkout.acquireId(), this.mProgress);
            }
            ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).cancelDownloadCourseMediaFiles(new gzd.d().c(this.mFitWorkout.acquireId()).a(this.mFitWorkout.getCourseDefineType()).b());
        }
        DownloadUiCallback downloadUiCallback = this.mDownloadUiCallback;
        if (downloadUiCallback != null) {
            downloadUiCallback.mIsCancelDownload = true;
        }
        hjs.b().e();
        onCompleteCallback(this.mDeviceCallbackId, "onDestroy", 0);
        ((DistributedApi) Services.b("DistributedService", DistributedApi.class)).releaseDeviceManager();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper.JumpActivityHandleInterface
    public void startLongCoachAfter() {
        CourseControlManager.startLongCoachAfterAction(this.mFitWorkout, this.mCourseJumpParameter);
        JumpConnectHelper.c().d().d(TAG);
        JumpConnectHelper.c().j();
    }

    private void checkMultilingualAudio(final long j, final boolean z, final UiCallback<Integer> uiCallback) {
        CourseControlManager.checkMultilingualAudio(this.mContext, this.mFitWorkout, new UiCallback<Integer>() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge.6
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.a(CourseDetailH5Bridge.TAG, "checkMultilingualAudio errorInfo:", str);
                CourseDetailH5Bridge.this.onFailureCallback(j, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(Integer num) {
                if (!CourseDetailH5Bridge.this.mFitWorkout.isLongVideoCourse()) {
                    CourseDetailH5Bridge.this.downCourse(j, z, uiCallback);
                } else {
                    uiCallback.onSuccess(1);
                    CourseDetailH5Bridge.this.onCompleteCallback(j, String.valueOf(1), 0);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateWorkoutProgress(long j, CourseDetailH5Bridge courseDetailH5Bridge, String str, float f) {
        if (courseDetailH5Bridge == null || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG, "updateWorkoutProgress param invalid. ");
        } else {
            courseDetailH5Bridge.onSuccessCallback(j, new WorkoutDownloadProgress(str, f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downCourse(long j, boolean z, UiCallback<Integer> uiCallback) {
        CourseApi courseApi = (CourseApi) Services.b("CoursePlanService", CourseApi.class);
        float fD = pea.d(this.mFitWorkout.acquireId());
        this.mDownloaded = fD;
        ReleaseLogUtil.d(TAG, "downCourse mDownloaded:", Float.valueOf(fD));
        this.mUnDownloadedProgress = 1.0f - this.mDownloaded;
        updateWorkoutProgress(j, this, this.mFitWorkout.acquireId(), this.mDownloaded);
        int courseMediaFilesLength = courseApi.getCourseMediaFilesLength(this.mFitWorkout.acquireId(), this.mFitWorkout.accquireVersion());
        ReleaseLogUtil.d(TAG, "downCourse leaveLength:", Integer.valueOf(courseMediaFilesLength));
        if (this.mDownloaded >= 1.0f && courseMediaFilesLength > 0) {
            pea.c(this.mFitWorkout.acquireId(), 0.0f);
            ReleaseLogUtil.d(TAG, "adjust progress");
            this.mDownloaded = 0.0f;
            this.mUnDownloadedProgress = 1.0f;
        }
        if (courseMediaFilesLength == 0) {
            onCompleteCallback(j, String.valueOf(1), 0);
            uiCallback.onSuccess(1);
            pea.c(this.mFitWorkout.acquireId(), 1.0f);
            iei.a();
            return;
        }
        DownloadUiCallback downloadUiCallback = this.mDownloadUiCallback;
        if (downloadUiCallback != null) {
            downloadUiCallback.mIsCancelDownload = true;
            pea.c(this.mFitWorkout.acquireId(), this.mProgress);
        }
        this.mDownloadUiCallback = new DownloadUiCallback(j, uiCallback, this, this.mFitWorkout.acquireId());
        courseApi.downloadCourseMediaFiles(new gzd.d().c(this.mFitWorkout.acquireId()).b(this.mFitWorkout.getTimbre()).d(this.mFitWorkout.accquireVersion()).a(this.mFitWorkout.getCourseDefineType()).b(), this.mDownloadUiCallback);
        FitWorkout fitWorkout = this.mFitWorkout;
        iei.c(fitWorkout, CourseControlManager.getBiMapData(fitWorkout, this.mCourseJumpParameter), z);
        hip.d(this.mFitWorkout);
    }

    @Override // com.huawei.health.h5pro.core.WebViewConfigChangeListener
    public void onConfigurationChanged() {
        LogUtil.a(TAG, "onConfigurationChanged");
        if (this.mH5ProInstance != null) {
            this.mH5ProInstance.onResume();
        }
    }

    /* JADX INFO: loaded from: classes31.dex */
    static class WorkoutDownloadProgress {

        @SerializedName("progress")
        private float mProgress;

        @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
        private String mWorkoutId;

        public WorkoutDownloadProgress(String str, float f) {
            this.mWorkoutId = str;
            this.mProgress = f;
        }
    }

    static class DownloadUiCallback extends UiCallback<String> {
        private final long mCallbackId;
        private boolean mIsCancelDownload = false;
        private final UiCallback<Integer> mUiCallback;
        private WeakReference<CourseDetailH5Bridge> mWeakReferenceTrainDetail;
        private final String mWorkoutId;

        DownloadUiCallback(long j, UiCallback<Integer> uiCallback, CourseDetailH5Bridge courseDetailH5Bridge, String str) {
            this.mWeakReferenceTrainDetail = null;
            this.mCallbackId = j;
            this.mUiCallback = uiCallback;
            this.mWeakReferenceTrainDetail = new WeakReference<>(courseDetailH5Bridge);
            this.mWorkoutId = str;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            CourseDetailH5Bridge courseDetailH5Bridge = this.mWeakReferenceTrainDetail.get();
            ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "down fail-- errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
            if (courseDetailH5Bridge != null) {
                courseDetailH5Bridge.onFailureCallback(this.mCallbackId, str, i);
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onProgress(long j, long j2) {
            CourseDetailH5Bridge courseDetailH5Bridge = this.mWeakReferenceTrainDetail.get();
            if (courseDetailH5Bridge != null) {
                courseDetailH5Bridge.mProgress = (courseDetailH5Bridge.mUnDownloadedProgress * (j / j2)) + courseDetailH5Bridge.mDownloaded;
                if (courseDetailH5Bridge.mProgress > 1.0f) {
                    courseDetailH5Bridge.mProgress = 1.0f;
                    this.mUiCallback.onSuccess(0);
                }
                LogUtil.a(CourseDetailH5Bridge.TAG, "onProgress: ", Float.valueOf(courseDetailH5Bridge.mProgress));
                CourseDetailH5Bridge.updateWorkoutProgress(this.mCallbackId, courseDetailH5Bridge, this.mWorkoutId, courseDetailH5Bridge.mProgress);
                return;
            }
            LogUtil.j(CourseDetailH5Bridge.TAG, "DownloadUiCallback courseDetailH5Bridge == null");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public boolean isCanceled() {
            CourseDetailH5Bridge courseDetailH5Bridge = this.mWeakReferenceTrainDetail.get();
            if (courseDetailH5Bridge == null) {
                return true;
            }
            if (this.mIsCancelDownload) {
                courseDetailH5Bridge.onCompleteCallback(this.mCallbackId, String.valueOf(courseDetailH5Bridge.mProgress), 0);
            }
            return this.mIsCancelDownload;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(String str) {
            LogUtil.a(CourseDetailH5Bridge.TAG, "down success--");
            CourseDetailH5Bridge courseDetailH5Bridge = this.mWeakReferenceTrainDetail.get();
            if (courseDetailH5Bridge != null) {
                courseDetailH5Bridge.mIsWorkoutDownloaded = true;
                courseDetailH5Bridge.onCompleteCallback(this.mCallbackId, String.valueOf(1), 0);
                this.mUiCallback.onSuccess(0);
                pea.c(courseDetailH5Bridge.mFitWorkout.acquireId(), 1.0f);
                CourseControlManager.recordTrainEvent(0, courseDetailH5Bridge.mFitWorkout, courseDetailH5Bridge.mCourseJumpParameter.z());
                hjs.b().e(courseDetailH5Bridge.mFitWorkout);
                return;
            }
            LogUtil.j(CourseDetailH5Bridge.TAG, "down success--");
        }
    }

    private boolean isIllegalData(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG, "startCourse courseParameter null");
            onFailureCallback(j, "startCourse courseParameter null");
            return true;
        }
        if (this.mFitWorkout == null) {
            ReleaseLogUtil.e(TAG, "startCourse fitWorkout null");
            onFailureCallback(j, "startCourse fitWorkout null");
            return true;
        }
        if (this.mCourseJumpParameter != null) {
            return false;
        }
        ReleaseLogUtil.e(TAG, "startCourse courseJumpParameter null");
        onFailureCallback(j, "startCourse courseJumpParameter null");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void starLongCoachActivity(final long j, final pcd pcdVar) {
        String strT = pcdVar.t();
        LogUtil.a(TAG, "subtitleUrl:", strT);
        if (TextUtils.isEmpty(strT)) {
            CourseControlManager.startLongCoachActivity(this.mContext, this.mFitWorkout, pcdVar);
            updateWorkoutProgress(j, this, this.mFitWorkout.acquireId(), 1.0f);
        } else if (!CommonUtil.ab(com.huawei.hwcommonmodel.application.BaseApplication.getContext())) {
            qpx.e(this.mContext, R.string.IDS_network_connect_error);
        } else if (new File(xkf.n(strT)).exists()) {
            downloadSubtitlesEndAndJump(j, pcdVar);
        } else {
            ((CourseApi) Services.d("CoursePlanService", CourseApi.class)).downloadSubtitles(pcdVar.t(), new UiCallback<String>() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge.7
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "downLoadLongSrt onFailure. errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
                    CourseDetailH5Bridge.this.downloadSubtitlesEndAndJump(j, pcdVar);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(String str) {
                    ReleaseLogUtil.e(CourseDetailH5Bridge.TAG, "downLoadLongSrt onSuccess.");
                    CourseDetailH5Bridge.this.downloadSubtitlesEndAndJump(j, pcdVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadSubtitlesEndAndJump(final long j, final pcd pcdVar) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1223x86e3b1aa(pcdVar, j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$downloadSubtitlesEndAndJump$1$com-huawei-health-suggestion-h5pro-CourseDetailH5Bridge, reason: not valid java name */
    /* synthetic */ void m1223x86e3b1aa(pcd pcdVar, long j) {
        CourseControlManager.startLongCoachActivity(this.mContext, this.mFitWorkout, pcdVar);
        updateWorkoutProgress(j, this, this.mFitWorkout.acquireId(), 1.0f);
    }

    /* JADX INFO: loaded from: classes31.dex */
    class DeviceStateCallback implements IBaseResponseCallback {
        private final long mCallbackId;

        public DeviceStateCallback(long j) {
            this.mCallbackId = j;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a(CourseDetailH5Bridge.TAG, "err_code:", Integer.valueOf(i), " objData:", obj);
            if (i == 2) {
                if (obj == null) {
                    ReleaseLogUtil.d(CourseDetailH5Bridge.TAG, "GET_DEVICE_FONT_INFO objData == null");
                    DeviceResponse deviceResponse = new DeviceResponse();
                    deviceResponse.setLanguage(null);
                    deviceResponse.setErrorCode(2);
                    CourseDetailH5Bridge.this.onSuccessCallback(this.mCallbackId, deviceResponse);
                    return;
                }
                if (obj instanceof String[]) {
                    DeviceResponse deviceResponse2 = new DeviceResponse();
                    deviceResponse2.setLanguage((String[]) obj);
                    deviceResponse2.setErrorCode(2);
                    CourseDetailH5Bridge.this.onSuccessCallback(this.mCallbackId, deviceResponse2);
                    return;
                }
                return;
            }
            if (i != 12) {
                if (i == 13) {
                    DeviceResponse deviceResponse3 = new DeviceResponse();
                    deviceResponse3.setSendResult(((Integer) obj).intValue());
                    deviceResponse3.setErrorCode(13);
                    CourseDetailH5Bridge.this.onSuccessCallback(this.mCallbackId, deviceResponse3);
                    return;
                }
                LogUtil.j(CourseDetailH5Bridge.TAG, "COMMAND_ID not found!");
                return;
            }
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                DeviceResponse deviceResponse4 = new DeviceResponse();
                deviceResponse4.setAbility(iIntValue);
                deviceResponse4.setErrorCode(12);
                CourseDetailH5Bridge.this.onSuccessCallback(this.mCallbackId, deviceResponse4);
            }
        }
    }

    private FitWorkout getFitWorkout(String str) {
        try {
            String strOptString = new JSONObject(str).optString(COURSE_INFO);
            if (TextUtils.isEmpty(strOptString)) {
                ReleaseLogUtil.e(TAG, "getFitWorkout courseInfoStr");
                return null;
            }
            if (strOptString.equals(this.mCurrentCourseInfo) && this.mFitWorkout != null) {
                ReleaseLogUtil.d(TAG, "getFitWorkout same data");
                return this.mFitWorkout;
            }
            FitWorkout fitWorkoutC = pda.c(btx.b(), new JSONObject(strOptString));
            initCourseDb(fitWorkoutC);
            return fitWorkoutC;
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG, "getFitWorkout exception:", LogAnonymous.b(e));
            return null;
        }
    }

    public pcd getCourseJumpParameter(String str) {
        try {
            String strOptString = new JSONObject(str).optString(COURSE_PARAMETER);
            if (TextUtils.isEmpty(strOptString)) {
                ReleaseLogUtil.e(TAG, "getFitWorkout courseInfoStr");
            }
            return (pcd) new Gson().fromJson(strOptString, pcd.class);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG, "getCourseJumpParameter exception:", LogAnonymous.b(e));
            return null;
        }
    }

    public HealthCourseJumpParameter getHealthCourseJumpParameter(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG, "getHealthCourseJumpParameter courseInfo empty");
            return null;
        }
        try {
            return (HealthCourseJumpParameter) new Gson().fromJson(str, HealthCourseJumpParameter.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e(TAG, "getHealthCourseJumpParameter JsonSyntaxException");
            return null;
        }
    }
}
