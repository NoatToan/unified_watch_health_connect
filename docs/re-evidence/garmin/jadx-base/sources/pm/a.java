package pm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.i;
import im.l;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpm/a;", "Lh00/i;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void renderLimitLines(Canvas canvas) {
        canvas.getClass();
        List<LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        int size = limitLines.size();
        for (int i14 = 0; i14 < size; i14++) {
            LimitLine limitLine = limitLines.get(i14);
            if (limitLine.isEnabled()) {
                int iSave = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                this.mLimitLineClippingRect.inset(0.0f, -limitLine.getLineWidth());
                canvas.clipRect(this.mLimitLineClippingRect);
                float[] fArr = {limitLine.getLimit(), 0.0f};
                this.mTrans.pointValuesToPixel(fArr);
                l lVar = limitLine instanceof l ? (l) limitLine : null;
                if (lVar != null) {
                    Path path = new Path();
                    path.moveTo(fArr[0], this.mViewPortHandler.contentBottom());
                    float[] fArr2 = {0.0f, lVar.f94155b + 0.5f};
                    this.mTrans.pointValuesToPixel(fArr2);
                    path.lineTo(fArr[0], fArr2[1]);
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(lVar.getLineColor());
                    paint.setStrokeWidth(lVar.getLineWidth());
                    paint.setPathEffect(lVar.getDashPathEffect());
                    canvas.drawPath(path, paint);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
