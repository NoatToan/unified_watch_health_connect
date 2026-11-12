package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d1 implements r53.i<j70.d<o13.p<? extends ff2.a, ? extends o4.v0>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124124a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124125a;

        /* JADX INFO: renamed from: n70.d1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$lambda$0$0$$inlined$map$2$2", f = "GetDashboardItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2340a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124126a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124127b;

            public C2340a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124126a = obj;
                this.f124127b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f124125a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2340a c2340a;
            yz1.d dVar2;
            if (dVar instanceof C2340a) {
                c2340a = (C2340a) dVar;
                int i14 = c2340a.f124127b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2340a.f124127b = i14 - Integer.MIN_VALUE;
                } else {
                    c2340a = new C2340a(dVar);
                }
            } else {
                c2340a = new C2340a(dVar);
            }
            Object obj2 = c2340a.f124126a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2340a.f124127b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.k.a aVar2 = (j70.k.a) obj;
                if (aVar2 == null || (dVar2 = aVar2.f97545a) == null) {
                    dVar2 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                }
                j70.d dVar3 = new j70.d(dVar2, aVar2 != null ? aVar2.f97546b : null);
                c2340a.f124127b = 1;
                if (this.f124125a.emit(dVar3, c2340a) == aVar) {
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

    public d1(r53.i iVar) {
        this.f124124a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.d<o13.p<? extends ff2.a, ? extends o4.v0>>> jVar, t13.d dVar) {
        Object objCollect = this.f124124a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
