package com.xiaomi.fitness.health.curse.vm;

import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseListVM$getData$1$data$1", f = "CurseListVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CurseListVM$getData$1$data$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Record>>, Object> {
    int label;
    final /* synthetic */ CurseListVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurseListVM$getData$1$data$1(CurseListVM curseListVM, Continuation<? super CurseListVM$getData$1$data$1> continuation) {
        super(2, continuation);
        this.this$0 = curseListVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurseListVM$getData$1$data$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Record>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Record>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.getApi().getLatestRecordByPage(this.this$0.page, this.this$0.pageNum);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Record>> continuation) {
        return ((CurseListVM$getData$1$data$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
