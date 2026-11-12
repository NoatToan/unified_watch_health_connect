package wn0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.t;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwn0/l;", "Landroidx/lifecycle/u1;", "Lmn0/i;", "getDetailsData", "Lmn0/m;", "getFeaturesStateData", "Lmn0/h;", "getDetailsStateData", "Lmn0/d;", "getDailyMetricValuesData", "Lmn0/c;", "getDevicePulseOxSettingsNavArgs", "Lf12/l;", "userSettings", "Ljn0/a;", "preferences", "<init>", "(Lmn0/i;Lmn0/m;Lmn0/h;Lmn0/d;Lmn0/c;Lf12/l;Ljn0/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn0.i f186130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn0.m f186131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn0.h f186132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mn0.d f186133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mn0.c f186134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f12.l f186135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jn0.a f186136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b63.o f186137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f186138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f186139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f186140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f186141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f186142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u82.a f186143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f186144o;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lin0/c;", "<anonymous>", "(Lo82/a;)Lin0/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.presentation.reports.HealthStatusReportsViewModel$detailsDataState$1", f = "HealthStatusReportsViewModel.kt", l = {78, 81}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o82.a, t13.d<? super in0.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public in0.c f186145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f186146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f186147c;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = l.this.new a(dVar);
            aVar.f186147c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super in0.c> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        
            if (r14 == r1) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            in0.c cVar;
            Object objA;
            o82.a aVar = (o82.a) this.f186147c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186146b;
            l lVar = l.this;
            if (i14 == 0) {
                r.b(obj);
                mn0.i iVar = lVar.f186130a;
                b63.o oVar = aVar.f130843a;
                this.f186147c = aVar;
                this.f186146b = 1;
                obj = iVar.a(oVar, this);
                if (obj != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = this.f186145a;
                r.b(obj);
                objA = ((o13.q) obj).f128597a;
            }
            int i15 = o13.q.f128596b;
            Object obj2 = objA instanceof o13.q.b ? null : objA;
            b63.o oVar2 = cVar.f94420a;
            Integer num = cVar.f94421b;
            b63.l lVar2 = cVar.f94422c;
            b63.l lVar3 = cVar.f94423d;
            i53.c<in0.h> cVar2 = cVar.f94424e;
            oVar2.getClass();
            return new in0.c(oVar2, num, lVar2, lVar3, cVar2, (in0.g) obj2);
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    throw ((v2.a) v2Var).f47383a;
                }
                u0.r();
                return null;
            }
            if (!s.g(aVar.f130843a, lVar.f186137h)) {
                return (in0.c) ((v2.b) v2Var).f47386a;
            }
            cVar = (in0.c) ((v2.b) v2Var).f47386a;
            mn0.m mVar = lVar.f186131b;
            long jS4 = lVar.f186135f.s4();
            this.f186147c = null;
            this.f186145a = cVar;
            this.f186146b = 2;
            objA = mVar.a(jS4, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.presentation.reports.HealthStatusReportsViewModel$getMetricDetails$1", f = "HealthStatusReportsViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t f186149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f186150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f186151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f186152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ in0.m f186153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ in0.h.a f186154f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b63.o oVar, l lVar, in0.m mVar, in0.h.a aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f186151c = oVar;
            this.f186152d = lVar;
            this.f186153e = mVar;
            this.f186154f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f186151c, this.f186152d, this.f186153e, this.f186154f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            t tVarD;
            Object value;
            Object value2;
            final int i14;
            Object value3;
            Object objE;
            Object value4;
            List list;
            Object value5;
            final int i15;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f186150b;
            final in0.h.a aVar2 = this.f186154f;
            final in0.m mVar = this.f186153e;
            final l lVar = this.f186152d;
            final b63.o oVar = this.f186151c;
            if (i16 == 0) {
                r.b(obj);
                b63.i.INSTANCE.getClass();
                tVarD = b63.q.c(oVar, 6, b63.i.f16190d).d(oVar);
                LinkedHashMap linkedHashMap = lVar.f186142m;
                p2 p2Var = lVar.f186140k;
                List list2 = (List) linkedHashMap.get(oVar);
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, new q.b(mVar)));
                if (az0.b.a()) {
                    mn0.d dVar = lVar.f186133d;
                    b63.o oVar2 = tVarD.f16212b;
                    b63.o oVar3 = tVarD.f16213c;
                    boolean z14 = (list2 != null ? in0.b.a(oVar, list2) : null) == null;
                    i53.d<b63.o, Double> dVarC = list2 != null ? in0.b.c(list2, mVar) : null;
                    boolean z15 = dVarC == null || dVarC.isEmpty();
                    i53.d<b63.o, j23.g<Double>> dVarB = list2 != null ? in0.b.b(list2, mVar) : null;
                    boolean z16 = dVarB == null || dVarB.isEmpty();
                    this.f186149a = tVarD;
                    this.f186150b = 1;
                    dVar.getClass();
                    objE = c0.e(new mn0.g(z15, z16, z14, dVar, list2, oVar2, oVar3, this.f186153e, null), this);
                    if (objE == aVar) {
                        return aVar;
                    }
                } else if (list2 != null) {
                    do {
                        value3 = p2Var.getValue();
                    } while (!p2Var.b(value3, new q.c(mVar, new in0.j(mVar, tVarD, this.f186154f, in0.b.a(oVar, list2), in0.b.c(list2, mVar), in0.b.b(list2, mVar)))));
                } else {
                    do {
                        value2 = p2Var.getValue();
                        i14 = 1;
                    } while (!p2Var.b(value2, new q.a(mVar, new e23.a() { // from class: wn0.n
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    lVar.x4(mVar, oVar, aVar2);
                                    break;
                                default:
                                    lVar.x4(mVar, oVar, aVar2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    })));
                }
                return Unit.INSTANCE;
            }
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t tVar = this.f186149a;
            r.b(obj);
            objE = obj;
            tVarD = tVar;
            v2 v2Var = (v2) objE;
            if (v2Var instanceof v2.a) {
                p2 p2Var2 = lVar.f186140k;
                do {
                    value5 = p2Var2.getValue();
                    i15 = 0;
                } while (!p2Var2.b(value5, new q.a(mVar, new e23.a() { // from class: wn0.n
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                lVar.x4(mVar, oVar, aVar2);
                                break;
                            default:
                                lVar.x4(mVar, oVar, aVar2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                })));
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                LinkedHashMap linkedHashMap2 = lVar.f186142m;
                T t7 = ((v2.b) v2Var).f47386a;
                linkedHashMap2.put(oVar, t7);
                p2 p2Var3 = lVar.f186140k;
                do {
                    value4 = p2Var3.getValue();
                    list = (List) t7;
                } while (!p2Var3.b(value4, new q.c(mVar, new in0.j(mVar, tVarD, this.f186154f, in0.b.a(oVar, list), in0.b.c(list, mVar), in0.b.b(list, mVar)))));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lwn0/p;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.presentation.reports.HealthStatusReportsViewModel$uiState$1", f = "HealthStatusReportsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super p>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super p> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l lVar = l.this;
            lVar.f186136g.b();
            ge1.b.T(v1.a(lVar), null, null, new o(lVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    public l(mn0.i iVar, mn0.m mVar, mn0.h hVar, mn0.d dVar, mn0.c cVar, f12.l lVar, jn0.a aVar) {
        iVar.getClass();
        mVar.getClass();
        hVar.getClass();
        dVar.getClass();
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        this.f186130a = iVar;
        this.f186131b = mVar;
        this.f186132c = hVar;
        this.f186133d = dVar;
        this.f186134e = cVar;
        this.f186135f = lVar;
        this.f186136g = aVar;
        this.f186137h = g22.l.d(b63.o.INSTANCE);
        p2 p2VarA = q2.a(new p(false, null, false, false, 15, null));
        this.f186138i = p2VarA;
        this.f186139j = r53.s.K(new v(new c(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), p2VarA.getValue());
        p2 p2VarA2 = q2.a(null);
        this.f186140k = p2VarA2;
        this.f186141l = r53.s.d(p2VarA2);
        this.f186142m = new LinkedHashMap();
        this.f186143n = new u82.a(v1.a(this), new y82.e(new y82.c(new a(null)), null, 2, null), false, 4, null);
    }

    public final void x4(in0.m mVar, b63.o oVar, in0.h.a aVar) {
        mVar.getClass();
        oVar.getClass();
        aVar.getClass();
        ge1.b.T(v1.a(this), null, null, new b(oVar, this, mVar, aVar, null), 3);
    }

    public final void y4(boolean z14) {
        this.f186136g.f(z14);
        while (true) {
            p2 p2Var = this.f186138i;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, p.a((p) value, false, null, false, z15, 7))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }
}
