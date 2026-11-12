package com.huawei.health.sportservice.manager;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.model.IStepRateCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.treadmill.CallBackToReportStepsOrEvent;
import com.huawei.up.model.UserInfomation;
import defpackage.hau;
import defpackage.hbv;
import defpackage.ive;
import defpackage.jaa;
import defpackage.qht;
import defpackage.xkg;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.STEP_MANAGER)
public class StepManager implements ManagerComponent {
    private static final int DEFAULT_HEIGHT = 170;
    private static final float DEFAULT_WEIGHT = 60.0f;
    private static final int GENDER_FEMALE = 0;
    private static final int GENDER_MALE = 1;
    private static final int GENDER_UNKNOWN = 2;
    private static final int MAX_HEIGHT = 300;
    private static final float MAX_WEIGHT = 200.0f;
    private static final int MIN_HEIGHT = 100;
    private static final float MIN_WEIGHT = 30.0f;
    private static final String TAG = "SportService_StepManager";
    private xkg mVibraStepCounterHelper;
    private IStepRateCallback mStepCallback = null;
    private hau mSportCallbackOption = new hau();
    private final CallBackToReportStepsOrEvent mCallbackToReportStepsOrEvent = new CallBackToReportStepsOrEvent() { // from class: com.huawei.health.sportservice.manager.StepManager$$ExternalSyntheticLambda1
        @Override // com.huawei.treadmill.CallBackToReportStepsOrEvent
        public final void onUpdateStepsOrEvent(int i, int i2) {
            this.f$0.m1195lambda$new$0$comhuaweihealthsportservicemanagerStepManager(i, i2);
        }
    };
    private PluginSportTrackAdapter mPluginTrackAdapter = ive.c().a();

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-sportservice-manager-StepManager, reason: not valid java name */
    /* synthetic */ void m1195lambda$new$0$comhuaweihealthsportservicemanagerStepManager(int i, int i2) {
        IStepRateCallback iStepRateCallback = this.mStepCallback;
        if (iStepRateCallback != null) {
            iStepRateCallback.report(i, i2);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        if (this.mPluginTrackAdapter == null) {
            return;
        }
        if (hbv.c(BaseSportManager.getInstance().getSportType())) {
            if (CommonUtil.bh()) {
                initVibrationHelper();
            } else {
                initPhoneStep();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("SPEED_DATA");
        arrayList.add("DISTANCE_DATA");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.StepManager$$ExternalSyntheticLambda3
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1196xfb74bc36(list, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$1$com-huawei-health-sportservice-manager-StepManager, reason: not valid java name */
    /* synthetic */ void m1196xfb74bc36(List list, Map map) {
        if (list.contains("TIME_ONE_SECOND_DURATION")) {
            BaseSportManager baseSportManager = BaseSportManager.getInstance();
            int iIntValue = ((Integer) baseSportManager.getData("SPEED_DATA")).intValue();
            int iIntValue2 = ((Integer) baseSportManager.getData("DISTANCE_DATA")).intValue();
            xkg xkgVar = this.mVibraStepCounterHelper;
            if (xkgVar != null) {
                xkgVar.d(iIntValue * 10, iIntValue2, 0);
            }
        }
    }

    private void initPhoneStep() {
        if (jaa.g()) {
            this.mPluginTrackAdapter.regStepRateListener(new IStepRateCallback() { // from class: com.huawei.health.sportservice.manager.StepManager$$ExternalSyntheticLambda2
                @Override // com.huawei.healthcloud.plugintrack.model.IStepRateCallback
                public final void report(int i, int i2) {
                    this.f$0.m1193xea52d515(i, i2);
                }
            }, 5000);
        }
    }

    /* JADX INFO: renamed from: lambda$initPhoneStep$2$com-huawei-health-sportservice-manager-StepManager, reason: not valid java name */
    /* synthetic */ void m1193xea52d515(int i, int i2) {
        IStepRateCallback iStepRateCallback = this.mStepCallback;
        if (iStepRateCallback != null) {
            iStepRateCallback.report(i, i2);
        }
    }

    private void initVibrationHelper() {
        xkg xkgVarD = xkg.d(BaseApplication.b());
        this.mVibraStepCounterHelper = xkgVarD;
        if (xkgVarD == null) {
            LogUtil.a(TAG, "mVibraStepCounterHelper getInstance failed");
            return;
        }
        final qht qhtVar = new qht();
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null) {
            int gender = userInfo.getGender();
            int i = 1;
            if (gender == 1) {
                gender = 0;
            } else if (gender == 0) {
                gender = 1;
            } else {
                LogUtil.j(TAG, "Unknown state in startVibrateStepCount");
            }
            if (gender >= 0 && gender <= 2) {
                i = gender;
            }
            int height = userInfo.getHeight();
            if (height < 100 || height > 300) {
                height = 170;
            }
            float weight = userInfo.getWeight();
            if (weight < 30.0f || weight > 200.0f) {
                weight = 60.0f;
            }
            qhtVar.d(i, (int) weight, height);
        }
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.sportservice.manager.StepManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1194xda2959ee(qhtVar);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initVibrationHelper$3$com-huawei-health-sportservice-manager-StepManager, reason: not valid java name */
    /* synthetic */ void m1194xda2959ee(qht qhtVar) {
        LogUtil.a(TAG, "VibrateSteps: startVibrateStepCount, isResult:", Boolean.valueOf(this.mVibraStepCounterHelper.d(qhtVar, this.mCallbackToReportStepsOrEvent, 1000)));
    }

    public void initPhoneStep(IStepRateCallback iStepRateCallback) {
        this.mStepCallback = iStepRateCallback;
    }

    public void unregisterVibrateStepsCount() {
        xkg xkgVar = this.mVibraStepCounterHelper;
        if (xkgVar != null) {
            xkgVar.d();
            LogUtil.a(TAG, "VibrateSteps: stopVibrateStepsCount");
        }
        this.mVibraStepCounterHelper = null;
    }

    public void setAdapter(PluginSportTrackAdapter pluginSportTrackAdapter) {
        this.mPluginTrackAdapter = pluginSportTrackAdapter;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        unregisterVibrateStepsCount();
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }
}
