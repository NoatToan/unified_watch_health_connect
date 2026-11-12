package com.xiaomi.hm.health.baseui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes19.dex */
public class RoundedCornersImageView extends AppCompatImageView {
    private Path a;
    private RectF b;
    private float[] c;
    private Paint d;
    private PorterDuffXfermode e;
    private PaintFlagsDrawFilter f;
    public Bitmap mSrcBitmap;

    public RoundedCornersImageView(Context context) {
        this(context, null);
    }

    private void a(int i, int i2, int i3, int i4) {
        float[] fArr = this.c;
        float f = i;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = i2;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = i3;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = i4;
        fArr[6] = f4;
        fArr[7] = f4;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mSrcBitmap == null) {
            return;
        }
        this.d.setAntiAlias(true);
        this.d.setColor(-1);
        setLayerType(2, this.d);
        canvas.save();
        canvas.setDrawFilter(this.f);
        this.b.set(0.0f, 0.0f, getWidth(), getHeight());
        this.a.addRoundRect(this.b, this.c, Path.Direction.CCW);
        canvas.drawPath(this.a, this.d);
        this.d.setXfermode(this.e);
        Bitmap bitmap = this.mSrcBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.b, this.d);
        }
        this.d.setXfermode(null);
        canvas.restore();
    }

    public void setSrcBitmap(Bitmap bitmap) {
        this.mSrcBitmap = bitmap;
        postInvalidate();
    }

    public RoundedCornersImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedCornersImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Path();
        this.b = new RectF();
        this.c = new float[8];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedCornersImageView, i, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedCornersImageView_corner_top_left, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedCornersImageView_corner_top_right, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedCornersImageView_corner_bottom_right, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedCornersImageView_corner_bottom_left, 0);
        typedArrayObtainStyledAttributes.recycle();
        a(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        this.d = new Paint(1);
        this.e = new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY);
        this.f = new PaintFlagsDrawFilter(0, 3);
    }
}
