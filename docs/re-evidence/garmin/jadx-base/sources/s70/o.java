package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.e5;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Ls70/o;", "Lr70/r;", "Ly70/b;", "stateHolder", "Ln70/g;", "dashboardDelegate", "<init>", "(Ly70/b;Ln70/g;)V", "", "isVisible", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.b f157748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n70.g f157749b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.BatteryLowComposable$DashboardItem$1$1", f = "BatteryLowComposable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<bc0.a> f157750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f157751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<bc0.a> list, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157750a = list;
            this.f157751b = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157750a, this.f157751b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f157750a.isEmpty()) {
                sz0.f.f161394a.getClass();
                sz0.f.a.a(43, this.f157751b);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.BatteryLowComposable$DashboardItem$2$1$1$1", f = "BatteryLowComposable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f157752a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p3.p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f157752a = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f157752a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f157752a.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.BatteryLowComposable$DashboardItem$2$1$onAction$1$1$1", f = "BatteryLowComposable.kt", l = {89}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157753a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ bc0.a f157755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Set<Long>> f157756d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(bc0.a aVar, p3.p1<Set<Long>> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f157755c = aVar;
            this.f157756d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new c(this.f157755c, this.f157756d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157753a;
            if (i14 == 0) {
                o13.r.b(obj);
                e53.c.a aVar2 = e53.c.f63094b;
                long jF = e53.e.f(160L, e53.f.MILLISECONDS);
                this.f157753a = 1;
                if (o53.m0.c(jF, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            y70.b bVar = o.this.f157748a;
            bc0.a aVar3 = this.f157755c;
            bVar.f(aVar3);
            p3.p1<Set<Long>> p1Var = this.f157756d;
            p1Var.setValue(p13.c1.f(p1Var.getF182175a(), new Long(aVar3.f17403a)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.BatteryLowComposable$DashboardItem$2$1$onClose$1$1$1", f = "BatteryLowComposable.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157757a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ bc0.a f157759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f157760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Set<Long>> f157761e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(bc0.a aVar, Context context, p3.p1<Set<Long>> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f157759c = aVar;
            this.f157760d = context;
            this.f157761e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new d(this.f157759c, this.f157760d, this.f157761e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157757a;
            if (i14 == 0) {
                o13.r.b(obj);
                e53.c.a aVar2 = e53.c.f63094b;
                long jF = e53.e.f(160L, e53.f.MILLISECONDS);
                this.f157757a = 1;
                if (o53.m0.c(jF, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            ht.s sVar = ht.s.f85508a;
            lt.e.l lVar = new lt.e.l(lt.e.a.Tapped);
            sVar.getClass();
            ht.s.a(lVar);
            y70.b bVar = o.this.f157748a;
            bc0.a aVar3 = this.f157759c;
            bVar.f(aVar3);
            sz0.f.f161394a.getClass();
            sz0.f.a.a(43, this.f157760d);
            p3.p1<Set<Long>> p1Var = this.f157761e;
            p1Var.setValue(p13.c1.f(p1Var.getF182175a(), new Long(aVar3.f17403a)));
            return Unit.INSTANCE;
        }
    }

    public o(y70.b bVar, n70.g gVar) {
        bVar.getClass();
        gVar.getClass();
        this.f157748a = bVar;
        this.f157749b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:67:0x019d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v33 */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        p3.p1 p1Var;
        boolean z14;
        boolean zR;
        Object objQ;
        Context context;
        bc0.a aVar;
        boolean zR2;
        Object objQ2;
        p3.p1 p1Var2;
        boolean z15;
        o oVar = this;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -1609660040);
        int i15 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(oVar) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            p3.x1 x1Var = p3.n.f135158a;
            List<bc0.a> list = (List) s9.c.b((r53.i) oVar.f157748a.f194647d.getValue(), p13.j0.f134944a, o0VarQ, 48).getF182175a();
            Context context2 = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR3 = o0VarQ.r(list) | o0VarQ.r(context2);
            Object objQ3 = o0VarQ.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR3) {
                objQ3 = new a(list, context2, null);
                o0VarQ.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new a(list, context2, null);
                    o0VarQ.K(objQ3);
                }
            }
            p3.l0.e((e23.p) objQ3, list, o0VarQ);
            if (list.isEmpty()) {
                o0VarQ.C(-69075542);
                o0VarQ.g0(false);
            } else {
                Object objH = q2.h(o0VarQ, -71826885, aVar2);
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objH == c2565a) {
                    objH = p3.p0.n(p13.l0.f134950a);
                    o0VarQ.K(objH);
                }
                p3.p1 p1Var3 = (p3.p1) objH;
                Object objQ4 = o0VarQ.q();
                if (objQ4 == c2565a) {
                    objQ4 = p3.l0.j(t13.h.f161748a, o0VarQ);
                    o0VarQ.K(objQ4);
                }
                o53.b0 b0Var = (o53.b0) objQ4;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarQ, 0);
                int iHashCode = Long.hashCode(o0VarQ.U);
                i2 i2VarA0 = o0VarQ.a0();
                h4.r rVarC = h4.k.c(rVar, o0VarQ);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (o0VarQ.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarQ.z();
                if (o0VarQ.T) {
                    o0VarQ.M(aVar3);
                } else {
                    o0VarQ.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarQ);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarQ);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarQ, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarQ);
                c2.b0 b0Var2 = c2.b0.f22601a;
                o0VarQ.C(-202247437);
                for (bc0.a aVar4 : list) {
                    Set set = (Set) p1Var3.getF182175a();
                    long j8 = aVar4.f17403a;
                    boolean zContains = set.contains(Long.valueOf(j8));
                    boolean zL = o0VarQ.l(j8);
                    Object objQ5 = o0VarQ.q();
                    if (zL || objQ5 == p3.m.a.f135155b) {
                        objQ5 = p3.p0.n(Boolean.FALSE);
                        o0VarQ.K(objQ5);
                    }
                    p3.p1 p1Var4 = (p3.p1) objQ5;
                    Long lValueOf = Long.valueOf(j8);
                    boolean zB = o0VarQ.B(p1Var4);
                    Object objQ6 = o0VarQ.q();
                    if (zB) {
                        p1Var = p1Var3;
                    } else {
                        p1Var = p1Var3;
                        if (objQ6 != p3.m.a.f135155b) {
                            z14 = false;
                        }
                        p3.l0.e((e23.p) objQ6, lValueOf, o0VarQ);
                        zR = o0VarQ.r(aVar4) | o0VarQ.r(b0Var) | o0VarQ.r(oVar) | o0VarQ.r(context2);
                        objQ = o0VarQ.q();
                        if (!zR || objQ == p3.m.a.f135155b) {
                            context = context2;
                            aVar = aVar4;
                            o oVar2 = oVar;
                            m mVar2 = new m(p1Var, aVar, b0Var, oVar2, context);
                            oVar = oVar2;
                            o0VarQ.K(mVar2);
                            objQ = mVar2;
                        } else {
                            context = context2;
                            aVar = aVar4;
                        }
                        e23.a aVar5 = (e23.a) objQ;
                        zR2 = o0VarQ.r(oVar) | o0VarQ.r(context) | o0VarQ.r(aVar) | o0VarQ.r(b0Var);
                        objQ2 = o0VarQ.q();
                        if (!zR2 || objQ2 == p3.m.a.f135155b) {
                            o53.b0 b0Var3 = b0Var;
                            bc0.a aVar6 = aVar;
                            Context context3 = context;
                            p3.p1 p1Var5 = p1Var;
                            m mVar3 = new m(oVar, context3, aVar6, b0Var3, p1Var5);
                            p1Var2 = p1Var5;
                            context = context3;
                            aVar = aVar6;
                            b0Var = b0Var3;
                            o0VarQ.K(mVar3);
                            objQ2 = mVar3;
                        } else {
                            p1Var2 = p1Var;
                        }
                        e23.a aVar7 = (e23.a) objQ2;
                        if (((Boolean) p1Var4.getF182175a()).booleanValue() || zContains) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        xz1.a.f192853a.getClass();
                        c2.b0 b0Var4 = b0Var2;
                        p3.o0 o0Var = o0VarQ;
                        r1.c0.c(b0Var4, z15, null, xz1.a.a(o0VarQ), xz1.a.b(o0VarQ), org.apache.commons.lang3.e.e(j8, "BatteryLowCard:"), z3.f.c(-2074138365, new ng2.i(aVar, 18, aVar5, aVar7), o0VarQ), o0Var, 1572870, 2);
                        context2 = context;
                        b0Var2 = b0Var4;
                        o0VarQ = o0Var;
                        p1Var3 = p1Var2;
                        oVar = this;
                    }
                    z14 = false;
                    objQ6 = new b(p1Var4, null);
                    o0VarQ.K(objQ6);
                    p3.l0.e((e23.p) objQ6, lValueOf, o0VarQ);
                    zR = o0VarQ.r(aVar4) | o0VarQ.r(b0Var) | o0VarQ.r(oVar) | o0VarQ.r(context2);
                    objQ = o0VarQ.q();
                    if (zR) {
                        context = context2;
                        aVar = aVar4;
                        o oVar3 = oVar;
                        m mVar4 = new m(p1Var, aVar, b0Var, oVar3, context);
                        oVar = oVar3;
                        o0VarQ.K(mVar4);
                        objQ = mVar4;
                    } else {
                        context = context2;
                        aVar = aVar4;
                        o oVar4 = oVar;
                        m mVar5 = new m(p1Var, aVar, b0Var, oVar4, context);
                        oVar = oVar4;
                        o0VarQ.K(mVar5);
                        objQ = mVar5;
                    }
                    e23.a aVar8 = (e23.a) objQ;
                    zR2 = o0VarQ.r(oVar) | o0VarQ.r(context) | o0VarQ.r(aVar) | o0VarQ.r(b0Var);
                    objQ2 = o0VarQ.q();
                    if (zR2) {
                        o53.b0 b0Var5 = b0Var;
                        bc0.a aVar9 = aVar;
                        Context context4 = context;
                        p3.p1 p1Var6 = p1Var;
                        m mVar6 = new m(oVar, context4, aVar9, b0Var5, p1Var6);
                        p1Var2 = p1Var6;
                        context = context4;
                        aVar = aVar9;
                        b0Var = b0Var5;
                        o0VarQ.K(mVar6);
                        objQ2 = mVar6;
                    } else {
                        o53.b0 b0Var6 = b0Var;
                        bc0.a aVar10 = aVar;
                        Context context5 = context;
                        p3.p1 p1Var7 = p1Var;
                        m mVar7 = new m(oVar, context5, aVar10, b0Var6, p1Var7);
                        p1Var2 = p1Var7;
                        context = context5;
                        aVar = aVar10;
                        b0Var = b0Var6;
                        o0VarQ.K(mVar7);
                        objQ2 = mVar7;
                    }
                    e23.a aVar11 = (e23.a) objQ2;
                    if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    xz1.a.f192853a.getClass();
                    c2.b0 b0Var7 = b0Var2;
                    p3.o0 o0Var2 = o0VarQ;
                    r1.c0.c(b0Var7, z15, null, xz1.a.a(o0VarQ), xz1.a.b(o0VarQ), org.apache.commons.lang3.e.e(j8, "BatteryLowCard:"), z3.f.c(-2074138365, new ng2.i(aVar, 18, aVar8, aVar11), o0VarQ), o0Var2, 1572870, 2);
                    context2 = context;
                    b0Var2 = b0Var7;
                    o0VarQ = o0Var2;
                    p1Var3 = p1Var2;
                    oVar = this;
                }
                e5.u(o0VarQ, false, true, false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 0);
        }
    }
}
