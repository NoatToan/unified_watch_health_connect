package com.xiaomi.fitness.health.curse.vm;

import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseInfoVM$reqSymptom$1$symptoms$1", f = "CurseInfoVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CurseInfoVM$reqSymptom$1$symptoms$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WomenHealthSymptoms>>, Object> {
    final /* synthetic */ long $endMills;
    final /* synthetic */ long $startMills;
    int label;
    final /* synthetic */ CurseInfoVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurseInfoVM$reqSymptom$1$symptoms$1(CurseInfoVM curseInfoVM, long j, long j2, Continuation<? super CurseInfoVM$reqSymptom$1$symptoms$1> continuation) {
        super(2, continuation);
        this.this$0 = curseInfoVM;
        this.$startMills = j;
        this.$endMills = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurseInfoVM$reqSymptom$1$symptoms$1(this.this$0, this.$startMills, this.$endMills, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WomenHealthSymptoms>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<WomenHealthSymptoms>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.getApi().getSymptom(this.$startMills, this.$endMills);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WomenHealthSymptoms>> continuation) {
        return ((CurseInfoVM$reqSymptom$1$symptoms$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
