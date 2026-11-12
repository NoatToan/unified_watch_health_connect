package qr;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initMapDetailsCollector$1", f = "ActivityDetailsViewModel.kt", l = {1930}, m = "invokeSuspend", v = 2)
public final class u5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.x0 f146761c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/j0;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initMapDetailsCollector$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<r53.j<? super nr.j0>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146763b;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.j0> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            a aVar = new a(dVar);
            aVar.f146762a = jVar;
            aVar.f146763b = th3;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146763b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strP = am.j.p("init map details  ", th3);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strP);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146764a;

        public b(t tVar) {
            this.f146764a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            int i14 = t.A2;
            ((r53.z1) this.f146764a.f146514e1.getValue()).setValue((nr.j0) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<nr.j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f146765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ am.x0 f146766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146767c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<Object[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f146768a;

            public a(r53.i[] iVarArr) {
                this.f146768a = iVarArr;
            }

            @Override // e23.a
            public final Object[] invoke() {
                return new Object[this.f146768a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initMapDetailsCollector$1$invokeSuspend$$inlined$combine$1$3", f = "ActivityDetailsViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.q<r53.j<? super nr.j0>, Object[], t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f146769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f146770b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f146771c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ am.x0 f146772d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f146773e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t13.d dVar, am.x0 x0Var, t tVar) {
                super(3, dVar);
                this.f146772d = x0Var;
                this.f146773e = tVar;
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super nr.j0> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar, this.f146772d, this.f146773e);
                bVar.f146770b = jVar;
                bVar.f146771c = objArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:244:0x0465  */
            /* JADX WARN: Code duplicated, block: B:246:0x046b  */
            /* JADX WARN: Code duplicated, block: B:247:0x0472  */
            /* JADX WARN: Code duplicated, block: B:250:0x048a A[RETURN] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v25, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r3v26, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v5 */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                List listI;
                List listI2;
                List listI3;
                LinkedHashMap linkedHashMap;
                ?? arrayList;
                ps.t1 t1VarB;
                List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> list;
                com.garmin.android.apps.connectmobile.activities.newmodel.w wVarD;
                List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> listC;
                List<ps.x1> list2;
                ArrayList arrayList2;
                List<ps.i> listF;
                nr.j0 j0Var;
                ActivityDetailChartDTO activityDetailChartDTO;
                ArrayList arrayList3;
                List<ps.r> list3;
                Object next;
                Object next2;
                Double averageSpeed;
                Double distance;
                Double duration;
                ArrayList<ArrayList<Double>> arrayListA;
                ps.p pVar;
                Object next3;
                Object next4;
                com.garmin.android.apps.connectmobile.activities.newmodel.w wVarD2;
                ps.p pVar2;
                nr.o oVar;
                ps.r rVar;
                ps.a1 metadataDTO;
                ps.p pVar3;
                nr.o oVar2;
                ps.r rVar2;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f146769a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.j jVar = this.f146770b;
                    Object[] objArr = this.f146771c;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    ps.h hVar = (ps.h) objArr[6];
                    ps.b2 b2Var = (ps.b2) obj7;
                    nr.t0 t0Var = (nr.t0) obj6;
                    List list4 = (List) obj5;
                    to.f fVar = (to.f) obj4;
                    ps.m mVar = (ps.m) obj3;
                    nr.a aVar2 = (nr.a) obj2;
                    ps.q1 summaryDTO = (aVar2 == null || (oVar2 = aVar2.f126975b) == null || (rVar2 = oVar2.f127269a) == null) ? null : rVar2.getSummaryDTO();
                    ActivityDetailChartDTO activityDetailChartDTO2 = aVar2 != null ? aVar2.f126976c : null;
                    if (activityDetailChartDTO2 == null || (listI = o72.t.I(activityDetailChartDTO2, "directLatitude")) == null) {
                        listI = p13.j0.f134944a;
                    }
                    if (activityDetailChartDTO2 == null || (listI2 = o72.t.I(activityDetailChartDTO2, "directLongitude")) == null) {
                        listI2 = p13.j0.f134944a;
                    }
                    if (activityDetailChartDTO2 == null || (listI3 = o72.t.I(activityDetailChartDTO2, "directTimestamp")) == null) {
                        listI3 = p13.j0.f134944a;
                    }
                    ActivityDetailChartDTO activityDetailChartDTO3 = activityDetailChartDTO2;
                    ps.c1 c1Var = new ps.c1(listI, listI2, fr.c.d(this.f146772d, summaryDTO != null ? new Long(summaryDTO.c5()) : null, activityDetailChartDTO3, null, (aVar2 == null || (pVar3 = aVar2.f126977d) == null) ? null : pVar3.i(), t0Var != null ? t0Var.f127355a : null, t0Var != null ? t0Var.f127356b : null, (aVar2 == null || (oVar = aVar2.f126975b) == null || (rVar = oVar.f127269a) == null || (metadataDTO = rVar.getMetadataDTO()) == null) ? -1 : metadataDTO.getEBikeMaxAssistModes()), listI3);
                    ArrayList arrayListL = androidx.core.view.j.l(list4);
                    int i15 = 0;
                    for (Object obj8 : list4) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        ps.w0 w0Var = (ps.w0) obj8;
                        Double latitude = w0Var.getLatitude();
                        Double longitude = w0Var.getLongitude();
                        ls.c cVar = (latitude == null || longitude == null) ? null : new ls.c(ls.d.JUMP, new com.garmin.android.library.mapsdkadapter.f(latitude.doubleValue(), longitude.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84), am.j.h(i16, "Jump"));
                        if (cVar != null) {
                            arrayListL.add(cVar);
                        }
                        i15 = i16;
                    }
                    cq.y.a aVar3 = cq.y.f55115a;
                    List<ps.x1> listI4 = (aVar2 == null || (pVar2 = aVar2.f126977d) == null) ? null : pVar2.i();
                    aVar3.getClass();
                    List listA = cq.y.a.a(listI4);
                    ActivityDetailChartDTO activityDetailChartDTO4 = aVar2 != null ? aVar2.f126976c : null;
                    listA.getClass();
                    List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> listC2 = (activityDetailChartDTO4 == null || !activityDetailChartDTO4.a0() || (wVarD2 = activityDetailChartDTO4.D()) == null) ? null : wVarD2.C();
                    if (listC2 != null) {
                        linkedHashMap = new LinkedHashMap();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj9 : listA) {
                            if (cq.z.c((ps.x1) obj9)) {
                                arrayList4.add(obj9);
                            }
                        }
                        int i17 = 0;
                        for (Object obj10 : arrayList4) {
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            ps.x1 x1Var = (ps.x1) obj10;
                            DateTime startDateTime = x1Var.getStartDateTime();
                            Long lValueOf = startDateTime != null ? Long.valueOf(startDateTime.getMillis()) : null;
                            DateTime endDateTime = x1Var.getEndDateTime();
                            Long lValueOf2 = endDateTime != null ? Long.valueOf(endDateTime.getMillis()) : null;
                            if (lValueOf != null && lValueOf2 != null) {
                                Iterator it = listC2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next4 = null;
                                        break;
                                    }
                                    next4 = it.next();
                                    long jLongValue = lValueOf.longValue();
                                    long jLongValue2 = lValueOf2.longValue();
                                    long jG = ((com.garmin.android.apps.connectmobile.activities.newmodel.a0) next4).G();
                                    if (jLongValue <= jG && jG < jLongValue2) {
                                        break;
                                    }
                                }
                                com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) next4;
                                if (a0Var != null) {
                                    linkedHashMap.put(Integer.valueOf(i17), new com.garmin.android.library.mapsdkadapter.f(a0Var.C(), a0Var.F(), com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                                }
                            }
                            i17 = i18;
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    if (linkedHashMap != null) {
                        arrayList = new ArrayList();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            arrayList.add(new ls.c(ls.d.CLIMB, (com.garmin.android.library.mapsdkadapter.f) entry.getValue(), String.valueOf(((Number) entry.getKey()).intValue())));
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = p13.j0.f134944a;
                    }
                    int i19 = t.A2;
                    this.f146773e.getClass();
                    if (am.z0.o(this.f146772d.f4358a)) {
                        List<ps.t1> list5 = c1Var.f139766c;
                        if (list5.isEmpty()) {
                            t1VarB = null;
                        } else {
                            Iterator it3 = list5.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it3.next();
                            } while (!p005kotlin.jvm.internal.s.g(((ps.t1) next3).f140222a.f139689a, ps.b1.a.f139701m.f139689a));
                            t1VarB = (ps.t1) next3;
                        }
                    } else {
                        t1VarB = c1Var.b();
                    }
                    c1Var.f139768e = t1VarB;
                    if (!c1Var.d() || c1Var.b() == null) {
                        c1Var = null;
                    }
                    ArrayList arrayListC0 = p13.h0.C0(arrayListL, (Iterable) arrayList);
                    List<ps.x1> listI5 = (aVar2 == null || (pVar = aVar2.f126977d) == null) ? null : pVar.i();
                    if (fVar == null || (arrayListA = fVar.a()) == null) {
                        if (activityDetailChartDTO3 == null || (wVarD = activityDetailChartDTO3.D()) == null) {
                            list = null;
                        } else {
                            listC = wVarD.C();
                        }
                        if (aVar2 != null || (activityDetailChartDTO = aVar2.f126976c) == null) {
                            list2 = listI5;
                            arrayList2 = null;
                        } else {
                            nr.o oVar3 = aVar2.f126975b;
                            if (oVar3 == null || (list3 = oVar3.f127271c) == null) {
                                list2 = listI5;
                                arrayList3 = null;
                            } else {
                                List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG = activityDetailChartDTO.G();
                                listG.getClass();
                                Iterator it4 = listG.iterator();
                                do {
                                    if (!it4.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it4.next();
                                } while (!"DIRECTTIMESTAMP".equalsIgnoreCase(((com.garmin.android.apps.connectmobile.activities.newmodel.y) next).F()));
                                com.garmin.android.apps.connectmobile.activities.newmodel.y yVar = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next;
                                int iG = yVar != null ? yVar.G() : -1;
                                List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG2 = activityDetailChartDTO.G();
                                listG2.getClass();
                                Iterator it5 = listG2.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it5.next();
                                } while (!"SUMDURATION".equalsIgnoreCase(((com.garmin.android.apps.connectmobile.activities.newmodel.y) next2).F()));
                                com.garmin.android.apps.connectmobile.activities.newmodel.y yVar2 = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next2;
                                int iG2 = yVar2 != null ? yVar2.G() : -1;
                                List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC3 = activityDetailChartDTO.C();
                                ArrayList arrayListL2 = androidx.core.view.j.l(listC3);
                                Iterator it6 = listC3.iterator();
                                while (it6.hasNext()) {
                                    List<Double> listC4 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it6.next()).C();
                                    listC4.getClass();
                                    Double d14 = (Double) p13.h0.e0(iG2, listC4);
                                    if (d14 != null) {
                                        arrayListL2.add(d14);
                                    }
                                }
                                List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC5 = activityDetailChartDTO.C();
                                ArrayList arrayListL3 = androidx.core.view.j.l(listC5);
                                Iterator it7 = listC5.iterator();
                                while (it7.hasNext()) {
                                    List<Double> listC6 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it7.next()).C();
                                    listC6.getClass();
                                    Double d15 = (Double) p13.h0.e0(iG, listC6);
                                    if (d15 != null) {
                                        arrayListL3.add(d15);
                                    }
                                }
                                List<ps.r> listN0 = p13.h0.N0(list3, new ss.d());
                                ArrayList arrayList5 = new ArrayList(p13.y.r(listN0, 10));
                                double d16 = 0.0d;
                                for (ps.r rVar3 : listN0) {
                                    ps.q1 summaryDTO2 = rVar3.getSummaryDTO();
                                    double dDoubleValue = (summaryDTO2 == null || (duration = summaryDTO2.getDuration()) == null) ? 0.0d : duration.doubleValue();
                                    List<ps.x1> list6 = listI5;
                                    Double d17 = (Double) p13.h0.e0(oe2.f.d0(d16, arrayListL2), arrayListL3);
                                    double dDoubleValue2 = d17 != null ? d17.doubleValue() : 0.0d;
                                    d16 += dDoubleValue;
                                    Double d18 = (Double) p13.h0.e0(oe2.f.d0(d16, arrayListL2), arrayListL3);
                                    double dDoubleValue3 = d18 != null ? d18.doubleValue() : 0.0d;
                                    Long activityId = rVar3.getActivityId();
                                    double dDoubleValue4 = Double.NaN;
                                    double dDoubleValue5 = (summaryDTO2 == null || (distance = summaryDTO2.getDistance()) == null) ? Double.NaN : distance.doubleValue();
                                    if (summaryDTO2 != null && (averageSpeed = summaryDTO2.getAverageSpeed()) != null) {
                                        dDoubleValue4 = averageSpeed.doubleValue();
                                    }
                                    arrayList5.add(new ps.d1(activityId, dDoubleValue, dDoubleValue5, dDoubleValue4, d16, rVar3.h(), oe2.f.K(rVar3), dDoubleValue2 / 1000.0d, dDoubleValue3 / 1000.0d, null, null, 1536, null));
                                    listI5 = list6;
                                }
                                list2 = listI5;
                                arrayList3 = new ArrayList(arrayList5);
                            }
                            arrayList2 = arrayList3;
                        }
                        if (hVar != null) {
                            listF = hVar.f();
                        } else {
                            listF = null;
                        }
                        j0Var = new nr.j0(mVar, b2Var, c1Var, arrayListC0, list2, list, arrayList2, listF);
                        this.f146770b = null;
                        this.f146771c = null;
                        this.f146769a = 1;
                        if (jVar.emit(j0Var, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        listC = oe2.f.f(arrayListA);
                    }
                    list = listC;
                    if (aVar2 != null) {
                        list2 = listI5;
                        arrayList2 = null;
                    } else {
                        list2 = listI5;
                        arrayList2 = null;
                    }
                    if (hVar != null) {
                        listF = hVar.f();
                    } else {
                        listF = null;
                    }
                    j0Var = new nr.j0(mVar, b2Var, c1Var, arrayListC0, list2, list, arrayList2, listF);
                    this.f146770b = null;
                    this.f146771c = null;
                    this.f146769a = 1;
                    if (jVar.emit(j0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public c(r53.i[] iVarArr, am.x0 x0Var, t tVar) {
            this.f146765a = iVarArr;
            this.f146766b = x0Var;
            this.f146767c = tVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super nr.j0> jVar, t13.d dVar) {
            r53.i[] iVarArr = this.f146765a;
            Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null, this.f146766b, this.f146767c), jVar, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(t tVar, am.x0 x0Var, t13.d<? super u5> dVar) {
        super(2, dVar);
        this.f146760b = tVar;
        this.f146761c = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u5(this.f146760b, this.f146761c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146759a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = t.A2;
            t tVar = this.f146760b;
            r53.w wVar = new r53.w(new c(new r53.i[]{tVar.L4(), (r53.z1) tVar.f146556s1.getValue(), (r53.z1) tVar.f146561u1.getValue(), (r53.z1) tVar.f146502a1.getValue(), (r53.z1) tVar.R0.getValue(), (r53.z1) tVar.f146554r1.getValue(), (r53.z1) tVar.f146559t1.getValue()}, this.f146761c, tVar), new a(null));
            b bVar = new b(tVar);
            this.f146759a = 1;
            if (wVar.collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
