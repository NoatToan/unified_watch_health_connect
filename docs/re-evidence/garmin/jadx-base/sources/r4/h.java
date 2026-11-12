package r4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.os.Build;
import o4.d0;
import o4.e0;
import o4.f0;
import o4.n1;
import o4.y;
import o4.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lr4/h;", "Lr4/d;", "", "ownerId", "Lo4/z;", "canvasHolder", "Lq4/a;", "canvasDrawScope", "<init>", "(JLo4/z;Lq4/a;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements d {
    public int A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f150196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.a f150197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f150198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f150199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f150200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f150201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f150202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f150203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f150204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e0 f150205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f150206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f150207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f150208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f150209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f150210p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f150211q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f150212r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f150213s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f150214t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f150215u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f150216v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f150217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f150218x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f150219y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n1 f150220z;

    public h(long j8, z zVar, q4.a aVar) {
        this.f150196b = zVar;
        this.f150197c = aVar;
        RenderNode renderNodeB = g.b();
        this.f150198d = renderNodeB;
        n4.g.f123559b.getClass();
        this.f150199e = 0L;
        renderNodeB.setClipToBounds(false);
        b.f150137b.getClass();
        Q(renderNodeB, 0);
        this.f150203i = 1.0f;
        o4.q.f128930b.getClass();
        this.f150204j = o4.q.f128933e;
        n4.c.f123541b.getClass();
        this.f150206l = 1.0f;
        this.f150207m = 1.0f;
        d0.f128823b.getClass();
        long j14 = d0.f128824c;
        this.f150211q = j14;
        this.f150212r = j14;
        this.f150216v = 8.0f;
        this.A = 0;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: A, reason: from getter */
    public final float getF150214t() {
        return this.f150214t;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: B, reason: from getter */
    public final float getF150215u() {
        return this.f150215u;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public final float getF150206l() {
        return this.f150206l;
    }

    @Override // r4.d
    public final void D(long j8) {
        long j14 = 9223372034707292159L & j8;
        RenderNode renderNode = this.f150198d;
        if (j14 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j8 >> 32)));
            this.f150198d.setPivotY(Float.intBitsToFloat((int) (j8 & 4294967295L)));
        }
    }

    @Override // r4.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public final float getF150213s() {
        return this.f150213s;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: F, reason: from getter */
    public final float getF150207m() {
        return this.f150207m;
    }

    @Override // r4.d
    public final void G(y yVar) {
        Canvas canvas = o4.d.f128822a;
        ((o4.c) yVar).f128816a.drawRenderNode(this.f150198d);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getF150212r() {
        return this.f150212r;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: I, reason: from getter */
    public final float getF150216v() {
        return this.f150216v;
    }

    @Override // r4.d
    public final Matrix J() {
        Matrix matrix = this.f150201g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f150201g = matrix;
        }
        this.f150198d.getMatrix(matrix);
        return matrix;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: K, reason: from getter */
    public final int getA() {
        return this.A;
    }

    @Override // r4.d
    public final void L(int i14, int i15, long j8) {
        this.f150198d.setPosition(i14, i15, ((int) (j8 >> 32)) + i14, ((int) (4294967295L & j8)) + i15);
        this.f150199e = g6.n.c(j8);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getF150211q() {
        return this.f150211q;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: N, reason: from getter */
    public final int getF150204j() {
        return this.f150204j;
    }

    @Override // r4.d
    public final void O(int i14) {
        this.A = i14;
        R();
    }

    public final void P() {
        boolean z14 = this.f150217w;
        boolean z15 = false;
        boolean z16 = z14 && !this.f150202h;
        if (z14 && this.f150202h) {
            z15 = true;
        }
        if (z16 != this.f150218x) {
            this.f150218x = z16;
            this.f150198d.setClipToBounds(z16);
        }
        if (z15 != this.f150219y) {
            this.f150219y = z15;
            this.f150198d.setClipToOutline(z15);
        }
    }

    public final void Q(RenderNode renderNode, int i14) {
        b.f150137b.getClass();
        if (i14 == b.f150138c) {
            renderNode.setUseCompositingLayer(true, this.f150200f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        int i15 = b.f150139d;
        Paint paint = this.f150200f;
        if (i14 == i15) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i14 = this.A;
        b.a aVar = b.f150137b;
        aVar.getClass();
        int i15 = b.f150138c;
        if (i14 != i15) {
            int i16 = this.f150204j;
            o4.q.f128930b.getClass();
            if (i16 == o4.q.f128933e && this.f150205k == null && this.f150220z == null) {
                Q(this.f150198d, this.A);
                return;
            }
        }
        RenderNode renderNode = this.f150198d;
        aVar.getClass();
        Q(renderNode, i15);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF150203i() {
        return this.f150203i;
    }

    @Override // r4.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final n1 getF150220z() {
        return this.f150220z;
    }

    @Override // r4.d
    public final void c(float f14) {
        this.f150203i = f14;
        this.f150198d.setAlpha(f14);
    }

    @Override // r4.d
    public final void d(e0 e0Var) {
        this.f150205k = e0Var;
        Paint paint = this.f150200f;
        if (paint == null) {
            paint = new Paint();
            this.f150200f = paint;
        }
        paint.setColorFilter(e0Var != null ? e0Var.f128844a : null);
        R();
    }

    @Override // r4.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0 getF150205k() {
        return this.f150205k;
    }

    @Override // r4.d
    public final boolean f() {
        return this.f150198d.hasDisplayList();
    }

    @Override // r4.d
    public final void g(boolean z14) {
        this.f150217w = z14;
        P();
    }

    @Override // r4.d
    public final void h(float f14) {
        this.f150213s = f14;
        this.f150198d.setRotationX(f14);
    }

    @Override // r4.d
    public final void i(float f14) {
        this.f150214t = f14;
        this.f150198d.setRotationY(f14);
    }

    @Override // r4.d
    public final void j(float f14) {
        this.f150210p = f14;
        this.f150198d.setElevation(f14);
    }

    @Override // r4.d
    public final void k(float f14) {
        this.f150215u = f14;
        this.f150198d.setRotationZ(f14);
    }

    @Override // r4.d
    public final void l(int i14) {
        this.f150204j = i14;
        Paint paint = this.f150200f;
        if (paint == null) {
            paint = new Paint();
            this.f150200f = paint;
        }
        paint.setBlendMode(o4.b.a(i14));
        R();
    }

    @Override // r4.d
    public final void m(long j8) {
        this.f150211q = j8;
        this.f150198d.setAmbientShadowColor(f0.j(j8));
    }

    @Override // r4.d
    public final void n(long j8) {
        this.f150212r = j8;
        this.f150198d.setSpotShadowColor(f0.j(j8));
    }

    @Override // r4.d
    public final void o(Outline outline, long j8) {
        this.f150198d.setOutline(outline);
        this.f150202h = outline != null;
        P();
    }

    @Override // r4.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getF150209o() {
        return this.f150209o;
    }

    @Override // r4.d
    public final void q(float f14) {
        this.f150209o = f14;
        this.f150198d.setTranslationY(f14);
    }

    @Override // r4.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getF150208n() {
        return this.f150208n;
    }

    @Override // r4.d
    public final void s(float f14) {
        this.f150216v = f14;
        this.f150198d.setCameraDistance(f14);
    }

    @Override // r4.d
    public final void t(n1 n1Var) {
        RenderEffect renderEffectA;
        this.f150220z = n1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            p pVar = p.f150252a;
            RenderNode renderNode = this.f150198d;
            pVar.getClass();
            if (n1Var != null) {
                renderEffectA = n1Var.f128896a;
                if (renderEffectA == null) {
                    renderEffectA = n1Var.a();
                    n1Var.f128896a = renderEffectA;
                }
            } else {
                renderEffectA = null;
            }
            renderNode.setRenderEffect(renderEffectA);
        }
    }

    @Override // r4.d
    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getF150210p() {
        return this.f150210p;
    }

    @Override // r4.d
    public final void v(float f14) {
        this.f150206l = f14;
        this.f150198d.setScaleX(f14);
    }

    @Override // r4.d
    public final void w(float f14) {
        this.f150207m = f14;
        this.f150198d.setScaleY(f14);
    }

    @Override // r4.d
    public final void x(float f14) {
        this.f150208n = f14;
        this.f150198d.setTranslationX(f14);
    }

    @Override // r4.d
    public final void y(g6.c cVar, g6.o oVar, c cVar2, c.b bVar) {
        q4.a aVar = this.f150197c;
        RecordingCanvas recordingCanvasBeginRecording = this.f150198d.beginRecording();
        try {
            z zVar = this.f150196b;
            o4.c cVar3 = zVar.f129040a;
            Canvas canvas = cVar3.f128816a;
            cVar3.f128816a = recordingCanvasBeginRecording;
            q4.a.b bVar2 = aVar.f142543b;
            bVar2.g(cVar);
            bVar2.h(oVar);
            bVar2.f142551b = cVar2;
            bVar2.c(this.f150199e);
            bVar2.f(cVar3);
            bVar.invoke(aVar);
            zVar.f129040a.f128816a = canvas;
        } finally {
            this.f150198d.endRecording();
        }
    }

    @Override // r4.d
    public final void z() {
        this.f150198d.discardDisplayList();
    }

    public /* synthetic */ h(long j8, z zVar, q4.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? new z() : zVar, (i14 & 4) != 0 ? new q4.a() : aVar);
    }
}
