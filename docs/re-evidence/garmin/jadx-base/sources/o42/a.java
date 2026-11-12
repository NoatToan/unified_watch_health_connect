package o42;

import c22.l3;
import java.util.List;
import o13.r;
import org.joda.time.DateTimeUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import r53.i;
import r53.j;
import vb.h;
import zk0.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f129073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f129074b;

    /* JADX INFO: renamed from: o42.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2472a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f129075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f129076b;

        /* JADX INFO: renamed from: o42.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.domain.dashboard.GetWeightDataUseCase$invoke$$inlined$map$1$2", f = "GetWeightDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2473a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f129077a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f129078b;

            public C2473a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f129077a = obj;
                this.f129078b |= Integer.MIN_VALUE;
                return C2472a.this.emit(null, this);
            }
        }

        public C2472a(j jVar, d dVar) {
            this.f129075a = jVar;
            this.f129076b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2473a c2473a;
            long j8;
            Double d14;
            Double weight;
            Double d15;
            Double d16;
            Double d17;
            Double d18;
            Double d19;
            Double weightDelta;
            Double weight2;
            if (dVar instanceof C2473a) {
                c2473a = (C2473a) dVar;
                int i14 = c2473a.f129078b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2473a.f129078b = i14 - Integer.MIN_VALUE;
                } else {
                    c2473a = new C2473a(dVar);
                }
            } else {
                c2473a = new C2473a(dVar);
            }
            Object obj2 = c2473a.f129077a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2473a.f129078b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                Data data = dVar2.f97521b;
                List list = (List) data;
                String str = list != null ? (String) h0.e0(0, list) : null;
                d dVar3 = this.f129076b;
                dVar3.getClass();
                l42.c cVar = (l42.c) dVar3.a(str, new b());
                long jM = cVar != null ? cVar.m() : 0L;
                List list2 = (List) data;
                f fVar = (f) dVar3.a(list2 != null ? (String) h0.e0(1, list2) : null, new c());
                zk0.e eVarB = dVar3.f129081b.b(list2 != null ? (String) h0.e0(2, list2) : null);
                if ((cVar != null ? cVar.getBmi() : null) == null || s.c(cVar.getBmi(), 0.0d)) {
                    String sourceType = cVar != null ? cVar.getSourceType() : null;
                    k42.b bVar = k42.b.f102880a;
                    if ("INDEX_SCALE".equals(sourceType)) {
                        j8 = 0;
                        if (cVar != null) {
                            d14 = cVar.getBmi();
                        } else {
                            d14 = null;
                        }
                    } else {
                        l3.a aVar2 = l3.f23124b;
                        double dDoubleValue = (cVar == null || (weight = cVar.getWeight()) == null) ? 0.0d : weight.doubleValue();
                        aVar2.getClass();
                        j8 = 0;
                        d14 = new Double(k42.b.b(l3.a.P1(dDoubleValue)));
                    }
                } else {
                    j8 = 0;
                    if (cVar != null) {
                        d14 = cVar.getBmi();
                    } else {
                        d14 = null;
                    }
                }
                Double d24 = (d14 == null || d14.doubleValue() <= 0.0d) ? null : d14;
                yz1.d dVar4 = dVar2.f97520a;
                if (cVar == null || (weight2 = cVar.getWeight()) == null) {
                    d15 = null;
                } else {
                    double dDoubleValue2 = weight2.doubleValue();
                    l3.f23124b.getClass();
                    d15 = new Double(l3.a.P1(dDoubleValue2));
                }
                if (cVar == null || (weightDelta = cVar.getWeightDelta()) == null) {
                    d16 = null;
                } else {
                    double dDoubleValue3 = weightDelta.doubleValue();
                    l3.f23124b.getClass();
                    d16 = new Double(l3.a.P1(dDoubleValue3));
                }
                if (jM <= j8) {
                    jM = DateTimeUtils.currentTimeMillis();
                }
                long j14 = jM;
                if (eVarB != null) {
                    double goalValue = eVarB.getGoalValue();
                    l3.f23124b.getClass();
                    d17 = new Double(l3.a.P1(goalValue));
                } else {
                    d17 = null;
                }
                if (fVar != null) {
                    double highWeightGoal = fVar.getHighWeightGoal();
                    l3.f23124b.getClass();
                    d18 = new Double(l3.a.P1(highWeightGoal));
                } else {
                    d18 = null;
                }
                if (fVar != null) {
                    double lowWeightGoal = fVar.getLowWeightGoal();
                    l3.f23124b.getClass();
                    d19 = new Double(l3.a.P1(lowWeightGoal));
                } else {
                    d19 = null;
                }
                e eVar = new e(dVar4, d15, d16, j14, d17, d24, d18, d19);
                c2473a.f129078b = 1;
                if (this.f129075a.emit(eVar, c2473a) == aVar) {
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

    public a(i iVar, d dVar) {
        this.f129073a = iVar;
        this.f129074b = dVar;
    }

    @Override // r53.i
    public final Object collect(j<? super e> jVar, t13.d dVar) {
        Object objCollect = this.f129073a.collect(new C2472a(jVar, this.f129074b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
