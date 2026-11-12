package kd0;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.List;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkd0/z6;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k2;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/api/f;", "pregnancyWeightApi", "<init>", "(Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/api/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z6 implements com.garmin.android.apps.connectmobile.dashboard.data.datasource.k2, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f f104483a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.WeightGoalPregnancyServerImpl", f = "WeightGoalPregnancyServerImpl.kt", l = {18}, m = "fetchData", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f104484a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f104486c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f104484a = obj;
            this.f104486c |= Integer.MIN_VALUE;
            return z6.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lzk0/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.WeightGoalPregnancyServerImpl$fetchData$pregnancyWeightGoal$1", f = "WeightGoalPregnancyServerImpl.kt", l = {19}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends zk0.f>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104487a;

        public c(t13.d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return z6.this.new c(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<List<? extends zk0.f>>> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104487a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<List<zk0.f>>> i0VarA = z6.this.f104483a.a(fz0.d.c(new LocalDate()), fz0.d.c(new LocalDate()));
            this.f104487a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    static {
        new a(null);
    }

    public z6(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f fVar) {
        fVar.getClass();
        this.f104483a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.k2
    public final Object a(t13.d<? super String> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f104486c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f104486c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objJ = bVar.f104484a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f104486c;
        if (i15 == 0) {
            o13.r.b(objJ);
            c cVar = new c(null);
            bVar.f104486c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, cVar, bVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                return null;
            }
            lc.u0.r();
            return null;
        }
        String strA = GsonUtil.a(p13.h0.d0((List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a));
        long millis = Duration.standardDays(1L).getMillis();
        jw.c0 c0Var = new jw.c0(millis, millis);
        c0Var.e("https://connectapi.garmin.com/periodichealth-service/menstrualcycle/pregnancy/weightgoals");
        c0Var.d(Unit.INSTANCE, strA);
        return strA;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/z6$a;", "", "<init>", "()V", "", "PERIODIC_HEALTH_SERVICE_BASE_URL", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
