package com.xiaomi.fitness.route.track.viewmodel;

import com.xiaomi.fitness.route.export.track.RouteListResponse;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/route/export/track/RouteListResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getTrackList$1$1$result$1", f = "MyTrackLibraryVM.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class MyTrackLibraryVM$getTrackList$1$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RouteListResponse>, Object> {
    final /* synthetic */ boolean $createByUser;
    final /* synthetic */ int $limit;
    int label;
    final /* synthetic */ MyTrackLibraryVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTrackLibraryVM$getTrackList$1$1$result$1(MyTrackLibraryVM myTrackLibraryVM, int i, boolean z, Continuation<? super MyTrackLibraryVM$getTrackList$1$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = myTrackLibraryVM;
        this.$limit = i;
        this.$createByUser = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyTrackLibraryVM$getTrackList$1$1$result$1(this.this$0, this.$limit, this.$createByUser, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
            String str = this.this$0.nextKey;
            int i2 = this.$limit;
            boolean z = this.$createByUser;
            this.label = 1;
            obj = TrackNet.DefaultImpls.getUserRoutesList$default(trackNetManagerKt, 0L, str, i2, false, z ? 1 : 0, this, 8, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RouteListResponse> continuation) {
        return ((MyTrackLibraryVM$getTrackList$1$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
