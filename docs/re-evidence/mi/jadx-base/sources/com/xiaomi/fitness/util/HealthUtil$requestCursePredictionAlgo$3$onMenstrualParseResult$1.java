package com.xiaomi.fitness.util;

import com.mi.fitness.menstrual.data.MenstrualCycleInfo;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.item.AlgoCurseItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.util.HealthUtil$requestCursePredictionAlgo$3$onMenstrualParseResult$1", f = "HealthUtil.kt", i = {}, l = {703, 704, 705}, m = "invokeSuspend", n = {}, s = {})
public final class HealthUtil$requestCursePredictionAlgo$3$onMenstrualParseResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<MenstrualCycleInfo, Unit> $action;
    final /* synthetic */ AlgoCurseItem $firstItem;
    final /* synthetic */ MenstrualCycleInfo $info;
    final /* synthetic */ AlgoCurseItem $secondItem;
    final /* synthetic */ AlgoCurseItem $thirdItem;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HealthUtil$requestCursePredictionAlgo$3$onMenstrualParseResult$1(AlgoCurseItem algoCurseItem, AlgoCurseItem algoCurseItem2, AlgoCurseItem algoCurseItem3, Function1<? super MenstrualCycleInfo, Unit> function1, MenstrualCycleInfo menstrualCycleInfo, Continuation<? super HealthUtil$requestCursePredictionAlgo$3$onMenstrualParseResult$1> continuation) {
        super(2, continuation);
        this.$firstItem = algoCurseItem;
        this.$secondItem = algoCurseItem2;
        this.$thirdItem = algoCurseItem3;
        this.$action = function1;
        this.$info = menstrualCycleInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HealthUtil$requestCursePredictionAlgo$3$onMenstrualParseResult$1(this.$firstItem, this.$secondItem, this.$thirdItem, this.$action, this.$info, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FitnessDataGetter fitnessDataExtKt;
        AlgoCurseItem algoCurseItem;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                algoCurseItem = this.$thirdItem;
                this.label = 3;
                if (fitnessDataExtKt.insertAlgoCurseData(algoCurseItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$action.invoke2(this.$info);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        FitnessDataGetter fitnessDataExtKt2 = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
        AlgoCurseItem algoCurseItem2 = this.$firstItem;
        this.label = 1;
        if (fitnessDataExtKt2.insertAlgoCurseData(algoCurseItem2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        FitnessDataGetter fitnessDataExtKt3 = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
        AlgoCurseItem algoCurseItem3 = this.$secondItem;
        this.label = 2;
        if (fitnessDataExtKt3.insertAlgoCurseData(algoCurseItem3, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
        algoCurseItem = this.$thirdItem;
        this.label = 3;
        if (fitnessDataExtKt.insertAlgoCurseData(algoCurseItem, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.$action.invoke2(this.$info);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HealthUtil$requestCursePredictionAlgo$3$onMenstrualParseResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
