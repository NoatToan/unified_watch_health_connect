package com.huawei.health.suggestion.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.maps.model.MyLocationStyle;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.suggestion.service.PlanSendService;
import com.huawei.health.suggestion.ui.callback.UiPagingCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.utils.RiskBiAnalytics;
import defpackage.btw;
import defpackage.buh;
import defpackage.ecu;
import defpackage.hve;
import defpackage.hvu;
import defpackage.ifz;
import defpackage.igc;
import defpackage.lsy;
import defpackage.qey;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes31.dex */
public class PlanSendService extends Service {
    private final IBinder d = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f8944b = new b(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicInteger f8943a = new AtomicInteger(0);

    @Override // android.app.Service
    public void onCreate() {
        ReleaseLogUtil.d("Suggestion_PlanSendService", "onCreate");
        super.onCreate();
        g();
    }

    private void g() {
        lsy.a(new Runnable() { // from class: hds
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d();
            }
        });
    }

    public /* synthetic */ void d() {
        ReleaseLogUtil.d("Suggestion_PlanSendService", "send plan info to device enter.");
        this.f8943a.set(0);
        this.f8944b.removeMessages(1);
        this.f8944b.sendEmptyMessageDelayed(1, TimeUnit.MINUTES.toMillis(3L));
        if (!ifz.c()) {
            ReleaseLogUtil.e("Suggestion_PlanSendService", "sendPlanToDevice failed with device not connected or not support.");
            return;
        }
        IntPlan intPlanC = c();
        if (intPlanC != null && intPlanC.getSmartPlanType() == SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue() && (ifz.h() || !btw.d(false))) {
            ReleaseLogUtil.e("Suggestion_PlanSendService", "sendPlanToDevice failed with support smart train plan.");
            return;
        }
        if (intPlanC == null) {
            ReleaseLogUtil.e("Suggestion_PlanSendService", "sendPlanToDevice failed with null plan.");
            a();
            return;
        }
        IntPlan.PlanType planType = intPlanC.getPlanType();
        if (planType != null && e() != IntPlan.PlanType.NA_PLAN.getType() && planType.getType() != e()) {
            a();
            ReleaseLogUtil.d("Suggestion_PlanSendService", "sendPlanToDevice planType:", Integer.valueOf(planType.getType()), "getNeedFinishPlanType:", Integer.valueOf(e()));
        }
        b(intPlanC);
    }

    private int e() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.e("Suggestion_PlanSendService", "get plan api failed.");
            return IntPlan.PlanType.NA_PLAN.getType();
        }
        return planApi.getNeedFinishPlanType();
    }

    private void b(IntPlan intPlan) {
        if (btw.n(intPlan)) {
            ReleaseLogUtil.e("Suggestion_PlanSendService", "plan current week need to update, please check.");
        } else {
            b(intPlan, 3);
        }
    }

    private void a() {
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.e("Suggestion_PlanSendService", "get plan api failed.");
            return;
        }
        final DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_PlanSendService");
        if (deviceInfo == null) {
            ReleaseLogUtil.e("Suggestion_PlanSendService", "deviceInfo is null.");
        } else if (planApi.isNeedSendFinishPlanToDevice(deviceInfo.getDeviceUdid())) {
            ReleaseLogUtil.e("Suggestion_PlanSendService", "checkNeedToSendFinishCmd isNeedSendFinishPlanToDevice.");
            igc.a(IntPlan.PlanType.NA_PLAN.getType()).b(planApi.getNeedSendFinishPlanId(), planApi.getNeedFinishPlanType(), true, new IBaseResponseCallback() { // from class: heb
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    PlanSendService.e(planApi, deviceInfo, i, obj);
                }
            });
        }
    }

    public static /* synthetic */ void e(PlanApi planApi, DeviceInfo deviceInfo, int i, Object obj) {
        ReleaseLogUtil.e("Suggestion_PlanSendService", "sendFinishPlan finish is.", Integer.valueOf(i), obj);
        if (i != 1) {
            planApi.updateSendFinishPlanDevice(deviceInfo.getDeviceUdid());
        }
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (i == 0 && iIntValue == 0) {
            return;
        }
        ReleaseLogUtil.e("Suggestion_PlanSendService", "sendFinishPlan errorCode is :", Integer.valueOf(i));
        RiskBiAnalytics.a((planApi.getNeedFinishPlanType() == IntPlan.PlanType.AI_RUN_PLAN.getType() ? SmartPlanTypeEnum.SMART_TRAINING_PLAN : SmartPlanTypeEnum.SMART_WEIGHT_PLAN).getValue(), RiskBiAnalytics.SmartPlanRiskType.RISK_TYPE_SEND_STOP_PLAN, String.valueOf(i), "responseCode is :", Integer.valueOf(iIntValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IntPlan intPlan, int i) {
        if (i <= 0) {
            ReleaseLogUtil.e("Suggestion_PlanSendService", "planHandleShake failed with current try times :", Integer.valueOf(i));
            RiskBiAnalytics.a(intPlan.getSmartPlanType(), RiskBiAnalytics.SmartPlanRiskType.RISK_TYPE_SYNC_PLAN, "", "planHandleShake fail");
            this.f8944b.sendEmptyMessage(1);
            return;
        }
        ReleaseLogUtil.e("Suggestion_PlanSendService", "begin planHandleShake current try:", Integer.valueOf(i), "plan:", intPlan.toString(), "planType", Integer.valueOf(intPlan.getPlanType().getType()));
        if (IntPlan.PlanType.AI_RUN_PLAN.equals(intPlan.getPlanType())) {
            if (!TextUtils.isEmpty(buh.e("SEND_SUCCESS")) && intPlan.getCompatiblePlan() != null) {
                d(intPlan, i);
                return;
            } else {
                d(intPlan, 2, i);
                return;
            }
        }
        d(intPlan, 2, i);
    }

    private void d(final IntPlan intPlan, final int i) {
        igc.a(IntPlan.PlanType.AI_RUN_PLAN.getType()).d(intPlan.getCompatiblePlan(), true, new IBaseResponseCallback() { // from class: hdy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.d.c(i, intPlan, i2, obj);
            }
        });
    }

    public /* synthetic */ void c(int i, IntPlan intPlan, int i2, Object obj) {
        ReleaseLogUtil.e("Suggestion_PlanSendService", "end planHandleShake with response errorCode is:", Integer.valueOf(i2), "response object is", obj, " tryTimes:", Integer.valueOf(i));
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 1;
        if (i2 != 0) {
            RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_SEND_PLAN_DEVICE.value(), "sendPlanHandleShake errorCode is :", Integer.valueOf(i2));
            b(intPlan, i - 1);
        } else if (iIntValue == 1) {
            RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_SEND_PLAN_DEVICE.value(), "sendPlanHandleShake responseCode is :", Integer.valueOf(iIntValue));
            b(intPlan, i - 1);
        } else if (iIntValue == 3 || iIntValue == 2) {
            d(intPlan, iIntValue, i);
        } else {
            this.f8944b.sendEmptyMessage(1);
        }
    }

    private void d(IntPlan intPlan, int i, int i2) {
        boolean zU = hvu.u(intPlan);
        ReleaseLogUtil.d("Suggestion_PlanSendService", "pushPlanData pushType ", Integer.valueOf(i), " tryTimes ", Integer.valueOf(i2), " isPlanOverdue ", Boolean.valueOf(zU));
        if (zU) {
            return;
        }
        e(intPlan, new AnonymousClass2(i2, intPlan, i));
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.service.PlanSendService$2, reason: invalid class name */
    public class AnonymousClass2 extends UiCallback<List<FitWorkout>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IntPlan f8945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8946c;
        final /* synthetic */ int e;

        AnonymousClass2(int i, IntPlan intPlan, int i2) {
            this.f8946c = i;
            this.f8945b = intPlan;
            this.e = i2;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Suggestion_PlanSendService", "pushPlanData failed with get workout failed current ", Integer.valueOf(this.f8946c));
            RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_SEND_PLAN_DEVICE.value(), "getWorkouts errorCode is :", Integer.valueOf(i), "errorInfo is :", str);
            PlanSendService.this.b(this.f8945b, this.f8946c - 1);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<FitWorkout> list) {
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            final List<FitWorkout> list2 = list;
            ReleaseLogUtil.d("Suggestion_PlanSendService", "pushPlanData with get workout:", Integer.valueOf(list2.size()), " current try times:", Integer.valueOf(this.f8946c));
            final IntPlan intPlan = this.f8945b;
            final int i = this.e;
            final int i2 = this.f8946c;
            lsy.a(new Runnable() { // from class: hea
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36500c.d(intPlan, list2, i, i2);
                }
            });
        }

        public /* synthetic */ void d(IntPlan intPlan, List list, int i, int i2) {
            PlanSendService.this.d(intPlan, list, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final IntPlan intPlan, List<FitWorkout> list, int i, final int i2) {
        igc.a(intPlan.getPlanType().getType()).c(intPlan, list, i, true, new IBaseResponseCallback() { // from class: hdv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i3, Object obj) {
                this.f36492b.e(i2, intPlan, i3, obj);
            }
        });
    }

    public /* synthetic */ void e(int i, IntPlan intPlan, int i2, Object obj) {
        ReleaseLogUtil.e("Suggestion_PlanSendService", "end pushPlanData with response errorCode is:", Integer.valueOf(i2), "response object is", obj, " tryTimes:", Integer.valueOf(i));
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (i2 != 0) {
            RiskBiAnalytics.a(intPlan.getSmartPlanType(), RiskBiAnalytics.SmartPlanRiskType.RISK_TYPE_SYNC_PLAN, String.valueOf(i2), "pushPlanFileData fail responseCode is ", Integer.valueOf(iIntValue));
            b(intPlan, i - 1);
        } else {
            btw.s(intPlan);
            if (IntPlan.PlanType.AI_RUN_PLAN.equals(intPlan.getPlanType())) {
                buh.d("SEND_SUCCESS", "true");
            }
            this.f8944b.sendEmptyMessage(1);
        }
    }

    private void e(IntPlan intPlan, UiCallback<List<FitWorkout>> uiCallback) {
        hve.e(intPlan, uiCallback);
    }

    private IntPlan c() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            return null;
        }
        final IntPlan[] intPlanArr = {null};
        final qey[] qeyVarArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(btw.i() ? 2 : 1);
        planApi.getCurrentPlan(new UiCallback<qey>() { // from class: com.huawei.health.suggestion.service.PlanSendService.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                countDownLatch.countDown();
                LogUtil.e("Suggestion_PlanSendService", "getCurrentPlan errorCode:" + i + ",errorInfo:" + str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(qey qeyVar) {
                countDownLatch.countDown();
                qeyVarArr[0] = qeyVar;
            }
        });
        planApi.e(new UiPagingCallback<IntPlan>() { // from class: com.huawei.health.suggestion.service.PlanSendService.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccessFirst(IntPlan intPlan) {
                if (intPlan != null && (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) || IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType()))) {
                    intPlanArr[0] = intPlan;
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            public void onFailureFirst(int i, String str) {
                ReleaseLogUtil.e("Suggestion_PlanSendService", "getCurrentIntPlan errorCode", Integer.valueOf(i), MyLocationStyle.ERROR_INFO, str);
                RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_SEND_PLAN_DEVICE.value(), "getCurrentIntPlan failure errorCode is :", Integer.valueOf(i), "errorInfo :", str);
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_PlanSendService", "getIntelligentRunPlan wait timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_PlanSendService", "interrupted while waiting for getDietRecordList");
        }
        if (btw.d(qeyVarArr[0]) || btw.e(qeyVarArr[0])) {
            intPlanArr[0] = planApi.convertRunPlan(qeyVarArr[0]);
        }
        return intPlanArr[0];
    }

    public void b() {
        if (this.f8943a.get() > 0) {
            g();
        } else {
            this.f8944b.removeMessages(1);
            stopSelf();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("Suggestion_PlanSendService", "onStartCommand");
        this.f8943a.incrementAndGet();
        this.f8944b.sendEmptyMessage(1);
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.d;
    }

    static class d extends Binder {
        private d() {
        }

        /* synthetic */ d(AnonymousClass2 anonymousClass2) {
            this();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("Suggestion_PlanSendService", "onDestroy");
    }

    static class b extends BaseHandler<PlanSendService> {
        b(Looper looper, PlanSendService planSendService) {
            super(looper, planSendService);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PlanSendService planSendService, Message message) {
            if (message.what != 1) {
                return;
            }
            planSendService.b();
        }
    }
}
