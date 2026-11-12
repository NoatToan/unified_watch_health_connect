package com.xiaomi.fitness.repo;

import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.repo.TestRepos$triggerSleepAnimal$1$1", f = "TestRepos.kt", i = {}, l = {1794}, m = "invokeSuspend", n = {}, s = {})
public final class TestRepos$triggerSleepAnimal$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TestRepos this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestRepos$triggerSleepAnimal$1$1(TestRepos testRepos, Continuation<? super TestRepos$triggerSleepAnimal$1$1> continuation) {
        super(2, continuation);
        this.this$0 = testRepos;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TestRepos$triggerSleepAnimal$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Logger.i(this.this$0.TAG, "triggerSleepAnimal today has no animal and trigger");
            SleepStatDataRequest companion = SleepStatDataRequest.INSTANCE.getInstance();
            this.label = 1;
            obj = companion.triggerComputeSleepAnimal(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SleepAnimalReport sleepAnimalReport = (SleepAnimalReport) obj;
        this.this$0.getSleepSegmentInsightReport(sleepAnimalReport);
        Logger.i(this.this$0.TAG, "triggerSleepAnimal report = " + sleepAnimalReport);
        SleepStatDataRequest.INSTANCE.getInstance().pullSleepAnimalData();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TestRepos$triggerSleepAnimal$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
