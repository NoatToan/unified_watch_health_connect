package h41;

import e32.o;
import g22.k;
import i41.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.r;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.t0;
import p13.y;
import r53.i;
import r53.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f81598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f81599b;

    /* JADX INFO: renamed from: h41.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1618a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f81600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f81601b;

        /* JADX INFO: renamed from: h41.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.overnighthrv.domain.dashboard.GetHrvStatusDataUseCase$invoke$$inlined$map$1$2", f = "GetHrvStatusDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1619a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f81602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f81603b;

            public C1619a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f81602a = obj;
                this.f81603b |= Integer.MIN_VALUE;
                return C1618a.this.emit(null, this);
            }
        }

        public C1618a(j jVar, d dVar) {
            this.f81600a = jVar;
            this.f81601b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:71:0x014a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1619a c1619a;
            List<i41.f> listB;
            T next;
            Integer num;
            h hVar;
            if (dVar instanceof C1619a) {
                c1619a = (C1619a) dVar;
                int i14 = c1619a.f81603b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1619a.f81603b = i14 - Integer.MIN_VALUE;
                } else {
                    c1619a = new C1619a(dVar);
                }
            } else {
                c1619a = new C1619a(dVar);
            }
            Object obj2 = c1619a.f81602a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1619a.f81603b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                String str = (String) dVar2.f97521b;
                d dVar3 = this.f81601b;
                dVar3.getClass();
                i41.e eVar = (i41.e) dVar3.a(str, new c());
                if (eVar == null || (listB = eVar.b()) == null) {
                    listB = j0.f134944a;
                }
                Iterator<T> it = listB.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!k.g(((i41.f) next).f(), LocalDate.now()));
                i41.f fVar = next;
                LocalDate localDateMinusDays = LocalDate.now().minusDays(27);
                ArrayList arrayList = new ArrayList();
                int iA = t0.a(y.r(listB, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (T t7 : listB) {
                    linkedHashMap.put(String.valueOf(((i41.f) t7).f()), t7);
                }
                LocalDate localDateMinusDays2 = LocalDate.now().minusDays(o.f62808k.f62819a - 1);
                localDateMinusDays2.getClass();
                LocalDate localDateNow = LocalDate.now();
                localDateNow.getClass();
                b bVar = new b(arrayList, linkedHashMap, localDateMinusDays);
                while (localDateMinusDays2.compareTo((ReadablePartial) localDateNow) <= 0) {
                    bVar.invoke(localDateMinusDays2);
                    localDateMinusDays2 = localDateMinusDays2.plusDays(1);
                    localDateMinusDays2.getClass();
                }
                x31.a aVar2 = fVar != null ? new e41.a(fVar).f62861a : null;
                if (fVar != null && (lastNightAvg = fVar.getWeeklyAvg()) != null) {
                    num = lastNightAvg;
                } else if (fVar != null) {
                    Integer lastNightAvg = fVar.getLastNightAvg();
                    num = lastNightAvg;
                } else {
                    num = null;
                }
                e eVar2 = fVar == null ? null : fVar.getWeeklyAvg() != null ? e.SEVEN_DAYS : e.OVERNIGHT;
                yz1.d dVar4 = dVar2.f97520a;
                if (aVar2 != null) {
                    switch (i41.i.a.f90958a[aVar2.f188575c.ordinal()]) {
                        case 1:
                            hVar = h.f90945h;
                            break;
                        case 2:
                            hVar = h.f90951n;
                            break;
                        case 3:
                            hVar = h.f90947j;
                            break;
                        case 4:
                            hVar = h.f90946i;
                            break;
                        case 5:
                            hVar = h.f90949l;
                            break;
                        case 6:
                            hVar = h.f90944g;
                            break;
                        case 7:
                            hVar = h.f90950m;
                            break;
                        case 8:
                            hVar = h.f90948k;
                            break;
                        default:
                            hVar = h.f90943f;
                            break;
                    }
                    if (hVar == null) {
                        hVar = h.f90943f;
                    }
                } else {
                    hVar = h.f90943f;
                }
                g gVar = new g(dVar4, hVar, num, eVar2, aVar2 != null ? new Float(aVar2.f188574b) : null, i53.a.j(arrayList));
                c1619a.f81603b = 1;
                if (this.f81600a.emit(gVar, c1619a) == aVar) {
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

    public a(i iVar, d dVar) {
        this.f81598a = iVar;
        this.f81599b = dVar;
    }

    @Override // r53.i
    public final Object collect(j<? super g> jVar, t13.d dVar) {
        Object objCollect = this.f81598a.collect(new C1618a(jVar, this.f81599b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
