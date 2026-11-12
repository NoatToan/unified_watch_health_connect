package x40;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
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
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lx40/l0;", "Landroidx/lifecycle/u1;", "Ll40/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetails", "", "isCourseImported", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "relatedPacebands", "Lab1/g;", "relatedPowerGuide", "Lc30/d0;", "getCourseDataUseCase", "Lc30/m0;", "importCourseUseCase", "Lz20/t;", "getPointsOfInterestUseCase", "Lz20/v;", "getPrimaryClimbsUseCase", "Lz20/x;", "getSecondaryClimbsUseCase", "Lz20/n;", "getHazardsUseCase", "Lc30/f;", "addFirstPointUseCase", "Lc30/h;", "addNewPointUseCase", "Lc30/n0;", "insertWaypointUseCase", "Lc30/n;", "addPointOfInterestToCourseRouteUseCase", "Lc30/a;", "addClimbToCourseRouteUseCase", "Lc30/u;", "convertToGCJ02UseCase", "Lc30/r0;", "reverseDirectionUseCase", "Lc30/p0;", "outAndBackUseCase", "Lc30/w0;", "undoCourseRouteStateUseCase", "Lc30/e;", "addCoursePointUseCase", "Lc30/y;", "editCoursePointUseCase", "Lc30/x;", "deleteCoursePointUseCase", "Lc30/j0;", "getWaypointsLocationNamesUseCase", "Lc30/c1;", "updateCourseWaypointsUseCase", "Lc30/b1;", "updateCourseWaypointPositionUseCase", "Lz20/e0;", "updateCourseTypeUseCase", "Lc30/t0;", "saveCourseUseCase", "Lz20/a0;", "updateCoursePacebandsUseCase", "Lz20/g;", "deleteCoursePowerGuideUseCase", "Lz20/c0;", "updateCoursePowerGuideUseCase", "Lc30/u0;", "toggleLapCoursePointUseCase", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;ZLjava/util/List;Lab1/g;Lc30/d0;Lc30/m0;Lz20/t;Lz20/v;Lz20/x;Lz20/n;Lc30/f;Lc30/h;Lc30/n0;Lc30/n;Lc30/a;Lc30/u;Lc30/r0;Lc30/p0;Lc30/w0;Lc30/e;Lc30/y;Lc30/x;Lc30/j0;Lc30/c1;Lc30/b1;Lz20/e0;Lc30/t0;Lz20/a0;Lz20/g;Lz20/c0;Lc30/u0;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 extends androidx.lifecycle.u1 implements l40.b {
    public final c30.t0 A;
    public final z20.a0 B;
    public final z20.g C;
    public final z20.c0 D;
    public final c30.u0 E;
    public final p2 F;
    public c2 H0;
    public final b2 I;
    public final e2 P;
    public final a2 T;
    public final b2 X;
    public com.garmin.android.library.mapsdkadapter.i.d Y;
    public c2 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.e f188714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> f188715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ab1.g f188716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c30.d0 f188717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z20.t f188718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z20.v f188719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z20.x f188720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z20.n f188721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c30.f f188722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c30.h f188723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c30.n0 f188724k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public c2 f188725k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c30.n f188726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c30.a f188727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c30.u f188728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c30.r0 f188729o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c30.p0 f188730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c30.w0 f188731q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c30.e f188732r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c30.y f188733t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c30.x f188734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c30.j0 f188735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c30.c1 f188736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c30.b1 f188737y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final z20.e0 f188738z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$emitEffect$1", f = "CreateCustomCourseViewModel.kt", l = {1221}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f188739a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a50.e f188741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a50.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f188741c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l0.this.new a(this.f188741c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f188739a;
            if (i14 == 0) {
                o13.r.b(obj);
                e2 e2Var = l0.this.P;
                this.f188739a = 1;
                if (e2Var.emit(this.f188741c, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lc30/h$a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$extendCourseLine$1", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super c30.h.a>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super c30.h.a> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = l0.this.F;
            p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), true, n50.a.OPERATION_ADD_NEW_POINT, false, null, false, null, null, null, 0, false, false, false, false, null, null, 65532));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc30/h$a;", "result", "", "<anonymous>", "(Lc30/h$a;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$extendCourseLine$2", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<c30.h.a, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f188743a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = l0.this.new c(dVar);
            cVar.f188743a = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(c30.h.a aVar, t13.d<? super Unit> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c30.h.a aVar = (c30.h.a) this.f188743a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            l0 l0Var = l0.this;
            if (aVar == null) {
                l0Var.D4(new a50.e.s0(((a50.g) l0Var.F.getValue()).f1397h));
            } else {
                Double d14 = aVar.f23883b;
                l0Var.L4(aVar.f23882a);
                if (zf.b.D(d14) && d14.doubleValue() >= 10.0d) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "CourseWaypointCorrected");
                    l0Var.D4(a50.e.w0.f1378a);
                }
                List<k30.j> list = aVar.f23884c;
                if (list != null && list.contains(k30.j.TOO_MANY_ROAD_CLOSURES)) {
                    l0Var.D4(a50.e.v0.f1376a);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lc30/h$a;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$extendCourseLine$3", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<r53.j<? super c30.h.a>, Throwable, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super c30.h.a> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return l0.this.new d(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = l0.this.F;
            p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), false, null, false, null, false, null, null, null, 0, false, false, false, false, null, null, 65532));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r53.i<l40.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f188746a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f188747a;

            /* JADX INFO: renamed from: x40.l0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$special$$inlined$map$1$2", f = "CreateCustomCourseViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C3510a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f188748a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f188749b;

                public C3510a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f188748a = obj;
                    this.f188749b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f188747a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3510a c3510a;
                if (dVar instanceof C3510a) {
                    c3510a = (C3510a) dVar;
                    int i14 = c3510a.f188749b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3510a.f188749b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3510a = new C3510a(dVar);
                    }
                } else {
                    c3510a = new C3510a(dVar);
                }
                Object obj2 = c3510a.f188748a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3510a.f188749b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    l40.d dVar2 = ((a50.g) obj).f1404o;
                    c3510a.f188749b = 1;
                    if (this.f188747a.emit(dVar2, c3510a) == aVar) {
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
            this.f188746a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super l40.d> jVar, t13.d dVar) {
            Object objCollect = this.f188746a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public l0(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list, ab1.g gVar, c30.d0 d0Var, c30.m0 m0Var, z20.t tVar, z20.v vVar, z20.x xVar, z20.n nVar, c30.f fVar, c30.h hVar, c30.n0 n0Var, c30.n nVar2, c30.a aVar, c30.u uVar, c30.r0 r0Var, c30.p0 p0Var, c30.w0 w0Var, c30.e eVar2, c30.y yVar, c30.x xVar2, c30.j0 j0Var, c30.c1 c1Var, c30.b1 b1Var, z20.e0 e0Var, c30.t0 t0Var, z20.a0 a0Var, z20.g gVar2, z20.c0 c0Var, c30.u0 u0Var) {
        List<GeoPointDTO> list2;
        eVar.getClass();
        d0Var.getClass();
        m0Var.getClass();
        tVar.getClass();
        vVar.getClass();
        xVar.getClass();
        nVar.getClass();
        fVar.getClass();
        hVar.getClass();
        n0Var.getClass();
        nVar2.getClass();
        aVar.getClass();
        uVar.getClass();
        r0Var.getClass();
        p0Var.getClass();
        w0Var.getClass();
        eVar2.getClass();
        yVar.getClass();
        xVar2.getClass();
        j0Var.getClass();
        c1Var.getClass();
        b1Var.getClass();
        e0Var.getClass();
        t0Var.getClass();
        a0Var.getClass();
        gVar2.getClass();
        c0Var.getClass();
        u0Var.getClass();
        this.f188714a = eVar;
        this.f188715b = list;
        this.f188716c = gVar;
        this.f188717d = d0Var;
        this.f188718e = tVar;
        this.f188719f = vVar;
        this.f188720g = xVar;
        this.f188721h = nVar;
        this.f188722i = fVar;
        this.f188723j = hVar;
        this.f188724k = n0Var;
        this.f188726l = nVar2;
        this.f188727m = aVar;
        this.f188728n = uVar;
        this.f188729o = r0Var;
        this.f188730p = p0Var;
        this.f188731q = w0Var;
        this.f188732r = eVar2;
        this.f188733t = yVar;
        this.f188734v = xVar2;
        this.f188735w = j0Var;
        this.f188736x = c1Var;
        this.f188737y = b1Var;
        this.f188738z = e0Var;
        this.A = t0Var;
        this.B = a0Var;
        this.C = gVar2;
        this.D = c0Var;
        this.E = u0Var;
        p2 p2VarA = q2.a(new a50.g(false, null, false, null, false, false, null, null, null, 0, false, false, false, false, null, null, 65535, null));
        this.F = p2VarA;
        b2 b2VarD = r53.s.d(p2VarA);
        this.I = b2VarD;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.P = e2VarB;
        this.T = r53.s.c(e2VarB);
        e eVar3 = new e(b2VarD);
        w9.a aVarA = androidx.lifecycle.v1.a(this);
        k2.f150703a.getClass();
        this.X = r53.s.K(eVar3, aVarA, k2.a.f150705b, ((a50.g) b2VarD.f150540a.getValue()).f1404o);
        this.Y = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
        r53.s.C(new r53.m1(r53.s.s(new x(b2VarD)), new y(this, null)), androidx.lifecycle.v1.a(this));
        vu1.b bVar = new vu1.b(this, 26);
        if (!z14 || (list2 = eVar.geoPoints) == null || list2.isEmpty()) {
            r53.u uVar2 = new r53.u(new r53.m1(new r53.v(new z0(this, null), new r53.c2(new c30.c0(d0Var, eVar, null))), new a1(bVar, null)), new b1(this, null));
            x53.c cVar = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar2, x53.b.f189152a), androidx.lifecycle.v1.a(this));
        } else {
            List list3 = eVar.geoPoints;
            list3 = list3 == null ? p13.j0.f134944a : list3;
            list3.getClass();
            r53.u uVar3 = new r53.u(new r53.m1(new r53.v(new q0(this, null), new r53.c2(new c30.l0(m0Var, eVar, list3, null))), new r0(bVar, this, null)), new s0(this, null));
            x53.c cVar2 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar3, x53.b.f189152a), androidx.lifecycle.v1.a(this));
        }
    }

    public static a50.g z4(a50.g gVar) {
        a50.a aVarE = gVar.e();
        a50.a aVarA = aVarE != null ? a50.a.a(aVarE, null, null, false, 63) : null;
        List listD0 = gVar.f1396g;
        if (aVarA != null) {
            listD0 = p13.h0.D0(p13.h0.V(1, listD0), aVarA);
        }
        return a50.g.a(gVar, false, null, false, null, false, listD0, null, null, 0, false, false, false, false, null, null, 65471);
    }

    public final void A4() {
        D4(a50.e.f.f1340a);
    }

    public final void B4(com.garmin.android.library.mapsdkadapter.f fVar, e23.a<Unit> aVar) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        p2 p2Var = this.F;
        w20.a aVar2 = ((a50.g) p2Var.getValue()).f1393d;
        List<GeoPointDTO> list = (aVar2 == null || (eVar2 = aVar2.f181476a) == null) ? null : eVar2.geoPoints;
        w20.a aVar3 = ((a50.g) p2Var.getValue()).f1393d;
        com.garmin.android.library.mapsdkadapter.i.b bVarH = (aVar3 == null || (eVar = aVar3.f181476a) == null) ? null : eVar.h();
        if (list == null || list.isEmpty() || bVarH != com.garmin.android.library.mapsdkadapter.i.b.WGS84 || fVar.f50284b != com.garmin.android.library.mapsdkadapter.i.b.GCJ02) {
            aVar.invoke();
            return;
        }
        a50.g gVar = (a50.g) p2Var.getValue();
        c30.u uVar = this.f188728n;
        uVar.getClass();
        gVar.getClass();
        r53.u uVar2 = new r53.u(new r53.m1(new r53.v(new z(this, null), new r53.c2(new c30.t(uVar, gVar, null))), new a0(this, aVar, null)), new b0(this, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(r53.s.A(uVar2, x53.b.f189152a), androidx.lifecycle.v1.a(this));
    }

    public final void C4() {
        D4(a50.e.l.f1353a);
    }

    public final void D4(a50.e eVar) {
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new a(eVar, null), 3);
    }

    public final void E4(com.garmin.android.library.mapsdkadapter.f fVar, Integer num, long j8) {
        p2 p2Var = this.F;
        List<com.garmin.android.library.mapsdkadapter.f> listD = ((a50.g) p2Var.getValue()).d();
        if (listD.isEmpty() || p005kotlin.jvm.internal.s.g(fVar, p13.h0.m0(listD))) {
            return;
        }
        a50.g gVar = (a50.g) p2Var.getValue();
        com.garmin.android.library.mapsdkadapter.i.d dVar = this.Y;
        c30.h hVar = this.f188723j;
        hVar.getClass();
        gVar.getClass();
        dVar.getClass();
        fVar.getClass();
        r53.u uVar = new r53.u(new r53.m1(new r53.v(new b(null), new r53.c2(new c30.m(hVar, gVar, dVar, fVar, num, j8, null))), new c(null)), new d(null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(r53.s.A(uVar, x53.b.f189152a), androidx.lifecycle.v1.a(this));
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        p2 p2Var;
        Object value;
        a50.g gVar;
        l40.d dVar;
        do {
            p2Var = this.F;
            value = p2Var.getValue();
            gVar = (a50.g) value;
            l40.c cVar = l40.c.f109891a;
            dVar = gVar.f1404o;
            cVar.getClass();
        } while (!p2Var.b(value, a50.g.a(gVar, false, null, false, null, false, null, null, null, 0, false, false, false, false, l40.c.a(dVar, aVar), null, 49151)));
    }

    public final void F4() {
        D4(a50.e.o.f1360a);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x045c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:334:0x0ba9  */
    /* JADX WARN: Code duplicated, block: B:451:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x02b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65, types: [o13.p] */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r50v0, types: [androidx.lifecycle.u1, java.lang.Object, x40.l0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v26, types: [a50.g] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v44 */
    public final void G4(a50.c cVar) {
        w20.a aVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        w20.a aVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        a50.g gVarA;
        com.garmin.android.apps.connectmobile.courses.model.e eVar4;
        com.garmin.android.apps.connectmobile.courses.model.e eVar5;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        Object next;
        a50.g gVarA2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar6;
        com.garmin.android.apps.connectmobile.courses.model.e eVar7;
        com.garmin.android.apps.connectmobile.courses.model.e eVar8;
        com.garmin.android.apps.connectmobile.courses.model.e eVar9;
        t13.d dVar;
        Throwable th3;
        com.garmin.android.apps.connectmobile.courses.model.e eVar10;
        ?? r14;
        Double d14;
        Double d15;
        o13.p pVar;
        com.garmin.android.library.mapsdkadapter.f fVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar11;
        a50.g gVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar12;
        com.garmin.android.apps.connectmobile.courses.model.e eVar13;
        com.garmin.android.apps.connectmobile.courses.model.i iVarM;
        cVar.getClass();
        boolean zEquals = cVar.equals(a50.c.i.f1279a);
        p2 p2Var = this.F;
        ?? A = 0;
        Throwable th4 = null;
        if (zEquals) {
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).k3();
            p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), false, null, false, null, false, null, null, a50.b.a(((a50.g) p2Var.getValue()).f1398i, 13), 0, false, false, false, false, null, null, 65279));
            D4(a50.e.o0.f1361a);
            return;
        }
        if (cVar.equals(a50.c.j.f1282a)) {
            D4(a50.e.p.f1362a);
            return;
        }
        if (cVar.equals(a50.c.k.f1284a)) {
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e0();
            p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), false, null, false, null, false, null, null, a50.b.a(((a50.g) p2Var.getValue()).f1398i, 7), 0, false, false, false, false, null, null, 65279));
            return;
        }
        boolean z14 = true;
        if (cVar.equals(a50.c.g0.f1276a)) {
            w20.a aVar3 = ((a50.g) p2Var.getValue()).f1393d;
            if (aVar3 != null && (eVar13 = aVar3.f181476a) != null && (iVarM = eVar13.m()) != null && iVarM.c()) {
                ht.a.f85464a.getClass();
                ht.a.a(null, "P2PCyclingCourseUndo");
            }
            a50.g gVar2 = (a50.g) p2Var.getValue();
            c30.w0 w0Var = this.f188731q;
            w0Var.getClass();
            gVar2.getClass();
            r53.u uVar = new r53.u(new r53.m1(new r53.v(new i1(this, null), new r53.c2(new c30.v0(gVar2, w0Var, null))), new j1(this, null)), new k1(this, null));
            x53.c cVar2 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar, x53.b.f189152a), androidx.lifecycle.v1.a(this));
            return;
        }
        int i14 = 0;
        if (cVar instanceof a50.c.b) {
            com.garmin.android.apps.connectmobile.courses.model.g gVar3 = ((a50.c.b) cVar).f1253a;
            a50.g gVarA3 = (a50.g) this.I.f150540a.getValue();
            com.garmin.android.library.mapsdkadapter.i.d dVar2 = this.Y;
            this.f188732r.getClass();
            gVarA3.getClass();
            dVar2.getClass();
            w20.a aVar4 = gVarA3.f1393d;
            if (aVar4 != null && (eVar12 = aVar4.f181476a) != null) {
                ArrayList arrayListD1 = p13.h0.d1(gVarA3.b());
                d30.a.b(gVar3, arrayListD1, dVar2);
                com.garmin.android.apps.connectmobile.courses.model.e eVar14 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar12);
                eVar14.b(gVar3);
                a50.a aVarE = gVarA3.e();
                if (aVarE != null) {
                    gVarA3 = a50.g.a(gVarA3, false, null, false, w20.a.b(gVarA3.f1393d, eVar14, null, null, null, null, 62), false, p13.h0.D0(gVarA3.f1396g, a50.a.a(aVarE, arrayListD1, eVar14.j(), false, 109)), null, null, 0, false, false, false, false, null, null, 65463);
                }
            }
            p2Var.k(null, gVarA3);
            return;
        }
        int i15 = 27;
        if (cVar instanceof a50.c.x) {
            a50.c.x xVar = (a50.c.x) cVar;
            com.garmin.android.library.mapsdkadapter.f fVar2 = xVar.f1313a;
            Integer num = xVar.f1314b;
            ht.a.f85464a.getClass();
            ht.a.a(null, "P2PPrecisePointAdded");
            ht.a.a(null, "CourseWaypointAdded");
            B4(fVar2, new ug2.b0((Object) this, i15, fVar2, num));
            return;
        }
        if (cVar instanceof a50.c.C0014c) {
            a50.c.C0014c c0014c = (a50.c.C0014c) cVar;
            com.garmin.android.library.mapsdkadapter.f fVar3 = c0014c.f1255a;
            Integer num2 = c0014c.f1256b;
            ht.a.f85464a.getClass();
            ht.a.a(null, "P2PLongTapPointAdded");
            ht.a.a(null, "CourseWaypointAdded");
            B4(fVar3, new ug2.b0((Object) this, i15, fVar3, num2));
            return;
        }
        if (cVar instanceof a50.c.w) {
            a50.c.w wVar = (a50.c.w) cVar;
            com.garmin.android.apps.connectmobile.courses.model.f fVar4 = wVar.f1311a;
            com.garmin.android.library.mapsdkadapter.f fVar5 = wVar.f1312b;
            B4(fVar5, new ug2.b0((Object) this, 28, fVar4, fVar5));
            return;
        }
        if (cVar instanceof a50.c.v) {
            a50.c.v vVar = (a50.c.v) cVar;
            com.garmin.android.library.mapsdkadapter.f fVar6 = vVar.f1309a;
            B4(fVar6, new ug2.b0((Object) this, i15, fVar6, vVar.f1310b));
            return;
        }
        if (cVar instanceof a50.c.z) {
            a50.c.z zVar = (a50.c.z) cVar;
            E4(zVar.f1316a, zVar.f1317b, -1L);
            return;
        }
        if (cVar instanceof a50.c.l) {
            com.garmin.android.library.mapsdkadapter.f fVar7 = ((a50.c.l) cVar).f1286a;
            a50.g gVar4 = (a50.g) p2Var.getValue();
            this.f188724k.getClass();
            gVar4.getClass();
            w20.a aVar5 = gVar4.f1393d;
            if (aVar5 != null && (eVar10 = aVar5.f181476a) != null) {
                List<List<GeoPointDTO>> listB = gVar4.b();
                if (!listB.isEmpty()) {
                    int i16 = -1;
                    int i17 = 0;
                    double d16 = Double.MAX_VALUE;
                    int i18 = -1;
                    for (Object obj : listB) {
                        int i19 = i17 + 1;
                        if (i17 < 0) {
                            Throwable th5 = th4;
                            p13.x.q();
                            throw th5;
                        }
                        int i24 = i14;
                        for (Object obj2 : (List) obj) {
                            int i25 = i24 + 1;
                            if (i24 < 0) {
                                Throwable th6 = th4;
                                p13.x.q();
                                throw th6;
                            }
                            boolean z15 = z14;
                            GeoPointDTO geoPointDTO = (GeoPointDTO) obj2;
                            Throwable th7 = th4;
                            Double d17 = geoPointDTO.latitude;
                            if (d17 != null) {
                                double dDoubleValue = d17.doubleValue();
                                Double d18 = geoPointDTO.longitude;
                                if (d18 != null) {
                                    double dDoubleValue2 = d18.doubleValue();
                                    GeoPointDTO.Companion companion = GeoPointDTO.INSTANCE;
                                    LatLng latLng = fVar7.f50283a;
                                    gVar = gVar4;
                                    double d19 = latLng.latitude;
                                    fVar = fVar7;
                                    eVar11 = eVar10;
                                    double d24 = latLng.longitude;
                                    companion.getClass();
                                    double dA = GeoPointDTO.Companion.a(d19, dDoubleValue, d24, dDoubleValue2, 0.0d, 0.0d);
                                    if (dA < d16) {
                                        d16 = dA;
                                        i16 = i17;
                                        i18 = i24;
                                    }
                                } else {
                                    fVar = fVar7;
                                    eVar11 = eVar10;
                                    gVar = gVar4;
                                }
                            } else {
                                fVar = fVar7;
                                eVar11 = eVar10;
                                gVar = gVar4;
                            }
                            gVar4 = gVar;
                            th4 = th7;
                            i24 = i25;
                            z14 = z15;
                            fVar7 = fVar;
                            eVar10 = eVar11;
                            i14 = 0;
                        }
                        i17 = i19;
                    }
                    com.garmin.android.apps.connectmobile.courses.model.e eVar15 = eVar10;
                    th3 = th4;
                    a50.g gVar5 = gVar4;
                    if (i16 >= 0) {
                        pVar = new o13.p(Integer.valueOf(i16), Integer.valueOf(i18));
                    } else {
                        r14 = th3;
                    }
                    if (r14 != 0) {
                        int iIntValue = ((Number) r14.f128594a).intValue();
                        int iIntValue2 = ((Number) r14.f128595b).intValue();
                        List<GeoPointDTO> list = listB.get(iIntValue);
                        if (iIntValue2 > 0 && iIntValue2 < p13.x.j(list)) {
                            r14 = pVar;
                            int i26 = iIntValue2 + 1;
                            List<GeoPointDTO> listSubList = list.subList(0, i26);
                            ArrayList arrayList = new ArrayList(p13.y.r(listSubList, 10));
                            Iterator it = listSubList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new GeoPointDTO((GeoPointDTO) it.next()));
                            }
                            List<GeoPointDTO> listSubList2 = list.subList(i26, list.size());
                            ArrayList arrayList2 = new ArrayList(p13.y.r(listSubList2, 10));
                            Iterator it3 = listSubList2.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(new GeoPointDTO((GeoPointDTO) it3.next()));
                            }
                            ArrayList arrayList3 = new ArrayList(listB);
                            arrayList3.remove(iIntValue);
                            arrayList3.add(iIntValue, arrayList2);
                            arrayList3.add(iIntValue, arrayList);
                            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                            int i27 = 0;
                            for (Object obj3 : arrayList3) {
                                int i28 = i27 + 1;
                                if (i27 < 0) {
                                    p13.x.q();
                                    throw th3;
                                }
                                List list2 = (List) obj3;
                                CourseSegmentDTO courseSegmentDTO = new CourseSegmentDTO((String) null, (String) null, (Double) null, (String) null, (String) null, (Double) null, (Integer) null, (List) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
                                courseSegmentDTO.j(Integer.valueOf(list2.size()));
                                courseSegmentDTO.k(Integer.valueOf(i28));
                                GeoPointDTO geoPointDTO2 = (GeoPointDTO) p13.h0.n0(list2);
                                double d25 = 0.0d;
                                double dDoubleValue3 = (geoPointDTO2 == null || (d15 = geoPointDTO2.distance) == null) ? 0.0d : d15.doubleValue();
                                GeoPointDTO geoPointDTO3 = (GeoPointDTO) p13.h0.d0(list2);
                                double dDoubleValue4 = dDoubleValue3 - ((geoPointDTO3 == null || (d14 = geoPointDTO3.distance) == null) ? 0.0d : d14.doubleValue());
                                if (dDoubleValue4 >= 0.0d) {
                                    d25 = dDoubleValue4;
                                }
                                courseSegmentDTO.h(Double.valueOf(d25));
                                arrayList4.add(courseSegmentDTO);
                                i27 = i28;
                            }
                            ArrayList arrayListB = d30.b.b(arrayList3, eVar15.h());
                            a50.a aVarE2 = gVar5.e();
                            ?? r24 = aVarE2 != null ? aVarE2.f1244e : th3;
                            a50.a aVarE3 = gVar5.e();
                            A = a50.g.a(gVar5, false, null, false, null, false, p13.h0.D0(gVar5.f1396g, new a50.a(arrayListB, arrayList3, arrayList4, 3L, r24, aVarE3 != null ? aVarE3.f1245f : false, null)), null, null, 0, false, false, false, false, null, null, 65471);
                        }
                    }
                }
                if (A != 0) {
                    L4(A);
                    return;
                }
                return;
            }
            th3 = null;
            r14 = pVar;
            r14 = pVar;
            r14 = pVar;
            A = th3;
            if (A != 0) {
                L4(A);
                return;
            }
            return;
        }
        if (cVar instanceof a50.c.d) {
            a50.c.d dVar3 = (a50.c.d) cVar;
            PointOfInterestDTO pointOfInterestDTO = dVar3.f1260a;
            String str = dVar3.f1261b;
            LatLng latLng2 = new LatLng(pointOfInterestDTO.getLatitude(), pointOfInterestDTO.getLongitude());
            com.garmin.android.library.mapsdkadapter.i.d dVar4 = this.Y;
            dVar4.getClass();
            B4(new com.garmin.android.library.mapsdkadapter.f(latLng2, dVar4), new ug2.b0((Object) this, 26, pointOfInterestDTO, str));
            return;
        }
        if (cVar.equals(a50.c.y.f1315a)) {
            a50.g gVar6 = (a50.g) p2Var.getValue();
            c30.r0 r0Var = this.f188729o;
            r0Var.getClass();
            gVar6.getClass();
            r53.u uVar2 = new r53.u(new r53.m1(new r53.v(new c1(this, null), new r53.c2(new c30.q0(gVar6, r0Var, null))), new d1(this, null)), new e1(this, null));
            x53.c cVar3 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar2, x53.b.f189152a), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar.equals(a50.c.t.f1304a)) {
            a50.g gVar7 = (a50.g) p2Var.getValue();
            c30.p0 p0Var = this.f188730p;
            p0Var.getClass();
            gVar7.getClass();
            r53.u uVar3 = new r53.u(new r53.m1(new r53.v(new w0(this, null), new r53.c2(new c30.o0(gVar7, p0Var, null))), new x0(this, null)), new y0(this, null));
            x53.c cVar4 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar3, x53.b.f189152a), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar.equals(a50.c.m.f1290a)) {
            List<com.garmin.android.library.mapsdkadapter.f> listD = ((a50.g) p2Var.getValue()).d();
            if (listD.isEmpty() || p005kotlin.jvm.internal.s.g(p13.h0.b0(listD), p13.h0.m0(listD))) {
                return;
            }
            x4((com.garmin.android.library.mapsdkadapter.f) p13.h0.b0(listD), null, 2L);
            return;
        }
        if (cVar instanceof a50.c.f0) {
            a50.c.f0 f0Var = (a50.c.f0) cVar;
            com.garmin.android.library.mapsdkadapter.e eVar16 = f0Var.f1272a;
            int i29 = f0Var.f1273b;
            List<com.garmin.android.apps.connectmobile.courses.model.h> list3 = f0Var.f1274c;
            c2 c2Var = this.Z;
            if (c2Var != null) {
                c2Var.c(null);
            }
            r53.m1 m1Var = new r53.m1(this.f188718e.a(eVar16, i29, list3), new n0(this, null));
            x53.c cVar5 = o53.s0.f129406a;
            this.Z = r53.s.C(r53.s.g(r53.s.A(m1Var, x53.b.f189152a)), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar instanceof a50.c.d0) {
            a50.c.d0 d0Var = (a50.c.d0) cVar;
            com.garmin.android.library.mapsdkadapter.e eVar17 = d0Var.f1262a;
            com.garmin.android.apps.connectmobile.courses.model.c cVar6 = d0Var.f1263b;
            com.garmin.android.apps.connectmobile.courses.model.b bVar = d0Var.f1264c;
            com.garmin.android.apps.connectmobile.courses.model.b bVar2 = d0Var.f1265d;
            c2 c2Var2 = this.f188725k0;
            if (c2Var2 != null) {
                c2Var2.c(null);
            }
            r53.m1 m1Var2 = new r53.m1(this.f188719f.a(eVar17, cVar6, bVar, bVar2), new o0(this, null));
            x53.c cVar7 = o53.s0.f129406a;
            this.f188725k0 = r53.s.C(r53.s.g(r53.s.A(m1Var2, x53.b.f189152a)), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar instanceof a50.c.c0) {
            a50.c.c0 c0Var = (a50.c.c0) cVar;
            r53.m1 m1Var3 = new r53.m1(this.f188720g.a(c0Var.f1257a, c0Var.f1258b, c0Var.f1259c), new p0(this, null));
            x53.c cVar8 = o53.s0.f129406a;
            r53.s.C(r53.s.A(m1Var3, x53.b.f189152a), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar instanceof a50.c.a) {
            List<GeoPointDTO> list4 = ((a50.c.a) cVar).f1251a;
            if (list4 == null || list4.isEmpty()) {
                return;
            }
            a50.g gVar8 = (a50.g) p2Var.getValue();
            com.garmin.android.library.mapsdkadapter.i.d dVar5 = this.Y;
            c30.a aVar6 = this.f188727m;
            aVar6.getClass();
            gVar8.getClass();
            dVar5.getClass();
            r53.u uVar4 = new r53.u(new r53.m1(new r53.v(new r(this, null), new r53.c2(new c30.d(aVar6, gVar8, dVar5, list4, null))), new s(this, null)), new t(this, null));
            x53.c cVar9 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar4, x53.b.f189152a), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar instanceof a50.c.e0) {
            a50.c.e0 e0Var = (a50.c.e0) cVar;
            com.garmin.android.library.mapsdkadapter.e eVar18 = e0Var.f1267a;
            List<fn0.c> list5 = e0Var.f1268b;
            c2 c2Var3 = this.H0;
            if (c2Var3 != null) {
                c2Var3.c(null);
            }
            r53.m1 m1Var4 = new r53.m1(this.f188721h.a(eVar18, list5), new m0(this, null));
            x53.c cVar10 = o53.s0.f129406a;
            this.H0 = r53.s.C(r53.s.g(r53.s.A(m1Var4, x53.b.f189152a)), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar instanceof a50.c.o0) {
            this.Y = ((a50.c.o0) cVar).f1295a;
            return;
        }
        if (cVar.equals(a50.c.a0.f1252a)) {
            if (((a50.g) p2Var.getValue()).f1399j > 0) {
                Bundle bundle = new Bundle(2);
                bundle.putString("Screen", "Courses");
                bundle.putInt("NumberOfTimes", ((a50.g) p2Var.getValue()).f1399j);
                ht.a.f85464a.getClass();
                ht.a.a(bundle, "ExploreClimbsDuringCourseCreation");
                dVar = null;
                p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), false, null, false, null, false, null, null, null, 0, false, false, false, false, null, null, 65023));
            } else {
                dVar = null;
            }
            a50.g gVar9 = (a50.g) p2Var.getValue();
            c30.t0 t0Var = this.A;
            t0Var.getClass();
            gVar9.getClass();
            r53.u uVar5 = new r53.u(new r53.m1(new r53.v(new f1(this, dVar), new r53.c2(new c30.s0(gVar9, t0Var, dVar))), new g1(this, dVar)), new h1(this, dVar));
            x53.c cVar11 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar5, x53.b.f189152a), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar instanceof a50.c.p0) {
            p2Var.k(null, a50.g.a(z4((a50.g) p2Var.getValue()), false, null, false, null, false, null, ((a50.c.p0) cVar).f1297a, null, 0, false, false, false, false, null, null, 65407));
            return;
        }
        if (cVar instanceof a50.c.r0) {
            p2Var.k(null, a50.g.a(z4((a50.g) p2Var.getValue()), false, null, false, null, false, null, null, null, 0, false, ((a50.c.r0) cVar).f1301a, false, false, null, null, 63487));
            return;
        }
        if (cVar instanceof a50.c.q0) {
            p2Var.k(null, a50.g.a(z4((a50.g) p2Var.getValue()), false, null, false, null, false, null, null, null, 0, false, false, ((a50.c.q0) cVar).f1299a, false, null, null, 61439));
            return;
        }
        if (cVar instanceof a50.c.s0) {
            p2Var.k(null, a50.g.a(z4((a50.g) p2Var.getValue()), false, null, false, null, false, null, null, null, 0, false, false, false, ((a50.c.s0) cVar).f1303a, null, null, 57343));
            return;
        }
        if (cVar.equals(a50.c.q.f1298a)) {
            List<com.garmin.android.library.mapsdkadapter.f> listD2 = ((a50.g) p2Var.getValue()).d();
            if (listD2.isEmpty()) {
                return;
            }
            ht.a.f85464a.getClass();
            ht.a.a(null, "P2PCoursePointsListOpen");
            c30.j0 j0Var = this.f188735w;
            j0Var.getClass();
            r53.u uVar6 = new r53.u(new r53.m1(new r53.v(new t0(this, null), new r53.c2(new c30.i0(listD2, j0Var, null))), new u0(this, listD2, null)), new v0(this, null));
            x53.c cVar12 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar6, x53.b.f189152a), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar instanceof a50.c.m0) {
            List<com.garmin.android.library.mapsdkadapter.f> list6 = ((a50.c.m0) cVar).f1291a;
            if (list6.isEmpty() || list6.equals(((a50.g) p2Var.getValue()).d())) {
                return;
            }
            a50.g gVar10 = (a50.g) p2Var.getValue();
            com.garmin.android.library.mapsdkadapter.i.d dVar6 = this.Y;
            c30.c1 c1Var = this.f188736x;
            c1Var.getClass();
            gVar10.getClass();
            dVar6.getClass();
            r53.u uVar7 = new r53.u(new r53.m1(new r53.v(new u1(this, null), new r53.c2(new c30.f1(c1Var, gVar10, dVar6, list6, null))), new v1(this, null)), new w1(this, null));
            x53.c cVar13 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar7, x53.b.f189152a), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar instanceof a50.c.l0) {
            a50.c.l0 l0Var = (a50.c.l0) cVar;
            com.garmin.android.library.mapsdkadapter.f fVar8 = l0Var.f1288a;
            B4(fVar8, new a83.a((Object) this, fVar8, l0Var.f1289b, 15));
            return;
        }
        if (cVar instanceof a50.c.n0) {
            String str2 = ((a50.c.n0) cVar).f1293a;
            w20.a aVar7 = ((a50.g) p2Var.getValue()).f1393d;
            if (aVar7 == null || (eVar9 = aVar7.f181476a) == null) {
                return;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar19 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar9);
            eVar19.courseName = str2;
            a50.g gVar11 = (a50.g) p2Var.getValue();
            w20.a aVar8 = ((a50.g) p2Var.getValue()).f1393d;
            p2Var.k(null, a50.g.a(gVar11, false, null, false, aVar8 != null ? w20.a.b(aVar8, eVar19, null, null, null, null, 62) : null, false, null, null, null, 0, false, false, false, false, null, null, 65511));
            return;
        }
        if (cVar instanceof a50.c.j0) {
            boolean z16 = ((a50.c.j0) cVar).f1283a;
            w20.a aVar9 = ((a50.g) p2Var.getValue()).f1393d;
            if (aVar9 == null || (eVar8 = aVar9.f181476a) == null) {
                return;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar20 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar8);
            eVar20.z0(z16);
            a50.g gVar12 = (a50.g) p2Var.getValue();
            w20.a aVar10 = ((a50.g) p2Var.getValue()).f1393d;
            p2Var.k(null, a50.g.a(gVar12, false, null, false, aVar10 != null ? w20.a.b(aVar10, eVar20, null, null, null, null, 62) : null, false, null, null, null, 0, false, false, false, false, null, null, 65511));
            return;
        }
        if (cVar instanceof a50.c.t0) {
            a50.c.t0 t0Var2 = (a50.c.t0) cVar;
            double d26 = t0Var2.f1305a;
            double d27 = t0Var2.f1306b;
            w20.a aVar11 = ((a50.g) p2Var.getValue()).f1393d;
            if (aVar11 == null || (eVar7 = aVar11.f181476a) == null) {
                return;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar21 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar7);
            eVar21.C0(Double.valueOf(d26));
            eVar21.elapsedSeconds = Double.valueOf(d27);
            a50.g gVar13 = (a50.g) p2Var.getValue();
            w20.a aVar12 = ((a50.g) p2Var.getValue()).f1393d;
            p2Var.k(null, a50.g.a(gVar13, false, null, false, aVar12 != null ? w20.a.b(aVar12, eVar21, null, null, null, null, 62) : null, false, null, null, null, 0, false, false, false, false, null, null, 65511));
            return;
        }
        if (cVar instanceof a50.c.k0) {
            com.garmin.android.apps.connectmobile.courses.model.i iVar = ((a50.c.k0) cVar).f1285a;
            w20.a aVar13 = ((a50.g) p2Var.getValue()).f1393d;
            if (aVar13 == null) {
                return;
            }
            z20.e0 e0Var2 = this.f188738z;
            e0Var2.getClass();
            r53.u uVar8 = new r53.u(new r53.m1(new r53.v(new o1(this, null), new r53.c2(new z20.d0(aVar13, iVar, e0Var2, null))), new p1(this, null)), new q1(this, null));
            x53.c cVar14 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar8, x53.b.f189152a), androidx.lifecycle.v1.a(this));
            return;
        }
        if (cVar instanceof a50.c.e) {
            long j8 = ((a50.c.e) cVar).f1266a;
            w20.a aVar14 = ((a50.g) p2Var.getValue()).f1393d;
            if (aVar14 == null || (eVar5 = aVar14.f181476a) == null || (listJ = eVar5.j()) == null) {
                return;
            }
            Iterator it4 = listJ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                Long coursePointId = ((com.garmin.android.apps.connectmobile.courses.model.g) next).getCoursePointId();
                if (coursePointId != null && coursePointId.longValue() == j8) {
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.courses.model.g gVar14 = (com.garmin.android.apps.connectmobile.courses.model.g) next;
            if (gVar14 == null) {
                return;
            }
            a50.g gVar15 = (a50.g) p2Var.getValue();
            this.f188734v.getClass();
            gVar15.getClass();
            w20.a aVar15 = gVar15.f1393d;
            if (aVar15 != null && (eVar6 = aVar15.f181476a) != null) {
                ArrayList arrayListD2 = p13.h0.d1(gVar15.b());
                d30.a.a(gVar14, arrayListD2);
                com.garmin.android.apps.connectmobile.courses.model.e eVar22 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar6);
                eVar22.d(gVar14);
                a50.a aVarE4 = gVar15.e();
                gVarA2 = aVarE4 != null ? a50.g.a(gVar15, false, null, false, w20.a.b(gVar15.f1393d, eVar22, null, null, null, null, 62), false, p13.h0.D0(gVar15.f1396g, a50.a.a(aVarE4, arrayListD2, eVar22.j(), false, 109)), null, null, 0, false, false, false, false, null, null, 65463) : gVar15;
            }
            p2Var.k(null, gVarA2);
            return;
        }
        if (cVar instanceof a50.c.f) {
            a50.c.f fVar9 = (a50.c.f) cVar;
            com.garmin.android.apps.connectmobile.courses.model.g gVar16 = fVar9.f1269a;
            com.garmin.android.apps.connectmobile.courses.model.g gVar17 = fVar9.f1270b;
            boolean z17 = fVar9.f1271c;
            a50.g gVar18 = (a50.g) p2Var.getValue();
            com.garmin.android.library.mapsdkadapter.i.d dVar7 = this.Y;
            this.f188733t.getClass();
            gVar18.getClass();
            dVar7.getClass();
            w20.a aVar16 = gVar18.f1393d;
            if (aVar16 == null || (eVar4 = aVar16.f181476a) == null) {
                gVarA = gVar18;
            } else {
                ArrayList arrayListD3 = p13.h0.d1(gVar18.b());
                com.garmin.android.apps.connectmobile.courses.model.e eVar23 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar4);
                d30.a.a(gVar16, arrayListD3);
                eVar23.d(gVar16);
                d30.a.b(gVar17, arrayListD3, dVar7);
                eVar23.b(gVar17);
                a50.a aVarE5 = gVar18.e();
                if (aVarE5 != null) {
                    a50.a aVarA = a50.a.a(aVarE5, arrayListD3, eVar23.j(), false, 109);
                    List<a50.a> list7 = gVar18.f1396g;
                    gVarA = a50.g.a(gVar18, false, null, false, w20.a.b(gVar18.f1393d, eVar23, null, null, null, null, 62), false, z17 ? p13.h0.D0(list7, aVarA) : p13.h0.D0(p13.h0.V(1, list7), aVarA), null, null, 0, false, false, false, false, null, null, 65463);
                } else {
                    gVarA = gVar18;
                }
            }
            p2Var.k(null, gVarA);
            return;
        }
        if (cVar instanceof a50.c.u) {
            a50.c.u uVar9 = (a50.c.u) cVar;
            com.garmin.android.apps.connectmobile.courses.model.g gVar19 = uVar9.f1307a;
            GeoPointDTO geoPointDTO4 = uVar9.f1308b;
            w20.a aVar17 = ((a50.g) p2Var.getValue()).f1393d;
            List<GeoPointDTO> list8 = (aVar17 == null || (eVar3 = aVar17.f181476a) == null) ? null : eVar3.geoPoints;
            if (list8 == null || list8.isEmpty()) {
                return;
            }
            new s20.m();
            ArrayList arrayListE = s20.m.e(list8, geoPointDTO4);
            if (arrayListE.size() > 1) {
                D4(new a50.e.p0(arrayListE, gVar19));
                return;
            } else {
                if (arrayListE.isEmpty()) {
                    return;
                }
                K4(gVar19, (GeoPointDTO) p13.h0.b0(arrayListE));
                return;
            }
        }
        if (cVar instanceof a50.c.i0) {
            a50.c.i0 i0Var = (a50.c.i0) cVar;
            K4(i0Var.f1280a, i0Var.f1281b);
            return;
        }
        if (cVar instanceof a50.c.h0) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar24 = ((a50.c.h0) cVar).f1278a;
            a50.a aVarE6 = ((a50.g) p2Var.getValue()).e();
            if (aVarE6 != null) {
                a50.a aVarA2 = a50.a.a(aVarE6, null, eVar24.j(), false, 111);
                c30.d0 d0Var2 = this.f188717d;
                d0Var2.getClass();
                r53.u uVar10 = new r53.u(new r53.m1(new r53.v(new l1(this, null), new r53.c2(new c30.c0(d0Var2, eVar24, null))), new m1(this, aVarA2, null)), new n1(this, null));
                x53.c cVar15 = o53.s0.f129406a;
                r53.s.C(r53.s.A(uVar10, x53.b.f189152a), androidx.lifecycle.v1.a(this));
                return;
            }
            return;
        }
        if (!(cVar instanceof a50.c.h)) {
            if (cVar instanceof a50.c.g) {
                n50.c cVar16 = ((a50.c.g) cVar).f1275a;
                if (cVar16 instanceof n50.c.b) {
                    y4(((n50.c.b) cVar16).f123741a);
                    return;
                }
                return;
            }
            return;
        }
        n50.f fVar10 = ((a50.c.h) cVar).f1277a;
        if (!(fVar10 instanceof n50.f.C2321f)) {
            if (fVar10 instanceof n50.f.g) {
                p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), false, null, false, null, false, null, null, null, 0, ((n50.f.g) fVar10).f123753a, false, false, false, null, null, 64511));
                return;
            } else if (fVar10 instanceof n50.f.h) {
                M4(((n50.f.h) fVar10).f123754a);
                return;
            } else {
                if (fVar10 instanceof n50.f.i) {
                    J4(((n50.f.i) fVar10).f123755a);
                    return;
                }
                return;
            }
        }
        boolean z18 = ((n50.f.C2321f) fVar10).f123752a;
        a50.g gVar20 = (a50.g) p2Var.getValue();
        c30.u0 u0Var = this.E;
        u0Var.getClass();
        gVar20.getClass();
        List listD0 = gVar20.f1396g;
        a50.a aVarE7 = gVar20.e();
        a50.a aVarA3 = aVarE7 != null ? a50.a.a(aVarE7, null, null, z18, 95) : null;
        boolean z19 = (z18 || (aVar2 = gVar20.f1393d) == null || (eVar2 = aVar2.f181476a) == null || !eVar2.M()) ? false : true;
        c30.g gVar21 = u0Var.f24039a;
        if (aVarA3 != null) {
            listD0 = z19 ? p13.h0.D0(p13.h0.V(1, listD0), aVarA3) : p13.h0.D0(listD0, aVarA3);
        }
        a50.g gVarA4 = gVar21.a(a50.g.a(gVar20, false, null, false, null, false, listD0, null, null, 0, false, false, false, false, null, null, 65471));
        a50.a aVarE8 = gVarA4.e();
        if ((aVarE8 != null ? aVarE8.f1245f : false) && ((aVar = gVarA4.f1393d) == null || (eVar = aVar.f181476a) == null || !eVar.G())) {
            gVarA4 = gVar20;
        }
        p2Var.k(null, gVarA4);
    }

    public final void H4(int i14) {
        D4(new a50.e.g0(i14));
    }

    public final void I4(boolean z14) {
        p2 p2Var = this.F;
        p2Var.k(null, a50.g.a((a50.g) p2Var.getValue(), false, null, z14, null, false, null, null, null, 0, false, false, false, false, null, null, 65531));
    }

    public final void J4(String str) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        p2 p2Var = this.F;
        w20.a aVar = ((a50.g) p2Var.getValue()).f1393d;
        if (aVar == null || (eVar = aVar.f181476a) == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
        eVar2.courseName = str;
        if (((a50.g) p2Var.getValue()).f1395f) {
            a50.g gVar = (a50.g) p2Var.getValue();
            w20.a aVar2 = ((a50.g) p2Var.getValue()).f1393d;
            p2Var.k(null, a50.g.a(gVar, false, null, false, aVar2 != null ? w20.a.b(aVar2, eVar2, null, null, null, null, 62) : null, false, null, null, null, 0, false, false, false, false, null, null, 65511));
        } else {
            boolean z14 = !p005kotlin.jvm.internal.s.g(str, eVar.courseName);
            a50.g gVar2 = (a50.g) p2Var.getValue();
            w20.a aVar3 = ((a50.g) p2Var.getValue()).f1393d;
            p2Var.k(null, a50.g.a(gVar2, false, null, false, aVar3 != null ? w20.a.b(aVar3, eVar2, null, null, null, null, 62) : null, z14, null, null, null, 0, false, false, false, false, null, null, 65479));
        }
    }

    public final void K4(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
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
        D4(new a50.e.y0(gVar2));
    }

    public final void L4(a50.g gVar) {
        this.F.setValue(gVar);
        if (((a50.g) this.I.f150540a.getValue()).f1395f) {
            return;
        }
        D4(a50.e.z0.f1384a);
    }

    public final void M4(boolean z14) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        p2 p2Var = this.F;
        w20.a aVar = ((a50.g) p2Var.getValue()).f1393d;
        if (aVar == null || (eVar = aVar.f181476a) == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
        eVar2.w0(Boolean.valueOf(!z14));
        a50.g gVar = (a50.g) p2Var.getValue();
        w20.a aVar2 = ((a50.g) p2Var.getValue()).f1393d;
        p2Var.k(null, a50.g.a(gVar, false, null, false, aVar2 != null ? w20.a.b(aVar2, eVar2, null, null, null, null, 62) : null, false, null, null, null, 0, false, false, false, false, null, null, 65511));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2, reason: from getter */
    public final b2 getD() {
        return this.X;
    }

    public final void x4(com.garmin.android.library.mapsdkadapter.f fVar, Integer num, long j8) {
        boolean z14;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        p2 p2Var = this.F;
        List<GeoPointDTO> list = null;
        if (((a50.g) p2Var.getValue()).d().isEmpty()) {
            a50.g gVar = (a50.g) p2Var.getValue();
            this.f188722i.getClass();
            gVar.getClass();
            fVar.getClass();
            List listC = p13.w.c(fVar);
            p13.j0 j0Var = p13.j0.f134944a;
            p2Var.k(null, a50.g.a(gVar, false, null, false, null, false, p13.h0.D0(gVar.f1396g, new a50.a(listC, j0Var, j0Var, j8, j0Var, false, null)), null, null, 0, false, false, false, false, null, null, 65471));
            return;
        }
        if (j8 == -1) {
            w20.a aVar = ((a50.g) p2Var.getValue()).f1393d;
            if (aVar != null && (eVar = aVar.f181476a) != null) {
                list = eVar.geoPoints;
            }
            if (list == null || list.isEmpty()) {
                z14 = false;
            } else {
                LatLng latLng = fVar.f50283a;
                GeoPointDTO geoPointDTO = new GeoPointDTO(latLng.latitude, latLng.longitude);
                new s20.m();
                z14 = !s20.m.e(list, geoPointDTO).isEmpty();
            }
            if (z14) {
                D4(new a50.e.j0(fVar, num));
                return;
            }
        }
        E4(fVar, num, j8);
    }

    public final void y4(r30.a aVar) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.F;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a50.g.a((a50.g) value, false, null, false, null, false, null, null, null, 0, false, false, false, false, null, aVar, 32767)));
        if (aVar == r30.a.CLIMBS) {
            Bundle bundle = new Bundle(2);
            bundle.putString("Screen", "Courses");
            bundle.putString("Action", "On");
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "ToggleClimbsOnCourse");
        }
    }
}
