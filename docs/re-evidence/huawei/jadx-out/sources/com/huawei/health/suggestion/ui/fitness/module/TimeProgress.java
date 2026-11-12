package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qqp;

/* JADX INFO: loaded from: classes9.dex */
public class TimeProgress extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PointF f9411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f9412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f9413c;
    private Paint d;
    private float e;
    private int g;
    private int h;
    private RectF i;

    public TimeProgress(Context context) {
        super(context);
        this.f9412b = 3.0f;
        this.f9411a = new PointF();
        this.e = -1.0f;
        a();
    }

    public TimeProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9412b = 3.0f;
        this.f9411a = new PointF();
        this.e = -1.0f;
        a();
    }

    public TimeProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9412b = 3.0f;
        this.f9411a = new PointF();
        this.e = -1.0f;
        a();
    }

    private void a() {
        this.h = getResources().getColor(R.color.sug_event_press);
        this.g = getResources().getColor(R.color.sug_event_press);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.d = new Paint(1);
        this.f9412b = qqp.a(getContext(), this.f9412b);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float fMin = ((Math.min(i, i2) * 1.0f) / 2.0f) - (this.f9412b / 2.0f);
        this.f9411a = new PointF((i * 1.0f) / 2.0f, (i2 * 1.0f) / 2.0f);
        this.i = new RectF(this.f9411a.x - fMin, this.f9411a.y - fMin, this.f9411a.x + fMin, this.f9411a.y + fMin);
        this.d.setStrokeWidth(this.f9412b);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.d.setColor(this.h);
        float f = this.f9413c;
        if (f == 0.0f) {
            LogUtil.j("Suggestion_TimeProgress", "onDraw mMax == 0");
        } else {
            canvas.drawArc(this.i, -90.0f, 1.0f * (((this.e * 360.0f) * 1.0f) / f), false, this.d);
        }
    }

    public TimeProgress e(float f) {
        this.f9413c = f;
        postInvalidate();
        return this;
    }

    public TimeProgress a(float f) {
        this.e = f;
        this.h = this.g;
        postInvalidate();
        return this;
    }

    public float getMax() {
        return this.f9413c;
    }
}
