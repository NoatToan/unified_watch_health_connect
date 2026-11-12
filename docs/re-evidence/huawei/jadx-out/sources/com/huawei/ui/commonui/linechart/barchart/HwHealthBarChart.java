package com.huawei.ui.commonui.linechart.barchart;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.ui.commonui.linechart.icommon.IOneDayShowable;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthBarChart extends HwHealthBarChartBase implements IOneDayShowable {
    public HwHealthBarChart(Context context) {
        super(context);
        e();
    }

    public HwHealthBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public HwHealthBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private void e() {
        this.mAxisFirstParty.setDrawAxisLine(false);
        this.mAxisSecondParty.setDrawAxisLine(false);
        this.mAxisFirstParty.setAxisMinimum(0.0f);
        this.mAxisSecondParty.setEnabled(false);
        getXAxis().setDrawGridLines(false);
        this.mAxisFirstParty.setAxisMaximum(12000.0f);
        makeReverse(true);
    }
}
