package com.xiaomi.fitness.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.account.HrZoneRange;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c0j;
import defpackage.iji;
import defpackage.j22;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.str;
import defpackage.x44;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bE\u0010FJ\u001f\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J1\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002¢\u0006\u0004\b#\u0010'J%\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00022\b\u0010\b\u001a\u0004\u0018\u00010(2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b.\u0010-JA\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0004\b/\u0010\"JA\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0004\b0\u0010\"J#\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00022\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\b5\u00106J-\u00108\u001a\b\u0012\u0004\u0012\u0002040\u00022\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010B¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/util/HrmDataUtil;", "", "", "", Constants.KEY_RECHARGE_VALUES, "getMaxValue", "(Ljava/util/List;)I", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "report", "displayNumbers", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "fillHomeSegmentBarEntry", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;I)Ljava/util/List;", "Lorg/joda/time/LocalDate;", "endLocalDate", "startLocalDate", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "recordMap", "Lr02;", "attrs", "", "isWeek", "createEntriesFromRecordMap", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;Lr02;Z)Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lstr;", "getVisibleEntries", "(Landroidx/recyclerview/widget/RecyclerView;I)Lstr;", "mChartAttrs", "reportMap", "createEntryList", "(Lr02;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "fillDaySegmentBarEntry", "(Lr02;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)Ljava/util/List;", "time", "records", "(Lr02;JLjava/util/List;)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "fillBgBarEntryList", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;I)Ljava/util/List;", "createWeekEntries2", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;Lr02;)Ljava/util/List;", "createMonthEntries2", "createWeekEntries", "createMonthEntries", "Landroid/content/Context;", "context", "summary", "Lqpo;", "createManualModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)Ljava/util/List;", "restHrJump", "createDetailModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;Z)Ljava/util/List;", "hr", "getHeartRateStageIndex", "(I)I", "hrValue", "", "getAdviceOfHr", "(Ljava/lang/Integer;)Ljava/lang/String;", "REST_HR", "I", "STEP_HR", "SLEEP_HR", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HrmDataUtil {

    @NotNull
    public static final HrmDataUtil INSTANCE = new HrmDataUtil();
    public static final int REST_HR = 1;
    public static final int SLEEP_HR = 3;
    public static final int STEP_HR = 2;

    private HrmDataUtil() {
    }

    public static /* synthetic */ List createDetailModelList$default(HrmDataUtil hrmDataUtil, Context context, DailyHrReport dailyHrReport, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return hrmDataUtil.createDetailModelList(context, dailyHrReport, z);
    }

    private final List<SegmentBarEntry> createEntriesFromRecordMap(LocalDate endLocalDate, LocalDate startLocalDate, Map<Long, TimesDataRecordInt> recordMap, r02 attrs, boolean isWeek) {
        int monthBarEntryType2;
        ArrayList arrayList = new ArrayList();
        for (LocalDate localDateMinusDays = endLocalDate.minusDays(1); !localDateMinusDays.isBefore(startLocalDate); localDateMinusDays = localDateMinusDays.minusDays(1)) {
            Intrinsics.checkNotNull(localDateMinusDays);
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            TimesDataRecordInt timesDataRecordInt = recordMap.get(Long.valueOf(jChangZeroOfTheDay));
            List<Integer> integerList = timesDataRecordInt != null ? ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()) : new ArrayList<>();
            SegmentBarEntry.Companion companion = SegmentBarEntry.INSTANCE;
            int i = attrs.g0;
            SegmentBarEntry segmentBarEntry = new SegmentBarEntry(companion.getRectModels(10, integerList, i, i), 10);
            if (isWeek) {
                monthBarEntryType2 = RecyclerBarEntry.INSTANCE.getWeekBarEntryType(localDateMinusDays);
            } else {
                RecyclerBarEntry.Companion companion2 = RecyclerBarEntry.INSTANCE;
                Intrinsics.checkNotNull(localDateMinusDays);
                monthBarEntryType2 = companion2.getMonthBarEntryType2(attrs, localDateMinusDays);
            }
            segmentBarEntry.timestamp = jChangZeroOfTheDay;
            segmentBarEntry.localDate = localDateMinusDays;
            segmentBarEntry.type = monthBarEntryType2;
            segmentBarEntry.setY(getMaxValue(integerList));
            arrayList.add(segmentBarEntry);
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    public static final List<SegmentBarEntry> fillHomeSegmentBarEntry(@NotNull DailyHrReport report, int displayNumbers) {
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i = 0;
        while (i < displayNumbers) {
            map.put(Long.valueOf(jChangZeroOfTheDay2), new ArrayList());
            i++;
            jChangZeroOfTheDay2 = ((long) 3600) + jChangZeroOfTheDay2;
        }
        for (TimesDataRecordInt timesDataRecordInt : report.getHrRecords()) {
            long time = timesDataRecordInt.getTime();
            int[] valueArray = timesDataRecordInt.getValueArray();
            List list = (List) map.get(Long.valueOf(time));
            if (list != null) {
                list.addAll(ArrayUtils.toIntegerList(valueArray));
            }
        }
        int iA = x44.a(iji.A0);
        for (int i2 = 0; i2 < displayNumbers; i2++) {
            List<Integer> list2 = (List) map.get(Long.valueOf(jChangZeroOfTheDay));
            if (list2 != null) {
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry(SegmentBarEntry.INSTANCE.getRectModels(10, list2, iA, iA), 10);
                segmentBarEntry.timestamp = jChangZeroOfTheDay;
                segmentBarEntry.localDate = localDateTimestampToLocalDate;
                segmentBarEntry.type = 3;
                segmentBarEntry.setX(i2);
                segmentBarEntry.setY(INSTANCE.getMaxValue(list2));
                arrayList.add(segmentBarEntry);
                jChangZeroOfTheDay += (long) 3600;
            }
            new ArrayList();
        }
        return arrayList;
    }

    private final int getMaxValue(List<Integer> values) {
        if (values == null || ArrayUtils.isEmpty(values)) {
            return 0;
        }
        Collections.sort(values);
        return values.get(values.size() - 1).intValue();
    }

    @JvmStatic
    @NotNull
    public static final str<?> getVisibleEntries(@NotNull RecyclerView recyclerView, int displayNumbers) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        j22 j22Var = (j22) recyclerView.getAdapter();
        Intrinsics.checkNotNull(j22Var);
        List entries = j22Var.getEntries();
        Intrinsics.checkNotNullExpressionValue(entries, "getEntries(...)");
        Intrinsics.checkNotNull(linearLayoutManager);
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (iFindLastCompletelyVisibleItemPosition == -1) {
            iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        }
        if (iFindFirstCompletelyVisibleItemPosition == -1) {
            iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        }
        List arrayList = new ArrayList();
        if (iFindFirstCompletelyVisibleItemPosition != -1 && iFindLastCompletelyVisibleItemPosition != -1) {
            arrayList = entries.subList(iFindFirstCompletelyVisibleItemPosition, iFindLastCompletelyVisibleItemPosition + 1);
        }
        return new str<>(RecyclerBarEntry.INSTANCE.getTheMaxNumber(arrayList), 0.0f, arrayList);
    }

    @NotNull
    public final List<qpo> createDetailModelList(@NotNull Context context, @NotNull DailyHrReport summary, boolean restHrJump) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(summary, "summary");
        LinkedList linkedList = new LinkedList();
        Integer restHr = summary.getRestHr();
        if (restHr != null) {
            qpo qpoVar = new qpo(context.getString(TextUtils.equals(summary.getTag(), "days") ? c0j.Hb : c0j.Eb), restHr.toString(), context.getResources().getQuantityString(qxi.common_unit_heart_rate, restHr.intValue()));
            qpoVar.g = restHrJump;
            qpoVar.j = 1;
            linkedList.add(qpoVar);
        }
        linkedList.add(new qpo(context.getString(c0j.Fb), Integer.toString(summary.getMaxHr()), context.getResources().getQuantityString(qxi.common_unit_heart_rate, summary.getMaxHr())));
        linkedList.add(new qpo(context.getString(c0j.Gb), Integer.toString(summary.getMinHr()), context.getResources().getQuantityString(qxi.common_unit_heart_rate, summary.getMinHr())));
        linkedList.add(new qpo(context.getString(c0j.Db), Integer.toString(summary.getAvgHr()), context.getResources().getQuantityString(qxi.common_unit_heart_rate, summary.getAvgHr())));
        if (summary.getStepAvgHr() != null) {
            Integer stepAvgHr = summary.getStepAvgHr();
            Intrinsics.checkNotNull(stepAvgHr);
            if (stepAvgHr.intValue() > 0) {
                String string = context.getString(c0j.Ib);
                Integer stepAvgHr2 = summary.getStepAvgHr();
                Intrinsics.checkNotNull(stepAvgHr2);
                qpo qpoVar2 = new qpo(string, Integer.toString(stepAvgHr2.intValue()), context.getResources().getQuantityString(qxi.common_unit_heart_rate, summary.getAvgHr()));
                qpoVar2.g = restHrJump;
                qpoVar2.j = 2;
                linkedList.add(qpoVar2);
            }
        }
        if (summary.getSleepAvgHr() != null) {
            Integer sleepAvgHr = summary.getSleepAvgHr();
            Intrinsics.checkNotNull(sleepAvgHr);
            if (sleepAvgHr.intValue() > 0) {
                String string2 = context.getString(c0j.Ad);
                Integer sleepAvgHr2 = summary.getSleepAvgHr();
                Intrinsics.checkNotNull(sleepAvgHr2);
                qpo qpoVar3 = new qpo(string2, Integer.toString(sleepAvgHr2.intValue()), context.getResources().getQuantityString(qxi.common_unit_heart_rate, summary.getAvgHr()));
                qpoVar3.g = restHrJump;
                qpoVar3.j = 3;
                linkedList.add(qpoVar3);
            }
        }
        return linkedList;
    }

    @NotNull
    public final List<SegmentBarEntry> createEntryList(@NotNull r02 mChartAttrs, @NotNull LocalDate endLocalDate, @Nullable LocalDate startLocalDate, @Nullable Map<Long, DailyHrReport> reportMap) {
        Intrinsics.checkNotNullParameter(mChartAttrs, "mChartAttrs");
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        ArrayList arrayList = new ArrayList();
        while (!endLocalDate.isBefore(startLocalDate)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(endLocalDate);
            DailyHrReport dailyHrReport = reportMap != null ? reportMap.get(Long.valueOf(jChangZeroOfTheDay)) : null;
            if (dailyHrReport == null) {
                dailyHrReport = new DailyHrReport(jChangZeroOfTheDay, "");
            }
            arrayList.addAll(fillDaySegmentBarEntry(mChartAttrs, dailyHrReport));
            endLocalDate = endLocalDate.minusDays(1);
        }
        return arrayList;
    }

    @NotNull
    public final List<qpo> createManualModelList(@NotNull Context context, @NotNull DailyHrReport summary) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(summary, "summary");
        LinkedList linkedList = new LinkedList();
        List<HrItem> singleHrRecords = summary.getSingleHrRecords();
        if (singleHrRecords == null) {
            return linkedList;
        }
        for (HrItem hrItem : singleHrRecords) {
            linkedList.add(new qpo(TimeDateUtil.getDateHHmmFormat(hrItem.getTime()), String.valueOf(hrItem.getHr()), context.getResources().getQuantityString(qxi.common_unit_heart_rate, hrItem.getHr())));
        }
        return linkedList.size() > 4 ? linkedList.subList(0, 4) : linkedList;
    }

    @NotNull
    public final List<SegmentBarEntry> createMonthEntries(@NotNull r02 attrs, @NotNull LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyHrReport> reportMap) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(startLocalDate, "startLocalDate");
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        HashMap map = new HashMap();
        for (LocalDate localDateMinusMonths = endLocalDate; !localDateMinusMonths.isBefore(startLocalDate); localDateMinusMonths = localDateMinusMonths.minusMonths(1)) {
            DailyHrReport dailyHrReport = reportMap != null ? reportMap.get(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusMonths))) : null;
            if (dailyHrReport != null && (!dailyHrReport.getHrRecords().isEmpty())) {
                int size = dailyHrReport.getHrRecords().size();
                List<TimesDataRecordInt> hrRecords = dailyHrReport.getHrRecords();
                for (int i = 0; i < size; i++) {
                    TimesDataRecordInt timesDataRecordInt = hrRecords.get(i);
                    map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(timesDataRecordInt.getTime())), timesDataRecordInt);
                }
            }
        }
        return createEntriesFromRecordMap(endLocalDate, startLocalDate, map, attrs, false);
    }

    @NotNull
    public final List<SegmentBarEntry> createMonthEntries2(@NotNull DailyHrReport report, @NotNull r02 attrs) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
        LocalDate localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        if (true ^ report.getHrRecords().isEmpty()) {
            int size = report.getHrRecords().size();
            List<TimesDataRecordInt> hrRecords = report.getHrRecords();
            for (int i = 0; i < size; i++) {
                TimesDataRecordInt timesDataRecordInt = hrRecords.get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(timesDataRecordInt.getTime())), timesDataRecordInt);
            }
        }
        return createEntriesFromRecordMap(localDatePlusMonths, firstDayOfMonth, map, attrs, false);
    }

    @NotNull
    public final List<SegmentBarEntry> createWeekEntries(@NotNull r02 attrs, @NotNull LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @Nullable Map<Long, DailyHrReport> reportMap) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(startLocalDate, "startLocalDate");
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        HashMap map = new HashMap();
        for (LocalDate localDateMinusWeeks = endLocalDate; !localDateMinusWeeks.isBefore(startLocalDate); localDateMinusWeeks = localDateMinusWeeks.minusWeeks(1)) {
            DailyHrReport dailyHrReport = reportMap != null ? reportMap.get(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusWeeks))) : null;
            if (dailyHrReport != null && (!dailyHrReport.getHrRecords().isEmpty())) {
                int size = dailyHrReport.getHrRecords().size();
                List<TimesDataRecordInt> hrRecords = dailyHrReport.getHrRecords();
                for (int i = 0; i < size; i++) {
                    TimesDataRecordInt timesDataRecordInt = hrRecords.get(i);
                    map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(timesDataRecordInt.getTime())), timesDataRecordInt);
                }
            }
        }
        return createEntriesFromRecordMap(endLocalDate, startLocalDate, map, attrs, true);
    }

    @NotNull
    public final List<SegmentBarEntry> createWeekEntries2(@NotNull DailyHrReport report, @NotNull r02 attrs) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        HashMap map = new HashMap();
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
        LocalDate localDatePlusWeeks = weekMonday.plusWeeks(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusWeeks, "plusWeeks(...)");
        if (true ^ report.getHrRecords().isEmpty()) {
            int size = report.getHrRecords().size();
            List<TimesDataRecordInt> hrRecords = report.getHrRecords();
            for (int i = 0; i < size; i++) {
                TimesDataRecordInt timesDataRecordInt = hrRecords.get(i);
                map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(timesDataRecordInt.getTime())), timesDataRecordInt);
            }
        }
        return createEntriesFromRecordMap(localDatePlusWeeks, weekMonday, map, attrs, true);
    }

    @NotNull
    public final List<RecyclerBarEntry> fillBgBarEntryList(@Nullable DailyBasicReport report, int displayNumbers) {
        long time = report != null ? report.getTime() : System.currentTimeMillis() / ((long) 1000);
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(time);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        for (int i = 0; i < displayNumbers; i++) {
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, 100, jChangZeroOfTheDay, 3);
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            recyclerBarEntry.validType = 0;
            arrayList.add(recyclerBarEntry);
            jChangZeroOfTheDay += TimeDateUtil.TIME_HOUR;
        }
        return arrayList;
    }

    @NotNull
    public final List<SegmentBarEntry> fillDaySegmentBarEntry(@NotNull r02 attrs, long time, @NotNull List<TimesDataRecordInt> records) {
        r02 attrs2 = attrs;
        Intrinsics.checkNotNullParameter(attrs2, "attrs");
        Intrinsics.checkNotNullParameter(records, "records");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(time);
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        int i = attrs2.c;
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        int i2 = (int) (86400 / ((long) i));
        HashMap map = new HashMap();
        int i3 = 0;
        while (i3 < i) {
            map.put(Long.valueOf(jChangZeroOfTheDay2), new ArrayList());
            i3++;
            jChangZeroOfTheDay2 = ((long) i2) + jChangZeroOfTheDay2;
        }
        for (TimesDataRecordInt timesDataRecordInt : records) {
            long time2 = timesDataRecordInt.getTime();
            int[] valueArray = timesDataRecordInt.getValueArray();
            List list = (List) map.get(Long.valueOf(time2));
            if (list != null) {
                list.addAll(ArrayUtils.toIntegerList(valueArray));
            }
        }
        int i4 = 0;
        long j = jChangZeroOfTheDay;
        while (i4 < i) {
            long j2 = j - ((long) i2);
            List<Integer> list2 = (List) map.get(Long.valueOf(j2));
            if (list2 != null) {
                SegmentBarEntry.Companion companion = SegmentBarEntry.INSTANCE;
                int i5 = attrs2.g0;
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry(companion.getRectModels(10, list2, i5, i5), 10);
                int dayBarEntryType = RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j2, j);
                segmentBarEntry.timestamp = j2;
                segmentBarEntry.localDate = localDateTimestampToLocalDate;
                segmentBarEntry.type = dayBarEntryType;
                segmentBarEntry.setY(INSTANCE.getMaxValue(list2));
                arrayList.add(segmentBarEntry);
                j = j2;
            }
            i4++;
            attrs2 = attrs;
        }
        return arrayList;
    }

    @NotNull
    public final String getAdviceOfHr(@Nullable Integer hrValue) {
        int i;
        if (hrValue == null) {
            i = c0j.wn;
        } else if (hrValue.intValue() < 50) {
            i = c0j.zn;
        } else {
            i = new IntRange(50, 110).contains(hrValue.intValue()) ? c0j.An : c0j.yn;
        }
        return ResourceExtKt.getString(i);
    }

    public final int getHeartRateStageIndex(int hr) {
        HrZone hrZone = new HrZone();
        HrZoneRange hrZoneRange = hrZone.getHrZoneRange(HrZoneLevel.WarmUp);
        int minHr = hrZoneRange.getMinHr();
        int maxHr = hrZoneRange.getMaxHr();
        if (minHr <= hr && hr <= maxHr) {
            return 0;
        }
        HrZoneRange hrZoneRange2 = hrZone.getHrZoneRange(HrZoneLevel.FatBurning);
        int minHr2 = hrZoneRange2.getMinHr();
        int maxHr2 = hrZoneRange2.getMaxHr();
        if (minHr2 <= hr && hr <= maxHr2) {
            return 1;
        }
        HrZoneRange hrZoneRange3 = hrZone.getHrZoneRange(HrZoneLevel.Aerobic);
        int minHr3 = hrZoneRange3.getMinHr();
        int maxHr3 = hrZoneRange3.getMaxHr();
        if (minHr3 <= hr && hr <= maxHr3) {
            return 2;
        }
        HrZoneRange hrZoneRange4 = hrZone.getHrZoneRange(HrZoneLevel.Anaerobic);
        int minHr4 = hrZoneRange4.getMinHr();
        int maxHr4 = hrZoneRange4.getMaxHr();
        if (minHr4 <= hr && hr <= maxHr4) {
            return 3;
        }
        HrZoneRange hrZoneRange5 = hrZone.getHrZoneRange(HrZoneLevel.Extreme);
        return (hrZoneRange5.getMinHr() > hr || hr > hrZoneRange5.getMaxHr()) ? 0 : 4;
    }

    @NotNull
    public final List<SegmentBarEntry> fillDaySegmentBarEntry(@NotNull r02 attrs, @NotNull DailyHrReport report) {
        r02 attrs2 = attrs;
        Intrinsics.checkNotNullParameter(attrs2, "attrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        int i = attrs2.c;
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        int i2 = (int) (86400 / ((long) i));
        HashMap map = new HashMap();
        int i3 = 0;
        while (i3 < i) {
            map.put(Long.valueOf(jChangZeroOfTheDay2), new ArrayList());
            i3++;
            jChangZeroOfTheDay2 = ((long) i2) + jChangZeroOfTheDay2;
        }
        for (TimesDataRecordInt timesDataRecordInt : report.getHrRecords()) {
            long time = timesDataRecordInt.getTime();
            int[] valueArray = timesDataRecordInt.getValueArray();
            List list = (List) map.get(Long.valueOf(time));
            if (list != null) {
                list.addAll(ArrayUtils.toIntegerList(valueArray));
            }
        }
        int i4 = 0;
        long j = jChangZeroOfTheDay;
        while (i4 < i) {
            long j2 = j - ((long) i2);
            List<Integer> list2 = (List) map.get(Long.valueOf(j2));
            if (list2 != null) {
                SegmentBarEntry.Companion companion = SegmentBarEntry.INSTANCE;
                int i5 = attrs2.g0;
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry(companion.getRectModels(10, list2, i5, i5), 10);
                int dayBarEntryType = RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j2, j);
                segmentBarEntry.timestamp = j2;
                segmentBarEntry.localDate = localDateTimestampToLocalDate;
                segmentBarEntry.type = dayBarEntryType;
                segmentBarEntry.setY(INSTANCE.getMaxValue(list2));
                arrayList.add(segmentBarEntry);
                j = j2;
            }
            i4++;
            attrs2 = attrs;
        }
        return arrayList;
    }
}
