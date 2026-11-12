package og2;

import com.garmin.android.apps.connectmobile.R;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.e2;
import r53.o2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Log2/v;", "Lorg/koin/core/component/KoinComponent;", "Lqg2/c;", "chartType", "Lof2/b;", "activeSession", "Lr53/o2;", "", "isPaused", "isDisconnected", "Lo53/b0;", "coroutineScope", "Lpg2/a;", "initialChartTimescale", "<init>", "(Lqg2/c;Lof2/b;Lr53/o2;Lr53/o2;Lo53/b0;Lpg2/a;)V", "b", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements KoinComponent {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f132105p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg2.c f132106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of2.b f132107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2<Boolean> f132108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o2<Boolean> f132109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f132110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f132111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z53.b f132112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pg2.a f132113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public og2.b f132114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public og2.b f132115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i53.c<j> f132116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i53.c<j> f132117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Timer f132118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f132119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f132120o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider$1", f = "LiveActivityAnimatedChartDataProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f132121a;

        /* JADX INFO: renamed from: og2.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider$1$1", f = "LiveActivityAnimatedChartDataProvider.kt", l = {94}, m = "invokeSuspend", v = 2)
        public static final class C2505a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f132123a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f132124b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ of2.b0 f132125c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2505a(v vVar, of2.b0 b0Var, t13.d<? super C2505a> dVar) {
                super(2, dVar);
                this.f132124b = vVar;
                this.f132125c = b0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2505a(this.f132124b, this.f132125c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2505a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f132123a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    tf2.d dVar = this.f132125c.f131754k.f164472d;
                    this.f132123a = 1;
                    if (v.b(this.f132124b, dVar, this) == aVar) {
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
        @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider$1$2", f = "LiveActivityAnimatedChartDataProvider.kt", l = {95}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f132126a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f132127b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v vVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f132127b = vVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f132127b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f132126a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f132126a = 1;
                    if (v.d(this.f132127b, this) == aVar) {
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
        @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider$1$3", f = "LiveActivityAnimatedChartDataProvider.kt", l = {96}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f132128a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f132129b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(v vVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f132129b = vVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f132129b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f132128a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f132128a = 1;
                    if (v.c(this.f132129b, this) == aVar) {
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
        @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.LiveActivityAnimatedChartDataProvider$1$4", f = "LiveActivityAnimatedChartDataProvider.kt", l = {97}, m = "invokeSuspend", v = 2)
        public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f132130a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f132131b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(v vVar, t13.d<? super d> dVar) {
                super(2, dVar);
                this.f132131b = vVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new d(this.f132131b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f132130a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f132130a = 1;
                    if (v.e(this.f132131b, this) == aVar) {
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

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = v.this.new a(dVar);
            aVar.f132121a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f132121a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = v.f132105p;
            v vVar = v.this;
            of2.b0 b0Var2 = (of2.b0) vVar.l().f71482f.getValue();
            if (b0Var2 == null) {
                zg2.c.f204692a.getClass();
                zg2.c.b("LiveActivityAnimatedChartDataProvider", "Missing session data");
                return Unit.INSTANCE;
            }
            ge1.b.T(b0Var, null, null, new C2505a(vVar, b0Var2, null), 3);
            ge1.b.T(b0Var, null, null, new b(vVar, null), 3);
            ge1.b.T(b0Var, null, null, new c(vVar, null), 3);
            ge1.b.T(b0Var, null, null, new d(vVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132132a;

        static {
            int[] iArr = new int[qg2.c.values().length];
            try {
                iArr[qg2.c.GRADE_ADJUSTED_PACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qg2.c.PACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f132132a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<fg2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f132133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f132134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f132135c;

        public d(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f132133a = koinComponent;
            this.f132134b = qualifier;
            this.f132135c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [fg2.f, java.lang.Object] */
        @Override // e23.a
        public final fg2.f invoke() {
            KoinComponent koinComponent = this.f132133a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(fg2.f.class), this.f132134b, this.f132135c);
        }
    }

    static {
        new b(null);
    }

    public v(qg2.c cVar, of2.b bVar, o2<Boolean> o2Var, o2<Boolean> o2Var2, o53.b0 b0Var, pg2.a aVar) {
        cVar.getClass();
        o2Var.getClass();
        o2Var2.getClass();
        b0Var.getClass();
        aVar.getClass();
        this.f132106a = cVar;
        this.f132107b = bVar;
        this.f132108c = o2Var;
        this.f132109d = o2Var2;
        this.f132110e = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new d(this, null, null));
        p13.j0 j0Var = p13.j0.f134944a;
        this.f132111f = q2.a(new l(i53.a.e(j0Var), null, new og2.b(0.0f, 0.0f, 3, null), new og2.b(0.0f, 0.0f, 3, null), i53.a.e(j0Var), null, i53.a.e(j0Var), cVar.c().f144672b));
        this.f132112g = z53.c.a();
        this.f132113h = aVar;
        this.f132114i = new og2.b(0.0f, 0.0f, 3, null);
        this.f132115j = new og2.b(0.0f, 0.0f, 3, null);
        this.f132116k = i53.a.e(j0Var);
        this.f132117l = i53.a.e(j0Var);
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityAnimatedChartDataProvider", "init");
        if (cVar == qg2.c.HEART_RATE && l().D == null) {
            zg2.c.a("LiveActivityAnimatedChartDataProvider", "Missing user's heart rate zones.");
        }
        u();
        ge1.b.T(b0Var, null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(v vVar, pg2.a aVar, t13.d dVar) {
        w wVar;
        z53.b bVar;
        vVar.getClass();
        if (dVar instanceof w) {
            wVar = (w) dVar;
            int i14 = wVar.f132141e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f132141e = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(vVar, dVar);
            }
        } else {
            wVar = new w(vVar, dVar);
        }
        Object obj = wVar.f132139c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f132141e;
        if (i15 == 0) {
            o13.r.b(obj);
            zg2.c.f204692a.getClass();
            zg2.c.d("LiveActivityAnimatedChartDataProvider", "Chart timescale changed.");
            bVar = vVar.f132112g;
            wVar.f132137a = aVar;
            wVar.f132138b = bVar;
            wVar.f132141e = 1;
            if (bVar.c(wVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = wVar.f132138b;
            pg2.a aVar3 = wVar.f132137a;
            o13.r.b(obj);
            bVar = bVar2;
            aVar = aVar3;
        }
        try {
            if (!p005kotlin.jvm.internal.s.g(aVar, vVar.f132113h)) {
                vVar.f132113h = aVar;
            }
            Unit unit = Unit.INSTANCE;
            bVar.e(null);
            vVar.u();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            bVar.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a b(v vVar, tf2.d dVar, v13.c cVar) {
        x xVar;
        vVar.getClass();
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f132144c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f132144c = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(vVar, cVar);
            }
        } else {
            xVar = new x(vVar, cVar);
        }
        Object obj = xVar.f132142a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f132144c;
        if (i15 == 0) {
            o13.r.b(obj);
            e2 e2Var = dVar.f164473a;
            y yVar = new y(vVar);
            xVar.f132144c = 1;
            e2Var.getClass();
            if (e2.m(e2Var, yVar, xVar) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a c(v vVar, v13.c cVar) {
        a0 a0Var;
        vVar.getClass();
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f132006c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f132006c = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(vVar, cVar);
            }
        } else {
            a0Var = new a0(vVar, cVar);
        }
        Object obj = a0Var.f132004a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f132006c;
        if (i15 == 0) {
            o13.r.b(obj);
            o2<Boolean> o2Var = vVar.f132109d;
            b0 b0Var = new b0(vVar);
            a0Var.f132006c = 1;
            if (o2Var.collect(b0Var, a0Var) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a d(v vVar, v13.c cVar) {
        c0 c0Var;
        vVar.getClass();
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f132012c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f132012c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(vVar, cVar);
            }
        } else {
            c0Var = new c0(vVar, cVar);
        }
        Object obj = c0Var.f132010a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f132012c;
        if (i15 == 0) {
            o13.r.b(obj);
            o2<Boolean> o2Var = vVar.f132108c;
            d0 d0Var = new d0(vVar);
            c0Var.f132012c = 1;
            if (o2Var.collect(d0Var, c0Var) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object e(v vVar, v13.c cVar) {
        e0 e0Var;
        b2 b2Var;
        vVar.getClass();
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f132024c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f132024c = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(vVar, cVar);
            }
        } else {
            e0Var = new e0(vVar, cVar);
        }
        Object obj = e0Var.f132022a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f132024c;
        if (i15 == 0) {
            o13.r.b(obj);
            of2.b bVar = vVar.f132107b;
            if (bVar == null || (b2Var = bVar.f131734m) == null) {
                return Unit.INSTANCE;
            }
            f0 f0Var = new f0(vVar);
            e0Var.f132024c = 1;
            if (b2Var.f150540a.collect(f0Var, e0Var) == aVar) {
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

    public static j g(List list, og2.b bVar) {
        j jVar = (j) p13.h0.n0(list);
        if (jVar == null || jVar.f132047b == -1.0f || jVar.f132046a != bVar.f132008b) {
            return null;
        }
        return jVar;
    }

    public static ArrayList h(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.f132047b == -1.0f) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(i53.a.e(arrayList2));
                }
                arrayList2 = new ArrayList();
            } else {
                arrayList2.add(jVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(i53.a.e(arrayList2));
        }
        return arrayList;
    }

    public static i53.c o(og2.b bVar, og2.b bVar2) {
        ArrayList arrayList = new ArrayList();
        bVar2.getClass();
        float f14 = bVar2.f132008b - bVar2.f132007a;
        for (int i14 = 0; i14 < 6; i14++) {
            float f15 = i14 * 0.2f;
            arrayList.add(new p0(f15, (f14 * f15) + bVar.f132007a));
        }
        return i53.a.e(arrayList);
    }

    public final i53.c<j0> f(og2.b bVar) {
        float f14 = bVar.f132008b;
        return f14 >= 60.0f ? i53.a.e(p13.x.k(new j0(0.0f, l().h().f3292a.u(Float.valueOf(0.0f))), new j0(0.166f, ""), new j0(0.333f, ""), new j0(0.5f, ""), new j0(0.666f, ""), new j0(0.833f, ""), new j0(1.0f, l().h().f3292a.u(Float.valueOf(f14))))) : n(new og2.b(f14 - 60, f14), 10.0f);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final i53.c<g> i(og2.b bVar) {
        zf2.f fVar;
        if (this.f132106a != qg2.c.HEART_RATE || (fVar = l().D) == null) {
            return null;
        }
        int i14 = fVar.f204646e;
        int i15 = fVar.f204645d;
        int i16 = fVar.f204644c;
        int i17 = fVar.f204643b;
        int i18 = fVar.f204642a;
        ArrayList arrayListD1 = p13.h0.d1(p13.x.k(Integer.valueOf(i18 - 20), Integer.valueOf((i18 + i17) / 2), Integer.valueOf((i17 + i16) / 2), Integer.valueOf((i16 + i15) / 2), Integer.valueOf((i15 + i14) / 2), Integer.valueOf(i14 + 20)));
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListD1, 10));
        Iterator it = arrayListD1.iterator();
        while (it.hasNext()) {
            float fIntValue = ((Number) it.next()).intValue();
            float f14 = bVar.f132007a;
            arrayList.add(Float.valueOf((fIntValue - f14) / (bVar.f132008b - f14)));
        }
        List listK = p13.x.k(Integer.valueOf(R.color.heart_rate_line_gradient0), Integer.valueOf(R.color.heart_rate_line_gradient1), Integer.valueOf(R.color.heart_rate_line_gradient2), Integer.valueOf(R.color.heart_rate_line_gradient3), Integer.valueOf(R.color.heart_rate_line_gradient4), Integer.valueOf(R.color.heart_rate_line_gradient5));
        Iterator it3 = arrayList.iterator();
        Iterator it4 = listK.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(p13.y.r(arrayList, 10), p13.y.r(listK, 10)));
        while (it3.hasNext() && it4.hasNext()) {
            arrayList2.add(new g(((Number) it3.next()).floatValue(), ((Number) it4.next()).intValue()));
        }
        return i53.a.e(arrayList2);
    }

    public final i53.c<j> j(Integer num) {
        List<h0> listK = k(num);
        ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
        for (h0 h0Var : listK) {
            arrayList.add(new j(h0Var.f132039a, h0Var.f132040b));
        }
        return i53.a.e(arrayList);
    }

    public final List<h0> k(Integer num) {
        Iterable iterableE;
        qg2.c cVar;
        List<h0> listT0;
        of2.b bVar = (of2.b) l().f71478b.f131778g.getValue();
        if (bVar != null) {
            List<rf2.b> list = bVar.f131727f.f137575b.get();
            list.getClass();
            iterableE = i53.a.e(list);
        } else {
            iterableE = null;
        }
        if (iterableE == null) {
            iterableE = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableE) {
            if (((rf2.b) obj).f152455a == rf2.a.TIME) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((rf2.b) it.next()).f152460f);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = iterableE.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            cVar = this.f132106a;
            if (!zHasNext) {
                break;
            }
            Object next = it3.next();
            if (((rf2.b) next).f152455a == cVar.b()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((rf2.b) it4.next()).f152460f);
        }
        Iterator it5 = arrayList2.iterator();
        Iterator it6 = arrayList4.iterator();
        ArrayList<h0> arrayList5 = new ArrayList(Math.min(p13.y.r(arrayList2, 10), p13.y.r(arrayList4, 10)));
        while (true) {
            if (!it5.hasNext() || !it6.hasNext()) {
                break;
            }
            Object next2 = it5.next();
            Float f14 = (Float) it6.next();
            Float f15 = (Float) next2;
            arrayList5.add(f15 != null ? new h0(f15.floatValue(), f14 != null ? f14.floatValue() : -1.0f) : null);
        }
        ArrayList<h0> arrayList6 = new ArrayList();
        for (h0 h0Var : arrayList5) {
            if (h0Var != null) {
                arrayList6.add(h0Var);
            }
        }
        if (cVar.b() == rf2.a.PACE) {
            ArrayList arrayList7 = new ArrayList(p13.y.r(arrayList6, 10));
            for (h0 h0Var2 : arrayList6) {
                if (h0Var2.f132040b == 0.0f) {
                    h0Var2 = new h0(h0Var2.f132039a, -1.0f);
                }
                arrayList7.add(h0Var2);
            }
            arrayList6 = arrayList7;
        }
        return (num == null || (listT0 = p13.h0.T0(num.intValue(), arrayList6)) == null) ? arrayList6 : listT0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final fg2.f l() {
        return (fg2.f) this.f132110e.getValue();
    }

    public final j m(j jVar) {
        float f14 = jVar.f132046a;
        h0 h0Var = (h0) p13.h0.n0(k(1));
        if (h0Var == null) {
            return new j(f14 + 1.0f, -1.0f);
        }
        float f15 = h0Var.f132039a;
        float f16 = h0Var.f132040b;
        return f15 > f14 ? new j(f15, f16) : new j(f14 + 1.0f, f16);
    }

    public final i53.c<j0> n(og2.b bVar, float f14) {
        ArrayList arrayList = new ArrayList();
        float f15 = bVar.f132007a;
        float f16 = bVar.f132008b;
        float fCeil = (((float) Math.ceil(f15 / f14)) * f14) - f14;
        while (fCeil <= f16) {
            if (fCeil >= f15 && fCeil >= 0.0f) {
                arrayList.add(new j0((fCeil - f15) / (f16 - f15), l().h().f3292a.u(Float.valueOf(fCeil))));
            }
            fCeil += f14;
        }
        arrayList.add(new j0(1.0f, l().h().f3292a.u(Float.valueOf(f16))));
        return i53.a.e(arrayList);
    }

    public final og2.b p(i53.c<j> cVar) {
        int[] iArr = c.f132132a;
        qg2.c cVar2 = this.f132106a;
        int i14 = iArr[cVar2.ordinal()];
        if (i14 != 1 && i14 != 2) {
            h.a aVar = h.f132038a;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            Iterator<j> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(it.next().f132047b));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).floatValue() != -1.0f) {
                    arrayList2.add(obj);
                }
            }
            i53.c cVarE = i53.a.e(arrayList2);
            qg2.b bVar = cVar2.c().f144671a;
            aVar.getClass();
            return h.a.a(cVarE, bVar);
        }
        h.a aVar2 = h.f132038a;
        ArrayList arrayList3 = new ArrayList(p13.y.r(cVar, 10));
        Iterator<j> it3 = cVar.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Float.valueOf(it3.next().f132047b));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            float fFloatValue = ((Number) obj2).floatValue();
            if (fFloatValue != -1.0f && fFloatValue != 0.0f) {
                arrayList4.add(obj2);
            }
        }
        i53.c cVarE2 = i53.a.e(arrayList4);
        qg2.b bVar2 = cVar2.c().f144671a;
        aVar2.getClass();
        return h.a.a(cVarE2, bVar2);
    }

    public final void q() {
        i53.c<j> cVarJ = j(null);
        if (cVarJ.isEmpty()) {
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityAnimatedChartDataProvider", "No user metrics found to populate all chart.");
            return;
        }
        if (cVarJ.size() > 361) {
            o.a aVar = o.f132067a;
            i53.c cVarE = i53.a.e(cVarJ);
            aVar.getClass();
            cVarJ = o.a.b(cVarE);
        }
        float f14 = ((j) p13.h0.m0(cVarJ)).f132046a;
        og2.b bVar = f14 >= 60.0f ? new og2.b(0.0f, f14) : new og2.b(f14 - 60.0f, f14);
        s(cVarJ, bVar, f(bVar));
    }

    public final void r() {
        if (this.f132119n == 0) {
            this.f132119n = System.currentTimeMillis();
        }
        pg2.a aVar = this.f132113h;
        if (aVar instanceof pg2.a.d) {
            t(61);
        } else if (aVar instanceof pg2.a.c) {
            t(MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE);
        } else {
            if (!(aVar instanceof pg2.a.C2605a)) {
                lc.u0.r();
                return;
            }
            q();
        }
        if (this.f132118m != null) {
            return;
        }
        Timer timer = new Timer();
        this.f132118m = timer;
        timer.schedule(new z(this), 0L, 41L);
    }

    public final void s(i53.c<j> cVar, og2.b bVar, i53.c<j0> cVar2) {
        og2.b bVarP = p(cVar);
        this.f132111f.k(null, new l(h(cVar), g(cVar, bVar), bVar, bVarP, o(bVarP, bVarP), i(bVarP), cVar2, this.f132106a.c().f144672b));
        this.f132114i = bVarP;
        this.f132115j = bVarP;
        this.f132116k = i53.a.e(cVar);
        this.f132117l = i53.a.e(cVar);
    }

    public final void t(int i14) {
        og2.b bVar;
        i53.c<j> cVarJ = j(Integer.valueOf(i14));
        if (cVarJ.isEmpty()) {
            return;
        }
        j jVar = (j) p13.h0.n0(cVarJ);
        if (jVar != null) {
            float f14 = jVar.f132046a;
            bVar = new og2.b(f14 - ((i14 - 1) * 1.0f), f14);
        } else {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityAnimatedChartDataProvider", "Got null xAxisRange. initialChartPoints = " + cVarJ);
            bVar = new og2.b(0.0f, 0.0f, 3, null);
        }
        s(cVarJ, bVar, i53.a.e(n(bVar, 1.0f)));
    }

    public final void u() {
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityAnimatedChartDataProvider", "restart");
        Timer timer = this.f132118m;
        if (timer != null) {
            timer.cancel();
        }
        this.f132118m = null;
        this.f132119n = 0L;
        this.f132120o = 0L;
        p13.j0 j0Var = p13.j0.f134944a;
        this.f132117l = i53.a.e(j0Var);
        this.f132116k = i53.a.e(j0Var);
        this.f132111f.k(null, new l(i53.a.e(j0Var), null, new og2.b(0.0f, 0.0f, 3, null), new og2.b(0.0f, 0.0f, 3, null), i53.a.e(j0Var), null, i53.a.e(j0Var), this.f132106a.c().f144672b));
        r();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    public final void v(float f14, long j8, int i14) {
        i53.c<g> cVar;
        og2.b bVar;
        Integer numValueOf;
        ArrayList arrayListD1 = p13.h0.d1(this.f132116k);
        List listD1 = p13.h0.d1(this.f132117l);
        ArrayList arrayList = new ArrayList();
        p2 p2Var = this.f132111f;
        i53.c<g> cVar2 = ((l) p2Var.getValue()).f132058f;
        long j14 = j8 - this.f132119n;
        long j15 = j14 / ((long) 1000);
        float f15 = (j14 / 1000.0f) - j15;
        if (j15 > this.f132120o) {
            j jVar = (j) p13.h0.n0(this.f132117l);
            if (jVar == null) {
                r();
                return;
            }
            j jVarM = m(jVar);
            ArrayList arrayList2 = new ArrayList(listD1);
            arrayList2.add(jVarM);
            Iterator it = arrayList2.iterator();
            int i15 = 0;
            while (true) {
                if (!it.hasNext()) {
                    numValueOf = null;
                    break;
                }
                int i16 = i15 + 1;
                if (((l) p2Var.getValue()).f132055c.f132007a <= ((j) it.next()).f132046a) {
                    numValueOf = Integer.valueOf(i15);
                    break;
                }
                i15 = i16;
            }
            if (numValueOf == null) {
                listD1 = arrayList2;
            } else {
                int iIntValue = numValueOf.intValue();
                listD1 = iIntValue <= 0 ? arrayList2 : arrayList2.subList(iIntValue - 1, arrayList2.size());
                if (listD1 == null) {
                    listD1 = arrayList2;
                }
            }
            ArrayList arrayList3 = new ArrayList(listD1);
            arrayList3.set(arrayList3.size() - 1, jVar);
            i53.c<g> cVarI = i(this.f132115j);
            this.f132114i = this.f132115j;
            this.f132115j = p(i53.a.e(listD1));
            this.f132120o = j15;
            cVar = cVarI;
            arrayListD1 = arrayList3;
        } else {
            cVar = cVar2;
        }
        int size = listD1.size();
        if (size != 0) {
            if (size != 1) {
                Iterator it3 = listD1.iterator();
                while (it3.hasNext()) {
                    arrayList.add(j.a((j) it3.next()));
                }
                j jVar2 = (j) arrayListD1.get(arrayListD1.size() - 1);
                j jVar3 = (j) com.airbnb.lottie.animation.keyframe.a.c(1, listD1);
                float f16 = jVar2.f132046a;
                float fA = j20.x.a(jVar3.f132046a, f16, f15, f16);
                float fA2 = jVar3.f132047b;
                if (fA2 != -1.0f) {
                    float f17 = jVar2.f132047b;
                    if (f17 != -1.0f) {
                        fA2 = j20.x.a(fA2, f17, f15, f17);
                    }
                }
                arrayList.set(arrayList.size() - 1, new j(fA, fA2));
            } else {
                arrayList.add(j.a((j) p13.h0.b0(listD1)));
            }
            j jVar4 = (j) p13.h0.n0(arrayList);
            if (jVar4 != null) {
                float f18 = jVar4.f132046a;
                bVar = new og2.b(f18 - (1.0f * (i14 - 1)), f18);
            } else {
                bVar = new og2.b(0.0f, 0.0f, 3, null);
            }
            og2.b bVar2 = bVar;
            og2.b bVar3 = this.f132114i;
            float f19 = bVar3.f132007a;
            og2.b bVar4 = this.f132115j;
            float fA3 = j20.x.a(bVar4.f132007a, f19, f15, f19);
            float f22 = bVar3.f132008b;
            og2.b bVar5 = new og2.b(fA3, j20.x.a(bVar4.f132008b, f22, f15, f22));
            p2Var.k(null, new l(h(arrayList), g(arrayList, bVar2), bVar2, bVar5, o(bVar5, this.f132115j), cVar, n(bVar2, f14), this.f132106a.c().f144672b));
            this.f132117l = i53.a.e(listD1);
            this.f132116k = i53.a.e(arrayListD1);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Log2/v$b;", "", "<init>", "()V", "", "INVALID_TIME_MILLIS", "J", "", "INVALID_Y_VALUE", "I", "", "TAG", "Ljava/lang/String;", "REFRESH_RATE_PER_SECOND", "MAX_NUM_POINTS_FOR_ALL_CHART", "NUM_POINTS_FOR_DOWN_SAMPLED_ALL_CHART", "NUM_Y_AXES", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
