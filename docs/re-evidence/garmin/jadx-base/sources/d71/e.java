package d71;

import e32.o;
import e71.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.p;
import o13.r;
import o61.n;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements r53.i<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f58144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f58145b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f58146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f58147b;

        /* JADX INFO: renamed from: d71.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingload.domain.dashboard.GetTrainingLoadDataUseCase$invoke$$inlined$map$1$2", f = "GetTrainingLoadDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1240a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f58148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f58149b;

            public C1240a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f58148a = obj;
                this.f58149b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, h hVar) {
            this.f58146a = jVar;
            this.f58147b = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
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
            C1240a c1240a;
            List<n> listA;
            m nVar;
            boolean z14;
            j bVar;
            Double dK;
            o61.a acuteTrainingLoad;
            o61.a acuteTrainingLoad2;
            Double dK2;
            if (dVar instanceof C1240a) {
                c1240a = (C1240a) dVar;
                int i14 = c1240a.f58149b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1240a.f58149b = i14 - Integer.MIN_VALUE;
                } else {
                    c1240a = new C1240a(dVar);
                }
            } else {
                c1240a = new C1240a(dVar);
            }
            Object obj2 = c1240a.f58148a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1240a.f58149b;
            Object num = null;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                List list = (List) dVar2.f97521b;
                String str = list != null ? (String) h0.d0(list) : null;
                h hVar = this.f58147b;
                hVar.getClass();
                o61.f fVar = (o61.f) hVar.a(str, new g());
                List list2 = (List) dVar2.f97521b;
                j71.a aVar2 = (j71.a) hVar.a(list2 != null ? (String) h0.n0(list2) : null, new f());
                if (aVar2 == null || (listA = aVar2.a()) == null) {
                    listA = j0.f134944a;
                }
                n nVarA = fVar != null ? fVar.a() : null;
                if (nVarA == null || (nVar = nVarA.h()) == null) {
                    nVar = new e71.n();
                }
                int iA = t0.a(y.r(listA, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (n nVar2 : listA) {
                    p pVar = new p(nVar2.d().toString(), nVar2.k());
                    linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                }
                int iA2 = t0.a(y.r(listA, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                for (n nVar3 : listA) {
                    p pVar2 = new p(nVar3.d().toString(), new p(nVar3.c(), nVar3.b()));
                    linkedHashMap2.put(pVar2.f128594a, pVar2.f128595b);
                }
                ArrayList arrayList = new ArrayList();
                for (T t7 : listA) {
                    if (((n) t7).d().isAfter(LocalDate.now().minusDays(o.f62807j.f62819a))) {
                        arrayList.add(t7);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                    Iterator<T> it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z14 = false;
                            break;
                        }
                        if (((n) it.next()).k() != null) {
                            z14 = true;
                            break;
                        }
                    }
                } else {
                    z14 = false;
                    break;
                }
                o61.a acuteTrainingLoad3 = nVarA != null ? nVarA.getAcuteTrainingLoad() : null;
                yz1.d dVar3 = dVar2.f97520a;
                if (acuteTrainingLoad3 != null) {
                    Integer num2 = (nVarA == null || (dK2 = nVarA.k()) == null) ? null : new Integer(MathKt.b(dK2.doubleValue()));
                    Integer num3 = nVar.f63321a;
                    Integer dailyTrainingLoadChronic = (nVarA == null || (acuteTrainingLoad2 = nVarA.getAcuteTrainingLoad()) == null) ? null : acuteTrainingLoad2.getDailyTrainingLoadChronic();
                    if (nVarA != null && (acuteTrainingLoad = nVarA.getAcuteTrainingLoad()) != null) {
                        num = acuteTrainingLoad.getDailyAcuteChronicWorkloadRatio();
                    }
                    bVar = new j.a(dVar3, num2, dailyTrainingLoadChronic, num, num3, z14);
                } else {
                    if (nVarA != null && (dK = nVarA.k()) != null) {
                        num = new Integer(MathKt.b(dK.doubleValue()));
                    }
                    Integer num4 = num;
                    Integer num5 = nVar.f63321a;
                    LocalDate localDateNow = LocalDate.now();
                    localDateNow.getClass();
                    o oVar = o.f62808k;
                    i53.f fVarF = c02.a.f(linkedHashMap, localDateNow, oVar.f62819a);
                    LocalDate localDateNow2 = LocalDate.now();
                    localDateNow2.getClass();
                    LocalDate localDateMinusDays = localDateNow2.minusDays(oVar.f62819a - 1);
                    ArrayList arrayList3 = new ArrayList();
                    localDateMinusDays.getClass();
                    while (localDateMinusDays.compareTo((ReadablePartial) localDateNow2) <= 0) {
                        arrayList3.add(linkedHashMap2.get(localDateMinusDays.toString()));
                        Unit unit = Unit.INSTANCE;
                        localDateMinusDays = localDateMinusDays.plusDays(1);
                        localDateMinusDays.getClass();
                    }
                    bVar = new j.b(dVar3, num4, num5, fVarF, i53.a.j(arrayList3), z14);
                }
                c1240a.f58149b = 1;
                if (this.f58146a.emit(bVar, c1240a) == aVar) {
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

    public e(r53.i iVar, h hVar) {
        this.f58144a = iVar;
        this.f58145b = hVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j> jVar, t13.d dVar) {
        Object objCollect = this.f58144a.collect(new a(jVar, this.f58145b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
