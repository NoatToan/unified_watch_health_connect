package com.xiaomi.fitness.health.curse.vm;

import com.xiaomi.fitness.health.curse.data.DayData;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashMap;", "", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMonthVM$reqMonthPeriod$1$dataRecords$1", f = "CurseMonthVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CurseMonthVM$reqMonthPeriod$1$dataRecords$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LinkedHashMap<Long, DayData>>, Object> {
    final /* synthetic */ LocalDate $localDate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurseMonthVM$reqMonthPeriod$1$dataRecords$1(LocalDate localDate, Continuation<? super CurseMonthVM$reqMonthPeriod$1$dataRecords$1> continuation) {
        super(2, continuation);
        this.$localDate = localDate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurseMonthVM$reqMonthPeriod$1$dataRecords$1(this.$localDate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CurseMonthVMKt.getMonthPeriod(this.$localDate);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LinkedHashMap<Long, DayData>> continuation) {
        return ((CurseMonthVM$reqMonthPeriod$1$dataRecords$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
