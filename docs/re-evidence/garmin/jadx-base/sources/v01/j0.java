package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ll11/a$b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetFoodDetailsUseCase$invoke$2", f = "GetFoodDetailsUseCase.kt", l = {77, 87, 99}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends l11.a.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f174417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.i0 f174418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g21.h f174419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f174420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f174421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f174422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l11.a.c f174423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f174424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b63.u f174425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b11.k f174426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f174427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i01.i f174428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f174429m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/p;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetFoodDetailsUseCase$invoke$2$getFoodTask$1", f = "GetFoodDetailsUseCase.kt", l = {42, 61}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.p>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l11.a.c f174431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0 f174432c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l11.a.c cVar, k0 k0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174431b = cVar;
            this.f174432c = k0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174431b, this.f174432c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.p>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r12 == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
        
            if (r12 == r0) goto L26;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174430a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return (v2) obj;
                }
                if (i14 == 2) {
                    o13.r.b(obj);
                    return (v2) obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            l11.a.c cVar = this.f174431b;
            boolean z14 = cVar instanceof l11.a.c.C2073a;
            k0 k0Var = this.f174432c;
            if (z14) {
                m01.g gVar = k0Var.f174449c;
                l11.a.c.C2073a c2073a = (l11.a.c.C2073a) cVar;
                g01.d0 d0Var = new g01.d0(p13.w.c(new g01.m(c2073a.f108081a, c2073a.f108084d, c2073a.f108085e, c2073a.f108086f)));
                this.f174430a = 1;
                obj = gVar.y(d0Var, this);
            } else {
                if (cVar instanceof l11.a.c.b) {
                    return new v2.a(new IllegalStateException("Edit mode doesn't fetch food"), null, null, 6, null);
                }
                if (!(cVar instanceof l11.a.c.C2074c)) {
                    lc.u0.r();
                    return null;
                }
                m01.g gVar2 = k0Var.f174449c;
                l11.a.c.C2074c c2074c = (l11.a.c.C2074c) cVar;
                g01.d0 d0Var2 = new g01.d0(p13.w.c(new g01.m(c2074c.f108090a, c2074c.f108093d, c2074c.f108094e, c2074c.f108095f)));
                this.f174430a = 2;
                obj = gVar2.y(d0Var2, this);
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/z;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetFoodDetailsUseCase$invoke$2$getMealsTask$1", f = "GetFoodDetailsUseCase.kt", l = {37}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.z>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k0 f174434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.u f174435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f174436d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k0 k0Var, b63.u uVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f174434b = k0Var;
            this.f174435c = uVar;
            this.f174436d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f174434b, this.f174435c, this.f174436d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.z>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174433a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p0 p0Var = this.f174434b.f174448b;
            b63.o oVarB = this.f174435c.b();
            this.f174433a = 1;
            Object objA = p0.a(p0Var, oVarB, this.f174436d, this, 4);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk01/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetFoodDetailsUseCase$invoke$2$getSummaryTask$1", f = "GetFoodDetailsUseCase.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends k01.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k0 f174438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.u f174439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f174440d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k0 k0Var, b63.u uVar, boolean z14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f174438b = k0Var;
            this.f174439c = uVar;
            this.f174440d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f174438b, this.f174439c, this.f174440d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends k01.b>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174437a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            g0 g0Var = this.f174438b.f174447a;
            b63.o oVarB = this.f174439c.b();
            this.f174437a = 1;
            Object objA = g0Var.a(oVarB, this.f174440d, this);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((b11.l) t7).f14337g), Integer.valueOf(((b11.l) t14).f14337g));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((b11.l) t7).f14337g), Integer.valueOf(((b11.l) t14).f14337g));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l11.a.c cVar, boolean z14, b63.u uVar, b11.k kVar, k0 k0Var, i01.i iVar, boolean z15, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f174423g = cVar;
        this.f174424h = z14;
        this.f174425i = uVar;
        this.f174426j = kVar;
        this.f174427k = k0Var;
        this.f174428l = iVar;
        this.f174429m = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j0 j0Var = new j0(this.f174423g, this.f174424h, this.f174425i, this.f174426j, this.f174427k, this.f174428l, this.f174429m, dVar);
        j0Var.f174422f = obj;
        return j0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends l11.a.b>> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0327  */
    /* JADX WARN: Code duplicated, block: B:138:0x032b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0339  */
    /* JADX WARN: Code duplicated, block: B:142:0x033e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0352  */
    /* JADX WARN: Code duplicated, block: B:146:0x0356  */
    /* JADX WARN: Code duplicated, block: B:148:0x0364  */
    /* JADX WARN: Code duplicated, block: B:159:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        o53.i0 i0VarJ;
        Object objC;
        Object objAwait;
        o53.i0 i0Var;
        g21.h hVar;
        v2 v2Var;
        List<g01.x> list;
        ArrayList arrayList;
        Iterator<T> it;
        Object objAwait2;
        g21.h hVar2;
        ArrayList arrayList2;
        Object next;
        l11.a.b bVar;
        List listN0;
        b11.l lVarB;
        v2 v2Var2;
        List<g01.i> list2;
        g01.i iVar;
        b11.e eVarA;
        b11.s sVar;
        o53.b0 b0Var = (o53.b0) this.f174422f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174421e;
        boolean z14 = this.f174424h;
        b63.u uVar = this.f174425i;
        k0 k0Var = this.f174427k;
        l11.a.c cVar = this.f174423g;
        Object obj2 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean z15 = this.f174429m;
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new c(k0Var, uVar, z15, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new b(k0Var, uVar, z15, null), 3);
            i0VarJ = ge1.b.j(b0Var, null, null, new a(cVar, k0Var, null), 3);
            this.f174422f = null;
            this.f174417a = j0VarJ;
            this.f174418b = i0VarJ;
            this.f174421e = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            i0VarJ = this.f174418b;
            o53.j0 j0Var = this.f174417a;
            o13.r.b(obj);
            j0VarJ = j0Var;
            objC = obj;
        } else {
            if (i14 == 2) {
                hVar = this.f174419c;
                o53.i0 i0Var2 = this.f174418b;
                o13.r.b(obj);
                i0Var = i0Var2;
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
                    return new v2.a(new Exception(androidx.room.a0.h("Invalid meals result: ", v2Var, ".")), null, null, 6, null);
                }
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    lVarB = ((g01.x) it.next()).b();
                    if (lVarB != null) {
                        arrayList.add(lVarB);
                    }
                }
                if (!(cVar instanceof l11.a.c.C2073a) || (cVar instanceof l11.a.c.C2074c)) {
                    this.f174422f = null;
                    this.f174417a = null;
                    this.f174418b = null;
                    this.f174419c = hVar;
                    this.f174420d = arrayList;
                    this.f174421e = 3;
                    objAwait2 = i0Var.await(this);
                    if (objAwait2 != aVar) {
                        hVar2 = hVar;
                        arrayList2 = arrayList;
                    }
                    return aVar;
                }
                if (!(cVar instanceof l11.a.c.b)) {
                    lc.u0.r();
                    return null;
                }
                i53.c<g21.p> cVar2 = hVar.f75430g;
                ArrayList arrayList3 = new ArrayList();
                Iterator<g21.p> it3 = cVar2.iterator();
                while (it3.hasNext()) {
                    p13.d0.v(arrayList3, it3.next().f75476d);
                }
                Iterator it4 = arrayList3.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!p005kotlin.jvm.internal.s.g(((b11.i) next).getF14315a(), ((l11.a.c.b) cVar).f108089a));
                b11.i iVar2 = (b11.i) next;
                if (iVar2 == null || !(iVar2 instanceof b11.i.a)) {
                    return new v2.a(new Exception(fb1.c.n("Failed to find logged food for id ", ((l11.a.c.b) cVar).f108089a)), null, null, 6, null);
                }
                for (b11.e eVar : hVar.f75431h) {
                    if (p005kotlin.jvm.internal.s.g(eVar.f14261a.f14253a, ((b11.i.a) iVar2).f14301g.f14253a)) {
                        obj2 = eVar;
                        break;
                    }
                }
                b11.e eVar2 = (b11.e) obj2;
                if (eVar2 == null) {
                    return new v2.a(new Exception(fb1.c.n("Failed to find food for id ", ((b11.i.a) iVar2).f14301g.f14253a)), null, null, 6, null);
                }
                b11.i.a aVar2 = (b11.i.a) iVar2;
                i53.c<b11.s> cVar3 = eVar2.f14262b;
                if (!z14) {
                    listN0 = arrayList;
                    listN0 = p13.h0.N0(arrayList, new e());
                }
                listN0 = arrayList;
                bVar = new l11.a.b(aVar2, cVar3, hVar, i53.a.j(listN0), this.f174424h, false, 32, null);
                return new v2.b(bVar, 200, null, null, 12, null);
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList4 = this.f174420d;
            g21.h hVar3 = this.f174419c;
            o13.r.b(obj);
            objAwait2 = obj;
            hVar2 = hVar3;
            arrayList2 = arrayList4;
        }
        v2Var2 = (v2) objAwait2;
        if (!(v2Var2 instanceof v2.b)) {
            if (v2Var2 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        list2 = ((g01.p) ((v2.b) v2Var2).f47386a).f74238a;
        if (list2 != null || (iVar = (g01.i) p13.h0.d0(list2)) == null || (eVarA = iVar.a()) == null) {
            return new v2.a(new Exception(androidx.room.a0.h("Invalid meals result: ", v2Var2, ".")), null, null, 6, null);
        }
        i53.c<b11.s> cVar4 = eVarA.f14262b;
        b11.l lVarL = zf.b.L(arrayList2, z14, uVar.c(), this.f174426j, k0Var.f174451e.a());
        Long l14 = lVarL != null ? new Long(lVarL.f14331a) : null;
        if (l14 == null) {
            return new v2.a(new Exception("mealId unexpectedly null"), null, null, 6, null);
        }
        boolean z16 = cVar instanceof l11.a.c.C2074c;
        String str = z16 ? ((l11.a.c.C2074c) cVar).f108091b : cVar instanceof l11.a.c.C2073a ? ((l11.a.c.C2073a) cVar).f108082b : null;
        if (str != null) {
            for (b11.s sVar2 : cVar4) {
                if (sVar2.f14372a.equals(str)) {
                    obj2 = sVar2;
                    break;
                }
            }
            sVar = (b11.s) obj2;
            if (sVar == null) {
                sVar = (b11.s) p13.h0.d0(cVar4);
            }
        } else {
            sVar = (b11.s) p13.h0.d0(cVar4);
        }
        b11.s sVar3 = sVar;
        if (sVar3 == null) {
            return new v2.a(new Exception("No valid nutrition content"), null, null, 6, null);
        }
        b11.i.a aVar3 = new b11.i.a(null, this.f174428l, uVar.c(), z16 ? ((l11.a.c.C2074c) cVar).f108092c : cVar instanceof l11.a.c.C2073a ? ((l11.a.c.C2073a) cVar).f108083c : 1.0d, eVarA.f14264d, l14.longValue(), eVarA.f14261a, sVar3, false, eVarA.f14263c);
        i53.c<b11.s> cVar5 = eVarA.f14262b;
        List listN1 = arrayList2;
        if (!z14) {
            listN1 = p13.h0.N0(arrayList2, new d());
        }
        bVar = new l11.a.b(aVar3, cVar5, hVar2, i53.a.j(listN1), this.f174424h, false, 32, null);
        return new v2.b(bVar, 200, null, null, 12, null);
        v2 v2Var3 = (v2) objC;
        if (!(v2Var3 instanceof v2.b)) {
            if (v2Var3 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var3).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        g21.h hVarA = ((k01.b) ((v2.b) v2Var3).f47386a).a();
        if (hVarA == null) {
            return new v2.a(new Exception(androidx.room.a0.h("Invalid daily summary result: ", v2Var3, ".")), null, null, 6, null);
        }
        this.f174422f = null;
        this.f174417a = null;
        this.f174418b = i0VarJ;
        this.f174419c = hVarA;
        this.f174421e = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            i0Var = i0VarJ;
            hVar = hVarA;
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
                return new v2.a(new Exception(androidx.room.a0.h("Invalid meals result: ", v2Var, ".")), null, null, 6, null);
            }
            arrayList = new ArrayList();
            it = list.iterator();
            while (it.hasNext()) {
                lVarB = ((g01.x) it.next()).b();
                if (lVarB != null) {
                    arrayList.add(lVarB);
                }
            }
            if (cVar instanceof l11.a.c.C2073a) {
            }
            this.f174422f = null;
            this.f174417a = null;
            this.f174418b = null;
            this.f174419c = hVar;
            this.f174420d = arrayList;
            this.f174421e = 3;
            objAwait2 = i0Var.await(this);
            if (objAwait2 != aVar) {
                hVar2 = hVar;
                arrayList2 = arrayList;
                v2Var2 = (v2) objAwait2;
                if (!(v2Var2 instanceof v2.b)) {
                    list2 = ((g01.p) ((v2.b) v2Var2).f47386a).f74238a;
                    if (list2 != null) {
                    }
                    return new v2.a(new Exception(androidx.room.a0.h("Invalid meals result: ", v2Var2, ".")), null, null, 6, null);
                }
                if (v2Var2 instanceof v2.a) {
                    return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
                }
                lc.u0.r();
                return null;
            }
        }
        return aVar;
    }
}
