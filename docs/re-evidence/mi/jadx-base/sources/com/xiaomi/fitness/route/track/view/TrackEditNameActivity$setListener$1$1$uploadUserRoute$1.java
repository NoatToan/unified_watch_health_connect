package com.xiaomi.fitness.route.track.view;

import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.UploadUserRoute;
import java.util.HashMap;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/route/export/track/UploadUserRoute;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackEditNameActivity$setListener$1$1$uploadUserRoute$1", f = "TrackEditNameActivity.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
public final class TrackEditNameActivity$setListener$1$1$uploadUserRoute$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UploadUserRoute>, Object> {
    final /* synthetic */ EditRouteBean $routeData;
    int label;
    final /* synthetic */ TrackEditNameActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackEditNameActivity$setListener$1$1$uploadUserRoute$1(TrackEditNameActivity trackEditNameActivity, EditRouteBean editRouteBean, Continuation<? super TrackEditNameActivity$setListener$1$1$uploadUserRoute$1> continuation) {
        super(2, continuation);
        this.this$0 = trackEditNameActivity;
        this.$routeData = editRouteBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackEditNameActivity$setListener$1$1$uploadUserRoute$1(this.this$0, this.$routeData, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TrackNet trackNet = this.this$0.trackRepository;
            long uploadTime = this.$routeData.getUploadTime();
            String routeId = this.$routeData.getRouteId();
            HashMap<String, String> valueMap = this.$routeData.getValueMap();
            this.label = 1;
            obj = TrackNet.DefaultImpls.uploadUserRoute$default(trackNet, uploadTime, routeId, valueMap, null, this, 8, null);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UploadUserRoute> continuation) {
        return ((TrackEditNameActivity$setListener$1$1$uploadUserRoute$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
