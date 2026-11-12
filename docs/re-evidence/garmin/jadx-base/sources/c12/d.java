package c12;

import a03.t0;
import at1.j;
import b82.y;
import c2.l;
import c2.n3;
import c2.q;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f5.z0;
import h4.k;
import h5.e0;
import i3.mh;
import l72.y2;
import o13.r;
import o4.d0;
import o4.f0;
import o4.w;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import s5.x0;
import u1.y0;
import v13.i;
import vc0.v;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.wizard.WizardFinishScreenKt$LoadingIndicator$1$1", f = "WizardFinishScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f22537a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f22537a = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f22537a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f22537a.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final void a(h4.r rVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-262206274);
        int i16 = (o0VarE.k(R.drawable.lifestyle_logging_finish_setup) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            t4.d dVarA = n5.c.a(R.drawable.lifestyle_logging_finish_setup, o0VarE, i16 & 14);
            f5.k.f68985a.getClass();
            f5.k.a.C1427a c1427a = f5.k.a.f68987b;
            h4.r.a aVar2 = h4.r.S;
            y0.a(dVarA, null, x2.d(aVar2, 1.0f), null, c1427a, 0.0f, null, o0VarE, 25008, 104);
            q.a(u1.n.d(uVar.d(aVar2), w.a.i(w.f129023a, x.k(d0.a(d0.c(0.0f, f0.d(4284900966L), 14)), d0.a(d0.c(0.6f, f0.d(4278190080L), 14)), d0.a(d0.c(0.6f, f0.d(4278190080L), 14))), 0.0f, 14), null, 6), o0VarE, 0);
            i15 = 1;
            o0VarE.g0(true);
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(rVar, i14, i15);
        }
    }

    public static final void b(String str, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1778627948);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarE = d92.c.e(j92.f.f97931h);
            long j8 = d92.b.a(o0VarE).k().f63527d;
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            h4.r.a aVar = h4.r.S;
            d92.b.f58625c.getClass();
            o0Var = o0VarE;
            mh.c(str, l.A(aVar, 0.0f, j92.b.f97899b.f97920e, 1), j8, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarE, o0Var, i15 & 14, 0, 130040);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as.p(str, i14, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(boolean z14, m mVar, int i14) {
        o0 o0VarE = mVar.E(-90513118);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(z14, o0VarE);
            }
            p1 p1Var = (p1) objQ;
            x3 x3VarB = s1.f.b(((Boolean) p1Var.getF182175a()).booleanValue() ? 1.0f : 0.0f, s1.l.a(s1.l.d(1000, 0, null, 6), s1.y0.Restart, 4), "floatAnimation", o0VarE, 3136, 20);
            Unit unit = Unit.INSTANCE;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a(p1Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, unit, o0VarE);
            y2 y2Var = y2.f111386a;
            float fFloatValue = ((Number) x3VarB.getF182175a()).floatValue();
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            y2Var.c(fFloatValue, l.y(aVar, j92.b.f97899b.f97920e), false, o0VarE, 0, 4);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.i(z14, i14, 7);
        }
    }

    public static final void d(String str, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-197252735);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarE = d92.c.e(j92.f.f97930g);
            long j8 = d92.b.a(o0VarE).k().f63527d;
            h4.r.a aVar = h4.r.S;
            d92.b.f58625c.getClass();
            h4.r rVarA = l.A(aVar, 0.0f, j92.b.f97899b.f97920e, 1);
            d6.h.f57752b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarA, j8, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarE, o0Var, i15 & 14, 0, 130040);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as.p(str, i14, 5);
        }
    }

    public static final void e(int i14, e23.a aVar, String str, m mVar) {
        int i15;
        e23.a aVar2;
        String str2;
        o0 o0VarE = mVar.E(1274267850);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            aVar2 = aVar;
            str2 = str;
            l72.f0.f110999a.d(((i15 << 3) & 112) | 384 | ((i15 << 9) & 57344), 9, aVar2, x2.f(h4.r.S, 1.0f), str2, o0VarE, null, false);
        } else {
            aVar2 = aVar;
            str2 = str;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(str2, aVar2, i14, 1);
        }
    }

    public static final void f(String str, gk1.b bVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(506911768);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(bVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i16 = i15;
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f0Var.k(str, l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), false, bVar, o0VarE, (i16 & 14) | ((i16 << 6) & 7168), 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(str, bVar, i14, 8);
        }
    }

    public static final void g(e eVar, v vVar, e23.a aVar, gk1.b bVar, h4.r rVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(2096222351);
        int i15 = i14 | (o0VarE.B(eVar) ? 4 : 2) | (o0VarE.r(vVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(bVar) ? 2048 : 1024) | (o0VarE.B(rVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97920e;
            org.apache.commons.lang3.e.j(bVar2);
            h4.r rVarThen = x2.f(x2.x(l.B(aVar2, f14, f15, f15, f15), null, 3), 1.0f).then(rVar);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (eVar instanceof e.c) {
                o0VarE.C(-1319780735);
                e(i15 & 112, vVar, gl1.y.Q(o0VarE, R.string.lbl_got_it), o0VarE);
                o0VarE.g0(false);
            } else if (eVar instanceof e.a) {
                o0VarE.C(-1319608282);
                e((i15 >> 3) & 112, aVar, gl1.y.Q(o0VarE, R.string.lbl_try_again), o0VarE);
                f(gl1.y.Q(o0VarE, R.string.lbl_exit_setup_capitalized), bVar, o0VarE, (i15 >> 6) & 112);
                o0VarE.g0(false);
            } else {
                if (!(eVar instanceof e.b)) {
                    throw kg.f.h(o0VarE, 1204350881, false);
                }
                o0VarE.C(1204367177);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.z((Object) eVar, (Object) vVar, aVar, (e23.a) bVar, (Object) rVar, i14, 9);
        }
    }

    public static final void h(e eVar, h4.r rVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(2050294519);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarThen = x2.d(l.y(aVar, j92.b.f97899b.f97923h), 1.0f).then(rVar);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            l.f(x2.c(aVar, 0.35f), o0VarE);
            if (eVar instanceof e.b) {
                o0VarE.C(1129672708);
                d(((e.b) eVar).f22540a, o0VarE, 0);
                c(false, o0VarE, 6);
                o0VarE.g0(false);
            } else if (eVar instanceof e.c) {
                o0VarE.C(1129834435);
                e.c cVar = (e.c) eVar;
                d(cVar.f22541a, o0VarE, 0);
                c(true, o0VarE, 6);
                String str = cVar.f22542b;
                if (str == null) {
                    o0VarE.C(1129962774);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1129962775);
                    b(str, o0VarE, 0);
                    o0VarE.g0(false);
                    Unit unit = Unit.INSTANCE;
                }
                o0VarE.g0(false);
            } else {
                if (!(eVar instanceof e.a)) {
                    throw kg.f.h(o0VarE, -1071939084, false);
                }
                o0VarE.C(1130055062);
                e.a aVar4 = (e.a) eVar;
                d(aVar4.f22538a, o0VarE, 0);
                String str2 = aVar4.f22539b;
                if (str2 == null) {
                    o0VarE.C(1130134390);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1130134391);
                    b(str2, o0VarE, 0);
                    o0VarE.g0(false);
                    Unit unit2 = Unit.INSTANCE;
                }
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(eVar, rVar, i14, 26);
        }
    }

    public static final void i(e eVar, v vVar, e23.a aVar, gk1.b bVar, m mVar, int i14) {
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(-228593129);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(R.drawable.lifestyle_logging_finish_setup) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(vVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(bVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            c12.a.f22526a.getClass();
            z3.e eVar2 = c12.a.f22527b;
            g6.f.a aVar2 = g6.f.f75994b;
            z02.d.a(false, eVar2, null, null, n3.b(0.0f, 0.0f, 0.0f, 0, 7), z3.f.c(-1206298272, new a51.l(eVar, vVar, aVar, bVar), o0VarE), o0VarE, 196656, 13);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(eVar, vVar, aVar, bVar, i14, 26);
        }
    }
}
