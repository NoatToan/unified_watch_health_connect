package l70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.j1;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w implements r53.i<j70.k.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f110822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f110823b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f110824a;

        /* JADX INFO: renamed from: l70.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchEcg$lambda$1$$inlined$map$1$2", f = "DashboardRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class C2125a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f110825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f110826b;

            public C2125a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f110825a = obj;
                this.f110826b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, e eVar) {
            this.f110824a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2125a c2125a;
            if (dVar instanceof C2125a) {
                c2125a = (C2125a) dVar;
                int i14 = c2125a.f110826b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2125a.f110826b = i14 - Integer.MIN_VALUE;
                } else {
                    c2125a = new C2125a(dVar);
                }
            } else {
                c2125a = new C2125a(dVar);
            }
            Object obj2 = c2125a.f110825a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2125a.f110826b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j1 j1Var = (j1) obj;
                j70.k.g gVar = new j70.k.g(j1Var.f33241a, j1Var.f33242b);
                a2 a2Var = a2.DASHBOARD;
                String str = "fetchEcg() status[" + gVar.f97591a + "]";
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DashboardRepository", str);
                c2125a.f110826b = 1;
                if (this.f110824a.emit(gVar, c2125a) == aVar) {
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

    public w(r53.i iVar, e eVar) {
        this.f110822a = iVar;
        this.f110823b = eVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.k.g> jVar, t13.d dVar) {
        Object objCollect = this.f110822a.collect(new a(jVar, this.f110823b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
