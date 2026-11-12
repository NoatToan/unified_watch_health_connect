package com.xiaomi.fitness.health.curse.vm;

import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSymVM$reqSymptom$1$data$1", f = "CurseSymVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CurseSymVM$reqSymptom$1$data$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WomenHealthSymptoms>, Object> {
    final /* synthetic */ long $mills;
    int label;
    final /* synthetic */ CurseSymVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurseSymVM$reqSymptom$1$data$1(CurseSymVM curseSymVM, long j, Continuation<? super CurseSymVM$reqSymptom$1$data$1> continuation) {
        super(2, continuation);
        this.this$0 = curseSymVM;
        this.$mills = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurseSymVM$reqSymptom$1$data$1(this.this$0, this.$mills, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.getApi().getSymptom(this.$mills);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WomenHealthSymptoms> continuation) {
        return ((CurseSymVM$reqSymptom$1$data$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
