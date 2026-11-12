package com.huawei.health.knit.section.chart;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import defpackage.frb;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qnq;
import defpackage.qnt;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class InteractorLineChart extends HwHealthLineChart {
    private static final float EXTRA_BOTTOM_OFFSET = 7.0f;
    private static final float EXTRA_TOP_OFFSET = 5.0f;
    public static final int NUMBER_TEN = 10;
    private static final int ONE_MINUTE = 60;
    private static final String TAG = "InteractorLineChart";
    protected Context mContext;
    protected b mOnScrollPagerAnimateMgr;

    protected abstract frb getHealthLineDataSet(HwHealthBaseBarLineData hwHealthBaseBarLineData);

    protected abstract qnq getLineChartRender(Context context, DataInfos dataInfos);

    protected abstract void initCursorMode();

    protected abstract void initXAxis();

    protected abstract void initYRender();

    public InteractorLineChart(Context context) {
        super(context);
        this.mOnScrollPagerAnimateMgr = new b();
        this.mContext = context;
        this.mRenderer = getLineChartRender(context, null);
        initStyle();
    }

    public InteractorLineChart(Context context, DataInfos dataInfos) {
        super(context);
        this.mOnScrollPagerAnimateMgr = new b();
        this.mContext = null;
        LogUtil.d(TAG, "construct chart");
        this.mContext = context;
        this.mRenderer = getLineChartRender(context, dataInfos);
        initStyle();
    }

    public InteractorLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnScrollPagerAnimateMgr = new b();
        this.mContext = null;
    }

    public InteractorLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnScrollPagerAnimateMgr = new b();
        this.mContext = null;
    }

    private void initStyle() {
        this.mLegend.setEnabled(false);
        getDescription().setEnabled(false);
        initXAxis();
        initYRender();
        setExtraTopOffset(5.0f);
        setExtraBottomOffset(EXTRA_BOTTOM_OFFSET);
        initCursorMode();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void setMarkerViewPosition(HwHealthBaseBarLineChart.d dVar) {
        this.mMarkerViewPosition = dVar;
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart
    public void customAxisShow() {
        if (njy.b(((qnt) this.mData).getDataSets())) {
            super.customAxisShow();
            return;
        }
        this.mAxisFirstParty.setEnabled(true);
        this.mAxisSecondParty.setEnabled(false);
        this.mAxisThirdParty.setEnabled(false);
        this.mAxisFirstParty.setDrawLabels(true);
        this.mAxisSecondParty.setDrawLabels(false);
        this.mAxisThirdParty.setDrawLabels(false);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart
    public void adsorbMarkerViewToSelectedDataByDataArea(boolean z, HwHealthBaseScrollBarLineChart<qnt>.b bVar) {
        if (bVar == null) {
            LogUtil.e(TAG, "adsorbMarkerViewToSelectedDataByDataArea scrollPagerAnimateListener == null");
            return;
        }
        this.mOnScrollPagerAnimateMgr.b(bVar);
        if (this.mMarkerViewPosition == MARKER_VIEW_POSITION_UNSET) {
            bVar.c();
            return;
        }
        frb healthLineDataSet = getHealthLineDataSet((HwHealthBaseBarLineData) getData());
        if (healthLineDataSet == null) {
            bVar.c();
            return;
        }
        DataInfos dataInfosA = healthLineDataSet.a();
        if ((dataInfosA == null || !dataInfosA.isDayData()) && this.mMarkerViewPosition != null) {
            attachDataView(bVar, healthLineDataSet);
        }
    }

    private void attachDataView(HwHealthBaseScrollBarLineChart<qnt>.b bVar, frb frbVar) {
        HwEntrys.HwDataEntry next;
        float[] fArr = {fetchMarkViewXValPx(), 0.0f};
        getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pixelsToValue(fArr);
        if (this.mMarkerViewPosition == MARKER_VIEW_POSITION_UNSET) {
            bVar.c();
            return;
        }
        this.mMarkerViewPosition.e(fArr[0]);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(new Highlight(this.mMarkerViewPosition.c(), 0, -1));
        Entry entryForXValue = ((qnt) this.mData).getEntryForXValue(this.mIndicesToHighlight[0].getX(), this);
        if (!(entryForXValue instanceof HwEntrys)) {
            LogUtil.j(TAG, "adsorb2SelectedDataByDataArea:entryForXValue must not be null");
            return;
        }
        if (arrayList.size() == 0) {
            bVar.c();
            return;
        }
        float[] fArr2 = {((Highlight) arrayList.get(0)).getX(), 0.0f};
        this.mFirstAxisTransformer.pointValuesToPixel(fArr2);
        if (!this.mViewPortHandler.isInBoundsX(fArr2[0])) {
            bVar.c();
            return;
        }
        Iterator<HwEntrys.HwDataEntry> it = ((HwEntrys) entryForXValue).getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getDataSet() != frbVar);
        if (next == null) {
            bVar.c();
        } else {
            markerScrollToGoalPosition(bVar, frbVar);
        }
    }

    private void markerScrollToGoalPosition(HwHealthBaseScrollBarLineChart<qnt>.b bVar, frb frbVar) {
        int iC = (int) this.mMarkerViewPosition.c();
        if (iC >= ((int) this.mRangeBoardMax) - 10) {
            iC -= 10;
        }
        if (iC <= this.mRangeBoardMin + 10.0f) {
            iC += 10;
        }
        scrollMarkerViewToUnixTime(true, qnh.h(frbVar.a(qnh.f(iC))), bVar);
    }

    protected static class b {
        private List<HwHealthBaseScrollBarLineChart<qnt>.b> e = new ArrayList(16);

        protected b() {
        }

        public void b(HwHealthBaseScrollBarLineChart<qnt>.b bVar) {
            if (this.e.contains(bVar)) {
                return;
            }
            this.e.add(bVar);
        }
    }

    public static class e implements IAxisValueFormatter {
        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f, AxisBase axisBase) {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            int i = (int) f;
            int i2 = i / 60;
            return decimalFormat.format(i2) + ":" + decimalFormat.format(i - (i2 * 60));
        }
    }
}
