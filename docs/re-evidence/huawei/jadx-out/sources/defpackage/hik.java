package defpackage;

import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.harmonyos.interwork.base.ability.IInitCallBack;
import com.huawei.harmonyos.interwork.base.content.Intent;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.onehop.fasdk.model.DeviceConnectState;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class hik implements IInitCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UiCallback<Integer> f36771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36772c;
    private String d;
    private FitWorkout e;

    public hik(FitWorkout fitWorkout, String str, long j, UiCallback<Integer> uiCallback) {
        this.e = fitWorkout;
        this.d = str;
        this.f36772c = j;
        this.f36771b = uiCallback;
    }

    public void c(int i) {
        this.f36770a = i;
    }

    @Override // com.huawei.harmonyos.interwork.base.ability.IInitCallBack
    public void onInitSuccess(final String str) {
        if (this.e == null) {
            LogUtil.j("TrainDetailFaInitCallback", "onInitSuccess mFitWorkout is null");
            return;
        }
        LogUtil.a("TrainDetailFaInitCallback", "MyFAInitCallback onInitSuccess the deviceId: ", CommonUtil.n(str));
        if (TextUtils.isEmpty(this.e.acquireId())) {
            ReleaseLogUtil.a("TrainDetailFaInitCallback", "mWorkoutId == null");
            return;
        }
        LogUtil.a("TrainDetailFaInitCallback", "the planId:", this.d);
        if (TextUtils.isEmpty(this.d)) {
            e(str, null);
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("TrainDetailFaInitCallback", "intPlanApi is null.");
        } else {
            planApi.getCurrentIntPlan(new UiCallback<IntPlan>() { // from class: hik.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.j("TrainDetailFaInitCallback", "get CurrentPlan onFailure ,the code is:", Integer.valueOf(i), "the msg is:", str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(final IntPlan intPlan) {
                    if (intPlan == null) {
                        LogUtil.j("TrainDetailFaInitCallback", "the intPlan is null,can't transform planMessage with FA");
                    } else {
                        HandlerExecutor.b(new Runnable() { // from class: hik.5.4
                            @Override // java.lang.Runnable
                            public void run() {
                                hik.this.e(str, intPlan);
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // com.huawei.harmonyos.interwork.base.ability.IInitCallBack
    public void onInitFailure(String str, int i) {
        LogUtil.j("TrainDetailFaInitCallback", "MyFAInitCallback onInitFailure,the deviceId: ", CommonUtil.n(str), " errCode: ", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, IntPlan intPlan) {
        String str2;
        DeviceConnectState deviceConnectState;
        LogUtil.a("TrainDetailFaInitCallback", "the startRemoteAbility executor start...");
        Intent intent = new Intent();
        if (intPlan == null || !intPlan.getPlanId().equals(this.d)) {
            str2 = String.format(Locale.ENGLISH, "homevision://com.huawei.aifitness/course?source=1&courseId=%s&timestamp=%d&userId=-2", this.e.acquireId(), Long.valueOf(System.currentTimeMillis()));
        } else {
            WorkoutRecord workoutRecord = new WorkoutRecord();
            workoutRecord.setPlanTrainDate(ieg.b(this.f36772c));
            int i = btw.e(workoutRecord, intPlan)[0];
            Locale locale = Locale.ENGLISH;
            String strAcquireId = this.e.acquireId();
            long jCurrentTimeMillis = System.currentTimeMillis();
            str2 = String.format(locale, "homevision://com.huawei.aifitness/course?source=1&courseId=%s&timestamp=%d&planId=%s&planType=%d&weekSequence=%d&trainingDate=%d&userId=-2", strAcquireId, Long.valueOf(jCurrentTimeMillis), this.d, Integer.valueOf(intPlan.getPlanType().getType()), Integer.valueOf(i), Long.valueOf(this.f36772c));
        }
        ReleaseLogUtil.d("TrainDetailFaInitCallback", "MyFAIConnectCallBack connect startAbility intent schemeUrl: ", str2);
        intent.setParam("scheme_url", str2);
        DistributedApi distributedApi = (DistributedApi) Services.b("DistributedService", DistributedApi.class);
        int iStartRemoteAbility = distributedApi.startRemoteAbility(BaseApplication.b(), str, intent);
        HashMap map = new HashMap(10);
        map.put("workout_id", this.e.acquireId());
        map.put("workout_name", this.e.acquireName());
        if (iStartRemoteAbility == 0) {
            idy.b(AnalyticsValue.FA_HOP_SUCCESS.value(), map);
            hih.b(this.e.acquireId(), this.e.acquireName(), "2");
        } else {
            map.put("result_code", Integer.valueOf(iStartRemoteAbility));
            idy.b(AnalyticsValue.FA_HOP_FAILUE.value(), map);
        }
        if (iStartRemoteAbility == 0) {
            deviceConnectState = DeviceConnectState.CONNECTED;
        } else {
            deviceConnectState = DeviceConnectState.FAILURE;
        }
        distributedApi.updateConnectStatus(this.f36770a, str, deviceConnectState);
        ReleaseLogUtil.d("TrainDetailFaInitCallback", "startAbilityResult:", Integer.valueOf(iStartRemoteAbility));
        UiCallback<Integer> uiCallback = this.f36771b;
        if (uiCallback != null) {
            uiCallback.onSuccess(Integer.valueOf(iStartRemoteAbility));
        }
        LogUtil.a("TrainDetailFaInitCallback", "the startRemoteAbility executor end...");
    }
}
