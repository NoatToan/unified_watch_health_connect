package com.xiaomi.fitness.sport.view.route;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
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
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteDetailActivity$Companion$start$1$1", f = "CreateRouteDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteDetailActivity$Companion$start$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $officialRoute;
    final /* synthetic */ int $routeId;
    final /* synthetic */ String $trackPath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteDetailActivity$Companion$start$1$1(Context context, int i, String str, boolean z, Continuation<? super CreateRouteDetailActivity$Companion$start$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$routeId = i;
        this.$trackPath = str;
        this.$officialRoute = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteDetailActivity$Companion$start$1$1(this.$context, this.$routeId, this.$trackPath, this.$officialRoute, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Intent intent = new Intent(this.$context, (Class<?>) CreateRouteDetailActivity.class);
        intent.putExtra("route_id", this.$routeId);
        intent.putExtra(CreateRouteDetailActivity.KEY_TRACK_PATH, this.$trackPath);
        intent.putExtra(CreateRouteDetailActivity.KEY_TRACK_OFFICIAL_ROUTE, this.$officialRoute);
        this.$context.startActivity(intent);
        TrackApiKt.getInstance(TrackApi.INSTANCE).routeListNotify();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateRouteDetailActivity$Companion$start$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
