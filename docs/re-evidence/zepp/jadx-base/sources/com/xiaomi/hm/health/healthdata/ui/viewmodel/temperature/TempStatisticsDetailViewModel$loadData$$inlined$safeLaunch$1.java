package com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.dto.DataLoadParam;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.StatisticsTempDetailData;
import com.xiaomi.hm.health.healthdata.utils.temperature.TemperatureDataHelper;
import com.xiaomi.hm.health.temperature.TempExtKt;
import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature.TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1", f = "TempStatisticsDetailViewModel.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
public final class TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ TempStatisticsDetailViewModel d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeMode f;
    public final /* synthetic */ DataLoadParam g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1(Continuation continuation, Pair pair, TempStatisticsDetailViewModel tempStatisticsDetailViewModel, long j, TimeMode timeMode, DataLoadParam dataLoadParam) {
        super(2, continuation);
        this.c = pair;
        this.d = tempStatisticsDetailViewModel;
        this.e = j;
        this.f = timeMode;
        this.g = dataLoadParam;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1 tempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1 = new TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e, this.f, this.g);
        tempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1.b = obj;
        return tempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long time = ((Date) this.c.getFirst()).getTime();
            long time2 = ((Date) this.c.getSecond()).getTime();
            GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase = this.d.dataUseCase;
            this.a = 1;
            obj = getAllTypeTempBetweenTimeStampUseCase.execute(time, time2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (Boxing.boxBoolean(TempExtKt.isValidRange((Temperature) obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        HMLog.info("TempStatisticsDetailViewModel", new TempStatisticsDetailViewModel.a(this.g, arrayList));
        StatisticsTempDetailData statisticsTempDetailData = TemperatureDataHelper.INSTANCE.getStatisticsTempDetailData(arrayList, new Date(this.e), this.f);
        HMLog.info("TempStatisticsDetailViewModel", new TempStatisticsDetailViewModel.b(statisticsTempDetailData));
        this.d.getBarChartBuilderLiveData().postValue(this.d.chartRepo.getBarChartBuilder(new Date(this.e), this.f, statisticsTempDetailData.getChartData(), TemperatureDataType.ALL_DAY));
        this.d.getLatestValueLiveData().postValue(CollectionsKt.lastOrNull((List) statisticsTempDetailData.getChartData()));
        this.d.getStatisticsInfoLiveData().postValue(statisticsTempDetailData.getStatisticsInfo());
        return Unit.INSTANCE;
    }
}
