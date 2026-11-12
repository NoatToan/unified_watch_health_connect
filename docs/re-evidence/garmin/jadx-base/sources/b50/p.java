package b50;

import android.os.Bundle;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
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
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BÁ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lb50/p;", "Landroidx/lifecycle/u1;", "Ll40/b;", "", "courseId", "", "isCyclingCourse", "supportsPacePro", "isReadOnlyMode", "isDeepLinkCourse", "Le30/h;", "getCourseDetailsUseCase", "Lz20/p;", "getOnCourseFeaturesUseCase", "Le30/p;", "getCoursePowerGuideUseCase", "Le30/l;", "getCoursePaceProStrategiesUseCase", "Le30/j;", "getCourseLinkedEventsUseCase", "Le30/t;", "getFavoriteCoursesUseCase", "Le30/z;", "sendCourseToDeviceUseCase", "Le30/x;", "repositionCourseUseCase", "Le30/r;", "getCourseSegmentsUseCase", "Le30/v;", "publishCourseUseCase", "Lz20/h;", "deleteCourseUseCase", "Lz20/j;", "duplicateCourseUseCase", "Lz20/y;", "toggleFavoriteStateUseCase", "Le30/b0;", "sendPaceProToDeviceUseCase", "Le30/d0;", "sendPowerGuideToDeviceUseCase", "Le30/d;", "deletePowerGuideUseCase", "Le30/b;", "deleteCoursePointUseCase", "Le30/f;", "editCoursePointUseCase", "<init>", "(Ljava/lang/String;ZZZZLe30/h;Lz20/p;Le30/p;Le30/l;Le30/j;Le30/t;Le30/z;Le30/x;Le30/r;Le30/v;Lz20/h;Lz20/j;Lz20/y;Le30/b0;Le30/d0;Le30/d;Le30/b;Le30/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 implements l40.b {
    public final e2 A;
    public final a2 B;
    public final p2 C;
    public final b2 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e30.h f16023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z20.p f16024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e30.p f16025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e30.l f16026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e30.j f16027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e30.t f16028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e30.z f16029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e30.x f16030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e30.r f16031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e30.v f16032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z20.h f16033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z20.j f16034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z20.y f16035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e30.b0 f16036r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e30.d0 f16037t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e30.d f16038v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e30.b f16039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e30.f f16040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p2 f16041y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b2 f16042z;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16043a;

        static {
            int[] iArr = new int[com.garmin.android.library.mapsdkadapter.i.d.values().length];
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.BAIDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.GOOGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16043a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$emitEffect$1", f = "CourseDetailsViewModel.kt", l = {783}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16044a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e50.b f16046c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e50.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f16046c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new b(this.f16046c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f16044a;
            if (i14 == 0) {
                o13.r.b(obj);
                e2 e2Var = p.this.A;
                this.f16044a = 1;
                if (e2Var.emit(this.f16046c, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetails", "Lk30/u;", "onCourseFeatures", "Le50/d;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;Lk30/u;)Le50/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$refreshCourseData$1", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.q<com.garmin.android.apps.connectmobile.courses.model.e, k30.u, t13.d<? super e50.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f16047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ k30.u f16048b;

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(com.garmin.android.apps.connectmobile.courses.model.e eVar, k30.u uVar, t13.d<? super e50.d> dVar) {
            c cVar = p.this.new c(dVar);
            cVar.f16047a = eVar;
            cVar.f16048b = uVar;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            w20.a aVar;
            ArrayList arrayList;
            List<fn0.b> listD;
            com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f16047a;
            k30.u uVar = this.f16048b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p pVar = p.this;
            if (eVar != null) {
                List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
                if (uVar == null || (listD = uVar.d()) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(p13.y.r(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(p.y4(pVar, (fn0.b) it.next()));
                    }
                    arrayList = arrayList2;
                }
                aVar = new w20.a(eVar, listB, arrayList, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null);
            } else {
                aVar = null;
            }
            return e50.d.a((e50.d) pVar.f16041y.getValue(), false, null, false, aVar, null, null, null, p.x4(pVar, eVar != null ? eVar.D() : null, (com.garmin.android.library.mapsdkadapter.i.d) pVar.C.getValue()), !pVar.f16022d, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), null, null, 3190);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Le50/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$refreshCourseData$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<r53.j<? super e50.d>, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super e50.d> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = p.this.f16041y;
            p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), true, null, false, null, null, null, null, false, false, false, null, null, 4094));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le50/d;", "value", "", "<anonymous>", "(Le50/d;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$refreshCourseData$3", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<e50.d, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16051a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = p.this.new e(dVar);
            eVar.f16051a = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(e50.d dVar, t13.d<? super Unit> dVar2) {
            return ((e) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e50.d dVar = (e50.d) this.f16051a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p pVar = p.this;
            pVar.f16041y.setValue(dVar);
            if (!dVar.f62989a && dVar.f62992d == null) {
                pVar.z4(e50.b.v.f62973a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw20/e;", "data", "", "<anonymous>", "(Lw20/e;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$refreshPowerGuideData$1", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<w20.e, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16053a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = p.this.new f(dVar);
            fVar.f16053a = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(w20.e eVar, t13.d<? super Unit> dVar) {
            return ((f) create(eVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            w20.e eVar = (w20.e) this.f16053a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = p.this.f16041y;
            p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), false, null, false, null, null, null, eVar, false, false, false, null, null, 4031));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements r53.i<l40.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f16055a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f16056a;

            /* JADX INFO: renamed from: b50.p$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$special$$inlined$map$1$2", f = "CourseDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0225a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f16057a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f16058b;

                public C0225a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f16057a = obj;
                    this.f16058b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f16056a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0225a c0225a;
                if (dVar instanceof C0225a) {
                    c0225a = (C0225a) dVar;
                    int i14 = c0225a.f16058b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0225a.f16058b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0225a = new C0225a(dVar);
                    }
                } else {
                    c0225a = new C0225a(dVar);
                }
                Object obj2 = c0225a.f16057a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0225a.f16058b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    l40.d dVar2 = ((e50.d) obj).f62999k;
                    c0225a.f16058b = 1;
                    if (this.f16056a.emit(dVar2, c0225a) == aVar) {
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

        public g(r53.i iVar) {
            this.f16055a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super l40.d> jVar, t13.d dVar) {
            Object objCollect = this.f16055a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$toggleFavoriteState$1", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<r53.j<? super v2<? extends Unit>>, t13.d<? super Unit>, Object> {
        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new h(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
            return ((h) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = p.this.f16041y;
            p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), true, null, false, null, null, null, null, false, false, false, null, null, 4094));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$toggleFavoriteState$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<v2<? extends Unit>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16061a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f16063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e50.g f16064d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z14, e50.g gVar, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f16063c = z14;
            this.f16064d = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            i iVar = p.this.new i(this.f16063c, this.f16064d, dVar);
            iVar.f16061a = obj;
            return iVar;
        }

        @Override // e23.p
        public final Object invoke(v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
            return ((i) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            v2 v2Var = (v2) this.f16061a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z14 = v2Var instanceof v2.b;
            p pVar = p.this;
            if (z14) {
                p2 p2Var = pVar.f16041y;
                p2 p2Var2 = pVar.f16041y;
                w20.a aVar2 = ((e50.d) p2Var.getValue()).f62992d;
                com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar2 != null ? aVar2.f181476a : null;
                boolean z15 = this.f16063c;
                if (eVar != null) {
                    com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
                    eVar2.isFavorite = !z15;
                    e50.d dVar = (e50.d) p2Var2.getValue();
                    w20.a aVar3 = ((e50.d) p2Var2.getValue()).f62992d;
                    p2Var2.k(null, e50.d.a(dVar, false, null, false, aVar3 != null ? w20.a.b(aVar3, eVar2, null, null, null, null, 62) : null, null, null, null, false, false, false, null, null, 4087));
                }
                pVar.z4(new e50.b.b0(!z15));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                pVar.z4(new e50.b.s(this.f16064d));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "it", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$toggleFavoriteState$3", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.q<r53.j<? super v2<? extends Unit>>, Throwable, t13.d<? super Unit>, Object> {
        public j(t13.d<? super j> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return p.this.new j(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = p.this.f16041y;
            p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), false, null, false, null, null, null, null, false, false, false, null, null, 4094));
            return Unit.INSTANCE;
        }
    }

    public p(String str, boolean z14, boolean z15, boolean z16, boolean z17, e30.h hVar, z20.p pVar, e30.p pVar2, e30.l lVar, e30.j jVar, e30.t tVar, e30.z zVar, e30.x xVar, e30.r rVar, e30.v vVar, z20.h hVar2, z20.j jVar2, z20.y yVar, e30.b0 b0Var, e30.d0 d0Var, e30.d dVar, e30.b bVar, e30.f fVar) {
        hVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        lVar.getClass();
        jVar.getClass();
        tVar.getClass();
        zVar.getClass();
        xVar.getClass();
        rVar.getClass();
        vVar.getClass();
        hVar2.getClass();
        jVar2.getClass();
        yVar.getClass();
        b0Var.getClass();
        d0Var.getClass();
        dVar.getClass();
        bVar.getClass();
        fVar.getClass();
        this.f16019a = str;
        this.f16020b = z14;
        this.f16021c = z15;
        this.f16022d = z16;
        this.f16023e = hVar;
        this.f16024f = pVar;
        this.f16025g = pVar2;
        this.f16026h = lVar;
        this.f16027i = jVar;
        this.f16028j = tVar;
        this.f16029k = zVar;
        this.f16030l = xVar;
        this.f16031m = rVar;
        this.f16032n = vVar;
        this.f16033o = hVar2;
        this.f16034p = jVar2;
        this.f16035q = yVar;
        this.f16036r = b0Var;
        this.f16037t = d0Var;
        this.f16038v = dVar;
        this.f16039w = bVar;
        this.f16040x = fVar;
        p2 p2VarA = q2.a(new e50.d(false, null, false, null, null, null, null, false, false, false, null, null, 4095, null));
        this.f16041y = p2VarA;
        b2 b2VarD = r53.s.d(p2VarA);
        this.f16042z = b2VarD;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.A = e2VarB;
        this.B = r53.s.c(e2VarB);
        this.C = q2.a(((qw0.s) KoinJavaComponent.get$default(qw0.s.class, null, null, 6, null)).v());
        g gVar = new g(b2VarD);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.D = r53.s.K(gVar, aVarA, k2.a.f150705b, ((e50.d) b2VarD.f150540a.getValue()).f62999k);
        r53.s.C(new m1(r53.s.s(new t(b2VarD)), new u(this, null)), v1.a(this));
        C4(new o(z17, this, 0));
    }

    public static final boolean x4(p pVar, GeoPointDTO geoPointDTO, com.garmin.android.library.mapsdkadapter.i.d dVar) {
        pVar.getClass();
        if (dVar == null || geoPointDTO == null) {
            return false;
        }
        Double d14 = geoPointDTO.latitude;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        Double d15 = geoPointDTO.longitude;
        LatLng latLng = new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d);
        int i14 = a.f16043a[dVar.ordinal()];
        if (i14 == 1) {
            return com.garmin.android.library.mapsdkadapter.m.f(latLng) || com.garmin.android.library.mapsdkadapter.m.g(latLng);
        }
        if (i14 != 2) {
            return false;
        }
        return com.garmin.android.library.mapsdkadapter.m.f(latLng);
    }

    public static final fn0.a y4(p pVar, fn0.b bVar) {
        pVar.getClass();
        return new fn0.a(bVar.getTypeKey(), bVar.getGeohash(), lb2.b.a(bVar.getLat()), lb2.b.a(bVar.getLon()), bVar.getLastReportedDateTime(), bVar.getConfirmCount());
    }

    public final void A4(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        gVar.getClass();
        z4(new e50.b.h(gVar));
    }

    public final void B4(e50.a aVar) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        Object next;
        r30.a aVar2;
        Long l14;
        aVar.getClass();
        boolean z14 = aVar instanceof e50.a.b0;
        p2 p2Var = this.f16041y;
        List<GeoPointDTO> list = null;
        if (z14) {
            long j8 = ((e50.a.b0) aVar).f62909a;
            w20.a aVar3 = ((e50.d) p2Var.getValue()).f62992d;
            com.garmin.android.apps.connectmobile.courses.model.e eVar4 = aVar3 != null ? aVar3.f181476a : null;
            String strValueOf = String.valueOf(j8);
            e30.z zVar = this.f16029k;
            zVar.getClass();
            strValueOf.getClass();
            c2 c2Var = new c2(new e30.y(eVar4, zVar, strValueOf, null));
            x53.c cVar = o53.s0.f129406a;
            r53.s.C(new r53.u(new m1(new r53.v(new b1(this, null), r53.s.A(c2Var, x53.b.f189152a)), new c1(this, j8, null)), new d1(this, null)), v1.a(this));
            return;
        }
        boolean zEquals = aVar.equals(e50.a.d.f62913a);
        String str = this.f16019a;
        if (zEquals) {
            r53.s.C(new r53.u(new m1(new r53.v(new v(this, null), this.f16033o.a(str)), new w(this, null)), new x(this, null)), v1.a(this));
            return;
        }
        if (aVar instanceof e50.a.g) {
            String str2 = ((e50.a.g) aVar).f62920a;
            z20.j jVar = this.f16034p;
            jVar.getClass();
            c2 c2Var2 = new c2(new z20.i(str, jVar, str2, null));
            x53.c cVar2 = o53.s0.f129406a;
            r53.s.C(new r53.u(new m1(new r53.v(new e0(this, null), r53.s.A(c2Var2, x53.b.f189152a)), new f0(this, null)), new g0(this, null)), v1.a(this));
            return;
        }
        if (aVar.equals(e50.a.f0.f62919a)) {
            H4();
            return;
        }
        if (aVar.equals(e50.a.y.f62945a)) {
            e30.v vVar = this.f16032n;
            vVar.getClass();
            c2 c2Var3 = new c2(new e30.u(str, vVar, null));
            x53.c cVar3 = o53.s0.f129406a;
            r53.s.C(new r53.u(new m1(new r53.v(new q0(this, null), r53.s.A(c2Var3, x53.b.f189152a)), new r0(this, null)), new s0(this, null)), v1.a(this));
            return;
        }
        if (aVar instanceof e50.a.c0) {
            e50.a.c0 c0Var = (e50.a.c0) aVar;
            long j14 = c0Var.f62911a;
            long j15 = c0Var.f62912b;
            e30.b0 b0Var = this.f16036r;
            b0Var.getClass();
            c2 c2Var4 = new c2(new e30.a0(b0Var, j14, j15, null));
            x53.c cVar4 = o53.s0.f129406a;
            r53.s.C(new r53.u(new m1(new r53.v(new e1(this, null), r53.s.A(c2Var4, x53.b.f189152a)), new f1(this, j15, null)), new g1(this, null)), v1.a(this));
            return;
        }
        if (aVar instanceof e50.a.d0) {
            e50.a.d0 d0Var = (e50.a.d0) aVar;
            long j16 = d0Var.f62914a;
            long j17 = d0Var.f62915b;
            e30.d0 d0Var2 = this.f16037t;
            d0Var2.getClass();
            c2 c2Var5 = new c2(new e30.c0(d0Var2, j16, j17, null));
            x53.c cVar5 = o53.s0.f129406a;
            r53.s.C(new r53.u(new m1(new r53.v(new h1(this, null), r53.s.A(c2Var5, x53.b.f189152a)), new i1(this, j17, null)), new j1(this, null)), v1.a(this));
            return;
        }
        if (aVar instanceof e50.a.f) {
            w20.e eVar5 = ((e50.d) p2Var.getValue()).f62995g;
            if (eVar5 == null || (l14 = eVar5.f181494a.f2568a) == null) {
                return;
            }
            long jLongValue = l14.longValue();
            e30.d dVar = this.f16038v;
            dVar.getClass();
            c2 c2Var6 = new c2(new e30.c(dVar, jLongValue, null));
            x53.c cVar6 = o53.s0.f129406a;
            r53.s.C(new r53.u(new m1(new r53.v(new b0(this, null), r53.s.A(c2Var6, x53.b.f189152a)), new c0(this, null)), new d0(this, null)), v1.a(this));
            return;
        }
        if (aVar instanceof e50.a.i0) {
            w01.c cVar7 = ((e50.a.i0) aVar).f62927a;
            e50.d dVar2 = (e50.d) p2Var.getValue();
            w20.e eVar6 = ((e50.d) p2Var.getValue()).f62995g;
            p2Var.k(null, e50.d.a(dVar2, false, null, false, null, null, null, eVar6 != null ? new w20.e(eVar6.f181494a, cVar7) : null, false, false, false, null, null, 4031));
            return;
        }
        boolean zEquals2 = aVar.equals(e50.a.h.f62922a);
        e30.r rVar = this.f16031m;
        if (zEquals2) {
            rVar.getClass();
            c2 c2Var7 = new c2(new e30.q(str, rVar, null));
            x53.c cVar8 = o53.s0.f129406a;
            r53.s.C(new r53.u(new m1(new r53.v(new n0(this, null), r53.s.A(c2Var7, x53.b.f189152a)), new o0(this, null)), new p0(this, null)), v1.a(this));
            return;
        }
        if (aVar.equals(e50.a.m.f62931a)) {
            rVar.getClass();
            c2 c2Var8 = new c2(new e30.q(str, rVar, null));
            x53.c cVar9 = o53.s0.f129406a;
            r53.s.C(new r53.u(new m1(new r53.v(new k0(this, null), r53.s.A(c2Var8, x53.b.f189152a)), new l0(this, null)), new m0(this, null)), v1.a(this));
            return;
        }
        if (aVar instanceof e50.a.w) {
            r30.a aVar4 = ((e50.a.w) aVar).f62942a;
            while (true) {
                Object value = p2Var.getValue();
                aVar2 = aVar4;
                if (p2Var.b(value, e50.d.a((e50.d) value, false, null, false, null, null, null, null, false, false, false, null, aVar2, 2047))) {
                    break;
                } else {
                    aVar4 = aVar2;
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
        if (aVar.equals(e50.a.z.f62946a)) {
            w20.a aVar5 = ((e50.d) p2Var.getValue()).f62992d;
            com.garmin.android.apps.connectmobile.courses.model.e eVar7 = aVar5 != null ? aVar5.f181476a : null;
            e30.x xVar = this.f16030l;
            xVar.getClass();
            c2 c2Var9 = new c2(new e30.w(eVar7, xVar, null));
            x53.c cVar10 = o53.s0.f129406a;
            r53.s.C(new r53.u(new m1(new r53.v(new y0(this, null), r53.s.A(c2Var9, x53.b.f189152a)), new z0(this, null)), new a1(this, null)), v1.a(this));
            return;
        }
        if (aVar instanceof e50.a.g0) {
            p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), false, null, false, null, null, null, null, false, false, ((e50.a.g0) aVar).f62921a, null, null, 3583));
            return;
        }
        if (aVar instanceof e50.a.e) {
            long j18 = ((e50.a.e) aVar).f62916a;
            w20.a aVar6 = ((e50.d) p2Var.getValue()).f62992d;
            if (aVar6 == null || (eVar3 = aVar6.f181476a) == null || (listJ = eVar3.j()) == null) {
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
                if (coursePointId != null && coursePointId.longValue() == j18) {
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) next;
            if (gVar == null) {
                return;
            }
            e30.b bVar = this.f16039w;
            bVar.getClass();
            r53.u uVar = new r53.u(new m1(new r53.v(new y(this, null), new c2(new e30.a(eVar3, bVar, gVar, null))), new z(this, null)), new a0(this, null));
            x53.c cVar11 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(this));
            return;
        }
        if (aVar instanceof e50.a.i) {
            e50.a.i iVar = (e50.a.i) aVar;
            com.garmin.android.apps.connectmobile.courses.model.g gVar2 = iVar.f62925a;
            com.garmin.android.apps.connectmobile.courses.model.g gVar3 = iVar.f62926b;
            w20.a aVar7 = ((e50.d) p2Var.getValue()).f62992d;
            if (aVar7 == null || (eVar2 = aVar7.f181476a) == null) {
                return;
            }
            e30.f fVar = this.f16040x;
            fVar.getClass();
            r53.u uVar2 = new r53.u(new m1(new r53.v(new h0(this, null), new c2(new e30.e(eVar2, fVar, gVar3, gVar2, null))), new i0(this, null)), new j0(this, null));
            x53.c cVar12 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar2, x53.b.f189152a), v1.a(this));
            return;
        }
        if (!(aVar instanceof e50.a.x)) {
            if (aVar instanceof e50.a.h0) {
                e50.a.h0 h0Var = (e50.a.h0) aVar;
                I4(h0Var.f62923a, h0Var.f62924b);
                return;
            }
            return;
        }
        e50.a.x xVar2 = (e50.a.x) aVar;
        com.garmin.android.apps.connectmobile.courses.model.g gVar4 = xVar2.f62943a;
        GeoPointDTO geoPointDTO = xVar2.f62944b;
        w20.a aVar8 = ((e50.d) p2Var.getValue()).f62992d;
        if (aVar8 != null && (eVar = aVar8.f181476a) != null) {
            list = eVar.geoPoints;
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        new s20.m();
        ArrayList arrayListE = s20.m.e(list, geoPointDTO);
        if (arrayListE.size() > 1) {
            z4(new e50.b.x(arrayListE, gVar4));
        } else {
            if (arrayListE.isEmpty()) {
                return;
            }
            I4(gVar4, (GeoPointDTO) p13.h0.b0(arrayListE));
        }
    }

    public final void C4(o oVar) {
        e30.h hVar = this.f16023e;
        hVar.getClass();
        String str = this.f16019a;
        c2 c2Var = new c2(new e30.g(hVar, str, null));
        z20.p pVar = this.f16024f;
        pVar.getClass();
        boolean z14 = this.f16020b;
        c2 c2Var2 = new c2(new z20.o(pVar, str, z14, null));
        e30.p pVar2 = this.f16025g;
        pVar2.getClass();
        c2 c2Var3 = new c2(new e30.o(pVar2, str, z14, null));
        e30.l lVar = this.f16026h;
        lVar.getClass();
        c2 c2Var4 = new c2(new e30.k(str, this.f16021c, lVar, null));
        e30.j jVar = this.f16027i;
        jVar.getClass();
        r53.u uVar = new r53.u(new m1(new r53.v(new u0(this, null), r53.s.n(c2Var, c2Var2, c2Var3, c2Var4, new c2(new e30.i(jVar, str, null)), new t0(this, null))), new v0(this, null)), new w0(oVar, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(this));
    }

    public final void D4() {
        e30.h hVar = this.f16023e;
        hVar.getClass();
        String str = this.f16019a;
        c2 c2Var = new c2(new e30.g(hVar, str, null));
        z20.p pVar = this.f16024f;
        pVar.getClass();
        m1 m1Var = new m1(new r53.v(new d(null), new r53.u1(c2Var, new c2(new z20.o(pVar, str, this.f16020b, null)), new c(null))), new e(null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(r53.s.A(m1Var, x53.b.f189152a), v1.a(this));
    }

    public final void E4() {
        e30.p pVar = this.f16025g;
        pVar.getClass();
        m1 m1Var = new m1(new c2(new e30.o(pVar, this.f16019a, this.f16020b, null)), new f(null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(r53.s.A(m1Var, x53.b.f189152a), v1.a(this));
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        p2 p2Var;
        Object value;
        e50.d dVar;
        l40.d dVar2;
        do {
            p2Var = this.f16041y;
            value = p2Var.getValue();
            dVar = (e50.d) value;
            l40.c cVar = l40.c.f109891a;
            dVar2 = dVar.f62999k;
            cVar.getClass();
        } while (!p2Var.b(value, e50.d.a(dVar, false, null, false, null, null, null, null, false, false, false, l40.c.a(dVar2, aVar), null, 3071)));
    }

    public final void F4(boolean z14) {
        z4(new e50.b.p(z14));
    }

    public final void G4(boolean z14) {
        p2 p2Var = this.f16041y;
        p2Var.k(null, e50.d.a((e50.d) p2Var.getValue(), false, null, z14, null, null, null, null, false, false, false, null, null, 4091));
    }

    public final void H4() {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        w20.a aVar = ((e50.d) this.f16041y.getValue()).f62992d;
        boolean z14 = false;
        if (aVar != null && (eVar = aVar.f181476a) != null && eVar.isFavorite) {
            z14 = true;
        }
        r53.s.C(new r53.u(new m1(new r53.v(new h(null), this.f16035q.a(this.f16019a, z14)), new i(z14, z14 ? e50.g.OPERATION_UNFAVORITE_COURSE : e50.g.OPERATION_FAVORITE_COURSE, null)), new j(null)), v1.a(this));
    }

    public final void I4(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
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
        z4(new e50.b.d0(gVar2));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2, reason: from getter */
    public final b2 getA() {
        return this.D;
    }

    public final void z4(e50.b bVar) {
        ge1.b.T(v1.a(this), null, null, new b(bVar, null), 3);
    }
}
