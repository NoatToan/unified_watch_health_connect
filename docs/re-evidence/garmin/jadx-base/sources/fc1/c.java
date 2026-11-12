package fc1;

import e32.o;
import g22.k;
import gs1.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.u0;
import r53.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements r53.i<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f70401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70402b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f70403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f70404b;

        /* JADX INFO: renamed from: fc1.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.pulseox.domain.dashboard.GetPulseOxDataUseCase$invoke$$inlined$map$1$2", f = "GetPulseOxDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1443a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f70405a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f70406b;

            public C1443a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f70405a = obj;
                this.f70406b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, b bVar) {
            this.f70403a = jVar;
            this.f70404b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:164:0x02c7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1443a c1443a;
            T next;
            List<? extends List<Long>> listN0;
            List<? extends List<Double>> listN1;
            boolean z14;
            h aVar;
            h hVar;
            int i14;
            i53.d dVarC;
            List<List<Double>> listJ;
            List<List<Long>> listK;
            List<List<Double>> listJ2;
            List<List<Long>> listK2;
            LocalDate localDateB;
            if (dVar instanceof C1443a) {
                c1443a = (C1443a) dVar;
                int i15 = c1443a.f70406b;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c1443a.f70406b = i15 - Integer.MIN_VALUE;
                } else {
                    c1443a = new C1443a(dVar);
                }
            } else {
                c1443a = new C1443a(dVar);
            }
            Object obj2 = c1443a.f70405a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i16 = c1443a.f70406b;
            if (i16 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                b bVar = this.f70404b;
                ae0.b bVar2 = bVar.f70399b;
                Data data = dVar2.f97521b;
                yz1.d dVar3 = dVar2.f97520a;
                List list = (List) data;
                List listA = ae0.b.a(list != null ? (String) h0.e0(0, list) : null, o.f62807j);
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    localDateB = ((hs1.d) next).b();
                } while (!(localDateB != null ? k.g(localDateB, LocalDate.now()) : false));
                hs1.d dVar4 = next;
                List list2 = (List) dVar2.f97521b;
                q.b bVar3 = (q.b) bVar.a(list2 != null ? (String) h0.n0(list2) : null, new f());
                if (bVar3 != null && (listK2 = bVar3.k()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t7 : listK2) {
                        if (((List) t7).size() == 2) {
                            arrayList.add(t7);
                        }
                    }
                }
                if (bVar3 != null && (listJ2 = bVar3.j()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T t14 : listJ2) {
                        if (((List) t14).size() == 2) {
                            arrayList2.add(t14);
                        }
                    }
                }
                if (bVar3 == null || (listK = bVar3.k()) == null) {
                    listN0 = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (T t15 : listK) {
                        Long l14 = (Long) h0.d0((List) t15);
                        DateTime dateTime = new DateTime(l14);
                        if (l14 != null && dateTime.plusDays(1).isAfter(LocalDate.now().toDateTimeAtStartOfDay())) {
                            arrayList3.add(t15);
                        }
                    }
                    listN0 = h0.N0(arrayList3, new d());
                }
                if (bVar3 == null || (listJ = bVar3.j()) == null) {
                    listN1 = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (T t16 : listJ) {
                        Double d14 = (Double) h0.d0((List) t16);
                        Long lValueOf = d14 != null ? Long.valueOf((long) d14.doubleValue()) : null;
                        DateTime dateTime2 = new DateTime(lValueOf);
                        if (lValueOf != null && dateTime2.plusDays(1).isAfter(LocalDate.now().toDateTimeAtStartOfDay())) {
                            arrayList4.add(t16);
                        }
                    }
                    listN1 = h0.N0(arrayList4, new e());
                }
                if (bVar3 != null) {
                    bVar3.q(listN0);
                }
                if (bVar3 != null) {
                    bVar3.o(listN1);
                }
                if (listA.isEmpty()) {
                    z14 = false;
                    break;
                }
                Iterator<T> it3 = listA.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z14 = false;
                        break;
                    }
                    hs1.k pulseOx = ((hs1.d) it3.next()).getPulseOx();
                    if ((pulseOx != null ? pulseOx.getLatestValue() : null) != null) {
                        z14 = true;
                        break;
                    }
                }
                int i17 = b.C1442b.f70400a[i.a(dVar4).ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        i14 = 1;
                        hVar = null;
                    } else {
                        Integer latestSpo2Value = bVar3 != null ? bVar3.getLatestSpo2Value() : null;
                        String latestSpo2ValueReadingTimeLocal = bVar3 != null ? bVar3.getLatestSpo2ValueReadingTimeLocal() : null;
                        i53.g gVarC = b.c(bVar, bVar3 != null ? bVar3.k() : null, bVar3 != null ? bVar3.getStartTimestampGMT() : null);
                        List<List<Double>> listJ3 = bVar3 != null ? bVar3.j() : null;
                        DateTime dateTimeQ = k.q(bVar3 != null ? bVar3.getStartTimestampGMT() : null, "yyyy-MM-dd'T'HH:mm:ss.S", DateTimeZone.UTC);
                        if (listJ3 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            Iterator<T> it4 = listJ3.iterator();
                            while (it4.hasNext()) {
                                List list3 = (List) it4.next();
                                Double d15 = (Double) h0.d0(list3);
                                DateTime dateTime3 = new DateTime(d15 != null ? Long.valueOf((long) d15.doubleValue()) : null, DateTimeZone.UTC);
                                Double d16 = (Double) h0.n0(list3);
                                Iterator<T> it5 = it4;
                                p pVar = d16 != null ? new p(Float.valueOf(Minutes.minutesBetween(dateTimeQ, dateTime3).getMinutes() / 6), Float.valueOf((float) d16.doubleValue())) : null;
                                if (pVar != null) {
                                    arrayList5.add(pVar);
                                }
                                it4 = it5;
                            }
                            dVarC = i53.a.k(u0.l(arrayList5));
                        } else {
                            dVarC = i53.a.c();
                        }
                        aVar = new g(dVar3, latestSpo2Value, latestSpo2ValueReadingTimeLocal, gVarC, dVarC, z14);
                    }
                    c1443a.f70406b = i14;
                    if (this.f70403a.emit(hVar, c1443a) == aVar2) {
                        return aVar2;
                    }
                } else {
                    aVar = new fc1.a(dVar3, bVar3 != null ? bVar3.getLatestSpo2Value() : null, bVar3 != null ? bVar3.getLatestSpo2ValueReadingTimeLocal() : null, b.c(bVar, bVar3 != null ? bVar3.k() : null, bVar3 != null ? bVar3.getStartTimestampGMT() : null), z14);
                }
                hVar = aVar;
                i14 = 1;
                c1443a.f70406b = i14;
                if (this.f70403a.emit(hVar, c1443a) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public c(r53.i iVar, b bVar) {
        this.f70401a = iVar;
        this.f70402b = bVar;
    }

    @Override // r53.i
    public final Object collect(j<? super h> jVar, t13.d dVar) {
        Object objCollect = this.f70401a.collect(new a(jVar, this.f70402b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
