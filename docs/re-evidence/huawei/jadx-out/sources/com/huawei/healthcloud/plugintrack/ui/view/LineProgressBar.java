package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.healthcloud.plugintrack.R;

/* JADX INFO: loaded from: classes33.dex */
public class LineProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f11261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f11262c;
    private float d;
    private int e;
    private float f;
    private Paint h;
    private int i;
    private int j;

    public LineProgressBar(Context context) {
        this(context, null);
    }

    public LineProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = null;
        this.f11261b = null;
        d(context, attributeSet);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        c(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    public void setMaxProgress(float f) {
        if (f < 0.0f) {
            this.f = 0.0f;
        } else {
            this.f = f;
        }
    }

    public void setProgress(float f) {
        if (f < 0.0f) {
            this.f11262c = 0.0f;
        } else {
            float f2 = this.f;
            if (f > f2) {
                this.f11262c = f2;
            } else {
                this.f11262c = f;
            }
        }
        this.d = this.f11262c / this.f;
        invalidate();
    }

    private void d(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lineProgressBar);
        try {
            this.f11260a = typedArrayObtainStyledAttributes.getColor(R.styleable.lineProgressBar_backgroundColor, ContextCompat.getColor(context, R.color.heart_rate_zone_background_color));
            this.i = typedArrayObtainStyledAttributes.getColor(R.styleable.lineProgressBar_heartProgressColor, ContextCompat.getColor(context, R.color.heart_rate_zone_background_color));
            this.f = typedArrayObtainStyledAttributes.getColor(R.styleable.lineProgressBar_totalProgress, 100);
            this.f11262c = typedArrayObtainStyledAttributes.getColor(R.styleable.lineProgressBar_nowProgress, 0);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.h = paint;
            paint.setAntiAlias(true);
            this.h.setStyle(Paint.Style.STROKE);
            this.h.setStrokeWidth(16.0f);
            this.h.setStrokeCap(Paint.Cap.ROUND);
            this.h.setStrokeJoin(Paint.Join.ROUND);
            Paint paint2 = new Paint();
            this.f11261b = paint2;
            paint2.setAntiAlias(true);
            this.f11261b.setStyle(Paint.Style.STROKE);
            this.f11261b.setStrokeWidth(16.0f);
            this.f11261b.setStrokeCap(Paint.Cap.ROUND);
            this.f11261b.setStrokeJoin(Paint.Join.ROUND);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void c() {
        this.j = getWidth();
        this.e = getHeight();
    }

    private void c(Canvas canvas) {
        this.f11261b.setColor(this.f11260a);
        float f = this.e / 2.0f;
        canvas.drawLine(10.0f, f, this.j - 10, f, this.f11261b);
        if (this.d != 0.0f) {
            this.h.setColor(this.i);
            float f2 = this.e / 2.0f;
            canvas.drawLine(10.0f, f2, ((this.j - 20) * this.d) + 10.0f, f2, this.h);
        }
    }
}
