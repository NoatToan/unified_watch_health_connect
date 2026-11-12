package vt0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c2.l2;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.leaderboard.model.f0;
import e2.i0;
import e2.k0;
import e23.l;
import e23.p;
import g22.k;
import h5.e0;
import i3.i7;
import i3.mh;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import l72.j0;
import mt0.k4;
import n82.j;
import o13.r;
import o4.m1;
import o53.b0;
import o82.g;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;
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
import u1.w;
import v13.i;
import vb.h;
import vd0.s0;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.presentation.compose.weeklyleaderboard.WeeklyLeaderboardScreenKt$WeeklyLeaderboardScreen$1$1", f = "WeeklyLeaderboardScreen.kt", l = {80}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zc.d<f0> f180069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i0 f180070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f180071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f180072e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zc.d<f0> dVar, i0 i0Var, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f180069b = dVar;
            this.f180070c = i0Var;
            this.f180071d = p1Var;
            this.f180072e = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180069b, this.f180070c, this.f180071d, this.f180072e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180068a;
            if (i14 == 0) {
                r.b(obj);
                p1<Boolean> p1Var = this.f180071d;
                boolean zBooleanValue = p1Var.getF182175a().booleanValue();
                zc.d<f0> dVar = this.f180069b;
                if (zBooleanValue && (dVar.d().f196390f || dVar.d().f196391g)) {
                    p1Var.setValue(Boolean.FALSE);
                }
                if (!s.g(dVar.d().f196385a, z0.b.f196664b)) {
                    this.f180072e.setValue(Boolean.FALSE);
                }
                if ((dVar.d().f196385a instanceof z0.c) && dVar.b() > 0) {
                    Iterator<f0> it = dVar.c().f196336d.iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i15 = -1;
                            break;
                        }
                        if (it.next().f38157j) {
                            break;
                        }
                        i15++;
                    }
                    if (i15 >= 0) {
                        int iE = t.e(i15, 0, dVar.b() - 1);
                        this.f180068a = 1;
                        i0.a aVar2 = i0.f62432x;
                        if (this.f180070c.l(iE, 0, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(zt0.c cVar, l<? super o82.a, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1207676480);
        int i15 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new c(context);
                o0VarE.K(objQ);
            }
            c cVar2 = (c) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                g gVar = g.f130851d;
                LocalDate localDate = gg.b.D(k4.LastWeek).toLocalDate();
                localDate.getClass();
                o oVarT = k.t(localDate);
                LocalDate localDate2 = gg.b.u(k4.CurrentWeek).toLocalDate();
                localDate2.getClass();
                n82.f.a aVar = new n82.f.a(gVar, new o82.a(oVarT, k.t(localDate2)), null, 4, null);
                o0VarE.K(aVar);
                objQ2 = aVar;
            }
            n82.f fVarA = j.a((n82.f.a) objQ2, null, o0VarE, 2);
            h4.r.a aVar2 = h4.r.S;
            q82.a.a(x2.f(aVar2, 1.0f), new n82.n(fVarA, cVar2), null, o0VarE, 6, 4);
            n82.c.a(x2.f(aVar2, 1.0f), fVarA, 0, false, z3.f.c(264220002, new aa2.j(lVar, 1), o0VarE), o0VarE, 24582, 12);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a((Object) cVar, (l) lVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    public static final void b(b bVar, l<? super b, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(692701061);
        int i15 = (o0VarE.k(bVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            o0VarE.C(-34204845);
            w13.c cVar = b.f180058l;
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            p13.c.b bVar2 = new p13.c.b();
            while (bVar2.hasNext()) {
                b bVar3 = (b) bVar2.next();
                arrayList.add(new j0(gl1.y.Q(o0VarE, bVar3.f180059a), null, null, false, bVar == bVar3, 14, null));
            }
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList);
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            f82.d dVar = new f82.d();
            h4.r rVarE = u1.n.e(h4.r.S, h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar4.getClass();
            l2 l2VarE = c2.l.e(f14, 0.0f, eVar.f97918c, 0.0f, 10);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new b71.n(lVar, 25, (byte) 0);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new b71.n(lVar, 25, (byte) 0);
                    o0VarE.K(objQ);
                }
            }
            e82.a.b(cVarE, dVar, i0VarA, rVarE, l2VarE, (p) objQ, o0VarE, 0, 0);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a((Object) bVar, (l) lVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:39:0x013c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0140  */
    /* JADX WARN: Code duplicated, block: B:45:0x015b  */
    /* JADX WARN: Code duplicated, block: B:48:0x021c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0229  */
    /* JADX WARN: Code duplicated, block: B:51:0x025b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(vt0.a aVar, l<? super vt0.a, Unit> lVar, m mVar, int i14) {
        vt0.a aVar2;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        Object objQ;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        Object objQ2;
        p1 p1Var;
        o0 o0VarE = mVar.E(1891718773);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.k(aVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ3 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(rVarF, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                u uVar = u.f22885a;
                bVar.getClass();
                float f14 = eVar.f97919d;
                bVar.getClass();
                h4.r rVarC4 = c2.l.C(aVar3, f14, eVar.f97918c, 0.0f, 0.0f, 12);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = new vd0.c(p1Var2, 18);
                    o0VarE.K(objQ);
                }
                h4.r rVarD = w.d(rVarC4, false, null, null, (e23.a) objQ, 15);
                c2.j.f22691a.getClass();
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                String strQ = gl1.y.Q(o0VarE, aVar.f180049b);
                d92.b.f58624b.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 131070);
                b3.b.a aVar5 = b3.b.a.f15503a;
                u4.d dVarA = d3.c.a();
                long jB = d92.b.a(o0VarE).f().b();
                bVar.getClass();
                h4.r rVarC5 = c2.l.C(aVar3, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
                bVar.getClass();
                i7.b(dVarA, null, x2.q(rVarC5, j92.b.f97901d.f97905d), jB, o0VarE, 48, 0);
                o0VarE.g0(true);
                h4.r rVarE = u1.n.e(aVar3, d92.b.a(o0VarE).c().f(), m1.f128891a);
                boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    p1Var = p1Var2;
                    objQ2 = new vd0.c(p1Var, 19);
                    o0VarE.K(objQ2);
                } else {
                    p1Var = p1Var2;
                }
                aVar2 = aVar;
                i3.u.a(zBooleanValue, (e23.a) objQ2, rVarE, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-1012081312, new s0(2, lVar, p1Var, aVar), o0VarE), o0VarE, 48, 48, 2040);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            u uVar2 = u.f22885a;
            bVar.getClass();
            float f15 = eVar.f97919d;
            bVar.getClass();
            h4.r rVarC6 = c2.l.C(aVar3, f15, eVar.f97918c, 0.0f, 0.0f, 12);
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                objQ = new vd0.c(p1Var2, 18);
                o0VarE.K(objQ);
            }
            h4.r rVarD2 = w.d(rVarC6, false, null, null, (e23.a) objQ, 15);
            c2.j.f22691a.getClass();
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            String strQ2 = gl1.y.Q(o0VarE, aVar.f180049b);
            d92.b.f58624b.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 131070);
            b3.b.a aVar6 = b3.b.a.f15503a;
            u4.d dVarA2 = d3.c.a();
            long jB2 = d92.b.a(o0VarE).f().b();
            bVar.getClass();
            h4.r rVarC7 = c2.l.C(aVar3, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
            bVar.getClass();
            i7.b(dVarA2, null, x2.q(rVarC7, j92.b.f97901d.f97905d), jB2, o0VarE, 48, 0);
            o0VarE.g0(true);
            h4.r rVarE2 = u1.n.e(aVar3, d92.b.a(o0VarE).c().f(), m1.f128891a);
            boolean zBooleanValue2 = ((Boolean) p1Var2.getF182175a()).booleanValue();
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                p1Var = p1Var2;
                objQ2 = new vd0.c(p1Var, 19);
                o0VarE.K(objQ2);
            } else {
                p1Var = p1Var2;
            }
            aVar2 = aVar;
            i3.u.a(zBooleanValue2, (e23.a) objQ2, rVarE2, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-1012081312, new s0(2, lVar, p1Var, aVar), o0VarE), o0VarE, 48, 48, 2040);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a((Object) aVar2, (l) lVar, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(zt0.c cVar, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        Object next;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1844507637);
        int i15 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            zc.d dVarA = zc.g.a(cVar.f206961i, o0VarE);
            p1 p1VarC = s9.c.c(cVar.f206956d, o0VarE);
            p1 p1VarC2 = s9.c.c(cVar.f206958f, o0VarE);
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            boolean zK = o0VarE.k(((vt0.a) p1VarC.getF182175a()).ordinal());
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zK) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.n(Boolean.TRUE);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            yc.s sVarD = dVarA.d();
            boolean zB = o0VarE.B(p1Var) | o0VarE.r(dVarA) | o0VarE.B(i0VarA);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                a aVar3 = new a(dVarA, i0VarA, p1Var, p1Var2, null);
                o0VarE.K(aVar3);
                objQ3 = aVar3;
            }
            l0.e((p) objQ3, sVarD, o0VarE);
            Iterator it = dVarA.c().f196336d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((f0) next).f38157j);
            f0 f0Var = (f0) next;
            boolean z14 = f0Var == null || f0Var.getAllPrivate() || s.c(f0Var.getTotalValue(), 0.0d);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(754368449, new f21.r(p1Var, aVar, cVar, dVarA, p1VarC, p1VarC2, p1Var2, z14, i0VarA), o0VarE), o0Var, 196608, 31);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(cVar, aVar, i14, 6);
        }
    }
}
