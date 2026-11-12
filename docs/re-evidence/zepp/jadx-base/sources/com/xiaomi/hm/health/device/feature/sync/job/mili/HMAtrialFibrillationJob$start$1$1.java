package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.devicex.injection.data.HealthDataApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMAtrialFibrillationJob$start$1$1", f = "HMAtrialFibrillationJob.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
public final class HMAtrialFibrillationJob$start$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ HMAtrialFibrillationJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMAtrialFibrillationJob$start$1$1(HMAtrialFibrillationJob hMAtrialFibrillationJob, Continuation<? super HMAtrialFibrillationJob$start$1$1> continuation) {
        super(2, continuation);
        this.this$0 = hMAtrialFibrillationJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HMAtrialFibrillationJob$start$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HMAtrialFibrillationJob$start$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.sendStatus(0);
            HealthDataApi healthDataApi = this.this$0.getHealthDataApi();
            this.label = 1;
            if (healthDataApi.atrialFibUseCaseSyncDeviceData(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.sendStatus(100);
        return Unit.INSTANCE;
    }
}
