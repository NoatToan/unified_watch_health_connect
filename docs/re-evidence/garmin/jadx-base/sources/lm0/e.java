package lm0;

import c2.x2;
import c2.y;
import c2.z;
import h5.e0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.m3;
import kotlin.t1;
import l72.p2;
import o13.r;
import o4.d0;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.h0;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.v;
import p3.x1;
import p3.x3;
import s5.w0;
import u62.c5;
import u62.f3;
import u62.i1;
import u62.n5;
import u62.t;
import u62.w;
import u62.w4;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<o13.p<com.garmin.android.apps.connectmobile.connections.groups.services.model.e, u4.d>> f113533a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.page.GroupActivitiesPageScreenKt$GroupOtherActivityRow$2$3$1$1$2$1$1", f = "GroupActivitiesPageScreen.kt", l = {244}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i2.a f113535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i2.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f113535b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f113535b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f113534a;
            if (i14 == 0) {
                r.b(obj);
                this.f113534a = 1;
                if (this.f113535b.a(null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lm0/e$b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements h0 {
        @Override // p3.h0
        public final void dispose() {
        }
    }

    static {
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_STEP_TRACKING_AND_WALKING;
        s62.a aVar = s62.a.f157643a;
        aVar.getClass();
        t62.a aVar2 = t62.a.f162797a;
        o13.p pVar = new o13.p(eVar, n5.a(aVar2));
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar2 = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_RUNNING;
        aVar.getClass();
        o13.p pVar2 = new o13.p(eVar2, f3.a(aVar2));
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar3 = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_ROAD_CYCLING;
        aVar.getClass();
        o13.p pVar3 = new o13.p(eVar3, t.a(aVar2));
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar4 = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_MOUNTAIN_BIKING;
        aVar.getClass();
        o13.p pVar4 = new o13.p(eVar4, w.a(aVar2));
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar5 = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_SWIMMING;
        aVar.getClass();
        o13.p pVar5 = new o13.p(eVar5, w4.a(aVar2));
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar6 = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_TRIATHLON;
        aVar.getClass();
        o13.p pVar6 = new o13.p(eVar6, c5.a(aVar2));
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar7 = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_PARASPORTS;
        aVar.getClass();
        o13.p pVar7 = new o13.p(eVar7, u62.b.a(aVar2));
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar8 = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_GOLF;
        aVar.getClass();
        f113533a = x.k(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, new o13.p(eVar8, i1.a(aVar2)));
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(Set<? extends com.garmin.android.apps.connectmobile.connections.groups.services.model.e> set, String str, e23.l<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.e, Unit> lVar, e23.l<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.e, Unit> lVar2, e23.l<? super String, Unit> lVar3, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        byte b14;
        m4.q qVar;
        Set<? extends com.garmin.android.apps.connectmobile.connections.groups.services.model.e> set2 = set;
        set2.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(-453051144);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(set2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(str) ? 32 : 16);
        e23.l<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.e, Unit> lVar4 = lVar;
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(lVar4) ? 256 : 128;
        }
        e23.l<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.e, Unit> lVar5 = lVar2;
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar5) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(lVar3) ? 16384 : 8192;
        }
        byte b15 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            m4.q qVar2 = (m4.q) o0VarE.A(t1.f91491i);
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            h4.r rVarF = x2.f(u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(2038386056);
            Iterator<T> it = f113533a.iterator();
            while (it.hasNext()) {
                o13.p pVar = (o13.p) it.next();
                com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.e) pVar.f128594a;
                u4.d dVar = (u4.d) pVar.f128595b;
                boolean zContains = set2.contains(eVar);
                p2 p2Var = p2.f111205a;
                String strQ = gl1.y.Q(o0VarE, eVar.f31647b);
                z3.e eVarC = z3.f.c(1075466971, new b82.k(dVar, 7), o0VarE);
                z3.e eVarC2 = z3.f.c(-1993834532, new j30.d(zContains, 13, b15), o0VarE);
                m3 m3Var2 = m3Var;
                boolean zR = o0VarE.r(qVar2) | o0VarE.B(m3Var2) | o0VarE.h(zContains) | ((i16 & 7168) == 2048) | o0VarE.k(eVar.ordinal()) | ((i16 & 896) == 256);
                Object objQ = o0VarE.q();
                if (zR) {
                    m4.q qVar3 = qVar2;
                    b14 = 0;
                    Object dVar2 = new d(qVar3, m3Var2, zContains, lVar5, eVar, lVar4);
                    qVar = qVar3;
                    o0VarE.K(dVar2);
                    objQ = dVar2;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        m4.q qVar4 = qVar2;
                        b14 = 0;
                        Object dVar3 = new d(qVar4, m3Var2, zContains, lVar5, eVar, lVar4);
                        qVar = qVar4;
                        o0VarE.K(dVar3);
                        objQ = dVar3;
                    } else {
                        qVar = qVar2;
                        b14 = 0;
                    }
                }
                o0 o0Var2 = o0VarE;
                p2Var.g(strQ, null, null, eVarC, eVarC2, false, zContains, (e23.a) objQ, o0Var2, 27648, 166);
                set2 = set;
                lVar4 = lVar;
                lVar5 = lVar2;
                b15 = b14;
                o0VarE = o0Var2;
                qVar2 = qVar;
                m3Var = m3Var2;
            }
            o0 o0Var3 = o0VarE;
            o0Var3.g0(b15);
            b(str, lVar3, o0Var3, ((i16 >> 3) & 14) | ((i16 >> 9) & 112));
            o0Var3.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var3;
        } else {
            o0 o0Var4 = o0VarE;
            o0Var4.e();
            o0Var = o0Var4;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e((Object) set, (Object) str, (Object) lVar, (Object) lVar2, (Object) lVar3, i14, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1201559535);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i2.c();
                o0VarE.K(objQ);
            }
            i2.a aVar = (i2.a) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var2 = (m4.b0) objQ3;
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                String str2 = str == null ? "" : str;
                int length = (str != null ? str : "").length();
                objQ5 = p0.n(new x5.l0(str2, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ5);
            }
            p1 p1Var2 = (p1) objQ5;
            t2 t2Var = new t2(ds.e0.d(d92.b.f58623a, o0VarE), d0.c(0.4f, d92.b.a(o0VarE).k().b(), 14), null);
            boolean z14 = !((Boolean) p1Var.getF182175a()).booleanValue() && (str == null || d53.w.J(str));
            x3 x3VarB = s1.f.b(z14 ? 0.0f : -1.0f, s1.l.d(300, 0, null, 6), "", o0VarE, 3120, 20);
            boolean z15 = (i15 & 14) == 4;
            Object objQ6 = o0VarE.q();
            if (z15 || objQ6 == c2565a) {
                objQ6 = new b82.b0(3, str, p1Var2);
                o0VarE.K(objQ6);
            }
            l0.a(str, (e23.l) objQ6, o0VarE);
            o0Var = o0VarE;
            v.a(u2.f201804a.c(t2Var), z3.f.c(696609967, new et1.e(z14, m3Var, b0Var2, p1Var, str, x3VarB, b0Var, aVar, lVar, p1Var2, qVar), o0Var), o0Var, 56);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f40.c(str, lVar, i14, 4, (byte) 0);
        }
    }
}
