package s52;

import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l52.y;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c0;
import r53.m1;
import r53.s;
import r53.w;
import s5.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls52/h;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f157410a = (y) KoinJavaComponent.get$default(y.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou1.d f157411b = (ou1.d) KoinJavaComponent.get$default(ou1.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f157412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<fw.m<List<com.garmin.android.apps.connectmobile.workouts.data.model.b>>> f157413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f157414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f157415f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$getBenchmarkExerciseList$1", f = "BenchmarkViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157416a;

        /* JADX INFO: renamed from: s52.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$getBenchmarkExerciseList$1$1", f = "BenchmarkViewModel.kt", l = {49, 51}, m = "invokeSuspend", v = 2)
        public static final class C2967a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f157418a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f157419b;

            /* JADX INFO: renamed from: s52.h$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$getBenchmarkExerciseList$1$1$1", f = "BenchmarkViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C2968a extends v13.i implements q<r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c>, Throwable, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Throwable f157420a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f157421b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2968a(h hVar, t13.d<? super C2968a> dVar) {
                    super(3, dVar);
                    this.f157421b = hVar;
                }

                @Override // e23.q
                public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c> jVar, Throwable th3, t13.d<? super Unit> dVar) {
                    C2968a c2968a = new C2968a(this.f157421b, dVar);
                    c2968a.f157420a = th3;
                    return c2968a.invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    Throwable th3 = this.f157420a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    r.b(obj);
                    this.f157421b.f157413d.j(fw.m.a.d(fw.m.f73767e, th3));
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: s52.h$a$a$b */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseResult", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/c;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkViewModel$getBenchmarkExerciseList$1$1$2", f = "BenchmarkViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
            public static final class b extends v13.i implements p<com.garmin.android.apps.connectmobile.repcounting.model.c, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public h f157422a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f157423b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f157424c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ h f157425d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f157426e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(h hVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list, t13.d<? super b> dVar) {
                    super(2, dVar);
                    this.f157425d = hVar;
                    this.f157426e = list;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    b bVar = new b(this.f157425d, this.f157426e, dVar);
                    bVar.f157424c = obj;
                    return bVar;
                }

                @Override // e23.p
                public final Object invoke(com.garmin.android.apps.connectmobile.repcounting.model.c cVar, t13.d<? super Unit> dVar) {
                    return ((b) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr;
                    Object objA;
                    h hVar;
                    com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF;
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar;
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) this.f157424c;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f157423b;
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list = this.f157426e;
                    h hVar2 = this.f157425d;
                    if (i14 == 0) {
                        r.b(obj);
                        if (cVar2 == null || (dVarArrF = cVar2.F()) == null) {
                            dVarArr = null;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (com.garmin.android.apps.connectmobile.repcounting.model.d dVar : dVarArrF) {
                                if (!dVar.f41105d) {
                                    arrayList.add(dVar);
                                }
                            }
                            dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                        }
                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar3 = dVarArr != null ? new com.garmin.android.apps.connectmobile.repcounting.model.c(dVarArr) : null;
                        hVar2.f157415f = cVar3;
                        ArrayList arrayListL = androidx.core.view.j.l(list);
                        for (com.garmin.android.apps.connectmobile.workouts.data.model.b bVar : list) {
                            if ((cVar3 != null ? cVar3.D(bVar.getBenchmarkCategoryKey(), bVar.getBenchmarkKey()) : null) == null) {
                                arrayListL.add(new com.garmin.android.apps.connectmobile.repcounting.model.d(bVar.getBenchmarkCategoryKey(), null, null, false, bVar.getBenchmarkKey(), null));
                            }
                            List<com.garmin.android.apps.connectmobile.workouts.data.model.l> listJ = bVar.j();
                            if (listJ != null) {
                                for (com.garmin.android.apps.connectmobile.workouts.data.model.l lVar : listJ) {
                                    if ((cVar3 != null ? cVar3.D(lVar.getCategoryKey(), lVar.getExerciseKey()) : null) == null) {
                                        arrayListL.add(new com.garmin.android.apps.connectmobile.repcounting.model.d(lVar.getCategoryKey(), null, null, false, lVar.getExerciseKey(), null));
                                    }
                                }
                            }
                        }
                        if (!arrayListL.isEmpty()) {
                            ou1.d dVar2 = hVar2.f157411b;
                            x0 x0Var = x0.f4309n1;
                            com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr2 = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) arrayListL.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                            this.f157424c = null;
                            this.f157422a = hVar2;
                            this.f157423b = 1;
                            objA = dVar2.a(x0Var, dVarArr2, this);
                            if (objA == aVar) {
                                return aVar;
                            }
                            hVar = hVar2;
                        }
                        gl1.d.l0(hVar2.f157415f, list);
                        h.x4(hVar2, list, hVar2.f157415f);
                        hVar2.f157413d.j(fw.m.a.g(fw.m.f73767e, list, 1));
                        return Unit.INSTANCE;
                    }
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h hVar3 = this.f157422a;
                    r.b(obj);
                    hVar = hVar3;
                    objA = obj;
                    com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr3 = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) objA;
                    if (dVarArr3 != null && (cVar = hVar.f157415f) != null) {
                        cVar.C(dVarArr3);
                    }
                    gl1.d.l0(hVar2.f157415f, list);
                    h.x4(hVar2, list, hVar2.f157415f);
                    hVar2.f157413d.j(fw.m.a.g(fw.m.f73767e, list, 1));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2967a(h hVar, t13.d<? super C2967a> dVar) {
                super(2, dVar);
                this.f157419b = hVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2967a(this.f157419b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2967a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
            
                if (r7 == r0) goto L17;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f157418a;
                h hVar = this.f157419b;
                if (i14 == 0) {
                    r.b(obj);
                    c2 c2Var = hVar.f157412c;
                    if (c2Var != null) {
                        this.f157418a = 1;
                        if (c2Var.P(this) != aVar) {
                        }
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    List list = (List) ((v2.b) v2Var).f47386a;
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar = hVar.f157415f;
                    if (cVar == null) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        r53.c2 c2VarB = hVar.f157411b.b(x0.f4309n1, k1.f37122a.F());
                        x53.c cVar2 = s0.f129406a;
                        s.C(new m1(new w(s.A(c2VarB, x53.b.f189152a), new C2968a(hVar, null)), new b(hVar, list, null)), v1.a(hVar));
                    } else {
                        gl1.d.l0(cVar, list);
                        h.x4(hVar, list, hVar.f157415f);
                        hVar.f157413d.j(fw.m.a.g(fw.m.f73767e, list, 1));
                    }
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    hVar.f157413d.j(fw.m.a.d(fw.m.f73767e, ((v2.a) v2Var).f47383a));
                }
                return Unit.INSTANCE;
                y yVar = hVar.f157410a;
                this.f157418a = 2;
                obj = yVar.i(this);
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157416a;
            if (i14 == 0) {
                r.b(obj);
                h hVar = h.this;
                hVar.f157413d.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                C2967a c2967a = new C2967a(hVar, null);
                this.f157416a = 1;
                if (ge1.b.e0(bVar, c2967a, this) == aVar) {
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

    public h() {
        y0<fw.m<List<com.garmin.android.apps.connectmobile.workouts.data.model.b>>> y0Var = new y0<>();
        this.f157413d = y0Var;
        this.f157414e = y0Var;
    }

    public static final void x4(h hVar, List list, com.garmin.android.apps.connectmobile.repcounting.model.c cVar) {
        hVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = (com.garmin.android.apps.connectmobile.workouts.data.model.b) it.next();
            if (bVar.j() == null) {
                bVar.s(new ArrayList());
            }
            List<com.garmin.android.apps.connectmobile.workouts.data.model.l> listJ = bVar.j();
            if (listJ != null) {
                y4(listJ, cVar, bVar);
                if (!listJ.isEmpty()) {
                    c0.u(listJ, new a61.c(new s5.a(bVar, 2), 21));
                    f.f157406a.getClass();
                    listJ.removeIf(new a73.n(new e0(12), 29));
                }
            }
        }
    }

    public static void y4(List list, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.workouts.data.model.b bVar) {
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD;
        if (cVar == null || (dVarD = cVar.D(bVar.getBenchmarkCategoryKey(), bVar.getBenchmarkKey())) == null) {
            return;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.garmin.android.apps.connectmobile.workouts.data.model.l lVar = (com.garmin.android.apps.connectmobile.workouts.data.model.l) it.next();
                if (zf.b.E(lVar.getCategoryKey(), lVar.getExerciseKey(), dVarD.f41102a, dVarD.f41106e)) {
                    return;
                }
            }
        }
        list.add(0, new com.garmin.android.apps.connectmobile.workouts.data.model.l(dVarD.f41102a, dVarD.f41106e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.b> A4() {
        fw.m mVar = (fw.m) this.f157414e.d();
        if (mVar != null) {
            return (List) mVar.f73770c;
        }
        return null;
    }

    public final void z4() {
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }
}
