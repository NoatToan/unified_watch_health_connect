package com.huawei.ui.commonui.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class GradientCircle extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f23553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f23554c;
    private float d;
    private RectF e;

    public GradientCircle(Context context) {
        super(context);
        b();
    }

    public GradientCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public GradientCircle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        setLayerType(2, null);
        final float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.health_gradient_circle_width);
        post(new Runnable() { // from class: com.huawei.ui.commonui.indicator.GradientCircle.2
            @Override // java.lang.Runnable
            public void run() {
                int measuredWidth = GradientCircle.this.getMeasuredWidth();
                float f = dimensionPixelSize / 2.0f;
                float f2 = measuredWidth;
                float f3 = f2 - f;
                GradientCircle.this.e = new RectF(f, f, f3, f3);
                GradientCircle.this.f23554c = new Paint();
                float f4 = f2 / 2.0f;
                SweepGradient sweepGradient = new SweepGradient(f4, f4, new int[]{ContextCompat.getColor(GradientCircle.this.getContext(), R.color.gradient_circle_low_color), ContextCompat.getColor(GradientCircle.this.getContext(), R.color.gradient_circle_medium_color), ContextCompat.getColor(GradientCircle.this.getContext(), R.color.gradient_circle_high_color), ContextCompat.getColor(GradientCircle.this.getContext(), R.color.gradient_circle_low_color)}, new float[]{0.0f, 0.40833333f, 0.81666666f, 0.95f});
                Matrix matrix = new Matrix();
                matrix.setRotate(123.0f, f4, f4);
                sweepGradient.setLocalMatrix(matrix);
                GradientCircle.this.f23554c.setShader(sweepGradient);
                GradientCircle.this.f23554c.setAntiAlias(true);
                GradientCircle.this.f23554c.setStrokeCap(Paint.Cap.ROUND);
                GradientCircle.this.f23554c.setStyle(Paint.Style.STROKE);
                GradientCircle.this.f23554c.setStrokeWidth(dimensionPixelSize);
                GradientCircle.this.invalidate();
            }
        });
        Paint paint = new Paint();
        this.f23553b = paint;
        paint.setColor(ContextCompat.getColor(getContext(), R.color.gradient_circle_bg));
        this.f23553b.setAntiAlias(true);
        this.f23553b.setStrokeCap(Paint.Cap.ROUND);
        this.f23553b.setStyle(Paint.Style.STROKE);
        this.f23553b.setStrokeWidth(dimensionPixelSize);
    }

    public void e(float f, float f2) {
        this.d = f;
        this.f23552a = f2;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e == null) {
            return;
        }
        canvas.save();
        canvas.drawArc(this.e, 123.0f, 294.0f, false, this.f23553b);
        canvas.drawArc(this.e, 123.0f, Math.min(this.d / this.f23552a, 1.0f) * 294.0f, false, this.f23554c);
        canvas.restore();
    }
}
