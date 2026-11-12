package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import defpackage.eu6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManager$setWidgetGroupListToDevice$1$1$onSuccess$1", f = "WidgetGroupManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WidgetGroupManager$setWidgetGroupListToDevice$1$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ eu6<Boolean> $callback;
    final /* synthetic */ String $did;
    final /* synthetic */ SyncResult $result;
    final /* synthetic */ int $type;
    int label;
    final /* synthetic */ WidgetGroupManager$setWidgetGroupListToDevice$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetGroupManager$setWidgetGroupListToDevice$1$1$onSuccess$1(SyncResult syncResult, eu6<Boolean> eu6Var, WidgetGroupManager$setWidgetGroupListToDevice$1$1 widgetGroupManager$setWidgetGroupListToDevice$1$1, String str, int i, Continuation<? super WidgetGroupManager$setWidgetGroupListToDevice$1$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$result = syncResult;
        this.$callback = eu6Var;
        this.this$0 = widgetGroupManager$setWidgetGroupListToDevice$1$1;
        this.$did = str;
        this.$type = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WidgetGroupManager$setWidgetGroupListToDevice$1$1$onSuccess$1(this.$result, this.$callback, this.this$0, this.$did, this.$type, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Logger.d("Test setWidgetGroupListToDevice " + Thread.currentThread().getName(), new Object[0]);
        SyncResult syncResult = this.$result;
        Logger.i(WidgetGroupManager.TAG, "setWidgetGroupListToDevice: success " + (syncResult != null ? Boxing.boxInt(syncResult.getCode()) : null));
        SyncResult syncResult2 = this.$result;
        if (syncResult2 == null || !SyncResultExitKt.isSuccess(syncResult2)) {
            this.this$0.onError(this.$did, this.$type, -1);
        } else {
            eu6<Boolean> eu6Var = this.$callback;
            if (eu6Var != null) {
                eu6Var.onResult(Boxing.boxBoolean(true));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WidgetGroupManager$setWidgetGroupListToDevice$1$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
