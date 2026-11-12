package defpackage;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.EnergyStateRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.model.EnergyEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.repo.RepositoryManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public class na8 {
    public static List<EnergyEntry> a(a52 a52Var, DailyEnergyReport dailyEnergyReport) {
        int stateValue;
        int i;
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyEnergyReport.getTime());
        int i2 = 1;
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate.plusDays(1));
        int i3 = a52Var.c;
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i4 = 0;
        while (i4 < i3) {
            long j = RepositoryManager.GAP_X_MINUTE + jChangZeroOfTheDay2;
            map.put(Long.valueOf(jChangZeroOfTheDay2), null);
            i4++;
            jChangZeroOfTheDay2 = j;
        }
        List<EnergyStateRecord> energyStateRecords = dailyEnergyReport.getEnergyStateRecords();
        if (ArrayUtils.isEmpty(energyStateRecords)) {
            Logger.i("EnergyDataUtil", "createDayBarChartEntries EnergyStateRecords is null");
        } else {
            Logger.i("EnergyDataUtil", "createDayBarChartEntries EnergyStateRecords:" + Arrays.toString(energyStateRecords.toArray()));
            for (EnergyStateRecord energyStateRecord : energyStateRecords) {
                if (map.containsKey(Long.valueOf(energyStateRecord.getTime()))) {
                    int state = energyStateRecord.getState();
                    int stateValue2 = state == 0 ? 0 : energyStateRecord.getStateValue();
                    if (state == i2) {
                        stateValue2 = Math.abs(stateValue2) - (Math.abs(stateValue2) * 2);
                    }
                    map.put(Long.valueOf(energyStateRecord.getTime()), new EnergyStateRecord(energyStateRecord.getTime(), state, stateValue2));
                }
                i2 = 1;
            }
        }
        for (int i5 = 0; i5 < i3; i5++) {
            jChangZeroOfTheDay -= RepositoryManager.GAP_X_MINUTE;
            EnergyStateRecord energyStateRecord2 = (EnergyStateRecord) map.get(Long.valueOf(jChangZeroOfTheDay));
            if (energyStateRecord2 == null) {
                stateValue = 0;
                i = 0;
            } else {
                int state2 = energyStateRecord2.getState();
                stateValue = energyStateRecord2.getStateValue();
                i = state2;
            }
            EnergyEntry energyEntry = new EnergyEntry(i5, stateValue, jChangZeroOfTheDay, f(a52Var, i5, jChangZeroOfTheDay));
            energyEntry.localDate = localDateTimestampToLocalDate;
            energyEntry.f11770a = i;
            arrayList.add(energyEntry);
        }
        return arrayList;
    }

    public static List<MaxMinEntry> b(DailyEnergyReport dailyEnergyReport, int i) {
        ArrayList arrayList = new ArrayList();
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(dailyEnergyReport.getTime());
        HashMap map = new HashMap();
        for (TimesDataRecordInt timesDataRecordInt : dailyEnergyReport.getEnergyRecords()) {
            map.put(Long.valueOf(timesDataRecordInt.getTime()), timesDataRecordInt);
        }
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(jChangZeroOfTheDay);
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        int i2 = (int) (86400 / ((long) i));
        for (int i3 = 0; i3 < i; i3++) {
            TimesDataRecordInt timesDataRecordInt2 = (TimesDataRecordInt) map.get(Long.valueOf(jChangZeroOfTheDay2));
            int i4 = (timesDataRecordInt2 == null || timesDataRecordInt2.getValueArray() == null || timesDataRecordInt2.getValueArray().length <= 0) ? 0 : timesDataRecordInt2.getValueArray()[0];
            if (TimeDateUtil.isFuture(jChangZeroOfTheDay2)) {
                i4 = 0;
            }
            MaxMinEntry maxMinEntry = new MaxMinEntry(i3, i4, jChangZeroOfTheDay2, 3);
            maxMinEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(maxMinEntry);
            jChangZeroOfTheDay2 += (long) i2;
        }
        return arrayList;
    }

    public static List<MaxMinEntry> c(a52 a52Var, DailyEnergyReport dailyEnergyReport) {
        int[] valueArray;
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyEnergyReport.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate.plusDays(1));
        int i = a52Var.c;
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < i) {
            long j = RepositoryManager.GAP_X_MINUTE + jChangZeroOfTheDay2;
            map.put(Long.valueOf(jChangZeroOfTheDay2), 0);
            i2++;
            jChangZeroOfTheDay2 = j;
        }
        List<TimesDataRecordInt> energyRecords = dailyEnergyReport.getEnergyRecords();
        if (ArrayUtils.isEmpty(energyRecords)) {
            Logger.i("EnergyDataUtil", "createDayLineChartEntries TimesDataRecordInt:" + ((Object) null));
        } else {
            Logger.i("EnergyDataUtil", "createDayLineChartEntries TimesDataRecordInt:" + Arrays.toString(energyRecords.toArray()));
            for (TimesDataRecordInt timesDataRecordInt : energyRecords) {
                if (map.containsKey(Long.valueOf(timesDataRecordInt.getTime())) && (valueArray = timesDataRecordInt.getValueArray()) != null && valueArray.length > 0) {
                    map.put(Long.valueOf(timesDataRecordInt.getTime()), Integer.valueOf(valueArray[0]));
                }
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = jChangZeroOfTheDay - RepositoryManager.GAP_X_MINUTE;
            Integer num = (Integer) map.get(Long.valueOf(j2));
            if (num != null) {
                MaxMinEntry maxMinEntry = new MaxMinEntry(i3, num.intValue(), j2, f(a52Var, i3, j2));
                maxMinEntry.localDate = localDateTimestampToLocalDate;
                arrayList.add(maxMinEntry);
                jChangZeroOfTheDay = j2;
            }
        }
        return arrayList;
    }

    public static List<qpo> d(Context context, DailyEnergyReport dailyEnergyReport) {
        LinkedList linkedList = new LinkedList();
        if (dailyEnergyReport == null) {
            return linkedList;
        }
        int durationActivityEnergy = dailyEnergyReport.getDurationActivityEnergy();
        int durationRecoveryEnergy = dailyEnergyReport.getDurationRecoveryEnergy();
        int durationStressEnergy = dailyEnergyReport.getDurationStressEnergy();
        if (durationActivityEnergy > 0) {
            linkedList.add(new qpo(context.getString(c0j.c8), true, TimeUnit.MINUTES.toMillis(durationActivityEnergy)));
        }
        if (durationRecoveryEnergy > 0) {
            linkedList.add(new qpo(context.getString(c0j.e8), true, TimeUnit.MINUTES.toMillis(durationRecoveryEnergy)));
        }
        if (durationStressEnergy > 0) {
            linkedList.add(new qpo(context.getString(c0j.d8), true, TimeUnit.MINUTES.toMillis(durationStressEnergy)));
        }
        return linkedList;
    }

    public static List<MaxMinEntry> e(r02 r02Var, DailyEnergyReport dailyEnergyReport, boolean z) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        int minValueInArray;
        int i;
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyEnergyReport.getTime());
        if (z) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        HashMap map = new HashMap();
        for (TimesDataRecordInt timesDataRecordInt : dailyEnergyReport.getEnergyRecords()) {
            map.put(Long.valueOf(timesDataRecordInt.getTime()), ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()));
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1); !localDateMinusDays.isBefore(firstDayOfMonth); localDateMinusDays = localDateMinusDays.minusDays(1)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            List list = (List) map.get(Long.valueOf(jChangZeroOfTheDay));
            if (list == null || list.isEmpty()) {
                minValueInArray = 0;
                i = 0;
            } else {
                int maxValueInArray = ArrayUtils.getMaxValueInArray(list);
                minValueInArray = ArrayUtils.getMinValueInArray(list);
                i = maxValueInArray;
            }
            MaxMinEntry maxMinEntry = new MaxMinEntry(i2, Math.max(i, minValueInArray), jChangZeroOfTheDay, z ? RecyclerBarEntry.getWeekBarEntryType(localDateMinusDays) : RecyclerBarEntry.getMonthBarEntryType2(r02Var, localDateMinusDays));
            maxMinEntry.localDate = localDateMinusDays;
            maxMinEntry.maxY = i;
            maxMinEntry.minY = minValueInArray;
            arrayList.add(maxMinEntry);
            i2++;
        }
        return arrayList;
    }

    public static int f(a52 a52Var, int i, long j) {
        if (i == 0) {
            return 5;
        }
        return (a52Var != null && vqr.a(TimeDateUtil.getHourOfTheDay(j), a52Var)) ? 2 : 3;
    }

    public static <T extends RecyclerBarEntry> int g(List<T> list) {
        Collections.sort(list);
        for (int size = list.size() - 1; size >= 0; size--) {
            T t = list.get(size);
            if (t.getY() > 0.0f) {
                return Math.round(t.getY());
            }
        }
        return 0;
    }
}
