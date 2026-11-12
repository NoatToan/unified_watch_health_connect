package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataApi;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class gmt implements IntelligentPlanDataApi {
    private Handler e = new Handler(Looper.getMainLooper());

    @Override // com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataApi
    public void getAllPlans(int i, final UiCallback<pdn> uiCallback) {
        LogUtil.a("Suggestion_IntelligentPlanDataImpl", "getAllPlans type = ", Integer.valueOf(i));
        if (uiCallback == null) {
            LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getAllPlans() callback == null");
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()) == null) {
            d(uiCallback, "getAllPlans");
        } else if (Utils.k()) {
            c(uiCallback, "getAllPlans");
        } else {
            ghw.b().getAllPlans(i, new DataCallback() { // from class: gmt.3
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str) {
                    LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getAllPlans fail errorCode = ", Integer.valueOf(i2));
                    uiCallback.onFailure(gmt.this.e, i2, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("Suggestion_IntelligentPlanDataImpl", "getAllPlans onSuccess data");
                    if (jSONObject == null) {
                        LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getAllPlans data null.");
                    } else {
                        uiCallback.onSuccess(gmt.this.e, (pdn) new Gson().fromJson(jSONObject.toString(), new TypeToken<pdn>() { // from class: com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataImpl$1$1
                        }.getType()));
                    }
                }
            });
        }
    }

    private <T> void c(UiCallback<T> uiCallback, String str) {
        LogUtil.e("Suggestion_IntelligentPlanDataImpl", str, " is oversea no cloud");
        uiCallback.onFailure(99, str, " this version is oversea no cloud version");
    }

    @Override // com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataApi
    public void getAchievementForecast(int i, int i2, int i3, int i4, final UiCallback<pdy> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getAchievementForecast() callback == null");
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()) == null) {
            d(uiCallback, "getAchievementForecast");
        } else if (Utils.k()) {
            c(uiCallback, "getAchievementForecast");
        } else {
            ghw.b().getAchievementForecast(i, i2, i3, i4, new DataCallback() { // from class: gmt.2
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i5, String str) {
                    LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getAchievementForecast fail errorCode = ", Integer.valueOf(i5));
                    uiCallback.onFailure(gmt.this.e, i5, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("Suggestion_IntelligentPlanDataImpl", "getAchievementForecast onSuccess data", jSONObject);
                    if (jSONObject != null) {
                        uiCallback.onSuccess(gmt.this.e, (pdy) new Gson().fromJson(jSONObject.toString(), new TypeToken<pdy>() { // from class: com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataImpl$2$1
                        }.getType()));
                    } else {
                        LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getAchievementForecast data null");
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataApi
    public void getCurrentReportIndex(final UiCallback<Integer> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getCurrentReportIndex() callback is null");
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()) == null) {
            d(uiCallback, "getCurrentReportIndex");
        } else if (Utils.k()) {
            c(uiCallback, "getCurrentReportIndex");
        } else {
            ghw.b().getCurrentReportIndex(new DataCallback() { // from class: gmt.1
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getCurrentReportIndex fail errorCode = ", Integer.valueOf(i));
                    uiCallback.onFailure(gmt.this.e, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        uiCallback.onSuccess(gmt.this.e, Integer.valueOf(jSONObject.optInt("index")));
                    } else {
                        LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getCurrentReportIndex data null");
                    }
                }
            });
        }
    }

    private <T> void d(UiCallback<T> uiCallback, String str) {
        uiCallback.onFailure(20001, ResultUtil.c(20001));
        LogUtil.e("Suggestion_IntelligentPlanDataImpl", str, ":getAccountInfo == null");
    }

    @Override // com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataApi
    public void postFeedback(pec pecVar, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_IntelligentPlanDataImpl", "postFeedback() callback is null");
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()) == null) {
            d(uiCallback, "postFeedback");
        } else if (!Utils.k()) {
            LogUtil.a("Suggestion_IntelligentPlanDataImpl", "postFeedback userFeedbackBean:", new Gson().toJson(pecVar));
            ghw.b().postFeedback(pecVar, new DataCallback() { // from class: gmt.5
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("Suggestion_IntelligentPlanDataImpl", "postFeedback fail");
                    uiCallback.onFailure(gmt.this.e, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    ReleaseLogUtil.d("Suggestion_IntelligentPlanDataImpl", "postFeedback success");
                    if (jSONObject != null) {
                        uiCallback.onSuccess(jSONObject.toString());
                    } else {
                        ReleaseLogUtil.a("Suggestion_IntelligentPlanDataImpl", "postFeedback data null");
                    }
                }
            });
        } else {
            c(uiCallback, "postFeedback");
        }
    }

    @Override // com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataApi
    public void getTrainingReport(String str, int i, UiCallback<pdx> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getTrainingReport() callback is null");
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()) == null) {
            d(uiCallback, "getTrainingReport");
        } else if (Utils.k()) {
            c(uiCallback, "getTrainingReport");
        } else {
            new gmz().a(str, i, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataApi
    public void getCoachAdvice(String str, boolean z, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getCoachAdvice() callback is null");
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()) == null) {
            d(uiCallback, "getCoachAdvice");
        } else if (Utils.k()) {
            c(uiCallback, "getCoachAdvice");
        } else {
            ghw.b().getCoachAdvice(str, !z ? 1 : 0, new DataCallback() { // from class: gmt.4
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.e("Suggestion_IntelligentPlanDataImpl", "getCoachAdvice fail");
                    uiCallback.onFailure(gmt.this.e, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    ReleaseLogUtil.d("Suggestion_IntelligentPlanDataImpl", "getCoachAdvice onSuccess");
                    if (jSONObject == null) {
                        LogUtil.e("Suggestion_IntelligentPlanDataImpl", "getCoachAdvice data null");
                        return;
                    }
                    String strOptString = jSONObject.optString("coachAdviceParam");
                    if (!TextUtils.isEmpty(strOptString)) {
                        LogUtil.a("Suggestion_IntelligentPlanDataImpl", "AlgorithmInfos : coachAdviceParam = ", strOptString);
                    }
                    uiCallback.onSuccess(gmt.this.e, jSONObject.optString("coachAdvice"));
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.intelligentplan.IntelligentPlanDataApi
    public void updatePlanDate(String str, final List<Integer> list, final List<Integer> list2, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_IntelligentPlanDataImpl", "updatePlanDate() callback is null");
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()) == null) {
            d(uiCallback, "updatePlanDate");
        } else if (Utils.k()) {
            c(uiCallback, "updatePlanDate");
        } else {
            ghw.b().updatePlanDate(str, list, list2, new DataCallback() { // from class: gmt.7
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    LogUtil.j("Suggestion_IntelligentPlanDataImpl", "updatePlanDate fail");
                    uiCallback.onFailure(gmt.this.e, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("Suggestion_IntelligentPlanDataImpl", "updatePlanDate onSuccess data", jSONObject);
                    if (jSONObject == null) {
                        LogUtil.e("Suggestion_IntelligentPlanDataImpl", "updatePlanDate data null");
                        uiCallback.onSuccess(gmt.this.e, "");
                        return;
                    }
                    String strValueOf = String.valueOf(jSONObject.optInt("resultCode"));
                    if ("0".equals(strValueOf)) {
                        glw.c().e();
                        Plan currentPlan = gls.b().getCurrentPlan();
                        if (currentPlan == null) {
                            uiCallback.onSuccess(gmt.this.e, strValueOf);
                            LogUtil.e("Suggestion_IntelligentPlanDataImpl", "updatePlanDate plan == null");
                            return;
                        } else {
                            currentPlan.setRunDate(list);
                            currentPlan.setExeDate(list2);
                            gmc.g().l().d(btx.b(), currentPlan, currentPlan.acquireVersion());
                        }
                    }
                    uiCallback.onSuccess(gmt.this.e, strValueOf);
                }
            });
        }
    }
}
