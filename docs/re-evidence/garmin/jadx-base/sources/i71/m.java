package i71;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements r53.i<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f91981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f91982b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f91983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f91984b;

        /* JADX INFO: renamed from: i71.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingstatus.domain.dashboard.GetTrainingStatusSecondaryStatsDataUseCase$invoke$$inlined$map$1$2", f = "GetTrainingStatusSecondaryStatsDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1758a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f91985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f91986b;

            public C1758a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f91985a = obj;
                this.f91986b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, n nVar) {
            this.f91983a = jVar;
            this.f91984b = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1758a c1758a;
            com.garmin.android.apps.connectmobile.performance.model.b bVarA;
            if (dVar instanceof C1758a) {
                c1758a = (C1758a) dVar;
                int i14 = c1758a.f91986b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1758a.f91986b = i14 - Integer.MIN_VALUE;
                } else {
                    c1758a = new C1758a(dVar);
                }
            } else {
                c1758a = new C1758a(dVar);
            }
            Object obj2 = c1758a.f91985a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1758a.f91986b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                n nVar = this.f91984b;
                i71.a aVar2 = nVar.f91989b;
                Data data = dVar2.f97521b;
                List list = (List) data;
                boolean z14 = false;
                List list2 = (List) data;
                o61.n nVarA = aVar2.a(list != null ? (String) h0.e0(0, list) : null, list2 != null ? (String) h0.e0(2, list2) : null);
                o61.o oVarB = nVar.f91990c.b(list2 != null ? (String) h0.e0(1, list2) : null, list2 != null ? (String) h0.e0(2, list2) : null);
                String strV0 = nVar.f91991d.V0();
                if (strV0 != null && strV0.length() > 0) {
                    z14 = true;
                }
                if (z14) {
                    bVarA = com.garmin.android.apps.connectmobile.performance.model.b.PAUSE;
                } else {
                    if (z14) {
                        u0.r();
                        return null;
                    }
                    if (nVarA != null) {
                        Double trainingStatus = nVarA.getTrainingStatus();
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
                        bVarA = com.garmin.android.apps.connectmobile.performance.model.b.NO_DATA;
                    }
                }
                w wVar = new w(dVar2.f97520a, bVarA, nVarA != null ? nVarA.getSinceDate() : null, oVarB.f129627a, oVarB.f129628b, oVarB.f129629c);
                c1758a.f91986b = 1;
                if (this.f91983a.emit(wVar, c1758a) == aVar) {
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

    public m(r53.i iVar, n nVar) {
        this.f91981a = iVar;
        this.f91982b = nVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super w> jVar, t13.d dVar) {
        Object objCollect = this.f91981a.collect(new a(jVar, this.f91982b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
