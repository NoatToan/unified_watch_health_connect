package com.huami.android.design.dialog.pager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.huami.android.design.dialog.ViewUtils;
import com.huami.chart.template.ColorTemplate;

/* JADX INFO: loaded from: classes5.dex */
public class CirclePageIndicator extends View {
    private Paint a;
    private int b;
    private int c;
    private int d;
    private float e;

    @ColorInt
    private final int f;

    @ColorInt
    private final int g;

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    private void a() {
        this.a = new Paint(1);
        this.e = ViewUtils.dp2px(getContext(), 3.5f);
        this.d = (int) ViewUtils.dp2px(getContext(), 10.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c <= 0) {
            return;
        }
        int width = getWidth();
        int i = this.c;
        float f = ((width - ((i - 1) * this.d)) - ((i * this.e) * 2.0f)) * 0.5f;
        float height = getHeight() * 0.5f;
        this.a.setColor(ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR);
        for (int i2 = 0; i2 < this.c; i2++) {
            float f2 = this.d;
            float f3 = this.e;
            canvas.drawCircle((i2 * (f2 + (f3 * 2.0f))) + f, height, f3, this.a);
        }
        this.a.setColor(-42928);
        float f4 = this.b;
        float f5 = this.d;
        float f6 = this.e;
        canvas.drawCircle(f + (f4 * (f5 + (2.0f * f6))), height, f6, this.a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), (int) ViewUtils.dp2px(getContext(), 44.0f));
    }

    public void onPageSelected(int i) {
        this.b = i;
        invalidate();
    }

    public void setPageNum(int i) {
        this.c = i;
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -42928;
        this.g = ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR;
        if (isInEditMode()) {
            return;
        }
        a();
    }
}
