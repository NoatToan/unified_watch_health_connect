package com.huami.widget.colorbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ColorBarView extends View {
    private static final int h = 7;
    private static final int i = 1;
    private static final int j = 0;
    private static final int k = 1;
    private List<ColorItem> a;
    private float b;
    private int c;
    private int d;
    private Paint e;
    private int f;
    private Path g;

    public ColorBarView(Context context) {
        this(context, null);
    }

    private static int a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private float[] b(float f, float f2, float f3, float f4) {
        return new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return a(getContext(), 7.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2 = this.d;
        int i3 = i2 <= 1 ? 0 : (i2 - 1) * this.c;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int i4 = (width - paddingLeft) - i3;
        float paddingTop = getPaddingTop();
        float height = getHeight() - getPaddingBottom();
        float f = (height - paddingTop) / 2.0f;
        if (this.f == 1) {
            this.g.reset();
            this.g.addRoundRect(new RectF(paddingLeft, paddingTop, width, height), b(f, f, f, f), Path.Direction.CW);
            canvas.clipPath(this.g);
        }
        float f2 = 0.0f;
        for (ColorItem colorItem : this.a) {
            float f3 = colorItem.weight;
            if (f3 > 0.0f) {
                float f4 = (f3 / this.b) * i4;
                float f5 = paddingLeft + f2;
                this.e.setColor(colorItem.color);
                canvas.drawRect(f5, paddingTop, f5 + f4, height, this.e);
                f2 += f4 + this.c;
            }
        }
    }

    public void setColorList(List<ColorItem> list) {
        this.a.clear();
        this.a.addAll(list);
        this.b = 0.0f;
        for (ColorItem colorItem : this.a) {
            float f = this.b;
            float f2 = colorItem.weight;
            this.b = f + f2;
            if (f2 > 0.0f) {
                this.d++;
            }
        }
        invalidate();
    }

    public void setGapSize(int i2) {
        this.c = i2;
        invalidate();
    }

    public ColorBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new ArrayList();
        this.b = 0.0f;
        this.d = 0;
        this.f = 0;
        this.g = new Path();
        int iA = a(getContext(), 1.0f);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorBarView, i2, 0);
            iA = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ColorBarView_cbv_gap_size, iA);
            this.f = typedArrayObtainStyledAttributes.getInt(R.styleable.ColorBarView_colorBarCapType, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.e = new Paint(1);
        this.c = iA;
    }
}
