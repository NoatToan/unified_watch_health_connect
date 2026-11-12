package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.report.bean.ReportClimbData;
import com.huawei.pluginachievement.report.bean.ReportRideData;
import com.huawei.pluginachievement.report.bean.ReportRunData;
import com.huawei.pluginachievement.report.bean.ReportSwimData;
import com.huawei.pluginachievement.report.bean.ReportWalkData;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class pbb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Integer[] f45109b = {Integer.valueOf(R.color.achieve_sport_type_climbing_color), Integer.valueOf(R.color.achieve_sport_type_run_color), Integer.valueOf(R.color.achieve_sport_type_foot_color), Integer.valueOf(R.color.achieve_sport_type_cross_color), Integer.valueOf(R.color.achieve_sport_type_swim_color), Integer.valueOf(R.color.achieve_sport_type_rowing_machine_color), Integer.valueOf(R.color.achieve_sport_type_elliptical_color), Integer.valueOf(R.color.achieve_sport_type_bike_color), Integer.valueOf(R.color.achieve_sport_type_fitness_color), Integer.valueOf(R.color.achieve_sport_type_other_one_color), Integer.valueOf(R.color.achieve_sport_type_walk_color), Integer.valueOf(R.color.achieve_sport_type_other_sec_color), Integer.valueOf(R.color.achieve_sport_type_other_three_color), Integer.valueOf(R.color.achieve_sport_type_fourth_color), Integer.valueOf(R.color.achieve_sport_type_five_color), Integer.valueOf(R.color.achieve_sport_type_six_color)};

    public static Drawable c(Context context, int i, int i2) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        return drawable == null ? drawable : b(drawable, i2);
    }

    public static Drawable b(Drawable drawable, int i) {
        if (drawable == null) {
            return drawable;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawableWrap, i);
        return drawableWrap;
    }

    public static void a(List<ozz> list, Map<String, Integer> map) {
        ArrayList arrayList = new ArrayList(map.entrySet());
        int iIntValue = f45109b[0].intValue();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer[] numArr = f45109b;
            if (numArr.length > i) {
                iIntValue = numArr[i].intValue();
            }
            list.add(c(((String) ((Map.Entry) arrayList.get(i)).getKey()) + "x" + ((Map.Entry) arrayList.get(i)).getValue(), ((Integer) ((Map.Entry) arrayList.get(i)).getValue()).intValue(), 0, BaseApplication.b().getResources().getColor(iIntValue)));
        }
    }

    public static void b(Context context, List<Integer> list, List<String> list2, ArrayList<String> arrayList) {
        if (context == null || list == null || njy.e(arrayList)) {
            return;
        }
        if (arrayList.contains("1")) {
            list.add(Integer.valueOf(R.drawable.img_weekly_the_whole_body));
            list2.add(context.getResources().getString(R.string.IDS_report_sug_whole_body));
        }
        if (arrayList.contains("2")) {
            list.add(Integer.valueOf(R.drawable.img_weekly_chest));
            list2.add(context.getResources().getString(R.string.IDS_report_sug_action_chest));
        }
        if (arrayList.contains("16")) {
            list.add(Integer.valueOf(R.drawable.img_weekly_shoulder));
            list2.add(context.getResources().getString(R.string.IDS_report_sug_action_shoulder));
        }
        if (arrayList.contains("4")) {
            list.add(Integer.valueOf(R.drawable.img_weekly_backside));
            list2.add(context.getResources().getString(R.string.IDS_report_sug_action_back));
        }
        if (arrayList.contains("128")) {
            list.add(Integer.valueOf(R.drawable.img_weekly_arm));
            list2.add(context.getResources().getString(R.string.IDS_report_sug_action_arm));
        }
        if (arrayList.contains("256")) {
            list.add(Integer.valueOf(R.drawable.img_weekly_the_abdomen));
            list2.add(context.getResources().getString(R.string.IDS_report_sug_action_abdomen));
        }
        if (arrayList.contains(HealthZonePushReceiver.PRESSURE_NOTIFY)) {
            list.add(Integer.valueOf(R.drawable.img_weekly_waist));
            list2.add(context.getResources().getString(R.string.IDS_report_sug_action_waist));
        }
        if (arrayList.contains("64")) {
            list2.add(context.getResources().getString(R.string.IDS_report_sug_action_hips));
            list.add(Integer.valueOf(R.drawable.img_weekly_hip));
        }
        if (arrayList.contains("8")) {
            list.add(Integer.valueOf(R.drawable.img_weekly_leg));
            list2.add(context.getResources().getString(R.string.IDS_report_sug_action_leg));
        }
        if (arrayList.contains("512")) {
            list.add(Integer.valueOf(R.drawable.img_weekly_neck));
            list2.add(context.getResources().getString(R.string.IDS_report_sug_action_neck));
        }
    }

    private static ozz c(String str, int i, int i2, int i3) {
        ozz ozzVar = new ozz();
        ozzVar.c(str);
        ozzVar.b(i);
        ozzVar.c(i2);
        ozzVar.d(i3);
        ozzVar.a(R.drawable.fitness_sport_dot);
        return ozzVar;
    }

    public static List<pac> c(Context context, ReportRunData reportRunData) {
        ArrayList arrayList = new ArrayList(16);
        if (context != null && reportRunData != null) {
            if (reportRunData.getSumDistance() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_fitness_total_distance_data_title), a(reportRunData.getSumDistance()), c(), ""));
            }
            if (reportRunData.getSumTime() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), c(reportRunData.getSumTime()), c(context, reportRunData.getSumTime()), ""));
            }
            if (reportRunData.getMaxDistance() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_report_max_single_distance), a(reportRunData.getMaxDistance()), c(), ""));
            }
            if (reportRunData.getBestPace() > 0.0f && paw.b(reportRunData.getBestPace(), 3.4028234663852886E38d) != 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_report_single_best_pace), izn.a(e(reportRunData)), "", ""));
            }
            b(context, arrayList, reportRunData);
        }
        return arrayList;
    }

    private static float e(ReportRunData reportRunData) {
        if (reportRunData == null) {
            return 0.0f;
        }
        if (UnitUtil.f()) {
            return reportRunData.getBritishBestPace();
        }
        return reportRunData.getBestPace();
    }

    public static String c(Context context, long j) {
        if (j > 3600) {
            return context.getResources().getString(R.string.IDS_messagecenter_time_hour_value);
        }
        return context.getResources().getString(R.string.IDS_min);
    }

    public static String c(long j) {
        if (j > 3600) {
            return UnitUtil.e((j * 1.0d) / 3600.0d, 1, 1);
        }
        return UnitUtil.e((j * 1.0d) / 60.0d, 1, 2);
    }

    private static void b(Context context, List<pac> list, ReportRunData reportRunData) {
        if (reportRunData.getFiveKmMinTime() > 0.0d && paw.b(reportRunData.getFiveKmMinTime(), Double.MAX_VALUE) != 0) {
            list.add(a(String.format(Locale.ROOT, context.getString(R.string.IDS_plugin_achievement_report_3km_pace_record), 5), paw.d((int) (reportRunData.getFiveKmMinTime() + 0.5d)), "", ""));
        }
        if (reportRunData.getTenKmMinTime() > 0.0d && paw.b(reportRunData.getTenKmMinTime(), Double.MAX_VALUE) != 0) {
            list.add(a(String.format(Locale.ROOT, context.getString(R.string.IDS_plugin_achievement_report_3km_pace_record), 10), paw.d((int) (reportRunData.getTenKmMinTime() + 0.5d)), "", ""));
        }
        if (reportRunData.getHalfMarathonCount() > 0 && reportRunData.getHalfMarathonMinTime() > 0.0d && paw.b(reportRunData.getHalfMarathonMinTime(), Double.MAX_VALUE) != 0) {
            list.add(a(context.getResources().getString(R.string.IDS_start_track_show_distance_half_marathon), UnitUtil.e(reportRunData.getHalfMarathonCount(), 1, 0), context.getResources().getString(R.string.IDS_awake_times), context.getResources().getString(R.string.IDS_report_pace_record_desc, paw.d((int) (reportRunData.getHalfMarathonMinTime() + 0.5d)))));
        }
        if (reportRunData.getFullMarathonCount() <= 0 || reportRunData.getFullMarathonMinTime() <= 0.0d || paw.b(reportRunData.getFullMarathonMinTime(), Double.MAX_VALUE) == 0) {
            return;
        }
        list.add(a(context.getResources().getString(R.string.IDS_start_track_show_distance_marathon), UnitUtil.e(reportRunData.getFullMarathonCount(), 1, 0), context.getResources().getString(R.string.IDS_awake_times), context.getResources().getString(R.string.IDS_report_pace_record_desc, paw.d((int) (reportRunData.getFullMarathonMinTime() + 0.5d)))));
    }

    public static String a(int i) {
        double dC = paw.c(i);
        return UnitUtil.f() ? UnitUtil.e(UnitUtil.e(dC, 3), 1, 2) : UnitUtil.e(dC, 1, 2);
    }

    public static String a(double d) {
        return UnitUtil.f() ? UnitUtil.e(UnitUtil.e(d, 3), 1, 2) : UnitUtil.e(d, 1, 2);
    }

    public static String c() {
        if (UnitUtil.f()) {
            return BaseApplication.b().getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        }
        return BaseApplication.b().getString(R.string.IDS_motiontrack_show_sport_unit_km);
    }

    public static pac a(String str, String str2, String str3, String str4) {
        pac pacVar = new pac();
        if (!TextUtils.isEmpty(str)) {
            pacVar.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            pacVar.c(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            pacVar.b(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            pacVar.d(str4);
        }
        return pacVar;
    }

    public static List<pac> a(Context context, ReportRideData reportRideData) {
        ArrayList arrayList = new ArrayList(16);
        if (context == null || reportRideData == null) {
            LogUtil.j("AchieveSportTypeDataHelp", "reportSportType reportRideData is null");
            return arrayList;
        }
        if (reportRideData.getSumDistance() > 0) {
            arrayList.add(a(context.getResources().getString(R.string.IDS_fitness_total_distance_data_title), a(reportRideData.getSumDistance()), c(), ""));
        }
        if (reportRideData.getSumTime() > 0) {
            arrayList.add(a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), c(reportRideData.getSumTime()), c(context, reportRideData.getSumTime()), ""));
        }
        if (reportRideData.getSumCreepingWave() > 0) {
            arrayList.add(a(context.getResources().getString(R.string.IDS_hwh_motiontrack_total_climbed), UnitUtil.e(((double) reportRideData.getSumCreepingWave()) / 10.0d, 1, 2), context.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit), ""));
        }
        if (reportRideData.getSumDescent() > 0.0f) {
            arrayList.add(a(context.getResources().getString(R.string.IDS_hwh_motiontrack_total_descent), UnitUtil.e(((double) reportRideData.getSumDescent()) / 10.0d, 1, 2), context.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit), ""));
        }
        if (reportRideData.getMaxDistance() > 0) {
            arrayList.add(a(context.getResources().getString(R.string.IDS_report_max_single_distance), a(reportRideData.getMaxDistance()), c(), ""));
        }
        a(context, arrayList, reportRideData);
        return arrayList;
    }

    private static void a(Context context, List<pac> list, ReportRideData reportRideData) {
        if (list == null || reportRideData == null || reportRideData.getBestPace() <= 0.0d) {
            return;
        }
        String string = context.getString(R.string.IDS_motiontrack_show_detail_average_speed);
        String strA = paw.a(reportRideData.getBestPace());
        if (UnitUtil.f()) {
            strA = UnitUtil.e(UnitUtil.e(ote.d(strA), 3), 1, 2);
            string = context.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        }
        list.add(a(context.getResources().getString(R.string.IDS_plugin_achievement_report_cycle_speed_record), strA, string, ""));
        LogUtil.a("AchieveSportTypeDataHelp", "setRideBestPace  contentValue = ", strA);
    }

    public static Drawable d(int i) {
        return qqz.e(BaseApplication.b(), i);
    }

    public static Drawable b(int i) {
        jry jryVarA = jry.a(BaseApplication.b());
        Drawable drawable = BaseApplication.b().getDrawable(R.drawable.ic_health_list_outdoor_running);
        if (jryVarA.b(i) == null || jryVarA.b(i).getHistoryList() == null) {
            LogUtil.j("AchieveSportTypeDataHelp", "getSportTypeInfoById =null sportType= ", Integer.valueOf(i));
            return drawable;
        }
        return jryVarA.b(i).getHistoryList().getItemDrawable();
    }

    public static List<pac> e(Context context, ReportSwimData reportSwimData) {
        ArrayList arrayList = new ArrayList(16);
        if (context != null && reportSwimData != null) {
            if (reportSwimData.getSumDistance() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_fitness_total_distance_data_title), a(reportSwimData.getSumDistance()), c(), ""));
            }
            if (reportSwimData.getSumTime() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), c(reportSwimData.getSumTime()), c(context, reportSwimData.getSumTime()), ""));
            }
            if (reportSwimData.getMaxDistance() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_report_max_single_distance), a(reportSwimData.getMaxDistance()), c(), ""));
            }
            b(context, arrayList, reportSwimData);
        }
        return arrayList;
    }

    private static void b(Context context, List<pac> list, ReportSwimData reportSwimData) {
        if (context == null || reportSwimData == null || list == null || reportSwimData.getMaxStroke() == 0) {
            return;
        }
        list.add(a(context.getResources().getString(R.string.IDS_hwh_motiontrack_main_style), jaa.b(context.getResources(), reportSwimData.getMaxStroke()), "", ""));
    }

    public static List<pac> b(Context context, ReportWalkData reportWalkData) {
        ArrayList arrayList = new ArrayList(16);
        if (context != null && reportWalkData != null) {
            if (reportWalkData.getSumDistance() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_fitness_total_distance_data_title), a(reportWalkData.getSumDistance()), c(), ""));
            }
            if (reportWalkData.getSumTime() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), c(reportWalkData.getSumTime()), c(context, reportWalkData.getSumTime()), ""));
            }
            if (reportWalkData.getMaxDistance() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_report_max_single_distance), a(reportWalkData.getMaxDistance()), c(), ""));
            }
            if (reportWalkData.getMaxStepRate() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_report_best_step_frequency), UnitUtil.e(reportWalkData.getMaxStepRate(), 1, 0), context.getResources().getString(R.string.IDS_motiontrack_show_detail_stempsmin), ""));
            }
        }
        return arrayList;
    }

    public static List<pac> d(Context context, ReportClimbData reportClimbData) {
        ArrayList arrayList = new ArrayList(16);
        if (context != null && reportClimbData != null) {
            if (reportClimbData.getSumDistance() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_fitness_total_distance_data_title), a(reportClimbData.getSumDistance()), c(), ""));
            }
            if (reportClimbData.getSumTime() > 0) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), c(reportClimbData.getSumTime()), c(context, reportClimbData.getSumTime()), ""));
            }
            if (reportClimbData.getMaxHeight() > 0.0f) {
                arrayList.add(a(context.getResources().getString(R.string.IDS_report_max_altitude), a(reportClimbData.getMaxHeight()), context.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit), ""));
            }
        }
        return arrayList;
    }
}
