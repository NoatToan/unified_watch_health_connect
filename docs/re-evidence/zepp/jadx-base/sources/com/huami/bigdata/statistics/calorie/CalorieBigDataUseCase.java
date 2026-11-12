package com.huami.bigdata.statistics.calorie;

import com.huami.bigdata.statistics.common.CommonSingleData;
import com.huami.bigdata.statistics.core.api.BigDataType;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase;
import com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase;
import com.huami.bigdata.statistics.core.utils.TimeUtils;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import java.util.List;
import java.util.ListIterator;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0014J&\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0014J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0004H\u0014J-\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/bigdata/statistics/calorie/CalorieBigDataUseCase;", "Lcom/huami/bigdata/statistics/core/usecase/DefaultMapSingleDataUseCase;", "Lcom/huami/bigdata/statistics/calorie/CalorieDateData;", "Lcom/huami/bigdata/statistics/calorie/CalorieStatistics;", "Lcom/huami/bigdata/statistics/common/CommonSingleData;", "Lcom/huami/bigdata/statistics/core/api/BigDataType;", "getType", "Ljava/lang/Class;", "getClassT", "remote", "local", "Lcom/huami/bigdata/statistics/core/usecase/AbstractBigDataUseCase$TimeMode;", SleepAnalysisFragment.TIME_MODE, "merge", "singleData", "mapSingleDataToDateData", "mapSingleDataToStatisticsData", "", "from", "to", "", "dateFormat", "getLocal", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class CalorieBigDataUseCase extends DefaultMapSingleDataUseCase<CalorieDateData, CalorieStatistics, CommonSingleData> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bigdata.statistics.calorie.CalorieBigDataUseCase", f = "CalorieBigDataUseCase.kt", i = {}, l = {61}, m = "getLocal$suspendImpl", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return CalorieBigDataUseCase.e(CalorieBigDataUseCase.this, 0L, 0L, null, this);
        }
    }

    public CalorieBigDataUseCase(@NotNull IBigDataExportedApi iBigDataExportedApi) {
        super(iBigDataExportedApi);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object e(CalorieBigDataUseCase calorieBigDataUseCase, long j, long j2, String str, Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = calorieBigDataUseCase.new a(continuation);
            }
        } else {
            aVar = calorieBigDataUseCase.new a(continuation);
        }
        a aVar2 = aVar;
        Object local = aVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(local);
            aVar2.c = 1;
            local = super.getLocal(j, j2, str, aVar2);
            if (local == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(local);
        }
        CalorieStatistics calorieStatistics = (CalorieStatistics) local;
        if (calorieStatistics == null) {
            return null;
        }
        calorieStatistics.setTotalSize(calorieStatistics.getDataArray().size());
        return calorieStatistics;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @NotNull
    public Class<CalorieStatistics> getClassT() {
        return CalorieStatistics.class;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase, com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @Nullable
    public Object getLocal(long j, long j2, @NotNull String str, @NotNull Continuation<? super CalorieStatistics> continuation) {
        return e(this, j, j2, str, continuation);
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @NotNull
    public BigDataType getType() {
        return BigDataType.CAL;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @NotNull
    public CalorieDateData mapSingleDataToDateData(@NotNull CommonSingleData singleData) {
        return new CalorieDateData(singleData.getValue());
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @NotNull
    public CalorieStatistics mapSingleDataToStatisticsData(@NotNull CommonSingleData singleData) {
        return new CalorieStatistics(singleData.getValue(), singleData.getValue(), 1);
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMergeBigDataUseCase, com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @Nullable
    public CalorieStatistics merge(@Nullable CalorieStatistics remote, @Nullable CalorieStatistics local, @NotNull AbstractBigDataUseCase.TimeMode timeMode) {
        List listEmptyList;
        if (timeMode == AbstractBigDataUseCase.TimeMode.YEAR && remote != null) {
            String strTimestampToYM = TimeUtils.INSTANCE.timestampToYM(remote.getMaxTime(), TimeZone.getTimeZone(remote.getTimezoneId()));
            List<CalorieDateData> dataArray = remote.getDataArray();
            if (!dataArray.isEmpty()) {
                ListIterator<CalorieDateData> listIterator = dataArray.listIterator(dataArray.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        break;
                    }
                    if (!Intrinsics.areEqual(listIterator.previous().getDate(), strTimestampToYM)) {
                        listEmptyList = CollectionsKt___CollectionsKt.take(dataArray, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                break;
            }
            remote.setDataArray(listEmptyList);
        }
        return (CalorieStatistics) super.merge(remote, local, timeMode);
    }
}
