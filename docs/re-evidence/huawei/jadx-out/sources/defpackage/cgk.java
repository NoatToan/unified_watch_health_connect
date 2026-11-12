package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.data.Entry;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.reportchart.HwHealthReportLineChart;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cgk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f1581c = Color.parseColor("#FFA3E5A3");
    private static final int d = Color.parseColor("#FF47CC47");

    public static void c(Context context, HealthTextView healthTextView, HwHealthReportLineChart hwHealthReportLineChart, List<cav> list) {
        if (hwHealthReportLineChart == null || healthTextView == null) {
            LogUtil.j("HL_WeeklyReportLineChartUtil", "refreshWeekLineChart, horizontalAxisValues or lineChartTips is null");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j("HL_WeeklyReportLineChartUtil", "refreshWeekLineChart, recentWeeklyData is null");
            return;
        }
        hwHealthReportLineChart.setChartNumberWithInt(true);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        ArrayList arrayList4 = new ArrayList(16);
        ArrayList[] arrayListArr = {arrayList3, arrayList4};
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!njy.e(list, size)) {
                cav cavVar = list.get(size);
                arrayList.add(cavVar.e());
                arrayList2.add(Integer.valueOf(cavVar.b()));
            }
        }
        c(context, healthTextView, arrayList2);
        for (int i = 0; i < arrayList2.size(); i++) {
            c(context, i, arrayListArr, arrayList4, arrayList2);
        }
        c(context, (ArrayList<Entry>[]) arrayListArr, (ArrayList<String>) arrayList, hwHealthReportLineChart);
    }

    private static void c(Context context, int i, ArrayList<Entry>[] arrayListArr, ArrayList<Entry> arrayList, ArrayList<Integer> arrayList2) {
        if (!njy.c(arrayList2, i)) {
            LogUtil.j("HL_WeeklyReportLineChartUtil", "initCompleteNumberPoint, completeNumbers is null or outOfBounds");
            return;
        }
        int iIntValue = arrayList2.get(i).intValue();
        int size = arrayList2.size();
        if (size == 1) {
            d(context, i, iIntValue, arrayList);
            return;
        }
        int i2 = size - 1;
        if (i < i2) {
            a(context, i, arrayListArr, iIntValue);
        }
        if (i == size - 2) {
            e(context, i, arrayListArr, iIntValue);
        }
        if (i == i2) {
            d(context, i, iIntValue, arrayList);
        }
    }

    private static void c(Context context, HealthTextView healthTextView, ArrayList<Integer> arrayList) {
        int iIntValue;
        int iIntValue2;
        int size = arrayList.size();
        if (size > 1) {
            iIntValue = arrayList.get(size - 1).intValue();
            iIntValue2 = arrayList.get(size - 2).intValue();
        } else {
            iIntValue = 0;
            iIntValue2 = 0;
        }
        String strA = a(context, iIntValue, iIntValue2);
        if (TextUtils.isEmpty(strA)) {
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setText(strA);
        }
    }

    private static void c(Context context, ArrayList<Entry>[] arrayListArr, ArrayList<String> arrayList, HwHealthReportLineChart hwHealthReportLineChart) {
        if (njy.e(arrayList) || hwHealthReportLineChart == null) {
            LogUtil.j("HL_WeeklyReportLineChartUtil", "refreshWeekLineChartLayout, horizontalAxisValues or historyLineChart is null");
            return;
        }
        if (arrayListArr == null || arrayListArr.length < 2) {
            LogUtil.j("HL_WeeklyReportLineChartUtil", "refreshWeekLineChartLayout, arrayLists error");
            return;
        }
        hwHealthReportLineChart.setExtraOffsets(qrs.d(context, 10.0f), 0.0f, qrs.d(context, 11.0f), qrs.d(context, 2.0f));
        int i = f1581c;
        int i2 = d;
        hwHealthReportLineChart.c(i, i2, i2, R.drawable.report_line_chart_shadow_run);
        hwHealthReportLineChart.setChartData(context, arrayList, arrayListArr[0], arrayListArr[1], new ArrayList<>(16));
        hwHealthReportLineChart.invalidate();
    }

    private static void a(Context context, int i, ArrayList<Entry>[] arrayListArr, int i2) {
        if (arrayListArr == null || arrayListArr.length < 2) {
            LogUtil.j("HL_WeeklyReportLineChartUtil", "initDataOnHollowPoint, arrayLists error");
        } else {
            arrayListArr[0].add(c(i, i2, ContextCompat.getDrawable(context, R.drawable.report_line_chart_hollow_run), "LINE_PATH"));
        }
    }

    private static void e(Context context, int i, ArrayList<Entry>[] arrayListArr, int i2) {
        if (arrayListArr == null || arrayListArr.length < 2) {
            LogUtil.j("HL_WeeklyReportLineChartUtil", "initDataOnThickLine, arrayLists error");
        } else {
            arrayListArr[1].add(c(i, i2, ContextCompat.getDrawable(context, R.drawable.report_line_chart_solid_run), "LINE_PATH_BOLD_START"));
        }
    }

    private static void d(Context context, int i, int i2, ArrayList<Entry> arrayList) {
        if (arrayList == null) {
            LogUtil.j("HL_WeeklyReportLineChartUtil", "initDataOnSolidPoint, completeNumberBold is null");
        } else {
            arrayList.add(c(i, i2, ContextCompat.getDrawable(context, R.drawable.report_line_chart_solid_run), "LINE_PATH"));
        }
    }

    private static String a(Context context, int i, int i2) {
        float f = i2 != 0 ? ((i - i2) * 100.0f) / i2 : 0.0f;
        if ("0".equals(cbg.d(Math.abs(f), 1, 0))) {
            LogUtil.j("HL_WeeklyReportLineChartUtil", "getWeekLineChartTips percent is 0");
            return "";
        }
        return a(context, f);
    }

    private static String a(Context context, float f) {
        String string;
        if (f <= 0.0f) {
            string = "";
        } else {
            string = context.getString(com.huawei.basichealthmodel.R.string.IDS_health_model_line_chart_up_tips, cbg.d(f, 2, 0));
        }
        return f < 0.0f ? context.getString(com.huawei.basichealthmodel.R.string.IDS_health_model_line_chart_down_tips, cbg.d(-f, 2, 0)) : string;
    }

    private static Entry c(int i, float f, Drawable drawable, Object obj) {
        Entry entry = new Entry(i, f);
        entry.setIcon(drawable);
        entry.setData(obj);
        return entry;
    }
}
