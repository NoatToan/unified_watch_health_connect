package defpackage;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.chart.entrys.BloodPressureEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.HealthUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public class hz2 {
    public static List<uz6> a(Context context, List<BloodPressureItem> list) {
        int iComputePercentage;
        LinkedList linkedList = new LinkedList();
        int size = list.size();
        TreeMap treeMap = new TreeMap();
        Iterator<BloodPressureItem> it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            int iA = pz2.a(it.next());
            if (iA == 4) {
                i2++;
                treeMap.put(4, Integer.valueOf(i2));
            } else if (iA == 1) {
                i3++;
                treeMap.put(1, Integer.valueOf(i3));
            } else if (iA == 3) {
                i5++;
                treeMap.put(3, Integer.valueOf(i5));
            } else {
                i4++;
                treeMap.put(2, Integer.valueOf(i4));
            }
        }
        int i6 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if (i == treeMap.size() - 1) {
                iComputePercentage = 100 - i6;
            } else {
                iComputePercentage = HealthUtil.computePercentage(((Integer) entry.getValue()).intValue(), size);
                i6 += iComputePercentage;
            }
            int i7 = iComputePercentage;
            i++;
            linkedList.add(new uz6(x44.a(e(iIntValue)), String.format("%s%s", context.getString(f(iIntValue)), context.getString(c0j.common_percent_join_str, Integer.valueOf(i7))), 7, i7, String.valueOf(entry.getValue()), context.getResources().getQuantityString(qxi.f, ((Integer) entry.getValue()).intValue())));
        }
        return linkedList;
    }

    @NotNull
    public static List<RecyclerBarEntry> b(int i) {
        int[] iArr = {0, 0, 0, 0};
        if (i == 1) {
            iArr = new int[]{1, 0, 0, 0};
        } else if (i == 2) {
            iArr = new int[]{0, 1, 0, 0};
        } else if (i == 3) {
            iArr = new int[]{0, 0, 1, 0};
        } else if (i == 4) {
            iArr = new int[]{0, 0, 0, 1};
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(new RecyclerBarEntry(i2, iArr[i2], System.currentTimeMillis(), 3));
        }
        return arrayList;
    }

    public static List<qpo> c(Context context, DailyBloodPressureReport dailyBloodPressureReport) {
        LinkedList linkedList = new LinkedList();
        if (dailyBloodPressureReport == null) {
            return linkedList;
        }
        String string = context.getString(c0j.D2);
        int avgHigh = dailyBloodPressureReport.getAvgHigh();
        int avgLow = dailyBloodPressureReport.getAvgLow();
        int maxHigh = dailyBloodPressureReport.getMaxHigh();
        int maxLow = dailyBloodPressureReport.getMaxLow();
        int minHigh = dailyBloodPressureReport.getMinHigh();
        int minLow = dailyBloodPressureReport.getMinLow();
        String quantityString = context.getResources().getQuantityString(qxi.g, 60);
        int avgPulse = dailyBloodPressureReport.getAvgPulse();
        int maxPulse = dailyBloodPressureReport.getMaxPulse();
        int minPulse = dailyBloodPressureReport.getMinPulse();
        if (avgPulse > 0) {
            linkedList.add(new qpo(context.getString(c0j.k2), String.format(Locale.US, "%1$d/%2$d", Integer.valueOf(avgHigh), Integer.valueOf(avgLow)), string));
            linkedList.add(new qpo(context.getString(c0j.i2), String.valueOf(avgPulse), quantityString));
            linkedList.add(new qpo(context.getString(c0j.I1), String.valueOf(maxHigh), string, pz2.d(context, maxHigh, true)));
            linkedList.add(new qpo(context.getString(c0j.J1), String.valueOf(maxLow), string, pz2.d(context, maxLow, false)));
            linkedList.add(new qpo(context.getString(c0j.a2), String.valueOf(minHigh), string, pz2.d(context, minHigh, true)));
            linkedList.add(new qpo(context.getString(c0j.b2), String.valueOf(minLow), string, pz2.d(context, minLow, false)));
            linkedList.add(new qpo(context.getString(c0j.K1), String.valueOf(maxPulse), quantityString));
            linkedList.add(new qpo(context.getString(c0j.c2), String.valueOf(minPulse), quantityString));
        } else {
            linkedList.add(new qpo(context.getString(c0j.z1), String.valueOf(avgHigh), string, pz2.d(context, avgHigh, true)));
            linkedList.add(new qpo(context.getString(c0j.A1), String.valueOf(avgLow), string, pz2.d(context, avgLow, false)));
            linkedList.add(new qpo(context.getString(c0j.I1), String.valueOf(maxHigh), string, pz2.d(context, maxHigh, true)));
            linkedList.add(new qpo(context.getString(c0j.J1), String.valueOf(maxLow), string, pz2.d(context, maxLow, false)));
            linkedList.add(new qpo(context.getString(c0j.a2), String.valueOf(minHigh), string, pz2.d(context, minHigh, true)));
            linkedList.add(new qpo(context.getString(c0j.b2), String.valueOf(minLow), string, pz2.d(context, minLow, false)));
        }
        return linkedList;
    }

    public static List<BloodPressureEntry> d(int i, DailyBloodPressureReport dailyBloodPressureReport) {
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyBloodPressureReport.getTime());
        int i2 = 1;
        TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate.plusDays(1));
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i3 = 0;
        while (i3 < i) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ArrayList());
            arrayList2.add(new ArrayList());
            map.put(Long.valueOf(jChangZeroOfTheDay), arrayList2);
            i3++;
            jChangZeroOfTheDay = ((long) 3600) + jChangZeroOfTheDay;
        }
        List<TimesDataRecordInt> highPressureRecords = dailyBloodPressureReport.getHighPressureRecords();
        List<TimesDataRecordInt> lowPressureRecords = dailyBloodPressureReport.getLowPressureRecords();
        for (TimesDataRecordInt timesDataRecordInt : highPressureRecords) {
            List list = (List) map.get(Long.valueOf(timesDataRecordInt.getTime()));
            if (!ArrayUtils.isEmpty(list)) {
                ((List) list.get(0)).addAll(ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()));
            }
        }
        for (TimesDataRecordInt timesDataRecordInt2 : lowPressureRecords) {
            List list2 = (List) map.get(Long.valueOf(timesDataRecordInt2.getTime()));
            if (!ArrayUtils.isEmpty(list2)) {
                ((List) list2.get(1)).addAll(ArrayUtils.toIntegerList(timesDataRecordInt2.getValueArray()));
            }
        }
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        int iA = x44.a(iji.f);
        int iA2 = x44.a(iji.d);
        int i4 = 0;
        while (i4 < i) {
            List list3 = (List) map.get(Long.valueOf(jChangZeroOfTheDay2));
            List<hrl> listH = h(list3, iA2, iA, 5);
            List list4 = (List) list3.get(0);
            List list5 = (List) list3.get(i2);
            BloodPressureEntry bloodPressureEntry = new BloodPressureEntry(listH, 5);
            bloodPressureEntry.timestamp = jChangZeroOfTheDay2;
            bloodPressureEntry.localDate = localDateTimestampToLocalDate;
            bloodPressureEntry.type = 3;
            bloodPressureEntry.f11746a = ArrayUtils.getMaxValueInArray(list4);
            bloodPressureEntry.f11747b = ArrayUtils.getMinValueInArray(list4);
            bloodPressureEntry.c = ArrayUtils.getMaxValueInArray(list5);
            bloodPressureEntry.d = ArrayUtils.getMinValueInArray(list5);
            bloodPressureEntry.setY((list4.isEmpty() && list5.isEmpty()) ? 0.0f : Math.max(bloodPressureEntry.f11746a, bloodPressureEntry.c));
            bloodPressureEntry.setX(i4);
            arrayList.add(bloodPressureEntry);
            jChangZeroOfTheDay2 += (long) 3600;
            i4++;
            i2 = 1;
        }
        return arrayList;
    }

    public static int e(int i) {
        if (i == 1) {
            return iji.h;
        }
        if (i != 3) {
            return i != 4 ? iji.i : iji.g;
        }
        return iji.j;
    }

    public static int f(int i) {
        if (i == 1) {
            return c0j.y2;
        }
        if (i != 3) {
            return i != 4 ? c0j.z2 : c0j.x2;
        }
        return c0j.A2;
    }

    public static List<BloodPressureEntry> g(r02 r02Var, DailyBloodPressureReport dailyBloodPressureReport) {
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyBloodPressureReport.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate.plusDays(1));
        int i = r02Var.c;
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        int i2 = (int) (86400 / ((long) i));
        HashMap map = new HashMap();
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ArrayList());
            arrayList2.add(new ArrayList());
            map.put(Long.valueOf(jChangZeroOfTheDay2), arrayList2);
            i4++;
            jChangZeroOfTheDay2 = ((long) i2) + jChangZeroOfTheDay2;
        }
        List<TimesDataRecordInt> highPressureRecords = dailyBloodPressureReport.getHighPressureRecords();
        List<TimesDataRecordInt> lowPressureRecords = dailyBloodPressureReport.getLowPressureRecords();
        for (TimesDataRecordInt timesDataRecordInt : highPressureRecords) {
            List list = (List) map.get(Long.valueOf(timesDataRecordInt.getTime()));
            if (!ArrayUtils.isEmpty(list)) {
                int[] valueArray = timesDataRecordInt.getValueArray();
                List list2 = (List) list.get(0);
                if (list2 != null) {
                    list2.addAll(ArrayUtils.toIntegerList(valueArray));
                }
            }
        }
        for (TimesDataRecordInt timesDataRecordInt2 : lowPressureRecords) {
            List list3 = (List) map.get(Long.valueOf(timesDataRecordInt2.getTime()));
            if (!ArrayUtils.isEmpty(list3)) {
                int[] valueArray2 = timesDataRecordInt2.getValueArray();
                List list4 = (List) list3.get(1);
                if (list4 != null) {
                    list4.addAll(ArrayUtils.toIntegerList(valueArray2));
                }
            }
        }
        HashMap map2 = new HashMap();
        List<TimesDataRecordInt> pulseRecords = dailyBloodPressureReport.getPulseRecords();
        if (pulseRecords != null) {
            for (TimesDataRecordInt timesDataRecordInt3 : pulseRecords) {
                map2.put(Long.valueOf(timesDataRecordInt3.getTime()), timesDataRecordInt3.getValueArray());
            }
        }
        int i5 = 0;
        while (i5 < i) {
            long j = jChangZeroOfTheDay - ((long) i2);
            List list5 = (List) map.get(Long.valueOf(j));
            if (list5 != null && list5.size() >= 2) {
                List<hrl> listH = h(list5, r02Var.T0, r02Var.S0, 5);
                List listEmptyList = list5.get(i3) == null ? Collections.emptyList() : (List) list5.get(i3);
                List listEmptyList2 = list5.get(1) == null ? Collections.emptyList() : (List) list5.get(1);
                BloodPressureEntry bloodPressureEntry = new BloodPressureEntry(listH, 5);
                int dayBarEntryType = RecyclerBarEntry.getDayBarEntryType(r02Var, j, jChangZeroOfTheDay);
                bloodPressureEntry.timestamp = j;
                bloodPressureEntry.localDate = localDateTimestampToLocalDate;
                bloodPressureEntry.type = dayBarEntryType;
                bloodPressureEntry.f11746a = ArrayUtils.getMaxValueInArray(listEmptyList);
                bloodPressureEntry.f11747b = ArrayUtils.getMinValueInArray(listEmptyList);
                bloodPressureEntry.c = ArrayUtils.getMaxValueInArray(listEmptyList2);
                bloodPressureEntry.d = ArrayUtils.getMinValueInArray(listEmptyList2);
                List<Integer> integerList = ArrayUtils.toIntegerList((int[]) map2.get(Long.valueOf(j)));
                bloodPressureEntry.f = ArrayUtils.getMaxValueInArray(integerList);
                bloodPressureEntry.e = ArrayUtils.getMinValueInArray(integerList);
                bloodPressureEntry.setY((listEmptyList.isEmpty() && listEmptyList2.isEmpty()) ? 0.0f : Math.max(bloodPressureEntry.f11746a, bloodPressureEntry.c));
                arrayList.add(bloodPressureEntry);
                jChangZeroOfTheDay = j;
            }
            i5++;
            i = i;
            i3 = 0;
        }
        return arrayList;
    }

    public static List<hrl> h(List<List<Integer>> list, int i, int i2, int i3) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<Integer> list2 = list.get(0);
        List<Integer> list3 = list.get(1);
        ArrayList arrayList = new ArrayList();
        if (!ArrayUtils.isEmpty(list2)) {
            arrayList.addAll(SegmentBarEntry.getRectModels(i3, list2, i, i));
        }
        if (!ArrayUtils.isEmpty(list3)) {
            arrayList.addAll(SegmentBarEntry.getRectModels(i3, list3, i2, i));
        }
        return arrayList;
    }

    public static List<SegmentBarEntry> i(r02 r02Var, DailyBloodPressureReport dailyBloodPressureReport, boolean z) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyBloodPressureReport.getTime());
        if (z) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1);
        int i = z ? 10 : 5;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (LocalDate localDateMinusDays2 = localDateMinusDays; !localDateMinusDays2.isBefore(firstDayOfMonth); localDateMinusDays2 = localDateMinusDays2.minusDays(1)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ArrayList());
            arrayList2.add(new ArrayList());
            map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(localDateMinusDays2)), arrayList2);
        }
        List<TimesDataRecordInt> highPressureRecords = dailyBloodPressureReport.getHighPressureRecords();
        List<TimesDataRecordInt> lowPressureRecords = dailyBloodPressureReport.getLowPressureRecords();
        for (TimesDataRecordInt timesDataRecordInt : highPressureRecords) {
            List list = (List) map.get(Long.valueOf(timesDataRecordInt.getTime()));
            if (!ArrayUtils.isEmpty(list)) {
                Objects.requireNonNull(list);
                if (list.get(0) != null) {
                    ((List) list.get(0)).addAll(ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()));
                }
            }
        }
        for (TimesDataRecordInt timesDataRecordInt2 : lowPressureRecords) {
            List list2 = (List) map.get(Long.valueOf(timesDataRecordInt2.getTime()));
            if (!ArrayUtils.isEmpty(list2)) {
                Objects.requireNonNull(list2);
                if (list2.get(1) != null) {
                    ((List) list2.get(1)).addAll(ArrayUtils.toIntegerList(timesDataRecordInt2.getValueArray()));
                }
            }
        }
        HashMap map2 = new HashMap();
        List<TimesDataRecordInt> pulseRecords = dailyBloodPressureReport.getPulseRecords();
        if (pulseRecords != null) {
            for (TimesDataRecordInt timesDataRecordInt3 : pulseRecords) {
                map2.put(Long.valueOf(timesDataRecordInt3.getTime()), timesDataRecordInt3.getValueArray());
            }
        }
        while (!localDateMinusDays.isBefore(firstDayOfMonth)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            List arrayList3 = (List) map.get(Long.valueOf(jChangZeroOfTheDay));
            if (arrayList3 == null || arrayList3.size() != 2) {
                arrayList3 = new ArrayList();
                arrayList3.add(new ArrayList());
                arrayList3.add(new ArrayList());
            }
            List<hrl> listH = h(arrayList3, r02Var.T0, r02Var.S0, i);
            List list3 = (List) arrayList3.get(0);
            List list4 = (List) arrayList3.get(1);
            BloodPressureEntry bloodPressureEntry = new BloodPressureEntry(listH, i);
            int weekBarEntryType = z ? RecyclerBarEntry.getWeekBarEntryType(localDateMinusDays) : RecyclerBarEntry.getMonthBarEntryType2(r02Var, localDateMinusDays);
            bloodPressureEntry.timestamp = jChangZeroOfTheDay;
            bloodPressureEntry.localDate = localDateMinusDays;
            bloodPressureEntry.type = weekBarEntryType;
            bloodPressureEntry.f11746a = ArrayUtils.getMaxValueInArray(list3);
            bloodPressureEntry.f11747b = ArrayUtils.getMinValueInArray(list3);
            bloodPressureEntry.c = ArrayUtils.getMaxValueInArray(list4);
            bloodPressureEntry.d = ArrayUtils.getMinValueInArray(list4);
            List<Integer> integerList = ArrayUtils.toIntegerList((int[]) map2.get(Long.valueOf(jChangZeroOfTheDay)));
            bloodPressureEntry.f = ArrayUtils.getMaxValueInArray(integerList);
            bloodPressureEntry.e = ArrayUtils.getMinValueInArray(integerList);
            bloodPressureEntry.setY((list3.isEmpty() && list4.isEmpty()) ? 0.0f : Math.max(bloodPressureEntry.f11746a, bloodPressureEntry.c));
            arrayList.add(bloodPressureEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
        }
        return arrayList;
    }
}
