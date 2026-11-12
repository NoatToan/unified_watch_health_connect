package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.WeekAndMonthRecord;
import com.huawei.pluginachievement.report.bean.ReportClimbData;
import com.huawei.pluginachievement.report.bean.ReportCrossTrainerData;
import com.huawei.pluginachievement.report.bean.ReportDataBean;
import com.huawei.pluginachievement.report.bean.ReportFitnessData;
import com.huawei.pluginachievement.report.bean.ReportHikingData;
import com.huawei.pluginachievement.report.bean.ReportOtherData;
import com.huawei.pluginachievement.report.bean.ReportRideData;
import com.huawei.pluginachievement.report.bean.ReportRowData;
import com.huawei.pluginachievement.report.bean.ReportRunData;
import com.huawei.pluginachievement.report.bean.ReportSwimData;
import com.huawei.pluginachievement.report.bean.ReportTrailRunData;
import com.huawei.pluginachievement.report.bean.ReportWalkData;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class pbf {
    private static final Integer[] d = {Integer.valueOf(R.color.achieve_sport_type_run_color), Integer.valueOf(R.color.achieve_sport_type_fitness_color), Integer.valueOf(R.color.achieve_sport_type_foot_color), Integer.valueOf(R.color.achieve_sport_type_climbing_color), Integer.valueOf(R.color.achieve_sport_type_swim_color), Integer.valueOf(R.color.achieve_sport_type_cross_color), Integer.valueOf(R.color.achieve_sport_type_rowing_machine_color), Integer.valueOf(R.color.achieve_sport_type_elliptical_color), Integer.valueOf(R.color.achieve_sport_type_bike_color), Integer.valueOf(R.color.achieve_sport_type_other_one_color), Integer.valueOf(R.color.achieve_sport_type_walk_color), Integer.valueOf(R.color.achieve_sport_type_other_sec_color), Integer.valueOf(R.color.achieve_sport_type_other_three_color), Integer.valueOf(R.color.achieve_sport_type_fourth_color), Integer.valueOf(R.color.achieve_sport_type_five_color), Integer.valueOf(R.color.achieve_sport_type_six_color)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Integer[] f45117c = {Integer.valueOf(R.color.achieve_sport_type_run_back_color), Integer.valueOf(R.color.achieve_sport_type_fitness_back_color), Integer.valueOf(R.color.achieve_sport_type_foot_back_color), Integer.valueOf(R.color.achieve_sport_type_climbing_back_color4), Integer.valueOf(R.color.achieve_sport_type_swim_back_color), Integer.valueOf(R.color.achieve_sport_type_cross_back_color), Integer.valueOf(R.color.achieve_sport_type_rowing_machine_back_color), Integer.valueOf(R.color.achieve_sport_type_elliptical_back_color), Integer.valueOf(R.color.achieve_sport_type_bike_back_color), Integer.valueOf(R.color.achieve_sport_type_other_one_back_color), Integer.valueOf(R.color.achieve_sport_type_walk_back_color), Integer.valueOf(R.color.achieve_sport_type_other_sec_back_color), Integer.valueOf(R.color.achieve_sport_type_other_three_back_color), Integer.valueOf(R.color.achieve_sport_type_fourth_back_color), Integer.valueOf(R.color.achieve_sport_type_five_back_color), Integer.valueOf(R.color.achieve_sport_type_six_back_color)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Integer, Class> f45116b = new HashMap(16);

    public static Map<Integer, Class> a() {
        if (f45116b.size() == 0) {
            f45116b.put(2008, ReportRunData.class);
            f45116b.put(2009, ReportSwimData.class);
            f45116b.put(2010, ReportTrailRunData.class);
            f45116b.put(2011, ReportWalkData.class);
            f45116b.put(2001, ReportClimbData.class);
            f45116b.put(2002, ReportCrossTrainerData.class);
            f45116b.put(2003, ReportFitnessData.class);
            f45116b.put(2004, ReportHikingData.class);
            f45116b.put(2005, ReportOtherData.class);
            f45116b.put(2006, ReportRideData.class);
            f45116b.put(2007, ReportRowData.class);
        }
        return f45116b;
    }

    public static List<ozk> d(Context context, WeekAndMonthRecord weekAndMonthRecord, int i) {
        ArrayList<ReportDataBean> arrayListSubList;
        LogUtil.a("AchieveSportTypeViewHolder", "reportSportType getSportTypeBeanList enter, type == ", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList(16);
        ArrayList<ReportDataBean> arrayListE = pav.e(weekAndMonthRecord, i);
        if (njy.e(arrayListE)) {
            LogUtil.j("AchieveSportTypeViewHolder", "reportSportType reportDataDetailList is null.");
            return arrayList;
        }
        LogUtil.a("AchieveSportTypeViewHolder", "reportSportType reportDataDetailList size == ", Integer.valueOf(arrayListE.size()));
        if (arrayListE.size() > 16) {
            arrayListSubList = arrayListE;
            arrayListSubList = arrayListE.subList(0, 16);
        }
        arrayListSubList = arrayListE;
        if (njy.e(arrayListSubList)) {
            LogUtil.j("AchieveSportTypeViewHolder", "reportSportType reportDataList is null.");
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        ArrayList arrayList4 = new ArrayList(16);
        for (ReportDataBean reportDataBean : arrayListSubList) {
            if (reportDataBean instanceof ReportOtherData) {
                arrayList2.add((ReportOtherData) reportDataBean);
            } else {
                ozk ozkVarC = c(reportDataBean, arrayList3, arrayList4);
                if (ozkVarC != null) {
                    arrayList.add(ozkVarC);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList(Arrays.asList(f45117c));
        ArrayList arrayList6 = new ArrayList(Arrays.asList(d));
        int size = arrayList2.size();
        if (size > 0) {
            arrayList6.removeAll(arrayList3);
            arrayList5.removeAll(arrayList4);
            for (int i2 = 0; i2 < size; i2++) {
                if (njy.c(arrayList6, i2) && njy.c(arrayList5, i2)) {
                    arrayList.add(d(context, (ReportOtherData) arrayList2.get(i2), ((Integer) arrayList6.get(i2)).intValue(), ((Integer) arrayList5.get(i2)).intValue()));
                }
            }
        }
        return arrayList;
    }

    private static ozk c(ReportDataBean reportDataBean, List<Integer> list, List<Integer> list2) {
        Context contextB = BaseApplication.b();
        if (reportDataBean instanceof ReportRunData) {
            return d(contextB, (ReportRunData) reportDataBean, list, list2);
        }
        if (reportDataBean instanceof ReportWalkData) {
            return b(contextB, (ReportWalkData) reportDataBean, list, list2);
        }
        if (reportDataBean instanceof ReportRideData) {
            return c(contextB, (ReportRideData) reportDataBean, list, list2);
        }
        if (reportDataBean instanceof ReportSwimData) {
            return b(contextB, (ReportSwimData) reportDataBean, list, list2);
        }
        if (reportDataBean instanceof ReportClimbData) {
            return a(contextB, (ReportClimbData) reportDataBean, list, list2);
        }
        if (reportDataBean instanceof ReportCrossTrainerData) {
            return e(contextB, (ReportCrossTrainerData) reportDataBean, list, list2);
        }
        if (reportDataBean instanceof ReportFitnessData) {
            return b(contextB, (ReportFitnessData) reportDataBean, list, list2);
        }
        if (reportDataBean instanceof ReportHikingData) {
            return b(contextB, (ReportHikingData) reportDataBean, list, list2);
        }
        if (reportDataBean instanceof ReportRowData) {
            return c(contextB, (ReportRowData) reportDataBean, list, list2);
        }
        if (reportDataBean instanceof ReportTrailRunData) {
            return c(contextB, (ReportTrailRunData) reportDataBean, list, list2);
        }
        return null;
    }

    private static pab d(Context context, ReportRunData reportRunData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_run_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_run_back_color));
        pab pabVar = new pab();
        pabVar.c(d(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_run), e(reportRunData.getSportCount())));
        pabVar.b(reportRunData.getSportType());
        pabVar.c(reportRunData.getSportCount());
        pabVar.c(d(context, R.drawable.card_body_running));
        pabVar.d(context.getResources().getColor(R.color.achieve_sport_type_run_color));
        pabVar.a(context.getResources().getColor(R.color.achieve_sport_type_run_back_color));
        pabVar.a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_run));
        d(pabVar, R.drawable.title_label_run, R.drawable.circle_report_run);
        pabVar.a(pbb.c(context, reportRunData));
        return pabVar;
    }

    private static String d(String str, String str2) {
        if (LanguageUtil.f(BaseApplication.b())) {
            return str + "x" + str2;
        }
        if (LanguageUtil.ba(BaseApplication.b())) {
            return str + " " + str2;
        }
        return str + " x" + str2;
    }

    private static Drawable d(Context context, int i) {
        if (LanguageUtil.ba(context)) {
            return qqz.e(context, i);
        }
        return context.getResources().getDrawable(i);
    }

    private static pab b(Context context, ReportWalkData reportWalkData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_walk_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_walk_back_color));
        pab pabVar = new pab();
        pabVar.c(d(context.getResources().getString(R.string.IDS_main_time_line_walking), e(reportWalkData.getSportCount())));
        pabVar.b(reportWalkData.getSportType());
        pabVar.c(reportWalkData.getSportCount());
        pabVar.c(d(context, R.drawable.card_body_walking));
        pabVar.d(context.getResources().getColor(R.color.achieve_sport_type_walk_color));
        pabVar.a(context.getResources().getColor(R.color.achieve_sport_type_walk_back_color));
        pabVar.a(context.getResources().getString(R.string.IDS_main_time_line_walking));
        d(pabVar, R.drawable.title_label_walking, R.drawable.circle_report_walking);
        pabVar.a(pbb.b(context, reportWalkData));
        return pabVar;
    }

    private static pab c(Context context, ReportRideData reportRideData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_bike_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_bike_back_color));
        pab pabVar = new pab();
        pabVar.c(d(context.getResources().getString(R.string.IDS_hwh_start_track_sport_type_cycle), e(reportRideData.getSportCount())));
        pabVar.b(reportRideData.getSportType());
        pabVar.c(reportRideData.getSportCount());
        pabVar.c(d(context, R.drawable.card_body_cycling));
        pabVar.d(context.getResources().getColor(R.color.achieve_sport_type_bike_color));
        pabVar.a(context.getResources().getColor(R.color.achieve_sport_type_bike_back_color));
        pabVar.a(context.getResources().getString(R.string.IDS_hwh_start_track_sport_type_cycle));
        d(pabVar, R.drawable.title_label_cycling, R.drawable.circle_report_cycling);
        pabVar.a(pbb.a(context, reportRideData));
        return pabVar;
    }

    private static pab b(Context context, ReportSwimData reportSwimData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_swim_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_swim_back_color));
        pab pabVar = new pab();
        pabVar.c(d(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_swim), e(reportSwimData.getSportCount())));
        pabVar.b(reportSwimData.getSportType());
        pabVar.c(reportSwimData.getSportCount());
        pabVar.c(d(context, R.drawable.card_body_swimming));
        pabVar.d(context.getResources().getColor(R.color.achieve_sport_type_swim_color));
        pabVar.a(context.getResources().getColor(R.color.achieve_sport_type_swim_back_color));
        pabVar.a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_swim));
        d(pabVar, R.drawable.title_label_swim, R.drawable.circle_report_swim);
        pabVar.a(pbb.e(context, reportSwimData));
        return pabVar;
    }

    private static pab a(Context context, ReportClimbData reportClimbData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_climbing_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_climbing_back_color4));
        pab pabVar = new pab();
        pabVar.c(d(context.getResources().getString(R.string.IDS_motiontrack_climb_hill_tip), e(reportClimbData.getSportCount())));
        pabVar.b(reportClimbData.getSportType());
        pabVar.c(reportClimbData.getSportCount());
        pabVar.c(d(context, R.drawable.card_body_climbing));
        pabVar.d(context.getResources().getColor(R.color.achieve_sport_type_climbing_color));
        pabVar.a(context.getResources().getColor(R.color.achieve_sport_type_climbing_back_color4));
        pabVar.a(context.getResources().getString(R.string.IDS_motiontrack_climb_hill_tip));
        d(pabVar, R.drawable.title_label_mountain_climbing, R.drawable.circle_report_mountain_climbing);
        pabVar.a(pbb.d(context, reportClimbData));
        return pabVar;
    }

    private static pab e(Context context, ReportCrossTrainerData reportCrossTrainerData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_elliptical_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_elliptical_back_color));
        pab pabVar = new pab();
        pabVar.c(d(context.getResources().getString(R.string.IDS_hwh_sport_type_cross_trainer), e(reportCrossTrainerData.getSportCount())));
        pabVar.b(reportCrossTrainerData.getSportType());
        pabVar.c(reportCrossTrainerData.getSportCount());
        pabVar.c(d(context, R.drawable.card_body_elliptical_machine));
        pabVar.d(context.getResources().getColor(R.color.achieve_sport_type_elliptical_color));
        pabVar.a(context.getResources().getColor(R.color.achieve_sport_type_elliptical_back_color));
        pabVar.a(context.getResources().getString(R.string.IDS_hwh_sport_type_cross_trainer));
        d(pabVar, R.drawable.title_label_elliptical_machine, R.drawable.circle_report_elliptical_machine);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), pbb.c(reportCrossTrainerData.getSumTime()), pbb.c(context, reportCrossTrainerData.getSumTime()), ""));
        if (reportCrossTrainerData.getMaxTime() > 0) {
            arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_report_longest_duration), String.valueOf(paw.d((int) reportCrossTrainerData.getMaxTime())), "", ""));
        }
        pabVar.a(arrayList);
        return pabVar;
    }

    private static ozt b(Context context, ReportFitnessData reportFitnessData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_fitness_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_fitness_back_color));
        ozt oztVar = new ozt();
        oztVar.c(d(context.getResources().getString(R.string.IDS_hwh_home_type_group_type_workout), e(reportFitnessData.getSportCount())));
        oztVar.b(-1);
        oztVar.c(reportFitnessData.getSportCount());
        oztVar.c(d(context, R.drawable.card_body_fitness_icon));
        oztVar.d(context.getResources().getColor(R.color.achieve_sport_type_fitness_color));
        oztVar.a(context.getResources().getColor(R.color.achieve_sport_type_fitness_back_color));
        oztVar.a(context.getResources().getString(R.string.IDS_hwh_home_type_group_type_workout));
        if (LanguageUtil.ba(context)) {
            oztVar.d(pbb.d(R.drawable.title_label_fitness));
            oztVar.e(pbb.d(R.drawable.circle_report_fitness));
        } else {
            oztVar.d(ContextCompat.getDrawable(context, R.drawable.title_label_fitness));
            oztVar.e(ContextCompat.getDrawable(context, R.drawable.circle_report_fitness));
        }
        ArrayList arrayList = new ArrayList(16);
        pbb.a(arrayList, reportFitnessData.getFirstLevelMap());
        oztVar.a(arrayList);
        oztVar.e(reportFitnessData.getMaxFirstLevel());
        oztVar.b(reportFitnessData.getMaxCourse());
        oztVar.f(UnitUtil.e(reportFitnessData.getSumTime() / 60.0f, 1, 2));
        oztVar.d(paw.d((int) reportFitnessData.getMaxTime()));
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        pbb.b(context, arrayList2, arrayList3, reportFitnessData.getMaxTrainingPoints());
        oztVar.d(arrayList2);
        oztVar.b(arrayList3);
        return oztVar;
    }

    private static pab b(Context context, ReportHikingData reportHikingData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_foot_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_foot_back_color));
        pab pabVar = new pab();
        pabVar.c(d(context.getResources().getString(R.string.IDS_hwh_sport_type_hiking), e(reportHikingData.getSportCount())));
        pabVar.b(reportHikingData.getSportType());
        pabVar.c(reportHikingData.getSportCount());
        pabVar.c(d(context, R.drawable.card_body_foot));
        pabVar.d(context.getResources().getColor(R.color.achieve_sport_type_foot_color));
        pabVar.a(context.getResources().getColor(R.color.achieve_sport_type_foot_back_color));
        pabVar.a(context.getResources().getString(R.string.IDS_hwh_sport_type_hiking));
        d(pabVar, R.drawable.title_label_on_foot, R.drawable.circle_report_label_foot);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_fitness_total_distance_data_title), pbb.a(reportHikingData.getSumDistance()), pbb.c(), ""));
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), pbb.c(reportHikingData.getSumTime()), pbb.c(context, reportHikingData.getSumTime()), ""));
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_report_max_single_distance), pbb.a(reportHikingData.getMaxDistance()), pbb.c(), ""));
        pabVar.a(arrayList);
        return pabVar;
    }

    private static String e(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    private static pab c(Context context, ReportRowData reportRowData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_rowing_machine_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_rowing_machine_back_color));
        pab pabVar = new pab();
        pabVar.c(d(context.getResources().getString(R.string.IDS_hwh_sport_type_row_machine), e(reportRowData.getSportCount())));
        pabVar.b(reportRowData.getSportType());
        pabVar.c(reportRowData.getSportCount());
        pabVar.c(d(context, R.drawable.card_body_rowing_machine));
        pabVar.d(context.getResources().getColor(R.color.achieve_sport_type_rowing_machine_color));
        pabVar.a(context.getResources().getColor(R.color.achieve_sport_type_rowing_machine_back_color));
        pabVar.a(context.getResources().getString(R.string.IDS_hwh_sport_type_row_machine));
        d(pabVar, R.drawable.title_label_rowing_machine, R.drawable.circle_report_rowing_machine);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), pbb.c(reportRowData.getSumTime()), pbb.c(context, reportRowData.getSumTime()), ""));
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_report_longest_duration), paw.d((int) reportRowData.getMaxTime()), "", ""));
        if (reportRowData.getMaxPaddle() > 0.0f) {
            arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_report_best_paddle_freq), e((int) reportRowData.getMaxPaddle()), context.getResources().getString(R.string.IDS_indoor_equip_paddle_unit_times_minute), ""));
        }
        if (reportRowData.getMaxPaddleTimes() > 0.0f) {
            arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_report_best_paddle_count), e((int) reportRowData.getMaxPaddleTimes()), context.getResources().getString(R.string.IDS_awake_times), ""));
        }
        pabVar.a(arrayList);
        return pabVar;
    }

    private static void d(pab pabVar, int i, int i2) {
        if (LanguageUtil.ba(BaseApplication.b())) {
            pabVar.d(pbb.d(i));
            pabVar.e(pbb.d(i2));
        } else {
            pabVar.d(ContextCompat.getDrawable(BaseApplication.b(), i));
            pabVar.e(ContextCompat.getDrawable(BaseApplication.b(), i2));
        }
    }

    public static ReportDataBean d(String str, int i) {
        Object objD = HiJsonUtil.d(str, (Class<Object>) a().get(Integer.valueOf(i)));
        ReportDataBean reportDataBean = objD instanceof ReportDataBean ? (ReportDataBean) objD : null;
        LogUtil.d("AchieveSportTypeViewHolder", "reportSportType getReport ", reportDataBean);
        return reportDataBean;
    }

    private static pab c(Context context, ReportTrailRunData reportTrailRunData, List<Integer> list, List<Integer> list2) {
        list.add(Integer.valueOf(R.color.achieve_sport_type_cross_color));
        list2.add(Integer.valueOf(R.color.achieve_sport_type_cross_back_color));
        pab pabVar = new pab();
        pabVar.c(d(context.getResources().getString(R.string.IDS_motiontrack_cross_country_race), e(reportTrailRunData.getSportCount())));
        pabVar.b(reportTrailRunData.getSportType());
        pabVar.c(reportTrailRunData.getSportCount());
        pabVar.c(d(context, R.drawable.card_body_cross_country_race));
        pabVar.d(context.getResources().getColor(R.color.achieve_sport_type_cross_color));
        pabVar.a(context.getResources().getColor(R.color.achieve_sport_type_cross_back_color));
        pabVar.a(context.getResources().getString(R.string.IDS_motiontrack_cross_country_race));
        d(pabVar, R.drawable.title_label_cross_country_race, R.drawable.circle_report_cross_country_race);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_fitness_total_distance_data_title), pbb.a(reportTrailRunData.getSumDistance()), pbb.c(), ""));
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), pbb.c(reportTrailRunData.getSumTime()), pbb.c(context, reportTrailRunData.getSumTime()), ""));
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_report_max_single_distance), pbb.a(reportTrailRunData.getMaxDistance()), pbb.c(), ""));
        pabVar.a(arrayList);
        return pabVar;
    }

    private static pab d(Context context, ReportOtherData reportOtherData, int i, int i2) {
        pab pabVar = new pab();
        String strD = jaa.d(context, reportOtherData.getSportType());
        pabVar.c(d(strD, e(reportOtherData.getSportCount())));
        pabVar.b(reportOtherData.getSportType());
        pabVar.c(reportOtherData.getSportCount());
        Drawable drawableB = pbb.b(reportOtherData.getSportType());
        if (LanguageUtil.ba(context)) {
            drawableB = qqz.e(context, drawableB);
        }
        if (pabVar.g() != 512) {
            drawableB = pbb.b(drawableB, context.getResources().getColor(i));
        }
        pabVar.c(drawableB);
        pabVar.d(context.getResources().getColor(i));
        pabVar.a(context.getResources().getColor(i2));
        pabVar.a(strD);
        if (LanguageUtil.ba(context)) {
            pabVar.d(pbb.b(pbb.d(R.drawable.title_label_run), context.getResources().getColor(i)));
        } else {
            pabVar.d(pbb.c(context, R.drawable.title_label_run, context.getResources().getColor(i)));
        }
        pabVar.a(b(reportOtherData));
        pabVar.e(context.getResources().getColor(i));
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration), pbb.c(reportOtherData.getSumTime()), pbb.c(context, reportOtherData.getSumTime()), ""));
        arrayList.add(pbb.a(context.getResources().getString(R.string.IDS_report_longest_duration), paw.d((int) reportOtherData.getMaxTime()), "", ""));
        pabVar.a(arrayList);
        return pabVar;
    }

    private static Drawable b(ReportOtherData reportOtherData) {
        BitmapDrawable bitmapDrawableE;
        Drawable drawableB = pbb.b(reportOtherData.getSportType());
        try {
            bitmapDrawableE = qqz.e(BaseApplication.b(), drawableB);
        } catch (IllegalArgumentException e) {
            LogUtil.e("AchieveSportTypeViewHolder", "getBodyDrawable: exception -> " + e.getMessage());
            bitmapDrawableE = null;
        }
        int color = BaseApplication.b().getResources().getColor(R.color.achieve_man_color);
        if (bitmapDrawableE != null) {
            return pbb.b(bitmapDrawableE, color);
        }
        return pbb.b(drawableB, color);
    }

    public static pac a(Context context, List<ozk> list) {
        pac pacVar = new pac();
        if (context == null || njy.e(list)) {
            LogUtil.j("AchieveSportTypeViewHolder", "getSportTypeItem reportTypeBeanList is null.");
            return pacVar;
        }
        Iterator<ozk> it = list.iterator();
        int iJ = 0;
        while (it.hasNext()) {
            iJ += it.next().j();
        }
        pacVar.c(e(iJ));
        pacVar.b(context.getString(R.string.IDS_awake_times));
        pacVar.d(System.lineSeparator() + context.getString(R.string.IDS_hwh_motiontrack_sport_data_times));
        return pacVar;
    }
}
