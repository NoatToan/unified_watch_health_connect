package com.huawei.health.plan.model.receiver;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.courseplanservice.R;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.btw;
import defpackage.buh;
import defpackage.ghf;
import defpackage.ghg;
import defpackage.ghi;
import defpackage.glq;
import defpackage.gmi;
import defpackage.gnw;
import defpackage.ieg;
import defpackage.ift;
import defpackage.lsb;
import defpackage.lsl;
import defpackage.njy;
import defpackage.pds;
import defpackage.qre;
import defpackage.qrs;
import defpackage.xjk;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.utils.StringUtils;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes29.dex */
public class AlarmReceiver extends BroadcastReceiver {
    private static int d;

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        LogUtil.a("Suggestion_AlarmReceiver", "Receive alarm broadcast-----------");
        if (intent == null) {
            LogUtil.j("Suggestion_AlarmReceiver", "i == null");
            return;
        }
        final String strC = StringUtils.c((Object) intent.getStringExtra(JsbMapKeyNames.H5_USER_ID));
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit.getIsLogined() && strC.equals(loginInit.getAccountInfo(1011))) {
            LogUtil.a("Suggestion_AlarmReceiver", "oldPlanType: " + intent.getIntExtra("planType", -1));
            gmi.b().b(new UiCallback<ghf>() { // from class: com.huawei.health.plan.model.receiver.AlarmReceiver.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_AlarmReceiver", "errorCode :" + i + ";errorInfo :" + str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Handler handler, ghf ghfVar) {
                    onSuccess(ghfVar);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ghf ghfVar) {
                    if (ghfVar != null && ghfVar.getPlanType() != null) {
                        if (!AlarmReceiver.this.c(ghfVar.getPlanType().getType())) {
                            ReleaseLogUtil.c("Suggestion_AlarmReceiver", "AlarmReceiver isOpenRemind false");
                            return;
                        }
                        if (xjk.d(intent)) {
                            long jE = xjk.e(intent, 5, 1);
                            glq.c(ghfVar, (Boolean) true, jE);
                            ReleaseLogUtil.c("Suggestion_AlarmReceiver", "onReceive onSuccess timeMillis ", Long.valueOf(jE));
                            return;
                        }
                        if (!btw.k(ghfVar)) {
                            AlarmReceiver.e();
                            LogUtil.a("Suggestion_AlarmReceiver", "planType: " + ghfVar.getPlanType().getType() + ", planNotifyId = ", Integer.valueOf(AlarmReceiver.d));
                            ghg ghgVarA = AlarmReceiver.this.a(ghfVar);
                            String strB = AlarmReceiver.this.b(ghgVarA, ghfVar.getPlanId());
                            if (TextUtils.isEmpty(strB) || ghgVarA == null) {
                                LogUtil.a("Suggestion_AlarmReceiver", "today is rest day.");
                                return;
                            }
                            AlarmReceiver alarmReceiver = AlarmReceiver.this;
                            alarmReceiver.d(ghfVar, context, alarmReceiver.e(ghgVarA.getActionId(), ghfVar.getPlanId()), AlarmReceiver.d, strB);
                            AlarmReceiver.this.c(strC, ghfVar);
                            return;
                        }
                        ReleaseLogUtil.c("Suggestion_AlarmReceiver", "AlarmReceiver intPlanVip expired");
                        return;
                    }
                    LogUtil.j("Suggestion_AlarmReceiver", "onReceive current plan or planType is null");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(int i) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_AlarmReceiver", "isOpenRemind planApi is null.");
            return true;
        }
        planApi.setPlanType(i);
        return planApi.isOpenRemind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent e(String str, String str2) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse("huaweischeme://healthapp/fitnesspage?skip_type=train_details&id=" + str + "&version=2.0&planId=" + str2 + "&planExecuteTime=" + lsl.r(System.currentTimeMillis())));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ghf ghfVar, Context context, Intent intent, int i, String str) {
        String strA;
        String name = "";
        if (ghfVar.getPlanType().equals(IntPlan.PlanType.RUN_PLAN) || ghfVar.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
            strA = qre.f(R.string.sug_exercise_remind) + " " + str;
        } else {
            strA = (ghfVar.getPlanType().equals(IntPlan.PlanType.FIT_PLAN) || ghfVar.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) ? qre.a(R.string.sug_home_remind_workout, str) : "";
        }
        if (ghfVar.getCompatiblePlan() != null) {
            name = ghfVar.getCompatiblePlan().acquireName();
        } else if (ghfVar.getMetaInfo() != null) {
            name = ghfVar.getMetaInfo().getName();
        } else {
            LogUtil.j("Suggestion_AlarmReceiver", "planName plan error.");
        }
        lsb.b().c(i, c(strA, name, strA, PendingIntent.getActivity(context, ghfVar.getPlanType().getType(), intent, 201326592)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, ghf ghfVar) {
        LogUtil.a("Suggestion_AlarmReceiver", "createMessageCenterMessage");
        MessageObject messageObject = new MessageObject();
        String string = BaseApplication.getContext().getString(R.string.IDS_plugin_fitnessadvice_plan_message);
        messageObject.setMsgTitle(string);
        messageObject.setMsgContent(string);
        messageObject.setFlag(0);
        messageObject.setMsgType(1);
        messageObject.setWeight(1);
        messageObject.setReadFlag(0);
        messageObject.setCreateTime(new Date().getTime());
        messageObject.setDetailUri(b(ghfVar.getPlanType()));
        messageObject.setPosition(1);
        messageObject.setMetadata(string);
        messageObject.setMsgPosition(11);
        messageObject.setHuid(str);
        messageObject.setExpireTime(0L);
        messageObject.setModule(String.valueOf(15));
        messageObject.setType("planMessage");
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageObject.setMsgId(messageCenterApi.getMessageId(String.valueOf(15), "planMessage"));
        messageCenterApi.insertMessage(messageObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        d = ieg.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ghg a(ghf ghfVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime());
        ghi ghiVarC = gnw.c(ghfVar, btw.h(ghfVar), ift.b(calendar.get(7)));
        if (ghiVarC == null || ghiVarC.getPunchFlag() == 1) {
            LogUtil.a("Suggestion_AlarmReceiver", "dayInfo is null or has trained");
            return null;
        }
        if (njy.b(ghiVarC.b())) {
            for (ghg ghgVar : ghiVarC.b()) {
                if (ghgVar.getPunchFlag() == 0) {
                    return ghgVar;
                }
            }
        } else if (njy.b(ghiVarC.a())) {
            for (ghg ghgVar2 : ghiVarC.a()) {
                if (ghgVar2.getPunchFlag() == 0) {
                    return ghgVar2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(ghg ghgVar, String str) {
        if (ghgVar == null) {
            return "";
        }
        pds actionInfo = ghgVar.getActionInfo();
        String strB = b(str);
        if (actionInfo == null || (!StringUtils.g(strB) && ghgVar.getActionId().equals(strB))) {
            return "";
        }
        return actionInfo.b();
    }

    private Notification c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent) {
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        builderC.setTicker(charSequence);
        builderC.setContentTitle(charSequence2);
        builderC.setContentText(charSequence3);
        builderC.setContentIntent(pendingIntent);
        builderC.setAutoCancel(true);
        builderC.setDefaults(1);
        builderC.setOngoing(false);
        builderC.setOnlyAlertOnce(true);
        return builderC.build();
    }

    private String b(IntPlan.PlanType planType) {
        if (planType.equals(IntPlan.PlanType.RUN_PLAN)) {
            return "";
        }
        return "messagecenter://intPlan";
    }

    private String b(String str) {
        String strE = buh.e("intPlanTrainingCourse");
        if (!StringUtils.g(strE) && !StringUtils.g(str)) {
            try {
                WorkoutRecord workoutRecord = (WorkoutRecord) new Gson().fromJson(strE, WorkoutRecord.class);
                LogUtil.a("Suggestion_AlarmReceiver", "trainingCourse record:" + workoutRecord);
                if (workoutRecord != null && str.equals(workoutRecord.acquirePlanId()) && workoutRecord.acquireExerciseTime() > 0 && Math.abs(System.currentTimeMillis() - workoutRecord.acquireExerciseTime()) < 3600000) {
                    return workoutRecord.acquireWorkoutId();
                }
                return "";
            } catch (JsonSyntaxException unused) {
                LogUtil.e("Suggestion_AlarmReceiver", "getTrainingCourseId JsonSyntaxException");
                return "";
            }
        }
        return "";
    }
}
