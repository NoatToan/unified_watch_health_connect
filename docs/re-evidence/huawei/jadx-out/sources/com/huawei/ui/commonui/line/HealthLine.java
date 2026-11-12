package com.huawei.ui.commonui.line;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class HealthLine extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PointF f23581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f23582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23583c;
    private int d;
    private float e;
    private Paint f;
    private float g;
    private PointF h;
    private float i;
    private int j;
    private int n;

    public HealthLine(Context context) {
        this(context, null);
        d();
    }

    public HealthLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new PointF();
        this.f23581a = new PointF();
        this.f23582b = new PointF();
        if (attributeSet == null) {
            LogUtil.j("CommonUI_HealthLine", "HealthLine AttributeSet is null");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.health_line);
        try {
            this.j = typedArrayObtainStyledAttributes.getInteger(R.styleable.health_line_line_type, 0);
            this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.health_line_line_color, -1);
            this.i = typedArrayObtainStyledAttributes.getDimension(R.styleable.health_line_line_height, 50.0f);
            this.g = typedArrayObtainStyledAttributes.getDimension(R.styleable.health_line_line_stroke_width, 1.0f);
            this.e = typedArrayObtainStyledAttributes.getFloat(R.styleable.health_line_conner_angle, 0.0f);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("CommonUI_HealthLine", "Resources NotFoundException.");
        }
        typedArrayObtainStyledAttributes.recycle();
        d();
    }

    private void d() {
        Paint paint = new Paint();
        this.f = paint;
        paint.setDither(true);
        this.f.setAntiAlias(true);
        this.f.setStrokeWidth(this.g);
        this.f.setStyle(Paint.Style.STROKE);
        b();
    }

    private void b() {
        if (this.d == -1) {
            this.d = -7829368;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.n = View.MeasureSpec.getSize(i);
        this.f23583c = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            float f = this.i;
            this.n = (int) (f * 3.0f);
            this.f23583c = (int) f;
        } else if (mode == Integer.MIN_VALUE) {
            this.n = (int) (this.i * 3.0f);
        } else if (mode2 != Integer.MIN_VALUE) {
            LogUtil.d("CommonUI_HealthLine", "onMeasure Width and Height not wrap_content");
        } else {
            this.f23583c = (int) this.i;
        }
        int i3 = this.n;
        if (i3 <= 0 && this.f23583c <= 0) {
            float f2 = this.i;
            this.n = (int) (3.0f * f2);
            this.f23583c = (int) f2;
        } else if (i3 <= 0) {
            this.n = (int) (this.i * 3.0f);
        } else if (this.f23583c > 0) {
            LogUtil.d("CommonUI_HealthLine", "onMeasure Width and Height not zero");
        } else {
            this.f23583c = (int) this.i;
        }
        if (this.j == 0) {
            setMeasuredDimension(this.n, (int) this.g);
        } else {
            setMeasuredDimension(this.n, this.f23583c + (((int) this.g) / 2));
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f.setColor(this.d);
        int i = this.j;
        if (i == 0) {
            float f = this.g / 2.0f;
            canvas.drawLine(0.0f, f, this.n, f, this.f);
            return;
        }
        if (i == 1) {
            this.h.set(0.0f, this.g / 2.0f);
            this.f23581a.set(this.n - this.f23583c, this.g / 2.0f);
            this.f23582b.set(this.n - (this.g / 2.0f), this.f23583c);
            a(this.h, this.f23581a, this.f23582b, canvas);
            return;
        }
        if (i == 2) {
            this.h.set(0.0f, this.f23583c);
            PointF pointF = this.f23581a;
            int i2 = this.n;
            int i3 = this.f23583c;
            pointF.set(i2 - i3, i3 - (this.g / 2.0f));
            PointF pointF2 = this.f23582b;
            float f2 = this.n;
            float f3 = this.g / 2.0f;
            pointF2.set(f2 - f3, f3);
            a(this.h, this.f23581a, this.f23582b, canvas);
            return;
        }
        if (i == 3) {
            this.h.set(this.g / 2.0f, this.f23583c);
            this.f23581a.set(this.f23583c, this.g / 2.0f);
            this.f23582b.set(this.n, this.g / 2.0f);
            a(this.h, this.f23581a, this.f23582b, canvas);
            return;
        }
        if (i != 4) {
            return;
        }
        PointF pointF3 = this.h;
        float f4 = this.g / 2.0f;
        pointF3.set(f4, f4);
        PointF pointF4 = this.f23581a;
        float f5 = this.f23583c;
        pointF4.set(f5, f5 - (this.g / 2.0f));
        this.f23582b.set(this.n, this.f23583c);
        a(this.h, this.f23581a, this.f23582b, canvas);
    }

    private void a(PointF pointF, PointF pointF2, PointF pointF3, Canvas canvas) {
        Path path = new Path();
        this.f.setPathEffect(new CornerPathEffect(this.e));
        path.moveTo(pointF.x, pointF.y);
        path.lineTo(pointF2.x, pointF2.y);
        path.lineTo(pointF3.x, pointF3.y);
        canvas.drawPath(path, this.f);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
