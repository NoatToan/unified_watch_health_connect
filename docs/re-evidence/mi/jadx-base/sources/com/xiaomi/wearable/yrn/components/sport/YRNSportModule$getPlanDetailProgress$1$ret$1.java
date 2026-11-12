package com.xiaomi.wearable.yrn.components.sport;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getPlanDetailProgress$1$ret$1", f = "YRNSportModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class YRNSportModule$getPlanDetailProgress$1$ret$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SportBasicReport>>, Object> {
    final /* synthetic */ long $endSec;
    final /* synthetic */ long $startSec;
    int label;
    final /* synthetic */ YRNSportModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YRNSportModule$getPlanDetailProgress$1$ret$1(YRNSportModule yRNSportModule, long j, long j2, Continuation<? super YRNSportModule$getPlanDetailProgress$1$ret$1> continuation) {
        super(2, continuation);
        this.this$0 = yRNSportModule;
        this.$startSec = j;
        this.$endSec = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new YRNSportModule$getPlanDetailProgress$1$ret$1(this.this$0, this.$startSec, this.$endSec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SportBasicReport>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<SportBasicReport>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.getDataGetter().getSportReport(this.$startSec, this.$endSec);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SportBasicReport>> continuation) {
        return ((YRNSportModule$getPlanDetailProgress$1$ret$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
