package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.companionlib.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CircleIndicator extends View {
    private ViewPager a;
    private List<ShapeHolder> b;
    private ShapeHolder c;
    private int d;
    private float e;
    private float f;
    private float g;
    private int h;
    private int i;
    private Gravity j;
    private Mode k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private boolean r;

    public enum Gravity {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum Mode {
        INSIDE,
        OUTSIDE,
        SOLO
    }

    public class a extends ViewPager.SimpleOnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            if (CircleIndicator.this.k != Mode.SOLO) {
                CircleIndicator.this.l(i, f);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (CircleIndicator.this.k == Mode.SOLO) {
                CircleIndicator.this.l(i, 0.0f);
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Mode.values().length];
            a = iArr;
            try {
                iArr[Mode.INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Mode.OUTSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Mode.SOLO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CircleIndicator(Context context) {
        super(context);
        this.l = 10;
        this.m = 40;
        this.n = -16776961;
        this.o = SupportMenu.CATEGORY_MASK;
        this.p = Gravity.CENTER.ordinal();
        this.q = Mode.SOLO.ordinal();
        g(context, null);
    }

    private void c() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.c = new ShapeHolder(shapeDrawable);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.i);
        paint.setAntiAlias(true);
        int i = b.a[this.k.ordinal()];
        if (i == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        } else if (i == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        } else if (i == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        this.c.setPaint(paint);
    }

    private void d() {
        int count = getLoopVisbity() ? this.a.getAdapter().getCount() - 2 : this.a.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            ShapeHolder shapeHolder = new ShapeHolder(shapeDrawable);
            Paint paint = shapeDrawable.getPaint();
            paint.setColor(this.h);
            paint.setAntiAlias(true);
            shapeHolder.setPaint(paint);
            this.b.add(shapeHolder);
        }
    }

    private void e(Canvas canvas, ShapeHolder shapeHolder) {
        canvas.save();
        canvas.translate(shapeHolder.getX(), shapeHolder.getY());
        shapeHolder.getShape().draw(canvas);
        canvas.restore();
    }

    private void f(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleIndicator);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CircleIndicator_ci_radius, 10);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CircleIndicator_ci_margin, 40);
        this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleIndicator_ci_background, -16776961);
        this.i = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleIndicator_ci_selected_background, SupportMenu.CATEGORY_MASK);
        this.j = Gravity.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.CircleIndicator_ci_gravity, this.p)];
        this.k = Mode.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.CircleIndicator_ci_mode, this.q)];
        typedArrayObtainStyledAttributes.recycle();
    }

    private void g(Context context, AttributeSet attributeSet) {
        this.b = new ArrayList();
        f(context, attributeSet);
    }

    private void h(int i, float f) {
        if (this.c == null) {
            throw new IllegalStateException("forget to create movingItem?");
        }
        if (this.b.size() == 0) {
            return;
        }
        ShapeHolder shapeHolder = this.b.get(i);
        this.c.resizeShape(shapeHolder.getWidth(), shapeHolder.getHeight());
        if (getLoopVisbity() && i == this.b.size() - 1) {
            f = 0.0f;
        }
        this.c.setX(shapeHolder.getX() + ((this.g + (this.f * 2.0f)) * f));
        this.c.setY(shapeHolder.getY());
    }

    private void i(int i, int i2) {
        if (this.b == null) {
            throw new IllegalStateException("forget to create tabItems?");
        }
        float f = i2 * 0.5f;
        float fK = k(i);
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            ShapeHolder shapeHolder = this.b.get(i3);
            float f2 = this.f;
            shapeHolder.resizeShape(f2 * 2.0f, f2 * 2.0f);
            shapeHolder.setY(f - this.f);
            shapeHolder.setX(((this.g + (this.f * 2.0f)) * i3) + fK);
        }
    }

    private void j() {
        this.a.addOnPageChangeListener(new a());
    }

    private float k(int i) {
        if (this.j == Gravity.LEFT) {
            return 0.0f;
        }
        float size = this.b.size();
        float f = this.f * 2.0f;
        float f2 = this.g;
        float f3 = (size * (f + f2)) - f2;
        float f4 = i;
        if (f4 < f3) {
            return 0.0f;
        }
        return this.j == Gravity.CENTER ? (f4 - f3) / 2.0f : f4 - f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i, float f) {
        if (getLoopVisbity()) {
            if (i == this.a.getAdapter().getCount() - 1) {
                i = 0;
            } else {
                i = i == 0 ? this.a.getAdapter().getCount() - 3 : i - 1;
            }
        }
        this.d = i;
        this.e = f;
        requestLayout();
        invalidate();
    }

    public boolean getLoopVisbity() {
        return this.r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        Iterator<ShapeHolder> it2 = this.b.iterator();
        while (it2.hasNext()) {
            e(canvas, it2.next());
        }
        ShapeHolder shapeHolder = this.c;
        if (shapeHolder != null) {
            e(canvas, shapeHolder);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i(getWidth(), getHeight());
        h(this.d, this.e);
    }

    public void setIndicatorBackground(int i) {
        this.h = i;
    }

    public void setIndicatorLayoutGravity(Gravity gravity) {
        this.j = gravity;
    }

    public void setIndicatorMargin(float f) {
        this.g = f;
    }

    public void setIndicatorMode(Mode mode) {
        this.k = mode;
    }

    public void setIndicatorRadius(float f) {
        this.f = f;
    }

    public void setIndicatorSelectedBackground(int i) {
        this.i = i;
    }

    public void setLoopVisibity(boolean z) {
        this.r = z;
    }

    public void setViewPager(ViewPager viewPager) {
        this.a = viewPager;
        d();
        c();
        j();
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 10;
        this.m = 40;
        this.n = -16776961;
        this.o = SupportMenu.CATEGORY_MASK;
        this.p = Gravity.CENTER.ordinal();
        this.q = Mode.SOLO.ordinal();
        g(context, attributeSet);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = 10;
        this.m = 40;
        this.n = -16776961;
        this.o = SupportMenu.CATEGORY_MASK;
        this.p = Gravity.CENTER.ordinal();
        this.q = Mode.SOLO.ordinal();
        g(context, attributeSet);
    }
}
