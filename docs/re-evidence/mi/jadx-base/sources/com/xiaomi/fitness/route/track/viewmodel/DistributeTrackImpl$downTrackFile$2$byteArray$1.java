package com.xiaomi.fitness.route.track.viewmodel;

import com.xiaomi.fitness.route.export.track.File;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.track.utils.TrackFDSUploader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl$downTrackFile$2$byteArray$1", f = "DistributeTrackImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DistributeTrackImpl$downTrackFile$2$byteArray$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
    final /* synthetic */ Route $route;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistributeTrackImpl$downTrackFile$2$byteArray$1(Route route, Continuation<? super DistributeTrackImpl$downTrackFile$2$byteArray$1> continuation) {
        super(2, continuation);
        this.$route = route;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DistributeTrackImpl$downTrackFile$2$byteArray$1(this.$route, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String url;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TrackFDSUploader companion = TrackFDSUploader.INSTANCE.getInstance();
        File mFile = this.$route.getMFile();
        if (mFile == null || (url = mFile.getUrl()) == null) {
            url = "";
        }
        return companion.downloadRoute(url);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
        return ((DistributeTrackImpl$downTrackFile$2$byteArray$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
