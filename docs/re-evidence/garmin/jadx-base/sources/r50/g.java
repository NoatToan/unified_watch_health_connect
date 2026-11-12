package r50;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.a2;
import r53.b2;
import r53.c2;
import r53.e2;
import r53.g2;
import r53.k2;
import r53.m1;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lr50/g;", "Landroidx/lifecycle/u1;", "Ll40/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetails", "", "isCreatingCourse", "Lg30/r;", "getOnCourseRouteFeaturesUseCase", "Lg30/h;", "deleteAllRestsUseCase", "Lg30/d;", "deleteAllCutoffsUseCase", "Lg30/f;", "deleteAllNotesUseCase", "Lg30/b;", "addCoursePointUseCase", "Lg30/j;", "deleteCoursePointUseCase", "Lg30/l;", "editCoursePointUseCase", "Lg30/p;", "editStartDetailsUseCase", "Lg30/n;", "editFinishDetailsUseCase", "Lz20/d;", "convertToGCJ02UseCase", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;ZLg30/r;Lg30/h;Lg30/d;Lg30/f;Lg30/b;Lg30/j;Lg30/l;Lg30/p;Lg30/n;Lz20/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 implements l40.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f150422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g30.h f150423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g30.d f150424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g30.f f150425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g30.b f150426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g30.j f150427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g30.l f150428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g30.p f150429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g30.n f150430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z20.d f150431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f150432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f150433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e2 f150434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f150435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f150436o;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150437a;

        static {
            int[] iArr = new int[t50.a.values().length];
            try {
                iArr[t50.a.RESTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t50.a.CUTOFFS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t50.a.NOTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f150437a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListViewModel$emitEffect$1", f = "CoursePointListViewModel.kt", l = {432}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150438a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t50.c f150440c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t50.c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f150440c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new b(this.f150440c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150438a;
            if (i14 == 0) {
                o13.r.b(obj);
                e2 e2Var = g.this.f150434m;
                this.f150438a = 1;
                if (e2Var.emit(this.f150440c, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<l40.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f150441a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f150442a;

            /* JADX INFO: renamed from: r50.g$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListViewModel$special$$inlined$map$1$2", f = "CoursePointListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2826a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f150443a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f150444b;

                public C2826a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f150443a = obj;
                    this.f150444b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f150442a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2826a c2826a;
                if (dVar instanceof C2826a) {
                    c2826a = (C2826a) dVar;
                    int i14 = c2826a.f150444b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2826a.f150444b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2826a = new C2826a(dVar);
                    }
                } else {
                    c2826a = new C2826a(dVar);
                }
                Object obj2 = c2826a.f150443a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2826a.f150444b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    l40.d dVar2 = ((t50.e) obj).f162545e;
                    c2826a.f150444b = 1;
                    if (this.f150442a.emit(dVar2, c2826a) == aVar) {
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

        public c(r53.i iVar) {
            this.f150441a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super l40.d> jVar, t13.d dVar) {
            Object objCollect = this.f150441a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public g(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, g30.r rVar, g30.h hVar, g30.d dVar, g30.f fVar, g30.b bVar, g30.j jVar, g30.l lVar, g30.p pVar, g30.n nVar, z20.d dVar2) {
        rVar.getClass();
        hVar.getClass();
        dVar.getClass();
        fVar.getClass();
        bVar.getClass();
        jVar.getClass();
        lVar.getClass();
        pVar.getClass();
        nVar.getClass();
        dVar2.getClass();
        this.f150422a = z14;
        this.f150423b = hVar;
        this.f150424c = dVar;
        this.f150425d = fVar;
        this.f150426e = bVar;
        this.f150427f = jVar;
        this.f150428g = lVar;
        this.f150429h = pVar;
        this.f150430i = nVar;
        this.f150431j = dVar2;
        p2 p2VarA = q2.a(new t50.e(false, false, null, false, null, 31, null));
        this.f150432k = p2VarA;
        b2 b2VarD = r53.s.d(p2VarA);
        this.f150433l = b2VarD;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f150434m = e2VarB;
        this.f150435n = r53.s.c(e2VarB);
        c cVar = new c(b2VarD);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f150436o = r53.s.K(cVar, aVarA, k2.a.f150705b, ((t50.e) b2VarD.f150540a.getValue()).f162545e);
        if (eVar != null) {
            r53.u uVar = new r53.u(new m1(new r53.v(new c0(this, null), new c2(new g30.q(eVar, rVar, null))), new d0(eVar, this, null)), new e0(this, null));
            x53.c cVar2 = s0.f129406a;
            r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(this));
        }
    }

    public final void A4(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        gVar.getClass();
        y4(new t50.c.l(gVar));
    }

    public final void B4(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
        com.garmin.android.apps.connectmobile.courses.model.g gVar2 = new com.garmin.android.apps.connectmobile.courses.model.g(gVar);
        Double d14 = geoPointDTO.latitude;
        if (d14 != null) {
            gVar2.lat = Double.valueOf(d14.doubleValue());
        }
        Double d15 = geoPointDTO.longitude;
        if (d15 != null) {
            gVar2.lon = Double.valueOf(d15.doubleValue());
        }
        Double d16 = geoPointDTO.distance;
        if (d16 != null) {
            gVar2.o(Double.valueOf(d16.doubleValue()));
        }
        Double d17 = geoPointDTO.elevation;
        if (d17 != null) {
            double dDoubleValue = d17.doubleValue();
            gVar2.elevation = null;
            gVar2.derivedElevation = Double.valueOf(dDoubleValue);
        }
        y4(new t50.c.s(gVar2));
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        p2 p2Var;
        Object value;
        t50.e eVar;
        l40.d dVar;
        do {
            p2Var = this.f150432k;
            value = p2Var.getValue();
            eVar = (t50.e) value;
            l40.c cVar = l40.c.f109891a;
            dVar = eVar.f162545e;
            cVar.getClass();
        } while (!p2Var.b(value, t50.e.a(eVar, false, false, null, l40.c.a(dVar, aVar), 15)));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2, reason: from getter */
    public final b2 getF150436o() {
        return this.f150436o;
    }

    public final void x4() {
        y4(t50.c.h.f162524a);
    }

    public final void y4(t50.c cVar) {
        ge1.b.T(v1.a(this), null, null, new b(cVar, null), 3);
    }

    public final void z4() {
        y4(t50.c.j.f162526a);
    }
}
