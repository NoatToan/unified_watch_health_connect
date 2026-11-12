package com.xiaomi.fitness.repo.rainbow;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.repo.rainbow.RainbowRepository$getTheReportDataSource$2$stepJob$1", f = "RainbowRepository.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
public final class RainbowRepository$getTheReportDataSource$2$stepJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    final /* synthetic */ long $endTime;
    final /* synthetic */ long $startTime;
    final /* synthetic */ int $zoneOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RainbowRepository$getTheReportDataSource$2$stepJob$1(long j, long j2, int i, Continuation<? super RainbowRepository$getTheReportDataSource$2$stepJob$1> continuation) {
        super(2, continuation);
        this.$startTime = j;
        this.$endTime = j2;
        this.$zoneOffset = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RainbowRepository$getTheReportDataSource$2$stepJob$1(this.$startTime, this.$endTime, this.$zoneOffset, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            HomeDataType homeDataType = HomeDataType.STEP;
            long j = this.$startTime;
            long j2 = this.$endTime;
            int i2 = this.$zoneOffset;
            this.label = 1;
            obj = dailyRecordDaoUtils.getTheRecordSource(homeDataType, j, j2, i2, this);
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

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
        return ((RainbowRepository$getTheReportDataSource$2$stepJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
