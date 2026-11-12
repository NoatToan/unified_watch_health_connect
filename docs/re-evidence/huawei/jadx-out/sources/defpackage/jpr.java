package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jpr {
    public static void c(ArrayList<gzv> arrayList, List<gzv> list) {
        if (njy.e(list)) {
            LogUtil.e("Track_DataPretreatmentUtil", "runningPostureListTemp is null");
            return;
        }
        if (hah.d(list)) {
            arrayList.addAll(list);
            return;
        }
        boolean zE = e(list);
        long jD = -1;
        for (gzv gzvVar : list) {
            if (gzvVar != null) {
                jD = d(arrayList, jD, zE, gzvVar);
            }
        }
    }

    private static long d(ArrayList<gzv> arrayList, long j, boolean z, gzv gzvVar) {
        long jD = d(e(z, gzvVar.h()));
        long j2 = jD - j;
        if (j != -1 && j2 > 5 && j2 < 20) {
            int i = ((int) j2) / 5;
            for (int i2 = 1; i2 <= i; i2++) {
                long j3 = ((long) (i2 * 5)) + j;
                if (j3 >= jD) {
                    break;
                }
                d(j3, arrayList, gzvVar);
            }
        }
        d(jD, arrayList, gzvVar);
        return jD;
    }

    private static boolean e(List<gzv> list) {
        if (list.size() < 3) {
            return list.size() > 0 && list.get(0).h() > 1000;
        }
        long jH = list.get(0).h();
        long jH2 = list.get(1).h();
        return jH2 - jH > 500 && list.get(2).h() - jH2 > 500;
    }

    private static long e(boolean z, long j) {
        return z ? TimeUnit.MILLISECONDS.toSeconds(j) : j;
    }

    private static long d(long j) {
        long j2 = j / 5;
        return j % 5 > 2 ? (j2 + 1) * 5 : j2 * 5;
    }

    private static void d(long j, ArrayList<gzv> arrayList, gzv gzvVar) {
        gzv gzvVar2 = new gzv(j, gzvVar.a(), gzvVar.d(), gzvVar.j(), gzvVar.b(), gzvVar.e(), gzvVar.i(), gzvVar.c());
        gzvVar2.i(gzvVar.l());
        gzvVar2.h(gzvVar.k());
        gzvVar2.d(gzvVar.f());
        gzvVar2.b(gzvVar.n());
        gzvVar2.c(gzvVar.o());
        gzvVar2.a(gzvVar.t());
        gzvVar2.e(gzvVar.q());
        if (arrayList != null) {
            arrayList.add(gzvVar2);
        }
    }

    public static void c(List<StepRateData> list, long j, long j2, List<StepRateData> list2) {
        Iterator<StepRateData> it;
        long j3;
        if (d(list, list2)) {
            int iE = xjm.e(list, j);
            int i = 0;
            long j4 = 0;
            list2.add(new StepRateData(0L, list.get(0).acquireStepRate()));
            Iterator<StepRateData> it2 = list.iterator();
            long j5 = 0;
            while (it2.hasNext()) {
                StepRateData next = it2.next();
                long j6 = iE;
                i++;
                long j7 = ((long) i) * j6;
                if (it2.hasNext()) {
                    list2.add(new StepRateData(j7, next.acquireStepRate()));
                    it = it2;
                    j3 = j4;
                } else {
                    long seconds = ((long) ((int) TimeUnit.MILLISECONDS.toSeconds(j2))) - j5;
                    it = it2;
                    if (seconds < 0) {
                        LogUtil.d("Track_DataPretreatmentUtil", "endIntervalSecs(real) < 0,make use of endInterval = interval");
                        list2.add(new StepRateData(j7, next.acquireStepRate()));
                        j3 = 0;
                    } else {
                        long j8 = seconds - (seconds % 5);
                        j3 = 0;
                        if (j8 == 0) {
                            LogUtil.d("Track_DataPretreatmentUtil", "endIntervalSecs(floor 5)==0,make time=lastGeneratedDataTime+5");
                            j5 += 5;
                            list2.add(new StepRateData(j5, next.acquireStepRate()));
                        } else if (j8 > j6) {
                            LogUtil.d("Track_DataPretreatmentUtil", "endIntervalSecs(floor 5)> interval, time=lastGeneratedDataTime + interval");
                            list2.add(new StepRateData(j7, next.acquireStepRate()));
                        } else {
                            j5 += j8;
                            list2.add(new StepRateData(j5, next.acquireStepRate()));
                        }
                        it2 = it;
                        j4 = j3;
                    }
                }
                it2 = it;
                j5 = j7;
                j4 = j3;
            }
        }
    }

    private static boolean d(List<StepRateData> list, List<StepRateData> list2) {
        if (njy.e(list) || list2 == null) {
            return false;
        }
        if (list.get(0) != null) {
            return true;
        }
        LogUtil.e("Track_DataPretreatmentUtil", "stepRateListTemp.get(0)  null");
        return false;
    }

    public static List<HeartRateData> e(MotionPath motionPath, long j, String str) {
        if (motionPath == null) {
            LogUtil.e("Track_DataPretreatmentUtil", "motionPath is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(16);
        ArrayList<HeartRateData> arrayListRequestHeartRateList = motionPath.requestHeartRateList();
        ArrayList<HeartRateData> arrayListRequestInvalidHeartRateList = motionPath.requestInvalidHeartRateList();
        int iE = xjm.e(arrayListRequestHeartRateList, j);
        if (njy.e(arrayListRequestHeartRateList)) {
            LogUtil.e("Track_DataPretreatmentUtil", "heartRateListTemp is null");
            return null;
        }
        if (b(arrayListRequestHeartRateList, arrayListRequestInvalidHeartRateList)) {
            a(arrayListRequestHeartRateList, str, iE, arrayList);
            return arrayList;
        }
        c(arrayListRequestHeartRateList, arrayListRequestInvalidHeartRateList, arrayList, iE, str);
        return arrayList;
    }

    public static boolean b(List<HeartRateData> list, List<HeartRateData> list2) {
        return !(d(list) && d(list2)) || njy.e(list2);
    }

    public static void a(List<HeartRateData> list, String str, int i, ArrayList<HeartRateData> arrayList) {
        if (njy.e(list)) {
            LogUtil.e("Track_DataPretreatmentUtil", "heartRateListTemp is null");
            return;
        }
        Iterator<HeartRateData> it = list.iterator();
        if ("1".equals(str)) {
            LogUtil.d("Track_DataPretreatmentUtil", "initHeartRateData no invalid list has trust heartRate");
            e(i, arrayList, it);
        } else if (str == null) {
            c(i, arrayList, list);
        }
    }

    private static void c(int i, ArrayList<HeartRateData> arrayList, List<HeartRateData> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            HeartRateData heartRateData = list.get(i2);
            if (arrayList != null && heartRateData != null) {
                arrayList.add(new HeartRateData(((long) i) * ((long) i2), heartRateData.acquireHeartRate()));
            }
        }
    }

    private static void e(int i, ArrayList<HeartRateData> arrayList, Iterator<HeartRateData> it) {
        HeartRateData heartRateData = null;
        int i2 = 0;
        while (it.hasNext()) {
            HeartRateData next = it.next();
            int iA = a(next, heartRateData);
            if (iA >= 0) {
                i2 += iA;
            }
            if (next != null && arrayList != null) {
                arrayList.add(new HeartRateData(((long) i) * ((long) i2), next.acquireHeartRate()));
            }
            i2++;
            heartRateData = next;
        }
    }

    private static int a(HeartRateData heartRateData, HeartRateData heartRateData2) {
        if (heartRateData == null || heartRateData2 == null) {
            LogUtil.e("Track_DataPretreatmentUtil", "getTrustHeartRateIntervalNum data is null or heartRate is invalid");
            return 0;
        }
        long jAcquireTime = (heartRateData.acquireTime() - heartRateData2.acquireTime()) / 1000;
        if (jAcquireTime > 5) {
            return (((int) jAcquireTime) / 5) - 1;
        }
        return 0;
    }

    private static void c(List<HeartRateData> list, List<HeartRateData> list2, List<HeartRateData> list3, int i, String str) {
        if (njy.e(list) || njy.e(list2)) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        if (str == null) {
            a(list, list2, list3, i, arrayList);
        } else if ("1".equals(str)) {
            c(list, list2, list3, i, (ArrayList<HeartRateData>) arrayList);
        }
    }

    public static ArrayList<HeartRateData> b(List<HeartRateData> list, List<HeartRateData> list2, List<HeartRateData> list3, int i, String str) {
        ArrayList<HeartRateData> arrayList = new ArrayList<>(16);
        if (list == null || list2 == null) {
            LogUtil.e("Track_DataPretreatmentUtil", "heartRateListTemp or heartRateInvalidListTemp is null");
            return arrayList;
        }
        if (str == null) {
            a(list, list2, list3, i, arrayList);
            return arrayList;
        }
        if ("1".equals(str)) {
            c(list, list2, list3, i, arrayList);
        }
        return arrayList;
    }

    private static void a(List<HeartRateData> list, List<HeartRateData> list2, List<HeartRateData> list3, int i, ArrayList<HeartRateData> arrayList) {
        int i2 = 0;
        int i3 = 0;
        for (HeartRateData heartRateData : list) {
            while (i3 < list2.size()) {
                HeartRateData heartRateData2 = list2.get(i3);
                if (heartRateData2.acquireTime() >= heartRateData.acquireTime()) {
                    break;
                }
                i3++;
                arrayList.add(new HeartRateData(((long) i) * ((long) i2), heartRateData2.acquireHeartRate()));
                i2++;
            }
            if (list3 != null) {
                list3.add(new HeartRateData(((long) i) * ((long) i2), heartRateData.acquireHeartRate()));
            }
            i2++;
        }
    }

    private static void c(List<HeartRateData> list, List<HeartRateData> list2, List<HeartRateData> list3, int i, ArrayList<HeartRateData> arrayList) {
        long jAcquireTime;
        long j = 0;
        if (njy.c(list, 0) && njy.c(list2, 0)) {
            long jAcquireTime2 = list.get(0) != null ? list.get(0).acquireTime() : 0L;
            jAcquireTime = list2.get(0) != null ? list2.get(0).acquireTime() : 0L;
            j = jAcquireTime2;
        } else {
            jAcquireTime = 0;
        }
        long jMin = Math.min(j, jAcquireTime);
        c(list, list3, i, jMin);
        c(list2, arrayList, i, jMin);
    }

    private static void c(List<HeartRateData> list, List<HeartRateData> list2, int i, long j) {
        for (HeartRateData heartRateData : list) {
            if (heartRateData != null) {
                list2.add(new HeartRateData(((long) i) * ((long) (((int) ((heartRateData.acquireTime() - j) / 1000)) / i)), heartRateData.acquireHeartRate()));
            }
        }
    }

    private static boolean d(List<HeartRateData> list) {
        HeartRateData heartRateData = null;
        for (HeartRateData heartRateData2 : list) {
            if (heartRateData2 == null) {
                return false;
            }
            if (heartRateData == null) {
                heartRateData = heartRateData2;
            } else if (heartRateData2.acquireTime() < heartRateData.acquireTime()) {
                return false;
            }
        }
        return true;
    }
}
