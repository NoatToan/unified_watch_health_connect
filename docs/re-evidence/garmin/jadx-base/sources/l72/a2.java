package l72;

import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final class a2 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110893a;

        static {
            int[] iArr = new int[x1.values().length];
            try {
                iArr[x1.StartSmall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x1.StartMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x1.EndSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x1.EndMedium.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x1.Center.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x1.Top.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x1.Bottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f110893a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(y1 y1Var, e23.a aVar, z3.e eVar, p3.m mVar, int i14) {
        z3.e eVar2;
        p3.o0 o0Var;
        int i15;
        p3.o0 o0Var2;
        long jB = y1Var.f111381a;
        p3.o0 o0VarE = mVar.E(-705735351);
        int i16 = i14 | (o0VarE.B(y1Var) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(-696699993);
            g6.c cVar = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            d92.b.f58623a.getClass();
            long jE = d92.b.a(o0VarE).e().e();
            w1 w1Var = y1Var.f111382b;
            int iC = MathKt.c(cVar.s0(y1Var.f111384d));
            if (e(w1Var)) {
                o0Var = o0VarE;
                jB = g6.k.b(0, ((int) (jB & 4294967295L)) - iC, 1, jB);
                i15 = 32;
            } else {
                o0Var = o0VarE;
                i15 = 32;
                if (p13.x.d(w1.BottomStart, w1.BottomCenter, w1.BottomEnd).contains(w1Var)) {
                    jB = g6.k.b(0, ((int) (jB & 4294967295L)) + iC, 1, jB);
                } else if (d(w1Var)) {
                    jB = g6.k.b(((int) (jB >> 32)) - iC, 0, 2, jB);
                } else if (c(w1Var)) {
                    jB = g6.k.b(((int) (jB >> 32)) + iC, 0, 2, jB);
                }
            }
            Object objQ = o0Var.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                g6.m.f76012b.getClass();
                objQ = p3.p0.n(g6.m.a(0L));
                o0Var2 = o0Var;
                o0Var2.K(objQ);
            } else {
                o0Var2 = o0Var;
            }
            p3.p1 p1Var = (p3.p1) objQ;
            g6.k.a aVar2 = g6.k.f76003b;
            float fC1 = cVar.c1((int) (jB >> i15));
            float fC2 = cVar.c1((int) (jB & 4294967295L));
            float f14 = e(w1Var) ? -((int) (((g6.m) p1Var.getF182175a()).f76013a & 4294967295L)) : 0.0f;
            float f15 = d(w1Var) ? -((int) (((g6.m) p1Var.getF182175a()).f76013a >> i15)) : 0.0f;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarB = h4.p.b(c2.l.u(aVar3, fC1, fC2), 1.0f);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0Var2.U);
            p3.i2 i2VarA0 = o0Var2.a0();
            h4.r rVarC = h4.k.c(rVarB, o0Var2);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0Var2.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar4);
            } else {
                o0Var2.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0Var2);
            b4.c(h5.g.a.f81809f, i2VarA0, o0Var2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0Var2, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0Var2);
            c2.u uVar = c2.u.f22885a;
            Object objQ2 = o0Var2.q();
            if (objQ2 == c2565a) {
                objQ2 = new ky0.k(p1Var, 10);
                o0Var2.K(objQ2);
            }
            h4.r rVarG = f5.g0.g(aVar3, (e23.l) objQ2);
            boolean zI = o0Var2.i(f15) | o0Var2.i(f14);
            Object objQ3 = o0Var2.q();
            if (zI || objQ3 == c2565a) {
                objQ3 = new c2.z1(f15, f14, 2);
                o0Var2.K(objQ3);
            }
            h4.r rVarA = o4.s0.a(rVarG, (e23.l) objQ3);
            g6.f.a aVar5 = g6.f.f75994b;
            h4.r rVarE = u1.n.e(rVarA, jE, k2.i.a(4));
            boolean z14 = (i16 & 112) == i15;
            Object objQ4 = o0Var2.q();
            if (z14 || objQ4 == c2565a) {
                objQ4 = new t(aVar, 11);
                o0Var2.K(objQ4);
            }
            eVar2 = eVar;
            o0VarE = o0Var2;
            b(u1.w.d(rVarE, false, null, null, (e23.a) objQ4, 15), y1Var, jE, z3.f.c(-85172741, new aa2.o(eVar2, 8), o0Var2), o0VarE, ((i16 << 3) & 112) | 3072);
            o0VarE.g0(true);
            o0VarE.g0(false);
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(y1Var, aVar, false, eVar2, i14, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    public static final void b(h4.r rVar, final y1 y1Var, final long j8, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1382417102);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(y1Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            final w1 w1Var = y1Var.f111382b;
            float f14 = y1Var.f111385e;
            y3 y3Var = kotlin.t1.f91490h;
            float fD1 = ((g6.c) o0VarE.A(y3Var)).d1(f14);
            final float fS0 = ((g6.c) o0VarE.A(y3Var)).s0(y1Var.f111384d);
            g6.c cVar = (g6.c) o0VarE.A(y3Var);
            float f15 = y1Var.f111383c.f111359a;
            g6.f.a aVar = g6.f.f75994b;
            final float fS1 = cVar.s0(f15);
            h4.r rVarU = c2.x2.u(rVar, fD1);
            boolean zK = o0VarE.k(w1Var.ordinal()) | ((i16 & 112) == 32) | o0VarE.i(fS1) | o0VarE.i(fS0) | ((i16 & 896) == 256);
            Object objQ = o0VarE.q();
            if (zK) {
                e23.l lVar = new e23.l() { // from class: l72.z1
                    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        float f16;
                        float fD;
                        float f17;
                        x1 x1Var2 = y1Var.f111383c;
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                        w1 w1Var2 = w1Var;
                        boolean zD = a2.d(w1Var2);
                        float f18 = fS1;
                        float f19 = fS0;
                        if (zD) {
                            fD = fIntBitsToFloat;
                        } else if (a2.c(w1Var2)) {
                            fD = 0.0f;
                        } else {
                            int i17 = a2.a.f110893a[x1Var2.ordinal()];
                            if (i17 == 1 || i17 == 2) {
                                f16 = f18 + f19;
                            } else {
                                f16 = (i17 == 3 || i17 == 4) ? (fIntBitsToFloat - f18) - f19 : fIntBitsToFloat / 2.0f;
                            }
                            fD = j23.t.d(f16, f19, fIntBitsToFloat - f19);
                        }
                        int i18 = a2.a.f110893a[x1Var2.ordinal()];
                        if (i18 == 5) {
                            f17 = fIntBitsToFloat2 / 2.0f;
                        } else if (i18 == 6) {
                            f17 = f18 + f19;
                        } else if (i18 != 7) {
                            f17 = fIntBitsToFloat2 / 2.0f;
                        } else {
                            f17 = (fIntBitsToFloat2 - f18) - f19;
                        }
                        float fD2 = j23.t.d(f17, f19, fIntBitsToFloat2 - f19);
                        o4.j jVarA = o4.m.a();
                        if (p13.x.d(w1.BottomStart, w1.BottomCenter, w1.BottomEnd).contains(w1Var2) || p13.x.d(w1.CenterStart, w1.Center, w1.CenterEnd).contains(w1Var2)) {
                            jVarA.a(fD, 0.0f);
                            jVarA.c(fD - f19, 0.0f);
                            jVarA.c(fD, -f19);
                            jVarA.c(fD + f19, 0.0f);
                            jVarA.close();
                        } else if (a2.e(w1Var2)) {
                            jVarA.a(fD, fIntBitsToFloat2);
                            jVarA.c(fD + f19, fIntBitsToFloat2);
                            jVarA.c(fD, fIntBitsToFloat2 + f19);
                            jVarA.c(fD - f19, fIntBitsToFloat2);
                            jVarA.close();
                        } else if (a2.d(w1Var2)) {
                            jVarA.a(fIntBitsToFloat, fD2);
                            jVarA.c(fIntBitsToFloat, fD2 + f19);
                            jVarA.c(fIntBitsToFloat + f19, fD2);
                            jVarA.c(fIntBitsToFloat, fD2 - f19);
                            jVarA.close();
                        } else if (a2.c(w1Var2)) {
                            jVarA.a(0.0f, fD2);
                            jVarA.c(0.0f, fD2 - f19);
                            jVarA.c(-f19, fD2);
                            jVarA.c(0.0f, fD2 + f19);
                            jVarA.close();
                        }
                        q4.f.L(fVar, jVarA, j8, 0.0f, null, 60);
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(lVar);
                objQ = lVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    e23.l lVar2 = new e23.l() { // from class: l72.z1
                        /* JADX WARN: Code duplicated, block: B:26:0x0072  */
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            float f16;
                            float fD;
                            float f17;
                            x1 x1Var2 = y1Var.f111383c;
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                            w1 w1Var2 = w1Var;
                            boolean zD = a2.d(w1Var2);
                            float f18 = fS1;
                            float f19 = fS0;
                            if (zD) {
                                fD = fIntBitsToFloat;
                            } else if (a2.c(w1Var2)) {
                                fD = 0.0f;
                            } else {
                                int i17 = a2.a.f110893a[x1Var2.ordinal()];
                                if (i17 == 1 || i17 == 2) {
                                    f16 = f18 + f19;
                                } else {
                                    f16 = (i17 == 3 || i17 == 4) ? (fIntBitsToFloat - f18) - f19 : fIntBitsToFloat / 2.0f;
                                }
                                fD = j23.t.d(f16, f19, fIntBitsToFloat - f19);
                            }
                            int i18 = a2.a.f110893a[x1Var2.ordinal()];
                            if (i18 == 5) {
                                f17 = fIntBitsToFloat2 / 2.0f;
                            } else if (i18 == 6) {
                                f17 = f18 + f19;
                            } else if (i18 != 7) {
                                f17 = fIntBitsToFloat2 / 2.0f;
                            } else {
                                f17 = (fIntBitsToFloat2 - f18) - f19;
                            }
                            float fD2 = j23.t.d(f17, f19, fIntBitsToFloat2 - f19);
                            o4.j jVarA = o4.m.a();
                            if (p13.x.d(w1.BottomStart, w1.BottomCenter, w1.BottomEnd).contains(w1Var2) || p13.x.d(w1.CenterStart, w1.Center, w1.CenterEnd).contains(w1Var2)) {
                                jVarA.a(fD, 0.0f);
                                jVarA.c(fD - f19, 0.0f);
                                jVarA.c(fD, -f19);
                                jVarA.c(fD + f19, 0.0f);
                                jVarA.close();
                            } else if (a2.e(w1Var2)) {
                                jVarA.a(fD, fIntBitsToFloat2);
                                jVarA.c(fD + f19, fIntBitsToFloat2);
                                jVarA.c(fD, fIntBitsToFloat2 + f19);
                                jVarA.c(fD - f19, fIntBitsToFloat2);
                                jVarA.close();
                            } else if (a2.d(w1Var2)) {
                                jVarA.a(fIntBitsToFloat, fD2);
                                jVarA.c(fIntBitsToFloat, fD2 + f19);
                                jVarA.c(fIntBitsToFloat + f19, fD2);
                                jVarA.c(fIntBitsToFloat, fD2 - f19);
                                jVarA.close();
                            } else if (a2.c(w1Var2)) {
                                jVarA.a(0.0f, fD2);
                                jVarA.c(0.0f, fD2 - f19);
                                jVarA.c(-f19, fD2);
                                jVarA.c(0.0f, fD2 + f19);
                                jVarA.close();
                            }
                            q4.f.L(fVar, jVarA, j8, 0.0f, null, 60);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(lVar2);
                    objQ = lVar2;
                }
            }
            h4.r rVarD = l4.k.d(rVarU, (e23.l) objQ);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            b71.i.n((i16 >> 9) & 14, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.h(rVar, y1Var, j8, eVar, i14);
        }
    }

    public static final boolean c(w1 w1Var) {
        w1Var.getClass();
        return p13.x.d(w1.EndTop, w1.EndCenter, w1.EndBottom).contains(w1Var);
    }

    public static final boolean d(w1 w1Var) {
        w1Var.getClass();
        return p13.x.d(w1.StartTop, w1.StartCenter, w1.StartBottom).contains(w1Var);
    }

    public static final boolean e(w1 w1Var) {
        w1Var.getClass();
        return p13.x.d(w1.TopStart, w1.TopCenter, w1.TopEnd).contains(w1Var);
    }
}
