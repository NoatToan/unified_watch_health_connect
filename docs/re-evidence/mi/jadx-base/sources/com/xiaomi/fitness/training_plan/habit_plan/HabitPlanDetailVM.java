package com.xiaomi.fitness.training_plan.habit_plan;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanDetailVM;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanDetailModel;", "<init>", "()V", "trainingPlanRequest", "Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "habitData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "getHabitData", "()Landroidx/lifecycle/MutableLiveData;", "getHabitPlanDetail", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitPlanDetailVM extends BaseViewModel<HabitPlanDetailModel> {

    @NotNull
    private final TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();

    @NotNull
    private final MutableLiveData<HabitPlan> habitData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanDetailVM$getHabitPlanDetail$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanDetailVM$getHabitPlanDetail$1", f = "HabitPlanDetailVM.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HabitPlanDetailVM.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanRequest trainingPlanRequest = HabitPlanDetailVM.this.trainingPlanRequest;
                this.label = 1;
                obj = trainingPlanRequest.getHabitPlanDetail(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HabitPlanDetailVM.this.getHabitData().postValue((HabitPlan) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public final MutableLiveData<HabitPlan> getHabitData() {
        return this.habitData;
    }

    public final void getHabitPlanDetail() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}
