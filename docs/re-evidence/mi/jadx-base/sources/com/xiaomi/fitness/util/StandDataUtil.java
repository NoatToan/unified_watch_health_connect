package com.xiaomi.fitness.util;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.a52;
import defpackage.c0j;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b9\u0010:JC\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!JC\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010)\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010)\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b,\u0010-J9\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005¢\u0006\u0004\b.\u0010/JC\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005¢\u0006\u0004\b1\u00102J+\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0011¢\u0006\u0004\b4\u00105J+\u00106\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0011¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0017¢\u0006\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/util/StandDataUtil;", "", "Lorg/joda/time/LocalDate;", "endLocalDate", "startLocalDate", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/StandRecord;", "recordMap", "Lr02;", "attrs", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createEntriesFromRecordMap", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;Lr02;)Ljava/util/List;", "Landroid/content/Context;", "context", "", "steps", "txtResource", "Lqpo;", "createStepSummaryModel", "(Landroid/content/Context;II)Lqpo;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "standReport", "createDayEntries", "(Lr02;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;)Ljava/util/List;", "displayNumbers", "createDayHomeEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;I)Ljava/util/List;", "La52;", "zeroTime", "createDefaultDayEntries", "(La52;J)Ljava/util/List;", "standReportMap", "createEntryList", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lr02;Ljava/util/Map;)Ljava/util/List;", "entries", "", "getValidEntry", "(Ljava/util/List;)Z", "report", "createWeekEntries2", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;)Ljava/util/List;", "createMonthEntries2", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;Lr02;)Ljava/util/List;", "createWeekEntries", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "reportMap", "getMonthEntries", "(Lr02;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "position", "createSummaryModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;I)Ljava/util/List;", "createRSummaryModelList", "findCurrentHourStand", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;)Z", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StandDataUtil {

    @NotNull
    public static final StandDataUtil INSTANCE = new StandDataUtil();

    private StandDataUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    private final List<RecyclerBarEntry> createEntriesFromRecordMap(LocalDate endLocalDate, LocalDate startLocalDate, Map<Long, StandRecord> recordMap, r02 attrs) {
        int standCount;
        int monthBarEntryType2;
        LocalDate localDateMinusDays = endLocalDate.minusDays(1);
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (!localDateMinusDays.isBefore(startLocalDate)) {
            Intrinsics.checkNotNull(localDateMinusDays);
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            StandRecord standRecord = recordMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (standRecord != null) {
                Intrinsics.checkNotNull(localDateMinusDays);
                if (TimeDateUtil.isFuture(localDateMinusDays)) {
                    standCount = 0;
                } else {
                    standCount = standRecord.getStandCount();
                }
            } else {
                standCount = 0;
            }
            if (attrs == null) {
                monthBarEntryType2 = RecyclerBarEntry.INSTANCE.getWeekBarEntryType(localDateMinusDays);
            } else {
                RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
                Intrinsics.checkNotNull(localDateMinusDays);
                monthBarEntryType2 = companion.getMonthBarEntryType2(attrs, localDateMinusDays);
            }
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, standCount, jChangZeroOfTheDay, monthBarEntryType2);
            recyclerBarEntry.localDate = localDateMinusDays;
            linkedList.add(recyclerBarEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
            i++;
        }
        return linkedList;
    }

    private final qpo createStepSummaryModel(Context context, int steps, int txtResource) {
        String quantityString = context.getResources().getQuantityString(qxi.c1, steps);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return new qpo(context.getString(txtResource), String.valueOf(steps), quantityString);
    }

    @NotNull
    public final List<RecyclerBarEntry> createDayEntries(@NotNull r02 attrs, @NotNull DailyStandReport standReport) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(standReport, "standReport");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(standReport.getTime());
        List<StandRecord> standDetail = standReport.getStandDetail();
        int size = standDetail.size();
        HashMap map = new HashMap();
        for (int i = 0; i < size; i++) {
            StandRecord standRecord = standDetail.get(i);
            map.put(Long.valueOf(standRecord.getTime()), standRecord);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = attrs.c;
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        int i3 = 0;
        while (i3 < i2) {
            long j = jChangZeroOfTheDay - TimeDateUtil.TIME_HOUR;
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i3, 30, j, RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j, jChangZeroOfTheDay));
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            StandRecord standRecord2 = (StandRecord) map.get(Long.valueOf(j));
            if (TimeDateUtil.isFuture(j) || standRecord2 == null || standRecord2.getStandCount() <= 0) {
                recyclerBarEntry.validType = 1;
            } else {
                recyclerBarEntry.validType = 0;
            }
            arrayList.add(recyclerBarEntry);
            i3++;
            jChangZeroOfTheDay = j;
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createDayHomeEntries(@NotNull DailyStandReport standReport, int displayNumbers) {
        Intrinsics.checkNotNullParameter(standReport, "standReport");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(standReport.getTime());
        List<StandRecord> standDetail = standReport.getStandDetail();
        int size = standDetail.size();
        HashMap map = new HashMap();
        for (int i = 0; i < size; i++) {
            StandRecord standRecord = standDetail.get(i);
            map.put(Long.valueOf(standRecord.getTime()), standRecord);
        }
        ArrayList arrayList = new ArrayList();
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        for (int i2 = 0; i2 < displayNumbers; i2++) {
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i2, 30, jChangZeroOfTheDay, 3);
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            StandRecord standRecord2 = (StandRecord) map.get(Long.valueOf(jChangZeroOfTheDay));
            if (TimeDateUtil.isFuture(jChangZeroOfTheDay) || standRecord2 == null || standRecord2.getStandCount() <= 0) {
                recyclerBarEntry.validType = 1;
            } else {
                recyclerBarEntry.validType = 0;
            }
            arrayList.add(recyclerBarEntry);
            jChangZeroOfTheDay += TimeDateUtil.TIME_HOUR;
        }
        return arrayList;
    }

    @NotNull
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
            long j2 = j - TimeDateUtil.TIME_HOUR;
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i2, 30, j2, RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j2, j));
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            recyclerBarEntry.validType = 1;
            arrayList.add(recyclerBarEntry);
            i2++;
            j = j2;
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createEntryList(@NotNull LocalDate endLocalDate, @Nullable LocalDate startLocalDate, @NotNull r02 attrs, @Nullable Map<Long, DailyStandReport> standReportMap) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ArrayList arrayList = new ArrayList();
        while (!endLocalDate.isBefore(startLocalDate)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(endLocalDate);
            DailyStandReport dailyStandReport = standReportMap != null ? standReportMap.get(Long.valueOf(jChangZeroOfTheDay)) : null;
            if (dailyStandReport == null) {
                dailyStandReport = new DailyStandReport("days", jChangZeroOfTheDay);
            }
            arrayList.addAll(createDayEntries(attrs, dailyStandReport));
            endLocalDate = endLocalDate.minusDays(1);
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createMonthEntries2(@NotNull DailyStandReport report, @Nullable r02 attrs) {
        Intrinsics.checkNotNullParameter(report, "report");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
        LocalDate localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        if (true ^ report.getStandDetail().isEmpty()) {
            List<StandRecord> standDetail = report.getStandDetail();
            int size = report.getStandDetail().size();
            for (int i = 0; i < size; i++) {
                StandRecord standRecord = standDetail.get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(standRecord.getTime())), standRecord);
            }
        }
        return createEntriesFromRecordMap(localDatePlusMonths, firstDayOfMonth, map, attrs);
    }

    @NotNull
    public final List<qpo> createRSummaryModelList(@NotNull Context context, @NotNull DailyStandReport standReport, int position) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(standReport, "standReport");
        LinkedList linkedList = new LinkedList();
        if (position != 0) {
            linkedList.add(createStepSummaryModel(context, standReport.getAvgStandPerDay(), c0j.ll));
        } else {
            linkedList.add(createStepSummaryModel(context, standReport.getAvgStandPerDay(), c0j.ml));
        }
        return linkedList;
    }

    @NotNull
    public final List<qpo> createSummaryModelList(@NotNull Context context, @NotNull DailyStandReport standReport, int position) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(standReport, "standReport");
        LinkedList linkedList = new LinkedList();
        if (position != 0) {
            linkedList.add(createStepSummaryModel(context, standReport.getAvgStandPerDay(), c0j.ll));
        }
        return linkedList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createWeekEntries(@NotNull LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyStandReport> standReportMap) {
        Intrinsics.checkNotNullParameter(startLocalDate, "startLocalDate");
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        HashMap map = new HashMap();
        LocalDate localDateMinusWeeks = endLocalDate;
        while (true) {
            DailyStandReport dailyStandReport = null;
            if (localDateMinusWeeks.isBefore(startLocalDate)) {
                return createEntriesFromRecordMap(endLocalDate, startLocalDate, map, null);
            }
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusWeeks);
            if (standReportMap != null && (!standReportMap.isEmpty())) {
                dailyStandReport = standReportMap.get(Long.valueOf(jChangZeroOfTheDay));
            }
            if (dailyStandReport != null && (!dailyStandReport.getStandDetail().isEmpty())) {
                List<StandRecord> standDetail = dailyStandReport.getStandDetail();
                int size = dailyStandReport.getStandDetail().size();
                for (int i = 0; i < size; i++) {
                    StandRecord standRecord = standDetail.get(i);
                    map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(standRecord.getTime())), standRecord);
                }
            }
            localDateMinusWeeks = localDateMinusWeeks.minusWeeks(1);
        }
    }

    @NotNull
    public final List<RecyclerBarEntry> createWeekEntries2(@NotNull DailyStandReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
        LocalDate localDatePlusWeeks = weekMonday.plusWeeks(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusWeeks, "plusWeeks(...)");
        if (true ^ report.getStandDetail().isEmpty()) {
            List<StandRecord> standDetail = report.getStandDetail();
            int size = report.getStandDetail().size();
            for (int i = 0; i < size; i++) {
                StandRecord standRecord = standDetail.get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(standRecord.getTime())), standRecord);
            }
        }
        return createEntriesFromRecordMap(localDatePlusWeeks, weekMonday, map, null);
    }

    public final boolean findCurrentHourStand(@NotNull DailyStandReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        long currentHourTime = TimeDateUtil.getCurrentHourTime();
        Iterator<StandRecord> it = report.getStandDetail().iterator();
        while (it.hasNext()) {
            if (it.next().getTime() == currentHourTime) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<RecyclerBarEntry> getMonthEntries(@Nullable r02 attrs, @NotNull LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyStandReport> reportMap) {
        Intrinsics.checkNotNullParameter(startLocalDate, "startLocalDate");
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        HashMap map = new HashMap();
        for (LocalDate localDateMinusMonths = endLocalDate; !localDateMinusMonths.isBefore(startLocalDate); localDateMinusMonths = localDateMinusMonths.minusMonths(1)) {
            DailyStandReport dailyStandReport = (reportMap == null || !(reportMap.isEmpty() ^ true)) ? null : reportMap.get(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusMonths)));
            if (dailyStandReport != null && (!dailyStandReport.getStandDetail().isEmpty())) {
                List<StandRecord> standDetail = dailyStandReport.getStandDetail();
                int size = dailyStandReport.getStandDetail().size();
                for (int i = 0; i < size; i++) {
                    StandRecord standRecord = standDetail.get(i);
                    map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(standRecord.getTime())), standRecord);
                }
            }
        }
        return createEntriesFromRecordMap(endLocalDate, startLocalDate, map, attrs);
    }

    public final boolean getValidEntry(@NotNull List<? extends RecyclerBarEntry> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (entries.isEmpty()) {
            return false;
        }
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            if (entries.get(i).validType == 0) {
                return true;
            }
        }
        return false;
    }
}
