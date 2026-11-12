package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.Date;

/* JADX INFO: loaded from: classes41.dex */
public class pay {
    public static String b(Context context, TotalRecord totalRecord) {
        if (totalRecord == null || context == null) {
            return "";
        }
        int days = totalRecord.getDays();
        long startDate = totalRecord.getStartDate();
        String strA = UnitUtil.a(new Date(startDate), 20);
        if (days <= 0 || startDate <= 0) {
            return context.getResources().getString(R.string.IDS_plugin_achievement_sync_data_tip);
        }
        return context.getString(R.string.IDS_plugin_achievement_now, strA);
    }

    public static String e(Context context, TotalRecord totalRecord) {
        if (totalRecord == null || context == null) {
            return "";
        }
        int days = totalRecord.getDays();
        return context.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_days, days, UnitUtil.e(days, 1, 0));
    }

    public static String j(Context context, TotalRecord totalRecord) {
        if (totalRecord == null || context == null) {
            return "";
        }
        double distance = totalRecord.getDistance();
        if (UnitUtil.f()) {
            return context.getString(R.string.IDS_hw_show_sport_kms_string_en, UnitUtil.e(UnitUtil.e(distance, 3), 1, 0));
        }
        return context.getString(R.string.IDS_plugin_achievement_report_total_distance_num, UnitUtil.e(distance, 1, 0));
    }

    public static String f(Context context, TotalRecord totalRecord) {
        if (totalRecord == null || context == null) {
            return "";
        }
        return context.getResources().getString(R.string.IDS_plugin_achievement_report_total_distance_desc, pba.e(totalRecord.getDistance()));
    }

    public static String i(Context context, TotalRecord totalRecord) {
        if (totalRecord == null || context == null) {
            return "";
        }
        double steps = totalRecord.getSteps();
        return context.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_report_best_day_steps_num, (int) steps, UnitUtil.e(steps, 1, 0));
    }

    public static String h(Context context, TotalRecord totalRecord) {
        if (Utils.o() || totalRecord == null || context == null) {
            return "";
        }
        return context.getString(R.string.IDS_plugin_achievement_report_total_steps_desc, UnitUtil.e(totalRecord.getStepsRanking(), 2, 2));
    }

    public static String d(Context context, TotalRecord totalRecord) {
        if (totalRecord == null || context == null) {
            return "";
        }
        return context.getString(R.string.IDS_plugin_achievement_report_total_calorie_kCal_num, UnitUtil.e(totalRecord.acquireCalorie() / 1000.0d, 1, 0));
    }

    public static String a(Context context, TotalRecord totalRecord) {
        if (totalRecord == null || context == null) {
            return "";
        }
        double dAcquireCalorie = (totalRecord.acquireCalorie() / 1000.0d) / 300.0d;
        String strE = UnitUtil.e(dAcquireCalorie, 1, 1);
        int iCeil = 0;
        String strC = UnitUtil.c(dAcquireCalorie, 1, 1, false);
        if (!TextUtils.isEmpty(strC)) {
            try {
                iCeil = (int) Math.ceil(Double.parseDouble(strC));
            } catch (NumberFormatException unused) {
                LogUtil.e("PLGACHIEVE_TotalSportStrBuilder", "acquireSumCaloriesDescFromTotalRecord: exception -> " + strC);
            }
        }
        return context.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_report_total_wasted_calorie_desc, iCeil, strE);
    }

    public static TotalRecord d() {
        TotalRecord totalRecord = new TotalRecord();
        totalRecord.setDays(0);
        totalRecord.setDistance(0.0d);
        totalRecord.setStartDate(System.currentTimeMillis());
        totalRecord.setSteps(0.0d);
        totalRecord.setStepsRanking(0.0d);
        totalRecord.saveCalorie(0.0d);
        return totalRecord;
    }

    public static String c(Context context, TotalRecord totalRecord) {
        if (totalRecord == null || context == null) {
            return "";
        }
        double distance = totalRecord.getDistance() / 42.195d;
        return context.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_marathon_desc, (int) distance, UnitUtil.e(distance, 1, 1));
    }
}
