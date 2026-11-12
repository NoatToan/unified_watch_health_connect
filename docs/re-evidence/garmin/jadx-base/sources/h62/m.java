package h62;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.s3;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import l52.y;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.a2;
import r53.e2;
import r53.g2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import yc.h3;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh62/m;", "Landroidx/lifecycle/u1;", "Ll52/y;", "workoutsRepo", "Lo52/c;", "getStartWorkoutTypeUseCase", "<init>", "(Ll52/y;Lo52/c;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f82249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o52.c f82250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<l> f82251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f82252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f82253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2 f82254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e2 f82255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f82256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f82257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f82258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<Boolean> f82259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f82260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f82261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f82262n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListViewModel$1", f = "WorkoutListViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82263a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return m.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003d  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82263a;
            m mVar = m.this;
            if (i14 == 0) {
                r.b(obj);
                o52.c cVar = mVar.f82250b;
                this.f82263a = 1;
                int i15 = o52.c.f129295e;
                obj = cVar.a(null, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.y yVar = (com.garmin.android.apps.connectmobile.workouts.data.model.y) obj;
            if (s3.b()) {
                yVar.getClass();
                if (yVar instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.c) {
                    mVar.f82259k.j(Boolean.TRUE);
                } else {
                    mVar.getClass();
                    ge1.b.T(v1.a(mVar), null, null, new n(mVar, null), 3);
                }
            } else {
                mVar.getClass();
                ge1.b.T(v1.a(mVar), null, null, new n(mVar, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListViewModel$special$$inlined$flatMapLatest$1", f = "WorkoutListViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super v2<WorkoutDTO>>, List<? extends m52.k>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f82266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f82267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f82268d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t13.d dVar, m mVar) {
            super(3, dVar);
            this.f82268d = mVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super v2<WorkoutDTO>> jVar, List<? extends m52.k> list, t13.d<? super Unit> dVar) {
            b bVar = new b(dVar, this.f82268d);
            bVar.f82266b = jVar;
            bVar.f82267c = list;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82265a;
            if (i14 == 0) {
                r.b(obj);
                r53.j jVar = this.f82266b;
                m mVar = this.f82268d;
                int i15 = mVar.f82257i;
                t2 t2Var = new t2(new u2(i15, 0, false, i15, 0, 0, 54, null), null, mVar.new d(), 2, null);
                this.f82266b = null;
                this.f82267c = null;
                this.f82265a = 1;
                if (s.v(jVar, t2Var.f196485a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lm52/k;", "workoutTypes", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListViewModel$workoutsPagingFlow$1", f = "WorkoutListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<List<? extends m52.k>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f82269a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = m.this.new c(dVar);
            cVar.f82269a = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(List<? extends m52.k> list, t13.d<? super Unit> dVar) {
            return ((c) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f82269a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            y0<l> y0Var = m.this.f82251c;
            l lVarD = y0Var.d();
            if (lVarD != null) {
                y0Var.m(l.a(lVarD, false, null, list, 3));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<h3<Integer, WorkoutDTO>> {
        public d() {
        }

        @Override // e23.a
        public final h3<Integer, WorkoutDTO> invoke() {
            m mVar = m.this;
            return new r52.j(mVar.f82249a, (List) mVar.f82261m.getValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0054  */
    public m(y yVar, o52.c cVar) {
        boolean z14;
        yVar.getClass();
        cVar.getClass();
        this.f82249a = yVar;
        this.f82250b = cVar;
        y0<l> y0Var = new y0<>(new l(false, null, null, 7, null));
        this.f82251c = y0Var;
        this.f82252d = y0Var;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f82253e = e2VarB;
        this.f82254f = e2VarB;
        e2 e2VarB2 = g2.b(0, 0, null, 7);
        this.f82255g = e2VarB2;
        this.f82256h = s.c(e2VarB2);
        this.f82257i = 10;
        bv.b.f21239a.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        if (k1Var.l0()) {
            bv.b.a();
            z14 = k1Var.G();
        }
        this.f82258j = z14;
        y0<Boolean> y0Var2 = new y0<>(Boolean.FALSE);
        this.f82259k = y0Var2;
        this.f82260l = y0Var2;
        w9.a aVarA = v1.a(this);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new a(null), 2);
        p2 p2VarA = q2.a(j0.f134944a);
        this.f82261m = p2VarA;
        this.f82262n = yc.o.a(s.N(new m1(p2VarA, new c(null)), new b(null, this)), v1.a(this));
    }
}
