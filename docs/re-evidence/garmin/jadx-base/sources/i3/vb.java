package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f90008a;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s1.f0<Integer> f90011c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, s1.f0<Integer> f0Var) {
            this.f90009a = pVar;
            this.f90010b = pVar2;
            this.f90011c = f0Var;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.l0.j(t13.h.f161748a, mVar2);
                    mVar2.K(objQ);
                }
                o53.b0 b0Var = (o53.b0) objQ;
                Object objQ2 = mVar2.q();
                if (objQ2 == c2565a) {
                    objQ2 = new pb(b0Var, this.f90011c);
                    mVar2.K(objQ2);
                }
                pb pbVar = (pb) objQ2;
                h4.r rVarO = c2.l.o(h4.r.S, c2.q1.Min);
                z3.e eVarB = f5.k0.b(p13.x.k(this.f90009a, this.f90010b));
                Object objQ3 = mVar2.q();
                if (objQ3 == c2565a) {
                    objQ3 = new f5.f1(pbVar);
                    mVar2.K(objQ3);
                }
                f5.z0 z0Var = (f5.z0) objQ3;
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarO, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, z0Var, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                eVarB.invoke(mVar2, 0);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f90008a = 8;
    }

    public static final void a(final qc qcVar, final boolean z14, final e23.a aVar, final o4.r1 r1Var, final h4.r rVar, boolean z15, final ob obVar, u1.u uVar, c2.h2 h2Var, final e23.p pVar, final z3.e eVar, p3.m mVar, final int i14) {
        int i15;
        e23.a aVar2;
        final boolean z16;
        final u1.u uVar2;
        final c2.h2 h2Var2;
        long j8;
        u1.u uVarA;
        c2.h2 h2Var3;
        int i16;
        boolean z17;
        p3.m.a.C2565a c2565a;
        long j14;
        boolean z18;
        long j15;
        p3.o0 o0VarE = mVar.E(1532041126);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(qcVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(r1Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(rVar) ? 16384 : 8192;
        }
        int i17 = i15 | 196608;
        if ((1572864 & i14) == 0) {
            i17 |= o0VarE.B(obVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i17 |= 4194304;
        }
        int i18 = i17 | 905969664;
        if (o0VarE.n(i18 & 1, (306783379 & i18) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                qb qbVar = qb.f89432a;
                if (z14) {
                    j8 = obVar.f89190c;
                } else {
                    j8 = !z14 ? obVar.f89193f : obVar.f89199l;
                }
                float f14 = qb.f89433b;
                qbVar.getClass();
                uVarA = u1.n.a(f14, j8);
                qbVar.getClass();
                h2Var3 = qb.f89435d;
                i16 = i18 & (-29360129);
                z17 = true;
            } else {
                o0VarE.e();
                uVarA = uVar;
                h2Var3 = h2Var;
                i16 = i18 & (-29360129);
                z17 = z15;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(-1579561419);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            aVar3.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ;
            o0VarE.g0(false);
            if (z17 && z14) {
                c2565a = c2565a2;
                j14 = obVar.f89188a;
            } else {
                c2565a = c2565a2;
                if (!z17 || z14) {
                    j14 = (z17 || !z14) ? obVar.f89197j : obVar.f89194g;
                } else {
                    j14 = obVar.f89191d;
                }
            }
            if (z17 && z14) {
                z18 = z17;
                j15 = obVar.f89189b;
            } else {
                z18 = z17;
                if (!z18 || z14) {
                    j15 = (z18 || !z14) ? obVar.f89198k : obVar.f89195h;
                } else {
                    j15 = obVar.f89192e;
                }
            }
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a3 = c2565a;
            if (objQ2 == c2565a3) {
                objQ2 = e5.o(0, o0VarE);
            }
            p3.n1 n1Var = (p3.n1) objQ2;
            boolean zB = o0VarE.B(jVar);
            long j16 = j15;
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a3) {
                objQ3 = new wb(jVar, n1Var, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, jVar, o0VarE);
            h4.r rVarD = f5.g0.d(qcVar.a(rVar, 1.0f, true), new tb(n1Var, z14, 0));
            c1.f87691a.getClass();
            h4.r rVarA = c2.x2.a(rVarD, c1.f87694d, c1.f87695e);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a3) {
                objQ4 = new i11.f(26);
                o0VarE.K(objQ4);
            }
            boolean z19 = z18;
            ve.b(z14, aVar2, p5.v.c((e23.l) objQ4, rVarA, false), z19, r1Var, j14, j16, 0.0f, uVarA, jVar, z3.f.c(-1208080836, new ub(pVar, eVar, h2Var3), o0VarE), o0VarE, ((i16 >> 3) & 126) | ((i16 >> 6) & 7168) | ((i16 << 3) & 57344), 384);
            h2Var2 = h2Var3;
            z16 = z19;
            uVar2 = uVarA;
        } else {
            o0VarE.e();
            z16 = z15;
            uVar2 = uVar;
            h2Var2 = h2Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.sb
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vb.a(qcVar, z14, aVar, r1Var, rVar, z16, obVar, uVar2, h2Var2, pVar, eVar, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, c2.h2 h2Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1069265073);
        int i15 = (o0VarE.r(pVar) ? 4 : 2) | i14 | (o0VarE.r(pVar2) ? 32 : 16) | (o0VarE.B(h2Var) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r rVarX = c2.l.x(h4.r.S, h2Var);
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarX, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            n3.m0.f123114a.getClass();
            mh.a(sj.a(n3.m0.f123119f, o0VarE), z3.f.c(-1372614088, new a(pVar, pVar2, k9.b(n3.h0.FastSpatial, o0VarE)), o0VarE), o0VarE, 48);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(pVar, pVar2, h2Var, i14, 13);
        }
    }

    public static final void c(h4.r rVar, float f14, z3.e eVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(2041406825);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | 48;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            qb.f89432a.getClass();
            f14 = qb.f89433b;
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarZ = g8.i.Z(rVar);
            n3.m0.f123114a.getClass();
            h4.r rVarE = c2.l.E(c2.x2.b(rVarZ, 0.0f, n3.m0.f123115b, 1), c2.q1.Min);
            c2.j jVar = c2.j.f22691a;
            g6.f.a aVar = g6.f.f75994b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(-f14);
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new rc(u2Var);
                o0VarE.K(objQ);
            }
            eVar.invoke((rc) objQ, o0VarE, 54);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        float f15 = f14;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rb(rVar, f15, eVar, i14, 0);
        }
    }
}
