package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class LineScatterCandleRadarRenderer extends DataRenderer {
    private Path mHighlightLinePath;

    public LineScatterCandleRadarRenderer(ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mHighlightLinePath = new Path();
    }

    public void drawHighlightLines(Canvas canvas, float[] fArr, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet) {
        this.mHighlightPaint.setColor(iLineScatterCandleRadarDataSet.getHighLightColor());
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled()) {
            this.mHighlightLinePath.reset();
            this.mHighlightLinePath.moveTo(fArr[0], this.mViewPortHandler.contentTop());
            this.mHighlightLinePath.lineTo(fArr[0], this.mViewPortHandler.contentBottom());
            canvas.drawPath(this.mHighlightLinePath, this.mHighlightPaint);
        }
        if (iLineScatterCandleRadarDataSet.isHorizontalHighlightIndicatorEnabled()) {
            this.mHighlightLinePath.reset();
            this.mHighlightLinePath.moveTo(this.mViewPortHandler.contentLeft(), fArr[1]);
            this.mHighlightLinePath.lineTo(this.mViewPortHandler.contentRight(), fArr[1]);
            canvas.drawPath(this.mHighlightLinePath, this.mHighlightPaint);
        }
    }
}
