package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.FitnessCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Summary;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.DataPlatformApi;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.courseplanservice.api.SportServiceApi;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.devicemgr.api.constant.DataCallbackType;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.CourseUpdateListener;
import com.huawei.health.sport.model.CourseEnvParams;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.health.suggestion.config.MoveService;
import com.huawei.health.suggestion.data.DataDownloadService;
import com.huawei.health.suggestion.service.PlanSendService;
import com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter;
import com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper;
import com.huawei.health.suggestion.ui.fitness.helper.RecyclerHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.api.SyncApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.util.HealthSyncUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.unitedevice.manager.SampleEventCache;
import com.huawei.up.model.UserInfomation;
import health.compact.a.AuthorizationUtils;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
@ApiDefine(uri = PluginSuggestion.class)
@Singleton
public class hcf extends PluginSuggestion {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f36396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f36397c;
    private BroadcastReceiver d;
    private H5ProWebView e;
    private boolean g;
    private List<Integer> h;
    private BroadcastReceiver i;
    private List<Integer> j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FitnessCallback f36395a = new FitnessCallback() { // from class: hcn
        @Override // com.huawei.basefitnessadvice.callback.FitnessCallback
        public final void onChange(String str, int i, Bundle bundle) {
            hcf.e(str, i, bundle);
        }
    };
    private final HiSubscribeListener f = new HiSubscribeListener() { // from class: hcf.4
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (njy.b(list)) {
                LogUtil.a("Suggestion_PluginSuggestion", "mMergeDataSubscribeListener onResult successList");
                hcf.this.g = true;
                hcf.this.h = list;
            } else {
                LogUtil.e("Suggestion_PluginSuggestion", "onResult null.");
                hcf.this.g = false;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("Suggestion_PluginSuggestion", "type:", Integer.valueOf(i), " changeKey:", str, " time:", Long.valueOf(j));
            nkb.d().c(lsl.r(j), lsl.c(j), 0, new AnonymousClass2());
        }

        /* JADX INFO: renamed from: hcf$4$2, reason: invalid class name */
        class AnonymousClass2 implements IBaseResponseCallback {
            AnonymousClass2() {
            }

            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(final int i, final Object obj) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: hcq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36429b.c(i, obj);
                    }
                });
            }

            /* synthetic */ void c(int i, Object obj) {
                hcf.this.d(i, obj);
            }
        }
    };

    @Override // defpackage.pbx
    public void setAdapter(PluginBaseAdapter pluginBaseAdapter) {
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    @Deprecated
    public void setTargetList(List<gze> list) {
    }

    static /* synthetic */ void e(String str, int i, Bundle bundle) {
        if (i == 4) {
            final HashMap map = new HashMap();
            if (bundle != null) {
                long j = bundle.getLong(FitnessCallback.BUNDLE_FITNESS_DURATION);
                map.put(KakaConstants.FITNESS_DURATION, Long.valueOf(j));
                LogUtil.a("Suggestion_PluginSuggestion", "FitnessAdapter onChange workoutId = ", str, "  minutes=", Long.valueOf(j));
            }
            ThreadPoolManager.c().execute(new Runnable() { // from class: hcm
                @Override // java.lang.Runnable
                public final void run() {
                    hcu.b().c(BaseApplication.getContext(), String.valueOf(KakaConstants.TASK_FITNESS_BEHAVIOR), map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() != 2) {
            return;
        }
        startSendIntelligentPlan();
    }

    public hcf() {
        LogUtil.a("Suggestion_PluginSuggestion", "PluginSuggestion enter");
        d dVar = new d(this);
        try {
            HealthSyncUtil.a(dVar);
        } catch (IllegalArgumentException unused) {
            LogUtil.j("Suggestion_PluginSuggestion", "add api is null");
        }
        try {
            HealthSyncUtil.c(dVar);
        } catch (IllegalArgumentException unused2) {
            LogUtil.j("Suggestion_PluginSuggestion", "add api is null");
        }
        ecu.d().registerDataCallback(null, DataCallbackType.SUGGESTION_AIDL, "Suggestion_PluginSuggestion");
        ibf.e().d();
        g();
        i();
        h();
        f();
        j();
        k();
        a();
    }

    private void a() {
        MoveService.a(btx.c(), 1);
        btt.d().c(new Runnable() { // from class: hck
            @Override // java.lang.Runnable
            public final void run() {
                this.f36420a.c();
            }
        });
    }

    private void j() {
        LogUtil.a("Suggestion_PluginSuggestion", "registerAchieveModelListener");
        hcb.a().b("achievemodel", this.f36395a);
    }

    private void l() {
        LogUtil.a("Suggestion_PluginSuggestion", "unregisterAchieveModelListener");
        hcb.a().c("achievemodel");
    }

    private void g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_data_refresh");
        this.f36397c = new BroadcastReceiver() { // from class: hcf.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LogUtil.a("Suggestion_PluginSuggestion", "mDataSyncReceiver onReceive");
                if (intent == null || !"com.huawei.hihealth.action_data_refresh".equals(intent.getAction())) {
                    return;
                }
                LogUtil.a("Suggestion_PluginSuggestion", "onReceive HiBroadcastAction.ACTION_DATA_REFRESH");
                if (intent.getIntExtra("refresh_type", -1) != 2 || CommonUtil.x(context)) {
                    return;
                }
                LogUtil.a("Suggestion_PluginSuggestion", "onReceive HiBroadcastAction.ACTION_DATA_REFRESH TRACK_DATA");
                btx.c().startService(new Intent(btx.c(), (Class<?>) DataDownloadService.class));
            }
        };
        BroadcastManagerUtil.d(btx.c(), this.f36397c, intentFilter, "com.huawei.hihealth.DEFAULT_PERMISSION", null);
    }

    private void i() {
        LogUtil.a("Suggestion_PluginSuggestion", "registerPhoneServiceBindedReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS");
        this.i = new BroadcastReceiver() { // from class: hcf.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LogUtil.a("Suggestion_PluginSuggestion", "mPhoneServiceBindedReceiver onReceive");
                if (intent == null) {
                    LogUtil.e("Suggestion_PluginSuggestion", "mPhoneServiceBindedReceiver intent is null");
                } else if ("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS".equals(intent.getAction())) {
                    ecu.d().registerDataCallback(null, DataCallbackType.SUGGESTION_AIDL, "Suggestion_PluginSuggestion");
                    hcf.this.startSendIntelligentPlan();
                }
            }
        };
        BroadcastManagerUtil.c(btx.c(), this.i, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void h() {
        LogUtil.a("Suggestion_PluginSuggestion", "registerDeviceStatusReceiver");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        this.f36396b = new BroadcastReceiver() { // from class: hcf.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                DeviceInfo deviceInfo;
                LogUtil.a("Suggestion_PluginSuggestion", "mDeviceConnectStatusReceiver onReceive");
                if (intent == null) {
                    LogUtil.e("Suggestion_PluginSuggestion", "mDeviceConnectStatusReceiver intent is null");
                } else {
                    if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) == null) {
                        return;
                    }
                    LogUtil.a("Suggestion_PluginSuggestion", "mConnectStateChangedReceiver() status: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                    hcf.this.e(deviceInfo);
                }
            }
        };
        BroadcastManagerUtil.c(btx.c(), this.f36396b, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void f() {
        LogUtil.a("Suggestion_PluginSuggestion", "registerAccountDataSwitchReceiver");
        IntentFilter intentFilter = new IntentFilter("com.huawei.hihealth.action_account_login_datas_switch_finish");
        intentFilter.addAction("com.huawei.hihealth.action_account_login_datas_switch_finish");
        this.d = new BroadcastReceiver() { // from class: hcf.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.e("Suggestion_PluginSuggestion", "mAccountDataSwitchReceiver intent is null");
                    return;
                }
                if ("com.huawei.hihealth.action_account_login_datas_switch_finish".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("account_switch_status", 0);
                    LogUtil.a("Suggestion_PluginSuggestion", "mAccountDataSwitchReceiver onReceive,", Integer.valueOf(intExtra), Boolean.valueOf(hcf.this.g));
                    if (intExtra != 0 || hcf.this.g) {
                        return;
                    }
                    hcf.this.k();
                }
            }
        };
        BroadcastManagerUtil.d(btx.c(), this.d, intentFilter, "com.huawei.hihealth.DEFAULT_PERMISSION", null);
    }

    @Override // defpackage.pbx
    public void init(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        if (context == null) {
            LogUtil.j("Suggestion_PluginSuggestion", "the context is null");
            return;
        }
        if (FitnessExternalUtils.b()) {
            return;
        }
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_PluginSuggestion", "init : planApi is null.");
        } else {
            btt.d().c(new Runnable() { // from class: hcf.8
                @Override // java.lang.Runnable
                public void run() {
                    gyy.a.a("sportSuggestUrl", new GrsQueryCallback() { // from class: hcf.8.5
                        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                        public void onCallBackSuccess(String str) {
                            LogUtil.a("Suggestion_PluginSuggestion", "onCallBackSuccess url = ", str);
                            planApi.queryAllCompletedFitnessPlanFromCloud(new ResultCallback() { // from class: hcf.8.5.5
                                @Override // com.huawei.health.suggestion.ResultCallback
                                public void onResult(int i, Object obj) {
                                    LogUtil.a("Suggestion_PluginSuggestion", "onResult resultCode = ", Integer.valueOf(i));
                                    LogUtil.a("Suggestion_PluginSuggestion", "onResult object = ", obj);
                                }
                            });
                        }

                        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                        public void onCallBackFail(int i) {
                            LogUtil.j("Suggestion_PluginSuggestion", "onCallBackFail position = ", Integer.valueOf(i));
                        }
                    });
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public boolean isInitComplete() {
        return hcg.e().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c() {
        if (hcg.e().d()) {
            SportServiceApi sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class);
            if (sportServiceApi == null) {
                LogUtil.j("Suggestion_PluginSuggestion", "initModule sportServiceApi is null.");
                return;
            }
            sportServiceApi.syncData();
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.e("Suggestion_PluginSuggestion", "planApi == null.");
            } else if (!AuthorizationUtils.c(BaseApplication.getContext())) {
                LogUtil.a("Suggestion_PluginSuggestion", "initModule getAuthorizationStatus: false");
            } else {
                planApi.getCurrentIntPlan(new UiCallback<IntPlan>() { // from class: hcf.7
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("Suggestion_PluginSuggestion", "errorCode:", Integer.valueOf(i), " errorInfo:", str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(IntPlan intPlan) {
                        LogUtil.a("Suggestion_PluginSuggestion", "onSuccess.", Boolean.valueOf(intPlan == null));
                        if (intPlan == null || !IntPlan.PlanType.AI_RUN_PLAN.equals(intPlan.getPlanType())) {
                            return;
                        }
                        hcf.this.startSendIntelligentPlan();
                    }
                });
            }
        }
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void getFitWorkout(String str, String str2, UiCallback<FitWorkout> uiCallback) {
        hcg.e().c(str, str2, uiCallback);
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void jumpToStartTrain(Context context, FitWorkout fitWorkout, PluginSuggestion pluginSuggestion, boolean z) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null || fitWorkout == null || pluginSuggestion == null) {
            LogUtil.e("Suggestion_PluginSuggestion", "params invalid");
            return;
        }
        if (fitWorkout.isLongVideoCourse()) {
            LogUtil.a("Suggestion_PluginSuggestion", "jump to long coach video");
            JumpUtil.e(context, courseApi, fitWorkout);
        } else if (!JumpUtil.b(courseApi, fitWorkout)) {
            LogUtil.a("Suggestion_PluginSuggestion", "jump to course detail, coach video not download");
            JumpUtil.a(context, fitWorkout, z);
        } else if (fitWorkout.isRunModelCourse()) {
            LogUtil.a("Suggestion_PluginSuggestion", "jump to start train");
            JumpUtil.b(context, fitWorkout);
        } else {
            LogUtil.a("Suggestion_PluginSuggestion", "jump to short coach video");
            JumpUtil.c(context, fitWorkout);
        }
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void updateRunSummary(Summary summary) {
        if (hcg.e().d()) {
            hox.d().e(summary, false);
        }
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void realTimeGuidance(int i, List<Integer> list) {
        hox.d().realTimeGuidance(i, list);
    }

    @Override // defpackage.pbx
    public void finish() {
        LogUtil.a("Suggestion_PluginSuggestion", "finish.");
        if (!njy.e(this.h)) {
            HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.h, new HiUnSubscribeListener() { // from class: hcl
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("Suggestion_PluginSuggestion", "onDestroy unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("Suggestion_PluginSuggestion", "syncData()");
        btt.d().c(new Runnable() { // from class: hcf.10
            @Override // java.lang.Runnable
            public void run() {
                SportServiceApi sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class);
                if (sportServiceApi != null) {
                    sportServiceApi.updateAll();
                    sportServiceApi.syncData();
                }
                if (!CommonUtil.x(btx.c())) {
                    btx.c().startService(new Intent(btx.c(), (Class<?>) DataDownloadService.class));
                    ReleaseLogUtil.d("Suggestion_PluginSuggestion", "syncData startService isForeground");
                } else {
                    ReleaseLogUtil.d("Suggestion_PluginSuggestion", "syncData startService isBackground");
                }
                dmg.a().syncDevice();
            }
        });
        LogUtil.a("Suggestion_PluginSuggestion", "syncData() end");
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public List<Map<String, Object>> getRecordsByDateRange(Date date, Date date2) {
        LogUtil.a("Suggestion_PluginSuggestion", "getRecordsByDateRange");
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi != null) {
            return recordApi.getRecordsByDateRange(date, date2);
        }
        return null;
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void deleteFitnessDataForStoreDemo() {
        if (Utils.m()) {
            LogUtil.a("Suggestion_PluginSuggestion", "deleteFitnessDataForStoreDemo isNoCloudVersion");
            return;
        }
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi != null) {
            recordApi.deleteAllWorkoutRecords();
            recordApi.deleteAllPlanRecords();
        }
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void restoreUserDataForDemoVersion() {
        m();
    }

    private void m() {
        if (Utils.m()) {
            LogUtil.a("Suggestion_PluginSuggestion", "restoreFitnessRecord isNoCloudVersion");
            return;
        }
        String strE = pee.e(pee.e("suggestion", "TrainList.txt"));
        LogUtil.d("Suggestion_PluginSuggestion", "workouStr = ", strE);
        for (WorkoutRecord workoutRecord : ies.c(strE, WorkoutRecord[].class)) {
            if (workoutRecord == null) {
                LogUtil.e("Suggestion_PluginSuggestion", "record is null");
            } else {
                LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
                if (loginInit.getUsetId() != null) {
                    LogUtil.e("Suggestion_PluginSuggestion", "accountInfo is not null");
                    workoutRecord.saveWorkoutDate(DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD));
                    workoutRecord.saveExerciseTime(System.currentTimeMillis());
                    UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
                    if (userProfileMgrApi == null) {
                        LogUtil.j("Suggestion_PluginSuggestion", "getUserInfo : userProfileMgrApi is null.");
                        return;
                    }
                    UserInfomation userInfo = userProfileMgrApi.getUserInfo();
                    if (userInfo == null) {
                        LogUtil.j("Suggestion_PluginSuggestion", "userInfo == null");
                        return;
                    }
                    d(userInfo, workoutRecord, loginInit);
                    DataPlatformApi dataPlatformApi = (DataPlatformApi) Services.d("CoursePlanService", DataPlatformApi.class);
                    if (dataPlatformApi == null) {
                        LogUtil.j("Suggestion_PluginSuggestion", "restoreFitnessRecord dataPlatformApi is null.");
                        return;
                    }
                    dataPlatformApi.insertCalorieData(btx.c(), workoutRecord);
                } else {
                    continue;
                }
            }
        }
    }

    private void d(UserInfomation userInfomation, WorkoutRecord workoutRecord, LoginInit loginInit) {
        if (!userInfomation.isWeightValid()) {
            LogUtil.j("Suggestion_PluginSuggestion", "restoreFitnessRecord !userInfo.isWeightValid()");
        }
        float weightOrDefaultValue = userInfomation.getWeightOrDefaultValue();
        LogUtil.d("Suggestion_PluginSuggestion", "userWeight = ", Float.valueOf(weightOrDefaultValue));
        workoutRecord.saveActualCalorie(workoutRecord.acquireActualCalorie() * weightOrDefaultValue);
        workoutRecord.saveCalorie(workoutRecord.acquireCalorie() * weightOrDefaultValue);
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi != null) {
            recordApi.insertWorkoutRecord(loginInit.getUsetId(), workoutRecord);
        }
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void startSendIntelligentPlan() {
        LogUtil.j("Suggestion_PluginSuggestion", "startSendIntelligentRunPlan");
        ThreadPoolManager.c().a("Suggestion_PluginSuggestion", new Runnable() { // from class: hcj
            @Override // java.lang.Runnable
            public final void run() {
                this.f36419c.d();
            }
        });
    }

    /* synthetic */ void d() {
        if (ifz.c()) {
            LogUtil.j("Suggestion_PluginSuggestion", "start PlanSendService");
            n();
        }
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void sendIntelligentPlan() {
        eee eeeVarA = a(800200002L, "hw.unitedevice.trainplan", "hw.sport.trainplan.device", 0);
        if (BluetoothAdapter.getDefaultAdapter() == null || !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            a(eeeVarA, null);
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_PluginSuggestion");
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("Suggestion_PluginSuggestion", "device info is null");
            a(eeeVarA, deviceInfo);
        } else if (e()) {
            LogUtil.a("Suggestion_PluginSuggestion", "send SampleEvent: ", eeeVarA.toString(), "result: ", Boolean.valueOf(edc.e().sendSampleEventCommand(deviceInfo, eeeVarA, "Suggestion_PluginSuggestion")));
        } else {
            LogUtil.a("Suggestion_PluginSuggestion", "device sync plan not support smart train plan");
            startSendIntelligentPlan();
        }
    }

    private static void a(eee eeeVar, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_PluginSuggestion");
        }
        if (e()) {
            LogUtil.a("Suggestion_PluginSuggestion", "send SampleEvent: ", eeeVar.toString());
            edc.e().sendSampleEventCommand(deviceInfo, eeeVar, new SampleEventCache.e(SampleEventCache.SampleEventCacheReason.DISCONNECT, 24), "Suggestion_PluginSuggestion");
        }
    }

    private static eee a(long j, String str, String str2, int i) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName(str);
        eeeVar.setWearPkgName(str2);
        eeeVar.setCommandId(2);
        eeeVar.a(j);
        eeeVar.a(0);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventTime", System.currentTimeMillis());
            jSONObject.put("type", 0);
            jSONObject.put("action", i);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_PluginSuggestion", "callbackConnectListener err: ", e.getMessage());
        }
        eeeVar.e(eeq.c(eeq.a(jSONObject.toString())));
        return eeeVar;
    }

    public static boolean e() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_PluginSuggestion"), 295);
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public boolean sendSampleEvent(long j, String str, String str2, int i) {
        ReleaseLogUtil.d("Suggestion_PluginSuggestion", "sendSampleEvent id:", Long.valueOf(j));
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_PluginSuggestion");
        if (deviceInfo == null) {
            LogUtil.j("Suggestion_PluginSuggestion", "device info is null");
            return false;
        }
        c(j, str, str2);
        eee eeeVarA = a(j, str, str2, i);
        LogUtil.a("Suggestion_PluginSuggestion", "sendSampleEvent SampleEvent: ", eeeVarA.toString());
        return edc.e().sendSampleEventCommand(deviceInfo, eeeVarA, "Suggestion_PluginSuggestion");
    }

    private static void c(final long j, final String str, final String str2) {
        edc.e().registerDeviceSampleListener(str, new DataReceiveCallback() { // from class: hcf.9
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                ReleaseLogUtil.d("Suggestion_PluginSuggestion", "Received device event with errorCode:", Integer.valueOf(i));
                if (!(eecVar instanceof eee)) {
                    ReleaseLogUtil.e("Suggestion_PluginSuggestion", "Message is not an instance of SampleEvent.");
                    return;
                }
                eee eeeVar = (eee) eecVar;
                if (eeeVar.d() != j || !eeeVar.getSrcPkgName().equals(str2)) {
                    ReleaseLogUtil.e("Suggestion_PluginSuggestion", "message commandId or pkgName not match.");
                    return;
                }
                ReleaseLogUtil.d("Suggestion_PluginSuggestion", "sendSampleEvent id:", Long.valueOf(j), "message:", eeeVar, "eventData:", eeq.d(eeq.e(eeeVar.c())));
                edc.e().unRegisterDeviceSampleListener(str);
            }
        });
    }

    private void n() {
        Intent intent = new Intent(btx.c(), (Class<?>) PlanSendService.class);
        if (!CommonUtil.x(btx.c())) {
            btx.c().startService(intent);
            ReleaseLogUtil.d("Suggestion_PluginSuggestion", "startService SDK < 8.0 || isForeground");
        } else {
            ReleaseLogUtil.d("Suggestion_PluginSuggestion", "startService SDK >= 8.0 and isBackground");
        }
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public RecyclerView.Adapter getBaseRecyclerViewAdapter(List<RecordAction> list) {
        return new BaseRecyclerViewAdapter<RecordAction>(list, R.layout.sug_coach_item_fitness_finish_rcv) { // from class: hcf.6
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i, RecordAction recordAction) {
                hiv.c(recyclerHolder, recordAction);
            }
        };
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void jumpToLongCoach(Context context, int i) {
        if (context == null || i == 0) {
            LogUtil.j("Suggestion_PluginSuggestion", "jumpToStartTrain params invalid");
        } else if (i != 1) {
            LogUtil.a("Suggestion_PluginSuggestion", "jumpToStartTrain courseEntrance", Integer.valueOf(i));
        } else {
            JumpConnectHelper.c().d(context, i);
        }
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public CourseUpdateListener getRunCourseVoiceManager(List<ChoreographedSingleAction> list, FitWorkout fitWorkout, boolean z, CourseEnvParams courseEnvParams) {
        hoy.c().c(list, fitWorkout, z, courseEnvParams);
        return hoy.c();
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void switchToPlanReport(String str) {
        ibf.e().e(str);
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void jumpToPlanTab() {
        JumpUtil.a(btx.c());
    }

    static class d implements SyncApi<Void> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<hcf> f36409c;

        @Override // com.huawei.hihealth.api.SyncApi
        public void cleanCloud(boolean z, Object obj) {
        }

        public d(hcf hcfVar) {
            this.f36409c = new WeakReference<>(hcfVar);
        }

        @Override // com.huawei.hihealth.api.SyncApi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void syncCloud() {
            hcf hcfVar;
            WeakReference<hcf> weakReference = this.f36409c;
            if (weakReference == null || (hcfVar = weakReference.get()) == null) {
                return null;
            }
            hcfVar.o();
            return null;
        }

        @Override // com.huawei.hihealth.api.SyncApi
        public String getLabel() {
            return SyncApi.FITNESS;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, Object obj) {
        if (i != 0) {
            LogUtil.j("Suggestion_PluginSuggestion", "requestTrackSimplifyData not success");
            return;
        }
        if (obj == null) {
            LogUtil.j("Suggestion_PluginSuggestion", "requestTrackSimplifyData objData null");
            return;
        }
        List<HiHealthData> list = (List) obj;
        if (list.isEmpty() || list.get(0) == null) {
            LogUtil.j("Suggestion_PluginSuggestion", "requestTrackSimplifyData size 0");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                try {
                    MotionPathSimplify motionPathSimplifyD = ntv.d(hiHealthData);
                    PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                    if (planApi == null) {
                        LogUtil.j("Suggestion_PluginSuggestion", "intPlanApi == null");
                        return;
                    } else if (motionPathSimplifyD == null) {
                        LogUtil.j("Suggestion_PluginSuggestion", "motionPathSimplify == null");
                    } else if (motionPathSimplifyD.requestSportDataSource() == 2) {
                        ReleaseLogUtil.e("Suggestion_PluginSuggestion", "motionPathSimplify is user input.");
                    } else if (motionPathSimplifyD.requestAbnormalTrack() != 0) {
                        ReleaseLogUtil.e("Suggestion_PluginSuggestion", "motionPathSimplify is abnormal.");
                    } else {
                        d(motionPathSimplifyD, planApi);
                    }
                } catch (NumberFormatException e) {
                    ReleaseLogUtil.a("Suggestion_PluginSuggestion", "onDataResponse exception:", ExceptionUtils.c(e));
                }
            }
        }
    }

    private void d(MotionPathSimplify motionPathSimplify, PlanApi planApi) {
        String strOptString;
        String extendDataString = motionPathSimplify.getExtendDataString("planInfo", "");
        String extendDataString2 = motionPathSimplify.getExtendDataString(HwExerciseConstants.JSON_NAME_PLAN_ID, "");
        if ("".equals(extendDataString)) {
            strOptString = "";
        } else {
            try {
                strOptString = new JSONObject(extendDataString).optString("planId");
            } catch (JSONException unused) {
                LogUtil.e("Suggestion_PluginSuggestion", "toJson error");
                strOptString = "";
            }
        }
        if ("".equals(extendDataString2)) {
            extendDataString2 = strOptString;
        }
        pdr pdrVarE = btw.e(motionPathSimplify);
        ReleaseLogUtil.d("Suggestion_PluginSuggestion", "updateDayRecord planId:", extendDataString2, " workoutId:", pdrVarE.l(), " startTime:", Long.valueOf(pdrVarE.f()), " planCourseTime:", Integer.valueOf(motionPathSimplify.getExtendDataInt(HwExerciseConstants.JSON_NAME_PLAN_COURSE_TIME)));
        pdrVarE.d(iun.c());
        planApi.updateDayRecord(extendDataString2, pdrVarE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("Suggestion_PluginSuggestion", "subscribeSportData");
        if (njy.e(this.j)) {
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            arrayList.add(4);
        }
        HiHealthNativeApi.a(btx.c()).subscribeHiHealthData(this.j, this.f);
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void setH5ProWebView(H5ProWebView h5ProWebView) {
        this.e = h5ProWebView;
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public H5ProWebView getH5ProWebView() {
        return this.e;
    }

    @Override // com.huawei.health.suggestion.PluginSuggestion
    public void notifyActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("Suggestion_PluginSuggestion", "notifyActivityResult requestCode:", Integer.valueOf(i), " resultCode:", Integer.valueOf(i2), " mH5ProWebView:", this.e);
        if (this.e == null) {
            return;
        }
        H5ProBridgeManager.getInstance().notifyActivityResult(this.e.getInstance(), i, i2, intent);
    }
}
