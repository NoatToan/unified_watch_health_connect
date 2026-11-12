package com.xiaomi.fitness.util;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.CalorieRecord;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.a52;
import defpackage.c0j;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J;\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$JE\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b)\u0010*J+\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b0\u00101J%\u00103\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0005¢\u0006\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/util/CalorieDataUtil;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "record", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/CalorieRecord;", "createCaloriesItemMap", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;)Ljava/util/Map;", "Lorg/joda/time/LocalDate;", "endLocalDate", "startLocalDate", "recordMap", "Lr02;", "attrs", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createEntriesFromRecordMap", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;Lr02;)Ljava/util/List;", "", "value", "sumValue", "percentage", "(II)I", "La52;", "mBarChartAttrs", "reportMap", "createEntryList", "(La52;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "createDayEntries", "(La52;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;)Ljava/util/List;", "report", "displayNumber", "createDayEntriesHome", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;I)Ljava/util/List;", "createWeekEntries", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "getMonthEntries", "(Lr02;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "createWeekEntries2", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;)Ljava/util/List;", "createMonthEntries2", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;Lr02;)Ljava/util/List;", "Landroid/content/Context;", "context", "calorieReport", "position", "Lqpo;", "createSummaryModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;I)Ljava/util/List;", "zeroTime", "createDefaultDayEntries", "(La52;J)Ljava/util/List;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CalorieDataUtil {

    @NotNull
    public static final CalorieDataUtil INSTANCE = new CalorieDataUtil();

    private CalorieDataUtil() {
    }

    private final Map<Long, CalorieRecord> createCaloriesItemMap(DailyCalorieReport record) {
        List<CalorieRecord> calRecords = record.getCalRecords();
        HashMap map = new HashMap();
        if (calRecords != null && (!calRecords.isEmpty())) {
            for (CalorieRecord calorieRecord : calRecords) {
                map.put(Long.valueOf(calorieRecord.getTime()), calorieRecord);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    private final List<RecyclerBarEntry> createEntriesFromRecordMap(LocalDate endLocalDate, LocalDate startLocalDate, Map<Long, CalorieRecord> recordMap, r02 attrs) {
        int calories;
        int monthBarEntryType2;
        LocalDate localDateMinusDays = endLocalDate.minusDays(1);
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (!localDateMinusDays.isBefore(startLocalDate)) {
            Intrinsics.checkNotNull(localDateMinusDays);
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            CalorieRecord calorieRecord = recordMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (calorieRecord != null) {
                Intrinsics.checkNotNull(localDateMinusDays);
                if (TimeDateUtil.isFuture(localDateMinusDays)) {
                    calories = 0;
                } else {
                    calories = calorieRecord.getCalories();
                }
            } else {
                calories = 0;
            }
            RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
            if (attrs == null) {
                monthBarEntryType2 = companion.getWeekBarEntryType(localDateMinusDays);
            } else {
                Intrinsics.checkNotNull(localDateMinusDays);
                monthBarEntryType2 = companion.getMonthBarEntryType2(attrs, localDateMinusDays);
            }
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, calories, jChangZeroOfTheDay, monthBarEntryType2);
            recyclerBarEntry.localDate = localDateMinusDays;
            linkedList.add(recyclerBarEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
            i++;
        }
        return linkedList;
    }

    private final int percentage(int value, int sumValue) {
        return HealthUtil.computePercentage(value, sumValue);
    }

    @NotNull
    public final List<RecyclerBarEntry> createDayEntries(@Nullable a52 attrs, @NotNull DailyCalorieReport record) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNull(attrs);
        int i = attrs.c;
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(record.getTime());
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Map<Long, CalorieRecord> mapCreateCaloriesItemMap = createCaloriesItemMap(record);
        ArrayList arrayList = new ArrayList();
        long j = jChangZeroOfTheDay;
        int i2 = 0;
        while (i2 < i) {
            long j2 = j - RepositoryManager.GAP_X_MINUTE;
            CalorieRecord calorieRecord = mapCreateCaloriesItemMap.get(Long.valueOf(j2));
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i2, (calorieRecord == null || TimeDateUtil.isFuture(j2)) ? 0 : calorieRecord.getCalories(), j2, RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j2, j));
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(recyclerBarEntry);
            i2++;
            j = j2;
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createDayEntriesHome(@NotNull DailyCalorieReport report, int displayNumber) {
        Intrinsics.checkNotNullParameter(report, "report");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        Map<Long, CalorieRecord> mapCreateCaloriesItemMap = createCaloriesItemMap(report);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < displayNumber; i++) {
            CalorieRecord calorieRecord = mapCreateCaloriesItemMap.get(Long.valueOf(jChangZeroOfTheDay));
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, (calorieRecord == null || TimeDateUtil.isFuture(jChangZeroOfTheDay)) ? 0 : calorieRecord.getCalories(), jChangZeroOfTheDay, 3);
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(recyclerBarEntry);
            jChangZeroOfTheDay += TimeDateUtil.TIME_HOUR;
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
    public final List<RecyclerBarEntry> createEntryList(@Nullable a52 mBarChartAttrs, @NotNull LocalDate endLocalDate, @Nullable LocalDate startLocalDate, @Nullable Map<Long, DailyCalorieReport> reportMap) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        ArrayList arrayList = new ArrayList();
        while (!endLocalDate.isBefore(startLocalDate)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(endLocalDate);
            DailyCalorieReport dailyCalorieReport = reportMap != null ? reportMap.get(Long.valueOf(jChangZeroOfTheDay)) : null;
            if (dailyCalorieReport == null) {
                dailyCalorieReport = new DailyCalorieReport("days", jChangZeroOfTheDay);
            }
            arrayList.addAll(createDayEntries(mBarChartAttrs, dailyCalorieReport));
            endLocalDate = endLocalDate.minusDays(1);
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createMonthEntries2(@NotNull DailyCalorieReport report, @Nullable r02 attrs) {
        Intrinsics.checkNotNullParameter(report, "report");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
        LocalDate localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        if (true ^ report.getCalRecords().isEmpty()) {
            int size = report.getCalRecords().size();
            for (int i = 0; i < size; i++) {
                CalorieRecord calorieRecord = report.getCalRecords().get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(calorieRecord.getTime())), calorieRecord);
            }
        }
        return createEntriesFromRecordMap(localDatePlusMonths, firstDayOfMonth, map, attrs);
    }

    @NotNull
    public final List<qpo> createSummaryModelList(@NotNull Context context, @NotNull DailyCalorieReport calorieReport, int position) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(calorieReport, "calorieReport");
        LinkedList linkedList = new LinkedList();
        if (position == 0) {
            String quantityString = context.getResources().getQuantityString(qxi.common_unit_calorie, calorieReport.getCalories(), Integer.valueOf(calorieReport.getCalories()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            linkedList.add(new qpo(context.getString(c0j.A4), Integer.toString(calorieReport.getCalories()), quantityString));
        } else {
            String quantityString2 = context.getResources().getQuantityString(qxi.common_unit_calorie, calorieReport.getCalories(), Integer.valueOf(calorieReport.getCalories()));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            linkedList.add(new qpo(context.getString(c0j.B4), Integer.toString(calorieReport.getCalories()), quantityString2));
            int avgCaloriePerDay = calorieReport.getAvgCaloriePerDay();
            String quantityString3 = context.getResources().getQuantityString(qxi.common_unit_calorie, avgCaloriePerDay, Integer.valueOf(avgCaloriePerDay));
            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
            linkedList.add(new qpo(context.getString(c0j.z4), String.valueOf(avgCaloriePerDay), quantityString3));
        }
        return linkedList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createWeekEntries(@Nullable LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyCalorieReport> reportMap) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LocalDate localDateMinusWeeks = endLocalDate;
        while (true) {
            if (localDateMinusWeeks.isBefore(startLocalDate)) {
                return createEntriesFromRecordMap(endLocalDate, startLocalDate, linkedHashMap, null);
            }
            DailyCalorieReport dailyCalorieReport = reportMap != null ? reportMap.get(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusWeeks))) : null;
            if (dailyCalorieReport != null && (!dailyCalorieReport.getCalRecords().isEmpty())) {
                int size = dailyCalorieReport.getCalRecords().size();
                for (int i = 0; i < size; i++) {
                    CalorieRecord calorieRecord = dailyCalorieReport.getCalRecords().get(i);
                    linkedHashMap.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(calorieRecord.getTime())), calorieRecord);
                }
            }
            localDateMinusWeeks = localDateMinusWeeks.minusWeeks(1);
        }
    }

    @NotNull
    public final List<RecyclerBarEntry> createWeekEntries2(@NotNull DailyCalorieReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
        LocalDate localDatePlusWeeks = weekMonday.plusWeeks(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusWeeks, "plusWeeks(...)");
        if (true ^ report.getCalRecords().isEmpty()) {
            int size = report.getCalRecords().size();
            for (int i = 0; i < size; i++) {
                CalorieRecord calorieRecord = report.getCalRecords().get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(calorieRecord.getTime())), calorieRecord);
            }
        }
        return createEntriesFromRecordMap(localDatePlusWeeks, weekMonday, map, null);
    }

    @NotNull
    public final List<RecyclerBarEntry> getMonthEntries(@Nullable r02 attrs, @Nullable LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyCalorieReport> reportMap) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (LocalDate localDateMinusMonths = endLocalDate; !localDateMinusMonths.isBefore(startLocalDate); localDateMinusMonths = localDateMinusMonths.minusMonths(1)) {
            DailyCalorieReport dailyCalorieReport = (reportMap == null || !(reportMap.isEmpty() ^ true)) ? null : reportMap.get(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusMonths)));
            if (dailyCalorieReport != null && (!dailyCalorieReport.getCalRecords().isEmpty())) {
                int size = dailyCalorieReport.getCalRecords().size();
                for (int i = 0; i < size; i++) {
                    CalorieRecord calorieRecord = dailyCalorieReport.getCalRecords().get(i);
                    linkedHashMap.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(calorieRecord.getTime())), calorieRecord);
                }
            }
        }
        return createEntriesFromRecordMap(endLocalDate, startLocalDate, linkedHashMap, attrs);
    }
}
