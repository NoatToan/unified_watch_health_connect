package com.xiaomi.fitness.sport.view.launch.adapter;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
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
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.adapter.LaunchView$showCreateRouteNotice$2$2$1", f = "LaunchView.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "invokeSuspend", n = {}, s = {})
public final class LaunchView$showCreateRouteNotice$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LaunchView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchView$showCreateRouteNotice$2$2$1(LaunchView launchView, Continuation<? super LaunchView$showCreateRouteNotice$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = launchView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LaunchView$showCreateRouteNotice$2$2$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LaunchView launchView = this.this$0;
            this.label = 1;
            if (launchView.setStartPointNoticeShown(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LaunchView$showCreateRouteNotice$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
