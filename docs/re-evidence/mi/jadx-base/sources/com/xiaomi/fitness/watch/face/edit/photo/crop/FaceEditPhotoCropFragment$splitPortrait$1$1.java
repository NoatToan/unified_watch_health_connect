package com.xiaomi.fitness.watch.face.edit.photo.crop;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment$splitPortrait$1$1", f = "FaceEditPhotoCropFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FaceEditPhotoCropFragment$splitPortrait$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $code;
    final /* synthetic */ Function2<Integer, Bitmap, Unit> $cropBitmap;
    final /* synthetic */ Bitmap $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceEditPhotoCropFragment$splitPortrait$1$1(Function2<? super Integer, ? super Bitmap, Unit> function2, int i, Bitmap bitmap, Continuation<? super FaceEditPhotoCropFragment$splitPortrait$1$1> continuation) {
        super(2, continuation);
        this.$cropBitmap = function2;
        this.$code = i;
        this.$it = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceEditPhotoCropFragment$splitPortrait$1$1(this.$cropBitmap, this.$code, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$cropBitmap.invoke(Boxing.boxInt(this.$code), this.$it);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceEditPhotoCropFragment$splitPortrait$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
