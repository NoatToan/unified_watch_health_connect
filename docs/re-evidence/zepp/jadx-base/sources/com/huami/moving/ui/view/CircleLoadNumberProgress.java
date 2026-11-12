package com.huami.moving.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.huami.moving.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class CircleLoadNumberProgress extends View {
    public static final float DEFAULT_END_ANGLE = 270.0f;
    public static final float DEFAULT_START_ANGLE = -90.0f;
    private String a;
    private String b;
    private int c;
    private int d;
    private float e;
    private float f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private Paint k;
    private Paint l;
    private Paint m;
    private Paint.FontMetrics n;
    private Paint o;
    private Paint p;
    private Paint q;
    private float r;
    private RectF s;
    private float t;
    private int u;
    private String v;
    private float w;
    private float x;

    public CircleLoadNumberProgress(Context context) {
        this(context, null);
    }

    private int a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (mode == 1073741824) {
            return size;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + paddingTop;
        return mode == Integer.MIN_VALUE ? Math.min(suggestedMinimumHeight, size) : suggestedMinimumHeight;
    }

    private int b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (mode == 1073741824) {
            return size;
        }
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + paddingTop;
        return mode == Integer.MIN_VALUE ? Math.max(suggestedMinimumWidth, size) : suggestedMinimumWidth;
    }

    public static float dip2px(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static float sp2px(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return (int) dip2px(getContext(), 100.0f);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return (int) dip2px(getContext(), 100.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        float f = getWidth() >= getHeight() ? height - (this.r / 2.0f) : width - (this.r / 2.0f);
        RectF rectF = this.s;
        rectF.left = width - f;
        rectF.right = width + f;
        rectF.top = height - f;
        rectF.bottom = height + f;
        canvas.drawCircle(width, height, f, this.k);
        float f2 = this.t;
        int i = this.u;
        if (f2 < i) {
            RectF rectF2 = this.s;
            float f3 = this.w;
            canvas.drawArc(rectF2, f3, ((this.x - f3) * f2) / i, false, this.l);
            if (this.g) {
                String str = String.format(Locale.ENGLISH, "%.1f", Float.valueOf((this.u - this.t) / 60.0f));
                this.v = str;
                canvas.drawText(this.v, width - (this.o.measureText(str) / 2.0f), (height - ((this.o.descent() + this.o.ascent()) / 2.0f)) - 30.0f, this.o);
                canvas.drawText(this.a, width - (this.p.measureText(this.a) / 2.0f), (height - ((this.o.descent() + this.o.ascent()) / 2.0f)) + 30.0f, this.p);
                return;
            }
            return;
        }
        RectF rectF3 = this.s;
        float f4 = this.w;
        canvas.drawArc(rectF3, f4, this.x - f4, false, this.m);
        if (this.g) {
            String str2 = this.b;
            Paint.FontMetrics fontMetrics = this.n;
            float f5 = fontMetrics.bottom;
            float f6 = fontMetrics.top;
            canvas.drawText(str2, width, (height - ((f5 - f6) / 2.0f)) - f6, this.q);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(b(i), a(i2));
    }

    public void setCurrentProgress(int i) {
        this.t = i;
        invalidate();
    }

    public void setMaxProgress(int i) {
        this.u = i;
    }

    public CircleLoadNumberProgress(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleLoadNumberProgress(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.t = 0.0f;
        this.u = 100;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleLoadNumberProgress);
        int i2 = R.styleable.CircleLoadNumberProgress_textColor;
        this.c = typedArrayObtainStyledAttributes.getColor(i2, Color.parseColor("#b3000000"));
        this.e = sp2px(context, typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleLoadNumberProgress_textSize, 36.0f));
        this.d = typedArrayObtainStyledAttributes.getColor(i2, Color.parseColor("#66000000"));
        this.f = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleLoadNumberProgress_textUnitSize, sp2px(context, 12.0f));
        this.g = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CircleLoadNumberProgress_showText, false);
        this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleLoadNumberProgress_unProgressColor, Color.parseColor("#113498DB"));
        this.i = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleLoadNumberProgress_progressColor, Color.parseColor("#3498DB"));
        this.j = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleLoadNumberProgress_reachedColor, Color.parseColor("#4191e1"));
        this.t = typedArrayObtainStyledAttributes.getInt(R.styleable.CircleLoadNumberProgress_currentProgress, 0);
        this.u = typedArrayObtainStyledAttributes.getInt(R.styleable.CircleLoadNumberProgress_maxProgress, 100);
        this.w = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleLoadNumberProgress_startAngle, -90.0f);
        this.x = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleLoadNumberProgress_endAngle, 270.0f);
        this.r = dip2px(context, typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleLoadNumberProgress_progressWidth, 4.0f));
        Paint paint = new Paint();
        this.k = paint;
        paint.setAntiAlias(true);
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(this.r);
        this.k.setColor(this.h);
        Paint paint2 = new Paint();
        this.l = paint2;
        paint2.setAntiAlias(true);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth(this.r);
        this.l.setColor(this.i);
        Paint paint3 = new Paint();
        this.m = paint3;
        paint3.setAntiAlias(true);
        this.m.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(this.r);
        this.m.setColor(this.j);
        Paint paint4 = new Paint(1);
        this.o = paint4;
        paint4.setColor(this.c);
        this.o.setTextSize(this.e);
        Paint paint5 = new Paint();
        this.p = paint5;
        paint5.setColor(this.d);
        this.p.setTextSize(this.f);
        Paint paint6 = new Paint();
        this.q = paint6;
        paint6.setColor(this.c);
        this.q.setTextSize(sp2px(context, 14.0f));
        this.q.setTextAlign(Paint.Align.CENTER);
        this.n = this.q.getFontMetrics();
        this.a = context.getString(R.string.sports_firstbeat_recovery_time_unit);
        this.b = context.getString(R.string.sports_firstbeat_recovery_time_achieve);
        typedArrayObtainStyledAttributes.recycle();
    }
}
