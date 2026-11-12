package com.xiaomi.fitness.detail.inner;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.sample.SamplingStrategyType;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailStepImpactLandingFragment$bindStepImpactLandingData$1$valueListTask$1", f = "SportDetailStepImpactLandingFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
public final class SportDetailStepImpactLandingFragment$bindStepImpactLandingData$1$valueListTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<SportRecordItem>>, Object> {
    final /* synthetic */ List<SportRecordItem> $freqList;
    int label;
    final /* synthetic */ SportDetailStepImpactLandingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailStepImpactLandingFragment$bindStepImpactLandingData$1$valueListTask$1(List<SportRecordItem> list, SportDetailStepImpactLandingFragment sportDetailStepImpactLandingFragment, Continuation<? super SportDetailStepImpactLandingFragment$bindStepImpactLandingData$1$valueListTask$1> continuation) {
        super(2, continuation);
        this.$freqList = list;
        this.this$0 = sportDetailStepImpactLandingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportDetailStepImpactLandingFragment$bindStepImpactLandingData$1$valueListTask$1(this.$freqList, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SportRecordKey sportRecordKey = SportRecordKey.LandingImpact;
            List<SportRecordItem> list = this.$freqList;
            SportBasicReport mSportValues = this.this$0.getMSportValues();
            Intrinsics.checkNotNull(mSportValues);
            SamplingStrategyType samplingStrategyType = SamplingStrategyType.STRATEGY_LAST;
            this.label = 1;
            obj = SportComputeUtil.getSamplingList(sportRecordKey, list, mSportValues, samplingStrategyType, this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<SportRecordItem>> continuation) {
        return ((SportDetailStepImpactLandingFragment$bindStepImpactLandingData$1$valueListTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
