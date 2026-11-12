package defpackage;

import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.report.constant.EnumAnnual;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class oxg {
    public static int c(int i, int i2) {
        int i3 = i < 10 ? 100 - (i * 2) : 90 - i;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i == 0 && i2 == 0) {
            return 0;
        }
        return i3;
    }

    public static int b(SleepTotalData sleepTotalData, List<Integer> list, int i) {
        if (sleepTotalData == null || list == null) {
            return -1;
        }
        return a(sleepTotalData, list, i);
    }

    private static int a(SleepTotalData sleepTotalData, List<Integer> list, int i) {
        ArrayList arrayList = new ArrayList(13);
        double d = ((double) i) * 1.0d;
        if (((double) sleepTotalData.getScore()) / d < 70.0d) {
            arrayList.add(Integer.valueOf(EnumAnnual.HORSE.getValue()));
        }
        if (((double) sleepTotalData.getScore()) / d > 85.0d) {
            arrayList.add(Integer.valueOf(EnumAnnual.LION.getValue()));
        }
        if (((double) sleepTotalData.getFallTime()) / d > 1500.0d) {
            arrayList.add(Integer.valueOf(EnumAnnual.OWL.getValue()));
        }
        double d2 = d(list);
        if (a(sleepTotalData, d, d2)) {
            arrayList.add(Integer.valueOf(EnumAnnual.CHICKEN.getValue()));
        }
        if (((double) sleepTotalData.getWakeUpTime()) / d < 360.0d) {
            arrayList.add(Integer.valueOf(EnumAnnual.LARK.getValue()));
        }
        double deepSleepTime = ((sleepTotalData.getDeepSleepTime() + sleepTotalData.getSlumberSleepTime()) + sleepTotalData.getShallowSleepTime()) / i;
        double d3 = deepSleepTime / 60.0d;
        if (d3 < 6.0d) {
            arrayList.add(Integer.valueOf(EnumAnnual.HORSE.getValue()));
        }
        if (d3 > 9.0d) {
            arrayList.add(Integer.valueOf(EnumAnnual.KOALA.getValue()));
        }
        if (((double) sleepTotalData.getWakeupTimes()) / d > 2.0d) {
            arrayList.add(Integer.valueOf(EnumAnnual.DOG.getValue()));
        }
        if ((((double) sleepTotalData.getDeepSleepTime()) / d) / deepSleepTime < 0.2d) {
            arrayList.add(Integer.valueOf(EnumAnnual.DOLPHIN.getValue()));
        }
        if ((((double) sleepTotalData.getSlumberSleepTime()) / d) / deepSleepTime < 0.1d) {
            arrayList.add(Integer.valueOf(EnumAnnual.RABBIT.getValue()));
        }
        if ((((double) sleepTotalData.getSlumberSleepTime()) / d) / deepSleepTime > 0.3d) {
            arrayList.add(Integer.valueOf(EnumAnnual.CAT.getValue()));
        }
        if (d2 < 60.0d) {
            arrayList.add(Integer.valueOf(EnumAnnual.ZEBRAFISH.getValue()));
        }
        if (arrayList.size() == 0) {
            arrayList.add(Integer.valueOf(EnumAnnual.LION.getValue()));
        }
        return b(arrayList);
    }

    private static boolean a(SleepTotalData sleepTotalData, double d, double d2) {
        double fallTime = ((double) sleepTotalData.getFallTime()) / d;
        return ((fallTime > 1260.0d ? 1 : (fallTime == 1260.0d ? 0 : -1)) > 0) && ((fallTime > 1380.0d ? 1 : (fallTime == 1380.0d ? 0 : -1)) < 0) && ((d2 > 90.0d ? 1 : (d2 == 90.0d ? 0 : -1)) > 0);
    }

    private static double d(List<Integer> list) {
        int size = list.size();
        Iterator<Integer> it = list.iterator();
        int iIntValue = 0;
        int iIntValue2 = 0;
        while (it.hasNext()) {
            iIntValue2 += it.next().intValue();
        }
        double d = size;
        double d2 = (((double) iIntValue2) * 1.0d) / d;
        for (Integer num : list) {
            iIntValue = (int) (((double) iIntValue) + ((((double) num.intValue()) - d2) * (((double) num.intValue()) - d2)));
        }
        double dSqrt = Math.sqrt((((double) iIntValue) * 1.0d) / d);
        double dCompare = Double.compare(dSqrt, 30.0d);
        double d3 = 100.0d - ((dSqrt * 2.0d) / 3.0d);
        double d4 = dSqrt / 2.0d;
        if (dCompare > 0.0d) {
            d3 = 95.0d - d4;
        }
        if (d3 >= 0.0d) {
            return d3;
        }
        return 0.0d;
    }

    private static int b(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return list.get(list.size() - 1).intValue();
    }

    public static Map<Integer, Integer> c(SleepTotalData sleepTotalData, Map<Integer, Integer> map, Map<Integer, Integer> map2, Map<Integer, Double> map3) {
        if (sleepTotalData != null) {
            long sleepMonitorStartTime = sleepTotalData.getSleepMonitorStartTime();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(sleepMonitorStartTime);
            int i = calendar.get(2);
            int i2 = i == 0 ? 4 : (i + 2) / 3;
            int score = sleepTotalData.getScore();
            if (map.containsKey(Integer.valueOf(i2))) {
                score += map.get(Integer.valueOf(i2)).intValue();
            }
            int iIntValue = map2.containsKey(Integer.valueOf(i2)) ? 1 + map2.get(Integer.valueOf(i2)).intValue() : 1;
            map.put(Integer.valueOf(i2), Integer.valueOf(score));
            map2.put(Integer.valueOf(i2), Integer.valueOf(iIntValue));
            if (iIntValue > 0) {
                map3.put(Integer.valueOf(i2), Double.valueOf(((double) score) / ((double) iIntValue)));
            }
        }
        return map;
    }

    public static int b(Map<Integer, Double> map) {
        int iIntValue = 0;
        if (map != null && map.size() != 0) {
            double d = 0.0d;
            for (Map.Entry<Integer, Double> entry : map.entrySet()) {
                double dDoubleValue = entry.getValue().doubleValue();
                if (paw.b(d, dDoubleValue) < 0) {
                    iIntValue = entry.getKey().intValue();
                    d = dDoubleValue;
                }
            }
            LogUtil.a("PLGACHIEVE_SleepCalRule", "getMaxSeasonScore maxSeasonIndex ", Integer.valueOf(iIntValue), " maxSeasonScore ", Double.valueOf(d));
        }
        return iIntValue;
    }
}
