package com.xiaomi.fitness.eco.device.manager;

import com.xiaomi.fitness.net.response.ApiException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl$refreshEcoDevices$2$1$onSuccess$1", f = "OtherDeviceLoaderManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OtherDeviceLoaderManagerImpl$refreshEcoDevices$2$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CancellableContinuation<Boolean> $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OtherDeviceLoaderManagerImpl$refreshEcoDevices$2$1$onSuccess$1(CancellableContinuation<? super Boolean> cancellableContinuation, Continuation<? super OtherDeviceLoaderManagerImpl$refreshEcoDevices$2$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$it = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtherDeviceLoaderManagerImpl$refreshEcoDevices$2$1$onSuccess$1(this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CancellableContinuation<Boolean> cancellableContinuation = this.$it;
        Boolean boolBoxBoolean = Boxing.boxBoolean(true);
        final CancellableContinuation<Boolean> cancellableContinuation2 = this.$it;
        cancellableContinuation.resume(boolBoxBoolean, new Function1<Throwable, Unit>() { // from class: com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl$refreshEcoDevices$2$1$onSuccess$1.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                CancellableContinuation<Boolean> cancellableContinuation3 = cancellableContinuation2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation3.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(new ApiException(t))));
            }
        });
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OtherDeviceLoaderManagerImpl$refreshEcoDevices$2$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
