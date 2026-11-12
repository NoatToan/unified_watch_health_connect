package com.xiaomi.fitness.training_plan.habit_plan;

import com.google.gson.Gson;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan_export.model.HabitSuccessResult;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitSuggestRequest;", "", "<init>", "()V", "habitImproveReply", "", "improve", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitSuggestRequest {

    @NotNull
    public static final HabitSuggestRequest INSTANCE = new HabitSuggestRequest();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitSuggestRequest$habitImproveReply$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitSuggestRequest", f = "HabitSuggestRequest.kt", i = {}, l = {11}, m = "habitImproveReply", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HabitSuggestRequest.this.habitImproveReply(false, this);
        }
    }

    private HabitSuggestRequest() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object habitImproveReply(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objHabitPlanImproveReply = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHabitPlanImproveReply);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("confirm_improve", Boxing.boxBoolean(z));
            String json = new Gson().toJson(linkedHashMap);
            TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
            Intrinsics.checkNotNull(json);
            anonymousClass1.label = 1;
            objHabitPlanImproveReply = trainingPlanRequest.habitPlanImproveReply(json, anonymousClass1);
            if (objHabitPlanImproveReply == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHabitPlanImproveReply);
        }
        HabitSuccessResult habitSuccessResult = (HabitSuccessResult) objHabitPlanImproveReply;
        return Boxing.boxBoolean(habitSuccessResult != null ? habitSuccessResult.getSuccess() : false);
    }
}
