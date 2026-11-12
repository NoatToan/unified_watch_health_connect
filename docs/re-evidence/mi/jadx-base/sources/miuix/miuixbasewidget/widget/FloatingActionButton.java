package miuix.miuixbasewidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import defpackage.a3j;
import defpackage.aii;
import defpackage.alb;
import defpackage.hm1;
import defpackage.im8;
import defpackage.j5j;
import defpackage.tki;
import defpackage.zoi;
import java.lang.ref.WeakReference;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public miuix.miuixbasewidget.widget.a f26670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public im8 f26671b;
    public final boolean c;
    public Drawable d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public a j;

    public class a extends Drawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f26672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Paint f26673b = new Paint();

        public a(Drawable drawable) {
            this.f26672a = drawable;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int width = FloatingActionButton.this.getWidth();
            int paddingLeft = FloatingActionButton.this.getPaddingLeft();
            int paddingTop = FloatingActionButton.this.getPaddingTop();
            int paddingRight = (((width - paddingLeft) - FloatingActionButton.this.getPaddingRight()) / 2) * 2;
            this.f26672a.setBounds(paddingLeft, paddingTop, paddingLeft + paddingRight, paddingRight + paddingTop);
            this.f26672a.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public Drawable.ConstantState getConstantState() {
            return this.f26672a.getConstantState();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return this.f26672a.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.f26672a.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.f26672a.setColorFilter(colorFilter);
        }
    }

    public static class b extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<View> f26674a;

        public b(View view) {
            this.f26674a = new WeakReference<>(view);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            View view = this.f26674a.get();
            if (view != null) {
                int width = view.getWidth();
                int paddingLeft = view.getPaddingLeft();
                int paddingTop = view.getPaddingTop();
                float paddingRight = ((width - paddingLeft) - view.getPaddingRight()) / 2.0f;
                canvas.drawCircle(paddingLeft + paddingRight, paddingTop + paddingRight, paddingRight, paint);
            }
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private Drawable getDefaultBackground() {
        if (this.d == null) {
            this.f = getContext().getResources().getColor(tki.g);
            this.g = true;
            this.d = b();
        }
        return this.d;
    }

    public final int a(int i) {
        return Color.argb(102, Color.red(i), Math.max(0, Color.green(i) - 30), Color.blue(i));
    }

    public final Drawable b() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new b(this));
        if (this.c) {
            this.f26670a.f26678a = this.i ? this.h : a(this.f);
            if (this.f26671b == null) {
                d();
            } else {
                this.f26671b.d(this, getResources().getConfiguration(), hm1.d(getContext(), aii.c, true));
            }
        } else {
            im8 im8Var = this.f26671b;
            if (im8Var != null) {
                im8Var.b(this, false, 2);
            }
            this.f26671b = null;
        }
        shapeDrawable.getPaint().setColor(this.f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.j});
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new b(this));
        shapeDrawable2.getPaint().setColor(218103808);
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{layerDrawable, shapeDrawable2});
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(ImageView.PRESSED_ENABLED_STATE_SET, layerDrawable2);
        stateListDrawable.addState(ImageView.ENABLED_SELECTED_STATE_SET, layerDrawable2);
        stateListDrawable.addState(ImageView.EMPTY_STATE_SET, layerDrawable);
        return stateListDrawable;
    }

    public final void c() {
        if (getBackground() != null) {
            this.g = false;
            return;
        }
        if (this.g) {
            super.setBackground(b());
        } else {
            super.setBackground(getDefaultBackground());
        }
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(this.e);
        }
    }

    public final void d() {
        this.f26671b = new im8(getContext(), this.f26670a, hm1.d(getContext(), aii.c, true));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        im8 im8Var;
        if (this.c && (im8Var = this.f26671b) != null) {
            im8Var.f(this.e / 255.0f);
            this.f26671b.a(canvas, getHeight());
        }
        super.draw(canvas);
    }

    public final void e() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = (((getWidth() - paddingLeft) - getPaddingRight()) / 2) * 2;
        this.j.setBounds(paddingLeft, paddingTop, paddingLeft + width, width + paddingTop);
    }

    @Override // android.view.View
    public float getAlpha() {
        return (float) (((double) this.e) / 255.0d);
    }

    @Override // android.widget.ImageView
    public int getImageAlpha() {
        return this.e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f26671b != null) {
            this.f26671b.d(this, configuration, hm1.d(getContext(), aii.c, true));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        e();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        im8 im8Var = this.f26671b;
        if (im8Var != null) {
            im8Var.g(i, i2, i3, i4);
            if (this.c) {
                this.f26671b.b(this, true, 2);
            } else {
                this.f26671b.b(this, false, 2);
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        HapticCompat.e(this, alb.z, alb.g);
        return super.performClick();
    }

    @Override // android.widget.ImageView
    public void setAlpha(int i) {
        boolean z = this.e != i;
        this.e = i;
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
        Drawable drawable = getDrawable();
        if (drawable != null && z) {
            drawable.mutate().setAlpha(i);
        }
        im8 im8Var = this.f26671b;
        if (im8Var != null && im8Var.c) {
            im8Var.c(this, this.e / 255.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.g = false;
        if (drawable == null) {
            drawable = getDefaultBackground();
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!this.g || this.f != i) {
            this.f = i;
            super.setBackground(b());
        }
        this.g = true;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        this.g = false;
        if (i == 0) {
            super.setBackground(getDefaultBackground());
        } else {
            super.setBackgroundResource(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageAlpha(int i) {
        boolean z = this.e != i;
        this.e = i;
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
        Drawable drawable = getDrawable();
        if (drawable != null && z) {
            drawable.mutate().setAlpha(i);
        }
        im8 im8Var = this.f26671b;
        if (im8Var != null && im8Var.c) {
            im8Var.c(this, this.e / 255.0f);
        }
        invalidate();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 255;
        miuix.miuixbasewidget.widget.a aVarA = new miuix.miuixbasewidget.widget.a.C1034a(8.0f).a();
        this.f26670a = aVarA;
        aVarA.e = 0.0f;
        aVarA.f = 10.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j5j.c0, i, a3j.f);
        this.c = typedArrayObtainStyledAttributes.getBoolean(j5j.f0, true);
        this.g = typedArrayObtainStyledAttributes.hasValue(j5j.d0);
        this.f = typedArrayObtainStyledAttributes.getColor(j5j.d0, context.getResources().getColor(tki.f));
        this.i = typedArrayObtainStyledAttributes.hasValue(j5j.e0);
        this.h = typedArrayObtainStyledAttributes.getColor(j5j.e0, this.f);
        typedArrayObtainStyledAttributes.recycle();
        this.j = new a(getContext().getResources().getDrawable(zoi.f41524a));
        c();
        Folme.useAt(this).touch().setTint(0).handleTouchOf(this, new AnimConfig[0]);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this, new AnimConfig[0]);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        float f2 = 255.0f * f;
        boolean z = ((float) this.e) != f2;
        int i = (int) f2;
        this.e = i;
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
        Drawable drawable = getDrawable();
        if (drawable != null && z) {
            drawable.mutate().setAlpha(i);
        }
        im8 im8Var = this.f26671b;
        if (im8Var != null && im8Var.c) {
            im8Var.c(this, f);
        }
        invalidate();
    }
}
