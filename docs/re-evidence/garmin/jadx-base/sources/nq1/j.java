package nq1;

import f12.l;
import hd1.e0;
import hd1.i0;
import hd1.q;
import hs1.o;
import j70.n;
import j70.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import n70.t1;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements r53.i<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f126943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f126944b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f126945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f126946b;

        /* JADX INFO: renamed from: nq1.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.steps.domain.dashboard.GetStepsKeyStatsDataUseCase$invoke$$inlined$map$1$2", f = "GetStepsKeyStatsDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2444a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f126947a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f126948b;

            public C2444a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f126947a = obj;
                this.f126948b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, i iVar) {
            this.f126945a = jVar;
            this.f126946b = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:246:0x03be  */
        /* JADX WARN: Code duplicated, block: B:247:0x03ca  */
        /* JADX WARN: Code duplicated, block: B:249:0x03cd  */
        /* JADX WARN: Code duplicated, block: B:251:0x03e2  */
        /* JADX WARN: Code duplicated, block: B:254:0x040b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2444a c2444a;
            Iterable iterableI0;
            String str;
            T next;
            String str2;
            Integer value;
            hs1.i movement;
            hs1.j pushes;
            Integer goal;
            Integer numValueOf;
            hs1.i movement2;
            hs1.j pushes2;
            hs1.i movement3;
            hs1.j pushes3;
            Iterable iterable;
            String str3;
            T next2;
            n91.a aVar;
            i53.f fVar;
            Double d14;
            Double d15;
            i53.c cVarB;
            k kVar;
            Double d16;
            String str4;
            Double d17;
            int iNextIndex;
            hs1.i movement4;
            hs1.i movement5;
            hs1.j steps;
            hs1.i movement6;
            hs1.j steps2;
            o wellnessChronology;
            if (dVar instanceof C2444a) {
                c2444a = (C2444a) dVar;
                int i14 = c2444a.f126948b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2444a.f126948b = i14 - Integer.MIN_VALUE;
                } else {
                    c2444a = new C2444a(dVar);
                }
            } else {
                c2444a = new C2444a(dVar);
            }
            Object obj2 = c2444a.f126947a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2444a.f126948b;
            if (i15 == 0) {
                r.b(obj2);
                j70.j jVar = (j70.j) obj;
                l.f68084a.getClass();
                boolean zB3 = l.a.a().B3();
                t1 t1Var = new t1(!zB3 ? n.STEPS : n.PUSHES);
                yz1.d dVar2 = jVar.f97542a;
                RealtimeData realtimedata = jVar.f97544c;
                ServerData serverdata = jVar.f97543b;
                i iVar = this.f126946b;
                ae0.b bVar = iVar.f126939b;
                ae0.f fVar2 = iVar.f126941d;
                List list = (List) serverdata;
                List listA = ae0.b.a(list != null ? (String) h0.e0(0, list) : null, e32.o.f62807j);
                Map<String, Double> map = ((p.a) t1Var.b(list != null ? (String) h0.e0(1, list) : null)).f97617a;
                n91.a[] aVarArr = (n91.a[]) iVar.f126940c.a((String) u.L(0, new String[]{list != null ? (String) h0.e0(2, list) : null}), new ae0.c());
                if (aVarArr == null || (iterableI0 = u.i0(aVarArr)) == null) {
                    iterableI0 = j0.f134944a;
                }
                String str5 = list != null ? (String) h0.e0(3, list) : null;
                String str6 = list != null ? (String) h0.e0(4, list) : null;
                String str7 = list != null ? (String) h0.e0(5, list) : null;
                String str8 = list != null ? (String) h0.e0(6, list) : null;
                String str9 = list != null ? (String) h0.e0(7, list) : null;
                Iterator<T> it = listA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = str9;
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    str = str9;
                    Iterator<T> it3 = it;
                    if (g22.k.g(((hs1.d) next).b(), LocalDate.now())) {
                        break;
                    }
                    it = it3;
                    str9 = str;
                }
                hs1.d dVar3 = next;
                DateTime dateTimeC = (dVar3 == null || (wellnessChronology = dVar3.getWellnessChronology()) == null) ? null : wellnessChronology.c();
                if (zB3) {
                    str2 = str8;
                    e0 e0Var = realtimedata instanceof e0 ? (e0) realtimedata : null;
                    Integer value2 = (dVar3 == null || (movement = dVar3.getMovement()) == null || (pushes = movement.getPushes()) == null) ? null : pushes.getValue();
                    Integer numValueOf2 = e0Var != null ? Integer.valueOf(e0Var.f83378b) : null;
                    if (value2 != null && numValueOf2 != null) {
                        numValueOf2 = Integer.valueOf(Math.max(value2.intValue(), numValueOf2.intValue()));
                    } else if (value2 != null) {
                        value = value2;
                    }
                    value = numValueOf2;
                } else {
                    i0 i0Var = realtimedata instanceof i0 ? (i0) realtimedata : null;
                    value = (dVar3 == null || (movement6 = dVar3.getMovement()) == null || (steps2 = movement6.getSteps()) == null) ? null : steps2.getValue();
                    Integer numValueOf3 = i0Var != null ? Integer.valueOf(i0Var.f83383b) : null;
                    if (value == null || numValueOf3 == null) {
                        Integer num = numValueOf3;
                        str2 = str8;
                        if (value == null) {
                            value = num;
                        }
                    } else {
                        str2 = str8;
                        value = Integer.valueOf(Math.max(value.intValue(), numValueOf3.intValue()));
                    }
                }
                if (zB3) {
                    e0 e0Var2 = realtimedata instanceof e0 ? (e0) realtimedata : null;
                    goal = (dVar3 == null || (movement2 = dVar3.getMovement()) == null || (pushes2 = movement2.getPushes()) == null) ? null : pushes2.getGoal();
                    numValueOf = e0Var2 != null ? Integer.valueOf(e0Var2.f83379c) : null;
                    if (goal != null && numValueOf != null) {
                        numValueOf = Integer.valueOf(numValueOf.intValue() > 0 ? numValueOf.intValue() : goal.intValue());
                    } else if (goal == null) {
                    }
                    goal = numValueOf;
                } else {
                    i0 i0Var2 = realtimedata instanceof i0 ? (i0) realtimedata : null;
                    goal = (dVar3 == null || (movement5 = dVar3.getMovement()) == null || (steps = movement5.getSteps()) == null) ? null : steps.getGoal();
                    numValueOf = i0Var2 != null ? Integer.valueOf(i0Var2.f83384c) : null;
                    if (goal != null && numValueOf != null) {
                        goal = Integer.valueOf(numValueOf.intValue() > 0 ? numValueOf.intValue() : goal.intValue());
                    } else if (goal == null) {
                        goal = numValueOf;
                    }
                }
                Double distanceInMeters = (zB3 ? dVar3 == null || (movement3 = dVar3.getMovement()) == null || (pushes3 = movement3.getPushes()) == null : dVar3 == null || (movement4 = dVar3.getMovement()) == null || (pushes3 = movement4.getSteps()) == null) ? null : pushes3.getDistanceInMeters();
                q91.d dVar4 = !zB3 ? q91.d.f143577y : q91.d.M0;
                Double d18 = distanceInMeters;
                q91.d dVar5 = !zB3 ? q91.d.f143576x : q91.d.L0;
                Iterator<T> it4 = iterableI0.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        iterable = iterableI0;
                        str3 = str7;
                        next2 = (T) null;
                        break;
                    }
                    next2 = it4.next();
                    iterable = iterableI0;
                    str3 = str7;
                    if (((n91.a) next2).getTypeId() == dVar4.f143579a) {
                        break;
                    }
                    iterableI0 = iterable;
                    str7 = str3;
                }
                n91.a aVar3 = next2;
                Double d19 = aVar3 != null ? new Double(aVar3.getValue()) : null;
                Iterator<T> it5 = iterable.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        aVar = null;
                        break;
                    }
                    T next3 = it5.next();
                    Iterator<T> it6 = it5;
                    if (((n91.a) next3).getTypeId() == dVar5.f143579a) {
                        aVar = next3;
                        break;
                    }
                    it5 = it6;
                }
                n91.a aVar4 = aVar;
                Double d24 = aVar4 != null ? new Double(aVar4.getValue()) : null;
                o13.p<DateTime, DateTime> pVarB = fVar2.b(str5, iVar.f126942e);
                i53.f<Integer> fVarA = or1.c.a(map, dateTimeC, 1441, 1);
                if (((q) realtimedata) != null) {
                    if (value != null) {
                        int iIntValue = value.intValue();
                        int iIntValue2 = 0;
                        for (Integer num2 : fVarA) {
                            iIntValue2 += num2 != null ? num2.intValue() : 0;
                        }
                        if (fVarA.isEmpty()) {
                            iNextIndex = 0;
                            break;
                        }
                        Iterator<E> it7 = fVarA.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                iNextIndex = 0;
                                break;
                            }
                            if (((Integer) it7.next()) != null) {
                                ListIterator<E> listIterator = fVarA.listIterator(fVarA.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        iNextIndex = -1;
                                        break;
                                    }
                                    if (((Integer) listIterator.previous()) != null) {
                                        iNextIndex = listIterator.nextIndex();
                                        break;
                                    }
                                }
                            }
                        }
                        int i16 = DateTime.now().minuteOfDay().get();
                        fVar = fVarA;
                        ArrayList arrayList = new ArrayList(1441);
                        d14 = d24;
                        int i17 = 0;
                        for (int i18 = 1441; i17 < i18; i18 = 1441) {
                            arrayList.add(null);
                            i17++;
                        }
                        d15 = null;
                        int i19 = iIntValue - iIntValue2;
                        int i24 = i16 - iNextIndex;
                        if (i24 <= 0) {
                            cVarB = j53.l.b();
                        } else {
                            float f14 = i19 / i24;
                            float f15 = iIntValue - (i16 * f14);
                            if (iNextIndex <= i16) {
                                while (true) {
                                    arrayList.set(iNextIndex, Integer.valueOf(MathKt.c((iNextIndex * f14) + f15)));
                                    if (iNextIndex == i16) {
                                        break;
                                    }
                                    iNextIndex++;
                                }
                            }
                            cVarB = i53.a.j(arrayList);
                        }
                    } else {
                        fVar = fVarA;
                        d14 = d24;
                        d15 = null;
                        cVarB = j53.l.b();
                    }
                    if (cVarB == null) {
                    }
                    if (value != null) {
                        d16 = new Double(value.intValue());
                    } else {
                        d16 = d15;
                    }
                    if (goal != null) {
                        d17 = new Double(goal.intValue());
                        str4 = str6;
                    } else {
                        str4 = str6;
                        d17 = d15;
                    }
                    kVar = new k(dVar2, d16, d17, d18, d19, d14, fVar, cVarB, ae0.g.b(fVar2.a(dVar2, str4, str3, str2, str, pVarB, str5)));
                    c2444a.f126948b = 1;
                    if (this.f126945a.emit(kVar, c2444a) == aVar2) {
                        return aVar2;
                    }
                } else {
                    fVar = fVarA;
                    d14 = d24;
                    d15 = null;
                }
                cVarB = j53.l.b();
                if (value != null) {
                    d16 = new Double(value.intValue());
                } else {
                    d16 = d15;
                }
                if (goal != null) {
                    d17 = new Double(goal.intValue());
                    str4 = str6;
                } else {
                    str4 = str6;
                    d17 = d15;
                }
                kVar = new k(dVar2, d16, d17, d18, d19, d14, fVar, cVarB, ae0.g.b(fVar2.a(dVar2, str4, str3, str2, str, pVarB, str5)));
                c2444a.f126948b = 1;
                if (this.f126945a.emit(kVar, c2444a) == aVar2) {
                    return aVar2;
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

    public j(r53.i iVar, i iVar2) {
        this.f126943a = iVar;
        this.f126944b = iVar2;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super k> jVar, t13.d dVar) {
        Object objCollect = this.f126943a.collect(new a(jVar, this.f126944b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
