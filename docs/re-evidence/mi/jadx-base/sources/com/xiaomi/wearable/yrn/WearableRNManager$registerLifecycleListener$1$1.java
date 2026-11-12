package com.xiaomi.wearable.yrn;

import com.xiaomi.fitness.common.app.AppManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.wearable.yrn.WearableRNManager$registerLifecycleListener$1$1", f = "WearableRNManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WearableRNManager$registerLifecycleListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public WearableRNManager$registerLifecycleListener$1$1(Continuation<? super WearableRNManager$registerLifecycleListener$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WearableRNManager$registerLifecycleListener$1$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z = WearableRNManager.isAppForegroundState;
        AppManager.Companion companion = AppManager.INSTANCE;
        if (z != companion.getInstance().isAppForeground()) {
            WearableRNManager.isAppForegroundState = companion.getInstance().isAppForeground();
            if (companion.getInstance().isAppForeground() && WearableRNManager.isMainActivityReady) {
                WearableRNManager.INSTANCE.checkBundleUpdate();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WearableRNManager$registerLifecycleListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
