package m92;

import b82.u0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import f5.a1;
import f5.b1;
import f5.v1;
import f5.y0;
import f5.z0;
import i3.mh;
import i3.v5;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.n2;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f117456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Float f117457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f117458c;

        public a(float f14, Float f15, long j8) {
            this.f117456a = f14;
            this.f117457b = f15;
            this.f117458c = j8;
        }

        @Override // f5.z0
        public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
            b1Var.getClass();
            list.getClass();
            if (list.size() != 2) {
                return b1.h0(b1Var, g6.a.j(j8), g6.a.i(j8), new m30.n(15));
            }
            v1 v1VarQ = ((y0) p13.h0.b0(list)).Q(g6.b.b(0, 0, 15));
            int i14 = (g6.a.i(j8) - v1VarQ.f69145b) - ((int) this.f117456a);
            v1 v1VarQ2 = ((y0) p13.h0.m0(list)).Q(g6.b.a(1, 1, i14, i14));
            Float f14 = this.f117457b;
            int iFloatValue = (int) (f14 != null ? f14.floatValue() : Float.intBitsToFloat((int) (this.f117458c >> 32)));
            p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
            p0Var.f105807a = iFloatValue - (v1VarQ.n0() / 2);
            p0Var.f105807a = g6.a.j(j8) > v1VarQ.n0() ? j23.t.e(p0Var.f105807a, 0, g6.a.j(j8) - v1VarQ.n0()) : 0;
            return b1.h0(b1Var, g6.a.j(j8), g6.a.i(j8), new cw1.k0(v1VarQ, p0Var, v1VarQ2, iFloatValue, 6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    public static final void a(String str, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        e23.p pVar;
        p3.o0 o0Var;
        str.getClass();
        p3.o0 o0VarE = mVar.E(185198281);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | 48;
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarE = u1.n.e(l4.k.b(aVar, k2.i.a(eVar2.f97918c)), d92.b.a(o0VarE).c().g(), m1.f128891a);
            bVar.getClass();
            h4.r rVarY = c2.l.y(rVarE, eVar2.f97918c);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            int i17 = i16 & 14;
            boolean z14 = ((i16 & 112) == 32) | (i17 == 4);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new n2(str, 18);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new n2(str, 18);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ, aVar, false);
            d92.b.f58624b.getClass();
            int i18 = i16;
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.c.e(j92.f.f97935l), o0VarE), o0VarE, i17, 0, 131068);
            o0Var = o0VarE;
            bVar.getClass();
            c2.l.f(x2.q(aVar, eVar2.f97917b), o0Var);
            bVar.getClass();
            s2 s2VarA = q2.a(c2.j.i(eVar2.f97920e), h4.d.a.f81533k, o0Var, 0);
            int iHashCode2 = Long.hashCode(o0Var.U);
            i2 i2VarA1 = o0Var.a0();
            h4.r rVarC3 = h4.k.c(aVar, o0Var);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar2);
            } else {
                o0Var.c();
            }
            b4.c(eVar3, s2VarA, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0Var);
            u2 u2Var = u2.f22900a;
            pVar = eVar;
            pVar.invoke(o0Var, Integer.valueOf((i18 >> 6) & 14));
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            pVar = eVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(pVar, i14, 28, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029c  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:111:0x030c  */
    /* JADX WARN: Code duplicated, block: B:112:0x030e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0317  */
    /* JADX WARN: Code duplicated, block: B:116:0x0319  */
    /* JADX WARN: Code duplicated, block: B:119:0x0321  */
    /* JADX WARN: Code duplicated, block: B:122:0x0329  */
    /* JADX WARN: Code duplicated, block: B:123:0x032e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0384  */
    /* JADX WARN: Code duplicated, block: B:127:0x0388  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x0255  */
    /* JADX WARN: Code duplicated, block: B:93:0x0289  */
    /* JADX WARN: Code duplicated, block: B:94:0x028b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0292  */
    /* JADX WARN: Code duplicated, block: B:98:0x0294  */
    public static final void b(o4.d0 d0Var, String str, String str2, String str3, String str4, String str5, p3.m mVar, int i14, int i15) {
        String str6;
        int i16;
        String str7;
        int i17;
        p3.o0 o0Var;
        String str8;
        String str9;
        int i18;
        h5.g.a.f fVar;
        u2 u2Var;
        h4.r.a aVar;
        int i19;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        j92.f fVar2;
        f5.p pVar;
        h4.r.a aVar2;
        String str10;
        String str11;
        p3.o0 o0Var2;
        p3.m.a aVar3;
        int i24;
        h4.r.a aVar4;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objQ;
        String str12;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ2;
        String str13;
        p3.o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str4, mVar, -561646895);
        p3.c<?> cVar = o0VarK.f135177b;
        int i25 = (o0VarK.B(d0Var) ? 4 : 2) | i14 | (o0VarK.B(str) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i25 |= o0VarK.B(str2) ? 256 : 128;
        }
        int i26 = i15 & 8;
        if (i26 != 0) {
            i16 = i25 | 3072;
            str6 = str3;
        } else {
            str6 = str3;
            i16 = i25 | (o0VarK.B(str6) ? 2048 : 1024);
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarK.B(str4) ? 16384 : 8192;
        }
        int i27 = i15 & 32;
        if (i27 != 0) {
            i17 = i16 | 196608;
            str7 = str5;
        } else {
            str7 = str5;
            i17 = i16 | (o0VarK.B(str7) ? 131072 : 65536);
        }
        if (o0VarK.n(i17 & 1, (i17 & 74899) != 74898)) {
            if (i26 != 0) {
                str6 = null;
            }
            if (i27 != 0) {
                str7 = null;
            }
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar5 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            s2 s2VarA2 = q2.a(c0343j, bVar, o0VarK, 0);
            int iHashCode3 = Long.hashCode(o0VarK.U);
            i2 i2VarA2 = o0VarK.a0();
            h4.r rVarC3 = h4.k.c(aVar5, o0VarK);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar6);
            } else {
                o0VarK.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA2, o0VarK);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarK);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarK.T) {
                i18 = i17;
            } else {
                i18 = i17;
                if (!p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarK);
                u2Var = u2.f22900a;
                if (d0Var == null) {
                    o0VarK.C(2016135803);
                    o0VarK.g0(false);
                    i19 = 0;
                    aVar = aVar5;
                } else {
                    o0VarK.C(2016135804);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97917b;
                    bVar3.getClass();
                    h4.r rVarC4 = c2.l.C(aVar5, 0.0f, f14, eVar2.f97917b, 0.0f, 9);
                    aVar = aVar5;
                    bVar3.getClass();
                    i19 = 0;
                    c2.q.a(u1.n.e(l4.k.b(x2.q(rVarC4, eVar2.f97918c), k2.i.f102406a), d0Var.f128833a, m1.f128891a), o0VarK, 0);
                    Unit unit = Unit.INSTANCE;
                    o0VarK.g0(false);
                }
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarK, i19);
                iHashCode = Long.hashCode(o0VarK.U);
                i2VarA0 = o0VarK.a0();
                rVarC = h4.k.c(aVar, o0VarK);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar6);
                } else {
                    o0VarK.c();
                }
                b4.c(eVar, zVarA, o0VarK);
                b4.c(c1623g, i2VarA0, o0VarK);
                if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarK);
                c2.b0 b0Var = c2.b0.f22601a;
                s2VarA = q2.a(c0343j, bVar, o0VarK, 0);
                iHashCode2 = Long.hashCode(o0VarK.U);
                i2VarA1 = o0VarK.a0();
                rVarC2 = h4.k.c(aVar, o0VarK);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar6);
                } else {
                    o0VarK.c();
                }
                b4.c(eVar, s2VarA, o0VarK);
                b4.c(c1623g, i2VarA1, o0VarK);
                if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarK, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarK);
                d92.b.f58623a.getClass();
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarK);
                u2Var.getClass();
                pVar = f5.b.f68892a;
                aVar2 = aVar;
                str10 = str7;
                str11 = str6;
                mh.c(str, u2Var.d(aVar, pVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarK, (i18 >> 3) & 14, 0, 131068);
                o0Var2 = o0VarK;
                aVar3 = p3.m.f135153a;
                if (str2 != null) {
                    o0Var2.C(882922482);
                    fVar2.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97935l, o0Var2);
                    d92.b.f58625c.getClass();
                    h4.r rVarD = u2Var.d(c2.l.C(aVar2, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), pVar);
                    i24 = i18;
                    if ((i24 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i24 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objQ2 = o0Var2.q();
                    if (z19) {
                        str13 = str11;
                        objQ2 = new cn1.j(str13, str2, 10);
                        o0Var2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            str13 = str11;
                            objQ2 = new cn1.j(str13, str2, 10);
                            o0Var2.K(objQ2);
                        } else {
                            str13 = str11;
                        }
                    }
                    str11 = str13;
                    aVar4 = aVar2;
                    mh.c(str2, p5.v.c((e23.l) objQ2, rVarD, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var2, (i24 >> 6) & 14, 0, 131068);
                    o0Var2 = o0Var2;
                    o0Var2.g0(false);
                } else {
                    i24 = i18;
                    aVar4 = aVar2;
                    o0Var2.C(883310323);
                    o0Var2.g0(false);
                }
                o0Var2.g0(true);
                if ((458752 & i24) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((57344 & i24) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objQ = o0Var2.q();
                if (z16) {
                    str12 = str10;
                    objQ = new cn1.j(str12, str4, 11);
                    o0Var2.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        str12 = str10;
                        objQ = new cn1.j(str12, str4, 11);
                        o0Var2.K(objQ);
                    } else {
                        str12 = str10;
                    }
                }
                h4.r rVarC5 = p5.v.c((e23.l) objQ, aVar4, false);
                fVar2.getClass();
                p3.o0 o0Var3 = o0Var2;
                mh.c(str4, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0Var2), o0Var3, (i24 >> 12) & 14, 0, 131068);
                o0Var = o0Var3;
                o0Var.g0(true);
                o0Var.g0(true);
                str9 = str12;
                str8 = str11;
            }
            v.h.A(iHashCode3, o0VarK, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarK);
            u2Var = u2.f22900a;
            if (d0Var == null) {
                o0VarK.C(2016135803);
                o0VarK.g0(false);
                i19 = 0;
                aVar = aVar5;
            } else {
                o0VarK.C(2016135804);
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f15 = eVar3.f97917b;
                bVar4.getClass();
                h4.r rVarC6 = c2.l.C(aVar5, 0.0f, f15, eVar3.f97917b, 0.0f, 9);
                aVar = aVar5;
                bVar4.getClass();
                i19 = 0;
                c2.q.a(u1.n.e(l4.k.b(x2.q(rVarC6, eVar3.f97918c), k2.i.f102406a), d0Var.f128833a, m1.f128891a), o0VarK, 0);
                Unit unit2 = Unit.INSTANCE;
                o0VarK.g0(false);
            }
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarK, i19);
            iHashCode = Long.hashCode(o0VarK.U);
            i2VarA0 = o0VarK.a0();
            rVarC = h4.k.c(aVar, o0VarK);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar6);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, zVarA, o0VarK);
            b4.c(c1623g, i2VarA0, o0VarK);
            if (o0VarK.T) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarK);
            c2.b0 b0Var2 = c2.b0.f22601a;
            s2VarA = q2.a(c0343j, bVar, o0VarK, 0);
            iHashCode2 = Long.hashCode(o0VarK.U);
            i2VarA1 = o0VarK.a0();
            rVarC2 = h4.k.c(aVar, o0VarK);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar6);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, s2VarA, o0VarK);
            b4.c(c1623g, i2VarA1, o0VarK);
            if (o0VarK.T) {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarK);
            d92.b.f58623a.getClass();
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB3 = d92.c.b(j92.f.f97932i, o0VarK);
            u2Var.getClass();
            pVar = f5.b.f68892a;
            aVar2 = aVar;
            str10 = str7;
            str11 = str6;
            mh.c(str, u2Var.d(aVar, pVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, o0VarK, (i18 >> 3) & 14, 0, 131068);
            o0Var2 = o0VarK;
            aVar3 = p3.m.f135153a;
            if (str2 != null) {
                o0Var2.C(882922482);
                fVar2.getClass();
                x0 x0VarB4 = d92.c.b(j92.f.f97935l, o0Var2);
                d92.b.f58625c.getClass();
                h4.r rVarD2 = u2Var.d(c2.l.C(aVar2, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), pVar);
                i24 = i18;
                if ((i24 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i24 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objQ2 = o0Var2.q();
                if (z19) {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        str13 = str11;
                        objQ2 = new cn1.j(str13, str2, 10);
                        o0Var2.K(objQ2);
                    } else {
                        str13 = str11;
                    }
                } else {
                    str13 = str11;
                    objQ2 = new cn1.j(str13, str2, 10);
                    o0Var2.K(objQ2);
                }
                str11 = str13;
                aVar4 = aVar2;
                mh.c(str2, p5.v.c((e23.l) objQ2, rVarD2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB4, o0Var2, (i24 >> 6) & 14, 0, 131068);
                o0Var2 = o0Var2;
                o0Var2.g0(false);
            } else {
                i24 = i18;
                aVar4 = aVar2;
                o0Var2.C(883310323);
                o0Var2.g0(false);
            }
            o0Var2.g0(true);
            if ((458752 & i24) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((57344 & i24) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z14 | z15;
            objQ = o0Var2.q();
            if (z16) {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    str12 = str10;
                    objQ = new cn1.j(str12, str4, 11);
                    o0Var2.K(objQ);
                } else {
                    str12 = str10;
                }
            } else {
                str12 = str10;
                objQ = new cn1.j(str12, str4, 11);
                o0Var2.K(objQ);
            }
            h4.r rVarC7 = p5.v.c((e23.l) objQ, aVar4, false);
            fVar2.getClass();
            p3.o0 o0Var4 = o0Var2;
            mh.c(str4, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0Var2), o0Var4, (i24 >> 12) & 14, 0, 131068);
            o0Var = o0Var4;
            o0Var.g0(true);
            o0Var.g0(true);
            str9 = str12;
            str8 = str11;
        } else {
            o0Var = o0VarK;
            o0Var.e();
            str8 = str6;
            str9 = str7;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(d0Var, str, str2, str8, str4, str9, i14, i15, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x013d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0144  */
    /* JADX WARN: Code duplicated, block: B:85:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x0199  */
    /* JADX WARN: Code duplicated, block: B:94:0x019d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a8  */
    public static final void c(Map<Float, Float> map, long j8, float f14, float f15, e23.q<? super Float, ? super p3.m, ? super Integer, Unit> qVar, h4.r rVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z14;
        h4.r rVarD;
        p2 p2VarI0;
        float fIntBitsToFloat;
        Iterator<T> it;
        float f16;
        Float fValueOf;
        Float f17;
        Float fValueOf2;
        boolean z15;
        boolean zB;
        Object objQ;
        z0 z0Var;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        int i17;
        h5.g.a.b bVar;
        float fFloatValue;
        float fAbs;
        p3.o0 o0VarE = mVar.E(1340798664);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(map) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.i(f14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.i(f15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(qVar) ? 16384 : 8192;
        }
        int i18 = i15 & 32;
        if (i18 == 0) {
            if ((196608 & i14) == 0) {
                i16 |= o0VarE.B(rVar) ? 131072 : 65536;
            }
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i18 != 0) {
                    rVarD = x2.d(h4.r.S, 1.0f);
                } else {
                    rVarD = rVar;
                }
                x1 x1Var = p3.n.f135158a;
                fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) - f14;
                it = map.keySet().iterator();
                f16 = Float.MAX_VALUE;
                fValueOf = null;
                while (it.hasNext()) {
                    fFloatValue = ((Number) it.next()).floatValue();
                    fAbs = Math.abs(fFloatValue - fIntBitsToFloat);
                    if (fAbs < f16) {
                        fValueOf = Float.valueOf(fFloatValue);
                        f16 = fAbs;
                    }
                }
                f17 = map.get(fValueOf);
                if (fValueOf != null) {
                    fValueOf2 = Float.valueOf(fValueOf.floatValue() + f14);
                } else {
                    fValueOf2 = null;
                }
                if ((i16 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zB = z15 | o0VarE.B(fValueOf2) | ((i16 & 112) == 32);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new a(f15, fValueOf2, j8);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(f15, fValueOf2, j8);
                        o0VarE.K(objQ);
                    }
                }
                z0Var = (z0) objQ;
                x1 x1Var2 = p3.n.f135158a;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                i17 = i16;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                qVar.invoke(f17, o0VarE, Integer.valueOf((i17 >> 9) & 112));
                d92.b.f58623a.getClass();
                v5.b(0.0f, 0, 3, d92.b.a(o0VarE).j().e(), null, o0VarE);
                o0VarE.g0(true);
            } else {
                o0VarE.e();
                rVarD = rVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.m1(map, j8, f14, f15, qVar, rVarD, i14, i15);
            }
        }
        i16 |= 196608;
        if ((74899 & i16) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i18 != 0) {
                rVarD = x2.d(h4.r.S, 1.0f);
            } else {
                rVarD = rVar;
            }
            x1 x1Var3 = p3.n.f135158a;
            fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) - f14;
            it = map.keySet().iterator();
            f16 = Float.MAX_VALUE;
            fValueOf = null;
            while (it.hasNext()) {
                fFloatValue = ((Number) it.next()).floatValue();
                fAbs = Math.abs(fFloatValue - fIntBitsToFloat);
                if (fAbs < f16) {
                    fValueOf = Float.valueOf(fFloatValue);
                    f16 = fAbs;
                }
            }
            f17 = map.get(fValueOf);
            if (fValueOf != null) {
                fValueOf2 = Float.valueOf(fValueOf.floatValue() + f14);
            } else {
                fValueOf2 = null;
            }
            if ((i16 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            zB = z15 | o0VarE.B(fValueOf2) | ((i16 & 112) == 32);
            objQ = o0VarE.q();
            if (zB) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(f15, fValueOf2, j8);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new a(f15, fValueOf2, j8);
                o0VarE.K(objQ);
            }
            z0Var = (z0) objQ;
            x1 x1Var4 = p3.n.f135158a;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            i17 = i16;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            qVar.invoke(f17, o0VarE, Integer.valueOf((i17 >> 9) & 112));
            d92.b.f58623a.getClass();
            v5.b(0.0f, 0, 3, d92.b.a(o0VarE).j().e(), null, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
            rVarD = rVar;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.m1(map, j8, f14, f15, qVar, rVarD, i14, i15);
        }
    }
}
