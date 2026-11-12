package l70;

import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements r53.i<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f110835a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f110836a;

        /* JADX INFO: renamed from: l70.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchRealTimeData$$inlined$map$1$2", f = "DashboardRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class C2126a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f110837a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f110838b;

            public C2126a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f110837a = obj;
                this.f110838b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f110836a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2126a c2126a;
            if (dVar instanceof C2126a) {
                c2126a = (C2126a) dVar;
                int i14 = c2126a.f110838b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2126a.f110838b = i14 - Integer.MIN_VALUE;
                } else {
                    c2126a = new C2126a(dVar);
                }
            } else {
                c2126a = new C2126a(dVar);
            }
            Object obj2 = c2126a.f110837a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2126a.f110838b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.f fVar = (j70.f) obj;
                j70.c dailyStatsConfig = fVar.getDailyStatsConfig();
                Set<o70.o> setD = j70.g.d(dailyStatsConfig != null ? dailyStatsConfig.d() : null);
                Set<o70.t> setE = j70.g.e(j70.g.a(fVar));
                j70.c dailyStatsConfig2 = fVar.getDailyStatsConfig();
                a0 a0Var = new a0(setD, setE, j70.g.c(dailyStatsConfig2 != null ? dailyStatsConfig2.c() : null));
                c2126a.f110838b = 1;
                if (this.f110836a.emit(a0Var, c2126a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public z(r53.i iVar) {
        this.f110835a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super a0> jVar, t13.d dVar) {
        Object objCollect = this.f110835a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
