package defpackage;

import android.location.Location;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jbb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38331a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38332b = 0;
    private lqv d = null;

    public void e(MotionPath motionPath, final MotionPathSimplify motionPathSimplify) {
        double[] dArr;
        if (motionPathSimplify == null || motionPathSimplify.requestExtendDataMap() == null || motionPathSimplify.requestExtendDataMap().containsKey(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER)) {
            return;
        }
        if (this.d != null) {
            b(motionPathSimplify);
            return;
        }
        if (motionPath == null) {
            ReleaseLogUtil.d("R_Track_SportWeatherManager", "saveWeatherInfo mMotionPath is null");
            return;
        }
        if (!jcg.c(BaseApplication.getContext())) {
            ReleaseLogUtil.d("R_Track_SportWeatherManager", "saveWeatherInfo Network unConnected");
            return;
        }
        Map<Long, double[]> mapRequestLbsDataMap = motionPath.requestLbsDataMap();
        if (njy.e(mapRequestLbsDataMap)) {
            return;
        }
        long size = mapRequestLbsDataMap.size() - 1;
        while (true) {
            if (size < 0) {
                dArr = null;
                break;
            }
            dArr = mapRequestLbsDataMap.get(Long.valueOf(size));
            if (dArr != null && dArr.length >= 2 && !izt.d(dArr[0], dArr[1])) {
                break;
            } else {
                size--;
            }
        }
        if (dArr == null || dArr.length < 2) {
            return;
        }
        final double d = dArr[0];
        final double d2 = dArr[1];
        ThreadPoolManager.c().a("Track_SportWeatherManager", new Runnable() { // from class: jay
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(d, d2, motionPathSimplify);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(double d, double d2, MotionPathSimplify motionPathSimplify) {
        this.d = lqh.d().c(d, d2);
        b(motionPathSimplify);
        c();
    }

    public void b(MotionPathSimplify motionPathSimplify) {
        b(this.d, motionPathSimplify);
    }

    private void b(lqv lqvVar, MotionPathSimplify motionPathSimplify) {
        if (lqvVar == null || motionPathSimplify == null) {
            ReleaseLogUtil.e("R_Track_SportWeatherManager", "setWeatherInfoToMotionPath mWeatherInfo is null or simplifyData is null");
            return;
        }
        ReleaseLogUtil.d("R_Track_SportWeatherManager", "setWeatherInfoToMotionPath");
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER, String.valueOf(lqvVar.a()));
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, String.valueOf(lqvVar.b()));
        motionPathSimplify.addExtendDataMap("apparentTemperature", String.valueOf(lqvVar.c()));
        motionPathSimplify.addExtendDataMap("relativeHumidity", lqvVar.d());
        motionPathSimplify.addExtendDataMap("windDirection", String.valueOf(lqvVar.f()));
        motionPathSimplify.addExtendDataMap("windForce", String.valueOf(lqvVar.e()));
        motionPathSimplify.addExtendDataMap("windSpeed", String.valueOf(lqvVar.h()));
    }

    private void c() {
        LogUtil.a("Track_SportWeatherManager", "setWeatherEvent");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD = SharedPreferenceManager.d("SPORT_REQUEST_WEATHER_INFO", "SPORT_LAST_WEATHER_TIME", 0L);
        long jD2 = SharedPreferenceManager.d("SPORT_REQUEST_WEATHER_INFO", "SPORT_REQUEST_WEATHER_COUNT", 0L);
        long j = 1;
        if (lsl.c(jCurrentTimeMillis, jD)) {
            j = 1 + jD2;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            linkedHashMap.put("requestCount", Long.toString(jD2));
            linkedHashMap.put(Utils.REQUEST_TIME, Long.toString(jD));
            linkedHashMap.put("requestForm", "SPORT_WEATHER");
            jaj.c(linkedHashMap);
        }
        SharedPreferenceManager.c("SPORT_REQUEST_WEATHER_INFO", "SPORT_LAST_WEATHER_TIME", jCurrentTimeMillis);
        SharedPreferenceManager.c("SPORT_REQUEST_WEATHER_INFO", "SPORT_REQUEST_WEATHER_COUNT", j);
    }

    public void c(MotionPathSimplify motionPathSimplify) {
        Map<String, String> mapRequestExtendDataMap = motionPathSimplify.requestExtendDataMap();
        if (mapRequestExtendDataMap.containsKey(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER)) {
            lqv lqvVar = new lqv();
            lqvVar.d(CommonUtils.e(mapRequestExtendDataMap.get(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER), -1));
            lqvVar.c(CommonUtils.e(mapRequestExtendDataMap.get(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE), -99));
            lqvVar.a(CommonUtils.e(mapRequestExtendDataMap.get("apparentTemperature"), -99));
            lqvVar.a(mapRequestExtendDataMap.get("relativeHumidity"));
            lqvVar.e(CommonUtils.e(mapRequestExtendDataMap.get("windDirection"), -1));
            lqvVar.b(CommonUtils.e(mapRequestExtendDataMap.get("windForce"), -1));
            lqvVar.f(CommonUtils.e(mapRequestExtendDataMap.get("windSpeed"), -1));
            this.d = lqvVar;
        }
    }

    public void e(final Location location) {
        if (this.d != null) {
            return;
        }
        if (location == null) {
            LogUtil.a("Track_SportWeatherManager", "initWeatherInfo location is null");
            return;
        }
        if (this.f38331a >= 5) {
            LogUtil.a("Track_SportWeatherManager", "initWeatherInfo Network unConnected");
            return;
        }
        if (System.currentTimeMillis() - this.f38332b < TimeUnit.MINUTES.toMillis(1L)) {
            LogUtil.a("Track_SportWeatherManager", "initWeatherInfo() skipped: exceeds call limit");
        } else {
            if (!jcg.c(BaseApplication.getContext())) {
                LogUtil.a("Track_SportWeatherManager", "initWeatherInfo Network unConnected");
                return;
            }
            this.f38331a++;
            this.f38332b = System.currentTimeMillis();
            ThreadPoolManager.c().a("Track_SportWeatherManager", new Runnable() { // from class: jba
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38330a.b(location);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Location location) {
        this.d = lqh.d().c(location.getLatitude(), location.getLongitude());
        c();
    }

    public void c(lqv lqvVar) {
        this.d = lqvVar;
    }

    public void a() {
        c((lqv) null);
        this.f38331a = 0;
        this.f38332b = 0L;
    }

    public void d() {
        a();
        c((lqv) null);
    }
}
