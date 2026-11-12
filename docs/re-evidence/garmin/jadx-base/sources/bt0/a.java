package bt0;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lbt0/a;", "Li00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "transformer", "", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;I)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i00.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21033i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, int i14) {
        super(viewPortHandler, yAxis, transformer);
        vb.h.o(viewPortHandler, yAxis, transformer);
        this.f21033i = i14;
    }

    @Override // i00.b, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void renderAxisLabels(Canvas canvas) {
        float fContentRight;
        float fContentRight2;
        float f14;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled() && canvas != null) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.f21033i);
            float xOffset = this.mYAxis.getXOffset();
            float yOffset = this.mYAxis.getYOffset() + (Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f);
            YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
            YAxis.YAxisLabelPosition labelPosition = this.mYAxis.getLabelPosition();
            if (axisDependency == YAxis.AxisDependency.LEFT) {
                YAxis.YAxisLabelPosition yAxisLabelPosition = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                Paint paint = this.mAxisLabelPaint;
                if (labelPosition == yAxisLabelPosition) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    fContentRight = this.mViewPortHandler.offsetLeft();
                    f14 = fContentRight - xOffset;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    fContentRight2 = this.mViewPortHandler.offsetLeft();
                    f14 = fContentRight2 + xOffset;
                }
            } else {
                YAxis.YAxisLabelPosition yAxisLabelPosition2 = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                Paint paint2 = this.mAxisLabelPaint;
                if (labelPosition == yAxisLabelPosition2) {
                    paint2.setTextAlign(Paint.Align.LEFT);
                    fContentRight2 = this.mViewPortHandler.contentRight();
                    f14 = fContentRight2 + xOffset;
                } else {
                    paint2.setTextAlign(Paint.Align.RIGHT);
                    fContentRight = this.mViewPortHandler.contentRight();
                    f14 = fContentRight - xOffset;
                }
            }
            drawYLabels(canvas, f14, transformedPositions, yOffset);
        }
    }
}
