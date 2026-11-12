package defpackage;

import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.report.bean.AnnualReport;
import com.huawei.pluginachievement.report.bean.AnnualReportMarathon;
import com.huawei.pluginachievement.report.bean.AnnualReportRun;
import com.huawei.pluginachievement.report.bean.MarathonGradleDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class oxc {
    private static final int[] d = {3000, 108000, 216000, 504000};

    public static Map<String, Integer> e(List<HiHealthData> list) {
        HashMap map = new HashMap(16);
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_RunCalRule", "getSumTrackData dataInfos is empty");
            return map;
        }
        LogUtil.a("PLGACHIEVE_RunCalRule", "computeSumTrackData size= ", Integer.valueOf(list.size()));
        for (HiHealthData hiHealthData : list) {
            map.put(oxi.b(hiHealthData.getStartTime()), Integer.valueOf((int) hiHealthData.getDouble("Track_Run_Distance_Sum")));
        }
        return map;
    }

    public static String d(Map<String, Integer> map) {
        if (map == null) {
            return "";
        }
        LogUtil.a("PLGACHIEVE_RunCalRule", "getSumTrackData");
        int size = map.size();
        StringBuilder sb = new StringBuilder(size);
        int i = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey() + "_" + (((double) entry.getValue().intValue()) / 1000.0d));
            if (i < size) {
                sb.append(",");
            }
            i++;
        }
        return sb.toString();
    }

    public static AnnualReport b(List<HiHealthData> list, int i, Map<Integer, Integer> map) {
        int i2;
        int i3;
        MarathonGradleDetail marathonGradleDetail = new MarathonGradleDetail(Double.MAX_VALUE, Long.MAX_VALUE, 0, 0);
        MarathonGradleDetail marathonGradleDetail2 = new MarathonGradleDetail(Double.MAX_VALUE, Long.MAX_VALUE, 0, 0);
        ArrayList<Integer> arrayListA = oxe.a();
        LogUtil.a("PLGACHIEVE_RunCalRule", "enter ", Integer.valueOf(arrayListA.size()), " half ", Integer.valueOf(marathonGradleDetail.getTimes()), " full ", Integer.valueOf(marathonGradleDetail2.getTimes()));
        HashSet hashSet = new HashSet(16);
        HashMap map2 = new HashMap(16);
        Iterator<HiHealthData> it = list.iterator();
        float f = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        long j = 0;
        while (it.hasNext()) {
            HiHealthData next = it.next();
            HiTrackMetaData hiTrackMetaDataE = e(next.getMetaData());
            if (hiTrackMetaDataE != null) {
                int totalDistance = hiTrackMetaDataE.getTotalDistance();
                if (oxe.e(hiTrackMetaDataE)) {
                    i2 = i4;
                    i3 = i5;
                } else {
                    hashSet.add(Long.valueOf(oxi.a(next)));
                    c((Map<Long, Integer>) map2, oxi.a(next), totalDistance);
                    i2 = i4 + totalDistance;
                    i3 = i5 + 1;
                }
                if (!oxe.d(hiTrackMetaDataE) && oun.a(hiTrackMetaDataE.getSportType())) {
                    float fC = c(next, f, hiTrackMetaDataE, i);
                    d(marathonGradleDetail, marathonGradleDetail2, hiTrackMetaDataE, next.getStartTime(), i);
                    long startTime = next.getStartTime();
                    if (totalDistance >= i6) {
                        j = startTime;
                        i6 = totalDistance;
                    }
                    int iB = oxe.b(startTime);
                    if (iB < 24) {
                        arrayListA.set(iB, Integer.valueOf(arrayListA.get(iB).intValue() + 1));
                    }
                    f = fC;
                }
                it = it;
                i4 = i2;
                i5 = i3;
            }
        }
        double d2 = f;
        map.put(Integer.valueOf(i), Integer.valueOf(oxi.c(d2)));
        return d(b(d(i6, j, i4, i5, arrayListA), hashSet.size(), b(map2), oxi.c(d2)), marathonGradleDetail, marathonGradleDetail2);
    }

    private static AnnualReportRun b(AnnualReportRun annualReportRun, int i, int i2, int i3) {
        annualReportRun.setRunNumberOfDays(i);
        annualReportRun.setMaxRunContinuousDays(i2);
        annualReportRun.setBestPace(i3);
        LogUtil.a("PLGACHIEVE_RunCalRule", "initRunData bestPace ", Integer.valueOf(i3));
        return annualReportRun;
    }

    private static float c(HiHealthData hiHealthData, float f, HiTrackMetaData hiTrackMetaData, int i) {
        float bestPace;
        float f2 = f;
        if (paw.b(hiTrackMetaData.getBestPace(), 0.0d) != 0) {
            bestPace = hiTrackMetaData.getBestPace();
        } else {
            Iterator it = new ArrayList(hiTrackMetaData.getPaceMap().entrySet()).iterator();
            float f3 = 0.0f;
            while (it.hasNext()) {
                float fFloatValue = ((Float) ((Map.Entry) it.next()).getValue()).floatValue();
                double d2 = f3;
                if (paw.b(d2, 0.0d) == 0 || paw.b(fFloatValue, d2) < 0) {
                    f3 = fFloatValue;
                }
            }
            bestPace = f3;
        }
        int totalDistance = hiTrackMetaData.getTotalDistance();
        double d3 = bestPace;
        if (paw.b(d3, 0.0d) == 0 || totalDistance < 1000) {
            LogUtil.j("PLGACHIEVE_RunCalRule", "computeBestPace year ", Integer.valueOf(i), " currPace ", Float.valueOf(bestPace), " date ", Long.valueOf(hiHealthData.getStartTime()), " totalTrackDis ", Integer.valueOf(totalDistance));
            return f2;
        }
        double d4 = f2;
        if (paw.b(d4, 0.0d) == 0 || paw.b(d3, d4) < 0) {
            f2 = bestPace;
        }
        LogUtil.a("PLGACHIEVE_RunCalRule", "computeBestPace bestPace ", Float.valueOf(f2), " currPace ", Float.valueOf(bestPace), " date ", Long.valueOf(hiHealthData.getStartTime()), " year ", Integer.valueOf(i));
        return f2;
    }

    private static int b(Map<Long, Integer> map) {
        ArrayList arrayList = new ArrayList(16);
        for (Map.Entry entry : new ArrayList(map.entrySet())) {
            Long l = (Long) entry.getKey();
            l.longValue();
            Integer num = (Integer) entry.getValue();
            if (num.intValue() >= 2000) {
                arrayList.add(l);
            }
            LogUtil.a("PLGACHIEVE_RunCalRule", "computeMaxRunContinuousDays date ", l, " distance ", num);
        }
        int iC = owj.c(arrayList);
        LogUtil.a("PLGACHIEVE_RunCalRule", "computeMaxRunContinuousDays reachDays == ", Integer.valueOf(iC));
        return iC;
    }

    private static void c(Map<Long, Integer> map, long j, int i) {
        if (map.containsKey(Long.valueOf(j))) {
            i += map.get(Long.valueOf(j)).intValue();
        }
        map.put(Long.valueOf(j), Integer.valueOf(i));
    }

    private static AnnualReportRun d(int i, long j, int i2, int i3, ArrayList<Integer> arrayList) {
        AnnualReportRun annualReportRun = new AnnualReportRun();
        annualReportRun.saveMaxDistance(i);
        annualReportRun.saveMaxDistanceDay(j);
        annualReportRun.saveTotalDistance(i2);
        annualReportRun.saveNumberOfTimes(i3);
        annualReportRun.saveTimeOfDay(c(arrayList));
        annualReportRun.saveDescription(oxe.a(i3));
        return annualReportRun;
    }

    private static HiTrackMetaData e(String str) {
        try {
            return (HiTrackMetaData) HiJsonUtil.d(str, HiTrackMetaData.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("PLGACHIEVE_RunCalRule", "trackMetaData is error");
            return null;
        }
    }

    private static AnnualReportMarathon b(MarathonGradleDetail marathonGradleDetail, MarathonGradleDetail marathonGradleDetail2) {
        if (marathonGradleDetail.getTimes() > 0 && paw.b(marathonGradleDetail.getBestRecord(), Double.MAX_VALUE) == 0) {
            marathonGradleDetail.setBestRecord(0.0d);
        }
        if (marathonGradleDetail2.getTimes() > 0 && paw.b(marathonGradleDetail2.getBestRecord(), Double.MAX_VALUE) == 0) {
            marathonGradleDetail2.setBestRecord(0.0d);
        }
        AnnualReportMarathon annualReportMarathon = new AnnualReportMarathon();
        annualReportMarathon.setFullMarathon(marathonGradleDetail2);
        annualReportMarathon.setHalfMarathon(marathonGradleDetail);
        return annualReportMarathon;
    }

    private static AnnualReport d(AnnualReportRun annualReportRun, MarathonGradleDetail marathonGradleDetail, MarathonGradleDetail marathonGradleDetail2) {
        AnnualReport annualReport = new AnnualReport();
        annualReport.setReportRun(annualReportRun);
        annualReport.setReportMarathon(b(marathonGradleDetail, marathonGradleDetail2));
        return annualReport;
    }

    private static void d(MarathonGradleDetail marathonGradleDetail, MarathonGradleDetail marathonGradleDetail2, HiTrackMetaData hiTrackMetaData, long j, int i) {
        double dC;
        double dC2;
        double totalDistance = hiTrackMetaData.getTotalDistance();
        Map<Double, Double> partTimeMap = hiTrackMetaData.getPartTimeMap();
        if (partTimeMap == null) {
            LogUtil.j("PLGACHIEVE_RunCalRule", "marathon partMap is null");
            return;
        }
        if (oxi.a(i, j)) {
            if (totalDistance >= 42195.0d) {
                if (partTimeMap.containsKey(Double.valueOf(42.195d))) {
                    LogUtil.a("PLGACHIEVE_RunCalRule", "full marathon");
                    dC2 = partTimeMap.get(Double.valueOf(42.195d)).doubleValue();
                } else {
                    dC2 = c(partTimeMap, 42.0d, 0.19500000000000028d);
                }
                a(marathonGradleDetail2, dC2, j);
                c(marathonGradleDetail2, dC2, j);
                return;
            }
            if (totalDistance < 21097.0d) {
                LogUtil.j("PLGACHIEVE_RunCalRule", "no marathon records");
                return;
            }
            if (partTimeMap.containsKey(Double.valueOf(21.0975d))) {
                LogUtil.a("PLGACHIEVE_RunCalRule", "half marathon");
                dC = partTimeMap.get(Double.valueOf(21.0975d)).doubleValue();
            } else {
                dC = c(partTimeMap, 21.0d, 0.09750000000000014d);
            }
            a(marathonGradleDetail, dC, j);
            c(marathonGradleDetail, dC, j);
        }
    }

    private static void a(MarathonGradleDetail marathonGradleDetail, double d2, long j) {
        if (j < marathonGradleDetail.getFirstTime()) {
            LogUtil.a("PLGACHIEVE_RunCalRule", "marathon() marathonStartTime=", Long.valueOf(j));
            marathonGradleDetail.setFirstRecord(d2);
            marathonGradleDetail.setFirstTime(j);
        }
        marathonGradleDetail.setTimes(marathonGradleDetail.getTimes() + 1);
    }

    private static double c(Map<Double, Double> map, double d2, double d3) {
        if (map == null) {
            return 0.0d;
        }
        double dDoubleValue = map.containsKey(Double.valueOf(d2)) ? map.get(Double.valueOf(d2)).doubleValue() : 0.0d;
        double d4 = d2 + 1.0d;
        double dDoubleValue2 = map.containsKey(Double.valueOf(d4)) ? map.get(Double.valueOf(d4)).doubleValue() : 0.0d;
        return (oxi.b(dDoubleValue, 0.0d) || oxi.b(dDoubleValue2, 0.0d)) ? dDoubleValue + dDoubleValue2 : dDoubleValue + (Math.abs(dDoubleValue2 - dDoubleValue) * d3);
    }

    private static void c(MarathonGradleDetail marathonGradleDetail, double d2, long j) {
        if (paw.b(d2, 0.0d) == 0) {
            LogUtil.j("PLGACHIEVE_RunCalRule", "marathon() marathonBestPace = 0");
        } else if (d2 < marathonGradleDetail.getBestRecord()) {
            LogUtil.a("PLGACHIEVE_RunCalRule", "marathon() marathonBestPace=", Double.valueOf(d2));
            marathonGradleDetail.setBestRecord(d2);
            marathonGradleDetail.setBestTime(j);
        }
    }

    private static int c(ArrayList<Integer> arrayList) {
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = arrayList.get(i3).intValue();
            if (iIntValue > i2) {
                i = i3;
                i2 = iIntValue;
            }
        }
        return i;
    }

    public static int b(int i) {
        return oxi.b(i, d);
    }
}
