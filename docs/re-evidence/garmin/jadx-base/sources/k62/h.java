package k62;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk62/h;", "Landroidx/lifecycle/u1;", "Lzd0/j1;", "subscriptionProvider", "Lo52/e;", "workoutDelegate", "<init>", "(Lzd0/j1;Lo52/e;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f103191e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f103192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o52.e f103193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f103194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f103195d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lk62/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.myworkouts.MyWorkoutsInitialStateCheckViewModel$uiState$1", f = "MyWorkoutsInitialStateCheckViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super g>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super g> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = h.f103191e;
            h hVar = h.this;
            hVar.getClass();
            ge1.b.T(v1.a(hVar), null, null, new i(hVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public h(j1 j1Var, o52.e eVar) {
        j1Var.getClass();
        eVar.getClass();
        this.f103192a = j1Var;
        this.f103193b = eVar;
        p2 p2VarA = q2.a(new g(false, false, null, 7, null));
        this.f103194c = p2VarA;
        v vVar = new v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f103195d = s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk62/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
