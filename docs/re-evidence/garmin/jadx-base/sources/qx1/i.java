package qx1;

import c2.b0;
import c2.s2;
import c2.u2;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import i3.mh;
import i3.p7;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:76:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x021a  */
    /* JADX WARN: Code duplicated, block: B:85:0x023f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0250  */
    /* JADX WARN: Code duplicated, block: B:89:0x0254  */
    /* JADX WARN: Code duplicated, block: B:91:0x0258  */
    /* JADX WARN: Code duplicated, block: B:94:0x0266  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        int i17;
        e23.a<Unit> aVar2;
        int i18;
        int i19;
        boolean z16;
        o0 o0Var;
        String str3;
        boolean z17;
        e23.a<Unit> aVar3;
        p2 p2VarI0;
        String str4;
        boolean z18;
        p3.m.a aVar4;
        e23.a<Unit> aVar5;
        r.a aVar6;
        Object objQ;
        s2 s2VarF;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar7;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.f fVar;
        z zVarA;
        e23.a<Unit> aVar8;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        j92.f fVar2;
        String str5;
        Object objQ2;
        str.getClass();
        o0 o0VarE = mVar.E(-1426964283);
        p3.c<?> cVar = o0VarE.f135177b;
        int i24 = (o0VarE.B(str) ? 4 : 2) | i14;
        int i25 = i15 & 2;
        if (i25 != 0) {
            i16 = i24 | 48;
        } else {
            i16 = i24 | (o0VarE.B(str2) ? 32 : 16);
        }
        int i26 = i15 & 4;
        if (i26 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                i19 = i16 | 3072;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i19 = i16 | i18;
            }
            if ((i19 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                if (i25 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i26 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                aVar4 = p3.m.f135153a;
                if (i17 != 0) {
                    objQ2 = o0VarE.q();
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new qr.n(24);
                        o0VarE.K(objQ2);
                    }
                    aVar5 = (e23.a) objQ2;
                } else {
                    aVar5 = aVar2;
                }
                x1 x1Var = p3.n.f135158a;
                aVar6 = r.S;
                objQ = o0VarE.q();
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new qv1.l(4);
                    o0VarE.K(objQ);
                }
                r rVarE = u1.n.e(v.c((e23.l) objQ, aVar6, true), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                r rVarY = c2.l.y(rVarE, eVar2.f97920e);
                h4.d.f81522a.getClass();
                h4.g.b bVar3 = h4.d.a.f81534l;
                c2.j jVar = c2.j.f22691a;
                bVar2.getClass();
                s2VarF = hb.a.f(jVar, eVar2.f97920e, bVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                aVar7 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, s2VarF, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                r rVarA = u2.f22900a.a(aVar6, 1.0f, true);
                zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                aVar8 = aVar5;
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i19 & 14, 0, 131070);
                o0Var = o0VarE;
                if (str4 == null) {
                    o0Var.C(221377812);
                    o0Var.g0(false);
                    str5 = str4;
                } else {
                    o0Var.C(221377813);
                    fVar2.getClass();
                    String str6 = str4;
                    mh.c(str6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, (i19 >> 3) & 14, 0, 131070);
                    str5 = str6;
                    o0Var = o0Var;
                    Unit unit = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                if (z18) {
                    o0Var.C(2012713213);
                    p3.v.a(p7.f89281c.c(Boolean.FALSE), z3.f.c(977155046, new p40.r(aVar8, 16), o0Var), o0Var, 56);
                    o0Var.g0(false);
                } else {
                    o0Var.C(2013209089);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                aVar3 = aVar8;
                str3 = str5;
                z17 = z18;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str3 = str2;
                z17 = z15;
                aVar3 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new aa2.g(str, str3, z17, aVar3, i14, i15);
            }
        }
        i16 |= 384;
        z15 = z14;
        i17 = i15 & 8;
        if (i17 != 0) {
            i19 = i16 | 3072;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if (o0VarE.r(aVar2)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i19 = i16 | i18;
        }
        if ((i19 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i19 & 1, z16)) {
            if (i25 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i26 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            aVar4 = p3.m.f135153a;
            if (i17 != 0) {
                objQ2 = o0VarE.q();
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new qr.n(24);
                    o0VarE.K(objQ2);
                }
                aVar5 = (e23.a) objQ2;
            } else {
                aVar5 = aVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            aVar6 = r.S;
            objQ = o0VarE.q();
            aVar4.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new qv1.l(4);
                o0VarE.K(objQ);
            }
            r rVarE2 = u1.n.e(v.c((e23.l) objQ, aVar6, true), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar3 = j92.b.f97899b;
            r rVarY2 = c2.l.y(rVarE2, eVar3.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar5 = h4.d.a.f81534l;
            c2.j jVar2 = c2.j.f22691a;
            bVar4.getClass();
            s2VarF = hb.a.f(jVar2, eVar3.f97920e, bVar5, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarY2, o0VarE);
            h5.g.V.getClass();
            aVar7 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarF, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            r rVarA2 = u2.f22900a.a(aVar6, 1.0f, true);
            zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            aVar8 = aVar5;
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i19 & 14, 0, 131070);
            o0Var = o0VarE;
            if (str4 == null) {
                o0Var.C(221377812);
                o0Var.g0(false);
                str5 = str4;
            } else {
                o0Var.C(221377813);
                fVar2.getClass();
                String str7 = str4;
                mh.c(str7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, (i19 >> 3) & 14, 0, 131070);
                str5 = str7;
                o0Var = o0Var;
                Unit unit2 = Unit.INSTANCE;
                o0Var.g0(false);
            }
            o0Var.g0(true);
            if (z18) {
                o0Var.C(2012713213);
                p3.v.a(p7.f89281c.c(Boolean.FALSE), z3.f.c(977155046, new p40.r(aVar8, 16), o0Var), o0Var, 56);
                o0Var.g0(false);
            } else {
                o0Var.C(2013209089);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            aVar3 = aVar8;
            str3 = str5;
            z17 = z18;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
            z17 = z15;
            aVar3 = aVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(str, str3, z17, aVar3, i14, i15);
        }
    }
}
