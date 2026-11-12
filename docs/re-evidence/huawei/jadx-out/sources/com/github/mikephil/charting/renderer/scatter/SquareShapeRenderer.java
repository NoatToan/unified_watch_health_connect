package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes21.dex */
public class SquareShapeRenderer implements IShapeRenderer {
    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f, float f2, Paint paint) {
        float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize());
        float f3 = fConvertDpToPixel / 2.0f;
        float fConvertDpToPixel2 = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius());
        float f4 = (fConvertDpToPixel - (fConvertDpToPixel2 * 2.0f)) / 2.0f;
        float f5 = f4 / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        if (fConvertDpToPixel > 0.0d) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f4);
            float f6 = f - fConvertDpToPixel2;
            float f7 = f2 - fConvertDpToPixel2;
            float f8 = f + fConvertDpToPixel2;
            float f9 = f2 + fConvertDpToPixel2;
            canvas.drawRect(f6 - f5, f7 - f5, f8 + f5, f9 + f5, paint);
            if (scatterShapeHoleColor != 1122867) {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(scatterShapeHoleColor);
                canvas.drawRect(f6, f7, f8, f9, paint);
                return;
            }
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f - f3, f2 - f3, f + f3, f2 + f3, paint);
    }
}
