package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.dii;
import defpackage.fji;
import defpackage.j4j;
import defpackage.t2j;
import defpackage.ur3;
import defpackage.vr3;
import defpackage.wr3;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] h = {R.attr.colorBackground};
    public static final wr3 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1865b;
    public int c;
    public int d;
    public final Rect e;
    public final Rect f;
    public final vr3 g;

    public class a implements vr3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f1866a;

        public a() {
        }

        @Override // defpackage.vr3
        public void a(int i, int i2, int i3, int i4) {
            CardView.this.f.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.e;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // defpackage.vr3
        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // defpackage.vr3
        public void c(Drawable drawable) {
            this.f1866a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // defpackage.vr3
        public Drawable d() {
            return this.f1866a;
        }

        @Override // defpackage.vr3
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // defpackage.vr3
        public View f() {
            return CardView.this;
        }
    }

    static {
        ur3 ur3Var = new ur3();
        i = ur3Var;
        ur3Var.o();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public void g(int i2, int i3, int i4, int i5) {
        this.e.set(i2, i3, i4, i5);
        i.g(this.g);
    }

    public ColorStateList getCardBackgroundColor() {
        return i.l(this.g);
    }

    public float getCardElevation() {
        return i.b(this.g);
    }

    public int getContentPaddingBottom() {
        return this.e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.e.left;
    }

    public int getContentPaddingRight() {
        return this.e.right;
    }

    public int getContentPaddingTop() {
        return this.e.top;
    }

    public float getMaxCardElevation() {
        return i.n(this.g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1865b;
    }

    public float getRadius() {
        return i.k(this.g);
    }

    public boolean getUseCompatPadding() {
        return this.f1864a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        wr3 wr3Var = i;
        if (wr3Var instanceof ur3) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(wr3Var.e(this.g)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(wr3Var.h(this.g)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        i.j(this.g, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f) {
        i.m(this.g, f);
    }

    public void setMaxCardElevation(float f) {
        i.c(this.g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.d = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.c = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1865b) {
            this.f1865b = z;
            i.a(this.g);
        }
    }

    public void setRadius(float f) {
        i.d(this.g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1864a != z) {
            this.f1864a = z;
            i.f(this.g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dii.f15566a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        i.j(this.g, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i2);
        Rect rect = new Rect();
        this.e = rect;
        this.f = new Rect();
        a aVar = new a();
        this.g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j4j.f22411a, i2, t2j.f34239a);
        if (typedArrayObtainStyledAttributes.hasValue(j4j.d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(j4j.d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(h);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(fji.f17849b);
            } else {
                color = getResources().getColor(fji.f17848a);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(j4j.e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(j4j.f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(j4j.g, 0.0f);
        this.f1864a = typedArrayObtainStyledAttributes.getBoolean(j4j.i, false);
        this.f1865b = typedArrayObtainStyledAttributes.getBoolean(j4j.h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4j.j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4j.l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4j.n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4j.m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4j.f22413k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4j.f22412b, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4j.c, 0);
        typedArrayObtainStyledAttributes.recycle();
        i.i(aVar, context, colorStateList, dimension, dimension2, f);
    }
}
