package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.huawei.openalliance.ad.R;

/* JADX INFO: loaded from: classes41.dex */
public class CornerImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f20778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f20779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Path f20780c;

    public void setRectCornerRadius(float f) {
        this.f20779b = f;
        a();
        postInvalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f20778a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f20779b > 0.01f) {
            canvas.clipPath(this.f20780c);
        }
        super.draw(canvas);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PPSCornerImageView)) != null) {
            try {
                this.f20779b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PPSCornerImageView_hiad_ImageCorner, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        setWillNotDraw(false);
        this.f20780c = new Path();
    }

    private void a() {
        this.f20780c.reset();
        Path path = this.f20780c;
        RectF rectF = this.f20778a;
        float f = this.f20779b;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    public CornerImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20778a = new RectF();
        this.f20779b = 0.0f;
        a(context, attributeSet);
    }

    public CornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20778a = new RectF();
        this.f20779b = 0.0f;
        a(context, attributeSet);
    }

    public CornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20778a = new RectF();
        this.f20779b = 0.0f;
        a(context, attributeSet);
    }

    public CornerImageView(Context context) {
        super(context);
        this.f20778a = new RectF();
        this.f20779b = 0.0f;
        a(context, null);
    }
}
