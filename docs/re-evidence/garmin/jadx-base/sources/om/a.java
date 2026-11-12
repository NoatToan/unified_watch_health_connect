package om;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.chartingv2.renderer.ScatterChartRenderer;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class a extends ScatterChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f132878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f132879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f132880c;

    public a(CombinedChart combinedChart, mz.d dVar) {
        super(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler());
        this.f132879b = new Path();
        Paint paint = new Paint(1);
        this.f132880c = paint;
        this.f132878a = dVar.f121619a + dVar.f121620b;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    @Override // com.github.mikephil.chartingv2.renderer.LineScatterCandleRadarRenderer
    public final void drawHighlightLines(Canvas canvas, float[] fArr, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet) {
        canvas.save();
        canvas.restore();
        int highLightColor = iLineScatterCandleRadarDataSet.getHighLightColor();
        float highlightLineWidth = iLineScatterCandleRadarDataSet.getHighlightLineWidth();
        Path path = this.f132879b;
        path.reset();
        path.moveTo(fArr[0], this.f132878a);
        path.lineTo(fArr[0], fArr[1]);
        this.mHighlightPaint.setColor(highLightColor);
        this.mHighlightPaint.setStrokeWidth(highlightLineWidth);
        Paint paint = this.f132880c;
        paint.setColor(highLightColor);
        canvas.drawPath(path, this.mHighlightPaint);
        canvas.drawCircle(fArr[0], fArr[1], 8.0f, paint);
    }
}
