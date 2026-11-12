package defpackage;

import android.content.Context;
import com.huawei.pluginachievement.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes41.dex */
public class pbc {
    public static String a(Context context, int i) {
        if (context == null) {
            return "";
        }
        return context.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_report_best_day_steps_num, i, UnitUtil.e(i, 1, 0));
    }

    public static String a(double d, Context context) {
        return e(paw.c(d / 1000.0d), context);
    }

    public static String e(double d, int i, Context context) {
        switch (i) {
            case 12:
            case 13:
                return context.getResources().getQuantityString(R.plurals.IDS_achieve_report_unit_count, (int) d, UnitUtil.e(d, 1, 0));
            case 14:
                return context.getResources().getQuantityString(R.plurals.IDS_achieve_rope_number_minute, (int) d, UnitUtil.e(d, 1, 0));
            case 15:
                return context.getResources().getQuantityString(R.plurals.IDS_achieve_rope_number_duration, (int) d, UnitUtil.e(d, 1, 0));
            default:
                return "";
        }
    }

    public static String e(double d, Context context) {
        if (context == null) {
            return "";
        }
        if (UnitUtil.f()) {
            return context.getString(R.string.IDS_hw_show_sport_kms_string_en, UnitUtil.e(UnitUtil.e(d, 3), 1, 2));
        }
        return context.getString(R.string.IDS_plugin_achievement_report_total_distance_num, UnitUtil.e(d, 1, 2));
    }

    public static String e(double d) {
        double dC = paw.c(d / 1000.0d);
        if (UnitUtil.f()) {
            return UnitUtil.e(UnitUtil.e(dC, 3), 1, 2);
        }
        return UnitUtil.e(dC, 1, 2);
    }
}
