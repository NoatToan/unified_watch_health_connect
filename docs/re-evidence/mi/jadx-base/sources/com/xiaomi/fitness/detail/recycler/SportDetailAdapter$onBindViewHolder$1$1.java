package com.xiaomi.fitness.detail.recycler;

import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.rz5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.recycler.SportDetailAdapter$onBindViewHolder$1$1", f = "SportDetailAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SportDetailAdapter$onBindViewHolder$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ rz5 $model;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailAdapter$onBindViewHolder$1$1(rz5 rz5Var, Continuation<? super SportDetailAdapter$onBindViewHolder$1$1> continuation) {
        super(2, continuation);
        this.$model = rz5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportDetailAdapter$onBindViewHolder$1$1(this.$model, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String remindUrl = this.$model.h;
        Intrinsics.checkNotNullExpressionValue(remindUrl, "remindUrl");
        WebViewUtilKt.startWebView$default(remindUrl, null, false, false, null, false, null, false, 254, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportDetailAdapter$onBindViewHolder$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
