package com.xiaomi.fitness.sport.view.route;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport.route.detail.model.AddressInfo;
import defpackage.bxa;
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
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteActivity$parseCameraPosition$1$2", f = "CreateRouteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteActivity$parseCameraPosition$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AddressInfo $address;
    final /* synthetic */ double $lat;
    final /* synthetic */ double $lon;
    int label;
    final /* synthetic */ CreateRouteActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteActivity$parseCameraPosition$1$2(AddressInfo addressInfo, CreateRouteActivity createRouteActivity, double d, double d2, Continuation<? super CreateRouteActivity$parseCameraPosition$1$2> continuation) {
        super(2, continuation);
        this.$address = addressInfo;
        this.this$0 = createRouteActivity;
        this.$lat = d;
        this.$lon = d2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteActivity$parseCameraPosition$1$2(this.$address, this.this$0, this.$lat, this.$lon, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FitnessLogUtils.d(CreateRouteActivity.TAG, "getAddressByAmap,address:" + this.$address);
        this.this$0.setCurrentCity(this.$address.getCity());
        double[] dArrB = bxa.b(this.$lat, this.$lon);
        FitnessLogUtils.d(CreateRouteActivity.TAG, "location after convert lat:" + dArrB[0] + ",lon:" + dArrB[1]);
        CreateRouteActivity.access$getMViewModel(this.this$0).updateRouteStrategyParams(dArrB[0], dArrB[1], this.$address);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateRouteActivity$parseCameraPosition$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
