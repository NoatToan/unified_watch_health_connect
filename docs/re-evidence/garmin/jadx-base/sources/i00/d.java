package i00;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import vb.h;
import w5.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li00/d;", "Li00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "transformer", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        h.o(viewPortHandler, yAxis, transformer);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void drawYLabels(Canvas canvas, float f14, float[] fArr, float f15) {
        canvas.getClass();
        fArr.getClass();
        int i14 = this.mYAxis.mEntryCount;
        for (int i15 = 1; i15 < i14; i15++) {
            String formattedLabel = this.mYAxis.getFormattedLabel(i15);
            formattedLabel.getClass();
            canvas.drawText(formattedLabel, f14, fArr[(i15 * 2) + 1] + f15, this.mAxisLabelPaint);
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void renderGridLines(Canvas canvas) {
        canvas.getClass();
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawGridLinesEnabled()) {
            int iSave = canvas.save();
            canvas.clipRect(getGridClippingRect());
            Paint paintGrid = getPaintGrid();
            paintGrid.setColor(this.mYAxis.getGridColor());
            paintGrid.setStrokeWidth(this.mYAxis.getGridLineWidth());
            paintGrid.setPathEffect(this.mYAxis.getGridDashPathEffect());
            Path path = new Path();
            path.reset();
            int i14 = 0;
            int iN = r.n(0, getTransformedPositions().length - 1, 2);
            if (iN >= 0) {
                while (true) {
                    if (i14 != 0) {
                        canvas.drawPath(linePath(path, i14, getTransformedPositions()), getPaintGrid());
                        path.reset();
                    }
                    if (i14 == iN) {
                        break;
                    } else {
                        i14 += 2;
                    }
                }
            }
            canvas.restoreToCount(iSave);
        }
    }
}
