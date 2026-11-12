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
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.huami.lib.rainbow.R;

/* JADX INFO: loaded from: classes10.dex */
class a {
    private View a;
    private final RectF c;
    private final RectF d;
    private final Paint e;
    private final Paint f;
    private ColorStateList h;
    private ShapeAppearanceModel i;

    @Dimension
    private float j;
    private final Path k;
    private final MaterialShapeDrawable l;
    private final ShapeAppearancePathProvider b = new ShapeAppearancePathProvider();
    private final Path g = new Path();

    /* JADX INFO: renamed from: com.huami.lib.rainbow.shapeable.a$a, reason: collision with other inner class name */
    @TargetApi(21)
    public class C0462a extends ViewOutlineProvider {
        private final Rect a = new Rect();

        public C0462a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (a.this.i == null) {
                return;
            }
            a.this.c.round(this.a);
            a.this.l.setBounds(this.a);
            a.this.l.getOutline(outline);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public a(View view, AttributeSet attributeSet, @AttrRes int i) {
        this.a = view;
        Context context = view.getContext();
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.c = new RectF();
        this.d = new RectF();
        this.k = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShapeableConstraintLayout, i, 0);
        this.h = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.ShapeableConstraintLayout_strokeColor);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableConstraintLayout_strokeWidth, 0);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.i = ShapeAppearanceModel.builder(context, attributeSet, i, 0).build();
        this.l = new MaterialShapeDrawable(this.i);
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new C0462a());
        }
    }

    private void d(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        this.e.setStrokeWidth(this.j);
        int colorForState = this.h.getColorForState(this.a.getDrawableState(), this.h.getDefaultColor());
        if (this.j <= 0.0f || colorForState == 0) {
            return;
        }
        this.e.setColor(colorForState);
        canvas.drawPath(this.g, this.e);
    }

    public ShapeAppearanceModel e() {
        return this.i;
    }

    @Nullable
    public ColorStateList f() {
        return this.h;
    }

    @Dimension
    public float g() {
        return this.j;
    }

    public void h(Canvas canvas) {
        canvas.drawPath(this.k, this.f);
        d(canvas);
    }

    public void i(ShapeAppearanceModel shapeAppearanceModel) {
        this.i = shapeAppearanceModel;
        this.l.setShapeAppearanceModel(shapeAppearanceModel);
        l(this.a.getWidth(), this.a.getHeight());
        this.a.invalidate();
    }

    public void j(@Nullable ColorStateList colorStateList) {
        this.h = colorStateList;
        this.a.invalidate();
    }

    public void k(@Dimension float f) {
        if (this.j != f) {
            this.j = f;
            this.a.invalidate();
        }
    }

    public void l(int i, int i2) {
        this.c.set(this.a.getPaddingLeft(), this.a.getPaddingTop(), i - this.a.getPaddingRight(), i2 - this.a.getPaddingBottom());
        this.b.calculatePath(this.i, 1.0f, this.c, this.g);
        this.k.rewind();
        this.k.addPath(this.g);
        this.d.set(0.0f, 0.0f, i, i2);
        this.k.addRect(this.d, Path.Direction.CCW);
    }
}
