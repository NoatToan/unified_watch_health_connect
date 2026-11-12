package com.huami.watch.qr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.journeyapps.barcodescanner.ViewfinderView;

/* JADX INFO: loaded from: classes16.dex */
public class CustomViewfinderView extends ViewfinderView {
    private static final long h = 16;
    private int a;
    private float b;
    private float c;
    private LinearGradient d;
    private float[] e;
    private int[] f;
    private Path g;

    public CustomViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        this.c = TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics());
        this.e = new float[]{0.0f, 0.5f, 1.0f};
        this.f = new int[]{16777215, -1, 16777215};
    }

    @Override // com.journeyapps.barcodescanner.ViewfinderView, android.view.View
    public void onDraw(Canvas canvas) {
        refreshSizes();
        Rect rect = this.framingRect;
        if (rect == null || this.previewFramingRect == null) {
            return;
        }
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int iWidth = rect.width() / 2;
        if (this.g == null) {
            Path path = new Path();
            this.g = path;
            path.addArc(new RectF(iCenterX - iWidth, iCenterY - iWidth, iCenterX + iWidth, iCenterY + iWidth), 0.0f, 360.0f);
        }
        canvas.save();
        canvas.clipPath(this.g, Region.Op.DIFFERENCE);
        canvas.drawColor(Color.parseColor("#B8000000"));
        canvas.restore();
        canvas.clipPath(this.g);
        if (this.resultBitmap != null) {
            this.paint.setAlpha(160);
            canvas.drawBitmap(this.resultBitmap, (Rect) null, rect, this.paint);
        } else {
            int i = (int) (this.a + this.c);
            this.a = i;
            if (i > rect.height()) {
                this.a = 0;
            }
            float f = rect.left;
            int i2 = rect.top;
            int i3 = this.a;
            LinearGradient linearGradient = new LinearGradient(f, i2 + i3, rect.right, i2 + i3, this.f, this.e, Shader.TileMode.CLAMP);
            this.d = linearGradient;
            this.paint.setShader(linearGradient);
            float f2 = rect.left;
            int i4 = rect.top;
            int i5 = this.a;
            canvas.drawRect(f2, i4 + i5, rect.right, i4 + i5 + this.b, this.paint);
            this.paint.setShader(null);
        }
        postInvalidateDelayed(16L, rect.left, rect.top, rect.right, rect.bottom);
    }
}
