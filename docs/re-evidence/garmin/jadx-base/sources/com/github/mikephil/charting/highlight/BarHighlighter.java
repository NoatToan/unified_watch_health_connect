package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointD;

/* JADX INFO: loaded from: classes13.dex */
public class BarHighlighter extends ChartHighlighter<BarDataProvider> {
    public BarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
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
            if (f14 > rangeArr[iMax].f52821to) {
                return iMax;
            }
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public BarLineScatterCandleBubbleData getData() {
        return ((BarDataProvider) this.mChart).getBarData();
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public float getDistance(float f14, float f15, float f16, float f17) {
        return Math.abs(f14 - f16);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f14, float f15) {
        Highlight highlight = super.getHighlight(f14, f15);
        if (highlight == null) {
            return null;
        }
        MPPointD valsForTouch = getValsForTouch(f14, f15);
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarDataProvider) this.mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex());
        if (iBarDataSet.isStacked()) {
            return getStackedHighlight(highlight, iBarDataSet, (float) valsForTouch.f52826x, (float) valsForTouch.f52827y);
        }
        MPPointD.recycleInstance(valsForTouch);
        return highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Highlight getStackedHighlight(Highlight highlight, IBarDataSet iBarDataSet, float f14, float f15) {
        BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(f14, f15);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.getYVals() == null) {
            return highlight;
        }
        Range[] ranges = barEntry.getRanges();
        if (ranges.length <= 0) {
            return null;
        }
        int closestStackIndex = getClosestStackIndex(ranges, f15);
        MPPointD pixelForValues = ((BarDataProvider) this.mChart).getTransformer(iBarDataSet.getAxisDependency()).getPixelForValues(highlight.getX(), ranges[closestStackIndex].f52821to);
        Highlight highlight2 = new Highlight(barEntry.getX(), barEntry.getY(), (float) pixelForValues.f52826x, (float) pixelForValues.f52827y, highlight.getDataSetIndex(), closestStackIndex, highlight.getAxis());
        MPPointD.recycleInstance(pixelForValues);
        return highlight2;
    }
}
