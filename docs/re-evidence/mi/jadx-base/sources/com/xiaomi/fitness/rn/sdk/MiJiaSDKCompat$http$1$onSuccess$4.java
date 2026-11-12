package com.xiaomi.fitness.rn.sdk;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat$http$1$onSuccess$4", f = "MiJiaSDKCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MiJiaSDKCompat$http$1$onSuccess$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<T, Unit> $onSuccess;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MiJiaSDKCompat$http$1$onSuccess$4(Function1<? super T, Unit> function1, Continuation<? super MiJiaSDKCompat$http$1$onSuccess$4> continuation) {
        super(2, continuation);
        this.$onSuccess = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiJiaSDKCompat$http$1$onSuccess$4(this.$onSuccess, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onSuccess.invoke2(null);
        return Unit.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        this.$onSuccess.invoke2(null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiJiaSDKCompat$http$1$onSuccess$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
