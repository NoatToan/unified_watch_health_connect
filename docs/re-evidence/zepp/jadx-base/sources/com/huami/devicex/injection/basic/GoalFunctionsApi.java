package com.huami.devicex.injection.basic;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&¨\u0006\u0010"}, d2 = {"Lcom/huami/devicex/injection/basic/GoalFunctionsApi;", "", "", "getGoalStepValue", "getGoalCalorieValue", "getGoalSleepValue", "stepTarget", "", "postStepGoal", "calorieTarget", "", "fromDevice", "postCalorieGoal", "", "getStandValue", "getActivityValue", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface GoalFunctionsApi {
    long getActivityValue();

    int getGoalCalorieValue();

    int getGoalSleepValue();

    int getGoalStepValue();

    long getStandValue();

    void postCalorieGoal(int calorieTarget, boolean fromDevice);

    void postStepGoal(int stepTarget);
}
