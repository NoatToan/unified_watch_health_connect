package com.xiaomi.fitness.watch.face.edit.photo.crop;

import android.graphics.Bitmap;
import android.os.RemoteException;
import defpackage.t5d;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropManager$split$1$onServiceConnected$1", f = "FaceEditPhotoCropManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FaceEditPhotoCropManager$split$1$onServiceConnected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Ref.ObjectRef<t5d> $imageSegmentManager;
    final /* synthetic */ Function2<Integer, Bitmap, Unit> $process;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceEditPhotoCropManager$split$1$onServiceConnected$1(Ref.ObjectRef<t5d> objectRef, Bitmap bitmap, Function2<? super Integer, ? super Bitmap, Unit> function2, Continuation<? super FaceEditPhotoCropManager$split$1$onServiceConnected$1> continuation) {
        super(2, continuation);
        this.$imageSegmentManager = objectRef;
        this.$bitmap = bitmap;
        this.$process = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceEditPhotoCropManager$split$1$onServiceConnected$1(this.$imageSegmentManager, this.$bitmap, this.$process, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteException {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FaceEditPhotoCropManager faceEditPhotoCropManager = FaceEditPhotoCropManager.INSTANCE;
        t5d t5dVar = this.$imageSegmentManager.element;
        Intrinsics.checkNotNull(t5dVar);
        faceEditPhotoCropManager.doSplit(t5dVar, this.$bitmap, this.$process);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceEditPhotoCropManager$split$1$onServiceConnected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
