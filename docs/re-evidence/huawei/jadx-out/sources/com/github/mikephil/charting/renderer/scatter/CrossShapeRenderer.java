package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes21.dex */
public class CrossShapeRenderer implements IShapeRenderer {
    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f, float f2, Paint paint) {
        float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize()) / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Utils.convertDpToPixel(1.0f));
        canvas.drawLine(f - fConvertDpToPixel, f2, f + fConvertDpToPixel, f2, paint);
        canvas.drawLine(f, f2 - fConvertDpToPixel, f, f2 + fConvertDpToPixel, paint);
    }
}
