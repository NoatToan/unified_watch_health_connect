package qr;

import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initChartsDetailsCollector$1", f = "ActivityDetailsViewModel.kt", l = {1881}, m = "invokeSuspend", v = 2)
public final class n5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f146362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f146363c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lnr/c;", "<anonymous>", "(Lo53/b0;)Lnr/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initChartsDetailsCollector$1$1$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super nr.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<List<jr.f>> f146364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rr.a f146365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ nr.a f146367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.newmodel.l0 f146368e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends List<jr.f>> list, rr.a aVar, t tVar, nr.a aVar2, com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f146364a = list;
            this.f146365b = aVar;
            this.f146366c = tVar;
            this.f146367d = aVar2;
            this.f146368e = l0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f146364a, this.f146365b, this.f146366c, this.f146367d, this.f146368e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super nr.c> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            t tVar;
            List listT;
            r53.p2 p2Var;
            Object value;
            nr.o oVar;
            ps.r rVar;
            List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG;
            List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC;
            jr.j jVarC;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ArrayList arrayListS = p13.y.s(this.f146364a);
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListS.iterator();
            while (true) {
                numA = null;
                Integer numA = null;
                if (!it.hasNext()) {
                    break;
                }
                jr.i itemDetails = ((jr.f) it.next()).getItemDetails();
                if (itemDetails != null && (jVarC = itemDetails.c()) != null) {
                    numA = is.i.a(jVarC);
                }
                if (numA != null) {
                    arrayList.add(numA);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                tVar = this.f146366c;
                if (!zHasNext) {
                    break;
                }
                Object next = it3.next();
                if (!tVar.f146572y.contains(new Integer(((Number) next).intValue()))) {
                    arrayList2.add(next);
                }
            }
            fz.c cVar = fz.c.TIME;
            rr.a aVar2 = this.f146365b;
            aVar2.getClass();
            cVar.getClass();
            aVar2.f154139c = cVar;
            ArrayList arrayListT = g8.i.t(aVar2, arrayList2);
            if (((Boolean) tVar.R1.getValue()).booleanValue()) {
                ActivityDetailChartDTO activityDetailChartDTO = aVar2.f154140d;
                if (activityDetailChartDTO != null) {
                    int i14 = ss.a.f160593a;
                    listG = activityDetailChartDTO.G();
                } else {
                    listG = null;
                }
                int iA = ss.a.a("SUMDISTANCE", listG);
                if (iA == -1 || activityDetailChartDTO == null || (listC = activityDetailChartDTO.C()) == null) {
                    if (aVar2.f154140d != null) {
                        p2Var = tVar.R1;
                        do {
                            value = p2Var.getValue();
                            ((Boolean) value).getClass();
                        } while (!p2Var.b(value, Boolean.FALSE));
                    }
                    listT = p13.j0.f134944a;
                } else {
                    Iterator<T> it4 = listC.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            List<Double> listC2 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it4.next()).C();
                            listC2.getClass();
                            if (listC2.get(iA).doubleValue() != 0.0d) {
                                fz.c cVar2 = fz.c.DISTANCE;
                                cVar2.getClass();
                                aVar2.f154139c = cVar2;
                                listT = g8.i.t(aVar2, arrayList2);
                            }
                        } else {
                            if (aVar2.f154140d != null) {
                                p2Var = tVar.R1;
                                do {
                                    value = p2Var.getValue();
                                    ((Boolean) value).getClass();
                                } while (!p2Var.b(value, Boolean.FALSE));
                            }
                            listT = p13.j0.f134944a;
                        }
                    }
                }
            } else {
                if (aVar2.f154140d != null) {
                    p2Var = tVar.R1;
                    do {
                        value = p2Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!p2Var.b(value, Boolean.FALSE));
                }
                listT = p13.j0.f134944a;
            }
            List list = listT;
            nr.a aVar3 = this.f146367d;
            am.x0 x0VarH = (aVar3 == null || (oVar = aVar3.f126975b) == null || (rVar = oVar.f127269a) == null) ? null : rVar.h();
            nr.a aVar4 = this.f146367d;
            zm.e0.a(arrayListT, aVar4 != null ? aVar4.f126976c : null, aVar4 != null ? aVar4.f126977d : null, x0VarH);
            zm.e0.a(list, aVar3 != null ? aVar3.f126976c : null, aVar3 != null ? aVar3.f126977d : null, x0VarH);
            return new nr.c(aVar4, this.f146368e, arrayListT, list, this.f146364a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/c;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initChartsDetailsCollector$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super nr.c>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146370b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.c> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            b bVar = new b(dVar);
            bVar.f146369a = jVar;
            bVar.f146370b = th3;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146370b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strConcat = "ChartsState ".concat(o13.g.b(th3));
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strConcat);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146371a;

        public c(t tVar) {
            this.f146371a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            int i14 = t.A2;
            this.f146371a.b5().setValue((nr.c) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljr/d;", "configuration", "Ljr/a;", "chartsConfiguration", "", "Ljr/f;", "<anonymous>", "(Ljr/d;Ljr/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initChartsDetailsCollector$1$compatibleChartsFlow$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<jr.d, jr.a, t13.d<? super List<? extends List<? extends jr.f>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ jr.d f146372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ jr.a f146373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146374c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t tVar, t13.d<? super d> dVar) {
            super(3, dVar);
            this.f146374c = tVar;
        }

        @Override // e23.q
        public final Object invoke(jr.d dVar, jr.a aVar, t13.d<? super List<? extends List<? extends jr.f>>> dVar2) {
            d dVar3 = new d(this.f146374c, dVar2);
            dVar3.f146372a = dVar;
            dVar3.f146373b = aVar;
            return dVar3.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v12, types: [T, java.util.ArrayList] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            am.x0 x0VarH;
            List<jr.f> listA;
            Object next;
            Object next2;
            jr.i itemDetails;
            jr.j jVarC;
            jr.j jVarC2;
            Object next3;
            List list;
            jr.i itemDetails2;
            jr.j jVarC3;
            jr.d dVar = this.f146372a;
            jr.a aVar = this.f146373b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = t.A2;
            ps.r value = this.f146374c.W4().getValue();
            if (value == null || (x0VarH = value.h()) == null) {
                x0VarH = am.x0.f4346x;
            }
            mr.s0 s0Var = new mr.s0(x0VarH, dVar);
            aVar.getClass();
            mr.a aVar3 = s0Var.f120305b.f120243e;
            if (aVar3 == null || (listA = aVar3.a(s0Var.f120304a)) == null) {
                listA = p13.j0.f134944a;
            }
            ArrayList<List> arrayListC = aVar.c();
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            List<jr.f> listB = aVar.b();
            ArrayList arrayListL = androidx.core.view.j.l(listB);
            for (List<jr.j> list2 : arrayListC) {
                ArrayList arrayList = new ArrayList();
                for (jr.j jVar : list2) {
                    Iterator<jr.f> it = listB.iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i15 = -1;
                            break;
                        }
                        jr.f next4 = it.next();
                        String str = jVar.f100164a;
                        jr.i itemDetails3 = next4.getItemDetails();
                        if (p005kotlin.jvm.internal.s.g(str, (itemDetails3 == null || (jVarC3 = itemDetails3.c()) == null) ? null : jVarC3.f100164a)) {
                            break;
                        }
                        i15++;
                    }
                    arrayList.add(Integer.valueOf(i15));
                }
                int iIntValue = ((Number) p13.h0.x0(arrayList)).intValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((Number) obj2).intValue() != iIntValue) {
                        arrayList2.add(obj2);
                    }
                }
                arrayListL.add(arrayList2);
            }
            ArrayList arrayListS = p13.y.s(arrayListL);
            ArrayList arrayList3 = new ArrayList(listB);
            ?? arrayList4 = new ArrayList();
            int i16 = 0;
            for (Object obj3 : arrayList3) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                if (!arrayListS.contains(Integer.valueOf(i16))) {
                    arrayList4.add(obj3);
                }
                i16 = i17;
            }
            r0Var.f105810a = arrayList4;
            for (jr.f fVar : listA) {
                Iterator it3 = arrayListC.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    list = (List) next3;
                    itemDetails2 = fVar.getItemDetails();
                } while (!p13.h0.R(list, itemDetails2 != null ? itemDetails2.c() : null));
                List list3 = (List) next3;
                Iterable iterable = (Iterable) r0Var.f105810a;
                ?? arrayList5 = new ArrayList();
                for (Object obj4 : iterable) {
                    jr.f fVar2 = (jr.f) obj4;
                    if (list3 != null) {
                        jr.i itemDetails4 = fVar2.getItemDetails();
                        if (p13.h0.R(list3, itemDetails4 != null ? itemDetails4.c() : null)) {
                        }
                    }
                    arrayList5.add(obj4);
                }
                r0Var.f105810a = arrayList5;
            }
            Set setH1 = p13.h0.h1(listA, (Iterable) r0Var.f105810a);
            HashSet hashSet = new HashSet();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : setH1) {
                jr.i itemDetails5 = ((jr.f) obj5).getItemDetails();
                if (hashSet.add((itemDetails5 == null || (jVarC2 = itemDetails5.c()) == null) ? null : jVarC2.f100164a)) {
                    arrayList6.add(obj5);
                }
            }
            ArrayList<jr.f> arrayList7 = new ArrayList(arrayList6);
            arrayList7.add(new jr.f(jr.k.CHART.f100190a, new jr.i(false, null, jr.j.CONNECT_IQ_CHART.f100164a, null, false, 24, null)));
            ArrayList arrayListA = aVar.a();
            ArrayList arrayList8 = new ArrayList();
            for (jr.f fVar3 : arrayList7) {
                jr.i itemDetails6 = fVar3.getItemDetails();
                jr.j jVarC4 = itemDetails6 != null ? itemDetails6.c() : null;
                Iterator it4 = p13.y.s(arrayList8).iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    itemDetails = ((jr.f) next).getItemDetails();
                } while (!p005kotlin.jvm.internal.s.g((itemDetails == null || (jVarC = itemDetails.c()) == null) ? null : jVarC.f100164a, jVarC4 != null ? jVarC4.f100164a : null));
                boolean z14 = next != null;
                if (jVarC4 != null && !z14) {
                    Iterator it5 = arrayListA.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                    } while (!((List) next2).contains(jVarC4));
                    Iterable iterable2 = (List) next2;
                    if (iterable2 == null) {
                        iterable2 = p13.j0.f134944a;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for (jr.f fVar4 : arrayList7) {
                        jr.i itemDetails7 = fVar4.getItemDetails();
                        if (!p13.h0.R(iterable2, itemDetails7 != null ? itemDetails7.c() : null)) {
                            fVar4 = null;
                        }
                        if (fVar4 != null) {
                            arrayList9.add(fVar4);
                        }
                    }
                    boolean zIsEmpty = arrayList9.isEmpty();
                    List listC = arrayList9;
                    if (zIsEmpty) {
                        listC = p13.w.c(fVar3);
                    }
                    arrayList8.add(listC);
                }
            }
            return arrayList8;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "", "Ljr/f;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initChartsDetailsCollector$1$compatibleChartsFlow$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<r53.j<? super List<? extends List<? extends jr.f>>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146376b;

        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super List<? extends List<? extends jr.f>>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            e eVar = new e(dVar);
            eVar.f146375a = jVar;
            eVar.f146376b = th3;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146376b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strP = am.j.p("compatibleChartsFlow ", th3);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strP);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements r53.i<nr.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f146377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f146378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146379c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<Object[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f146380a;

            public a(r53.i[] iVarArr) {
                this.f146380a = iVarArr;
            }

            @Override // e23.a
            public final Object[] invoke() {
                return new Object[this.f146380a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initChartsDetailsCollector$1$invokeSuspend$$inlined$combine$1$3", f = "ActivityDetailsViewModel.kt", l = {263, 234}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.q<r53.j<? super nr.c>, Object[], t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f146381a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f146382b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f146383c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public r53.j f146384d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f146385e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ t f146386f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t13.d dVar, o53.b0 b0Var, t tVar) {
                super(3, dVar);
                this.f146385e = b0Var;
                this.f146386f = tVar;
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super nr.c> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar, this.f146385e, this.f146386f);
                bVar.f146382b = jVar;
                bVar.f146383c = objArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:109:0x01b8  */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x0206, code lost:
            
                if (r2.emit(r3, r23) == r1) goto L123;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v2, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r4v8, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                r53.j jVar;
                ?? arrayList;
                Object objC;
                ps.q1 summaryDTO;
                nr.o oVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f146381a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        jVar = this.f146384d;
                        o13.r.b(obj);
                        objC = obj;
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                jVar = this.f146382b;
                Object[] objArr = this.f146383c;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                Object obj6 = objArr[4];
                Object obj7 = objArr[5];
                ep.g gVar = (ep.g) objArr[6];
                com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.l0) obj7;
                List<ps.w0> list = (List) obj6;
                nr.t0 t0Var = (nr.t0) obj5;
                nr.v vVar = (nr.v) obj4;
                nr.a aVar2 = (nr.a) obj3;
                List list2 = (List) obj2;
                rr.a aVar3 = new rr.a((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null));
                ps.r rVar = (aVar2 == null || (oVar = aVar2.f126975b) == null) ? null : oVar.f127269a;
                aVar3.f154141e = rVar;
                aVar3.f154140d = aVar2 != null ? aVar2.f126976c : null;
                aVar3.f154142f = vVar != null ? vVar.f127379b : null;
                aVar3.f154143g = t0Var != null ? t0Var.f127355a : null;
                aVar3.f154144h = t0Var != null ? t0Var.f127356b : null;
                List<ps.r1> list3 = t0Var != null ? t0Var.f127357c : null;
                Double duration = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null) ? null : summaryDTO.getDuration();
                int i15 = t.A2;
                t tVar = this.f146386f;
                tVar.getClass();
                if (list3 == null || list3.isEmpty() || !zf.b.D(duration)) {
                    list3 = null;
                } else {
                    Iterator it = list3.iterator();
                    double dDoubleValue = 0.0d;
                    while (it.hasNext()) {
                        Double secsInZone = ((ps.r1) it.next()).getSecsInZone();
                        dDoubleValue += secsInZone != null ? secsInZone.doubleValue() : 0.0d;
                    }
                    double dDoubleValue2 = duration.doubleValue() - dDoubleValue;
                    if (dDoubleValue2 > 0.0d) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            Integer zoneNumber = ((ps.r1) it3.next()).getZoneNumber();
                            if (zoneNumber != null) {
                                arrayList2.add(zoneNumber);
                            }
                        }
                        Integer num = (Integer) p13.h0.t0(arrayList2);
                        if (num != null) {
                            int iIntValue = num.intValue();
                            ArrayList arrayList3 = new ArrayList(p13.y.r(list3, 10));
                            for (ps.r1 r1VarB : list3) {
                                Integer zoneNumber2 = r1VarB.getZoneNumber();
                                if (zoneNumber2 != null && zoneNumber2.intValue() == iIntValue) {
                                    Double secsInZone2 = r1VarB.getSecsInZone();
                                    r1VarB = ps.r1.b(r1VarB, Double.valueOf((secsInZone2 != null ? secsInZone2.doubleValue() : 0.0d) + dDoubleValue2));
                                }
                                arrayList3.add(r1VarB);
                            }
                            list3 = arrayList3;
                        }
                    }
                }
                aVar3.f154145i = list3;
                aVar3.f154146j = aVar2 != null ? aVar2.f126978e : null;
                aVar3.f154147k = aVar2 != null ? aVar2.f126977d : null;
                aVar3.f154148l = tVar.Y4().getValue();
                ps.r rVar2 = aVar3.f154141e;
                ps.p pVar = aVar3.f154147k;
                if (rVar2 == null || pVar == null) {
                    arrayList = p13.j0.f134944a;
                } else {
                    String str = rVar2.h().f4358a;
                    am.z0 z0Var = am.z0.f4390a;
                    if (am.z0.b(am.x0.f4312o, str)) {
                        List<ps.o0> listF = pVar.f();
                        if (listF != null) {
                            arrayList = new ArrayList();
                            for (Object obj8 : listF) {
                                if (((ps.o0) obj8).h()) {
                                    arrayList.add(obj8);
                                }
                            }
                        } else {
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = p13.j0.f134944a;
                        }
                    } else {
                        arrayList = p13.j0.f134944a;
                    }
                }
                aVar3.f154149m = arrayList;
                aVar3.f154150n = list;
                aVar3.f154151o = l0Var;
                aVar3.f154152p = gVar != null ? gVar.f64817a : null;
                aVar3.f154153q = gVar != null ? gVar.f64818b : null;
                o53.j0 j0VarJ = ge1.b.j(this.f146385e, null, null, new a(list2, aVar3, this.f146386f, aVar2, l0Var, null), 3);
                this.f146382b = null;
                this.f146383c = null;
                this.f146384d = jVar;
                this.f146381a = 1;
                objC = j0VarJ.C(this);
                u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
                if (objC != aVar) {
                }
                return aVar;
                this.f146382b = null;
                this.f146383c = null;
                this.f146384d = null;
                this.f146381a = 2;
            }
        }

        public f(r53.i[] iVarArr, o53.b0 b0Var, t tVar) {
            this.f146377a = iVarArr;
            this.f146378b = b0Var;
            this.f146379c = tVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super nr.c> jVar, t13.d dVar) {
            r53.i[] iVarArr = this.f146377a;
            Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null, this.f146378b, this.f146379c), jVar, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(t tVar, t13.d<? super n5> dVar) {
        super(2, dVar);
        this.f146363c = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n5 n5Var = new n5(this.f146363c, dVar);
        n5Var.f146362b = obj;
        return n5Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f146362b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146361a;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = this.f146363c;
            r53.w wVar = new r53.w(new f(new r53.i[]{new r53.w(new r53.u1(tVar.F, tVar.P, new d(tVar, null)), new e(null)), tVar.L4(), tVar.h5(), (r53.z1) tVar.R0.getValue(), (r53.z1) tVar.f146502a1.getValue(), (r53.z1) tVar.f146545o1.getValue(), tVar.f146508c1}, b0Var, tVar), new b(null));
            c cVar = new c(tVar);
            this.f146362b = null;
            this.f146361a = 1;
            if (wVar.collect(cVar, this) == aVar) {
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
