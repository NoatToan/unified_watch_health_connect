package com.xiaomi.wearable.yrn.components.sport;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getTrainingIndicators$1$1", f = "YRNSportModule.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
public final class YRNSportModule$getTrainingIndicators$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Callback $callback;
    final /* synthetic */ Map<HomeDataType, Object> $it;
    int label;
    final /* synthetic */ YRNSportModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YRNSportModule$getTrainingIndicators$1$1(YRNSportModule yRNSportModule, Map<HomeDataType, ? extends Object> map, Callback callback, Continuation<? super YRNSportModule$getTrainingIndicators$1$1> continuation) {
        super(2, continuation);
        this.this$0 = yRNSportModule;
        this.$it = map;
        this.$callback = callback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new YRNSportModule$getTrainingIndicators$1$1(this.this$0, this.$it, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            YRNSportModule yRNSportModule = this.this$0;
            Map<HomeDataType, Object> map = this.$it;
            this.label = 1;
            obj = yRNSportModule.getTrainingIndexModelList(map, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$callback.invoke((WritableArray) obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((YRNSportModule$getTrainingIndicators$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
