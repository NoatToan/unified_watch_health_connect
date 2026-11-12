package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import defpackage.qqp;

/* JADX INFO: loaded from: classes9.dex */
public class BrightnessOrVolumeProgress extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PointF f10179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f10180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10181c;
    private int d;
    private float e;
    private float f;
    private int g;
    private RectF h;

    public BrightnessOrVolumeProgress(Context context) {
        super(context);
        this.f10181c = 2.0f;
        this.e = 1.0f;
        this.f = 0.5f;
        this.f10179a = new PointF();
        b(context);
    }

    public BrightnessOrVolumeProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10181c = 2.0f;
        this.e = 1.0f;
        this.f = 0.5f;
        this.f10179a = new PointF();
        b(context);
    }

    public BrightnessOrVolumeProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10181c = 2.0f;
        this.e = 1.0f;
        this.f = 0.5f;
        this.f10179a = new PointF();
        b(context);
    }

    private void b(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        this.d = ContextCompat.getColor(context, R.color.common_white_30alpha);
        this.g = ContextCompat.getColor(context, R.color.emui_white);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10180b = new Paint(1);
        this.f10181c = qqp.a(getContext(), this.f10181c);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float fMin = (Math.min(i, i2) * 0.5f) - (this.f10181c * 0.5f);
        this.f10179a = new PointF(i * 0.5f, i2 * 0.5f);
        this.h = new RectF(this.f10179a.x - fMin, this.f10179a.y - fMin, this.f10179a.x + fMin, this.f10179a.y + fMin);
        this.f10180b.setStrokeWidth(this.f10181c);
        this.f10180b.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f10180b.setColor(this.d);
        canvas.drawArc(this.h, 0.0f, 360.0f, false, this.f10180b);
        this.f10180b.setColor(this.g);
        canvas.drawArc(this.h, -90.0f, ((this.f * 360.0f) / this.e) * 1.0f, false, this.f10180b);
    }

    public void setMax(float f) {
        this.e = f;
        postInvalidate();
    }

    public void setProgress(float f) {
        this.f = f;
        postInvalidate();
    }
}
