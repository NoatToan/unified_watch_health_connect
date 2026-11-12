package com.xiaomi.fitness.route.track.viewmodel;

import com.xiaomi.fitness.route.export.track.FailRoutes;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import java.util.List;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/route/export/track/FailRoutes;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1", f = "MyTrackLibraryVM.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
public final class MyTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FailRoutes>, Object> {
    final /* synthetic */ List<String> $routeIds;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1(List<String> list, Continuation<? super MyTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1> continuation) {
        super(2, continuation);
        this.$routeIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1(this.$routeIds, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
            List<String> list = this.$routeIds;
            this.label = 1;
            obj = trackNetManagerKt.deleteUserRoutes(list, this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FailRoutes> continuation) {
        return ((MyTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
