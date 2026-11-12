package i3;

/* JADX INFO: loaded from: classes.dex */
public final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f87490a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f87490a = 125;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0226  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [t13.d] */
    public static final void a(cf cfVar, e23.q qVar, h4.r rVar, boolean z14, boolean z15, boolean z16, e23.l lVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        boolean z17;
        h4.r rVar2;
        boolean z18;
        e23.l lVar2;
        e23.q qVar2;
        p3.m.a aVar;
        Throwable th3;
        p008y1.t3 t3Var;
        e23.l lVar3;
        z3.e eVar2 = eVar;
        p3.o0 o0VarE = mVar.E(-741495334);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(cfVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(qVar) ? 32 : 16;
        }
        int i16 = i15 | 384;
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        int i17 = i16 | 1769472;
        if ((12582912 & i14) == 0) {
            i17 |= o0VarE.r(eVar2) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            h4.r.a aVar2 = h4.r.S;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i11.f(29);
                o0VarE.K(objQ);
            }
            e23.l lVar4 = (e23.l) objQ;
            p3.x1 x1Var = p3.n.f135158a;
            p008y1.r<df> rVar3 = cfVar.f87782a;
            p008y1.r<df> rVar4 = cfVar.f87782a;
            p008y1.b2 b2Var = p008y1.b2.Horizontal;
            boolean z19 = cfVar.b() == df.Settled;
            if (cfVar.f87783b != null) {
                th3 = null;
                o0VarE.C(387581105);
                p008y1.b bVar = p008y1.b.f193089a;
                e23.l<? super Float, Float> lVar5 = cfVar.f87783b;
                if (lVar5 == null) {
                    p005kotlin.jvm.internal.s.m("positionalThreshold");
                    throw null;
                }
                p008y1.b bVar2 = p008y1.b.f193089a;
                bVar.getClass();
                aVar = aVar3;
                s1.b2 b2Var2 = p008y1.b.f193090b;
                g6.c cVar2 = (g6.c) o0VarE.A(kotlin.t1.f91490h);
                boolean zB = o0VarE.B(cVar2) | o0VarE.B(rVar4) | o0VarE.B(lVar5) | o0VarE.B(b2Var2);
                Object objQ2 = o0VarE.q();
                if (zB) {
                    s1.z zVar = p008y1.e.f193172c;
                    p008y1.d dVar = new p008y1.d(rVar4, lVar5, new lc(cVar2, 3));
                    float f14 = z1.s.f200874a;
                    z1.o oVar = new z1.o(dVar, zVar, b2Var2);
                    o0VarE.K(oVar);
                    objQ2 = oVar;
                } else {
                    aVar.getClass();
                    if (objQ2 == c2565a) {
                        s1.z zVar2 = p008y1.e.f193172c;
                        p008y1.d dVar2 = new p008y1.d(rVar4, lVar5, new lc(cVar2, 3));
                        float f15 = z1.s.f200874a;
                        z1.o oVar2 = new z1.o(dVar2, zVar2, b2Var2);
                        o0VarE.K(oVar2);
                        objQ2 = oVar2;
                    }
                }
                t3Var = (p008y1.t3) objQ2;
                o0VarE.g0(false);
            } else {
                aVar = aVar3;
                th3 = null;
                o0VarE.C(-869685853);
                o0VarE.g0(false);
                t3Var = null;
            }
            h4.r rVarD = p008y1.e.d(aVar2, rVar3, b2Var, z19, t3Var);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                Throwable th4 = th3;
                p3.p0.l();
                throw th4;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            p3.b4.c(eVar3, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC, o0VarE);
            h4.r rVarD2 = c2.u.f22885a.d(aVar2);
            int i18 = (i17 << 6) & 7168;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.g.b bVar4 = h4.d.a.f81533k;
            c2.s2 s2VarA = c2.q2.a(c0343j, bVar4, o0VarE, 0);
            int iP2 = o0VarE.P();
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarD2, o0VarE);
            if (cVar == null) {
                Throwable th5 = th3;
                p3.p0.l();
                throw th5;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            p3.b4.c(eVar3, s2VarA, o0VarE);
            p3.b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                v.h.A(iP2, o0VarE, iP2, bVar3);
            }
            p3.b4.c(fVar, rVarC2, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            qVar.invoke(u2Var, o0VarE, Integer.valueOf(((i18 >> 6) & 112) | 6));
            o0VarE.g0(true);
            boolean zR = ((i17 & 7168) == 2048) | ((57344 & i17) == 16384) | o0VarE.r(cfVar);
            Object objQ3 = o0VarE.q();
            if (zR) {
                z17 = z15;
                objQ3 = new a11.u(cfVar, z14, z17, 3);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == c2565a) {
                    z17 = z15;
                    objQ3 = new a11.u(cfVar, z14, z17, 3);
                    o0VarE.K(objQ3);
                } else {
                    z17 = z15;
                }
            }
            h4.r rVarF = l3.k.f(aVar2, rVar4, b2Var, (e23.p) objQ3);
            int i19 = (i17 >> 12) & 7168;
            int i24 = i17;
            c2.s2 s2VarA2 = c2.q2.a(c0343j, bVar4, o0VarE, 0);
            int iP3 = o0VarE.P();
            p3.i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarF, o0VarE);
            if (cVar == null) {
                Throwable th6 = th3;
                p3.p0.l();
                throw th6;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            p3.b4.c(eVar3, s2VarA2, o0VarE);
            p3.b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP3))) {
                v.h.A(iP3, o0VarE, iP3, bVar3);
            }
            p3.b4.c(fVar, rVarC3, o0VarE);
            e23.q qVar3 = eVar;
            qVar3.invoke(u2Var, o0VarE, Integer.valueOf(((i19 >> 6) & 112) | 6));
            o0VarE.g0(true);
            o0VarE.g0(true);
            df dfVarB = cfVar.b();
            boolean zR2 = o0VarE.r(cfVar) | ((i24 & 3670016) == 1048576);
            Object objQ4 = o0VarE.q();
            if (zR2) {
                lVar3 = lVar4;
                objQ4 = new ze(cfVar, lVar3, th3);
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == c2565a) {
                    lVar3 = lVar4;
                    objQ4 = new ze(cfVar, lVar3, th3);
                    o0VarE.K(objQ4);
                } else {
                    lVar3 = lVar4;
                }
            }
            p3.l0.f(dfVarB, lVar3, (e23.p) objQ4, o0VarE);
            z18 = true;
            lVar2 = lVar3;
            rVar2 = aVar2;
            qVar2 = qVar3;
        } else {
            z17 = z15;
            o0VarE.e();
            rVar2 = rVar;
            z18 = z16;
            lVar2 = lVar;
            qVar2 = eVar2;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ye(cfVar, qVar, rVar2, z14, z17, z18, lVar2, qVar2, i14, 0);
        }
    }
}
