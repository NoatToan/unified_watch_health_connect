package com.xiaomi.hm.health.devicex.proxy.basic;

import com.huami.devicex.injection.basic.GoalFunctionsApi;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/basic/GoalFunctionsImpl;", "Lcom/huami/devicex/injection/basic/GoalFunctionsApi;", "", "getGoalStepValue", "getGoalCalorieValue", "getGoalSleepValue", "stepTarget", "", "postStepGoal", "calorieTarget", "", "fromDevice", "postCalorieGoal", "", "getStandValue", "getActivityValue", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class GoalFunctionsImpl implements GoalFunctionsApi {
    @Override // com.huami.devicex.injection.basic.GoalFunctionsApi
    public long getActivityValue() {
        return 0L;
    }

    @Override // com.huami.devicex.injection.basic.GoalFunctionsApi
    public int getGoalCalorieValue() {
        return GoalFunctionsKt.getGoalCalorieValue();
    }

    @Override // com.huami.devicex.injection.basic.GoalFunctionsApi
    public int getGoalSleepValue() {
        return GoalFunctionsKt.getGoalSleepValue();
    }

    @Override // com.huami.devicex.injection.basic.GoalFunctionsApi
    public int getGoalStepValue() {
        return GoalFunctionsKt.getGoalStepValue();
    }

    @Override // com.huami.devicex.injection.basic.GoalFunctionsApi
    public long getStandValue() {
        return 0L;
    }

    @Override // com.huami.devicex.injection.basic.GoalFunctionsApi
    public void postCalorieGoal(int calorieTarget, boolean fromDevice) {
        GoalFunctionsKt.postCalorieGoal(calorieTarget, fromDevice);
    }

    @Override // com.huami.devicex.injection.basic.GoalFunctionsApi
    public void postStepGoal(int stepTarget) {
        GoalFunctionsKt.postStepGoal(stepTarget);
    }
}
