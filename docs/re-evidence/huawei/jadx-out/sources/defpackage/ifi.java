package defpackage;

import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.callback.JudgeCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ifi {
    public static void d(final JudgeCallback<Boolean> judgeCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            if (judgeCallback != null) {
                judgeCallback.onJudgeCallback(false);
            }
            LogUtil.e("OperationActivity_PlanDataUtil", "initData, getRemindTime : planApi is null.");
            return;
        }
        planApi.getCurrentIntPlan(new UiCallback<IntPlan>() { // from class: ifi.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("OperationActivity_PlanDataUtil", "No current plan now.", Integer.valueOf(i), " ", str);
                ifi.d(judgeCallback, false);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan) {
                LogUtil.e("OperationActivity_PlanDataUtil", "has current plan =", Boolean.valueOf(intPlan != null));
                ifi.d(judgeCallback, intPlan != null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final JudgeCallback<Boolean> judgeCallback, final boolean z) {
        HandlerExecutor.b(new Runnable() { // from class: ifi.1
            @Override // java.lang.Runnable
            public void run() {
                JudgeCallback judgeCallback2 = judgeCallback;
                if (judgeCallback2 != null) {
                    judgeCallback2.onJudgeCallback(Boolean.valueOf(z));
                }
            }
        });
    }

    public static void b(JudgeCallback<IntPlan> judgeCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            if (judgeCallback != null) {
                judgeCallback.onJudgeCallback(null);
            }
            LogUtil.e("OperationActivity_PlanDataUtil", "initData, getRemindTime : planApi is null.");
        } else {
            IntPlan currentIntPlan = planApi.getCurrentIntPlan();
            if (judgeCallback != null) {
                judgeCallback.onJudgeCallback(currentIntPlan);
            }
            planApi.getCurrentIntPlan(new UiCallback<IntPlan>() { // from class: ifi.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("OperationActivity_PlanDataUtil", "No current plan now.", Integer.valueOf(i), " ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(IntPlan intPlan) {
                    LogUtil.e("OperationActivity_PlanDataUtil", "has current plan =", Boolean.valueOf(intPlan != null));
                }
            });
        }
    }

    public static pcp e(String str, List<pcp> list) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("OperationActivity_PlanDataUtil", "selectPlan planTempId is null");
            return null;
        }
        if (str.contains("_")) {
            String[] strArrSplit = str.split("_");
            if (njy.e(strArrSplit, 1)) {
                return null;
            }
            str2 = strArrSplit[0];
            str = strArrSplit[1];
        } else {
            str2 = null;
        }
        try {
            int i = Integer.parseInt(str);
            int i2 = !TextUtils.isEmpty(str2) ? Integer.parseInt(str2) : -1;
            for (pcp pcpVar : list) {
                if (pcpVar.e() == i && (i2 == -1 || i2 == pcpVar.d())) {
                    return pcpVar;
                }
            }
            return null;
        } catch (NumberFormatException e) {
            LogUtil.e("OperationActivity_PlanDataUtil", "NumberFormatException : ", LogAnonymous.b(e));
            return null;
        }
    }
}
