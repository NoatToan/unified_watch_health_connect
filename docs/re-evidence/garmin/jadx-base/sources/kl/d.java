package kl;

import c22.j0;
import gg1.o0;
import o13.r;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements i<jl.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f105195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f105196b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f105197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f105198b;

        /* JADX INFO: renamed from: kl.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.acclimation.dashboard.domain.usecase.GetAltitudeAcclimationDataUseCase$invoke$$inlined$map$1$2", f = "GetAltitudeAcclimationDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2024a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f105199a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f105200b;

            public C2024a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f105199a = obj;
                this.f105200b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, e eVar) {
            this.f105197a = jVar;
            this.f105198b = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2024a c2024a;
            String strK;
            LocalDate localDateD;
            if (dVar instanceof C2024a) {
                c2024a = (C2024a) dVar;
                int i14 = c2024a.f105200b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2024a.f105200b = i14 - Integer.MIN_VALUE;
                } else {
                    c2024a = new C2024a(dVar);
                }
            } else {
                c2024a = new C2024a(dVar);
            }
            Object obj2 = c2024a.f105199a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2024a.f105200b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                yz1.d dVar3 = dVar2.f97520a;
                x61.e eVar = (x61.e) dVar2.f97521b;
                Integer altitudeAcclimationMeters = eVar != null ? eVar.getAltitudeAcclimationMeters() : null;
                Integer currentAltitude = eVar != null ? eVar.getCurrentAltitude() : null;
                Integer altitudeAcclimationPercentage = eVar != null ? eVar.getAltitudeAcclimationPercentage() : null;
                x61.a aVarI = eVar != null ? eVar.i() : null;
                o0 o0VarG = this.f105198b.f105203b.g();
                if (eVar == null || (localDateD = eVar.d()) == null) {
                    strK = null;
                } else {
                    j0.f23099a.getClass();
                    strK = j0.k(localDateD.toDateTimeAtStartOfDay(), 'M');
                }
                jl.a aVar2 = new jl.a(dVar3, altitudeAcclimationMeters, currentAltitude, altitudeAcclimationPercentage, aVarI, o0VarG, strK, eVar != null ? eVar.m() : null);
                c2024a.f105200b = 1;
                if (this.f105197a.emit(aVar2, c2024a) == aVar) {
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

    public d(i iVar, e eVar) {
        this.f105195a = iVar;
        this.f105196b = eVar;
    }

    @Override // r53.i
    public final Object collect(j<? super jl.a> jVar, t13.d dVar) {
        Object objCollect = this.f105195a.collect(new a(jVar, this.f105196b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
