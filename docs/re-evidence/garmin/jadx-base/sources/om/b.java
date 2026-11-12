package om;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class b extends mz.a {
    public b(LineChart lineChart) {
        super(lineChart, lineChart.getAnimator(), lineChart.getViewPortHandler());
    }

    @Override // mz.a, com.github.mikephil.chartingv2.renderer.LineChartRenderer, com.github.mikephil.chartingv2.renderer.DataRenderer
    public final void drawData(Canvas canvas) {
        if (this.mChart.getLineData().getDataSetCount() >= 1) {
            this.f121604a = true;
            drawDataSet(canvas, (ILineDataSet) this.mChart.getLineData().getDataSetByIndex(0));
        }
        if (this.mChart.getLineData().getDataSetCount() >= 2) {
            this.f121604a = true;
            drawDataSet(canvas, (ILineDataSet) this.mChart.getLineData().getDataSetByIndex(1));
        }
        if (this.mChart.getLineData().getDataSetCount() == 3) {
            this.f121604a = false;
            float strokeWidth = this.mRenderPaint.getStrokeWidth();
            ILineDataSet iLineDataSet = (ILineDataSet) this.mChart.getLineData().getDataSetByIndex(2);
            this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
            this.mRenderPaint.setStrokeJoin(Paint.Join.ROUND);
            this.mRenderPaint.setDither(true);
            drawLinear(canvas, iLineDataSet);
            this.mRenderPaint.setStrokeWidth(strokeWidth);
        }
    }
}
