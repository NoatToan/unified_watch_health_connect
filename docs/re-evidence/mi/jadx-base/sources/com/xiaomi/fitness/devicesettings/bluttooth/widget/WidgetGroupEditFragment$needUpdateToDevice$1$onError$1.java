package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import defpackage.wzi;
import java.util.Locale;
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
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment$needUpdateToDevice$1$onError$1", f = "WidgetGroupEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WidgetGroupEditFragment$needUpdateToDevice$1$onError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $errorCode;
    int label;
    final /* synthetic */ WidgetGroupEditFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetGroupEditFragment$needUpdateToDevice$1$onError$1(WidgetGroupEditFragment widgetGroupEditFragment, int i, Continuation<? super WidgetGroupEditFragment$needUpdateToDevice$1$onError$1> continuation) {
        super(2, continuation);
        this.this$0 = widgetGroupEditFragment;
        this.$errorCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WidgetGroupEditFragment$needUpdateToDevice$1$onError$1(this.this$0, this.$errorCode, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dismissDialog();
        Logger.e(WidgetGroupEditFragment.sTAG, "setWidgetGroupListToDevice errorCode: " + this.$errorCode);
        ToastUtil.showShortToast(String.format(Locale.US, "%s,error:%d", this.this$0.getString(wzi.common_set_error), Boxing.boxInt(this.$errorCode)));
        this.this$0.finish();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WidgetGroupEditFragment$needUpdateToDevice$1$onError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
