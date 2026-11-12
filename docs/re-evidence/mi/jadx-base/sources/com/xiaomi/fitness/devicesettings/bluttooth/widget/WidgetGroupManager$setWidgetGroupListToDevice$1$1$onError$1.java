package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import com.xiaomi.fitness.common.log.Logger;
import defpackage.eu6;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager$setWidgetGroupListToDevice$1$1$onError$1", f = "WidgetGroupManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WidgetGroupManager$setWidgetGroupListToDevice$1$1$onError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ eu6<Boolean> $callback;
    final /* synthetic */ int $code;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetGroupManager$setWidgetGroupListToDevice$1$1$onError$1(int i, eu6<Boolean> eu6Var, Continuation<? super WidgetGroupManager$setWidgetGroupListToDevice$1$1$onError$1> continuation) {
        super(2, continuation);
        this.$code = i;
        this.$callback = eu6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WidgetGroupManager$setWidgetGroupListToDevice$1$1$onError$1(this.$code, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Logger.e(WidgetGroupManager.TAG, "setWidgetGroupListToDevice: error " + this.$code);
        eu6<Boolean> eu6Var = this.$callback;
        if (eu6Var != null) {
            eu6Var.onError(this.$code);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WidgetGroupManager$setWidgetGroupListToDevice$1$1$onError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
