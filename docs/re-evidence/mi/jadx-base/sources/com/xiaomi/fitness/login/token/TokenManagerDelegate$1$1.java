package com.xiaomi.fitness.login.token;

import com.xiaomi.fitness.common.log.Logger;
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
@DebugMetadata(c = "com.xiaomi.fitness.login.token.TokenManagerDelegate$1$1", f = "TokenManagerDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TokenManagerDelegate$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TokenManagerDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenManagerDelegate$1$1(TokenManagerDelegate tokenManagerDelegate, Continuation<? super TokenManagerDelegate$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenManagerDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenManagerDelegate$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.mWaiting) {
            Object obj2 = this.this$0.mRemoteConnectLock;
            TokenManagerDelegate tokenManagerDelegate = this.this$0;
            synchronized (obj2) {
                Logger.i("notify all", new Object[0]);
                tokenManagerDelegate.mRemoteConnectLock.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenManagerDelegate$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
