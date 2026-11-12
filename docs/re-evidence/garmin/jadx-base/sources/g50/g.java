package g50;

import am.x0;
import am.z0;
import android.os.Bundle;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.l3;
import c80.d0;
import c80.w0;
import c80.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import d53.t;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.o;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import r53.a2;
import r53.b2;
import r53.c2;
import r53.e2;
import r53.g2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import r53.u;
import r53.v;
import z20.y;
import zd0.g1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lg50/g;", "Landroidx/lifecycle/u1;", "Li50/b;", "config", "Ls20/g;", "coursesDataService", "Ls20/h;", "coursesDelegate", "Lf30/a;", "getCoursesWithEventsUseCase", "Lz20/y;", "toggleFavoriteStateUseCase", "Lz20/h;", "deleteCourseUseCase", "Lzd0/g1;", "promosProvider", "<init>", "(Li50/b;Ls20/g;Ls20/h;Lf30/a;Lz20/y;Lz20/h;Lzd0/g1;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i50.b f75895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s20.g f75896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s20.h f75897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f30.a f75898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f75899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z20.h f75900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g1 f75901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f75902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f75903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f75904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e2 f75905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a2 f75906l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesViewModel$emitEffect$1", f = "CoursesViewModel.kt", l = {513}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75907a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i50.c f75909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i50.c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f75909c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new a(this.f75909c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75907a;
            if (i14 == 0) {
                r.b(obj);
                e2 e2Var = g.this.f75905k;
                this.f75907a = 1;
                if (e2Var.emit(this.f75909c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\"\u0012\u001e\u0012\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "Lfg0/k;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesViewModel$fetchData$1", f = "CoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<r53.j<? super o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f75911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f75911b = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new b(this.f75911b, dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>>> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            i50.h hVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p2 p2Var = g.this.f75903i;
            do {
                value = p2Var.getValue();
                hVar = (i50.h) value;
            } while (!p2Var.b(value, this.f75911b ? i50.h.a(hVar, null, false, true, false, null, null, null, false, null, 0, false, 16335) : i50.h.a(hVar, null, true, false, false, null, null, null, false, null, 0, false, 16343)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052 \u0010\u0004\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "Lfg0/k;", "response", "", "<anonymous>", "(Lo13/p;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesViewModel$fetchData$2", f = "CoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f75912a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = g.this.new c(dVar);
            cVar.f75912a = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>> pVar, t13.d<? super Unit> dVar) {
            return ((c) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z14;
            Object value2;
            i50.h hVar;
            x0 x0Var;
            o13.p pVar = (o13.p) this.f75912a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            List list = pVar != null ? (List) pVar.f128594a : null;
            g gVar = g.this;
            if (list != null) {
                g.x4(gVar, list);
                i50.b bVar = gVar.f75895a;
                if (bVar.a() || (x0Var = bVar.f91701h) == null || !bVar.d()) {
                    z14 = false;
                } else if (z0.h0(x0Var)) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (z0.h0(((com.garmin.android.apps.connectmobile.courses.model.d) it.next()).C())) {
                                    z14 = false;
                                }
                            }
                        }
                    }
                    z14 = true;
                } else if (z0.g0(x0Var)) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (z0.g0(((com.garmin.android.apps.connectmobile.courses.model.d) it3.next()).C())) {
                                    z14 = false;
                                }
                            }
                        }
                    }
                    z14 = true;
                } else if (x0Var == x0.f4320q) {
                    if (!list.isEmpty()) {
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (((com.garmin.android.apps.connectmobile.courses.model.d) it4.next()).C() == x0.f4320q) {
                                    z14 = false;
                                }
                            }
                        }
                    }
                    z14 = true;
                } else {
                    if (x0Var == x0.f4346x && !list.isEmpty()) {
                        Iterator it5 = list.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (((com.garmin.android.apps.connectmobile.courses.model.d) it5.next()).C() == x0.f4346x) {
                                    z14 = false;
                                }
                            }
                        }
                    }
                    z14 = true;
                }
                p2 p2Var = gVar.f75903i;
                do {
                    value2 = p2Var.getValue();
                    hVar = (i50.h) value2;
                } while (!p2Var.b(value2, i50.h.a(hVar, null, false, false, false, list, (List) pVar.f128595b, null, z14, null, hVar.f91774m + 1, false, 11039)));
            } else {
                p2 p2Var2 = gVar.f75903i;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, i50.h.a((i50.h) value, null, false, false, true, j0.f134944a, null, null, false, null, 0, false, 16287)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\"\u0012\u001e\u0012\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lr53/j;", "Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "Lfg0/k;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesViewModel$fetchData$3", f = "CoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements q<r53.j<? super o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>>>, Throwable, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return g.this.new d(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p2 p2Var = g.this.f75903i;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, i50.h.a((i50.h) value, null, false, false, false, null, null, null, false, null, 0, false, 16359)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesViewModel$toggleFavorite$1", f = "CoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<v2<? extends Unit>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f75915a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.d f75917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f75918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f75919e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.garmin.android.apps.connectmobile.courses.model.d dVar, boolean z14, int i14, t13.d<? super e> dVar2) {
            super(2, dVar2);
            this.f75917c = dVar;
            this.f75918d = z14;
            this.f75919e = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = g.this.new e(this.f75917c, this.f75918d, this.f75919e, dVar);
            eVar.f75915a = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
            return ((e) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            v2 v2Var = (v2) this.f75915a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (v2Var instanceof v2.a) {
                com.garmin.android.apps.connectmobile.courses.model.d dVar = this.f75917c;
                boolean z14 = this.f75918d;
                g gVar = g.this;
                gVar.D4(dVar, z14);
                gVar.y4(i50.c.l.a(this.f75919e));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x0242  */
    /* JADX WARN: Multi-variable type inference failed */
    public g(i50.b bVar, s20.g gVar, s20.h hVar, f30.a aVar, y yVar, z20.h hVar2, g1 g1Var) {
        o13.p pVar;
        o13.p pVarC;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
        Object next;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar;
        Double value;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF2;
        Object next2;
        List listK;
        double dDoubleValue;
        double dDoubleValue2;
        y0 y0Var;
        Object value2;
        Object next3;
        d0 d0Var;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF3;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF4;
        bVar.getClass();
        x0 x0Var = bVar.f91701h;
        int i14 = bVar.f91703j;
        gVar.getClass();
        hVar.getClass();
        aVar.getClass();
        yVar.getClass();
        hVar2.getClass();
        g1Var.getClass();
        this.f75895a = bVar;
        this.f75896b = gVar;
        this.f75897c = hVar;
        this.f75898d = aVar;
        this.f75899e = yVar;
        this.f75900f = hVar2;
        this.f75901g = g1Var;
        this.f75902h = h0.d1(bVar.f91706m);
        int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        boolean zK = hVar.k();
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = bVar.f91704k;
        boolean z14 = (fVar == null || (listF4 = fVar.f()) == null || listF4.isEmpty()) ? false : true;
        if (bVar.b()) {
            pVar = new o13.p(Double.valueOf(1500.0d), Double.valueOf(241500.0d));
        } else if (bVar.c()) {
            pVar = new o13.p(Double.valueOf(15000.0d), Double.valueOf(402500.0d));
        } else {
            o13.p pVarC2 = i14 != -1 ? c22.b2.c(i14) : null;
            if (bVar.f91696c) {
                if (!z14) {
                    pVarC = c22.b2.c(i14);
                } else if (x0Var != null) {
                    if (z0.g0(x0Var)) {
                        if (fVar == null || (listF2 = fVar.f()) == null) {
                            kVar = null;
                        } else {
                            Iterator<T> it = listF2.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != m52.c.CYCLING);
                            kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                        }
                    } else if (!z0.h0(x0Var) || fVar == null || (listF = fVar.f()) == null) {
                        kVar = null;
                    } else {
                        Iterator<T> it3 = listF.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next).getEventLegActivityType() != m52.c.RUNNING);
                        kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                    }
                    double dDoubleValue3 = (kVar == null || (value = kVar.getValue()) == null) ? 0.0d : value.doubleValue();
                    s20.d dVar = s20.d.f156005a;
                    gg0.i unit = kVar != null ? kVar.getUnit() : null;
                    dVar.getClass();
                    pVarC = c22.b2.c(k52.g.a(dDoubleValue3, s20.d.b(unit).d()));
                } else {
                    pVarC = null;
                }
                pVar = pVarC;
            } else {
                pVar = pVarC2;
            }
        }
        boolean zB = bVar.b();
        boolean zC = bVar.c();
        int i15 = j30.j.f96863a;
        com.garmin.android.apps.connectmobile.courses.model.i iVar = com.garmin.android.apps.connectmobile.courses.model.i.ROAD_CYCLING;
        o oVar = new o(iVar, true);
        com.garmin.android.apps.connectmobile.courses.model.i iVar2 = com.garmin.android.apps.connectmobile.courses.model.i.MOUNTAIN_BIKING;
        o oVar2 = new o(iVar2, true);
        com.garmin.android.apps.connectmobile.courses.model.i iVar3 = com.garmin.android.apps.connectmobile.courses.model.i.GRAVEL_CYCLING;
        o oVar3 = new o(iVar3, true);
        com.garmin.android.apps.connectmobile.courses.model.i iVar4 = com.garmin.android.apps.connectmobile.courses.model.i.RUNNING;
        o oVar4 = new o(iVar4, true);
        com.garmin.android.apps.connectmobile.courses.model.i iVar5 = com.garmin.android.apps.connectmobile.courses.model.i.TRAIL_RUNNING;
        o oVar5 = new o(iVar5, true);
        o oVar6 = new o(com.garmin.android.apps.connectmobile.courses.model.i.OBSTACLE_COURSE_RACING, true);
        com.garmin.android.apps.connectmobile.courses.model.i iVar6 = com.garmin.android.apps.connectmobile.courses.model.i.HIKING;
        o oVar7 = new o(iVar6, true);
        com.garmin.android.apps.connectmobile.courses.model.i iVar7 = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
        k30.n nVar = new k30.n(k30.m.COURSE_DATE, i53.a.a(oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, new o(iVar7, true)), 0.0d, Double.MAX_VALUE);
        if (zB) {
            listK = x.k(new o(iVar4, true), new o(iVar5, true));
        } else if (zC) {
            listK = x.k(new o(iVar, true), new o(iVar2, true), new o(iVar3, true));
        } else {
            i53.c<o> cVar = nVar.f102576b;
            if (x0Var != null) {
                if (z0.h0(x0Var)) {
                    listK = x.k(new o(iVar4, true), new o(iVar5, true));
                } else if (z0.g0(x0Var)) {
                    listK = x.k(new o(iVar, true), new o(iVar2, true), new o(iVar3, true));
                } else if (x0Var == x0.f4320q) {
                    listK = w.c(new o(iVar6, true));
                } else if (x0Var == x0.f4346x) {
                    listK = w.c(new o(iVar7, true));
                } else {
                    listK = cVar;
                }
            } else if (zK) {
                listK = cVar;
            } else {
                listK = x.k(new o(iVar, true), new o(iVar2, true), new o(iVar3, true), new o(iVar4, true), new o(iVar5, true), new o(iVar6, true), new o(iVar7, true));
            }
        }
        i53.f fVarJ = i53.a.j(listK);
        if (pVar != null) {
            dDoubleValue = ((Number) pVar.f128594a).doubleValue();
            dDoubleValue2 = ((Number) pVar.f128595b).doubleValue();
        } else {
            dDoubleValue = nVar.f102577c;
            dDoubleValue2 = nVar.f102578d;
        }
        k30.n nVar2 = new k30.n(nVar.f102575a, fVarJ, dDoubleValue, dDoubleValue2);
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVar2 = this.f75895a.f91704k;
        p2 p2VarA = q2.a(new i50.h(bVar, userProfilePk, nVar2, false, false, false, null, null, null, (fVar2 == null || (listF3 = fVar2.f()) == null || listF3.isEmpty()) ? false : true, false, this.f75895a.f91704k, 0, false, 13816, null));
        this.f75903i = p2VarA;
        this.f75904j = s.d(p2VarA);
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f75905k = e2VarB;
        this.f75906l = s.c(e2VarB);
        g1 g1Var2 = this.f75901g;
        List<y0> listG = g1Var2.g();
        if (listG != null) {
            Iterator<T> it4 = listG.iterator();
            do {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                } else {
                    next3 = it4.next();
                    w0 w0Var = ((y0) next3).f25649m;
                    d0Var = w0Var instanceof d0 ? (d0) w0Var : null;
                }
            } while ((d0Var != null ? d0Var.f25324b : null) != d0.b.COURSES);
            y0Var = (y0) next3;
        } else {
            y0Var = null;
        }
        if (y0Var != null) {
            String str = y0Var.f25637a;
            p2 p2Var = this.f75903i;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, i50.h.a((i50.h) value2, null, false, false, false, null, null, null, false, null, 0, true, 8191)));
            g1Var2.p(str);
        }
    }

    public static final void x4(g gVar, List list) {
        String str;
        ArrayList<ab1.g> arrayList = gVar.f75902h;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) it.next();
            for (ab1.g gVar2 : arrayList) {
                Long l14 = gVar2.f2570c;
                Long l15 = gVar2.f2568a;
                if (l14 != null && l15 != null && (str = dVar.courseId) != null) {
                    long jLongValue = l14.longValue();
                    Long lJ = t.j(str);
                    if (lJ != null && jLongValue == lJ.longValue()) {
                        dVar.powerGuideId = l15.longValue();
                    }
                }
            }
        }
    }

    public final void A4(boolean z14) {
        f30.a aVar = this.f75898d;
        aVar.getClass();
        i50.b bVar = this.f75895a;
        bVar.getClass();
        u uVar = new u(new m1(new v(new b(z14, null), new c2(new f30.b(aVar, bVar, null))), new c(null)), new d(null));
        x53.c cVar = s0.f129406a;
        s.C(s.A(uVar, x53.b.f189152a), v1.a(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0145, code lost:
    
        if (r4 <= r10) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B4(i50.a aVar) {
        Object value;
        Object value2;
        i50.h hVar;
        ArrayList arrayList;
        o13.p pVar;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar;
        Object next;
        Double value3;
        Object next2;
        Object value4;
        aVar.getClass();
        boolean z14 = false;
        if (aVar.equals(i50.a.l.f91683a)) {
            A4(false);
            return;
        }
        if (aVar.equals(i50.a.k.f91682a)) {
            A4(true);
            return;
        }
        boolean z15 = aVar instanceof i50.a.q;
        p2 p2Var = this.f75903i;
        if (z15) {
            i50.i iVar = ((i50.a.q) aVar).f91689a;
            do {
                value4 = p2Var.getValue();
            } while (!p2Var.b(value4, i50.h.a((i50.h) value4, null, false, false, false, null, null, iVar, false, null, 0, false, 16127)));
            return;
        }
        boolean z16 = aVar instanceof i50.a.f;
        i50.b bVar = this.f75895a;
        Object obj = null;
        if (z16) {
            com.garmin.android.apps.connectmobile.courses.model.d dVar = ((i50.a.f) aVar).f91677a;
            long j8 = dVar.powerGuideId;
            if (j8 != 0) {
                String str = dVar.courseId;
                if (str != null) {
                    y4(new i50.c.o(str, j8));
                    return;
                }
                return;
            }
            if (bVar.b()) {
                y4(new i50.c.g(dVar));
                return;
            }
            if (bVar.c()) {
                String str2 = dVar.courseId;
                if (str2 != null) {
                    y4(new i50.c.e(str2));
                    return;
                }
                return;
            }
            if (!bVar.f91695b) {
                y4(new i50.c.b(dVar));
                return;
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = ((i50.h) p2Var.getValue()).f91773l;
            if (((i50.h) p2Var.getValue()).f91771j) {
                if (fVar != null) {
                    if (z0.g0(dVar.C())) {
                        Iterator<T> it = fVar.f().iterator();
                        do {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                        } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != m52.c.CYCLING);
                        kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                    } else if (z0.h0(dVar.C())) {
                        Iterator<T> it3 = fVar.f().iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next).getEventLegActivityType() != m52.c.RUNNING);
                        kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                    } else {
                        kVar = null;
                    }
                    double dDoubleValue = (kVar == null || (value3 = kVar.getValue()) == null) ? 0.0d : value3.doubleValue();
                    s20.d dVar2 = s20.d.f156005a;
                    gg0.i unit = kVar != null ? kVar.getUnit() : null;
                    dVar2.getClass();
                    double dA = k52.g.a(dDoubleValue, s20.d.b(unit).d());
                    o13.p pVarC = c22.b2.c(dVar.distanceInMeters);
                    double dDoubleValue2 = ((Number) pVarC.f128594a).doubleValue();
                    double dDoubleValue3 = ((Number) pVarC.f128595b).doubleValue();
                    if (dDoubleValue2 <= dA) {
                    }
                }
                y4(new i50.c.j(dVar));
                return;
            }
            F4(fVar, dVar, false);
            ht.a aVar2 = ht.a.f85464a;
            Bundle bundle = new Bundle();
            aVar2.getClass();
            ht.a.a(bundle, "CreateEventCourseSelected");
            C4(dVar);
            return;
        }
        if (aVar instanceof i50.a.e) {
            com.garmin.android.apps.connectmobile.courses.model.d dVar3 = ((i50.a.e) aVar).f91676a;
            if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk() == dVar3.userProfileId) {
                com.garmin.android.apps.connectmobile.courses.model.i.a aVar3 = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
                x0 x0VarC = dVar3.C();
                aVar3.getClass();
                com.garmin.android.apps.connectmobile.courses.model.i iVarA = com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC);
                boolean zA = this.f75897c.a();
                boolean zE = sa1.h.e(dVar3.distanceInMeters);
                List<fg0.k> list = ((i50.h) p2Var.getValue()).f91769h;
                if (list == null || !list.isEmpty()) {
                    for (fg0.k kVar2 : list) {
                        if (kVar2.getCourseId() != null && String.valueOf(kVar2.getCourseId()).equals(dVar3.courseId)) {
                            z14 = true;
                            break;
                        }
                    }
                }
                if (iVarA.c() && zA && !zE && z14) {
                    pVar = new o13.p(Integer.valueOf(R.string.ti_msg_course_confirm_delete), Integer.valueOf(R.string.power_guide_title));
                } else if (iVarA == com.garmin.android.apps.connectmobile.courses.model.i.RUNNING || iVarA == com.garmin.android.apps.connectmobile.courses.model.i.TRAIL_RUNNING) {
                    pVar = new o13.p(Integer.valueOf(R.string.lbl_pacepro_delete_course_message), null);
                } else {
                    pVar = (iVarA.c() && zA) ? new o13.p(Integer.valueOf(R.string.power_guide_delete_course_msg), null) : new o13.p(Integer.valueOf(R.string.msg_course_confirm_delete), null);
                }
                y4(new i50.c.k(dVar3, ((Number) pVar.f128594a).intValue(), (Integer) pVar.f128595b));
                return;
            }
            return;
        }
        if (aVar instanceof i50.a.b) {
            com.garmin.android.apps.connectmobile.courses.model.d dVar4 = ((i50.a.b) aVar).f91672a;
            String str3 = dVar4.courseId;
            if (str3 == null) {
                return;
            }
            do {
                value2 = p2Var.getValue();
                hVar = (i50.h) value2;
                List<com.garmin.android.apps.connectmobile.courses.model.d> list2 = hVar.f91768g;
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.d) obj2).courseId, dVar4.courseId)) {
                        arrayList.add(obj2);
                    }
                }
            } while (!p2Var.b(value2, i50.h.a(hVar, null, false, false, false, arrayList, null, null, false, null, hVar.f91774m + 1, false, 12223)));
            m1 m1Var = new m1(this.f75900f.a(str3), new f(this, dVar4, null));
            x53.c cVar = s0.f129406a;
            s.C(s.A(m1Var, x53.b.f189152a), v1.a(this));
            return;
        }
        if (aVar instanceof i50.a.r) {
            i50.a.r rVar = (i50.a.r) aVar;
            com.garmin.android.apps.connectmobile.courses.model.d dVar5 = rVar.f91690a;
            i50.i iVar2 = rVar.f91691b;
            if (!dVar5.isFavorite) {
                E4(dVar5);
                return;
            }
            z14 = ((long) ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()) == dVar5.userProfileId;
            if (iVar2 != i50.i.FAVORITES || z14) {
                E4(dVar5);
                return;
            } else {
                y4(new i50.c.p(dVar5, iVar2));
                return;
            }
        }
        if (aVar instanceof i50.a.d) {
            com.garmin.android.apps.connectmobile.courses.model.d dVar6 = ((i50.a.d) aVar).f91674a;
            if (dVar6.isFavorite) {
                E4(dVar6);
                return;
            }
            return;
        }
        if (!(aVar instanceof i50.a.p)) {
            if (aVar.equals(i50.a.g.f91678a)) {
                y4(bVar.d() ? i50.c.d.f91710a : i50.c.C1753c.f91709a);
                return;
            }
            if (aVar.equals(i50.a.n.f91686a)) {
                y4(new i50.c.i(z4()));
                return;
            }
            if (aVar.equals(i50.a.o.f91687a)) {
                if (bVar.f91695b) {
                    ht.a aVar4 = ht.a.f85464a;
                    Bundle bundle2 = new Bundle();
                    aVar4.getClass();
                    ht.a.a(bundle2, "CreateEventAddCourseLater");
                }
                y4(new i50.c.a(null));
                return;
            }
            if (aVar.equals(i50.a.i.f91680a)) {
                y4(new i50.c.a(null));
                return;
            }
            if (aVar instanceof i50.a.m) {
                i50.a.m mVar = (i50.a.m) aVar;
                y4(new i50.c.h(mVar.f91684a, mVar.f91685b));
                return;
            }
            if (aVar instanceof i50.a.s) {
                i50.a.s sVar = (i50.a.s) aVar;
                y4(new i50.c.f(sVar.f91692a, sVar.f91693b));
                return;
            }
            if (aVar instanceof i50.a.C1752a) {
                com.garmin.android.apps.connectmobile.courses.model.d dVar7 = ((i50.a.C1752a) aVar).f91671a;
                F4(((i50.h) p2Var.getValue()).f91773l, dVar7, true);
                ht.a aVar5 = ht.a.f85464a;
                Bundle bundle3 = new Bundle();
                aVar5.getClass();
                ht.a.a(bundle3, "CreateEventCourseSelected");
                C4(dVar7);
                return;
            }
            if (aVar instanceof i50.a.c) {
                String str4 = ((i50.a.c) aVar).f91673a.courseId;
                if (str4 == null) {
                    return;
                }
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, i50.h.a((i50.h) value, null, true, false, false, null, null, null, false, null, 0, false, 16375)));
                this.f75896b.c(str4, new h(this));
                return;
            }
            if (aVar.equals(i50.a.h.f91679a)) {
                A4(false);
                return;
            }
            if (!(aVar instanceof i50.a.j)) {
                u0.r();
                return;
            }
            long j14 = ((i50.a.j) aVar).f91681a;
            ArrayList arrayList2 = this.f75902h;
            for (Object obj3 : arrayList2) {
                Long l14 = ((ab1.g) obj3).f2568a;
                if (l14 != null && l14.longValue() == j14) {
                    obj = obj3;
                    break;
                }
            }
            ab1.g gVar = (ab1.g) obj;
            if (gVar != null) {
                arrayList2.remove(gVar);
                A4(false);
                return;
            }
            return;
        }
        k30.n nVar = ((i50.a.p) aVar).f91688a;
        while (true) {
            Object value5 = p2Var.getValue();
            k30.n nVar2 = nVar;
            if (p2Var.b(value5, i50.h.a((i50.h) value5, nVar, false, false, false, null, null, null, false, null, 0, false, 16379))) {
                return;
            } else {
                nVar = nVar2;
            }
        }
    }

    public final void C4(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        if (!this.f75895a.f91699f || dVar.F()) {
            y4(new i50.c.a(dVar));
        } else {
            y4(new i50.c.n(dVar));
        }
    }

    public final void D4(com.garmin.android.apps.connectmobile.courses.model.d dVar, boolean z14) {
        p2 p2Var;
        Object value;
        i50.h hVar;
        dVar.isFavorite = z14;
        do {
            p2Var = this.f75903i;
            value = p2Var.getValue();
            hVar = (i50.h) value;
        } while (!p2Var.b(value, i50.h.a(hVar, null, false, false, false, null, null, null, false, null, hVar.f91774m + 1, false, 12287)));
    }

    public final void E4(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        boolean z14 = dVar.isFavorite;
        boolean z15 = !z14;
        int i14 = !z14 ? R.string.msg_course_favorite_fail : R.string.msg_course_unfavorite_fail;
        D4(dVar, z15);
        m1 m1Var = new m1(this.f75899e.a(dVar.courseId, z14), new e(dVar, z14, i14, null));
        x53.c cVar = s0.f129406a;
        s.C(s.A(m1Var, x53.b.f189152a), v1.a(this));
    }

    public final void F4(com.garmin.android.apps.connectmobile.workouts.data.model.f fVar, com.garmin.android.apps.connectmobile.courses.model.d dVar, boolean z14) {
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar;
        Object next;
        p2 p2Var;
        Object value;
        bg0.a.c cVar;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVarB;
        Object next2;
        if ((fVar != null ? fVar.f() : null) != null) {
            fVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (z0.g0(dVar.C())) {
                Iterator<T> it = fVar.f().iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != m52.c.CYCLING);
                kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
            } else if (z0.h0(dVar.C())) {
                Iterator<T> it3 = fVar.f().iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next).getEventLegActivityType() != m52.c.RUNNING);
                kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
            } else {
                kVar = null;
            }
            for (com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 : fVar.f()) {
                if ((kVar != null ? kVar.getEventLegActivityType() : null) == kVar2.getEventLegActivityType()) {
                    Double value2 = kVar2.getValue();
                    double dDoubleValue = value2 != null ? value2.doubleValue() : 0.0d;
                    s20.d dVar2 = s20.d.f156005a;
                    gg0.i unit = kVar2.getUnit();
                    dVar2.getClass();
                    double dA = k52.g.a(dDoubleValue, s20.d.b(unit).d());
                    double d14 = dVar.distanceInMeters;
                    boolean z15 = dA == d14;
                    if (z14 || !z15) {
                        bg0.a.f17827a.getClass();
                        if (bg0.a.C0255a.e()) {
                            l3.f23124b.getClass();
                            double dPow = (long) Math.pow(10.0d, 2);
                            cVar = new bg0.a.c(Double.valueOf(((double) MathKt.b((d14 / 1000.0d) * dPow)) / dPow), bg0.a.b.KILOMETER);
                        } else {
                            l3.f23124b.getClass();
                            double dPow2 = (long) Math.pow(10.0d, 2);
                            cVar = new bg0.a.c(Double.valueOf(((double) MathKt.b((d14 / 1609.344d) * dPow2)) / dPow2), bg0.a.b.MILE);
                        }
                        String str = dVar.courseId;
                        Integer numI = str != null ? t.i(str) : null;
                        Number number = cVar.f17834a;
                        Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
                        gg0.i.f77162b.getClass();
                        kVarB = com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar2, numI, gg0.i.a.a(cVar.f17835b), dValueOf, 22);
                    } else {
                        String str2 = dVar.courseId;
                        kVarB = com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar2, str2 != null ? t.i(str2) : null, null, null, 62);
                    }
                    arrayList.add(kVarB);
                } else {
                    arrayList.add(kVar2);
                }
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVarB = com.garmin.android.apps.connectmobile.workouts.data.model.f.b(fVar, arrayList);
            do {
                p2Var = this.f75903i;
                value = p2Var.getValue();
            } while (!p2Var.b(value, i50.h.a((i50.h) value, null, false, false, false, null, null, null, false, fVarB, 0, false, 14335)));
        }
    }

    public final void y4(i50.c cVar) {
        ge1.b.T(v1.a(this), null, null, new a(cVar, null), 3);
    }

    public final ArrayList z4() {
        List<com.garmin.android.apps.connectmobile.courses.model.d> list = ((i50.h) this.f75903i.getValue()).f91768g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.garmin.android.apps.connectmobile.courses.model.d) obj).isFavorite) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((com.garmin.android.apps.connectmobile.courses.model.d) it.next()).courseId;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }
}
