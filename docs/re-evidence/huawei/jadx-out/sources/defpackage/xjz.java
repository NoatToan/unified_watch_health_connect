package defpackage;

import com.huawei.route.CpInfo;
import com.huawei.route.RouteType;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xjz {
    public static <T> boolean d(List<T> list, int i, CpInfo cpInfo, T t) {
        return cpInfo != null && i == RouteType.EXP.routeType() && list.contains(t);
    }

    public static boolean c(int i, CpInfo cpInfo) {
        return cpInfo != null && i == RouteType.DEFAULT.routeType();
    }

    public static boolean b(double d, double d2) {
        return (Math.abs(d - d2) < 1.0E-6d && Math.abs(d2 * d) < 1.0E-6d) || d2 > 180.0d || d2 <= -180.0d || d <= -90.0d || d >= 90.0d;
    }
}
