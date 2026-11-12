package kz;

import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.ChartHighlighter;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkz/a;", "Lcom/github/mikephil/chartingv2/highlight/ChartHighlighter;", "Lcom/github/mikephil/chartingv2/interfaces/dataprovider/BarLineScatterCandleBubbleDataProvider;", "chart", "<init>", "(Lcom/github/mikephil/chartingv2/interfaces/dataprovider/BarLineScatterCandleBubbleDataProvider;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends ChartHighlighter<BarLineScatterCandleBubbleDataProvider> {
    public a(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider) {
        super(barLineScatterCandleBubbleDataProvider);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [com.github.mikephil.chartingv2.interfaces.datasets.IDataSet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.github.mikephil.chartingv2.data.Entry, java.lang.Object] */
    @Override // com.github.mikephil.chartingv2.highlight.ChartHighlighter
    public Highlight getHighlight(float f14, float f15) {
        Entry entryForXIndex;
        int dataSetIndex;
        int xIndex = getXIndex(f14);
        if (xIndex == -2147483647) {
            return null;
        }
        int dataSetIndex2 = getDataSetIndex(xIndex, f14, f15);
        if (dataSetIndex2 == -2147483647) {
            if (this.mChart.getData().getDataSetCount() > 1) {
                int i14 = xIndex;
                while (true) {
                    if (i14 <= -1) {
                        while (true) {
                            if (getDataSetIndex(i14, f14, f15) == -2147483647) {
                                i14++;
                                if (i14 > xIndex) {
                                    dataSetIndex2 = -2147483647;
                                    break;
                                }
                            } else {
                                dataSetIndex = getDataSetIndex(i14, f14, f15);
                            }
                        }
                    } else if (getDataSetIndex(i14, f14, f15) != -2147483647) {
                        dataSetIndex = getDataSetIndex(i14, f14, f15);
                    } else {
                        i14--;
                    }
                    dataSetIndex2 = dataSetIndex;
                    break;
                }
            }
            int dataSetCount = this.mChart.getData().getDataSetCount();
            for (int i15 = 0; i15 < dataSetCount; i15++) {
                ?? dataSetByIndex = this.mChart.getData().getDataSetByIndex(i15);
                dataSetByIndex.getClass();
                if (dataSetByIndex.isHighlightEnabled() && (entryForXIndex = dataSetByIndex.getEntryForXIndex(xIndex)) != null && ((long) entryForXIndex.getVal()) != Long.MIN_VALUE) {
                    dataSetIndex2 = i15;
                }
            }
        }
        if (dataSetIndex2 == -2147483647) {
            return null;
        }
        ?? entryForXIndex2 = ((IBarLineScatterCandleBubbleDataSet) this.mChart.getData().getDataSetByIndex(dataSetIndex2)).getEntryForXIndex(xIndex);
        entryForXIndex2.getClass();
        if (((long) entryForXIndex2.getVal()) == Long.MIN_VALUE || entryForXIndex2.getVal() == Float.MIN_VALUE) {
            return null;
        }
        return new Highlight(entryForXIndex2.getXIndex(), dataSetIndex2);
    }
}
