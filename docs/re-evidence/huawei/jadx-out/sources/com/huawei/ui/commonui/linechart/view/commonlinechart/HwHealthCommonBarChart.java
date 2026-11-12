package com.huawei.ui.commonui.linechart.view.commonlinechart;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qnq;
import defpackage.qnr;
import defpackage.qnt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HwHealthCommonBarChart extends HwHealthLineChart {
    private static final float EXTRA_BOTTOM_OFFSET = 7.0f;
    private static final float EXTRA_TOP_OFFSET = 5.0f;
    public static final int NUMBER_TEN = 10;
    private static final int ONE_MINUTE = 60;
    private static final String TAG = "HwHealthCommonBarChart";
    protected Context mContext;
    protected d mOnScrollPagerAnimateMgr;

    protected abstract qnr getHealthLineDataSet(HwHealthBaseBarLineData hwHealthBaseBarLineData);

    protected abstract qnq getLineChartRender(Context context, DataInfos dataInfos);

    protected abstract void initCursorMode();

    protected abstract void initXAxis();

    protected abstract void initYRender();

    public HwHealthCommonBarChart(Context context) {
        super(context);
        this.mOnScrollPagerAnimateMgr = new d();
        this.mContext = context;
        this.mRenderer = getLineChartRender(context, null);
        initStyle();
    }

    public HwHealthCommonBarChart(Context context, DataInfos dataInfos) {
        super(context);
        this.mOnScrollPagerAnimateMgr = new d();
        this.mContext = null;
        LogUtil.d(TAG, "construct chart");
        this.mContext = context;
        this.mRenderer = getLineChartRender(context, dataInfos);
        initStyle();
    }

    public HwHealthCommonBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnScrollPagerAnimateMgr = new d();
        this.mContext = null;
    }

    public HwHealthCommonBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnScrollPagerAnimateMgr = new d();
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
        this.mOnScrollPagerAnimateMgr.e(bVar);
        if (this.mMarkerViewPosition == MARKER_VIEW_POSITION_UNSET) {
            bVar.c();
            return;
        }
        qnr healthLineDataSet = getHealthLineDataSet((HwHealthBaseBarLineData) getData());
        if (healthLineDataSet == null) {
            bVar.c();
            return;
        }
        DataInfos dataInfosA = healthLineDataSet.a();
        if ((dataInfosA == null || !dataInfosA.isDayData()) && this.mMarkerViewPosition != null) {
            attachDataView(bVar, healthLineDataSet);
        }
    }

    private void attachDataView(HwHealthBaseScrollBarLineChart<qnt>.b bVar, qnr qnrVar) {
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
        } while (next.getDataSet() != qnrVar);
        if (next == null) {
            bVar.c();
        } else {
            markerScrollToGoalPosition(bVar, qnrVar);
        }
    }

    private void markerScrollToGoalPosition(HwHealthBaseScrollBarLineChart<qnt>.b bVar, qnr qnrVar) {
        int iC = (int) this.mMarkerViewPosition.c();
        if (iC >= ((int) this.mRangeBoardMax) - 10) {
            iC -= 10;
        }
        if (iC <= this.mRangeBoardMin + 10.0f) {
            iC += 10;
        }
        scrollMarkerViewToUnixTime(true, qnh.h(qnrVar.a(qnh.f(iC))), bVar);
    }

    protected static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<HwHealthBaseScrollBarLineChart<qnt>.b> f23740b = new ArrayList(16);

        protected d() {
        }

        public void e(HwHealthBaseScrollBarLineChart<qnt>.b bVar) {
            if (this.f23740b.contains(bVar)) {
                return;
            }
            this.f23740b.add(bVar);
        }
    }
}
