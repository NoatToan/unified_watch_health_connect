package n70;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements r53.i<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124299a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124300a;

        /* JADX INFO: renamed from: n70.j0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$hasRequiredSectionsForHistoricalDataTurnedOff$$inlined$map$1$2", f = "GetDashboardItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2359a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124302b;

            public C2359a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124301a = obj;
                this.f124302b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f124300a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2359a c2359a;
            List<j70.v> listA;
            if (dVar instanceof C2359a) {
                c2359a = (C2359a) dVar;
                int i14 = c2359a.f124302b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2359a.f124302b = i14 - Integer.MIN_VALUE;
                } else {
                    c2359a = new C2359a(dVar);
                }
            } else {
                c2359a = new C2359a(dVar);
            }
            Object obj2 = c2359a.f124301a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2359a.f124302b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.f fVar = (j70.f) obj;
                List<j70.v> listD = fVar.d();
                if (listD == null || listD.isEmpty()) {
                    o70.f.f129966c.getClass();
                    listA = o70.f.a.a();
                } else {
                    listA = fVar.d();
                }
                Boolean boolValueOf = Boolean.valueOf((listA.contains(new j70.v(o70.f.KEY_STATS.f129989a)) || listA.contains(new j70.v(o70.f.SECONDARY_STATS.f129989a))) ? false : true);
                c2359a.f124302b = 1;
                if (this.f124300a.emit(boolValueOf, c2359a) == aVar) {
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

    public j0(r53.i iVar) {
        this.f124299a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
        Object objCollect = this.f124299a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
