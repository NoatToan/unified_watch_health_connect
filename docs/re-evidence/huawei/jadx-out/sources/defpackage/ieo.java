package defpackage;

import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.ui.fitness.module.HeartRateLineChartHolderImpl;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ieo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HeartRateLineChartHolderImpl f37533c;

    public ieo(HeartRateLineChartHolderImpl heartRateLineChartHolderImpl) {
        this.f37533c = heartRateLineChartHolderImpl;
    }

    public void b(WorkoutRecord workoutRecord) {
        if (workoutRecord == null) {
            LogUtil.j("Suggestion_HeartRateChartFiller", "initHeartRateData failure. workoutRecord is null, return.");
            return;
        }
        List<HeartRateData> listAcquireHeartRateDataList = workoutRecord.acquireHeartRateDataList();
        if (njy.e(listAcquireHeartRateDataList)) {
            LogUtil.j("Suggestion_HeartRateChartFiller", "initHeartRateData failure. heartRateList is null, return.");
            return;
        }
        List<HeartRateData> listAcquireInvalidHeartRateList = workoutRecord.acquireInvalidHeartRateList();
        d(a(listAcquireHeartRateDataList), a(listAcquireInvalidHeartRateList), workoutRecord.acquireHeartRateConfig(), workoutRecord.startTime());
    }

    private void d(ArrayList<HeartRateData> arrayList, ArrayList<HeartRateData> arrayList2, String str, long j) {
        if (arrayList == null) {
            LogUtil.j("Suggestion_HeartRateChartFiller", "fillHeartRateData motionPath requestHeartRateList null,return");
            return;
        }
        ArrayList<HeartRateData> arrayList3 = new ArrayList<>(16);
        this.f37533c.b(arrayList3);
        this.f37533c.e(arrayList2);
        int iE = xjm.e(arrayList, j);
        this.f37533c.b(iE);
        boolean z = b(arrayList) && b(arrayList2);
        boolean zE = njy.e(arrayList2);
        LogUtil.a("Suggestion_HeartRateChartFiller", "initHeartRateData hasTrustHeartRate", str);
        if (!z || zE) {
            Iterator<HeartRateData> it = arrayList.iterator();
            if ("1".equals(str)) {
                LogUtil.d("Suggestion_HeartRateChartFiller", "initHeartRateData no invalid list has trust heartRate");
                e(iE, arrayList3, it);
            } else if (str != null) {
                LogUtil.a("Suggestion_HeartRateChartFiller", "initHeartRateData, hasTrustHeartRate is other value:", str);
            } else {
                d(iE, arrayList3, arrayList);
            }
            if (arrayList.size() - 1 > 0) {
                a(iE, arrayList, str);
                return;
            } else {
                this.f37533c.b();
                return;
            }
        }
        a(arrayList, arrayList2, arrayList3, str, iE);
        if ((arrayList.size() + arrayList2.size()) - 1 > 0) {
            d(iE, arrayList, arrayList2, str);
        } else {
            this.f37533c.b();
        }
    }

    private void d(int i, ArrayList<HeartRateData> arrayList, List<HeartRateData> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(new HeartRateData(((long) i) * ((long) i2), list.get(i2).acquireHeartRate()));
        }
    }

    private void e(int i, ArrayList<HeartRateData> arrayList, Iterator<HeartRateData> it) {
        HeartRateData heartRateData = null;
        int i2 = 0;
        while (it.hasNext()) {
            HeartRateData next = it.next();
            int iB = b(next, heartRateData);
            if (iB >= 0) {
                i2 += iB;
            }
            arrayList.add(new HeartRateData(((long) i) * ((long) i2), next.acquireHeartRate()));
            i2++;
            heartRateData = next;
        }
    }

    private void a(List<HeartRateData> list, List<HeartRateData> list2, List<HeartRateData> list3, String str, int i) {
        ArrayList<HeartRateData> arrayList = new ArrayList<>(16);
        if (str == null) {
            d(list, list2, list3, i, arrayList);
        } else if ("1".equals(str)) {
            b(list, list2, list3, i, arrayList);
        } else {
            LogUtil.a("Suggestion_HeartRateChartFiller", "correctHeartRateData, hasTrustHeartRate is other value:", str);
        }
        this.f37533c.c(arrayList);
    }

    private void d(List<HeartRateData> list, List<HeartRateData> list2, List<HeartRateData> list3, int i, ArrayList<HeartRateData> arrayList) {
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
            list3.add(new HeartRateData(((long) i) * ((long) i2), heartRateData.acquireHeartRate()));
            i2++;
        }
    }

    private void b(List<HeartRateData> list, List<HeartRateData> list2, List<HeartRateData> list3, int i, ArrayList<HeartRateData> arrayList) {
        long jMin = Math.min(list.get(0).acquireTime(), list2.get(0).acquireTime());
        b(list, list3, i, jMin);
        b(list2, arrayList, i, jMin);
    }

    private void b(List<HeartRateData> list, List<HeartRateData> list2, int i, long j) {
        for (HeartRateData heartRateData : list) {
            list2.add(new HeartRateData(((long) i) * ((long) (((int) ((heartRateData.acquireTime() - j) / 1000)) / i)), heartRateData.acquireHeartRate()));
        }
    }

    private boolean b(List<HeartRateData> list) {
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

    private int b(HeartRateData heartRateData, HeartRateData heartRateData2) {
        if (heartRateData == null || heartRateData2 == null) {
            LogUtil.e("Suggestion_HeartRateChartFiller", "getTrustHeartRateIntervalNum data is null or heartRate is invalid");
            return 0;
        }
        long jAcquireTime = (heartRateData.acquireTime() - heartRateData2.acquireTime()) / 1000;
        if (jAcquireTime > 5) {
            return (((int) jAcquireTime) / 5) - 1;
        }
        return 0;
    }

    private void a(int i, List<HeartRateData> list, String str) {
        if (str == null) {
            this.f37533c.a(i * (list.size() - 1));
        } else if ("1".equals(str)) {
            this.f37533c.a((list.get(list.size() - 1).acquireTime() - list.get(0).acquireTime()) / 1000.0f);
        } else {
            LogUtil.a("Suggestion_HeartRateChartFiller", "modifyHeartRateSumTime, hasTrustHeartRate is other value:", str);
        }
    }

    private void d(int i, List<HeartRateData> list, List<HeartRateData> list2, String str) {
        if (str == null) {
            this.f37533c.a(i * ((list.size() + list2.size()) - 1));
            return;
        }
        if ("1".equals(str)) {
            long jAcquireTime = list.get(0).acquireTime();
            long jAcquireTime2 = list.get(list.size() - 1).acquireTime();
            long jAcquireTime3 = list2.get(0).acquireTime();
            this.f37533c.a((Math.max(jAcquireTime2, list2.get(list2.size() - 1).acquireTime()) - Math.min(jAcquireTime, jAcquireTime3)) / 1000);
            return;
        }
        LogUtil.a("Suggestion_HeartRateChartFiller", "modifyHeartRateSumTime, hasTrustHeartRate is other value:", str);
    }

    private ArrayList<HeartRateData> a(List<HeartRateData> list) {
        ArrayList<HeartRateData> arrayList = new ArrayList<>();
        if (list != null) {
            for (HeartRateData heartRateData : list) {
                HeartRateData heartRateData2 = new HeartRateData();
                heartRateData2.saveTime(heartRateData.acquireTime());
                heartRateData2.saveHeartRate(heartRateData.acquireHeartRate());
                arrayList.add(heartRateData2);
            }
        }
        return arrayList;
    }
}
