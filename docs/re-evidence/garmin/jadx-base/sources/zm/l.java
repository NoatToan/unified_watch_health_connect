package zm;

import android.graphics.Canvas;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzm/l;", "Lf00/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends f00.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ OverlayCombinedChart f205246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f205247i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(OverlayCombinedChart overlayCombinedChart, boolean z14, o oVar, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, m mVar) {
        super(overlayCombinedChart, chartAnimator, viewPortHandler, z14, mVar);
        this.f205246h = overlayCombinedChart;
        this.f205247i = oVar;
        chartAnimator.getClass();
        viewPortHandler.getClass();
    }

    @Override // com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer
    public final void drawHighlightLines(Canvas canvas, float f14, float f15, ILineScatterCandleRadarDataSet<?> iLineScatterCandleRadarDataSet) {
        canvas.getClass();
        iLineScatterCandleRadarDataSet.getClass();
        this.mHighlightPaint.setColor(iLineScatterCandleRadarDataSet.getHighLightColor());
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        o oVar = this.f205247i;
        oVar.f205250a.reset();
        oVar.f205250a.moveTo(f14, this.mViewPortHandler.contentTop());
        oVar.f205250a.lineTo(f14, f15);
        canvas.drawPath(oVar.f205250a, this.mHighlightPaint);
        this.mCirclePaintInner.setColor(a7.b.getColor(this.f205246h.getContext(), R.color.gcm_chart_highlight_line));
        canvas.drawCircle(f14, f15, 8.0f, this.mCirclePaintInner);
    }
}
