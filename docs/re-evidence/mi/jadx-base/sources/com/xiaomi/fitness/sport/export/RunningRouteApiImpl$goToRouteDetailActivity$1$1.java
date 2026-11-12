package com.xiaomi.fitness.sport.export;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.sport.route.detail.RouteDetailActivity;
import com.xiaomi.fitness.sport_export.RouteConstantsKt;
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
@DebugMetadata(c = "com.xiaomi.fitness.sport.export.RunningRouteApiImpl$goToRouteDetailActivity$1$1", f = "RunningRouteApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RunningRouteApiImpl$goToRouteDetailActivity$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $routeId;
    final /* synthetic */ String $traceFileUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunningRouteApiImpl$goToRouteDetailActivity$1$1(Context context, int i, String str, Continuation<? super RunningRouteApiImpl$goToRouteDetailActivity$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$routeId = i;
        this.$traceFileUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunningRouteApiImpl$goToRouteDetailActivity$1$1(this.$context, this.$routeId, this.$traceFileUrl, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Intent intent = new Intent(this.$context, (Class<?>) RouteDetailActivity.class);
        intent.putExtra("route_id", this.$routeId);
        String str = this.$traceFileUrl;
        if (str != null) {
            intent.putExtra(RouteConstantsKt.KEY_TRACE_FILE_URL, str);
        }
        this.$context.startActivity(intent);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunningRouteApiImpl$goToRouteDetailActivity$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
