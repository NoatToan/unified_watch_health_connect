package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.huawei.openalliance.ad.R;

/* JADX INFO: loaded from: classes41.dex */
public class RoundLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f21089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f21090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Path f21091c;

    public void setRectCornerRadius(float f) {
        this.f21090b = f;
        a();
        postInvalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f21089a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f21090b > 0.01f) {
            canvas.clipPath(this.f21091c);
        }
        super.draw(canvas);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PPSRoundCornerLayout)) != null) {
            try {
                this.f21090b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PPSRoundCornerLayout_hiad_roundCorner, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        setWillNotDraw(false);
        this.f21091c = new Path();
    }

    private void a() {
        this.f21091c.reset();
        Path path = this.f21091c;
        RectF rectF = this.f21089a;
        float f = this.f21090b;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    public RoundLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f21089a = new RectF();
        this.f21090b = 0.0f;
        a(context, attributeSet);
    }

    public RoundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21089a = new RectF();
        this.f21090b = 0.0f;
        a(context, attributeSet);
    }

    public RoundLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21089a = new RectF();
        this.f21090b = 0.0f;
        a(context, attributeSet);
    }

    public RoundLinearLayout(Context context) {
        super(context);
        this.f21089a = new RectF();
        this.f21090b = 0.0f;
        a(context, null);
    }
}
