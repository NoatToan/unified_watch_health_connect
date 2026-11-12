package com.huami.account;

import com.huami.passport.ErrorCode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.account.XiaoAiTokenConvertManager$getAppXiaomiToken$2", f = "XiaoAiTokenConvertManager.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
public final class XiaoAiTokenConvertManager$getAppXiaomiToken$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public boolean a;
    public int b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XiaoAiTokenConvertManager$getAppXiaomiToken$2(boolean z, Continuation<? super XiaoAiTokenConvertManager$getAppXiaomiToken$2> continuation) {
        super(2, continuation);
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new XiaoAiTokenConvertManager$getAppXiaomiToken$2(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
        return ((XiaoAiTokenConvertManager$getAppXiaomiToken$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z = this.c;
            this.a = z;
            this.b = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            XiaomiTokenMananger.getAppXiaomiAccessToken(new XiaomiTokenMananger.OnGetTokenCallback() { // from class: com.huami.account.XiaoAiTokenConvertManager$getAppXiaomiToken$2$1$1
                @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
                public void empty() {
                    CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m3845constructorimpl(null));
                }

                @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
                public void onError(@Nullable ErrorCode errorCode) {
                    CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m3845constructorimpl(null));
                }

                @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
                public void onRefreshFaild(@Nullable String oldAccessToken) {
                    CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m3845constructorimpl(oldAccessToken));
                }

                @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
                public void onSuccess(@Nullable String newAccessToken) {
                    CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m3845constructorimpl(newAccessToken));
                }
            }, z);
            obj = cancellableContinuationImpl.getResult();
            if (obj == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
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
}
