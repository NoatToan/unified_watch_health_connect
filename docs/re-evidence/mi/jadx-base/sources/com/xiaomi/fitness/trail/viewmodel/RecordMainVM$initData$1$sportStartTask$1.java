package com.xiaomi.fitness.trail.viewmodel;

import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.trail.viewmodel.RecordMainVM$initData$1$sportStartTask$1", f = "RecordMainVM.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
public final class RecordMainVM$initData$1$sportStartTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    int label;
    final /* synthetic */ RecordMainVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordMainVM$initData$1$sportStartTask$1(RecordMainVM recordMainVM, Continuation<? super RecordMainVM$initData$1$sportStartTask$1> continuation) {
        super(2, continuation);
        this.this$0 = recordMainVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecordMainVM$initData$1$sportStartTask$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SportSummaryApi summaryApi = this.this$0.getSummaryApi();
            this.label = 1;
            obj = summaryApi.getStartSec(this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((RecordMainVM$initData$1$sportStartTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
