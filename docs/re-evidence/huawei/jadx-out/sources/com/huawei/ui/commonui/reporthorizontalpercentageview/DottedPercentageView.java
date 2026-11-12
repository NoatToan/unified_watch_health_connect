package com.huawei.ui.commonui.reporthorizontalpercentageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class DottedPercentageView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f23839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23840c;
    private int d;
    private int e;
    private float h;
    private float i;

    public DottedPercentageView(Context context) {
        super(context);
        this.e = Color.parseColor("#F5F6FA");
        this.d = Color.parseColor("#B0B7DB");
        d(context, null);
    }

    public DottedPercentageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = Color.parseColor("#F5F6FA");
        this.d = Color.parseColor("#B0B7DB");
        d(context, attributeSet);
    }

    public DottedPercentageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = Color.parseColor("#F5F6FA");
        this.d = Color.parseColor("#B0B7DB");
        d(context, attributeSet);
    }

    private void d(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.dotted_percentage_view, 0, 0);
        this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.dotted_percentage_view_schedule_color, this.d);
        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.dotted_percentage_view_default_color, this.e);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f23839b = paint;
        paint.setAntiAlias(true);
        this.f23839b.setColor(this.e);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.i = i;
        this.f23840c = i2;
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f23839b.setColor(this.e);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, this.i, this.f23840c), 15.0f, 15.0f, this.f23839b);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, 15.0f, this.f23840c), 0.0f, 0.0f, this.f23839b);
        if (this.h > 0.0f) {
            this.f23839b.setColor(this.d);
            float f = (this.h * this.i) / this.f23838a;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, f, this.f23840c), 15.0f, 15.0f, this.f23839b);
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, f / 2.0f, this.f23840c), 0.0f, 15.0f, this.f23839b);
        }
    }

    public void setData(int i, int i2) {
        this.h = i;
        this.f23838a = i2;
        invalidate();
    }
}
