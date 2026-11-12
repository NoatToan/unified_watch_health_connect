package com.xiaomi.fitness.training_plan.habit_plan;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHistoryRecordListVM;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan_export.model.TrainingSportReportInfo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListVM;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHistoryRecordListModel;", "<init>", "()V", "trainingPlanRequest", "Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "getTrainingPlanRequest", "()Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "trainingPlanRequest$delegate", "Lkotlin/Lazy;", "sportReportInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/training_plan_export/model/TrainingSportReportInfo;", "getSportReportInfo", "()Landroidx/lifecycle/MutableLiveData;", "getHistoryList", "", "planId", "", "nextKey", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitPlanHistoryRecordListVM extends BaseViewModel<HabitPlanHistoryRecordListModel> {

    /* JADX INFO: renamed from: trainingPlanRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trainingPlanRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: egb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HabitPlanHistoryRecordListVM.trainingPlanRequest_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<TrainingSportReportInfo> sportReportInfo = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHistoryRecordListVM$getHistoryList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHistoryRecordListVM$getHistoryList$1", f = "HabitPlanHistoryRecordListVM.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $nextKey;
        final /* synthetic */ long $planId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.$nextKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HabitPlanHistoryRecordListVM.this.new AnonymousClass1(this.$planId, this.$nextKey, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanRequest trainingPlanRequest = HabitPlanHistoryRecordListVM.this.getTrainingPlanRequest();
                long j = this.$planId;
                String str = this.$nextKey;
                this.label = 1;
                obj = trainingPlanRequest.getPlanReportList(j, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HabitPlanHistoryRecordListVM.this.getSportReportInfo().postValue((TrainingSportReportInfo) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrainingPlanRequest getTrainingPlanRequest() {
        return (TrainingPlanRequest) this.trainingPlanRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingPlanRequest trainingPlanRequest_delegate$lambda$0() {
        return new TrainingPlanRequest();
    }

    public final void getHistoryList(long planId, @Nullable String nextKey) {
        Logger.d("HabitPlanHistoryRecordListVM", "getHistoryList:" + planId + " - " + nextKey);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(planId, nextKey, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<TrainingSportReportInfo> getSportReportInfo() {
        return this.sportReportInfo;
    }
}
