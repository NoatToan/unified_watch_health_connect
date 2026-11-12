package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class awx {
    private static final double[] e = {1.0d, 3.0d, 5.0d, 10.0d};

    public static int d(awr awrVar) {
        int iC;
        if (awrVar == null) {
            return 100;
        }
        int iJ = awrVar.j();
        long jG = awrVar.g() / 1000;
        float f = (1000 * jG) / (iJ * 1.0f);
        if (f < 131.96f) {
            LogUtil.a("Track_AbnormalNorthBoundUtil", "avgPace is Abnormal avgPace = ", Float.valueOf(f));
            return 1;
        }
        if (c(awrVar)) {
            ReleaseLogUtil.c("Track_AbnormalNorthBoundUtil", "pace, checkAbnormalTrack result is ", 1);
            return 1;
        }
        Map<Double, Double> mapF = awrVar.f();
        LogUtil.a("Track_AbnormalNorthBoundUtil", "partTime map", mapF, "distance", Integer.valueOf(iJ));
        if (mapF == null || mapF.isEmpty()) {
            iC = 0;
        } else {
            iC = c(iJ, mapF);
            if (iC != 0) {
                LogUtil.a("Track_AbnormalNorthBoundUtil", "AbnormalTrack break world record Continuous");
                return iC;
            }
        }
        float fO = awrVar.o();
        LogUtil.a("Track_AbnormalNorthBoundUtil", "sportTime ", Long.valueOf(jG), "avgStepRate", Float.valueOf(fO));
        if (e(awrVar, iJ, fO, jG) == 4) {
            return 4;
        }
        return iC;
    }

    private static boolean c(awr awrVar) {
        List<njj> listD = njv.d(awrVar.d());
        if (!njy.b(listD)) {
            return false;
        }
        LogUtil.a("Track_AbnormalNorthBoundUtil", "validPaceList abnormal is ", listD.toString());
        return awy.e(listD, 131.96f) > 0;
    }

    private static int e(awr awrVar, int i, float f, long j) {
        int iE = awrVar.e();
        int iH = awrVar.h();
        LogUtil.a("Track_AbnormalNorthBoundUtil", "checkStepAbnormal, sportType ", Integer.valueOf(iE), " dataSource ", Integer.valueOf(iH));
        if (iE == 264 && iH == 5) {
            return 0;
        }
        if (f < 1.0E-6d) {
            ReleaseLogUtil.c("Track_AbnormalNorthBoundUtil", "avgStepRate, checkAbnormalTrack result is 1e-6");
            return 4;
        }
        float f2 = i / ((f / 60.0f) * j);
        LogUtil.a("Track_AbnormalNorthBoundUtil", "stride is ", Float.valueOf(f2));
        return f2 > 3.0f ? 4 : 0;
    }

    private static int c(long j, Map<Double, Double> map) {
        int iD = 0;
        for (double d : e) {
            if (j < d) {
                break;
            }
            iD = d(j, map, d);
        }
        return iD;
    }

    private static int d(long j, Map<Double, Double> map, double d) {
        double d2 = awy.d((int) d);
        int i = 0;
        int i2 = 0;
        while (true) {
            double d3 = i;
            if (d3 > j - d) {
                return i2;
            }
            double d4 = d3 + d;
            if (map.size() >= d4) {
                if (i == 0) {
                    Double d5 = map.get(Double.valueOf(d));
                    if (d5 == null) {
                        LogUtil.e("Track_AbnormalNorthBoundUtil", "partTime.get(partTimeKey) is null", Double.valueOf(d));
                    } else if (d5.doubleValue() < d2) {
                        LogUtil.j("Track_AbnormalNorthBoundUtil", "error time1", map.get(Double.valueOf(d)));
                        i2 = 5;
                    }
                } else {
                    Double d6 = map.get(Double.valueOf(d3));
                    Double d7 = map.get(Double.valueOf(d4));
                    if (d6 == null || d7 == null) {
                        LogUtil.e("Track_AbnormalNorthBoundUtil", "partTime.get(i + partTimeKey) is null");
                    } else if (d7.doubleValue() - d6.doubleValue() < d2) {
                        LogUtil.j("Track_AbnormalNorthBoundUtil", "AbnormalTrackForEachDistance", d7, "add", d6, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, Integer.valueOf(i));
                        i2 = 5;
                    }
                }
            }
            i++;
        }
    }
}
