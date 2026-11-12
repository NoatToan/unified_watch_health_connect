package u1;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu1/r0;", "Lh5/m;", "Lh5/s;", "Lh5/j;", "pointerInputNode", "Lu1/i;", "overscrollEffect", "Lu1/k0;", "edgeEffectWrapper", "Lc2/h2;", "glowDrawPadding", "<init>", "(Lh5/j;Lu1/i;Lu1/k0;Lc2/h2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 extends h5.m implements h5.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f167669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f167670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2.h2 f167671e;

    public r0(h5.j jVar, i iVar, k0 k0Var, c2.h2 h2Var) {
        this.f167669c = iVar;
        this.f167670d = k0Var;
        this.f167671e = h2Var;
        U1(jVar);
    }

    public static boolean X1(float f14, long j8, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f14);
        canvas.translate(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // h5.s
    public final void p(h5.h0 h0Var) {
        boolean zX1;
        char c14;
        long j8;
        q4.a aVar = h0Var.f81825a;
        long jB = aVar.b();
        i iVar = this.f167669c;
        iVar.k(jB);
        if (n4.g.h(aVar.b())) {
            h0Var.m1();
            return;
        }
        h0Var.m1();
        iVar.f167536d.getF182175a();
        Canvas canvasA = o4.d.a(aVar.f142543b.a());
        k0 k0Var = this.f167670d;
        boolean zF = k0.f(k0Var.f167586f);
        c2.h2 h2Var = this.f167671e;
        if (zF) {
            EdgeEffect edgeEffectC = k0Var.c();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(h0Var.s0(h2Var.b(h0Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (aVar.b() & 4294967295L)))) << 32);
            n4.c.a aVar2 = n4.c.f123541b;
            zX1 = X1(270.0f, jFloatToRawIntBits, edgeEffectC, canvasA);
        } else {
            zX1 = false;
        }
        if (k0.f(k0Var.f167584d)) {
            EdgeEffect edgeEffectE = k0Var.e();
            c14 = ' ';
            j8 = 4294967295L;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(h0Var.s0(h2Var.getF22737b()))) & 4294967295L);
            n4.c.a aVar3 = n4.c.f123541b;
            zX1 = X1(0.0f, jFloatToRawIntBits2, edgeEffectE, canvasA) || zX1;
        } else {
            c14 = ' ';
            j8 = 4294967295L;
        }
        if (k0.f(k0Var.f167587g)) {
            EdgeEffect edgeEffectD = k0Var.d();
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(h0Var.s0(h2Var.c(h0Var.getLayoutDirection())) + (-MathKt.c(Float.intBitsToFloat((int) (aVar.b() >> c14)))))) & j8) | (((long) Float.floatToRawIntBits(0.0f)) << c14);
            n4.c.a aVar4 = n4.c.f123541b;
            zX1 = X1(90.0f, jFloatToRawIntBits3, edgeEffectD, canvasA) || zX1;
        }
        if (k0.f(k0Var.f167585e)) {
            EdgeEffect edgeEffectB = k0Var.b();
            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (aVar.b() & j8))) + h0Var.s0(h2Var.getF22739d()))) & j8) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (aVar.b() >> c14)))) << c14);
            n4.c.a aVar5 = n4.c.f123541b;
            zX1 = X1(180.0f, jFloatToRawIntBits4, edgeEffectB, canvasA) || zX1;
        }
        if (zX1) {
            iVar.f();
        }
    }
}
