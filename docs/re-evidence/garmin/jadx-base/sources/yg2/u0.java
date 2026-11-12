package yg2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.e2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyg2/u0;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f197210a = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new b(this, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f197211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f197212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f197213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f197214e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.workout.WorkoutViewModel$1", f = "WorkoutViewModel.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f197215a;

        /* JADX INFO: renamed from: yg2.u0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lof2/b0;", "sessionData", "", "<anonymous>", "(Lof2/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.livesessionview.ui.workout.WorkoutViewModel$1$1", f = "WorkoutViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
        public static final class C3690a extends v13.i implements e23.p<of2.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f197217a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f197218b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ u0 f197219c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3690a(u0 u0Var, t13.d<? super C3690a> dVar) {
                super(2, dVar);
                this.f197219c = u0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3690a c3690a = new C3690a(this.f197219c, dVar);
                c3690a.f197218b = obj;
                return c3690a;
            }

            @Override // e23.p
            public final Object invoke(of2.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3690a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                zf2.d dVarB;
                tf2.c cVar;
                String str;
                of2.b0 b0Var = (of2.b0) this.f197218b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f197217a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    u0 u0Var = this.f197219c;
                    p2 p2Var = u0Var.f197211b;
                    if (b0Var == null || (str = b0Var.f131748e) == null) {
                        dVarB = null;
                    } else {
                        zf2.d.f204601l.getClass();
                        dVarB = zf2.d.a.b(str);
                    }
                    p2Var.setValue(dVarB);
                    if (b0Var != null && (cVar = b0Var.f131754k) != null) {
                        this.f197218b = null;
                        this.f197217a = 1;
                        if (u0.x4(u0Var, cVar, this) == aVar) {
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

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u0.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f197215a;
            if (i14 == 0) {
                o13.r.b(obj);
                u0 u0Var = u0.this;
                p2 p2Var = u0Var.y4().f71482f;
                C3690a c3690a = new C3690a(u0Var, null);
                this.f197215a = 1;
                if (r53.s.k(p2Var, c3690a, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<fg2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f197220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f197221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f197222c;

        public b(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f197220a = koinComponent;
            this.f197221b = qualifier;
            this.f197222c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [fg2.f, java.lang.Object] */
        @Override // e23.a
        public final fg2.f invoke() {
            KoinComponent koinComponent = this.f197220a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(fg2.f.class), this.f197221b, this.f197222c);
        }
    }

    public u0() {
        p2 p2VarA = q2.a(null);
        this.f197211b = p2VarA;
        this.f197212c = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(null);
        this.f197213d = p2VarA2;
        this.f197214e = r53.s.d(p2VarA2);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a x4(u0 u0Var, tf2.c cVar, v13.c cVar2) {
        v0 v0Var;
        u0Var.getClass();
        if (cVar2 instanceof v0) {
            v0Var = (v0) cVar2;
            int i14 = v0Var.f197226c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v0Var.f197226c = i14 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(u0Var, cVar2);
            }
        } else {
            v0Var = new v0(u0Var, cVar2);
        }
        Object obj = v0Var.f197224a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v0Var.f197226c;
        if (i15 == 0) {
            o13.r.b(obj);
            e2 e2Var = cVar.f164470b.f164468a;
            w0 w0Var = new w0(u0Var);
            v0Var.f197226c = 1;
            e2Var.getClass();
            if (e2.m(e2Var, w0Var, v0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    public final void A4(int i14) {
        yg2.a aVarF;
        mf2.h hVarE = y4().e();
        if (hVarE != null) {
            hVarE.d(mf2.h.f.ADD_SKIPPED_WORKOUT_STEP);
        }
        o oVar = (o) z4().f150540a.getValue();
        h0 h0VarA = g0.a(oVar.d(), Integer.valueOf(i14));
        if (h0VarA != null && (aVarF = fg2.h0.f(h0VarA, oVar)) != null) {
            fg2.f fVarY4 = y4();
            fVarY4.getClass();
            rf2.d.a aVar = new rf2.d.a(aVarF.getClusterIndex());
            int i15 = fg2.f.L;
            of2.c0 c0Var = fVarY4.f71478b;
            int i16 = of2.c0.f131771p;
            c0Var.f131773b.f().m(aVar);
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        y4().I.invoke(Integer.valueOf(i14));
    }

    public final void B4(int i14) {
        yg2.a aVarF;
        mf2.h hVarE = y4().e();
        if (hVarE != null) {
            hVarE.d(mf2.h.f.DELETE_WORKOUT_STEP);
        }
        o oVar = (o) z4().f150540a.getValue();
        h0 h0VarA = g0.a(oVar.d(), Integer.valueOf(i14));
        if (h0VarA != null && (aVarF = fg2.h0.f(h0VarA, oVar)) != null) {
            fg2.f fVarY4 = y4();
            fVarY4.getClass();
            rf2.d.b bVar = new rf2.d.b(aVarF.getClusterIndex());
            int i15 = fg2.f.L;
            of2.c0 c0Var = fVarY4.f71478b;
            int i16 = of2.c0.f131771p;
            c0Var.f131773b.f().m(bVar);
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        y4().K.invoke(Integer.valueOf(i14));
    }

    public final void C4(int i14) {
        yg2.a aVarF;
        mf2.h hVarE = y4().e();
        if (hVarE != null) {
            hVarE.d(mf2.h.f.SKIP_WORKOUT_STEP);
        }
        o oVar = (o) z4().f150540a.getValue();
        h0 h0VarA = g0.a(oVar.d(), Integer.valueOf(i14));
        if (h0VarA != null && (aVarF = fg2.h0.f(h0VarA, oVar)) != null) {
            fg2.f fVarY4 = y4();
            fVarY4.getClass();
            rf2.d.c cVar = new rf2.d.c(aVarF.getClusterIndex());
            int i15 = fg2.f.L;
            of2.c0 c0Var = fVarY4.f71478b;
            int i16 = of2.c0.f131771p;
            c0Var.f131773b.f().m(cVar);
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        y4().H.invoke(Integer.valueOf(i14));
    }

    public final void D4(int i14) {
        yg2.a aVarF;
        mf2.h hVarE = y4().e();
        if (hVarE != null) {
            hVarE.d(mf2.h.f.START_WORKOUT_STEP_NOW);
        }
        o oVar = (o) z4().f150540a.getValue();
        h0 h0VarA = g0.a(oVar.d(), Integer.valueOf(i14));
        if (h0VarA == null || (aVarF = fg2.h0.f(h0VarA, oVar)) == null) {
            return;
        }
        fg2.f fVarY4 = y4();
        fVarY4.getClass();
        rf2.d.C2867d c2867d = new rf2.d.C2867d(aVarF.getClusterIndex());
        int i15 = fg2.f.L;
        of2.c0 c0Var = fVarY4.f71478b;
        int i16 = of2.c0.f131771p;
        c0Var.f131773b.f().m(c2867d);
        Unit unit = Unit.INSTANCE;
        Unit unit2 = Unit.INSTANCE;
        y4().F.invoke();
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final fg2.f y4() {
        return (fg2.f) this.f197210a.getValue();
    }

    public final b2 z4() {
        return y4().f71478b.f131781j.f71429d;
    }
}
