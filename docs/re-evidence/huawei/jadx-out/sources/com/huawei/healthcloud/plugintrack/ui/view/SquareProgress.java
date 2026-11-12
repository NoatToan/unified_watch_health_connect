package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.health.servicesui.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes10.dex */
public class SquareProgress extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f11330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f11331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11332c;
    private int d;
    private int e;
    private PointF f;
    private float g;
    private int h;
    private int i;
    private Paint j;
    private int k;
    private int l;
    private float m;
    private Paint n;
    private float o;
    private int t;

    public SquareProgress(Context context) {
        this(context, null);
        c();
    }

    public SquareProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SquareProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 100;
        this.d = 30;
        this.f11332c = false;
        d(context, attributeSet, i);
        c();
    }

    private void d(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TrackSquareProgress, i, R.style.DefaultHealthSquareProgress);
        try {
            this.k = typedArrayObtainStyledAttributes.getColor(R.styleable.TrackSquareProgress_progressByColor, 0);
            this.l = typedArrayObtainStyledAttributes.getColor(R.styleable.TrackSquareProgress_progressColor, 0);
            this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.TrackSquareProgress_dotColor, 0);
            this.f11330a = typedArrayObtainStyledAttributes.getDimension(R.styleable.TrackSquareProgress_dotDiameter, 10.0f);
            this.o = typedArrayObtainStyledAttributes.getDimension(R.styleable.TrackSquareProgress_progressWidth, 8.0f);
            this.f11332c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TrackSquareProgress_dotEnable, false);
            this.h = typedArrayObtainStyledAttributes.getInt(R.styleable.TrackSquareProgress_max, 100);
            this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.TrackSquareProgress_progress, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void c() {
        Paint paint = new Paint();
        this.n = paint;
        paint.setAntiAlias(true);
        this.n.setStyle(Paint.Style.STROKE);
        this.n.setStrokeWidth(this.o);
        this.n.setColor(this.l);
        Paint paint2 = new Paint();
        this.f11331b = paint2;
        paint2.setAntiAlias(true);
        this.f11331b.setColor(this.k);
        this.f11331b.setStyle(Paint.Style.STROKE);
        this.f11331b.setStrokeWidth(this.o);
        Paint paint3 = new Paint();
        this.j = paint3;
        paint3.setAntiAlias(true);
        this.j.setStyle(Paint.Style.FILL);
        this.j.setColor(this.e);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.t = e(i);
        int iB = b(i2);
        this.i = iB;
        setMeasuredDimension(this.t, iB);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean zBa = LanguageUtil.ba(getContext());
        this.m = ((this.t - getPaddingRight()) - getPaddingLeft()) - this.o;
        float paddingTop = (this.i - getPaddingTop()) - getPaddingBottom();
        float f = this.o;
        this.g = paddingTop - f;
        float f2 = f / 2.0f;
        float f3 = this.m;
        if (zBa) {
            f3 = -f3;
        }
        c(canvas, zBa, f2, f3, zBa ? -f2 : f2);
        if (this.f11332c) {
            canvas.drawCircle(this.f.x, this.f.y, this.f11330a * 0.5f, this.j);
        }
    }

    private void c(Canvas canvas, boolean z, float f, float f2, float f3) {
        PointF pointF = new PointF(z ? this.t - getPaddingRight() : getPaddingLeft(), getPaddingTop() + f);
        PointF pointF2 = new PointF(pointF.x + f2, pointF.y);
        PointF pointF3 = new PointF(pointF2.x + f3, pointF2.y - f);
        PointF pointF4 = new PointF(pointF3.x, pointF3.y + this.g);
        PointF pointF5 = new PointF(pointF4.x + f3, pointF4.y + f);
        PointF pointF6 = new PointF(pointF5.x - f2, pointF5.y);
        PointF pointF7 = new PointF(pointF6.x - f3, pointF5.y - f);
        c(canvas, new PointF[]{pointF, pointF2, pointF3, pointF4, pointF5, pointF6, pointF7, new PointF(pointF7.x, pointF7.y - this.g)});
        float f4 = (this.m + this.g) * 2.0f;
        Path path = new Path();
        float f5 = this.d;
        float f6 = this.h;
        float f7 = f5 / f6;
        if (f7 > 0.0f) {
            this.f = new PointF(pointF.x + (z ? ((-f4) * f5) / f6 : (f5 * f4) / f6), pointF.y);
            path.moveTo(pointF.x, pointF.y);
            float f8 = this.m;
            if (f7 > f8 / f4) {
                this.f = new PointF(pointF3.x, pointF3.y + (((this.d * f4) / this.h) - f8));
                path.lineTo(pointF2.x, pointF2.y);
                path.moveTo(pointF3.x, pointF3.y);
            }
            float f9 = this.g;
            float f10 = this.m;
            if (f7 > (f9 + f10) / f4) {
                float f11 = (((this.d * f4) / this.h) - f9) - f10;
                if (z) {
                    f11 = -f11;
                }
                this.f = new PointF(pointF5.x - f11, pointF5.y);
                path.lineTo(pointF4.x, pointF4.y);
                path.moveTo(pointF5.x, pointF5.y);
            }
            float f12 = this.m;
            float f13 = this.g;
            float f14 = f12 * 2.0f;
            if (f7 > (f14 + f13) / f4) {
                this.f = new PointF(pointF7.x, pointF7.y - Math.min((((f4 * this.d) / this.h) - f13) - f14, f13));
                path.lineTo(pointF6.x, pointF6.y);
                path.moveTo(pointF7.x, pointF7.y);
            }
            path.lineTo(this.f.x, this.f.y);
        }
        path.close();
        canvas.drawPath(path, this.n);
    }

    private void c(Canvas canvas, PointF[] pointFArr) {
        Path path = new Path();
        for (int i = 0; i * 2 < pointFArr.length; i += 2) {
            path.moveTo(pointFArr[i].x, pointFArr[i].y);
            int i2 = i + 1;
            path.lineTo(pointFArr[i2].x, pointFArr[i2].y);
        }
        path.close();
        canvas.drawPath(path, this.f11331b);
    }

    private int e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (mode == 1073741824) {
            return size;
        }
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + paddingLeft + paddingRight;
        return mode == Integer.MIN_VALUE ? Math.max(suggestedMinimumWidth, size) : suggestedMinimumWidth;
    }

    public void setProgress(int i) {
        this.d = i;
        invalidate();
    }

    private int b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        if (mode == 1073741824) {
            return size;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + paddingBottom + paddingTop;
        return mode == Integer.MIN_VALUE ? Math.max(suggestedMinimumHeight, size) : suggestedMinimumHeight;
    }
}
