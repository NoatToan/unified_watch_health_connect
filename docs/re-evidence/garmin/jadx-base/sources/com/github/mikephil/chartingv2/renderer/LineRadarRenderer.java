package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import com.google.android.flexbox.FlexItem;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class LineRadarRenderer extends LineScatterCandleRadarRenderer {
    public LineRadarRenderer(ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
    }

    private boolean clipPathSupported() {
        return Utils.getSDKInt() >= 18;
    }

    public void drawFilledPath(Canvas canvas, Path path, Drawable drawable) {
        if (!clipPathSupported()) {
            throw new RuntimeException("Fill-drawables not (yet) supported below API level 18, this code was run on API level " + Utils.getSDKInt() + ".");
        }
        canvas.save();
        canvas.clipPath(path);
        drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) this.mViewPortHandler.contentTop(), (int) this.mViewPortHandler.contentRight(), (int) this.mViewPortHandler.contentBottom());
        drawable.draw(canvas);
        canvas.restore();
    }

    public void drawFilledPath(Canvas canvas, Path path, int i14, int i15) {
        int i16 = (i14 & FlexItem.MAX_SIZE) | (i15 << 24);
        if (clipPathSupported()) {
            canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i16);
            canvas.restore();
            return;
        }
        Paint.Style style = this.mRenderPaint.getStyle();
        int color = this.mRenderPaint.getColor();
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mRenderPaint.setColor(i16);
        canvas.drawPath(path, this.mRenderPaint);
        this.mRenderPaint.setColor(color);
        this.mRenderPaint.setStyle(style);
    }
}
