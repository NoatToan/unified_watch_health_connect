package com.huawei.ui.commonui.oval;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class HealthOval extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f23788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23790c;
    private RectF d;
    private int e;
    private int h;
    private float i;
    private int j;

    public HealthOval(Context context) {
        this(context, null);
        a();
    }

    public HealthOval(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            LogUtil.j("CommonUI_HealthOval", "HealthOval AttributeSet is null");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.health_oval);
        this.j = typedArrayObtainStyledAttributes.getInteger(R.styleable.health_oval_oval_type, 0);
        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.health_oval_oval_fill_color, -1);
        this.f23789b = typedArrayObtainStyledAttributes.getColor(R.styleable.health_oval_oval_stroke_color, -1);
        this.i = typedArrayObtainStyledAttributes.getDimension(R.styleable.health_oval_oval_stroke_width, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    private void a() {
        this.d = new RectF();
        Paint paint = new Paint();
        this.f23788a = paint;
        paint.setDither(true);
        this.f23788a.setAntiAlias(true);
        this.f23788a.setStrokeWidth(this.i);
        b();
    }

    private void b() {
        int i = this.e;
        if (i == -1 && this.f23789b == -1) {
            this.e = -7829368;
            this.f23789b = -7829368;
        } else if (i == -1) {
            this.e = this.f23789b;
        } else if (this.f23789b == -1) {
            this.f23789b = i;
        } else {
            LogUtil.d("CommonUI_HealthOval", "initColor FillColor and StrokeColor has value");
        }
    }

    private void e(Canvas canvas) {
        this.f23788a.setColor(this.e);
        this.f23788a.setStyle(Paint.Style.FILL);
        this.d.set(0.0f, 0.0f, this.h, this.f23790c);
        canvas.drawOval(this.d, this.f23788a);
    }

    private void a(Canvas canvas) {
        this.f23788a.setColor(this.f23789b);
        this.f23788a.setStyle(Paint.Style.STROKE);
        RectF rectF = this.d;
        float f = this.i / 2.0f;
        rectF.set(f, f, this.h - f, this.f23790c - f);
        canvas.drawOval(this.d, this.f23788a);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.h = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f23790c = size;
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            this.h = 100;
            this.f23790c = 100;
        } else if (mode == Integer.MIN_VALUE) {
            this.h = size;
        } else if (mode2 == Integer.MIN_VALUE) {
            this.f23790c = this.h;
        }
        int i3 = this.h;
        if (i3 <= 0 && this.f23790c <= 0) {
            this.h = 100;
            this.f23790c = 100;
        } else if (i3 <= 0) {
            this.h = this.f23790c;
        } else if (this.f23790c <= 0) {
            this.f23790c = i3;
        }
        setMeasuredDimension(this.h, this.f23790c);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.j;
        if (i == 0) {
            e(canvas);
            a(canvas);
        } else if (i == 1) {
            a(canvas);
        } else {
            if (i != 2) {
                return;
            }
            e(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setFillColor(int i) {
        this.e = i;
    }
}
