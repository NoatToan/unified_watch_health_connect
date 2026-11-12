package com.xiaomi.fitness.training_plan.common;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/PlanCourseListVM;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/training_plan/common/PlanCourseListModel;", "<init>", "()V", "courseList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "getCourseList", "()Landroidx/lifecycle/MutableLiveData;", "getPlanCourseList", "", "planId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlanCourseListVM extends BaseViewModel<PlanCourseListModel> {

    @NotNull
    private final MutableLiveData<List<AbilityDayPlan>> courseList = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<List<AbilityDayPlan>> getCourseList() {
        return this.courseList;
    }

    @Nullable
    public final Object getPlanCourseList(int i, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
