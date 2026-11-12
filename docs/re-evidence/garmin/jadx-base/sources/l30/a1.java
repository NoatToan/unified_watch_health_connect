package l30;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.a2;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.k2;
import r53.m1;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll30/a1;", "Landroidx/lifecycle/u1;", "Ll40/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "", "courseName", "Ln30/e;", "courseParams", "Lb30/n;", "getMultipleCourseRoutesUseCase", "Lz20/t;", "getPointsOfInterestUseCase", "Lz20/v;", "getPrimaryClimbsUseCase", "Lz20/x;", "getSecondaryClimbsUseCase", "Lz20/n;", "getHazardsUseCase", "Lb30/r;", "selectCourseUseCase", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/i;Ljava/lang/String;Ln30/e;Lb30/n;Lz20/t;Lz20/v;Lz20/x;Lz20/n;Lb30/r;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a1 extends u1 implements l40.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.i f109515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b30.n f109517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z20.t f109518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z20.v f109519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z20.x f109520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z20.n f109521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b30.r f109522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f109523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f109524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e2 f109525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a2 f109526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f109527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c2 f109528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c2 f109529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c2 f109530p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$emitEffect$1", f = "MultipleCoursesViewModel.kt", l = {388}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109531a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n30.j f109533c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n30.j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f109533c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a1.this.new a(this.f109533c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f109531a;
            if (i14 == 0) {
                o13.r.b(obj);
                e2 e2Var = a1.this.f109525k;
                this.f109531a = 1;
                if (e2Var.emit(this.f109533c, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lw20/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$fetchCourseRoutes$1", f = "MultipleCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super List<? extends w20.a>>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a1.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super List<? extends w20.a>> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = a1.this.f109523i;
            p2Var.k(null, n30.l.a((n30.l) p2Var.getValue(), true, n50.a.OPERATION_CREATE_COURSE_ROUTES, false, null, null, null, 60));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lw20/a;", "coursesData", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$fetchCourseRoutes$2", f = "MultipleCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<List<? extends w20.a>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f109535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n30.e f109536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a1 f109537c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n30.e eVar, a1 a1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f109536b = eVar;
            this.f109537c = a1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(this.f109536b, this.f109537c, dVar);
            cVar.f109535a = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(List<? extends w20.a> list, t13.d<? super Unit> dVar) {
            return ((c) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f109535a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a1 a1Var = this.f109537c;
            if (list != null) {
                n30.k kVar = new n30.k(list, 0, this.f109536b, 2, null);
                p2 p2Var = a1Var.f109523i;
                p2Var.k(null, n30.l.a((n30.l) p2Var.getValue(), false, null, false, p13.h0.D0(((n30.l) a1Var.f109523i.getValue()).f123528d, kVar), null, null, 55));
            } else {
                a1Var.x4(n30.j.y.f123520a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "", "Lw20/a;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$fetchCourseRoutes$3", f = "MultipleCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<r53.j<? super List<? extends w20.a>>, Throwable, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super List<? extends w20.a>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return a1.this.new d(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = a1.this.f109523i;
            p2Var.k(null, n30.l.a((n30.l) p2Var.getValue(), false, null, false, null, null, null, 60));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r53.i<l40.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f109539a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f109540a;

            /* JADX INFO: renamed from: l30.a1$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesViewModel$special$$inlined$map$1$2", f = "MultipleCoursesViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2096a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f109541a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f109542b;

                public C2096a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f109541a = obj;
                    this.f109542b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f109540a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2096a c2096a;
                if (dVar instanceof C2096a) {
                    c2096a = (C2096a) dVar;
                    int i14 = c2096a.f109542b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2096a.f109542b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2096a = new C2096a(dVar);
                    }
                } else {
                    c2096a = new C2096a(dVar);
                }
                Object obj2 = c2096a.f109541a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2096a.f109542b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    l40.d dVar2 = ((n30.l) obj).f123530f;
                    c2096a.f109542b = 1;
                    if (this.f109540a.emit(dVar2, c2096a) == aVar) {
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
            this.f109539a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super l40.d> jVar, t13.d dVar) {
            Object objCollect = this.f109539a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public a1(com.garmin.android.apps.connectmobile.courses.model.i iVar, String str, n30.e eVar, b30.n nVar, z20.t tVar, z20.v vVar, z20.x xVar, z20.n nVar2, b30.r rVar) {
        Object value;
        iVar.getClass();
        str.getClass();
        nVar.getClass();
        tVar.getClass();
        vVar.getClass();
        xVar.getClass();
        nVar2.getClass();
        rVar.getClass();
        this.f109515a = iVar;
        this.f109516b = str;
        this.f109517c = nVar;
        this.f109518d = tVar;
        this.f109519e = vVar;
        this.f109520f = xVar;
        this.f109521g = nVar2;
        this.f109522h = rVar;
        p2 p2VarA = q2.a(new n30.l(false, null, false, null, null, null, 63, null));
        this.f109523i = p2VarA;
        b2 b2VarD = r53.s.d(p2VarA);
        this.f109524j = b2VarD;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f109525k = e2VarB;
        this.f109526l = r53.s.c(e2VarB);
        e eVar2 = new e(b2VarD);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f109527m = r53.s.K(eVar2, aVarA, k2.a.f150705b, ((n30.l) b2VarD.f150540a.getValue()).f123530f);
        do {
            value = p2VarA.getValue();
        } while (!p2VarA.b(value, new n30.l(false, null, false, p13.w.c(new n30.k(null, 0, eVar, 3, null)), new n30.h(true, !((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).n(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).n4()), null, 39, null)));
    }

    public final void A4(boolean z14) {
        p2 p2Var = this.f109523i;
        p2Var.k(null, n30.l.a((n30.l) p2Var.getValue(), false, null, z14, null, null, null, 59));
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        p2 p2Var;
        Object value;
        n30.l lVar;
        l40.d dVar;
        do {
            p2Var = this.f109523i;
            value = p2Var.getValue();
            lVar = (n30.l) value;
            l40.c cVar = l40.c.f109891a;
            dVar = lVar.f123530f;
            cVar.getClass();
        } while (!p2Var.b(value, n30.l.a(lVar, false, null, false, null, null, l40.c.a(dVar, aVar), 31)));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2, reason: from getter */
    public final b2 getF109527m() {
        return this.f109527m;
    }

    public final void x4(n30.j jVar) {
        ge1.b.T(v1.a(this), null, null, new a(jVar, null), 3);
    }

    public final void y4(LatLng latLng, n30.e eVar) {
        b30.n nVar = this.f109517c;
        nVar.getClass();
        String str = this.f109516b;
        str.getClass();
        com.garmin.android.apps.connectmobile.courses.model.i iVar = this.f109515a;
        iVar.getClass();
        r53.u uVar = new r53.u(new m1(new r53.v(new b(null), new r53.c2(new b30.m(nVar, latLng, iVar, eVar, str, null))), new c(eVar, this, null)), new d(null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(this));
    }

    public final void z4(int i14) {
        x4(new n30.j.t(i14));
    }
}
