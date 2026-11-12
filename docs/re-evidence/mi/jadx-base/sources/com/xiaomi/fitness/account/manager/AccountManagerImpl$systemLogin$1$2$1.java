package com.xiaomi.fitness.account.manager;

import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.account.manager.AccountManagerImpl$systemLogin$1$2$1", f = "AccountManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AccountManagerImpl$systemLogin$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountManagerFuture<Bundle> $it;
    int label;
    final /* synthetic */ AccountManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountManagerImpl$systemLogin$1$2$1(AccountManagerImpl accountManagerImpl, AccountManagerFuture<Bundle> accountManagerFuture, Continuation<? super AccountManagerImpl$systemLogin$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = accountManagerImpl;
        this.$it = accountManagerFuture;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountManagerImpl$systemLogin$1$2$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws OperationCanceledException, IOException, AuthenticatorException {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AccountManagerImpl accountManagerImpl = this.this$0;
        Bundle result = this.$it.getResult();
        Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
        accountManagerImpl.notifyLoginCallbackList(result);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountManagerImpl$systemLogin$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
