package o72;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.gfdi.framework.FileManagerCompat;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import i3.m8;
import i3.mh;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130376a;

    public /* synthetic */ f0(int i14) {
        this.f130376a = i14;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        c2.t tVar = (c2.t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        n0 n0Var = n0.f130486a;
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(tVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97928e, mVar);
            h4.g.a aVar3 = h4.d.a.f81537o;
            mh.c("95%", b0Var.b(aVar, aVar3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 6, 0, 131068);
            mh.c("Avg SpO₂", b0Var.b(aVar, aVar3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97930g, mVar), mVar, 6, 0, 131068);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        c2.t tVar = (c2.t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        n0 n0Var = n0.f130486a;
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(tVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c("60", b0Var.b(aVar, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar), mVar, 6, 0, 131068);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        c2.t tVar = (c2.t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        n0 n0Var = n0.f130486a;
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(tVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c("60", b0Var.b(aVar, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar), mVar, 6, 0, 131068);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        n0 n0Var = n0.f130486a;
        ((f2.r) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            z72.k.d(0.6f, 10, 2.0f, 14380422, 0, o4.f0.d(4280977638L), n0.f130501p, c2.x2.q(h4.r.S, 200), i53.a.a(new z72.l(0.25f, o4.f0.d(4285295724L), null), new z72.l(0.25f, o4.f0.d(4285295724L), null), new z72.l(0.25f, o4.f0.d(4285295724L), null), new z72.l(0.25f, o4.f0.d(4285295724L), null)), mVar, true);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        n0 n0Var = n0.f130486a;
        ((f2.r) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            z72.k.c(c2.x2.f(h4.r.S, 1.0f), i53.a.a(new z72.l(0.1f, o4.f0.d(4278949439L), null)), null, null, 10, 0.0f, n0.f130487b, mVar, 12779526, 92);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        c2.t tVar = (c2.t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        n0 n0Var = n0.f130486a;
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(tVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97928e, mVar);
            h4.g.a aVar3 = h4.d.a.f81537o;
            mh.c("8", b0Var.b(aVar, aVar3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 6, 0, 131068);
            mh.c("10", b0Var.b(aVar, aVar3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97930g, mVar), mVar, 6, 0, 131068);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        n0 n0Var = n0.f130486a;
        ((f2.r) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            z72.k.c(c2.x2.f(h4.r.S, 1.0f), i53.a.a(new z72.l(0.8f, o4.f0.d(4280977638L), null), new z72.l(0.2f, o4.f0.d(4285295724L), null)), null, null, 10, 0.0f, n0.f130489d, mVar, 12779526, 92);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj, Object obj2, Object obj3) {
        e23.a aVar = (e23.a) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        o0 o0Var = o0.f130507a;
        aVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.r(aVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            d2 d2Var = (d2) c2.f130346a.getF182175a();
            boolean z14 = (iIntValue & 14) == 4;
            Object objQ = mVar.q();
            if (z14) {
                objQ = new m8(aVar, 20);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new m8(aVar, 20);
                    mVar.K(objQ);
                }
            }
            c2.d(d2Var, (e23.l) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        r0 r0Var = r0.f130530a;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            mh.c("", c2.x2.y(h4.r.S, null, 3).then(rVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar, 6, 0, 262140);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj, Object obj2, Object obj3) {
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        r0 r0Var = r0.f130530a;
        ((c2.c1) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.TRUE);
                mVar.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            l72.w1 w1Var = l72.w1.StartTop;
            l72.x1 x1Var2 = l72.x1.Top;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new n02.c(p1Var, 22);
                mVar.K(objQ2);
            }
            b82.a1.a("Tap to see average over it time. Double line", w1Var, x1Var2, 150, 0L, zBooleanValue, (e23.a) objQ2, r0.f130547r, mVar, 113274246, 34);
            h4.r.a aVar = h4.r.S;
            float f14 = 10;
            g6.f.a aVar2 = g6.f.f75994b;
            c2.l.f(c2.x2.u(aVar, f14), mVar);
            Object objQ3 = mVar.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.TRUE);
                mVar.K(objQ3);
            }
            p3.p1 p1Var2 = (p3.p1) objQ3;
            l72.x1 x1Var3 = l72.x1.Center;
            boolean zBooleanValue2 = ((Boolean) p1Var2.getF182175a()).booleanValue();
            Object objQ4 = mVar.q();
            if (objQ4 == c2565a) {
                objQ4 = new n02.c(p1Var2, 23);
                mVar.K(objQ4);
            }
            b82.a1.a("Tap to see average over it time. Double line", w1Var, x1Var3, 150, 0L, zBooleanValue2, (e23.a) objQ4, r0.f130548s, mVar, 113274246, 34);
            c2.l.f(c2.x2.u(aVar, f14), mVar);
            Object objQ5 = mVar.q();
            if (objQ5 == c2565a) {
                objQ5 = p3.p0.n(Boolean.TRUE);
                mVar.K(objQ5);
            }
            p3.p1 p1Var3 = (p3.p1) objQ5;
            long j8 = (((long) 0) << 32) | (((long) 30) & 4294967295L);
            g6.k.a aVar3 = g6.k.f76003b;
            l72.x1 x1Var4 = l72.x1.Bottom;
            boolean zBooleanValue3 = ((Boolean) p1Var3.getF182175a()).booleanValue();
            Object objQ6 = mVar.q();
            if (objQ6 == c2565a) {
                objQ6 = new n02.c(p1Var3, 24);
                mVar.K(objQ6);
            }
            b82.a1.a("Tap to see average over it time. Double line", w1Var, x1Var4, 150, j8, zBooleanValue3, (e23.a) objQ6, r0.f130549t, mVar, 113470854, 2);
            c2.l.f(c2.x2.u(aVar, f14), mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        r0 r0Var = r0.f130530a;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            mh.c("", c2.x2.y(h4.r.S, null, 3).then(rVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar, 6, 0, 262140);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        r0 r0Var = r0.f130530a;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            mh.c("", c2.x2.y(h4.r.S, null, 3).then(rVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar, 6, 0, 262140);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p005kotlin.jvm.internal.j jVar = null;
        switch (this.f130376a) {
            case 0:
                c2.t2 t2Var = (c2.t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                g0 g0Var = g0.f130383a;
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    l72.x0.a aVar = new l72.x0.a(fb1.c.i(gl.c.f77766a, mVar), jVar);
                    z3.e eVar = g0.f130385c;
                    int i14 = iIntValue & 14;
                    int i15 = l72.x0.f111348c;
                    x0Var.f(1597872 | i14 | (i15 << 24), 80, null, t2Var, eVar, null, "90", "Average", "bpm", aVar, mVar);
                    x0Var.h(t2Var, mVar, (i15 << 3) | i14);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                c2.t2 t2Var2 = (c2.t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                g0 g0Var2 = g0.f130383a;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", "Average heart rate, 90 beats per minute");
                    b92.a aVarB = c0235a.b();
                    int i16 = iIntValue2 & 14;
                    int i17 = b92.a.f16960b;
                    int i18 = l72.x0.f111348c;
                    x0Var2.a((i18 << 24) | i16 | 25008, 52, aVarB, t2Var2, null, null, "90", "Average", "bpm", null, mVar2);
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    c0235a2.f16962a.put("merge", "Hear rate variability, 37 milliseconds");
                    x0Var2.b(i16 | 1597872 | (i18 << 27), 84, c0235a2.b(), t2Var2, null, null, "37", "HRV (RMSSD)", "ms", null, mVar2, false);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                c2.t2 t2Var3 = (c2.t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                g0 g0Var3 = g0.f130383a;
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 19) != 18)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarC = c2.l.C(t2Var3.c(aVar2, h4.d.a.f81534l), 4, 0.0f, 0.0f, 0.0f, 14);
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    p3.i2 i2VarX = mVar3.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar4);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                    c2.u uVar = c2.u.f22885a;
                    c2.q.a(u1.n.e(l4.k.b(c2.x2.q(aVar2, 20), k2.i.f102406a), ds.e0.b(d92.b.f58623a, mVar3), o4.m1.f128891a), mVar3, 0);
                    h4.r rVarC3 = uVar.c(aVar2, h4.d.a.f81528f);
                    d92.b.f58624b.getClass();
                    mh.c("x2", rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(d92.c.e(j92.f.f97935l), d92.b.a(mVar3).h().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar3, 6, 0, 131068);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                c2.t2 t2Var4 = (c2.t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                g0 g0Var4 = g0.f130383a;
                t2Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(t2Var4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    int i19 = iIntValue4;
                    l72.x0 x0Var3 = l72.x0.f111346a;
                    int i24 = i19 & 14;
                    int i25 = l72.x0.f111348c << 24;
                    x0Var3.a(i24 | 25008 | i25, 116, null, t2Var4, null, null, "Metric", "Data Label", "Unit", null, mVar4);
                    x0Var3.a(i24 | 221616 | i25, 100, null, t2Var4, g0.f130388f, null, "Metric", "Data Label", "Unit", null, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                c2.t2 t2Var5 = (c2.t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                g0 g0Var5 = g0.f130383a;
                t2Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(t2Var5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    l72.x0 x0Var4 = l72.x0.f111346a;
                    l72.x0.a aVar5 = new l72.x0.a(fb1.c.i(gl.c.f77766a, mVar5), jVar);
                    int i26 = (l72.x0.f111348c << 24) | (iIntValue5 & 14) | 432;
                    x0Var4.a(i26, 120, null, t2Var5, null, null, "Metric", "Data Label", null, aVar5, mVar5);
                    x0Var4.a(i26, 120, null, t2Var5, null, null, "Metric", "Data Label", null, new l72.x0.c(gl.c.a(mVar5).i(), jVar), mVar5);
                    x0Var4.a(i26, 124, null, t2Var5, null, null, "Metric", "Data Label", null, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                c2.t2 t2Var6 = (c2.t2) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                g0 g0Var6 = g0.f130383a;
                t2Var6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(t2Var6) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    List listK = p13.x.k("m", "h");
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.i0 i0Var = new s5.i0(0L, o53.f0.H(g6.q.d(j92.f.f97932i.f157322a.fontSize), 4294967296L), (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX, (p005kotlin.jvm.internal.j) null);
                    s5.c.b bVar2 = new s5.c.b(0, 1, null);
                    for (String str : d53.w.W("2 h 20 m", new String[]{StringUtils.SPACE})) {
                        if (listK.contains(str)) {
                            int iJ = bVar2.j(i0Var);
                            try {
                                bVar2.b(str);
                                Unit unit = Unit.INSTANCE;
                                bVar2.f(iJ);
                            } catch (Throwable th3) {
                                bVar2.f(iJ);
                                throw th3;
                            }
                        } else {
                            bVar2.b(str);
                        }
                        bVar2.b(StringUtils.SPACE);
                    }
                    s5.c cVarK = bVar2.k();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.d(cVarK, t2Var6.b(h4.r.S), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97929f, mVar6), mVar6, 0, 0, 262140);
                    p3.x1 x1Var7 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                c2.t2 t2Var7 = (c2.t2) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                g0 g0Var7 = g0.f130383a;
                t2Var7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(t2Var7) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    l72.x0 x0Var5 = l72.x0.f111346a;
                    z3.e eVar2 = g0.f130391i;
                    int i27 = iIntValue7 & 14;
                    int i28 = l72.x0.f111348c;
                    x0Var5.c(t2Var7, eVar2, "Data Label", null, null, null, mVar7, i27 | 432 | (i28 << 18), 28);
                    x0Var5.h(t2Var7, mVar7, i27 | (i28 << 3));
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                l0 l0Var = l0.f130464a;
                ((c2.t2) obj).getClass();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                c2.t tVar = (c2.t) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                n0 n0Var = n0.f130486a;
                tVar.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(tVar) ? 4 : 2;
                }
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 19) != 18)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC4 = tVar.c(aVar6, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar9, 0);
                    int iHashCode2 = Long.hashCode(mVar9.getU());
                    p3.i2 i2VarX2 = mVar9.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar9);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar7);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar9);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar9, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar9);
                    c2.b0 b0Var = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97928e, mVar9);
                    h4.g.a aVar8 = h4.d.a.f81537o;
                    mh.c("11,548", b0Var.b(aVar6, aVar8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar9, 6, 0, 131068);
                    mh.c("10,000", b0Var.b(aVar6, aVar8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97930g, mVar9), mVar9, 6, 0, 131068);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                c2.t tVar2 = (c2.t) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                n0 n0Var2 = n0.f130486a;
                tVar2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(tVar2) ? 4 : 2;
                }
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 19) != 18)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC6 = tVar2.c(aVar9, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar10, 0);
                    int iHashCode3 = Long.hashCode(mVar10.getU());
                    p3.i2 i2VarX3 = mVar10.x();
                    h4.r rVarC7 = h4.k.c(rVarC6, mVar10);
                    h5.g.V.getClass();
                    h5.e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar10);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar10);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar10, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC7, mVar10);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c("7h 2m", b0Var2.b(aVar9, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar10), mVar10, 6, 0, 131068);
                    mVar10.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                n0 n0Var3 = n0.f130486a;
                ((f2.r) obj).getClass();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    g6.f.a aVar11 = g6.f.f75994b;
                    z72.k.c(c2.x2.f(h4.r.S, 1.0f), i53.a.a(new z72.l(0.55f, o4.f0.d(4278209440L), null), new z72.l(0.3f, o4.f0.d(4279858898L), null), new z72.l(0.1f, o4.f0.d(4289463996L), null), new z72.l(0.05f, o4.f0.d(4293753301L), null)), null, null, 10, 2.0f, n0.f130491f, mVar11, 14352390, 28);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                c2.t tVar3 = (c2.t) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                n0 n0Var4 = n0.f130486a;
                tVar3.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(tVar3) ? 4 : 2;
                }
                if (mVar12.n(1 & iIntValue12, (iIntValue12 & 19) != 18)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    h4.r.a aVar12 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC8 = tVar3.c(aVar12, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    c2.z zVarA3 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar12, 0);
                    int iHashCode4 = Long.hashCode(mVar12.getU());
                    p3.i2 i2VarX4 = mVar12.x();
                    h4.r rVarC9 = h4.k.c(rVarC8, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar13);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar12);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar12, iHashCode4, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC9, mVar12);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97928e, mVar12);
                    h4.g.a aVar14 = h4.d.a.f81537o;
                    mh.c(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, b0Var3.b(aVar12, aVar14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar12, 6, 0, 131068);
                    mh.c("Period Day", b0Var3.b(aVar12, aVar14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97930g, mVar12), mVar12, 6, 0, 131068);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                n0 n0Var5 = n0.f130486a;
                ((f2.r) obj).getClass();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                    g6.f.a aVar15 = g6.f.f75994b;
                    z72.k.c(c2.x2.f(h4.r.S, 1.0f), i53.a.a(new z72.l(0.2f, o4.f0.d(4292095938L), null), new z72.l(0.1f, o4.f0.d(4285295724L), null), new z72.l(0.3f, o4.f0.d(4280857678L), null), new z72.l(0.4f, o4.f0.d(4285295724L), null)), Float.valueOf(0.1f), null, 10, 2.0f, n0.f130493h, mVar13, 14352774, 24);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                c2.t tVar4 = (c2.t) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                n0 n0Var6 = n0.f130486a;
                tVar4.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar14.B(tVar4) ? 4 : 2;
                }
                if (mVar14.n(1 & iIntValue14, (iIntValue14 & 19) != 18)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC10 = tVar4.c(aVar16, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    c2.z zVarA4 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar14, 0);
                    int iHashCode5 = Long.hashCode(mVar14.getU());
                    p3.i2 i2VarX5 = mVar14.x();
                    h4.r rVarC11 = h4.k.c(rVarC10, mVar14);
                    h5.g.V.getClass();
                    h5.e0.a aVar17 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar17);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA4, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar14);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar14, iHashCode5, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC11, mVar14);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB3 = d92.c.b(j92.f.f97928e, mVar14);
                    h4.g.a aVar18 = h4.d.a.f81537o;
                    mh.c("162", b0Var4.b(aVar16, aVar18), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, mVar14, 6, 0, 131068);
                    mh.c("bpm", b0Var4.b(aVar16, aVar18), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar14), mVar14, 6, 0, 131068);
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                n0 n0Var7 = n0.f130486a;
                ((f2.r) obj).getClass();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    p3.x1 x1Var16 = p3.n.f135158a;
                    g6.f.a aVar19 = g6.f.f75994b;
                    z72.k.a(c2.x2.f(h4.r.S, 1.0f), i53.a.a(new z72.l(0.25f, o4.f0.d(4285433236L), null), new z72.l(0.25f, o4.f0.d(4280977638L), null), new z72.l(0.083333336f, o4.f0.d(4283738622L), null), new z72.l(0.083333336f, o4.f0.d(4284535413L), null), new z72.l(0.083333336f, o4.f0.d(4294810937L), null), new z72.l(0.25f, o4.f0.d(4293803582L), null)), Float.valueOf(0.9f), null, Float.valueOf(0.3f), 10, 0.0f, true, false, n0.f130495j, mVar15, 818110854, 328);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                return a(obj, obj2, obj3);
            case 16:
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                n0 n0Var8 = n0.f130486a;
                ((f2.r) obj).getClass();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    p3.x1 x1Var17 = p3.n.f135158a;
                    g6.f.a aVar20 = g6.f.f75994b;
                    z72.k.a(c2.x2.f(h4.r.S, 1.0f), i53.a.a(new z72.l(0.25f, o4.f0.d(4291774982L), null), new z72.l(0.25f, o4.f0.d(4294080278L), null), new z72.l(0.25f, o4.f0.d(4294625864L), null), new z72.l(0.25f, o4.f0.d(4279674180L), null)), Float.valueOf(0.9f), null, null, 10, 2.0f, false, false, n0.f130497l, mVar16, 807076230, 408);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 17:
                return b(obj, obj2, obj3);
            case 18:
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                n0 n0Var9 = n0.f130486a;
                ((f2.r) obj).getClass();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    p3.x1 x1Var18 = p3.n.f135158a;
                    g6.f.a aVar21 = g6.f.f75994b;
                    z72.k.b(0.6f, 10, 2.0f, 102436230, SyslogConstants.LOG_LOCAL2, o4.f0.d(4280977638L), n0.f130499n, c2.x2.q(h4.r.S, 200), i53.a.a(new z72.l(0.25f, o4.f0.d(4285295724L), null), new z72.l(0.25f, o4.f0.d(4285295724L), null), new z72.l(0.25f, o4.f0.d(4285295724L), null), new z72.l(0.25f, o4.f0.d(4285295724L), null)), mVar17, false);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 19:
                return c(obj, obj2, obj3);
            case 20:
                return d(obj, obj2, obj3);
            case 21:
                return e(obj, obj2, obj3);
            case 22:
                return f(obj, obj2, obj3);
            case 23:
                return g(obj, obj2, obj3);
            case 24:
                return h(obj, obj2, obj3);
            case 25:
                return i(obj, obj2, obj3);
            case 26:
                return j(obj, obj2, obj3);
            case 27:
                return k(obj, obj2, obj3);
            case 28:
                return l(obj, obj2, obj3);
            default:
                h4.r rVar = (h4.r) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                r0 r0Var = r0.f130530a;
                rVar.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= mVar18.B(rVar) ? 4 : 2;
                }
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    p3.x1 x1Var19 = p3.n.f135158a;
                    mh.c("", c2.x2.y(h4.r.S, null, 3).then(rVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar18, 6, 0, 262140);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
        }
    }
}
