package ue1;

import java.util.ArrayList;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f170226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f170227b;

    /* JADX INFO: renamed from: ue1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3179a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f170228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f170229b;

        /* JADX INFO: renamed from: ue1.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.domain.dashboard.GetRunningEconomyDataUseCase$invoke$$inlined$map$1$2", f = "GetRunningEconomyDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C3180a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f170230a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f170231b;

            public C3180a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f170230a = obj;
                this.f170231b |= Integer.MIN_VALUE;
                return C3179a.this.emit(null, this);
            }
        }

        public C3179a(j jVar, b bVar) {
            this.f170228a = jVar;
            this.f170229b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C3180a c3180a;
            if (dVar instanceof C3180a) {
                c3180a = (C3180a) dVar;
                int i14 = c3180a.f170231b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3180a.f170231b = i14 - Integer.MIN_VALUE;
                } else {
                    c3180a = new C3180a(dVar);
                }
            } else {
                c3180a = new C3180a(dVar);
            }
            Object obj2 = c3180a.f170230a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3180a.f170231b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                pb2.e.y yVar = dVar2 != null ? (pb2.e.y) dVar2.f97521b : null;
                pb2.e.n nVar = yVar != null ? yVar.f137113a : null;
                this.f170229b.getClass();
                c cVar = new c(String.valueOf(nVar != null ? nVar.f137075a : null), nVar != null ? Integer.valueOf(nVar.f137076b) : null, nVar != null ? nVar.f137077c : null);
                List<pb2.e.a0> list = yVar != null ? yVar.f137114b : null;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (pb2.e.a0 a0Var : list) {
                        arrayList.add(new d(a0Var.f136968a.toString(), a0Var.f136969b.toString(), a0Var.f136970c, a0Var.f136971d));
                    }
                }
                e eVar = new e(cVar, arrayList);
                c3180a.f170231b = 1;
                if (this.f170228a.emit(eVar, c3180a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public a(i iVar, b bVar) {
        this.f170226a = iVar;
        this.f170227b = bVar;
    }

    @Override // r53.i
    public final Object collect(j<? super e> jVar, t13.d dVar) {
        Object objCollect = this.f170226a.collect(new C3179a(jVar, this.f170227b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
