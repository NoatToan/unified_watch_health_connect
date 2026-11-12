package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import androidx.lifecycle.LiveData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.distribute.SleepDistributeConfig;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepProjectReport;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalInsightReport;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003J\b\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&JB\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015H¦@¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH¦@¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0006H&J \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H&J'\u0010!\u001a\u0019\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\"¢\u0006\u0002\b#\u0012\u0004\u0012\u00020$0\r0\u00142\u0006\u0010%\u001a\u00020\u0015H&J\n\u0010&\u001a\u0004\u0018\u00010'H&J \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020)0\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H&J\u001c\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u000eH¦@¢\u0006\u0002\u0010\u001bJ\u001e\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020)H¦@¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\bH&J\u001c\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\"H&J*\u00104\u001a\u0004\u0018\u0001052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\"H¦@¢\u0006\u0002\u00106J\u001e\u00107\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\"2\u0006\u00108\u001a\u000202H¦@¢\u0006\u0002\u00109J\u001c\u0010:\u001a\u00020\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u0002020\u000eH¦@¢\u0006\u0002\u0010\u001bJ>\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0012J$\u0010<\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0002\u0010=J$\u0010>\u001a\b\u0012\u0004\u0012\u0002020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0002\u0010=J\u0010\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u0014H&J\u0010\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0014H&J\u0018\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00142\u0006\u00103\u001a\u00020\nH&¨\u0006B"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IPagingSourceRepository;", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "dumpSleepRecord", "", "hasSleepSegmentExits", "", "startTime", "", "endTime", "getSleepByMonthGroup", "", "", "limit", "", "reverse", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestSleepAnimal", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "getLatestSleepAnimalSync", "triggerComputeSleepAnimal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSleepAnimal", "animalList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullSleepAnimalAsync", "getSleepAnimalAllRecordPagingSource", "Landroidx/paging/PagingSource;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getSleepAnimalInsightReport", "", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalIndicator;", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalInsightReport;", "animalReport", "getSleepDistributeConfig", "Lcom/xiaomi/fit/fitness/export/data/distribute/SleepDistributeConfig;", "getSleepRhyThmAllRecordPagingSource", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "deleteSleepRhyThmReport", "sleepRhythmReport", "addSleepRhyThmReport", "sid", "dataInfo", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRhyThmDataValidByAllData", "getSleepDiaryReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "time", "getSleepProjectReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSleepDiaryReport", "sleepDiaryInfo", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSleepDiaryReport", "getSleepRhythmAndDiaryRecordStatus", "getSleepRhythmRecords", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSleepDiaryRecords", "getLastSleepDiaryReport", "getLastSleepRhythmReport", "getLastSleepRhythmReportBefore", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISleepRepository extends IRepository<AllDaySleepReport>, IPagingSourceRepository<SleepSegmentReport> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull ISleepRepository iSleepRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iSleepRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        @NotNull
        public static List<AllDaySleepReport> getDailyReportListSync(@NotNull ISleepRepository iSleepRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iSleepRepository, str, j, i, i2);
        }

        @Nullable
        public static AllDaySleepReport getReport(@NotNull ISleepRepository iSleepRepository, @Nullable String str, long j) {
            return (AllDaySleepReport) IRepository.DefaultImpls.getReport(iSleepRepository, str, j);
        }

        public static /* synthetic */ PagingSource getSleepAnimalAllRecordPagingSource$default(ISleepRepository iSleepRepository, PagingSourceParams pagingSourceParams, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSleepAnimalAllRecordPagingSource");
            }
            if ((i & 1) != 0) {
                pagingSourceParams = null;
            }
            return iSleepRepository.getSleepAnimalAllRecordPagingSource(pagingSourceParams);
        }

        public static /* synthetic */ Object getSleepByMonthGroup$default(ISleepRepository iSleepRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iSleepRepository.getSleepByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSleepByMonthGroup");
        }

        public static /* synthetic */ PagingSource getSleepRhyThmAllRecordPagingSource$default(ISleepRepository iSleepRepository, PagingSourceParams pagingSourceParams, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSleepRhyThmAllRecordPagingSource");
            }
            if ((i & 1) != 0) {
                pagingSourceParams = null;
            }
            return iSleepRepository.getSleepRhyThmAllRecordPagingSource(pagingSourceParams);
        }

        public static /* synthetic */ Object getSleepRhythmAndDiaryRecordStatus$default(ISleepRepository iSleepRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iSleepRepository.getSleepRhythmAndDiaryRecordStatus(j, j2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSleepRhythmAndDiaryRecordStatus");
        }
    }

    @Nullable
    Object addSleepDiaryReport(@NotNull String str, @NotNull SleepDiaryReport sleepDiaryReport, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object addSleepRhyThmReport(@NotNull String str, @NotNull SleepRhythmReport sleepRhythmReport, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deleteSleepAnimal(@NotNull List<SleepAnimalReport> list, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deleteSleepDiaryReport(@NotNull List<SleepDiaryReport> list, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deleteSleepRhyThmReport(@NotNull List<SleepRhythmReport> list, @NotNull Continuation<? super Boolean> continuation);

    void dumpSleepRecord();

    @NotNull
    LiveData<SleepDiaryReport> getLastSleepDiaryReport();

    @NotNull
    LiveData<SleepRhythmReport> getLastSleepRhythmReport();

    @NotNull
    LiveData<SleepRhythmReport> getLastSleepRhythmReportBefore(long time);

    @NotNull
    LiveData<SleepAnimalReport> getLatestSleepAnimal();

    @Nullable
    SleepAnimalReport getLatestSleepAnimalSync();

    boolean getRhyThmDataValidByAllData();

    @NotNull
    PagingSource<Long, SleepAnimalReport> getSleepAnimalAllRecordPagingSource(@Nullable PagingSourceParams params);

    @NotNull
    LiveData<Map<String, SleepAnimalInsightReport>> getSleepAnimalInsightReport(@NotNull SleepAnimalReport animalReport);

    @Nullable
    Object getSleepByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<SleepSegmentReport>>> continuation);

    @Nullable
    Object getSleepDiaryRecords(long j, long j2, @NotNull Continuation<? super List<SleepDiaryReport>> continuation);

    @Nullable
    SleepDiaryReport getSleepDiaryReport(long time, @Nullable String sid);

    @Nullable
    SleepDistributeConfig getSleepDistributeConfig();

    @Nullable
    Object getSleepProjectReport(long j, long j2, @Nullable String str, @NotNull Continuation<? super SleepProjectReport> continuation);

    @NotNull
    PagingSource<Long, SleepRhythmReport> getSleepRhyThmAllRecordPagingSource(@Nullable PagingSourceParams params);

    @Nullable
    Object getSleepRhythmAndDiaryRecordStatus(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, Integer>> continuation);

    @Nullable
    Object getSleepRhythmRecords(long j, long j2, @NotNull Continuation<? super List<SleepRhythmReport>> continuation);

    boolean hasSleepSegmentExits(long startTime, long endTime);

    void pullSleepAnimalAsync();

    @Nullable
    Object triggerComputeSleepAnimal(@NotNull Continuation<? super SleepAnimalReport> continuation);
}
