package l70;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements r53.i<List<? extends j70.b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f110745a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f110746a;

        /* JADX INFO: renamed from: l70.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchActivityTrendDismissedPrompts$$inlined$map$1$2", f = "DashboardRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class C2120a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f110747a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f110748b;

            public C2120a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f110747a = obj;
                this.f110748b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f110746a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2120a c2120a;
            if (dVar instanceof C2120a) {
                c2120a = (C2120a) dVar;
                int i14 = c2120a.f110748b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2120a.f110748b = i14 - Integer.MIN_VALUE;
                } else {
                    c2120a = new C2120a(dVar);
                }
            } else {
                c2120a = new C2120a(dVar);
            }
            Object obj2 = c2120a.f110747a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2120a.f110748b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.c dailyStatsConfig = ((j70.f) obj).getDailyStatsConfig();
                List<j70.b> listD = dailyStatsConfig != null ? dailyStatsConfig.d() : null;
                c2120a.f110748b = 1;
                if (this.f110746a.emit(listD, c2120a) == aVar) {
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

    public n(r53.i iVar) {
        this.f110745a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends j70.b>> jVar, t13.d dVar) {
        Object objCollect = this.f110745a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
