package g11;

import am.i1;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import ch.qos.logback.core.net.SyslogConstants;
import f02.u;
import f5.z0;
import g02.t0;
import g21.f0;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    public static final void a(final r rVar, float f14, float f15, final z3.e eVar, p3.m mVar, final int i14) {
        o0 o0VarE = mVar.E(97437089);
        int i15 = i14 | SyslogConstants.LOG_LOCAL2;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                d92.b bVar = d92.b.f58623a;
                bVar.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f16 = eVar2.f97917b;
                bVar.getClass();
                bVar2.getClass();
                f15 = eVar2.f97918c;
                f14 = f16;
            } else {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            boolean zI = o0VarE.i(f14) | o0VarE.i(f15);
            Object objQ = o0VarE.q();
            if (zI) {
                objQ = new b(f14, f15);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b(f14, f15);
                    o0VarE.K(objQ);
                }
            }
            z0 z0Var = (z0) objQ;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0Var, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b71.i.n(6, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        final float f17 = f14;
        final float f18 = f15;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(f17, f18, eVar, i14) { // from class: g11.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f74841b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f74842c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ z3.e f74843d;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(3079);
                    c.a(this.f74840a, this.f74841b, this.f74842c, this.f74843d, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098 A[PHI: r0
      0x0098: PHI (r0v23 c2.j$l) = (r0v16 c2.j$l), (r0v25 c2.j$l) binds: [B:53:0x00a1, B:50:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x0148  */
    /* JADX WARN: Code duplicated, block: B:80:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void b(r rVar, c2.j.l lVar, v21.e eVar, f0 f0Var, boolean z14, p3.m mVar, int i14, int i15) {
        boolean z15;
        boolean z16;
        c2.j.l lVar2;
        boolean z17;
        p2 p2VarI0;
        c2.j.l lVar3;
        boolean z18;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        Double d14;
        double dDoubleValue;
        Double d15;
        double dDoubleValue2;
        ArrayList arrayList;
        f0Var.getClass();
        o0 o0VarE = mVar.E(-209030512);
        int i16 = ((i14 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i14 : i14) | 48 | (o0VarE.r(eVar) ? 256 : 128) | (o0VarE.B(f0Var) ? 2048 : 1024);
        if ((i15 & 16) != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(false) ? 16384 : 8192;
        }
        int i17 = i15 & 32;
        if (i17 == 0) {
            if ((196608 & i14) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 131072 : 65536;
            }
            if ((74899 & i16) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    c2.j.f22691a.getClass();
                    lVar3 = c2.j.f22698h;
                    if (i17 != 0) {
                        z18 = false;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(lVar3, h4.d.a.f81536n, o0VarE, 6);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    d14 = f0Var.f75420d;
                    if (d14 != null) {
                        dDoubleValue = d14.doubleValue() * 4.0d;
                    } else {
                        dDoubleValue = -1.0d;
                    }
                    u.f67749a.getClass();
                    t0 t0Var = new t0(dDoubleValue, u.g(o0VarE), null);
                    d15 = f0Var.f75419c;
                    if (d15 != null) {
                        dDoubleValue2 = d15.doubleValue() * 9.0d;
                    } else {
                        dDoubleValue2 = -1.0d;
                    }
                    t0 t0Var2 = new t0(dDoubleValue2, u.f(o0VarE), null);
                    Double d16 = f0Var.f75418b;
                    t0 t0Var3 = new t0(d16 != null ? d16.doubleValue() * 4.0d : -1.0d, u.e(o0VarE), null);
                    r.a aVar2 = r.S;
                    c2.j.l lVar4 = lVar3;
                    a(x2.f(aVar2, 1.0f), 0.0f, 0.0f, z3.f.c(-427260707, new i1(eVar, f0Var, z18, 16), o0VarE), o0VarE, 3078);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA = c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97916a, 1);
                    ArrayList arrayListC = p13.u.C(new t0[]{t0Var, t0Var2, t0Var3});
                    arrayList = new ArrayList();
                    for (Object obj : arrayListC) {
                        if (((t0) obj).f74552a > 0.0d) {
                            arrayList.add(obj);
                        }
                    }
                    z01.e.a(0, rVarA, i53.a.j(arrayList), o0VarE);
                    o0VarE.C(1707087880);
                    o0VarE.g0(false);
                    o0VarE.g0(true);
                    x1 x1Var2 = p3.n.f135158a;
                    z17 = z18;
                    lVar2 = lVar4;
                } else {
                    o0VarE.e();
                    lVar3 = lVar;
                }
                z18 = z15;
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                h4.d.f81522a.getClass();
                zVarA = y.a(lVar3, h4.d.a.f81536n, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                d14 = f0Var.f75420d;
                if (d14 != null) {
                    dDoubleValue = d14.doubleValue() * 4.0d;
                } else {
                    dDoubleValue = -1.0d;
                }
                u.f67749a.getClass();
                t0 t0Var4 = new t0(dDoubleValue, u.g(o0VarE), null);
                d15 = f0Var.f75419c;
                if (d15 != null) {
                    dDoubleValue2 = d15.doubleValue() * 9.0d;
                } else {
                    dDoubleValue2 = -1.0d;
                }
                t0 t0Var5 = new t0(dDoubleValue2, u.f(o0VarE), null);
                Double d17 = f0Var.f75418b;
                t0 t0Var6 = new t0(d17 != null ? d17.doubleValue() * 4.0d : -1.0d, u.e(o0VarE), null);
                r.a aVar3 = r.S;
                c2.j.l lVar5 = lVar3;
                a(x2.f(aVar3, 1.0f), 0.0f, 0.0f, z3.f.c(-427260707, new i1(eVar, f0Var, z18, 16), o0VarE), o0VarE, 3078);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA2 = c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97916a, 1);
                ArrayList arrayListC2 = p13.u.C(new t0[]{t0Var4, t0Var5, t0Var6});
                arrayList = new ArrayList();
                while (r5.hasNext()) {
                    if (((t0) obj).f74552a > 0.0d) {
                        arrayList.add(obj);
                    }
                }
                z01.e.a(0, rVarA2, i53.a.j(arrayList), o0VarE);
                o0VarE.C(1707087880);
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var4 = p3.n.f135158a;
                z17 = z18;
                lVar2 = lVar5;
            } else {
                o0VarE.e();
                lVar2 = lVar;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(rVar, lVar2, eVar, f0Var, z17, i14, i15);
            }
        }
        i16 |= 196608;
        z15 = z14;
        if ((74899 & i16) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                c2.j.f22691a.getClass();
                lVar3 = c2.j.f22698h;
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
            } else {
                c2.j.f22691a.getClass();
                lVar3 = c2.j.f22698h;
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
            }
            o0VarE.h0();
            x1 x1Var5 = p3.n.f135158a;
            h4.d.f81522a.getClass();
            zVarA = y.a(lVar3, h4.d.a.f81536n, o0VarE, 6);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var3 = b0.f22601a;
            d14 = f0Var.f75420d;
            if (d14 != null) {
                dDoubleValue = d14.doubleValue() * 4.0d;
            } else {
                dDoubleValue = -1.0d;
            }
            u.f67749a.getClass();
            t0 t0Var7 = new t0(dDoubleValue, u.g(o0VarE), null);
            d15 = f0Var.f75419c;
            if (d15 != null) {
                dDoubleValue2 = d15.doubleValue() * 9.0d;
            } else {
                dDoubleValue2 = -1.0d;
            }
            t0 t0Var8 = new t0(dDoubleValue2, u.f(o0VarE), null);
            Double d18 = f0Var.f75418b;
            t0 t0Var9 = new t0(d18 != null ? d18.doubleValue() * 4.0d : -1.0d, u.e(o0VarE), null);
            r.a aVar4 = r.S;
            c2.j.l lVar6 = lVar3;
            a(x2.f(aVar4, 1.0f), 0.0f, 0.0f, z3.f.c(-427260707, new i1(eVar, f0Var, z18, 16), o0VarE), o0VarE, 3078);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA3 = c2.l.A(aVar4, 0.0f, j92.b.f97899b.f97916a, 1);
            ArrayList arrayListC3 = p13.u.C(new t0[]{t0Var7, t0Var8, t0Var9});
            arrayList = new ArrayList();
            while (r5.hasNext()) {
                if (((t0) obj).f74552a > 0.0d) {
                    arrayList.add(obj);
                }
            }
            z01.e.a(0, rVarA3, i53.a.j(arrayList), o0VarE);
            o0VarE.C(1707087880);
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var6 = p3.n.f135158a;
            z17 = z18;
            lVar2 = lVar6;
        } else {
            o0VarE.e();
            lVar2 = lVar;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(rVar, lVar2, eVar, f0Var, z17, i14, i15);
        }
    }
}
