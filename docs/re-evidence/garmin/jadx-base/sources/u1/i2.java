package u1;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu1/i2;", "Lh5/m;", "Lh5/s;", "Lh5/j;", "pointerInputNode", "Lu1/i;", "overscrollEffect", "Lu1/k0;", "edgeEffectWrapper", "<init>", "(Lh5/j;Lu1/i;Lu1/k0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i2 extends h5.m implements h5.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f167567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f167568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RenderNode f167569e;

    public i2(h5.j jVar, i iVar, k0 k0Var) {
        this.f167567c = iVar;
        this.f167568d = k0Var;
        U1(jVar);
    }

    public static boolean X1(float f14, EdgeEffect edgeEffect, Canvas canvas) {
        if (f14 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f14);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode Y1() {
        RenderNode renderNode = this.f167569e;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeB = h2.b();
        this.f167569e = renderNodeB;
        return renderNodeB;
    }

    @Override // h5.s
    public final void p(h5.h0 h0Var) {
        boolean zX1;
        char c14;
        q4.a aVar = h0Var.f81825a;
        long jB = aVar.b();
        i iVar = this.f167567c;
        iVar.k(jB);
        Canvas canvasA = o4.d.a(aVar.f142543b.a());
        iVar.f167536d.getF182175a();
        if (n4.g.h(aVar.b())) {
            h0Var.m1();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        k0 k0Var = this.f167568d;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = k0Var.f167584d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = k0Var.f167585e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = k0Var.f167586f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = k0Var.f167587g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = k0Var.f167588h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = k0Var.f167589i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = k0Var.f167590j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = k0Var.f167591k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            h0Var.m1();
            return;
        }
        float fS0 = h0Var.s0(a0.f167346a);
        boolean z14 = k0.f(k0Var.f167584d) || k0.g(k0Var.f167588h) || k0.f(k0Var.f167585e) || k0.g(k0Var.f167589i);
        boolean z15 = k0.f(k0Var.f167586f) || k0.g(k0Var.f167590j) || k0.f(k0Var.f167587g) || k0.g(k0Var.f167591k);
        if (z14 && z15) {
            Y1().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z14) {
            Y1().setPosition(0, 0, (MathKt.c(fS0) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z15) {
                h0Var.m1();
                return;
            }
            Y1().setPosition(0, 0, canvasA.getWidth(), (MathKt.c(fS0) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = Y1().beginRecording();
        if (k0.g(k0Var.f167590j)) {
            EdgeEffect edgeEffectA = k0Var.f167590j;
            if (edgeEffectA == null) {
                edgeEffectA = k0Var.a(p008y1.b2.Horizontal);
                k0Var.f167590j = edgeEffectA;
            }
            X1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (k0.f(k0Var.f167586f)) {
            EdgeEffect edgeEffectC = k0Var.c();
            zX1 = X1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (k0.g(k0Var.f167586f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (iVar.e() & 4294967295L));
                i0 i0Var = i0.f167546a;
                EdgeEffect edgeEffectA2 = k0Var.f167590j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = k0Var.a(p008y1.b2.Horizontal);
                    k0Var.f167590j = edgeEffectA2;
                }
                i0Var.getClass();
                i0.d(edgeEffectA2, i0.b(edgeEffectC), 1 - fIntBitsToFloat);
            }
        } else {
            zX1 = false;
        }
        if (k0.g(k0Var.f167588h)) {
            EdgeEffect edgeEffectA3 = k0Var.f167588h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = k0Var.a(p008y1.b2.Vertical);
                k0Var.f167588h = edgeEffectA3;
            }
            X1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (k0.f(k0Var.f167584d)) {
            EdgeEffect edgeEffectE = k0Var.e();
            zX1 = X1(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zX1;
            c14 = ' ';
            if (k0.g(k0Var.f167584d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iVar.e() >> 32));
                i0 i0Var2 = i0.f167546a;
                EdgeEffect edgeEffectA4 = k0Var.f167588h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = k0Var.a(p008y1.b2.Vertical);
                    k0Var.f167588h = edgeEffectA4;
                }
                i0Var2.getClass();
                i0.d(edgeEffectA4, i0.b(edgeEffectE), fIntBitsToFloat2);
            }
        } else {
            c14 = ' ';
        }
        if (k0.g(k0Var.f167591k)) {
            EdgeEffect edgeEffectA5 = k0Var.f167591k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = k0Var.a(p008y1.b2.Horizontal);
                k0Var.f167591k = edgeEffectA5;
            }
            X1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (k0.f(k0Var.f167587g)) {
            EdgeEffect edgeEffectD = k0Var.d();
            zX1 = X1(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zX1;
            if (k0.g(k0Var.f167587g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (iVar.e() & 4294967295L));
                i0 i0Var3 = i0.f167546a;
                EdgeEffect edgeEffectA6 = k0Var.f167591k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = k0Var.a(p008y1.b2.Horizontal);
                    k0Var.f167591k = edgeEffectA6;
                }
                i0Var3.getClass();
                i0.d(edgeEffectA6, i0.b(edgeEffectD), fIntBitsToFloat3);
            }
        }
        if (k0.g(k0Var.f167589i)) {
            EdgeEffect edgeEffectA7 = k0Var.f167589i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = k0Var.a(p008y1.b2.Vertical);
                k0Var.f167589i = edgeEffectA7;
            }
            X1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        }
        if (k0.f(k0Var.f167585e)) {
            EdgeEffect edgeEffectB = k0Var.b();
            boolean z16 = X1(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zX1;
            if (k0.g(k0Var.f167585e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (iVar.e() >> c14));
                i0 i0Var4 = i0.f167546a;
                EdgeEffect edgeEffectA8 = k0Var.f167589i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = k0Var.a(p008y1.b2.Vertical);
                    k0Var.f167589i = edgeEffectA8;
                }
                i0Var4.getClass();
                i0.d(edgeEffectA8, i0.b(edgeEffectB), 1 - fIntBitsToFloat4);
            }
            zX1 = z16;
        }
        if (zX1) {
            iVar.f();
        }
        float f14 = z15 ? 0.0f : fS0;
        if (z14) {
            fS0 = 0.0f;
        }
        g6.o layoutDirection = h0Var.getLayoutDirection();
        o4.c cVar = new o4.c();
        cVar.f128816a = recordingCanvasBeginRecording;
        long jB2 = aVar.b();
        g6.c cVarD = aVar.f142543b.d();
        g6.o oVarE = aVar.f142543b.e();
        o4.y yVarA = aVar.f142543b.a();
        long jB3 = aVar.f142543b.b();
        q4.a.b bVar = aVar.f142543b;
        r4.c cVar2 = bVar.f142551b;
        bVar.g(h0Var);
        bVar.h(layoutDirection);
        bVar.f(cVar);
        bVar.c(jB2);
        bVar.f142551b = null;
        cVar.l();
        try {
            aVar.f142543b.f142550a.h(f14, fS0);
            try {
                h0Var.m1();
                float f15 = -f14;
                float f16 = -fS0;
                aVar.f142543b.f142550a.h(f15, f16);
                cVar.i();
                q4.a.b bVar2 = aVar.f142543b;
                bVar2.g(cVarD);
                bVar2.h(oVarE);
                bVar2.f(yVarA);
                bVar2.c(jB3);
                bVar2.f142551b = cVar2;
                Y1().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f15, f16);
                canvasA.drawRenderNode(Y1());
                canvasA.restoreToCount(iSave);
            } catch (Throwable th3) {
                aVar.f142543b.f142550a.h(-f14, -fS0);
                throw th3;
            }
        } catch (Throwable th4) {
            cVar.i();
            q4.a.b bVar3 = aVar.f142543b;
            bVar3.g(cVarD);
            bVar3.h(oVarE);
            bVar3.f(yVarA);
            bVar3.c(jB3);
            bVar3.f142551b = cVar2;
            throw th4;
        }
    }
}
