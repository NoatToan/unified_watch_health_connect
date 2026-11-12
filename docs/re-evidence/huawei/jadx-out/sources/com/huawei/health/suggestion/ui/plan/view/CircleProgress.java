package com.huawei.health.suggestion.ui.plan.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.health.suggestion.R;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class CircleProgress extends View {
    private static final String d = "CircleProgress";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ValueAnimator f9734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f9735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9736c;
    private boolean e;
    private int[] f;
    private Paint g;
    private int[] h;
    private Paint i;
    private float j;
    private Context k;
    private Point l;
    private float m;
    private int n;
    private ProgressUpdate o;
    private RectF p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float x;

    public interface ProgressUpdate {
        void onUpdate(int i, int i2);
    }

    public CircleProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new int[]{-1, -1};
        this.f = new int[]{-1, -1};
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.k = context;
        this.n = d(context, 0.0f);
        this.f9734a = new ValueAnimator();
        this.p = new RectF();
        this.l = new Point();
        b(attributeSet);
        a();
    }

    private void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.k.obtainStyledAttributes(attributeSet, R.styleable.CircleProgress);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CircleProgress_antiAlias, true);
        this.j = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleProgress_arcWidth, 8.0f);
        this.s = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleProgress_startAngle, 135.0f);
        this.r = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleProgress_sweepAngle, 270.0f);
        this.f9736c = typedArrayObtainStyledAttributes.getInt(R.styleable.CircleProgress_animTime, 1000);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CircleProgress_arcColors, 0);
        if (resourceId != 0) {
            try {
                int[] intArray = getResources().getIntArray(resourceId);
                if (intArray.length == 0) {
                    int color = getResources().getColor(resourceId);
                    this.h = new int[]{color, color};
                } else if (intArray.length == 1) {
                    this.h = new int[]{intArray[0], intArray[0]};
                } else {
                    this.h = intArray;
                }
            } catch (Resources.NotFoundException unused) {
                LogUtil.c(d, "the give resource not found.");
            }
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CircleProgress_bgColors, 0);
        if (resourceId2 != 0) {
            try {
                int[] intArray2 = getResources().getIntArray(resourceId2);
                if (intArray2.length == 0) {
                    int color2 = getResources().getColor(resourceId2);
                    this.f = new int[]{color2, color2};
                } else if (intArray2.length == 1) {
                    this.f = new int[]{intArray2[0], intArray2[0]};
                } else {
                    this.f = intArray2;
                }
            } catch (Resources.NotFoundException unused2) {
                LogUtil.c(d, "the give resource not found.");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a() {
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(this.e);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(this.j);
        this.i.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setAntiAlias(this.e);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setStrokeWidth(this.j);
        this.g.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(d(i, this.n), d(i2, this.n));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        this.q = Math.min(((i - paddingLeft) - getPaddingRight()) - (((int) this.j) * 2), ((i2 - getPaddingTop()) - getPaddingBottom()) - (((int) this.j) * 2)) / 2.0f;
        this.l.x = i / 2;
        this.l.y = i2 / 2;
        this.p.left = (this.l.x - this.q) - (this.j / 2.0f);
        this.p.top = (this.l.y - this.q) - (this.j / 2.0f);
        this.p.right = this.l.x + this.q + (this.j / 2.0f);
        this.p.bottom = this.l.y + this.q + (this.j / 2.0f);
        c();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    private void c(Canvas canvas) {
        float degrees = (float) Math.toDegrees((((double) (this.j / 2.0f)) * Math.sqrt(2.0d)) / ((double) this.q));
        canvas.save();
        canvas.rotate(this.s - degrees, this.l.x, this.l.y);
        canvas.drawArc(this.p, degrees, this.r, false, this.g);
        canvas.drawArc(this.p, degrees, Math.min(this.t, 1.0f) * this.r, false, this.i);
        canvas.restore();
    }

    private void c() {
        this.i.setShader(new SweepGradient(this.l.x, this.l.y, this.h, (float[]) null));
        this.g.setShader(new SweepGradient(this.l.x, this.l.y, this.f, (float[]) null));
    }

    public void setValue(int i, int i2, boolean z) {
        float f = i2;
        this.m = f;
        float f2 = i;
        this.f9735b = f2;
        float f3 = z ? this.t : 0.0f;
        float f4 = i2 > 0 ? f2 / f : 1.0f;
        LogUtil.a(d, "setValueWithOutCallback mMaxValue ", Float.valueOf(f), " inputValue ", Float.valueOf(f2), " start ", Float.valueOf(f3), " end ", Float.valueOf(f4));
        e(f3, f4, 0L);
    }

    public void setValue(int i, int i2, boolean z, ProgressUpdate progressUpdate) {
        this.o = progressUpdate;
        float f = i2;
        this.m = f;
        float f2 = i;
        this.f9735b = f2;
        float f3 = z ? this.t : 0.0f;
        float f4 = i2 > 0 ? f2 / f : 1.0f;
        LogUtil.a(d, "setValue mMaxValue ", Float.valueOf(f), " inputValue ", Float.valueOf(f2), " start ", Float.valueOf(f3), " end ", Float.valueOf(f4));
        e(f3, f4, 1000L);
    }

    private void e(float f, float f2, long j) {
        ValueAnimator valueAnimator = this.f9734a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f9734a.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f9734a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f9734a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hwr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f37251a.d(valueAnimator2);
            }
        });
        this.f9734a.start();
    }

    public /* synthetic */ void d(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.t = fFloatValue;
        ProgressUpdate progressUpdate = this.o;
        if (progressUpdate != null) {
            float f = this.m;
            if (f > 0.0f) {
                progressUpdate.onUpdate(Math.round(fFloatValue * f), (int) this.m);
            } else {
                this.t = 0.0f;
                progressUpdate.onUpdate(Math.round(this.f9735b), (int) this.m);
            }
        }
        this.x = this.t * this.m;
        invalidate();
    }

    private int d(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + ((f >= 0.0f ? 1 : -1) * 0.5f));
    }

    private int d(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i2 = size;
        }
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }
}
