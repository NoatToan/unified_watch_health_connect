package hh0;

import ih0.g;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import t13.d;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<hh0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f83738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f83739b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f83740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f83741b;

        /* JADX INFO: renamed from: hh0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.fitness_age.domain.dashboard.GetFitnessAgeDataUseCase$invoke$$inlined$map$1$2", f = "GetFitnessAgeDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1653a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f83742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f83743b;

            public C1653a(d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f83742a = obj;
                this.f83743b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, c cVar) {
            this.f83740a = jVar;
            this.f83741b = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            C1653a c1653a;
            Boolean boolValueOf;
            List<dh0.d> list;
            List<dh0.d> list2;
            if (dVar instanceof C1653a) {
                c1653a = (C1653a) dVar;
                int i14 = c1653a.f83743b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1653a.f83743b = i14 - Integer.MIN_VALUE;
                } else {
                    c1653a = new C1653a(dVar);
                }
            } else {
                c1653a = new C1653a(dVar);
            }
            Object obj2 = c1653a.f83742a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1653a.f83743b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                String str = (String) dVar2.f97521b;
                c cVar = this.f83741b;
                cVar.getClass();
                dh0.c.Companion companion = dh0.c.INSTANCE;
                dh0.c cVar2 = (dh0.c) cVar.b(str, companion.serializer());
                dh0.c cVar3 = (dh0.c) cVar.b(str, companion.serializer());
                dh0.a aVarI = cVar3 != null ? lg.d.I(cVar3) : null;
                yz1.d dVar3 = dVar2.f97520a;
                Double d14 = aVarI != null ? aVarI.f59543b : null;
                Integer num = aVarI != null ? aVarI.f59542a : null;
                Double d15 = aVarI != null ? aVarI.f59543b : null;
                Double d16 = aVarI != null ? aVarI.f59544c : null;
                if (num == null || d15 == null || d16 == null) {
                    boolValueOf = null;
                } else {
                    double dDoubleValue = d16.doubleValue();
                    double dDoubleValue2 = d15.doubleValue();
                    boolValueOf = Boolean.valueOf(dDoubleValue < dDoubleValue2 && dDoubleValue2 <= ((double) num.intValue()));
                }
                hh0.a aVar2 = new hh0.a(dVar3, d14, (!(boolValueOf != null ? boolValueOf.booleanValue() : false) || ((aVarI == null || (list2 = aVarI.f59546e) == null) ? true : g.b(list2).isEmpty() ^ true)) ? null : d16, cVar.f83746b.u(), cVar2 != null ? cVar2.f59562g : null, (aVarI == null || (list = aVarI.f59546e) == null) ? true : !g.b(list).isEmpty(), aVarI != null ? aVarI.f59549h : null);
                c1653a.f83743b = 1;
                if (this.f83740a.emit(aVar2, c1653a) == aVar) {
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

    public b(i iVar, c cVar) {
        this.f83738a = iVar;
        this.f83739b = cVar;
    }

    @Override // r53.i
    public final Object collect(j<? super hh0.a> jVar, d dVar) {
        Object objCollect = this.f83738a.collect(new a(jVar, this.f83739b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
