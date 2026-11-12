package qr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getChildrenSummaries$1", f = "ActivityDetailsViewModel.kt", l = {4099}, m = "invokeSuspend", v = 2)
public final class l2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f146313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Long> f146314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146315d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/r;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getChildrenSummaries$1$legsSummaries$1$1", f = "ActivityDetailsViewModel.kt", l = {4099}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends ps.r>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f146316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f146317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f146318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f146317b = tVar;
            this.f146318c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f146317b, this.f146318c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends ps.r>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146316a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            r53.i<com.garmin.android.apps.connectmobile.v2<ps.r>> iVarC = this.f146317b.f146507c.c(this.f146318c);
            this.f146316a = 1;
            Object objX = r53.s.x(iVarC, this);
            return objX == aVar ? aVar : objX;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(List<Long> list, t tVar, t13.d<? super l2> dVar) {
        super(2, dVar);
        this.f146314c = list;
        this.f146315d = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l2 l2Var = new l2(this.f146314c, this.f146315d, dVar);
        l2Var.f146313b = obj;
        return l2Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0184  */
    /* JADX WARN: Code duplicated, block: B:30:0x0187  */
    /* JADX WARN: Code duplicated, block: B:32:0x018c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0195  */
    /* JADX WARN: Code duplicated, block: B:37:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x01b8 A[LOOP:1: B:38:0x01b2->B:40:0x01b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x0206  */
    /* JADX WARN: Code duplicated, block: B:56:0x021a  */
    /* JADX WARN: Code duplicated, block: B:59:0x021f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0224  */
    /* JADX WARN: Code duplicated, block: B:67:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object objO;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        List<am.x0> listB1;
        kr.e eVar;
        ArrayList arrayList3;
        List<jr.q> listA;
        jr.q qVar;
        List<jr.r> listG;
        Iterator<T> it3;
        Object next;
        Iterator it4;
        com.garmin.android.apps.connectmobile.v2 v2Var;
        ps.r rVar;
        boolean zG;
        o53.b0 b0Var = (o53.b0) this.f146313b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146312a;
        t tVar = this.f146315d;
        if (i14 == 0) {
            o13.r.b(obj);
            List<Long> list2 = this.f146314c;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList(p13.y.r(list2, 10));
                Iterator<T> it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(ge1.b.j(b0Var, null, null, new a(tVar, ((Number) it5.next()).longValue(), null), 3));
                }
                this.f146313b = null;
                this.f146312a = 1;
                objO = g8.i.o(arrayList4, this);
                if (objO == aVar) {
                    return aVar;
                }
            } else {
                list = null;
            }
            if (list != null) {
                arrayList = new ArrayList();
                for (it4 = list.iterator(); it4.hasNext(); it4 = it4) {
                    v2Var = (com.garmin.android.apps.connectmobile.v2) it4.next();
                    if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                        rVar = (ps.r) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                        int i15 = t.A2;
                        zG = oe2.f.G(tVar.W4().getValue());
                        Long activityId = rVar.getActivityId();
                        if (zG == oe2.f.G(rVar) && activityId != null) {
                            tVar.Z5(activityId.longValue(), new ps.r(null, null, null, null, null, null, null, null, null, new ps.a1(null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, zG, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870913, 524287, null), null, null, null, null, null, null, null, null, 261631, null), nr.v0.FAVORITE);
                        }
                    } else {
                        rVar = null;
                    }
                    if (rVar != null) {
                        arrayList.add(rVar);
                    }
                }
            } else {
                arrayList = null;
            }
            int i16 = t.A2;
            ((r53.z1) tVar.f146570x1.getValue()).setValue(arrayList);
            if (arrayList != null) {
                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ps.r) it.next()).h());
                }
                listB1 = p13.h0.b1(p13.h0.f1(arrayList2));
                if (listB1 != null) {
                    r53.p2 p2Var = tVar.I;
                    eVar = tVar.f146504b;
                    eVar.getClass();
                    arrayList3 = new ArrayList(p13.y.r(listB1, 10));
                    for (am.x0 x0Var : listB1) {
                        listA = eVar.f106213a.a(x0Var).a();
                        if (listA != null) {
                            it3 = listA.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                            } while (((jr.q) next).d() != jr.s.Home);
                            qVar = (jr.q) next;
                        } else {
                            qVar = null;
                        }
                        if (qVar != null) {
                            listG = qVar.g();
                        } else {
                            listG = null;
                        }
                        arrayList3.add(new jr.m(x0Var, listG));
                    }
                    p2Var.k(null, arrayList3);
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        objO = obj;
        list = (List) objO;
        if (list != null) {
            arrayList = new ArrayList();
            while (it4.hasNext()) {
                v2Var = (com.garmin.android.apps.connectmobile.v2) it4.next();
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    rVar = (ps.r) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                    int i17 = t.A2;
                    zG = oe2.f.G(tVar.W4().getValue());
                    Long activityId2 = rVar.getActivityId();
                    if (zG == oe2.f.G(rVar)) {
                    }
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
        } else {
            arrayList = null;
        }
        int i18 = t.A2;
        ((r53.z1) tVar.f146570x1.getValue()).setValue(arrayList);
        if (arrayList != null) {
            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ps.r) it.next()).h());
            }
            listB1 = p13.h0.b1(p13.h0.f1(arrayList2));
            if (listB1 != null) {
                r53.p2 p2Var2 = tVar.I;
                eVar = tVar.f146504b;
                eVar.getClass();
                arrayList3 = new ArrayList(p13.y.r(listB1, 10));
                while (r0.hasNext()) {
                    listA = eVar.f106213a.a(x0Var).a();
                    if (listA != null) {
                        it3 = listA.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((jr.q) next).d() != jr.s.Home);
                        qVar = (jr.q) next;
                    } else {
                        qVar = null;
                    }
                    if (qVar != null) {
                        listG = qVar.g();
                    } else {
                        listG = null;
                    }
                    arrayList3.add(new jr.m(x0Var, listG));
                }
                p2Var2.k(null, arrayList3);
            }
        }
        return Unit.INSTANCE;
    }
}
