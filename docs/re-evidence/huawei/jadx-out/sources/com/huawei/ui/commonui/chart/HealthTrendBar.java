package com.huawei.ui.commonui.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthTrendBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f23363c;
    private int d;

    public HealthTrendBar(Context context) {
        super(context);
        this.f23362b = true;
        e();
    }

    public HealthTrendBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23362b = true;
        c(context, attributeSet);
    }

    public HealthTrendBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23362b = true;
        c(context, attributeSet);
    }

    private void e() {
        setWillNotDraw(false);
        this.f23363c = new Paint();
    }

    private void c(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthTrendBar);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthTrendBar_barColor, 0);
        this.f23361a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthTrendBar_barStrokeWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f23363c = paint;
        paint.setColor(color);
        this.f23363c.setStrokeWidth(this.f23361a);
        this.f23363c.setAntiAlias(true);
    }

    public void setLength(int i, boolean z) {
        if (Math.abs(i) > 1.0E-5d) {
            this.f23362b = false;
            this.f23363c.setStrokeCap(Paint.Cap.ROUND);
            if (z) {
                i = (int) (i - (this.f23361a / 2.0f));
            }
            this.d = i;
        } else {
            this.f23362b = true;
            this.f23363c.setStrokeCap(Paint.Cap.BUTT);
            this.d = getContext().getResources().getDimensionPixelSize(R.dimen.health_common_4dp);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        boolean zBa = LanguageUtil.ba(getContext());
        if (zBa) {
            canvas.save();
            canvas.rotate(180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        canvas.drawLine(-100.0f, height, this.d, height, this.f23363c);
        if (zBa) {
            canvas.restore();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = (int) (getPaddingLeft() + this.d + getPaddingRight() + (this.f23361a / 2.0f));
            int measuredWidth = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                measuredWidth += childAt.getMeasuredWidth() + layoutParams.getMarginStart() + layoutParams.getMarginEnd();
            }
            if (!this.f23362b && measuredWidth > size) {
                this.d = (int) (((measuredWidth - getPaddingLeft()) - getPaddingRight()) - (this.f23361a / 2.0f));
                invalidate();
                size = measuredWidth;
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingTop() + this.f23361a + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }
}
