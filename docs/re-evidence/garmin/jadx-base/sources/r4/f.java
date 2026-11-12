package r4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import o4.d0;
import o4.e0;
import o4.f0;
import o4.n1;
import o4.y;
import o4.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lr4/f;", "Lr4/d;", "Landroid/view/View;", "ownerView", "", "ownerId", "Lo4/z;", "canvasHolder", "Lq4/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLo4/z;Lq4/a;)V", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements d {
    public static final AtomicBoolean D;
    public boolean A;
    public boolean B;
    public n1 C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f150171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.a f150172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f150173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f150174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f150175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f150176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f150177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f150178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f150179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f150180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0 f150181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f150182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f150183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f150184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f150185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f150186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f150187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f150188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f150189t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f150190u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f150191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f150192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f150193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f150194y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f150195z;

    static {
        new a(null);
        D = new AtomicBoolean(true);
    }

    public f(View view2, long j8, z zVar, q4.a aVar) {
        this.f150171b = zVar;
        this.f150172c = aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view2);
        this.f150173d = renderNodeCreate;
        g6.m.f76012b.getClass();
        this.f150174e = 0L;
        this.f150178i = 0L;
        if (D.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            o.f150251a.getClass();
            o.c(renderNodeCreate, o.a(renderNodeCreate));
            o.d(renderNodeCreate, o.b(renderNodeCreate));
            n.f150250a.getClass();
            n.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        b.f150137b.getClass();
        Q(0);
        this.f150179j = 0;
        o4.q.f128930b.getClass();
        this.f150180k = o4.q.f128933e;
        this.f150182m = 1.0f;
        n4.c.f123541b.getClass();
        this.f150184o = 1.0f;
        this.f150185p = 1.0f;
        d0.f128823b.getClass();
        long j14 = d0.f128824c;
        this.f150189t = j14;
        this.f150190u = j14;
        this.f150194y = 8.0f;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: A, reason: from getter */
    public final float getF150192w() {
        return this.f150192w;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: B, reason: from getter */
    public final float getF150193x() {
        return this.f150193x;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public final float getF150184o() {
        return this.f150184o;
    }

    @Override // r4.d
    public final void D(long j8) {
        if ((9223372034707292159L & j8) == 9205357640488583168L) {
            this.f150183n = true;
            this.f150173d.setPivotX(((int) (this.f150174e >> 32)) / 2.0f);
            this.f150173d.setPivotY(((int) (4294967295L & this.f150174e)) / 2.0f);
        } else {
            this.f150183n = false;
            this.f150173d.setPivotX(Float.intBitsToFloat((int) (j8 >> 32)));
            this.f150173d.setPivotY(Float.intBitsToFloat((int) (j8 & 4294967295L)));
        }
    }

    @Override // r4.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public final float getF150191v() {
        return this.f150191v;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: F, reason: from getter */
    public final float getF150185p() {
        return this.f150185p;
    }

    @Override // r4.d
    public final void G(y yVar) {
        Canvas canvas = o4.d.f128822a;
        DisplayListCanvas displayListCanvas = ((o4.c) yVar).f128816a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.f150173d);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getF150190u() {
        return this.f150190u;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: I, reason: from getter */
    public final float getF150194y() {
        return this.f150194y;
    }

    @Override // r4.d
    public final Matrix J() {
        Matrix matrix = this.f150176g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f150176g = matrix;
        }
        this.f150173d.getMatrix(matrix);
        return matrix;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: K, reason: from getter */
    public final int getF150179j() {
        return this.f150179j;
    }

    @Override // r4.d
    public final void L(int i14, int i15, long j8) {
        int i16 = (int) (j8 >> 32);
        int i17 = (int) (4294967295L & j8);
        this.f150173d.setLeftTopRightBottom(i14, i15, i14 + i16, i15 + i17);
        if (g6.m.c(this.f150174e, j8)) {
            return;
        }
        if (this.f150183n) {
            this.f150173d.setPivotX(i16 / 2.0f);
            this.f150173d.setPivotY(i17 / 2.0f);
        }
        this.f150174e = j8;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getF150189t() {
        return this.f150189t;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: N, reason: from getter */
    public final int getF150180k() {
        return this.f150180k;
    }

    @Override // r4.d
    public final void O(int i14) {
        this.f150179j = i14;
        R();
    }

    public final void P() {
        boolean z14 = this.f150195z;
        boolean z15 = false;
        boolean z16 = z14 && !this.f150177h;
        if (z14 && this.f150177h) {
            z15 = true;
        }
        if (z16 != this.A) {
            this.A = z16;
            this.f150173d.setClipToBounds(z16);
        }
        if (z15 != this.B) {
            this.B = z15;
            this.f150173d.setClipToOutline(z15);
        }
    }

    public final void Q(int i14) {
        RenderNode renderNode = this.f150173d;
        b.a aVar = b.f150137b;
        aVar.getClass();
        if (i14 == b.f150138c) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f150175f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        aVar.getClass();
        if (i14 == b.f150139d) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f150175f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f150175f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i14 = this.f150179j;
        b.a aVar = b.f150137b;
        aVar.getClass();
        int i15 = b.f150138c;
        if (i14 != i15) {
            int i16 = this.f150180k;
            o4.q.f128930b.getClass();
            if (i16 == o4.q.f128933e && this.f150181l == null) {
                Q(this.f150179j);
                return;
            }
        }
        aVar.getClass();
        Q(i15);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF150182m() {
        return this.f150182m;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final n1 getC() {
        return this.C;
    }

    @Override // r4.d
    public final void c(float f14) {
        this.f150182m = f14;
        this.f150173d.setAlpha(f14);
    }

    @Override // r4.d
    public final void d(e0 e0Var) {
        this.f150181l = e0Var;
        if (e0Var == null) {
            R();
            return;
        }
        b.f150137b.getClass();
        Q(b.f150138c);
        RenderNode renderNode = this.f150173d;
        Paint paint = this.f150175f;
        if (paint == null) {
            paint = new Paint();
            this.f150175f = paint;
        }
        paint.setColorFilter(e0Var.f128844a);
        renderNode.setLayerPaint(paint);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0 getF150181l() {
        return this.f150181l;
    }

    @Override // r4.d
    public final boolean f() {
        return this.f150173d.isValid();
    }

    @Override // r4.d
    public final void g(boolean z14) {
        this.f150195z = z14;
        P();
    }

    @Override // r4.d
    public final void h(float f14) {
        this.f150191v = f14;
        this.f150173d.setRotationX(f14);
    }

    @Override // r4.d
    public final void i(float f14) {
        this.f150192w = f14;
        this.f150173d.setRotationY(f14);
    }

    @Override // r4.d
    public final void j(float f14) {
        this.f150188s = f14;
        this.f150173d.setElevation(f14);
    }

    @Override // r4.d
    public final void k(float f14) {
        this.f150193x = f14;
        this.f150173d.setRotation(f14);
    }

    @Override // r4.d
    public final void l(int i14) {
        int i15 = this.f150180k;
        o4.q.a aVar = o4.q.f128930b;
        if (i15 == i14) {
            return;
        }
        this.f150180k = i14;
        Paint paint = this.f150175f;
        if (paint == null) {
            paint = new Paint();
            this.f150175f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(o4.b.b(i14)));
        R();
    }

    @Override // r4.d
    public final void m(long j8) {
        this.f150189t = j8;
        o oVar = o.f150251a;
        RenderNode renderNode = this.f150173d;
        int iJ = f0.j(j8);
        oVar.getClass();
        o.c(renderNode, iJ);
    }

    @Override // r4.d
    public final void n(long j8) {
        this.f150190u = j8;
        o oVar = o.f150251a;
        RenderNode renderNode = this.f150173d;
        int iJ = f0.j(j8);
        oVar.getClass();
        o.d(renderNode, iJ);
    }

    @Override // r4.d
    public final void o(Outline outline, long j8) {
        this.f150178i = j8;
        this.f150173d.setOutline(outline);
        this.f150177h = outline != null;
        P();
    }

    @Override // r4.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getF150187r() {
        return this.f150187r;
    }

    @Override // r4.d
    public final void q(float f14) {
        this.f150187r = f14;
        this.f150173d.setTranslationY(f14);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getF150186q() {
        return this.f150186q;
    }

    @Override // r4.d
    public final void s(float f14) {
        this.f150194y = f14;
        this.f150173d.setCameraDistance(-f14);
    }

    @Override // r4.d
    public final void t(n1 n1Var) {
        this.C = n1Var;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getF150188s() {
        return this.f150188s;
    }

    @Override // r4.d
    public final void v(float f14) {
        this.f150184o = f14;
        this.f150173d.setScaleX(f14);
    }

    @Override // r4.d
    public final void w(float f14) {
        this.f150185p = f14;
        this.f150173d.setScaleY(f14);
    }

    @Override // r4.d
    public final void x(float f14) {
        this.f150186q = f14;
        this.f150173d.setTranslationX(f14);
    }

    @Override // r4.d
    public final void y(g6.c cVar, g6.o oVar, c cVar2, c.b bVar) {
        Canvas canvasStart = this.f150173d.start(Math.max((int) (this.f150174e >> 32), (int) (this.f150178i >> 32)), Math.max((int) (this.f150174e & 4294967295L), (int) (this.f150178i & 4294967295L)));
        try {
            z zVar = this.f150171b;
            o4.c cVar3 = zVar.f129040a;
            Canvas canvas = cVar3.f128816a;
            cVar3.f128816a = canvasStart;
            q4.a aVar = this.f150172c;
            long jC = g6.n.c(this.f150174e);
            q4.a.b bVar2 = aVar.f142543b;
            q4.a.b bVar3 = aVar.f142543b;
            g6.c cVarD = bVar2.d();
            g6.o oVarE = bVar3.e();
            y yVarA = bVar3.a();
            long jB = bVar3.b();
            c cVar4 = bVar3.f142551b;
            bVar3.g(cVar);
            bVar3.h(oVar);
            bVar3.f(cVar3);
            bVar3.c(jC);
            bVar3.f142551b = cVar2;
            cVar3.l();
            try {
                bVar.invoke(aVar);
                cVar3.i();
                bVar3.g(cVarD);
                bVar3.h(oVarE);
                bVar3.f(yVarA);
                bVar3.c(jB);
                bVar3.f142551b = cVar4;
                zVar.f129040a.f128816a = canvas;
                this.f150173d.end(canvasStart);
            } catch (Throwable th3) {
                cVar3.i();
                q4.a.b bVar4 = aVar.f142543b;
                bVar4.g(cVarD);
                bVar4.h(oVarE);
                bVar4.f(yVarA);
                bVar4.c(jB);
                bVar4.f142551b = cVar4;
                throw th3;
            }
        } catch (Throwable th4) {
            this.f150173d.end(canvasStart);
            throw th4;
        }
    }

    @Override // r4.d
    public final void z() {
        n nVar = n.f150250a;
        RenderNode renderNode = this.f150173d;
        nVar.getClass();
        n.a(renderNode);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr4/f$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "needToValidateAccess", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f(View view2, long j8, z zVar, q4.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(view2, j8, (i14 & 4) != 0 ? new z() : zVar, (i14 & 8) != 0 ? new q4.a() : aVar);
    }
}
