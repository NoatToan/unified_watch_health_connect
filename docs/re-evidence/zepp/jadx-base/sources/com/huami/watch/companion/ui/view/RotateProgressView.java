package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class RotateProgressView extends View {
    private static final int n = 8;
    private static final int o = 88;
    private static final String p = "#00F9CFD7";
    private static final String q = "#DC2B0B";
    private static final boolean r = false;
    private static final boolean s = true;
    private Context a;
    private int b;
    private String c;
    private String d;
    private boolean e;
    private int f;
    private int g;
    private Paint h;
    private Paint i;
    private float j;
    private RectF k;
    private boolean l;
    private boolean m;

    public RotateProgressView(Context context) {
        super(context);
        this.c = p;
        this.d = q;
        this.e = false;
        this.m = true;
        a();
    }

    private void a() {
        this.g = dip2px(this.a, 88.0f);
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        this.h.setStyle(Paint.Style.STROKE);
        this.h.setStrokeWidth(this.b);
        this.h.setColor(getResources().getColor(R.color.bg_circle));
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setAntiAlias(true);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(this.b);
        this.i.setStrokeCap(Paint.Cap.ROUND);
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RotateProgressView);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.RotateProgressView_rpbv_BorderWidth, dip2px(context, 8.0f));
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R.styleable.RotateProgressView_rpbv_BorderStartColor) {
                this.c = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.RotateProgressView_rpbv_BorderEndColor) {
                this.d = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.RotateProgressView_rpbv_ShowBgCircle) {
                this.e = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else if (index == R.styleable.RotateProgressView_rpbv_StartAnim) {
                this.m = typedArrayObtainStyledAttributes.getBoolean(index, true);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(int i, int i2) {
        if (this.l) {
            return;
        }
        this.l = true;
        int iMax = Math.max(i, i2) / 2;
        int i3 = this.b;
        int i4 = iMax - (i3 / 2);
        this.g = i4;
        this.f = i4 + (i3 / 2);
        int i5 = this.f;
        this.i.setShader(new SweepGradient(i5, i5, new int[]{Color.parseColor(this.c), Color.parseColor(this.d), Color.parseColor(this.c)}, new float[]{0.0f, 0.72f, 1.0f}));
        int i6 = this.f;
        int i7 = this.g;
        this.k = new RectF(i6 - i7, i6 - i7, i6 + i7, i6 + i7);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.m) {
            float f = this.j;
            int i = this.f;
            canvas.rotate(f, i, i);
            if (this.e) {
                int i2 = this.f;
                canvas.drawCircle(i2, i2, this.g, this.h);
            }
            canvas.drawArc(this.k, 0.0f, 330.0f, false, this.i);
            float f2 = this.j + 6.0f;
            this.j = f2;
            if (f2 >= 360.0f) {
                this.j = 0.0f;
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = (this.g * 2) + this.b;
        }
        if (mode2 != 1073741824) {
            size2 = (this.g * 2) + this.b;
        }
        setMeasuredDimension(size, size2);
        c(size, size2);
    }

    public void startAnim() {
        this.m = true;
        invalidate();
    }

    public void stopAnim() {
        this.m = false;
        invalidate();
    }

    public RotateProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = p;
        this.d = q;
        this.e = false;
        this.m = true;
        this.a = context;
        b(context, attributeSet);
        a();
    }
}
