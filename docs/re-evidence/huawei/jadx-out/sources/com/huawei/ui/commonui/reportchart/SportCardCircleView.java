package com.huawei.ui.commonui.reportchart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class SportCardCircleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f23834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f23836c;
    private Paint d;
    private float e;

    public SportCardCircleView(Context context) {
        this(context, null);
    }

    public SportCardCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    private void c(final Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.incomplete_circle_view, 0, 0);
        this.f23835b = typedArrayObtainStyledAttributes.getDimension(R.styleable.incomplete_circle_view_offsetX, qrs.d(context, 23.0f));
        this.e = typedArrayObtainStyledAttributes.getDimension(R.styleable.incomplete_circle_view_offsetY, qrs.d(context, 30.0f));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setColor(-1);
        this.d.setAlpha(23);
        Paint paint2 = new Paint();
        this.f23836c = paint2;
        paint2.setAntiAlias(true);
        this.f23836c.setStyle(Paint.Style.STROKE);
        this.f23836c.setColor(-1);
        this.f23836c.setAlpha(13);
        Paint paint3 = new Paint();
        this.f23834a = paint3;
        paint3.setAntiAlias(true);
        this.f23834a.setStyle(Paint.Style.STROKE);
        this.f23834a.setColor(-1);
        this.f23834a.setAlpha(5);
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.huawei.ui.commonui.reportchart.SportCardCircleView.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), qrs.d(context, 10.0f));
            }
        });
        setClipToOutline(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float width;
        if (LanguageUtil.ba(BaseApplication.b())) {
            width = this.f23835b;
        } else {
            width = getWidth() - this.f23835b;
        }
        float f = this.e;
        float width2 = (getWidth() * 2.0f) / 5.0f;
        float width3 = (getWidth() * 3.0f) / 5.0f;
        float width4 = (getWidth() * 4.0f) / 5.0f;
        float f2 = width4 - width3;
        this.f23834a.setStrokeWidth(f2);
        float f3 = width3 - width2;
        this.f23836c.setStrokeWidth(f3);
        canvas.drawCircle(width, f, width4 - (f2 / 2.0f), this.f23834a);
        canvas.drawCircle(width, f, width3 - (f3 / 2.0f), this.f23836c);
        canvas.drawCircle(width, f, width2, this.d);
    }

    public void setCircle(int i) {
        this.d.setColor(i);
        this.f23836c.setColor(i);
        this.f23834a.setColor(i);
        this.d.setAlpha(23);
        this.f23836c.setAlpha(13);
        this.f23834a.setAlpha(5);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
