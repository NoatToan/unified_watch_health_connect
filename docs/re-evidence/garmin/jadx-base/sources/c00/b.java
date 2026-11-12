package c00;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.scatter.IShapeRenderer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc00/b;", "Lcom/github/mikephil/charting/renderer/scatter/IShapeRenderer;", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements IShapeRenderer {
    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public final void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f14, float f15, Paint paint) {
        canvas.getClass();
        iScatterDataSet.getClass();
        viewPortHandler.getClass();
        paint.getClass();
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f16 = scatterShapeSize / 2.0f;
        float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius());
        float fC = hb.a.c(fConvertDpToPixel, 2.0f, scatterShapeSize, 2.0f);
        float f17 = fC / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        canvas.save();
        canvas.rotate(45.0f, f14, f15);
        if (scatterShapeSize > 0.0d) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(fC);
            float f18 = f14 - fConvertDpToPixel;
            float f19 = f15 - fConvertDpToPixel;
            float f22 = f14 + fConvertDpToPixel;
            float f24 = f15 + fConvertDpToPixel;
            canvas.drawRect(f18 - f17, f19 - f17, f22 + f17, f24 + f17, paint);
            if (scatterShapeHoleColor != 1122867) {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(scatterShapeHoleColor);
                canvas.drawRect(f18, f19, f22, f24, paint);
            }
        } else {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f14 - f16, f15 - f16, f14 + f16, f15 + f16, paint);
        }
        canvas.restore();
    }
}
