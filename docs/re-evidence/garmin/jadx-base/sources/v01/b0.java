package v01;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ld11/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCustomFoodDetailsUseCase$invoke$2", f = "GetCustomFoodDetailsUseCase.kt", l = {41, 55, 74}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends d11.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.i0 f174218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.j0 f174219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f174220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f174221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f174222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f11.a.b f174223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f174224g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCustomFoodDetailsUseCase$invoke$2$getFoodTask$1", f = "GetCustomFoodDetailsUseCase.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f11.a.b f174226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f174227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f11.a.b bVar, c0 c0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174226b = bVar;
            this.f174227c = c0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174226b, this.f174227c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.d>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174225a;
            if (i14 == 0) {
                o13.r.b(obj);
                f11.a.b bVar = this.f174226b;
                if (bVar instanceof f11.a.b.C1410a) {
                    return new v2.a(new IllegalStateException("Add mode doesn't fetch food"), null, null, 6, null);
                }
                if (!(bVar instanceof f11.a.b.C1411b)) {
                    lc.u0.r();
                    return null;
                }
                m01.g gVar = this.f174227c.f174247a;
                String str = ((f11.a.b.C1411b) bVar).f67892a;
                this.f174225a = 1;
                obj = m01.g.h(gVar, 0, 1, null, str, this, 4);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return (v2) obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ll01/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCustomFoodDetailsUseCase$invoke$2$getSettingsTask$1", f = "GetCustomFoodDetailsUseCase.kt", l = {39}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends l01.k>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f174229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f174229b = c0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f174229b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends l01.k>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174228a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            m01.g gVar = this.f174229b.f174247a;
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            this.f174228a = 1;
            Object objY = gVar.Y(oVarD, this);
            return objY == aVar ? aVar : objY;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/g0;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetCustomFoodDetailsUseCase$invoke$2$getUnitsTask$1", f = "GetCustomFoodDetailsUseCase.kt", l = {38}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.g0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f174231b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c0 c0Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f174231b = c0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f174231b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.g0>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174230a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            m01.g gVar = this.f174231b.f174247a;
            this.f174230a = 1;
            Object objA = gVar.a(this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f11.a.b bVar, c0 c0Var, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f174223f = bVar;
        this.f174224g = c0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f174223f, this.f174224g, dVar);
        b0Var.f174222e = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends d11.a>> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0205  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        if (r1 == r2) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.i0 i0VarJ;
        o53.j0 j0VarJ;
        Object objC;
        ArrayList arrayList;
        Object objAwait;
        List list;
        v2 v2Var;
        String str;
        String str2;
        Object objAwait2;
        o13.p pVar;
        List list2;
        List list3;
        b11.a.C0202a c0202aA;
        o53.b0 b0Var = (o53.b0) this.f174222e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174221d;
        f11.a.b bVar = this.f174223f;
        if (i14 == 0) {
            o13.r.b(obj);
            c0 c0Var = this.f174224g;
            i0VarJ = ge1.b.j(b0Var, null, null, new a(bVar, c0Var, null), 3);
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new c(c0Var, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new b(c0Var, null), 3);
            this.f174222e = null;
            this.f174218a = i0VarJ;
            this.f174219b = j0VarJ;
            this.f174221d = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
            }
            list = arrayList;
            list3 = list;
            return aVar;
        }
        if (i14 == 1) {
            j0VarJ = this.f174219b;
            i0VarJ = this.f174218a;
            o13.r.b(obj);
            objC = obj;
        } else {
            if (i14 == 2) {
                List list4 = this.f174220c;
                i0VarJ = this.f174218a;
                o13.r.b(obj);
                list = list4;
                objAwait = obj;
                list = arrayList;
                v2Var = (v2) objAwait;
                if (!(v2Var instanceof v2.b)) {
                    if (v2Var instanceof v2.a) {
                        return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
                    }
                    lc.u0.r();
                    return null;
                }
                l01.k kVar = (l01.k) ((v2.b) v2Var).f47386a;
                str = kVar.f107889l;
                if (str != null || (str2 = kVar.f107888k) == null) {
                    return new v2.a(new IllegalStateException("Missing language or region code"), null, null, 6, null);
                }
                o13.p pVar2 = new o13.p(str, str2);
                String str3 = (String) pVar2.f128594a;
                String str4 = (String) pVar2.f128595b;
                if (bVar instanceof f11.a.b.C1410a) {
                    pVar = new o13.p(new d11.c(null, null, null, null, null, null, null, str3, str4, 127, null), null);
                    list2 = list;
                } else {
                    if (!(bVar instanceof f11.a.b.C1411b)) {
                        lc.u0.r();
                        return null;
                    }
                    this.f174222e = null;
                    this.f174218a = null;
                    this.f174219b = null;
                    this.f174220c = list;
                    this.f174221d = 3;
                    objAwait2 = i0VarJ.await(this);
                }
                return new v2.b(new d11.a((d11.c) pVar.f128594a, i53.a.j(list2), (y22.x) pVar.f128595b, null, 8, null), 200, null, null, 12, null);
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list5 = this.f174220c;
            o13.r.b(obj);
            list3 = list5;
            objAwait2 = obj;
        }
        list3 = list;
        v2 v2Var2 = (v2) objAwait2;
        if (!(v2Var2 instanceof v2.b)) {
            if (v2Var2 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        g01.r rVar = (g01.r) p13.h0.d0(((g01.d) ((v2.b) v2Var2).f47386a).f74148a);
        if (rVar == null || (c0202aA = rVar.a()) == null) {
            return new v2.a(new IllegalStateException(am.j.m("Food for foodId ", ((f11.a.b.C1411b) bVar).f67892a, " not found")), null, null, 6, null);
        }
        b11.s sVar = c0202aA.f14223f;
        b11.d dVar = c0202aA.f14222e;
        String str5 = dVar.f14253a;
        String str6 = dVar.f14254b;
        String str7 = dVar.f14256d;
        Double d14 = new Double(sVar.f14374c);
        String str8 = sVar.f14372a;
        g01.c.Companion companion = g01.c.INSTANCE;
        String str9 = sVar.f14373b;
        companion.getClass();
        d11.c cVar = new d11.c(str5, str6, str7, d14, str8, g01.c.Companion.a(str9), sVar.f14375d, dVar.f14259g, dVar.f14258f);
        String str10 = c0202aA.f14224g.f14379b;
        pVar = new o13.p(cVar, str10 != null ? new y22.x(Uri.parse(str10), dVar.f14260h, false, 4, (p005kotlin.jvm.internal.j) null) : null);
        list2 = list3;
        return new v2.b(new d11.a((d11.c) pVar.f128594a, i53.a.j(list2), (y22.x) pVar.f128595b, null, 8, null), 200, null, null, 12, null);
        v2 v2Var3 = (v2) objC;
        if (!(v2Var3 instanceof v2.b)) {
            if (v2Var3 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var3).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        List<g01.f0> list6 = ((g01.g0) ((v2.b) v2Var3).f47386a).f74189a;
        if (list6 != null) {
            arrayList = new ArrayList(p13.y.r(list6, 10));
            for (g01.f0 f0Var : list6) {
                g01.c.Companion companion2 = g01.c.INSTANCE;
                String str11 = f0Var.f74179a;
                companion2.getClass();
                arrayList.add(g01.c.Companion.a(str11));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return new v2.a(new IllegalStateException("No units for custom food"), null, null, 6, null);
        }
        this.f174222e = null;
        this.f174218a = i0VarJ;
        this.f174219b = null;
        this.f174220c = arrayList;
        this.f174221d = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            list = arrayList;
            v2Var = (v2) objAwait;
            if (!(v2Var instanceof v2.b)) {
                l01.k kVar2 = (l01.k) ((v2.b) v2Var).f47386a;
                str = kVar2.f107889l;
                if (str != null) {
                }
                return new v2.a(new IllegalStateException("Missing language or region code"), null, null, 6, null);
            }
            if (v2Var instanceof v2.a) {
                return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        list = arrayList;
        list3 = list;
        return aVar;
    }
}
