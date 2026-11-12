package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class fmg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f34258c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final fmh[] f34257b = {new fmh(-1.0E-6d, 0.0d, "UseHealthModeFrequency_0"), new fmh(0.0d, 1.0d, "UseHealthModeFrequency_1"), new fmh(1.0d, 2.0d, "UseHealthModeFrequency_2"), new fmh(2.0d, 3.0d, "UseHealthModeFrequency_3"), new fmh(3.0d, 4.0d, "UseHealthModeFrequency_4"), new fmh(4.0d, 7.0d, "UseHealthModeFrequency_5_7"), new fmh(7.0d, 11.0d, "UseHealthModeFrequency_8_11"), new fmh(11.0d, 15.0d, "UseHealthModeFrequency_12_15"), new fmh(15.0d, Double.MAX_VALUE, "UseHealthModeFrequency_15+")};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fmh[] f34256a = {new fmh(-0.5d, 1.0d, "HealthModeActive_0"), new fmh(1.0d, 7.0d, "HealthModeActive_0_7"), new fmh(7.0d, 30.0d, "HealthModeActive_7_30"), new fmh(30.0d, 60.0d, "HealthModeActive_30_60"), new fmh(60.0d, 90.0d, "HealthModeActive_60_90"), new fmh(90.0d, 180.0d, "HealthModeActive_90_180"), new fmh(180.0d, 360.0d, "HealthModeActive_180_360"), new fmh(360.0d, Double.MAX_VALUE, "HealthModeActive_360+")};

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final fmg f34259c = new fmg();
    }

    public static fmg b(Context context) {
        LogUtil.a("QueryRecordManager", "QueryRecordManager getInstance");
        if (context != null) {
            f34258c = context.getApplicationContext();
        }
        return e.f34259c;
    }

    protected List<String> c(String str) {
        ArrayList arrayList = new ArrayList(2);
        b(str, arrayList);
        e(str, arrayList);
        return arrayList;
    }

    private void b(String str, List<String> list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iB = fll.c().b(new flr(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis, str, AnalyticsValue.HEALTH_MODEL_HOME_CARD_2119001.value()));
        LogUtil.d("QueryRecordManager", "generateHealthModeFrequencyLabel count = ", Integer.valueOf(iB));
        String matchResult = "UseHealthModeFrequency_0";
        for (fmh fmhVar : f34257b) {
            matchResult = fmhVar.getMatchResult(iB);
            if (matchResult != null) {
                break;
            }
        }
        fmc.a(f34258c).e("health_sport_health_mode_frequency", matchResult, str);
        list.add(matchResult);
    }

    private void e(String str, List<String> list) {
        long jB = ltb.b(System.currentTimeMillis());
        flr flrVar = new flr(jB - 31104000000L, jB, str, AnalyticsValue.HEALTH_MODEL_HOME_CARD_2119001.value());
        flrVar.e(" desc ");
        flrVar.e(1);
        List<fln> listE = fll.c().e(flrVar);
        String matchResult = "HealthModeActive_360+";
        if (njy.e(listE)) {
            LogUtil.a("QueryRecordManager", "generateHealthLifeActiveLabel queryRecord is empty");
            fmc.a(f34258c).e("health_sport_health_mode_active", "HealthModeActive_360+", str);
            list.add("HealthModeActive_360+");
            return;
        }
        double dCurrentTimeMillis = (System.currentTimeMillis() - listE.get(0).a()) / 8.64E7d;
        LogUtil.d("QueryRecordManager", "generateHealthLifeActiveLabel days = ", Double.valueOf(dCurrentTimeMillis));
        for (fmh fmhVar : f34256a) {
            matchResult = fmhVar.getMatchResult(dCurrentTimeMillis);
            if (matchResult != null) {
                break;
            }
        }
        fmc.a(f34258c).e("health_sport_health_mode_active", matchResult, str);
        list.add(matchResult);
    }
}
