package i71;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements r53.i<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f91959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f91960b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f91961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f91962b;

        /* JADX INFO: renamed from: i71.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingstatus.domain.dashboard.GetTrainingStatusKeyStatsDataUseCase$invoke$$inlined$map$1$2", f = "GetTrainingStatusKeyStatsDataUseCase.kt", l = {65, 50}, m = "emit", v = 2)
        public static final class C1757a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f91963a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f91964b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public r53.j f91966d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public j70.d f91967e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public o61.o f91968f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public o61.n f91969g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Integer f91970h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public x61.e f91971i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public x61.i f91972j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public i41.f f91973k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f91974l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f91975m;

            public C1757a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f91963a = obj;
                this.f91964b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, l lVar) {
            this.f91961a = jVar;
            this.f91962b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:132:0x0238  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:172:0x02f3, code lost:
        
            if (r6.emit(r16, r2) == r3) goto L173;
         */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C1757a c1757a;
            j70.d dVar2;
            o61.n nVarA;
            o61.o oVarB;
            List<i41.f> listB;
            Double dValueOf;
            Double dValueOf2;
            T next;
            int i14;
            r53.j jVar;
            int i15;
            Object objC;
            Integer num;
            x61.e eVar;
            x61.i iVar;
            i41.f fVar;
            int i16;
            Collection<x61.i> collectionValues;
            List listN0;
            q71.a aVarB;
            l lVar;
            com.garmin.android.apps.connectmobile.performance.model.b bVarA;
            com.garmin.android.apps.connectmobile.performance.model.b bVar;
            i41.h hVar;
            if (dVar instanceof C1757a) {
                c1757a = (C1757a) dVar;
                int i17 = c1757a.f91964b;
                if ((i17 & Integer.MIN_VALUE) != 0) {
                    c1757a.f91964b = i17 - Integer.MIN_VALUE;
                } else {
                    c1757a = new C1757a(dVar);
                }
            } else {
                c1757a = new C1757a(dVar);
            }
            Object obj2 = c1757a.f91963a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i18 = c1757a.f91964b;
            l lVar2 = this.f91962b;
            if (i18 != 0) {
                if (i18 == 1) {
                    i14 = c1757a.f91975m;
                    int i19 = c1757a.f91974l;
                    i41.f fVar2 = c1757a.f91973k;
                    x61.i iVar2 = c1757a.f91972j;
                    x61.e eVar2 = c1757a.f91971i;
                    Integer num2 = c1757a.f91970h;
                    nVarA = c1757a.f91969g;
                    oVarB = c1757a.f91968f;
                    dVar2 = c1757a.f91967e;
                    jVar = c1757a.f91966d;
                    o13.r.b(obj2);
                    num = num2;
                    eVar = eVar2;
                    iVar = iVar2;
                    fVar = fVar2;
                    i16 = i19;
                    objC = obj2;
                    i15 = 1;
                } else {
                    if (i18 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj2);
            dVar2 = (j70.d) obj;
            i71.a aVar2 = lVar2.f91977b;
            Data data = dVar2.f97521b;
            List list = (List) data;
            List list2 = (List) data;
            nVarA = aVar2.a(list != null ? (String) h0.e0(0, list) : null, list2 != null ? (String) h0.e0(6, list2) : null);
            oVarB = lVar2.f91978c.b(list2 != null ? (String) h0.e0(1, list2) : null, list2 != null ? (String) h0.e0(6, list2) : null);
            o61.e eVar3 = (o61.e) lVar2.a(list2 != null ? (String) h0.e0(2, list2) : null, new j());
            Map<String, x61.i> mapA = eVar3 != null ? eVar3.a() : null;
            i41.e eVar4 = (i41.e) lVar2.a(list2 != null ? (String) h0.e0(3, list2) : null, new i());
            if (eVar4 == null || (listB = eVar4.b()) == null) {
                listB = j0.f134944a;
            }
            String str = list2 != null ? (String) h0.e0(4, list2) : null;
            a61.e.f1563a.getClass();
            double[] dArrG = a61.e.g();
            o61.p pVar = (o61.p) lVar2.a(str, new k());
            o61.q generic = pVar != null ? pVar.getGeneric() : null;
            o61.p pVar2 = (o61.p) lVar2.a(str, new k());
            o61.q cycling = pVar2 != null ? pVar2.getCycling() : null;
            double d14 = 20.0d;
            if (generic != null) {
                double vo2MaxPreciseValue = generic.getVo2MaxPreciseValue();
                if (vo2MaxPreciseValue < 20.0d) {
                    vo2MaxPreciseValue = 20.0d;
                } else if (vo2MaxPreciseValue > 60.0d) {
                    vo2MaxPreciseValue = 60.0d;
                }
                dValueOf = Double.valueOf(vo2MaxPreciseValue);
            } else {
                dValueOf = null;
            }
            if (cycling != null) {
                double vo2MaxPreciseValue2 = cycling.getVo2MaxPreciseValue();
                if (vo2MaxPreciseValue2 >= 20.0d) {
                    d14 = vo2MaxPreciseValue2 > 60.0d ? 60.0d : vo2MaxPreciseValue2;
                }
                dValueOf2 = Double.valueOf(d14);
            } else {
                dValueOf2 = null;
            }
            if (!(nVarA != null ? nVarA.l() : false) ? dValueOf == null : dValueOf2 != null) {
                dValueOf = dValueOf2;
            }
            Integer numValueOf = (dValueOf == null || (aVarB = a61.e.b(dValueOf.doubleValue(), dArrG)) == null) ? null : Integer.valueOf(aVarB.f143227a);
            x61.e eVar5 = (x61.e) lVar2.a(list2 != null ? (String) h0.e0(5, list2) : null, new h());
            x61.i iVar3 = (mapA == null || (collectionValues = mapA.values()) == null || (listN0 = h0.N0(collectionValues, new g())) == null) ? null : (x61.i) h0.n0(listN0);
            Iterator<T> it = listB.iterator();
            do {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
            } while (!g22.k.g(((i41.f) next).f(), LocalDate.now()));
            i41.f fVar3 = next;
            String strV0 = lVar2.f91979d.V0();
            if (strV0 != null) {
                i14 = strV0.length() > 0 ? 1 : 0;
            } else {
                i14 = 0;
            }
            jVar = this.f91961a;
            c1757a.f91966d = jVar;
            c1757a.f91967e = dVar2;
            c1757a.f91968f = oVarB;
            c1757a.f91969g = nVarA;
            c1757a.f91970h = numValueOf;
            c1757a.f91971i = eVar5;
            c1757a.f91972j = iVar3;
            c1757a.f91973k = fVar3;
            c1757a.f91974l = 0;
            c1757a.f91975m = i14;
            i15 = 1;
            c1757a.f91964b = 1;
            objC = l.c(lVar2, c1757a);
            if (objC != aVar) {
                num = numValueOf;
                eVar = eVar5;
                iVar = iVar3;
                fVar = fVar3;
                i16 = 0;
            }
            return aVar;
            int iIntValue = ((Number) objC).intValue();
            if (i14 == i15) {
                bVar = com.garmin.android.apps.connectmobile.performance.model.b.PAUSE;
                lVar = lVar2;
            } else {
                if (i14 != 0) {
                    u0.r();
                    return null;
                }
                if (nVarA != null) {
                    Double trainingStatus = nVarA.getTrainingStatus();
                    lVar = lVar2;
                    if (trainingStatus != null) {
                        double dDoubleValue = trainingStatus.doubleValue();
                        com.garmin.android.apps.connectmobile.performance.model.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.model.b.f39921h;
                        Boolean bool = Boolean.FALSE;
                        aVar3.getClass();
                        bVarA = com.garmin.android.apps.connectmobile.performance.model.b.a.a(dDoubleValue, bool);
                        if (bVarA == null) {
                            bVarA = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
                        }
                    } else {
                        bVarA = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
                    }
                } else {
                    lVar = lVar2;
                    bVarA = com.garmin.android.apps.connectmobile.performance.model.b.NO_DATA;
                }
                bVar = bVarA;
            }
            yz1.d dVar3 = dVar2.f97520a;
            String sinceDate = nVarA != null ? nVarA.getSinceDate() : null;
            e71.m mVarH = nVarA != null ? nVarA.h() : null;
            x61.c.m mVar = x61.c.f189186c;
            String trainingBalanceFeedbackPhraseKey = iVar != null ? iVar.getTrainingBalanceFeedbackPhraseKey() : null;
            mVar.getClass();
            Integer num3 = x61.c.m.a(trainingBalanceFeedbackPhraseKey).f189188b;
            i53.c<y> cVar = oVarB.f129627a;
            i41.h.a aVar4 = i41.h.f90942e;
            String status = fVar != null ? fVar.getStatus() : null;
            aVar4.getClass();
            i41.h[] hVarArrValues = i41.h.values();
            int length = hVarArrValues.length;
            int i24 = 0;
            while (true) {
                if (i24 >= length) {
                    hVar = null;
                    break;
                }
                hVar = hVarArrValues[i24];
                if (p005kotlin.jvm.internal.s.g(hVar.f90953a, status)) {
                    break;
                }
                i24++;
            }
            if (hVar == null) {
                hVar = i41.h.f90943f;
            }
            x xVar = new x(dVar3, bVar, sinceDate, mVarH, cVar, hVar, (eVar != null ? eVar.getAltitudeTrendKey() : null) != null ? eVar.getAltitudeAcclimationMeters() : null, (eVar != null ? eVar.getHeatTrendKey() : null) != null ? eVar.getHeatAcclimationPercentage() : null, num3, num, lVar.f91979d.g(), oVarB.f129628b, oVarB.f129629c, iIntValue);
            c1757a.f91966d = null;
            c1757a.f91967e = null;
            c1757a.f91968f = null;
            c1757a.f91969g = null;
            c1757a.f91970h = null;
            c1757a.f91971i = null;
            c1757a.f91972j = null;
            c1757a.f91973k = null;
            c1757a.f91974l = i16;
            c1757a.f91964b = 2;
        }
    }

    public f(r53.i iVar, l lVar) {
        this.f91959a = iVar;
        this.f91960b = lVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super x> jVar, t13.d dVar) {
        Object objCollect = this.f91959a.collect(new a(jVar, this.f91960b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
