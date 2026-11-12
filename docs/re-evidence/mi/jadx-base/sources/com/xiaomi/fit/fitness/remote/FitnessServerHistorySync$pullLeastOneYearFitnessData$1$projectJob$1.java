package com.xiaomi.fit.fitness.remote;

import com.xiaomi.fit.fitness.persist.process.CrossYearSyncController;
import com.xiaomi.fit.fitness.persist.process.SyncRequestResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullLeastOneYearFitnessData$1$projectJob$1", f = "FitnessServerHistorySync.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
public final class FitnessServerHistorySync$pullLeastOneYearFitnessData$1$projectJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SyncRequestResult>, Object> {
    int label;
    final /* synthetic */ FitnessServerHistorySync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitnessServerHistorySync$pullLeastOneYearFitnessData$1$projectJob$1(FitnessServerHistorySync fitnessServerHistorySync, Continuation<? super FitnessServerHistorySync$pullLeastOneYearFitnessData$1$projectJob$1> continuation) {
        super(2, continuation);
        this.this$0 = fitnessServerHistorySync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FitnessServerHistorySync$pullLeastOneYearFitnessData$1$projectJob$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CrossYearSyncController crossYearSyncController = this.this$0.crossYearSyncInstance;
            this.label = 1;
            obj = crossYearSyncController.pullAllProjectData(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SyncRequestResult> continuation) {
        return ((FitnessServerHistorySync$pullLeastOneYearFitnessData$1$projectJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
