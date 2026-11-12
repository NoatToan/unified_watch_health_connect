package com.xiaomi.fitness.watch.face;

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
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoHMFragment$installBleFace$1$onSuccess$1", f = "FaceInfoHMFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FaceInfoHMFragment$installBleFace$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $filePath;
    int label;
    final /* synthetic */ FaceInfoHMFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceInfoHMFragment$installBleFace$1$onSuccess$1(FaceInfoHMFragment faceInfoHMFragment, String str, Continuation<? super FaceInfoHMFragment$installBleFace$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = faceInfoHMFragment;
        this.$filePath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceInfoHMFragment$installBleFace$1$onSuccess$1(this.this$0, this.$filePath, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.isInvalid()) {
            return Unit.INSTANCE;
        }
        this.this$0.doInstallFace(this.$filePath);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceInfoHMFragment$installBleFace$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
