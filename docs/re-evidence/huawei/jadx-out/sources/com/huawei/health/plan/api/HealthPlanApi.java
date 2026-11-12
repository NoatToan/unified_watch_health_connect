package com.huawei.health.plan.api;

import com.huawei.basefitnessadvice.callback.UiCallback;
import defpackage.ghp;
import defpackage.ghq;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public interface HealthPlanApi {
    void createPlan(ghp ghpVar, UiCallback<Object> uiCallback);

    List<Object> getSchedulesByCalendar(ghq ghqVar, boolean z);
}
