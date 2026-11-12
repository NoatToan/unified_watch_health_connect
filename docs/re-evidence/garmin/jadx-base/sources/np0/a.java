package np0;

import c02.n;
import e32.o;
import g22.k;
import hs1.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import r53.i;
import r53.j;
import t13.d;
import v13.c;
import v13.e;
import vb.h;
import yz1.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<a0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f126833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f126834b;

    /* JADX INFO: renamed from: np0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2441a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f126835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f126836b;

        /* JADX INFO: renamed from: np0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.hydration.domain.dashboard.GetHydrationDataUseCase$invoke$$inlined$map$1$2", f = "GetHydrationDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2442a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f126837a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f126838b;

            public C2442a(d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f126837a = obj;
                this.f126838b |= Integer.MIN_VALUE;
                return C2441a.this.emit(null, this);
            }
        }

        public C2441a(j jVar, b bVar) {
            this.f126835a = jVar;
            this.f126836b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            C2442a c2442a;
            T next;
            Double d14;
            f hydration;
            f hydration2;
            Double goalInFractionalMl;
            Double consumedInFractionalMl;
            if (dVar instanceof C2442a) {
                c2442a = (C2442a) dVar;
                int i14 = c2442a.f126838b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2442a.f126838b = i14 - Integer.MIN_VALUE;
                } else {
                    c2442a = new C2442a(dVar);
                }
            } else {
                c2442a = new C2442a(dVar);
            }
            Object obj2 = c2442a.f126837a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2442a.f126838b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                b bVar = this.f126836b;
                ae0.b bVar2 = bVar.f126841b;
                List list = (List) dVar2.f97521b;
                List listA = ae0.b.a(list != null ? (String) h0.e0(0, list) : null, o.f62807j);
                ae0.e eVar = bVar.f126842c;
                List list2 = (List) dVar2.f97521b;
                zk0.e eVarB = eVar.b(list2 != null ? (String) h0.e0(1, list2) : null);
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!k.g(((hs1.d) next).b(), LocalDate.now()));
                hs1.d dVar3 = next;
                Iterator<T> it3 = listA.iterator();
                double dDoubleValue = 0.0d;
                while (it3.hasNext()) {
                    f hydration3 = ((hs1.d) it3.next()).getHydration();
                    dDoubleValue += (hydration3 == null || (consumedInFractionalMl = hydration3.getConsumedInFractionalMl()) == null) ? 0.0d : consumedInFractionalMl.doubleValue();
                }
                boolean z14 = dDoubleValue > 0.0d;
                ArrayList arrayList = new ArrayList();
                for (T t7 : listA) {
                    hs1.d dVar4 = (hs1.d) t7;
                    f hydration4 = dVar4.getHydration();
                    Double consumedInFractionalMl2 = hydration4 != null ? hydration4.getConsumedInFractionalMl() : null;
                    if (!s.g(dVar3, dVar4)) {
                        f hydration5 = dVar4.getHydration();
                        if (hydration5 != null) {
                            goalInFractionalMl = hydration5.getGoalInFractionalMl();
                        } else {
                            goalInFractionalMl = null;
                        }
                    } else if (eVarB != null) {
                        goalInFractionalMl = new Double(eVarB.getGoalValue());
                    } else {
                        goalInFractionalMl = null;
                    }
                    if (consumedInFractionalMl2 != null && goalInFractionalMl != null && consumedInFractionalMl2.doubleValue() >= goalInFractionalMl.doubleValue()) {
                        arrayList.add(t7);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    LocalDate localDateB = ((hs1.d) it4.next()).b();
                    c02.c cVarC = localDateB != null ? n.c(localDateB) : null;
                    if (cVarC != null) {
                        arrayList2.add(cVarC);
                    }
                }
                i53.f fVarJ = i53.a.j(arrayList2);
                yz1.d dVar5 = dVar2.f97520a;
                Double consumedInFractionalMl3 = (dVar3 == null || (hydration2 = dVar3.getHydration()) == null) ? null : hydration2.getConsumedInFractionalMl();
                if (dVar3 != null && (hydration = dVar3.getHydration()) != null && (d = hydration.getGoalInFractionalMl()) != null) {
                    d14 = d;
                } else if (eVarB != null) {
                    Double d15 = new Double(eVarB.getGoalValue());
                    d14 = d15;
                } else {
                    d14 = null;
                }
                i53.f fVar = z14 ? fVarJ : null;
                LocalDate localDateNow = LocalDate.now();
                localDateNow.getClass();
                a0.a aVar2 = new a0.a(dVar5, consumedInFractionalMl3, d14, fVar, n.c(localDateNow));
                c2442a.f126838b = 1;
                if (this.f126835a.emit(aVar2, c2442a) == aVar) {
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

    public a(i iVar, b bVar) {
        this.f126833a = iVar;
        this.f126834b = bVar;
    }

    @Override // r53.i
    public final Object collect(j<? super a0.a> jVar, d dVar) {
        Object objCollect = this.f126833a.collect(new C2441a(jVar, this.f126834b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
