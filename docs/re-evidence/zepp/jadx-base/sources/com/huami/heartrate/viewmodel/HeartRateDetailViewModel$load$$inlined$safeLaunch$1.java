package com.huami.heartrate.viewmodel;

import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.ResourceKt;
import com.huami.bigdata.statistics.heartrate.HeartRateStatistics;
import com.huami.heartrate.usecase.HeartRateBigDataUseCase;
import com.huami.heartrate.utils.DataUtils;
import com.huami.heartrate.vo.StatisticsDetailData;
import com.huami.tools.log.HMLog;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/heartrate/utils/CoroutinueExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.heartrate.viewmodel.HeartRateDetailViewModel$load$$inlined$safeLaunch$1", f = "HeartRateDetailViewModel.kt", i = {}, l = {43, 44, 45}, m = "invokeSuspend", n = {}, s = {})
public final class HeartRateDetailViewModel$load$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HeartRateDetailViewModel d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartRateDetailViewModel$load$$inlined$safeLaunch$1(Continuation continuation, int i, HeartRateDetailViewModel heartRateDetailViewModel, String str, long j) {
        super(2, continuation);
        this.c = i;
        this.d = heartRateDetailViewModel;
        this.e = str;
        this.f = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HeartRateDetailViewModel$load$$inlined$safeLaunch$1 heartRateDetailViewModel$load$$inlined$safeLaunch$1 = new HeartRateDetailViewModel$load$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e, this.f);
        heartRateDetailViewModel$load$$inlined$safeLaunch$1.b = obj;
        return heartRateDetailViewModel$load$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HeartRateDetailViewModel$load$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Resource resource;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = this.c;
            if (i2 != 16) {
                if (i2 == 17) {
                    HeartRateBigDataUseCase heartRateBigDataUseCaseB = this.d.b();
                    String str = this.e;
                    this.a = 1;
                    obj = heartRateBigDataUseCaseB.getWeek(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    resource = (Resource) obj;
                    HeartRateStatistics heartRateStatistics = (HeartRateStatistics) ResourceKt.getOrNull(resource);
                    HMLog.info(this.d.tag, new HeartRateDetailViewModel.b(heartRateStatistics));
                    this.d.getRawData().postValue(heartRateStatistics);
                    StatisticsDetailData statisticsDetailData = DataUtils.INSTANCE.getStatisticsDetailData(new Date(this.f), this.c, heartRateStatistics);
                    this.d.getChartBuilderLiveData().postValue(statisticsDetailData.getChartBuilder());
                    this.d.getBarPeriodInfoLiveData().postValue(this.d.a(statisticsDetailData.getChartBuilder().getBars(), statisticsDetailData.getStatisticsInfo()));
                    this.d.getStatisticsLiveData().postValue(statisticsDetailData.getStatisticsInfo());
                } else if (i2 != 18) {
                    HeartRateBigDataUseCase heartRateBigDataUseCaseB2 = this.d.b();
                    String str2 = this.e;
                    this.a = 3;
                    obj = heartRateBigDataUseCaseB2.getYear(str2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    resource = (Resource) obj;
                    HeartRateStatistics heartRateStatistics2 = (HeartRateStatistics) ResourceKt.getOrNull(resource);
                    HMLog.info(this.d.tag, new HeartRateDetailViewModel.b(heartRateStatistics2));
                    this.d.getRawData().postValue(heartRateStatistics2);
                    StatisticsDetailData statisticsDetailData2 = DataUtils.INSTANCE.getStatisticsDetailData(new Date(this.f), this.c, heartRateStatistics2);
                    this.d.getChartBuilderLiveData().postValue(statisticsDetailData2.getChartBuilder());
                    this.d.getBarPeriodInfoLiveData().postValue(this.d.a(statisticsDetailData2.getChartBuilder().getBars(), statisticsDetailData2.getStatisticsInfo()));
                    this.d.getStatisticsLiveData().postValue(statisticsDetailData2.getStatisticsInfo());
                } else {
                    HeartRateBigDataUseCase heartRateBigDataUseCaseB3 = this.d.b();
                    String str3 = this.e;
                    this.a = 2;
                    obj = heartRateBigDataUseCaseB3.getMonth(str3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    resource = (Resource) obj;
                    HeartRateStatistics heartRateStatistics3 = (HeartRateStatistics) ResourceKt.getOrNull(resource);
                    HMLog.info(this.d.tag, new HeartRateDetailViewModel.b(heartRateStatistics3));
                    this.d.getRawData().postValue(heartRateStatistics3);
                    StatisticsDetailData statisticsDetailData3 = DataUtils.INSTANCE.getStatisticsDetailData(new Date(this.f), this.c, heartRateStatistics3);
                    this.d.getChartBuilderLiveData().postValue(statisticsDetailData3.getChartBuilder());
                    this.d.getBarPeriodInfoLiveData().postValue(this.d.a(statisticsDetailData3.getChartBuilder().getBars(), statisticsDetailData3.getStatisticsInfo()));
                    this.d.getStatisticsLiveData().postValue(statisticsDetailData3.getStatisticsInfo());
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            resource = (Resource) obj;
            HeartRateStatistics heartRateStatistics4 = (HeartRateStatistics) ResourceKt.getOrNull(resource);
            HMLog.info(this.d.tag, new HeartRateDetailViewModel.b(heartRateStatistics4));
            this.d.getRawData().postValue(heartRateStatistics4);
            StatisticsDetailData statisticsDetailData4 = DataUtils.INSTANCE.getStatisticsDetailData(new Date(this.f), this.c, heartRateStatistics4);
            this.d.getChartBuilderLiveData().postValue(statisticsDetailData4.getChartBuilder());
            this.d.getBarPeriodInfoLiveData().postValue(this.d.a(statisticsDetailData4.getChartBuilder().getBars(), statisticsDetailData4.getStatisticsInfo()));
            this.d.getStatisticsLiveData().postValue(statisticsDetailData4.getStatisticsInfo());
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            resource = (Resource) obj;
            HeartRateStatistics heartRateStatistics5 = (HeartRateStatistics) ResourceKt.getOrNull(resource);
            HMLog.info(this.d.tag, new HeartRateDetailViewModel.b(heartRateStatistics5));
            this.d.getRawData().postValue(heartRateStatistics5);
            StatisticsDetailData statisticsDetailData5 = DataUtils.INSTANCE.getStatisticsDetailData(new Date(this.f), this.c, heartRateStatistics5);
            this.d.getChartBuilderLiveData().postValue(statisticsDetailData5.getChartBuilder());
            this.d.getBarPeriodInfoLiveData().postValue(this.d.a(statisticsDetailData5.getChartBuilder().getBars(), statisticsDetailData5.getStatisticsInfo()));
            this.d.getStatisticsLiveData().postValue(statisticsDetailData5.getStatisticsInfo());
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            resource = (Resource) obj;
            HeartRateStatistics heartRateStatistics6 = (HeartRateStatistics) ResourceKt.getOrNull(resource);
            HMLog.info(this.d.tag, new HeartRateDetailViewModel.b(heartRateStatistics6));
            this.d.getRawData().postValue(heartRateStatistics6);
            StatisticsDetailData statisticsDetailData6 = DataUtils.INSTANCE.getStatisticsDetailData(new Date(this.f), this.c, heartRateStatistics6);
            this.d.getChartBuilderLiveData().postValue(statisticsDetailData6.getChartBuilder());
            this.d.getBarPeriodInfoLiveData().postValue(this.d.a(statisticsDetailData6.getChartBuilder().getBars(), statisticsDetailData6.getStatisticsInfo()));
            this.d.getStatisticsLiveData().postValue(statisticsDetailData6.getStatisticsInfo());
        }
        return Unit.INSTANCE;
    }
}
