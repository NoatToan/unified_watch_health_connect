package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ll11/l;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCustomMealDetailsUseCase$invoke$2", f = "GetCustomMealDetailsUseCase.kt", l = {40, 50, 60}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends l11.l>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f174281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.i0 f174282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b11.a.b f174283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g21.h f174284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f174285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f174286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f174287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f174288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b63.u f174289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b11.k f174290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e0 f174291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f174292l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCustomMealDetailsUseCase$invoke$2$getMealTask$1", f = "GetCustomMealDetailsUseCase.kt", l = {31}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f174294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f174295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174294b = e0Var;
            this.f174295c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174294b, this.f174295c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.f>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174293a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            m01.g gVar = this.f174294b.f174314a;
            Long l14 = new Long(this.f174295c);
            this.f174293a = 1;
            Object objN = m01.g.n(gVar, 0, 1, null, l14, this, 4);
            return objN == aVar ? aVar : objN;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/z;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCustomMealDetailsUseCase$invoke$2$getMealWindowsTask$1", f = "GetCustomMealDetailsUseCase.kt", l = {38}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.z>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f174297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.u f174298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f174299d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, b63.u uVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f174297b = e0Var;
            this.f174298c = uVar;
            this.f174299d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f174297b, this.f174298c, this.f174299d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.z>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174296a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p0 p0Var = this.f174297b.f174316c;
            b63.o oVarB = this.f174298c.b();
            this.f174296a = 1;
            Object objA = p0.a(p0Var, oVarB, this.f174299d, this, 4);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk01/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCustomMealDetailsUseCase$invoke$2$getSummaryTask$1", f = "GetCustomMealDetailsUseCase.kt", l = {37}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends k01.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f174301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.u f174302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f174303d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var, b63.u uVar, boolean z14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f174301b = e0Var;
            this.f174302c = uVar;
            this.f174303d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f174301b, this.f174302c, this.f174303d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends k01.b>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174300a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            g0 g0Var = this.f174301b.f174315b;
            b63.o oVarB = this.f174302c.b();
            this.f174300a = 1;
            Object objA = g0Var.a(oVarB, this.f174303d, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(long j8, boolean z14, b63.u uVar, b11.k kVar, e0 e0Var, boolean z15, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f174287g = j8;
        this.f174288h = z14;
        this.f174289i = uVar;
        this.f174290j = kVar;
        this.f174291k = e0Var;
        this.f174292l = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f174287g, this.f174288h, this.f174289i, this.f174290j, this.f174291k, this.f174292l, dVar);
        d0Var.f174286f = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends l11.l>> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0134  */
    /* JADX WARN: Code duplicated, block: B:51:0x013f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0156  */
    /* JADX WARN: Code duplicated, block: B:55:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0171  */
    /* JADX WARN: Code duplicated, block: B:60:0x0194  */
    /* JADX WARN: Code duplicated, block: B:62:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x010a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        o53.i0 i0VarJ;
        Object objC;
        b11.a.b bVarA;
        Object objAwait;
        o53.i0 i0Var;
        b11.a.b bVar;
        v2 v2Var;
        g21.h hVarA;
        Object objAwait2;
        b11.a.b bVar2;
        g21.h hVar;
        v2 v2Var2;
        List<g01.x> list;
        ArrayList arrayList;
        Iterator<T> it;
        boolean z14;
        Long l14;
        i53.f fVarJ;
        b11.l lVarB;
        o53.b0 b0Var = (o53.b0) this.f174286f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174285e;
        long j8 = this.f174287g;
        b63.u uVar = this.f174289i;
        e0 e0Var = this.f174291k;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(e0Var, j8, null), 3);
            boolean z15 = this.f174292l;
            j0VarJ = ge1.b.j(b0Var, null, null, new c(e0Var, uVar, z15, null), 3);
            i0VarJ = ge1.b.j(b0Var, null, null, new b(e0Var, uVar, z15, null), 3);
            this.f174286f = null;
            this.f174281a = j0VarJ;
            this.f174282b = i0VarJ;
            this.f174285e = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            i0VarJ = this.f174282b;
            o53.j0 j0Var = this.f174281a;
            o13.r.b(obj);
            j0VarJ = j0Var;
            objC = obj;
        } else {
            if (i14 == 2) {
                bVar = this.f174283c;
                i0Var = this.f174282b;
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
                    return new v2.a(new Exception(androidx.room.a0.h("Invalid daily summary result: ", v2Var, ".")), null, null, 6, null);
                }
                this.f174286f = null;
                this.f174281a = null;
                this.f174282b = null;
                this.f174283c = bVar;
                this.f174284d = hVarA;
                this.f174285e = 3;
                objAwait2 = i0Var.await(this);
                if (objAwait2 != aVar) {
                    bVar2 = bVar;
                    hVar = hVarA;
                }
                return aVar;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g21.h hVar2 = this.f174284d;
            b11.a.b bVar3 = this.f174283c;
            o13.r.b(obj);
            objAwait2 = obj;
            hVar = hVar2;
            bVar2 = bVar3;
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
            return new v2.a(new Exception(androidx.room.a0.h("Invalid meal windows result: ", v2Var2, ".")), null, null, 6, null);
        }
        arrayList = new ArrayList();
        it = list.iterator();
        while (it.hasNext()) {
            lVarB = ((g01.x) it.next()).b();
            if (lVarB != null) {
                arrayList.add(lVarB);
            }
        }
        b63.v vVarC = uVar.c();
        boolean zA = e0Var.f174318e.a();
        z14 = this.f174288h;
        b11.l lVarL = zf.b.L(arrayList, z14, vVarC, this.f174290j, zA);
        l14 = lVarL != null ? new Long(lVarL.f14331a) : null;
        if (l14 == null) {
            return new v2.a(new IllegalStateException("mealId unexpectedly null"), null, null, 6, null);
        }
        b11.a.b bVarD = b11.a.b.d(bVar2, null, false, l14, null, 507);
        b63.v vVarC2 = uVar.c();
        if (z14) {
            fVarJ = i53.a.j(arrayList);
        } else {
            fVarJ = i53.a.j(p13.h0.N0(arrayList, new d()));
        }
        return new v2.b(new l11.l(bVarD, vVarC2, hVar, fVarJ, this.f174288h), 200, null, null, 12, null);
        v2 v2Var3 = (v2) objC;
        if (!(v2Var3 instanceof v2.b)) {
            if (v2Var3 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var3).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        g01.e eVar = (g01.e) p13.h0.d0(((g01.f) ((v2.b) v2Var3).f47386a).f74176a);
        if (eVar == null || (bVarA = eVar.a()) == null) {
            return new v2.a(new IllegalStateException(androidx.room.a0.f(j8, "Meal for mealId ", " not found")), null, null, 6, null);
        }
        this.f174286f = null;
        this.f174281a = null;
        this.f174282b = i0VarJ;
        this.f174283c = bVarA;
        this.f174285e = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            i0Var = i0VarJ;
            bVar = bVarA;
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
                return new v2.a(new Exception(androidx.room.a0.h("Invalid daily summary result: ", v2Var, ".")), null, null, 6, null);
            }
            this.f174286f = null;
            this.f174281a = null;
            this.f174282b = null;
            this.f174283c = bVar;
            this.f174284d = hVarA;
            this.f174285e = 3;
            objAwait2 = i0Var.await(this);
            if (objAwait2 != aVar) {
                bVar2 = bVar;
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
                    return new v2.a(new Exception(androidx.room.a0.h("Invalid meal windows result: ", v2Var2, ".")), null, null, 6, null);
                }
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    lVarB = ((g01.x) it.next()).b();
                    if (lVarB != null) {
                        arrayList.add(lVarB);
                    }
                }
                b63.v vVarC3 = uVar.c();
                boolean zA2 = e0Var.f174318e.a();
                z14 = this.f174288h;
                b11.l lVarL2 = zf.b.L(arrayList, z14, vVarC3, this.f174290j, zA2);
                l14 = lVarL2 != null ? new Long(lVarL2.f14331a) : null;
                if (l14 == null) {
                    return new v2.a(new IllegalStateException("mealId unexpectedly null"), null, null, 6, null);
                }
                b11.a.b bVarD2 = b11.a.b.d(bVar2, null, false, l14, null, 507);
                b63.v vVarC4 = uVar.c();
                if (z14) {
                    fVarJ = i53.a.j(arrayList);
                } else {
                    fVarJ = i53.a.j(p13.h0.N0(arrayList, new d()));
                }
                return new v2.b(new l11.l(bVarD2, vVarC4, hVar, fVarJ, this.f174288h), 200, null, null, 12, null);
            }
        }
        return aVar;
    }
}
