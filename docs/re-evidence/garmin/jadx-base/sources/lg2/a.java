package lg2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import o53.b0;
import of2.c0;
import of2.y0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r53.a2;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.k2;
import r53.l1;
import r53.m2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llg2/a;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f112254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f112256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f112257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f112258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f112259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f112260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f112261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f112262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f112263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f112264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f112265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e2 f112266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f112267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f112268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f112269p;

    /* JADX INFO: renamed from: lg2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$1", f = "ButtonsViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class C2156a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112270a;

        /* JADX INFO: renamed from: lg2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lof2/b0;", "sessionData", "", "isRestStep", "<anonymous>", "(Lof2/b0;Z)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$1$1", f = "ButtonsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C2157a extends v13.i implements e23.q<of2.b0, Boolean, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ of2.b0 f112272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f112273b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f112274c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2157a(a aVar, t13.d<? super C2157a> dVar) {
                super(3, dVar);
                this.f112274c = aVar;
            }

            @Override // e23.q
            public final Object invoke(of2.b0 b0Var, Boolean bool, t13.d<? super Boolean> dVar) {
                boolean zBooleanValue = bool.booleanValue();
                C2157a c2157a = new C2157a(this.f112274c, dVar);
                c2157a.f112272a = b0Var;
                c2157a.f112273b = zBooleanValue;
                return c2157a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                of2.b0 b0Var = this.f112272a;
                boolean z14 = this.f112273b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                if (b0Var != null) {
                    this.f112274c.f112256c = b0Var.f131753j != null;
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            }
        }

        /* JADX INFO: renamed from: lg2.a$a$b */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f112275a;

            public b(a aVar) {
                this.f112275a = aVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f112275a.f112257d.k(null, bool);
                return Unit.INSTANCE;
            }
        }

        public C2156a(t13.d<? super C2156a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new C2156a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2156a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112270a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = a.this;
                r53.u1 u1Var = new r53.u1(aVar2.B4().f71482f, aVar2.B4().f71478b.f131781j.f71438m, new C2157a(aVar2, null));
                b bVar = new b(aVar2);
                this.f112270a = 1;
                if (u1Var.collect(bVar, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$onResumeClick$1", f = "ButtonsViewModel.kt", l = {186, 193}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f112276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f112277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f112278c;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        
            if (r1.emit(r3, r6) == r0) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objN;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112278c;
            a aVar2 = a.this;
            if (i14 == 0) {
                o13.r.b(obj);
                a.y4(aVar2, true);
                fg2.f fVarB4 = aVar2.B4();
                this.f112278c = 1;
                objN = fVarB4.n(this);
                if (objN != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objN = ((o13.q) obj).f128597a;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = this.f112277b;
                o13.r.b(obj);
            }
            a.y4(aVar2, false);
            return Unit.INSTANCE;
            int i15 = o13.q.f128596b;
            if (!(objN instanceof o13.q.b)) {
                aVar2.B4().q(false);
                aVar2.B4().s(false);
                a.y4(aVar2, false);
            }
            if (o13.q.b(objN) != null) {
                e2 e2Var = aVar2.f112266m;
                Boolean bool = Boolean.TRUE;
                this.f112276a = objN;
                this.f112277b = aVar2;
                this.f112278c = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lof2/b0;", "sessionData", "", "hasActiveSession", "<anonymous>", "(Lof2/b0;Z)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$primaryStartAvailable$1", f = "ButtonsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.q<of2.b0, Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ of2.b0 f112280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f112281b;

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(of2.b0 b0Var, Boolean bool, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            c cVar = a.this.new c(dVar);
            cVar.f112280a = b0Var;
            cVar.f112281b = zBooleanValue;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            of2.b0 b0Var = this.f112280a;
            boolean z15 = this.f112281b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            jg2.a aVar2 = b0Var.f131746c;
            a.this.getClass();
            if (aVar2 != null) {
                z14 = (aVar2 instanceof jg2.a.C1897a) && !z15;
            }
            return Boolean.valueOf(z14);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lof2/b0;", "sessionData", "", "hasActiveSession", "<anonymous>", "(Lof2/b0;Z)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$secondaryStopAvailable$1", f = "ButtonsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<of2.b0, Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ of2.b0 f112283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f112284b;

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(of2.b0 b0Var, Boolean bool, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            d dVar2 = a.this.new d(dVar);
            dVar2.f112283a = b0Var;
            dVar2.f112284b = zBooleanValue;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0028  */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            of2.b0 b0Var = this.f112283a;
            boolean z15 = this.f112284b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            jg2.a aVar2 = b0Var.f131746c;
            ((bh2.c) a.this.f112255b.getValue()).getClass();
            if (bh2.c.a(aVar2)) {
                z14 = false;
            } else {
                aVar2.getClass();
                if (!(aVar2 instanceof jg2.a.C1897a) || z15) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            return Boolean.valueOf(z14);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lof2/b0;", "sessionData", "", "hasActiveSession", "<anonymous>", "(Lof2/b0;Z)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$showFollowWorkoutButton$1", f = "ButtonsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<of2.b0, Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ of2.b0 f112286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f112287b;

        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(of2.b0 b0Var, Boolean bool, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            e eVar = a.this.new e(dVar);
            eVar.f112286a = b0Var;
            eVar.f112287b = zBooleanValue;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            of2.b0 b0Var = this.f112286a;
            boolean z14 = this.f112287b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z15 = b0Var.f131760q;
            a.this.getClass();
            return Boolean.valueOf(z15 && !z14);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<fg2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f112289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f112290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f112291c;

        public f(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f112289a = koinComponent;
            this.f112290b = qualifier;
            this.f112291c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [fg2.f, java.lang.Object] */
        @Override // e23.a
        public final fg2.f invoke() {
            KoinComponent koinComponent = this.f112289a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(fg2.f.class), this.f112290b, this.f112291c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<bh2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f112292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f112293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f112294c;

        public g(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f112292a = koinComponent;
            this.f112293b = qualifier;
            this.f112294c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [bh2.c, java.lang.Object] */
        @Override // e23.a
        public final bh2.c invoke() {
            KoinComponent koinComponent = this.f112292a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(bh2.c.class), this.f112293b, this.f112294c);
        }
    }

    public a() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this.f112254a = o13.m.a(koinPlatformTools.defaultLazyMode(), new f(this, null, null));
        this.f112255b = o13.m.a(koinPlatformTools.defaultLazyMode(), new g(this, null, null));
        Boolean bool = Boolean.FALSE;
        p2 p2VarA = q2.a(bool);
        this.f112257d = p2VarA;
        this.f112258e = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(new r(false, false, 3, null));
        this.f112259f = p2VarA2;
        this.f112260g = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(new s(false, false, false, 7, null));
        this.f112261h = p2VarA3;
        this.f112262i = r53.s.d(p2VarA3);
        r53.u1 u1Var = new r53.u1(new l1(B4().f71482f), B4().f71478b.f131784m, new c(null));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        this.f112263j = r53.s.K(u1Var, aVarA, m2Var, bool);
        this.f112264k = r53.s.K(new r53.u1(new l1(B4().f71482f), B4().f71478b.f131784m, new d(null)), v1.a(this), m2Var, bool);
        this.f112265l = r53.s.K(new r53.u1(new l1(B4().f71482f), B4().f71478b.f131784m, new e(null)), v1.a(this), m2Var, bool);
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f112266m = e2VarB;
        this.f112267n = r53.s.c(e2VarB);
        this.f112268o = true;
        this.f112269p = true;
        ge1.b.T(v1.a(this), null, null, new C2156a(null), 3);
    }

    public static final void A4(a aVar, boolean z14) {
        Object value;
        boolean z15;
        if (!((Boolean) aVar.f112264k.f150540a.getValue()).booleanValue()) {
            aVar.E4(z14);
            return;
        }
        p2 p2Var = aVar.f112259f;
        do {
            value = p2Var.getValue();
            r rVar = (r) value;
            z15 = rVar.f112355a;
            rVar.getClass();
        } while (!p2Var.b(value, new r(z15, z14)));
    }

    public static final void x4(a aVar, boolean z14) {
        Object value;
        p2 p2Var = aVar.f112261h;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, s.a((s) value, false, false, z14, 3)));
    }

    public static final void y4(a aVar, boolean z14) {
        Object value;
        p2 p2Var = aVar.f112261h;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, s.a((s) value, false, z14, false, 5)));
    }

    public static final void z4(a aVar, boolean z14) {
        Object value;
        p2 p2Var = aVar.f112261h;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, s.a((s) value, z14, false, false, 6)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final fg2.f B4() {
        return (fg2.f) this.f112254a.getValue();
    }

    public final void C4() {
        p2 p2Var;
        of2.b0 b0Var;
        c0 c0Var = B4().f71478b;
        of2.b bVarG = c0Var.g();
        if (bVarG == null || (p2Var = bVarG.f131736o) == null || (b0Var = (of2.b0) p2Var.getValue()) == null) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LSVSessionManager", "Unable to request follow workout, no active session found.");
            return;
        }
        y0 y0Var = c0Var.f131783l;
        if (y0Var != null) {
            y0Var.a(b0Var.f131745b.getF92746j(), b0Var.f131747d);
        } else {
            p005kotlin.jvm.internal.s.m("actionDelegate");
            throw null;
        }
    }

    public final void D4() {
        mf2.h hVarE = B4().e();
        if (hVarE != null) {
            hVarE.d(mf2.h.f.RESUME);
        }
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    public final void E4(boolean z14) {
        p2 p2Var;
        Object value;
        boolean z15;
        do {
            p2Var = this.f112259f;
            value = p2Var.getValue();
            r rVar = (r) value;
            z15 = rVar.f112356b;
            rVar.getClass();
        } while (!p2Var.b(value, new r(z14, z15)));
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
