package defpackage;

import android.graphics.Color;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.view.CustomWebView$$ExternalSyntheticBackport0;
import com.huawei.route.SlopeInfo;
import health.compact.a.UnitUtil;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class izk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, Integer> f38252b = CustomWebView$$ExternalSyntheticBackport0.m(new Map.Entry[]{new AbstractMap.SimpleEntry(1, 4), new AbstractMap.SimpleEntry(2, 3), new AbstractMap.SimpleEntry(3, 2), new AbstractMap.SimpleEntry(4, 1)});

    public static void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, List<SlopeInfo> list) {
        if (qpvVar == null) {
            LogUtil.j("Track_AltitudeIntervalUtils", "tableDataSet == null");
            return;
        }
        if (list == null) {
            LogUtil.j("Track_AltitudeIntervalUtils", "slopeInfoList == null");
            return;
        }
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(qre.f(R.string.IDS_hwh_motiontrack_slope_section)));
        qpvVar.putColumnHeaderData(0, 1, new jpj(qre.f(R.string.IDS_hwh_motiontrack_slope_rank), null));
        qpvVar.putColumnHeaderData(0, 2, new jpj(qre.f(R.string.IDS_hwh_motiontrack_slope_length), a()));
        qpvVar.putColumnHeaderData(0, 3, new jpj(qre.f(R.string.IDS_hwh_motiontrack_distance_from_start_point), a()));
        qpvVar.putColumnHeaderData(0, 4, new jpj(qre.f(R.string.IDS_hwh_motiontrack_slope_climb), c()));
        qpvVar.putColumnHeaderData(0, 5, new jpj(qre.f(R.string.IDS_hwh_motiontrack_avg_slope), null));
        qpvVar.putColumnHeaderData(0, 6, new jpj(qre.f(R.string.IDS_hwh_motiontrack_slope_time), null));
    }

    public static void d(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, SlopeInfo slopeInfo) {
        if (qpvVar == null || i < 0 || slopeInfo == null) {
            LogUtil.j("Track_AltitudeIntervalUtils", "putSlopeInfoToTableSet with error parameter tableDataSet:", qpvVar, " rowIndex:", Integer.valueOf(i), " slopeInfo:", slopeInfo);
            return;
        }
        qpvVar.putRowHeaderData(i, 0, new jpn(a(slopeInfo.getNumber())));
        qpvVar.putContentData(i, 1, new jpn(e(slopeInfo.getLevel()), true, d(slopeInfo.getLevel())));
        qpvVar.putContentData(i, 2, new jpn(e(slopeInfo.getDistance())));
        qpvVar.putContentData(i, 3, new jpn(e(slopeInfo.getStartDistance())));
        qpvVar.putContentData(i, 4, new jpn(c(slopeInfo.getAscent())));
        qpvVar.putContentData(i, 5, new jpn(UnitUtil.e(slopeInfo.getGradient(), 2, 0)));
        qpvVar.putContentData(i, 6, new jpn(c(slopeInfo.getClimbTime())));
    }

    private static String a(int i) {
        if (i == -1) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        return UnitUtil.e(i, 1, 0);
    }

    private static String e(int i) {
        if (i < 1 || i > 5) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        if (i == 5) {
            return "HC";
        }
        return UnitUtil.e(f38252b.get(Integer.valueOf(i)).intValue(), 1, 0);
    }

    private static String c(long j) {
        if (j == -1) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        return jpq.b(TimeUnit.MILLISECONDS.toMillis(j));
    }

    private static int d(int i) {
        if (i == 1) {
            return Color.argb(255, 0, 125, 255);
        }
        if (i == 2) {
            return Color.argb(255, 100, 187, 92);
        }
        if (i == 3) {
            return Color.argb(255, 255, 152, 0);
        }
        if (i == 4) {
            return Color.argb(255, 251, 101, 34);
        }
        if (i == 5) {
            return Color.argb(255, 222, 55, 55);
        }
        return Color.argb(153, 0, 0, 0);
    }

    public static String e(double d) {
        if (d < 0.0d) {
            LogUtil.a("Track_AltitudeIntervalUtils", "getKmValueForUnit value invalid: ", Double.valueOf(d));
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        double dE = d / 1000.0d;
        if (UnitUtil.f()) {
            dE = UnitUtil.e(dE, 3);
        }
        return UnitUtil.e(dE, 1, 2);
    }

    public static String c(double d) {
        if (d < 0.0d) {
            LogUtil.a("Track_AltitudeIntervalUtils", "getMeterValueForUnit value invalid: ", Double.valueOf(d));
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        if (UnitUtil.f()) {
            d = UnitUtil.e(d, 1);
        }
        return UnitUtil.e(d, 1, 1);
    }

    private static String a() {
        if (UnitUtil.f()) {
            return qre.f(R.string.IDS_hwh_motiontrack_kilo_meter_imperial_unit);
        }
        return qre.f(R.string.IDS_hwh_motiontrack_kilo_meter_unit);
    }

    private static String c() {
        if (UnitUtil.f()) {
            return qre.f(R.string.IDS_hwh_motiontrack_meter_imperial_unit);
        }
        return qre.f(R.string.IDS_hwh_motiontrack_meter_unit);
    }
}
