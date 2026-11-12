package defpackage;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValuePair;
import com.xiaomi.fitness.chart.entrys.MultiBarEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.repo.RepositoryManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public class f4c {
    public static List<RecyclerBarEntry> a(DailyHearingReport dailyHearingReport, int i) {
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyHearingReport.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        Map<Long, TimedValuePair<Integer>> mapB = b(dailyHearingReport);
        for (int i2 = 0; i2 < i; i2++) {
            TimedValuePair<Integer> timedValuePair = mapB.get(Long.valueOf(jChangZeroOfTheDay));
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i2, ((timedValuePair == null || TimeDateUtil.isFuture(jChangZeroOfTheDay)) ? 0 : timedValuePair.getFirst()).intValue(), jChangZeroOfTheDay, 3);
            recyclerBarEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(recyclerBarEntry);
            jChangZeroOfTheDay += TimeDateUtil.TIME_HOUR;
        }
        return arrayList;
    }

    public static Map<Long, TimedValuePair<Integer>> b(DailyHearingReport dailyHearingReport) {
        List<TimedValuePair<Integer>> hearingDurationList = dailyHearingReport.getHearingDurationList();
        HashMap map = new HashMap();
        if (hearingDurationList != null && !hearingDurationList.isEmpty()) {
            for (TimedValuePair<Integer> timedValuePair : hearingDurationList) {
                map.put(Long.valueOf(timedValuePair.getTime()), timedValuePair);
            }
        }
        return map;
    }

    public static List<MultiBarEntry> c(DailyHearingReport dailyHearingReport, r02 r02Var) {
        int i;
        int iIntValue;
        r02 r02Var2 = r02Var;
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyHearingReport.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate.plusDays(1));
        int i2 = r02Var2.c;
        HashMap map = new HashMap();
        List<TimedValuePair<Integer>> hearingDurationList = dailyHearingReport.getHearingDurationList();
        if (!ArrayUtils.isEmpty(hearingDurationList)) {
            for (TimedValuePair<Integer> timedValuePair : hearingDurationList) {
                map.put(Long.valueOf(timedValuePair.getTime()), timedValuePair);
            }
        }
        int iA = x44.a(iji.K2);
        int iA2 = x44.a(iji.L2);
        int i3 = 0;
        while (i3 < i2) {
            long j = jChangZeroOfTheDay - RepositoryManager.GAP_X_MINUTE;
            TimedValuePair timedValuePair2 = (TimedValuePair) map.get(Long.valueOf(j));
            if (timedValuePair2 != null) {
                int iIntValue2 = timedValuePair2.getFirst() == null ? 0 : ((Integer) timedValuePair2.getFirst()).intValue() / 60;
                iIntValue = timedValuePair2.getSecond() == null ? 0 : ((Integer) timedValuePair2.getSecond()).intValue() / 60;
                i = iIntValue2;
            } else {
                i = 0;
                iIntValue = 0;
            }
            MultiBarEntry multiBarEntry = new MultiBarEntry(i3, Math.max(i, iIntValue), j, RecyclerBarEntry.getDayBarEntryType(r02Var2, j, jChangZeroOfTheDay));
            multiBarEntry.localDate = localDateTimestampToLocalDate;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MultiBarEntry.a(iA, i, true));
            arrayList2.add(new MultiBarEntry.a(iA2, iIntValue, false));
            multiBarEntry.c(arrayList2);
            arrayList.add(multiBarEntry);
            i3++;
            r02Var2 = r02Var;
            jChangZeroOfTheDay = j;
        }
        return arrayList;
    }

    public static List<MultiBarEntry> d(DailyHearingReport dailyHearingReport, r02 r02Var, boolean z) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        int iIntValue;
        int i;
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyHearingReport.getTime());
        if (z) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        HashMap map = new HashMap();
        List<TimedValuePair<Integer>> hearingDurationList = dailyHearingReport.getHearingDurationList();
        if (!ArrayUtils.isEmpty(hearingDurationList)) {
            for (TimedValuePair<Integer> timedValuePair : hearingDurationList) {
                map.put(Long.valueOf(timedValuePair.getTime()), timedValuePair);
            }
        }
        ArrayList arrayList = new ArrayList();
        int iA = x44.a(iji.K2);
        int iA2 = x44.a(iji.L2);
        int i2 = 0;
        for (LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1); !localDateMinusDays.isBefore(firstDayOfMonth); localDateMinusDays = localDateMinusDays.minusDays(1)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            TimedValuePair timedValuePair2 = (TimedValuePair) map.get(Long.valueOf(jChangZeroOfTheDay));
            if (timedValuePair2 != null) {
                int iIntValue2 = timedValuePair2.getFirst() == null ? 0 : ((Integer) timedValuePair2.getFirst()).intValue() / 60;
                iIntValue = timedValuePair2.getSecond() == null ? 0 : ((Integer) timedValuePair2.getSecond()).intValue() / 60;
                i = iIntValue2;
            } else {
                iIntValue = 0;
                i = 0;
            }
            MultiBarEntry multiBarEntry = new MultiBarEntry(i2, Math.max(i, iIntValue), jChangZeroOfTheDay, z ? RecyclerBarEntry.getWeekBarEntryType(localDateMinusDays) : RecyclerBarEntry.getMonthBarEntryType2(r02Var, localDateMinusDays));
            multiBarEntry.localDate = localDateMinusDays;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MultiBarEntry.a(iA, i, true));
            arrayList2.add(new MultiBarEntry.a(iA2, iIntValue, false));
            multiBarEntry.c(arrayList2);
            arrayList.add(multiBarEntry);
            i2++;
        }
        return arrayList;
    }

    public static List<MultiBarEntry> e(@Nullable DailyHearingReport dailyHearingReport, @Nullable r02 r02Var, int i, LocalDate localDate) {
        if (dailyHearingReport == null) {
            dailyHearingReport = new DailyHearingReport(TimeDateUtil.changZeroOfTheDay(localDate), BarChartRecyclerHelper.INSTANCE.getViewTag(i));
        }
        if (i == 0) {
            return c(dailyHearingReport, r02Var);
        }
        return d(dailyHearingReport, r02Var, i == 1);
    }
}
