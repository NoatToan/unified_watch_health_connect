package com.xiaomi.hm.health.healthdata.ui.viewmodel.stress;

import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.DayStressDetailData;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.stress.StressDataHelper;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1", f = "StressDailyDetailViewModel.kt", i = {0}, l = {25}, m = "invokeSuspend", n = {"start"}, s = {"J$0"})
public final class StressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ StressDailyDetailViewModel d;
    public long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1(Continuation continuation, long j, StressDailyDetailViewModel stressDailyDetailViewModel) {
        super(2, continuation);
        this.c = j;
        this.d = stressDailyDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1 stressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1 = new StressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1(continuation, this.c, this.d);
        stressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1.b = obj;
        return stressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((StressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long j;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
            long dayStartTime = healthDataTimeUtils.getDayStartTime(this.c);
            long dayEndTime = healthDataTimeUtils.getDayEndTime(this.c);
            GetCombineStressBetweenStampUseCase getCombineStressBetweenStampUseCase = this.d.combineUseCase;
            this.e = dayStartTime;
            this.a = 1;
            obj = getCombineStressBetweenStampUseCase.execute(dayStartTime, dayEndTime, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = dayStartTime;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.e;
            ResultKt.throwOnFailure(obj);
        }
        List<SingleStress> list = (List) obj;
        HMLog.debug(this.d.tag, new StressDailyDetailViewModel.d(list));
        DayStressDetailData dayStressDetailData = StressDataHelper.INSTANCE.getDayStressDetailData(list, this.d.frequencyUseCase.execute(), new Date(j));
        dayStressDetailData.setBarChartBuilder(this.d.chartRep.getBarChartBuilder(new Date(this.c), TimeMode.DAY, dayStressDetailData.getBarChartData(), StressDataType.ALL_DAY));
        this.d.getStressDataLiveData().postValue(dayStressDetailData);
        this.d.getLatestValueLiveData().postValue(CollectionsKt.lastOrNull((List) dayStressDetailData.getBarChartData()));
        return Unit.INSTANCE;
    }
}
