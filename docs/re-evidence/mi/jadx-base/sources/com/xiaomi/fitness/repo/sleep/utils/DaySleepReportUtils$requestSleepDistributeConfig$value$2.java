package com.xiaomi.fitness.repo.sleep.utils;

import com.xiaomi.fitness.repo.sleep.net.SleepDistributeResult;
import com.xiaomi.fitness.repo.sleep.net.SleepRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/repo/sleep/net/SleepDistributeResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.utils.DaySleepReportUtils$requestSleepDistributeConfig$value$2", f = "DaySleepReportUtils.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, s = {})
public final class DaySleepReportUtils$requestSleepDistributeConfig$value$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SleepDistributeResult>, Object> {
    final /* synthetic */ int $age;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DaySleepReportUtils$requestSleepDistributeConfig$value$2(int i, Continuation<? super DaySleepReportUtils$requestSleepDistributeConfig$value$2> continuation) {
        super(2, continuation);
        this.$age = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DaySleepReportUtils$requestSleepDistributeConfig$value$2(this.$age, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SleepRequest sleepRequest = new SleepRequest();
            int i2 = this.$age;
            this.label = 1;
            obj = sleepRequest.getSleepScoreUserDistribute(i2, this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SleepDistributeResult> continuation) {
        return ((DaySleepReportUtils$requestSleepDistributeConfig$value$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
