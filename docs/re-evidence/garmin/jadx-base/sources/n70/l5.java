package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l5 implements r53.i<j70.d<pb2.e.l>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124388a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124389a;

        /* JADX INFO: renamed from: n70.l5$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetSecondaryStatsItemsUseCase$invoke$lambda$0$$inlined$map$27$2", f = "GetSecondaryStatsItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2369a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124390a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124391b;

            public C2369a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124390a = obj;
                this.f124391b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f124389a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2369a c2369a;
            if (dVar instanceof C2369a) {
                c2369a = (C2369a) dVar;
                int i14 = c2369a.f124391b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2369a.f124391b = i14 - Integer.MIN_VALUE;
                } else {
                    c2369a = new C2369a(dVar);
                }
            } else {
                c2369a = new C2369a(dVar);
            }
            Object obj2 = c2369a.f124390a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2369a.f124391b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.k.f fVar = (j70.k.f) obj;
                pb2.e.l lVar = fVar != null ? fVar.P : null;
                j70.d dVar2 = new j70.d(yz1.e.a(fVar != null ? fVar.f97565a : null, new l4(lVar)), lVar);
                c2369a.f124391b = 1;
                if (this.f124389a.emit(dVar2, c2369a) == aVar) {
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

    public l5(r53.i iVar) {
        this.f124388a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.d<pb2.e.l>> jVar, t13.d dVar) {
        Object objCollect = this.f124388a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
