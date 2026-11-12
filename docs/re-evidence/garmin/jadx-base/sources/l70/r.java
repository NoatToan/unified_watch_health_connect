package l70;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements r53.i<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f110770a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f110771a;

        /* JADX INFO: renamed from: l70.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchCommonStats$$inlined$map$1$2", f = "DashboardRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class C2122a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f110772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f110773b;

            public C2122a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f110772a = obj;
                this.f110773b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f110771a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2122a c2122a;
            if (dVar instanceof C2122a) {
                c2122a = (C2122a) dVar;
                int i14 = c2122a.f110773b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2122a.f110773b = i14 - Integer.MIN_VALUE;
                } else {
                    c2122a = new C2122a(dVar);
                }
            } else {
                c2122a = new C2122a(dVar);
            }
            Object obj2 = c2122a.f110772a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2122a.f110773b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.f fVar = (j70.f) obj;
                List<j70.v> listD = fVar.d();
                j70.c dailyStatsConfig = fVar.getDailyStatsConfig();
                List<j70.b> listD2 = dailyStatsConfig != null ? dailyStatsConfig.d() : null;
                j70.c dailyStatsConfig2 = fVar.getDailyStatsConfig();
                List<j70.b> listG = dailyStatsConfig2 != null ? dailyStatsConfig2.g() : null;
                j70.c dailyStatsConfig3 = fVar.getDailyStatsConfig();
                List<j70.b> listE = dailyStatsConfig3 != null ? dailyStatsConfig3.e() : null;
                j70.c dailyStatsConfig4 = fVar.getDailyStatsConfig();
                List<j70.b> listF = dailyStatsConfig4 != null ? dailyStatsConfig4.f() : null;
                List<j70.b> listF2 = fVar.f();
                List<j70.b> listC = fVar.c();
                j70.c dailyStatsConfig5 = fVar.getDailyStatsConfig();
                s sVar = new s(listD, listD2, listG, listE, listF, listF2, listC, dailyStatsConfig5 != null ? dailyStatsConfig5.c() : null);
                c2122a.f110773b = 1;
                if (this.f110771a.emit(sVar, c2122a) == aVar) {
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

    public r(r53.i iVar) {
        this.f110770a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super s> jVar, t13.d dVar) {
        Object objCollect = this.f110770a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
