package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes21.dex */
public class TriangleShapeRenderer implements IShapeRenderer {
    protected Path mTrianglePathBuffer = new Path();

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f, float f2, Paint paint) {
        float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize());
        float f3 = fConvertDpToPixel / 2.0f;
        float fConvertDpToPixel2 = (fConvertDpToPixel - (Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius()) * 2.0f)) / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.mTrianglePathBuffer;
        path.reset();
        float f4 = f2 - f3;
        path.moveTo(f, f4);
        float f5 = f + f3;
        float f6 = f2 + f3;
        path.lineTo(f5, f6);
        float f7 = f - f3;
        path.lineTo(f7, f6);
        double d = fConvertDpToPixel;
        if (d > 0.0d) {
            path.lineTo(f, f4);
            float f8 = f7 + fConvertDpToPixel2;
            float f9 = f6 - fConvertDpToPixel2;
            path.moveTo(f8, f9);
            path.lineTo(f5 - fConvertDpToPixel2, f9);
            path.lineTo(f, f4 + fConvertDpToPixel2);
            path.lineTo(f8, f9);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (d <= 0.0d || scatterShapeHoleColor == 1122867) {
            return;
        }
        paint.setColor(scatterShapeHoleColor);
        path.moveTo(f, f4 + fConvertDpToPixel2);
        float f10 = f6 - fConvertDpToPixel2;
        path.lineTo(f5 - fConvertDpToPixel2, f10);
        path.lineTo(f7 + fConvertDpToPixel2, f10);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
    }
}
