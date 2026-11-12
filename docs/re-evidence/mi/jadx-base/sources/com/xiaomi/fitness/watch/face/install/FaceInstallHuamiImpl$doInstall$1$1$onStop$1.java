package com.xiaomi.fitness.watch.face.install;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$doInstall$1$1$onStop$1", f = "FaceInstallHuamiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FaceInstallHuamiImpl$doInstall$1$1$onStop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FaceInstallPushCallback $callback;
    final /* synthetic */ int $p0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceInstallHuamiImpl$doInstall$1$1$onStop$1(int i, FaceInstallPushCallback faceInstallPushCallback, Continuation<? super FaceInstallHuamiImpl$doInstall$1$1$onStop$1> continuation) {
        super(2, continuation);
        this.$p0 = i;
        this.$callback = faceInstallPushCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceInstallHuamiImpl$doInstall$1$1$onStop$1(this.$p0, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.$p0;
        if (i == 0) {
            this.$callback.onFinish(true, 0);
        } else {
            this.$callback.onFinish(false, i);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceInstallHuamiImpl$doInstall$1$1$onStop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
