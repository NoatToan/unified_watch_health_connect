package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class CombinedHighlighter extends ChartHighlighter<CombinedDataProvider> implements IHighlighter {
    protected BarHighlighter barHighlighter;

    public CombinedHighlighter(CombinedDataProvider combinedDataProvider, BarDataProvider barDataProvider) {
        super(combinedDataProvider);
        this.barHighlighter = barDataProvider.getBarData() == null ? null : new BarHighlighter(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public List<Highlight> getHighlightsAtXValue(float f14, float f15, float f16) {
        this.mHighlightBuffer.clear();
        List<BarLineScatterCandleBubbleData> allData = ((CombinedDataProvider) this.mChart).getCombinedData().getAllData();
        for (int i14 = 0; i14 < allData.size(); i14++) {
            BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = allData.get(i14);
            BarHighlighter barHighlighter = this.barHighlighter;
            if (barHighlighter == null || !(barLineScatterCandleBubbleData instanceof BarData)) {
                int dataSetCount = barLineScatterCandleBubbleData.getDataSetCount();
                for (int i15 = 0; i15 < dataSetCount; i15++) {
                    IDataSet dataSetByIndex = allData.get(i14).getDataSetByIndex(i15);
                    if (dataSetByIndex.isHighlightEnabled()) {
                        for (Highlight highlight : buildHighlights(dataSetByIndex, i15, f14, DataSet.Rounding.CLOSEST)) {
                            highlight.setDataIndex(i14);
                            this.mHighlightBuffer.add(highlight);
                        }
                    }
                }
            } else {
                Highlight highlight2 = barHighlighter.getHighlight(f15, f16);
                if (highlight2 != null) {
                    highlight2.setDataIndex(i14);
                    this.mHighlightBuffer.add(highlight2);
                }
            }
        }
        return this.mHighlightBuffer;
    }
}
