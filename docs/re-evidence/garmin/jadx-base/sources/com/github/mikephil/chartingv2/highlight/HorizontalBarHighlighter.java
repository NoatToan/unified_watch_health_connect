package com.github.mikephil.chartingv2.highlight;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class HorizontalBarHighlighter extends BarHighlighter {
    public HorizontalBarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    @Override // com.github.mikephil.chartingv2.highlight.BarHighlighter
    public float getBase(float f14) {
        float[] fArr = {0.0f, f14};
        ((BarDataProvider) this.mChart).getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        float f15 = fArr[1];
        return f15 - (((BarDataProvider) this.mChart).getBarData().getGroupSpace() * ((int) (f15 / (((BarDataProvider) this.mChart).getBarData().getGroupSpace() + ((BarDataProvider) this.mChart).getBarData().getDataSetCount()))));
    }

    @Override // com.github.mikephil.chartingv2.highlight.BarHighlighter, com.github.mikephil.chartingv2.highlight.ChartHighlighter
    public Highlight getHighlight(float f14, float f15) {
        Highlight highlight = super.getHighlight(f14, f15);
        if (highlight == null) {
            return highlight;
        }
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarDataProvider) this.mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex());
        if (!iBarDataSet.isStacked()) {
            return highlight;
        }
        float[] fArr = {f15, 0.0f};
        ((BarDataProvider) this.mChart).getTransformer(iBarDataSet.getAxisDependency()).pixelsToValue(fArr);
        return getStackedHighlight(highlight, iBarDataSet, highlight.getXIndex(), highlight.getDataSetIndex(), fArr[0]);
    }

    @Override // com.github.mikephil.chartingv2.highlight.BarHighlighter, com.github.mikephil.chartingv2.highlight.ChartHighlighter
    public int getXIndex(float f14) {
        if (!((BarDataProvider) this.mChart).getBarData().isGrouped()) {
            float[] fArr = {0.0f, f14};
            ((BarDataProvider) this.mChart).getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
            return Math.round(fArr[1]);
        }
        int base = ((int) getBase(f14)) / ((BarDataProvider) this.mChart).getBarData().getDataSetCount();
        int xValCount = ((BarDataProvider) this.mChart).getData().getXValCount();
        if (base < 0) {
            return 0;
        }
        return base >= xValCount ? xValCount - 1 : base;
    }
}
