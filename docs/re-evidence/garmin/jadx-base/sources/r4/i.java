package r4;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import o4.d0;
import o4.e0;
import o4.f0;
import o4.n1;
import o4.y;
import o4.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lr4/i;", "Lr4/d;", "Ls4/a;", "layerContainer", "", "ownerId", "Lo4/z;", "canvasHolder", "Lq4/a;", "canvasDrawScope", "<init>", "(Ls4/a;JLo4/z;Lq4/a;)V", "b", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements d {
    public static final a C;
    public float A;
    public n1 B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.a f150221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f150222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f150223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f150224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f150225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f150226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f150227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f150228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f150229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f150230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f150231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f150232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f150233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e0 f150234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f150235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f150236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f150237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f150238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f150239t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f150240u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f150241v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f150242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f150243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f150244y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f150245z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"r4/i$a", "Landroid/graphics/Canvas;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    }

    static {
        new b(null);
        q.f150253a.getClass();
        C = new a();
    }

    public i(s4.a aVar, long j8, z zVar, q4.a aVar2) {
        this.f150221b = aVar;
        this.f150222c = zVar;
        r rVar = new r(aVar, zVar, aVar2);
        this.f150223d = rVar;
        this.f150224e = aVar.getResources();
        this.f150225f = new Rect();
        aVar.addView(rVar);
        rVar.setClipBounds(null);
        g6.m.f76012b.getClass();
        this.f150229j = 0L;
        View.generateViewId();
        o4.q.f128930b.getClass();
        this.f150233n = o4.q.f128933e;
        r4.b.f150137b.getClass();
        this.f150235p = 0;
        this.f150236q = 1.0f;
        n4.c.f123541b.getClass();
        this.f150237r = 1.0f;
        this.f150238s = 1.0f;
        d0.f128823b.getClass();
        long j14 = d0.f128824c;
        this.f150242w = j14;
        this.f150243x = j14;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: A, reason: from getter */
    public final float getF150245z() {
        return this.f150245z;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: B, reason: from getter */
    public final float getA() {
        return this.A;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public final float getF150237r() {
        return this.f150237r;
    }

    @Override // r4.d
    public final void D(long j8) {
        long j14 = 9223372034707292159L & j8;
        r rVar = this.f150223d;
        if (j14 == 9205357640488583168L) {
            s.f150265a.getClass();
            rVar.resetPivot();
        } else {
            rVar.setPivotX(Float.intBitsToFloat((int) (j8 >> 32)));
            rVar.setPivotY(Float.intBitsToFloat((int) (j8 & 4294967295L)));
        }
    }

    @Override // r4.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public final float getF150244y() {
        return this.f150244y;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: F, reason: from getter */
    public final float getF150238s() {
        return this.f150238s;
    }

    @Override // r4.d
    public final void G(y yVar) {
        Rect rect;
        boolean z14 = this.f150230k;
        r rVar = this.f150223d;
        if (z14) {
            if ((this.f150232m || rVar.getClipToOutline()) && !this.f150231l) {
                rect = this.f150225f;
                rect.left = 0;
                rect.top = 0;
                rect.right = rVar.getWidth();
                rect.bottom = rVar.getHeight();
            } else {
                rect = null;
            }
            rVar.setClipBounds(rect);
        }
        Canvas canvas = o4.d.f128822a;
        if (((o4.c) yVar).f128816a.isHardwareAccelerated()) {
            this.f150221b.a(yVar, rVar, rVar.getDrawingTime());
        }
    }

    @Override // r4.d
    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getF150243x() {
        return this.f150243x;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: I */
    public final float getF150216v() {
        return this.f150223d.getCameraDistance() / this.f150224e.getDisplayMetrics().densityDpi;
    }

    @Override // r4.d
    public final Matrix J() {
        return this.f150223d.getMatrix();
    }

    @Override // r4.d
    /* JADX INFO: renamed from: K, reason: from getter */
    public final int getF150235p() {
        return this.f150235p;
    }

    @Override // r4.d
    public final void L(int i14, int i15, long j8) {
        boolean zC = g6.m.c(this.f150229j, j8);
        r rVar = this.f150223d;
        if (zC) {
            int i16 = this.f150227h;
            if (i16 != i14) {
                rVar.offsetLeftAndRight(i14 - i16);
            }
            int i17 = this.f150228i;
            if (i17 != i15) {
                rVar.offsetTopAndBottom(i15 - i17);
            }
        } else {
            if (this.f150232m || rVar.getClipToOutline()) {
                this.f150230k = true;
            }
            rVar.layout(i14, i15, ((int) (j8 >> 32)) + i14, ((int) (4294967295L & j8)) + i15);
            this.f150229j = j8;
        }
        this.f150227h = i14;
        this.f150228i = i15;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getF150242w() {
        return this.f150242w;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: N, reason: from getter */
    public final int getF150233n() {
        return this.f150233n;
    }

    @Override // r4.d
    public final void O(int i14) {
        this.f150235p = i14;
        Q();
    }

    public final void P(int i14) {
        r4.b.a aVar = r4.b.f150137b;
        aVar.getClass();
        int i15 = r4.b.f150138c;
        boolean z14 = true;
        r rVar = this.f150223d;
        if (i14 == i15) {
            rVar.setLayerType(2, this.f150226g);
        } else {
            aVar.getClass();
            if (i14 == r4.b.f150139d) {
                rVar.setLayerType(0, this.f150226g);
                z14 = false;
            } else {
                rVar.setLayerType(0, this.f150226g);
            }
        }
        rVar.setCanUseCompositingLayer$ui_graphics(z14);
    }

    public final void Q() {
        int i14 = this.f150235p;
        r4.b.a aVar = r4.b.f150137b;
        aVar.getClass();
        int i15 = r4.b.f150138c;
        if (i14 != i15) {
            int i16 = this.f150233n;
            o4.q.f128930b.getClass();
            if (i16 == o4.q.f128933e && this.f150234o == null) {
                P(this.f150235p);
                return;
            }
        }
        aVar.getClass();
        P(i15);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF150236q() {
        return this.f150236q;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final n1 getB() {
        return this.B;
    }

    @Override // r4.d
    public final void c(float f14) {
        this.f150236q = f14;
        this.f150223d.setAlpha(f14);
    }

    @Override // r4.d
    public final void d(e0 e0Var) {
        this.f150234o = e0Var;
        Paint paint = this.f150226g;
        if (paint == null) {
            paint = new Paint();
            this.f150226g = paint;
        }
        paint.setColorFilter(e0Var != null ? e0Var.f128844a : null);
        Q();
    }

    @Override // r4.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0 getF150234o() {
        return this.f150234o;
    }

    @Override // r4.d
    public final void g(boolean z14) {
        boolean z15 = false;
        this.f150232m = z14 && !this.f150231l;
        this.f150230k = true;
        if (z14 && this.f150231l) {
            z15 = true;
        }
        this.f150223d.setClipToOutline(z15);
    }

    @Override // r4.d
    public final void h(float f14) {
        this.f150244y = f14;
        this.f150223d.setRotationX(f14);
    }

    @Override // r4.d
    public final void i(float f14) {
        this.f150245z = f14;
        this.f150223d.setRotationY(f14);
    }

    @Override // r4.d
    public final void j(float f14) {
        this.f150241v = f14;
        this.f150223d.setElevation(f14);
    }

    @Override // r4.d
    public final void k(float f14) {
        this.A = f14;
        this.f150223d.setRotation(f14);
    }

    @Override // r4.d
    public final void l(int i14) {
        this.f150233n = i14;
        Paint paint = this.f150226g;
        if (paint == null) {
            paint = new Paint();
            this.f150226g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(o4.b.b(i14)));
        Q();
    }

    @Override // r4.d
    public final void m(long j8) {
        this.f150242w = j8;
        s sVar = s.f150265a;
        int iJ = f0.j(j8);
        sVar.getClass();
        this.f150223d.setOutlineAmbientShadowColor(iJ);
    }

    @Override // r4.d
    public final void n(long j8) {
        this.f150243x = j8;
        s sVar = s.f150265a;
        int iJ = f0.j(j8);
        sVar.getClass();
        this.f150223d.setOutlineSpotShadowColor(iJ);
    }

    @Override // r4.d
    public final void o(Outline outline, long j8) {
        r rVar = this.f150223d;
        rVar.f150259e = outline;
        l.f150248a.getClass();
        rVar.invalidateOutline();
        if ((this.f150232m || rVar.getClipToOutline()) && outline != null) {
            rVar.setClipToOutline(true);
            if (this.f150232m) {
                this.f150232m = false;
                this.f150230k = true;
            }
        }
        this.f150231l = outline != null;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getF150240u() {
        return this.f150240u;
    }

    @Override // r4.d
    public final void q(float f14) {
        this.f150240u = f14;
        this.f150223d.setTranslationY(f14);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getF150239t() {
        return this.f150239t;
    }

    @Override // r4.d
    public final void s(float f14) {
        this.f150223d.setCameraDistance(f14 * this.f150224e.getDisplayMetrics().densityDpi);
    }

    @Override // r4.d
    public final void t(n1 n1Var) {
        RenderEffect renderEffectA;
        this.B = n1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            t.f150266a.getClass();
            if (n1Var != null) {
                renderEffectA = n1Var.f128896a;
                if (renderEffectA == null) {
                    renderEffectA = n1Var.a();
                    n1Var.f128896a = renderEffectA;
                }
            } else {
                renderEffectA = null;
            }
            this.f150223d.setRenderEffect(renderEffectA);
        }
    }

    @Override // r4.d
    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getF150241v() {
        return this.f150241v;
    }

    @Override // r4.d
    public final void v(float f14) {
        this.f150237r = f14;
        this.f150223d.setScaleX(f14);
    }

    @Override // r4.d
    public final void w(float f14) {
        this.f150238s = f14;
        this.f150223d.setScaleY(f14);
    }

    @Override // r4.d
    public final void x(float f14) {
        this.f150239t = f14;
        this.f150223d.setTranslationX(f14);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // r4.d
    public final void y(g6.c cVar, g6.o oVar, c cVar2, c.b bVar) {
        r rVar = this.f150223d;
        ViewParent parent = rVar.getParent();
        s4.a aVar = this.f150221b;
        if (parent == null) {
            aVar.addView(rVar);
        }
        rVar.f150261g = cVar;
        rVar.f150262h = oVar;
        rVar.f150263i = bVar;
        rVar.f150264j = cVar2;
        if (rVar.isAttachedToWindow()) {
            rVar.setVisibility(4);
            rVar.setVisibility(0);
            try {
                z zVar = this.f150222c;
                a aVar2 = C;
                o4.c cVar3 = zVar.f129040a;
                Canvas canvas = cVar3.f128816a;
                cVar3.f128816a = aVar2;
                aVar.a(cVar3, rVar, rVar.getDrawingTime());
                zVar.f129040a.f128816a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // r4.d
    public final void z() {
        this.f150221b.removeViewInLayout(this.f150223d);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr4/i$b;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ i(s4.a aVar, long j8, z zVar, q4.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, j8, (i14 & 4) != 0 ? new z() : zVar, (i14 & 8) != 0 ? new q4.a() : aVar2);
    }
}
