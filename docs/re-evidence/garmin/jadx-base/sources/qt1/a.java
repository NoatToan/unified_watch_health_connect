package qt1;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.a2;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lqt1/a;", "Landroidx/lifecycle/u1;", "Landroid/content/Context;", "appContext", "Lss1/a;", "trailsRepo", "Lss1/a0;", "reviewsRepo", "Lmv0/e;", "locationProvider", "Lvs1/h;", "snackbarMessageUseCase", "Lvs1/o;", "refreshActivityDetailsUseCase", "<init>", "(Landroid/content/Context;Lss1/a;Lss1/a0;Lmv0/e;Lvs1/h;Lvs1/o;)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {
    public static final /* synthetic */ int I = 0;
    public final b2 A;
    public final b2 B;
    public final b2 C;
    public final b2 D;
    public final p2 E;
    public final qw0.s F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f147488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss1.a f147489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ss1.a0 f147490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mv0.e f147491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vs1.h f147492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vs1.o f147493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bv.d f147494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ms1.a f147495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f147496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f147497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f147498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f147499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f147500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f147501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f147502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f147503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vs1.b f147504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vs1.y f147505r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vs1.t f147506t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c2 f147507v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c2 f147508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a2 f147509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b2 f147510y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b2 f147511z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147512a;

        static {
            int[] iArr = new int[com.garmin.android.library.mapsdkadapter.i.d.values().length];
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f147512a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel$fetchTrailsInArea$5", f = "GarminTrailsViewModel.kt", l = {302}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147513a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LatLng f147515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LatLng f147516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f147517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f147518f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LatLng latLng, LatLng latLng2, float f14, e23.a<Unit> aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f147515c = latLng;
            this.f147516d = latLng2;
            this.f147517e = f14;
            this.f147518f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f147515c, this.f147516d, this.f147517e, this.f147518f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147513a;
            if (i14 == 0) {
                o13.r.b(obj);
                boolean z14 = this.f147517e < 13.0f;
                this.f147513a = 1;
                if (a.x4(a.this, this.f147515c, this.f147516d, z14, this.f147518f, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((qs1.d) t14).getCourseDifficulty(), ((qs1.d) t7).getCourseDifficulty());
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r53.i<LatLng> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f147519a;

        /* JADX INFO: renamed from: qt1.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2776a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f147520a;

            /* JADX INFO: renamed from: qt1.a$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel$special$$inlined$map$1$2", f = "GarminTrailsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2777a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f147521a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f147522b;

                public C2777a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f147521a = obj;
                    this.f147522b |= Integer.MIN_VALUE;
                    return C2776a.this.emit(null, this);
                }
            }

            public C2776a(r53.j jVar) {
                this.f147520a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2777a c2777a;
                if (dVar instanceof C2777a) {
                    c2777a = (C2777a) dVar;
                    int i14 = c2777a.f147522b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2777a.f147522b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2777a = new C2777a(dVar);
                    }
                } else {
                    c2777a = new C2777a(dVar);
                }
                Object obj2 = c2777a.f147521a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2777a.f147522b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    LatLng latLngC = ke2.c.c(((pt1.c) obj).f140819d.f140825a);
                    c2777a.f147522b = 1;
                    if (this.f147520a.emit(latLngC, c2777a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public e(r53.i iVar) {
            this.f147519a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super LatLng> jVar, t13.d dVar) {
            Object objCollect = this.f147519a.collect(new C2776a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new C2775a(null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x014b  */
    public a(Context context, ss1.a aVar, ss1.a0 a0Var, mv0.e eVar, vs1.h hVar, vs1.o oVar) {
        Object value;
        pt1.c cVar;
        pt1.d dVarA;
        boolean zB;
        boolean z14;
        context.getClass();
        aVar.getClass();
        a0Var.getClass();
        eVar.getClass();
        hVar.getClass();
        oVar.getClass();
        this.f147488a = context;
        this.f147489b = aVar;
        this.f147490c = a0Var;
        this.f147491d = eVar;
        this.f147492e = hVar;
        this.f147493f = oVar;
        this.f147494g = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);
        this.f147495h = (ms1.a) KoinJavaComponent.get$default(ms1.a.class, null, null, 6, null);
        p13.j0 j0Var = p13.j0.f134944a;
        this.f147496i = q2.a(j0Var);
        this.f147497j = q2.a(j0Var);
        this.f147498k = q2.a(j53.l.b());
        Boolean bool = Boolean.FALSE;
        this.f147499l = q2.a(bool);
        this.f147500m = q2.a(bool);
        this.f147501n = q2.a(bool);
        p2 p2VarA = q2.a(bool);
        this.f147502o = p2VarA;
        p2 p2VarA2 = q2.a(new pt1.c(false, false, false, null, null, null, false, false, false, 511, null));
        this.f147503p = p2VarA2;
        this.f147504q = new vs1.b(v1.a(this), a0Var, p2VarA2);
        vs1.y yVar = new vs1.y();
        this.f147505r = yVar;
        w9.a aVarA = v1.a(this);
        e eVar2 = new e(p2VarA2);
        w9.a aVarA2 = v1.a(this);
        k2.f150703a.getClass();
        vs1.t tVar = new vs1.t(context, aVarA, aVar, r53.s.K(eVar2, aVarA2, k2.a.f150705b, ke2.c.c(us1.a.f172360a)), hVar, yVar, new ot1.b(this, 4));
        this.f147506t = tVar;
        this.f147509x = hVar.f179810b;
        this.f147510y = oVar.f179872b;
        this.f147511z = r53.s.d(p2VarA2);
        this.A = tVar.f179902k;
        this.B = yVar.f179925d;
        this.C = yVar.f179924c;
        this.D = r53.s.d(p2VarA);
        this.E = q2.a(null);
        qw0.s sVar = (qw0.s) KoinJavaComponent.get$default(qw0.s.class, null, null, 6, null);
        this.F = sVar;
        com.garmin.android.library.mapsdkadapter.i.d dVarL = sVar.l();
        boolean zN = sVar.n();
        do {
            value = p2VarA2.getValue();
            cVar = (pt1.c) value;
            dVarA = pt1.d.a(cVar.f140819d, null, null, null, 0.0f, null, 0, null, null, false, false, dVarL, zN, 0.0f, 13311);
            zB = s3.b();
            if (s3.b()) {
                z14 = false;
            } else {
                f12.l.f68084a.getClass();
                if (f12.l.a.a().l1() != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
        } while (!p2VarA2.b(value, pt1.c.a(cVar, false, false, false, dVarA, null, null, zB, z14, 311)));
    }

    public static Map B4(List list) {
        List listN0 = p13.h0.N0(list, new d());
        ArrayList arrayList = new ArrayList(p13.y.r(listN0, 10));
        int i14 = 0;
        for (Object obj : listN0) {
            int i15 = i14 + 1;
            o13.p pVar = null;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            qs1.d dVar = (qs1.d) obj;
            if (dVar.getCuratedCourseId() != null) {
                pVar = new o13.p(dVar.getCuratedCourseId(), Float.valueOf(i14));
            }
            arrayList.add(pVar);
            i14 = i15;
        }
        return p13.u0.l(p13.h0.Z(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public static final Object x4(a aVar, LatLng latLng, LatLng latLng2, boolean z14, e23.a aVar2, v13.c cVar) {
        qt1.d dVar;
        Object value;
        Object obj;
        e23.a aVar3;
        Object value2;
        Integer num;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        ArrayList arrayList;
        Object value7;
        ArrayList arrayList2;
        Object value8;
        p2 p2Var = aVar.f147500m;
        p2 p2Var2 = aVar.f147497j;
        p2 p2Var3 = aVar.f147499l;
        p2 p2Var4 = aVar.f147496i;
        if (cVar instanceof qt1.d) {
            dVar = (qt1.d) cVar;
            int i14 = dVar.f147586d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f147586d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new qt1.d(aVar, cVar);
            }
        } else {
            dVar = new qt1.d(aVar, cVar);
        }
        Object obj2 = dVar.f147584b;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f147586d;
        if (i15 == 0) {
            o13.r.b(obj2);
            do {
                value = p2Var3.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var3.b(value, Boolean.TRUE));
            aVar.H4();
            ss1.a aVar5 = aVar.f147489b;
            qs1.x xVar = new qs1.x(new Double(latLng.latitude), new Double(latLng2.latitude), new Double(latLng.longitude), new Double(latLng2.longitude), z14);
            dVar.f147583a = aVar2;
            dVar.f147586d = 1;
            Object objK2 = aVar5.K2(xVar, dVar);
            if (objK2 == aVar4) {
                return aVar4;
            }
            obj = objK2;
            aVar3 = aVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e23.a aVar6 = dVar.f147583a;
            o13.r.b(obj2);
            aVar3 = aVar6;
            obj = obj2;
        }
        v2 v2Var = (v2) obj;
        do {
            value2 = p2Var3.getValue();
            ((Boolean) value2).getClass();
        } while (!p2Var3.b(value2, Boolean.FALSE));
        if (v2Var instanceof v2.b) {
            do {
                value6 = p2Var4.getValue();
                Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                HashSet hashSet = new HashSet();
                arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    if (hashSet.add(((qs1.d) obj3).getCuratedCourseId())) {
                        arrayList.add(obj3);
                    }
                }
            } while (!p2Var4.b(value6, arrayList));
            do {
                value7 = p2Var2.getValue();
                Iterable iterable2 = (Iterable) p2Var4.getValue();
                arrayList2 = new ArrayList(p13.y.r(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(lt1.b.a(lt1.b.f114858a, aVar.f147488a, (qs1.d) it.next(), null, B4((List) p2Var4.getValue()), 4));
                }
            } while (!p2Var2.b(value7, arrayList2));
            do {
                value8 = p2Var.getValue();
                ((Boolean) value8).getClass();
            } while (!p2Var.b(value8, Boolean.FALSE));
        } else if ((v2Var instanceof v2.a) && (num = ((v2.a) v2Var).f47384b) != null && num.intValue() == 400) {
            do {
                value3 = p2Var4.getValue();
            } while (!p2Var4.b(value3, j53.l.b()));
            do {
                value4 = p2Var2.getValue();
            } while (!p2Var2.b(value4, j53.l.b()));
            do {
                value5 = p2Var.getValue();
                ((Boolean) value5).getClass();
            } while (!p2Var.b(value5, Boolean.TRUE));
        }
        aVar.H4();
        aVar3.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object y4(a aVar, List list, v13.i iVar) {
        Object value;
        String str;
        Object value2;
        boolean z14;
        boolean z15;
        p2 p2Var = aVar.f147498k;
        List list2 = (List) aVar.f147496i.getValue();
        ArrayList<qs1.d> arrayList = new ArrayList();
        for (Object obj : list2) {
            qs1.d dVar = (qs1.d) obj;
            ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q6.f.s(((le2.d) it.next()).f112062a, arrayList2);
            }
            if (p13.h0.R(arrayList2, dVar.getCuratedCourseId())) {
                arrayList.add(obj);
            }
        }
        com.garmin.android.library.mapsdkadapter.i.d dVar2 = ((pt1.c) aVar.f147511z.f150540a.getValue()).f140819d.f140835k;
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
        for (qs1.d dVar3 : arrayList) {
            i53.c<pt1.t> cVar = ((pt1.h) aVar.A.f150540a.getValue()).f140853d;
            if (cVar != null && cVar.isEmpty()) {
                z14 = false;
                z15 = false;
                break;
            }
            Iterator<pt1.t> it3 = cVar.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z14 = false;
                    z15 = false;
                    break;
                }
                long j8 = it3.next().f140967a;
                Long curatedCourseId = dVar3.getCuratedCourseId();
                if (curatedCourseId != null && j8 == curatedCourseId.longValue()) {
                    z14 = true;
                    z15 = false;
                    break;
                }
            }
            lt1.j jVar = lt1.j.f114865a;
            boolean z16 = z15;
            Context context = aVar.f147488a;
            if (arrayList.size() > 1) {
                z16 = true;
            }
            arrayList3.add(lt1.j.c(jVar, dVar3, context, z16, Boolean.valueOf(z14), dVar2, 2));
        }
        i53.c cVarE = i53.a.e(arrayList3);
        if (cVarE.size() == 1 && ((str = ((pt1.t) cVarE.get(0)).f140972f) == null || str.length() == 0)) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, cVarE));
            Object objZ4 = aVar.z4(((pt1.t) cVarE.get(0)).f140968b, iVar);
            return objZ4 == u13.a.COROUTINE_SUSPENDED ? objZ4 : Unit.INSTANCE;
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, cVarE));
        aVar.H4();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x018a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0195  */
    /* JADX WARN: Code duplicated, block: B:61:0x021e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0223  */
    /* JADX WARN: Code duplicated, block: B:66:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x024a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0251  */
    /* JADX WARN: Code duplicated, block: B:71:0x0255 A[LOOP:2: B:58:0x01d9->B:71:0x0255, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x021c A[EDGE_INSN: B:76:0x021c->B:60:0x021c BREAK  A[LOOP:2: B:58:0x01d9->B:71:0x0255], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A4(ke2.b bVar, float f14, LatLng latLng, LatLng latLng2, boolean z14, e23.a<Unit> aVar) {
        p2 p2Var;
        b2 b2Var;
        float f15;
        float f16;
        LatLng latLng3;
        boolean z15;
        LatLngBounds latLngBoundsBuild;
        boolean z16;
        boolean z17;
        boolean z18;
        Object value;
        pt1.c cVar;
        c2 c2Var;
        Object value2;
        pt1.c cVar2;
        bVar.getClass();
        latLng.getClass();
        latLng2.getClass();
        boolean z19 = this.f147488a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        b2 b2Var2 = this.f147511z;
        ke2.b bVar2 = ((pt1.c) b2Var2.f150540a.getValue()).f140819d.f140825a;
        if (((ke2.b) this.E.getValue()) == null && z19 && p005kotlin.jvm.internal.s.g(bVar2, us1.a.f172360a)) {
            aVar.invoke();
            return;
        }
        p2 p2Var2 = this.f147503p;
        float f17 = ((pt1.c) p2Var2.getValue()).f140819d.f140828d;
        while (true) {
            Object value3 = p2Var2.getValue();
            pt1.c cVar3 = (pt1.c) value3;
            p2Var = p2Var2;
            b2Var = b2Var2;
            f15 = f17;
            f16 = f14;
            if (p2Var.b(value3, pt1.c.a(cVar3, false, false, false, pt1.d.a(cVar3.f140819d, null, bVar, null, f14, null, 0, null, null, false, false, null, false, 0.0f, 16373), null, null, false, false, 503))) {
                break;
            }
            p2Var2 = p2Var;
            f17 = f15;
            b2Var2 = b2Var;
        }
        if (!((Collection) this.f147498k.getValue()).isEmpty()) {
            do {
                value2 = p2Var.getValue();
                cVar2 = (pt1.c) value2;
            } while (!p2Var.b(value2, pt1.c.a(cVar2, false, false, false, pt1.d.a(cVar2.f140819d, null, null, new le2.a(ke2.c.b(latLng), ke2.c.b(latLng2)), 0.0f, null, 0, null, null, false, false, null, false, 0.0f, 16379), null, null, false, false, 503)));
            return;
        }
        o13.p pVar = new o13.p(ke2.c.c(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140827c.f112052a), ke2.c.c(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140827c.f112053b));
        LatLng latLng4 = (LatLng) pVar.f128594a;
        LatLng latLng5 = (LatLng) pVar.f128595b;
        float fA = com.garmin.android.library.mapsdkadapter.n.a(latLng4, latLng5);
        boolean z24 = (f15 < 13.0f && f16 >= 13.0f) || (f15 >= 13.0f && f16 < 13.0f);
        LatLng latLng6 = latLng;
        double d14 = ((double) fA) * 0.05d;
        if (com.garmin.android.library.mapsdkadapter.n.a(latLng6, latLng4) < d14) {
            latLng3 = latLng2;
            if (com.garmin.android.library.mapsdkadapter.n.a(latLng3, latLng5) < d14) {
                z15 = false;
            }
            latLngBoundsBuild = LatLngBounds.builder().include(latLng4).include(latLng5).build();
            latLngBoundsBuild.getClass();
            if (latLngBoundsBuild.contains(latLng6) || !latLngBoundsBuild.contains(latLng3) || ((Collection) this.f147496i.getValue()).isEmpty()) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (z24 && (!z15 || z16)) {
                z17 = z14;
                if (!z17) {
                    z18 = false;
                }
                i2.a aVar2 = i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GARMIN_TRAILS;
                StringBuilder sb3 = new StringBuilder("zoom: ");
                sb3.append(f16);
                sb3.append(", anySignificantZoomLevelChange: ");
                sb3.append(z24);
                sb3.append(", anySignificantMapMove: ");
                kg.f.q(", oldBoundsContainNewBounds: ", ", force: ", sb3, z15, z16);
                sb3.append(z17);
                sb3.append(", shouldFetchTrails: ");
                sb3.append(z18);
                String string = sb3.toString();
                i2.f36769a.getClass();
                i2.a.a(a2Var, string);
                while (true) {
                    value = p2Var.getValue();
                    cVar = (pt1.c) value;
                    if (p2Var.b(value, pt1.c.a(cVar, false, false, false, pt1.d.a(cVar.f140819d, null, null, new le2.a(ke2.c.b(latLng6), ke2.c.b(latLng3)), 0.0f, null, 0, null, null, false, false, null, false, 0.0f, 16379), null, null, false, false, 503))) {
                        break;
                    }
                    f16 = f14;
                    latLng6 = latLng;
                    latLng3 = latLng2;
                }
                if (!z18) {
                    if (!z16) {
                        aVar.invoke();
                        return;
                    } else {
                        H4();
                        aVar.invoke();
                        return;
                    }
                }
                c2Var = this.f147507v;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                w9.a aVarA = v1.a(this);
                x53.c cVar4 = o53.s0.f129406a;
                this.f147507v = ge1.b.T(aVarA, x53.b.f189152a, null, new c(latLng, latLng3, f16, aVar, null), 2);
            }
            z17 = z14;
            z18 = true;
            i2.a aVar3 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GARMIN_TRAILS;
            StringBuilder sb4 = new StringBuilder("zoom: ");
            sb4.append(f16);
            sb4.append(", anySignificantZoomLevelChange: ");
            sb4.append(z24);
            sb4.append(", anySignificantMapMove: ");
            kg.f.q(", oldBoundsContainNewBounds: ", ", force: ", sb4, z15, z16);
            sb4.append(z17);
            sb4.append(", shouldFetchTrails: ");
            sb4.append(z18);
            String string2 = sb4.toString();
            i2.f36769a.getClass();
            i2.a.a(a2Var2, string2);
            while (true) {
                value = p2Var.getValue();
                cVar = (pt1.c) value;
                if (p2Var.b(value, pt1.c.a(cVar, false, false, false, pt1.d.a(cVar.f140819d, null, null, new le2.a(ke2.c.b(latLng6), ke2.c.b(latLng3)), 0.0f, null, 0, null, null, false, false, null, false, 0.0f, 16379), null, null, false, false, 503))) {
                    break;
                    break;
                } else {
                    f16 = f14;
                    latLng6 = latLng;
                    latLng3 = latLng2;
                }
            }
            if (!z18) {
                if (!z16) {
                    aVar.invoke();
                    return;
                } else {
                    H4();
                    aVar.invoke();
                    return;
                }
            }
            c2Var = this.f147507v;
            if (c2Var != null) {
                c2Var.c(null);
            }
            w9.a aVarA2 = v1.a(this);
            x53.c cVar5 = o53.s0.f129406a;
            this.f147507v = ge1.b.T(aVarA2, x53.b.f189152a, null, new c(latLng, latLng3, f16, aVar, null), 2);
        }
        latLng3 = latLng2;
        z15 = true;
        latLngBoundsBuild = LatLngBounds.builder().include(latLng4).include(latLng5).build();
        latLngBoundsBuild.getClass();
        if (latLngBoundsBuild.contains(latLng6)) {
            z16 = false;
        } else {
            z16 = false;
        }
        if (z24) {
            z17 = z14;
            z18 = true;
        } else {
            z17 = z14;
            z18 = true;
        }
        i2.a aVar4 = i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GARMIN_TRAILS;
        StringBuilder sb5 = new StringBuilder("zoom: ");
        sb5.append(f16);
        sb5.append(", anySignificantZoomLevelChange: ");
        sb5.append(z24);
        sb5.append(", anySignificantMapMove: ");
        kg.f.q(", oldBoundsContainNewBounds: ", ", force: ", sb5, z15, z16);
        sb5.append(z17);
        sb5.append(", shouldFetchTrails: ");
        sb5.append(z18);
        String string3 = sb5.toString();
        i2.f36769a.getClass();
        i2.a.a(a2Var3, string3);
        while (true) {
            value = p2Var.getValue();
            cVar = (pt1.c) value;
            if (p2Var.b(value, pt1.c.a(cVar, false, false, false, pt1.d.a(cVar.f140819d, null, null, new le2.a(ke2.c.b(latLng6), ke2.c.b(latLng3)), 0.0f, null, 0, null, null, false, false, null, false, 0.0f, 16379), null, null, false, false, 503))) {
                break;
                break;
            } else {
                f16 = f14;
                latLng6 = latLng;
                latLng3 = latLng2;
            }
        }
        if (!z18) {
            if (!z16) {
                aVar.invoke();
                return;
            } else {
                H4();
                aVar.invoke();
                return;
            }
        }
        c2Var = this.f147507v;
        if (c2Var != null) {
            c2Var.c(null);
        }
        w9.a aVarA3 = v1.a(this);
        x53.c cVar6 = o53.s0.f129406a;
        this.f147507v = ge1.b.T(aVarA3, x53.b.f189152a, null, new c(latLng, latLng3, f16, aVar, null), 2);
    }

    public final void C4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f147498k;
            value = p2Var.getValue();
        } while (!p2Var.b(value, j53.l.b()));
        b2 b2Var = this.f147511z;
        A4(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140826b, ((pt1.c) b2Var.f150540a.getValue()).f140819d.f140828d, ke2.c.c(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140827c.f112052a), ke2.c.c(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140827c.f112053b), true, new qr.n(this));
    }

    public final void D4(le2.a aVar) {
        p2 p2Var;
        Object value;
        pt1.c cVar;
        do {
            p2Var = this.f147503p;
            value = p2Var.getValue();
            cVar = (pt1.c) value;
        } while (!p2Var.b(value, pt1.c.a(cVar, false, false, false, pt1.d.a(cVar.f140819d, null, null, null, 0.0f, aVar, 0, null, null, false, false, null, false, 0.0f, 16367), null, null, false, false, 503)));
    }

    public final void E4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f147502o;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.TRUE));
    }

    public final void F4(boolean z14) {
        p2 p2Var;
        Object value;
        pt1.c cVar;
        do {
            p2Var = this.f147503p;
            value = p2Var.getValue();
            cVar = (pt1.c) value;
        } while (!p2Var.b(value, pt1.c.a(cVar, false, false, false, pt1.d.a(cVar.f140819d, null, null, null, 0.0f, null, 0, null, null, false, z14, null, false, 0.0f, 15871), null, null, false, false, 503)));
    }

    public final void G4(boolean z14) {
        while (true) {
            p2 p2Var = this.f147503p;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, pt1.c.a((pt1.c) value, z15, false, false, null, null, null, false, false, 510))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    public final void H4() {
        i53.c cVar;
        i53.c cVarE;
        i53.c cVar2;
        kt1.a aVar;
        i53.c cVarB;
        i53.c cVar3;
        Iterator it;
        Object next;
        List list;
        pt1.c cVar4 = (pt1.c) this.f147511z.f150540a.getValue();
        LatLngBounds.Builder builderInclude = LatLngBounds.builder().include(ke2.c.c(cVar4.f140819d.f140827c.f112052a));
        pt1.d dVar = cVar4.f140819d;
        LatLngBounds latLngBoundsBuild = builderInclude.include(ke2.c.c(dVar.f140827c.f112053b)).build();
        latLngBoundsBuild.getClass();
        List list2 = (List) this.f147496i.getValue();
        List list3 = (List) this.f147497j.getValue();
        i53.c cVar5 = (i53.c) this.f147498k.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            i53.c<ke2.b> cVar6 = ((le2.d) obj).f112063b;
            if (cVar6 == null || !cVar6.isEmpty()) {
                Iterator<ke2.b> it3 = cVar6.iterator();
                while (it3.hasNext()) {
                    if (latLngBoundsBuild.contains(ke2.c.c(it3.next()))) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(Long.valueOf(((le2.d) it4.next()).f112062a));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (p13.h0.R(arrayList2, ((qs1.d) obj2).getCuratedCourseId())) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            arrayList4.add(lt1.j.c(lt1.j.f114865a, (qs1.d) it5.next(), this.f147488a, false, null, dVar.f140835k, 14));
        }
        i53.c cVarE2 = i53.a.e(lt1.c.a(arrayList4, ke2.c.c(dVar.f140825a), cVar4.f140820e.f140802e));
        b2 b2Var = this.C;
        us1.n nVar = (us1.n) b2Var.f150540a.getValue();
        this.f147505r.getClass();
        i53.c cVarE3 = i53.a.e(vs1.y.c(cVarE2, nVar, null));
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList) {
            le2.d dVar2 = (le2.d) obj3;
            if (cVarE3 != null && cVarE3.isEmpty()) {
                list = list3;
                break;
                break;
            }
            Iterator<E> it6 = cVarE3.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    list = list3;
                    break;
                }
                list = list3;
                if (((pt1.t) it6.next()).f140967a == dVar2.f112062a) {
                    arrayList5.add(obj3);
                    break;
                }
                list3 = list;
            }
            list3 = list;
        }
        List list4 = list3;
        i53.c cVarE4 = i53.a.e(arrayList5);
        lt1.a.f114857a.getClass();
        Context context = this.f147488a;
        i53.c cVarE5 = i53.a.e(lt1.a.a(context, cVarE4, R.drawable.hiking_map_indicator));
        if (cVar5.isEmpty()) {
            cVar = cVarE5;
            ArrayList arrayList6 = new ArrayList(p13.y.r(cVarE4, 10));
            Iterator<E> it7 = cVarE4.iterator();
            while (it7.hasNext()) {
                arrayList6.add(le2.d.a((le2.d) it7.next(), new q51.a(23)));
            }
            cVarE = i53.a.e(arrayList6);
        } else {
            ArrayList arrayList7 = new ArrayList();
            Iterator it8 = cVar5.iterator();
            while (it8.hasNext()) {
                pt1.t tVar = (pt1.t) it8.next();
                Iterator it9 = list4.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        cVar3 = cVarE5;
                        it = it8;
                        next = null;
                        break;
                    } else {
                        next = it9.next();
                        cVar3 = cVarE5;
                        it = it8;
                        if (((le2.d) next).f112062a == tVar.f140967a) {
                            break;
                        }
                        cVarE5 = cVar3;
                        it8 = it;
                    }
                }
                le2.d dVar3 = (le2.d) next;
                le2.d dVarA = dVar3 != null ? le2.d.a(dVar3, new q51.a(22)) : null;
                if (dVarA != null) {
                    arrayList7.add(dVarA);
                }
                cVarE5 = cVar3;
                it8 = it;
            }
            cVar = cVarE5;
            cVarE = i53.a.e(arrayList7);
        }
        if (cVar5.isEmpty()) {
            cVar2 = cVar;
        } else {
            if (cVarE.size() == 1) {
                lt1.a.f114857a.getClass();
                cVarB = i53.a.e(p13.h0.C0(lt1.a.a(context, cVarE, 2131232000), lt1.a.b(context, cVarE)));
            } else {
                cVarB = j53.l.b();
            }
            cVar2 = cVarB;
        }
        int size = cVarE3.size();
        boolean z14 = !arrayList3.isEmpty() && cVarE3.isEmpty();
        if (((Boolean) this.f147501n.getValue()).booleanValue()) {
            aVar = kt1.a.MAP_TYPE_SELECTION;
        } else if (((Boolean) this.f147499l.getValue()).booleanValue()) {
            aVar = kt1.a.LOADING;
        } else if (cVar5.size() > 1) {
            aVar = kt1.a.MULTIPLE_TRAIL_PREVIEW;
        } else if (cVar5.size() == 1) {
            aVar = kt1.a.SINGLE_TRAIL_PREVIEW;
        } else if (size > 0) {
            aVar = kt1.a.NEARBY_TRAILS;
        } else if (((Boolean) this.f147500m.getValue()).booleanValue()) {
            aVar = kt1.a.BOUNDING_BOX_TOO_LARGE;
        } else {
            aVar = z14 ? kt1.a.ALL_NEARBY_TRAILS_FILTERED : kt1.a.NO_NEARBY_TRAILS;
        }
        kt1.a aVar2 = aVar;
        while (true) {
            p2 p2Var = this.f147503p;
            Object value = p2Var.getValue();
            pt1.c cVar7 = (pt1.c) value;
            i53.c cVar8 = cVarE;
            if (p2Var.b(value, pt1.c.a(cVar7, false, !this.f147495h.b(), !p005kotlin.jvm.internal.s.g(b2Var.f150540a.getValue(), new us1.n(null, null, false, null, null, null, null, 127, null)), pt1.d.a(cVar7.f140819d, null, null, null, 0.0f, null, 0, cVar8, cVar2, !cVar5.isEmpty(), false, null, false, 0.0f, 15935), pt1.a.a(cVar7.f140820e, aVar2, size, cVar5, cVarE3, null, 16), null, false, false, 481))) {
                return;
            } else {
                cVarE = cVar8;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final Object z4(long j8, v13.c cVar) {
        qt1.c cVar2;
        ?? arrayList;
        p2 p2Var;
        Object value;
        ArrayList arrayList2;
        if (cVar instanceof qt1.c) {
            cVar2 = (qt1.c) cVar;
            int i14 = cVar2.f147548d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f147548d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new qt1.c(this, cVar);
            }
        } else {
            cVar2 = new qt1.c(this, cVar);
        }
        Object objD4 = cVar2.f147546b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f147548d;
        if (i15 == 0) {
            o13.r.b(objD4);
            cVar2.f147545a = j8;
            cVar2.f147548d = 1;
            objD4 = this.f147489b.d4(j8, cVar2);
            if (objD4 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = cVar2.f147545a;
            o13.r.b(objD4);
        }
        List<GeoPointDTO> list = (List) objD4;
        if (list != null) {
            arrayList = new ArrayList();
            for (GeoPointDTO geoPointDTO : list) {
                Double d14 = geoPointDTO.distance;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO.elevation;
                if (d15 != null) {
                    dDoubleValue = d15.doubleValue();
                }
                arrayList.add(new o20.a(dDoubleValue2, dDoubleValue));
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        do {
            p2Var = this.f147498k;
            value = p2Var.getValue();
            i53.c<pt1.t> cVar3 = (i53.c) value;
            arrayList2 = new ArrayList(p13.y.r(cVar3, 10));
            for (pt1.t tVarA : cVar3) {
                if (tVarA.f140968b == j8) {
                    tVarA = pt1.t.a(tVarA, i53.a.e((Iterable) arrayList), false, 524223);
                }
                arrayList2.add(tVarA);
            }
        } while (!p2Var.b(value, i53.a.e(arrayList2)));
        H4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: qt1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqt1/a$a;", "", "<init>", "()V", "", "LOCATION_TAG", "Ljava/lang/String;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2775a {
        public /* synthetic */ C2775a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2775a() {
        }
    }
}
