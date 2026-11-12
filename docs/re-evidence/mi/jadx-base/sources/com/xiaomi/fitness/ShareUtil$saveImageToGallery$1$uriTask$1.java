package com.xiaomi.fitness;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.ShareUtil$saveImageToGallery$1$uriTask$1", f = "ShareUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ShareUtil$saveImageToGallery$1$uriTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ File $appDir;
    final /* synthetic */ Bitmap $bmp;
    final /* synthetic */ String $fileName;
    final /* synthetic */ boolean $isJpeg;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareUtil$saveImageToGallery$1$uriTask$1(Bitmap bitmap, File file, String str, boolean z, Continuation<? super ShareUtil$saveImageToGallery$1$uriTask$1> continuation) {
        super(2, continuation);
        this.$bmp = bitmap;
        this.$appDir = file;
        this.$fileName = str;
        this.$isJpeg = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareUtil$saveImageToGallery$1$uriTask$1(this.$bmp, this.$appDir, this.$fileName, this.$isJpeg, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ShareUtil.INSTANCE.saveImage(this.$bmp, this.$appDir, this.$fileName, "share", this.$isJpeg);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((ShareUtil$saveImageToGallery$1$uriTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
