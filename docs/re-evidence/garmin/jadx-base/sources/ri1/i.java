package ri1;

import android.os.Bundle;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import i3.i8;
import lc.k0;
import lc.m0;
import lc.v0;
import o53.b0;
import o53.s0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachFlowNavGraphKt$InReachFlowNavHost$1$1$1$1$1", f = "InReachFlowNavGraph.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f152835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<ui1.j> f152836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<ti1.a> f152837c;

        /* JADX INFO: renamed from: ri1.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2887a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f152838a;

            static {
                int[] iArr = new int[ui1.j.values().length];
                try {
                    iArr[ui1.j.GO_TO_MESSENGER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ui1.j.GO_TO_PLAN_MANAGEMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f152838a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m0 m0Var, x3<? extends ui1.j> x3Var, x3<ti1.a> x3Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f152835a = m0Var;
            this.f152836b = x3Var;
            this.f152837c = x3Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f152835a, this.f152836b, this.f152837c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x3<ui1.j> x3Var = this.f152836b;
            ui1.j f182175a = x3Var.getF182175a();
            int i14 = f182175a == null ? -1 : C2887a.f152838a[f182175a.ordinal()];
            m0 m0Var = this.f152835a;
            if (i14 != 1) {
                x3<ti1.a> x3Var2 = this.f152837c;
                if (i14 == 2) {
                    m0Var.h(new r82.e(21), new l(x3Var2.getF182175a().f164581g));
                } else if (x3Var.getF182175a() != null) {
                    ht.a aVar2 = ht.a.f85464a;
                    Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachSubscriptionSetup"), new o13.p("Type", "CWS"), new o13.p("IsFreeTrial", Boolean.valueOf(x3Var2.getF182175a().f164579e)));
                    aVar2.getClass();
                    ht.a.a(bundleA, "PageView");
                }
            } else {
                m0Var.h(new r82.e(20), new k(false));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachFlowNavGraphKt$InReachFlowNavHost$1$1$3$2$1", f = "InReachFlowNavGraph.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f152839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f152840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f152841c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, k kVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f152839a = pVar;
            this.f152840b = kVar;
            this.f152841c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f152839a, this.f152840b, this.f152841c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z14 = this.f152840b.f152843a;
            p pVar = this.f152839a;
            pVar.getClass();
            w9.a aVarA = v1.a(pVar);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new r(pVar, z14, this.f152841c, null), 2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    public static final void a(int i14, final long j8, final e23.a aVar, p3.m mVar, final boolean z14, final boolean z15) {
        m0 m0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(449572977);
        int i15 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 & 14;
            boolean z16 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z16) {
                objQ = new a90.b(j8, 9);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a90.b(j8, 9);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(p.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar3);
            o0VarE.g0(false);
            final p pVar = (p) u1VarResolveViewModel;
            final m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            Object kVar = z14 ? new k(false) : j.INSTANCE;
            boolean zR = (i16 == 4) | o0VarE.r(pVar) | o0VarE.r(m0VarI) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((i15 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zR) {
                e23.l lVar = new e23.l() { // from class: ri1.f
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        k0 k0Var = (k0) obj;
                        k0Var.getClass();
                        p pVar2 = pVar;
                        final m0 m0Var2 = m0VarI;
                        boolean z17 = z15;
                        final e23.a aVar4 = aVar;
                        z3.e eVar = new z3.e(-1854982862, true, new g(pVar2, m0Var2, z17, aVar4));
                        p13.k0 k0Var2 = p13.k0.f134949a;
                        k0Var2.getClass();
                        j0 j0Var = j0.f134944a;
                        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                        nc.n.a(k0Var, t0Var.b(j.class), k0Var2, j0Var, null, null, null, null, eVar);
                        final long j14 = j8;
                        nc.n.a(k0Var, t0Var.b(l.class), k0Var2, j0Var, null, null, null, null, new z3.e(1649956777, true, new e23.r() { // from class: ri1.h
                            /* JADX WARN: Code duplicated, block: B:6:0x0045  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.r
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                lc.v vVar = (lc.v) obj3;
                                p3.m mVar2 = (p3.m) obj4;
                                ((Integer) obj5).getClass();
                                ((r1.l) obj2).getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                l lVar2 = (l) lc.w.a(vVar, t0Var2.b(l.class));
                                long j15 = j14;
                                boolean zL = mVar2.l(j15) | mVar2.B(lVar2);
                                Object objQ3 = mVar2.q();
                                p3.m.a aVar5 = p3.m.f135153a;
                                if (zL) {
                                    objQ3 = new a6.g(j15, lVar2, 8);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar5.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new a6.g(j15, lVar2, 8);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar6 = (e23.a) objQ3;
                                mVar2.L(-1614864554);
                                v9.a.f176280a.getClass();
                                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar2);
                                if (viewModelStoreOwnerA2 == null) {
                                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final int i17 = 0;
                                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var2.b(s.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar6);
                                mVar2.R();
                                final s sVar = (s) u1VarResolveViewModel2;
                                p1 p1VarC = s9.c.c(sVar.f152895i, mVar2);
                                si1.t tVar = new si1.t();
                                Object objQ4 = mVar2.q();
                                aVar5.getClass();
                                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                                if (objQ4 == c2565a) {
                                    objQ4 = new r82.e(19);
                                    mVar2.K(objQ4);
                                }
                                c.q qVarC = c.w.c(tVar, (e23.l) objQ4, mVar2, 48);
                                androidx.lifecycle.b0.a aVar7 = androidx.lifecycle.b0.a.ON_RESUME;
                                boolean zR2 = mVar2.r(sVar);
                                Object objQ5 = mVar2.q();
                                if (zR2 || objQ5 == c2565a) {
                                    objQ5 = new e23.a() { // from class: ri1.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i18 = i17;
                                            s sVar2 = sVar;
                                            switch (i18) {
                                                case 0:
                                                    w9.a aVarA = v1.a(sVar2);
                                                    x53.c cVar = s0.f129406a;
                                                    ge1.b.T(aVarA, x53.b.f189152a, null, new v(sVar2, null), 2);
                                                    break;
                                                case 1:
                                                    ge1.b.T(v1.a(sVar2), null, null, new u(sVar2, null), 3);
                                                    break;
                                                default:
                                                    w9.a aVarA2 = v1.a(sVar2);
                                                    x53.c cVar2 = s0.f129406a;
                                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new t(sVar2, null), 2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ5);
                                }
                                s9.e.a(aVar7, null, (e23.a) objQ5, mVar2, 6);
                                si1.k kVar2 = (si1.k) p1VarC.getF182175a();
                                r53.e eVar2 = sVar.f152897k;
                                boolean zR3 = mVar2.r(sVar);
                                Object objQ6 = mVar2.q();
                                if (zR3 || objQ6 == c2565a) {
                                    final int i18 = 1;
                                    objQ6 = new e23.a() { // from class: ri1.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i19 = i18;
                                            s sVar2 = sVar;
                                            switch (i19) {
                                                case 0:
                                                    w9.a aVarA = v1.a(sVar2);
                                                    x53.c cVar = s0.f129406a;
                                                    ge1.b.T(aVarA, x53.b.f189152a, null, new v(sVar2, null), 2);
                                                    break;
                                                case 1:
                                                    ge1.b.T(v1.a(sVar2), null, null, new u(sVar2, null), 3);
                                                    break;
                                                default:
                                                    w9.a aVarA2 = v1.a(sVar2);
                                                    x53.c cVar2 = s0.f129406a;
                                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new t(sVar2, null), 2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ6);
                                }
                                e23.a aVar8 = (e23.a) objQ6;
                                boolean zR4 = mVar2.r(sVar);
                                Object objQ7 = mVar2.q();
                                if (zR4 || objQ7 == c2565a) {
                                    final int i19 = 2;
                                    objQ7 = new e23.a() { // from class: ri1.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i110 = i19;
                                            s sVar2 = sVar;
                                            switch (i110) {
                                                case 0:
                                                    w9.a aVarA = v1.a(sVar2);
                                                    x53.c cVar = s0.f129406a;
                                                    ge1.b.T(aVarA, x53.b.f189152a, null, new v(sVar2, null), 2);
                                                    break;
                                                case 1:
                                                    ge1.b.T(v1.a(sVar2), null, null, new u(sVar2, null), 3);
                                                    break;
                                                default:
                                                    w9.a aVarA2 = v1.a(sVar2);
                                                    x53.c cVar2 = s0.f129406a;
                                                    ge1.b.T(aVarA2, x53.b.f189152a, null, new t(sVar2, null), 2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ7);
                                }
                                e23.a aVar9 = (e23.a) objQ7;
                                boolean zR5 = mVar2.r(sVar) | mVar2.B(p1VarC) | mVar2.r(qVarC);
                                m0 m0Var3 = m0Var2;
                                boolean zR6 = zR5 | mVar2.r(m0Var3);
                                Object objQ8 = mVar2.q();
                                if (zR6 || objQ8 == c2565a) {
                                    ok0.d dVar = new ok0.d((Object) sVar, qVarC, (Object) m0Var3, (Object) p1VarC, 14);
                                    mVar2.K(dVar);
                                    objQ8 = dVar;
                                }
                                si1.q.c(kVar2, eVar2, aVar8, aVar4, aVar9, (e23.a) objQ8, mVar2, 0);
                                return Unit.INSTANCE;
                            }
                        }));
                        nc.n.a(k0Var, t0Var.b(k.class), k0Var2, j0Var, null, null, null, null, new z3.e(-498444054, true, new g(pVar2, z14, m0Var2, aVar4)));
                        return Unit.INSTANCE;
                    }
                };
                m0Var = m0VarI;
                o0VarE.K(lVar);
                objQ2 = lVar;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    e23.l lVar2 = new e23.l() { // from class: ri1.f
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            k0 k0Var = (k0) obj;
                            k0Var.getClass();
                            p pVar2 = pVar;
                            final m0 m0Var2 = m0VarI;
                            boolean z17 = z15;
                            final e23.a aVar4 = aVar;
                            z3.e eVar = new z3.e(-1854982862, true, new g(pVar2, m0Var2, z17, aVar4));
                            p13.k0 k0Var2 = p13.k0.f134949a;
                            k0Var2.getClass();
                            j0 j0Var = j0.f134944a;
                            t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                            nc.n.a(k0Var, t0Var.b(j.class), k0Var2, j0Var, null, null, null, null, eVar);
                            final long j14 = j8;
                            nc.n.a(k0Var, t0Var.b(l.class), k0Var2, j0Var, null, null, null, null, new z3.e(1649956777, true, new e23.r() { // from class: ri1.h
                                /* JADX WARN: Code duplicated, block: B:6:0x0045  */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.r
                                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    lc.v vVar = (lc.v) obj3;
                                    p3.m mVar2 = (p3.m) obj4;
                                    ((Integer) obj5).getClass();
                                    ((r1.l) obj2).getClass();
                                    vVar.getClass();
                                    x1 x1Var2 = p3.n.f135158a;
                                    t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                    l lVar3 = (l) lc.w.a(vVar, t0Var2.b(l.class));
                                    long j15 = j14;
                                    boolean zL = mVar2.l(j15) | mVar2.B(lVar3);
                                    Object objQ3 = mVar2.q();
                                    p3.m.a aVar5 = p3.m.f135153a;
                                    if (zL) {
                                        objQ3 = new a6.g(j15, lVar3, 8);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar5.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new a6.g(j15, lVar3, 8);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    e23.a aVar6 = (e23.a) objQ3;
                                    mVar2.L(-1614864554);
                                    v9.a.f176280a.getClass();
                                    ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar2);
                                    if (viewModelStoreOwnerA2 == null) {
                                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        return null;
                                    }
                                    final int i17 = 0;
                                    u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var2.b(s.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar6);
                                    mVar2.R();
                                    final s sVar = (s) u1VarResolveViewModel2;
                                    p1 p1VarC = s9.c.c(sVar.f152895i, mVar2);
                                    si1.t tVar = new si1.t();
                                    Object objQ4 = mVar2.q();
                                    aVar5.getClass();
                                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                                    if (objQ4 == c2565a) {
                                        objQ4 = new r82.e(19);
                                        mVar2.K(objQ4);
                                    }
                                    c.q qVarC = c.w.c(tVar, (e23.l) objQ4, mVar2, 48);
                                    androidx.lifecycle.b0.a aVar7 = androidx.lifecycle.b0.a.ON_RESUME;
                                    boolean zR2 = mVar2.r(sVar);
                                    Object objQ5 = mVar2.q();
                                    if (zR2 || objQ5 == c2565a) {
                                        objQ5 = new e23.a() { // from class: ri1.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i110 = i17;
                                                s sVar2 = sVar;
                                                switch (i110) {
                                                    case 0:
                                                        w9.a aVarA = v1.a(sVar2);
                                                        x53.c cVar = s0.f129406a;
                                                        ge1.b.T(aVarA, x53.b.f189152a, null, new v(sVar2, null), 2);
                                                        break;
                                                    case 1:
                                                        ge1.b.T(v1.a(sVar2), null, null, new u(sVar2, null), 3);
                                                        break;
                                                    default:
                                                        w9.a aVarA2 = v1.a(sVar2);
                                                        x53.c cVar2 = s0.f129406a;
                                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new t(sVar2, null), 2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(objQ5);
                                    }
                                    s9.e.a(aVar7, null, (e23.a) objQ5, mVar2, 6);
                                    si1.k kVar2 = (si1.k) p1VarC.getF182175a();
                                    r53.e eVar2 = sVar.f152897k;
                                    boolean zR3 = mVar2.r(sVar);
                                    Object objQ6 = mVar2.q();
                                    if (zR3 || objQ6 == c2565a) {
                                        final int i18 = 1;
                                        objQ6 = new e23.a() { // from class: ri1.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i110 = i18;
                                                s sVar2 = sVar;
                                                switch (i110) {
                                                    case 0:
                                                        w9.a aVarA = v1.a(sVar2);
                                                        x53.c cVar = s0.f129406a;
                                                        ge1.b.T(aVarA, x53.b.f189152a, null, new v(sVar2, null), 2);
                                                        break;
                                                    case 1:
                                                        ge1.b.T(v1.a(sVar2), null, null, new u(sVar2, null), 3);
                                                        break;
                                                    default:
                                                        w9.a aVarA2 = v1.a(sVar2);
                                                        x53.c cVar2 = s0.f129406a;
                                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new t(sVar2, null), 2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(objQ6);
                                    }
                                    e23.a aVar8 = (e23.a) objQ6;
                                    boolean zR4 = mVar2.r(sVar);
                                    Object objQ7 = mVar2.q();
                                    if (zR4 || objQ7 == c2565a) {
                                        final int i19 = 2;
                                        objQ7 = new e23.a() { // from class: ri1.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i110 = i19;
                                                s sVar2 = sVar;
                                                switch (i110) {
                                                    case 0:
                                                        w9.a aVarA = v1.a(sVar2);
                                                        x53.c cVar = s0.f129406a;
                                                        ge1.b.T(aVarA, x53.b.f189152a, null, new v(sVar2, null), 2);
                                                        break;
                                                    case 1:
                                                        ge1.b.T(v1.a(sVar2), null, null, new u(sVar2, null), 3);
                                                        break;
                                                    default:
                                                        w9.a aVarA2 = v1.a(sVar2);
                                                        x53.c cVar2 = s0.f129406a;
                                                        ge1.b.T(aVarA2, x53.b.f189152a, null, new t(sVar2, null), 2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(objQ7);
                                    }
                                    e23.a aVar9 = (e23.a) objQ7;
                                    boolean zR5 = mVar2.r(sVar) | mVar2.B(p1VarC) | mVar2.r(qVarC);
                                    m0 m0Var3 = m0Var2;
                                    boolean zR6 = zR5 | mVar2.r(m0Var3);
                                    Object objQ8 = mVar2.q();
                                    if (zR6 || objQ8 == c2565a) {
                                        ok0.d dVar = new ok0.d((Object) sVar, qVarC, (Object) m0Var3, (Object) p1VarC, 14);
                                        mVar2.K(dVar);
                                        objQ8 = dVar;
                                    }
                                    si1.q.c(kVar2, eVar2, aVar8, aVar4, aVar9, (e23.a) objQ8, mVar2, 0);
                                    return Unit.INSTANCE;
                                }
                            }));
                            nc.n.a(k0Var, t0Var.b(k.class), k0Var2, j0Var, null, null, null, null, new z3.e(-498444054, true, new g(pVar2, z14, m0Var2, aVar4)));
                            return Unit.INSTANCE;
                        }
                    };
                    m0Var = m0VarI;
                    o0VarE.K(lVar2);
                    objQ2 = lVar2;
                } else {
                    m0Var = m0VarI;
                }
            }
            nc.y.a(m0Var, kVar, null, null, null, null, null, null, null, (e23.l) objQ2, o0VarE, 0, 2044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i8(j8, z14, z15, aVar, i14);
        }
    }

    public static final void b(ti1.b bVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1134691715);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            si1.h.b(bVar, aVar, o0VarE, i15 & 126);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(bVar, aVar, i14, 0);
        }
    }
}
