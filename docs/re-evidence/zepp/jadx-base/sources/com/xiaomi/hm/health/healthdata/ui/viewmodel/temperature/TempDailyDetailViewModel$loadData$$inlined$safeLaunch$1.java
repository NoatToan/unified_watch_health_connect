package com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.DayTempDetailData;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.temperature.TemperatureDataHelper;
import com.xiaomi.hm.health.temperature.TempExtKt;
import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature.TempDailyDetailViewModel$loadData$$inlined$safeLaunch$1", f = "TempDailyDetailViewModel.kt", i = {0}, l = {25}, m = "invokeSuspend", n = {"start"}, s = {"J$0"})
public final class TempDailyDetailViewModel$loadData$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TempDailyDetailViewModel d;
    public long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempDailyDetailViewModel$loadData$$inlined$safeLaunch$1(Continuation continuation, long j, TempDailyDetailViewModel tempDailyDetailViewModel) {
        super(2, continuation);
        this.c = j;
        this.d = tempDailyDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TempDailyDetailViewModel$loadData$$inlined$safeLaunch$1 tempDailyDetailViewModel$loadData$$inlined$safeLaunch$1 = new TempDailyDetailViewModel$loadData$$inlined$safeLaunch$1(continuation, this.c, this.d);
        tempDailyDetailViewModel$loadData$$inlined$safeLaunch$1.b = obj;
        return tempDailyDetailViewModel$loadData$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TempDailyDetailViewModel$loadData$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase = this.d.dataUseCase;
            this.e = dayStartTime;
            this.a = 1;
            obj = getAllTypeTempBetweenTimeStampUseCase.execute(dayStartTime, dayEndTime, this);
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
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (Boxing.boxBoolean(TempExtKt.isValidRange((Temperature) obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        HMLog.info("TempDailyDetailViewModel", new TempDailyDetailViewModel.a(j, arrayList));
        DayTempDetailData dayTempDetailData = TemperatureDataHelper.INSTANCE.getDayTempDetailData(arrayList, new Date(j));
        this.d.getChartBuilderLiveData().postValue(this.d.chartRepo.getTempMixLineChartBuilder(dayTempDetailData.getChartBuilderData()));
        this.d.getLatestValueLiveData().postValue(CollectionsKt.lastOrNull((List) dayTempDetailData.getChartBuilderData().getChartData()));
        this.d.getStatisticsInfoLiveData().postValue(dayTempDetailData.getStatisticsInfo());
        return Unit.INSTANCE;
    }
}
