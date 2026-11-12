package r4;

import android.graphics.Canvas;
import lc.u0;
import o4.b1;
import o4.e0;
import o4.f1;
import o4.y;
import o4.y0;
import p1.i1;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x009e  */
    public static final void a(q4.f fVar, c cVar) {
        boolean z14;
        boolean z15;
        o4.h hVar;
        float f14;
        y yVarA = fVar.getF142543b().a();
        c cVar2 = fVar.getF142543b().f142551b;
        d dVar = cVar.f150141a;
        if (cVar.f150159s) {
            return;
        }
        cVar.a();
        if (!dVar.f()) {
            try {
                cVar.f150141a.y(cVar.f150142b, cVar.f150143c, cVar, cVar.f150145e);
            } catch (Throwable unused) {
            }
        }
        boolean z16 = dVar.getF150241v() > 0.0f;
        if (z16) {
            yVarA.t();
        }
        Canvas canvasA = o4.d.a(yVarA);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (zIsHardwareAccelerated) {
            z14 = true;
        } else {
            long j8 = cVar.f150160t;
            g6.k.a aVar = g6.k.f76003b;
            float f15 = (int) (j8 >> 32);
            float f16 = (int) (j8 & 4294967295L);
            z14 = true;
            long j14 = cVar.f150161u;
            float f17 = f15 + ((int) (j14 >> 32));
            float f18 = ((int) (j14 & 4294967295L)) + f16;
            float f150236q = dVar.getF150236q();
            e0 f150234o = dVar.getF150234o();
            int f150233n = dVar.getF150233n();
            if (f150236q >= 1.0f) {
                o4.q.f128930b.getClass();
                if (f150233n == o4.q.f128933e && f150234o == null) {
                    int f150235p = dVar.getF150235p();
                    b.f150137b.getClass();
                    if (f150235p == b.f150138c) {
                        hVar = cVar.f150156p;
                        if (hVar == null) {
                            hVar = new o4.h();
                            cVar.f150156p = hVar;
                        }
                        hVar.c(f150236q);
                        hVar.k(f150233n);
                        hVar.d(f150234o);
                        f14 = f15;
                        canvasA.saveLayer(f14, f16, f17, f18, o4.i.a(hVar));
                    } else {
                        canvasA.save();
                        f14 = f15;
                    }
                } else {
                    hVar = cVar.f150156p;
                    if (hVar == null) {
                        hVar = new o4.h();
                        cVar.f150156p = hVar;
                    }
                    hVar.c(f150236q);
                    hVar.k(f150233n);
                    hVar.d(f150234o);
                    f14 = f15;
                    canvasA.saveLayer(f14, f16, f17, f18, o4.i.a(hVar));
                }
            } else {
                hVar = cVar.f150156p;
                if (hVar == null) {
                    hVar = new o4.h();
                    cVar.f150156p = hVar;
                }
                hVar.c(f150236q);
                hVar.k(f150233n);
                hVar.d(f150234o);
                f14 = f15;
                canvasA.saveLayer(f14, f16, f17, f18, o4.i.a(hVar));
            }
            canvasA.translate(f14, f16);
            canvasA.concat(dVar.J());
        }
        boolean z17 = (zIsHardwareAccelerated || !cVar.f150163w) ? false : z14;
        if (z17) {
            yVarA.l();
            b1 b1VarD = cVar.d();
            if (b1VarD instanceof b1.b) {
                y.f(yVarA, ((b1.b) b1VarD).f128812a);
            } else if (b1VarD instanceof b1.c) {
                o4.j jVarA = cVar.f150153m;
                if (jVarA != null) {
                    jVarA.rewind();
                } else {
                    jVarA = o4.m.a();
                    cVar.f150153m = jVarA;
                }
                jVarA.k(((b1.c) b1VarD).f128813a, f1.b.CounterClockwise);
                y.h(yVarA, jVarA);
            } else {
                if (!(b1VarD instanceof b1.a)) {
                    u0.r();
                    return;
                }
                y.h(yVarA, ((b1.a) b1VarD).f128811a);
            }
        }
        if (cVar2 != null) {
            a aVar2 = cVar2.f150158r;
            if (!aVar2.f150136e) {
                y0.a("Only add dependencies during a tracking");
            }
            p1.u0<c> u0Var = aVar2.f150134c;
            if (u0Var != null) {
                u0Var.d(cVar);
            } else if (aVar2.f150132a != null) {
                p1.u0<c> u0VarA = i1.a();
                c cVar3 = aVar2.f150132a;
                cVar3.getClass();
                u0VarA.d(cVar3);
                u0VarA.d(cVar);
                aVar2.f150134c = u0VarA;
                aVar2.f150132a = null;
            } else {
                aVar2.f150132a = cVar;
            }
            p1.u0<c> u0Var2 = aVar2.f150135d;
            if (u0Var2 != null) {
                z15 = !u0Var2.l(cVar);
            } else if (aVar2.f150133b != cVar) {
                z15 = z14;
            } else {
                aVar2.f150133b = null;
                z15 = false;
            }
            if (z15) {
                cVar.f150157q++;
            }
        }
        if (((o4.c) yVarA).f128816a.isHardwareAccelerated()) {
            dVar.G(yVarA);
        } else {
            q4.a aVar3 = cVar.f150155o;
            if (aVar3 == null) {
                aVar3 = new q4.a();
                cVar.f150155o = aVar3;
            }
            q4.a.b bVar = aVar3.f142543b;
            g6.c cVar4 = cVar.f150142b;
            g6.o oVar = cVar.f150143c;
            long jC = g6.n.c(cVar.f150161u);
            g6.c cVarD = bVar.d();
            g6.o oVarE = bVar.e();
            y yVarA2 = bVar.a();
            long jB = bVar.b();
            c cVar5 = bVar.f142551b;
            bVar.g(cVar4);
            bVar.h(oVar);
            bVar.f(yVarA);
            bVar.c(jC);
            bVar.f142551b = cVar;
            yVarA.l();
            try {
                cVar.c(aVar3);
                yVarA.i();
                bVar.g(cVarD);
                bVar.h(oVarE);
                bVar.f(yVarA2);
                bVar.c(jB);
                bVar.f142551b = cVar5;
            } catch (Throwable th3) {
                yVarA.i();
                bVar.g(cVarD);
                bVar.h(oVarE);
                bVar.f(yVarA2);
                bVar.c(jB);
                bVar.f142551b = cVar5;
                throw th3;
            }
        }
        if (z17) {
            yVarA.i();
        }
        if (z16) {
            yVarA.e();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }
}
