package i00;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li00/e;", "Li00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "transformer", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        h.o(viewPortHandler, yAxis, transformer);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void drawYLabels(Canvas canvas, float f14, float[] fArr, float f15) {
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void renderGridLines(Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void renderLimitLines(Canvas canvas) {
        canvas.getClass();
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null || limitLines.isEmpty()) {
            return;
        }
        float[] fArr = {0.0f, 0.0f};
        Path path = new Path();
        path.reset();
        for (LimitLine limitLine : limitLines) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(limitLine.getLineColor());
            paint.setStrokeWidth(limitLine.getLineWidth());
            paint.setPathEffect(limitLine.getDashPathEffect());
            fArr[1] = limitLine.getLimit();
            getTransformer().pointValuesToPixel(fArr);
            path.moveTo(this.mViewPortHandler.contentLeft(), fArr[1]);
            path.lineTo(this.mViewPortHandler.contentRight(), fArr[1]);
            canvas.drawPath(path, paint);
            path.reset();
            String label = limitLine.getLabel();
            Paint paint2 = new Paint();
            paint2.setStyle(limitLine.getTextStyle());
            paint2.setPathEffect(null);
            paint2.setColor(limitLine.getTextColor());
            paint2.setTypeface(limitLine.getTypeface());
            paint2.setStrokeWidth(0.5f);
            paint2.setTextSize(limitLine.getTextSize());
            paint2.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(label, this.mViewPortHandler.contentLeft() - this.mYAxis.getXOffset(), (Utils.calcTextHeight(paint2, label) / 2) + fArr[1], paint2);
        }
    }
}
