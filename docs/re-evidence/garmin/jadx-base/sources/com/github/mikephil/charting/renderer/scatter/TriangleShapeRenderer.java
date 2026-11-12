package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
public class TriangleShapeRenderer implements IShapeRenderer {
    protected Path mTrianglePathBuffer = new Path();

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f14, float f15, Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f16 = scatterShapeSize / 2.0f;
        float fConvertDpToPixel = (scatterShapeSize - (Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius()) * 2.0f)) / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.mTrianglePathBuffer;
        path.reset();
        float f17 = f15 - f16;
        path.moveTo(f14, f17);
        float f18 = f14 + f16;
        float f19 = f15 + f16;
        path.lineTo(f18, f19);
        float f22 = f14 - f16;
        path.lineTo(f22, f19);
        double d14 = scatterShapeSize;
        if (d14 > 0.0d) {
            path.lineTo(f14, f17);
            float f24 = f22 + fConvertDpToPixel;
            float f25 = f19 - fConvertDpToPixel;
            path.moveTo(f24, f25);
            path.lineTo(f18 - fConvertDpToPixel, f25);
            path.lineTo(f14, f17 + fConvertDpToPixel);
            path.lineTo(f24, f25);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (d14 <= 0.0d || scatterShapeHoleColor == 1122867) {
            return;
        }
        paint.setColor(scatterShapeHoleColor);
        path.moveTo(f14, f17 + fConvertDpToPixel);
        float f26 = f19 - fConvertDpToPixel;
        path.lineTo(f18 - fConvertDpToPixel, f26);
        path.lineTo(f22 + fConvertDpToPixel, f26);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
    }
}
