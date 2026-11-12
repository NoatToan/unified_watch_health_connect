package com.xiaomi.fitness.rn.sdk;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat$http$1$onSuccess$1", f = "MiJiaSDKCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MiJiaSDKCompat$http$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Integer, String, Unit> $onError;
    final /* synthetic */ Ref.ObjectRef<T> $t;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MiJiaSDKCompat$http$1$onSuccess$1(Function2<? super Integer, ? super String, Unit> function2, Ref.ObjectRef<T> objectRef, Continuation<? super MiJiaSDKCompat$http$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$onError = function2;
        this.$t = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiJiaSDKCompat$http$1$onSuccess$1(this.$onError, this.$t, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onError.invoke(Boxing.boxInt(((BaseBean) this.$t.element).getCode()), ((BaseBean) this.$t.element).getMessage());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend$$forInline(Object obj) {
        this.$onError.invoke(Integer.valueOf(((BaseBean) this.$t.element).getCode()), ((BaseBean) this.$t.element).getMessage());
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiJiaSDKCompat$http$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
