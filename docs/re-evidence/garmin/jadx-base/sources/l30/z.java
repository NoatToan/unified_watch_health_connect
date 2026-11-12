package l30;

import android.os.Bundle;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Ll30/z;", "Landroidx/lifecycle/u1;", "Ll40/b;", "Lw20/a;", "courseData", "Ln30/e;", "courseParams", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "relatedPacebands", "Lab1/g;", "relatedPowerGuide", "Lb30/h;", "getCourseDataUseCase", "Lz20/t;", "getPointsOfInterestUseCase", "Lz20/v;", "getPrimaryClimbsUseCase", "Lz20/x;", "getSecondaryClimbsUseCase", "Lz20/n;", "getHazardsUseCase", "Lb30/u;", "undoCourseRouteStateUseCase", "Lb30/w;", "updateCourseTypeUseCase", "Lb30/s;", "toggleLapCoursePointUseCase", "Lb30/a;", "addCoursePointUseCase", "Lb30/e;", "editCoursePointUseCase", "Lb30/d;", "deleteCoursePointUseCase", "Lb30/p;", "saveCourseUseCase", "Lz20/a0;", "updateCoursePacebandsUseCase", "Lz20/g;", "deleteCoursePowerGuideUseCase", "Lz20/c0;", "updateCoursePowerGuideUseCase", "Lb30/k;", "getCourseRouteUseCase", "Lz20/d;", "convertToGCJ02UseCase", "<init>", "(Lw20/a;Ln30/e;Ljava/util/List;Lab1/g;Lb30/h;Lz20/t;Lz20/v;Lz20/x;Lz20/n;Lb30/u;Lb30/w;Lb30/s;Lb30/a;Lb30/e;Lb30/d;Lb30/p;Lz20/a0;Lz20/g;Lz20/c0;Lb30/k;Lz20/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends u1 implements l40.b {
    public final b2 A;
    public c2 B;
    public c2 C;
    public c2 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n30.e f109648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> f109649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ab1.g f109650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b30.h f109651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z20.t f109652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z20.v f109653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z20.x f109654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z20.n f109655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b30.u f109656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b30.w f109657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b30.s f109658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b30.a f109659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b30.e f109660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b30.d f109661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b30.p f109662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z20.a0 f109663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z20.g f109664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z20.c0 f109665r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b30.k f109666t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z20.d f109667v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p2 f109668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b2 f109669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e2 f109670y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a2 f109671z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$emitEffect$1", f = "CreateCourseViewModel.kt", l = {856}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109672a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n30.c f109674c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n30.c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f109674c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new a(this.f109674c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f109672a;
            if (i14 == 0) {
                o13.r.b(obj);
                e2 e2Var = z.this.f109670y;
                this.f109672a = 1;
                if (e2Var.emit(this.f109674c, this) == aVar) {
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
    public static final class b implements r53.i<l40.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f109675a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f109676a;

            /* JADX INFO: renamed from: l30.z$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$special$$inlined$map$1$2", f = "CreateCourseViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2098a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f109677a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f109678b;

                public C2098a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f109677a = obj;
                    this.f109678b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f109676a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2098a c2098a;
                if (dVar instanceof C2098a) {
                    c2098a = (C2098a) dVar;
                    int i14 = c2098a.f109678b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2098a.f109678b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2098a = new C2098a(dVar);
                    }
                } else {
                    c2098a = new C2098a(dVar);
                }
                Object obj2 = c2098a.f109677a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2098a.f109678b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    l40.d dVar2 = ((n30.f) obj).f123462j;
                    c2098a.f109678b = 1;
                    if (this.f109676a.emit(dVar2, c2098a) == aVar) {
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

        public b(r53.i iVar) {
            this.f109675a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super l40.d> jVar, t13.d dVar) {
            Object objCollect = this.f109675a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ln30/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$updateCourseRoute$1", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super n30.f>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super n30.f> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = z.this.f109668w;
            p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), true, null, false, null, null, null, 0, false, null, null, 2046));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln30/f;", "data", "", "<anonymous>", "(Ln30/f;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$updateCourseRoute$2", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<n30.f, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f109681a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = z.this.new d(dVar);
            dVar2.f109681a = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(n30.f fVar, t13.d<? super Unit> dVar) {
            return ((d) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            n30.f fVar = (n30.f) this.f109681a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            z zVar = z.this;
            if (fVar != null) {
                zVar.f109668w.k(null, fVar);
            } else {
                zVar.z4(n30.c.k0.f123423a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Ln30/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$updateCourseRoute$3", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<r53.j<? super n30.f>, Throwable, t13.d<? super Unit>, Object> {
        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super n30.f> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return z.this.new e(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = z.this.f109668w;
            p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, false, null, null, null, 0, false, null, null, 2046));
            return Unit.INSTANCE;
        }
    }

    public z(w20.a aVar, n30.e eVar, List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list, ab1.g gVar, b30.h hVar, z20.t tVar, z20.v vVar, z20.x xVar, z20.n nVar, b30.u uVar, b30.w wVar, b30.s sVar, b30.a aVar2, b30.e eVar2, b30.d dVar, b30.p pVar, z20.a0 a0Var, z20.g gVar2, z20.c0 c0Var, b30.k kVar, z20.d dVar2) {
        aVar.getClass();
        hVar.getClass();
        tVar.getClass();
        vVar.getClass();
        xVar.getClass();
        nVar.getClass();
        uVar.getClass();
        wVar.getClass();
        sVar.getClass();
        aVar2.getClass();
        eVar2.getClass();
        dVar.getClass();
        pVar.getClass();
        a0Var.getClass();
        gVar2.getClass();
        c0Var.getClass();
        kVar.getClass();
        dVar2.getClass();
        this.f109648a = eVar;
        this.f109649b = list;
        this.f109650c = gVar;
        this.f109651d = hVar;
        this.f109652e = tVar;
        this.f109653f = vVar;
        this.f109654g = xVar;
        this.f109655h = nVar;
        this.f109656i = uVar;
        this.f109657j = wVar;
        this.f109658k = sVar;
        this.f109659l = aVar2;
        this.f109660m = eVar2;
        this.f109661n = dVar;
        this.f109662o = pVar;
        this.f109663p = a0Var;
        this.f109664q = gVar2;
        this.f109665r = c0Var;
        this.f109666t = kVar;
        this.f109667v = dVar2;
        p2 p2VarA = q2.a(new n30.f(false, null, false, null, false, null, null, 0, false, null, null, 2047, null));
        this.f109668w = p2VarA;
        b2 b2VarD = r53.s.d(p2VarA);
        this.f109669x = b2VarD;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f109670y = e2VarB;
        this.f109671z = r53.s.c(e2VarB);
        b bVar = new b(b2VarD);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.A = r53.s.K(bVar, aVarA, k2.a.f150705b, ((n30.f) b2VarD.f150540a.getValue()).f123462j);
        r53.s.C(new m1(r53.s.s(new l(b2VarD)), new m(this, null)), v1.a(this));
        r53.u uVar2 = new r53.u(new m1(new r53.v(new e0(this, null), new r53.c2(new b30.g(hVar, aVar, eVar, null))), new f0(this, null)), new g0(this, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(r53.s.A(uVar2, x53.b.f189152a), v1.a(this));
    }

    public final void A4() {
        z4(n30.c.l.f123424a);
    }

    public final void B4(n30.a aVar) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        GeoPointDTO geoPointDTOD;
        Double d14;
        w20.b bVar;
        n30.e eVar3;
        n30.e eVar4;
        n30.e eVar5;
        n30.e eVar6;
        n30.e eVar7;
        n30.e eVar8;
        com.garmin.android.apps.connectmobile.courses.model.e eVar9;
        com.garmin.android.apps.connectmobile.courses.model.e eVar10;
        com.garmin.android.apps.connectmobile.courses.model.e eVar11;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        Object next;
        com.garmin.android.apps.connectmobile.courses.model.e eVar12;
        com.garmin.android.apps.connectmobile.courses.model.e eVar13;
        r30.a aVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar14;
        w20.a aVar3;
        com.garmin.android.apps.connectmobile.courses.model.e eVar15;
        w20.a aVar4;
        com.garmin.android.apps.connectmobile.courses.model.e eVar16;
        com.garmin.android.apps.connectmobile.courses.model.e eVar17;
        com.garmin.android.apps.connectmobile.courses.model.e eVar18;
        com.garmin.android.apps.connectmobile.courses.model.e eVar19;
        aVar.getClass();
        boolean zEquals = aVar.equals(n30.a.f.f123353a);
        p2 p2Var = this.f109668w;
        List<GeoPointDTO> list = null;
        if (zEquals) {
            ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).x();
            p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, false, null, null, n30.h.a(((n30.f) p2Var.getValue()).f123459g), 0, false, null, null, 1983));
            z4(n30.c.h0.f123416a);
            return;
        }
        if (aVar.equals(n30.a.g.f123354a)) {
            z4(n30.c.m.f123426a);
            return;
        }
        if (aVar.equals(n30.a.s.f123381a)) {
            n30.f fVar = (n30.f) p2Var.getValue();
            b30.u uVar = this.f109656i;
            uVar.getClass();
            fVar.getClass();
            r53.u uVar2 = new r53.u(new m1(new r53.v(new l0(this, null), new r53.c2(new b30.t(fVar, uVar, null))), new m0(this, null)), new n0(this, null));
            x53.c cVar = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar2, x53.b.f189152a), v1.a(this));
            return;
        }
        if (aVar instanceof n30.a.w) {
            com.garmin.android.apps.connectmobile.courses.model.i iVar = ((n30.a.w) aVar).f123386a;
            n30.f fVar2 = (n30.f) p2Var.getValue();
            b30.w wVar = this.f109657j;
            wVar.getClass();
            fVar2.getClass();
            r53.u uVar3 = new r53.u(new m1(new r53.v(new r0(this, null), new r53.c2(new b30.v(fVar2, iVar, wVar, null))), new s0(this, null)), new t0(this, null));
            x53.c cVar2 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar3, x53.b.f189152a), v1.a(this));
            return;
        }
        if (aVar instanceof n30.a.v) {
            boolean z14 = ((n30.a.v) aVar).f123385a;
            w20.a aVar5 = ((n30.f) p2Var.getValue()).f123456d;
            if (aVar5 == null || (eVar19 = aVar5.f181476a) == null) {
                return;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar20 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar19);
            eVar20.z0(z14);
            n30.f fVar3 = (n30.f) p2Var.getValue();
            w20.a aVar6 = ((n30.f) p2Var.getValue()).f123456d;
            p2Var.k(null, n30.f.a(fVar3, false, null, false, aVar6 != null ? w20.a.b(aVar6, eVar20, null, null, null, null, 62) : null, null, null, 0, false, null, null, 2023));
            return;
        }
        if (aVar instanceof n30.a.x) {
            n30.a.x xVar = (n30.a.x) aVar;
            double d15 = xVar.f123387a;
            double d16 = xVar.f123388b;
            w20.a aVar7 = ((n30.f) p2Var.getValue()).f123456d;
            if (aVar7 == null || (eVar18 = aVar7.f181476a) == null) {
                return;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar21 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar18);
            eVar21.C0(Double.valueOf(d15));
            eVar21.elapsedSeconds = Double.valueOf(d16);
            n30.f fVar4 = (n30.f) p2Var.getValue();
            w20.a aVar8 = ((n30.f) p2Var.getValue()).f123456d;
            p2Var.k(null, n30.f.a(fVar4, false, null, false, aVar8 != null ? w20.a.b(aVar8, eVar21, null, null, null, null, 62) : null, null, null, 0, false, null, null, 2023));
            return;
        }
        boolean z15 = false;
        if (aVar instanceof n30.a.e) {
            n50.f fVar5 = ((n30.a.e) aVar).f123352a;
            if (fVar5 instanceof n50.f.i) {
                String str = ((n50.f.i) fVar5).f123755a;
                w20.a aVar9 = ((n30.f) p2Var.getValue()).f123456d;
                if (aVar9 == null || (eVar17 = aVar9.f181476a) == null) {
                    return;
                }
                com.garmin.android.apps.connectmobile.courses.model.e eVar22 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar17);
                eVar22.courseName = str;
                n30.f fVar6 = (n30.f) p2Var.getValue();
                w20.a aVar10 = ((n30.f) p2Var.getValue()).f123456d;
                p2Var.k(null, n30.f.a(fVar6, false, null, false, aVar10 != null ? w20.a.b(aVar10, eVar22, null, null, null, null, 62) : null, null, null, 0, false, null, null, 2023));
                return;
            }
            if (!(fVar5 instanceof n50.f.C2321f)) {
                if (fVar5 instanceof n50.f.g) {
                    p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, false, null, null, null, 0, ((n50.f.g) fVar5).f123753a, null, null, 1791));
                    return;
                }
                if (fVar5 instanceof n50.f.h) {
                    boolean z16 = ((n50.f.h) fVar5).f123754a;
                    w20.a aVar11 = ((n30.f) p2Var.getValue()).f123456d;
                    if (aVar11 == null || (eVar14 = aVar11.f181476a) == null) {
                        return;
                    }
                    com.garmin.android.apps.connectmobile.courses.model.e eVar23 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar14);
                    eVar23.w0(Boolean.valueOf(!z16));
                    n30.f fVar7 = (n30.f) p2Var.getValue();
                    w20.a aVar12 = ((n30.f) p2Var.getValue()).f123456d;
                    p2Var.k(null, n30.f.a(fVar7, false, null, false, aVar12 != null ? w20.a.b(aVar12, eVar23, null, null, null, null, 62) : null, null, null, 0, false, null, null, 2023));
                    return;
                }
                return;
            }
            boolean z17 = ((n50.f.C2321f) fVar5).f123752a;
            n30.f fVar8 = (n30.f) p2Var.getValue();
            this.f109658k.getClass();
            fVar8.getClass();
            List listD0 = fVar8.f123458f;
            n30.g gVarB = fVar8.b();
            n30.g gVarA = gVarB != null ? n30.g.a(gVarB, null, z17, null, 11) : null;
            boolean z18 = (z17 || (aVar4 = fVar8.f123456d) == null || (eVar16 = aVar4.f181476a) == null || !eVar16.M()) ? false : true;
            if (gVarA != null) {
                listD0 = z18 ? p13.h0.D0(p13.h0.V(1, listD0), gVarA) : p13.h0.D0(listD0, gVarA);
            }
            n30.f fVarA = b30.c.a(n30.f.a(fVar8, false, null, false, null, listD0, null, 0, false, null, null, 2015));
            n30.g gVarB2 = fVarA.b();
            if (!(gVarB2 != null ? gVarB2.f123468c : false) || ((aVar3 = fVarA.f123456d) != null && (eVar15 = aVar3.f181476a) != null && eVar15.G())) {
                fVar8 = fVarA;
            }
            p2Var.k(null, fVar8);
            return;
        }
        if (aVar instanceof n30.a.d) {
            n50.c cVar3 = ((n30.a.d) aVar).f123351a;
            if (cVar3 instanceof n50.c.b) {
                r30.a aVar13 = ((n50.c.b) cVar3).f123741a;
                while (true) {
                    Object value = p2Var.getValue();
                    aVar2 = aVar13;
                    if (p2Var.b(value, n30.f.a((n30.f) value, false, null, false, null, null, null, 0, false, null, aVar2, 1023))) {
                        break;
                    } else {
                        aVar13 = aVar2;
                    }
                }
                if (aVar2 == r30.a.CLIMBS) {
                    Bundle bundle = new Bundle(2);
                    bundle.putString("Screen", "Courses");
                    bundle.putString("Action", "On");
                    ht.a.f85464a.getClass();
                    ht.a.a(bundle, "ToggleClimbsOnCourse");
                    return;
                }
                return;
            }
            return;
        }
        if (aVar instanceof n30.a.r) {
            n30.a.r rVar = (n30.a.r) aVar;
            com.garmin.android.library.mapsdkadapter.e eVar24 = rVar.f123378a;
            int i14 = rVar.f123379b;
            List<com.garmin.android.apps.connectmobile.courses.model.h> list2 = rVar.f123380c;
            c2 c2Var = this.B;
            if (c2Var != null) {
                c2Var.c(null);
            }
            m1 m1Var = new m1(this.f109652e.a(eVar24, i14, list2), new b0(this, null));
            x53.c cVar4 = o53.s0.f129406a;
            this.B = r53.s.C(r53.s.g(r53.s.A(m1Var, x53.b.f189152a)), v1.a(this));
            return;
        }
        if (aVar instanceof n30.a.p) {
            n30.a.p pVar = (n30.a.p) aVar;
            com.garmin.android.library.mapsdkadapter.e eVar25 = pVar.f123372a;
            com.garmin.android.apps.connectmobile.courses.model.c cVar5 = pVar.f123373b;
            com.garmin.android.apps.connectmobile.courses.model.b bVar2 = pVar.f123374c;
            com.garmin.android.apps.connectmobile.courses.model.b bVar3 = pVar.f123375d;
            c2 c2Var2 = this.C;
            if (c2Var2 != null) {
                c2Var2.c(null);
            }
            m1 m1Var2 = new m1(this.f109653f.a(eVar25, cVar5, bVar2, bVar3), new c0(this, null));
            x53.c cVar6 = o53.s0.f129406a;
            this.C = r53.s.C(r53.s.g(r53.s.A(m1Var2, x53.b.f189152a)), v1.a(this));
            return;
        }
        if (aVar instanceof n30.a.o) {
            n30.a.o oVar = (n30.a.o) aVar;
            m1 m1Var3 = new m1(this.f109654g.a(oVar.f123369a, oVar.f123370b, oVar.f123371c), new d0(this, null));
            x53.c cVar7 = o53.s0.f129406a;
            r53.s.C(r53.s.A(m1Var3, x53.b.f189152a), v1.a(this));
            return;
        }
        if (aVar instanceof n30.a.q) {
            n30.a.q qVar = (n30.a.q) aVar;
            com.garmin.android.library.mapsdkadapter.e eVar26 = qVar.f123376a;
            List<fn0.c> list3 = qVar.f123377b;
            c2 c2Var3 = this.D;
            if (c2Var3 != null) {
                c2Var3.c(null);
            }
            m1 m1Var4 = new m1(this.f109655h.a(eVar26, list3), new a0(this, null));
            x53.c cVar8 = o53.s0.f129406a;
            this.D = r53.s.C(r53.s.g(r53.s.A(m1Var4, x53.b.f189152a)), v1.a(this));
            return;
        }
        if (aVar instanceof n30.a.C2314a) {
            com.garmin.android.apps.connectmobile.courses.model.g gVar = ((n30.a.C2314a) aVar).f123346a;
            n30.f fVarA2 = (n30.f) this.f109669x.f150540a.getValue();
            this.f109659l.getClass();
            fVarA2.getClass();
            w20.a aVar14 = fVarA2.f123456d;
            if (aVar14 != null && (eVar13 = aVar14.f181476a) != null) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar27 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar13);
                eVar27.b(gVar);
                n30.g gVarB3 = fVarA2.b();
                if (gVarB3 != null) {
                    fVarA2 = n30.f.a(fVarA2, false, null, false, w20.a.b(fVarA2.f123456d, eVar27, null, null, null, null, 62), p13.h0.D0(fVarA2.f123458f, n30.g.a(gVarB3, eVar27.j(), false, null, 13)), null, 0, false, null, null, 2007);
                }
            }
            p2Var.k(null, fVarA2);
            return;
        }
        if (aVar instanceof n30.a.b) {
            long j8 = ((n30.a.b) aVar).f123347a;
            w20.a aVar15 = ((n30.f) p2Var.getValue()).f123456d;
            if (aVar15 == null || (eVar11 = aVar15.f181476a) == null || (listJ = eVar11.j()) == null) {
                return;
            }
            Iterator<T> it = listJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Long coursePointId = ((com.garmin.android.apps.connectmobile.courses.model.g) next).getCoursePointId();
                if (coursePointId != null && coursePointId.longValue() == j8) {
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) next;
            if (gVar2 == null) {
                return;
            }
            n30.f fVarA3 = (n30.f) p2Var.getValue();
            this.f109661n.getClass();
            fVarA3.getClass();
            w20.a aVar16 = fVarA3.f123456d;
            if (aVar16 != null && (eVar12 = aVar16.f181476a) != null) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar28 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar12);
                eVar28.d(gVar2);
                n30.g gVarB4 = fVarA3.b();
                if (gVarB4 != null) {
                    fVarA3 = n30.f.a(fVarA3, false, null, false, w20.a.b(fVarA3.f123456d, eVar28, null, null, null, null, 62), p13.h0.D0(fVarA3.f123458f, n30.g.a(gVarB4, eVar28.j(), false, null, 13)), null, 0, false, null, null, 2007);
                }
            }
            p2Var.k(null, fVarA3);
            return;
        }
        if (aVar instanceof n30.a.c) {
            n30.a.c cVar9 = (n30.a.c) aVar;
            com.garmin.android.apps.connectmobile.courses.model.g gVar3 = cVar9.f123348a;
            com.garmin.android.apps.connectmobile.courses.model.g gVar4 = cVar9.f123349b;
            boolean z19 = cVar9.f123350c;
            n30.f fVarA4 = (n30.f) p2Var.getValue();
            this.f109660m.getClass();
            fVarA4.getClass();
            w20.a aVar17 = fVarA4.f123456d;
            if (aVar17 != null && (eVar10 = aVar17.f181476a) != null) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar29 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar10);
                eVar29.d(gVar3);
                eVar29.b(gVar4);
                n30.g gVarB5 = fVarA4.b();
                if (gVarB5 != null) {
                    n30.g gVarA2 = n30.g.a(gVarB5, eVar29.j(), false, null, 13);
                    List<n30.g> list4 = fVarA4.f123458f;
                    fVarA4 = n30.f.a(fVarA4, false, null, false, w20.a.b(fVarA4.f123456d, eVar29, null, null, null, null, 62), z19 ? p13.h0.D0(list4, gVarA2) : p13.h0.D0(p13.h0.V(1, list4), gVarA2), null, 0, false, null, null, 2007);
                }
            }
            p2Var.k(null, fVarA4);
            return;
        }
        if (aVar instanceof n30.a.j) {
            n30.a.j jVar = (n30.a.j) aVar;
            com.garmin.android.apps.connectmobile.courses.model.g gVar5 = jVar.f123357a;
            GeoPointDTO geoPointDTO = jVar.f123358b;
            w20.a aVar18 = ((n30.f) p2Var.getValue()).f123456d;
            if (aVar18 != null && (eVar9 = aVar18.f181476a) != null) {
                list = eVar9.geoPoints;
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            new s20.m();
            ArrayList arrayListE = s20.m.e(list, geoPointDTO);
            if (arrayListE.size() > 1) {
                z4(new n30.c.i0(arrayListE, gVar5));
                return;
            } else {
                if (arrayListE.isEmpty()) {
                    return;
                }
                E4(gVar5, (GeoPointDTO) p13.h0.b0(arrayListE));
                return;
            }
        }
        if (aVar instanceof n30.a.u) {
            n30.a.u uVar4 = (n30.a.u) aVar;
            E4(uVar4.f123383a, uVar4.f123384b);
            return;
        }
        if (aVar instanceof n30.a.y) {
            LatLng latLng = ((n30.a.y) aVar).f123389a;
            n30.g gVarB6 = ((n30.f) p2Var.getValue()).b();
            k30.k kVar = (gVarB6 == null || (eVar8 = gVarB6.f123469d) == null) ? k30.k.POPULARITY : eVar8.f123446a;
            n30.g gVarB7 = ((n30.f) p2Var.getValue()).b();
            boolean z24 = (gVarB7 == null || (eVar7 = gVarB7.f123469d) == null) ? false : eVar7.f123447b;
            n30.g gVarB8 = ((n30.f) p2Var.getValue()).b();
            boolean z25 = (gVarB8 == null || (eVar6 = gVarB8.f123469d) == null) ? false : eVar6.f123448c;
            n30.g gVarB9 = ((n30.f) p2Var.getValue()).b();
            if (gVarB9 != null && (eVar5 = gVarB9.f123469d) != null) {
                z15 = eVar5.f123449d;
            }
            n30.g gVarB10 = ((n30.f) p2Var.getValue()).b();
            if (gVarB10 == null || (eVar4 = gVarB10.f123469d) == null) {
                w20.b.f181482c.getClass();
                bVar = ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c() ? w20.b.TAILWIND : w20.b.NORTH;
            } else {
                bVar = eVar4.f123451f;
            }
            w20.b bVar4 = bVar;
            n30.g gVarB11 = ((n30.f) p2Var.getValue()).b();
            F4(latLng, kVar, z24, z25, z15, bVar4, (gVarB11 == null || (eVar3 = gVarB11.f123469d) == null) ? 0.0d : eVar3.f123450e);
            return;
        }
        if (aVar instanceof n30.a.l) {
            n30.a.l lVar = (n30.a.l) aVar;
            k30.k kVar2 = lVar.f123361a;
            boolean z26 = lVar.f123364d;
            boolean z27 = lVar.f123365e;
            boolean z28 = lVar.f123366f;
            w20.b bVarA = lVar.f123362b;
            double d17 = lVar.f123363c;
            w20.a aVar19 = ((n30.f) p2Var.getValue()).f123456d;
            if (aVar19 != null && (eVar2 = aVar19.f181476a) != null && (geoPointDTOD = eVar2.D()) != null && (d14 = geoPointDTOD.latitude) != null) {
                double dDoubleValue = d14.doubleValue();
                Double d18 = geoPointDTOD.longitude;
                if (d18 != null) {
                    LatLng latLng2 = new LatLng(dDoubleValue, d18.doubleValue());
                    if (bVarA == w20.b.RANDOM) {
                        w20.b.f181482c.getClass();
                        bVarA = w20.b.a.a();
                    }
                    F4(latLng2, kVar2, z26, z27, z28, bVarA, d17);
                    return;
                }
            }
            return;
        }
        if (aVar instanceof n30.a.t) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar30 = ((n30.a.t) aVar).f123382a;
            n30.g gVarB12 = ((n30.f) p2Var.getValue()).b();
            if (gVarB12 != null) {
                n30.g gVarA3 = n30.g.a(gVarB12, eVar30.j(), false, null, 13);
                w20.a aVar20 = new w20.a(eVar30, null, null, null, null, false, 62, null);
                b30.h hVar = this.f109651d;
                hVar.getClass();
                r53.u uVar5 = new r53.u(new m1(new r53.v(new o0(this, null), new r53.c2(new b30.g(hVar, aVar20, this.f109648a, null))), new p0(this, gVarA3, null)), new q0(this, null));
                x53.c cVar10 = o53.s0.f129406a;
                r53.s.C(r53.s.A(uVar5, x53.b.f189152a), v1.a(this));
                return;
            }
            return;
        }
        if (!(aVar instanceof n30.a.k)) {
            if (aVar.equals(n30.a.m.f123367a)) {
                if (((n30.f) p2Var.getValue()).f123460h > 0) {
                    Bundle bundle2 = new Bundle(2);
                    bundle2.putString("Screen", "Courses");
                    bundle2.putInt("NumberOfTimes", ((n30.f) p2Var.getValue()).f123460h);
                    ht.a.f85464a.getClass();
                    ht.a.a(bundle2, "ExploreClimbsDuringCourseCreation");
                    p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, false, null, null, null, 0, false, null, null, 1919));
                }
                n30.f fVar9 = (n30.f) p2Var.getValue();
                b30.p pVar2 = this.f109662o;
                pVar2.getClass();
                fVar9.getClass();
                r53.u uVar6 = new r53.u(new m1(new r53.v(new h0(this, null), new r53.c2(new b30.o(fVar9, pVar2, null))), new j0(this, null)), new k0(this, null));
                x53.c cVar11 = o53.s0.f129406a;
                r53.s.C(r53.s.A(uVar6, x53.b.f189152a), v1.a(this));
                return;
            }
            return;
        }
        n30.a.k kVar3 = (n30.a.k) aVar;
        com.garmin.android.apps.connectmobile.courses.model.f fVar10 = kVar3.f123359a;
        com.garmin.android.library.mapsdkadapter.f fVar11 = kVar3.f123360b;
        kk1.a aVar21 = new kk1.a(this, 7, fVar10, fVar11);
        w20.a aVar22 = ((n30.f) p2Var.getValue()).f123456d;
        if (aVar22 == null) {
            return;
        }
        w20.a aVar23 = ((n30.f) p2Var.getValue()).f123456d;
        if (((aVar23 == null || (eVar = aVar23.f181476a) == null) ? null : eVar.h()) != com.garmin.android.library.mapsdkadapter.i.b.WGS84 || fVar11.f50284b != com.garmin.android.library.mapsdkadapter.i.b.GCJ02) {
            aVar21.invoke();
            return;
        }
        z20.d dVar = this.f109667v;
        dVar.getClass();
        r53.u uVar7 = new r53.u(new m1(new r53.v(new n(this, null), new r53.c2(new z20.c(dVar, aVar22, null))), new o(this, aVar21, null)), new p(this, null));
        x53.c cVar12 = o53.s0.f129406a;
        r53.s.C(r53.s.A(uVar7, x53.b.f189152a), v1.a(this));
    }

    public final void C4(int i14) {
        z4(new n30.c.d0(i14));
    }

    public final void D4(boolean z14) {
        p2 p2Var = this.f109668w;
        p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, z14, null, null, null, 0, false, null, null, 2043));
    }

    public final void E4(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
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
        z4(new n30.c.o0(gVar2));
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        p2 p2Var;
        Object value;
        n30.f fVar;
        l40.d dVar;
        do {
            p2Var = this.f109668w;
            value = p2Var.getValue();
            fVar = (n30.f) value;
            l40.c cVar = l40.c.f109891a;
            dVar = fVar.f123462j;
            cVar.getClass();
        } while (!p2Var.b(value, n30.f.a(fVar, false, null, false, null, null, null, 0, false, l40.c.a(dVar, aVar), null, 1535)));
    }

    public final void F4(LatLng latLng, k30.k kVar, boolean z14, boolean z15, boolean z16, w20.b bVar, double d14) {
        w20.b bVarA;
        n30.f fVar = (n30.f) this.f109668w.getValue();
        if (bVar != w20.b.RANDOM) {
            bVarA = bVar;
        } else {
            w20.b.f181482c.getClass();
            bVarA = w20.b.a.a();
        }
        b30.k kVar2 = this.f109666t;
        kVar2.getClass();
        fVar.getClass();
        kVar.getClass();
        bVarA.getClass();
        r53.u uVar = new r53.u(new m1(new r53.v(new c(null), new r53.c2(new b30.j(fVar, kVar2, latLng, bVarA, d14, kVar, z14, z15, z16, null))), new d(null)), new e(null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(this));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2, reason: from getter */
    public final b2 getF102929e() {
        return this.A;
    }

    public final void x4() {
        z4(n30.c.e.f123409a);
    }

    public final void y4() {
        z4(n30.c.i.f123417a);
    }

    public final void z4(n30.c cVar) {
        ge1.b.T(v1.a(this), null, null, new a(cVar, null), 3);
    }
}
