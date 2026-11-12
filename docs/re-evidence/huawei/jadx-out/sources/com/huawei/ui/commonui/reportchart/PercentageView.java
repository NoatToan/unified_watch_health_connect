package com.huawei.ui.commonui.reportchart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class PercentageView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f23831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23833c;
    private float d;
    private List<d> e;

    public PercentageView(Context context) {
        super(context);
        a(context);
    }

    public PercentageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PercentageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
        this.f23832b = context.getResources().getDisplayMetrics().widthPixels - a(context, 40.0f);
        Paint paint = new Paint();
        this.f23831a = paint;
        paint.setAntiAlias(true);
    }

    private float a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f23832b = i;
        this.f23833c = i2;
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            int i = 0;
            canvas.drawColor(0);
            int size = this.e.size();
            float f = 0.0f;
            while (i < size) {
                this.f23831a.setColor(this.e.get(i).e);
                float f2 = ((this.e.get(i).d / this.d) * this.f23832b) + f;
                if (i == 0) {
                    c(canvas, size, f, f2);
                } else if (i == size - 1) {
                    RectF rectF = new RectF(f, 0.0f, f2, this.f23833c);
                    float f3 = this.f23833c / 2.0f;
                    canvas.drawRoundRect(rectF, f3, f3, this.f23831a);
                    rectF.left = f;
                    rectF.right = f2 - 15.0f;
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.f23831a);
                } else {
                    canvas.drawRoundRect(new RectF(f, 0.0f, f2 - 2.0f, this.f23833c), 0.0f, 0.0f, this.f23831a);
                }
                i++;
                f = f2;
            }
        }
    }

    private void c(Canvas canvas, int i, float f, float f2) {
        float f3 = f2 - 2.0f;
        RectF rectF = new RectF(f, 0.0f, f3, this.f23833c);
        float f4 = this.f23833c / 2.0f;
        canvas.drawRoundRect(rectF, f4, f4, this.f23831a);
        rectF.left = f + 15.0f;
        rectF.right = f3;
        if (i != 1) {
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.f23831a);
        }
    }

    public void setData(List<d> list) {
        this.e = list;
        this.d = 0.0f;
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            this.d += it.next().d;
        }
        invalidate();
    }

    public static class d {
        int d;
        int e;

        public d() {
        }

        public d(int i, int i2) {
            this.d = i;
            this.e = i2;
        }
    }
}
