package da0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import i3.i7;
import i3.mh;
import kotlin.o3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123  */
    /* JADX WARN: Code duplicated, block: B:71:0x0131  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x014a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:83:0x0216  */
    /* JADX WARN: Code duplicated, block: B:85:0x0271  */
    /* JADX WARN: Code duplicated, block: B:87:0x0293  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void a(int i14, int i15, h4.r rVar, String str, String str2, p3.m mVar, u4.d dVar) {
        h4.r rVar2;
        int i16;
        String str3;
        int i17;
        int i18;
        int i19;
        u4.d dVar2;
        int i24;
        int i25;
        boolean z14;
        String str4;
        u4.d dVar3;
        p2 p2VarI0;
        h4.r rVar3;
        String str5;
        u4.d dVar4;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        Throwable th3;
        h5.g.a.f fVar;
        h4.r.a aVar2;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        h4.r.a aVar3;
        boolean z15;
        boolean z16;
        h4.r.a aVar4;
        h4.r rVar4;
        Object obj;
        o0 o0VarE = mVar.E(-1809617566);
        p3.c<?> cVar = o0VarE.f135177b;
        int i26 = i14 | (o0VarE.B(str) ? 4 : 2);
        int i27 = i15 & 2;
        if (i27 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i26 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i16 = i15 & 4;
            if (i16 != 0) {
                i18 = i26 | 384;
                str3 = str2;
            } else {
                str3 = str2;
                if (o0VarE.B(str3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i18 = i26 | i17;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                i25 = i18 | 3072;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if (o0VarE.B(dVar2)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i25 = i18 | i24;
            }
            if ((i25 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                if (i27 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i16 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i19 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                x1 x1Var = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar3, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    th3 = null;
                } else {
                    th3 = null;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarF, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw th3;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u2 u2Var = u2.f22900a;
                    if (dVar4 == null) {
                        o0VarE.C(1181534168);
                        o0VarE.g0(false);
                        aVar3 = aVar2;
                        z15 = false;
                    } else {
                        o0VarE.C(1181534169);
                        d92.b.f58623a.getClass();
                        j92.b bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f14 = eVar2.f97917b;
                        bVar2.getClass();
                        h4.r rVarC3 = c2.l.C(aVar2, 0.0f, f14, eVar2.f97918c, 0.0f, 9);
                        aVar3 = aVar2;
                        bVar2.getClass();
                        i7.b(dVar4, null, x2.q(rVarC3, j92.b.f97901d.f97906e), am.j.d(o0VarE), o0VarE, 48, 0);
                        Unit unit = Unit.INSTANCE;
                        z15 = false;
                        o0VarE.g0(false);
                    }
                    if (str == null) {
                        o0VarE.C(1181934223);
                        o0VarE.g0(z15);
                        rVar4 = rVar3;
                        z16 = z15;
                        aVar4 = aVar3;
                    } else {
                        o0VarE.C(1181934224);
                        String strG = g22.n.g(str);
                        h4.r rVarC4 = o3.c(aVar3, "title");
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        h4.r rVar5 = rVar3;
                        z16 = z15;
                        aVar4 = aVar3;
                        rVar4 = rVar5;
                        mh.c(strG, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, o0VarE), o0VarE, 48, 0, 131068);
                        o0VarE = o0VarE;
                        Unit unit2 = Unit.INSTANCE;
                        o0VarE.g0(z16);
                    }
                    o0VarE.g0(true);
                    if (str5 == null) {
                        o0VarE.C(-654198805);
                        o0VarE.g0(z16);
                        str4 = str5;
                        obj = th3;
                    } else {
                        o0VarE.C(-654198804);
                        h4.r rVarC5 = o3.c(aVar4, "subtitle");
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC6 = c2.l.C(rVarC5, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                        d92.b.f58624b.getClass();
                        o0 o0Var = o0VarE;
                        str4 = str5;
                        mh.c(str4, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0Var, 0, 0, 131068);
                        o0VarE = o0Var;
                        Unit unit3 = Unit.INSTANCE;
                        o0VarE.g0(z16);
                        obj = Unit.INSTANCE;
                    }
                    if (obj == null) {
                        o0VarE.C(-653905761);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.h(aVar4, j92.b.f97899b.f97918c), o0VarE);
                        Unit unit4 = Unit.INSTANCE;
                        o0VarE.g0(z16);
                    } else {
                        o0VarE.C(1364369915);
                        o0VarE.g0(z16);
                    }
                    o0VarE.g0(true);
                    dVar3 = dVar4;
                    rVar2 = rVar4;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                aVar2 = h4.r.S;
                h4.r rVarF2 = x2.f(aVar2, 1.0f);
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarF2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var2 = u2.f22900a;
                if (dVar4 == null) {
                    o0VarE.C(1181534168);
                    o0VarE.g0(false);
                    aVar3 = aVar2;
                    z15 = false;
                } else {
                    o0VarE.C(1181534169);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f15 = eVar3.f97917b;
                    bVar3.getClass();
                    h4.r rVarC7 = c2.l.C(aVar2, 0.0f, f15, eVar3.f97918c, 0.0f, 9);
                    aVar3 = aVar2;
                    bVar3.getClass();
                    i7.b(dVar4, null, x2.q(rVarC7, j92.b.f97901d.f97906e), am.j.d(o0VarE), o0VarE, 48, 0);
                    Unit unit5 = Unit.INSTANCE;
                    z15 = false;
                    o0VarE.g0(false);
                }
                if (str == null) {
                    o0VarE.C(1181934223);
                    o0VarE.g0(z15);
                    rVar4 = rVar3;
                    z16 = z15;
                    aVar4 = aVar3;
                } else {
                    o0VarE.C(1181934224);
                    String strG2 = g22.n.g(str);
                    h4.r rVarC8 = o3.c(aVar3, "title");
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    h4.r rVar6 = rVar3;
                    z16 = z15;
                    aVar4 = aVar3;
                    rVar4 = rVar6;
                    mh.c(strG2, rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, o0VarE), o0VarE, 48, 0, 131068);
                    o0VarE = o0VarE;
                    Unit unit6 = Unit.INSTANCE;
                    o0VarE.g0(z16);
                }
                o0VarE.g0(true);
                if (str5 == null) {
                    o0VarE.C(-654198805);
                    o0VarE.g0(z16);
                    str4 = str5;
                    obj = th3;
                } else {
                    o0VarE.C(-654198804);
                    h4.r rVarC9 = o3.c(aVar4, "subtitle");
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC10 = c2.l.C(rVarC9, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    o0 o0Var2 = o0VarE;
                    str4 = str5;
                    mh.c(str4, rVarC10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0Var2, 0, 0, 131068);
                    o0VarE = o0Var2;
                    Unit unit7 = Unit.INSTANCE;
                    o0VarE.g0(z16);
                    obj = Unit.INSTANCE;
                }
                if (obj == null) {
                    o0VarE.C(-653905761);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar4, j92.b.f97899b.f97918c), o0VarE);
                    Unit unit8 = Unit.INSTANCE;
                    o0VarE.g0(z16);
                } else {
                    o0VarE.C(1364369915);
                    o0VarE.g0(z16);
                }
                o0VarE.g0(true);
                dVar3 = dVar4;
                rVar2 = rVar4;
            } else {
                o0VarE.e();
                str4 = str3;
                dVar3 = dVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.f0(i14, i15, rVar2, str, str4, dVar3);
            }
        }
        i26 |= 48;
        rVar2 = rVar;
        i16 = i15 & 4;
        if (i16 != 0) {
            i18 = i26 | 384;
            str3 = str2;
        } else {
            str3 = str2;
            if (o0VarE.B(str3)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i18 = i26 | i17;
        }
        i19 = i15 & 8;
        if (i19 != 0) {
            i25 = i18 | 3072;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if (o0VarE.B(dVar2)) {
                i24 = 2048;
            } else {
                i24 = 1024;
            }
            i25 = i18 | i24;
        }
        if ((i25 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i25 & 1, z14)) {
            if (i27 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i16 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i19 != 0) {
                dVar4 = null;
            } else {
                dVar4 = dVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar3, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                th3 = null;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                aVar2 = h4.r.S;
                h4.r rVarF3 = x2.f(aVar2, 1.0f);
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarF3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var3 = u2.f22900a;
                if (dVar4 == null) {
                    o0VarE.C(1181534168);
                    o0VarE.g0(false);
                    aVar3 = aVar2;
                    z15 = false;
                } else {
                    o0VarE.C(1181534169);
                    d92.b.f58623a.getClass();
                    j92.b bVar4 = d92.b.f58625c;
                    bVar4.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f16 = eVar4.f97917b;
                    bVar4.getClass();
                    h4.r rVarC11 = c2.l.C(aVar2, 0.0f, f16, eVar4.f97918c, 0.0f, 9);
                    aVar3 = aVar2;
                    bVar4.getClass();
                    i7.b(dVar4, null, x2.q(rVarC11, j92.b.f97901d.f97906e), am.j.d(o0VarE), o0VarE, 48, 0);
                    Unit unit9 = Unit.INSTANCE;
                    z15 = false;
                    o0VarE.g0(false);
                }
                if (str == null) {
                    o0VarE.C(1181934223);
                    o0VarE.g0(z15);
                    rVar4 = rVar3;
                    z16 = z15;
                    aVar4 = aVar3;
                } else {
                    o0VarE.C(1181934224);
                    String strG3 = g22.n.g(str);
                    h4.r rVarC12 = o3.c(aVar3, "title");
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    h4.r rVar7 = rVar3;
                    z16 = z15;
                    aVar4 = aVar3;
                    rVar4 = rVar7;
                    mh.c(strG3, rVarC12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, o0VarE), o0VarE, 48, 0, 131068);
                    o0VarE = o0VarE;
                    Unit unit10 = Unit.INSTANCE;
                    o0VarE.g0(z16);
                }
                o0VarE.g0(true);
                if (str5 == null) {
                    o0VarE.C(-654198805);
                    o0VarE.g0(z16);
                    str4 = str5;
                    obj = th3;
                } else {
                    o0VarE.C(-654198804);
                    h4.r rVarC13 = o3.c(aVar4, "subtitle");
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC14 = c2.l.C(rVarC13, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    o0 o0Var3 = o0VarE;
                    str4 = str5;
                    mh.c(str4, rVarC14, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0Var3, 0, 0, 131068);
                    o0VarE = o0Var3;
                    Unit unit11 = Unit.INSTANCE;
                    o0VarE.g0(z16);
                    obj = Unit.INSTANCE;
                }
                if (obj == null) {
                    o0VarE.C(-653905761);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar4, j92.b.f97899b.f97918c), o0VarE);
                    Unit unit12 = Unit.INSTANCE;
                    o0VarE.g0(z16);
                } else {
                    o0VarE.C(1364369915);
                    o0VarE.g0(z16);
                }
                o0VarE.g0(true);
                dVar3 = dVar4;
                rVar2 = rVar4;
            } else {
                th3 = null;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            aVar2 = h4.r.S;
            h4.r rVarF4 = x2.f(aVar2, 1.0f);
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarF4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var4 = u2.f22900a;
            if (dVar4 == null) {
                o0VarE.C(1181534168);
                o0VarE.g0(false);
                aVar3 = aVar2;
                z15 = false;
            } else {
                o0VarE.C(1181534169);
                d92.b.f58623a.getClass();
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar5 = j92.b.f97899b;
                float f17 = eVar5.f97917b;
                bVar5.getClass();
                h4.r rVarC15 = c2.l.C(aVar2, 0.0f, f17, eVar5.f97918c, 0.0f, 9);
                aVar3 = aVar2;
                bVar5.getClass();
                i7.b(dVar4, null, x2.q(rVarC15, j92.b.f97901d.f97906e), am.j.d(o0VarE), o0VarE, 48, 0);
                Unit unit13 = Unit.INSTANCE;
                z15 = false;
                o0VarE.g0(false);
            }
            if (str == null) {
                o0VarE.C(1181934223);
                o0VarE.g0(z15);
                rVar4 = rVar3;
                z16 = z15;
                aVar4 = aVar3;
            } else {
                o0VarE.C(1181934224);
                String strG4 = g22.n.g(str);
                h4.r rVarC16 = o3.c(aVar3, "title");
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                h4.r rVar8 = rVar3;
                z16 = z15;
                aVar4 = aVar3;
                rVar4 = rVar8;
                mh.c(strG4, rVarC16, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, o0VarE), o0VarE, 48, 0, 131068);
                o0VarE = o0VarE;
                Unit unit14 = Unit.INSTANCE;
                o0VarE.g0(z16);
            }
            o0VarE.g0(true);
            if (str5 == null) {
                o0VarE.C(-654198805);
                o0VarE.g0(z16);
                str4 = str5;
                obj = th3;
            } else {
                o0VarE.C(-654198804);
                h4.r rVarC17 = o3.c(aVar4, "subtitle");
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC18 = c2.l.C(rVarC17, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                o0 o0Var4 = o0VarE;
                str4 = str5;
                mh.c(str4, rVarC18, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0Var4, 0, 0, 131068);
                o0VarE = o0Var4;
                Unit unit15 = Unit.INSTANCE;
                o0VarE.g0(z16);
                obj = Unit.INSTANCE;
            }
            if (obj == null) {
                o0VarE.C(-653905761);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar4, j92.b.f97899b.f97918c), o0VarE);
                Unit unit16 = Unit.INSTANCE;
                o0VarE.g0(z16);
            } else {
                o0VarE.C(1364369915);
                o0VarE.g0(z16);
            }
            o0VarE.g0(true);
            dVar3 = dVar4;
            rVar2 = rVar4;
        } else {
            o0VarE.e();
            str4 = str3;
            dVar3 = dVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(i14, i15, rVar2, str, str4, dVar3);
        }
    }
}
