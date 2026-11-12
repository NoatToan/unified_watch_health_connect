package defpackage;

import com.google.gson.Gson;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class deu {
    public static double c(int[] iArr) {
        double d;
        double d2;
        if (iArr == null || iArr.length != 5) {
            d = 0.0d;
        } else {
            int i = 0;
            d = 0.0d;
            while (i < iArr.length) {
                int i2 = i + 1;
                if (i2 == 1) {
                    d2 = 0.25d;
                } else if (i2 == 2) {
                    d2 = 0.4d;
                } else if (i2 == 3) {
                    d2 = 0.6d;
                } else if (i2 == 4) {
                    d2 = 0.8d;
                } else if (i2 != 5) {
                    LogUtil.e("Suggestion_TrainPointUtils", "statisticPoint error tmpZone", Integer.valueOf(i2));
                    d2 = 0.0d;
                } else {
                    d2 = 1.0d;
                }
                d += (((double) iArr[i]) * d2) / 60.0d;
                i = i2;
            }
        }
        return UnitUtil.d(d >= 0.0d ? d : 0.0d, 1);
    }

    private static double d(double d, double d2, double d3) {
        if (d2 == d3) {
            LogUtil.e("Suggestion_TrainPointUtils", "getPerMinPoint mMaxHeartRate == mRestHeartRate");
            return 0.0d;
        }
        double d4 = (d - d3) / (d2 - d3);
        if (d4 < 0.5d) {
            return 0.0d;
        }
        double d5 = (((2.626d * d4) * d4) - (d4 * 1.8663d)) + 0.2835d;
        if (d5 < 0.0d) {
            return 0.0d;
        }
        return d5;
    }

    public static double c(HeartZoneConf heartZoneConf, List<HeartRateData> list, int i) {
        int i2;
        double dAcquireHeartRate;
        if (njy.e(list) || heartZoneConf == null) {
            return 0.0d;
        }
        int maxThreshold = heartZoneConf.getMaxThreshold();
        int restHeartRate = heartZoneConf.getRestHeartRate();
        if (restHeartRate == 0) {
            restHeartRate = 60;
        }
        int i3 = restHeartRate;
        if (heartZoneConf.getClassifyMethod() != 0) {
            return c(e(list, heartZoneConf, i));
        }
        Iterator<HeartRateData> it = list.iterator();
        double d = 0.0d;
        double dC = 0.0d;
        loop0: while (true) {
            i2 = 0;
            dAcquireHeartRate = 0.0d;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                HeartRateData next = it.next();
                if (next != null) {
                    if (next.acquireHeartRate() != 0) {
                        i2++;
                    }
                    dAcquireHeartRate += (double) next.acquireHeartRate();
                    if (next.acquireTime() % 60 != 0) {
                    }
                }
            }
            if (i2 != 0) {
                d = dAcquireHeartRate / ((double) i2);
            }
            double d2 = d;
            dC = c(maxThreshold, i3, d2, dC);
            d = d2;
        }
        if (dAcquireHeartRate > 0.0d && i2 > 0) {
            double d3 = d(dAcquireHeartRate / ((double) i2), maxThreshold, i3);
            if (d3 > 0.0d) {
                d3 *= ((double) (i2 * i)) / 60.0d;
            }
            dC += d3;
        }
        if (dC < 0.0d) {
            return 0.0d;
        }
        return dC;
    }

    private static double c(int i, int i2, double d, double d2) {
        return d2 + d(d, i, i2);
    }

    private static int[] e(List<HeartRateData> list, HeartZoneConf heartZoneConf, int i) {
        int iFindRateRegion;
        int[] iArr = new int[5];
        if (njy.e(list) || heartZoneConf == null) {
            LogUtil.j("Suggestion_TrainPointUtils", "getReserveHeartTypeTrainPoint mHeartRateList is null");
            return iArr;
        }
        LogUtil.a("Suggestion_TrainPointUtils", "getHeartTimeZone heartRateList", new Gson().toJson(list));
        for (HeartRateData heartRateData : list) {
            if (heartRateData != null && (iFindRateRegion = heartZoneConf.findRateRegion(heartRateData.acquireHeartRate())) != -1) {
                iArr[iFindRateRegion] = iArr[iFindRateRegion] + i;
            }
        }
        return iArr;
    }

    public static int c(MotionPath motionPath, dea deaVar, long j) {
        if (motionPath == null || deaVar == null) {
            LogUtil.j("Suggestion_TrainPointUtils", "motionPath == null || courseEnvParams == null");
            return 0;
        }
        if (deaVar.j()) {
            return (int) Math.round(c(deaVar.a(), motionPath.requestHeartRateList(), 5) * 10.0d);
        }
        return (int) Math.round(c(haf.e(deaVar.f(), motionPath.requestRealTimePaceList(), j)) * 10.0d);
    }
}
