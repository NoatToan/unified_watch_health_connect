package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.huawei.health.knit.section.chart.HwHealthBloodPressureLineChart;
import com.huawei.health.servicesui.R;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import defpackage.fsq;
import defpackage.ftw;
import defpackage.fua;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionMultiLineChart<ChartT extends HwHealthBaseScrollBarLineChart> extends BaseSectionLineChart<ChartT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Typeface f7849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthTextView f7850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HealthTextView f7851c;
    protected View d;
    protected View e;
    private RelativeLayout f;
    private HealthTextView g;
    private List<Object> h;
    private HealthTextView i;
    private HealthTextView j;
    private String k;
    private RelativeLayout l;
    private HealthTextView m;
    private HealthTextView n;
    private String o;

    public SectionMultiLineChart(Context context) {
        super(context);
        this.f7849a = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
    }

    public SectionMultiLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7849a = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
    }

    public SectionMultiLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7849a = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected void initSectionLineChart() {
        super.initSectionLineChart();
        setIntervalLegendLayout(this.mainView);
        d();
        this.f7851c = (HealthTextView) this.mainView.findViewById(R.id.third_layer_cursor_state_nextline);
        this.f = (RelativeLayout) this.mainView.findViewById(R.id.forth_layer_layout);
        this.g = (HealthTextView) this.mainView.findViewById(R.id.forth_layer_cursor_text);
        this.j = (HealthTextView) this.mainView.findViewById(R.id.forth_layer_cursor_value);
        this.i = (HealthTextView) this.mainView.findViewById(R.id.forth_layer_cursor_unit);
        this.g.setAutoTextInfo(8, 1, 2);
        this.j.setTypeface(this.f7849a);
        this.l = (RelativeLayout) this.mainView.findViewById(R.id.legend_group_layout);
        this.m = (HealthTextView) this.mainView.findViewById(R.id.left_bottom_legend);
        this.n = (HealthTextView) this.mainView.findViewById(R.id.right_bottom_legend);
        this.m = (HealthTextView) this.e.findViewById(R.id.left_bottom_legend);
        this.n = (HealthTextView) this.e.findViewById(R.id.right_bottom_legend);
        this.f.setVisibility(0);
        setLeftAndRightTextStatus(this.m);
        setLeftAndRightTextStatus(this.n);
        if (fua.f()) {
            getKnitFragment().setRecyclerViewDescendantFocusability(ARImageMetadata.HOT_PIXEL_MODE);
        }
    }

    private void setLeftAndRightTextStatus(HealthTextView healthTextView) {
        if (LanguageUtil.bn(this.mContext)) {
            setTextGlobalLayoutListener(healthTextView);
        }
    }

    private void setTextGlobalLayoutListener(final HealthTextView healthTextView) {
        healthTextView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.SectionMultiLineChart.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int lineCount = healthTextView.getLayout().getLineCount();
                LogUtil.a("OnGlobalLayoutListener,", Integer.valueOf(lineCount));
                if (lineCount >= 1) {
                    healthTextView.setTextSize(1, 9.0f);
                    healthTextView.setMaxLines(1);
                    healthTextView.setSingleLine();
                    healthTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
                healthTextView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    private void d() {
        if (this.mThirdLayerUnitLayoutView != null) {
            this.d = this.mThirdLayerUnitLayoutView.findViewById(R.id.linechart_cursor_verticalline);
            this.f7850b = (HealthTextView) this.mainView.findViewById(R.id.third_layer_cursor_state);
        }
    }

    private void a() {
        if (this.mIsEnglish || LanguageUtil.ab(this.mContext)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
        }
    }

    private void setIntervalLegendLayout(View view) {
        if (qrs.ac()) {
            e(view, R.id.linechart_view_legend_trable, R.id.linechart_view_legend_trable_inflated);
        } else {
            e(view, R.id.linechart_view_legend, R.id.linechart_view_legend_inflated);
        }
        View view2 = this.e;
        if (view2 != null) {
            this.m = (HealthTextView) view2.findViewById(R.id.left_bottom_legend);
            this.n = (HealthTextView) this.e.findViewById(R.id.right_bottom_legend);
        }
    }

    private void e(View view, int i, int i2) {
        if (this.mViewStub == null) {
            this.mViewStub = (ViewStub) view.findViewById(i);
        }
        if (this.mViewStub.getParent() != null) {
            this.e = this.mViewStub.inflate();
        } else {
            this.e = view.findViewById(i2);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected ChartT acquireCurrentChart(int i) {
        return new HwHealthBloodPressureLineChart(this.mContext.getApplicationContext());
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart, com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        super.bindParamsToView(map);
        this.h = (List) qqw.a(map, "CURSOR_DOWN_AVERAGE_TEXT", (Class<Object>) List.class, (Object) null);
        String str = (String) qqw.a(map, "CURSOR_DOWN_AVERAGE_UNIT", (Class<Object>) String.class, (Object) null);
        HealthTextView healthTextView = this.i;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        qsp.c(this.m, (Drawable) qqw.a(map, "LEFT_BOTTOM_LEGEND_SIGN", (Class<Object>) Drawable.class, (Object) null));
        qsp.b(this.m, (CharSequence) qqw.a(map, "LEFT_BOTTOM_LEGEND_TEXT", (Class<Object>) String.class, (Object) null));
        qsp.c(this.n, (Drawable) qqw.a(map, "RIGHT_BOTTOM_LEGEND_SIGN", (Class<Object>) Drawable.class, (Object) null));
        qsp.b(this.n, (CharSequence) qqw.a(map, "RIGHT_BOTTOM_LEGEND_TEXT", (Class<Object>) String.class, (Object) null));
        qsp.c((View) this.l, 0);
        this.o = (String) qqw.a(map, "CURSOR_UP_AVERAGE_UNIT", (Class<String>) String.class, "");
        e();
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected DataInfos getJudgeDataInfos() {
        return DataInfos.BloodPressureDayDetail;
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected void initLayer() {
        super.initLayer();
        List<Object> list = this.h;
        if (list != null && list.size() > 1 && (this.h.get(1) instanceof String)) {
            this.g.setText(String.valueOf(this.h.get(1)));
        }
        this.i.setVisibility(0);
        this.j.setText("--");
        this.k = String.valueOf(this.mThirdLayerCursorText.getText());
        e();
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected String parseEntry(HwHealthBaseEntry hwHealthBaseEntry) {
        LogUtil.a("SectionMultiLineChart", "parse multiLineChart entry");
        if (hwHealthBaseEntry == null || "".equals(a(hwHealthBaseEntry))) {
            return "--";
        }
        return a(hwHealthBaseEntry);
    }

    protected String c(HwHealthBaseEntry hwHealthBaseEntry) {
        LogUtil.a("SectionMultiLineChart", "parse multiLineChart extra data");
        if (hwHealthBaseEntry != null && (hwHealthBaseEntry.getData() instanceof fsq) && this.mThirdLayerCursorTextList != null && this.mThirdLayerCursorTextList.size() > 1 && this.mThirdLayerCursorText != null && this.g != null) {
            fsq fsqVar = (fsq) hwHealthBaseEntry.getData();
            if (fsqVar != null && fsqVar.d() != 1) {
                if (this.mThirdLayerCursorTextList.get(1) instanceof String) {
                    this.mThirdLayerCursorText.setText(String.valueOf(this.mThirdLayerCursorTextList.get(1)));
                    this.g.setText(String.valueOf(this.h.get(1)));
                }
            } else if (this.mThirdLayerCursorTextList.get(0) instanceof String) {
                this.mThirdLayerCursorText.setText(String.valueOf(this.mThirdLayerCursorTextList.get(0)));
                this.g.setText(String.valueOf(this.h.get(0)));
            }
            if (fsqVar != null) {
                String strE = UnitUtil.e(fsqVar.a(), 1, 1);
                if (strE.contains(".")) {
                    strE = strE.substring(0, strE.indexOf("."));
                }
                return strE.contains(",") ? strE.substring(0, strE.indexOf(",")) : strE;
            }
            return "--";
        }
        return "--";
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected void notifyView(List<HwHealthMarkerView.d> list) {
        String strC;
        super.notifyView(list);
        String strValueOf = String.valueOf(this.mThirdLayerCursorValue.getText());
        if (njy.e(list)) {
            LogUtil.j("SectionMultiLineChart", "notifyView datas is empty");
            strC = "--";
        } else {
            strC = c(list.get(list.size() - 1).f23737a);
        }
        if ("--".equals(strC) || "0".equals(strC)) {
            List<Object> list2 = this.h;
            if (list2 != null && list2.size() > 1 && (this.h.get(1) instanceof String)) {
                this.g.setText(String.valueOf(this.h.get(1)));
            }
            this.j.setText("--");
        } else {
            this.j.setText(strC);
        }
        if ("--".equals(strValueOf)) {
            this.d.setVisibility(8);
            this.f7850b.setVisibility(8);
            this.f7851c.setVisibility(8);
            if (this.mIsEnglish) {
                this.mCursorHavedataUnitLayout.setVisibility(8);
                this.mCursorNodataUnit.setVisibility(0);
            }
        } else {
            if (this.mIsEnglish) {
                this.mCursorNodataUnit.setVisibility(8);
                this.mCursorHavedataUnitLayout.setVisibility(0);
            }
            a();
            if (!LanguageUtil.ab(this.mContext)) {
                this.f7850b.setVisibility(0);
            }
        }
        this.k = String.valueOf(this.mThirdLayerCursorText.getText());
        e();
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected void updateDateAndTime(String str, List<HwHealthMarkerView.d> list) {
        notifyCursorDateAndTime(str, list);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionMultiLineChart";
    }

    private String a(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry.getData() instanceof fsq) {
            fsq fsqVar = (fsq) hwHealthBaseEntry.getData();
            if (fsqVar.c() == 0.0f || fsqVar.b() == 0.0f) {
                return "--";
            }
            int iB = (int) fsqVar.b();
            int iC = (int) fsqVar.c();
            String strE = UnitUtil.e(iB, 1, 1);
            String strE2 = UnitUtil.e(iC, 1, 1);
            if (strE.contains(".")) {
                strE = strE.substring(0, strE.indexOf("."));
            }
            if (strE2.contains(".")) {
                strE2 = strE2.substring(0, strE2.indexOf("."));
            }
            if (strE.contains(",")) {
                strE = strE.substring(0, strE.indexOf(","));
            }
            if (strE2.contains(",")) {
                strE2 = strE2.substring(0, strE2.indexOf(","));
            }
            c(ftw.e(ftw.b(iB, iC)), ftw.d(ftw.b(iB, iC)));
            return strE + "/" + strE2;
        }
        return "";
    }

    private void c(int i, String str) {
        a();
        if (LanguageUtil.ab(this.mContext)) {
            this.f7850b.setVisibility(8);
            this.f7851c.setVisibility(0);
            this.f7851c.setText(str);
            if (i != -1) {
                this.f7851c.setTextColor(i);
                return;
            }
            return;
        }
        this.f7851c.setVisibility(8);
        this.f7850b.setVisibility(0);
        this.f7850b.setText(str);
        if (i != -1) {
            this.f7850b.setTextColor(i);
        }
    }

    private void e() {
        LogUtil.a("SectionMultiLineChart", "setUnitText, mUnitStr=", this.o, " mThirdLayerText=", this.k);
        if (LanguageUtil.z(BaseApplication.getContext()) || LanguageUtil.bs(BaseApplication.getContext())) {
            qsp.c((View) this.mThirdLayerCursorUnit, 8);
            qsp.b(this.mThirdLayerCursorText, this.o + " " + this.k);
        } else {
            qsp.b(this.mThirdLayerCursorText, this.k);
            qsp.b(this.mThirdLayerCursorUnit, this.o);
        }
        b();
    }

    private void b() {
        if (LanguageUtil.br(BaseApplication.getContext())) {
            qsp.c((View) this.i, 8);
            qsp.b(this.g, this.g.getText().toString() + this.i.getText().toString());
        }
    }
}
