package com.zhouyou.recyclerview.progressindicator.indicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes22.dex */
public class LineSpinFadeLoaderIndicator extends BallSpinFadeLoaderIndicator {
    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BallSpinFadeLoaderIndicator, com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i = 0; i < 8; i++) {
            canvas.save();
            BallSpinFadeLoaderIndicator.c cVarA = a(getWidth(), getHeight(), (getWidth() / 2.5f) - width, 0.7853981633974483d * ((double) i));
            canvas.translate(cVarA.a, cVarA.b);
            float[] fArr = this.c;
            canvas.scale(fArr[i], fArr[i]);
            canvas.rotate(i * 45);
            paint.setAlpha(this.d[i]);
            float f = -width;
            canvas.drawRoundRect(new RectF(f, f / 1.5f, width * 1.5f, width / 1.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }
}
