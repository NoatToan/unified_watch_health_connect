package com.huawei.health.plan.model.data.intelligentplan;

import com.huawei.basefitnessadvice.callback.UiCallback;
import defpackage.pdn;
import defpackage.pdx;
import defpackage.pdy;
import defpackage.pec;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public interface IntelligentPlanDataApi {
    void getAchievementForecast(int i, int i2, int i3, int i4, UiCallback<pdy> uiCallback);

    void getAllPlans(int i, UiCallback<pdn> uiCallback);

    void getCoachAdvice(String str, boolean z, UiCallback<String> uiCallback);

    void getCurrentReportIndex(UiCallback<Integer> uiCallback);

    void getTrainingReport(String str, int i, UiCallback<pdx> uiCallback);

    void postFeedback(pec pecVar, UiCallback<String> uiCallback);

    void updatePlanDate(String str, List<Integer> list, List<Integer> list2, UiCallback<String> uiCallback);
}
