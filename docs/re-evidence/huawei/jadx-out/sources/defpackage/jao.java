package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.healthcloud.plugintrack.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jao {
    public static String b(Context context, int i) {
        if (i > 0) {
            return UnitUtil.e(i, 1, 0);
        }
        return context.getString(R.string.IDS_motiontrack_show_invalid_data);
    }

    public static String c(Context context, String str) {
        return TextUtils.isEmpty(str) ? context.getString(R.string.IDS_motiontrack_show_invalid_data) : str;
    }

    public static String a(Context context) {
        if (UnitUtil.f()) {
            return context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        }
        return context.getResources().getString(R.string.IDS_aw_version2_meter_per_second);
    }

    public static String d(Context context, int i) {
        if (i > 0) {
            return jpq.d(i);
        }
        return context.getString(R.string.IDS_motiontrack_show_invalid_data);
    }

    public static String e(Context context, int i) {
        if (i == 274) {
            if (UnitUtil.f()) {
                return String.format(context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100), new Object[0]);
            }
            return String.format(String.format(context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500), new Object[0]), new Object[0]);
        }
        if (i == 266 || i == 262) {
            return UnitUtil.f() ? context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100) : context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100);
        }
        if (UnitUtil.f()) {
            return "/" + context.getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        }
        return "/" + context.getString(R.string.IDS_motiontrack_show_sport_unit_km);
    }

    public static String a(Context context, int i) {
        if (i == 274) {
            if (UnitUtil.f()) {
                return context.getString(R.string.IDS_hwh_motiontrack_swim_pace_with_unit_mi, 100);
            }
            return context.getString(R.string.IDS_hwh_motiontrack_swim_pace_with_unit, 500);
        }
        if (i == 266 || i == 262) {
            if (UnitUtil.f()) {
                return context.getString(R.string.IDS_hwh_motiontrack_swim_pace_with_unit_mi, 100);
            }
            return context.getString(R.string.IDS_hwh_motiontrack_swim_pace_with_unit, 100);
        }
        if (UnitUtil.f()) {
            return context.getString(R.string.IDS_hwh_motiontrack_show_pace_mi_hour);
        }
        return context.getString(R.string.IDS_hwh_motiontrack_show_pace_km_hour);
    }

    public static String c(Context context, int i) {
        if (i == 266 || i == 262) {
            if (UnitUtil.f()) {
                return context.getString(R.string.IDS_hwh_motiontrack_swim_distance_yard);
            }
            return context.getString(R.string.IDS_hwh_motiontrack_swim_distance_meter);
        }
        if (UnitUtil.f()) {
            return context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_mi);
        }
        return context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_km);
    }

    public static float e(float f, int i) {
        double dC;
        if (i == 262 || i == 266) {
            dC = UnitUtil.c(f, 2);
        } else {
            dC = UnitUtil.c(f, 3);
        }
        return (float) dC;
    }

    public static String c(Integer num, Context context) {
        if (num == null) {
            return context.getString(R.string.IDS_motiontrack_show_invalid_data);
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return context.getResources().getString(R.string.IDS_hwh_motiontrack_breaststroke);
        }
        if (iIntValue == 3) {
            return context.getResources().getString(R.string.IDS_hwh_motiontrack_butterfly_stroke);
        }
        if (iIntValue == 4) {
            return context.getResources().getString(R.string.IDS_hwh_motiontrack_backstroke);
        }
        if (iIntValue == 5) {
            return context.getResources().getString(R.string.IDS_hwh_motiontrack_medley);
        }
        return context.getResources().getString(R.string.IDS_hwh_motiontrack_freestyle);
    }
}
