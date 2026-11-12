package com.huami.lib.rainbow.shapeable;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.huami.lib.rainbow.R;

/* JADX INFO: loaded from: classes10.dex */
public class ShapeableLineLayout extends LinearLayout implements Shapeable {
    private final ShapeAppearancePathProvider a;
    private final RectF b;
    private final RectF c;
    private final Paint d;
    private final Paint e;
    private final Path f;
    private ColorStateList g;
    private ShapeAppearanceModel h;

    @Dimension
    private float i;
    private final Path j;
    private final MaterialShapeDrawable k;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {
        private final Rect a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableLineLayout.this.h == null) {
                return;
            }
            ShapeableLineLayout.this.b.round(this.a);
            ShapeableLineLayout.this.k.setBounds(this.a);
            ShapeableLineLayout.this.k.getOutline(outline);
        }
    }

    public ShapeableLineLayout(Context context) {
        this(context, null, 0);
    }

    private void d(Canvas canvas) {
        if (this.g == null) {
            return;
        }
        this.d.setStrokeWidth(this.i);
        int colorForState = this.g.getColorForState(getDrawableState(), this.g.getDefaultColor());
        if (this.i <= 0.0f || colorForState == 0) {
            return;
        }
        this.d.setColor(colorForState);
        canvas.drawPath(this.f, this.d);
    }

    private void e(int i, int i2) {
        this.b.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.a.calculatePath(this.h, 1.0f, this.b, this.f);
        this.j.rewind();
        this.j.addPath(this.f);
        this.c.set(0.0f, 0.0f, i, i2);
        this.j.addRect(this.c, Path.Direction.CCW);
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.h;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.g;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.j, this.e);
        d(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.h = shapeAppearanceModel;
        this.k.setShapeAppearanceModel(shapeAppearanceModel);
        e(getWidth(), getHeight());
        invalidate();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.g = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i) {
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(@Dimension float f) {
        if (this.i != f) {
            this.i = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableLineLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"RestrictedApi"})
    public ShapeableLineLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ShapeAppearancePathProvider();
        this.f = new Path();
        Context context2 = getContext();
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.b = new RectF();
        this.c = new RectF();
        this.j = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.ShapeableLinearLayout, i, 0);
        this.g = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.ShapeableLinearLayout_strokeColor);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableLinearLayout_strokeWidth, 0);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.h = ShapeAppearanceModel.builder(context2, attributeSet, i, 0).build();
        this.k = new MaterialShapeDrawable(this.h);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new a());
        }
    }
}
