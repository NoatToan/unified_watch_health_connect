package com.xiaomi.fitness.training_plan.ability_plan;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanCourseContent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseContent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseItem;
import com.xiaomi.fitness.training_plan_export.model.RunningPaceRange;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u0007H\u0002R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanRunningCourseVM;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanRunningCourseModel;", "<init>", "()V", "planCourse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "getPlanCourse", "()Landroidx/lifecycle/MutableLiveData;", "planRequest", "Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "getCourseDetail", "", "courseId", "", DialWidgetType.DATE, "mockCourseData", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AbilityPlanRunningCourseVM extends BaseViewModel<AbilityPlanRunningCourseModel> {

    @NotNull
    private final MutableLiveData<AbilityDayPlanCourse> planCourse = new MutableLiveData<>();

    @NotNull
    private final TrainingPlanRequest planRequest = new TrainingPlanRequest();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanRunningCourseVM$getCourseDetail$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanRunningCourseVM$getCourseDetail$1", f = "AbilityPlanRunningCourseVM.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $courseId;
        final /* synthetic */ long $date;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$courseId = j;
            this.$date = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AbilityPlanRunningCourseVM.this.new AnonymousClass1(this.$courseId, this.$date, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanRequest trainingPlanRequest = AbilityPlanRunningCourseVM.this.planRequest;
                long j = this.$courseId;
                long j2 = this.$date;
                this.label = 1;
                obj = trainingPlanRequest.getAbilityRunningCourseInfo(j, j2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AbilityPlanRunningCourseVM.this.getPlanCourse().postValue((AbilityDayPlanCourse) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final AbilityDayPlanCourse mockCourseData() {
        return new AbilityDayPlanCourse("0710EM 强度", 123L, 1, 40, 1, new AbilityPlanCourseContent(null, new AbilityPlanRunningCourse(40, "跑", CollectionsKt__CollectionsKt.listOf((Object[]) new AbilityPlanRunningCourseContent[]{new AbilityPlanRunningCourseContent(false, 0, CollectionsKt__CollectionsJVMKt.listOf(new AbilityPlanRunningCourseItem(1, 10, new RunningPaceRange(270, 340)))), new AbilityPlanRunningCourseContent(true, 2, CollectionsKt__CollectionsKt.listOf((Object[]) new AbilityPlanRunningCourseItem[]{new AbilityPlanRunningCourseItem(1, 5, new RunningPaceRange(270, 340)), new AbilityPlanRunningCourseItem(2, 5, new RunningPaceRange(270, 340))})), new AbilityPlanRunningCourseContent(false, 0, CollectionsKt__CollectionsJVMKt.listOf(new AbilityPlanRunningCourseItem(3, 10, new RunningPaceRange(270, 340))))}), 0L, 0L, 24, null)), null, 0L, null, 1, 0L, null, 0, 7616, null);
    }

    public final void getCourseDetail(long courseId, long date) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(courseId, date, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<AbilityDayPlanCourse> getPlanCourse() {
        return this.planCourse;
    }
}
