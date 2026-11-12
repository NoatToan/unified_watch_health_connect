package com.xiaomi.wearable.yrn.components.sport;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import java.util.List;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getSportRecord$1$ret$1", f = "YRNSportModule.kt", i = {}, l = {472}, m = "invokeSuspend", n = {}, s = {})
public final class YRNSportModule$getSportRecord$1$ret$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SportBasicReport>>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ long $endSec;
    final /* synthetic */ long $startSec;
    int label;
    final /* synthetic */ YRNSportModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YRNSportModule$getSportRecord$1$ret$1(String str, YRNSportModule yRNSportModule, long j, long j2, Continuation<? super YRNSportModule$getSportRecord$1$ret$1> continuation) {
        super(2, continuation);
        this.$category = str;
        this.this$0 = yRNSportModule;
        this.$startSec = j;
        this.$endSec = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new YRNSportModule$getSportRecord$1$ret$1(this.$category, this.this$0, this.$startSec, this.$endSec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SportBasicReport>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<SportBasicReport>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.$category, "sport_stats_all")) {
                return this.this$0.getDataGetter().getSportReport(this.$startSec, this.$endSec);
            }
            FitnessDataGetter dataGetter = this.this$0.getDataGetter();
            String str = this.$category;
            long j = this.$startSec;
            long j2 = this.$endSec;
            this.label = 1;
            obj = dataGetter.getSportReportByCategory(str, j, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (List) obj;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SportBasicReport>> continuation) {
        return ((YRNSportModule$getSportRecord$1$ret$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
