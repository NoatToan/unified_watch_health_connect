package ky0;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMultiDayActivityDetails$6", f = "MultiDayActivitiesDetailViewModel.kt", l = {398, 399}, m = "invokeSuspend", v = 2)
public final class j1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f107388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f107389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f107391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f107392e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcy0/n;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMultiDayActivityDetails$6$entrySummariesTask$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {397}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends cy0.n>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107394b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f107394b = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f107394b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends cy0.n>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107393a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            w0 w0Var = this.f107394b;
            gy0.k0 k0Var = (gy0.k0) w0Var.f107587f.getValue();
            String str = w0Var.f107579b;
            this.f107393a = 1;
            Object objD = k0Var.f80185a.d(str, this);
            return objD == aVar ? aVar : objD;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcy0/p;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMultiDayActivityDetails$6$polylinesTask$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {396}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends cy0.p>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f107396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w0 w0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f107396b = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f107396b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends cy0.p>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107395a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            w0 w0Var = this.f107396b;
            gy0.n0 n0Var = (gy0.n0) w0Var.f107585e.getValue();
            String str = w0Var.f107579b;
            this.f107395a = 1;
            Serializable serializableA = n0Var.a(str, this);
            return serializableA == aVar ? aVar : serializableA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(w0 w0Var, t13.d<? super j1> dVar) {
        super(2, dVar);
        this.f107392e = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j1 j1Var = new j1(this.f107392e, dVar);
        j1Var.f107391d = obj;
        return j1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008b A[LOOP:1: B:21:0x0085->B:23:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac A[LOOP:2: B:25:0x00a6->B:27:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd A[LOOP:3: B:29:0x00c7->B:31:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127 A[LOOP:4: B:51:0x0127->B:64:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:54:0x014f A[LOOP:5: B:54:0x014f->B:66:?, LOOP_START] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        List list;
        List list2;
        p2 p2Var;
        p2 p2Var2;
        Context context;
        Object value;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it3;
        ArrayList arrayList3;
        Iterator it4;
        i53.c<com.garmin.android.library.mapsdkadapter.p> cVar;
        ArrayList arrayList4;
        ArrayList arrayList5;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.library.mapsdkadapter.q qVar;
        Object value2;
        i53.c cVarE;
        Object value3;
        i53.c cVarE2;
        i53.c cVarE3;
        com.garmin.android.library.mapsdkadapter.q qVarA;
        o53.b0 b0Var = (o53.b0) this.f107391d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107390c;
        w0 w0Var = this.f107392e;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(w0Var, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new a(w0Var, null), 3);
            this.f107391d = null;
            this.f107388a = j0VarJ;
            this.f107390c = 1;
            obj = j0VarJ2.C(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            j0VarJ = this.f107388a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = this.f107389b;
            o13.r.b(obj);
        }
        list2 = (List) obj;
        p2Var = w0Var.M0;
        p2Var2 = w0Var.I0;
        context = w0Var.f107577a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, i53.a.j(list2)));
        arrayList = new ArrayList(p13.y.r(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cy0.p) it.next()).c(context, list2));
        }
        arrayList2 = new ArrayList(p13.y.r(list, 10));
        it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((cy0.p) it3.next()).a(context));
        }
        arrayList3 = new ArrayList(p13.y.r(list, 10));
        it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((cy0.p) it4.next()).b(context, list2));
        }
        cVar = ((ly0.s) p2Var2.getValue()).f115384b;
        if (cVar != null) {
            arrayList4 = new ArrayList(cVar);
        } else {
            arrayList4 = new ArrayList();
        }
        arrayList5 = new ArrayList();
        eVar = (com.garmin.android.apps.connectmobile.courses.model.e) w0Var.f107623x1.getValue();
        if (eVar != null) {
            qVarA = py0.a.a(context, eVar);
            if (qVarA != null) {
                arrayList5.addAll(py0.a.b(eVar));
            }
            qVar = qVarA;
        } else {
            qVar = null;
        }
        if (!arrayList4.containsAll(arrayList3)) {
            arrayList4.addAll(arrayList3);
        }
        if (!arrayList4.containsAll(arrayList5)) {
            arrayList4.addAll(arrayList5);
        }
        if (list.isEmpty()) {
            do {
                value2 = p2Var2.getValue();
                ly0.s sVar = (ly0.s) p2Var2.getValue();
                cVarE = i53.a.e(arrayList4);
                sVar.getClass();
            } while (!p2Var2.b(value2, new ly0.s(null, cVarE, qVar)));
        } else {
            do {
                value3 = p2Var2.getValue();
                ly0.s sVar2 = (ly0.s) p2Var2.getValue();
                cVarE2 = i53.a.e(p13.h0.C0(arrayList2, arrayList));
                cVarE3 = i53.a.e(arrayList4);
                sVar2.getClass();
            } while (!p2Var2.b(value3, new ly0.s(cVarE2, cVarE3, qVar)));
        }
        return Unit.INSTANCE;
        List list3 = (List) obj;
        this.f107391d = null;
        this.f107388a = null;
        this.f107389b = list3;
        this.f107390c = 2;
        Object objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            list = list3;
            obj = objAwait;
            list2 = (List) obj;
            p2Var = w0Var.M0;
            p2Var2 = w0Var.I0;
            context = w0Var.f107577a;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, i53.a.j(list2)));
            arrayList = new ArrayList(p13.y.r(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((cy0.p) it.next()).c(context, list2));
            }
            arrayList2 = new ArrayList(p13.y.r(list, 10));
            it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((cy0.p) it3.next()).a(context));
            }
            arrayList3 = new ArrayList(p13.y.r(list, 10));
            it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((cy0.p) it4.next()).b(context, list2));
            }
            cVar = ((ly0.s) p2Var2.getValue()).f115384b;
            if (cVar != null) {
                arrayList4 = new ArrayList(cVar);
            } else {
                arrayList4 = new ArrayList();
            }
            arrayList5 = new ArrayList();
            eVar = (com.garmin.android.apps.connectmobile.courses.model.e) w0Var.f107623x1.getValue();
            if (eVar != null) {
                qVarA = py0.a.a(context, eVar);
                if (qVarA != null) {
                    arrayList5.addAll(py0.a.b(eVar));
                }
                qVar = qVarA;
            } else {
                qVar = null;
            }
            if (!arrayList4.containsAll(arrayList3)) {
                arrayList4.addAll(arrayList3);
            }
            if (!arrayList4.containsAll(arrayList5)) {
                arrayList4.addAll(arrayList5);
            }
            if (list.isEmpty()) {
                do {
                    value3 = p2Var2.getValue();
                    ly0.s sVar3 = (ly0.s) p2Var2.getValue();
                    cVarE2 = i53.a.e(p13.h0.C0(arrayList2, arrayList));
                    cVarE3 = i53.a.e(arrayList4);
                    sVar3.getClass();
                } while (!p2Var2.b(value3, new ly0.s(cVarE2, cVarE3, qVar)));
            } else {
                do {
                    value2 = p2Var2.getValue();
                    ly0.s sVar4 = (ly0.s) p2Var2.getValue();
                    cVarE = i53.a.e(arrayList4);
                    sVar4.getClass();
                } while (!p2Var2.b(value2, new ly0.s(null, cVarE, qVar)));
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
