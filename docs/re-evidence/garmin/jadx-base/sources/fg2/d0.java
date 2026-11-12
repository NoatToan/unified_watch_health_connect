package fg2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.e2;
import r53.p2;
import r53.q2;
import r53.s1;
import r53.u1;
import yg2.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfg2/d0;", "", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f71425q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f71426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f71427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f71428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f71429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f71430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f71431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f71432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f71433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f71434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f71435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s1 f71436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u1 f71437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s1 f71438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f71439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f71440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public lt2.h f71441p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.repositories.WorkoutStateHolder$initializeWorkout$2", f = "WorkoutStateHolder.kt", l = {221}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f71442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ of2.b0 f71443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f71444c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(of2.b0 b0Var, d0 d0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f71443b = b0Var;
            this.f71444c = d0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f71443b, this.f71444c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f71442a;
            if (i14 == 0) {
                o13.r.b(obj);
                tf2.c cVar = this.f71443b.f131754k;
                this.f71442a = 1;
                if (d0.c(this.f71444c, cVar, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lyg2/h0;", "step", "", "isIteratingFreeActivity", "Lrf2/l;", "workoutSessionType", "Lrf2/b;", "currentLapMetric", "<anonymous>", "(Lyg2/h0;ZLrf2/l;Lrf2/b;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.repositories.WorkoutStateHolder$isNextStepRestStep$1", f = "WorkoutStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.s<yg2.h0, Boolean, rf2.l, rf2.b, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ yg2.h0 f71445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f71446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ rf2.l f71447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ rf2.b f71448d;

        public c(t13.d<? super c> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(yg2.h0 h0Var, Boolean bool, rf2.l lVar, rf2.b bVar, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            c cVar = new c(dVar);
            cVar.f71445a = h0Var;
            cVar.f71446b = zBooleanValue;
            cVar.f71447c = lVar;
            cVar.f71448d = bVar;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Float f14;
            yg2.h0 h0Var = this.f71445a;
            boolean z14 = this.f71446b;
            rf2.l lVar = this.f71447c;
            rf2.b bVar = this.f71448d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Boolean.valueOf(h0.q(h0Var, z14, lVar, (bVar == null || (f14 = bVar.f152460f) == null) ? null : new Float(f14.floatValue() + 1)));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lyg2/h0;", "step", "", "isIteratingFreeActivity", "Lrf2/l;", "workoutSessionType", "Lrf2/b;", "lapMetric", "<anonymous>", "(Lyg2/h0;ZLrf2/l;Lrf2/b;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.repositories.WorkoutStateHolder$isRestStep$1", f = "WorkoutStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.s<yg2.h0, Boolean, rf2.l, rf2.b, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ yg2.h0 f71449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f71450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ rf2.l f71451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ rf2.b f71452d;

        public d(t13.d<? super d> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(yg2.h0 h0Var, Boolean bool, rf2.l lVar, rf2.b bVar, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            d dVar2 = new d(dVar);
            dVar2.f71449a = h0Var;
            dVar2.f71450b = zBooleanValue;
            dVar2.f71451c = lVar;
            dVar2.f71452d = bVar;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            yg2.h0 h0Var = this.f71449a;
            boolean z14 = this.f71450b;
            rf2.l lVar = this.f71451c;
            rf2.b bVar = this.f71452d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Boolean.valueOf(h0.q(h0Var, z14, lVar, bVar != null ? bVar.f152460f : null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyg2/h0;", "step", "Lyg2/o;", "workout", "<anonymous>", "(Lyg2/h0;Lyg2/o;)Lyg2/h0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.repositories.WorkoutStateHolder$nextWorkoutStep$1", f = "WorkoutStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<yg2.h0, yg2.o, t13.d<? super yg2.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ yg2.h0 f71453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ yg2.o f71454b;

        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(yg2.h0 h0Var, yg2.o oVar, t13.d<? super yg2.h0> dVar) {
            e eVar = new e(dVar);
            eVar.f71453a = h0Var;
            eVar.f71454b = oVar;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            yg2.h0 h0Var = this.f71453a;
            yg2.o oVar = this.f71454b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (h0Var != null) {
                return h0.i(h0Var, oVar);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyg2/h0;", "step", "Lyg2/o;", "workout", "Lyg2/j0;", "<anonymous>", "(Lyg2/h0;Lyg2/o;)Lyg2/j0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.repositories.WorkoutStateHolder$nextWorkoutStepText$1", f = "WorkoutStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.q<yg2.h0, yg2.o, t13.d<? super j0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ yg2.h0 f71455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ yg2.o f71456b;

        public f(t13.d<? super f> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(yg2.h0 h0Var, yg2.o oVar, t13.d<? super j0> dVar) {
            f fVar = new f(dVar);
            fVar.f71455a = h0Var;
            fVar.f71456b = oVar;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            yg2.h0 h0Var = this.f71455a;
            yg2.o oVar = this.f71456b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (h0Var != null) {
                return h0.j(h0Var, oVar);
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.livesessionview.repositories.WorkoutStateHolder", f = "WorkoutStateHolder.kt", l = {242, 306}, m = "parseWorkoutData", v = 2)
    public static final class g extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public of2.b0 f71457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public lt2.f f71458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public vf2.p f71459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public vf2.p f71460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Collection f71461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Iterator f71462f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public vf2.v f71463g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Collection f71464h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public lt2.b f71465i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public lt2.b f71466j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public mt2.l f71467k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public lt2.a f71468l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f71469m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f71470n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f71471o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f71472p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71474r;

        public g(t13.d<? super g> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f71472p = obj;
            this.f71474r |= Integer.MIN_VALUE;
            int i14 = d0.f71425q;
            return d0.this.h(null, this);
        }
    }

    static {
        new a(null);
    }

    public d0() {
        p2 p2VarA = q2.a(Boolean.FALSE);
        this.f71426a = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f71427b = p2VarA2;
        p2 p2VarA3 = q2.a(new yg2.o());
        this.f71428c = p2VarA3;
        this.f71429d = r53.s.d(p2VarA3);
        p2 p2VarA4 = q2.a(null);
        this.f71430e = p2VarA4;
        this.f71431f = r53.s.d(p2VarA4);
        p2 p2VarA5 = q2.a(null);
        this.f71432g = p2VarA5;
        p13.j0 j0Var = p13.j0.f134944a;
        this.f71433h = j0Var;
        this.f71436k = r53.s.m(p2VarA4, p2VarA, p2VarA2, p2VarA5, new d(null));
        u1 u1Var = new u1(p2VarA4, p2VarA3, new e(null));
        this.f71437l = new u1(p2VarA4, p2VarA3, new f(null));
        this.f71438m = r53.s.m(u1Var, p2VarA, p2VarA2, p2VarA5, new c(null));
        p2 p2VarA6 = q2.a(j0Var);
        this.f71439n = p2VarA6;
        this.f71440o = r53.s.d(p2VarA6);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Collection] */
    public static final void a(d0 d0Var, int i14) {
        Object next;
        yg2.a aVarF;
        p2 p2Var = d0Var.f71428c;
        yg2.o oVar = (yg2.o) p2Var.getValue();
        ArrayList arrayListD1 = p13.h0.d1(oVar.d());
        Iterator it = arrayListD1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((yg2.h0) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != i14);
        yg2.h0 h0Var = (yg2.h0) next;
        if (h0Var == null || (aVarF = h0.f(h0Var, oVar)) == null || h0.r(aVarF, oVar)) {
            return;
        }
        Iterator it3 = arrayListD1.iterator();
        int i15 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i15 = -1;
                break;
            } else if (((yg2.h0) it3.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == i14) {
                break;
            } else {
                i15++;
            }
        }
        yg2.h0 h0Var2 = (yg2.h0) arrayListD1.get(i15);
        arrayListD1.set(i15, yg2.h0.a(h0Var2, yg2.n.COMPLETED));
        p2Var.k(null, yg2.o.a(oVar, i53.a.j(arrayListD1), null, null, 14));
        yg2.a aVarF2 = h0.f((yg2.h0) arrayListD1.get(i15), (yg2.o) p2Var.getValue());
        if (aVarF2 != null && h0.o(aVarF2, (yg2.o) p2Var.getValue())) {
            d0Var.f71433h = p13.h0.D0(d0Var.f71433h, aVarF2);
        }
        p2 p2Var2 = d0Var.f71439n;
        ArrayList arrayListD2 = p13.h0.d1((Collection) p2Var2.getValue());
        arrayListD2.add(new vf2.e(h0Var2.getCategory(), null, false, h0Var2.getExerciseName(), null, 22, null));
        p2Var2.setValue(p13.h0.b1(p13.h0.f1(arrayListD2)));
    }

    public static final void b(d0 d0Var, int i14) {
        yg2.a next;
        Object next2;
        p2 p2Var = d0Var.f71428c;
        yg2.o oVar = (yg2.o) p2Var.getValue();
        Iterator<yg2.a> it = oVar.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getClusterIndex() != i14);
        yg2.a aVar = next;
        if (aVar != null) {
            ArrayList arrayListD1 = p13.h0.d1(oVar.d());
            int startStepIndex = aVar.getStartStepIndex() + 1;
            int endStepIndex = aVar.getEndStepIndex();
            if (startStepIndex <= endStepIndex) {
                while (true) {
                    Iterator it3 = arrayListD1.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (((yg2.h0) next2).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != startStepIndex);
                    yg2.h0 h0Var = (yg2.h0) next2;
                    if (h0Var != null) {
                        arrayListD1.set(arrayListD1.indexOf(h0Var), yg2.h0.a(h0Var, yg2.n.IDLE));
                    }
                    if (startStepIndex == endStepIndex) {
                        break;
                    } else {
                        startStepIndex++;
                    }
                }
            }
            p2Var.k(null, yg2.o.a(oVar, i53.a.j(arrayListD1), null, null, 14));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a c(d0 d0Var, tf2.c cVar, v13.c cVar2) {
        f0 f0Var;
        d0Var.getClass();
        if (cVar2 instanceof f0) {
            f0Var = (f0) cVar2;
            int i14 = f0Var.f71505c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f71505c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(d0Var, cVar2);
            }
        } else {
            f0Var = new f0(d0Var, cVar2);
        }
        Object obj = f0Var.f71503a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f71505c;
        if (i15 == 0) {
            o13.r.b(obj);
            e2 e2Var = cVar.f164470b.f164468a;
            g0 g0Var = new g0(d0Var);
            f0Var.f71505c = 1;
            e2Var.getClass();
            if (e2.m(e2Var, g0Var, f0Var) == aVar) {
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

    public static final void d(d0 d0Var, int i14) {
        o13.p pVar;
        p2 p2Var = d0Var.f71428c;
        yg2.o oVar = (yg2.o) p2Var.getValue();
        ArrayList arrayListD1 = p13.h0.d1(oVar.d());
        i53.c<yg2.h0> cVarD = oVar.d();
        p2 p2Var2 = d0Var.f71430e;
        yg2.h0 h0Var = (yg2.h0) p2Var2.getValue();
        yg2.h0 h0Var2 = null;
        yg2.h0 h0VarA = yg2.g0.a(cVarD, h0Var != null ? Integer.valueOf(h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) : null);
        yg2.h0 h0VarA2 = yg2.g0.a(oVar.d(), Integer.valueOf(i14));
        if (h0VarA2 != null) {
            yg2.a aVarF = h0.f(h0VarA2, oVar);
            if (aVarF == null || !h0.r(aVarF, oVar)) {
                pVar = new o13.p(null, null);
            } else {
                ArrayList arrayListD2 = p13.h0.d1(oVar.c());
                ArrayList arrayListD3 = p13.h0.d1(oVar.b());
                arrayListD3.addAll(arrayListD2);
                pVar = new o13.p(arrayListD3, p13.j0.f134944a);
            }
            List list = (List) pVar.f128594a;
            List list2 = (List) pVar.f128595b;
            if (h0VarA != null && !h0VarA.equals(h0VarA2)) {
                arrayListD1.set(oVar.d().indexOf(h0VarA), yg2.h0.a(h0VarA, yg2.n.IDLE));
            }
            arrayListD1.set(oVar.d().indexOf(h0VarA2), yg2.h0.a(h0VarA2, yg2.n.ACTIVE));
            yg2.o oVarA = (list == null || list2 == null) ? yg2.o.a(oVar, i53.a.j(arrayListD1), null, null, 14) : yg2.o.a(oVar, i53.a.j(arrayListD1), i53.a.j(list), i53.a.j(list2), 8);
            p2Var.k(null, oVarA);
            for (yg2.h0 h0Var3 : oVarA.d()) {
                if (h0Var3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == i14) {
                    h0Var2 = h0Var3;
                    break;
                }
            }
            p2Var2.setValue(h0Var2);
        }
    }

    public final void e(int i14, yg2.n nVar) {
        Object next;
        p2 p2Var = this.f71428c;
        ArrayList arrayListD1 = p13.h0.d1(((yg2.o) p2Var.getValue()).d());
        Iterator it = arrayListD1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((yg2.h0) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != i14);
        yg2.h0 h0Var = (yg2.h0) next;
        if (h0Var != null) {
            arrayListD1.set(arrayListD1.indexOf(h0Var), yg2.h0.a(h0Var, nVar));
            p2Var.k(null, yg2.o.a((yg2.o) p2Var.getValue(), i53.a.j(arrayListD1), null, null, 14));
        }
    }

    public final void f(int i14) {
        yg2.a next;
        yg2.a next2;
        p2 p2Var = this.f71428c;
        Object value = p2Var.getValue();
        yg2.o oVar = (yg2.o) value;
        Iterator<yg2.a> it = oVar.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getClusterIndex() != i14);
        yg2.a aVar = next;
        if (aVar == null) {
            Iterator<yg2.a> it3 = oVar.c().iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (next2.getClusterIndex() != i14);
            aVar = next2;
        }
        if (aVar != null) {
            if (h0.m(aVar, oVar)) {
                value = p2Var.getValue();
            }
            yg2.o oVar2 = (yg2.o) value;
            i53.c<yg2.a> cVarB = oVar2.b();
            ArrayList arrayList = new ArrayList();
            for (yg2.a aVar2 : cVarB) {
                if (!p005kotlin.jvm.internal.s.g(aVar2, aVar)) {
                    arrayList.add(aVar2);
                }
            }
            i53.c<yg2.a> cVarC = oVar2.c();
            ArrayList arrayList2 = new ArrayList();
            for (yg2.a aVar3 : cVarC) {
                if (!p005kotlin.jvm.internal.s.g(aVar3, aVar)) {
                    arrayList2.add(aVar3);
                }
            }
            p2Var.k(null, yg2.o.a(oVar2, null, i53.a.j(arrayList), i53.a.j(arrayList2), 9));
        }
    }

    public final Object g(of2.b0 b0Var, boolean z14, boolean z15, boolean z16, t13.d<? super Unit> dVar) {
        this.f71427b.setValue(b0Var.f131752i);
        zf2.d dVar2 = b0Var.f131747d;
        this.f71426a.k(null, Boolean.valueOf((dVar2 == zf2.d.N0 || dVar2 == zf2.d.Q0) && b0Var.f131753j == null));
        List<Integer> list = b0Var.f131755l.f204650b;
        zf2.g gVar = b0Var.f131756m;
        this.f71441p = new lt2.h(z14 ? mt2.f.METRIC : mt2.f.STATUTE_US, z15, gVar != null ? new lt2.d(gVar.f204647a, list) : null, gVar != null ? gVar.f204648b : p13.j0.f134944a);
        if (!z16) {
            x53.c cVar = s0.f129406a;
            ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new b(b0Var, this, null), 3);
        }
        Object objH = h(b0Var, dVar);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x027f  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:118:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:128:0x0329  */
    /* JADX WARN: Code duplicated, block: B:131:0x0360  */
    /* JADX WARN: Code duplicated, block: B:134:0x0377  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:159:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:166:0x0427  */
    /* JADX WARN: Code duplicated, block: B:169:0x0448  */
    /* JADX WARN: Code duplicated, block: B:175:0x0470 A[LOOP:3: B:173:0x046a->B:175:0x0470, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:185:0x04ce A[LOOP:5: B:183:0x04c8->B:185:0x04ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:191:0x0501  */
    /* JADX WARN: Code duplicated, block: B:197:0x0513  */
    /* JADX WARN: Code duplicated, block: B:200:0x051d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0535  */
    /* JADX WARN: Code duplicated, block: B:211:0x054b  */
    /* JADX WARN: Code duplicated, block: B:212:0x0555  */
    /* JADX WARN: Code duplicated, block: B:216:0x056a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0592 A[LOOP:9: B:220:0x058c->B:222:0x0592, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x04a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x050d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0579 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0564 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0163  */
    /* JADX WARN: Code duplicated, block: B:54:0x017d  */
    /* JADX WARN: Code duplicated, block: B:59:0x019e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x0213  */
    /* JADX WARN: Code duplicated, block: B:87:0x0224  */
    /* JADX WARN: Code duplicated, block: B:88:0x022b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0232  */
    /* JADX WARN: Code duplicated, block: B:93:0x023a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0241  */
    /* JADX WARN: Code duplicated, block: B:97:0x025c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0360 -> B:13:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(of2.b0 r41, t13.d<? super p005kotlin.Unit> r42) {
        /*
            Method dump skipped, instruction units count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fg2.d0.h(of2.b0, t13.d):java.lang.Object");
    }

    public final void i(int i14) {
        yg2.a next;
        p2 p2Var = this.f71428c;
        Object value = p2Var.getValue();
        yg2.o oVar = (yg2.o) value;
        Iterator<yg2.a> it = oVar.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getClusterIndex() != i14);
        yg2.a aVar = next;
        if (aVar != null) {
            Integer numD = h0.d(aVar, oVar);
            if (numD != null) {
                e(numD.intValue(), yg2.n.SKIPPED);
                value = p2Var.getValue();
            }
            yg2.o oVar2 = (yg2.o) value;
            i53.c<yg2.a> cVarB = oVar2.b();
            ArrayList arrayList = new ArrayList();
            for (yg2.a aVar2 : cVarB) {
                if (!p005kotlin.jvm.internal.s.g(aVar2, aVar)) {
                    arrayList.add(aVar2);
                }
            }
            ArrayList arrayListD1 = p13.h0.d1(oVar2.c());
            arrayListD1.add(aVar);
            p2Var.k(null, yg2.o.a(oVar2, null, i53.a.j(arrayList), i53.a.j(arrayListD1), 9));
        }
    }

    public final void j(ArrayList arrayList, i53.c cVar, i53.c cVar2, Integer num, List list) {
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j23.l lVar = (j23.l) it.next();
                    int i15 = lVar.f96796a;
                    int i16 = lVar.f96797b;
                    int i17 = ((yg2.h0) arrayList.get(i14)).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                    if (i15 <= i17 && i17 <= i16) {
                        arrayList.set(i14, yg2.h0.a((yg2.h0) arrayList.get(i14), yg2.n.COMPLETED));
                        break;
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i18 = -1;
                break;
            }
            int i19 = ((yg2.h0) it3.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
            if (num != null && i19 == num.intValue()) {
                break;
            } else {
                i18++;
            }
        }
        int i24 = i18 != -1 ? i18 : 0;
        arrayList.set(i24, yg2.h0.a((yg2.h0) arrayList.get(i24), yg2.n.ACTIVE));
        this.f71428c.k(null, new yg2.o(i53.a.j(arrayList), cVar, cVar2, null, 8, null));
        this.f71430e.setValue(arrayList.get(i24));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfg2/d0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
