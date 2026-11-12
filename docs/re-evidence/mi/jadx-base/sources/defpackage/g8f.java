package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class g8f {
    public static final double u = Math.cos(Math.toRadians(45.0d));
    public static final Drawable v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f18718a;
    public final l8f c;
    public final l8f d;

    @Dimension
    public int e;

    @Dimension
    public int f;
    public int g;

    @Dimension
    public int h;
    public Drawable i;
    public Drawable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f18720k;
    public ColorStateList l;
    public r2m m;
    public ColorStateList n;
    public Drawable o;
    public LayerDrawable p;
    public l8f q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l8f f18721r;
    public boolean t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f18719b = new Rect();
    public boolean s = false;

    public class a extends InsetDrawable {
        public a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        v = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public g8f(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f18718a = materialCardView;
        l8f l8fVar = new l8f(materialCardView.getContext(), attributeSet, i, i2);
        this.c = l8fVar;
        l8fVar.Q(materialCardView.getContext());
        l8fVar.h0(-12303292);
        r2m.b bVarV = l8fVar.E().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, b4j.M0, i, k3j.f23392a);
        if (typedArrayObtainStyledAttributes.hasValue(b4j.N0)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(b4j.N0, 0.0f));
        }
        this.d = new l8f();
        V(bVarV.m());
        typedArrayObtainStyledAttributes.recycle();
    }

    public Rect A() {
        return this.f18719b;
    }

    public final Drawable B(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f18718a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(d());
            iCeil = (int) Math.ceil(c());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public boolean C() {
        return this.s;
    }

    public boolean D() {
        return this.t;
    }

    public final boolean E() {
        return (this.g & 80) == 80;
    }

    public final boolean F() {
        return (this.g & 8388613) == 8388613;
    }

    public void G(TypedArray typedArray) {
        ColorStateList colorStateListB = k8f.b(this.f18718a.getContext(), typedArray, b4j.U4);
        this.n = colorStateListB;
        if (colorStateListB == null) {
            this.n = ColorStateList.valueOf(-1);
        }
        this.h = typedArray.getDimensionPixelSize(b4j.V4, 0);
        boolean z = typedArray.getBoolean(b4j.M4, false);
        this.t = z;
        this.f18718a.setLongClickable(z);
        this.l = k8f.b(this.f18718a.getContext(), typedArray, b4j.S4);
        N(k8f.e(this.f18718a.getContext(), typedArray, b4j.O4));
        Q(typedArray.getDimensionPixelSize(b4j.R4, 0));
        P(typedArray.getDimensionPixelSize(b4j.Q4, 0));
        this.g = typedArray.getInteger(b4j.P4, 8388661);
        ColorStateList colorStateListB2 = k8f.b(this.f18718a.getContext(), typedArray, b4j.T4);
        this.f18720k = colorStateListB2;
        if (colorStateListB2 == null) {
            this.f18720k = ColorStateList.valueOf(i8f.d(this.f18718a, pii.n));
        }
        K(k8f.b(this.f18718a.getContext(), typedArray, b4j.N4));
        g0();
        d0();
        h0();
        this.f18718a.setBackgroundInternal(B(this.c));
        Drawable drawableR = this.f18718a.isClickable() ? r() : this.d;
        this.i = drawableR;
        this.f18718a.setForeground(B(drawableR));
    }

    public void H(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.p != null) {
            if (this.f18718a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(d() * 2.0f);
                iCeil2 = (int) Math.ceil(c() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = F() ? ((i - this.e) - this.f) - iCeil2 : this.e;
            int i6 = E() ? this.e : ((i2 - this.e) - this.f) - iCeil;
            int i7 = F() ? this.e : ((i - this.e) - this.f) - iCeil2;
            int i8 = E() ? ((i2 - this.e) - this.f) - iCeil : this.e;
            if (c.A(this.f18718a) == 1) {
                i4 = i7;
                i3 = i5;
            } else {
                i3 = i7;
                i4 = i5;
            }
            this.p.setLayerInset(2, i4, i8, i3, i6);
        }
    }

    public void I(boolean z) {
        this.s = z;
    }

    public void J(ColorStateList colorStateList) {
        this.c.b0(colorStateList);
    }

    public void K(ColorStateList colorStateList) {
        l8f l8fVar = this.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        l8fVar.b0(colorStateList);
    }

    public void L(boolean z) {
        this.t = z;
    }

    public void M(boolean z) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setAlpha(z ? 255 : 0);
        }
    }

    public void N(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = k47.r(drawable).mutate();
            this.j = drawableMutate;
            k47.o(drawableMutate, this.l);
            M(this.f18718a.isChecked());
        } else {
            this.j = v;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(iqi.M, this.j);
        }
    }

    public void O(int i) {
        this.g = i;
        H(this.f18718a.getMeasuredWidth(), this.f18718a.getMeasuredHeight());
    }

    public void P(@Dimension int i) {
        this.e = i;
    }

    public void Q(@Dimension int i) {
        this.f = i;
    }

    public void R(ColorStateList colorStateList) {
        this.l = colorStateList;
        Drawable drawable = this.j;
        if (drawable != null) {
            k47.o(drawable, colorStateList);
        }
    }

    public void S(float f) {
        V(this.m.w(f));
        this.i.invalidateSelf();
        if (a0() || Z()) {
            c0();
        }
        if (a0()) {
            f0();
        }
    }

    public void T(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.c.c0(f);
        l8f l8fVar = this.d;
        if (l8fVar != null) {
            l8fVar.c0(f);
        }
        l8f l8fVar2 = this.f18721r;
        if (l8fVar2 != null) {
            l8fVar2.c0(f);
        }
    }

    public void U(ColorStateList colorStateList) {
        this.f18720k = colorStateList;
        g0();
    }

    public void V(r2m r2mVar) {
        this.m = r2mVar;
        this.c.setShapeAppearanceModel(r2mVar);
        l8f l8fVar = this.c;
        l8fVar.g0(!l8fVar.T());
        l8f l8fVar2 = this.d;
        if (l8fVar2 != null) {
            l8fVar2.setShapeAppearanceModel(r2mVar);
        }
        l8f l8fVar3 = this.f18721r;
        if (l8fVar3 != null) {
            l8fVar3.setShapeAppearanceModel(r2mVar);
        }
        l8f l8fVar4 = this.q;
        if (l8fVar4 != null) {
            l8fVar4.setShapeAppearanceModel(r2mVar);
        }
    }

    public void W(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        h0();
    }

    public void X(@Dimension int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        h0();
    }

    public void Y(int i, int i2, int i3, int i4) {
        this.f18719b.set(i, i2, i3, i4);
        c0();
    }

    public final boolean Z() {
        return this.f18718a.getPreventCornerOverlap() && !e();
    }

    public final float a() {
        return Math.max(Math.max(b(this.m.q(), this.c.J()), b(this.m.s(), this.c.K())), Math.max(b(this.m.k(), this.c.t()), b(this.m.i(), this.c.s())));
    }

    public final boolean a0() {
        return this.f18718a.getPreventCornerOverlap() && e() && this.f18718a.getUseCompatPadding();
    }

    public final float b(tl4 tl4Var, float f) {
        if (tl4Var instanceof txk) {
            return (float) ((1.0d - u) * ((double) f));
        }
        if (tl4Var instanceof ef5) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public void b0() {
        Drawable drawable = this.i;
        Drawable drawableR = this.f18718a.isClickable() ? r() : this.d;
        this.i = drawableR;
        if (drawable != drawableR) {
            e0(drawableR);
        }
    }

    public final float c() {
        return this.f18718a.getMaxCardElevation() + (a0() ? a() : 0.0f);
    }

    public void c0() {
        int iA = (int) (((Z() || a0()) ? a() : 0.0f) - t());
        MaterialCardView materialCardView = this.f18718a;
        Rect rect = this.f18719b;
        materialCardView.l(rect.left + iA, rect.top + iA, rect.right + iA, rect.bottom + iA);
    }

    public final float d() {
        return (this.f18718a.getMaxCardElevation() * 1.5f) + (a0() ? a() : 0.0f);
    }

    public void d0() {
        this.c.a0(this.f18718a.getCardElevation());
    }

    public final boolean e() {
        return this.c.T();
    }

    public final void e0(Drawable drawable) {
        if (this.f18718a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f18718a.getForeground()).setDrawable(drawable);
        } else {
            this.f18718a.setForeground(B(drawable));
        }
    }

    public final Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        l8f l8fVarH = h();
        this.q = l8fVarH;
        l8fVarH.b0(this.f18720k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.q);
        return stateListDrawable;
    }

    public void f0() {
        if (!C()) {
            this.f18718a.setBackgroundInternal(B(this.c));
        }
        this.f18718a.setForeground(B(this.i));
    }

    public final Drawable g() {
        if (!auk.f3462a) {
            return f();
        }
        this.f18721r = h();
        return new RippleDrawable(this.f18720k, null, this.f18721r);
    }

    public final void g0() {
        Drawable drawable;
        if (auk.f3462a && (drawable = this.o) != null) {
            ((RippleDrawable) drawable).setColor(this.f18720k);
            return;
        }
        l8f l8fVar = this.q;
        if (l8fVar != null) {
            l8fVar.b0(this.f18720k);
        }
    }

    public final l8f h() {
        return new l8f(this.m);
    }

    public void h0() {
        this.d.k0(this.h, this.n);
    }

    @RequiresApi(api = 23)
    public void i() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public l8f j() {
        return this.c;
    }

    public ColorStateList k() {
        return this.c.x();
    }

    public ColorStateList l() {
        return this.d.x();
    }

    public Drawable m() {
        return this.j;
    }

    public int n() {
        return this.g;
    }

    @Dimension
    public int o() {
        return this.e;
    }

    @Dimension
    public int p() {
        return this.f;
    }

    public ColorStateList q() {
        return this.l;
    }

    public final Drawable r() {
        if (this.o == null) {
            this.o = g();
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, iqi.M);
        }
        return this.p;
    }

    public float s() {
        return this.c.J();
    }

    public final float t() {
        if (this.f18718a.getPreventCornerOverlap() && this.f18718a.getUseCompatPadding()) {
            return (float) ((1.0d - u) * ((double) this.f18718a.getCardViewRadius()));
        }
        return 0.0f;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float u() {
        return this.c.y();
    }

    public ColorStateList v() {
        return this.f18720k;
    }

    public r2m w() {
        return this.m;
    }

    public int x() {
        ColorStateList colorStateList = this.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList y() {
        return this.n;
    }

    @Dimension
    public int z() {
        return this.h;
    }
}
