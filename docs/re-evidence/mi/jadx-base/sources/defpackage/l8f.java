package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.collection.ScatterMapKt;
import java.util.BitSet;

/* JADX INFO: loaded from: classes5.dex */
public class l8f extends Drawable implements i3m {
    public static final Paint x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f24768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3m.g[] f24769b;
    public final d3m.g[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Region f24770k;
    public final Region l;
    public r2m m;
    public final Paint n;
    public final Paint o;
    public final n2m p;
    public final s2m.b q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s2m f24771r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public int u;
    public final RectF v;
    public boolean w;

    public class a implements s2m.b {
        public a() {
        }

        @Override // s2m.b
        public void a(d3m d3mVar, Matrix matrix, int i) {
            l8f.this.d.set(i + 4, d3mVar.e());
            l8f.this.c[i] = d3mVar.f(matrix);
        }

        @Override // s2m.b
        public void b(d3m d3mVar, Matrix matrix, int i) {
            l8f.this.d.set(i, d3mVar.e());
            l8f.this.f24769b[i] = d3mVar.f(matrix);
        }
    }

    public class b implements r2m.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f24773a;

        public b(float f) {
            this.f24773a = f;
        }

        @Override // r2m.c
        public sl4 a(sl4 sl4Var) {
            return sl4Var instanceof qgk ? sl4Var : new ru0(this.f24773a, sl4Var);
        }
    }

    static {
        Paint paint = new Paint(1);
        x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public /* synthetic */ l8f(c cVar, a aVar) {
        this(cVar);
    }

    public static int V(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public static l8f m(Context context, float f) {
        int iC = i8f.c(context, pii.s, l8f.class.getSimpleName());
        l8f l8fVar = new l8f();
        l8fVar.Q(context);
        l8fVar.b0(ColorStateList.valueOf(iC));
        l8fVar.a0(f);
        return l8fVar;
    }

    public int A() {
        return this.u;
    }

    public int B() {
        c cVar = this.f24768a;
        return (int) (((double) cVar.s) * Math.sin(Math.toRadians(cVar.t)));
    }

    public int C() {
        c cVar = this.f24768a;
        return (int) (((double) cVar.s) * Math.cos(Math.toRadians(cVar.t)));
    }

    public int D() {
        return this.f24768a.f24778r;
    }

    public r2m E() {
        return this.f24768a.f24775a;
    }

    public ColorStateList F() {
        return this.f24768a.e;
    }

    public final float G() {
        if (P()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float H() {
        return this.f24768a.l;
    }

    public ColorStateList I() {
        return this.f24768a.g;
    }

    public float J() {
        return this.f24768a.f24775a.r().a(u());
    }

    public float K() {
        return this.f24768a.f24775a.t().a(u());
    }

    public float L() {
        return this.f24768a.p;
    }

    public float M() {
        return w() + L();
    }

    public final boolean N() {
        c cVar = this.f24768a;
        int i = cVar.q;
        return i != 1 && cVar.f24778r > 0 && (i == 2 || X());
    }

    public final boolean O() {
        Paint.Style style = this.f24768a.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean P() {
        Paint.Style style = this.f24768a.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    public void Q(Context context) {
        this.f24768a.f24776b = new v68(context);
        p0();
    }

    public final void R() {
        super.invalidateSelf();
    }

    public boolean S() {
        v68 v68Var = this.f24768a.f24776b;
        return v68Var != null && v68Var.e();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean T() {
        return this.f24768a.f24775a.u(u());
    }

    public final void U(Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.v.width() - getBounds().width());
            int iHeight = (int) (this.v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.v.width()) + (this.f24768a.f24778r * 2) + iWidth, ((int) this.v.height()) + (this.f24768a.f24778r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f = (getBounds().left - this.f24768a.f24778r) - iWidth;
            float f2 = (getBounds().top - this.f24768a.f24778r) - iHeight;
            canvas2.translate(-f, -f2);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final void W(Canvas canvas) {
        canvas.translate(B(), C());
    }

    public boolean X() {
        return (T() || this.g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(float f) {
        setShapeAppearanceModel(this.f24768a.f24775a.w(f));
    }

    public void Z(sl4 sl4Var) {
        setShapeAppearanceModel(this.f24768a.f24775a.x(sl4Var));
    }

    public void a0(float f) {
        c cVar = this.f24768a;
        if (cVar.o != f) {
            cVar.o = f;
            p0();
        }
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f24768a;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f) {
        c cVar = this.f24768a;
        if (cVar.f24777k != f) {
            cVar.f24777k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    public void d0(int i, int i2, int i3, int i4) {
        c cVar = this.f24768a;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.f24768a.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.n.setColorFilter(this.s);
        int alpha = this.n.getAlpha();
        this.n.setAlpha(V(alpha, this.f24768a.m));
        this.o.setColorFilter(this.t);
        this.o.setStrokeWidth(this.f24768a.l);
        int alpha2 = this.o.getAlpha();
        this.o.setAlpha(V(alpha2, this.f24768a.m));
        if (this.e) {
            i();
            g(u(), this.g);
            this.e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.n.setAlpha(alpha);
        this.o.setAlpha(alpha2);
    }

    public void e0(Paint.Style style) {
        this.f24768a.v = style;
        R();
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void f0(float f) {
        c cVar = this.f24768a;
        if (cVar.n != f) {
            cVar.n = f;
            p0();
        }
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f24768a.j != 1.0f) {
            this.f.reset();
            Matrix matrix = this.f;
            float f = this.f24768a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f);
        }
        path.computeBounds(this.v, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void g0(boolean z) {
        this.w = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24768a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f24768a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f24768a.q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f24768a.f24777k);
            return;
        }
        g(u(), this.g);
        if (this.g.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.g);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f24768a.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f24770k.set(getBounds());
        g(u(), this.g);
        this.l.setPath(this.g, this.f24770k);
        this.f24770k.op(this.l, Region.Op.DIFFERENCE);
        return this.f24770k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void h(RectF rectF, Path path) {
        s2m s2mVar = this.f24771r;
        c cVar = this.f24768a;
        s2mVar.d(cVar.f24775a, cVar.f24777k, rectF, this.q, path);
    }

    public void h0(int i) {
        this.p.d(i);
        this.f24768a.u = false;
        R();
    }

    public final void i() {
        r2m r2mVarY = E().y(new b(-G()));
        this.m = r2mVarY;
        this.f24771r.e(r2mVarY, this.f24768a.f24777k, v(), this.h);
    }

    public void i0(int i) {
        c cVar = this.f24768a;
        if (cVar.q != i) {
            cVar.q = i;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f24768a.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f24768a.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f24768a.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f24768a.d) != null && colorStateList4.isStateful())));
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        this.u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void j0(float f, int i) {
        m0(f);
        l0(ColorStateList.valueOf(i));
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    public void k0(float f, ColorStateList colorStateList) {
        m0(f);
        l0(colorStateList);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int l(int i) {
        float fM = M() + z();
        v68 v68Var = this.f24768a.f24776b;
        return v68Var != null ? v68Var.c(i, fM) : i;
    }

    public void l0(ColorStateList colorStateList) {
        c cVar = this.f24768a;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public void m0(float f) {
        this.f24768a.l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f24768a = new c(this.f24768a);
        return this;
    }

    public final void n(Canvas canvas) {
        this.d.cardinality();
        if (this.f24768a.s != 0) {
            canvas.drawPath(this.g, this.p.c());
        }
        for (int i = 0; i < 4; i++) {
            this.f24769b[i].a(this.p, this.f24768a.f24778r, canvas);
            this.c[i].a(this.p, this.f24768a.f24778r, canvas);
        }
        if (this.w) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.g, x);
            canvas.translate(iB, iC);
        }
    }

    public final boolean n0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f24768a.d == null || color2 == (colorForState2 = this.f24768a.d.getColorForState(iArr, (color2 = this.n.getColor())))) {
            z = false;
        } else {
            this.n.setColor(colorForState2);
            z = true;
        }
        if (this.f24768a.e == null || color == (colorForState = this.f24768a.e.getColorForState(iArr, (color = this.o.getColor())))) {
            return z;
        }
        this.o.setColor(colorForState);
        return true;
    }

    public final void o(Canvas canvas) {
        p(canvas, this.n, this.g, this.f24768a.f24775a, u());
    }

    public final boolean o0() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        c cVar = this.f24768a;
        this.s = k(cVar.g, cVar.h, this.n, true);
        c cVar2 = this.f24768a;
        this.t = k(cVar2.f, cVar2.h, this.o, false);
        c cVar3 = this.f24768a;
        if (cVar3.u) {
            this.p.d(cVar3.g.getColorForState(getState(), 0));
        }
        return (l4h.a(porterDuffColorFilter, this.s) && l4h.a(porterDuffColorFilter2, this.t)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, u7p.b
    public boolean onStateChange(int[] iArr) {
        boolean z = n0(iArr) || o0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(Canvas canvas, Paint paint, Path path, r2m r2mVar, RectF rectF) {
        if (!r2mVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = r2mVar.t().a(rectF) * this.f24768a.f24777k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public final void p0() {
        float fM = M();
        this.f24768a.f24778r = (int) Math.ceil(0.75f * fM);
        this.f24768a.s = (int) Math.ceil(fM * 0.25f);
        o0();
        R();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f24768a.f24775a, rectF);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void r(Canvas canvas) {
        p(canvas, this.o, this.h, this.m, v());
    }

    public float s() {
        return this.f24768a.f24775a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i) {
        c cVar = this.f24768a;
        if (cVar.m != i) {
            cVar.m = i;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24768a.c = colorFilter;
        R();
    }

    @Override // defpackage.i3m
    public void setShapeAppearanceModel(r2m r2mVar) {
        this.f24768a.f24775a = r2mVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f24768a.g = colorStateList;
        o0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f24768a;
        if (cVar.h != mode) {
            cVar.h = mode;
            o0();
            R();
        }
    }

    public float t() {
        return this.f24768a.f24775a.l().a(u());
    }

    public RectF u() {
        this.i.set(getBounds());
        return this.i;
    }

    public final RectF v() {
        this.j.set(u());
        float fG = G();
        this.j.inset(fG, fG);
        return this.j;
    }

    public float w() {
        return this.f24768a.o;
    }

    public ColorStateList x() {
        return this.f24768a.d;
    }

    public float y() {
        return this.f24768a.f24777k;
    }

    public float z() {
        return this.f24768a.n;
    }

    public l8f() {
        this(new r2m());
    }

    public l8f(Context context, AttributeSet attributeSet, int i, int i2) {
        this(r2m.e(context, attributeSet, i, i2).m());
    }

    public l8f(r2m r2mVar) {
        this(new c(r2mVar, null));
    }

    public l8f(c cVar) {
        s2m s2mVar;
        this.f24769b = new d3m.g[4];
        this.c = new d3m.g[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.f24770k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new n2m();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            s2mVar = s2m.k();
        } else {
            s2mVar = new s2m();
        }
        this.f24771r = s2mVar;
        this.v = new RectF();
        this.w = true;
        this.f24768a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        o0();
        n0(getState());
        this.q = new a();
    }

    public static final class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r2m f24775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v68 f24776b;
        public ColorFilter c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f24777k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f24778r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(r2m r2mVar, v68 v68Var) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.f24777k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.f24778r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f24775a = r2mVar;
            this.f24776b = v68Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            l8f l8fVar = new l8f(this, null);
            l8fVar.e = true;
            return l8fVar;
        }

        public c(c cVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.f24777k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.f24778r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f24775a = cVar.f24775a;
            this.f24776b = cVar.f24776b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.f24777k = cVar.f24777k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.f24778r = cVar.f24778r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }
    }
}
