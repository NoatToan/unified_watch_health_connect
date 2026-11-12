package com.huami.bodymeasurements.temperature.viewmodel.detail;

import com.huami.bodymeasurements.common.utils.TimeUtils;
import com.huami.bodymeasurements.temperature.model.converter.TemperatureDataHelper;
import com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase;
import com.huami.bodymeasurements.temperature.view.vo.StatisticsTempDetailData;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/bodymeasurements/temperature/viewmodel/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.bodymeasurements.temperature.viewmodel.detail.TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1", f = "TempStatisticsDetailViewModel.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
public final class TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ TempStatisticsDetailViewModel e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1(Continuation continuation, long j, String str, TempStatisticsDetailViewModel tempStatisticsDetailViewModel, String str2) {
        super(2, continuation);
        this.c = j;
        this.d = str;
        this.e = tempStatisticsDetailViewModel;
        this.f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1 tempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1 = new TempStatisticsDetailViewModel$loadData$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e, this.f);
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
            Pair<Long, Long> timeRangeByDateMode = TimeUtils.INSTANCE.getTimeRangeByDateMode(this.c, this.d);
            long jLongValue = timeRangeByDateMode.component1().longValue();
            long jLongValue2 = timeRangeByDateMode.component2().longValue();
            GetLocalTempListBetweenTimeUseCase getLocalTempListBetweenTimeUseCase = this.e.useCase;
            String str = this.f;
            this.a = 1;
            obj = getLocalTempListBetweenTimeUseCase.execute(jLongValue, jLongValue2, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        StatisticsTempDetailData statisticsTempDetailData = TemperatureDataHelper.INSTANCE.getStatisticsTempDetailData(this.d, new Date(this.c), (List) obj);
        this.e._statisticsInfoLiveData.postValue(statisticsTempDetailData.getStatisticsInfo());
        this.e._latestValueLiveData.postValue(CollectionsKt.lastOrNull((List) statisticsTempDetailData.getChartBuilder().getPoints()));
        this.e._chartBuilderLiveData.postValue(statisticsTempDetailData.getChartBuilder());
        return Unit.INSTANCE;
    }
}
