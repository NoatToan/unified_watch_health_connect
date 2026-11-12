package defpackage;

import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.operation.share.HiHealthError;
import com.huawei.pluginachievement.report.bean.AnnualReportFitnessRaw;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class oxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f44951a = {10, 200, 400};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f44952b = {137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, HiHealthError.ERR_WRONG_DEVICE, 152, 153, 154, 155, 156, 157, 158, 159, 160, MachineControlPointResponse.OP_CODE_EXTENSION_SET_TOTAL_ENERGY, OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE, OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT};
    private static final int[] d = {128, 129, 130, 260, 261, 270, OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER, OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE, 283, 286, 287};
    private static final String[] e = {"R001", "R002", "N037", "N036"};

    public static Map<Integer, Double> e(Map<Integer, Double> map) {
        if (map == null || map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            if (a(entry.getKey().intValue(), f44952b)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    public static Map<String, Double> c(List<HiHealthData> list, List<AnnualReportFitnessRaw> list2, Map<String, String> map, Map<Integer, Double> map2) {
        return c(c(list, map2), map, list2);
    }

    private static Map<String, Double> c(List<HiHealthData> list, Map<Integer, Double> map) {
        Iterator<HiHealthData> it;
        double d2;
        LogUtil.a("FitnessSportCalRule", "computeAllSportSum() sportRecords size =", Integer.valueOf(list.size()));
        HashMap map2 = new HashMap(2);
        Iterator<HiHealthData> it2 = list.iterator();
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        while (it2.hasNext()) {
            HiHealthData next = it2.next();
            if (next == null) {
                LogUtil.j("FitnessSportCalRule", "calculateAllSportSum() hiHealthData is null");
                it = it2;
                d2 = d5;
            } else {
                Integer num = (Integer) next.get("hihealth_type");
                int iIntValue = num.intValue();
                it = it2;
                d2 = d5;
                if (!a(iIntValue, f44952b)) {
                    if (!a(iIntValue, d)) {
                        LogUtil.j("FitnessSportCalRule", "computeAllSportSum Sport 85, type ", num);
                    } else {
                        if (iIntValue == 286) {
                            map2.put("golf_count_sum", Double.valueOf(next.getDouble("count_sum")));
                            map2.put("golf_swing_sum", Double.valueOf(next.getDouble("golf_swing_sum")));
                            map2.put("golf_duration_sum", Double.valueOf(next.getDouble("duration_sum")));
                        }
                        d(iIntValue, ((Double) next.get("count_sum")).doubleValue() - ((Double) next.get("ab_count_sum")).doubleValue(), map);
                    }
                } else {
                    LogUtil.a("FitnessSportCalRule", "computeAllSportSum Sport 26, type ", num);
                    double dDoubleValue = ((Double) next.get("duration_sum")).doubleValue();
                    double dDoubleValue2 = ((Double) next.get("count_sum")).doubleValue();
                    d4 += dDoubleValue2;
                    d(iIntValue, dDoubleValue2, map);
                    if (dDoubleValue > d6) {
                        d5 = iIntValue;
                        d6 = dDoubleValue;
                    } else {
                        d5 = d2;
                    }
                    d3 += dDoubleValue;
                    it2 = it;
                }
            }
            it2 = it;
            d5 = d2;
        }
        map2.put("total_duration", Double.valueOf(d3));
        map2.put("exclude_run_course_total_duration", Double.valueOf(d3));
        map2.put("total_count", Double.valueOf(d4));
        map2.put("favorite_sport_type", Double.valueOf(d5));
        map2.put("favorite_sport_total_duration", Double.valueOf((int) Math.round(d6 / 60000.0d)));
        return map2;
    }

    private static void d(int i, double d2, Map<Integer, Double> map) {
        if (i == 286) {
            i = HeartRateThresholdConfig.HEART_RATE_LIMIT;
        }
        Double d3 = map.get(Integer.valueOf(i));
        if (d3 != null) {
            d2 += d3.doubleValue();
        }
        map.put(Integer.valueOf(i), Double.valueOf(d2));
    }

    private static Map<String, Double> c(Map<String, Double> map, Map<String, String> map2, List<AnnualReportFitnessRaw> list) {
        LogUtil.a("FitnessSportCalRule", "computeFitnessSum() fitnessRecords size =", Integer.valueOf(list.size()));
        String str = "total_count";
        Double d2 = map.get("total_count");
        double dDoubleValue = d2.doubleValue();
        LogUtil.a("FitnessSportCalRule", "calculateFitnessSum oldSumCount ", d2);
        double dDoubleValue2 = map.get("total_duration").doubleValue();
        double dDoubleValue3 = map.get("exclude_run_course_total_duration").doubleValue();
        HashSet hashSet = new HashSet(16);
        ArrayList arrayList = new ArrayList(16);
        for (AnnualReportFitnessRaw annualReportFitnessRaw : list) {
            if (annualReportFitnessRaw == null) {
                LogUtil.j("FitnessSportCalRule", "calculateFitnessSum() annualReportFitnessRaw is null");
            } else {
                String str2 = str;
                double dAcquireDuring = annualReportFitnessRaw.acquireDuring();
                dDoubleValue2 += dAcquireDuring;
                hashSet.add(Long.valueOf(HiDateUtil.p(annualReportFitnessRaw.acquireExerciseTime())));
                d(arrayList, annualReportFitnessRaw);
                if (!paw.c(e, annualReportFitnessRaw.acquireWorkoutId())) {
                    dDoubleValue3 += dAcquireDuring;
                }
                dDoubleValue += 1.0d;
                str = str2;
            }
        }
        double dRound = (int) Math.round(dDoubleValue2 / 60000.0d);
        double dRound2 = (int) Math.round(dDoubleValue3 / 60000.0d);
        LogUtil.j("FitnessSportCalRule", "calculateFitnessSum totalDuration ", Double.valueOf(dRound), "exRunCourseTotalDuration ", Double.valueOf(dRound2));
        map.put("total_duration", Double.valueOf(dRound));
        map.put("exclude_run_course_total_duration", Double.valueOf(dRound2));
        map.put(str, Double.valueOf(dDoubleValue));
        map.put("total_Course_Day", Double.valueOf(hashSet.size()));
        map2.put("favorite_Course_Name", a(arrayList));
        return map;
    }

    private static String a(List<e> list) {
        if (njy.e(list)) {
            LogUtil.j("FitnessSportCalRule", "getFavoriteCourseName courseList == null.");
            return "";
        }
        Collections.sort(list);
        String strD = list.get(0).d();
        LogUtil.a("FitnessSportCalRule", "getFavoriteCourse name ", strD, " courseList ", list.toString());
        return strD;
    }

    private static void d(List<e> list, AnnualReportFitnessRaw annualReportFitnessRaw) {
        e eVar;
        if (list == null) {
            LogUtil.j("FitnessSportCalRule", "getFavoriteCourse courseList == null.");
            return;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                eVar = null;
                break;
            } else {
                if (list.get(i).f44953a.equals(annualReportFitnessRaw.acquireWorkoutName())) {
                    eVar = list.get(i);
                    break;
                }
                i++;
            }
        }
        if (eVar == null) {
            list.add(new e(annualReportFitnessRaw.acquireWorkoutName(), 1, annualReportFitnessRaw.acquireDuring(), annualReportFitnessRaw.acquireExerciseTime()));
            return;
        }
        eVar.c(eVar.e() + 1);
        eVar.a(eVar.c() + annualReportFitnessRaw.acquireDuring());
        eVar.c(Math.max(annualReportFitnessRaw.acquireExerciseTime(), eVar.a()));
    }

    public static Map<String, Long> d(List<HiHealthData> list, List<AnnualReportFitnessRaw> list2, Set<Long> set) {
        ArrayList arrayList = new ArrayList(2);
        if (njy.b(list)) {
            arrayList.addAll(list);
        }
        return c(c(c(arrayList, set), list2, set));
    }

    private static Map<Long, Long> c(List<HiHealthData> list, Set<Long> set) {
        LogUtil.a("FitnessSportCalRule", "computeAllSportSum() sportRecords size =", Integer.valueOf(list.size()));
        HashMap map = new HashMap(2);
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.j("FitnessSportCalRule", "calculateLongestDurationDay() hiHealthData is null");
            } else {
                Object obj = hiHealthData.get("duration_sum");
                if (!(obj instanceof Double)) {
                    LogUtil.j("FitnessSportCalRule", "durationSumObj type invalid");
                } else {
                    Integer num = (Integer) hiHealthData.get("hihealth_type");
                    if (!a(num.intValue(), f44952b)) {
                        LogUtil.j("FitnessSportCalRule", "computeAllSportSum Sport 85, type ", num);
                    } else {
                        long jLongValue = ((Double) obj).longValue() / 1000;
                        long startTime = hiHealthData.getStartTime();
                        set.add(Long.valueOf(HiDateUtil.p(startTime)));
                        if (!map.containsKey(Long.valueOf(startTime))) {
                            map.put(Long.valueOf(startTime), Long.valueOf(jLongValue));
                        } else {
                            if (map.get(Long.valueOf(startTime)) != null) {
                                jLongValue += ((Long) map.get(Long.valueOf(startTime))).longValue();
                            }
                            map.put(Long.valueOf(startTime), Long.valueOf(jLongValue));
                        }
                    }
                }
            }
        }
        LogUtil.a("FitnessSportCalRule", "calculateFitness sport totalDays == ", e(set));
        return map;
    }

    private static String e(Set<Long> set) {
        if (njy.e(set)) {
            return "";
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(oul.d(BaseApplication.b(), it.next().longValue()));
        }
        return arrayList.toString();
    }

    private static Map<Long, Long> c(Map<Long, Long> map, List<AnnualReportFitnessRaw> list, Set<Long> set) {
        LogUtil.a("FitnessSportCalRule", "calculateFitnessEverydaySum() fitnessCourseDatas size =", Integer.valueOf(list.size()));
        for (AnnualReportFitnessRaw annualReportFitnessRaw : list) {
            if (annualReportFitnessRaw == null) {
                LogUtil.j("FitnessSportCalRule", "calculateFitnessEverydaySum() fitnessRaw is null");
            } else {
                set.add(Long.valueOf(HiDateUtil.p(annualReportFitnessRaw.acquireExerciseTime())));
                if (!paw.c(e, annualReportFitnessRaw.acquireWorkoutId())) {
                    long jAcquireDuring = annualReportFitnessRaw.acquireDuring() / 1000;
                    long jB = ltb.b(ltb.e(new Date(annualReportFitnessRaw.acquireExerciseTime()), "yyyy-MM-dd") + " 00:00:00");
                    if (!map.containsKey(Long.valueOf(jB))) {
                        map.put(Long.valueOf(jB), Long.valueOf(jAcquireDuring));
                    } else {
                        if (map.get(Long.valueOf(jB)) != null) {
                            jAcquireDuring += map.get(Long.valueOf(jB)).longValue();
                        }
                        map.put(Long.valueOf(jB), Long.valueOf(jAcquireDuring));
                    }
                }
            }
        }
        LogUtil.a("FitnessSportCalRule", "calculateFitness course totalDays == ", e(set));
        return map;
    }

    private static Map<String, Long> c(Map<Long, Long> map) {
        HashMap map2 = new HashMap(2);
        if (map == null || map.size() == 0) {
            LogUtil.j("FitnessSportCalRule", "getLongestDayTimestamp map is empty");
            return map2;
        }
        long jLongValue = 0;
        long j = 0;
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            long jLongValue2 = entry.getValue().longValue();
            if (jLongValue2 > j) {
                jLongValue = entry.getKey().longValue();
                j = jLongValue2;
            }
        }
        map2.put("longest_day_timestamp", Long.valueOf(jLongValue));
        map2.put("longest_day_duration", Long.valueOf(Math.round(j / 60.0d)));
        return map2;
    }

    public static Map<String, Long> d(List<HiHealthData> list) {
        HashMap map = new HashMap(2);
        if (njy.e(list)) {
            LogUtil.j("FitnessSportCalRule", "computeSwimTrackInfo() dataInfos is null");
            return map;
        }
        HashSet hashSet = new HashSet(16);
        Iterator<HiHealthData> it = list.iterator();
        long j = 0;
        long j2 = 0;
        long totalTime = 0;
        long j3 = 0;
        HiTrackMetaData hiTrackMetaData = null;
        long j4 = 0;
        while (it.hasNext()) {
            HiHealthData next = it.next();
            it = it;
            HiTrackMetaData hiTrackMetaData2 = hiTrackMetaData;
            try {
                hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(next.getMetaData(), HiTrackMetaData.class);
            } catch (JsonSyntaxException unused) {
                LogUtil.e("FitnessSportCalRule", "trackMetaData is error");
                hiTrackMetaData = hiTrackMetaData2;
            }
            if (hiTrackMetaData == null) {
                j = j;
            } else {
                int totalDistance = hiTrackMetaData.getTotalDistance();
                if (!oxe.e(hiTrackMetaData)) {
                    j2 += (long) totalDistance;
                    totalTime += hiTrackMetaData.getTotalTime();
                    j3++;
                    hashSet.add(Long.valueOf(oxi.a(next)));
                }
                if (!oxe.d(hiTrackMetaData)) {
                    long startTime = next.getStartTime();
                    long j5 = totalDistance;
                    if (j5 >= j4) {
                        j4 = j5;
                        j = startTime;
                    } else {
                        j = j;
                    }
                }
            }
            j = j;
        }
        int iC = owj.c(new ArrayList(hashSet));
        LogUtil.a("FitnessSportCalRule", "computeSwimTrackInfo reachDays == ", Integer.valueOf(iC));
        map.put("swim_max_distance_day", Long.valueOf(j));
        map.put("swim_longest_day_distance", Long.valueOf(j4));
        map.put("swim_sum_distance", Long.valueOf(j2));
        map.put("swim_sum_time", Long.valueOf(d(totalTime)));
        map.put("swim_sum_count", Long.valueOf(j3));
        map.put("max_swim_continuous_days", Long.valueOf(iC));
        return map;
    }

    private static long d(long j) {
        return Math.round(j / 60000.0d);
    }

    public static int e(int i) {
        return oxi.b(i, f44951a);
    }

    public static boolean a(int i, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final class e implements Comparable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f44953a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f44954c;
        private int d;
        private long e;

        public e() {
        }

        public e(String str, int i, int i2, long j) {
            this.f44953a = str;
            this.d = i;
            this.f44954c = i2;
            this.e = j;
        }

        public String d() {
            return this.f44953a;
        }

        public int e() {
            return this.d;
        }

        public void c(int i) {
            this.d = i;
        }

        public int c() {
            return this.f44954c;
        }

        public void a(int i) {
            this.f44954c = i;
        }

        public long a() {
            return this.e;
        }

        public void c(long j) {
            this.e = j;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                String str = this.f44953a;
                if (str != null && str.equals(eVar.d()) && eVar.e() == this.d && eVar.c() == this.f44954c) {
                    return true;
                }
            }
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            if (eVar == null) {
                return 0;
            }
            int i = this.d;
            int i2 = eVar.d;
            if (i != i2) {
                return i2 - i;
            }
            int i3 = this.f44954c;
            int i4 = eVar.f44954c;
            return i3 != i4 ? i4 - i3 : oxi.c(eVar.e - this.e);
        }

        public String toString() {
            return "Fav{name=" + this.f44953a + ", count=" + this.d + ", duration=" + this.f44954c + ", time=" + this.e + '}';
        }
    }
}
