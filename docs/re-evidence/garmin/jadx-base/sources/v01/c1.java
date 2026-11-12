package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lf11/j$b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetQuickAddDataUseCase$invoke$2", f = "GetQuickAddDataUseCase.kt", l = {39, 49, 87}, m = "invokeSuspend", v = 2)
public final class c1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends f11.j.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f174249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.i0 f174250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g21.h f174251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f174252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b11.i.c f174253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f174254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f174255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f174256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b63.v f174257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b11.k f174258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d1 f174259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f174260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b63.o f174261m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk01/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetQuickAddDataUseCase$invoke$2$dailySummaryTask$1", f = "GetQuickAddDataUseCase.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends k01.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d1 f174263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f174264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d1 d1Var, b63.o oVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174263b = d1Var;
            this.f174264c = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174263b, this.f174264c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends k01.b>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174262a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            m01.g gVar = this.f174263b.f174304a;
            this.f174262a = 1;
            Object objL0 = gVar.L0(this.f174264c, this);
            return objL0 == aVar ? aVar : objL0;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((b11.l) t7).f14337g), Integer.valueOf(((b11.l) t14).f14337g));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/z;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetQuickAddDataUseCase$invoke$2$mealsTask$1", f = "GetQuickAddDataUseCase.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.z>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d1 f174266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f174267c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d1 d1Var, b63.o oVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f174266b = d1Var;
            this.f174267c = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f174266b, this.f174267c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.z>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174265a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p0 p0Var = this.f174266b.f174305b;
            this.f174265a = 1;
            Object objA = p0.a(p0Var, this.f174267c, false, this, 6);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ls21/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetQuickAddDataUseCase$invoke$2$settingsTask$1", f = "GetQuickAddDataUseCase.kt", l = {37}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends s21.o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d1 f174269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f174270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d1 d1Var, b63.o oVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f174269b = d1Var;
            this.f174270c = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f174269b, this.f174270c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends s21.o>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174268a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            t0 t0Var = this.f174269b.f174306c;
            this.f174268a = 1;
            Object objA = t0Var.a(this.f174270c, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(boolean z14, b63.v vVar, b11.k kVar, d1 d1Var, String str, b63.o oVar, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f174256h = z14;
        this.f174257i = vVar;
        this.f174258j = kVar;
        this.f174259k = d1Var;
        this.f174260l = str;
        this.f174261m = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c1 c1Var = new c1(this.f174256h, this.f174257i, this.f174258j, this.f174259k, this.f174260l, this.f174261m, dVar);
        c1Var.f174255g = obj;
        return c1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends f11.j.b>> dVar) {
        return ((c1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124 A[LOOP:1: B:47:0x011e->B:49:0x0124, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x0201  */
    /* JADX WARN: Code duplicated, block: B:80:0x0205  */
    /* JADX WARN: Code duplicated, block: B:82:0x0213  */
    /* JADX WARN: Code duplicated, block: B:83:0x0218  */
    /* JADX WARN: Code duplicated, block: B:85:0x021c  */
    /* JADX WARN: Code duplicated, block: B:87:0x022a  */
    /* JADX WARN: Code duplicated, block: B:94:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x014c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        o53.i0 i0VarJ;
        Object objC;
        g21.h hVarA;
        Object objAwait;
        v2 v2Var;
        List<g01.x> list;
        List list2;
        b11.l lVarL;
        Long l14;
        String str;
        b11.i.c cVar;
        Object objAwait2;
        List listN0;
        b11.i.c cVar2;
        ArrayList arrayList;
        Iterator<g21.p> it;
        Iterator it3;
        Object next;
        b11.i iVar;
        ArrayList arrayList2;
        Iterator<T> it4;
        b11.l lVarB;
        g21.h hVar;
        v2 v2Var2;
        o53.b0 b0Var = (o53.b0) this.f174255g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174254f;
        boolean z14 = this.f174256h;
        d1 d1Var = this.f174259k;
        if (i14 == 0) {
            o13.r.b(obj);
            b63.o oVar = this.f174261m;
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(d1Var, oVar, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new c(d1Var, oVar, null), 3);
            i0VarJ = ge1.b.j(b0Var, null, null, new d(d1Var, oVar, null), 3);
            this.f174255g = null;
            this.f174249a = j0VarJ;
            this.f174250b = i0VarJ;
            this.f174254f = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            i0VarJ = this.f174250b;
            o53.j0 j0Var = this.f174249a;
            o13.r.b(obj);
            j0VarJ = j0Var;
            objC = obj;
        } else {
            if (i14 == 2) {
                g21.h hVar2 = this.f174251c;
                o53.i0 i0Var = this.f174250b;
                o13.r.b(obj);
                hVarA = hVar2;
                i0VarJ = i0Var;
                objAwait = obj;
                v2Var = (v2) objAwait;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
                    }
                    lc.u0.r();
                    return null;
                }
                list = ((g01.z) ((v2.b) v2Var).f47386a).f74294a;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    it4 = list.iterator();
                    while (it4.hasNext()) {
                        lVarB = ((g01.x) it4.next()).b();
                        if (lVarB != null) {
                            arrayList2.add(lVarB);
                        }
                    }
                    list2 = arrayList2;
                } else {
                    list2 = p13.j0.f134944a;
                }
                if (hVarA == null) {
                    return new v2.a(new Exception("Daily summary unexpectedly null"), null, null, 6, null);
                }
                lVarL = zf.b.L(list2, z14, this.f174257i, this.f174258j, d1Var.f174308e.a());
                if (lVarL != null) {
                    l14 = new Long(lVarL.f14331a);
                } else {
                    l14 = null;
                }
                if (l14 == null) {
                    return new v2.a(new IllegalStateException("mealId unexpectedly null"), null, null, 6, null);
                }
                str = this.f174260l;
                if (str != null) {
                    i53.c<g21.p> cVar3 = hVarA.f75430g;
                    arrayList = new ArrayList();
                    it = cVar3.iterator();
                    while (it.hasNext()) {
                        p13.d0.v(arrayList, it.next().f75476d);
                    }
                    it3 = arrayList.iterator();
                    do {
                        if (it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!p005kotlin.jvm.internal.s.g(((b11.i) next).getF14315a(), str));
                    iVar = (b11.i) next;
                    if (iVar != null || !(iVar instanceof b11.i.c)) {
                        return new v2.a(new Exception("Failed to find quick add item for id ".concat(str)), null, null, 6, null);
                    }
                    cVar = (b11.i.c) iVar;
                } else {
                    cVar = new b11.i.c(null, null, this.f174257i, l14.longValue(), new b11.f(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null));
                }
                this.f174255g = null;
                this.f174249a = null;
                this.f174250b = null;
                this.f174251c = hVarA;
                this.f174252d = list2;
                this.f174253e = cVar;
                this.f174254f = 3;
                objAwait2 = i0VarJ.await(this);
                if (objAwait2 != aVar) {
                    listN0 = list2;
                    cVar2 = cVar;
                }
                return aVar;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b11.i.c cVar4 = this.f174253e;
            listN0 = (List) this.f174252d;
            hVarA = this.f174251c;
            o13.r.b(obj);
            cVar2 = cVar4;
            objAwait2 = obj;
        }
        hVar = hVarA;
        v2Var2 = (v2) objAwait2;
        if (v2Var2 instanceof v2.b) {
            if (v2Var2 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        s21.o oVar2 = (s21.o) ((v2.b) v2Var2).f47386a;
        if (!z14) {
            listN0 = p13.h0.N0(listN0, new b());
        }
        return new v2.b(new f11.j.b(cVar2, hVar, i53.a.j(listN0), this.f174256h, false, oVar2, 16, null), 200, null, null, 12, null);
        v2 v2Var3 = (v2) objC;
        if (!(v2Var3 instanceof v2.b)) {
            if (v2Var3 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var3).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        hVarA = ((k01.b) ((v2.b) v2Var3).f47386a).a();
        this.f174255g = null;
        this.f174249a = null;
        this.f174250b = i0VarJ;
        this.f174251c = hVarA;
        this.f174254f = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            v2Var = (v2) objAwait;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
                }
                lc.u0.r();
                return null;
            }
            list = ((g01.z) ((v2.b) v2Var).f47386a).f74294a;
            if (list != null) {
                arrayList2 = new ArrayList();
                it4 = list.iterator();
                while (it4.hasNext()) {
                    lVarB = ((g01.x) it4.next()).b();
                    if (lVarB != null) {
                        arrayList2.add(lVarB);
                    }
                }
                list2 = arrayList2;
            } else {
                list2 = p13.j0.f134944a;
            }
            if (hVarA == null) {
                return new v2.a(new Exception("Daily summary unexpectedly null"), null, null, 6, null);
            }
            lVarL = zf.b.L(list2, z14, this.f174257i, this.f174258j, d1Var.f174308e.a());
            if (lVarL != null) {
                l14 = new Long(lVarL.f14331a);
            } else {
                l14 = null;
            }
            if (l14 == null) {
                return new v2.a(new IllegalStateException("mealId unexpectedly null"), null, null, 6, null);
            }
            str = this.f174260l;
            if (str != null) {
                i53.c<g21.p> cVar5 = hVarA.f75430g;
                arrayList = new ArrayList();
                it = cVar5.iterator();
                while (it.hasNext()) {
                    p13.d0.v(arrayList, it.next().f75476d);
                }
                it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!p005kotlin.jvm.internal.s.g(((b11.i) next).getF14315a(), str));
                iVar = (b11.i) next;
                if (iVar != null) {
                }
                return new v2.a(new Exception("Failed to find quick add item for id ".concat(str)), null, null, 6, null);
            }
            cVar = new b11.i.c(null, null, this.f174257i, l14.longValue(), new b11.f(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null));
            this.f174255g = null;
            this.f174249a = null;
            this.f174250b = null;
            this.f174251c = hVarA;
            this.f174252d = list2;
            this.f174253e = cVar;
            this.f174254f = 3;
            objAwait2 = i0VarJ.await(this);
            if (objAwait2 != aVar) {
                listN0 = list2;
                cVar2 = cVar;
                hVar = hVarA;
                v2Var2 = (v2) objAwait2;
                if (v2Var2 instanceof v2.b) {
                    if (v2Var2 instanceof v2.a) {
                        return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
                    }
                    lc.u0.r();
                    return null;
                }
                s21.o oVar3 = (s21.o) ((v2.b) v2Var2).f47386a;
                if (!z14) {
                    listN0 = p13.h0.N0(listN0, new b());
                }
                return new v2.b(new f11.j.b(cVar2, hVar, i53.a.j(listN0), this.f174256h, false, oVar3, 16, null), 200, null, null, 12, null);
            }
        }
        return aVar;
    }
}
