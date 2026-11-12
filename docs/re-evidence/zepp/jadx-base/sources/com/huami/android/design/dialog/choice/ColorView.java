package com.huami.android.design.dialog.choice;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.R;

/* JADX INFO: loaded from: classes4.dex */
public class ColorView extends View {
    private Paint a;
    private int b;

    public ColorView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.b, this.a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iResolveSize = View.resolveSize(paddingRight, i);
        int iResolveSize2 = View.resolveSize(paddingTop, i2);
        this.b = Math.min(iResolveSize, iResolveSize2) / 2;
        setMeasuredDimension(iResolveSize, iResolveSize2);
    }

    public void setColor(@ColorInt int i) {
        this.a.setColor(i);
        postInvalidate();
    }

    public ColorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorView, 0, i);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.ColorView_customColor, ContextCompat.getColor(context, R.color.bg_color_blue));
        typedArrayObtainStyledAttributes.recycle();
        setColor(color);
    }
}
