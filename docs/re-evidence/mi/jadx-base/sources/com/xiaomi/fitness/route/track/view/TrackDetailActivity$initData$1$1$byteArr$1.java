package com.xiaomi.fitness.route.track.view;

import com.xiaomi.fitness.route.export.track.TrackDetailData;
import com.xiaomi.fitness.route.track.utils.TrackFDSUploader;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackDetailActivity$initData$1$1$byteArr$1", f = "TrackDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TrackDetailActivity$initData$1$1$byteArr$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
    int label;
    final /* synthetic */ TrackDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackDetailActivity$initData$1$1$byteArr$1(TrackDetailActivity trackDetailActivity, Continuation<? super TrackDetailActivity$initData$1$1$byteArr$1> continuation) {
        super(2, continuation);
        this.this$0 = trackDetailActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackDetailActivity$initData$1$1$byteArr$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TrackFDSUploader companion = TrackFDSUploader.INSTANCE.getInstance();
        TrackDetailData routeDetail = this.this$0.getRouteDetail();
        Intrinsics.checkNotNull(routeDetail);
        String mFileUrl = routeDetail.getMFileUrl();
        if (mFileUrl == null) {
            mFileUrl = "";
        }
        return companion.downloadRoute(mFileUrl);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
        return ((TrackDetailActivity$initData$1$1$byteArr$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
