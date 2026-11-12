package kl;

import c22.j0;
import o13.r;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements i<jl.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f105204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f105205b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f105206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f105207b;

        /* JADX INFO: renamed from: kl.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.acclimation.dashboard.domain.usecase.GetHeatAcclimationDataUseCase$invoke$$inlined$map$1$2", f = "GetHeatAcclimationDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2025a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f105208a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f105209b;

            public C2025a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f105208a = obj;
                this.f105209b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, g gVar) {
            this.f105206a = jVar;
            this.f105207b = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2025a c2025a;
            String strK;
            LocalDate localDateR;
            if (dVar instanceof C2025a) {
                c2025a = (C2025a) dVar;
                int i14 = c2025a.f105209b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2025a.f105209b = i14 - Integer.MIN_VALUE;
                } else {
                    c2025a = new C2025a(dVar);
                }
            } else {
                c2025a = new C2025a(dVar);
            }
            Object obj2 = c2025a.f105208a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2025a.f105209b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                yz1.d dVar3 = dVar2.f97520a;
                x61.e eVar = (x61.e) dVar2.f97521b;
                Integer heatAcclimationPercentage = eVar != null ? eVar.getHeatAcclimationPercentage() : null;
                x61.a aVarT = eVar != null ? eVar.t() : null;
                Integer previousHeatAcclimationPercentage = eVar != null ? eVar.getPreviousHeatAcclimationPercentage() : null;
                if (eVar == null || (localDateR = eVar.r()) == null) {
                    strK = null;
                } else {
                    j0.f23099a.getClass();
                    strK = j0.k(localDateR.toDateTimeAtStartOfDay(), 'M');
                }
                jl.b bVar = new jl.b(dVar3, heatAcclimationPercentage, aVarT, previousHeatAcclimationPercentage, strK, this.f105207b.f105212b.y(), eVar != null ? eVar.m() : null);
                c2025a.f105209b = 1;
                if (this.f105206a.emit(bVar, c2025a) == aVar) {
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

    public f(i iVar, g gVar) {
        this.f105204a = iVar;
        this.f105205b = gVar;
    }

    @Override // r53.i
    public final Object collect(j<? super jl.b> jVar, t13.d dVar) {
        Object objCollect = this.f105204a.collect(new a(jVar, this.f105205b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
