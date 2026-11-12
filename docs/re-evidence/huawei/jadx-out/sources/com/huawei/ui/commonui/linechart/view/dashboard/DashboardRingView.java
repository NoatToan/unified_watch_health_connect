package com.huawei.ui.commonui.linechart.view.dashboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DashboardRingView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f23745a = Math.sqrt(3.0d);
    private static final int d = Color.argb(25, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23747c;
    private int e;
    private Paint f;
    private float g;
    private Xfermode h;
    private float i;
    private int j;
    private List<a> k;
    private int l;
    private int m;
    private RectF n;
    private Path o;
    private int p;
    private float q;

    public DashboardRingView(Context context) {
        this(context, null);
    }

    public DashboardRingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DashboardRingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 50;
        this.l = d;
        this.j = 100;
        this.i = 100.0f;
        this.g = 0.0f;
        this.q = 8.333334f;
        this.e = -16777216;
        d(context, attributeSet, i, 0);
    }

    public void setRingArcAreaList(List<a> list) {
        this.k = list;
    }

    public void setMaxValue(float f) {
        this.i = f;
    }

    public void setMinValue(float f) {
        this.g = f;
    }

    public void setCurrentValue(float f) {
        this.f23747c = f;
    }

    public void b() {
        postInvalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            this.p = size;
            this.j = (int) ((size - this.m) / 2.0f);
        } else if (mode == Integer.MIN_VALUE) {
            this.p = (int) ((this.j * 2.0f) + this.m);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            this.f23746b = size2;
            this.j = Math.min((int) ((size2 - this.m) / 2.0f), this.j);
        } else if (mode2 == Integer.MIN_VALUE) {
            this.f23746b = (int) ((this.j * 2.0f) + this.m);
        }
        setMeasuredDimension(this.p, this.f23746b);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f = this.p / 2.0f;
        float f2 = this.j;
        float f3 = f - f2;
        float f4 = (this.f23746b / 2.0f) - f2;
        float f5 = f2 * 2.0f;
        this.n.set(f3, f4, f5 + f3, f5 + f4);
        d(canvas, this.l, 120.0f, 420.0f);
        e(canvas);
        c(canvas);
    }

    int getRadius() {
        return this.j;
    }

    private void d(Context context, AttributeSet attributeSet, int i, int i2) {
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DashboardRingView, i, i2);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.DashboardRingView_ringWidth)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DashboardRingView_ringWidth, 50);
            this.m = dimensionPixelSize;
            this.q = dimensionPixelSize * 0.16666667f;
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.DashboardRingView_ringBackgroundColor)) {
            this.l = typedArrayObtainStyledAttributes.getColor(R.styleable.DashboardRingView_ringBackgroundColor, d);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.DashboardRingView_circleRadius)) {
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DashboardRingView_circleRadius, 100);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.DashboardRingView_maxValue)) {
            this.i = typedArrayObtainStyledAttributes.getFloat(R.styleable.DashboardRingView_maxValue, 100.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.DashboardRingView_minValue)) {
            this.g = typedArrayObtainStyledAttributes.getFloat(R.styleable.DashboardRingView_minValue, 0.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.DashboardRingView_markColor)) {
            this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.DashboardRingView_markColor, -16777216);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f = new Paint();
        this.n = new RectF();
        this.f23747c = this.g;
        this.h = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
    }

    private void c(Canvas canvas) {
        float fB = b(this.f23747c);
        float f = this.p / 2.0f;
        float f2 = this.f23746b / 2.0f;
        canvas.save();
        canvas.rotate(fB, f, f2);
        this.f.reset();
        this.f.setAntiAlias(true);
        this.f.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f.setColor(-1);
        this.f.setStrokeCap(Paint.Cap.ROUND);
        this.f.setStrokeJoin(Paint.Join.ROUND);
        float f3 = this.m;
        float f4 = this.q;
        Path pathD = d(f3 - f4, f4, f, f2);
        Paint paint = this.f;
        float f5 = this.q;
        paint.setStrokeWidth((2.0f * f5) + f5);
        this.f.setXfermode(this.h);
        canvas.drawPath(pathD, this.f);
        this.f.reset();
        this.f.setAntiAlias(true);
        this.f.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f.setColor(this.e);
        this.f.setStrokeCap(Paint.Cap.ROUND);
        this.f.setStrokeJoin(Paint.Join.ROUND);
        this.f.setStrokeWidth(this.q);
        canvas.drawPath(pathD, this.f);
        canvas.restore();
    }

    private Path d(float f, float f2, float f3, float f4) {
        Path path = this.o;
        if (path == null) {
            this.o = new Path();
        } else {
            path.reset();
        }
        float f5 = (f3 + this.j) - f2;
        float f6 = f / 2.0f;
        float f7 = (float) (((double) f5) - (((double) f6) * f23745a));
        this.o.moveTo(f5, f4);
        this.o.lineTo(f7, f4 + f6);
        this.o.lineTo(f7, f4 - f6);
        this.o.close();
        return this.o;
    }

    private void e(Canvas canvas) {
        List<a> list = this.k;
        if (list == null || list.isEmpty()) {
            LogUtil.j("DashboardRingView", "mRingArcAreaList is null or empty");
            return;
        }
        a aVar = null;
        for (a aVar2 : this.k) {
            if ((this.f23747c < aVar2.c() || this.f23747c >= aVar2.d() || aVar != null) && !(this.f23747c >= this.i && b(aVar2.d(), this.i) && aVar == null)) {
                d(canvas, aVar2.b(), b(aVar2.c()), b(aVar2.d()));
            } else {
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            float fB = b(aVar.c());
            float fB2 = b(aVar.d());
            a(-1, this.m + (this.q * 2.0f), this.h);
            canvas.drawArc(this.n, fB, fB2 - fB, false, this.f);
            d(canvas, aVar.b(), fB, fB2);
        }
    }

    private float b(float f) {
        float f2 = this.g;
        if (f <= f2) {
            return 120.0f;
        }
        float f3 = this.i;
        if (f >= f3) {
            return 420.0f;
        }
        return (((f - f2) / (f3 - f2)) * 300.0f) + 120.0f;
    }

    private void d(Canvas canvas, int i, float f, float f2) {
        e(canvas, i, this.m, f, f2);
    }

    private void e(Canvas canvas, int i, float f, float f2, float f3) {
        a(i, f, null);
        canvas.drawArc(this.n, f2, f3 - f2, false, this.f);
    }

    private void a(int i, float f, Xfermode xfermode) {
        this.f.reset();
        this.f.setAntiAlias(true);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth(f);
        this.f.setStrokeCap(Paint.Cap.ROUND);
        this.f.setColor(i);
        this.f.setXfermode(xfermode);
    }

    private boolean b(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-6f;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f23748a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f23749c;
        private final int d;

        public a(float f, float f2, int i) {
            this.f23748a = f;
            this.f23749c = f2;
            this.d = i;
        }

        public float c() {
            return this.f23748a;
        }

        public float d() {
            return this.f23749c;
        }

        public int b() {
            return this.d;
        }
    }
}
