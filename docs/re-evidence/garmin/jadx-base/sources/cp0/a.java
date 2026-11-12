package cp0;

import com.garmin.android.apps.connectmobile.dashboard.data.datasource.o;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import j70.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.m1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import t13.g;
import u53.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcp0/a;", "Lgn/a;", "Ll70/c;", "dashboardRepository", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o;", "activityTrendsPreferenceDataSource", "<init>", "(Ll70/c;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements gn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.c f54875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f54876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<j70.b> f54877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f54878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f54879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f54880f;

    /* JADX INFO: renamed from: cp0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj70/f;", "config", "", "<anonymous>", "(Lj70/f;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.home.domain.AddActivityTrendUseCaseImpl$1", f = "AddActivityTrendUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C1194a extends i implements p<f, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f54881a;

        public C1194a(t13.d<? super C1194a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C1194a c1194a = a.this.new C1194a(dVar);
            c1194a.f54881a = obj;
            return c1194a;
        }

        @Override // e23.p
        public final Object invoke(f fVar, t13.d<? super Unit> dVar) {
            return ((C1194a) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<j70.b> listD;
            f fVar = (f) this.f54881a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            j70.c dailyStatsConfig = fVar.getDailyStatsConfig();
            if (dailyStatsConfig == null || (listD = dailyStatsConfig.d()) == null) {
                listD = j0.f134944a;
            }
            a.this.f54877c = listD;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.home.domain.AddActivityTrendUseCaseImpl$addTrend$1$1", f = "AddActivityTrendUseCaseImpl.kt", l = {46, 47}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f54883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f54884b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o70.c f54886d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o70.c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f54886d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new b(this.f54886d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x008a  */
        /* JADX WARN: Code duplicated, block: B:33:0x008d  */
        /* JADX WARN: Code duplicated, block: B:37:0x0094  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<j70.b> list;
            List<j70.b> list2;
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f54884b;
            a aVar2 = a.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    List<j70.b> list3 = this.f54883a;
                    r.b(obj);
                    list = list3;
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = this.f54883a;
                    r.b(obj);
                }
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    aVar2.f54877c = list2;
                } else if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            List<j70.b> list4 = aVar2.f54877c;
            o70.c cVar = this.f54886d;
            if (list4 == null || !list4.isEmpty()) {
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    if (s.g(((j70.b) it.next()).getCardType(), cVar.f129941a)) {
                        return Unit.INSTANCE;
                    }
                }
            }
            j70.b bVar = new j70.b(cVar.f129941a);
            ArrayList arrayListD1 = h0.d1(aVar2.f54877c);
            arrayListD1.add(bVar);
            o oVar = aVar2.f54876b;
            this.f54883a = arrayListD1;
            this.f54884b = 1;
            if (oVar.b(cVar, false, this) != aVar) {
                list = arrayListD1;
            }
            return aVar;
            l70.c cVar2 = aVar2.f54875a;
            this.f54883a = list;
            this.f54884b = 2;
            obj = l70.c.V0(cVar2, list, null, null, null, null, this, 30);
            if (obj != aVar) {
                list2 = list;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    aVar2.f54877c = list2;
                } else if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    public a(l70.c cVar, o oVar) {
        cVar.getClass();
        oVar.getClass();
        this.f54875a = cVar;
        this.f54876b = oVar;
        this.f54877c = j0.f134944a;
        this.f54878d = new ReentrantLock();
        m1 m1VarC = g8.i.c();
        x53.c cVar2 = s0.f129406a;
        d dVarA = c0.a(g.a.C3052a.d(x53.b.f189152a, m1VarC));
        this.f54880f = dVarA;
        r53.s.C(new r53.m1(cVar.p(), new C1194a(null)), dVarA);
    }

    @Override // gn.a
    public final void a(o70.c cVar) {
        cVar.getClass();
        ReentrantLock reentrantLock = this.f54878d;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f54879e;
            if (c2Var == null || !c2Var.isActive()) {
                this.f54879e = ge1.b.T(this.f54880f, null, null, new b(cVar, null), 3);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
