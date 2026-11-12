package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.google.gson.JsonSyntaxException;
import com.huawei.agconnect.apms.Agent;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.RecentMonthRecordFromDB;
import com.huawei.pluginachievement.manager.model.RecentWeekRecordFromDB;
import com.huawei.pluginachievement.manager.model.WeekAndMonthRecord;
import com.huawei.pluginachievement.report.bean.ReportDataBean;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.reportchart.HwHealthReportBarChart;
import com.huawei.ui.commonui.reporthorizontalpercentageview.ReportHorizontalBarChart;
import com.huawei.ui.commonui.reportrectview.ReportProportionView;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public class pav {
    public static void e(Context context, WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, pad padVar) {
        int iD;
        int iAcquireAvgSteps;
        if (b(context, weekAndMonthRecord, padVar)) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "refreshMonthStepViewLayout params is invalid.");
            return;
        }
        RecentMonthRecordFromDB recentMonthRecordFromDBA = a(weekAndMonthRecord);
        if (recentMonthRecordFromDBA == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "refreshMonthStepViewLayout currentMonthRecord is null.");
            return;
        }
        int iAcquireAvgSteps2 = recentMonthRecordFromDBA.acquireAvgSteps();
        b(context, padVar, iAcquireAvgSteps2);
        RecentMonthRecordFromDB recentMonthRecordFromDBA2 = a(weekAndMonthRecord2);
        if (recentMonthRecordFromDBA2 != null) {
            iAcquireAvgSteps = recentMonthRecordFromDBA2.acquireAvgSteps();
            iD = d(padVar.t(), recentMonthRecordFromDBA2.acquireOneMonthSteps());
        } else {
            iD = 0;
            iAcquireAvgSteps = 0;
        }
        c(context, padVar, iAcquireAvgSteps2);
        e(context, padVar, iAcquireAvgSteps2, iAcquireAvgSteps);
        int iD2 = d(padVar.t(), recentMonthRecordFromDBA.acquireOneMonthSteps());
        HealthTextView healthTextViewJ = padVar.j();
        if (healthTextViewJ != null) {
            healthTextViewJ.setText(UnitUtil.e(iD2, 1, 0));
        }
        if (d(iD2, recentMonthRecordFromDBA.acquireFirstday())) {
            b(context, padVar);
        } else {
            d(context, padVar, iD, iD2, 0);
        }
    }

    private static boolean d(int i, long j) {
        boolean z = i == pal.d(j);
        LogUtil.a("PLGACHIEVE_ReportViewUtil", "isComplianceDaysFullMoon currentMonthComplianceDays ", Integer.valueOf(i), "firstDay ", Long.valueOf(j));
        return z;
    }

    private static void b(Context context, pad padVar) {
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setStepComplianceDayDesc() context or parameter is null.");
            return;
        }
        ImageView imageViewB = padVar.b();
        if (imageViewB != null) {
            imageViewB.setVisibility(8);
        }
        HealthTextView healthTextViewD = padVar.d();
        if (healthTextViewD != null) {
            healthTextViewD.setText(context.getResources().getString(R.string.IDS_report_month_steps_desc4));
        }
    }

    private static void d(Context context, pad padVar, int i, int i2, int i3) {
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setStepComplianceDayDesc() context or parameter is null.");
            return;
        }
        Resources resources = context.getResources();
        ImageView imageViewB = padVar.b();
        if (imageViewB != null) {
            if (i2 > i) {
                imageViewB.setVisibility(0);
                imageViewB.setImageDrawable(resources.getDrawable(R.drawable.report_step_compliance_day_increased));
            } else if (i2 < i) {
                imageViewB.setVisibility(0);
                imageViewB.setImageDrawable(resources.getDrawable(R.drawable.report_step_compliance_day_decreased));
            } else {
                imageViewB.setVisibility(8);
            }
        }
        HealthTextView healthTextViewD = padVar.d();
        if (healthTextViewD != null) {
            healthTextViewD.setText(pat.a(context, i3, i2, i));
        }
    }

    public static void a(Context context, WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, pad padVar) {
        int iA;
        if (b(context, weekAndMonthRecord, padVar)) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "refreshMonthExerciseViewLayout isParamsInvalid is true.");
            return;
        }
        RecentMonthRecordFromDB recentMonthRecordFromDBA = a(weekAndMonthRecord);
        if (recentMonthRecordFromDBA == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "refreshMonthExerciseViewLayout currentMonthRecord is null.");
            return;
        }
        c(context, padVar, 0, recentMonthRecordFromDBA.acquireSumAllCount());
        int iE = e(context, recentMonthRecordFromDBA, padVar);
        b(context, padVar, 0, iE);
        float fAcquireSumCalorie = recentMonthRecordFromDBA.acquireSumCalorie();
        c(context, padVar, 0, fAcquireSumCalorie);
        d(context, padVar, recentMonthRecordFromDBA);
        c(context, padVar, recentMonthRecordFromDBA);
        float fAcquireDayAvgCalorie = recentMonthRecordFromDBA.acquireDayAvgCalorie();
        e(context, padVar, fAcquireDayAvgCalorie);
        RecentMonthRecordFromDB recentMonthRecordFromDBA2 = a(weekAndMonthRecord2);
        float fAcquireSumCalorie2 = 0.0f;
        float fAcquireDayAvgCalorie2 = recentMonthRecordFromDBA2 != null ? recentMonthRecordFromDBA2.acquireDayAvgCalorie() : 0.0f;
        if (recentMonthRecordFromDBA2 != null) {
            fAcquireSumCalorie2 = recentMonthRecordFromDBA2.acquireSumCalorie();
            iA = a(recentMonthRecordFromDBA2.acquireWeekTime());
        } else {
            iA = 0;
        }
        c(padVar, iE, iA);
        b(context, padVar, fAcquireSumCalorie, fAcquireSumCalorie2, 0);
        b(context, padVar, fAcquireDayAvgCalorie, fAcquireDayAvgCalorie2);
    }

    private static int c(Map<Long, Long> map) {
        if (map == null || map.size() <= 0) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "getExerciseTotalTime timeMap is null.");
            return 0;
        }
        Iterator<Map.Entry<Long, Long>> it = map.entrySet().iterator();
        float fLongValue = 0.0f;
        while (it.hasNext()) {
            fLongValue += it.next().getValue().longValue() / 60.0f;
        }
        return (int) Math.ceil(fLongValue);
    }

    private static int a(Map<Long, Long> map) {
        int iRound = 0;
        if (map == null || map.size() <= 0) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "getExerciseTotalTime timeMap is null.");
            return 0;
        }
        Iterator<Map.Entry<Long, Long>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            iRound += Math.round(it.next().getValue().longValue() / 60.0f);
        }
        return iRound;
    }

    private static void c(Context context, pad padVar, RecentMonthRecordFromDB recentMonthRecordFromDB) {
        if (context == null || padVar == null || recentMonthRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setCaloriesExtensionLayout context or parameter or currentMonthRecord is null.");
            return;
        }
        ArrayList<ReportProportionView.ProportionItem> arrayListB = b(context, recentMonthRecordFromDB);
        LinearLayout linearLayoutE = padVar.e();
        HealthTextView healthTextViewC = padVar.c();
        if (njy.e(arrayListB)) {
            if (linearLayoutE != null) {
                linearLayoutE.removeAllViews();
                linearLayoutE.setVisibility(8);
            }
            if (healthTextViewC != null) {
                healthTextViewC.setVisibility(8);
                return;
            }
            return;
        }
        ReportProportionView reportProportionView = new ReportProportionView(context);
        reportProportionView.d(arrayListB);
        if (linearLayoutE != null) {
            linearLayoutE.removeAllViews();
            linearLayoutE.addView(reportProportionView);
            linearLayoutE.setVisibility(0);
        }
        if (healthTextViewC != null) {
            healthTextViewC.setVisibility(0);
        }
    }

    private static ArrayList<ReportProportionView.ProportionItem> b(Context context, RecentMonthRecordFromDB recentMonthRecordFromDB) {
        if (context == null || recentMonthRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "getProportionItemList context or currentMonthRecord is null.");
            return new ArrayList<>();
        }
        int[] iArr = recentMonthRecordFromDB.mPercentCalorie;
        int length = iArr.length;
        ArrayList<ReportProportionView.ProportionItem> arrayList = new ArrayList<>(length);
        if (length >= 1 && iArr[0] > 0) {
            ReportProportionView.b bVar = new ReportProportionView.b(context, context.getResources().getColor(R.color.achieve_report_rect_view_run_color));
            bVar.setDataValue(iArr[0]);
            arrayList.add(bVar);
        }
        if (length >= 2 && iArr[1] > 0) {
            ReportProportionView.d dVar = new ReportProportionView.d(context, context.getResources().getColor(R.color.achieve_report_rect_view_walk_color));
            dVar.setDataValue(iArr[1]);
            arrayList.add(dVar);
        }
        if (length >= 3 && iArr[2] > 0) {
            ReportProportionView.a aVar = new ReportProportionView.a(context, context.getResources().getColor(R.color.achieve_report_rect_view_bike_color));
            aVar.setDataValue(iArr[2]);
            arrayList.add(aVar);
        }
        if (length >= 4 && iArr[3] > 0) {
            ReportProportionView.c cVar = new ReportProportionView.c(context, context.getResources().getColor(R.color.achieve_report_rect_view_climb_color));
            cVar.setDataValue(iArr[3]);
            arrayList.add(cVar);
        }
        if (length >= 5 && iArr[4] > 0) {
            ReportProportionView.e eVar = new ReportProportionView.e(context, context.getResources().getColor(R.color.achieve_report_rect_view_other_color));
            eVar.setDataValue(iArr[4]);
            arrayList.add(eVar);
        }
        return arrayList;
    }

    private static void d(Context context, pad padVar, RecentMonthRecordFromDB recentMonthRecordFromDB) {
        if (context == null || padVar == null || recentMonthRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setWeeklyCaloriesBarChart context or parameter or currentMonthRecord is null.");
            return;
        }
        HwHealthReportBarChart hwHealthReportBarChartX = padVar.x();
        HealthTextView healthTextViewQ = padVar.q();
        if (hwHealthReportBarChartX == null || healthTextViewQ == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setWeeklyCaloriesBarChart weeklyCaloriesBarChart is null.");
            return;
        }
        List<BarEntry> listC = paj.c(new ArrayList(8), recentMonthRecordFromDB, LanguageUtil.ba(context));
        if (njy.e(listC)) {
            hwHealthReportBarChartX.setVisibility(8);
            healthTextViewQ.setVisibility(8);
            return;
        }
        hwHealthReportBarChartX.setVisibility(0);
        healthTextViewQ.setVisibility(0);
        BarDataSet barDataSet = new BarDataSet(listC, Agent.OS_NAME);
        barDataSet.setColor(context.getResources().getColor(R.color.bar_chart_dark_color));
        barDataSet.setDrawValues(false);
        barDataSet.setBarBorderWidth(12.0f);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(barDataSet);
        ArrayList<String> arrayListD = pal.d(recentMonthRecordFromDB);
        if (njy.e(arrayListD)) {
            return;
        }
        float fB = pal.b(recentMonthRecordFromDB);
        hwHealthReportBarChartX.setData(new BarData(arrayList));
        hwHealthReportBarChartX.setCustomValue(context, arrayListD, context.getResources().getColor(R.color.bar_chart_highlight_color), 0.0f, fB, 10.0f, false);
        hwHealthReportBarChartX.invalidate();
    }

    private static void b(Context context, pad padVar, float f, float f2, int i) {
        String string;
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setComparedTotalCaloriesText context or parameter is null.");
            return;
        }
        float f3 = (f - f2) / 1000.0f;
        String string2 = context.getResources().getString(R.string.IDS_plugin_achievement_report_total_calorie_kCal_num, UnitUtil.e(Math.abs(f3), 1, 0));
        if (f3 > 0.0f) {
            if (i == 0) {
                string = context.getResources().getString(R.string.IDS_report_increase_desc_month, string2);
            } else {
                string = context.getResources().getString(R.string.IDS_report_increased_desc_week, string2);
            }
        } else if (f3 < 0.0f) {
            if (i == 0) {
                string = context.getResources().getString(R.string.IDS_report_decrease_desc_month, string2);
            } else {
                string = context.getResources().getString(R.string.IDS_report_decreased_desc_week, string2);
            }
        } else if (i == 0) {
            string = context.getResources().getString(R.string.IDS_report_equals_desc_month);
        } else {
            string = context.getResources().getString(R.string.IDS_report_equals_desc_week);
        }
        HealthTextView healthTextViewH = padVar.h();
        if (healthTextViewH != null) {
            healthTextViewH.setText(string);
        }
    }

    private static void c(pad padVar, int i, int i2) {
        String strE;
        if (padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseComparedTimeText parameter is null.");
            return;
        }
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.textSizeHeadline6);
        int color = BaseApplication.getContext().getResources().getColor(R.color.textColorPrimary);
        String string = BaseApplication.getContext().getResources().getString(R.string.textFontFamilyMedium);
        int i3 = i - i2;
        if (i3 > 0) {
            strE = Marker.ANY_NON_NULL_MARKER + UnitUtil.e(i3, 1, 0);
        } else if (i3 < 0) {
            strE = UnitUtil.e(i3, 1, 0);
        } else {
            strE = "±" + i3;
        }
        CharSequence charSequenceE = pat.e(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_fitnessadvice_min, i3, strE), strE, color, dimensionPixelSize, string);
        HealthTextView healthTextViewF = padVar.f();
        if (healthTextViewF != null) {
            healthTextViewF.setText(charSequenceE);
        }
    }

    private static void b(Context context, pad padVar, float f, float f2) {
        String string;
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseComparedAvgCaloriesText context or parameter is null.");
            return;
        }
        float f3 = (f - f2) / 1000.0f;
        String string2 = context.getResources().getString(R.string.IDS_plugin_achievement_report_total_calorie_kCal_num, UnitUtil.e(Math.abs(f3), 1, 0));
        if (f3 > 0.0f) {
            string = context.getResources().getString(R.string.IDS_report_increase_desc_month, string2);
        } else if (f3 < 0.0f) {
            string = context.getResources().getString(R.string.IDS_report_decrease_desc_month, string2);
        } else {
            string = context.getResources().getString(R.string.IDS_report_equals_desc_month);
        }
        HealthTextView healthTextViewA = padVar.a();
        if (healthTextViewA != null) {
            healthTextViewA.setText(string);
        }
    }

    private static void e(Context context, pad padVar, float f) {
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseAvgCaloriesText context or parameter is null.");
            return;
        }
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.textSizeHeadline6);
        int color = BaseApplication.getContext().getResources().getColor(R.color.textColorPrimary);
        String string = BaseApplication.getContext().getResources().getString(R.string.textFontFamilyMedium);
        String strE = UnitUtil.e(f / 1000.0f, 1, 0);
        CharSequence charSequenceE = pat.e(context.getResources().getString(R.string.IDS_plugin_achievement_report_total_calorie_kCal_num, strE), strE, color, dimensionPixelSize, string);
        HealthTextView healthTextViewI = padVar.i();
        if (healthTextViewI != null) {
            healthTextViewI.setText(charSequenceE);
        }
    }

    private static void c(Context context, pad padVar, int i, float f) {
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseTotalCalTextAndImage context or parameter is null.");
            return;
        }
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.textSizeHeadline6);
        int color = BaseApplication.getContext().getResources().getColor(R.color.textColorPrimary);
        String string = BaseApplication.getContext().getResources().getString(R.string.textFontFamilyMedium);
        float f2 = f / 1000.0f;
        String strE = UnitUtil.e(f2, 1, 0);
        CharSequence charSequenceE = pat.e(context.getResources().getString(R.string.IDS_plugin_achievement_report_total_calorie_kCal_num, strE), strE, color, dimensionPixelSize, string);
        HealthTextView healthTextViewN = padVar.n();
        if (healthTextViewN != null) {
            healthTextViewN.setText(charSequenceE);
        }
        ImageView imageViewL = padVar.l();
        if (imageViewL != null) {
            imageViewL.setImageDrawable(pat.a(context, i, (int) f2));
        }
    }

    private static void b(Context context, pad padVar, int i, int i2) {
        String strValueOf;
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseTotalTimeTextAndImage context or parameter is null.");
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.textSizeHeadline6);
        int color = context.getResources().getColor(R.color.textColorPrimary);
        String string = context.getResources().getString(R.string.textFontFamilyMedium);
        if (i2 >= 0) {
            strValueOf = UnitUtil.e(i2, 1, 0);
        } else {
            strValueOf = String.valueOf(0);
        }
        CharSequence charSequenceE = pat.e(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_fitnessadvice_min, i2, strValueOf), strValueOf, color, dimensionPixelSize, string);
        HealthTextView healthTextViewK = padVar.k();
        if (healthTextViewK != null) {
            healthTextViewK.setText(charSequenceE);
        }
        ImageView imageViewM = padVar.m();
        if (imageViewM != null) {
            imageViewM.setImageDrawable(pat.e(context, i, i2));
        }
    }

    private static void c(Context context, pad padVar, int i, int i2) {
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseDescText context or parameter or currentMonthRecord is null.");
            return;
        }
        HealthTextView healthTextViewG = padVar.g();
        if (healthTextViewG != null) {
            healthTextViewG.setText(pat.b(context, i, i2));
        }
    }

    private static boolean b(Context context, WeekAndMonthRecord weekAndMonthRecord, pad padVar) {
        if (context != null && weekAndMonthRecord != null && padVar != null) {
            return false;
        }
        LogUtil.j("PLGACHIEVE_ReportViewUtil", "isParamsInvalid listData is empty or context | parameter is null.");
        return true;
    }

    private static int e(Context context, RecentMonthRecordFromDB recentMonthRecordFromDB, pad padVar) {
        if (recentMonthRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setWeeklyDistributionTotalTimeView currentMonthRecord is null.");
            return 0;
        }
        Map<Long, Long> mapAcquireWeekTime = recentMonthRecordFromDB.acquireWeekTime();
        if (mapAcquireWeekTime == null || mapAcquireWeekTime.size() <= 0) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setWeeklyDistributionTotalTimeView weekTimeMap is null.");
            return 0;
        }
        Map<Long, Number> mapD = pal.d();
        mapD.putAll(mapAcquireWeekTime);
        LinearLayout linearLayoutV = padVar.v();
        if (linearLayoutV != null) {
            linearLayoutV.removeAllViews();
        }
        long jE = e(mapAcquireWeekTime);
        int i = 0;
        for (Map.Entry<Long, Number> entry : mapD.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            long jLongValue2 = entry.getValue().longValue();
            long jB = pal.b(jLongValue);
            long jC = pal.c(jLongValue);
            ReportHorizontalBarChart reportHorizontalBarChart = new ReportHorizontalBarChart(context);
            if (Math.abs(jB - jC) <= 86400000) {
                reportHorizontalBarChart.setWeekDate(paw.d(jB, 3));
            } else {
                reportHorizontalBarChart.setWeekDate(paw.d(jB, 3) + Constants.LINK + paw.d(jC, 3));
            }
            int iRound = Math.round(jLongValue2 / 60.0f);
            reportHorizontalBarChart.setExerciseTime(UnitUtil.e(iRound, 1, 0));
            reportHorizontalBarChart.setMaxValue(iRound, Math.round(jE / 60.0f));
            if (linearLayoutV != null) {
                linearLayoutV.addView(reportHorizontalBarChart);
                i += iRound;
            }
        }
        return i;
    }

    private static long e(Map<Long, Long> map) {
        long jMax = 0;
        if (map == null || map.size() <= 0) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "getDistributionMaxExerciseTime weekTimeMap is null.");
            return 0L;
        }
        Iterator<Map.Entry<Long, Long>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            jMax = Math.max(jMax, it.next().getValue().longValue());
        }
        return jMax;
    }

    private static int d(double d, Map<Long, Integer> map) {
        LogUtil.a("PLGACHIEVE_ReportViewUtil", "getComplianceDays() stepTarget = ", Double.valueOf(d));
        Iterator<Map.Entry<Long, Integer>> it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getValue().intValue() >= d) {
                i++;
            }
        }
        LogUtil.a("PLGACHIEVE_ReportViewUtil", "getComplianceDays() currentMonthComplianceDays = ", Integer.valueOf(i));
        return i;
    }

    private static ArrayList<ReportDataBean> d(String str) {
        ArrayList<ReportDataBean> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("mReportDataDetail")) {
                LogUtil.j("PLGACHIEVE_ReportViewUtil", "parseFromChildClass mReportDataDetail is not exist.");
                return arrayList;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("mReportDataDetail");
            if (jSONArray.length() != 0 && pbf.a().size() != 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    arrayList.add(pbf.d(jSONObject2.toString(), jSONObject2.getInt("mDataType")));
                }
                return arrayList;
            }
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "parseFromChildClass jsonArray.length() == 0 || SportTypeMap().size == 0.");
            return arrayList;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportViewUtil", "parseFromChildClass JsonSyntaxException, exception is ", e.getMessage());
        }
    }

    public static void c(Context context, WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, pad padVar) {
        int iD;
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "refreshWeekStepViewLayout params is invalid.");
            return;
        }
        RecentWeekRecordFromDB recentWeekRecordFromDBE = e(weekAndMonthRecord);
        if (recentWeekRecordFromDBE == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "refreshWeekStepViewLayout() currentWeekRecord is null.");
            return;
        }
        int iAcquireAvgSteps = recentWeekRecordFromDBE.acquireAvgSteps();
        b(context, padVar, iAcquireAvgSteps);
        c(context, padVar, iAcquireAvgSteps);
        int iD2 = d(padVar.t(), recentWeekRecordFromDBE.acquireSevenDaySteps());
        HealthTextView healthTextViewJ = padVar.j();
        int i = 0;
        if (healthTextViewJ != null) {
            healthTextViewJ.setText(UnitUtil.e(iD2, 1, 0));
        }
        RecentWeekRecordFromDB recentWeekRecordFromDBE2 = e(weekAndMonthRecord2);
        if (recentWeekRecordFromDBE2 != null) {
            int iAcquireAvgSteps2 = recentWeekRecordFromDBE2.acquireAvgSteps();
            Map<Long, Integer> mapAcquireSevenDaySteps = recentWeekRecordFromDBE2.acquireSevenDaySteps();
            iD = mapAcquireSevenDaySteps != null ? d(padVar.t(), mapAcquireSevenDaySteps) : 0;
            i = iAcquireAvgSteps2;
        } else {
            iD = 0;
        }
        e(context, padVar, iAcquireAvgSteps, i);
        d(context, padVar, iD, iD2, 1);
    }

    private static void b(Context context, pad padVar, int i) {
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setStepDescText context or parameter is null.");
            return;
        }
        HealthTextView healthTextViewP = padVar.p();
        if (healthTextViewP == null) {
            return;
        }
        if (!LanguageUtil.l(context)) {
            healthTextViewP.setAutoTextSize(1, 20.0f);
            healthTextViewP.setAutoTextInfo(15, 2, 1);
            healthTextViewP.setSingleLine(false);
            healthTextViewP.setMaxLines(3);
        }
        healthTextViewP.setText(pat.e(context, i));
    }

    private static void e(Context context, pad padVar, int i, int i2) {
        String str;
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setAvgStepValueView context or parameter is null.");
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.textSizeHeadline6);
        int color = context.getResources().getColor(R.color.textColorPrimary);
        String string = context.getResources().getString(R.string.textFontFamilyMedium);
        int i3 = i - i2;
        if (i3 == 0) {
            str = "±" + UnitUtil.e(i3, 1, 0);
        } else if (i3 > 0) {
            str = Marker.ANY_NON_NULL_MARKER + UnitUtil.e(i3, 1, 0);
        } else {
            str = Constants.LINK + UnitUtil.e(-i3, 1, 0);
        }
        CharSequence charSequenceE = pat.e(context.getResources().getQuantityString(R.plurals.IDS_achieve_report_unit_step, i3, str), str, color, dimensionPixelSize, string);
        HealthTextView healthTextViewR = padVar.r();
        if (healthTextViewR != null) {
            healthTextViewR.setText(charSequenceE);
        }
    }

    private static void c(Context context, pad padVar, int i) {
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setAvgStepValueView context or parameter is null.");
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.textSizeHeadline6);
        int color = context.getResources().getColor(R.color.textColorPrimary);
        String string = context.getResources().getString(R.string.textFontFamilyMedium);
        String strE = UnitUtil.e(i, 1, 0);
        CharSequence charSequenceE = pat.e(context.getResources().getQuantityString(R.plurals.IDS_achieve_report_unit_step, i, strE), strE, color, dimensionPixelSize, string);
        HealthTextView healthTextViewS = padVar.s();
        if (healthTextViewS != null) {
            healthTextViewS.setText(charSequenceE);
        }
    }

    public static void d(Context context, WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, pad padVar) {
        long jC;
        float fAcquireSumCalorie;
        if (b(context, weekAndMonthRecord, padVar)) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "refreshWeekExerciseViewLayout isParamsInvalid is true.");
            return;
        }
        RecentWeekRecordFromDB recentWeekRecordFromDBE = e(weekAndMonthRecord);
        if (recentWeekRecordFromDBE == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "refreshWeekExerciseViewLayout currentWeekRecord is null.");
            return;
        }
        c(context, padVar, 1, recentWeekRecordFromDBE.acquireSumAllCount());
        int iC = c(recentWeekRecordFromDBE.acquireSevenDayTime());
        b(context, padVar, 1, iC);
        c(context, padVar, recentWeekRecordFromDBE);
        c(context, padVar, 1, recentWeekRecordFromDBE.acquireSumCalorie());
        b(context, padVar, recentWeekRecordFromDBE.acquireAvgCalorie());
        RecentWeekRecordFromDB recentWeekRecordFromDBE2 = e(weekAndMonthRecord2);
        if (recentWeekRecordFromDBE2 != null) {
            jC = c(recentWeekRecordFromDBE2.acquireSevenDayTime());
            fAcquireSumCalorie = recentWeekRecordFromDBE2.acquireSumCalorie();
        } else {
            jC = 0;
            fAcquireSumCalorie = 0.0f;
        }
        c(padVar, iC, jC);
        b(context, padVar, recentWeekRecordFromDBE.acquireSumCalorie(), fAcquireSumCalorie, 1);
    }

    private static void b(Context context, pad padVar, float f) {
        if (context == null || padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseWeekAvgCaloriesText parameter is null.");
            return;
        }
        double d = (f / 1000.0f) / 300.0f;
        String strE = UnitUtil.e(d, 1, 1);
        CharSequence charSequenceE = pat.e(context.getResources().getQuantityString(R.plurals.IDS_report_consume_cal_about, UnitUtil.b(d, Locale.getDefault()), strE), strE, context.getResources().getColor(R.color.textColorPrimary), context.getResources().getDimensionPixelSize(R.dimen.textSizeHeadline6), context.getResources().getString(R.string.textFontFamilyMedium));
        HealthTextView healthTextViewI = padVar.i();
        if (healthTextViewI != null) {
            healthTextViewI.setText(charSequenceE);
        }
    }

    private static void c(pad padVar, long j, long j2) {
        String string;
        if (padVar == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseWeekComparedTotalTimeText parameter is null.");
            return;
        }
        long j3 = j - j2;
        String string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(Math.abs(j3), 1, 0));
        if (j3 > 0) {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_report_increased_desc_week, string2);
        } else if (j3 < 0) {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_report_decreased_desc_week, string2);
        } else {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_report_equals_desc_week);
        }
        HealthTextView healthTextViewF = padVar.f();
        if (healthTextViewF != null) {
            healthTextViewF.setText(string);
        }
    }

    private static void c(Context context, pad padVar, RecentWeekRecordFromDB recentWeekRecordFromDB) {
        if (context == null || padVar == null || recentWeekRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseTotalTimeBarChart currentMonthRecord is null.");
            return;
        }
        Map<Long, Long> mapAcquireSevenDayTime = recentWeekRecordFromDB.acquireSevenDayTime();
        if (mapAcquireSevenDayTime == null || mapAcquireSevenDayTime.size() <= 0) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseTotalTimeBarChart weekTimeMap is null.");
            return;
        }
        LogUtil.j("PLGACHIEVE_ReportViewUtil", "setExerciseTotalTimeBarChart weekTimeMap = ", mapAcquireSevenDayTime.toString());
        List<BarEntry> listE = paj.e(new ArrayList(8), recentWeekRecordFromDB, LanguageUtil.ba(context));
        if (njy.e(listE)) {
            return;
        }
        BarDataSet barDataSet = new BarDataSet(listE, Agent.OS_NAME);
        barDataSet.setColor(context.getResources().getColor(R.color.bar_chart_dark_color));
        barDataSet.setDrawValues(false);
        barDataSet.setBarBorderWidth(2.0f);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(barDataSet);
        ArrayList<String> arrayListB = pal.b(recentWeekRecordFromDB);
        if (njy.e(arrayListB)) {
            return;
        }
        float fC = pal.c(recentWeekRecordFromDB);
        BarData barData = new BarData(arrayList);
        barData.setBarWidth(0.95f);
        HwHealthReportBarChart hwHealthReportBarChartO = padVar.o();
        if (hwHealthReportBarChartO != null) {
            hwHealthReportBarChartO.setData(barData);
            hwHealthReportBarChartO.setCustomValue(context, arrayListB, context.getResources().getColor(R.color.bar_chart_highlight_color), 0.0f, (float) Math.ceil(fC), 10.0f, false);
            hwHealthReportBarChartO.invalidate();
        }
    }

    public static ArrayList<ReportDataBean> e(WeekAndMonthRecord weekAndMonthRecord, int i) {
        ArrayList<ReportDataBean> arrayList = new ArrayList<>(8);
        if (i == 1) {
            RecentWeekRecordFromDB recentWeekRecordFromDBE = e(weekAndMonthRecord);
            if (recentWeekRecordFromDBE != null) {
                return recentWeekRecordFromDBE.acquireReportDataDetail();
            }
        } else {
            RecentMonthRecordFromDB recentMonthRecordFromDBA = a(weekAndMonthRecord);
            if (recentMonthRecordFromDBA != null) {
                return recentMonthRecordFromDBA.acquireReportDataDetail();
            }
        }
        return arrayList;
    }

    public static RecentMonthRecordFromDB a(WeekAndMonthRecord weekAndMonthRecord) {
        RecentMonthRecordFromDB recentMonthRecordFromDB = null;
        if (weekAndMonthRecord == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "getMonthRecordFromBaseRecord record is null.");
            return null;
        }
        try {
            String value = weekAndMonthRecord.getValue();
            RecentMonthRecordFromDB recentMonthRecordFromDB2 = (RecentMonthRecordFromDB) HiJsonUtil.d(value, RecentMonthRecordFromDB.class);
            try {
                recentMonthRecordFromDB2.setReportDataDetail(d(value));
                return recentMonthRecordFromDB2;
            } catch (JsonSyntaxException e) {
                e = e;
                recentMonthRecordFromDB = recentMonthRecordFromDB2;
                LogUtil.e("PLGACHIEVE_ReportViewUtil", "getMonthRecordFromBaseRecord JsonSyntaxException, exception is ", e.getMessage());
                return recentMonthRecordFromDB;
            }
        } catch (JsonSyntaxException e2) {
            e = e2;
        }
    }

    public static RecentWeekRecordFromDB e(WeekAndMonthRecord weekAndMonthRecord) {
        RecentWeekRecordFromDB recentWeekRecordFromDB = null;
        if (weekAndMonthRecord == null) {
            LogUtil.j("PLGACHIEVE_ReportViewUtil", "getWeekRecordFromBaseRecord record is null.");
            return null;
        }
        try {
            String value = weekAndMonthRecord.getValue();
            RecentWeekRecordFromDB recentWeekRecordFromDB2 = (RecentWeekRecordFromDB) HiJsonUtil.d(value, RecentWeekRecordFromDB.class);
            try {
                recentWeekRecordFromDB2.setReportDataDetail(d(value));
                return recentWeekRecordFromDB2;
            } catch (JsonSyntaxException e) {
                e = e;
                recentWeekRecordFromDB = recentWeekRecordFromDB2;
                LogUtil.e("PLGACHIEVE_ReportViewUtil", "getWeekRecordFromBaseRecord JsonSyntaxException, exception is ", e.getMessage());
                return recentWeekRecordFromDB;
            }
        } catch (JsonSyntaxException e2) {
            e = e2;
        }
    }
}
