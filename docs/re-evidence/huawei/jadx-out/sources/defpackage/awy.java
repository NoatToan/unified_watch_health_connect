package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import com.huawei.hihealth.data.model.TrackSwimSegment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class awy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double[] f727a = {1.0d, 3.0d, 5.0d, 10.0d};

    private static boolean a(int i) {
        return i == 266 || i == 262;
    }

    public static double d(int i) {
        if (i == 1) {
            return 131.96d;
        }
        if (i == 3) {
            return 440.67d;
        }
        if (i != 5) {
            return i != 10 ? 0.0d : 1577.53d;
        }
        return 757.35d;
    }

    private static boolean e(int i) {
        return i == 259 || i == 265;
    }

    private static boolean g(int i) {
        return i == 257 || i == 282;
    }

    private static boolean i(int i) {
        return i == 264 || i == 258 || i == 227;
    }

    public static int c(awr awrVar) {
        if (awrVar == null) {
            LogUtil.j("Track_AbnormalTrackUtil", "abnormalData is null ");
            return 0;
        }
        int iH = b(awrVar.e()) ? h(awrVar) : 0;
        if (a(awrVar.e())) {
            iH = i(awrVar);
        }
        if (e(awrVar.e())) {
            iH = e(awrVar);
        }
        if (!c(awrVar.e()) || awrVar.j() <= 10000000) {
            LogUtil.a("Track_AbnormalTrackUtil", "heckAbnormalTrack result is ", Integer.valueOf(iH));
            return iH;
        }
        LogUtil.a("Track_AbnormalTrackUtil", "distance, checkAbnormalTrack result is ", 2);
        return 2;
    }

    private static float b(awr awrVar) {
        if (awrVar.i() == 0) {
            return 0.0f;
        }
        float fJ = awrVar.j() / awrVar.i();
        LogUtil.a("Track_AbnormalTrackUtil", "stride is ", Float.valueOf(fJ));
        return fJ;
    }

    private static boolean b(float f, boolean z) {
        LogUtil.a("Track_AbnormalTrackUtil", "checkStepIsAbnormal, stride is ", Float.valueOf(f), " ,supportStep is ", Boolean.valueOf(z));
        return (Float.compare(f, 0.0f) == 0 && z) || f >= 3.0f;
    }

    private static boolean b(int i) {
        return i(i) || g(i) || i == 260;
    }

    private static boolean c(int i) {
        return i(i) || g(i) || i == 259 || i == 260;
    }

    private static int h(awr awrVar) {
        if (awrVar.b() < 131.96d) {
            ReleaseLogUtil.d("Track_AbnormalTrackUtil", "avgPace ,checkAbnormalTrack result is ", 1);
            return 1;
        }
        int iD = 0;
        if (awrVar.f() != null && njy.b(awrVar.d()) && !awrVar.f().isEmpty()) {
            if (d(awrVar)) {
                ReleaseLogUtil.d("Track_AbnormalTrackUtil", "AbnormalTrack break world record");
                return 1;
            }
            iD = d(awrVar, 0);
            if (iD != 0) {
                ReleaseLogUtil.d("Track_AbnormalTrackUtil", "AbnormalTrack break world record Continuous");
                return iD;
            }
        }
        List<njj> listD = njv.d(awrVar.d());
        if (njy.b(listD)) {
            LogUtil.a("Track_AbnormalTrackUtil", "validPaceList abnormal is ", listD.toString());
            if (e(listD, 131.96f) > 0) {
                ReleaseLogUtil.d("Track_AbnormalTrackUtil", "pace, checkAbnormalTrack result is ", 1);
                return 1;
            }
        }
        return iD;
    }

    public static boolean a(awr awrVar) {
        if (!b(awrVar.e())) {
            ReleaseLogUtil.d("Track_AbnormalTrackUtil", "sportType no need to verify step ");
            return false;
        }
        if (!b(b(awrVar), awrVar.a())) {
            return false;
        }
        ReleaseLogUtil.d("Track_AbnormalTrackUtil", "step, getAbnormalStepTrack is true ");
        return true;
    }

    private static int i(awr awrVar) {
        LogUtil.a("Track_AbnormalTrackUtil", "getSportSwim start");
        int iRequestDistance = 0;
        if (awrVar.j() == 0) {
            return 0;
        }
        long jRequestDuration = 0;
        if (awrVar.g() == 0) {
            return 6;
        }
        if (awrVar.g() < ((double) awrVar.j()) * 368.0d) {
            return 5;
        }
        List<TrackSwimSegment> listC = awrVar.c();
        if (njy.e(listC)) {
            LogUtil.j("Track_AbnormalTrackUtil", "getSportSwim swimSegments is null");
            return 0;
        }
        int iD = 0;
        for (TrackSwimSegment trackSwimSegment : listC) {
            iRequestDistance += trackSwimSegment.requestDistance();
            jRequestDuration += (long) (trackSwimSegment.requestDuration() * 1000);
            iD = d(iRequestDistance, jRequestDuration);
            if (iD > 0) {
                break;
            }
        }
        LogUtil.a("Track_AbnormalTrackUtil", "getSportSwim end result", Integer.valueOf(iD));
        return iD;
    }

    private static int d(int i, long j) {
        if (i != 50) {
            if (i != 100) {
                if (i != 200) {
                    if (i != 400) {
                        if (i != 800) {
                            LogUtil.j("Track_AbnormalTrackUtil", " acquireSportSwim is default");
                            return 0;
                        }
                        if (j < 361600.0d) {
                            return 5;
                        }
                    } else if (j < 176000.0d) {
                        return 5;
                    }
                } else if (j < 81600.0d) {
                    return 5;
                }
            } else if (j < 36872.8d) {
                return 5;
            }
        } else if (j < 16072.800000000001d) {
            return 5;
        }
        return 0;
    }

    private static int e(awr awrVar) {
        if (awrVar.e() == 265 && awrVar.j() == 0) {
            ReleaseLogUtil.d("Track_AbnormalTrackUtil", "totalDistance, totalDistance is 0");
            return 0;
        }
        if (awrVar.g() == 0) {
            return 6;
        }
        if (awrVar.b() < 50.0f) {
            return 5;
        }
        if (njy.b(awrVar.d())) {
            List<njj> listD = njv.d(awrVar.d());
            if (!njy.e(listD) && e(listD, 50.0f) > 0) {
                ReleaseLogUtil.d("Track_AbnormalTrackUtil", "pace, checkAbnormalTrack result is ", 1);
                return 1;
            }
        }
        return 0;
    }

    public static int e(List<njj> list, float f) {
        if (list == null) {
            return 1;
        }
        Iterator<njj> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().d() < f) {
                i++;
            }
        }
        return i;
    }

    public static boolean a(Context context) {
        SensorManager sensorManager;
        if (context != null && (context.getSystemService("sensor") instanceof SensorManager) && (sensorManager = (SensorManager) context.getSystemService("sensor")) != null && sensorManager.getDefaultSensor(19) != null) {
            boolean zA = a();
            LogUtil.a("Track_AbnormalTrackUtil", "supportStandStepCounter ", Boolean.valueOf(zA));
            return zA;
        }
        LogUtil.a("supportStandStepCounter", "supportStandStepCounter false");
        return false;
    }

    private static boolean a() {
        return CommonUtil.bh() || Build.VERSION.SDK_INT < 29 || ActivityCompat.checkSelfPermission(BaseApplication.getContext(), "android.permission.ACTIVITY_RECOGNITION") == 0;
    }

    private static boolean d(awr awrVar) {
        double dJ = awrVar.j();
        if (dJ >= 42195.0d) {
            return e(awrVar, 42.0d) < 7377.0d;
        }
        if (dJ >= 21097.5d) {
            return e(awrVar, 21.0d) < 3480.0d;
        }
        if (dJ >= 10000.0d) {
            return e(awrVar, 10.0d) < 1577.53d;
        }
        if (dJ >= 5000.0d) {
            return e(awrVar, 5.0d) < 757.35d;
        }
        if (dJ >= 3000.0d) {
            return e(awrVar, 3.0d) < 440.67d;
        }
        if (dJ >= 1000.0d) {
            return e(awrVar, 1.0d) < 131.96d;
        }
        LogUtil.j("Track_AbnormalTrackUtil", "abnormalTrack distance less than 1km or it is abnormal");
        return false;
    }

    private static int d(awr awrVar, int i) {
        int iJ = awrVar.j() / 1000;
        Map<Double, Double> mapF = awrVar.f();
        int iC = i;
        for (double d : f727a) {
            if (iJ < d) {
                break;
            }
            iC = c(iC, iJ, mapF, d);
        }
        return iC;
    }

    private static int c(int i, long j, Map<Double, Double> map, double d) {
        double d2 = d((int) d);
        int i2 = 0;
        int i3 = i;
        while (true) {
            double d3 = i2;
            if (d3 > j - d) {
                return i3;
            }
            double d4 = d3 + d;
            if (map.size() >= d4) {
                if (i2 == 0) {
                    if (map.get(Double.valueOf(d)) == null) {
                        LogUtil.j("Track_AbnormalTrackUtil", "partTime.get(partTimeKey) is null", Double.valueOf(d));
                    } else if (map.get(Double.valueOf(d)).doubleValue() < d2) {
                        ReleaseLogUtil.e("Track_AbnormalTrackUtil", "error time1", map.get(Double.valueOf(d)));
                        i3 = 5;
                    }
                } else if (map.get(Double.valueOf(d4)) == null || map.get(Double.valueOf(d3)) == null) {
                    LogUtil.j("Track_AbnormalTrackUtil", "partTime.get(i + partTimeKey) is null");
                } else if (map.get(Double.valueOf(d4)).doubleValue() - map.get(Double.valueOf(d3)).doubleValue() < d2) {
                    ReleaseLogUtil.e("Track_AbnormalTrackUtil", "AbnormalTrackForEachDistance", map.get(Double.valueOf(d3)), "add", map.get(Double.valueOf(d4)));
                    i3 = 5;
                }
            }
            i2++;
        }
    }

    private static double e(awr awrVar, double d) {
        Map<Double, Double> mapF = awrVar.f();
        if (mapF == null || d > mapF.size() || mapF.get(Double.valueOf(d)) == null) {
            return 0.0d;
        }
        return mapF.get(Double.valueOf(d)).doubleValue();
    }
}
