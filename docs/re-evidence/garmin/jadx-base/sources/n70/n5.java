package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n5 implements r53.i<j70.d<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124436a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124437a;

        /* JADX INFO: renamed from: n70.n5$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetSecondaryStatsItemsUseCase$invoke$lambda$0$$inlined$map$4$2", f = "GetSecondaryStatsItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2372a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124438a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124439b;

            public C2372a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124438a = obj;
                this.f124439b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f124437a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2372a c2372a;
            if (dVar instanceof C2372a) {
                c2372a = (C2372a) dVar;
                int i14 = c2372a.f124439b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2372a.f124439b = i14 - Integer.MIN_VALUE;
                } else {
                    c2372a = new C2372a(dVar);
                }
            } else {
                c2372a = new C2372a(dVar);
            }
            Object obj2 = c2372a.f124438a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2372a.f124439b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.k.f fVar = (j70.k.f) obj;
                String str = fVar != null ? fVar.f97590z : null;
                j70.d dVar2 = new j70.d(yz1.e.a(fVar != null ? fVar.f97565a : null, new m4(str)), str);
                c2372a.f124439b = 1;
                if (this.f124437a.emit(dVar2, c2372a) == aVar) {
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

    public n5(r53.i iVar) {
        this.f124436a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.d<String>> jVar, t13.d dVar) {
        Object objCollect = this.f124436a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
