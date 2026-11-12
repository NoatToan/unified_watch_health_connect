package or1;

import g22.k;
import hs1.m;
import hs1.o;
import i53.f;
import j23.l;
import j70.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n70.t1;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.i;
import r53.j;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f133406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ or1.a f133407b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f133408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ or1.a f133409b;

        /* JADX INFO: renamed from: or1.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.stress.domain.dashboard.GetStressDataUseCase$invoke$$inlined$map$1$2", f = "GetStressDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2535a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f133410a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f133411b;

            public C2535a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f133410a = obj;
                this.f133411b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, or1.a aVar) {
            this.f133408a = jVar;
            this.f133409b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2535a c2535a;
            T next;
            boolean z14;
            m stress;
            Long highStressDurationInMillis;
            m stress2;
            Long mediumStressDurationInMillis;
            m stress3;
            Long lowStressDurationInMillis;
            m stress4;
            Long restDurationInMillis;
            m stress5;
            o wellnessChronology;
            if (dVar instanceof C2535a) {
                c2535a = (C2535a) dVar;
                int i14 = c2535a.f133411b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2535a.f133411b = i14 - Integer.MIN_VALUE;
                } else {
                    c2535a = new C2535a(dVar);
                }
            } else {
                c2535a = new C2535a(dVar);
            }
            Object obj2 = c2535a.f133410a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2535a.f133411b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                or1.a aVar2 = this.f133409b;
                ae0.b bVar = aVar2.f133404b;
                List list = (List) dVar2.f97521b;
                List listA = ae0.b.a(list != null ? (String) h0.e0(0, list) : null, e32.o.f62807j);
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!k.g(((hs1.d) next).b(), LocalDate.now()));
                hs1.d dVar3 = next;
                t1 t1Var = aVar2.f133405c;
                List list2 = (List) dVar2.f97521b;
                Map<String, Double> map = ((p.a) t1Var.b(list2 != null ? (String) h0.e0(1, list2) : null)).f97617a;
                DateTime dateTimeC = (dVar3 == null || (wellnessChronology = dVar3.getWellnessChronology()) == null) ? null : wellnessChronology.c();
                yz1.d dVar4 = dVar2.f97520a;
                Integer avgLevel = (dVar3 == null || (stress5 = dVar3.getStress()) == null) ? null : stress5.getAvgLevel();
                long j8 = 1000;
                int iLongValue = (int) (((dVar3 == null || (stress4 = dVar3.getStress()) == null || (restDurationInMillis = stress4.getRestDurationInMillis()) == null) ? 0L : restDurationInMillis.longValue()) / j8);
                long jLongValue = (dVar3 == null || (stress3 = dVar3.getStress()) == null || (lowStressDurationInMillis = stress3.getLowStressDurationInMillis()) == null) ? 0L : lowStressDurationInMillis.longValue();
                C2535a c2535a2 = c2535a;
                int i16 = (int) (jLongValue / j8);
                DateTime dateTime = dateTimeC;
                int iLongValue2 = (int) (((dVar3 == null || (stress2 = dVar3.getStress()) == null || (mediumStressDurationInMillis = stress2.getMediumStressDurationInMillis()) == null) ? 0L : mediumStressDurationInMillis.longValue()) / j8);
                int iLongValue3 = (int) (((dVar3 == null || (stress = dVar3.getStress()) == null || (highStressDurationInMillis = stress.getHighStressDurationInMillis()) == null) ? 0L : highStressDurationInMillis.longValue()) / j8);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Double> entry : map.entrySet()) {
                    Double value = entry.getValue();
                    u13.a aVar3 = aVar;
                    Integer num = value != null ? new Integer((int) value.doubleValue()) : null;
                    int i17 = i16;
                    l lVar = new l(0, 25);
                    if (num != null && lVar.d(num.intValue())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                    aVar = aVar3;
                    i16 = i17;
                }
                int i18 = i16;
                u13.a aVar4 = aVar;
                int i19 = 481;
                f fVarA = c.a(linkedHashMap, dateTime, 481, 3);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Double> entry2 : map.entrySet()) {
                    Double value2 = entry2.getValue();
                    int i24 = iLongValue2;
                    Integer num2 = value2 != null ? new Integer((int) value2.doubleValue()) : null;
                    l lVar2 = new l(26, 100);
                    if (num2 != null && lVar2.d(num2.intValue())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                    iLongValue2 = i24;
                    i19 = 481;
                }
                int i25 = iLongValue2;
                f fVarA2 = c.a(linkedHashMap2, dateTime, i19, 3);
                if (!listA.isEmpty() && !listA.isEmpty()) {
                    Iterator<T> it3 = listA.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z14 = false;
                            break;
                        }
                        if (((hs1.d) it3.next()).getStress() != null) {
                            z14 = true;
                            break;
                        }
                    }
                } else {
                    z14 = false;
                    break;
                }
                d dVar5 = new d(dVar4, avgLevel, iLongValue, i18, i25, iLongValue3, fVarA2, fVarA, z14);
                c2535a2.f133411b = 1;
                if (this.f133408a.emit(dVar5, c2535a2) == aVar4) {
                    return aVar4;
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

    public b(i iVar, or1.a aVar) {
        this.f133406a = iVar;
        this.f133407b = aVar;
    }

    @Override // r53.i
    public final Object collect(j<? super d> jVar, t13.d dVar) {
        Object objCollect = this.f133406a.collect(new a(jVar, this.f133407b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
