package k62;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l52.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p13.h0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk62/d;", "Landroidx/lifecycle/u1;", "Ll52/y;", "workoutsRepository", "<init>", "(Ll52/y;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f103176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f103177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f103178c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.myworkouts.MyWorkoutListViewModel$fetchMyWorkouts$1", f = "MyWorkoutListViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103180b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((WorkoutDTO) t14).f48042c, ((WorkoutDTO) t7).f48042c);
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = d.this.new b(dVar);
            bVar.f103180b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objL;
            b0 b0Var = (b0) this.f103180b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f103179a;
            d dVar = d.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    dVar.f103177b.k(null, new k62.c(true, false, null, 4, null));
                    y yVar = dVar.f103176a;
                    this.f103180b = b0Var;
                    this.f103179a = 1;
                    objL = yVar.l(this);
                    if (objL == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    objL = obj;
                }
                v2 v2Var = (v2) objL;
                if (v2Var instanceof v2.b) {
                    a2 a2Var = a2.WORKOUTS;
                    String str = "Successfully fetched workouts: " + ((List) ((v2.b) v2Var).f47386a).size() + " items";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "MyWorkoutListViewModel", str);
                    Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (!((WorkoutDTO) obj2).D()) {
                            arrayList.add(obj2);
                        }
                    }
                    dVar.f103177b.k(null, new k62.c(false, false, h0.N0(arrayList, new a()), 2, null));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a2 a2Var2 = a2.WORKOUTS;
                    String str2 = "Error fetching workouts: " + ((v2.a) v2Var).f47383a.getMessage();
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "MyWorkoutListViewModel", str2);
                    dVar.f103177b.k(null, new k62.c(false, true, null, 4, null));
                }
            } catch (Exception e4) {
                a2 a2Var3 = a2.WORKOUTS;
                String strN = fb1.c.n("Exception while fetching workouts: ", e4.getMessage());
                i2.f36769a.getClass();
                i2.a.f(a2Var3, "MyWorkoutListViewModel", strN);
                dVar.f103177b.k(null, new k62.c(false, true, null, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lk62/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.myworkouts.MyWorkoutListViewModel$uiState$1", f = "MyWorkoutListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super k62.c>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super k62.c> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            d.this.x4();
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(y yVar) {
        yVar.getClass();
        this.f103176a = yVar;
        p2 p2VarA = q2.a(new k62.c(false, false, null, 7, null));
        this.f103177b = p2VarA;
        v vVar = new v(new c(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f103178c = s.K(vVar, aVarA, k2.a.f150706c, new k62.c(false, false, 0 == true ? 1 : 0, 7, null));
    }

    public final void x4() {
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk62/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
