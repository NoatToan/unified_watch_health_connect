package com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports;

import am.x0;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.r;
import en0.n;
import j23.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import l52.o;
import l52.u;
import l52.y;
import lc.u0;
import m52.k;
import o13.p;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/r;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends r {
    public static final l C;
    public static final l D;
    public static final l E;
    public final y0<g3> A;
    public final y0 B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WorkoutDetailsDTO f49138r = new WorkoutDetailsDTO();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap<k, Double> f49139t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f49140v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0<h> f49141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0<g> f49142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0<p<Boolean, WorkoutDetailsDTO>> f49143y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f49144z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportViewModel$createWorkout$1", f = "MultiSportViewModel.kt", l = {562}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49145a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WorkoutDetailsDTO f49147c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportViewModel$createWorkout$1$1", f = "MultiSportViewModel.kt", l = {564}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f49148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f49149b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkoutDetailsDTO f49150c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f49149b = cVar;
                this.f49150c = workoutDetailsDTO;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f49149b, this.f49150c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f49148a;
                c cVar = this.f49149b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    cVar.A.j(g3.a.c(g3.f35298f));
                    y yVar = cVar.f49274a;
                    this.f49148a = 1;
                    obj = yVar.v(this.f49150c, this);
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
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    cVar.A.j(g3.a.e(g3.f35298f));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    cVar.A.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47385c, null, null, null, 14));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f49147c = workoutDetailsDTO;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(this.f49147c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49145a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(c.this, this.f49147c, null);
                this.f49145a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportViewModel$updateWorkout$1", f = "MultiSportViewModel.kt", l = {545}, m = "invokeSuspend", v = 2)
    public static final class C0963c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49151a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WorkoutDetailsDTO f49153c;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportViewModel$updateWorkout$1$1", f = "MultiSportViewModel.kt", l = {547}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f49154a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f49155b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WorkoutDetailsDTO f49156c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f49155b = cVar;
                this.f49156c = workoutDetailsDTO;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f49155b, this.f49156c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f49154a;
                c cVar = this.f49155b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    cVar.A.j(g3.a.c(g3.f35298f));
                    y yVar = cVar.f49274a;
                    this.f49154a = 1;
                    obj = yVar.N(this.f49156c, this);
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
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    cVar.A.j(g3.a.e(g3.f35298f));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    cVar.A.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47385c, null, null, null, 10));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0963c(WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super C0963c> dVar) {
            super(2, dVar);
            this.f49153c = workoutDetailsDTO;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C0963c(this.f49153c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0963c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49151a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(c.this, this.f49153c, null);
                this.f49151a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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

    static {
        new a(null);
        C = new l(0, 1);
        D = new l(20, 24);
        E = new l(225, 249);
    }

    public c() {
        HashMap<k, Double> map = new HashMap<>();
        this.f49139t = map;
        this.f49140v = (y) KoinJavaComponent.get$default(y.class, null, null, 6, null);
        this.f49141w = new y0<>();
        this.f49142x = new y0<>();
        this.f49143y = new y0<>();
        this.f49144z = new LinkedHashMap();
        y0<g3> y0Var = new y0<>();
        this.A = y0Var;
        this.B = y0Var;
        k kVar = k.f116758r;
        Double dValueOf = Double.valueOf(0.0d);
        map.put(kVar, dValueOf);
        map.put(k.f116754n, dValueOf);
        map.put(k.f116755o, dValueOf);
        ge1.b.T(v1.a(this), null, null, new d(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object W4(c cVar, x0 x0Var, boolean z14, v13.c cVar2) {
        g62.y yVar;
        cVar.getClass();
        if (cVar2 instanceof g62.y) {
            yVar = (g62.y) cVar2;
            int i14 = yVar.f76123c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f76123c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new g62.y(cVar, cVar2);
            }
        } else {
            yVar = new g62.y(cVar, cVar2);
        }
        Object objK = yVar.f76121a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f76123c;
        if (i15 == 0) {
            o13.r.b(objK);
            y yVar2 = cVar.f49140v;
            yVar.f76123c = 1;
            objK = yVar2.k(x0Var, z14, yVar);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        v2 v2Var = (v2) objK;
        if (v2Var instanceof v2.b) {
            return (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        u0.r();
        return null;
    }

    public static void Y4(c cVar, WorkoutDetailsDTO workoutDetailsDTO, boolean z14, boolean z15, int i14) {
        if ((i14 & 2) != 0) {
            z14 = false;
        }
        if ((i14 & 4) != 0) {
            z15 = false;
        }
        if (cVar.h5(workoutDetailsDTO, z14, z15)) {
            WorkoutDetailsDTO workoutDetailsDTO2 = cVar.f49138r;
            List<h0> list = workoutDetailsDTO.Q0;
            workoutDetailsDTO2.getClass();
            list.getClass();
            workoutDetailsDTO2.Q0 = list;
        }
        for (h0 h0Var : cVar.f49138r.Q0) {
            if (h0Var.f48193h == k.f116758r) {
                o.a(h0Var.t(), l52.h.PRE_ORDER, new n(cVar, 24));
            }
            cVar.e5(h0Var);
        }
        cVar.d5();
        cVar.f49143y.j(new p<>(Boolean.FALSE, cVar.f49138r));
    }

    public static h0 Z4() {
        k0 k0Var = k0.f49020a;
        k kVar = k.f116754n;
        k0Var.getClass();
        k0.a aVarA = k0.a(kVar, 25.0d, r.f49273q, true);
        h0 h0Var = new h0(0, null, null, null, null, null, null, null, null, 511, null);
        k kVar2 = k.A;
        kVar2.getClass();
        h0Var.f48193h = kVar2;
        h0Var.G(aVarA.f());
        return h0Var;
    }

    public static boolean c5(List list) {
        list.getClass();
        return list.isEmpty() || ((h0) list.get(0)).f48193h != k.f116758r;
    }

    public static void f5(c cVar, WorkoutDetailsDTO workoutDetailsDTO, int i14, boolean z14, int i15) {
        boolean z15 = (i15 & 2) != 0;
        if ((i15 & 4) != 0) {
            i14 = -1;
        }
        ge1.b.T(v1.a(cVar), null, null, new e(workoutDetailsDTO, cVar, z15, workoutDetailsDTO.Q0.size(), i14, c5(workoutDetailsDTO.Q0), (i15 & 8) != 0 ? true : z14, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.r
    public final void F4(WorkoutDetailsDTO workoutDetailsDTO) {
        workoutDetailsDTO.getClass();
        ge1.b.T(v1.a(this), null, null, new b(workoutDetailsDTO, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.r
    public final void V4(WorkoutDetailsDTO workoutDetailsDTO) {
        workoutDetailsDTO.getClass();
        ge1.b.T(v1.a(this), null, null, new C0963c(workoutDetailsDTO, null), 3);
    }

    public final void X4(int i14, k kVar, ArrayList arrayList, boolean z14) {
        kVar.getClass();
        if (p13.h0.e0(i14, arrayList) == null) {
            arrayList.add(a5(kVar));
        } else {
            arrayList.remove(i14);
            arrayList.add(i14, a5(kVar));
        }
        WorkoutDetailsDTO workoutDetailsDTO = new WorkoutDetailsDTO();
        workoutDetailsDTO.Q0.addAll(arrayList);
        Y4(this, workoutDetailsDTO, false, z14, 2);
    }

    public final h0 a5(k kVar) {
        h0 h0Var = new h0(0, null, null, null, null, null, null, null, null, 511, null);
        k0.f49020a.getClass();
        k0.a aVarA = k0.a(kVar, 25.0d, r.f49273q, true);
        h0Var.f48193h = kVar;
        h0Var.G(aVarA.f());
        e5(h0Var);
        if (h0Var.f48193h == k.f116758r) {
            o.a(h0Var.t(), l52.h.PRE_ORDER, new n(this, 24));
        }
        return h0Var;
    }

    public final void b5(List<h0> list) {
        WorkoutDetailsDTO workoutDetailsDTO = new WorkoutDetailsDTO();
        if (list != null) {
            workoutDetailsDTO.Q0.addAll(list);
            h5(workoutDetailsDTO, false, false);
        }
    }

    public final void d5() {
        Double dValueOf = Double.valueOf(0.0d);
        int iIntValue = 0;
        double dDoubleValue = 0.0d;
        m52.b estimateType = null;
        for (h0 h0Var : this.f49138r.Q0) {
            if (h0Var.f48193h == k.f116758r && h0Var.getEstimateType() == m52.b.TIME_ESTIMATED) {
                WorkoutDetailsDTO workoutDetailsDTO = this.f49138r;
                workoutDetailsDTO.f48053m = null;
                workoutDetailsDTO.f48049j = 0;
                workoutDetailsDTO.f48050k = dValueOf;
                a2 a2Var = a2.WORKOUTS;
                i2.f36769a.getClass();
                i2.a.a(a2Var, "Pool swim does not support time estimates");
                return;
            }
            if (h0Var.getEstimateType() == null) {
                WorkoutDetailsDTO workoutDetailsDTO2 = this.f49138r;
                workoutDetailsDTO2.f48053m = null;
                workoutDetailsDTO2.f48049j = 0;
                workoutDetailsDTO2.f48050k = dValueOf;
                a2 a2Var2 = a2.WORKOUTS;
                String strG = tn.k.g(h0Var.f48193h.f116765a, " workout does not have estimations");
                i2.f36769a.getClass();
                i2.a.a(a2Var2, strG);
                return;
            }
            if (estimateType == null) {
                estimateType = h0Var.getEstimateType();
            } else if (estimateType != h0Var.getEstimateType()) {
                estimateType = m52.b.TIME_AND_DISTANCE_ESTIMATED;
            }
            Integer estimatedDurationInSecs = h0Var.getEstimatedDurationInSecs();
            iIntValue += estimatedDurationInSecs != null ? estimatedDurationInSecs.intValue() : 0;
            Double estimatedDistanceInMeters = h0Var.getEstimatedDistanceInMeters();
            dDoubleValue += estimatedDistanceInMeters != null ? estimatedDistanceInMeters.doubleValue() : 0.0d;
        }
        WorkoutDetailsDTO workoutDetailsDTO3 = this.f49138r;
        workoutDetailsDTO3.f48053m = estimateType;
        workoutDetailsDTO3.f48049j = Integer.valueOf(iIntValue);
        this.f49138r.f48050k = Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e5(h0 h0Var) {
        Double d14;
        k kVar = h0Var.f48193h;
        if ((kVar == k.f116758r || kVar == k.f116754n || kVar == k.f116755o) && (d14 = this.f49139t.get(kVar)) != null) {
            final double dDoubleValue = d14.doubleValue();
            final r0 r0Var = new r0();
            final p0 p0Var = new p0();
            final n0 n0Var = new n0();
            o.a(h0Var.t(), l52.h.PRE_ORDER, new u() { // from class: g62.x
                /* JADX WARN: Multi-variable type inference failed */
                @Override // l52.u
                public final void o(l52.i.a aVar) {
                    j23.l lVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.C;
                    j0 j0Var = (j0) aVar.getData();
                    m52.a aVar2 = j0Var.f48227l;
                    m52.a aVar3 = m52.a.f116650f;
                    r0 r0Var2 = r0Var;
                    p0 p0Var2 = p0Var;
                    double d15 = dDoubleValue;
                    n0 n0Var2 = n0Var;
                    if (aVar2 == aVar3) {
                        T t7 = r0Var2.f105810a;
                        r0Var2.f105810a = (t7 == 0 || t7 == m52.b.TIME_ESTIMATED) ? m52.b.TIME_ESTIMATED : m52.b.TIME_AND_DISTANCE_ESTIMATED;
                        p0Var2.f105807a = (int) (v52.e.g(j0Var, Double.valueOf(d15)) + ((double) p0Var2.f105807a));
                        n0Var2.f105805a += j0Var.f48229n;
                        return;
                    }
                    if (aVar2 == m52.a.f116649e) {
                        T t14 = r0Var2.f105810a;
                        r0Var2.f105810a = (t14 == 0 || t14 == m52.b.DISTANCE_ESTIMATED) ? m52.b.DISTANCE_ESTIMATED : m52.b.TIME_AND_DISTANCE_ESTIMATED;
                        n0Var2.f105805a = v52.e.g(j0Var, Double.valueOf(d15)) + n0Var2.f105805a;
                        p0Var2.f105807a += (int) j0Var.f48229n;
                    }
                }
            });
            h0Var.z((m52.b) r0Var.f105810a);
            h0Var.u(d14);
            h0Var.A(Double.valueOf(n0Var.f105805a));
            h0Var.D(Integer.valueOf(p0Var.f105807a));
        }
    }

    public final boolean h5(WorkoutDetailsDTO workoutDetailsDTO, boolean z14, boolean z15) {
        h0 h0Var = (h0) p13.h0.n0(workoutDetailsDTO.Q0);
        k kVar = h0Var != null ? h0Var.f48193h : null;
        k kVar2 = k.A;
        List<h0> list = workoutDetailsDTO.Q0;
        int size = kVar == kVar2 ? list.size() - 1 : list.size();
        l lVar = C;
        int i14 = lVar.f96796a;
        boolean z16 = false;
        if (size <= lVar.f96797b && i14 <= size) {
            if (!z15 && size > 0) {
                z16 = true;
            }
            f5(this, workoutDetailsDTO, 0, z16, 6);
            return true;
        }
        l lVar2 = D;
        int i15 = lVar2.f96796a;
        int i16 = lVar2.f96797b;
        y0<h> y0Var = this.f49141w;
        if (size <= i16 && i15 <= size) {
            y0Var.j(h.f.f49197a);
            f5(this, workoutDetailsDTO, 0, false, 14);
            return true;
        }
        if (size == 25) {
            f5(this, workoutDetailsDTO, R.string.msg_workout_multisport_leg_limit_reached, false, 8);
            return true;
        }
        if (size > 25) {
            if (z14) {
                y0Var.j(h.g.f49198a);
                return false;
            }
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "MultiSportViewModel", "This else condition should never hit, segmentCount > MAX_SPORTS_LEG_ALLOWED should only happen on duplicate case.");
            return false;
        }
        int iA0 = workoutDetailsDTO.a0();
        l lVar3 = E;
        int i17 = lVar3.f96796a;
        if (iA0 <= lVar3.f96797b && i17 <= iA0) {
            y0Var.j(h.C0965h.f49199a);
            f5(this, workoutDetailsDTO, 0, false, 14);
            return true;
        }
        if (iA0 == 250) {
            f5(this, workoutDetailsDTO, R.string.msg_workout_multisport_step_limit_reached, false, 8);
            return true;
        }
        if (iA0 <= 250) {
            f5(this, workoutDetailsDTO, 0, false, 14);
            return true;
        }
        if (z14) {
            y0Var.j(h.i.f49200a);
            return false;
        }
        a2 a2Var2 = a2.WORKOUTS;
        i2.f36769a.getClass();
        i2.a.f(a2Var2, "MultiSportViewModel", "This else condition should never hit, stepCount > MAX_STEPS_ALLOWED should only happen on duplicate case.");
        ge1.b.T(v1.a(this), null, null, new e(workoutDetailsDTO, this, false, workoutDetailsDTO.Q0.size(), R.string.msg_workout_multisport_step_limit_reached, c5(workoutDetailsDTO.Q0), false, null), 3);
        return false;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lj23/l;", "SPORTS_LEG_MINIMUM", "Lj23/l;", "SPORTS_LEG_LIMIT_APPROACHING", "STEP_LIMIT_APPROACHING", "", "MAX_SPORTS_LEG_ALLOWED", "I", "MAX_STEPS_ALLOWED", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
