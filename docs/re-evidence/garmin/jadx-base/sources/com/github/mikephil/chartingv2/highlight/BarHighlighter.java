package com.github.mikephil.chartingv2.highlight;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BarHighlighter extends ChartHighlighter<BarDataProvider> {
    public BarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    public float getBase(float f14) {
        float[] fArr = {f14, 0.0f};
        ((BarDataProvider) this.mChart).getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        float f15 = fArr[0];
        return f15 - (((BarDataProvider) this.mChart).getBarData().getGroupSpace() * ((int) (f15 / (((BarDataProvider) this.mChart).getBarData().getGroupSpace() + ((BarDataProvider) this.mChart).getBarData().getDataSetCount()))));
    }

    public int getClosestStackIndex(Range[] rangeArr, float f14) {
        if (rangeArr != null && rangeArr.length != 0) {
            int i14 = 0;
            for (Range range : rangeArr) {
                if (range.contains(f14)) {
                    return i14;
                }
                i14++;
            }
            int iMax = Math.max(rangeArr.length - 1, 0);
            if (f14 > rangeArr[iMax].f52830to) {
                return iMax;
            }
        }
        return 0;
    }

    @Override // com.github.mikephil.chartingv2.highlight.ChartHighlighter
    public int getDataSetIndex(int i14, float f14, float f15) {
        if (!((BarDataProvider) this.mChart).getBarData().isGrouped()) {
            return 0;
        }
        float base = getBase(f14);
        int dataSetCount = ((BarDataProvider) this.mChart).getBarData().getDataSetCount();
        int i15 = ((int) base) % dataSetCount;
        if (i15 < 0) {
            return 0;
        }
        return i15 >= dataSetCount ? dataSetCount - 1 : i15;
    }

    @Override // com.github.mikephil.chartingv2.highlight.ChartHighlighter
    public Highlight getHighlight(float f14, float f15) {
        Highlight highlight = super.getHighlight(f14, f15);
        if (highlight == null) {
            return highlight;
        }
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarDataProvider) this.mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex());
        if (!iBarDataSet.isStacked()) {
            return highlight;
        }
        float[] fArr = {0.0f, f15};
        ((BarDataProvider) this.mChart).getTransformer(iBarDataSet.getAxisDependency()).pixelsToValue(fArr);
        return getStackedHighlight(highlight, iBarDataSet, highlight.getXIndex(), highlight.getDataSetIndex(), fArr[1]);
    }

    public Range[] getRanges(BarEntry barEntry) {
        float[] vals = barEntry.getVals();
        if (vals == null || vals.length == 0) {
            return new Range[0];
        }
        int length = vals.length;
        Range[] rangeArr = new Range[length];
        float fAbs = -barEntry.getNegativeSum();
        float f14 = 0.0f;
        for (int i14 = 0; i14 < length; i14++) {
            float f15 = vals[i14];
            if (f15 < 0.0f) {
                rangeArr[i14] = new Range(fAbs, Math.abs(f15) + fAbs);
                fAbs = Math.abs(f15) + fAbs;
            } else {
                float f16 = f15 + f14;
                rangeArr[i14] = new Range(f14, f16);
                f14 = f16;
            }
        }
        return rangeArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Highlight getStackedHighlight(Highlight highlight, IBarDataSet iBarDataSet, int i14, int i15, double d14) {
        BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXIndex(i14);
        if (barEntry == null || barEntry.getVals() == null) {
            return highlight;
        }
        Range[] ranges = getRanges(barEntry);
        int closestStackIndex = getClosestStackIndex(ranges, (float) d14);
        if (ranges.length > 0) {
            return new Highlight(i14, i15, closestStackIndex, ranges[closestStackIndex]);
        }
        return null;
    }

    @Override // com.github.mikephil.chartingv2.highlight.ChartHighlighter
    public int getXIndex(float f14) {
        if (!((BarDataProvider) this.mChart).getBarData().isGrouped()) {
            return super.getXIndex(f14);
        }
        int base = ((int) getBase(f14)) / ((BarDataProvider) this.mChart).getBarData().getDataSetCount();
        int xValCount = ((BarDataProvider) this.mChart).getData().getXValCount();
        if (base < 0) {
            return 0;
        }
        return base >= xValCount ? xValCount - 1 : base;
    }
}
