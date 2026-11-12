package wh0;

import c02.n;
import e32.o;
import g22.k;
import hd1.y;
import i53.f;
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
    public final /* synthetic */ i f185247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f185248b;

    /* JADX INFO: renamed from: wh0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3434a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f185249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f185250b;

        /* JADX INFO: renamed from: wh0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.floors.domain.dashboard.GetFloorsDataUseCase$invoke$$inlined$map$1$2", f = "GetFloorsDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C3435a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f185251a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f185252b;

            public C3435a(d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f185251a = obj;
                this.f185252b |= Integer.MIN_VALUE;
                return C3434a.this.emit(null, this);
            }
        }

        public C3434a(j jVar, b bVar) {
            this.f185249a = jVar;
            this.f185250b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0195  */
        /* JADX WARN: Code duplicated, block: B:103:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:104:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:106:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:107:0x01af  */
        /* JADX WARN: Code duplicated, block: B:109:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:110:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:113:0x01d3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            C3435a c3435a;
            T next;
            boolean z14;
            double d14;
            Double d15;
            Integer numD;
            Double d16;
            f fVar;
            a0.a aVar;
            Double d17;
            boolean z15;
            Integer value;
            hs1.j floorsAscended;
            Integer goal;
            hs1.j floorsAscended2;
            hs1.j floorsAscended3;
            Integer value2;
            if (dVar instanceof C3435a) {
                c3435a = (C3435a) dVar;
                int i14 = c3435a.f185252b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3435a.f185252b = i14 - Integer.MIN_VALUE;
                } else {
                    c3435a = new C3435a(dVar);
                }
            } else {
                c3435a = new C3435a(dVar);
            }
            Object obj2 = c3435a.f185251a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3435a.f185252b;
            if (i15 == 0) {
                r.b(obj2);
                j70.j jVar = (j70.j) obj;
                b bVar = this.f185250b;
                ae0.b bVar2 = bVar.f185255b;
                ServerData serverdata = jVar.f97543b;
                RealtimeData realtimedata = jVar.f97544c;
                List list = (List) serverdata;
                List listA = ae0.b.a(list != null ? (String) h0.e0(0, list) : null, o.f62807j);
                ae0.e eVar = bVar.f185256c;
                List list2 = (List) jVar.f97543b;
                zk0.e eVarB = eVar.b(list2 != null ? (String) h0.e0(1, list2) : null);
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!k.g(((hs1.d) next).b(), LocalDate.now()));
                hs1.d dVar2 = next;
                Iterator<T> it3 = listA.iterator();
                int iIntValue = 0;
                while (it3.hasNext()) {
                    hs1.i movement = ((hs1.d) it3.next()).getMovement();
                    iIntValue += (movement == null || (floorsAscended3 = movement.getFloorsAscended()) == null || (value2 = floorsAscended3.getValue()) == null) ? 0 : value2.intValue();
                }
                if (iIntValue > 0) {
                    z14 = true;
                } else {
                    y yVar = (y) realtimedata;
                    if ((yVar != null ? yVar.f83432b : 0) > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (T t7 : listA) {
                    hs1.d dVar3 = (hs1.d) t7;
                    if (s.g(dVar2, dVar3)) {
                        value = b.c(bVar, dVar3, (y) realtimedata);
                    } else {
                        hs1.i movement2 = dVar3.getMovement();
                        value = (movement2 == null || (floorsAscended = movement2.getFloorsAscended()) == null) ? null : floorsAscended.getValue();
                    }
                    if (s.g(dVar2, dVar3)) {
                        goal = b.d(bVar, eVarB, (y) realtimedata);
                    } else {
                        hs1.i movement3 = dVar3.getMovement();
                        goal = (movement3 == null || (floorsAscended2 = movement3.getFloorsAscended()) == null) ? null : floorsAscended2.getGoal();
                    }
                    if ((value == null || goal == null || value.intValue() < goal.intValue()) ? false : true) {
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
                f fVarJ = i53.a.j(arrayList2);
                yz1.d dVar4 = jVar.f97542a;
                y yVar2 = (y) realtimedata;
                Integer numC = b.c(bVar, dVar2, yVar2);
                if (numC != null) {
                    d14 = 0.0d;
                    d15 = new Double(numC.intValue());
                    if (!(d15.doubleValue() >= 0.0d)) {
                    }
                    numD = b.d(bVar, eVarB, yVar2);
                    if (numD != null) {
                        d17 = new Double(numD.intValue());
                        if (d17.doubleValue() >= d14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            d16 = d17;
                        } else {
                            d16 = null;
                        }
                    } else {
                        d16 = null;
                    }
                    if (z14) {
                        fVar = fVarJ;
                    } else {
                        fVar = null;
                    }
                    LocalDate localDateNow = LocalDate.now();
                    localDateNow.getClass();
                    aVar = new a0.a(dVar4, d15, d16, fVar, n.c(localDateNow));
                    c3435a.f185252b = 1;
                    if (this.f185249a.emit(aVar, c3435a) == aVar2) {
                        return aVar2;
                    }
                } else {
                    d14 = 0.0d;
                }
                d15 = null;
                numD = b.d(bVar, eVarB, yVar2);
                if (numD != null) {
                    d17 = new Double(numD.intValue());
                    if (d17.doubleValue() >= d14) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        d16 = d17;
                    } else {
                        d16 = null;
                    }
                } else {
                    d16 = null;
                }
                if (z14) {
                    fVar = fVarJ;
                } else {
                    fVar = null;
                }
                LocalDate localDateNow2 = LocalDate.now();
                localDateNow2.getClass();
                aVar = new a0.a(dVar4, d15, d16, fVar, n.c(localDateNow2));
                c3435a.f185252b = 1;
                if (this.f185249a.emit(aVar, c3435a) == aVar2) {
                    return aVar2;
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
        this.f185247a = iVar;
        this.f185248b = bVar;
    }

    @Override // r53.i
    public final Object collect(j<? super a0.a> jVar, d dVar) {
        Object objCollect = this.f185247a.collect(new C3434a(jVar, this.f185248b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
