package defpackage;

import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class izv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Integer[] f38265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Integer[] f38266c;

    public static String b(int i) {
        Integer[] numArrE = e();
        if (njy.c(numArrE, i)) {
            return qre.f(numArrE[i].intValue());
        }
        return "";
    }

    public static Integer[] e() {
        if (f38266c == null) {
            f38266c = new Integer[]{Integer.valueOf(R.string.IDS_hwh_health_load_peak_level_low), Integer.valueOf(R.string.IDS_hwh_health_load_peak_level_medium), Integer.valueOf(R.string.IDS_hwh_health_load_peak_level_high)};
        }
        return f38266c;
    }

    public static int e(int i) {
        Integer[] numArrC = c();
        if (njy.c(numArrC, i)) {
            return numArrC[i].intValue();
        }
        return -1;
    }

    private static Integer[] c() {
        if (f38265b == null) {
            f38265b = new Integer[]{Integer.valueOf(qre.e(R.color.low_load_peak)), Integer.valueOf(qre.e(R.color.medium_load_peak)), Integer.valueOf(qre.e(R.color.high_load_peak))};
        }
        return f38265b;
    }

    public static int e(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.e("R_LoadPeakUtil", "getTotalLoadPeak simplify is null");
            return 0;
        }
        return qrs.a(motionPathSimplify.getExtendDataString("aerobicLoadPeak")) + qrs.a(motionPathSimplify.getExtendDataString("anaerobicLoadPeak"));
    }
}
