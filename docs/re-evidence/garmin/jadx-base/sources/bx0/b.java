package bx0;

import c22.h0;
import com.garmin.android.apps.connectmobile.R;
import j23.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import o13.r;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;
import r53.i;
import r53.j;
import v13.e;
import vb.h;
import ww0.l;
import ww0.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f21653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bx0.a f21654b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f21655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bx0.a f21656b;

        /* JADX INFO: renamed from: bx0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.domain.dashboard.GetWomenHealthDataUseCase$invoke$$inlined$map$1$2", f = "GetWomenHealthDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C0333a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f21657a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21658b;

            public C0333a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f21657a = obj;
                this.f21658b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, bx0.a aVar) {
            this.f21655a = jVar;
            this.f21656b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:209:0x0496 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v9, types: [r53.j] */
        /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r9v32, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r9v33 */
        /* JADX WARN: Type inference failed for: r9v37, types: [java.util.List] */
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
            C0333a c0333a;
            Object c0334d;
            int i14;
            Object eVar;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            List<String> list;
            List<String> list2;
            List<String> list3;
            double d14;
            int i15;
            float[] fArrY0;
            ?? arrayList4;
            pb2.e.r rVar;
            pb2.e.r rVar2;
            if (dVar instanceof C0333a) {
                c0333a = (C0333a) dVar;
                int i16 = c0333a.f21658b;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    c0333a.f21658b = i16 - Integer.MIN_VALUE;
                } else {
                    c0333a = new C0333a(dVar);
                }
            } else {
                c0333a = new C0333a(dVar);
            }
            Object obj2 = c0333a.f21657a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = c0333a.f21658b;
            if (i17 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                Object obj3 = dVar2.f97521b;
                yz1.d dVar3 = dVar2.f97520a;
                p pVar = (p) obj3;
                String str = pVar != null ? (String) pVar.f128594a : null;
                int i18 = bx0.a.f21649c;
                bx0.a aVar2 = this.f21656b;
                aVar2.getClass();
                ax0.a aVar3 = aVar2.f21651b;
                l lVar = (l) aVar2.a(str, new c());
                p pVar2 = (p) dVar2.f97521b;
                pb2.e.k kVar = (pVar2 == null || (rVar2 = (pb2.e.r) pVar2.f128595b) == null) ? null : rVar2.f137083a;
                pb2.e.j jVar = (pVar2 == null || (rVar = (pb2.e.r) pVar2.f128595b) == null) ? null : rVar.f137084b;
                if (aVar3.d()) {
                    i52.a.f91796a.getClass();
                    int i19 = bx0.a.b.f21652a[i52.a.l().ordinal()];
                    if (i19 != 1) {
                        if (i19 != 2) {
                            if (i19 != 3) {
                                if (i19 != 4 && i19 != 5) {
                                    u0.r();
                                    return null;
                                }
                                if (lVar == null) {
                                    c0334d = new d.g(dVar3);
                                } else if (s.g(lVar.getPregnancyCycle(), Boolean.TRUE)) {
                                    c0334d = new d.f(dVar3);
                                } else {
                                    Integer cycleDay = lVar.getCycleDay();
                                    LocalDate localDatePlusDays = cycleDay != null ? lVar.getStartDate().plusDays(cycleDay.intValue() - 1) : null;
                                    int i24 = (localDatePlusDays == null || !g.a.a(lVar.z(), localDatePlusDays)) ? R.string.mct_cycle_day : R.string.mct_period_day;
                                    int iB = lVar.b();
                                    int i25 = iB == 4 ? R.string.mct_next_period : R.string.mct_next_phase;
                                    if (lVar.Z()) {
                                        Integer cycleDay2 = lVar.getCycleDay();
                                        int iIntValue = cycleDay2 != null ? cycleDay2.intValue() : 0;
                                        Integer predictedCycleLength = lVar.getPredictedCycleLength();
                                        int iIntValue2 = predictedCycleLength != null ? predictedCycleLength.intValue() : iIntValue;
                                        d14 = 1.0d;
                                        LocalDate startDate = lVar.getStartDate();
                                        h0 h0VarZ = lVar.z();
                                        LocalDate localDate = h0VarZ.f23062b;
                                        h0 h0VarQ = lVar.q();
                                        h0 h0VarS = lVar.s();
                                        LocalDate localDateG = lVar.g();
                                        boolean zIsBefore = localDateG == null ? false : localDateG.isBefore(LocalDate.now());
                                        LocalDate localDatePlusDays2 = startDate.plusDays(iIntValue - 1);
                                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
                                        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(aVar4) || zIsBefore) {
                                            boolean z14 = zIsBefore;
                                            ArrayList arrayList5 = new ArrayList();
                                            float f14 = iIntValue2;
                                            float fC = (h0VarZ.c() * 100.0f) / f14;
                                            int i26 = iIntValue2;
                                            arrayList5.add(Float.valueOf(fC));
                                            if (h0VarQ != null && (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.c(aVar4) || z14)) {
                                                List listK = x.k(Integer.valueOf(Math.max(Days.daysBetween(localDate, h0VarQ.f23061a).getDays() - 1, 0)), Integer.valueOf(Math.max(h0VarQ.c(), 0)), Integer.valueOf(Math.max(Days.daysBetween(h0VarQ.f23062b, startDate.plusDays(i26 - 1)).getDays(), 0)));
                                                ArrayList arrayList6 = new ArrayList(y.r(listK, 10));
                                                Iterator<T> it = listK.iterator();
                                                while (it.hasNext()) {
                                                    arrayList6.add(Float.valueOf((((Number) it.next()).intValue() * 100.0f) / f14));
                                                }
                                                arrayList5.addAll(arrayList6);
                                                i15 = 0;
                                            } else if (h0VarS == null || com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.c(aVar4) || i52.a.o() != ww0.i.NONE) {
                                                i15 = 0;
                                                localDatePlusDays2.getClass();
                                                if (g.a.a(h0VarZ, localDatePlusDays2) || com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(aVar4)) {
                                                    arrayList5.add(Float.valueOf(100.0f - fC));
                                                } else {
                                                    arrayList5.clear();
                                                    arrayList5.add(Float.valueOf(0.0f));
                                                    arrayList5.add(Float.valueOf(100.0f));
                                                }
                                            } else {
                                                i15 = 0;
                                                List listK2 = x.k(Integer.valueOf(Math.max(Days.daysBetween(localDate, h0VarS.f23061a).getDays() - 1, 0)), 0, Integer.valueOf(Math.max(h0VarS.c(), 0)));
                                                ArrayList arrayList7 = new ArrayList(y.r(listK2, 10));
                                                Iterator<T> it3 = listK2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList7.add(Float.valueOf((((Number) it3.next()).intValue() * 100.0f) / f14));
                                                }
                                                arrayList5.addAll(arrayList7);
                                            }
                                            fArrY0 = p13.h0.Y0(arrayList5);
                                        } else {
                                            localDatePlusDays2.getClass();
                                            fArrY0 = g.a.a(h0VarZ, localDatePlusDays2) ? new float[]{100.0f} : new float[]{0.0f, 100.0f};
                                            i15 = 0;
                                        }
                                        arrayList4 = new ArrayList(fArrY0.length);
                                        int length = fArrY0.length;
                                        for (int i27 = i15; i27 < length; i27++) {
                                            arrayList4.add(Float.valueOf(fArrY0[i27] / 100.0f));
                                        }
                                    } else {
                                        arrayList4 = w.c(Float.valueOf(1.0f));
                                        lVar = lVar;
                                        dVar3 = dVar3;
                                        d14 = 1.0d;
                                    }
                                    Integer cycleDay3 = lVar.getCycleDay();
                                    Integer predictedCycleLength2 = lVar.getPredictedCycleLength();
                                    eVar = new d.b(dVar3, lVar.getCycleDay(), new Integer(i24), (cycleDay3 == null || predictedCycleLength2 == null) ? null : new Float((float) ((((double) cycleDay3.intValue()) - d14) / (((double) predictedCycleLength2.intValue()) - d14))), new Integer(iB), lVar.getDaysUntilNextPhase(), new Integer(i25), i53.a.j(arrayList4));
                                }
                                i14 = 1;
                            } else if (kVar != null ? s.g(kVar.f137050l, Boolean.TRUE) : false) {
                                c0334d = new d.f(dVar3);
                            } else {
                                Iterable iterableZ = i52.a.q() ? (jVar == null || (list3 = jVar.f137027c) == null) ? null : p13.h0.Z(list3) : j0.f134944a;
                                Iterable iterableZ2 = i52.a.p() ? (jVar == null || (list2 = jVar.f137028d) == null) ? null : p13.h0.Z(list2) : j0.f134944a;
                                ArrayList arrayListZ = (!i52.a.m() || jVar == null || (list = jVar.f137029e) == null) ? null : p13.h0.Z(list);
                                String str2 = (!i52.a.r() || jVar == null) ? null : jVar.f137032h;
                                if (iterableZ != null) {
                                    ArrayList arrayList8 = new ArrayList(y.r(iterableZ, 10));
                                    Iterator<T> it4 = iterableZ.iterator();
                                    while (it4.hasNext()) {
                                        arrayList8.add(t.valueOf((String) it4.next()));
                                    }
                                    arrayList = arrayList8;
                                } else {
                                    arrayList = null;
                                }
                                if (iterableZ2 != null) {
                                    ArrayList arrayList9 = new ArrayList(y.r(iterableZ2, 10));
                                    Iterator<T> it5 = iterableZ2.iterator();
                                    while (it5.hasNext()) {
                                        arrayList9.add(ww0.p.valueOf((String) it5.next()));
                                    }
                                    arrayList2 = arrayList9;
                                } else {
                                    arrayList2 = null;
                                }
                                if (arrayListZ != null) {
                                    ArrayList arrayList10 = new ArrayList(y.r(arrayListZ, 10));
                                    Iterator<T> it6 = arrayListZ.iterator();
                                    while (it6.hasNext()) {
                                        arrayList10.add(ww0.e.valueOf((String) it6.next()));
                                    }
                                    arrayList3 = arrayList10;
                                } else {
                                    arrayList3 = null;
                                }
                                eVar = new d.c(dVar3, arrayList, arrayList2, arrayList3, str2 != null ? ww0.s.valueOf(str2) : null);
                            }
                            c0334d = eVar;
                        } else {
                            c0334d = lVar != null ? s.g(lVar.getPregnancyCycle(), Boolean.TRUE) : false ? new d.f(dVar3) : new d.a(dVar3);
                        }
                    } else if (lVar == null) {
                        c0334d = new d.a(dVar3);
                    } else {
                        Integer numberOfWeek = lVar.getNumberOfWeek();
                        Integer numL = numberOfWeek != null ? aVar3.l(Math.min(40, numberOfWeek.intValue())) : null;
                        Integer cycleDay4 = lVar.getCycleDay();
                        eVar = new d.e(dVar3, lVar.getCycleDay(), (cycleDay4 == null || lVar.getPredictedCycleLength() == null) ? null : new Float((float) ((((double) cycleDay4.intValue()) - 1.0d) / 294.0d)), lVar.getCurrentPhase(), numL, lVar.G());
                        c0334d = eVar;
                    }
                    c0333a.f21658b = i14;
                    if (this.f21655a.emit(c0334d, c0333a) == aVar) {
                        return aVar;
                    }
                } else {
                    c0334d = new d.C0334d(dVar3);
                }
                i14 = 1;
                c0333a.f21658b = i14;
                if (this.f21655a.emit(c0334d, c0333a) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public b(i iVar, bx0.a aVar) {
        this.f21653a = iVar;
        this.f21654b = aVar;
    }

    @Override // r53.i
    public final Object collect(j<? super d> jVar, t13.d dVar) {
        Object objCollect = this.f21653a.collect(new a(jVar, this.f21654b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
