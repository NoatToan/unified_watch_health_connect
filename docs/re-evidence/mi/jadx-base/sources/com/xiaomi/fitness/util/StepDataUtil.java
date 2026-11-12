package com.xiaomi.fitness.util;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.model.DataActiveModel;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.a52;
import defpackage.c0j;
import defpackage.pz6;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b<\u0010=J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J+\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)JE\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010*2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b/\u00100J;\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014¢\u0006\u0004\b1\u00102JE\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b5\u00106J%\u00107\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b7\u00108J%\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020*2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/util/StepDataUtil;", "", "Landroid/content/Context;", "context", "", "distance", "txtResource", "Lqpo;", "createDistanceSummaryModel", "(Landroid/content/Context;II)Lqpo;", "steps", "createStepSummaryModel", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "record", "displayNumber", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createDayEntriesHome", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;I)Ljava/util/List;", "report", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/StepRecord;", "createStepItemMap", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;)Ljava/util/Map;", "Lorg/joda/time/LocalDate;", "endLocalDate", "startLocalDate", "recordMap", "Lr02;", "attrs", "createEntriesFromRecordMap", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;Lr02;)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "stageList", "position", "Lcom/xiaomi/fitness/data/model/DataActiveModel;", "createDataActiveModelList", "(Ljava/util/List;I)Ljava/util/List;", "stepReport", "createSummaryModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;I)Ljava/util/List;", "La52;", "chartAttrs", "reportMap", "createEntryList", "(La52;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "createDayEntries", "(La52;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;)Ljava/util/List;", "createWeekEntries", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "createMonthEntries", "(Lr02;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "createWeekEntries2", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;)Ljava/util/List;", "createMonthEntries2", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;Lr02;)Ljava/util/List;", "zeroTime", "createDefaultDayEntries", "(La52;J)Ljava/util/List;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StepDataUtil {

    @NotNull
    public static final StepDataUtil INSTANCE = new StepDataUtil();

    private StepDataUtil() {
    }

    @JvmStatic
    @NotNull
    public static final List<RecyclerBarEntry> createDayEntriesHome(@NotNull DailyStepReport record, int displayNumber) {
        Intrinsics.checkNotNullParameter(record, "record");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(record.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        Map<Long, StepRecord> mapCreateStepItemMap = INSTANCE.createStepItemMap(record);
        for (int i = 0; i < displayNumber; i++) {
            StepRecord stepRecord = mapCreateStepItemMap.get(Long.valueOf(jChangZeroOfTheDay));
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, (stepRecord == null || TimeDateUtil.isFuture(jChangZeroOfTheDay)) ? 0 : stepRecord.getSteps(), jChangZeroOfTheDay, 3);
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(recyclerBarEntry);
            jChangZeroOfTheDay += TimeDateUtil.TIME_HOUR;
        }
        return arrayList;
    }

    private final qpo createDistanceSummaryModel(Context context, int distance, int txtResource) {
        String strI = pz6.i(distance);
        return new qpo(context.getString(txtResource), pz6.e(distance), strI);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    private final List<RecyclerBarEntry> createEntriesFromRecordMap(LocalDate endLocalDate, LocalDate startLocalDate, Map<Long, StepRecord> recordMap, r02 attrs) {
        int steps;
        int monthBarEntryType2;
        LocalDate localDateMinusDays = endLocalDate.minusDays(1);
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (!localDateMinusDays.isBefore(startLocalDate)) {
            Intrinsics.checkNotNull(localDateMinusDays);
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            StepRecord stepRecord = recordMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (stepRecord != null) {
                Intrinsics.checkNotNull(localDateMinusDays);
                if (TimeDateUtil.isFuture(localDateMinusDays)) {
                    steps = 0;
                } else {
                    steps = stepRecord.getSteps();
                }
            } else {
                steps = 0;
            }
            RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
            if (attrs == null) {
                monthBarEntryType2 = companion.getWeekBarEntryType(localDateMinusDays);
            } else {
                Intrinsics.checkNotNull(localDateMinusDays);
                monthBarEntryType2 = companion.getMonthBarEntryType2(attrs, localDateMinusDays);
            }
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, steps, jChangZeroOfTheDay, monthBarEntryType2);
            recyclerBarEntry.localDate = localDateMinusDays;
            linkedList.add(recyclerBarEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
            i++;
        }
        return linkedList;
    }

    private final Map<Long, StepRecord> createStepItemMap(DailyStepReport report) {
        List<StepRecord> stepRecords = report.getStepRecords();
        HashMap map = new HashMap();
        if (stepRecords != null && (!stepRecords.isEmpty())) {
            for (StepRecord stepRecord : stepRecords) {
                map.put(Long.valueOf(stepRecord.getTime()), stepRecord);
            }
        }
        return map;
    }

    private final qpo createStepSummaryModel(Context context, int steps, int txtResource) {
        String quantityString = context.getResources().getQuantityString(qxi.u, steps);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return new qpo(context.getString(txtResource), Integer.toString(steps), quantityString);
    }

    @NotNull
    public final List<DataActiveModel> createDataActiveModelList(@Nullable List<ActiveStageItem> stageList, int position) {
        LinkedList linkedList = new LinkedList();
        if (stageList != null && !stageList.isEmpty() && position == 0) {
            int size = stageList.size();
            for (int i = 0; i < size; i++) {
                ActiveStageItem activeStageItem = stageList.get(i);
                if (ActiveStageItemExKt.isCreateStepMode(activeStageItem)) {
                    linkedList.add(new DataActiveModel(activeStageItem, 3));
                }
            }
            CollectionsKt__MutableCollectionsJVMKt.sort(linkedList);
        }
        return linkedList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createDayEntries(@Nullable a52 attrs, @NotNull DailyStepReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNull(attrs);
        int i = attrs.c;
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Map<Long, StepRecord> mapCreateStepItemMap = createStepItemMap(report);
        long j = jChangZeroOfTheDay;
        int i2 = 0;
        while (i2 < i) {
            long j2 = j - RepositoryManager.GAP_X_MINUTE;
            StepRecord stepRecord = mapCreateStepItemMap.get(Long.valueOf(j2));
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i2, (stepRecord == null || TimeDateUtil.isFuture(j2)) ? 0 : stepRecord.getSteps(), j2, RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j2, j));
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(recyclerBarEntry);
            i2++;
            j = j2;
        }
        return arrayList;
    }

    @Nullable
    public final List<RecyclerBarEntry> createDefaultDayEntries(@NotNull a52 attrs, long zeroTime) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        int i = attrs.c;
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(zeroTime);
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        ArrayList arrayList = new ArrayList();
        long j = jChangZeroOfTheDay;
        int i2 = 0;
        while (i2 < i) {
            long j2 = j - RepositoryManager.GAP_X_MINUTE;
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i2, 0.0f, j2, RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j2, j));
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(recyclerBarEntry);
            i2++;
            j = j2;
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createEntryList(@Nullable a52 chartAttrs, @NotNull LocalDate endLocalDate, @Nullable LocalDate startLocalDate, @Nullable Map<Long, DailyStepReport> reportMap) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        ArrayList arrayList = new ArrayList();
        while (!endLocalDate.isBefore(startLocalDate)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(endLocalDate);
            DailyStepReport dailyStepReport = reportMap != null ? reportMap.get(Long.valueOf(jChangZeroOfTheDay)) : null;
            if (dailyStepReport == null) {
                dailyStepReport = new DailyStepReport(jChangZeroOfTheDay, "days");
            }
            arrayList.addAll(createDayEntries(chartAttrs, dailyStepReport));
            endLocalDate = endLocalDate.minusDays(1);
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createMonthEntries(@Nullable r02 attrs, @Nullable LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyStepReport> reportMap) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (LocalDate localDateMinusMonths = endLocalDate; !localDateMinusMonths.isBefore(startLocalDate); localDateMinusMonths = localDateMinusMonths.minusMonths(1)) {
            DailyStepReport dailyStepReport = (reportMap == null || !(reportMap.isEmpty() ^ true)) ? null : reportMap.get(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusMonths)));
            if (dailyStepReport != null && (!dailyStepReport.getStepRecords().isEmpty())) {
                int size = dailyStepReport.getStepRecords().size();
                for (int i = 0; i < size; i++) {
                    StepRecord stepRecord = dailyStepReport.getStepRecords().get(i);
                    linkedHashMap.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(stepRecord.getTime())), stepRecord);
                }
            }
        }
        return createEntriesFromRecordMap(endLocalDate, startLocalDate, linkedHashMap, attrs);
    }

    @NotNull
    public final List<RecyclerBarEntry> createMonthEntries2(@NotNull DailyStepReport report, @Nullable r02 attrs) {
        Intrinsics.checkNotNullParameter(report, "report");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
        LocalDate localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        if (true ^ report.getStepRecords().isEmpty()) {
            int size = report.getStepRecords().size();
            for (int i = 0; i < size; i++) {
                StepRecord stepRecord = report.getStepRecords().get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(stepRecord.getTime())), stepRecord);
            }
        }
        return createEntriesFromRecordMap(localDatePlusMonths, firstDayOfMonth, map, attrs);
    }

    @NotNull
    public final List<qpo> createSummaryModelList(@NotNull Context context, @NotNull DailyStepReport stepReport, int position) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stepReport, "stepReport");
        LinkedList linkedList = new LinkedList();
        if (position == 0) {
            linkedList.add(createStepSummaryModel(context, stepReport.getSteps(), c0j.vl));
            linkedList.add(createDistanceSummaryModel(context, stepReport.getDistance(), c0j.tl));
        } else {
            stepReport.getSteps();
            linkedList.add(createStepSummaryModel(context, stepReport.getSteps(), c0j.wl));
            stepReport.getDistance();
            linkedList.add(createDistanceSummaryModel(context, stepReport.getDistance(), c0j.ul));
            stepReport.getAvgStepsPerDay();
            linkedList.add(createStepSummaryModel(context, stepReport.getAvgStepsPerDay(), c0j.rl));
            stepReport.getAvgDistancePerDay();
            linkedList.add(createDistanceSummaryModel(context, stepReport.getAvgDistancePerDay(), c0j.sl));
        }
        return linkedList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createWeekEntries(@Nullable LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyStepReport> reportMap) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LocalDate localDateMinusWeeks = endLocalDate;
        while (true) {
            if (localDateMinusWeeks.isBefore(startLocalDate)) {
                return createEntriesFromRecordMap(endLocalDate, startLocalDate, linkedHashMap, null);
            }
            DailyStepReport dailyStepReport = reportMap != null ? reportMap.get(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusWeeks))) : null;
            if (dailyStepReport != null && (!dailyStepReport.getStepRecords().isEmpty())) {
                int size = dailyStepReport.getStepRecords().size();
                for (int i = 0; i < size; i++) {
                    StepRecord stepRecord = dailyStepReport.getStepRecords().get(i);
                    linkedHashMap.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(stepRecord.getTime())), stepRecord);
                }
            }
            localDateMinusWeeks = localDateMinusWeeks.minusWeeks(1);
        }
    }

    @NotNull
    public final List<RecyclerBarEntry> createWeekEntries2(@NotNull DailyStepReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
        LocalDate localDatePlusWeeks = weekMonday.plusWeeks(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusWeeks, "plusWeeks(...)");
        if (true ^ report.getStepRecords().isEmpty()) {
            int size = report.getStepRecords().size();
            for (int i = 0; i < size; i++) {
                StepRecord stepRecord = report.getStepRecords().get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(stepRecord.getTime())), stepRecord);
            }
        }
        return createEntriesFromRecordMap(localDatePlusWeeks, weekMonday, map, null);
    }
}
