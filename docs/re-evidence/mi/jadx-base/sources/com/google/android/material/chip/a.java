package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.auk;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.i8f;
import defpackage.j7p;
import defpackage.k47;
import defpackage.k8f;
import defpackage.l8f;
import defpackage.of1;
import defpackage.ti2;
import defpackage.u7p;
import defpackage.u8g;
import defpackage.yi3;
import defpackage.z44;
import defpackage.z47;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class a extends l8f implements Drawable.Callback, u7p.b {
    public static final int[] I0 = {R.attr.state_enabled};
    public static final ShapeDrawable J0 = new ShapeDrawable(new OvalShape());
    public float A;
    public int[] A0;
    public float B;
    public boolean B0;
    public ColorStateList C;
    public ColorStateList C0;
    public float D;
    public WeakReference<InterfaceC0213a> D0;
    public ColorStateList E;
    public TextUtils.TruncateAt E0;
    public CharSequence F;
    public boolean F0;
    public boolean G;
    public int G0;
    public Drawable H;
    public boolean H0;
    public ColorStateList I;
    public float J;
    public boolean K;
    public boolean L;
    public Drawable M;
    public Drawable N;
    public ColorStateList O;
    public float P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public u8g V;
    public u8g W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public final Context f0;
    public final Paint g0;
    public final Paint h0;
    public final Paint.FontMetrics i0;
    public final RectF j0;
    public final PointF k0;
    public final Path l0;
    public final u7p m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public int u0;
    public int v0;
    public ColorFilter w0;
    public PorterDuffColorFilter x0;
    public ColorStateList y;
    public ColorStateList y0;
    public ColorStateList z;
    public PorterDuff.Mode z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0213a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.B = -1.0f;
        this.g0 = new Paint(1);
        this.i0 = new Paint.FontMetrics();
        this.j0 = new RectF();
        this.k0 = new PointF();
        this.l0 = new Path();
        this.v0 = 255;
        this.z0 = PorterDuff.Mode.SRC_IN;
        this.D0 = new WeakReference<>(null);
        Q(context);
        this.f0 = context;
        u7p u7pVar = new u7p(this);
        this.m0 = u7pVar;
        this.F = "";
        u7pVar.e().density = context.getResources().getDisplayMetrics().density;
        this.h0 = null;
        int[] iArr = I0;
        setState(iArr);
        r2(iArr);
        this.F0 = true;
        if (auk.f3462a) {
            J0.setTint(-1);
        }
    }

    public static a B0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.A1(attributeSet, i, i2);
        return aVar;
    }

    public static boolean t1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean x1(j7p j7pVar) {
        return (j7pVar == null || j7pVar.i() == null || !j7pVar.i().isStateful()) ? false : true;
    }

    public static boolean y1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean z1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final boolean A0() {
        return this.S && this.T != null && this.R;
    }

    public final void A1(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayH = c9p.h(this.f0, attributeSet, b4j.O0, i, i2, new int[0]);
        this.H0 = typedArrayH.hasValue(b4j.z1);
        h2(k8f.b(this.f0, typedArrayH, b4j.m1));
        L1(k8f.b(this.f0, typedArrayH, b4j.Z0));
        Z1(typedArrayH.getDimension(b4j.h1, 0.0f));
        if (typedArrayH.hasValue(b4j.a1)) {
            N1(typedArrayH.getDimension(b4j.a1, 0.0f));
        }
        d2(k8f.b(this.f0, typedArrayH, b4j.k1));
        f2(typedArrayH.getDimension(b4j.l1, 0.0f));
        E2(k8f.b(this.f0, typedArrayH, b4j.y1));
        J2(typedArrayH.getText(b4j.T0));
        j7p j7pVarG = k8f.g(this.f0, typedArrayH, b4j.P0);
        j7pVarG.l(typedArrayH.getDimension(b4j.Q0, j7pVarG.j()));
        K2(j7pVarG);
        int i3 = typedArrayH.getInt(b4j.R0, 0);
        if (i3 == 1) {
            w2(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            w2(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            w2(TextUtils.TruncateAt.END);
        }
        Y1(typedArrayH.getBoolean(b4j.g1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            Y1(typedArrayH.getBoolean(b4j.d1, false));
        }
        R1(k8f.e(this.f0, typedArrayH, b4j.c1));
        if (typedArrayH.hasValue(b4j.f1)) {
            V1(k8f.b(this.f0, typedArrayH, b4j.f1));
        }
        T1(typedArrayH.getDimension(b4j.e1, -1.0f));
        u2(typedArrayH.getBoolean(b4j.t1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            u2(typedArrayH.getBoolean(b4j.o1, false));
        }
        i2(k8f.e(this.f0, typedArrayH, b4j.n1));
        s2(k8f.b(this.f0, typedArrayH, b4j.s1));
        n2(typedArrayH.getDimension(b4j.q1, 0.0f));
        D1(typedArrayH.getBoolean(b4j.U0, false));
        K1(typedArrayH.getBoolean(b4j.Y0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            K1(typedArrayH.getBoolean(b4j.W0, false));
        }
        F1(k8f.e(this.f0, typedArrayH, b4j.V0));
        if (typedArrayH.hasValue(b4j.X0)) {
            H1(k8f.b(this.f0, typedArrayH, b4j.X0));
        }
        H2(u8g.c(this.f0, typedArrayH, b4j.A1));
        x2(u8g.c(this.f0, typedArrayH, b4j.v1));
        b2(typedArrayH.getDimension(b4j.j1, 0.0f));
        B2(typedArrayH.getDimension(b4j.x1, 0.0f));
        z2(typedArrayH.getDimension(b4j.w1, 0.0f));
        O2(typedArrayH.getDimension(b4j.C1, 0.0f));
        M2(typedArrayH.getDimension(b4j.B1, 0.0f));
        p2(typedArrayH.getDimension(b4j.r1, 0.0f));
        k2(typedArrayH.getDimension(b4j.p1, 0.0f));
        P1(typedArrayH.getDimension(b4j.b1, 0.0f));
        D2(typedArrayH.getDimensionPixelSize(b4j.S0, Integer.MAX_VALUE));
        typedArrayH.recycle();
    }

    public void A2(int i) {
        z2(this.f0.getResources().getDimension(i));
    }

    public void B1() {
        InterfaceC0213a interfaceC0213a = this.D0.get();
        if (interfaceC0213a != null) {
            interfaceC0213a.a();
        }
    }

    public void B2(float f) {
        if (this.Y != f) {
            float fS0 = s0();
            this.Y = f;
            float fS1 = s0();
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public final void C0(Canvas canvas, Rect rect) {
        if (S2()) {
            r0(rect, this.j0);
            RectF rectF = this.j0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.T.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            this.T.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public final boolean C1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.y;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.n0) : 0);
        boolean state = true;
        if (this.n0 != iL) {
            this.n0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.z;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.o0) : 0);
        if (this.o0 != iL2) {
            this.o0 = iL2;
            zOnStateChange = true;
        }
        int iG = i8f.g(iL, iL2);
        if ((this.p0 != iG) | (x() == null)) {
            this.p0 = iG;
            b0(ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.C;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.q0) : 0;
        if (this.q0 != colorForState) {
            this.q0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.C0 == null || !auk.e(iArr)) ? 0 : this.C0.getColorForState(iArr, this.r0);
        if (this.r0 != colorForState2) {
            this.r0 = colorForState2;
            if (this.B0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.m0.d() == null || this.m0.d().i() == null) ? 0 : this.m0.d().i().getColorForState(iArr, this.s0);
        if (this.s0 != colorForState3) {
            this.s0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z2 = t1(getState(), R.attr.state_checked) && this.R;
        if (this.t0 == z2 || this.T == null) {
            z = false;
        } else {
            float fS0 = s0();
            this.t0 = z2;
            if (fS0 != s0()) {
                zOnStateChange = true;
                z = true;
            } else {
                z = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.y0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.u0) : 0;
        if (this.u0 != colorForState4) {
            this.u0 = colorForState4;
            this.x0 = z47.c(this, this.y0, this.z0);
        } else {
            state = zOnStateChange;
        }
        if (z1(this.H)) {
            state |= this.H.setState(iArr);
        }
        if (z1(this.T)) {
            state |= this.T.setState(iArr);
        }
        if (z1(this.M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.M.setState(iArr3);
        }
        if (auk.f3462a && z1(this.N)) {
            state |= this.N.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            B1();
        }
        return state;
    }

    public void C2(int i) {
        B2(this.f0.getResources().getDimension(i));
    }

    public final void D0(Canvas canvas, Rect rect) {
        if (this.H0) {
            return;
        }
        this.g0.setColor(this.o0);
        this.g0.setStyle(Paint.Style.FILL);
        this.g0.setColorFilter(r1());
        this.j0.set(rect);
        canvas.drawRoundRect(this.j0, O0(), O0(), this.g0);
    }

    public void D1(boolean z) {
        if (this.R != z) {
            this.R = z;
            float fS0 = s0();
            if (!z && this.t0) {
                this.t0 = false;
            }
            float fS1 = s0();
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public void D2(int i) {
        this.G0 = i;
    }

    public final void E0(Canvas canvas, Rect rect) {
        if (T2()) {
            r0(rect, this.j0);
            RectF rectF = this.j0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.H.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            this.H.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void E1(int i) {
        D1(this.f0.getResources().getBoolean(i));
    }

    public void E2(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            W2();
            onStateChange(getState());
        }
    }

    public final void F0(Canvas canvas, Rect rect) {
        if (this.D <= 0.0f || this.H0) {
            return;
        }
        this.g0.setColor(this.q0);
        this.g0.setStyle(Paint.Style.STROKE);
        if (!this.H0) {
            this.g0.setColorFilter(r1());
        }
        RectF rectF = this.j0;
        float f = rect.left;
        float f2 = this.D;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.B - (this.D / 2.0f);
        canvas.drawRoundRect(this.j0, f3, f3, this.g0);
    }

    public void F1(Drawable drawable) {
        if (this.T != drawable) {
            float fS0 = s0();
            this.T = drawable;
            float fS1 = s0();
            V2(this.T);
            q0(this.T);
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public void F2(int i) {
        E2(of1.a(this.f0, i));
    }

    public final void G0(Canvas canvas, Rect rect) {
        if (this.H0) {
            return;
        }
        this.g0.setColor(this.n0);
        this.g0.setStyle(Paint.Style.FILL);
        this.j0.set(rect);
        canvas.drawRoundRect(this.j0, O0(), O0(), this.g0);
    }

    public void G1(int i) {
        F1(of1.b(this.f0, i));
    }

    public void G2(boolean z) {
        this.F0 = z;
    }

    public final void H0(Canvas canvas, Rect rect) {
        if (U2()) {
            u0(rect, this.j0);
            RectF rectF = this.j0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.M.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            if (auk.f3462a) {
                this.N.setBounds(this.M.getBounds());
                this.N.jumpToCurrentState();
                this.N.draw(canvas);
            } else {
                this.M.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    public void H1(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (A0()) {
                k47.o(this.T, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void H2(u8g u8gVar) {
        this.V = u8gVar;
    }

    public final void I0(Canvas canvas, Rect rect) {
        this.g0.setColor(this.r0);
        this.g0.setStyle(Paint.Style.FILL);
        this.j0.set(rect);
        if (!this.H0) {
            canvas.drawRoundRect(this.j0, O0(), O0(), this.g0);
        } else {
            h(new RectF(rect), this.l0);
            super.q(canvas, this.g0, this.l0, u());
        }
    }

    public void I1(int i) {
        H1(of1.a(this.f0, i));
    }

    public void I2(int i) {
        H2(u8g.d(this.f0, i));
    }

    public final void J0(Canvas canvas, Rect rect) {
        Paint paint = this.h0;
        if (paint != null) {
            paint.setColor(z44.p(-16777216, 127));
            canvas.drawRect(rect, this.h0);
            if (T2() || S2()) {
                r0(rect, this.j0);
                canvas.drawRect(this.j0, this.h0);
            }
            if (this.F != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.h0);
            }
            if (U2()) {
                u0(rect, this.j0);
                canvas.drawRect(this.j0, this.h0);
            }
            this.h0.setColor(z44.p(MenuBuilder.CATEGORY_MASK, 127));
            t0(rect, this.j0);
            canvas.drawRect(this.j0, this.h0);
            this.h0.setColor(z44.p(-16711936, 127));
            v0(rect, this.j0);
            canvas.drawRect(this.j0, this.h0);
        }
    }

    public void J1(int i) {
        K1(this.f0.getResources().getBoolean(i));
    }

    public void J2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.F, charSequence)) {
            return;
        }
        this.F = charSequence;
        this.m0.i(true);
        invalidateSelf();
        B1();
    }

    public final void K0(Canvas canvas, Rect rect) {
        if (this.F != null) {
            Paint.Align alignZ0 = z0(rect, this.k0);
            x0(rect, this.j0);
            if (this.m0.d() != null) {
                this.m0.e().drawableState = getState();
                this.m0.j(this.f0);
            }
            this.m0.e().setTextAlign(alignZ0);
            int iSave = 0;
            boolean z = Math.round(this.m0.f(n1().toString())) > Math.round(this.j0.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.j0);
            }
            CharSequence charSequenceEllipsize = this.F;
            if (z && this.E0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.m0.e(), this.j0.width(), this.E0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.k0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.m0.e());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void K1(boolean z) {
        if (this.S != z) {
            boolean zS2 = S2();
            this.S = z;
            boolean zS3 = S2();
            if (zS2 != zS3) {
                if (zS3) {
                    q0(this.T);
                } else {
                    V2(this.T);
                }
                invalidateSelf();
                B1();
            }
        }
    }

    public void K2(j7p j7pVar) {
        this.m0.h(j7pVar, this.f0);
    }

    public Drawable L0() {
        return this.T;
    }

    public void L1(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            onStateChange(getState());
        }
    }

    public void L2(int i) {
        K2(new j7p(this.f0, i));
    }

    public ColorStateList M0() {
        return this.U;
    }

    public void M1(int i) {
        L1(of1.a(this.f0, i));
    }

    public void M2(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            B1();
        }
    }

    public ColorStateList N0() {
        return this.z;
    }

    @Deprecated
    public void N1(float f) {
        if (this.B != f) {
            this.B = f;
            setShapeAppearanceModel(E().w(f));
        }
    }

    public void N2(int i) {
        M2(this.f0.getResources().getDimension(i));
    }

    public float O0() {
        return this.H0 ? J() : this.B;
    }

    @Deprecated
    public void O1(int i) {
        N1(this.f0.getResources().getDimension(i));
    }

    public void O2(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidateSelf();
            B1();
        }
    }

    public float P0() {
        return this.e0;
    }

    public void P1(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            B1();
        }
    }

    public void P2(int i) {
        O2(this.f0.getResources().getDimension(i));
    }

    public Drawable Q0() {
        Drawable drawable = this.H;
        if (drawable != null) {
            return k47.q(drawable);
        }
        return null;
    }

    public void Q1(int i) {
        P1(this.f0.getResources().getDimension(i));
    }

    public void Q2(boolean z) {
        if (this.B0 != z) {
            this.B0 = z;
            W2();
            onStateChange(getState());
        }
    }

    public float R0() {
        return this.J;
    }

    public void R1(Drawable drawable) {
        Drawable drawableQ0 = Q0();
        if (drawableQ0 != drawable) {
            float fS0 = s0();
            this.H = drawable != null ? k47.r(drawable).mutate() : null;
            float fS1 = s0();
            V2(drawableQ0);
            if (T2()) {
                q0(this.H);
            }
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public boolean R2() {
        return this.F0;
    }

    public ColorStateList S0() {
        return this.I;
    }

    public void S1(int i) {
        R1(of1.b(this.f0, i));
    }

    public final boolean S2() {
        return this.S && this.T != null && this.t0;
    }

    public float T0() {
        return this.A;
    }

    public void T1(float f) {
        if (this.J != f) {
            float fS0 = s0();
            this.J = f;
            float fS1 = s0();
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public final boolean T2() {
        return this.G && this.H != null;
    }

    public float U0() {
        return this.X;
    }

    public void U1(int i) {
        T1(this.f0.getResources().getDimension(i));
    }

    public final boolean U2() {
        return this.L && this.M != null;
    }

    public ColorStateList V0() {
        return this.C;
    }

    public void V1(ColorStateList colorStateList) {
        this.K = true;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (T2()) {
                k47.o(this.H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void V2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public float W0() {
        return this.D;
    }

    public void W1(int i) {
        V1(of1.a(this.f0, i));
    }

    public final void W2() {
        this.C0 = this.B0 ? auk.d(this.E) : null;
    }

    public Drawable X0() {
        Drawable drawable = this.M;
        if (drawable != null) {
            return k47.q(drawable);
        }
        return null;
    }

    public void X1(int i) {
        Y1(this.f0.getResources().getBoolean(i));
    }

    @TargetApi(21)
    public final void X2() {
        this.N = new RippleDrawable(auk.d(l1()), this.M, J0);
    }

    public CharSequence Y0() {
        return this.Q;
    }

    public void Y1(boolean z) {
        if (this.G != z) {
            boolean zT2 = T2();
            this.G = z;
            boolean zT3 = T2();
            if (zT2 != zT3) {
                if (zT3) {
                    q0(this.H);
                } else {
                    V2(this.H);
                }
                invalidateSelf();
                B1();
            }
        }
    }

    public float Z0() {
        return this.d0;
    }

    public void Z1(float f) {
        if (this.A != f) {
            this.A = f;
            invalidateSelf();
            B1();
        }
    }

    @Override // u7p.b
    public void a() {
        B1();
        invalidateSelf();
    }

    public float a1() {
        return this.P;
    }

    public void a2(int i) {
        Z1(this.f0.getResources().getDimension(i));
    }

    public float b1() {
        return this.c0;
    }

    public void b2(float f) {
        if (this.X != f) {
            this.X = f;
            invalidateSelf();
            B1();
        }
    }

    public int[] c1() {
        return this.A0;
    }

    public void c2(int i) {
        b2(this.f0.getResources().getDimension(i));
    }

    public ColorStateList d1() {
        return this.O;
    }

    public void d2(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.H0) {
                l0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.v0;
        int iA = i < 255 ? yi3.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        G0(canvas, bounds);
        D0(canvas, bounds);
        if (this.H0) {
            super.draw(canvas);
        }
        F0(canvas, bounds);
        I0(canvas, bounds);
        E0(canvas, bounds);
        C0(canvas, bounds);
        if (this.F0) {
            K0(canvas, bounds);
        }
        H0(canvas, bounds);
        J0(canvas, bounds);
        if (this.v0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public void e1(RectF rectF) {
        v0(getBounds(), rectF);
    }

    public void e2(int i) {
        d2(of1.a(this.f0, i));
    }

    public final float f1() {
        Drawable drawable = this.t0 ? this.T : this.H;
        float fCeil = this.J;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(ayq.d(this.f0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public void f2(float f) {
        if (this.D != f) {
            this.D = f;
            this.g0.setStrokeWidth(f);
            if (this.H0) {
                super.m0(f);
            }
            invalidateSelf();
        }
    }

    public final float g1() {
        Drawable drawable = this.t0 ? this.T : this.H;
        float f = this.J;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void g2(int i) {
        f2(this.f0.getResources().getDimension(i));
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.v0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.X + s0() + this.a0 + this.m0.f(n1().toString()) + this.b0 + w0() + this.e0), this.G0);
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.B);
        } else {
            outline.setRoundRect(bounds, this.B);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public TextUtils.TruncateAt h1() {
        return this.E0;
    }

    public final void h2(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            onStateChange(getState());
        }
    }

    public u8g i1() {
        return this.W;
    }

    public void i2(Drawable drawable) {
        Drawable drawableX0 = X0();
        if (drawableX0 != drawable) {
            float fW0 = w0();
            this.M = drawable != null ? k47.r(drawable).mutate() : null;
            if (auk.f3462a) {
                X2();
            }
            float fW1 = w0();
            V2(drawableX0);
            if (U2()) {
                q0(this.M);
            }
            invalidateSelf();
            if (fW0 != fW1) {
                B1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return y1(this.y) || y1(this.z) || y1(this.C) || (this.B0 && y1(this.C0)) || x1(this.m0.d()) || A0() || z1(this.H) || z1(this.T) || y1(this.y0);
    }

    public float j1() {
        return this.Z;
    }

    public void j2(CharSequence charSequence) {
        if (this.Q != charSequence) {
            this.Q = ti2.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float k1() {
        return this.Y;
    }

    public void k2(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (U2()) {
                B1();
            }
        }
    }

    public ColorStateList l1() {
        return this.E;
    }

    public void l2(int i) {
        k2(this.f0.getResources().getDimension(i));
    }

    public u8g m1() {
        return this.V;
    }

    public void m2(int i) {
        i2(of1.b(this.f0, i));
    }

    public CharSequence n1() {
        return this.F;
    }

    public void n2(float f) {
        if (this.P != f) {
            this.P = f;
            invalidateSelf();
            if (U2()) {
                B1();
            }
        }
    }

    public j7p o1() {
        return this.m0.d();
    }

    public void o2(int i) {
        n2(this.f0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (T2()) {
            zOnLayoutDirectionChanged |= k47.m(this.H, i);
        }
        if (S2()) {
            zOnLayoutDirectionChanged |= k47.m(this.T, i);
        }
        if (U2()) {
            zOnLayoutDirectionChanged |= k47.m(this.M, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (T2()) {
            zOnLevelChange |= this.H.setLevel(i);
        }
        if (S2()) {
            zOnLevelChange |= this.T.setLevel(i);
        }
        if (U2()) {
            zOnLevelChange |= this.M.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable, u7p.b
    public boolean onStateChange(int[] iArr) {
        if (this.H0) {
            super.onStateChange(iArr);
        }
        return C1(iArr, c1());
    }

    public float p1() {
        return this.b0;
    }

    public void p2(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            if (U2()) {
                B1();
            }
        }
    }

    public final void q0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        k47.m(drawable, k47.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.M) {
            if (drawable.isStateful()) {
                drawable.setState(c1());
            }
            k47.o(drawable, this.O);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.K) {
            k47.o(drawable2, this.I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float q1() {
        return this.a0;
    }

    public void q2(int i) {
        p2(this.f0.getResources().getDimension(i));
    }

    public final void r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T2() || S2()) {
            float f = this.X + this.Y;
            float fG1 = g1();
            if (k47.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + fG1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - fG1;
            }
            float fF1 = f1();
            float fExactCenterY = rect.exactCenterY() - (fF1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fF1;
        }
    }

    public final ColorFilter r1() {
        ColorFilter colorFilter = this.w0;
        return colorFilter != null ? colorFilter : this.x0;
    }

    public boolean r2(int[] iArr) {
        if (Arrays.equals(this.A0, iArr)) {
            return false;
        }
        this.A0 = iArr;
        if (U2()) {
            return C1(getState(), iArr);
        }
        return false;
    }

    public float s0() {
        if (T2() || S2()) {
            return this.Y + g1() + this.Z;
        }
        return 0.0f;
    }

    public boolean s1() {
        return this.B0;
    }

    public void s2(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (U2()) {
                k47.o(this.M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.w0 != colorFilter) {
            this.w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.z0 != mode) {
            this.z0 = mode;
            this.x0 = z47.c(this, this.y0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (T2()) {
            visible |= this.H.setVisible(z, z2);
        }
        if (S2()) {
            visible |= this.T.setVisible(z, z2);
        }
        if (U2()) {
            visible |= this.M.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (U2()) {
            float f = this.e0 + this.d0 + this.P + this.c0 + this.b0;
            if (k47.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public void t2(int i) {
        s2(of1.a(this.f0, i));
    }

    public final void u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (U2()) {
            float f = this.e0 + this.d0;
            if (k47.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.P;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.P;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.P;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public boolean u1() {
        return this.R;
    }

    public void u2(boolean z) {
        if (this.L != z) {
            boolean zU2 = U2();
            this.L = z;
            boolean zU3 = U2();
            if (zU2 != zU3) {
                if (zU3) {
                    q0(this.M);
                } else {
                    V2(this.M);
                }
                invalidateSelf();
                B1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (U2()) {
            float f = this.e0 + this.d0 + this.P + this.c0 + this.b0;
            if (k47.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean v1() {
        return z1(this.M);
    }

    public void v2(InterfaceC0213a interfaceC0213a) {
        this.D0 = new WeakReference<>(interfaceC0213a);
    }

    public float w0() {
        if (U2()) {
            return this.c0 + this.P + this.d0;
        }
        return 0.0f;
    }

    public boolean w1() {
        return this.L;
    }

    public void w2(TextUtils.TruncateAt truncateAt) {
        this.E0 = truncateAt;
    }

    public final void x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.F != null) {
            float fS0 = this.X + s0() + this.a0;
            float fW0 = this.e0 + w0() + this.b0;
            if (k47.f(this) == 0) {
                rectF.left = rect.left + fS0;
                rectF.right = rect.right - fW0;
            } else {
                rectF.left = rect.left + fW0;
                rectF.right = rect.right - fS0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void x2(u8g u8gVar) {
        this.W = u8gVar;
    }

    public final float y0() {
        this.m0.e().getFontMetrics(this.i0);
        Paint.FontMetrics fontMetrics = this.i0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void y2(int i) {
        x2(u8g.d(this.f0, i));
    }

    public Paint.Align z0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.F != null) {
            float fS0 = this.X + s0() + this.a0;
            if (k47.f(this) == 0) {
                pointF.x = rect.left + fS0;
            } else {
                pointF.x = rect.right - fS0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - y0();
        }
        return align;
    }

    public void z2(float f) {
        if (this.Z != f) {
            float fS0 = s0();
            this.Z = f;
            float fS1 = s0();
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }
}
