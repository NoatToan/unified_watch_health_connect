package com.xiaomi.fitness.sport.viewmodel;

import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRecommendedRouteList$1$result$1", f = "CreateRouteViewModel.kt", i = {}, l = {604}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteViewModel$getRecommendedRouteList$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RunningRouteListBean>, Object> {
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    final /* synthetic */ int $originType;
    int label;
    final /* synthetic */ CreateRouteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteViewModel$getRecommendedRouteList$1$result$1(CreateRouteViewModel createRouteViewModel, double d, double d2, int i, Continuation<? super CreateRouteViewModel$getRecommendedRouteList$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = createRouteViewModel;
        this.$longitude = d;
        this.$latitude = d2;
        this.$originType = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteViewModel$getRecommendedRouteList$1$result$1(this.this$0, this.$longitude, this.$latitude, this.$originType, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RouteRepository routeRepository = this.this$0.getRouteRepository();
            float f = (float) this.$longitude;
            float f2 = (float) this.$latitude;
            int i2 = this.$originType;
            this.label = 1;
            obj = routeRepository.getRouteRecommend(f, f2, i2, this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RunningRouteListBean> continuation) {
        return ((CreateRouteViewModel$getRecommendedRouteList$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
