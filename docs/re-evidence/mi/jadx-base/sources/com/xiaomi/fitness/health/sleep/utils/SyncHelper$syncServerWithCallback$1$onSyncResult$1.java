package com.xiaomi.fitness.health.sleep.utils;

import com.xiaomi.fit.fitness.export.api.FitnessServerSyncCallback;
import com.xiaomi.fitness.common.log.Logger;
import java.lang.ref.WeakReference;
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
@DebugMetadata(c = "com.xiaomi.fitness.health.sleep.utils.SyncHelper$syncServerWithCallback$1$onSyncResult$1", f = "SyncHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SyncHelper$syncServerWithCallback$1$onSyncResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WeakReference<FitnessServerSyncCallback> $callback;
    final /* synthetic */ boolean $success;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncHelper$syncServerWithCallback$1$onSyncResult$1(WeakReference<FitnessServerSyncCallback> weakReference, boolean z, Continuation<? super SyncHelper$syncServerWithCallback$1$onSyncResult$1> continuation) {
        super(2, continuation);
        this.$callback = weakReference;
        this.$success = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SyncHelper$syncServerWithCallback$1$onSyncResult$1(this.$callback, this.$success, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FitnessServerSyncCallback fitnessServerSyncCallback = this.$callback.get();
        Logger.i(SyncHelper.TAG, "onSyncResult " + this.$success + " ;callback is:" + fitnessServerSyncCallback + ";");
        if (fitnessServerSyncCallback != null) {
            fitnessServerSyncCallback.onSyncResult(this.$success);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SyncHelper$syncServerWithCallback$1$onSyncResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
