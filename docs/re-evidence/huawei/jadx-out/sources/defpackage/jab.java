package defpackage;

import android.content.Context;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.VastTag;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jab {
    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, List<jbp> list) {
        if (qpvVar == null) {
            LogUtil.j("Track_PaceIntervalUtils", "tableDataSet == null");
            return;
        }
        if (list == null) {
            LogUtil.j("Track_PaceIntervalUtils", "zoneStatisticList == null");
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_PaceIntervalUtils", "addRunningPaceTableTitle with context is null, pls check");
            qpvVar.putRowColumnHeaderData(0, 0, null);
            return;
        }
        LogUtil.a("Track_PaceIntervalUtils", "title count", Integer.valueOf(list.size()));
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(context.getResources().getString(R.string.IDS_hwh_motiontrack_heart_rate_zone)));
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            qpvVar.putColumnHeaderData(0, i2, e(list.get(i).g(), context));
            i = i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    private static jpj e(String str, Context context) {
        str.hashCode();
        switch (str) {
            case "GROUND_CONTACT_TIME":
                return new jpj(context.getResources().getString(R.string.IDS_running_posture_ground_contact_time), a(context));
            case "SWING_ANGLE":
                return new jpj(context.getResources().getString(R.string.IDS_sport_noun_explain_paobuzhitai_baidongjiaodu_title), null);
            case "Duration":
                return new jpj(context.getResources().getString(R.string.IDS_data_type_duration), null);
            case "HEART_RATE":
                return new jpj(context.getResources().getString(R.string.IDS_main_watch_heart_rate_string), e(context));
            case "STEP_RATE":
                return new jpj(context.getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_bupin), c(context));
            case "ACTIVE_PEAK":
                return new jpj(context.getResources().getString(R.string.IDS_bolt_shock_peak), context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_bolt_shock_peak_unit)));
            case "EVERSION_EXCURSION":
                return new jpj(context.getResources().getString(R.string.IDS_sport_noun_explain_paobuzhitai_waifanfudu_title), null);
            case "GROUND_IMPACT_ACCELERATION":
                return new jpj(context.getResources().getString(R.string.IDS_running_posture_ground_impact_acceleration), context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_gravity_unit)));
            default:
                LogUtil.j("Track_PaceIntervalUtils", "type exception", str);
                return null;
        }
    }

    public static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, List<jbp> list) {
        if (qpvVar == null || njy.e(list)) {
            LogUtil.j("Track_PaceIntervalUtils", "addRunningPaceToTableSet with error parameter tableDataSet:", qpvVar, " index:", Integer.valueOf(i));
        } else {
            a(qpvVar, qpvVar.getRowsCount(), i, list);
        }
    }

    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, int i2, List<jbp> list) {
        if (qpvVar == null || i < 0 || njy.e(list)) {
            LogUtil.j("Track_PaceIntervalUtils", "putRunningPaceToTableSet with error parameter tableDataSet:", qpvVar, " trackRunningSpeed:", Integer.valueOf(i2), " rowIndex:", Integer.valueOf(i));
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_PaceIntervalUtils", "putRunningPaceToTableSet with context is null");
            return;
        }
        jpn jpnVar = new jpn(context.getResources().getString(R.string.IDS_hwh_motiontrack_range_pre_number, Integer.valueOf(i2)));
        qpvVar.putRowHeaderData(i, 0, jpnVar);
        LogUtil.a("Track_PaceIntervalUtils", "column size= ", Integer.valueOf(list.size()));
        for (int i3 = 0; i3 < list.size(); i3++) {
            c(qpvVar, i, list, i3, i2);
        }
    }

    private static void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, List<jbp> list, int i2, int i3) {
        int i4 = i2 + 1;
        if (i3 == 1) {
            qpvVar.putContentData(i, i4, new jpn(b(list.get(i2).e(), list.get(i2).g())));
            return;
        }
        if (i3 == 2) {
            qpvVar.putContentData(i, i4, new jpn(b(list.get(i2).d(), list.get(i2).g())));
            return;
        }
        if (i3 == 3) {
            qpvVar.putContentData(i, i4, new jpn(b(list.get(i2).b(), list.get(i2).g())));
            return;
        }
        if (i3 == 4) {
            qpvVar.putContentData(i, i4, new jpn(b(list.get(i2).a(), list.get(i2).g())));
        } else if (i3 == 5) {
            qpvVar.putContentData(i, i4, new jpn(b(list.get(i2).c(), list.get(i2).g())));
        } else {
            LogUtil.j("Track_PaceIntervalUtils", "exception index ", Integer.valueOf(i3));
        }
    }

    private static String b(float f, String str) {
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_PaceIntervalUtils", "checkDataValidity context == null");
            return UnitUtil.e(f, 1, 0);
        }
        if (f == 0.0f) {
            return context.getString(R.string.IDS_motiontrack_show_invalid_data);
        }
        if ("EVERSION_EXCURSION".equals(str) || "SWING_ANGLE".equals(str)) {
            int i = (int) f;
            return context.getResources().getQuantityString(R.plurals.IDS_degree_unit_with_value, i, Integer.valueOf(i));
        }
        if (VastTag.DURATION.equals(str)) {
            return jpq.b((long) (f * 1000.0f));
        }
        return UnitUtil.e(f, 1, (f * 10.0f) % 10.0f > 0.0f ? 1 : 0);
    }

    private static String e(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
    }

    private static String c(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_motiontrack_show_detail_stempsmin));
    }

    private static String a(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_msec_unit));
    }
}
