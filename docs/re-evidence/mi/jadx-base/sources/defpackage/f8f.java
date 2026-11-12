package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class f8f {

    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean t = true;
    public static final boolean u = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f17523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r2m f17524b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f17525k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LayerDrawable f17526r;
    public int s;

    public f8f(MaterialButton materialButton, r2m r2mVar) {
        this.f17523a = materialButton;
        this.f17524b = r2mVar;
    }

    public void A(ColorStateList colorStateList) {
        if (this.f17525k != colorStateList) {
            this.f17525k = colorStateList;
            H();
        }
    }

    public void B(int i) {
        if (this.h != i) {
            this.h = i;
            H();
        }
    }

    public void C(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (f() != null) {
                k47.o(f(), this.j);
            }
        }
    }

    public void D(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (f() == null || this.i == null) {
                return;
            }
            k47.p(f(), this.i);
        }
    }

    public final void E(@Dimension int i, @Dimension int i2) {
        int iF = c.F(this.f17523a);
        int paddingTop = this.f17523a.getPaddingTop();
        int iE = c.E(this.f17523a);
        int paddingBottom = this.f17523a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            F();
        }
        c.J0(this.f17523a, iF, (paddingTop + i) - i3, iE, (paddingBottom + i2) - i4);
    }

    public final void F() {
        this.f17523a.setInternalBackground(a());
        l8f l8fVarF = f();
        if (l8fVarF != null) {
            l8fVarF.a0(this.s);
        }
    }

    public final void G(r2m r2mVar) {
        if (u && !this.o) {
            int iF = c.F(this.f17523a);
            int paddingTop = this.f17523a.getPaddingTop();
            int iE = c.E(this.f17523a);
            int paddingBottom = this.f17523a.getPaddingBottom();
            F();
            c.J0(this.f17523a, iF, paddingTop, iE, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(r2mVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(r2mVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(r2mVar);
        }
    }

    public final void H() {
        l8f l8fVarF = f();
        l8f l8fVarN = n();
        if (l8fVarF != null) {
            l8fVarF.k0(this.h, this.f17525k);
            if (l8fVarN != null) {
                l8fVarN.j0(this.h, this.n ? i8f.d(this.f17523a, pii.s) : 0);
            }
        }
    }

    public final InsetDrawable I(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    public final Drawable a() {
        l8f l8fVar = new l8f(this.f17524b);
        l8fVar.Q(this.f17523a.getContext());
        k47.o(l8fVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            k47.p(l8fVar, mode);
        }
        l8fVar.k0(this.h, this.f17525k);
        l8f l8fVar2 = new l8f(this.f17524b);
        l8fVar2.setTint(0);
        l8fVar2.j0(this.h, this.n ? i8f.d(this.f17523a, pii.s) : 0);
        if (t) {
            l8f l8fVar3 = new l8f(this.f17524b);
            this.m = l8fVar3;
            k47.n(l8fVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(auk.d(this.l), I(new LayerDrawable(new Drawable[]{l8fVar2, l8fVar})), this.m);
            this.f17526r = rippleDrawable;
            return rippleDrawable;
        }
        ztk ztkVar = new ztk(this.f17524b);
        this.m = ztkVar;
        k47.o(ztkVar, auk.d(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{l8fVar2, l8fVar, this.m});
        this.f17526r = layerDrawable;
        return I(layerDrawable);
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public i3m e() {
        LayerDrawable layerDrawable = this.f17526r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f17526r.getNumberOfLayers() > 2 ? (i3m) this.f17526r.getDrawable(2) : (i3m) this.f17526r.getDrawable(1);
    }

    public l8f f() {
        return g(false);
    }

    public final l8f g(boolean z) {
        LayerDrawable layerDrawable = this.f17526r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return t ? (l8f) ((LayerDrawable) ((InsetDrawable) this.f17526r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (l8f) this.f17526r.getDrawable(!z ? 1 : 0);
    }

    public ColorStateList h() {
        return this.l;
    }

    public r2m i() {
        return this.f17524b;
    }

    public ColorStateList j() {
        return this.f17525k;
    }

    public int k() {
        return this.h;
    }

    public ColorStateList l() {
        return this.j;
    }

    public PorterDuff.Mode m() {
        return this.i;
    }

    public final l8f n() {
        return g(true);
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.q;
    }

    public void q(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(b4j.V3, 0);
        this.d = typedArray.getDimensionPixelOffset(b4j.W3, 0);
        this.e = typedArray.getDimensionPixelOffset(b4j.X3, 0);
        this.f = typedArray.getDimensionPixelOffset(b4j.Y3, 0);
        if (typedArray.hasValue(b4j.c4)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(b4j.c4, -1);
            this.g = dimensionPixelSize;
            y(this.f17524b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(b4j.m4, 0);
        this.i = ayq.k(typedArray.getInt(b4j.b4, -1), PorterDuff.Mode.SRC_IN);
        this.j = k8f.b(this.f17523a.getContext(), typedArray, b4j.a4);
        this.f17525k = k8f.b(this.f17523a.getContext(), typedArray, b4j.l4);
        this.l = k8f.b(this.f17523a.getContext(), typedArray, b4j.k4);
        this.q = typedArray.getBoolean(b4j.Z3, false);
        this.s = typedArray.getDimensionPixelSize(b4j.d4, 0);
        int iF = c.F(this.f17523a);
        int paddingTop = this.f17523a.getPaddingTop();
        int iE = c.E(this.f17523a);
        int paddingBottom = this.f17523a.getPaddingBottom();
        if (typedArray.hasValue(b4j.U3)) {
            s();
        } else {
            F();
        }
        c.J0(this.f17523a, iF + this.c, paddingTop + this.e, iE + this.d, paddingBottom + this.f);
    }

    public void r(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    public void s() {
        this.o = true;
        this.f17523a.setSupportBackgroundTintList(this.j);
        this.f17523a.setSupportBackgroundTintMode(this.i);
    }

    public void t(boolean z) {
        this.q = z;
    }

    public void u(int i) {
        if (this.p && this.g == i) {
            return;
        }
        this.g = i;
        this.p = true;
        y(this.f17524b.w(i));
    }

    public void v(@Dimension int i) {
        E(this.e, i);
    }

    public void w(@Dimension int i) {
        E(i, this.f);
    }

    public void x(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = t;
            if (z && (this.f17523a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f17523a.getBackground()).setColor(auk.d(colorStateList));
            } else {
                if (z || !(this.f17523a.getBackground() instanceof ztk)) {
                    return;
                }
                ((ztk) this.f17523a.getBackground()).setTintList(auk.d(colorStateList));
            }
        }
    }

    public void y(r2m r2mVar) {
        this.f17524b = r2mVar;
        G(r2mVar);
    }

    public void z(boolean z) {
        this.n = z;
        H();
    }
}
