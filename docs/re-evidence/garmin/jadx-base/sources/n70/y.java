package n70;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements r53.i<List<? extends r70.s>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f124754b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f124756b;

        /* JADX INFO: renamed from: n70.y$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDailyStatsItemsUseCase$invoke$$inlined$map$1$2", f = "GetDailyStatsItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2395a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124758b;

            public C2395a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124757a = obj;
                this.f124758b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, x xVar) {
            this.f124755a = jVar;
            this.f124756b = xVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2395a c2395a;
            if (dVar instanceof C2395a) {
                c2395a = (C2395a) dVar;
                int i14 = c2395a.f124758b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2395a.f124758b = i14 - Integer.MIN_VALUE;
                } else {
                    c2395a = new C2395a(dVar);
                }
            } else {
                c2395a = new C2395a(dVar);
            }
            Object obj2 = c2395a.f124757a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2395a.f124758b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.f fVar = (j70.f) obj;
                ArrayList<j70.b> arrayListA = j70.g.a(fVar);
                ArrayList arrayList = new ArrayList();
                for (j70.b bVar : arrayListA) {
                    o70.t.a aVar2 = o70.t.f130062f;
                    String cardType = bVar.getCardType();
                    aVar2.getClass();
                    o70.t tVarA = o70.t.a.a(cardType);
                    if (tVarA != null) {
                        arrayList.add(tVarA);
                    }
                }
                x xVar = this.f124756b;
                List listA = xVar.f124721b.a(arrayList, (r53.o2) xVar.f124723d.getValue(), (r53.o2) xVar.f124724e.getValue(), new z(xVar));
                String str = "focus = " + fVar.getUserFocus();
                com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar3.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetDailyStatsItemsUseCase", str);
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetDailyStatsItemsUseCase", "dailyStatsConfig = " + fVar.getDailyStatsConfig());
                c2395a.f124758b = 1;
                if (this.f124755a.emit(listA, c2395a) == aVar) {
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

    public y(r53.i iVar, x xVar) {
        this.f124753a = iVar;
        this.f124754b = xVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends r70.s>> jVar, t13.d dVar) {
        Object objCollect = this.f124753a.collect(new a(jVar, this.f124754b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
