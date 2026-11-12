package com.xiaomi.fitness.devicesettings.di;

import defpackage.xc6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.di.HealthMonitorManagerImpl$deviceApiCall$1$onError$1", f = "HealthMonitorManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HealthMonitorManagerImpl$deviceApiCall$1$onError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $code;
    final /* synthetic */ Function1<Integer, Unit> $failureCallback;
    final /* synthetic */ String $method;
    final /* synthetic */ int $type;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HealthMonitorManagerImpl$deviceApiCall$1$onError$1(String str, int i, int i2, Function1<? super Integer, Unit> function1, Continuation<? super HealthMonitorManagerImpl$deviceApiCall$1$onError$1> continuation) {
        super(2, continuation);
        this.$method = str;
        this.$type = i;
        this.$code = i2;
        this.$failureCallback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HealthMonitorManagerImpl$deviceApiCall$1$onError$1(this.$method, this.$type, this.$code, this.$failureCallback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        xc6.b("deviceApiCall " + this.$method + " " + this.$type + " " + this.$code);
        Function1<Integer, Unit> function1 = this.$failureCallback;
        if (function1 != null) {
            function1.invoke2(Boxing.boxInt(this.$code));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HealthMonitorManagerImpl$deviceApiCall$1$onError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
