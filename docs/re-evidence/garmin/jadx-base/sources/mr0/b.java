package mr0;

import c02.n;
import e32.o;
import g22.k;
import hd1.c0;
import hs1.g;
import i53.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.p;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.t0;
import p13.y;
import r53.i;
import r53.j;
import v13.e;
import vb.h;
import zz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f120340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f120341b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f120342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f120343b;

        /* JADX INFO: renamed from: mr0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.intensityminutes.domain.dashboard.GetIntensityMinutesDataUseCase$invoke$$inlined$map$1$2", f = "GetIntensityMinutesDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2283a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f120344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f120345b;

            public C2283a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f120344a = obj;
                this.f120345b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, c cVar) {
            this.f120342a = jVar;
            this.f120343b = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:117:0x0202  */
        /* JADX WARN: Code duplicated, block: B:31:0x0096  */
        /* JADX WARN: Code duplicated, block: B:59:0x0112  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2283a c2283a;
            List<hs1.d> listN0;
            Integer numValueOf;
            Integer num;
            int iC;
            LocalDate localDateB;
            g intensityMinutes;
            DateTime dateTimeF;
            if (dVar instanceof C2283a) {
                c2283a = (C2283a) dVar;
                int i14 = c2283a.f120345b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2283a.f120345b = i14 - Integer.MIN_VALUE;
                } else {
                    c2283a = new C2283a(dVar);
                }
            } else {
                c2283a = new C2283a(dVar);
            }
            Object obj2 = c2283a.f120344a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2283a.f120345b;
            if (i15 == 0) {
                r.b(obj2);
                j70.j jVar = (j70.j) obj;
                c cVar = this.f120343b;
                ae0.b bVar = cVar.f120348b;
                ServerData serverdata = jVar.f97543b;
                RealtimeData realtimedata = jVar.f97544c;
                List list = (List) serverdata;
                List listA = ae0.b.a(list != null ? (String) h0.e0(0, list) : null, o.f62807j);
                if (listA != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t7 : listA) {
                        LocalDate localDateB2 = ((hs1.d) t7).b();
                        if (localDateB2 != null ? localDateB2.isAfter(LocalDate.now().withDayOfWeek(1).minusDays(1)) : false) {
                            arrayList.add(t7);
                        }
                    }
                    listN0 = h0.N0(arrayList, new mr0.a());
                    if (listN0 == null) {
                        listN0 = j0.f134944a;
                    }
                } else {
                    listN0 = j0.f134944a;
                }
                ae0.e eVar = cVar.f120349c;
                List list2 = (List) jVar.f97543b;
                zk0.e eVarB = eVar.b(list2 != null ? (String) h0.e0(1, list2) : null);
                Iterator<T> it = listN0.iterator();
                int iC2 = 0;
                while (it.hasNext()) {
                    iC2 += c.c(cVar, (hs1.d) it.next());
                }
                Integer num2 = new Integer(iC2);
                c0 c0Var = (c0) realtimedata;
                Integer numValueOf2 = c0Var != null ? Integer.valueOf(c0Var.f83375e) : null;
                if (numValueOf2 != null) {
                    num2 = Integer.valueOf(Math.max(num2.intValue(), numValueOf2.intValue()));
                }
                Integer numValueOf3 = eVarB != null ? Integer.valueOf((int) eVarB.getGoalValue()) : null;
                long millis = (eVarB == null || (dateTimeF = eVarB.f()) == null) ? 0L : dateTimeF.getMillis();
                if (c0Var != null) {
                    int i16 = c0Var.f83376f;
                    numValueOf = Integer.valueOf(i16);
                    if (i16 <= 0) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                long j8 = c0Var != null ? c0Var.f83396a : 0L;
                if (numValueOf3 != null && numValueOf != null) {
                    numValueOf3 = Integer.valueOf(j8 >= millis ? numValueOf.intValue() : numValueOf3.intValue());
                } else if (numValueOf3 == null) {
                    numValueOf3 = numValueOf;
                }
                if (numValueOf3 == null) {
                    hs1.d dVar2 = (hs1.d) h0.n0(listN0);
                    numValueOf3 = (dVar2 == null || (intensityMinutes = dVar2.getIntensityMinutes()) == null) ? null : intensityMinutes.getGoal();
                }
                ArrayList arrayList2 = new ArrayList();
                int iA = t0.a(y.r(listN0, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                int i17 = 0;
                for (hs1.d dVar3 : listN0) {
                    if (k.g(dVar3.b(), LocalDate.now())) {
                        Integer num3 = new Integer(c.c(cVar, dVar3));
                        Integer numValueOf4 = c0Var != null ? Integer.valueOf(c0Var.f83372b) : null;
                        iC = numValueOf4 != null ? Math.max(num3.intValue(), numValueOf4.intValue()) : num3.intValue();
                    } else {
                        iC = c.c(cVar, dVar3);
                    }
                    i17 += iC;
                    if (i17 >= (numValueOf3 != null ? numValueOf3.intValue() : Integer.MAX_VALUE) && (localDateB = dVar3.b()) != null) {
                        arrayList2.add(n.c(localDateB));
                    }
                    p pVar = new p(String.valueOf(dVar3.b()), new Integer(i17));
                    linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                }
                yz1.d dVar4 = jVar.f97542a;
                Integer num4 = num2.intValue() >= 0 ? num2 : null;
                if (numValueOf3 == null) {
                    num = null;
                } else if (numValueOf3.intValue() >= 0) {
                    num = numValueOf3;
                } else {
                    num = null;
                }
                LocalDate localDateNow = LocalDate.now();
                localDateNow.getClass();
                f fVarF = c02.a.f(linkedHashMap, jg.b.A(1, localDateNow), o.f62807j.f62819a);
                f fVarJ = i53.a.j(arrayList2);
                LocalDate localDateNow2 = LocalDate.now();
                localDateNow2.getClass();
                d dVar5 = new d(dVar4, num4, num, fVarF, fVarJ, n.c(localDateNow2));
                c2283a.f120345b = 1;
                if (this.f120342a.emit(dVar5, c2283a) == aVar) {
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
        this.f120340a = iVar;
        this.f120341b = cVar;
    }

    @Override // r53.i
    public final Object collect(j<? super d> jVar, t13.d dVar) {
        Object objCollect = this.f120340a.collect(new a(jVar, this.f120341b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
