package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ChartHighlighter<T extends BarLineScatterCandleBubbleDataProvider> implements IHighlighter {
    protected T mChart;
    protected List<Highlight> mHighlightBuffer = new ArrayList();

    public ChartHighlighter(T t7) {
        this.mChart = t7;
    }

    public List<Highlight> buildHighlights(IDataSet iDataSet, int i14, float f14, DataSet.Rounding rounding) {
        Entry entryForXValue;
        ArrayList arrayList = new ArrayList();
        List<Entry> entriesForXValue = iDataSet.getEntriesForXValue(f14);
        if (entriesForXValue.size() == 0 && (entryForXValue = iDataSet.getEntryForXValue(f14, Float.NaN, rounding)) != null) {
            entriesForXValue = iDataSet.getEntriesForXValue(entryForXValue.getX());
        }
        if (entriesForXValue.size() != 0) {
            for (Entry entry : entriesForXValue) {
                MPPointD pixelForValues = this.mChart.getTransformer(iDataSet.getAxisDependency()).getPixelForValues(entry.getX(), entry.getY());
                arrayList.add(new Highlight(entry.getX(), entry.getY(), (float) pixelForValues.f52826x, (float) pixelForValues.f52827y, i14, iDataSet.getAxisDependency()));
            }
        }
        return arrayList;
    }

    public Highlight getClosestHighlightByPixel(List<Highlight> list, float f14, float f15, YAxis.AxisDependency axisDependency, float f16) {
        Highlight highlight = null;
        for (int i14 = 0; i14 < list.size(); i14++) {
            Highlight highlight2 = list.get(i14);
            if (axisDependency == null || highlight2.getAxis() == axisDependency) {
                float distance = getDistance(f14, f15, highlight2.getXPx(), highlight2.getYPx());
                if (distance < f16) {
                    highlight = highlight2;
                    f16 = distance;
                }
            }
        }
        return highlight;
    }

    public BarLineScatterCandleBubbleData getData() {
        return this.mChart.getData();
    }

    public float getDistance(float f14, float f15, float f16, float f17) {
        return (float) Math.hypot(f14 - f16, f15 - f17);
    }

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f14, float f15) {
        MPPointD valsForTouch = getValsForTouch(f14, f15);
        float f16 = (float) valsForTouch.f52826x;
        MPPointD.recycleInstance(valsForTouch);
        return getHighlightForX(f16, f14, f15);
    }

    public Highlight getHighlightForX(float f14, float f15, float f16) {
        List<Highlight> highlightsAtXValue = getHighlightsAtXValue(f14, f15, f16);
        if (highlightsAtXValue.isEmpty()) {
            return null;
        }
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        float minimumDistance = getMinimumDistance(highlightsAtXValue, f16, axisDependency);
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        return getClosestHighlightByPixel(highlightsAtXValue, f15, f16, minimumDistance < getMinimumDistance(highlightsAtXValue, f16, axisDependency2) ? axisDependency : axisDependency2, this.mChart.getMaxHighlightDistance());
    }

    public float getHighlightPos(Highlight highlight) {
        return highlight.getYPx();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    public List<Highlight> getHighlightsAtXValue(float f14, float f15, float f16) {
        this.mHighlightBuffer.clear();
        BarLineScatterCandleBubbleData data = getData();
        if (data == null) {
            return this.mHighlightBuffer;
        }
        int dataSetCount = data.getDataSetCount();
        for (int i14 = 0; i14 < dataSetCount; i14++) {
            ?? dataSetByIndex = data.getDataSetByIndex(i14);
            if (dataSetByIndex.isHighlightEnabled()) {
                this.mHighlightBuffer.addAll(buildHighlights(dataSetByIndex, i14, f14, DataSet.Rounding.CLOSEST));
            }
        }
        return this.mHighlightBuffer;
    }

    public float getMinimumDistance(List<Highlight> list, float f14, YAxis.AxisDependency axisDependency) {
        float f15 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            Highlight highlight = list.get(i14);
            if (highlight.getAxis() == axisDependency) {
                float fAbs = Math.abs(getHighlightPos(highlight) - f14);
                if (fAbs < f15) {
                    f15 = fAbs;
                }
            }
        }
        return f15;
    }

    public MPPointD getValsForTouch(float f14, float f15) {
        return this.mChart.getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(f14, f15);
    }
}
