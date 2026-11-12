package com.huawei.health.sport.view;

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
import com.huawei.health.servicesui.R;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class CircleProgress extends View {
    private static final String e = "CircleProgress";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f8817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8818c;
    private ValueAnimator d;
    private Paint f;
    private int[] g;
    private int[] h;
    private Paint i;
    private float j;
    private int k;
    private ProgressUpdate l;
    private Point m;
    private float n;
    private Context o;
    private RectF p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float y;

    public interface ProgressUpdate {
        void onUpdate(int i, int i2);
    }

    public CircleProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new int[]{-1, -1};
        this.g = new int[]{-1, -1};
        b(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.o = context;
        this.k = b(context, 0.0f);
        this.d = new ValueAnimator();
        this.p = new RectF();
        this.m = new Point();
        e(attributeSet);
        a();
    }

    private void e(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.o.obtainStyledAttributes(attributeSet, R.styleable.CircleProgress);
        this.f8816a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CircleProgress_antiAlias, true);
        this.j = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleProgress_arcWidth, 8.0f);
        this.q = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleProgress_startAngle, 135.0f);
        this.s = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleProgress_sweepAngle, 270.0f);
        this.f8818c = typedArrayObtainStyledAttributes.getInt(R.styleable.CircleProgress_animTime, 1000);
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
                LogUtil.c(e, "the give resource not found.");
            }
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CircleProgress_bgColors, 0);
        if (resourceId2 != 0) {
            try {
                int[] intArray2 = getResources().getIntArray(resourceId2);
                if (intArray2.length == 0) {
                    int color2 = getResources().getColor(resourceId2);
                    this.g = new int[]{color2, color2};
                } else if (intArray2.length == 1) {
                    this.g = new int[]{intArray2[0], intArray2[0]};
                } else {
                    this.g = intArray2;
                }
            } catch (Resources.NotFoundException unused2) {
                LogUtil.c(e, "the give resource not found.");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a() {
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(this.f8816a);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(this.j);
        this.i.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setAntiAlias(this.f8816a);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth(this.j);
        this.f.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(e(i, this.k), e(i2, this.k));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        this.r = Math.min(((i - paddingLeft) - getPaddingRight()) - (((int) this.j) * 2), ((i2 - getPaddingTop()) - getPaddingBottom()) - (((int) this.j) * 2)) / 2.0f;
        this.m.x = i / 2;
        this.m.y = i2 / 2;
        this.p.left = (this.m.x - this.r) - (this.j / 2.0f);
        this.p.top = (this.m.y - this.r) - (this.j / 2.0f);
        this.p.right = this.m.x + this.r + (this.j / 2.0f);
        this.p.bottom = this.m.y + this.r + (this.j / 2.0f);
        d();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
    }

    private void e(Canvas canvas) {
        float degrees = (float) Math.toDegrees((((double) (this.j / 2.0f)) * Math.sqrt(2.0d)) / ((double) this.r));
        canvas.save();
        canvas.rotate(this.q - degrees, this.m.x, this.m.y);
        canvas.drawArc(this.p, degrees, this.s, false, this.f);
        canvas.drawArc(this.p, degrees, Math.min(this.t, 1.0f) * this.s, false, this.i);
        canvas.rotate(-this.q, this.m.x, this.m.y);
        canvas.restore();
    }

    private void d() {
        this.i.setShader(new SweepGradient(this.m.x, this.m.y, this.h, (float[]) null));
        this.f.setShader(new SweepGradient(this.m.x, this.m.y, this.g, (float[]) null));
    }

    public void setValue(int i, int i2, boolean z, ProgressUpdate progressUpdate) {
        this.l = progressUpdate;
        float f = i2;
        this.n = f;
        float f2 = i;
        this.f8817b = f2;
        float f3 = z ? this.t : 0.0f;
        float f4 = i2 > 0 ? f2 / f : 1.0f;
        LogUtil.a(e, "setValue mMaxValue ", Float.valueOf(f), " inputValue ", Float.valueOf(f2), " start ", Float.valueOf(f3), " end ", Float.valueOf(f4));
        a(f3, f4, 1000L);
    }

    private void a(float f, float f2, long j) {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.d.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hat
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f36327b.e(valueAnimator2);
            }
        });
        this.d.start();
    }

    public /* synthetic */ void e(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.t = fFloatValue;
        ProgressUpdate progressUpdate = this.l;
        if (progressUpdate != null) {
            float f = this.n;
            if (f > 0.0f) {
                progressUpdate.onUpdate(Math.round(fFloatValue * f), (int) this.n);
            } else {
                this.t = 0.0f;
                progressUpdate.onUpdate(Math.round(this.f8817b), (int) this.n);
            }
        }
        this.y = this.t * this.n;
        invalidate();
    }

    private int b(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + ((f >= 0.0f ? 1 : -1) * 0.5f));
    }

    private int e(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i2 = size;
        }
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }
}
