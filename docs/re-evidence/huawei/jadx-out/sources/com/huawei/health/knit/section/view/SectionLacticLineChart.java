package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.chart.LacticLineChart;
import com.huawei.health.knit.section.utils.CardSelectedInterface;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fok;
import defpackage.fsx;
import defpackage.qpe;
import defpackage.qqw;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionLacticLineChart<ChartT extends HwHealthBaseScrollBarLineChart> extends BaseSectionLineChart<ChartT> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Observer f7808c;
    private String d;
    private boolean e;

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected DataInfos getJudgeDataInfos() {
        return null;
    }

    public SectionLacticLineChart(Context context) {
        super(context);
        this.d = "lthrHr";
        this.e = false;
        this.f7808c = new Observer() { // from class: com.huawei.health.knit.section.view.SectionLacticLineChart.5
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                if (!SectionLacticLineChart.this.getObserverLabel().equals(str) || objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Integer)) {
                    return;
                }
                int iIntValue = ((Integer) obj).intValue();
                SectionLacticLineChart.this.d = iIntValue == 0 ? "lthrHr" : "lthrPace";
                SectionLacticLineChart.this.d();
            }
        };
    }

    public SectionLacticLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = "lthrHr";
        this.e = false;
        this.f7808c = new Observer() { // from class: com.huawei.health.knit.section.view.SectionLacticLineChart.5
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                if (!SectionLacticLineChart.this.getObserverLabel().equals(str) || objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Integer)) {
                    return;
                }
                int iIntValue = ((Integer) obj).intValue();
                SectionLacticLineChart.this.d = iIntValue == 0 ? "lthrHr" : "lthrPace";
                SectionLacticLineChart.this.d();
            }
        };
    }

    public SectionLacticLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = "lthrHr";
        this.e = false;
        this.f7808c = new Observer() { // from class: com.huawei.health.knit.section.view.SectionLacticLineChart.5
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                if (!SectionLacticLineChart.this.getObserverLabel().equals(str) || objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Integer)) {
                    return;
                }
                int iIntValue = ((Integer) obj).intValue();
                SectionLacticLineChart.this.d = iIntValue == 0 ? "lthrHr" : "lthrPace";
                SectionLacticLineChart.this.d();
            }
        };
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected ChartT acquireCurrentChart(int i) {
        LacticLineChart lacticLineChart = new LacticLineChart(this.mContext);
        lacticLineChart.setMarkViewCenteredWhenEmpty(false);
        return lacticLineChart;
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected String parseEntry(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || !(hwHealthBaseEntry.getData() instanceof fsx)) {
            return "--";
        }
        int y = (int) hwHealthBaseEntry.getY();
        if (b()) {
            float fC = y;
            if (UnitUtil.f()) {
                fC = (float) UnitUtil.c(y, 3);
            }
            return qpe.c(fC);
        }
        return UnitUtil.e(y, 1, 0);
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected void updateDateAndTime(String str, List<HwHealthMarkerView.d> list) {
        if (this.mSecondLayerDateTime != null) {
            this.mSecondLayerDateTime.setText(str);
        }
        notifyCursorDateAndTime(str, list);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionLacticLineChart";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.mChartHolder instanceof CardSelectedInterface) {
            ((CardSelectedInterface) this.mChartHolder).setShowDataType(this.d);
            this.mCurrentChart.clearValues();
            this.mChartHolder.addDataLayer(this.mCurrentChart, this.mDataInfos);
            this.mCurrentChart.setWillNotDraw(false);
            HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.mCurrentChart.acquireScrollAdapter();
            scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
            this.mCurrentChart.resetYaxisAnimateValue();
            this.mCurrentChart.refresh();
            e();
        }
    }

    private boolean b() {
        return "lthrPace".equals(this.d);
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart, com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        int iC = qqw.c(map, "CURSOR_UP_AVERAGE_UNIT", -1);
        if (iC != -1) {
            this.f7807b = iC;
        }
        e();
        super.bindParamsToView(map);
        qsp.e(this.mHorizontalBtn, qqw.c(map, "HORIZONTAL_BTN", R.drawable.ic_public_chart_fullscreen));
        this.mHorizontalBtn.setVisibility(0);
        if (!this.e) {
            ObserverManagerUtil.d(this.f7808c, getObserverLabel());
            this.e = true;
        }
        this.mHorizontalBtn.setOnClickListener((OnClickSectionListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null));
    }

    private void e() {
        String string = getResources().getString(this.f7807b);
        if (b()) {
            string = getResources().getString(R.string.IDS_pace_unit);
            if (UnitUtil.f()) {
                string = getResources().getString(R.string.IDS_pace_unit_mi);
            }
        }
        this.mThirdLayerCursorUnit.setText(string);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.third_layer_layout);
        if (LanguageUtil.br(getContext()) && b()) {
            relativeLayout.setLayoutDirection(0);
        } else {
            relativeLayout.setLayoutDirection(3);
        }
    }

    protected String getObserverLabel() {
        return fok.b(this.mDataInfos);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void clear() {
        super.clear();
        ObserverManagerUtil.a(this.f7808c, getObserverLabel());
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected void refreshChart(ChartT chartt) {
        chartt.reflesh(this.mStartTimeStampMillis);
    }
}
