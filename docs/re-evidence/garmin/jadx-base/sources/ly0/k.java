package ly0;

import android.content.Context;
import gy0.k0;
import gy0.n0;
import gy0.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenViewModel$loadMapData$2", f = "MapFullscreenViewModel.kt", l = {108, 109, 123, 125}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f115318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f115319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f115320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f115321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f115322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public cy0.k f115323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f115324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f115325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f115326i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcy0/n;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenViewModel$loadMapData$2$entrySummariesTask$1", f = "MapFullscreenViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super List<? extends cy0.n>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f115328b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f115328b = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f115328b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends cy0.n>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115327a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o oVar = this.f115328b;
            k0 k0Var = (k0) oVar.f115342c.getValue();
            String str = oVar.f115341b;
            this.f115327a = 1;
            Object objD = k0Var.f80185a.d(str, this);
            return objD == aVar ? aVar : objD;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcy0/p;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenViewModel$loadMapData$2$polylinesTask$1", f = "MapFullscreenViewModel.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super List<? extends cy0.p>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f115330b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f115330b = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f115330b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends cy0.p>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115329a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o oVar = this.f115330b;
            n0 n0Var = (n0) oVar.f115343d.getValue();
            String str = oVar.f115341b;
            this.f115329a = 1;
            Serializable serializableA = n0Var.a(str, this);
            return serializableA == aVar ? aVar : serializableA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f115326i = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f115326i, dVar);
        kVar.f115325h = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009b A[LOOP:4: B:21:0x0095->B:23:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00be A[LOOP:5: B:25:0x00b8->B:27:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00df A[LOOP:6: B:29:0x00d9->B:31:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0106 A[LOOP:7: B:33:0x0100->B:35:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0138 A[PHI: r1 r3 r12
      0x0138: PHI (r1v8 java.util.List) = (r1v7 java.util.List), (r1v26 java.util.List) binds: [B:37:0x0135, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r3v13 java.lang.Object) = (r3v12 java.lang.Object), (r3v25 java.lang.Object) binds: [B:37:0x0135, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r12v5 java.util.List) = (r12v17 java.util.List), (r12v11 java.util.List) binds: [B:37:0x0135, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x013c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e7 A[LOOP:2: B:67:0x01e1->B:69:0x01e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0206 A[LOOP:3: B:71:0x0200->B:73:0x0206, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x021b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0223  */
    /* JADX WARN: Code duplicated, block: B:81:0x0227  */
    /* JADX WARN: Code duplicated, block: B:83:0x0233  */
    /* JADX WARN: Code duplicated, block: B:90:0x0249  */
    /* JADX WARN: Code duplicated, block: B:91:0x025a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0261  */
    /* JADX WARN: Code duplicated, block: B:95:0x0267  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        Object objC;
        List list;
        Object objAwait;
        List list2;
        ArrayList arrayList;
        Iterator it;
        Context context;
        ArrayList arrayList2;
        Iterator it3;
        ArrayList arrayList3;
        Iterator it4;
        ArrayList arrayList4;
        Iterator it5;
        List arrayList5;
        Object objE;
        List list3;
        cy0.k kVar;
        List<Long> listF;
        List list4;
        o oVar;
        Long l14;
        Object objA;
        List list5;
        cy0.k kVar2;
        List list6;
        ArrayList arrayList6;
        p2 p2Var;
        Object value;
        qe2.h hVar;
        ArrayList arrayList7;
        ArrayList arrayList8;
        Iterator<T> it6;
        Iterator it7;
        com.garmin.android.library.mapsdkadapter.e eVarX4;
        le2.a aVar;
        ke2.b bVar;
        ke2.b bVar2;
        List list7;
        p2 p2Var2;
        Object value2;
        List list8;
        com.garmin.android.library.mapsdkadapter.q qVarA;
        b0 b0Var = (b0) this.f115325h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115324g;
        o oVar2 = this.f115326i;
        if (i14 == 0) {
            o13.r.b(obj);
            j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(oVar2, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new a(oVar2, null), 3);
            this.f115325h = null;
            this.f115318a = j0VarJ;
            this.f115324g = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            j0VarJ = this.f115318a;
            o13.r.b(obj);
            objC = obj;
        } else {
            if (i14 == 2) {
                List list9 = this.f115319b;
                o13.r.b(obj);
                list = list9;
                objAwait = obj;
                list2 = (List) objAwait;
                arrayList = new ArrayList(y.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cy0.p) it.next()).f56776b);
                }
                oVar2.f115364z = arrayList;
                context = oVar2.f115340a;
                arrayList2 = new ArrayList(y.r(list, 10));
                it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((cy0.p) it3.next()).a(context));
                }
                arrayList3 = new ArrayList(y.r(list, 10));
                it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((cy0.p) it4.next()).c(context, list2));
                }
                oVar2.A = h0.C0(arrayList2, arrayList3);
                arrayList4 = new ArrayList(y.r(list, 10));
                it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((cy0.p) it5.next()).b(context, list2));
                }
                arrayList5 = new ArrayList();
                gy0.j0 j0Var = (gy0.j0) oVar2.f115344e.getValue();
                String str = oVar2.f115341b;
                this.f115325h = null;
                this.f115318a = null;
                this.f115319b = null;
                this.f115320c = arrayList4;
                this.f115321d = arrayList5;
                this.f115324g = 3;
                objE = j0Var.f80181a.e(str, this);
                list3 = arrayList4;
                if (objE != aVar2) {
                    kVar = (cy0.k) objE;
                    list6 = list3;
                    if (kVar != null) {
                        listF = kVar.f();
                        if (listF == null) {
                        }
                        list4 = arrayList5;
                        oVar = oVar2;
                        list7 = list3;
                        List list10 = list7;
                        p2Var2 = oVar.f115360v;
                        do {
                            value2 = p2Var2.getValue();
                        } while (!p2Var2.b(value2, kVar.getName()));
                        arrayList5 = list4;
                        list6 = list10;
                    }
                    oVar2.F = h0.C0(list6, arrayList5);
                    arrayList6 = oVar2.B;
                    p2Var = oVar2.f115362x;
                    do {
                        value = p2Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!p2Var.b(value, Boolean.valueOf(!arrayList6.isEmpty())));
                    hVar = oVar2.Y;
                    if (hVar != null) {
                        arrayList7 = new ArrayList();
                        List<com.garmin.android.library.mapsdkadapter.q> list11 = oVar2.A;
                        arrayList8 = new ArrayList(y.r(list11, 10));
                        it6 = list11.iterator();
                        while (it6.hasNext()) {
                            arrayList8.add(((com.garmin.android.library.mapsdkadapter.q) it6.next()).f50328a.f93153a);
                        }
                        arrayList7.addAll(y.s(arrayList8));
                        it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.addAll(((com.garmin.android.library.mapsdkadapter.q) it7.next()).f50328a.f93153a);
                        }
                        if (!arrayList7.isEmpty()) {
                            eVarX4 = o.x4(arrayList7);
                            if (oVar2.H0) {
                                aVar = oVar2.X;
                                if (aVar != null) {
                                    bVar = aVar.f112053b;
                                    bVar2 = aVar.f112052a;
                                    if (bVar.f104551a != 0.0d) {
                                        hVar.j(new com.garmin.android.library.mapsdkadapter.e(ke2.c.a(bVar), ke2.c.a(bVar2)), 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                                    } else {
                                        hVar.j(new com.garmin.android.library.mapsdkadapter.e(ke2.c.a(bVar), ke2.c.a(bVar2)), 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                                    }
                                } else {
                                    hVar.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                                }
                                if (oVar2.I0) {
                                    oVar2.z4(true);
                                    oVar2.I0 = false;
                                }
                            } else {
                                hVar.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                            }
                        }
                        oVar2.y4(hVar);
                    }
                    oVar2.H0 = false;
                    return Unit.INSTANCE;
                }
                return aVar2;
            }
            if (i14 == 3) {
                arrayList5 = this.f115321d;
                List list12 = this.f115320c;
                o13.r.b(obj);
                list3 = list12;
                objE = obj;
                kVar = (cy0.k) objE;
                list6 = list3;
                if (kVar != null) {
                    listF = kVar.f();
                    if (listF == null && (l14 = (Long) h0.d0(listF)) != null) {
                        long jLongValue = l14.longValue();
                        v vVar = (v) oVar2.f115346g.getValue();
                        this.f115325h = null;
                        this.f115318a = null;
                        this.f115319b = null;
                        this.f115320c = list3;
                        this.f115321d = arrayList5;
                        this.f115322e = oVar2;
                        this.f115323f = kVar;
                        this.f115324g = 4;
                        objA = vVar.a(jLongValue, this);
                        if (objA != aVar2) {
                            list5 = arrayList5;
                            kVar2 = kVar;
                            oVar = oVar2;
                            list8 = list3;
                        }
                        return aVar2;
                    }
                    list4 = arrayList5;
                    oVar = oVar2;
                    list7 = list3;
                    List list13 = list7;
                    p2Var2 = oVar.f115360v;
                    do {
                        value2 = p2Var2.getValue();
                    } while (!p2Var2.b(value2, kVar.getName()));
                    arrayList5 = list4;
                    list6 = list13;
                }
                oVar2.F = h0.C0(list6, arrayList5);
                arrayList6 = oVar2.B;
                p2Var = oVar2.f115362x;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.valueOf(!arrayList6.isEmpty())));
                hVar = oVar2.Y;
                if (hVar != null) {
                    arrayList7 = new ArrayList();
                    List<com.garmin.android.library.mapsdkadapter.q> list14 = oVar2.A;
                    arrayList8 = new ArrayList(y.r(list14, 10));
                    it6 = list14.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(((com.garmin.android.library.mapsdkadapter.q) it6.next()).f50328a.f93153a);
                    }
                    arrayList7.addAll(y.s(arrayList8));
                    it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        arrayList7.addAll(((com.garmin.android.library.mapsdkadapter.q) it7.next()).f50328a.f93153a);
                    }
                    if (!arrayList7.isEmpty()) {
                        eVarX4 = o.x4(arrayList7);
                        if (oVar2.H0) {
                            aVar = oVar2.X;
                            if (aVar != null) {
                                bVar = aVar.f112053b;
                                bVar2 = aVar.f112052a;
                                if (bVar.f104551a != 0.0d && bVar.f104552b == 0.0d && bVar2.f104551a == 0.0d && bVar2.f104552b == 0.0d) {
                                    hVar.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                                } else {
                                    hVar.j(new com.garmin.android.library.mapsdkadapter.e(ke2.c.a(bVar), ke2.c.a(bVar2)), 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                                }
                            } else {
                                hVar.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                            }
                            if (oVar2.I0) {
                                oVar2.z4(true);
                                oVar2.I0 = false;
                            }
                        } else {
                            hVar.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                        }
                    }
                    oVar2.y4(hVar);
                }
                oVar2.H0 = false;
                return Unit.INSTANCE;
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar2 = this.f115323f;
            oVar = this.f115322e;
            list5 = this.f115321d;
            List list15 = this.f115320c;
            o13.r.b(obj);
            list8 = list15;
            objA = obj;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) objA;
        if (eVar != null && (qVarA = py0.a.a(oVar.f115340a, eVar)) != null) {
            oVar.B.add(qVarA);
            list5.addAll(py0.a.b(eVar));
        }
        list4 = list5;
        kVar = kVar2;
        list7 = list8;
        List list16 = list7;
        p2Var2 = oVar.f115360v;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, kVar.getName()));
        arrayList5 = list4;
        list6 = list16;
        oVar2.F = h0.C0(list6, arrayList5);
        arrayList6 = oVar2.B;
        p2Var = oVar2.f115362x;
        do {
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.valueOf(!arrayList6.isEmpty())));
        hVar = oVar2.Y;
        if (hVar != null) {
            arrayList7 = new ArrayList();
            List<com.garmin.android.library.mapsdkadapter.q> list17 = oVar2.A;
            arrayList8 = new ArrayList(y.r(list17, 10));
            it6 = list17.iterator();
            while (it6.hasNext()) {
                arrayList8.add(((com.garmin.android.library.mapsdkadapter.q) it6.next()).f50328a.f93153a);
            }
            arrayList7.addAll(y.s(arrayList8));
            it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                arrayList7.addAll(((com.garmin.android.library.mapsdkadapter.q) it7.next()).f50328a.f93153a);
            }
            if (!arrayList7.isEmpty()) {
                eVarX4 = o.x4(arrayList7);
                if (oVar2.H0) {
                    aVar = oVar2.X;
                    if (aVar != null) {
                        bVar = aVar.f112053b;
                        bVar2 = aVar.f112052a;
                        if (bVar.f104551a != 0.0d) {
                            hVar.j(new com.garmin.android.library.mapsdkadapter.e(ke2.c.a(bVar), ke2.c.a(bVar2)), 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                        } else {
                            hVar.j(new com.garmin.android.library.mapsdkadapter.e(ke2.c.a(bVar), ke2.c.a(bVar2)), 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                        }
                    } else {
                        hVar.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                    }
                    if (oVar2.I0) {
                        oVar2.z4(true);
                        oVar2.I0 = false;
                    }
                } else {
                    hVar.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                }
            }
            oVar2.y4(hVar);
        }
        oVar2.H0 = false;
        return Unit.INSTANCE;
        list = (List) objC;
        this.f115325h = null;
        this.f115318a = null;
        this.f115319b = list;
        this.f115324g = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar2) {
            list2 = (List) objAwait;
            arrayList = new ArrayList(y.r(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((cy0.p) it.next()).f56776b);
            }
            oVar2.f115364z = arrayList;
            context = oVar2.f115340a;
            arrayList2 = new ArrayList(y.r(list, 10));
            it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((cy0.p) it3.next()).a(context));
            }
            arrayList3 = new ArrayList(y.r(list, 10));
            it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((cy0.p) it4.next()).c(context, list2));
            }
            oVar2.A = h0.C0(arrayList2, arrayList3);
            arrayList4 = new ArrayList(y.r(list, 10));
            it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList4.add(((cy0.p) it5.next()).b(context, list2));
            }
            arrayList5 = new ArrayList();
            gy0.j0 j0Var2 = (gy0.j0) oVar2.f115344e.getValue();
            String str2 = oVar2.f115341b;
            this.f115325h = null;
            this.f115318a = null;
            this.f115319b = null;
            this.f115320c = arrayList4;
            this.f115321d = arrayList5;
            this.f115324g = 3;
            objE = j0Var2.f80181a.e(str2, this);
            list3 = arrayList4;
            if (objE != aVar2) {
                kVar = (cy0.k) objE;
                list6 = list3;
                if (kVar != null) {
                    listF = kVar.f();
                    if (listF == null) {
                    }
                    list4 = arrayList5;
                    oVar = oVar2;
                    list7 = list3;
                    List list18 = list7;
                    p2Var2 = oVar.f115360v;
                    do {
                        value2 = p2Var2.getValue();
                    } while (!p2Var2.b(value2, kVar.getName()));
                    arrayList5 = list4;
                    list6 = list18;
                }
                oVar2.F = h0.C0(list6, arrayList5);
                arrayList6 = oVar2.B;
                p2Var = oVar2.f115362x;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.valueOf(!arrayList6.isEmpty())));
                hVar = oVar2.Y;
                if (hVar != null) {
                    arrayList7 = new ArrayList();
                    List<com.garmin.android.library.mapsdkadapter.q> list19 = oVar2.A;
                    arrayList8 = new ArrayList(y.r(list19, 10));
                    it6 = list19.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(((com.garmin.android.library.mapsdkadapter.q) it6.next()).f50328a.f93153a);
                    }
                    arrayList7.addAll(y.s(arrayList8));
                    it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        arrayList7.addAll(((com.garmin.android.library.mapsdkadapter.q) it7.next()).f50328a.f93153a);
                    }
                    if (!arrayList7.isEmpty()) {
                        eVarX4 = o.x4(arrayList7);
                        if (oVar2.H0) {
                            aVar = oVar2.X;
                            if (aVar != null) {
                                bVar = aVar.f112053b;
                                bVar2 = aVar.f112052a;
                                if (bVar.f104551a != 0.0d) {
                                    hVar.j(new com.garmin.android.library.mapsdkadapter.e(ke2.c.a(bVar), ke2.c.a(bVar2)), 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                                } else {
                                    hVar.j(new com.garmin.android.library.mapsdkadapter.e(ke2.c.a(bVar), ke2.c.a(bVar2)), 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                                }
                            } else {
                                hVar.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                            }
                            if (oVar2.I0) {
                                oVar2.z4(true);
                                oVar2.I0 = false;
                            }
                        } else {
                            hVar.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                        }
                    }
                    oVar2.y4(hVar);
                }
                oVar2.H0 = false;
                return Unit.INSTANCE;
            }
        }
        return aVar2;
    }
}
