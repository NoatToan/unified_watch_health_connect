package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;
import com.mi.fitness.checkupdate.util.Constants;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b44 {
    public static final boolean t0 = false;
    public static final Paint u0 = null;
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public Typeface D;
    public oi3 E;
    public oi3 F;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public boolean K;
    public Bitmap L;
    public Paint M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public int[] T;
    public boolean U;
    public final TextPaint V;
    public final TextPaint W;
    public TimeInterpolator X;
    public TimeInterpolator Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3772a;
    public float a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3773b;
    public float b0;
    public float c;
    public ColorStateList c0;
    public boolean d;
    public float d0;
    public float e;
    public float e0;
    public float f;
    public float f0;
    public int g;
    public ColorStateList g0;
    public final Rect h;
    public float h0;
    public final Rect i;
    public float i0;
    public final RectF j;
    public float j0;
    public StaticLayout k0;
    public float l0;
    public float m0;
    public float n0;
    public ColorStateList o;
    public CharSequence o0;
    public ColorStateList p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3775r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public Typeface x;
    public Typeface y;
    public Typeface z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3774k = 16;
    public int l = 16;
    public float m = 15.0f;
    public float n = 15.0f;
    public boolean J = true;
    public int p0 = 1;
    public float q0 = 0.0f;
    public float r0 = 1.0f;
    public int s0 = gdo.n;

    public class a implements oi3.a {
        public a() {
        }

        @Override // oi3.a
        public void a(Typeface typeface) {
            b44.this.h0(typeface);
        }
    }

    public class b implements oi3.a {
        public b() {
        }

        @Override // oi3.a
        public void a(Typeface typeface) {
            b44.this.s0(typeface);
        }
    }

    public b44(View view) {
        this.f3772a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.i = new Rect();
        this.h = new Rect();
        this.j = new RectF();
        this.f = e();
        V(view.getContext().getResources().getConfiguration());
    }

    public static boolean Q(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    public static float U(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return wc1.a(f, f2, f3);
    }

    public static int a(int i, int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static boolean a0(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public int A() {
        return this.f3774k;
    }

    @RequiresApi(23)
    public void A0(@FloatRange(from = 0.0d) float f) {
        this.r0 = f;
    }

    public float B() {
        O(this.W);
        return -this.W.ascent();
    }

    public void B0(int i) {
        if (i != this.p0) {
            this.p0 = i;
            j();
            Y();
        }
    }

    public Typeface C() {
        Typeface typeface = this.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void C0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        Y();
    }

    public float D() {
        return this.c;
    }

    public void D0(boolean z) {
        this.J = z;
    }

    public float E() {
        return this.f;
    }

    public final boolean E0(int[] iArr) {
        this.T = iArr;
        if (!S()) {
            return false;
        }
        Y();
        return true;
    }

    @RequiresApi(23)
    public int F() {
        return this.s0;
    }

    public void F0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            Y();
        }
    }

    public int G() {
        StaticLayout staticLayout = this.k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public void G0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        Y();
    }

    @RequiresApi(23)
    public float H() {
        return this.k0.getSpacingAdd();
    }

    public void H0(Typeface typeface) {
        boolean zI0 = i0(typeface);
        boolean zT0 = t0(typeface);
        if (zI0 || zT0) {
            Y();
        }
    }

    @RequiresApi(23)
    public float I() {
        return this.k0.getSpacingMultiplier();
    }

    public final boolean I0() {
        return this.p0 > 1 && (!this.I || this.d) && !this.K;
    }

    public int J() {
        return this.p0;
    }

    public final Layout.Alignment K() {
        int iB = p3b.b(this.f3774k, this.I ? 1 : 0) & 7;
        if (iB == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (iB != 5) {
            return this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public TimeInterpolator L() {
        return this.X;
    }

    public CharSequence M() {
        return this.G;
    }

    public final void N(TextPaint textPaint) {
        textPaint.setTextSize(this.n);
        textPaint.setTypeface(this.x);
        textPaint.setLetterSpacing(this.h0);
    }

    public final void O(TextPaint textPaint) {
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.i0);
    }

    public final void P(float f) {
        if (this.d) {
            this.j.set(f < this.f ? this.h : this.i);
            return;
        }
        this.j.left = U(this.h.left, this.i.left, f, this.X);
        this.j.top = U(this.f3775r, this.s, f, this.X);
        this.j.right = U(this.h.right, this.i.right, f, this.X);
        this.j.bottom = U(this.h.bottom, this.i.bottom, f, this.X);
    }

    public final boolean R() {
        return c.A(this.f3772a) == 1;
    }

    public final boolean S() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.o) != null && colorStateList.isStateful());
    }

    public final boolean T(CharSequence charSequence, boolean z) {
        return (z ? t7p.d : t7p.c).a(charSequence, 0, charSequence.length());
    }

    public void V(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.z;
            if (typeface != null) {
                this.y = a6q.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = a6q.b(configuration, typeface2);
            }
            Typeface typeface3 = this.y;
            if (typeface3 == null) {
                typeface3 = this.z;
            }
            this.x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            Z(true);
        }
    }

    public final float W(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void X() {
        this.f3773b = this.i.width() > 0 && this.i.height() > 0 && this.h.width() > 0 && this.h.height() > 0;
    }

    public void Y() {
        Z(false);
    }

    public void Z(boolean z) {
        if ((this.f3772a.getHeight() <= 0 || this.f3772a.getWidth() <= 0) && !z) {
            return;
        }
        b(z);
        c();
    }

    public final void b(boolean z) {
        StaticLayout staticLayout;
        i(1.0f, z);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout = this.k0) != null) {
            this.o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.o0;
        float fW = 0.0f;
        if (charSequence2 != null) {
            this.l0 = W(this.V, charSequence2);
        } else {
            this.l0 = 0.0f;
        }
        int iB = p3b.b(this.l, this.I ? 1 : 0);
        int i = iB & 112;
        if (i == 48) {
            this.s = this.i.top;
        } else if (i != 80) {
            this.s = this.i.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
        } else {
            this.s = this.i.bottom + this.V.ascent();
        }
        int i2 = iB & 8388615;
        if (i2 == 1) {
            this.u = this.i.centerX() - (this.l0 / 2.0f);
        } else if (i2 != 5) {
            this.u = this.i.left;
        } else {
            this.u = this.i.right - this.l0;
        }
        i(0.0f, z);
        StaticLayout staticLayout2 = this.k0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.k0;
        if (staticLayout3 == null || this.p0 <= 1) {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                fW = W(this.V, charSequence3);
            }
        } else {
            fW = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.k0;
        this.q = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int iB2 = p3b.b(this.f3774k, this.I ? 1 : 0);
        int i3 = iB2 & 112;
        if (i3 == 48) {
            this.f3775r = this.h.top;
        } else if (i3 != 80) {
            this.f3775r = this.h.centerY() - (height / 2.0f);
        } else {
            this.f3775r = (this.h.bottom - height) + this.V.descent();
        }
        int i4 = iB2 & 8388615;
        if (i4 == 1) {
            this.t = this.h.centerX() - (fW / 2.0f);
        } else if (i4 != 5) {
            this.t = this.h.left;
        } else {
            this.t = this.h.right - fW;
        }
        j();
        y0(this.c);
    }

    public void b0(int i, int i2, int i3, int i4) {
        if (a0(this.i, i, i2, i3, i4)) {
            return;
        }
        this.i.set(i, i2, i3, i4);
        this.U = true;
        X();
    }

    public final void c() {
        g(this.c);
    }

    public void c0(Rect rect) {
        b0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final float d(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        float f2 = this.f;
        return f <= f2 ? wc1.b(1.0f, 0.0f, this.e, f2, f) : wc1.b(0.0f, 1.0f, f2, 1.0f, f);
    }

    public void d0(int i) {
        j7p j7pVar = new j7p(this.f3772a.getContext(), i);
        if (j7pVar.i() != null) {
            this.p = j7pVar.i();
        }
        if (j7pVar.j() != 0.0f) {
            this.n = j7pVar.j();
        }
        ColorStateList colorStateList = j7pVar.c;
        if (colorStateList != null) {
            this.c0 = colorStateList;
        }
        this.a0 = j7pVar.h;
        this.b0 = j7pVar.i;
        this.Z = j7pVar.j;
        this.h0 = j7pVar.l;
        oi3 oi3Var = this.F;
        if (oi3Var != null) {
            oi3Var.c();
        }
        this.F = new oi3(new a(), j7pVar.e());
        j7pVar.g(this.f3772a.getContext(), this.F);
        Y();
    }

    public final float e() {
        float f = this.e;
        return f + ((1.0f - f) * 0.5f);
    }

    public final void e0(float f) {
        this.m0 = f;
        c.h0(this.f3772a);
    }

    public final boolean f(CharSequence charSequence) {
        boolean zR = R();
        return this.J ? T(charSequence, zR) : zR;
    }

    public void f0(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            Y();
        }
    }

    public final void g(float f) {
        float f2;
        P(f);
        if (!this.d) {
            this.v = U(this.t, this.u, f, this.X);
            this.w = U(this.f3775r, this.s, f, this.X);
            y0(f);
            f2 = f;
        } else if (f < this.f) {
            this.v = this.t;
            this.w = this.f3775r;
            y0(0.0f);
            f2 = 0.0f;
        } else {
            this.v = this.u;
            this.w = this.s - Math.max(0, this.g);
            y0(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = wc1.f37827b;
        e0(1.0f - U(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        o0(U(1.0f, 0.0f, f, timeInterpolator));
        if (this.p != this.o) {
            this.V.setColor(a(x(), v(), f2));
        } else {
            this.V.setColor(v());
        }
        float f3 = this.h0;
        float f4 = this.i0;
        if (f3 != f4) {
            this.V.setLetterSpacing(U(f4, f3, f, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f3);
        }
        this.P = U(this.d0, this.Z, f, null);
        this.Q = U(this.e0, this.a0, f, null);
        this.R = U(this.f0, this.b0, f, null);
        int iA = a(w(this.g0), w(this.c0), f);
        this.S = iA;
        this.V.setShadowLayer(this.P, this.Q, this.R, iA);
        if (this.d) {
            this.V.setAlpha((int) (d(f) * this.V.getAlpha()));
        }
        c.h0(this.f3772a);
    }

    public void g0(int i) {
        if (this.l != i) {
            this.l = i;
            Y();
        }
    }

    public final void h(float f) {
        i(f, false);
    }

    public void h0(Typeface typeface) {
        if (i0(typeface)) {
            Y();
        }
    }

    public final void i(float f, boolean z) {
        boolean z2;
        float f2;
        float f3;
        boolean z3;
        if (this.G == null) {
            return;
        }
        float fWidth = this.i.width();
        float fWidth2 = this.h.width();
        if (Q(f, 1.0f)) {
            f2 = this.n;
            f3 = this.h0;
            this.N = 1.0f;
            Typeface typeface = this.D;
            Typeface typeface2 = this.x;
            if (typeface != typeface2) {
                this.D = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f4 = this.m;
            float f5 = this.i0;
            Typeface typeface3 = this.D;
            Typeface typeface4 = this.A;
            if (typeface3 != typeface4) {
                this.D = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Q(f, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = U(this.m, this.n, f, this.Y) / this.m;
            }
            float f6 = this.n / this.m;
            fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
            f2 = f4;
            f3 = f5;
            z3 = z2;
        }
        if (fWidth > 0.0f) {
            z3 = ((this.O > f2 ? 1 : (this.O == f2 ? 0 : -1)) != 0) || ((this.j0 > f3 ? 1 : (this.j0 == f3 ? 0 : -1)) != 0) || this.U || z3;
            this.O = f2;
            this.j0 = f3;
            this.U = false;
        }
        if (this.H == null || z3) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.D);
            this.V.setLetterSpacing(this.j0);
            this.V.setLinearText(this.N != 1.0f);
            this.I = f(this.G);
            StaticLayout staticLayoutK = k(I0() ? this.p0 : 1, fWidth, this.I);
            this.k0 = staticLayoutK;
            this.H = staticLayoutK.getText();
        }
    }

    public final boolean i0(Typeface typeface) {
        oi3 oi3Var = this.F;
        if (oi3Var != null) {
            oi3Var.c();
        }
        if (this.z == typeface) {
            return false;
        }
        this.z = typeface;
        Typeface typefaceB = a6q.b(this.f3772a.getContext().getResources().getConfiguration(), typeface);
        this.y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.z;
        }
        this.x = typefaceB;
        return true;
    }

    public final void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    public void j0(int i) {
        this.g = i;
    }

    public final StaticLayout k(int i, float f, boolean z) {
        return (StaticLayout) g6i.g(gdo.b(this.G, this.V, (int) f).d(TextUtils.TruncateAt.END).g(z).c(i == 1 ? Layout.Alignment.ALIGN_NORMAL : K()).f(false).i(i).h(this.q0, this.r0).e(this.s0).a());
    }

    public void k0(int i, int i2, int i3, int i4) {
        if (a0(this.h, i, i2, i3, i4)) {
            return;
        }
        this.h.set(i, i2, i3, i4);
        this.U = true;
        X();
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.H == null || !this.f3773b) {
            return;
        }
        this.V.setTextSize(this.O);
        float f = this.v;
        float f2 = this.w;
        boolean z = this.K && this.L != null;
        float f3 = this.N;
        if (f3 != 1.0f && !this.d) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.L, f, f2, this.M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!I0() || (this.d && this.c <= this.f)) {
            canvas.translate(f, f2);
            this.k0.draw(canvas);
        } else {
            m(canvas, this.v - this.k0.getLineStart(0), f2);
        }
        canvas.restoreToCount(iSave);
    }

    public void l0(Rect rect) {
        k0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void m(Canvas canvas, float f, float f2) {
        int alpha = this.V.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.V.setAlpha((int) (this.n0 * f3));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.V;
            textPaint.setShadowLayer(this.P, this.Q, this.R, i8f.a(this.S, textPaint.getAlpha()));
        }
        this.k0.draw(canvas);
        this.V.setAlpha((int) (this.m0 * f3));
        if (i >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, i8f.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.k0.getLineBaseline(0);
        CharSequence charSequence = this.o0;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.V);
        if (i >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.d) {
            return;
        }
        String strTrim = this.o0.toString().trim();
        if (strTrim.endsWith(Constants.ELLIPSE)) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.k0.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.V);
    }

    public void m0(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            Y();
        }
    }

    public final void n() {
        if (this.L != null || this.h.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.k0.getWidth();
        int height = this.k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    public void n0(int i) {
        j7p j7pVar = new j7p(this.f3772a.getContext(), i);
        if (j7pVar.i() != null) {
            this.o = j7pVar.i();
        }
        if (j7pVar.j() != 0.0f) {
            this.m = j7pVar.j();
        }
        ColorStateList colorStateList = j7pVar.c;
        if (colorStateList != null) {
            this.g0 = colorStateList;
        }
        this.e0 = j7pVar.h;
        this.f0 = j7pVar.i;
        this.d0 = j7pVar.j;
        this.i0 = j7pVar.l;
        oi3 oi3Var = this.E;
        if (oi3Var != null) {
            oi3Var.c();
        }
        this.E = new oi3(new b(), j7pVar.e());
        j7pVar.g(this.f3772a.getContext(), this.E);
        Y();
    }

    public void o(RectF rectF, int i, int i2) {
        this.I = f(this.G);
        rectF.left = s(i, i2);
        rectF.top = this.i.top;
        rectF.right = t(rectF, i, i2);
        rectF.bottom = this.i.top + r();
    }

    public final void o0(float f) {
        this.n0 = f;
        c.h0(this.f3772a);
    }

    public ColorStateList p() {
        return this.p;
    }

    public void p0(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            Y();
        }
    }

    public int q() {
        return this.l;
    }

    public void q0(int i) {
        if (this.f3774k != i) {
            this.f3774k = i;
            Y();
        }
    }

    public float r() {
        N(this.W);
        return -this.W.ascent();
    }

    public void r0(float f) {
        if (this.m != f) {
            this.m = f;
            Y();
        }
    }

    public final float s(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (this.l0 / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            return this.I ? this.i.left : this.i.right - this.l0;
        }
        return this.I ? this.i.right - this.l0 : this.i.left;
    }

    public void s0(Typeface typeface) {
        if (t0(typeface)) {
            Y();
        }
    }

    public final float t(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) + (this.l0 / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            return this.I ? rectF.left + this.l0 : this.i.right;
        }
        return this.I ? this.i.right : rectF.left + this.l0;
    }

    public final boolean t0(Typeface typeface) {
        oi3 oi3Var = this.E;
        if (oi3Var != null) {
            oi3Var.c();
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface typefaceB = a6q.b(this.f3772a.getContext().getResources().getConfiguration(), typeface);
        this.B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.C;
        }
        this.A = typefaceB;
        return true;
    }

    public Typeface u() {
        Typeface typeface = this.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void u0(float f) {
        float fA = r8f.a(f, 0.0f, 1.0f);
        if (fA != this.c) {
            this.c = fA;
            c();
        }
    }

    public int v() {
        return w(this.p);
    }

    public void v0(boolean z) {
        this.d = z;
    }

    public final int w(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void w0(float f) {
        this.e = f;
        this.f = e();
    }

    public final int x() {
        return w(this.o);
    }

    @RequiresApi(23)
    public void x0(int i) {
        this.s0 = i;
    }

    public int y() {
        return this.q;
    }

    public final void y0(float f) {
        h(f);
        boolean z = t0 && this.N != 1.0f;
        this.K = z;
        if (z) {
            n();
        }
        c.h0(this.f3772a);
    }

    public float z() {
        O(this.W);
        return (-this.W.ascent()) + this.W.descent();
    }

    @RequiresApi(23)
    public void z0(float f) {
        this.q0 = f;
    }
}
