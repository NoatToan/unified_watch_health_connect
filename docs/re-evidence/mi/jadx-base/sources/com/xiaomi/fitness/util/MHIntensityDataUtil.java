package com.xiaomi.fitness.util;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.MHStrengthRecord;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#JE\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J9\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b'\u0010(JC\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b-\u0010.J+\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0015¢\u0006\u0004\b1\u00102J+\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0015¢\u0006\u0004\b3\u00102¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/util/MHIntensityDataUtil;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "report", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/MHStrengthRecord;", "createStrengthItemMap", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;)Ljava/util/Map;", "Lorg/joda/time/LocalDate;", "endLocalDate", "startLocalDate", "recordMap", "Lr02;", "attrs", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createEntriesFromRecordMap", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;Lr02;)Ljava/util/List;", "Landroid/content/Context;", "context", "", "mins", "txtResource", "Lqpo;", "createStepSummaryModel", "(Landroid/content/Context;II)Lqpo;", "createDayEntries", "(Lr02;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;)Ljava/util/List;", "displayNumber", "createDayEntriesHome", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;I)Ljava/util/List;", "La52;", "zeroTime", "createDefaultDayEntries", "(La52;J)Ljava/util/List;", "reportMap", "createEntryList", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lr02;Ljava/util/Map;)Ljava/util/List;", "createWeekEntries", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "getMonthEntries", "(Lr02;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "createWeekEntries2", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;)Ljava/util/List;", "createMonthEntries2", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;Lr02;)Ljava/util/List;", "mhStrengthReport", "position", "createSummaryModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;I)Ljava/util/List;", "createRSummaryModelList", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MHIntensityDataUtil {

    @NotNull
    public static final MHIntensityDataUtil INSTANCE = new MHIntensityDataUtil();

    private MHIntensityDataUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    private final List<RecyclerBarEntry> createEntriesFromRecordMap(LocalDate endLocalDate, LocalDate startLocalDate, Map<Long, MHStrengthRecord> recordMap, r02 attrs) {
        int minutes;
        int monthBarEntryType2;
        LocalDate localDateMinusDays = endLocalDate.minusDays(1);
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (!localDateMinusDays.isBefore(startLocalDate)) {
            Intrinsics.checkNotNull(localDateMinusDays);
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            MHStrengthRecord mHStrengthRecord = recordMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (mHStrengthRecord != null) {
                Intrinsics.checkNotNull(localDateMinusDays);
                if (TimeDateUtil.isFuture(localDateMinusDays)) {
                    minutes = 0;
                } else {
                    minutes = mHStrengthRecord.getMinutes();
                }
            } else {
                minutes = 0;
            }
            if (attrs == null) {
                monthBarEntryType2 = RecyclerBarEntry.INSTANCE.getWeekBarEntryType(localDateMinusDays);
            } else {
                RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
                Intrinsics.checkNotNull(localDateMinusDays);
                monthBarEntryType2 = companion.getMonthBarEntryType2(attrs, localDateMinusDays);
            }
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, minutes, jChangZeroOfTheDay, monthBarEntryType2);
            recyclerBarEntry.localDate = localDateMinusDays;
            linkedList.add(recyclerBarEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
            i++;
        }
        return linkedList;
    }

    private final qpo createStepSummaryModel(Context context, int mins, int txtResource) {
        String quantityString = context.getResources().getQuantityString(qxi.Q1, mins);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return new qpo(context.getString(txtResource), Integer.toString(mins), quantityString);
    }

    private final Map<Long, MHStrengthRecord> createStrengthItemMap(DailyMHStrengthReport report) {
        List<MHStrengthRecord> recordList = report.getRecordList();
        HashMap map = new HashMap();
        if (recordList != null && !recordList.isEmpty()) {
            for (MHStrengthRecord mHStrengthRecord : recordList) {
                map.put(Long.valueOf(mHStrengthRecord.getTime()), mHStrengthRecord);
            }
        }
        return map;
    }

    @NotNull
    public final List<RecyclerBarEntry> createDayEntries(@NotNull r02 attrs, @NotNull DailyMHStrengthReport report) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(report, "report");
        int i = attrs.c;
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Map<Long, MHStrengthRecord> mapCreateStrengthItemMap = createStrengthItemMap(report);
        long j = jChangZeroOfTheDay;
        int i2 = 0;
        while (i2 < i) {
            long j2 = j - RepositoryManager.GAP_X_MINUTE;
            MHStrengthRecord mHStrengthRecord = mapCreateStrengthItemMap.get(Long.valueOf(j2));
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i2, (mHStrengthRecord == null || TimeDateUtil.isFuture(j2)) ? 0 : mHStrengthRecord.getMinutes(), j2, RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j2, j));
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(recyclerBarEntry);
            i2++;
            j = j2;
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createDayEntriesHome(@NotNull DailyMHStrengthReport report, int displayNumber) {
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        Map<Long, MHStrengthRecord> mapCreateStrengthItemMap = createStrengthItemMap(report);
        for (int i = 0; i < displayNumber; i++) {
            MHStrengthRecord mHStrengthRecord = mapCreateStrengthItemMap.get(Long.valueOf(jChangZeroOfTheDay));
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, (mHStrengthRecord == null || TimeDateUtil.isFuture(jChangZeroOfTheDay)) ? 0 : mHStrengthRecord.getMinutes(), jChangZeroOfTheDay, 3);
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
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
    public final List<RecyclerBarEntry> createEntryList(@NotNull LocalDate endLocalDate, @Nullable LocalDate startLocalDate, @Nullable r02 attrs, @Nullable Map<Long, DailyMHStrengthReport> reportMap) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        ArrayList arrayList = new ArrayList();
        while (!endLocalDate.isBefore(startLocalDate)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(endLocalDate);
            DailyMHStrengthReport dailyMHStrengthReport = reportMap != null ? reportMap.get(Long.valueOf(jChangZeroOfTheDay)) : null;
            if (dailyMHStrengthReport == null) {
                dailyMHStrengthReport = new DailyMHStrengthReport(jChangZeroOfTheDay, "days");
            }
            Intrinsics.checkNotNull(attrs);
            arrayList.addAll(createDayEntries(attrs, dailyMHStrengthReport));
            endLocalDate = endLocalDate.minusDays(1);
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createMonthEntries2(@NotNull DailyMHStrengthReport report, @Nullable r02 attrs) {
        Intrinsics.checkNotNullParameter(report, "report");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
        LocalDate localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        if (true ^ report.getRecordList().isEmpty()) {
            List<MHStrengthRecord> recordList = report.getRecordList();
            int size = recordList.size();
            for (int i = 0; i < size; i++) {
                MHStrengthRecord mHStrengthRecord = recordList.get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(mHStrengthRecord.getTime())), mHStrengthRecord);
            }
        }
        return createEntriesFromRecordMap(localDatePlusMonths, firstDayOfMonth, map, attrs);
    }

    @NotNull
    public final List<qpo> createRSummaryModelList(@NotNull Context context, @NotNull DailyMHStrengthReport mhStrengthReport, int position) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mhStrengthReport, "mhStrengthReport");
        LinkedList linkedList = new LinkedList();
        if (position != 0) {
            linkedList.add(createStepSummaryModel(context, mhStrengthReport.getDuration(), c0j.U9));
            linkedList.add(createStepSummaryModel(context, mhStrengthReport.getAvgStrengthPerDay(), c0j.S9));
        } else {
            linkedList.add(createStepSummaryModel(context, mhStrengthReport.getDuration(), c0j.T9));
        }
        return linkedList;
    }

    @NotNull
    public final List<qpo> createSummaryModelList(@NotNull Context context, @NotNull DailyMHStrengthReport mhStrengthReport, int position) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mhStrengthReport, "mhStrengthReport");
        LinkedList linkedList = new LinkedList();
        if (position != 0) {
            linkedList.add(createStepSummaryModel(context, mhStrengthReport.getDuration(), c0j.U9));
            linkedList.add(createStepSummaryModel(context, mhStrengthReport.getAvgStrengthPerDay(), c0j.S9));
        }
        return linkedList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createWeekEntries(@NotNull LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyMHStrengthReport> reportMap) {
        Intrinsics.checkNotNullParameter(startLocalDate, "startLocalDate");
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        HashMap map = new HashMap();
        LocalDate localDateMinusWeeks = endLocalDate;
        while (true) {
            DailyMHStrengthReport dailyMHStrengthReport = null;
            if (localDateMinusWeeks.isBefore(startLocalDate)) {
                return createEntriesFromRecordMap(endLocalDate, startLocalDate, map, null);
            }
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusWeeks);
            if (reportMap != null && reportMap.size() > 0) {
                dailyMHStrengthReport = reportMap.get(Long.valueOf(jChangZeroOfTheDay));
            }
            if (dailyMHStrengthReport != null && dailyMHStrengthReport.getRecordList() != null && dailyMHStrengthReport.getRecordList().size() > 0) {
                List<MHStrengthRecord> recordList = dailyMHStrengthReport.getRecordList();
                int size = recordList.size();
                for (int i = 0; i < size; i++) {
                    MHStrengthRecord mHStrengthRecord = recordList.get(i);
                    map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(mHStrengthRecord.getTime())), mHStrengthRecord);
                }
            }
            localDateMinusWeeks = localDateMinusWeeks.minusWeeks(1);
        }
    }

    @NotNull
    public final List<RecyclerBarEntry> createWeekEntries2(@NotNull DailyMHStrengthReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
        LocalDate localDatePlusWeeks = weekMonday.plusWeeks(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusWeeks, "plusWeeks(...)");
        if (true ^ report.getRecordList().isEmpty()) {
            List<MHStrengthRecord> recordList = report.getRecordList();
            int size = recordList.size();
            for (int i = 0; i < size; i++) {
                MHStrengthRecord mHStrengthRecord = recordList.get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(mHStrengthRecord.getTime())), mHStrengthRecord);
            }
        }
        return createEntriesFromRecordMap(localDatePlusWeeks, weekMonday, map, null);
    }

    @NotNull
    public final List<RecyclerBarEntry> getMonthEntries(@Nullable r02 attrs, @NotNull LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyMHStrengthReport> reportMap) {
        Intrinsics.checkNotNullParameter(startLocalDate, "startLocalDate");
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        HashMap map = new HashMap();
        for (LocalDate localDateMinusMonths = endLocalDate; !localDateMinusMonths.isBefore(startLocalDate); localDateMinusMonths = localDateMinusMonths.minusMonths(1)) {
            DailyMHStrengthReport dailyMHStrengthReport = reportMap != null ? reportMap.get(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusMonths))) : null;
            if (dailyMHStrengthReport != null && dailyMHStrengthReport.getRecordList() != null && dailyMHStrengthReport.getRecordList().size() > 0) {
                List<MHStrengthRecord> recordList = dailyMHStrengthReport.getRecordList();
                int size = recordList.size();
                for (int i = 0; i < size; i++) {
                    MHStrengthRecord mHStrengthRecord = recordList.get(i);
                    map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(mHStrengthRecord.getTime())), mHStrengthRecord);
                }
            }
        }
        return createEntriesFromRecordMap(endLocalDate, startLocalDate, map, attrs);
    }
}
