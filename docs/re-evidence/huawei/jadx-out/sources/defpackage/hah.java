package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class hah {
    public static boolean c(List<gzv> list) {
        if (!j(list)) {
            return false;
        }
        for (gzv gzvVar : list) {
            if (gzvVar != null && gzvVar.n() > 0.0f) {
                LogUtil.a("Track_SportAccessoriesUtils", "valid GcTimeBalance ", Float.valueOf(gzvVar.n()));
                return true;
            }
        }
        return false;
    }

    public static boolean j(List<gzv> list) {
        if (njy.e(list)) {
            return false;
        }
        long j = 0;
        for (gzv gzvVar : list) {
            if (gzvVar != null) {
                long jA = a(gzvVar.h());
                if (jA < a(j)) {
                    LogUtil.a("Track_SportAccessoriesUtils", "isHideRunningPostureView time is wrong");
                    return false;
                }
                j = jA;
            }
        }
        return true;
    }

    private static long a(long j) {
        long j2 = j / 5000;
        return j % 5000 > 2500 ? (j2 + 1) * 5 : j2 * 5;
    }

    public static boolean f(List<gzv> list) {
        if (!j(list)) {
            return false;
        }
        for (gzv gzvVar : list) {
            if (gzvVar != null && gzvVar.t() > 0.0f) {
                LogUtil.a("Track_SportAccessoriesUtils", "valid VerticalOscillation ", Float.valueOf(gzvVar.t()));
                return true;
            }
        }
        return false;
    }

    public static boolean a(List<gzv> list) {
        if (!j(list)) {
            return false;
        }
        for (gzv gzvVar : list) {
            if (gzvVar != null && gzvVar.o() > 0.0f) {
                LogUtil.a("Track_SportAccessoriesUtils", "valid ImpactPeak ", Float.valueOf(gzvVar.o()));
                return true;
            }
        }
        return false;
    }

    public static boolean i(List<gzv> list) {
        if (!j(list)) {
            return false;
        }
        for (gzv gzvVar : list) {
            if (gzvVar != null && gzvVar.q() > 0.0f) {
                LogUtil.a("Track_SportAccessoriesUtils", "valid getVerticalRatio ", Float.valueOf(gzvVar.q()));
                return true;
            }
        }
        return false;
    }

    public static boolean h(List<gzv> list) {
        if (!j(list)) {
            return false;
        }
        for (gzv gzvVar : list) {
            if (gzvVar != null && gzvVar.l() > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(List<gzv> list) {
        if (!j(list)) {
            return false;
        }
        for (gzv gzvVar : list) {
            if (gzvVar != null && gzvVar.d() > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(List<gzv> list) {
        if (!j(list)) {
            return false;
        }
        for (gzv gzvVar : list) {
            if (gzvVar != null && gzvVar.a() > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(List<gzv> list) {
        return a(list) || f(list);
    }

    public static boolean g(List<gzv> list) {
        if (!j(list)) {
            return false;
        }
        for (gzv gzvVar : list) {
            if (gzvVar != null && gzvVar.k() > 0) {
                return true;
            }
        }
        return false;
    }
}
