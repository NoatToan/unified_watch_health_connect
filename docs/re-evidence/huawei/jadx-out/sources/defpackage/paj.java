package defpackage;

import com.github.mikephil.charting.data.BarEntry;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.RecentMonthRecordFromDB;
import com.huawei.pluginachievement.manager.model.RecentWeekRecordFromDB;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class paj {
    public static List<BarEntry> d(List<BarEntry> list, RecentWeekRecordFromDB recentWeekRecordFromDB, boolean z) {
        if (list == null || recentWeekRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_ReportFragmentSupport", "getBarStepList: context/recentWeekRecordFromDB is null");
            return Collections.EMPTY_LIST;
        }
        long jAcquireMonday = recentWeekRecordFromDB.acquireMonday();
        int i = 0;
        while (i < 7) {
            list.add(c(recentWeekRecordFromDB.acquireSevenDaySteps(), i == 0 ? jAcquireMonday : lsl.d(jAcquireMonday, i), i));
            i++;
        }
        if (z) {
            c(list);
        }
        return list;
    }

    public static List<BarEntry> a(List<BarEntry> list, RecentMonthRecordFromDB recentMonthRecordFromDB, boolean z) {
        if (list == null || recentMonthRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_ReportFragmentSupport", "getMonthBarStepList: stepList/recentMonthRecordFromDB is null");
            return Collections.EMPTY_LIST;
        }
        long jAcquireFirstday = recentMonthRecordFromDB.acquireFirstday();
        int iK = lsl.k(jAcquireFirstday);
        int i = 0;
        while (i < iK) {
            list.add(c(recentMonthRecordFromDB.acquireOneMonthSteps(), i == 0 ? jAcquireFirstday : lsl.d(jAcquireFirstday, i), i));
            i++;
        }
        if (z) {
            c(list);
        }
        return list;
    }

    private static BarEntry c(Map<Long, Integer> map, long j, int i) {
        if (map.containsKey(Long.valueOf(j))) {
            Integer num = map.get(Long.valueOf(j));
            return new BarEntry(i, num != null ? num.intValue() : 0.0f);
        }
        Long lB = b(map, j);
        if (lB.longValue() == 0) {
            return new BarEntry(i, 0.0f);
        }
        Integer num2 = map.get(lB);
        return new BarEntry(i, num2 != null ? num2.intValue() : 0.0f);
    }

    private static Long b(Map<Long, Integer> map, long j) {
        Iterator<Map.Entry<Long, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Long key = it.next().getKey();
            if (HiDateUtil.d(key.longValue()) == HiDateUtil.d(j)) {
                return key;
            }
        }
        return 0L;
    }

    private static void c(List<BarEntry> list) {
        if (list == null) {
            return;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new BarEntry(i, list.get((list.size() - i) - 1).getY()));
        }
        list.clear();
        list.addAll(arrayList);
    }

    public static List<BarEntry> c(List<BarEntry> list, RecentMonthRecordFromDB recentMonthRecordFromDB, boolean z) {
        if (list == null || recentMonthRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_ReportFragmentSupport", "getBarCaloriesList: context/recentWeekRecordFromDB is null");
            return Collections.EMPTY_LIST;
        }
        Map<Long, Float> mapAcquireWeekCalorie = recentMonthRecordFromDB.acquireWeekCalorie();
        if (mapAcquireWeekCalorie == null || mapAcquireWeekCalorie.size() <= 0) {
            LogUtil.j("PLGACHIEVE_ReportFragmentSupport", "setWeeklyCaloriesBarChart weekCaloriesMap is null.");
            return Collections.EMPTY_LIST;
        }
        Map<Long, Number> mapD = pal.d();
        mapD.putAll(mapAcquireWeekCalorie);
        Iterator<Map.Entry<Long, Number>> it = mapD.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            list.add(new BarEntry(i, it.next().getValue().floatValue() / 1000.0f));
            i++;
        }
        if (z) {
            c(list);
        }
        return list;
    }

    public static List<BarEntry> e(List<BarEntry> list, RecentWeekRecordFromDB recentWeekRecordFromDB, boolean z) {
        if (list == null || recentWeekRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_ReportFragmentSupport", "getBarExerciseTimeList: context/recentWeekRecordFromDB is null");
            return Collections.EMPTY_LIST;
        }
        Map<Long, Long> mapAcquireSevenDayTime = recentWeekRecordFromDB.acquireSevenDayTime();
        if (mapAcquireSevenDayTime == null || mapAcquireSevenDayTime.size() <= 0) {
            LogUtil.j("PLGACHIEVE_ReportFragmentSupport", "getBarExerciseTimeList weekExerciseTimeMap is null.");
            return Collections.EMPTY_LIST;
        }
        Map<Long, Number> mapD = pal.d();
        mapD.putAll(mapAcquireSevenDayTime);
        Iterator<Map.Entry<Long, Number>> it = mapD.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            list.add(new BarEntry(i, (float) Math.ceil(it.next().getValue().longValue() / 60.0f)));
            i++;
        }
        if (z) {
            c(list);
        }
        return list;
    }
}
