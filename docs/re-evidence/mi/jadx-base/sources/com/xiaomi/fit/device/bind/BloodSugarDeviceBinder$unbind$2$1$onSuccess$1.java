package com.xiaomi.fit.device.bind;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fit.device.bind.BloodSugarDeviceBinder$unbind$2$1$onSuccess$1", f = "BloodSugarDeviceBinder.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
public final class BloodSugarDeviceBinder$unbind$2$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Continuation<Integer> $it;
    int label;
    final /* synthetic */ BloodSugarDeviceBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BloodSugarDeviceBinder$unbind$2$1$onSuccess$1(BloodSugarDeviceBinder bloodSugarDeviceBinder, Continuation<? super Integer> continuation, Continuation<? super BloodSugarDeviceBinder$unbind$2$1$onSuccess$1> continuation2) {
        super(2, continuation2);
        this.this$0 = bloodSugarDeviceBinder;
        this.$it = continuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BloodSugarDeviceBinder$unbind$2$1$onSuccess$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BloodSugarDeviceBinder bloodSugarDeviceBinder = this.this$0;
            this.label = 1;
            obj = super/*com.xiaomi.fit.device.bind.BaseDeviceBinder*/.unbind(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        Continuation<Integer> continuation = this.$it;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m886constructorimpl(Boxing.boxInt(iIntValue)));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BloodSugarDeviceBinder$unbind$2$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
