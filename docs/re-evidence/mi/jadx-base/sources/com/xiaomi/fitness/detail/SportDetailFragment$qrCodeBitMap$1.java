package com.xiaomi.fitness.detail;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.xiaomi.fit.data.common.util.UrlConstants;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import defpackage.axi;
import defpackage.kfi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailFragment$qrCodeBitMap$1", f = "SportDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SportDetailFragment$qrCodeBitMap$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SportDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailFragment$qrCodeBitMap$1(SportDetailFragment sportDetailFragment, Continuation<? super SportDetailFragment$qrCodeBitMap$1> continuation) {
        super(1, continuation);
        this.this$0 = sportDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SportDetailFragment$qrCodeBitMap$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.this$0.getResources(), axi.f3541a);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        Bitmap bitmapC = kfi.c(UrlConstants.INSTANCE.getQRCodeDownloadHtmlUrl(), ExtUtilsKt.getDp(Boxing.boxFloat(80.0f)), -16777216, bitmapDecodeResource);
        Intrinsics.checkNotNullExpressionValue(bitmapC, "syncEncodeQRCode(...)");
        this.this$0.qrBitmap = bitmapC;
        SportShareBottomView shareBottomView = this.this$0.getShareBottomView();
        Bitmap bitmap = this.this$0.qrBitmap;
        Intrinsics.checkNotNull(bitmap);
        shareBottomView.postSetQrBitmap(bitmap);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Unit> continuation) {
        return ((SportDetailFragment$qrCodeBitMap$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
