package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import hb.a;

/* JADX INFO: loaded from: classes13.dex */
public class SquareShapeRenderer implements IShapeRenderer {
    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f14, float f15, Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f16 = scatterShapeSize / 2.0f;
        float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius());
        float fC = a.c(fConvertDpToPixel, 2.0f, scatterShapeSize, 2.0f);
        float f17 = fC / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        if (scatterShapeSize <= 0.0d) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f14 - f16, f15 - f16, f14 + f16, f15 + f16, paint);
            return;
        }
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
    }
}
