package com.mi.health.sport;

import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.mi.health.sport.RunningRouteListMap$selectMarker$2$routeByteData$1", f = "RunningRouteListMap.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
public final class RunningRouteListMap$selectMarker$2$routeByteData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
    final /* synthetic */ int $routeId;
    final /* synthetic */ String $routeUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunningRouteListMap$selectMarker$2$routeByteData$1(String str, int i, Continuation<? super RunningRouteListMap$selectMarker$2$routeByteData$1> continuation) {
        super(2, continuation);
        this.$routeUrl = str;
        this.$routeId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunningRouteListMap$selectMarker$2$routeByteData$1(this.$routeUrl, this.$routeId, continuation);
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
            obj = fitnessDataExtKt.getTrackByteData(str, strValueOf, this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
        return ((RunningRouteListMap$selectMarker$2$routeByteData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
