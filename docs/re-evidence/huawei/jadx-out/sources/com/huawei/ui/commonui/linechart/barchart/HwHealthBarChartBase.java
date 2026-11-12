package com.huawei.ui.commonui.linechart.barchart;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import defpackage.njy;
import defpackage.qlx;
import defpackage.qly;
import defpackage.qlz;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthBarChartBase extends HwHealthBaseScrollBarLineChart<qly> implements HwHealthBarDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f23591b;
    private boolean d;
    private boolean e;

    public HwHealthBarChartBase(Context context) {
        super(context);
        this.f23591b = false;
        this.f23590a = true;
        this.d = false;
        this.e = false;
    }

    public HwHealthBarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23591b = false;
        this.f23590a = true;
        this.d = false;
        this.e = false;
    }

    public HwHealthBarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23591b = false;
        this.f23590a = true;
        this.d = false;
        this.e = false;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new qlz(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new qlx(this));
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
        if (this.e) {
            this.mXAxis.calculate(((qly) this.mData).getXMin() - (((qly) this.mData).a() / 2.0f), ((qly) this.mData).getXMax() + (((qly) this.mData).a() / 2.0f));
        } else {
            this.mXAxis.calculate(((qly) this.mData).getXMin(), ((qly) this.mData).getXMax());
        }
        super.calcMinMax();
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public boolean isDrawValueAboveBarEnabled() {
        return this.f23590a;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public boolean isDrawBarShadowEnabled() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public boolean isHighlightFullBarEnabled() {
        return this.f23591b;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public qly getBarData() {
        return (qly) this.mData;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void refresh() {
        for (T t : ((qly) this.mData).getDataSets()) {
            if (t != null) {
                t.setValues(t.acquireEntryVals());
                t.makeDataCalculated(true);
            }
        }
        notifyDataSetChanged();
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
    }

    public void e(boolean z, boolean z2) {
        if (this.mRenderer instanceof qlz) {
            ((qlz) this.mRenderer).d(z, z2);
        } else {
            LogUtil.j("HwHealthBarChartBase", "mRenderer is not HwHealthBarChartRenderer");
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public long queryMarkerViewTimeRangeMin() {
        long jQueryMarkerViewTimeMills = queryMarkerViewTimeMills();
        List<T> dataSets = ((qly) this.mData).getDataSets();
        return njy.e(dataSets) ? jQueryMarkerViewTimeMills : ((long) ((HwHealthBaseBarDataSet) ((IHwHealthBarDataSet) dataSets.get(0))).acquireValuePresentRangeMin((int) (jQueryMarkerViewTimeMills / 60000))) * 60000;
    }

    public void setIsDrawBarShadow(boolean z) {
        this.d = z;
    }
}
