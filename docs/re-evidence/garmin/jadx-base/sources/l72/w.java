package l72;

import c2.k3;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.e9;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.s7;
import i3.ve;
import java.util.Locale;
import kd0.h6;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ll72/w;", "", "<init>", "()V", "a", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f111301a = new w();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll72/w$a;", "", "<init>", "()V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f111302a = new a();

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:30:0x005a  */
        /* JADX WARN: Code duplicated, block: B:32:0x0060  */
        /* JADX WARN: Code duplicated, block: B:33:0x0063  */
        /* JADX WARN: Code duplicated, block: B:37:0x006d  */
        /* JADX WARN: Code duplicated, block: B:38:0x006f  */
        /* JADX WARN: Code duplicated, block: B:41:0x0078 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x007a  */
        /* JADX WARN: Code duplicated, block: B:43:0x007c  */
        /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:58:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:62:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:65:0x020a  */
        /* JADX WARN: Code duplicated, block: B:66:0x020c  */
        /* JADX WARN: Code duplicated, block: B:69:0x0213  */
        /* JADX WARN: Code duplicated, block: B:71:0x021c  */
        /* JADX WARN: Code duplicated, block: B:73:0x0263  */
        /* JADX WARN: Code duplicated, block: B:75:0x0268  */
        /* JADX WARN: Code duplicated, block: B:78:0x0272  */
        /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
        public final void a(c2.t2 t2Var, e23.q<? super c2.t2, ? super p3.m, ? super Integer, Unit> qVar, b92.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
            int i16;
            b92.a aVar3;
            boolean z14;
            b92.a aVar4;
            p3.p2 p2VarI0;
            b92.a aVar5;
            h4.r.a aVar6;
            float f14;
            c2.s2 s2VarA;
            int iHashCode;
            p3.i2 i2VarA0;
            h4.r rVarC;
            h5.e0.a aVar7;
            h5.g.a.b bVar;
            u4.d dVarC;
            String str;
            boolean z15;
            Object objQ;
            int i17;
            t2Var.getClass();
            qVar.getClass();
            aVar2.getClass();
            p3.o0 o0VarE = mVar.E(-673812094);
            if ((i14 & 6) == 0) {
                i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            if ((i14 & 48) == 0) {
                i16 |= o0VarE.r(qVar) ? 32 : 16;
            }
            int i18 = i15 & 2;
            if (i18 == 0) {
                if ((i14 & 384) == 0) {
                    aVar3 = aVar;
                    i16 |= o0VarE.B(aVar3) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (o0VarE.r(aVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i16 |= i17;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i18 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar3;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    aVar6 = h4.r.S;
                    f14 = 16;
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarA = t2Var.a(c2.l.y(aVar6, f14), 1.0f, false);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarA, o0VarE);
                    h5.g.V.getClass();
                    aVar7 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar7);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.u2 u2Var = c2.u2.f22900a;
                    int i19 = b3.b.C0219b.f15504a;
                    dVarC = e3.b.f62644a;
                    if (dVarC == null) {
                        u4.d.a aVar9 = new u4.d.a("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                        p13.j0 j0Var = u4.m.f168519a;
                        o4.d0.f128823b.getClass();
                        o4.t1 t1Var = new o4.t1(o4.d0.f128824c, null);
                        o4.u1.f129010b.getClass();
                        o4.v1.f129019b.getClass();
                        int i24 = o4.v1.f129021d;
                        u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(18.3f, 5.71f);
                        eVarL.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        eVarL.i(12.0f, 10.59f);
                        eVarL.i(7.11f, 5.7f);
                        eVarL.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        eVarL.e(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        eVarL.i(10.59f, 12.0f);
                        eVarL.i(5.7f, 16.89f);
                        eVarL.e(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        eVarL.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        eVarL.i(12.0f, 13.41f);
                        eVarL.j(4.89f, 4.89f);
                        eVarL.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        eVarL.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        eVarL.i(13.41f, 12.0f);
                        eVarL.j(4.89f, -4.89f);
                        eVarL.e(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
                        eVarL.c();
                        u4.d.a.b(aVar9, eVarL.f168407a, 0, t1Var, 1.0f, null, 1.0f, i24, 1.0f);
                        dVarC = aVar9.c();
                        e3.b.f62644a = dVarC;
                    }
                    if (aVar5 != null || (str = aVar5.f16961a.get("close")) == null) {
                        str = "";
                    }
                    long jD = hb.a.d(d92.b.f58623a, o0VarE);
                    h4.r rVarC2 = u2Var.c(c2.x2.q(aVar6, 24), h4.d.a.f81534l);
                    if ((i16 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ = o0VarE.q();
                    if (z15) {
                        objQ = new t(aVar2, 3);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new t(aVar2, 3);
                            o0VarE.K(objQ);
                        }
                    }
                    i7.b(dVarC, str, u1.w.d(rVarC2, false, null, null, (e23.a) objQ, 15), jD, o0VarE, 0, 0);
                    c2.l.f(c2.x2.u(aVar6, f14), o0VarE);
                    qVar.invoke(u2Var, o0VarE, Integer.valueOf((i16 & 112) | 6));
                    o0VarE.g0(true);
                    aVar4 = aVar5;
                } else {
                    o0VarE.e();
                    aVar4 = aVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0(this, t2Var, qVar, aVar4, aVar2, i14, i15, 18);
                }
            }
            i16 |= 384;
            aVar3 = aVar;
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(aVar2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i16 |= i17;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i18 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar3;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                aVar6 = h4.r.S;
                f14 = 16;
                g6.f.a aVar10 = g6.f.f75994b;
                h4.r rVarA2 = t2Var.a(c2.l.y(aVar6, f14), 1.0f, false);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j2 = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2VarA = c2.q2.a(c0343j2, h4.d.a.f81533k, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA2, o0VarE);
                h5.g.V.getClass();
                aVar7 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u2 u2Var2 = c2.u2.f22900a;
                int i110 = b3.b.C0219b.f15504a;
                dVarC = e3.b.f62644a;
                if (dVarC == null) {
                    u4.d.a aVar11 = new u4.d.a("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                    p13.j0 j0Var2 = u4.m.f168519a;
                    o4.d0.f128823b.getClass();
                    o4.t1 t1Var2 = new o4.t1(o4.d0.f128824c, null);
                    o4.u1.f129010b.getClass();
                    o4.v1.f129019b.getClass();
                    int i25 = o4.v1.f129021d;
                    u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(18.3f, 5.71f);
                    eVarL2.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                    eVarL2.i(12.0f, 10.59f);
                    eVarL2.i(7.11f, 5.7f);
                    eVarL2.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                    eVarL2.e(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                    eVarL2.i(10.59f, 12.0f);
                    eVarL2.i(5.7f, 16.89f);
                    eVarL2.e(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                    eVarL2.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                    eVarL2.i(12.0f, 13.41f);
                    eVarL2.j(4.89f, 4.89f);
                    eVarL2.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                    eVarL2.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                    eVarL2.i(13.41f, 12.0f);
                    eVarL2.j(4.89f, -4.89f);
                    eVarL2.e(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
                    eVarL2.c();
                    u4.d.a.b(aVar11, eVarL2.f168407a, 0, t1Var2, 1.0f, null, 1.0f, i25, 1.0f);
                    dVarC = aVar11.c();
                    e3.b.f62644a = dVarC;
                }
                if (aVar5 != null) {
                    str = "";
                } else {
                    str = "";
                }
                long jD2 = hb.a.d(d92.b.f58623a, o0VarE);
                h4.r rVarC3 = u2Var2.c(c2.x2.q(aVar6, 24), h4.d.a.f81534l);
                if ((i16 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                if (z15) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new t(aVar2, 3);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new t(aVar2, 3);
                    o0VarE.K(objQ);
                }
                i7.b(dVarC, str, u1.w.d(rVarC3, false, null, null, (e23.a) objQ, 15), jD2, o0VarE, 0, 0);
                c2.l.f(c2.x2.u(aVar6, f14), o0VarE);
                qVar.invoke(u2Var2, o0VarE, Integer.valueOf((i16 & 112) | 6));
                o0VarE.g0(true);
                aVar4 = aVar5;
            } else {
                o0VarE.e();
                aVar4 = aVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(this, t2Var, qVar, aVar4, aVar2, i14, i15, 18);
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x005a  */
        /* JADX WARN: Code duplicated, block: B:32:0x0060  */
        /* JADX WARN: Code duplicated, block: B:33:0x0063  */
        /* JADX WARN: Code duplicated, block: B:37:0x006a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0070  */
        /* JADX WARN: Code duplicated, block: B:40:0x0073  */
        /* JADX WARN: Code duplicated, block: B:44:0x007c  */
        /* JADX WARN: Code duplicated, block: B:45:0x007e  */
        /* JADX WARN: Code duplicated, block: B:48:0x0087 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:49:0x0089  */
        /* JADX WARN: Code duplicated, block: B:50:0x008c  */
        /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:55:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
        public final void b(c2.t2 t2Var, String str, b92.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
            int i16;
            b92.a aVar3;
            boolean z14;
            p3.p2 p2VarI0;
            b92.a aVar4;
            int i17;
            int i18;
            t2Var.getClass();
            str.getClass();
            aVar2.getClass();
            p3.o0 o0VarE = mVar.E(-1195511069);
            int i19 = 4;
            if ((i14 & 6) == 0) {
                i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            if ((i14 & 48) == 0) {
                i16 |= o0VarE.B(str) ? 32 : 16;
            }
            int i24 = i15 & 2;
            if (i24 == 0) {
                if ((i14 & 384) == 0) {
                    aVar3 = aVar;
                    i16 |= o0VarE.B(aVar3) ? 256 : 128;
                }
                if ((i14 & 3072) == 0) {
                    if (o0VarE.r(aVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarE.B(this)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i16 |= i17;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i24 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar3;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    a(t2Var, z3.f.c(1965302074, new j21.p(str, i19), o0VarE), aVar4, aVar2, o0VarE, (i16 & 14) | 48 | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                    aVar3 = aVar4;
                } else {
                    o0VarE.e();
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0(this, t2Var, str, aVar3, aVar2, i14, i15, 17);
                }
            }
            i16 |= 384;
            aVar3 = aVar;
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(aVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(this)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i16 |= i17;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar3;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                a(t2Var, z3.f.c(1965302074, new j21.p(str, i19), o0VarE), aVar4, aVar2, o0VarE, (i16 & 14) | 48 | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                aVar3 = aVar4;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(this, t2Var, str, aVar3, aVar2, i14, i15, 17);
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0055  */
        /* JADX WARN: Code duplicated, block: B:32:0x005a  */
        /* JADX WARN: Code duplicated, block: B:34:0x005e  */
        /* JADX WARN: Code duplicated, block: B:36:0x0066  */
        /* JADX WARN: Code duplicated, block: B:37:0x0069  */
        /* JADX WARN: Code duplicated, block: B:41:0x0073  */
        /* JADX WARN: Code duplicated, block: B:42:0x0075  */
        /* JADX WARN: Code duplicated, block: B:45:0x007e  */
        /* JADX WARN: Code duplicated, block: B:47:0x0081  */
        /* JADX WARN: Code duplicated, block: B:48:0x0083  */
        /* JADX WARN: Code duplicated, block: B:51:0x0087  */
        /* JADX WARN: Code duplicated, block: B:53:0x00af  */
        /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:45:0x007e, please report this as an issue */
        public final void c(c2.t2 t2Var, String str, String str2, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
            int i16;
            String str3;
            int i17;
            e23.p<? super p3.m, ? super Integer, Unit> pVar2;
            int i18;
            boolean z14;
            e23.p<? super p3.m, ? super Integer, Unit> pVar3;
            p3.p2 p2VarI0;
            String str4;
            t2Var.getClass();
            str.getClass();
            p3.o0 o0VarE = mVar.E(1553557049);
            if ((i14 & 6) == 0) {
                i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            if ((i14 & 48) == 0) {
                i16 |= o0VarE.B(str) ? 32 : 16;
            }
            int i19 = i15 & 2;
            if (i19 == 0) {
                if ((i14 & 384) == 0) {
                    str3 = str2;
                    i16 |= o0VarE.B(str3) ? 256 : 128;
                }
                i17 = i15 & 4;
                if (i17 != 0) {
                    if ((i14 & 3072) == 0) {
                        pVar2 = pVar;
                        if (o0VarE.r(pVar2)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i16 |= i18;
                    }
                    if ((i16 & 1171) != 1170) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        if (i19 != 0) {
                            str4 = null;
                        } else {
                            str4 = str3;
                        }
                        e23.p<? super p3.m, ? super Integer, Unit> pVar4 = i17 == 0 ? pVar2 : null;
                        p3.x1 x1Var = p3.n.f135158a;
                        w wVar = w.f111301a;
                        g6.f.a aVar = g6.f.f75994b;
                        e23.p<? super p3.m, ? super Integer, Unit> pVar5 = pVar4;
                        wVar.a(t2Var.a(c2.l.y(h4.r.S, 16), 1.0f, false), str, str4, pVar5, o0VarE, (i16 & 112) | 24576 | (i16 & 896) | (i16 & 7168), 0);
                        str3 = str4;
                        pVar3 = pVar5;
                    } else {
                        o0VarE.e();
                        pVar3 = pVar2;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new a42.a0(this, t2Var, str, str3, pVar3, i14, i15, 16);
                    }
                }
                i16 |= 3072;
                pVar2 = pVar;
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i19 != 0) {
                        str4 = null;
                    } else {
                        str4 = str3;
                    }
                    if (i17 == 0) {
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    w wVar2 = w.f111301a;
                    g6.f.a aVar2 = g6.f.f75994b;
                    e23.p<? super p3.m, ? super Integer, Unit> pVar6 = pVar4;
                    wVar2.a(t2Var.a(c2.l.y(h4.r.S, 16), 1.0f, false), str, str4, pVar6, o0VarE, (i16 & 112) | 24576 | (i16 & 896) | (i16 & 7168), 0);
                    str3 = str4;
                    pVar3 = pVar6;
                } else {
                    o0VarE.e();
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0(this, t2Var, str, str3, pVar3, i14, i15, 16);
                }
            }
            i16 |= 384;
            str3 = str2;
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i19 != 0) {
                        str4 = null;
                    } else {
                        str4 = str3;
                    }
                    if (i17 == 0) {
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    w wVar3 = w.f111301a;
                    g6.f.a aVar3 = g6.f.f75994b;
                    e23.p<? super p3.m, ? super Integer, Unit> pVar7 = pVar4;
                    wVar3.a(t2Var.a(c2.l.y(h4.r.S, 16), 1.0f, false), str, str4, pVar7, o0VarE, (i16 & 112) | 24576 | (i16 & 896) | (i16 & 7168), 0);
                    str3 = str4;
                    pVar3 = pVar7;
                } else {
                    o0VarE.e();
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0(this, t2Var, str, str3, pVar3, i14, i15, 16);
                }
            }
            i16 |= 3072;
            pVar2 = pVar;
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i19 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                if (i17 == 0) {
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                w wVar4 = w.f111301a;
                g6.f.a aVar4 = g6.f.f75994b;
                e23.p<? super p3.m, ? super Integer, Unit> pVar8 = pVar4;
                wVar4.a(t2Var.a(c2.l.y(h4.r.S, 16), 1.0f, false), str, str4, pVar8, o0VarE, (i16 & 112) | 24576 | (i16 & 896) | (i16 & 7168), 0);
                str3 = str4;
                pVar3 = pVar8;
            } else {
                o0VarE.e();
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(this, t2Var, str, str3, pVar3, i14, i15, 16);
            }
        }
    }

    private w() {
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0181  */
    /* JADX WARN: Code duplicated, block: B:69:0x018d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0197  */
    /* JADX WARN: Code duplicated, block: B:72:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public final void a(h4.r rVar, String str, String str2, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str3;
        String str4;
        int i17;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        int i18;
        boolean z14;
        p3.o0 o0Var;
        String str5;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.b bVar;
        String str6;
        rVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-418654562);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            str3 = str;
            i16 |= o0VarE.B(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                str4 = str2;
                i16 |= o0VarE.B(str4) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i19 != 0) {
                        str4 = null;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    j92.f fVar = d92.b.f58624b;
                    fVar.getClass();
                    mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, (i16 >> 3) & 14, 0, 131070);
                    o0Var = o0VarE;
                    if (str4 == null && pVar4 == null) {
                        o0Var.C(-584015308);
                        fVar.getClass();
                        String str7 = str4;
                        mh.c(str7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, (i16 >> 6) & 14, 0, 131070);
                        str6 = str7;
                        o0Var.g0(false);
                    } else {
                        str6 = str4;
                        o0Var.C(-583917286);
                        o0Var.g0(false);
                    }
                    if (pVar4 == null) {
                        o0Var = o0Var;
                        o0Var.C(-583888271);
                        o0Var.g0(false);
                    } else {
                        o0Var = o0Var;
                        o0Var.C(1643732880);
                        e5.q((i16 >> 9) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(true);
                    pVar3 = pVar4;
                    str5 = str6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str5 = str4;
                    pVar3 = pVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0((Object) this, rVar, (Object) str, (Object) str5, (Object) pVar3, i14, i15, 15);
                }
            }
            i16 |= 3072;
            pVar2 = pVar;
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i19 != 0) {
                    str4 = null;
                }
                if (i17 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                d92.b.f58623a.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, (i16 >> 3) & 14, 0, 131070);
                o0Var = o0VarE;
                if (str4 == null) {
                    str6 = str4;
                    o0Var.C(-583917286);
                    o0Var.g0(false);
                } else {
                    str6 = str4;
                    o0Var.C(-583917286);
                    o0Var.g0(false);
                }
                if (pVar4 == null) {
                    o0Var = o0Var;
                    o0Var.C(-583888271);
                    o0Var.g0(false);
                } else {
                    o0Var = o0Var;
                    o0Var.C(1643732880);
                    e5.q((i16 >> 9) & 14, pVar4, o0Var, false);
                }
                o0Var.g0(true);
                pVar3 = pVar4;
                str5 = str6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str5 = str4;
                pVar3 = pVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0((Object) this, rVar, (Object) str, (Object) str5, (Object) pVar3, i14, i15, 15);
            }
        }
        i16 |= 384;
        str4 = str2;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i19 != 0) {
                    str4 = null;
                }
                if (i17 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                d92.b.f58623a.getClass();
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, (i16 >> 3) & 14, 0, 131070);
                o0Var = o0VarE;
                if (str4 == null) {
                    str6 = str4;
                    o0Var.C(-583917286);
                    o0Var.g0(false);
                } else {
                    str6 = str4;
                    o0Var.C(-583917286);
                    o0Var.g0(false);
                }
                if (pVar4 == null) {
                    o0Var = o0Var;
                    o0Var.C(-583888271);
                    o0Var.g0(false);
                } else {
                    o0Var = o0Var;
                    o0Var.C(1643732880);
                    e5.q((i16 >> 9) & 14, pVar4, o0Var, false);
                }
                o0Var.g0(true);
                pVar3 = pVar4;
                str5 = str6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str5 = str4;
                pVar3 = pVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0((Object) this, rVar, (Object) str, (Object) str5, (Object) pVar3, i14, i15, 15);
            }
        }
        i16 |= 3072;
        pVar2 = pVar;
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i19 != 0) {
                str4 = null;
            }
            if (i17 != 0) {
                pVar4 = null;
            } else {
                pVar4 = pVar2;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar4 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar4 = d92.b.f58624b;
            fVar4.getClass();
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, (i16 >> 3) & 14, 0, 131070);
            o0Var = o0VarE;
            if (str4 == null) {
                str6 = str4;
                o0Var.C(-583917286);
                o0Var.g0(false);
            } else {
                str6 = str4;
                o0Var.C(-583917286);
                o0Var.g0(false);
            }
            if (pVar4 == null) {
                o0Var = o0Var;
                o0Var.C(-583888271);
                o0Var.g0(false);
            } else {
                o0Var = o0Var;
                o0Var.C(1643732880);
                e5.q((i16 >> 9) & 14, pVar4, o0Var, false);
            }
            o0Var.g0(true);
            pVar3 = pVar4;
            str5 = str6;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str5 = str4;
            pVar3 = pVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0((Object) this, rVar, (Object) str, (Object) str5, (Object) pVar3, i14, i15, 15);
        }
    }

    public final void b(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1423359424);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            s7.f89624a.getClass();
            long j8 = s7.a(o0VarE).f88504s;
            k2.a aVar = s7.b(o0VarE).f87994e;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            p0.f111203a.getClass();
            ve.a(rVarC, aVar, j8, 0L, 0.0f, 0.0f, null, p0.f111204b, o0VarE, 12582912, 120);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hn1.l(this, i14, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0170  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc A[PHI: r1 r4 r7
      0x00fc: PHI (r1v18 int) = (r1v12 int), (r1v12 int), (r1v19 int) binds: [B:95:0x010b, B:86:0x00f9, B:87:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r4v14 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>) = 
      (r4v4 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
      (r4v2 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
      (r4v2 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:95:0x010b, B:86:0x00f9, B:87:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r7v10 b92.a) = (r7v5 b92.a), (r7v2 b92.a), (r7v2 b92.a) binds: [B:95:0x010b, B:86:0x00f9, B:87:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0162  */
    public final void c(e23.q<? super c2.t2, ? super p3.m, ? super Integer, Unit> qVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.a<Unit> aVar, mc mcVar, b92.a aVar2, e23.p<? super p3.m, ? super Integer, ? extends k3> pVar2, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar2, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        mc mcVar2;
        int i17;
        b92.a aVar3;
        int i18;
        e23.p<? super p3.m, ? super Integer, ? extends k3> pVar4;
        e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar3;
        w wVar;
        boolean z14;
        p3.o0 o0Var;
        e23.p<? super p3.m, ? super Integer, Unit> pVar5;
        b92.a aVar4;
        e23.p<? super p3.m, ? super Integer, ? extends k3> pVar6;
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, ? extends k3> iVar;
        e23.p<? super p3.m, ? super Integer, Unit> pVar7;
        b92.a aVar5;
        int i19;
        int i24;
        int i25;
        int i26;
        qVar.getClass();
        aVar.getClass();
        mcVar.getClass();
        qVar2.getClass();
        p3.o0 o0VarE = mVar.E(16182998);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(qVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i27 = i15 & 2;
        if (i27 == 0) {
            if ((i14 & 48) == 0) {
                pVar3 = pVar;
                i16 |= o0VarE.r(pVar3) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.r(aVar)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i16 |= i26;
            }
            if ((i14 & 3072) == 0) {
                mcVar2 = mcVar;
                if (o0VarE.B(mcVar2)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i16 |= i25;
            } else {
                mcVar2 = mcVar;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    aVar3 = aVar2;
                    if (o0VarE.B(aVar3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                if ((196608 & i14) == 0) {
                    if ((i15 & 32) == 0) {
                        pVar4 = pVar2;
                        int i28 = o0VarE.r(pVar4) ? 131072 : 65536;
                        i16 |= i28;
                    } else {
                        pVar4 = pVar2;
                    }
                    i16 |= i28;
                } else {
                    pVar4 = pVar2;
                }
                if ((1572864 & i14) == 0) {
                    qVar3 = qVar2;
                    if (o0VarE.r(qVar3)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                } else {
                    qVar3 = qVar2;
                }
                if ((12582912 & i14) == 0) {
                    wVar = this;
                    if (o0VarE.B(wVar)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i16 |= i19;
                } else {
                    wVar = this;
                }
                if ((4793491 & i16) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i27 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            iVar = new l71.i(5);
                            pVar7 = pVar3;
                            aVar5 = aVar3;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var = p3.n.f135158a;
                        int i29 = i16 << 3;
                        int i30 = i16 << 6;
                        o0Var = o0VarE;
                        e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar4 = qVar3;
                        wVar.g(z3.f.c(-585242564, new u(qVar, 1), o0VarE), false, pVar7, aVar, mcVar2, tn.k.b(d92.b.f58623a, o0VarE), aVar5, iVar, qVar4, o0Var, (i29 & 57344) | (i29 & 896) | 54 | (i29 & 7168) | (3670016 & i30) | (29360128 & i30) | (234881024 & i30) | (i30 & 1879048192));
                        pVar5 = pVar7;
                        aVar4 = aVar5;
                        pVar6 = iVar;
                    } else {
                        o0VarE.e();
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                        }
                    }
                    pVar7 = pVar3;
                    aVar5 = aVar3;
                    iVar = pVar4;
                    o0VarE.h0();
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i210 = i16 << 3;
                    int i34 = i16 << 6;
                    o0Var = o0VarE;
                    e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar5 = qVar3;
                    wVar.g(z3.f.c(-585242564, new u(qVar, 1), o0VarE), false, pVar7, aVar, mcVar2, tn.k.b(d92.b.f58623a, o0VarE), aVar5, iVar, qVar5, o0Var, (i210 & 57344) | (i210 & 896) | 54 | (i210 & 7168) | (3670016 & i34) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192));
                    pVar5 = pVar7;
                    aVar4 = aVar5;
                    pVar6 = iVar;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    pVar5 = pVar3;
                    aVar4 = aVar3;
                    pVar6 = pVar4;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b82.l(this, qVar, pVar5, aVar, mcVar, aVar4, pVar6, qVar2, i14, i15, 4);
                }
            }
            i16 |= 24576;
            aVar3 = aVar2;
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    pVar4 = pVar2;
                    if (o0VarE.r(pVar4)) {
                    }
                    i16 |= i28;
                } else {
                    pVar4 = pVar2;
                }
                i16 |= i28;
            } else {
                pVar4 = pVar2;
            }
            if ((1572864 & i14) == 0) {
                qVar3 = qVar2;
                if (o0VarE.r(qVar3)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            } else {
                qVar3 = qVar2;
            }
            if ((12582912 & i14) == 0) {
                wVar = this;
                if (o0VarE.B(wVar)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i16 |= i19;
            } else {
                wVar = this;
            }
            if ((4793491 & i16) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i27 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        iVar = new l71.i(5);
                        pVar7 = pVar3;
                        aVar5 = aVar3;
                    } else {
                        pVar7 = pVar3;
                        aVar5 = aVar3;
                        iVar = pVar4;
                    }
                } else {
                    if (i27 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        iVar = new l71.i(5);
                        pVar7 = pVar3;
                        aVar5 = aVar3;
                    } else {
                        pVar7 = pVar3;
                        aVar5 = aVar3;
                        iVar = pVar4;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                int i211 = i16 << 3;
                int i35 = i16 << 6;
                o0Var = o0VarE;
                e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar6 = qVar3;
                wVar.g(z3.f.c(-585242564, new u(qVar, 1), o0VarE), false, pVar7, aVar, mcVar2, tn.k.b(d92.b.f58623a, o0VarE), aVar5, iVar, qVar6, o0Var, (i211 & 57344) | (i211 & 896) | 54 | (i211 & 7168) | (3670016 & i35) | (29360128 & i35) | (234881024 & i35) | (i35 & 1879048192));
                pVar5 = pVar7;
                aVar4 = aVar5;
                pVar6 = iVar;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar5 = pVar3;
                aVar4 = aVar3;
                pVar6 = pVar4;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.l(this, qVar, pVar5, aVar, mcVar, aVar4, pVar6, qVar2, i14, i15, 4);
            }
        }
        i16 |= 48;
        pVar3 = pVar;
        if ((i14 & 384) == 0) {
            if (o0VarE.r(aVar)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i16 |= i26;
        }
        if ((i14 & 3072) == 0) {
            mcVar2 = mcVar;
            if (o0VarE.B(mcVar2)) {
                i25 = 2048;
            } else {
                i25 = 1024;
            }
            i16 |= i25;
        } else {
            mcVar2 = mcVar;
        }
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                aVar3 = aVar2;
                if (o0VarE.B(aVar3)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    pVar4 = pVar2;
                    if (o0VarE.r(pVar4)) {
                    }
                    i16 |= i28;
                } else {
                    pVar4 = pVar2;
                }
                i16 |= i28;
            } else {
                pVar4 = pVar2;
            }
            if ((1572864 & i14) == 0) {
                qVar3 = qVar2;
                if (o0VarE.r(qVar3)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            } else {
                qVar3 = qVar2;
            }
            if ((12582912 & i14) == 0) {
                wVar = this;
                if (o0VarE.B(wVar)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i16 |= i19;
            } else {
                wVar = this;
            }
            if ((4793491 & i16) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i27 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        iVar = new l71.i(5);
                        pVar7 = pVar3;
                        aVar5 = aVar3;
                    } else {
                        pVar7 = pVar3;
                        aVar5 = aVar3;
                        iVar = pVar4;
                    }
                } else {
                    if (i27 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        iVar = new l71.i(5);
                        pVar7 = pVar3;
                        aVar5 = aVar3;
                    } else {
                        pVar7 = pVar3;
                        aVar5 = aVar3;
                        iVar = pVar4;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var4 = p3.n.f135158a;
                int i212 = i16 << 3;
                int i36 = i16 << 6;
                o0Var = o0VarE;
                e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar7 = qVar3;
                wVar.g(z3.f.c(-585242564, new u(qVar, 1), o0VarE), false, pVar7, aVar, mcVar2, tn.k.b(d92.b.f58623a, o0VarE), aVar5, iVar, qVar7, o0Var, (i212 & 57344) | (i212 & 896) | 54 | (i212 & 7168) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192));
                pVar5 = pVar7;
                aVar4 = aVar5;
                pVar6 = iVar;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar5 = pVar3;
                aVar4 = aVar3;
                pVar6 = pVar4;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.l(this, qVar, pVar5, aVar, mcVar, aVar4, pVar6, qVar2, i14, i15, 4);
            }
        }
        i16 |= 24576;
        aVar3 = aVar2;
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                pVar4 = pVar2;
                if (o0VarE.r(pVar4)) {
                }
                i16 |= i28;
            } else {
                pVar4 = pVar2;
            }
            i16 |= i28;
        } else {
            pVar4 = pVar2;
        }
        if ((1572864 & i14) == 0) {
            qVar3 = qVar2;
            if (o0VarE.r(qVar3)) {
                i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i24 = 524288;
            }
            i16 |= i24;
        } else {
            qVar3 = qVar2;
        }
        if ((12582912 & i14) == 0) {
            wVar = this;
            if (o0VarE.B(wVar)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i16 |= i19;
        } else {
            wVar = this;
        }
        if ((4793491 & i16) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i27 != 0) {
                    pVar3 = null;
                }
                if (i17 != 0) {
                    aVar3 = null;
                }
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                    iVar = new l71.i(5);
                    pVar7 = pVar3;
                    aVar5 = aVar3;
                } else {
                    pVar7 = pVar3;
                    aVar5 = aVar3;
                    iVar = pVar4;
                }
            } else {
                if (i27 != 0) {
                    pVar3 = null;
                }
                if (i17 != 0) {
                    aVar3 = null;
                }
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                    iVar = new l71.i(5);
                    pVar7 = pVar3;
                    aVar5 = aVar3;
                } else {
                    pVar7 = pVar3;
                    aVar5 = aVar3;
                    iVar = pVar4;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var5 = p3.n.f135158a;
            int i213 = i16 << 3;
            int i37 = i16 << 6;
            o0Var = o0VarE;
            e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar8 = qVar3;
            wVar.g(z3.f.c(-585242564, new u(qVar, 1), o0VarE), false, pVar7, aVar, mcVar2, tn.k.b(d92.b.f58623a, o0VarE), aVar5, iVar, qVar8, o0Var, (i213 & 57344) | (i213 & 896) | 54 | (i213 & 7168) | (3670016 & i37) | (29360128 & i37) | (234881024 & i37) | (i37 & 1879048192));
            pVar5 = pVar7;
            aVar4 = aVar5;
            pVar6 = iVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            pVar5 = pVar3;
            aVar4 = aVar3;
            pVar6 = pVar4;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.l(this, qVar, pVar5, aVar, mcVar, aVar4, pVar6, qVar2, i14, i15, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed A[PHI: r1 r8
      0x00ed: PHI (r1v17 int) = (r1v11 int), (r1v11 int), (r1v18 int) binds: [B:86:0x00f6, B:80:0x00ea, B:81:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r8v8 b92.a) = (r8v4 b92.a), (r8v2 b92.a), (r8v2 b92.a) binds: [B:86:0x00f6, B:80:0x00ea, B:81:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0145  */
    /* JADX WARN: Code duplicated, block: B:92:0x0150  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public final void d(String str, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.a<Unit> aVar, mc mcVar, b92.a aVar2, e23.p<? super p3.m, ? super Integer, ? extends k3> pVar2, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15) {
        int i16;
        b92.a aVar3;
        e23.p<? super p3.m, ? super Integer, ? extends k3> pVar3;
        w wVar;
        boolean z14;
        b92.a aVar4;
        e23.p<? super p3.m, ? super Integer, ? extends k3> pVar4;
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, ? extends k3> iVar;
        b92.a aVar5;
        int i17;
        int i18;
        str.getClass();
        aVar.getClass();
        mcVar.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-1116717127);
        int i19 = 2;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        int i24 = i15 & 16;
        if (i24 == 0) {
            if ((i14 & 24576) == 0) {
                aVar3 = aVar2;
                i16 |= o0VarE.B(aVar3) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    pVar3 = pVar2;
                    int i25 = o0VarE.r(pVar3) ? 131072 : 65536;
                    i16 |= i25;
                } else {
                    pVar3 = pVar2;
                }
                i16 |= i25;
            } else {
                pVar3 = pVar2;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(qVar)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            if ((12582912 & i14) == 0) {
                wVar = this;
                if (o0VarE.B(wVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i16 |= i17;
            } else {
                wVar = this;
            }
            if ((4793491 & i16) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i24 != 0) {
                        aVar3 = null;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        iVar = new l71.i(i19);
                        aVar5 = aVar3;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    int i26 = i16 << 3;
                    int i27 = i16 << 6;
                    wVar.g(z3.f.c(-223217517, new gw1.e(str, aVar5, aVar, 22), o0VarE), false, pVar, aVar, mcVar, tn.k.b(d92.b.f58623a, o0VarE), aVar5, iVar, qVar, o0VarE, (i26 & 7168) | (i26 & 896) | 54 | (i26 & 57344) | (3670016 & i27) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192));
                    aVar4 = aVar5;
                    pVar4 = iVar;
                } else {
                    o0VarE.e();
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                    }
                }
                aVar5 = aVar3;
                iVar = pVar3;
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                int i28 = i16 << 3;
                int i29 = i16 << 6;
                wVar.g(z3.f.c(-223217517, new gw1.e(str, aVar5, aVar, 22), o0VarE), false, pVar, aVar, mcVar, tn.k.b(d92.b.f58623a, o0VarE), aVar5, iVar, qVar, o0VarE, (i28 & 7168) | (i28 & 896) | 54 | (i28 & 57344) | (3670016 & i29) | (29360128 & i29) | (234881024 & i29) | (i29 & 1879048192));
                aVar4 = aVar5;
                pVar4 = iVar;
            } else {
                o0VarE.e();
                aVar4 = aVar3;
                pVar4 = pVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.l(this, str, pVar, aVar, mcVar, aVar4, pVar4, qVar, i14, i15, 5);
            }
        }
        i16 |= 24576;
        aVar3 = aVar2;
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                pVar3 = pVar2;
                if (o0VarE.r(pVar3)) {
                }
                i16 |= i25;
            } else {
                pVar3 = pVar2;
            }
            i16 |= i25;
        } else {
            pVar3 = pVar2;
        }
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(qVar)) {
                i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i18 = 524288;
            }
            i16 |= i18;
        }
        if ((12582912 & i14) == 0) {
            wVar = this;
            if (o0VarE.B(wVar)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i16 |= i17;
        } else {
            wVar = this;
        }
        if ((4793491 & i16) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i24 != 0) {
                    aVar3 = null;
                }
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                    iVar = new l71.i(i19);
                    aVar5 = aVar3;
                } else {
                    aVar5 = aVar3;
                    iVar = pVar3;
                }
            } else {
                if (i24 != 0) {
                    aVar3 = null;
                }
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                    iVar = new l71.i(i19);
                    aVar5 = aVar3;
                } else {
                    aVar5 = aVar3;
                    iVar = pVar3;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var3 = p3.n.f135158a;
            int i210 = i16 << 3;
            int i211 = i16 << 6;
            wVar.g(z3.f.c(-223217517, new gw1.e(str, aVar5, aVar, 22), o0VarE), false, pVar, aVar, mcVar, tn.k.b(d92.b.f58623a, o0VarE), aVar5, iVar, qVar, o0VarE, (i210 & 7168) | (i210 & 896) | 54 | (i210 & 57344) | (3670016 & i211) | (29360128 & i211) | (234881024 & i211) | (i211 & 1879048192));
            aVar4 = aVar5;
            pVar4 = iVar;
        } else {
            o0VarE.e();
            aVar4 = aVar3;
            pVar4 = pVar3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.l(this, str, pVar, aVar, mcVar, aVar4, pVar4, qVar, i14, i15, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x010f  */
    /* JADX WARN: Code duplicated, block: B:88:0x012c  */
    /* JADX WARN: Code duplicated, block: B:90:0x016f  */
    /* JADX WARN: Code duplicated, block: B:93:0x017e  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public final void e(e23.q qVar, e23.p pVar, e23.a aVar, mc mcVar, boolean z14, e23.p pVar2, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p pVar3;
        mc mcVar2;
        int i17;
        boolean z15;
        int i18;
        int i19;
        z3.e eVar2;
        w wVar;
        boolean z16;
        e23.p pVar4;
        boolean z17;
        e23.p pVar5;
        p3.o0 o0Var;
        p3.p2 p2VarI0;
        int i24;
        int i25;
        e23.p iVar;
        long jB;
        w wVar2;
        int i26;
        int i27;
        int i28;
        int i29;
        qVar.getClass();
        aVar.getClass();
        mcVar.getClass();
        p3.o0 o0VarE = mVar.E(3135024);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(qVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i30 = i15 & 2;
        if (i30 == 0) {
            if ((i14 & 48) == 0) {
                pVar3 = pVar;
                i16 |= o0VarE.r(pVar3) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.r(aVar)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i16 |= i29;
            }
            if ((i14 & 3072) == 0) {
                mcVar2 = mcVar;
                if (o0VarE.B(mcVar2)) {
                    i28 = 2048;
                } else {
                    i28 = 1024;
                }
                i16 |= i28;
            } else {
                mcVar2 = mcVar;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                i19 = 196608 | i16;
                if ((1572864 & i14) == 0) {
                    i19 = 720896 | i16;
                }
                if ((12582912 & i14) == 0) {
                    eVar2 = eVar;
                    if (o0VarE.r(eVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i19 |= i27;
                } else {
                    eVar2 = eVar;
                }
                if ((100663296 & i14) == 0) {
                    wVar2 = this;
                    if (o0VarE.B(wVar2)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i19 |= i26;
                    wVar = wVar2;
                } else {
                    wVar = this;
                }
                if ((38347923 & i19) != 38347922) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i19 & 1, z16)) {
                    o0VarE.G0();
                    i24 = 3;
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i30 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar3;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        }
                        i25 = i19 & (-3670017);
                        iVar = new l71.i(i24);
                    } else {
                        o0VarE.e();
                        iVar = pVar2;
                        i25 = i19 & (-3670017);
                        pVar4 = pVar3;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    z3.e eVarC = z3.f.c(1537776394, new u(qVar, 0), o0VarE);
                    if (z15) {
                        o0VarE.C(-1282185068);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).c().c();
                    } else {
                        o0VarE.C(-1282184009);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).c().b();
                    }
                    o0VarE.g0(false);
                    int i34 = i25 << 3;
                    p3.o0 o0Var2 = o0VarE;
                    wVar.g(eVarC, true, pVar4, aVar, mcVar2, jB, null, iVar, eVar2, o0Var2, (i34 & 896) | 54 | (i34 & 7168) | (57344 & i34) | (3670016 & i34) | (234881024 & i34) | (i34 & 1879048192));
                    z17 = z15;
                    pVar5 = iVar;
                    o0Var = o0Var2;
                } else {
                    p3.o0 o0Var3 = o0VarE;
                    o0Var3.e();
                    pVar4 = pVar3;
                    z17 = z15;
                    pVar5 = pVar2;
                    o0Var = o0Var3;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a3.q(this, qVar, pVar4, aVar, mcVar, z17, pVar5, eVar, i14, i15);
                }
            }
            i16 |= 24576;
            z15 = z14;
            i19 = 196608 | i16;
            if ((1572864 & i14) == 0) {
                i19 = 720896 | i16;
            }
            if ((12582912 & i14) == 0) {
                eVar2 = eVar;
                if (o0VarE.r(eVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i19 |= i27;
            } else {
                eVar2 = eVar;
            }
            if ((100663296 & i14) == 0) {
                wVar2 = this;
                if (o0VarE.B(wVar2)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i19 |= i26;
                wVar = wVar2;
            } else {
                wVar = this;
            }
            if ((38347923 & i19) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                o0VarE.G0();
                i24 = 3;
                if ((i14 & 1) != 0) {
                    if (i30 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    }
                    i25 = i19 & (-3670017);
                    iVar = new l71.i(i24);
                } else {
                    if (i30 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    }
                    i25 = i19 & (-3670017);
                    iVar = new l71.i(i24);
                }
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                z3.e eVarC2 = z3.f.c(1537776394, new u(qVar, 0), o0VarE);
                if (z15) {
                    o0VarE.C(-1282185068);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().c();
                } else {
                    o0VarE.C(-1282184009);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().b();
                }
                o0VarE.g0(false);
                int i35 = i25 << 3;
                p3.o0 o0Var4 = o0VarE;
                wVar.g(eVarC2, true, pVar4, aVar, mcVar2, jB, null, iVar, eVar2, o0Var4, (i35 & 896) | 54 | (i35 & 7168) | (57344 & i35) | (3670016 & i35) | (234881024 & i35) | (i35 & 1879048192));
                z17 = z15;
                pVar5 = iVar;
                o0Var = o0Var4;
            } else {
                p3.o0 o0Var5 = o0VarE;
                o0Var5.e();
                pVar4 = pVar3;
                z17 = z15;
                pVar5 = pVar2;
                o0Var = o0Var5;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a3.q(this, qVar, pVar4, aVar, mcVar, z17, pVar5, eVar, i14, i15);
            }
        }
        i16 |= 48;
        pVar3 = pVar;
        if ((i14 & 384) == 0) {
            if (o0VarE.r(aVar)) {
                i29 = 256;
            } else {
                i29 = 128;
            }
            i16 |= i29;
        }
        if ((i14 & 3072) == 0) {
            mcVar2 = mcVar;
            if (o0VarE.B(mcVar2)) {
                i28 = 2048;
            } else {
                i28 = 1024;
            }
            i16 |= i28;
        } else {
            mcVar2 = mcVar;
        }
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            i19 = 196608 | i16;
            if ((1572864 & i14) == 0) {
                i19 = 720896 | i16;
            }
            if ((12582912 & i14) == 0) {
                eVar2 = eVar;
                if (o0VarE.r(eVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i19 |= i27;
            } else {
                eVar2 = eVar;
            }
            if ((100663296 & i14) == 0) {
                wVar2 = this;
                if (o0VarE.B(wVar2)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i19 |= i26;
                wVar = wVar2;
            } else {
                wVar = this;
            }
            if ((38347923 & i19) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                o0VarE.G0();
                i24 = 3;
                if ((i14 & 1) != 0) {
                    if (i30 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    }
                    i25 = i19 & (-3670017);
                    iVar = new l71.i(i24);
                } else {
                    if (i30 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    }
                    i25 = i19 & (-3670017);
                    iVar = new l71.i(i24);
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                z3.e eVarC3 = z3.f.c(1537776394, new u(qVar, 0), o0VarE);
                if (z15) {
                    o0VarE.C(-1282185068);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().c();
                } else {
                    o0VarE.C(-1282184009);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().b();
                }
                o0VarE.g0(false);
                int i36 = i25 << 3;
                p3.o0 o0Var6 = o0VarE;
                wVar.g(eVarC3, true, pVar4, aVar, mcVar2, jB, null, iVar, eVar2, o0Var6, (i36 & 896) | 54 | (i36 & 7168) | (57344 & i36) | (3670016 & i36) | (234881024 & i36) | (i36 & 1879048192));
                z17 = z15;
                pVar5 = iVar;
                o0Var = o0Var6;
            } else {
                p3.o0 o0Var7 = o0VarE;
                o0Var7.e();
                pVar4 = pVar3;
                z17 = z15;
                pVar5 = pVar2;
                o0Var = o0Var7;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a3.q(this, qVar, pVar4, aVar, mcVar, z17, pVar5, eVar, i14, i15);
            }
        }
        i16 |= 24576;
        z15 = z14;
        i19 = 196608 | i16;
        if ((1572864 & i14) == 0) {
            i19 = 720896 | i16;
        }
        if ((12582912 & i14) == 0) {
            eVar2 = eVar;
            if (o0VarE.r(eVar2)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i19 |= i27;
        } else {
            eVar2 = eVar;
        }
        if ((100663296 & i14) == 0) {
            wVar2 = this;
            if (o0VarE.B(wVar2)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i19 |= i26;
            wVar = wVar2;
        } else {
            wVar = this;
        }
        if ((38347923 & i19) != 38347922) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i19 & 1, z16)) {
            o0VarE.G0();
            i24 = 3;
            if ((i14 & 1) != 0) {
                if (i30 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar3;
                }
                if (i17 != 0) {
                    z15 = false;
                }
                i25 = i19 & (-3670017);
                iVar = new l71.i(i24);
            } else {
                if (i30 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar3;
                }
                if (i17 != 0) {
                    z15 = false;
                }
                i25 = i19 & (-3670017);
                iVar = new l71.i(i24);
            }
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            z3.e eVarC4 = z3.f.c(1537776394, new u(qVar, 0), o0VarE);
            if (z15) {
                o0VarE.C(-1282185068);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().c();
            } else {
                o0VarE.C(-1282184009);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().b();
            }
            o0VarE.g0(false);
            int i37 = i25 << 3;
            p3.o0 o0Var8 = o0VarE;
            wVar.g(eVarC4, true, pVar4, aVar, mcVar2, jB, null, iVar, eVar2, o0Var8, (i37 & 896) | 54 | (i37 & 7168) | (57344 & i37) | (3670016 & i37) | (234881024 & i37) | (i37 & 1879048192));
            z17 = z15;
            pVar5 = iVar;
            o0Var = o0Var8;
        } else {
            p3.o0 o0Var9 = o0VarE;
            o0Var9.e();
            pVar4 = pVar3;
            z17 = z15;
            pVar5 = pVar2;
            o0Var = o0Var9;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.q(this, qVar, pVar4, aVar, mcVar, z17, pVar5, eVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149 A[PHI: r1 r6 r8 r10 r17
      0x0149: PHI (r1v28 boolean) = (r1v25 boolean), (r1v31 boolean) binds: [B:124:0x0160, B:110:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r6v8 java.lang.String) = (r6v5 java.lang.String), (r6v2 java.lang.String) binds: [B:124:0x0160, B:110:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r8v9 e23.p) = (r8v5 e23.p), (r8v2 e23.p) binds: [B:124:0x0160, B:110:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r10v7 e23.p) = (r10v4 e23.p), (r10v2 e23.p) binds: [B:124:0x0160, B:110:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r17v7 int) = (r17v3 int), (r17v8 int) binds: [B:124:0x0160, B:110:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x014e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x0154  */
    /* JADX WARN: Code duplicated, block: B:119:0x0157  */
    /* JADX WARN: Code duplicated, block: B:121:0x015a  */
    /* JADX WARN: Code duplicated, block: B:122:0x015c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0162  */
    /* JADX WARN: Code duplicated, block: B:128:0x0182  */
    /* JADX WARN: Code duplicated, block: B:130:0x019f  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:136:0x0201  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    public final void f(String str, String str2, e23.p pVar, e23.p pVar2, e23.a aVar, mc mcVar, boolean z14, e23.p pVar3, e23.q qVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str3;
        int i17;
        e23.p pVar4;
        int i18;
        int i19;
        e23.p pVar5;
        int i24;
        mc mcVar2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z15;
        p3.o0 o0Var;
        e23.p pVar6;
        e23.p pVar7;
        e23.p pVar8;
        boolean z16;
        String str4;
        p3.p2 p2VarI0;
        boolean z17;
        e23.p iVar;
        long jB;
        int i30;
        int i34;
        int i35;
        str.getClass();
        aVar.getClass();
        mcVar.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(1761948687);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i36 = i15 & 2;
        if (i36 == 0) {
            if ((i14 & 48) == 0) {
                str3 = str2;
                i16 |= o0VarE.B(str3) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    pVar4 = pVar;
                    if (o0VarE.r(pVar4)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 8;
                if (i19 != 0) {
                    if ((i14 & 3072) == 0) {
                        pVar5 = pVar2;
                        if (o0VarE.r(pVar5)) {
                            i24 = 2048;
                        } else {
                            i24 = 1024;
                        }
                        i16 |= i24;
                    }
                    if ((i14 & 24576) != 0) {
                        if (o0VarE.r(aVar)) {
                            i35 = 16384;
                        } else {
                            i35 = 8192;
                        }
                        i16 |= i35;
                    }
                    if ((196608 & i14) == 0) {
                        mcVar2 = mcVar;
                        if (o0VarE.B(mcVar2)) {
                            i34 = 131072;
                        } else {
                            i34 = 65536;
                        }
                        i16 |= i34;
                    } else {
                        mcVar2 = mcVar;
                    }
                    i25 = i15 & 64;
                    if (i25 != 0) {
                        i16 |= 1572864;
                    } else if ((i14 & 1572864) == 0) {
                        if (o0VarE.h(z14)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                    i27 = i16 | 12582912;
                    if ((i14 & 100663296) != 0) {
                        i27 |= ((i15 & 256) == 0 || !o0VarE.r(pVar3)) ? 33554432 : 67108864;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        int i37 = i27;
                        if (o0VarE.r(qVar)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i28 = i37 | i30;
                    } else {
                        i28 = i27;
                    }
                    if (o0VarE.B(this)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    if ((i28 & 306783379) == 306783378 || (i29 & 3) != 2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (o0VarE.n(i28 & 1, z15)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0 || o0VarE.o0()) {
                            if (i36 != 0) {
                                str3 = null;
                            }
                            if (i17 != 0) {
                                pVar4 = null;
                            }
                            if (i19 != 0) {
                                pVar5 = null;
                            }
                            if (i25 != 0) {
                                z17 = false;
                            } else {
                                z17 = z14;
                            }
                            if ((i15 & 256) != 0) {
                                i28 &= -234881025;
                                iVar = new l71.i(1);
                            }
                            e23.p pVar9 = pVar5;
                            o0VarE.h0();
                            p3.x1 x1Var = p3.n.f135158a;
                            z3.e eVarC = z3.f.c(-726699159, new gw1.e(str, str3, pVar4, 23), o0VarE);
                            if (z17) {
                                o0VarE.C(1015602867);
                                d92.b.f58623a.getClass();
                                jB = d92.b.a(o0VarE).c().c();
                            } else {
                                o0VarE.C(1015603926);
                                d92.b.f58623a.getClass();
                                jB = d92.b.a(o0VarE).c().b();
                            }
                            o0VarE.g0(false);
                            int i38 = i28 >> 3;
                            o0Var = o0VarE;
                            g(eVarC, true, pVar9, aVar, mcVar2, jB, null, iVar, qVar, o0Var, (i38 & 234881024) | (i38 & 896) | 54 | (i38 & 7168) | (57344 & i38) | (3670016 & i38) | (29360128 & i38) | ((i29 << 27) & 1879048192));
                            pVar7 = pVar4;
                            pVar8 = pVar9;
                            pVar6 = iVar;
                            z16 = z17;
                        } else {
                            o0VarE.e();
                            if ((i15 & 256) != 0) {
                                i28 &= -234881025;
                            }
                            z17 = z14;
                        }
                        iVar = pVar3;
                        e23.p pVar10 = pVar5;
                        o0VarE.h0();
                        p3.x1 x1Var2 = p3.n.f135158a;
                        z3.e eVarC2 = z3.f.c(-726699159, new gw1.e(str, str3, pVar4, 23), o0VarE);
                        if (z17) {
                            o0VarE.C(1015602867);
                            d92.b.f58623a.getClass();
                            jB = d92.b.a(o0VarE).c().c();
                        } else {
                            o0VarE.C(1015603926);
                            d92.b.f58623a.getClass();
                            jB = d92.b.a(o0VarE).c().b();
                        }
                        o0VarE.g0(false);
                        int i39 = i28 >> 3;
                        o0Var = o0VarE;
                        g(eVarC2, true, pVar10, aVar, mcVar2, jB, null, iVar, qVar, o0Var, (i39 & 234881024) | (i39 & 896) | 54 | (i39 & 7168) | (57344 & i39) | (3670016 & i39) | (29360128 & i39) | ((i29 << 27) & 1879048192));
                        pVar7 = pVar4;
                        pVar8 = pVar10;
                        pVar6 = iVar;
                        z16 = z17;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        pVar6 = pVar3;
                        pVar7 = pVar4;
                        pVar8 = pVar5;
                        z16 = z14;
                    }
                    str4 = str3;
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new c12.f(this, str, str4, pVar7, pVar8, aVar, mcVar, z16, pVar6, qVar, i14, i15);
                    }
                }
                i16 |= 3072;
                pVar5 = pVar2;
                if ((i14 & 24576) != 0) {
                    if (o0VarE.r(aVar)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i16 |= i35;
                }
                if ((196608 & i14) == 0) {
                    mcVar2 = mcVar;
                    if (o0VarE.B(mcVar2)) {
                        i34 = 131072;
                    } else {
                        i34 = 65536;
                    }
                    i16 |= i34;
                } else {
                    mcVar2 = mcVar;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (o0VarE.h(z14)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i27 = i16 | 12582912;
                if ((i14 & 100663296) != 0) {
                    i27 |= ((i15 & 256) == 0 || !o0VarE.r(pVar3)) ? 33554432 : 67108864;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    int i310 = i27;
                    if (o0VarE.r(qVar)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i28 = i310 | i30;
                } else {
                    i28 = i27;
                }
                if (o0VarE.B(this)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                if ((i28 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i28 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if (i19 != 0) {
                            pVar5 = null;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if ((i15 & 256) != 0) {
                            i28 &= -234881025;
                            iVar = new l71.i(1);
                        } else {
                            iVar = pVar3;
                        }
                    } else {
                        if (i36 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if (i19 != 0) {
                            pVar5 = null;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if ((i15 & 256) != 0) {
                            i28 &= -234881025;
                            iVar = new l71.i(1);
                        } else {
                            iVar = pVar3;
                        }
                    }
                    e23.p pVar11 = pVar5;
                    o0VarE.h0();
                    p3.x1 x1Var3 = p3.n.f135158a;
                    z3.e eVarC3 = z3.f.c(-726699159, new gw1.e(str, str3, pVar4, 23), o0VarE);
                    if (z17) {
                        o0VarE.C(1015602867);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).c().c();
                    } else {
                        o0VarE.C(1015603926);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).c().b();
                    }
                    o0VarE.g0(false);
                    int i311 = i28 >> 3;
                    o0Var = o0VarE;
                    g(eVarC3, true, pVar11, aVar, mcVar2, jB, null, iVar, qVar, o0Var, (i311 & 234881024) | (i311 & 896) | 54 | (i311 & 7168) | (57344 & i311) | (3670016 & i311) | (29360128 & i311) | ((i29 << 27) & 1879048192));
                    pVar7 = pVar4;
                    pVar8 = pVar11;
                    pVar6 = iVar;
                    z16 = z17;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    pVar6 = pVar3;
                    pVar7 = pVar4;
                    pVar8 = pVar5;
                    z16 = z14;
                }
                str4 = str3;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c12.f(this, str, str4, pVar7, pVar8, aVar, mcVar, z16, pVar6, qVar, i14, i15);
                }
            }
            i16 |= 384;
            pVar4 = pVar;
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    pVar5 = pVar2;
                    if (o0VarE.r(pVar5)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                if ((i14 & 24576) != 0) {
                    if (o0VarE.r(aVar)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i16 |= i35;
                }
                if ((196608 & i14) == 0) {
                    mcVar2 = mcVar;
                    if (o0VarE.B(mcVar2)) {
                        i34 = 131072;
                    } else {
                        i34 = 65536;
                    }
                    i16 |= i34;
                } else {
                    mcVar2 = mcVar;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (o0VarE.h(z14)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i27 = i16 | 12582912;
                if ((i14 & 100663296) != 0) {
                    i27 |= ((i15 & 256) == 0 || !o0VarE.r(pVar3)) ? 33554432 : 67108864;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    int i312 = i27;
                    if (o0VarE.r(qVar)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i28 = i312 | i30;
                } else {
                    i28 = i27;
                }
                if (o0VarE.B(this)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                if ((i28 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i28 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if (i19 != 0) {
                            pVar5 = null;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if ((i15 & 256) != 0) {
                            i28 &= -234881025;
                            iVar = new l71.i(1);
                        } else {
                            iVar = pVar3;
                        }
                    } else {
                        if (i36 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if (i19 != 0) {
                            pVar5 = null;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if ((i15 & 256) != 0) {
                            i28 &= -234881025;
                            iVar = new l71.i(1);
                        } else {
                            iVar = pVar3;
                        }
                    }
                    e23.p pVar12 = pVar5;
                    o0VarE.h0();
                    p3.x1 x1Var4 = p3.n.f135158a;
                    z3.e eVarC4 = z3.f.c(-726699159, new gw1.e(str, str3, pVar4, 23), o0VarE);
                    if (z17) {
                        o0VarE.C(1015602867);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).c().c();
                    } else {
                        o0VarE.C(1015603926);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).c().b();
                    }
                    o0VarE.g0(false);
                    int i313 = i28 >> 3;
                    o0Var = o0VarE;
                    g(eVarC4, true, pVar12, aVar, mcVar2, jB, null, iVar, qVar, o0Var, (i313 & 234881024) | (i313 & 896) | 54 | (i313 & 7168) | (57344 & i313) | (3670016 & i313) | (29360128 & i313) | ((i29 << 27) & 1879048192));
                    pVar7 = pVar4;
                    pVar8 = pVar12;
                    pVar6 = iVar;
                    z16 = z17;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    pVar6 = pVar3;
                    pVar7 = pVar4;
                    pVar8 = pVar5;
                    z16 = z14;
                }
                str4 = str3;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c12.f(this, str, str4, pVar7, pVar8, aVar, mcVar, z16, pVar6, qVar, i14, i15);
                }
            }
            i16 |= 3072;
            pVar5 = pVar2;
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i16 |= i35;
            }
            if ((196608 & i14) == 0) {
                mcVar2 = mcVar;
                if (o0VarE.B(mcVar2)) {
                    i34 = 131072;
                } else {
                    i34 = 65536;
                }
                i16 |= i34;
            } else {
                mcVar2 = mcVar;
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.h(z14)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i27 = i16 | 12582912;
            if ((i14 & 100663296) != 0) {
                i27 |= ((i15 & 256) == 0 || !o0VarE.r(pVar3)) ? 33554432 : 67108864;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                int i314 = i27;
                if (o0VarE.r(qVar)) {
                    i30 = 536870912;
                } else {
                    i30 = 268435456;
                }
                i28 = i314 | i30;
            } else {
                i28 = i27;
            }
            if (o0VarE.B(this)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            if ((i28 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i28 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i36 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if (i19 != 0) {
                        pVar5 = null;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if ((i15 & 256) != 0) {
                        i28 &= -234881025;
                        iVar = new l71.i(1);
                    } else {
                        iVar = pVar3;
                    }
                } else {
                    if (i36 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if (i19 != 0) {
                        pVar5 = null;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if ((i15 & 256) != 0) {
                        i28 &= -234881025;
                        iVar = new l71.i(1);
                    } else {
                        iVar = pVar3;
                    }
                }
                e23.p pVar13 = pVar5;
                o0VarE.h0();
                p3.x1 x1Var5 = p3.n.f135158a;
                z3.e eVarC5 = z3.f.c(-726699159, new gw1.e(str, str3, pVar4, 23), o0VarE);
                if (z17) {
                    o0VarE.C(1015602867);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().c();
                } else {
                    o0VarE.C(1015603926);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().b();
                }
                o0VarE.g0(false);
                int i315 = i28 >> 3;
                o0Var = o0VarE;
                g(eVarC5, true, pVar13, aVar, mcVar2, jB, null, iVar, qVar, o0Var, (i315 & 234881024) | (i315 & 896) | 54 | (i315 & 7168) | (57344 & i315) | (3670016 & i315) | (29360128 & i315) | ((i29 << 27) & 1879048192));
                pVar7 = pVar4;
                pVar8 = pVar13;
                pVar6 = iVar;
                z16 = z17;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar6 = pVar3;
                pVar7 = pVar4;
                pVar8 = pVar5;
                z16 = z14;
            }
            str4 = str3;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c12.f(this, str, str4, pVar7, pVar8, aVar, mcVar, z16, pVar6, qVar, i14, i15);
            }
        }
        i16 |= 48;
        str3 = str2;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                pVar4 = pVar;
                if (o0VarE.r(pVar4)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    pVar5 = pVar2;
                    if (o0VarE.r(pVar5)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                if ((i14 & 24576) != 0) {
                    if (o0VarE.r(aVar)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i16 |= i35;
                }
                if ((196608 & i14) == 0) {
                    mcVar2 = mcVar;
                    if (o0VarE.B(mcVar2)) {
                        i34 = 131072;
                    } else {
                        i34 = 65536;
                    }
                    i16 |= i34;
                } else {
                    mcVar2 = mcVar;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (o0VarE.h(z14)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i27 = i16 | 12582912;
                if ((i14 & 100663296) != 0) {
                    i27 |= ((i15 & 256) == 0 || !o0VarE.r(pVar3)) ? 33554432 : 67108864;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    int i316 = i27;
                    if (o0VarE.r(qVar)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i28 = i316 | i30;
                } else {
                    i28 = i27;
                }
                if (o0VarE.B(this)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                if ((i28 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i28 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i36 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if (i19 != 0) {
                            pVar5 = null;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if ((i15 & 256) != 0) {
                            i28 &= -234881025;
                            iVar = new l71.i(1);
                        } else {
                            iVar = pVar3;
                        }
                    } else {
                        if (i36 != 0) {
                            str3 = null;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if (i19 != 0) {
                            pVar5 = null;
                        }
                        if (i25 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if ((i15 & 256) != 0) {
                            i28 &= -234881025;
                            iVar = new l71.i(1);
                        } else {
                            iVar = pVar3;
                        }
                    }
                    e23.p pVar14 = pVar5;
                    o0VarE.h0();
                    p3.x1 x1Var6 = p3.n.f135158a;
                    z3.e eVarC6 = z3.f.c(-726699159, new gw1.e(str, str3, pVar4, 23), o0VarE);
                    if (z17) {
                        o0VarE.C(1015602867);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).c().c();
                    } else {
                        o0VarE.C(1015603926);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).c().b();
                    }
                    o0VarE.g0(false);
                    int i317 = i28 >> 3;
                    o0Var = o0VarE;
                    g(eVarC6, true, pVar14, aVar, mcVar2, jB, null, iVar, qVar, o0Var, (i317 & 234881024) | (i317 & 896) | 54 | (i317 & 7168) | (57344 & i317) | (3670016 & i317) | (29360128 & i317) | ((i29 << 27) & 1879048192));
                    pVar7 = pVar4;
                    pVar8 = pVar14;
                    pVar6 = iVar;
                    z16 = z17;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    pVar6 = pVar3;
                    pVar7 = pVar4;
                    pVar8 = pVar5;
                    z16 = z14;
                }
                str4 = str3;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c12.f(this, str, str4, pVar7, pVar8, aVar, mcVar, z16, pVar6, qVar, i14, i15);
                }
            }
            i16 |= 3072;
            pVar5 = pVar2;
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i16 |= i35;
            }
            if ((196608 & i14) == 0) {
                mcVar2 = mcVar;
                if (o0VarE.B(mcVar2)) {
                    i34 = 131072;
                } else {
                    i34 = 65536;
                }
                i16 |= i34;
            } else {
                mcVar2 = mcVar;
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.h(z14)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i27 = i16 | 12582912;
            if ((i14 & 100663296) != 0) {
                i27 |= ((i15 & 256) == 0 || !o0VarE.r(pVar3)) ? 33554432 : 67108864;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                int i318 = i27;
                if (o0VarE.r(qVar)) {
                    i30 = 536870912;
                } else {
                    i30 = 268435456;
                }
                i28 = i318 | i30;
            } else {
                i28 = i27;
            }
            if (o0VarE.B(this)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            if ((i28 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i28 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i36 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if (i19 != 0) {
                        pVar5 = null;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if ((i15 & 256) != 0) {
                        i28 &= -234881025;
                        iVar = new l71.i(1);
                    } else {
                        iVar = pVar3;
                    }
                } else {
                    if (i36 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if (i19 != 0) {
                        pVar5 = null;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if ((i15 & 256) != 0) {
                        i28 &= -234881025;
                        iVar = new l71.i(1);
                    } else {
                        iVar = pVar3;
                    }
                }
                e23.p pVar15 = pVar5;
                o0VarE.h0();
                p3.x1 x1Var7 = p3.n.f135158a;
                z3.e eVarC7 = z3.f.c(-726699159, new gw1.e(str, str3, pVar4, 23), o0VarE);
                if (z17) {
                    o0VarE.C(1015602867);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().c();
                } else {
                    o0VarE.C(1015603926);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().b();
                }
                o0VarE.g0(false);
                int i319 = i28 >> 3;
                o0Var = o0VarE;
                g(eVarC7, true, pVar15, aVar, mcVar2, jB, null, iVar, qVar, o0Var, (i319 & 234881024) | (i319 & 896) | 54 | (i319 & 7168) | (57344 & i319) | (3670016 & i319) | (29360128 & i319) | ((i29 << 27) & 1879048192));
                pVar7 = pVar4;
                pVar8 = pVar15;
                pVar6 = iVar;
                z16 = z17;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar6 = pVar3;
                pVar7 = pVar4;
                pVar8 = pVar5;
                z16 = z14;
            }
            str4 = str3;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c12.f(this, str, str4, pVar7, pVar8, aVar, mcVar, z16, pVar6, qVar, i14, i15);
            }
        }
        i16 |= 384;
        pVar4 = pVar;
        i19 = i15 & 8;
        if (i19 != 0) {
            if ((i14 & 3072) == 0) {
                pVar5 = pVar2;
                if (o0VarE.r(pVar5)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i16 |= i24;
            }
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i16 |= i35;
            }
            if ((196608 & i14) == 0) {
                mcVar2 = mcVar;
                if (o0VarE.B(mcVar2)) {
                    i34 = 131072;
                } else {
                    i34 = 65536;
                }
                i16 |= i34;
            } else {
                mcVar2 = mcVar;
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.h(z14)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i27 = i16 | 12582912;
            if ((i14 & 100663296) != 0) {
                i27 |= ((i15 & 256) == 0 || !o0VarE.r(pVar3)) ? 33554432 : 67108864;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                int i3110 = i27;
                if (o0VarE.r(qVar)) {
                    i30 = 536870912;
                } else {
                    i30 = 268435456;
                }
                i28 = i3110 | i30;
            } else {
                i28 = i27;
            }
            if (o0VarE.B(this)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            if ((i28 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i28 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i36 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if (i19 != 0) {
                        pVar5 = null;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if ((i15 & 256) != 0) {
                        i28 &= -234881025;
                        iVar = new l71.i(1);
                    } else {
                        iVar = pVar3;
                    }
                } else {
                    if (i36 != 0) {
                        str3 = null;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if (i19 != 0) {
                        pVar5 = null;
                    }
                    if (i25 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if ((i15 & 256) != 0) {
                        i28 &= -234881025;
                        iVar = new l71.i(1);
                    } else {
                        iVar = pVar3;
                    }
                }
                e23.p pVar16 = pVar5;
                o0VarE.h0();
                p3.x1 x1Var8 = p3.n.f135158a;
                z3.e eVarC8 = z3.f.c(-726699159, new gw1.e(str, str3, pVar4, 23), o0VarE);
                if (z17) {
                    o0VarE.C(1015602867);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().c();
                } else {
                    o0VarE.C(1015603926);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().b();
                }
                o0VarE.g0(false);
                int i3111 = i28 >> 3;
                o0Var = o0VarE;
                g(eVarC8, true, pVar16, aVar, mcVar2, jB, null, iVar, qVar, o0Var, (i3111 & 234881024) | (i3111 & 896) | 54 | (i3111 & 7168) | (57344 & i3111) | (3670016 & i3111) | (29360128 & i3111) | ((i29 << 27) & 1879048192));
                pVar7 = pVar4;
                pVar8 = pVar16;
                pVar6 = iVar;
                z16 = z17;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar6 = pVar3;
                pVar7 = pVar4;
                pVar8 = pVar5;
                z16 = z14;
            }
            str4 = str3;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c12.f(this, str, str4, pVar7, pVar8, aVar, mcVar, z16, pVar6, qVar, i14, i15);
            }
        }
        i16 |= 3072;
        pVar5 = pVar2;
        if ((i14 & 24576) != 0) {
            if (o0VarE.r(aVar)) {
                i35 = 16384;
            } else {
                i35 = 8192;
            }
            i16 |= i35;
        }
        if ((196608 & i14) == 0) {
            mcVar2 = mcVar;
            if (o0VarE.B(mcVar2)) {
                i34 = 131072;
            } else {
                i34 = 65536;
            }
            i16 |= i34;
        } else {
            mcVar2 = mcVar;
        }
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 1572864;
        } else if ((i14 & 1572864) == 0) {
            if (o0VarE.h(z14)) {
                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i26 = 524288;
            }
            i16 |= i26;
        }
        i27 = i16 | 12582912;
        if ((i14 & 100663296) != 0) {
            i27 |= ((i15 & 256) == 0 || !o0VarE.r(pVar3)) ? 33554432 : 67108864;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            int i3112 = i27;
            if (o0VarE.r(qVar)) {
                i30 = 536870912;
            } else {
                i30 = 268435456;
            }
            i28 = i3112 | i30;
        } else {
            i28 = i27;
        }
        if (o0VarE.B(this)) {
            i29 = 4;
        } else {
            i29 = 2;
        }
        if ((i28 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (o0VarE.n(i28 & 1, z15)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i36 != 0) {
                    str3 = null;
                }
                if (i17 != 0) {
                    pVar4 = null;
                }
                if (i19 != 0) {
                    pVar5 = null;
                }
                if (i25 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if ((i15 & 256) != 0) {
                    i28 &= -234881025;
                    iVar = new l71.i(1);
                } else {
                    iVar = pVar3;
                }
            } else {
                if (i36 != 0) {
                    str3 = null;
                }
                if (i17 != 0) {
                    pVar4 = null;
                }
                if (i19 != 0) {
                    pVar5 = null;
                }
                if (i25 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if ((i15 & 256) != 0) {
                    i28 &= -234881025;
                    iVar = new l71.i(1);
                } else {
                    iVar = pVar3;
                }
            }
            e23.p pVar17 = pVar5;
            o0VarE.h0();
            p3.x1 x1Var9 = p3.n.f135158a;
            z3.e eVarC9 = z3.f.c(-726699159, new gw1.e(str, str3, pVar4, 23), o0VarE);
            if (z17) {
                o0VarE.C(1015602867);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().c();
            } else {
                o0VarE.C(1015603926);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().b();
            }
            o0VarE.g0(false);
            int i3113 = i28 >> 3;
            o0Var = o0VarE;
            g(eVarC9, true, pVar17, aVar, mcVar2, jB, null, iVar, qVar, o0Var, (i3113 & 234881024) | (i3113 & 896) | 54 | (i3113 & 7168) | (57344 & i3113) | (3670016 & i3113) | (29360128 & i3113) | ((i29 << 27) & 1879048192));
            pVar7 = pVar4;
            pVar8 = pVar17;
            pVar6 = iVar;
            z16 = z17;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            pVar6 = pVar3;
            pVar7 = pVar4;
            pVar8 = pVar5;
            z16 = z14;
        }
        str4 = str3;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c12.f(this, str, str4, pVar7, pVar8, aVar, mcVar, z16, pVar6, qVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0126  */
    public final void g(final e23.q qVar, final boolean z14, final e23.p pVar, final e23.a aVar, final mc mcVar, final long j8, final b92.a aVar2, final e23.p pVar2, final e23.q qVar2, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0Var;
        boolean z15;
        z3.e eVarC;
        p3.o0 o0VarE = mVar.E(395520305);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(qVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(mcVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.l(j8) ? 131072 : 65536;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(pVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(qVar2) ? 67108864 : 33554432;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (37823635 & i16) != 37823634)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar = j92.b.f97900c;
            float f14 = dVar.f97912d;
            bVar.getClass();
            k2.h hVarC = k2.i.c(f14, dVar.f97912d, 0.0f, 0.0f, 12);
            if (z14) {
                o0VarE.C(1851272078);
                eVarC = z3.f.c(320983830, new kk1.h(hVarC, 18), o0VarE);
                z15 = false;
                o0VarE.g0(false);
            } else {
                z15 = false;
                o0VarE.C(1851774061);
                o0VarE.g0(false);
                eVarC = null;
            }
            z3.e eVar = eVarC;
            if ((i16 & 7168) == 2048) {
                z15 = true;
            }
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new t(aVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t(aVar, 2);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            e9.a((e23.a) objQ, null, mcVar, 0.0f, z14, hVarC, j8, 0L, 0.0f, 0L, eVar, new a3.d(pVar2, 21), null, z3.f.c(-457334385, new ho.e(z14, j8, pVar2, hVarC, qVar2, qVar, pVar), o0VarE), o0Var, ((i16 >> 6) & 896) | ((i16 << 9) & 57344) | ((i16 << 3) & 3670016), 3072, 5002);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l72.v
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    w wVar = w.f111301a;
                    this.f111278a.g(qVar, z14, pVar, aVar, mcVar, j8, aVar2, pVar2, qVar2, mVar2, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void h(String str, e23.p pVar, e23.p pVar2, e23.a aVar, mc mcVar, boolean z14, e23.p pVar3, e23.q qVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        long jB;
        aVar.getClass();
        mcVar.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-1880623185);
        int i15 = i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(pVar) ? 256 : 128) | (o0VarE.r(pVar2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.B(mcVar) ? 131072 : 65536) | (o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912 | (o0VarE.r(pVar3) ? 67108864 : 33554432);
        int i16 = o0VarE.B(this) ? 4 : 2;
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && (i16 & 3) == 2) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-449052663, new hv0.d(24, str, pVar), o0VarE);
            if (z14) {
                o0VarE.C(902380531);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().c();
            } else {
                o0VarE.C(902381590);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().b();
            }
            o0VarE.g0(false);
            int i17 = i15 >> 3;
            o0Var = o0VarE;
            g(eVarC, false, pVar2, aVar, mcVar, jB, null, pVar3, qVar, o0Var, (i17 & 29360128) | (i17 & 896) | 54 | (i17 & 7168) | (57344 & i17) | 1572864 | 100663296 | ((i16 << 27) & 1879048192));
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.r(this, str, pVar, pVar2, aVar, mcVar, z14, pVar3, qVar, i14);
        }
    }

    public final void i(z3.e eVar, e23.a aVar, mc mcVar, e23.p pVar, z3.e eVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        e23.p pVar2;
        e23.p iVar;
        int i16;
        aVar.getClass();
        mcVar.getClass();
        p3.o0 o0VarE = mVar.E(1809543632);
        int i17 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i18 = i15 | 48;
        if ((i14 & 384) == 0) {
            i18 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i18 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        int i19 = 221184 | i18;
        if ((1572864 & i14) == 0) {
            i19 = 745472 | i18;
        }
        if ((12582912 & i14) == 0) {
            i19 |= o0VarE.r(eVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i19 |= o0VarE.B(this) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i19 & 1, (38347923 & i19) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                iVar = new l71.i(i17);
                i16 = i19 & (-3670017);
            } else {
                o0VarE.e();
                i16 = i19 & (-3670017);
                iVar = pVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-1075724374, new aa2.k(eVar, i17), o0VarE);
            o0VarE.C(-490298889);
            d92.b.f58623a.getClass();
            long jB = d92.b.a(o0VarE).c().b();
            o0VarE.g0(false);
            int i24 = i16 << 3;
            o0Var = o0VarE;
            g(eVarC, false, null, aVar, mcVar, jB, null, iVar, eVar2, o0Var, (i24 & 896) | 54 | (i24 & 7168) | (57344 & i24) | (3670016 & i24) | (234881024 & i24) | (i24 & 1879048192));
            pVar2 = iVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            pVar2 = pVar;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0(this, eVar, aVar, mcVar, pVar2, eVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    public final void j(int i14, e23.a aVar, String str, p3.m mVar) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarL = vb.h.l(-1285694506, aVar, str, mVar);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarL.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarL.r(aVar) ? 32 : 16);
        if (o0VarL.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97935l), o0VarL);
            h4.r.a aVar2 = h4.r.S;
            boolean z14 = (i16 & 112) == 32;
            Object objQ = o0VarL.q();
            if (z14) {
                objQ = new t(aVar, 0);
                o0VarL.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t(aVar, 0);
                    o0VarL.K(objQ);
                }
            }
            g6.f.a aVar3 = g6.f.f75994b;
            o0Var = o0VarL;
            mh.c(upperCase, c2.l.y(u1.w.d(aVar2, false, null, null, (e23.a) objQ, 15), 16), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarL;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, str, aVar, i14, 16);
        }
    }
}
