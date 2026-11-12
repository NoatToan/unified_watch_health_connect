package r82;

import b82.u0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import h5.e0;
import i3.ba;
import i3.mh;
import i3.na;
import i3.sg;
import i3.wa;
import i3.xa;
import l72.v2;
import m4.b0;
import o4.m1;
import o62.s0;
import p005kotlin.Unit;
import p006l2.a2;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:101:0x026d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0271  */
    /* JADX WARN: Code duplicated, block: B:106:0x027d  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:0x0139  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x020a  */
    /* JADX WARN: Code duplicated, block: B:88:0x020c  */
    /* JADX WARN: Code duplicated, block: B:91:0x021a  */
    /* JADX WARN: Code duplicated, block: B:92:0x021c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0224  */
    /* JADX WARN: Code duplicated, block: B:98:0x022c  */
    /* JADX WARN: Code duplicated, block: B:99:0x022f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, a2 a2Var, String str, Integer num, b0 b0Var, e23.l<? super String, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        a2 a2Var2;
        b0 b0Var2;
        boolean z14;
        o0 o0Var;
        Integer num2;
        b0 b0Var3;
        p2 p2VarI0;
        b0 b0Var4;
        boolean z15;
        Object objQ;
        p3.m.a aVar;
        p1 p1Var;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ2;
        int i17;
        lVar.getClass();
        o0 o0VarE = mVar.E(-17144296);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = 16;
        if ((i14 & 48) == 0) {
            a2Var2 = a2Var;
            i16 |= o0VarE.B(a2Var2) ? 32 : 16;
        } else {
            a2Var2 = a2Var;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(num) ? 2048 : 1024;
        }
        int i19 = i15 & 16;
        if (i19 == 0) {
            if ((i14 & 24576) == 0) {
                b0Var2 = b0Var;
                i16 |= o0VarE.B(b0Var2) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.r(lVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i16 |= i17;
            }
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i19 != 0) {
                    b0Var4 = null;
                } else {
                    b0Var4 = b0Var2;
                }
                x1 x1Var = p3.n.f135158a;
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                aVar = p3.m.f135153a;
                if (z15) {
                    objQ = p0.n(str);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p0.n(str);
                        o0VarE.K(objQ);
                    }
                }
                p1Var = (p1) objQ;
                h4.d.f81522a.getClass();
                h4.g.a aVar3 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var5 = c2.b0.f22601a;
                String str2 = (String) p1Var.getF182175a();
                h4.r rVarX = x2.x(h4.r.S, null, 3);
                if (b0Var4 != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                h4.r rVarA = v2.a(rVarX, z16, new s0(b0Var4, i18), o0VarE, 6);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarW = x2.w(rVarA, j92.b.f97899b.f97922g, 0.0f, 2);
                d92.b.f58624b.getClass();
                x0 x0Var = j92.f.f97929f;
                d6.h.f57752b.getClass();
                x0 x0VarA = x0.a(x0Var, 0L, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744447);
                m1.a aVar4 = m1.f128891a;
                ba baVar = ba.f87580a;
                long jA = d92.b.a(o0VarE).j().a();
                long jY = sn.a.y(o0VarE);
                long jE = d92.b.a(o0VarE).e().e();
                baVar.getClass();
                b0 b0Var6 = b0Var4;
                sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jE, null, jA, jY, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, o0VarE, 2147477247);
                if ((i16 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zB = o0VarE.B(p1Var) | z17;
                if ((i16 & 458752) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zB | z18;
                objQ2 = o0VarE.q();
                if (z19) {
                    num2 = num;
                    objQ2 = new r(num2, lVar, p1Var, 0);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        num2 = num;
                        objQ2 = new r(num2, lVar, p1Var, 0);
                        o0VarE.K(objQ2);
                    } else {
                        num2 = num;
                    }
                }
                na.a(str2, (e23.l) objQ2, rVarW, false, false, x0VarA, null, null, a2Var2, null, true, 0, 0, aVar4, sgVarC, o0VarE, 0, ((i16 << 12) & 458752) | 12582912, 48, 1933272);
                o0Var = o0VarE;
                o0Var.g0(true);
                b0Var3 = b0Var6;
            } else {
                o0Var = o0VarE;
                num2 = num;
                o0Var.e();
                b0Var3 = b0Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new u0(rVar, a2Var, str, num2, b0Var3, lVar, i14, i15);
            }
        }
        i16 |= 24576;
        b0Var2 = b0Var;
        if ((196608 & i14) == 0) {
            if (o0VarE.r(lVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i16 |= i17;
        }
        if ((74899 & i16) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i19 != 0) {
                b0Var4 = null;
            } else {
                b0Var4 = b0Var2;
            }
            x1 x1Var2 = p3.n.f135158a;
            if ((i16 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ = o0VarE.q();
            aVar = p3.m.f135153a;
            if (z15) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p0.n(str);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = p0.n(str);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            zVarA = y.a(c2.j.f22694d, aVar5, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            c2.b0 b0Var7 = c2.b0.f22601a;
            String str3 = (String) p1Var.getF182175a();
            h4.r rVarX2 = x2.x(h4.r.S, null, 3);
            if (b0Var4 != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            h4.r rVarA2 = v2.a(rVarX2, z16, new s0(b0Var4, i18), o0VarE, 6);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarW2 = x2.w(rVarA2, j92.b.f97899b.f97922g, 0.0f, 2);
            d92.b.f58624b.getClass();
            x0 x0Var2 = j92.f.f97929f;
            d6.h.f57752b.getClass();
            x0 x0VarA2 = x0.a(x0Var2, 0L, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744447);
            m1.a aVar6 = m1.f128891a;
            ba baVar2 = ba.f87580a;
            long jA2 = d92.b.a(o0VarE).j().a();
            long jY2 = sn.a.y(o0VarE);
            long jE2 = d92.b.a(o0VarE).e().e();
            baVar2.getClass();
            b0 b0Var8 = b0Var4;
            sg sgVarC2 = ba.c(0L, 0L, 0L, 0L, 0L, jE2, null, jA2, jY2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, o0VarE, 2147477247);
            if ((i16 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zB2 = o0VarE.B(p1Var) | z17;
            if ((i16 & 458752) == 131072) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zB2 | z18;
            objQ2 = o0VarE.q();
            if (z19) {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    num2 = num;
                    objQ2 = new r(num2, lVar, p1Var, 0);
                    o0VarE.K(objQ2);
                } else {
                    num2 = num;
                }
            } else {
                num2 = num;
                objQ2 = new r(num2, lVar, p1Var, 0);
                o0VarE.K(objQ2);
            }
            na.a(str3, (e23.l) objQ2, rVarW2, false, false, x0VarA2, null, null, a2Var2, null, true, 0, 0, aVar6, sgVarC2, o0VarE, 0, ((i16 << 12) & 458752) | 12582912, 48, 1933272);
            o0Var = o0VarE;
            o0Var.g0(true);
            b0Var3 = b0Var8;
        } else {
            o0Var = o0VarE;
            num2 = num;
            o0Var.e();
            b0Var3 = b0Var2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(rVar, a2Var, str, num2, b0Var3, lVar, i14, i15);
        }
    }

    public static final void b(Object obj, i53.c cVar, e23.l lVar, p3.m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1168982389);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = (i14 & 6) == 0 ? i14 | (o0VarE.B(obj) ? 4 : 2) : i14;
        int i16 = 32;
        i53.c cVar3 = cVar;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(cVar3) ? 32 : 16;
        }
        int i17 = i15;
        boolean z14 = false;
        boolean z15 = true;
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(obj);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(-1477883071);
            for (Object obj2 : cVar3) {
                h4.r.a aVar3 = h4.r.S;
                h4.r rVarF = x2.f(aVar3, 1.0f);
                boolean zG = p005kotlin.jvm.internal.s.g(p1Var.getF182175a(), obj2);
                p5.l.f136032b.getClass();
                p5.l lVarA = p5.l.a(p5.l.f136035e);
                boolean zR = o0VarE.r(obj2) | ((i17 & 112) != i16 ? z14 : z15);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == p3.m.a.f135155b) {
                    ok0.d dVar = new ok0.d(obj2, lVar, cVar3, p1Var, 12);
                    o0VarE.K(dVar);
                    objQ2 = dVar;
                }
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarZ = c2.l.z(j2.b.b(rVarF, zG, false, lVarA, (e23.a) objQ2, 10), 26, 10);
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
                h5.g.V.getClass();
                e0.a aVar5 = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                h4.r rVarC3 = c2.l.C(aVar3, 0.0f, 0.0f, 18, 0.0f, 11);
                boolean zG2 = p005kotlin.jvm.internal.s.g(p1Var.getF182175a(), obj2);
                wa waVar = wa.f90116a;
                d92.b.f58623a.getClass();
                long jA = d92.b.a(o0VarE).f().a();
                waVar.getClass();
                boolean z16 = z15;
                o0 o0Var = o0VarE;
                xa.a(zG2, null, rVarC3, false, wa.a(jA, 0L, o0VarE, 14), o0Var, 432, 40);
                String strValueOf = String.valueOf(obj2);
                d92.b.f58624b.getClass();
                mh.c(strValueOf, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0Var, 0, 0, 131070);
                o0VarE = o0Var;
                o0VarE.g0(z16);
                cVar3 = cVar;
                z15 = z16;
                p1Var = p1Var;
                i17 = i17;
                cVar2 = cVar2;
                i16 = i16;
                z14 = false;
            }
            o0VarE.g0(z14);
            o0VarE.g0(z15);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(obj, cVar, lVar, i14, 21);
        }
    }
}
