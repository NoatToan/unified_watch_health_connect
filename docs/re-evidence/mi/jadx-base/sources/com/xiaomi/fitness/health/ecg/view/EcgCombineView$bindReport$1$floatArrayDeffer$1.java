package com.xiaomi.fitness.health.ecg.view;

import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0014\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.ecg.view.EcgCombineView$bindReport$1$floatArrayDeffer$1", f = "EcgCombineView.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
public final class EcgCombineView$bindReport$1$floatArrayDeffer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super float[]>, Object> {
    final /* synthetic */ EcgMedicalItemReport $ecgMedicalItemReport;
    final /* synthetic */ int $sparsePoints;
    final /* synthetic */ int $timeInSec;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgCombineView$bindReport$1$floatArrayDeffer$1(EcgMedicalItemReport ecgMedicalItemReport, int i, int i2, Continuation<? super EcgCombineView$bindReport$1$floatArrayDeffer$1> continuation) {
        super(2, continuation);
        this.$ecgMedicalItemReport = ecgMedicalItemReport;
        this.$timeInSec = i;
        this.$sparsePoints = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EcgCombineView$bindReport$1$floatArrayDeffer$1(this.$ecgMedicalItemReport, this.$timeInSec, this.$sparsePoints, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EcgMedicalItemReport ecgMedicalItemReport = this.$ecgMedicalItemReport;
            int i2 = this.$timeInSec;
            int i3 = this.$sparsePoints;
            this.label = 1;
            obj = ecgMedicalItemReport.getRecordData(i2, i3, this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super float[]> continuation) {
        return ((EcgCombineView$bindReport$1$floatArrayDeffer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
