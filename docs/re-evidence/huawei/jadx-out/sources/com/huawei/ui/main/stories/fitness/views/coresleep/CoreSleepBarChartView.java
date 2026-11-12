package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.content.Context;
import android.graphics.Color;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.main.R;
import defpackage.umn;
import defpackage.umr;

/* JADX INFO: loaded from: classes43.dex */
public class CoreSleepBarChartView extends HwHealthBarChart {
    private OnBarChartViewDataChangedListener d;

    public interface OnBarChartViewDataChangedListener {
        void onBarChartViewDataChangedListener(float f);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public boolean isDrawYaxisLabelsOnHighLight() {
        return true;
    }

    public CoreSleepBarChartView(Context context) {
        super(context);
        e();
    }

    private void e() {
        this.mRenderer = new SleepBarChartRenderer(this, this, this.mAnimator, this.mViewPortHandler, getContext().getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit), getContext().getResources().getString(R.string.IDS_h_min_unit));
        this.mAxisFirstParty = new umn(this, HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        this.mAxisFirstParty.setDrawAxisLine(false);
        this.mAxisFirstParty.setAxisMinimum(0.0f);
        this.mAxisSecondParty = new umn(this, HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY);
        this.mAxisSecondParty.setDrawAxisLine(false);
        this.mAxisThirdParty = new umn(this, HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY);
        this.mAxisRendererFirstParty = new umr(getContext(), this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new umr(getContext(), this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        this.mAxisRendererThirdParty = new umr(getContext(), this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
        ((umn) this.mAxisFirstParty).setTextColor(Color.argb(255, 255, 255, 255));
        this.mAxisThirdParty.setDrawGridLines(false);
        this.mAxisThirdParty.setDrawLabels(false);
        this.mAxisThirdParty.setEnabled(false);
        this.mAxisThirdParty.setDrawAxisLine(false);
        this.mAxisFirstParty.setTextColor(Color.argb(127, 0, 0, 0));
        this.mAxisSecondParty.setTextColor(Color.argb(127, 0, 0, 0));
        this.mAxisThirdParty.setTextColor(Color.argb(127, 0, 0, 0));
        enableMarkerView(true);
        enableSpacePreserveForDataOverlay(true);
        e(true, false);
        ((SleepBarChartRenderer) this.mRenderer).c(new SleepBarChartRenderer.OnSleepTimeChangedListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepBarChartView.1
            @Override // com.huawei.ui.main.stories.fitness.views.coresleep.SleepBarChartRenderer.OnSleepTimeChangedListener
            public void onSleepTimeChangedListener(float f) {
                if (CoreSleepBarChartView.this.d != null) {
                    CoreSleepBarChartView.this.d.onBarChartViewDataChangedListener(f);
                }
            }
        });
    }

    public void setOnBarChartViewDataChangedListener(OnBarChartViewDataChangedListener onBarChartViewDataChangedListener) {
        this.d = onBarChartViewDataChangedListener;
    }

    public void a(int i, int i2, String... strArr) {
        ((umr) this.mAxisRendererFirstParty).c(i, i2, strArr);
    }
}
