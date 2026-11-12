package com.huawei.openalliance.ad.views;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;

/* JADX INFO: loaded from: classes41.dex */
public class PPSCircleProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f20849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f20851c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private int i;
    private float j;
    private int k;
    private Paint l;
    private String m;
    private Rect n;
    private int o;
    private ValueAnimator p;

    public void setTextSize(float f) {
        synchronized (this.f20849a) {
            this.g = f;
        }
    }

    public void setTextColor(int i) {
        synchronized (this.f20849a) {
            this.f = i;
        }
    }

    public void setStartPoint(int i) {
        synchronized (this.f20849a) {
            this.k = i;
        }
    }

    public void setProgressWidth(float f) {
        synchronized (this.f20849a) {
            this.h = f;
        }
    }

    public void setProgress(float f) {
        synchronized (this.f20849a) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            float f2 = this.i;
            if (f > f2) {
                f = f2;
            }
            b(f);
        }
    }

    public void setOuterRadius(float f) {
        synchronized (this.f20849a) {
            this.f20851c = f;
        }
    }

    public void setOuterColor(int i) {
        synchronized (this.f20849a) {
            this.f20850b = i;
        }
    }

    public void setMaxProgress(int i) {
        synchronized (this.f20849a) {
            this.i = i;
        }
    }

    public void setInnerColor(int i) {
        synchronized (this.f20849a) {
            this.d = i;
        }
    }

    public void setCurrentText(String str) {
        synchronized (this.f20849a) {
            this.m = str;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        synchronized (this.f20849a) {
            try {
                int size = View.MeasureSpec.getSize(i);
                if (View.MeasureSpec.getMode(i) != 1073741824) {
                    size = (int) ((this.f20851c * 2.0f) + this.h);
                }
                int size2 = View.MeasureSpec.getSize(i2);
                if (View.MeasureSpec.getMode(i2) != 1073741824) {
                    size2 = (int) ((this.f20851c * 2.0f) + this.h);
                }
                setMeasuredDimension(size, size2);
            } catch (Throwable unused) {
                hw.c("PPSCircleProgressBar", "onMeasure error.");
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        synchronized (this.f20849a) {
            try {
                super.onDraw(canvas);
                int width = getWidth() / 2;
                this.l.setColor(this.e);
                this.l.setStyle(Paint.Style.FILL);
                this.l.setAntiAlias(true);
                float f = width;
                canvas.drawCircle(f, f, this.f20851c, this.l);
                this.l.setColor(this.d);
                this.l.setStyle(Paint.Style.STROKE);
                this.l.setStrokeWidth(this.h);
                this.l.setAntiAlias(true);
                canvas.drawCircle(f, f, this.f20851c, this.l);
                this.l.setColor(this.f20850b);
                float f2 = this.f20851c;
                float f3 = f - f2;
                float f4 = f + f2;
                canvas.drawArc(new RectF(f3, f3, f4, f4), a.c(this.k), (this.j / this.i) * 360.0f, false, this.l);
                this.n = new Rect();
                this.l.setColor(this.f);
                this.l.setStyle(Paint.Style.FILL);
                this.l.setTextSize(a(this.m, this.g));
                this.l.setStrokeWidth(0.0f);
                String currentText = getCurrentText();
                this.m = currentText;
                this.l.getTextBounds(currentText, 0, currentText.length(), this.n);
                this.l.setTextAlign(Paint.Align.LEFT);
                Paint.FontMetricsInt fontMetricsInt = this.l.getFontMetricsInt();
                canvas.drawText(this.m, (getMeasuredWidth() / 2) - (this.n.width() / 2), (((getMeasuredHeight() - fontMetricsInt.bottom) + fontMetricsInt.top) / 2) - fontMetricsInt.top, this.l);
            } catch (Throwable unused) {
                hw.c("PPSCircleProgressBar", "onDraw error.");
            }
        }
    }

    public float getTextSize() {
        float f;
        synchronized (this.f20849a) {
            f = this.g;
        }
        return f;
    }

    public int getTextColor() {
        int i;
        synchronized (this.f20849a) {
            i = this.f;
        }
        return i;
    }

    public int getStartPoint() {
        int i;
        synchronized (this.f20849a) {
            i = this.k;
        }
        return i;
    }

    public float getProgressWidth() {
        float f;
        synchronized (this.f20849a) {
            f = this.h;
        }
        return f;
    }

    public float getProgress() {
        float f;
        synchronized (this.f20849a) {
            f = this.j;
        }
        return f;
    }

    public float getOuterRadius() {
        float f;
        synchronized (this.f20849a) {
            f = this.f20851c;
        }
        return f;
    }

    public int getOuterColor() {
        int i;
        synchronized (this.f20849a) {
            i = this.f20850b;
        }
        return i;
    }

    public int getMaxProgress() {
        int i;
        synchronized (this.f20849a) {
            i = this.i;
        }
        return i;
    }

    public int getInnerColor() {
        int i;
        synchronized (this.f20849a) {
            i = this.d;
        }
        return i;
    }

    public String getCurrentText() {
        String str;
        synchronized (this.f20849a) {
            str = TextUtils.isEmpty(this.m) ? "" : this.m;
        }
        return str;
    }

    public void a(float f, String str) {
        setCurrentText(str);
        setProgress(f);
    }

    private int getProgressBarSize() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int width = getWidth();
        return width <= 0 ? layoutParams.width : width;
    }

    private int getPaddingSize() {
        int paddingStart = getPaddingStart();
        if (paddingStart <= 0) {
            paddingStart = getPaddingLeft();
        }
        int paddingEnd = getPaddingEnd();
        if (paddingEnd <= 0) {
            paddingEnd = getPaddingRight();
        }
        return paddingStart + paddingEnd;
    }

    private void c(float f) {
        synchronized (this.f20849a) {
            ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(this.j, f);
            this.p = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.openalliance.ad.views.PPSCircleProgressBar.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PPSCircleProgressBar.this.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PPSCircleProgressBar.this.postInvalidate();
                }
            });
            this.p.setDuration(1000L);
            this.p.setInterpolator(new LinearInterpolator());
            this.p.start();
        }
    }

    private void b(float f) {
        synchronized (this.f20849a) {
            c(f);
        }
    }

    private boolean a(CharSequence charSequence, int i, int i2, int i3) {
        float fC = as.c(getContext(), i);
        if (i3 < 0) {
            return true;
        }
        this.l.setTextSize(fC);
        this.l.getTextBounds(charSequence.toString(), 0, charSequence.length(), this.n);
        return this.n.width() + i2 <= i3;
    }

    enum a {
        LEFT(0, 180.0f),
        TOP(1, 270.0f),
        RIGHT(2, 0.0f),
        BOTTOM(3, 90.0f);

        private final int e;
        private final float f;

        public float b() {
            return this.f;
        }

        public boolean a(int i) {
            return this.e == i;
        }

        public int a() {
            return this.e;
        }

        public static float c(int i) {
            a aVarB = b(i);
            if (aVarB == null) {
                return 0.0f;
            }
            return aVarB.b();
        }

        public static a b(int i) {
            for (a aVar : values()) {
                if (aVar.a(i)) {
                    return aVar;
                }
            }
            return RIGHT;
        }

        a(int i, float f) {
            this.e = i;
            this.f = f;
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        String str;
        String str2;
        synchronized (this.f20849a) {
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.hiad_circle);
                try {
                    try {
                        Resources resources = getResources();
                        if (resources == null) {
                            hw.c("PPSCircleProgressBar", "init attr, resource is null");
                            typedArrayObtainStyledAttributes.recycle();
                            return;
                        }
                        this.f20850b = typedArrayObtainStyledAttributes.getColor(R.styleable.hiad_circle_progress_outerColor, resources.getColor(R.color.hiad_circle_outer));
                        this.f20851c = typedArrayObtainStyledAttributes.getDimension(R.styleable.hiad_circle_progress_outerRadius, resources.getDimension(R.dimen.hiad_24_dp));
                        this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.hiad_circle_progress_innerColor, resources.getColor(R.color.hiad_circle_inner));
                        this.f = typedArrayObtainStyledAttributes.getColor(R.styleable.hiad_circle_progress_textColor, resources.getColor(R.color.hiad_circle_text));
                        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.hiad_circle_progress_fillColor, resources.getColor(R.color.hiad_circle_fill));
                        this.g = typedArrayObtainStyledAttributes.getDimension(R.styleable.hiad_circle_progress_textSize, as.c(context, 18.0f));
                        this.h = typedArrayObtainStyledAttributes.getDimension(R.styleable.hiad_circle_progress_progressWidth, as.a(context, 2.0f));
                        this.j = typedArrayObtainStyledAttributes.getFloat(R.styleable.hiad_circle_progress_progress, 0.0f);
                        this.i = typedArrayObtainStyledAttributes.getInt(R.styleable.hiad_circle_progress_maxProgress, 100);
                        this.k = typedArrayObtainStyledAttributes.getInt(R.styleable.hiad_circle_progress_startPoint, a.BOTTOM.a());
                        typedArrayObtainStyledAttributes.recycle();
                        this.l = new Paint();
                    } catch (UnsupportedOperationException unused) {
                        str = "PPSCircleProgressBar";
                        str2 = "initButtonAttr UnsupportedOperationException";
                        hw.c(str, str2);
                    } catch (RuntimeException unused2) {
                        str = "PPSCircleProgressBar";
                        str2 = "initButtonAttr RuntimeException";
                        hw.c(str, str2);
                    } catch (Throwable th) {
                        str = "PPSCircleProgressBar";
                        str2 = "initButtonAttr error: " + th.getClass().getSimpleName();
                        hw.c(str, str2);
                    }
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
        }
    }

    private void a(float f) {
        Paint paint = new Paint();
        paint.setTextSize(f);
        Rect rect = new Rect();
        paint.getTextBounds("...", 0, 3, rect);
        this.o = rect.width();
    }

    private void a() {
        a(this.g);
    }

    private CharSequence a(CharSequence charSequence, int i, int i2) {
        int length = getCurrentText().length();
        int iCeil = (int) Math.ceil((((double) (i - i2)) / ((double) this.n.width())) * ((double) length));
        int iCeil2 = (int) Math.ceil(((double) (this.o * length)) / ((double) this.n.width()));
        int i3 = length - iCeil;
        if (i3 - iCeil2 <= 0) {
            return i3 > 0 ? charSequence.toString().substring(0, i3) : charSequence;
        }
        return charSequence.toString().substring(0, length - (iCeil + iCeil2)) + "...";
    }

    private float a(CharSequence charSequence, float f) {
        int paddingSize = getPaddingSize();
        int progressBarSize = getProgressBarSize();
        int iD = as.d(getContext(), f);
        while (iD > 10 && !a(charSequence, iD, paddingSize, progressBarSize)) {
            iD--;
        }
        if (iD <= 10 && !a(charSequence, iD, paddingSize, progressBarSize)) {
            this.m = (String) a(this.m, this.n.width() + getPaddingSize(), getProgressBarSize());
            this.l.getTextBounds(charSequence.toString(), 0, charSequence.length(), this.n);
        }
        float fC = as.c(getContext(), iD);
        a(fC);
        hw.a("PPSCircleProgressBar", "getRightTextSize, currentSpSize: %s ", Float.valueOf(fC));
        return fC;
    }

    public PPSCircleProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet);
        a(context, attributeSet);
        a();
    }

    public PPSCircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
        a(context, attributeSet);
        a();
    }

    public PPSCircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20849a = new byte[0];
        a(context, attributeSet);
        a();
    }

    public PPSCircleProgressBar(Context context) {
        this(context, null);
    }
}
