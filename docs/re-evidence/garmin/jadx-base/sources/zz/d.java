package zz;

import android.graphics.PointF;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.highlight.ChartHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzz/d;", "Lcom/github/mikephil/charting/highlight/ChartHighlighter;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class d extends ChartHighlighter<BarLineChartBase<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f207539a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarLineChartBase<?> barLineChartBase) {
        super(barLineChartBase);
        barLineChartBase.getClass();
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public final Highlight getHighlightForX(float f14, float f15, float f16) {
        i iVar;
        if (this.f207539a == null) {
            return super.getHighlightForX(f14, f15, f16);
        }
        List<Highlight> highlightsAtXValue = getHighlightsAtXValue(f14, f15, f16);
        if (highlightsAtXValue.isEmpty() || (iVar = this.f207539a) == null) {
            return null;
        }
        return iVar.a(highlightsAtXValue, f14, new PointF(f15, f16));
    }
}
