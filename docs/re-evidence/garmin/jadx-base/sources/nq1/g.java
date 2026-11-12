package nq1;

import hd1.e0;
import hd1.i0;
import hd1.q;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yz1.a0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements r53.i<a0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f126928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f126929b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f126930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f126931b;

        /* JADX INFO: renamed from: nq1.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.steps.domain.dashboard.GetStepsDataUseCase$invoke$$inlined$map$1$2", f = "GetStepsDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2443a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f126932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f126933b;

            public C2443a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f126932a = obj;
                this.f126933b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, h hVar) {
            this.f126930a = jVar;
            this.f126931b = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2443a c2443a;
            a0.a aVarE;
            if (dVar instanceof C2443a) {
                c2443a = (C2443a) dVar;
                int i14 = c2443a.f126933b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2443a.f126933b = i14 - Integer.MIN_VALUE;
                } else {
                    c2443a = new C2443a(dVar);
                }
            } else {
                c2443a = new C2443a(dVar);
            }
            Object obj2 = c2443a.f126932a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2443a.f126933b;
            if (i15 == 0) {
                r.b(obj2);
                j70.j jVar = (j70.j) obj;
                ServerData serverdata = jVar.f97543b;
                yz1.d dVar2 = jVar.f97542a;
                List list = (List) serverdata;
                q qVar = (q) jVar.f97544c;
                h hVar = this.f126931b;
                if (hVar.f126937c.B3()) {
                    aVarE = hVar.e(new j70.j(dVar2, list, qVar instanceof e0 ? (e0) qVar : null), new nq1.a(hVar), new b(hVar), new c(hVar));
                } else {
                    aVarE = hVar.e(new j70.j(dVar2, list, qVar instanceof i0 ? (i0) qVar : null), new d(hVar), new e(hVar), new f(hVar));
                }
                c2443a.f126933b = 1;
                if (this.f126930a.emit(aVarE, c2443a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public g(r53.i iVar, h hVar) {
        this.f126928a = iVar;
        this.f126929b = hVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super a0.a> jVar, t13.d dVar) {
        Object objCollect = this.f126928a.collect(new a(jVar, this.f126929b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
