package com.huawei.ui.main.stories.health.views.healthdata;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class VerticalTextView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f28216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextPaint f28217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28218c;
    private int d;

    public VerticalTextView(Context context) {
        super(context);
        this.f28216a = new Rect();
        e();
    }

    public VerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28216a = new Rect();
        e();
        if (context == null) {
            LogUtil.a("VerticalTextView", "context is null");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.verticaltextview);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.verticaltextview_verticalText);
        if (string != null) {
            this.f28218c = string.toString();
        }
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.verticaltextview_verticalTextSize, 15);
        if (dimensionPixelOffset > 0) {
            this.f28217b.setTextSize(dimensionPixelOffset);
        }
        this.f28217b.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.verticaltextview_verticalTextColor, -16777216));
        this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.verticaltextview_direction, 0);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
        invalidate();
    }

    private void e() {
        TextPaint textPaint = new TextPaint();
        this.f28217b = textPaint;
        textPaint.setAntiAlias(true);
        this.f28217b.setColor(-16777216);
        this.f28217b.setTextSize(15.0f);
        this.f28217b.setTextAlign(Paint.Align.CENTER);
    }

    public void setDirection(int i) {
        this.d = i;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        TextPaint textPaint = this.f28217b;
        String str = this.f28218c;
        textPaint.getTextBounds(str, 0, str.length(), this.f28216a);
        setMeasuredDimension(e(i), a(i2));
    }

    private int e(int i) {
        LogUtil.d("VerticalTextView", "measureWidth, widtheSpec = ", Integer.valueOf(i));
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int iHeight = this.f28216a.height();
        return mode == Integer.MIN_VALUE ? Math.min(iHeight, size) : iHeight;
    }

    private int a(int i) {
        LogUtil.d("VerticalTextView", "measureWidth, heightSpec = ", Integer.valueOf(i));
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int iWidth = this.f28216a.width();
        return mode == Integer.MIN_VALUE ? Math.min(iWidth, size) : iWidth;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        Path path = new Path();
        if (this.d == 0) {
            float width = (getWidth() / 2) - (this.f28216a.height() / 2);
            path.moveTo(width, 0);
            path.lineTo(width, height);
        } else {
            float width2 = (getWidth() / 2) + (this.f28216a.height() / 2);
            path.moveTo(width2, height);
            path.lineTo(width2, 0);
        }
        canvas.drawTextOnPath(this.f28218c, path, 0.0f, 0.0f, this.f28217b);
    }
}
