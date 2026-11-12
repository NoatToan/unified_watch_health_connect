package n70;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 implements r53.i<List<? extends o70.t>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124247a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124248a;

        /* JADX INFO: renamed from: n70.h0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$getDashboardSecondaryStats$$inlined$map$1$2", f = "GetDashboardItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2354a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124249a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124250b;

            public C2354a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124249a = obj;
                this.f124250b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f124248a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2354a c2354a;
            if (dVar instanceof C2354a) {
                c2354a = (C2354a) dVar;
                int i14 = c2354a.f124250b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2354a.f124250b = i14 - Integer.MIN_VALUE;
                } else {
                    c2354a = new C2354a(dVar);
                }
            } else {
                c2354a = new C2354a(dVar);
            }
            Object obj2 = c2354a.f124249a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2354a.f124250b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.f fVar = (j70.f) obj;
                j70.c dailyStatsConfig = fVar.getDailyStatsConfig();
                List<j70.b> listG = dailyStatsConfig != null ? dailyStatsConfig.g() : null;
                if (listG == null) {
                    listG = p13.j0.f134944a;
                }
                if (listG.isEmpty()) {
                    j70.c dailyStatsConfig2 = fVar.getDailyStatsConfig();
                    List<j70.b> listF = dailyStatsConfig2 != null ? dailyStatsConfig2.f() : null;
                    if (listF == null) {
                        listF = p13.j0.f134944a;
                    }
                    listG = p13.h0.S0(listF, 4);
                }
                ArrayList arrayList = new ArrayList();
                for (j70.b bVar : listG) {
                    o70.t.a aVar2 = o70.t.f130062f;
                    String cardType = bVar.getCardType();
                    aVar2.getClass();
                    o70.t tVarA = o70.t.a.a(cardType);
                    if (tVarA != null) {
                        arrayList.add(tVarA);
                    }
                }
                c2354a.f124250b = 1;
                if (this.f124248a.emit(arrayList, c2354a) == aVar) {
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

    public h0(r53.i iVar) {
        this.f124247a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends o70.t>> jVar, t13.d dVar) {
        Object objCollect = this.f124247a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
