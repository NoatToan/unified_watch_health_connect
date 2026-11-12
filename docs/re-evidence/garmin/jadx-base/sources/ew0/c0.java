package ew0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l72.p2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingSelectBehavioursScreenKt$SelectBehavioursPage$1$1$1$1$1", f = "LifestyleLoggingSelectBehavioursScreen.kt", l = {253}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f66195b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f66195b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f66195b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66194a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f66194a = 1;
                if (this.f66195b.b(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingSelectBehavioursScreenKt$SelectBehavioursPage$1$2$1$1", f = "LifestyleLoggingSelectBehavioursScreen.kt", l = {268}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f66197b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f66197b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f66197b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66196a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f66196a = 1;
                if (this.f66197b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingSelectBehavioursScreenKt$SelectBehavioursPage$1$3$1$1", f = "LifestyleLoggingSelectBehavioursScreen.kt", l = {271}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f66199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f66199b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f66199b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66198a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f66198a = 1;
                if (this.f66199b.d(this) == aVar) {
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

    public static final void a(String str, boolean z14, boolean z15, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        e23.a aVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(44748259);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            p2.f111205a.g(str, null, null, null, z3.f.c(1883293304, new u(0, z14, z15), o0VarE), false, false, z15 ? aVar2 : null, o0Var, (i15 & 14) | 24576, 238);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ct1.a(i14, 1, str, aVar2, z14, z15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0152  */
    public static final void b(i53.c cVar, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        boolean z15;
        e23.l lVar2;
        o0 o0VarE = mVar.E(1641541611);
        int i15 = (i14 & 6) == 0 ? i14 | ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) : i14;
        if ((i14 & 48) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 32 : 16;
        } else {
            z15 = z14;
        }
        int i16 = i15 | 384;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            aVar.getClass();
            int i17 = 19;
            if (objQ == p3.m.a.f135155b) {
                objQ = new ep0.a(19);
                o0VarE.K(objQ);
            }
            e23.l lVar3 = (e23.l) objQ;
            x1 x1Var = p3.n.f135158a;
            aw0.a aVar2 = new aw0.a(w2.a0.s(o0VarE));
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                pv0.d dVar = (pv0.d) it.next();
                arrayList.add(pv0.d.a(dVar, aVar2.a(Long.valueOf(dVar.f141358a), dVar.f141361d), null, 1015));
            }
            List<pv0.d> listN0 = h0.N0(arrayList, new pv0.e());
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(1335311539);
            for (pv0.d dVar2 : listN0) {
                String str = dVar2.f141361d;
                if (str == null) {
                    str = "";
                }
                boolean zF = pv0.f.f(dVar2);
                boolean zR = ((i16 & 896) == 256) | o0VarE.r(dVar2);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new dl0.g(i17, lVar3, dVar2);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new dl0.g(i17, lVar3, dVar2);
                        o0VarE.K(objQ2);
                    }
                }
                a(str, zF, z15, (e23.a) objQ2, o0VarE, (i16 << 3) & 896);
                z15 = z14;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
            lVar2 = lVar3;
        } else {
            o0VarE.e();
            lVar2 = lVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(cVar, z14, lVar2, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(m mVar, e23.a aVar, gk1.b bVar, gk1.b bVar2, p3.m mVar2, int i14) {
        o0 o0Var;
        m mVar3 = mVar;
        mVar3.getClass();
        aVar.getClass();
        o0 o0VarE = mVar2.E(-988277639);
        int i15 = i14 | (o0VarE.r(mVar3) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(bVar) ? 256 : 128) | (o0VarE.r(bVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(mVar3.f66250q, o0VarE);
            i53.c cVarE = i53.a.e((List) s9.c.c(mVar3.f66244k, o0VarE).getF182175a());
            p1 p1VarC2 = s9.c.c(mVar3.f66252t, o0VarE);
            c12.h.b bVar3 = new c12.h.b(g0.d.f66220a, null, null, 6, null);
            Object[] objArr = new Object[0];
            int i16 = c12.h.f22556c;
            d4.l lVarB = d4.a.b(x.f66291a, y.f66292a);
            boolean zR = o0VarE.r(bVar3);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new z(bVar3);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new z(bVar3);
                    o0VarE.K(objQ);
                }
            }
            c12.h hVar = (c12.h) d4.a.c(objArr, lVarB, (e23.a) objQ, o0VarE, 0);
            e11.a aVar3 = new e11.a(10);
            e11.a aVar4 = new e11.a(11);
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new dh1.a(bVar2, 13);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new dh1.a(bVar2, 13);
                    o0VarE.K(objQ2);
                }
            }
            z3.e eVarC = z3.f.c(-1110624834, new a42.a(cVarE, 23, mVar3, bVar), o0VarE);
            mVar3 = mVar;
            c12.g.a(hVar, aVar, null, aVar3, aVar4, (e23.p) objQ2, null, eVarC, false, z3.f.c(-1463696654, new a42.d0(cVarE, mVar, p1VarC2, false, p1VarC, 16), o0VarE), o0VarE, 817889280 | c12.h.f22556c | (i15 & 112), 324);
            o0Var = o0VarE;
            if (((d0) p1VarC.getF182175a()).f66200a) {
                o0Var.C(227598143);
                boolean zR2 = o0Var.r(mVar3);
                Object objQ3 = o0Var.q();
                if (zR2) {
                    objQ3 = new ew0.a(mVar3, 2);
                    o0Var.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new ew0.a(mVar3, 2);
                        o0Var.K(objQ3);
                    }
                }
                w13.b.a((e23.a) objQ3, o0Var, 0);
                o0Var.g0(false);
            } else {
                o0Var.C(227700009);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.i(mVar3, aVar, bVar, bVar2, i14, 19);
        }
    }

    public static final void d(rd1.a aVar, e23.l<? super Boolean, Unit> lVar, e23.l<? super b63.v, Unit> lVar2, e23.l<? super Boolean, Unit> lVar3, e23.l<? super b63.v, Unit> lVar4, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-581086408);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(lVar3) ? 2048 : 1024) | (o0VarE.r(lVar4) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarB = a2.b(h4.r.S, a2.a(o0VarE), true);
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
                p0.l();
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
            g(gl1.y.Q(o0VarE, R.string.lbl_set_up_logging_reminders), gl1.y.Q(o0VarE, R.string.msg_receive_notifications_to_log), o0VarE, 0);
            w2.a0.b(aVar, lVar, lVar2, lVar3, lVar4, o0VarE, (i15 & 14) | 8 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 57344));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(aVar, lVar, lVar2, lVar3, lVar4, i14, 0);
        }
    }

    public static final void e(i53.c<pv0.d> cVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        boolean z14;
        o0 o0Var2;
        boolean z15;
        String strA;
        String upperCase;
        o0 o0VarE = mVar.E(-1754162010);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i16 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(aVar, a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            g(gl1.y.Q(o0VarE, R.string.lbl_review_selected_behaviors), gl1.y.Q(o0VarE, R.string.msg_review_selected_behaviors), o0VarE, 0);
            if (pv0.f.e(cVar)) {
                o0VarE.C(-1479309125);
                c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(aVar, o0VarE);
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                o0VarE.C(-368963966);
                ArrayList arrayListB = pv0.f.b(cVar);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : arrayListB) {
                    pv0.d dVar = (pv0.d) obj;
                    pv0.b bVarD = pv0.f.d(dVar) == pv0.b.CUSTOM_SLEEP_RELATED ? pv0.b.CUSTOM : pv0.f.d(dVar);
                    Object arrayList = linkedHashMap.get(bVarD);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(bVarD, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    pv0.b bVar2 = (pv0.b) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list.isEmpty()) {
                        o0Var2 = o0VarE;
                        o0Var2.C(-1570048482);
                        o0Var2.g0(false);
                    } else {
                        o0VarE.C(-1570907616);
                        if (bVar2 == null) {
                            o0VarE.C(-1570848624);
                            z15 = false;
                            o0VarE.g0(false);
                            strA = null;
                        } else {
                            z15 = false;
                            o0VarE.C(-1570848623);
                            zv0.a aVar4 = zv0.a.f207158a;
                            l22.a aVarS = w2.a0.s(o0VarE);
                            aVar4.getClass();
                            strA = zv0.a.a(bVar2, aVarS);
                            o0VarE.g0(false);
                        }
                        if (strA != null) {
                            upperCase = strA.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        } else {
                            upperCase = null;
                        }
                        if (upperCase == null) {
                            upperCase = "";
                        }
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                        h4.r.a aVar5 = h4.r.S;
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f14 = eVar2.f97920e;
                        float f15 = eVar2.f97920e;
                        bVar3.getClass();
                        bVar3.getClass();
                        float f16 = eVar2.f97917b;
                        bVar3.getClass();
                        h4.r rVarB2 = c2.l.B(aVar5, f14, f15, f15, f16);
                        boolean z16 = z15;
                        o0 o0Var3 = o0VarE;
                        mh.c(upperCase, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var3, 0, 0, 131068);
                        o0Var2 = o0Var3;
                        b(i53.a.e(list), z16, null, o0Var2, pv0.d.f141356k | 48);
                        o0Var2.g0(z16);
                    }
                    o0VarE = o0Var2;
                }
                o0Var = o0VarE;
                i15 = 0;
                z14 = true;
                e5.u(o0Var, false, true, false);
            } else {
                o0Var = o0VarE;
                i15 = 0;
                z14 = true;
                o0Var.C(-1478087694);
                o0Var.g0(false);
            }
            o0Var.g0(z14);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            i15 = 0;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(cVar, i14, i15);
        }
    }

    public static final void f(i53.c<pv0.d> cVar, e23.l<? super Long, Unit> lVar, e23.q<? super String, ? super pv0.k, ? super pv0.p, Unit> qVar, p3.m mVar, int i14) {
        int i15;
        String strP;
        o0 o0VarE = mVar.E(351115947);
        int i16 = i14 | ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(qVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            Throwable th3 = null;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            aw0.a aVar = new aw0.a(w2.a0.s(o0VarE));
            int size = pv0.f.b(cVar).size();
            pv0.b.f141341b.getClass();
            List<pv0.b> listK = p13.x.k(pv0.b.LIFESTYLE, pv0.b.SELF_CARE, pv0.b.TREATMENTS, pv0.b.SLEEP_RELATED, pv0.b.LIFE_STATUS, pv0.b.CUSTOM);
            o0VarE.C(-1879971304);
            ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
            for (pv0.b bVar : listK) {
                Throwable th4 = th3;
                zv0.a aVar2 = zv0.a.f207158a;
                l22.a aVarS = w2.a0.s(o0VarE);
                aVar2.getClass();
                arrayList.add(zv0.a.a(bVar, aVarS));
                th3 = th4;
            }
            Throwable th5 = th3;
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList);
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw th5;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.msg_choose_from_following_categories);
            if (size == 1) {
                i15 = 0;
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1574018457, R.string.lbl_one_behavior_selected, o0VarE, false);
            } else {
                i15 = 0;
                o0VarE.C(-1574016029);
                strP = gl1.y.P(R.string.lbl_number_behaviors_selected, new Object[]{Integer.valueOf(size)}, o0VarE);
                o0VarE.g0(false);
            }
            g(strQ, strP, o0VarE, i15);
            wv0.i.c(cVarE, z3.f.c(1542188262, new ak0.h(listK, cVar, lVar, b0Var, mcVarF, aVar, 6), o0VarE), o0VarE, 48);
            if (mcVarF.e()) {
                o0VarE.C(-1548523920);
                boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == p3.m.a.f135155b) {
                    objQ2 = new cn1.t(b0Var, mcVarF, 1);
                    o0VarE.K(objQ2);
                }
                e23.a aVar5 = (e23.a) objQ2;
                boolean zR2 = ((i16 & 896) == 256) | o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                Object objQ3 = o0VarE.q();
                if (zR2 || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new s(qVar, b0Var, mcVarF);
                    o0VarE.K(objQ3);
                }
                wv0.d.a(mcVarF, aVar5, (e23.q) objQ3, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1548127027);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(cVar, lVar, qVar, i14, 21);
        }
    }

    public static final void g(String str, String str2, p3.m mVar, int i14) {
        String str3;
        o0 o0Var;
        o0 o0VarE = mVar.E(14202920);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarF, 0.0f, f14, 0.0f, eVar.f97920e, 5);
            bVar.getClass();
            h4.r rVarA = c2.l.A(rVarC, eVar.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(cVar, h4.d.a.f81537o, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i15 & 14, 0, 130046);
            fVar.getClass();
            x0 x0Var = j92.f.f97933j;
            long jD = d92.b.a(o0VarE).k().d();
            bVar.getClass();
            str3 = str2;
            mh.c(str3, c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), jD, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, o0VarE, (i15 >> 3) & 14, 0, 130040);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            str3 = str2;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str, str3, i14, 8);
        }
    }
}
