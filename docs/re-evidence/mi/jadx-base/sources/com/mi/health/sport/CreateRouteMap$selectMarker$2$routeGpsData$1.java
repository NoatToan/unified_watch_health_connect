package com.mi.health.sport;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.mi.health.sport.CreateRouteMap$selectMarker$2$routeGpsData$1", f = "CreateRouteMap.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteMap$selectMarker$2$routeGpsData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Location>>, Object> {
    final /* synthetic */ int $routeId;
    final /* synthetic */ String $routeUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteMap$selectMarker$2$routeGpsData$1(String str, int i, Continuation<? super CreateRouteMap$selectMarker$2$routeGpsData$1> continuation) {
        super(2, continuation);
        this.$routeUrl = str;
        this.$routeId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteMap$selectMarker$2$routeGpsData$1(this.$routeUrl, this.$routeId, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
            String str = this.$routeUrl;
            String strValueOf = String.valueOf(this.$routeId);
            this.label = 1;
            obj = fitnessDataExtKt.getRouteGpsData(str, strValueOf, this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Location>> continuation) {
        return ((CreateRouteMap$selectMarker$2$routeGpsData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
