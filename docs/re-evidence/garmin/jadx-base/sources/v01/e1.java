package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ll11/r;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetRecipeDetailsUseCase$invoke$2", f = "GetRecipeDetailsUseCase.kt", l = {44, 49, 56}, m = "invokeSuspend", v = 2)
public final class e1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends l11.r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f174319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.i0 f174320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j01.c f174321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g21.h f174322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f174323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f174324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l11.t.b f174325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f174326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b63.u f174327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b11.k f174328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f1 f174329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i01.i f174330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f174331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f174332n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((b11.l) t7).f14337g), Integer.valueOf(((b11.l) t14).f14337g));
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetRecipeDetailsUseCase$invoke$2$mealsTask$1", f = "GetRecipeDetailsUseCase.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.z>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1 f174334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.u f174335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f174336d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f1 f1Var, b63.u uVar, boolean z14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f174334b = f1Var;
            this.f174335c = uVar;
            this.f174336d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f174334b, this.f174335c, this.f174336d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.z>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174333a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p0 p0Var = this.f174334b.f174357b;
            b63.o oVarB = this.f174335c.b();
            this.f174333a = 1;
            Object objA = p0.a(p0Var, oVarB, this.f174336d, this, 4);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lj01/c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetRecipeDetailsUseCase$invoke$2$recipeTask$1", f = "GetRecipeDetailsUseCase.kt", l = {40}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends j01.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1 f174338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f174339c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f1 f1Var, String str, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f174338b = f1Var;
            this.f174339c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f174338b, this.f174339c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends j01.c>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174337a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            m01.g gVar = this.f174338b.f174358c;
            this.f174337a = 1;
            Object objK = gVar.k(this.f174339c, this);
            return objK == aVar ? aVar : objK;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk01/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetRecipeDetailsUseCase$invoke$2$summaryTask$1", f = "GetRecipeDetailsUseCase.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends k01.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1 f174341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.u f174342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f174343d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f1 f1Var, b63.u uVar, boolean z14, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f174341b = f1Var;
            this.f174342c = uVar;
            this.f174343d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f174341b, this.f174342c, this.f174343d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends k01.b>> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174340a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            g0 g0Var = this.f174341b.f174356a;
            b63.o oVarB = this.f174342c.b();
            this.f174340a = 1;
            Object objA = g0Var.a(oVarB, this.f174343d, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(l11.t.b bVar, boolean z14, b63.u uVar, b11.k kVar, f1 f1Var, i01.i iVar, String str, boolean z15, t13.d<? super e1> dVar) {
        super(2, dVar);
        this.f174325g = bVar;
        this.f174326h = z14;
        this.f174327i = uVar;
        this.f174328j = kVar;
        this.f174329k = f1Var;
        this.f174330l = iVar;
        this.f174331m = str;
        this.f174332n = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e1 e1Var = new e1(this.f174325g, this.f174326h, this.f174327i, this.f174328j, this.f174329k, this.f174330l, this.f174331m, this.f174332n, dVar);
        e1Var.f174324f = obj;
        return e1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends l11.r>> dVar) {
        return ((e1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:121:0x030a  */
    /* JADX WARN: Code duplicated, block: B:123:0x030e  */
    /* JADX WARN: Code duplicated, block: B:125:0x031c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0321  */
    /* JADX WARN: Code duplicated, block: B:129:0x0325  */
    /* JADX WARN: Code duplicated, block: B:131:0x0333  */
    /* JADX WARN: Code duplicated, block: B:140:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0207  */
    /* JADX WARN: Code duplicated, block: B:89:0x0230  */
    /* JADX WARN: Code duplicated, block: B:91:0x0245  */
    /* JADX WARN: Code duplicated, block: B:93:0x0249  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        o53.i0 i0VarJ;
        Object objC;
        Object objAwait;
        o53.i0 i0Var;
        j01.c cVar;
        v2 v2Var;
        g21.h hVarA;
        Object objAwait2;
        j01.c cVar2;
        g21.h hVar;
        v2 v2Var2;
        List<g01.x> list;
        ArrayList arrayList;
        Iterator<T> it;
        boolean z14;
        boolean z15;
        b11.l lVarL;
        b11.d dVarA;
        g01.c0 c0Var;
        b11.s sVarB;
        double d14;
        l11.r rVar;
        Object next;
        b11.l lVarB;
        o53.b0 b0Var = (o53.b0) this.f174324f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174323e;
        b63.u uVar = this.f174327i;
        f1 f1Var = this.f174329k;
        b11.e eVar = null;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new d(f1Var, this.f174331m, null), 3);
            boolean z16 = this.f174332n;
            j0VarJ = ge1.b.j(b0Var, null, null, new e(f1Var, uVar, z16, null), 3);
            i0VarJ = ge1.b.j(b0Var, null, null, new c(f1Var, uVar, z16, null), 3);
            this.f174324f = null;
            this.f174319a = j0VarJ;
            this.f174320b = i0VarJ;
            this.f174323e = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            i0VarJ = this.f174320b;
            o53.j0 j0Var = this.f174319a;
            o13.r.b(obj);
            j0VarJ = j0Var;
            objC = obj;
        } else {
            if (i14 == 2) {
                cVar = this.f174321c;
                i0Var = this.f174320b;
                o13.r.b(obj);
                objAwait = obj;
                v2Var = (v2) objAwait;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
                    }
                    lc.u0.r();
                    return null;
                }
                hVarA = ((k01.b) ((v2.b) v2Var).f47386a).a();
                if (hVarA == null) {
                    return new v2.a(new Exception(b71.i.f("Invalid daily summary result: ", v2Var)), null, null, 6, null);
                }
                this.f174324f = null;
                this.f174319a = null;
                this.f174320b = null;
                this.f174321c = cVar;
                this.f174322d = hVarA;
                this.f174323e = 3;
                objAwait2 = i0Var.await(this);
                if (objAwait2 != aVar) {
                    cVar2 = cVar;
                    hVar = hVarA;
                }
                return aVar;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g21.h hVar2 = this.f174322d;
            cVar2 = this.f174321c;
            o13.r.b(obj);
            objAwait2 = obj;
            hVar = hVar2;
        }
        v2Var2 = (v2) objAwait2;
        if (v2Var2 instanceof v2.b) {
            if (v2Var2 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        list = ((g01.z) ((v2.b) v2Var2).f47386a).f74294a;
        if (list != null) {
            return new v2.a(new Exception(b71.i.f("Invalid meals result: ", v2Var2)), null, null, 6, null);
        }
        arrayList = new ArrayList();
        it = list.iterator();
        while (it.hasNext()) {
            lVarB = ((g01.x) it.next()).b();
            if (lVarB != null) {
                arrayList.add(lVarB);
            }
        }
        l11.t.b bVar = this.f174325g;
        z14 = bVar instanceof l11.t.b.a;
        z15 = this.f174326h;
        if (!z14 || (bVar instanceof l11.t.b.C2080b)) {
            lVarL = zf.b.L(arrayList, z15, uVar.c(), this.f174328j, f1Var.f174359d.a());
            if (lVarL == null) {
                return new v2.a(new Exception("mealId unexpectedly null"), null, null, 6, null);
            }
            long j8 = lVarL.f14331a;
            dVarA = new g01.o(cVar2.f95997b, cVar2.f95998c, g01.w.GENERIC, cVar2.f95999d, "GARMIN", cVar2.f96002g, cVar2.f96003h, (String) null, 128, (p005kotlin.jvm.internal.j) null).a();
            if (dVarA == null) {
                return new v2.a(new Exception("Invalid food metadata"), null, null, 6, null);
            }
            c0Var = cVar2.f96005j;
            if (c0Var != null || (sVarB = c0Var.b()) == null) {
                return new v2.a(new Exception("No nutrition content"), null, null, 6, null);
            }
            b11.t.a aVar2 = b11.t.f14377d;
            List list2 = cVar2.f96006k;
            if (list2 == null) {
                list2 = p13.j0.f134944a;
            }
            g01.u uVar2 = dVarA.f14257e;
            aVar2.getClass();
            b11.t tVarA = b11.t.a.a(list2, uVar2);
            if (z14) {
                d14 = ((l11.t.b.a) bVar).f108272a;
            } else {
                if (!(bVar instanceof l11.t.b.C2080b)) {
                    lc.u0.r();
                    return null;
                }
                d14 = ((l11.t.b.C2080b) bVar).f108275a;
            }
            rVar = new l11.r(new b11.i.b(null, this.f174330l, uVar.c(), d14, cVar2.f96007l, j8, dVarA, sVarB, cVar2.f96008m, tVarA), i53.a.a(sVarB), hVar, z15 ? i53.a.j(arrayList) : i53.a.j(p13.h0.N0(arrayList, new a())), this.f174326h, cVar2.f96001f, false, 64, null);
        } else {
            if (!(bVar instanceof l11.t.b.c)) {
                lc.u0.r();
                return null;
            }
            i53.c<g21.p> cVar3 = hVar.f75430g;
            ArrayList arrayList2 = new ArrayList();
            Iterator<g21.p> it3 = cVar3.iterator();
            while (it3.hasNext()) {
                p13.d0.v(arrayList2, it3.next().f75476d);
            }
            Iterator it4 = arrayList2.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!p005kotlin.jvm.internal.s.g(((b11.i) next).getF14315a(), ((l11.t.b.c) bVar).f108278a));
            b11.i iVar = (b11.i) next;
            if (iVar == null || !(iVar instanceof b11.i.b)) {
                return new v2.a(new Exception(fb1.c.n("Failed to find logged food for id ", ((l11.t.b.c) bVar).f108278a)), null, null, 6, null);
            }
            for (b11.e eVar2 : hVar.f75431h) {
                if (p005kotlin.jvm.internal.s.g(eVar2.f14261a.f14253a, ((b11.i.b) iVar).f14311g.f14253a)) {
                    eVar = eVar2;
                    break;
                }
            }
            b11.e eVar3 = eVar;
            if (eVar3 == null) {
                return new v2.a(new Exception(fb1.c.n("Failed to find food for id ", ((b11.i.b) iVar).f14311g.f14253a)), null, null, 6, null);
            }
            rVar = new l11.r((b11.i.b) iVar, eVar3.f14262b, hVar, z15 ? i53.a.j(arrayList) : i53.a.j(p13.h0.N0(arrayList, new b())), this.f174326h, cVar2.f96001f, false, 64, null);
        }
        return new v2.b(rVar, 200, null, null, 12, null);
        v2 v2Var3 = (v2) objC;
        if (!(v2Var3 instanceof v2.b)) {
            if (v2Var3 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var3).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        j01.c cVar4 = (j01.c) ((v2.b) v2Var3).f47386a;
        this.f174324f = null;
        this.f174319a = null;
        this.f174320b = i0VarJ;
        this.f174321c = cVar4;
        this.f174323e = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            i0Var = i0VarJ;
            cVar = cVar4;
            v2Var = (v2) objAwait;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
                }
                lc.u0.r();
                return null;
            }
            hVarA = ((k01.b) ((v2.b) v2Var).f47386a).a();
            if (hVarA == null) {
                return new v2.a(new Exception(b71.i.f("Invalid daily summary result: ", v2Var)), null, null, 6, null);
            }
            this.f174324f = null;
            this.f174319a = null;
            this.f174320b = null;
            this.f174321c = cVar;
            this.f174322d = hVarA;
            this.f174323e = 3;
            objAwait2 = i0Var.await(this);
            if (objAwait2 != aVar) {
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
                list = ((g01.z) ((v2.b) v2Var2).f47386a).f74294a;
                if (list != null) {
                    return new v2.a(new Exception(b71.i.f("Invalid meals result: ", v2Var2)), null, null, 6, null);
                }
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    lVarB = ((g01.x) it.next()).b();
                    if (lVarB != null) {
                        arrayList.add(lVarB);
                    }
                }
                l11.t.b bVar2 = this.f174325g;
                z14 = bVar2 instanceof l11.t.b.a;
                z15 = this.f174326h;
                if (z14) {
                    lVarL = zf.b.L(arrayList, z15, uVar.c(), this.f174328j, f1Var.f174359d.a());
                    if (lVarL == null) {
                        return new v2.a(new Exception("mealId unexpectedly null"), null, null, 6, null);
                    }
                    long j14 = lVarL.f14331a;
                    dVarA = new g01.o(cVar2.f95997b, cVar2.f95998c, g01.w.GENERIC, cVar2.f95999d, "GARMIN", cVar2.f96002g, cVar2.f96003h, (String) null, 128, (p005kotlin.jvm.internal.j) null).a();
                    if (dVarA == null) {
                        return new v2.a(new Exception("Invalid food metadata"), null, null, 6, null);
                    }
                    c0Var = cVar2.f96005j;
                    if (c0Var != null) {
                    }
                    return new v2.a(new Exception("No nutrition content"), null, null, 6, null);
                }
                lVarL = zf.b.L(arrayList, z15, uVar.c(), this.f174328j, f1Var.f174359d.a());
                if (lVarL == null) {
                    return new v2.a(new Exception("mealId unexpectedly null"), null, null, 6, null);
                }
                long j15 = lVarL.f14331a;
                dVarA = new g01.o(cVar2.f95997b, cVar2.f95998c, g01.w.GENERIC, cVar2.f95999d, "GARMIN", cVar2.f96002g, cVar2.f96003h, (String) null, 128, (p005kotlin.jvm.internal.j) null).a();
                if (dVarA == null) {
                    return new v2.a(new Exception("Invalid food metadata"), null, null, 6, null);
                }
                c0Var = cVar2.f96005j;
                if (c0Var != null) {
                }
                return new v2.a(new Exception("No nutrition content"), null, null, 6, null);
                return new v2.b(rVar, 200, null, null, 12, null);
            }
        }
        return aVar;
    }
}
