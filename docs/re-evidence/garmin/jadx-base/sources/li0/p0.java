package li0;

import c2.x2;
import i3.i7;
import i3.mh;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowUserListKt$FollowUserList$1$1", f = "FollowUserList.kt", l = {62}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yc.s f112844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zc.d<d0> f112845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f112846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f112847e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yc.s sVar, zc.d<d0> dVar, e2.i0 i0Var, p1<Boolean> p1Var, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f112844b = sVar;
            this.f112845c = dVar;
            this.f112846d = i0Var;
            this.f112847e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f112844b, this.f112845c, this.f112846d, this.f112847e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112843a;
            if (i14 == 0) {
                o13.r.b(obj);
                yc.s sVar = this.f112844b;
                z0 z0Var = sVar.f196385a;
                z0.b bVar = z0.b.f196664b;
                if (!p005kotlin.jvm.internal.s.g(z0Var, bVar)) {
                    this.f112847e.setValue(Boolean.FALSE);
                }
                if (p005kotlin.jvm.internal.s.g(sVar.f196385a, bVar) && this.f112845c.b() > 0) {
                    this.f112843a = 1;
                    if (e2.i0.f(this.f112846d, 0, this) == aVar) {
                        return aVar;
                    }
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

    public static final void a(u4.d dVar, int i14, Integer num, p3.m mVar, int i15) {
        Unit unit;
        p3.o0 o0VarE = mVar.E(-1710033046);
        int i16 = (o0VarE.B(dVar) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.B(num) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(1630720346);
            if (dVar == null || num == null) {
                unit = null;
            } else {
                c(dVar, i14, num.intValue(), o0VarE, i16 & 112);
                unit = Unit.INSTANCE;
            }
            o0VarE.g0(false);
            if (unit == null) {
                o0VarE.C(1630724969);
                b(i14, o0VarE, (i16 >> 3) & 14);
            } else {
                o0VarE.C(1630720381);
            }
            o0VarE.g0(false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(dVar, i14, num, i15);
        }
    }

    public static final void b(int i14, p3.m mVar, int i15) {
        int i16;
        p3.o0 o0VarE = mVar.E(1184363717);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97923h;
            bVar2.getClass();
            float f15 = f14 + eVar.f97923h;
            g6.f.a aVar3 = g6.f.f75994b;
            b82.n.c(null, null, gl1.y.Q(o0VarE, i14), c2.l.C(rVarF, 0.0f, f15, 0.0f, 0.0f, 13), null, o0VarE, 0, 19);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a71.l(i14, i15, 6);
        }
    }

    public static final void c(u4.d dVar, int i14, int i15, p3.m mVar, int i16) {
        p3.o0 o0VarE = mVar.E(-296155110);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i16 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            h4.r rVarB = a2.b(x2.d(c2.l.y(aVar, f14), 1.0f), a2.a(o0VarE), true);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            bVar.getClass();
            j92.c cVar2 = j92.b.f97901d;
            float f16 = cVar2.f97906e;
            bVar.getClass();
            float f17 = f16 + cVar2.f97902a;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarE = u1.n.e(x2.q(rVarC2, f17), d92.b.a(o0VarE).e().g(), k2.i.f102406a);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new x(7);
                o0VarE.K(objQ);
            }
            h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarE, false);
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarC3, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC4, o0VarE);
            c2.u uVar = c2.u.f22885a;
            long jB = d92.b.a(o0VarE).f().b();
            bVar.getClass();
            i7.b(dVar, null, uVar.c(x2.q(aVar, cVar2.f97905d), h4.d.a.f81528f), jB, o0VarE, (i17 & 14) | 48, 0);
            o0VarE.g0(true);
            bVar.getClass();
            c2.l.f(x2.h(aVar, f15), o0VarE);
            String strQ = gl1.y.Q(o0VarE, i14);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97931h;
            w5.f0.f182097b.getClass();
            x0 x0VarA = x0.a(x0Var, 0L, 0L, w5.f0.f182100e, null, 0L, null, null, 0, 0L, null, null, 16777211);
            d6.h.f57752b.getClass();
            int i18 = d6.h.f57755e;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 130046);
            tn.k.n(bVar, aVar, f15, o0VarE);
            String strQ2 = gl1.y.Q(o0VarE, i15);
            fVar2.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 130046);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o0(dVar, i14, i15, i16, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(zc.d<d0> dVar, f fVar, u4.d dVar2, int i14, Integer num, p3.m mVar, int i15) {
        int i16;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        Object aVar;
        z0 z0Var;
        int i17;
        boolean z14;
        dVar.getClass();
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(130520784);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.B(dVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.k(i14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.B(num) ? 16384 : 8192;
        }
        int i18 = i16;
        if (o0VarE.n(i18 & 1, (i18 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            yc.s sVarD = dVar.d();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            z0 z0Var2 = dVar.d().f196385a;
            int i19 = i18 & 14;
            boolean zR = o0VarE.r(sVarD) | (i19 == 4 || ((i18 & 8) != 0 && o0VarE.r(dVar))) | o0VarE.B(i0VarA);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a2) {
                c2565a = c2565a2;
                p1Var = p1Var2;
                z0Var = z0Var2;
                i17 = 3;
                z14 = false;
                aVar = new a(sVarD, dVar, i0VarA, p1Var, null);
                o0VarE.K(aVar);
            } else {
                p1Var = p1Var2;
                aVar = objQ2;
                c2565a = c2565a2;
                z0Var = z0Var2;
                i17 = 3;
                z14 = false;
            }
            p3.l0.e((e23.p) aVar, z0Var, o0VarE);
            if ((sVarD.f196390f || sVarD.f196391g) && dVar.b() == 0) {
                o0VarE.C(1399990699);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                boolean z15 = (i19 == 4 || ((i18 & 8) != 0 && o0VarE.r(dVar))) ? true : z14;
                Object objQ3 = o0VarE.q();
                if (z15 || objQ3 == c2565a) {
                    objQ3 = new ii0.y(dVar, p1Var, 1);
                    o0VarE.K(objQ3);
                }
                m3.l.b(zBooleanValue, (e23.a) objQ3, null, null, null, null, z3.f.c(-2013801915, new as.q(dVar2, i14, num, i17), o0VarE), o0VarE, 1572864, 60);
                o0VarE = o0VarE;
                o0VarE.g0(z14);
            } else {
                boolean z16 = z14;
                o0VarE.C(1400320911);
                h4.r.a aVar2 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, z16 ? 1 : 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(aVar2, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
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
                boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                boolean z17 = i19 == 4 || ((i18 & 8) != 0 && o0VarE.r(dVar));
                Object objQ4 = o0VarE.q();
                if (z17 || objQ4 == c2565a) {
                    objQ4 = new ii0.y(dVar, p1Var, 2);
                    o0VarE.K(objQ4);
                }
                m3.l.b(zBooleanValue2, (e23.a) objQ4, null, null, null, null, z3.f.c(-1866921404, new fb0.b(i0VarA, dVar, fVar, sVarD, 23), o0VarE), o0VarE, 1572864, 60);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(dVar, fVar, dVar2, i14, num, i15);
        }
    }
}
