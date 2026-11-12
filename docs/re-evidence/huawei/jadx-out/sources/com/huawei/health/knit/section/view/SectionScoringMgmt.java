package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.SleepManagementLineChart;
import defpackage.frm;
import defpackage.fro;
import defpackage.ftg;
import defpackage.fth;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qly;
import defpackage.qmu;
import defpackage.qns;
import defpackage.qnt;
import defpackage.qqp;
import defpackage.qqw;
import defpackage.qri;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.utils.StringUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionScoringMgmt extends SectionScoring {
    private ftg aa;
    private HealthTextView ab;
    private SleepManagementLineChart ac;
    private FrameLayout v;
    private HwHealthBarChart y;
    private Context z;

    private boolean a(int i) {
        return i == 5;
    }

    private int d(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return 1;
            default:
                return i;
        }
    }

    public SectionScoringMgmt(Context context) {
        this(context, null);
    }

    public SectionScoringMgmt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionScoringMgmt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.SectionScoring, com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionScoringMgmt", "onCreateView");
        this.z = context;
        View viewOnCreateView = super.onCreateView(context);
        this.ac = (SleepManagementLineChart) viewOnCreateView.findViewById(R.id.line_chart);
        this.y = (HwHealthBarChart) viewOnCreateView.findViewById(R.id.bar_chart);
        this.ab = (HealthTextView) viewOnCreateView.findViewById(R.id.chart_title_date);
        this.v = (FrameLayout) viewOnCreateView.findViewById(R.id.chart_linear_layout);
        return viewOnCreateView;
    }

    @Override // com.huawei.health.knit.section.view.SectionScoring, com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionScoringMgmt", "bindParamsToView");
        this.u.setVisibility(8);
        this.f7909c.setVisibility(8);
        this.d = false;
        setLayoutVisible(map);
        setScoringContent(map);
        setSuggestContent(map);
        setCommonContent(map);
        setLevelContent(map);
        setDetectAbnormal(map);
        setChartView(map);
    }

    @Override // com.huawei.health.knit.section.view.SectionScoring
    protected void setLayoutVisible(Map<String, Object> map) {
        Object obj = map.get("IS_PILLOW");
        this.g = qqw.a(map, "IS_DATA_TYPE_DAY", false);
        e();
        if (obj instanceof Boolean) {
            this.i = ((Boolean) obj).booleanValue();
            a();
            return;
        }
        Object obj2 = map.get("IS_CORE_SLEEP");
        if (obj2 instanceof Boolean) {
            d(((Boolean) obj2).booleanValue());
            this.w.setVisibility(8);
            this.f7908b.setVisibility(0);
        }
        Object obj3 = map.get("IS_PHONE_SLEEP");
        if (obj3 instanceof Boolean) {
            c(((Boolean) obj3).booleanValue());
            this.w.setVisibility(8);
            this.f7908b.setVisibility(0);
        }
        b();
    }

    protected void b() {
        if (this.t == null || this.r == null || this.p == null || this.t.getVisibility() == 8) {
            return;
        }
        if (this.g) {
            this.t.setPadding((int) getResources().getDimension(R.dimen.health_common_8dp), 0, 0, 0);
        } else {
            this.t.setPadding(0, 0, 0, 0);
        }
    }

    private void setChartView(HashMap<String, Object> map) {
        Object obj = map.get("SHOW_VALUE");
        Integer numValueOf = Integer.valueOf(qqw.c(map, "CORE_SLEEP_VERSION", 0));
        if (!(obj instanceof ftg) || !(numValueOf instanceof Integer)) {
            LogUtil.e("SectionScoringMgmt", "data is invalid");
            return;
        }
        ftg ftgVar = (ftg) obj;
        if (ftgVar.equals(this.aa)) {
            LogUtil.a("SectionScoringMgmt", "smartSleepChartData not changed，data: ", ftgVar);
            return;
        }
        this.aa = ftgVar;
        LogUtil.a("SectionScoringMgmt", "new data: ", ftgVar);
        String strB = b(ftgVar, numValueOf.intValue());
        String strC = c(ftgVar);
        String[] strArrE = e(ftgVar);
        long[] jArrB = b(ftgVar);
        int[] iArrC = c(ftgVar, jArrB, numValueOf.intValue());
        int iD = d(ftgVar.b());
        boolean zA = a(ftgVar.b());
        LogUtil.a("SectionScoringMgmt", "start draw");
        if (iD == 0) {
            b(strB, strC, strArrE, jArrB, iArrC);
        } else if (iD == 1) {
            b(strB, strC, strArrE, jArrB, iArrC, zA);
        }
    }

    private void b(String str, String str2, String[] strArr, long[] jArr, int[] iArr) {
        SleepManagementLineChart sleepManagementLineChart = this.ac;
        if (sleepManagementLineChart != null && this.y != null) {
            sleepManagementLineChart.setVisibility(0);
            this.y.setVisibility(8);
        }
        e(str, str2);
        c();
        d(0.0f, 100.0f, 0.0f, 100.0f);
        List<HwHealthBaseEntry> listE = e(jArr, strArr);
        a(a(listE, iArr), a(listE));
    }

    private void e(String str, String str2) {
        SpannableString spannableString = new SpannableString(String.format("%s %s", str, str2));
        qri.b(spannableString, str2, R.color.textColorSecondary);
        qri.e(spannableString, str2, R.string.textFontFamilyRegular);
        this.ab.setText(spannableString);
    }

    private void b(String str, String str2, String[] strArr, long[] jArr, int[] iArr, boolean z) {
        SleepManagementLineChart sleepManagementLineChart = this.ac;
        if (sleepManagementLineChart != null && this.y != null) {
            sleepManagementLineChart.setVisibility(8);
            this.y.setVisibility(0);
        }
        e(str, str2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j : jArr) {
            arrayList2.add(Integer.valueOf((int) j));
        }
        float fIntValue = 0.0f;
        float fIntValue2 = 2.1474836E9f;
        for (int i = 0; i < arrayList2.size(); i++) {
            if (((Integer) arrayList2.get(i)).intValue() >= fIntValue) {
                fIntValue = ((Integer) arrayList2.get(i)).intValue();
            }
            if (((Integer) arrayList2.get(i)).intValue() <= fIntValue2) {
                fIntValue2 = ((Integer) arrayList2.get(i)).intValue();
            }
        }
        float f = 100.0f / fIntValue;
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            if (((Integer) arrayList2.get(i2)).intValue() == -1) {
                arrayList3.add(Float.valueOf(-1.0f));
            } else {
                arrayList3.add(Float.valueOf(((Integer) arrayList2.get(i2)).intValue() * f));
            }
        }
        for (int i3 = 0; i3 < 7; i3++) {
            if (((Float) arrayList3.get(i3)).floatValue() != -1.0f) {
                float fFloatValue = ((Float) arrayList3.get(i3)).floatValue();
                int i4 = iArr[i3];
                qmu qmuVar = new qmu(fFloatValue, i4, i4);
                qmuVar.a(d(i3, 7, strArr));
                arrayList.add(new HwHealthBarEntry(i3 + 0.5f, qmuVar));
            }
        }
        d(arrayList, iArr[6], z, strArr);
    }

    private String d(int i, int i2, String[] strArr) {
        if (i == i2 - 1) {
            if (TextUtils.isEmpty(strArr[1])) {
                LogUtil.a("SectionScoringMgmt", "label text is null");
                return strArr[0];
            }
            return strArr[0] + ";" + strArr[1];
        }
        return "";
    }

    private void d(List<HwHealthBarEntry> list, int i, boolean z, String[] strArr) {
        HwHealthBarChart hwHealthBarChart = this.y;
        if (hwHealthBarChart == null) {
            LogUtil.j("SectionScoringMgmt", "initSet barChart is null");
            return;
        }
        hwHealthBarChart.setTouchEnabled(false);
        HwHealthBarDataSet hwHealthBarDataSet = new HwHealthBarDataSet(list, "bar breif", "bar label", "bar unit");
        hwHealthBarDataSet.e(HwHealthBarDataSet.DrawColorMode.DATA_COLOR);
        hwHealthBarDataSet.setBarDrawWidthDp(8.0f);
        hwHealthBarDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        hwHealthBarDataSet.setDrawValues(true);
        hwHealthBarDataSet.setValueFormatter(new IValueFormatter() { // from class: com.huawei.health.knit.section.view.SectionScoringMgmt.3
            @Override // com.github.mikephil.charting.formatter.IValueFormatter
            public String getFormattedValue(float f, Entry entry, int i2, ViewPortHandler viewPortHandler) {
                if (!(entry instanceof HwHealthBarEntry)) {
                    return "";
                }
                IStorageModel iStorageModelAcquireModel = ((HwHealthBarEntry) entry).acquireModel();
                return !(iStorageModelAcquireModel instanceof qmu) ? "" : ((qmu) iStorageModelAcquireModel).d();
            }
        });
        hwHealthBarDataSet.setValueTextSize(10.0f);
        hwHealthBarDataSet.setValueTextColor(i);
        this.y.getXAxis().setEnabled(false);
        this.y.getXAxis().setAxisMinimum(0.0f);
        this.y.getXAxis().setAxisMaximum(7.0f);
        HwHealthYAxis axisFirstParty = this.y.getAxisFirstParty();
        axisFirstParty.setDrawLabels(false);
        axisFirstParty.setDrawGridLines(false);
        axisFirstParty.setDrawAxisLine(false);
        axisFirstParty.setAxisMinimum(0.0f);
        if (StringUtils.j(strArr[1])) {
            axisFirstParty.setAxisMaximum(qqp.a(BaseApplication.b(), 17.0f) + 150);
        } else {
            axisFirstParty.setAxisMaximum(qqp.a(BaseApplication.b(), 9.0f) + 150);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(hwHealthBarDataSet);
        this.y.setData(new qly(arrayList));
        HwHealthBarChart hwHealthBarChart2 = this.y;
        fro froVar = new fro(hwHealthBarChart2, hwHealthBarChart2.getAnimator(), this.y.getViewPortHandler(), z);
        froVar.d(true, false);
        this.y.setRenderer(froVar);
        this.y.refresh();
    }

    private int[] c(ftg ftgVar, long[] jArr, int i) {
        int[] iArr = new int[7];
        if (jArr != null) {
            for (int i2 = 0; i2 < jArr.length; i2++) {
                long j = jArr[i2];
                if (j == -1) {
                    iArr[i2] = -1;
                } else {
                    String strD = d(j, ftgVar.b(), i2, i);
                    if (TextUtils.isEmpty(strD)) {
                        iArr[i2] = -1;
                    } else {
                        iArr[i2] = Color.parseColor(strD);
                    }
                }
            }
        }
        return iArr;
    }

    private String d(long j, int i, int i2, int i3) {
        boolean z = i3 == 5;
        switch (i) {
            case 1:
                if (j < 10 || j > 30) {
                    return j < 10 ? "#46B1E3" : "#ED6F20";
                }
                return "#64BB5C";
            case 2:
                int i4 = z ? 30 : 60;
                long j2 = z ? 10 : 20;
                if (j < j2 || j > i4) {
                    return j < j2 ? "#46B1E3" : "#ED6F20";
                }
                return "#64BB5C";
            case 3:
                return j > 720 ? "#ED6F20" : "#64BB5C";
            case 4:
                return j >= 300 ? "#64BB5C" : "#ED6F20";
            case 5:
                return c(j, i2, 0, 1);
            case 6:
                return c(j, i2, 360, 600);
            case 7:
                return c(j, i2, 70, 100);
            case 8:
                return c(j, i2, 85, 100);
            case 9:
                if (j < 30) {
                    return c(i2);
                }
                return b(i2);
            default:
                return "";
        }
    }

    private String c(long j, int i, int i2, int i3) {
        long j2 = i2;
        if (j >= j2 && j <= i3) {
            return c(i);
        }
        if (j < j2) {
            return e(i);
        }
        return b(i);
    }

    private String b(int i) {
        if (i == 6) {
            return "#ED6F20";
        }
        return "#99ED6F20";
    }

    private String e(int i) {
        if (i == 6) {
            return "#46B1E3";
        }
        return "#9946B1E3";
    }

    private String c(int i) {
        if (i == 6) {
            return "#64BB5C";
        }
        return "#9964BB5C";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private String[] e(ftg ftgVar) {
        String[] strArr = new String[2];
        fth[] fthVarArrD = ftgVar.d();
        if (fthVarArrD.length == 7) {
            fth fthVar = fthVarArrD[6];
            if (fthVar == null) {
                LogUtil.j("SectionScoringMgmt", "lastBean is null");
                return strArr;
            }
            switch (ftgVar.b()) {
                case 1:
                case 2:
                case 8:
                    strArr[0] = UnitUtil.e(fthVar.e(), 2, 0);
                    break;
                case 3:
                case 4:
                    strArr[0] = e(fthVar.b(), "HH:mm");
                    return strArr;
                case 5:
                    strArr[0] = this.z.getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, fthVar.e(), UnitUtil.e(fthVar.e(), 1, 0));
                    return strArr;
                case 6:
                case 9:
                    int iE = fthVar.e() / 60;
                    int iE2 = fthVar.e() % 60;
                    String quantityString = this.z.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_min_unit, iE2, UnitUtil.e(iE2, 1, 0));
                    String quantityString2 = this.z.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, iE, UnitUtil.e(iE, 1, 0));
                    if (iE < 0 || iE > 24) {
                        LogUtil.e("SectionScoringMgmt", "latency data is invalid");
                        return strArr;
                    }
                    if (iE == 0) {
                        strArr[0] = quantityString;
                        return strArr;
                    }
                    strArr[0] = quantityString2;
                    strArr[1] = quantityString;
                    return strArr;
                case 7:
                    strArr[0] = this.z.getResources().getQuantityString(R.plurals.IDS_hw_health_blood_oxygen_score, fthVar.e(), Integer.valueOf(fthVar.e()));
                    return strArr;
            }
        }
        return strArr;
    }

    private String c(ftg ftgVar) {
        fth[] fthVarArrD = ftgVar.d();
        if (fthVarArrD.length != 7) {
            return "";
        }
        fth fthVar = fthVarArrD[6];
        if (fthVar == null) {
            LogUtil.e("SectionScoringMgmt", "last bean is null");
            return "";
        }
        long jC = fthVar.c();
        return Constants.LEFT_BRACKET_ONLY + e(a(jC), "MM/dd") + com.huawei.openalliance.ad.constant.Constants.LINK + e(jC, "MM/dd") + Constants.RIGHT_BRACKET_ONLY;
    }

    private String e(long j, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat(str).format(calendar.getTime());
    }

    private long a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(6, -6);
        return calendar.getTimeInMillis();
    }

    private String b(ftg ftgVar, int i) {
        switch (ftgVar.b()) {
            case 1:
                if (i == 5) {
                    return g(R.string.IDS_hw_aasm_label_sleep_rem_rate);
                }
                return g(R.string.IDS_fitness_core_sleep_rem_sleep_percent);
            case 2:
                if (i == 5) {
                    return g(R.string.IDS_hw_aasm_label_sleep_deepsleep_rate);
                }
                return g(R.string.IDS_fitness_core_sleep_deep_sleep_percent);
            case 3:
                return g(R.string.IDS_fitness_core_sleep_go_to_sleep_time);
            case 4:
                return g(R.string.IDS_manual_sleep_waking_time);
            case 5:
                return g(R.string.IDS_details_sleep_sleep_latency_time);
            case 6:
                return g(R.string.IDS_fitness_core_sleep_sleep_duration);
            case 7:
                return g(R.string.IDS_fitness_core_sleep_deep_sleep_continuity);
            case 8:
                return g(R.string.IDS_manual_sleep_sleep_efficiency);
            case 9:
                return this.z.getResources().getString(R.string.IDS_sleep_latency_title);
            default:
                return "";
        }
    }

    private String g(int i) {
        return this.z.getResources().getString(i);
    }

    private long[] b(ftg ftgVar) {
        int iB = ftgVar.b();
        switch (iB) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return b(ftgVar.d(), Integer.class, iB);
            case 3:
            case 4:
                return b(ftgVar.d(), Long.class, iB);
            default:
                return new long[0];
        }
    }

    private <T> long[] b(fth[] fthVarArr, Class<T> cls, int i) {
        long[] jArr = new long[7];
        for (int i2 = 0; i2 < fthVarArr.length; i2++) {
            fth fthVar = fthVarArr[i2];
            if (fthVar == null) {
                jArr[i2] = -1;
            } else if (cls == Long.class) {
                jArr[i2] = d(fthVar.b(), i);
            } else if (cls == Integer.class) {
                jArr[i2] = fthVar.e();
            }
        }
        return jArr;
    }

    private long d(long j, int i) {
        String[] strArrSplit = e(j, "HH:mm").split(":");
        if (strArrSplit.length != 2) {
            return 0L;
        }
        int iJ = CommonUtil.j(strArrSplit[0]);
        if (i != 3) {
            if (i == 4) {
                return (j - lsl.r(j)) / 60000;
            }
            return 0L;
        }
        if (iJ >= 12 && iJ <= 23) {
            return (j - lsl.a(j, 12, 0)) / 60000;
        }
        return (j - lsl.a(lsl.d(j, -1), 12, 0)) / 60000;
    }

    private float a(List<HwHealthBaseEntry> list) {
        if (njy.e(list)) {
            return 0.0f;
        }
        return list.get(list.size() - 1).getX();
    }

    private void a(HwHealthLineDataSet hwHealthLineDataSet, float f) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(hwHealthLineDataSet);
        this.ac.setData(new qnt(arrayList));
        this.ac.highlightValue(f, false);
        SleepManagementLineChart sleepManagementLineChart = this.ac;
        sleepManagementLineChart.setRenderer(new frm(sleepManagementLineChart, sleepManagementLineChart.getAnimator(), this.ac.getViewPortHandler(), this.z));
        this.ac.refresh();
    }

    private void c() {
        if (this.ac.getRenderer() instanceof qns) {
            ((qns) this.ac.getRenderer()).c(1);
        }
        this.ac.disableLabelsForce();
        this.ac.setTouchEnabled(false);
        this.ac.getDescription().setEnabled(true);
        this.ac.setAllowMultiSetDrawFillEnabled(false);
    }

    private List<HwHealthBaseEntry> e(long[] jArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (jArr != null) {
            int i = 7;
            if (jArr.length == 7) {
                long j = Long.MIN_VALUE;
                for (long j2 : jArr) {
                    if (j2 == -1) {
                        i--;
                    } else if (j2 > j) {
                        j = j2;
                    }
                }
                long j3 = 2147483647L;
                for (long j4 : jArr) {
                    if (j4 != -1 && j4 < j3) {
                        j3 = j4;
                    }
                }
                if (j == Long.MIN_VALUE || j3 == Long.MAX_VALUE) {
                    LogUtil.j("SectionScoringMgmt", "dataArray all data is invalid");
                    return arrayList;
                }
                if (i == 1) {
                    LogUtil.j("SectionScoringMgmt", "dataArray only one data");
                    arrayList.add(new HwHealthBaseEntry(92.85714f, 32.5f, strArr[0]));
                    return arrayList;
                }
                float f = j == j3 ? 0.0f : 53.0f / (j - j3);
                float f2 = -7.142857f;
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    f2 += 14.285714f;
                    long j5 = jArr[i2];
                    if (j5 != -1) {
                        float f3 = f == 0.0f ? 38.5f : ((j5 - j3) * f) + 12.0f;
                        if (i2 == 0) {
                            arrayList.add(new HwHealthBaseEntry(f2, f3));
                        } else if (i2 == 6) {
                            arrayList.add(new HwHealthBaseEntry(f2, f3, strArr[0]));
                        } else {
                            arrayList.add(new HwHealthBaseEntry(f2, f3));
                        }
                    }
                }
                return arrayList;
            }
        }
        LogUtil.j("SectionScoringMgmt", "dataArray error");
        return arrayList;
    }

    private void d(float f, float f2, float f3, float f4) {
        SleepManagementLineChart sleepManagementLineChart = this.ac;
        if (sleepManagementLineChart == null) {
            LogUtil.j("SectionScoringMgmt", "initAxis mLineChart is null");
            return;
        }
        XAxis xAxis = sleepManagementLineChart.getXAxis();
        xAxis.setEnabled(false);
        xAxis.setAxisMinimum(f);
        xAxis.setAxisMaximum(f2);
        HwHealthYAxis axisFirstParty = this.ac.getAxisFirstParty();
        axisFirstParty.setDrawLabels(false);
        axisFirstParty.setDrawAxisLine(false);
        axisFirstParty.setDrawGridLines(false);
        axisFirstParty.setAxisMinimum(f3);
        axisFirstParty.setAxisMaximum(f4);
    }

    private HwHealthLineDataSet a(List<HwHealthBaseEntry> list, int[] iArr) {
        if (this.ac == null) {
            LogUtil.j("SectionScoringMgmt", "initLineDataSet mLineChart is null");
            return null;
        }
        LogUtil.a("SectionScoringMgmt", "initLineDataSet valueList size is ", Integer.valueOf(list.size()));
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.z, list, "line brief", "line label", "line unit") { // from class: com.huawei.health.knit.section.view.SectionScoringMgmt.4
            @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
            public List<HwHealthBaseEntry> getEntriesForXValue(float f) {
                ArrayList arrayList = new ArrayList();
                int size = this.mEntries.size() - 1;
                int i = 0;
                while (i <= size) {
                    int i2 = (size + i) / 2;
                    HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) this.mEntries.get(i2);
                    if (a(f, hwHealthBaseEntry.getX())) {
                        while (i2 > 0 && a(((HwHealthBaseEntry) this.mEntries.get(i2 - 1)).getX(), f)) {
                            i2--;
                        }
                        int size2 = this.mEntries.size();
                        while (i2 < size2) {
                            HwHealthBaseEntry hwHealthBaseEntry2 = (HwHealthBaseEntry) this.mEntries.get(i2);
                            if (!a(hwHealthBaseEntry2.getX(), f)) {
                                break;
                            }
                            arrayList.add(hwHealthBaseEntry2);
                            i2++;
                        }
                        break;
                    }
                    if (e(f, hwHealthBaseEntry.getX())) {
                        i = i2 + 1;
                    } else {
                        size = i2 - 1;
                    }
                }
                return arrayList;
            }

            private boolean a(float f, float f2) {
                return ((double) Math.abs(f - f2)) < Math.pow(10.0d, -3.0d);
            }

            private boolean e(float f, float f2) {
                return ((double) (f - f2)) > Math.pow(10.0d, -3.0d);
            }
        };
        e(hwHealthLineDataSet, iArr);
        hwHealthLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        if (list.size() == 1) {
            hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: com.huawei.health.knit.section.view.SectionScoringMgmt.1
                @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
                public boolean drawLine(int i, int i2, int i3) {
                    return false;
                }
            });
        }
        hwHealthLineDataSet.e(new HwHealthLineDataSet.NodeDrawStyle() { // from class: com.huawei.health.knit.section.view.SectionScoringMgmt.5
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return 2.5f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i) {
                return 1.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return true;
            }
        });
        return hwHealthLineDataSet;
    }

    private void e(HwHealthLineDataSet hwHealthLineDataSet, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        hwHealthLineDataSet.setCircleColors(arrayList);
    }

    @Override // com.huawei.health.knit.section.view.SectionScoring, com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionScoringMgmt";
    }

    @Override // com.huawei.health.knit.section.view.SectionScoring
    public void setSuggestRootLayoutVisibility(int i) {
        if (this.u != null) {
            this.u.setVisibility(8);
            if (this.i) {
                this.f7909c.setVisibility(8);
            } else if (i == 0 && this.d) {
                this.f7909c.setVisibility(0);
            } else {
                this.f7909c.setVisibility(8);
            }
        }
    }
}
