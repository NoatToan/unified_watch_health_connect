package da0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import c2.x2;
import ca0.q1;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import kotlin.t1;
import o4.f1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import u1.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static final void a(float f14, p3.m mVar, int i14) {
        int i15;
        int i16;
        o0 o0VarE = mVar.E(247388763);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.i(f14) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            x3 x3VarB = s1.f.b(f14, null, null, o0VarE, i15 & 14, 30);
            g6.c cVar = (g6.c) o0VarE.A(t1.f91490h);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(0.0f, o0VarE);
            }
            final m1 m1Var = (m1) objQ;
            final float floatValue = m1Var.getFloatValue() * 1.15f;
            float fD1 = cVar.d1(floatValue);
            boolean zI = o0VarE.i(((Number) x3VarB.getF182175a()).floatValue()) | o0VarE.i(m1Var.getFloatValue());
            Object objQ2 = o0VarE.q();
            if (zI || objQ2 == c2565a) {
                objQ2 = Float.valueOf(((Number) x3VarB.getF182175a()).floatValue() - (floatValue / 2));
                o0VarE.K(objQ2);
            }
            final float fFloatValue = ((Number) objQ2).floatValue();
            float fD2 = cVar.d1(fFloatValue);
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new q1(m1Var, 1);
                o0VarE.K(objQ3);
            }
            h4.r rVarF = f5.g0.f(rVarD, (e23.l) objQ3);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            t4.d dVarA = n5.c.a(R.drawable.device_setup_2_flashlight, o0VarE, 0);
            f5.k.f68985a.getClass();
            f5.k.a.C1427a c1427a = f5.k.a.f68987b;
            i16 = 0;
            y0.a(dVarA, null, c2.l.v(x2.r(aVar, fD1, fD1), 0.0f, fD2, 1), null, c1427a, 0.0f, null, o0VarE, 24624, 104);
            y0.a(n5.c.a(R.drawable.device_setup_2_background, o0VarE, 0), null, l4.k.a(x2.d(aVar, 1.0f), 0.15f), null, c1427a, 0.0f, null, o0VarE, 25008, 104);
            final long jB = tn.k.b(d92.b.f58623a, o0VarE);
            h4.r rVarD2 = x2.d(aVar, 1.0f);
            boolean zL = o0VarE.l(jB) | o0VarE.i(floatValue) | o0VarE.i(fFloatValue);
            Object objQ4 = o0VarE.q();
            if (zL || objQ4 == c2565a) {
                e23.l lVar = new e23.l() { // from class: da0.g
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        o4.y yVarA = fVar.getF142543b().a();
                        o4.h hVar = new o4.h();
                        hVar.e(jB);
                        o4.j jVarA = o4.m.a();
                        Path path = jVarA.f128869b;
                        m1 m1Var2 = m1Var;
                        float floatValue2 = m1Var2.getFloatValue();
                        float f15 = floatValue;
                        float f16 = (f15 - floatValue2) / 2;
                        float f17 = -f16;
                        float floatValue3 = m1Var2.getFloatValue() + f16;
                        float f18 = fFloatValue;
                        n4.d dVar = new n4.d(f17, f18, floatValue3, f15 + f18);
                        f1.b bVar2 = f1.b.CounterClockwise;
                        if (jVarA.f128870c == null) {
                            jVarA.f128870c = new RectF();
                        }
                        RectF rectF = jVarA.f128870c;
                        rectF.getClass();
                        rectF.set(dVar.f123547a, dVar.f123548b, dVar.f123549c, dVar.f123550d);
                        RectF rectF2 = jVarA.f128870c;
                        rectF2.getClass();
                        path.addOval(rectF2, o4.m.b(bVar2));
                        Canvas canvasA = o4.d.a(yVarA);
                        int iSave = canvasA.save();
                        try {
                            ((o4.c) yVarA).f128816a.clipOutPath(path);
                            ((o4.c) yVarA).f128816a.drawRect(0.0f, 0.0f, Float.intBitsToFloat((int) (fVar.b() >> 32)), Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), hVar.f128857a);
                            return Unit.INSTANCE;
                        } finally {
                            canvasA.restoreToCount(iSave);
                        }
                    }
                };
                o0VarE.K(lVar);
                objQ4 = lVar;
            }
            u1.n.b(rVarD2, (e23.l) objQ4, o0VarE, 6);
            o0VarE.g0(true);
        } else {
            i16 = 0;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(f14, i14, i16);
        }
    }
}
