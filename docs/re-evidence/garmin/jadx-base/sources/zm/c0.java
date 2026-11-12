package zm;

import android.graphics.Canvas;
import android.graphics.Path;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzm/c0;", "Lf00/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends f00.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f205237h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z zVar, OverlayCombinedChart overlayCombinedChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, d0 d0Var) {
        super(overlayCombinedChart, chartAnimator, viewPortHandler, false, d0Var, 8, null);
        this.f205237h = zVar;
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
        boolean zIsVerticalHighlightIndicatorEnabled = iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled();
        z zVar = this.f205237h;
        if (zIsVerticalHighlightIndicatorEnabled) {
            Path path = zVar.f205272e;
            Path path2 = zVar.f205272e;
            path.reset();
            path2.moveTo(f14, this.mViewPortHandler.contentTop());
            path2.lineTo(f14, f15);
            canvas.drawPath(path2, this.mHighlightPaint);
        }
        this.mCirclePaintInner.setColor(a7.b.getColor(zVar.f205268a, R.color.gcm_chart_highlight_line));
        canvas.drawCircle(f14, f15, 8.0f, this.mCirclePaintInner);
    }
}
