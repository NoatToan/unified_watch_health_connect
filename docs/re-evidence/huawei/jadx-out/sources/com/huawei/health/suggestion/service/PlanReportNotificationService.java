package com.huawei.health.suggestion.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.btw;
import defpackage.btx;
import defpackage.buh;
import defpackage.ieg;
import defpackage.ift;
import defpackage.lsb;
import defpackage.qrs;
import defpackage.xjk;
import health.compact.a.Services;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class PlanReportNotificationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IntPlan f8939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8940b;
    private final Binder e = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f8941c = new b(Looper.getMainLooper(), this);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("Suggestion_PlanReportNotificationService", "onCreate");
        this.f8940b = getApplicationContext();
        b();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("Suggestion_PlanReportNotificationService", "onStartCommand");
        c();
        PluginSuggestion.getInstance().startSendIntelligentPlan();
        return 2;
    }

    private void c() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanReportNotificationService", "createFitnessPlan, createPlan : planApi is null.");
        } else {
            planApi.e(new UiCallback<IntPlan>() { // from class: com.huawei.health.suggestion.service.PlanReportNotificationService.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_PlanReportNotificationService", "getCurrentPlan fail errCode:", Integer.valueOf(i), ",errInfo:", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(IntPlan intPlan) {
                    if (intPlan == null || !intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
                        return;
                    }
                    PlanReportNotificationService.this.f8939a = intPlan;
                    LogUtil.a("Suggestion_PlanReportNotificationService", "getCurrentPlan onSuccess data:", PlanReportNotificationService.this.f8939a.getPlanId());
                    int iH = btw.h(PlanReportNotificationService.this.f8939a);
                    LogUtil.a("Suggestion_PlanReportNotificationService", "currentWeek:", Integer.valueOf(iH));
                    if (iH > 1) {
                        PlanReportNotificationService.this.d();
                    }
                }
            });
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.e;
    }

    private void b() {
        LogUtil.a("Suggestion_PlanReportNotificationService", "start PlanReportNotificationService");
        Calendar calendar = Calendar.getInstance();
        int iB = ift.b(calendar.get(7));
        LogUtil.a("Suggestion_PlanReportNotificationService", "dayOfWeeks=", Integer.valueOf(iB));
        calendar.add(5, 8 - iB);
        calendar.set(11, 9);
        LogUtil.a("Suggestion_PlanReportNotificationService", "startReportAlarm  Calendar=", calendar.toString());
        xjk.d(0, new Intent(this.f8940b, (Class<?>) PlanReportNotificationService.class), 201326592, 0, calendar.getTimeInMillis(), 604800000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Handler handler;
        int iB = ift.b(Calendar.getInstance().get(7));
        LogUtil.a("Suggestion_PlanReportNotificationService", "sendPlanReport dayOfWeeks:", Integer.valueOf(iB));
        if (iB != 1 || (handler = this.f8941c) == null) {
            return;
        }
        handler.sendEmptyMessage(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("Suggestion_PlanReportNotificationService", "sendNotification");
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.suggestion.ui.MyPlanReportActivity");
        IntPlan intPlan = this.f8939a;
        if (intPlan != null) {
            intent.putExtra("planId", intPlan.getPlanId());
            intent.putExtra("plantype", this.f8939a.getPlanType());
        }
        intent.setFlags(268435456);
        Resources resources = BaseApplication.getContext().getResources();
        String string = resources.getString(R.string.IDS_fitness_plan_train_report);
        String string2 = resources.getString(R.string.IDS_plan_report_generated_message, this.f8939a.getMetaInfo() == null ? "" : this.f8939a.getMetaInfo().getName());
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        builderC.setTicker(string2);
        builderC.setContentTitle(string);
        builderC.setContentText(string2);
        builderC.setContentIntent(PendingIntent.getActivity(this.f8940b, 0, intent, 201326592));
        builderC.setAutoCancel(true);
        builderC.setDefaults(1);
        lsb.d().c(ieg.e(), builderC.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("Suggestion_PlanReportNotificationService", "createMessageCenterMessage");
        MessageObject messageObject = new MessageObject();
        String string = btx.c().getResources().getString(R.string.IDS_plan_report_generated_message, this.f8939a.getMetaInfo() == null ? "" : this.f8939a.getMetaInfo().getName());
        messageObject.setMsgTitle(string);
        messageObject.setMsgContent(string);
        messageObject.setFlag(0);
        messageObject.setMsgType(1);
        messageObject.setWeight(1);
        messageObject.setReadFlag(0);
        messageObject.setCreateTime(new Date().getTime());
        messageObject.setDetailUri("messagecenter://intPlan");
        messageObject.setPosition(1);
        messageObject.setMetadata(string);
        messageObject.setMsgPosition(11);
        messageObject.setHuid(LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault());
        messageObject.setExpireTime(0L);
        messageObject.setModule(String.valueOf(15));
        messageObject.setType("planMessage");
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageObject.setMsgId(messageCenterApi.getMessageId(String.valueOf(15), "planMessage"));
        messageCenterApi.insertMessage(messageObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("Suggestion_PlanReportNotificationService", "stop service.");
        stopSelf();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Suggestion_PlanReportNotificationService", "onDestroy");
        this.f8940b = null;
        Handler handler = this.f8941c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f8941c = null;
        }
    }

    static class d extends Binder {
        private d() {
        }
    }

    static class b extends BaseHandler<PlanReportNotificationService> {
        b(Looper looper, PlanReportNotificationService planReportNotificationService) {
            super(looper, planReportNotificationService);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PlanReportNotificationService planReportNotificationService, Message message) {
            if (message.what == 101) {
                planReportNotificationService.e();
                planReportNotificationService.a();
                buh.d("planReportData", Boolean.toString(true));
                planReportNotificationService.g();
            }
        }
    }
}
