package zz;

import com.github.mikephil.charting.highlight.CombinedHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzz/h;", "Lcom/github/mikephil/charting/highlight/CombinedHighlighter;", "Lcom/github/mikephil/charting/interfaces/dataprovider/CombinedDataProvider;", "chart", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/CombinedDataProvider;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends CombinedHighlighter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CombinedDataProvider combinedDataProvider) {
        super(combinedDataProvider, combinedDataProvider);
        combinedDataProvider.getClass();
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public final Highlight getHighlight(float f14, float f15) {
        Highlight highlightForX;
        ?? entryForIndex;
        MPPointD valsForTouch = getValsForTouch(f14, f15);
        if (valsForTouch == null || (highlightForX = getHighlightForX((float) valsForTouch.f52826x, f14, f15)) == null || (entryForIndex = ((IBarLineScatterCandleBubbleDataSet) ((CombinedDataProvider) this.mChart).getData().getDataSetByIndex(highlightForX.getDataSetIndex())).getEntryForIndex(highlightForX.getDataIndex())) == 0 || entryForIndex.getY() == -9.223372E18f) {
            return null;
        }
        return highlightForX;
    }
}
