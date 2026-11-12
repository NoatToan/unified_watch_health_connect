package g02;

import c2.x2;
import i3.fb;
import i3.qg;
import i3.v5;
import i3.yf;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.GCMScrollableTabRowKt$GCMScrollableTabRow$2$1$2$1$3$1$1", f = "GCMScrollableTabRow.kt", l = {120}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h2.j0 f74550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f74551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h2.j0 j0Var, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f74550b = j0Var;
            this.f74551c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f74550b, this.f74551c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f74549a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f74549a = 1;
                if (h2.j0.g(this.f74550b, this.f74551c, null, this, 6) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b  */
    /* JADX WARN: Code duplicated, block: B:68:0x017e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final h2.j0 j0Var, final o53.b0 b0Var, final i53.c<p1> cVar, g6.f fVar, p3.m mVar, int i14, int i15) {
        int i16;
        g6.f fVar2;
        boolean z14;
        g6.f fVar3;
        p2 p2VarI0;
        final g6.c cVar2;
        Object objQ;
        p3.m.a.C2565a c2565a;
        final p3.p1 p1Var;
        Object objQ2;
        p3.p1 p1Var2;
        boolean zB;
        Object objQ3;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.b bVar;
        float f14;
        j0Var.getClass();
        b0Var.getClass();
        cVar.getClass();
        p3.o0 o0VarE = mVar.E(-1680669211);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(j0Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(b0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(cVar) ? 256 : 128;
        }
        int i17 = i15 & 8;
        if (i17 == 0) {
            if ((i14 & 3072) == 0) {
                fVar2 = fVar;
                i16 |= o0VarE.B(fVar2) ? 2048 : 1024;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i17 != 0) {
                    fVar2 = null;
                }
                p3.x1 x1Var = p3.n.f135158a;
                cVar2 = (g6.c) o0VarE.A(kotlin.t1.f91490h);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(g6.f.a(0));
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p3.p0.n(g6.f.a(0));
                    o0VarE.K(objQ2);
                }
                p1Var2 = (p3.p1) objQ2;
                h4.r.a aVar2 = h4.r.S;
                h4.d.f81522a.getClass();
                h4.r rVarY = x2.y(aVar2, h4.d.a.f81528f, 2);
                zB = o0VarE.B(cVar2);
                objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new r(cVar2, p1Var2, 0);
                    o0VarE.K(objQ3);
                }
                h4.r rVarG = f5.g0.g(rVarY, (e23.l) objQ3);
                h4.g.a aVar3 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarG, o0VarE);
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
                final c2.b0 b0Var2 = c2.b0.f22601a;
                if (g6.f.b(((g6.f) p1Var.getF182175a()).f75997a, 0) > 0) {
                    g6.f fVarA = g6.f.a((((g6.f) p1Var2.getF182175a()).f75997a - ((g6.f) p1Var.getF182175a()).f75997a) / 2);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = ((g6.f) j23.t.b(fVarA, g6.f.a(j92.b.f97899b.f97920e))).f75997a;
                } else {
                    yf.f90469a.getClass();
                    f14 = yf.f90471c;
                }
                final float f15 = f14;
                final g6.f fVar4 = fVar2;
                p3.v.a(fb.f88099a.c(null), z3.f.c(81280667, new e23.p() { // from class: g02.s
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            h4.r rVarZ = x2.z(h4.r.S, null, 3);
                            g6.f fVar5 = fVar4;
                            float f16 = fVar5 != null ? fVar5.f75997a : f15;
                            long jE = vb.h.e(d92.b.f58623a, mVar2);
                            long jA = zl.a.a(mVar2);
                            h2.j0 j0Var2 = j0Var;
                            int iL = j0Var2.l();
                            z3.e eVarC = z3.f.c(-1926240610, new et1.v(j0Var2, 13), mVar2);
                            j.f74424a.getClass();
                            qg.d(f16, 0.0f, iL, 819462192, jE, jA, j.f74425b, rVarZ, mVar2, null, eVarC, z3.f.c(1692935783, new a42.c(cVar, b0Var2, cVar2, j0Var2, b0Var, p1Var, 22), mVar2));
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 56);
                d92.b.f58623a.getClass();
                v5.a(0.0f, 0, 3, d92.b.a(o0VarE).j().c(), null, o0VarE);
                o0VarE.g0(true);
                fVar3 = fVar4;
            } else {
                o0VarE.e();
                fVar3 = fVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.f0(i14, i15, 8, j0Var, b0Var, cVar, fVar3);
            }
        }
        i16 |= 3072;
        fVar2 = fVar;
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i17 != 0) {
                fVar2 = null;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            cVar2 = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(g6.f.a(0));
                o0VarE.K(objQ);
            }
            p1Var = (p3.p1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(g6.f.a(0));
                o0VarE.K(objQ2);
            }
            p1Var2 = (p3.p1) objQ2;
            h4.r.a aVar4 = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarY2 = x2.y(aVar4, h4.d.a.f81528f, 2);
            zB = o0VarE.B(cVar2);
            objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new r(cVar2, p1Var2, 0);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new r(cVar2, p1Var2, 0);
                o0VarE.K(objQ3);
            }
            h4.r rVarG2 = f5.g0.g(rVarY2, (e23.l) objQ3);
            h4.g.a aVar5 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, aVar5, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarG2, o0VarE);
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
            final c2.a0 b0Var3 = c2.b0.f22601a;
            if (g6.f.b(((g6.f) p1Var.getF182175a()).f75997a, 0) > 0) {
                g6.f fVarA2 = g6.f.a((((g6.f) p1Var2.getF182175a()).f75997a - ((g6.f) p1Var.getF182175a()).f75997a) / 2);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f14 = ((g6.f) j23.t.b(fVarA2, g6.f.a(j92.b.f97899b.f97920e))).f75997a;
            } else {
                yf.f90469a.getClass();
                f14 = yf.f90471c;
            }
            final float f16 = f14;
            final g6.f fVar5 = fVar2;
            p3.v.a(fb.f88099a.c(null), z3.f.c(81280667, new e23.p() { // from class: g02.s
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var3 = p3.n.f135158a;
                        h4.r rVarZ = x2.z(h4.r.S, null, 3);
                        g6.f fVar6 = fVar5;
                        float f17 = fVar6 != null ? fVar6.f75997a : f16;
                        long jE = vb.h.e(d92.b.f58623a, mVar2);
                        long jA = zl.a.a(mVar2);
                        h2.j0 j0Var2 = j0Var;
                        int iL = j0Var2.l();
                        z3.e eVarC = z3.f.c(-1926240610, new et1.v(j0Var2, 13), mVar2);
                        j.f74424a.getClass();
                        qg.d(f17, 0.0f, iL, 819462192, jE, jA, j.f74425b, rVarZ, mVar2, null, eVarC, z3.f.c(1692935783, new a42.c(cVar, b0Var3, cVar2, j0Var2, b0Var, p1Var, 22), mVar2));
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 56);
            d92.b.f58623a.getClass();
            v5.a(0.0f, 0, 3, d92.b.a(o0VarE).j().c(), null, o0VarE);
            o0VarE.g0(true);
            fVar3 = fVar5;
        } else {
            o0VarE.e();
            fVar3 = fVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(i14, i15, 8, j0Var, b0Var, cVar, fVar3);
        }
    }
}
