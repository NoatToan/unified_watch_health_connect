package com.xiaomi.fitness.aggregation.health.updater;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataTypeKt;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.repo.RepositoryManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongProgression;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011J(\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0002J(\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001b0\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/updater/CommonSummaryUpdater;", "", "<init>", "()V", "TAG", "", "DAY_ONE", "", "rainbowUpdater", "Lcom/xiaomi/fitness/aggregation/health/updater/RainbowUpdaterProcessor;", "rainbowKey", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "doUpdate", "", "dataType", "timeList", "", "getReportList", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "startTime", "endTime", "updateDailyReport", "getGoalType", "", "type", "filterDate", "Lkotlin/Pair;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonSummaryUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonSummaryUpdater.kt\ncom/xiaomi/fitness/aggregation/health/updater/CommonSummaryUpdater\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n37#2:115\n36#2,3:116\n1863#3,2:119\n1053#3:121\n*S KotlinDebug\n*F\n+ 1 CommonSummaryUpdater.kt\ncom/xiaomi/fitness/aggregation/health/updater/CommonSummaryUpdater\n*L\n75#1:115\n75#1:116,3\n102#1:119,2\n110#1:121\n*E\n"})
public final class CommonSummaryUpdater {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CommonSummaryUpdater instance = new CommonSummaryUpdater();

    @NotNull
    private final String TAG = "Summary_Updater";
    private final long DAY_ONE = TimeUnit.DAYS.toSeconds(1);

    @NotNull
    private final RainbowUpdaterProcessor rainbowUpdater = new RainbowUpdaterProcessor();

    @NotNull
    private final Set<HomeDataType> rainbowKey = SetsKt__SetsKt.setOf((Object[]) new HomeDataType[]{HomeDataType.STEP, HomeDataType.CALORIE, HomeDataType.VALID_STAND, HomeDataType.MH_STRENGTH});

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/updater/CommonSummaryUpdater$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/aggregation/health/updater/CommonSummaryUpdater;", "getInstance", "()Lcom/xiaomi/fitness/aggregation/health/updater/CommonSummaryUpdater;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CommonSummaryUpdater getInstance() {
            return CommonSummaryUpdater.instance;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CommonSummaryUpdater() {
    }

    private final List<Pair<Long, Long>> filterDate(List<Long> timeList) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = timeList.iterator();
        while (it.hasNext()) {
            long jChangeZeroOfTheDay = FitnessDateUtils.changeZeroOfTheDay(((Number) it.next()).longValue(), 0);
            Pair pair = new Pair(Long.valueOf(jChangeZeroOfTheDay), Long.valueOf(this.DAY_ONE + jChangeZeroOfTheDay));
            if (!arrayList.contains(pair)) {
                arrayList.add(pair);
            }
        }
        CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.aggregation.health.updater.CommonSummaryUpdater$filterDate$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues((Long) ((Pair) t).getFirst(), (Long) ((Pair) t2).getFirst());
            }
        });
        return arrayList;
    }

    private final int getGoalType(HomeDataType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 0 : 4;
        }
        return 3;
    }

    private final List<DailyBasicReport> getReportList(HomeDataType dataType, long startTime, long endTime) {
        return RepositoryManager.INSTANCE.getInstance().getRepositoryByType(dataType).getReportListForSummary(null, "days", FitnessDateUtils.changeZeroOfTheDay(startTime, 0), FitnessDateUtils.changeZeroOfTheDay(endTime + this.DAY_ONE, 0));
    }

    private final void updateDailyReport(HomeDataType dataType, long startTime, long endTime) {
        List<DailyBasicReport> reportList = getReportList(dataType, startTime, endTime);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DailyBasicReport dailyBasicReport : reportList) {
            linkedHashMap.put(Long.valueOf(dailyBasicReport.getTime()), dailyBasicReport);
        }
        ArrayList arrayList = new ArrayList();
        LongProgression longProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(startTime, endTime), this.DAY_ONE);
        long first = longProgressionStep.getFirst();
        long last = longProgressionStep.getLast();
        long step = longProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (linkedHashMap.get(Long.valueOf(first)) == null || HomeDataTypeKt.needCareSid(dataType)) {
                    arrayList.add(Long.valueOf(first));
                }
                if (arrayList.size() > 300 || first == last) {
                    break;
                } else {
                    first += step;
                }
            }
        }
        FitnessDailyReportDaoProxy fitnessDailyReportDaoProxy = FitnessDailyReportDaoProxy.INSTANCE;
        fitnessDailyReportDaoProxy.delete(dataType, arrayList);
        Intrinsics.checkNotNull(reportList, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport>");
        DailyBasicReport[] dailyBasicReportArr = (DailyBasicReport[]) reportList.toArray(new DailyBasicReport[0]);
        fitnessDailyReportDaoProxy.insert(dataType, (DailyBasicReport[]) Arrays.copyOf(dailyBasicReportArr, dailyBasicReportArr.length));
        if (this.rainbowKey.contains(dataType)) {
            this.rainbowUpdater.startUpdateRainbow(startTime, endTime, getGoalType(dataType), reportList);
        }
    }

    public final void doUpdate(@NotNull HomeDataType dataType, @NotNull List<Long> timeList) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(timeList, "timeList");
        FitnessLogUtils.i(this.TAG, ">>>>> do update " + dataType + ", timeList size = " + timeList.size());
        for (Pair<Long, Long> pair : filterDate(timeList)) {
            updateDailyReport(dataType, pair.component1().longValue(), pair.component2().longValue());
        }
        FitnessLogUtils.i(this.TAG, "<<<<<<<<< do update finished: " + dataType);
    }
}
