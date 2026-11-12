package com.huawei.health.suggestion.wearengine;

import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.dfh;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface CoursePlanDataCustomer {
    public static final String TAG = "Suggestion_CoursePlanDataCustomer";

    int distributeBusinessType();

    int finishPlanBusinessType();

    byte[] getCourseData(FitWorkout fitWorkout, int i) throws dfh;

    byte[] getPlanBasicData(IntPlan intPlan, Map<String, FitWorkout> map) throws dfh;

    int handleShakeBusinessType();
}
