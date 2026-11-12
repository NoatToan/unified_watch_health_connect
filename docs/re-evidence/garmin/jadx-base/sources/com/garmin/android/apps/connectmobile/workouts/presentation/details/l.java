package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import am.x0;
import androidx.lifecycle.v1;
import c62.l1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$getExerciseList$2", f = "WorkoutDetailsViewModel.kt", l = {694}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f48718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l52.i<j0> f48719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m52.k f48720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z52.a f48721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f48722g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$getExerciseList$2$1", f = "WorkoutDetailsViewModel.kt", l = {695, 715, 716, 746, 772, 782, 775, 788, 793}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.j0 f48723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v2 f48724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.repcounting.model.c f48725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f48726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public r53.j f48727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WorkoutDetailsDTO f48728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public WorkoutScheduleDTO f48729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.repcounting.model.c f48730h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public l1 f48731i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f48732j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f48733k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f48734l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ x0 f48735m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l52.i<j0> f48736n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ m52.k f48737o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ z52.a f48738p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f48739q;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.details.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$getExerciseList$2$1$2$exercisesExcludedResponse$1", f = "WorkoutDetailsViewModel.kt", l = {741}, m = "invokeSuspend", v = 2)
        public static final class C0949a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.repcounting.model.d[]>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48740a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f48741b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f48742c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List<com.garmin.android.apps.connectmobile.repcounting.model.d> f48743d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0949a(f fVar, boolean z14, List<com.garmin.android.apps.connectmobile.repcounting.model.d> list, t13.d<? super C0949a> dVar) {
                super(2, dVar);
                this.f48741b = fVar;
                this.f48742c = z14;
                this.f48743d = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0949a(this.f48741b, this.f48742c, this.f48743d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.repcounting.model.d[]>> dVar) {
                return ((C0949a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f48740a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                l52.y yVar = this.f48741b.f48588b;
                x0 x0Var = x0.f4309n1;
                com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) this.f48743d.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]);
                this.f48740a = 1;
                Object objO = yVar.O(x0Var, this.f48742c, dVarArr, this);
                return objO == aVar ? aVar : objO;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$getExerciseList$2$1$initialExercises$1", f = "WorkoutDetailsViewModel.kt", l = {697}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.repcounting.model.c>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48744a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f48745b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x0 f48746c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f48747d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar, x0 x0Var, boolean z14, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f48745b = fVar;
                this.f48746c = x0Var;
                this.f48747d = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f48745b, this.f48746c, this.f48747d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.repcounting.model.c>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f48744a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                l52.y yVar = this.f48745b.f48588b;
                this.f48744a = 1;
                Object objK = yVar.k(this.f48746c, this.f48747d, this);
                return objK == aVar ? aVar : objK;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$getExerciseList$2$1$otherExercises$1", f = "WorkoutDetailsViewModel.kt", l = {706}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<b0, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.repcounting.model.c>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48748a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f48749b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f48750c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(f fVar, boolean z14, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f48749b = fVar;
                this.f48750c = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f48749b, this.f48750c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.repcounting.model.c>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f48748a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                l52.y yVar = this.f48749b.f48588b;
                x0 x0Var = x0.f4322q2;
                this.f48748a = 1;
                Object objK = yVar.k(x0Var, this.f48750c, this);
                return objK == aVar ? aVar : objK;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, x0 x0Var, l52.i<j0> iVar, m52.k kVar, z52.a aVar, boolean z14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f48734l = fVar;
            this.f48735m = x0Var;
            this.f48736n = iVar;
            this.f48737o = kVar;
            this.f48738p = aVar;
            this.f48739q = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f48734l, this.f48735m, this.f48736n, this.f48737o, this.f48738p, this.f48739q, dVar);
            aVar.f48733k = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x009f  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[PHI: r3 r11
          0x00b7: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:27:0x00b3, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
          0x00b7: PHI (r11v6 o53.j0) = (r11v4 o53.j0), (r11v9 o53.j0) binds: [B:27:0x00b3, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:52:0x0111  */
        /* JADX WARN: Code duplicated, block: B:54:0x0126  */
        /* JADX WARN: Code duplicated, block: B:70:0x018b  */
        /* JADX WARN: Code duplicated, block: B:72:0x0193  */
        /* JADX WARN: Code duplicated, block: B:75:0x01b2 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:83:0x0219  */
        /* JADX WARN: Code duplicated, block: B:86:0x0235  */
        /* JADX WARN: Code duplicated, block: B:91:0x0253  */
        /* JADX WARN: Code duplicated, block: B:93:0x0257  */
        /* JADX WARN: Code duplicated, block: B:98:0x0272  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        
            if (r11 == r2) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0142, code lost:
        
            if (r1 == r2) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0232, code lost:
        
            if (v52.d.d(r1, r3, r24) == r2) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x024d, code lost:
        
            if (r7.emit(r1, r24) == r2) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x026c, code lost:
        
            if (r1.emit(r3, r24) == r2) goto L95;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0 x0Var;
            o53.j0 j0VarJ;
            Object objC;
            v2 v2Var;
            v2 v2Var2;
            Object objAwait;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar;
            l52.i<j0> iVar;
            ArrayList arrayList;
            Object objC2;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar2;
            com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF;
            r53.j<v52.c<? extends e>> jVar;
            WorkoutDetailsDTO workoutDetailsDTO;
            WorkoutScheduleDTO workoutScheduleDTO;
            l1 l1VarG4;
            Object objA;
            e.b bVar;
            b0 b0Var = (b0) this.f48733k;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48732j;
            boolean z14 = this.f48739q;
            f fVar = this.f48734l;
            switch (i14) {
                case 0:
                    o13.r.b(obj);
                    r53.j<v52.c<? extends e>> jVar2 = fVar.Y;
                    v52.c.b bVar2 = v52.c.b.f175759a;
                    this.f48733k = b0Var;
                    this.f48732j = 1;
                    if (jVar2.emit(bVar2, this) != aVar) {
                        x0Var = this.f48735m;
                        o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(fVar, x0Var, z14, null), 3);
                        if (x0Var != x0.f4309n1 || x0Var == x0.C2) {
                            j0VarJ = ge1.b.j(b0Var, null, null, new c(fVar, z14, null), 3);
                        } else {
                            j0VarJ = null;
                        }
                        this.f48733k = b0Var;
                        this.f48723a = j0VarJ;
                        this.f48732j = 2;
                        objC = j0VarJ2.C(this);
                        if (objC != aVar) {
                            v2Var = (v2) objC;
                            if (j0VarJ == null) {
                                this.f48733k = b0Var;
                                this.f48723a = null;
                                this.f48724b = v2Var;
                                this.f48732j = 3;
                                objAwait = j0VarJ.await(this);
                            } else {
                                v2Var2 = null;
                                if (!(v2Var instanceof v2.b)) {
                                    cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var).f47386a;
                                    if (v2Var2 instanceof v2.b) {
                                        cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var2).f47386a;
                                        if (cVar2 != null && (dVarArrF = cVar2.F()) != null && cVar != null) {
                                            cVar.C(dVarArrF);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                    } else {
                                        if (v2Var2 instanceof v2.a) {
                                            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Could not retrieve other DSW Strength exercises: ");
                                            i2.a aVar2 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar2.getClass();
                                            i2.a.f(a2Var, "WorkoutDetailsViewModel", strD);
                                        }
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    iVar = this.f48736n;
                                    if (iVar != null) {
                                        arrayList = new ArrayList();
                                        l52.o.a(iVar, l52.h.PRE_ORDER, new a0.h(8, cVar, arrayList));
                                        if (!arrayList.isEmpty()) {
                                            o53.j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new C0949a(fVar, z14, arrayList, null), 3);
                                            this.f48733k = b0Var;
                                            this.f48723a = null;
                                            this.f48724b = null;
                                            this.f48725c = cVar;
                                            this.f48726d = arrayList;
                                            this.f48727e = null;
                                            this.f48732j = 4;
                                            objC2 = j0VarJ3.C(this);
                                        }
                                    }
                                    bv.b.f21239a.getClass();
                                    bv.b.a();
                                    if (k1.f37122a.e()) {
                                        o13.t tVar = k52.g.f102952a;
                                        if (this.f48737o == m52.k.f116759t) {
                                            int i15 = f.J0;
                                            fVar.getClass();
                                            ge1.b.T(v1.a(fVar), null, null, new k(fVar, cVar, this.f48738p, null), 3);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    fVar.f48607v = cVar;
                                    jVar = fVar.Y;
                                    fVar.f48609x = null;
                                    workoutDetailsDTO = fVar.f48605r;
                                    if (workoutDetailsDTO != null && cVar != null) {
                                        workoutScheduleDTO = fVar.f48606t;
                                        l1VarG4 = fVar.G4(workoutDetailsDTO);
                                        o52.c cVar3 = fVar.f48594h;
                                        m52.k kVarR4 = fVar.R4(workoutDetailsDTO, Boolean.TRUE);
                                        this.f48733k = null;
                                        this.f48723a = null;
                                        this.f48724b = null;
                                        this.f48725c = null;
                                        this.f48726d = null;
                                        this.f48727e = jVar;
                                        this.f48728f = workoutDetailsDTO;
                                        this.f48729g = workoutScheduleDTO;
                                        this.f48730h = cVar;
                                        this.f48731i = l1VarG4;
                                        this.f48732j = 6;
                                        objA = cVar3.a(kVarR4, this);
                                        if (objA != aVar) {
                                            bVar = new e.b(workoutDetailsDTO, workoutScheduleDTO, cVar, null, l1VarG4, null, (com.garmin.android.apps.connectmobile.workouts.data.model.y) objA, null, null, this.f48738p, 416, null);
                                            this.f48733k = null;
                                            this.f48723a = null;
                                            this.f48724b = null;
                                            this.f48725c = null;
                                            this.f48726d = null;
                                            this.f48727e = null;
                                            this.f48728f = null;
                                            this.f48729g = null;
                                            this.f48730h = null;
                                            this.f48731i = null;
                                            this.f48732j = 7;
                                            if (v52.d.a(jVar, bVar, this) != aVar) {
                                                q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
                                                d.a aVar3 = new d.a(fVar.I);
                                                this.f48733k = null;
                                                this.f48723a = null;
                                                this.f48724b = null;
                                                this.f48725c = null;
                                                this.f48726d = null;
                                                this.f48732j = 8;
                                            }
                                        }
                                    } else {
                                        v52.c.a aVar4 = new v52.c.a(null, 1, null);
                                        this.f48733k = null;
                                        this.f48723a = null;
                                        this.f48724b = null;
                                        this.f48725c = null;
                                        this.f48726d = null;
                                        this.f48727e = null;
                                        this.f48732j = 5;
                                    }
                                } else {
                                    if (v2Var instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    r53.j<v52.c<? extends e>> jVar3 = fVar.Y;
                                    v52.c.a aVar5 = new v52.c.a(null, 1, null);
                                    this.f48733k = null;
                                    this.f48723a = null;
                                    this.f48724b = null;
                                    this.f48732j = 9;
                                }
                            }
                        }
                        break;
                    }
                    return aVar;
                case 1:
                    o13.r.b(obj);
                    x0Var = this.f48735m;
                    o53.j0 j0VarJ4 = ge1.b.j(b0Var, null, null, new b(fVar, x0Var, z14, null), 3);
                    if (x0Var != x0.f4309n1) {
                        j0VarJ = ge1.b.j(b0Var, null, null, new c(fVar, z14, null), 3);
                    } else {
                        j0VarJ = ge1.b.j(b0Var, null, null, new c(fVar, z14, null), 3);
                    }
                    this.f48733k = b0Var;
                    this.f48723a = j0VarJ;
                    this.f48732j = 2;
                    objC = j0VarJ4.C(this);
                    if (objC != aVar) {
                        v2Var = (v2) objC;
                        if (j0VarJ == null) {
                            this.f48733k = b0Var;
                            this.f48723a = null;
                            this.f48724b = v2Var;
                            this.f48732j = 3;
                            objAwait = j0VarJ.await(this);
                        } else {
                            v2Var2 = null;
                            if (!(v2Var instanceof v2.b)) {
                                cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var).f47386a;
                                if (v2Var2 instanceof v2.b) {
                                    cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var2).f47386a;
                                    if (cVar2 != null) {
                                        cVar.C(dVarArrF);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                } else {
                                    if (v2Var2 instanceof v2.a) {
                                        String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Could not retrieve other DSW Strength exercises: ");
                                        i2.a aVar6 = i2.f36769a;
                                        a2 a2Var2 = a2.GENERAL;
                                        aVar6.getClass();
                                        i2.a.f(a2Var2, "WorkoutDetailsViewModel", strD2);
                                    }
                                    Unit unit4 = Unit.INSTANCE;
                                }
                                iVar = this.f48736n;
                                if (iVar != null) {
                                    arrayList = new ArrayList();
                                    l52.o.a(iVar, l52.h.PRE_ORDER, new a0.h(8, cVar, arrayList));
                                    if (!arrayList.isEmpty()) {
                                        o53.j0 j0VarJ5 = ge1.b.j(b0Var, null, null, new C0949a(fVar, z14, arrayList, null), 3);
                                        this.f48733k = b0Var;
                                        this.f48723a = null;
                                        this.f48724b = null;
                                        this.f48725c = cVar;
                                        this.f48726d = arrayList;
                                        this.f48727e = null;
                                        this.f48732j = 4;
                                        objC2 = j0VarJ5.C(this);
                                    }
                                }
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                if (k1.f37122a.e()) {
                                    o13.t tVar2 = k52.g.f102952a;
                                    if (this.f48737o == m52.k.f116759t) {
                                        int i16 = f.J0;
                                        fVar.getClass();
                                        ge1.b.T(v1.a(fVar), null, null, new k(fVar, cVar, this.f48738p, null), 3);
                                    }
                                    return Unit.INSTANCE;
                                }
                                fVar.f48607v = cVar;
                                jVar = fVar.Y;
                                fVar.f48609x = null;
                                workoutDetailsDTO = fVar.f48605r;
                                if (workoutDetailsDTO != null) {
                                    v52.c.a aVar7 = new v52.c.a(null, 1, null);
                                    this.f48733k = null;
                                    this.f48723a = null;
                                    this.f48724b = null;
                                    this.f48725c = null;
                                    this.f48726d = null;
                                    this.f48727e = null;
                                    this.f48732j = 5;
                                } else {
                                    v52.c.a aVar8 = new v52.c.a(null, 1, null);
                                    this.f48733k = null;
                                    this.f48723a = null;
                                    this.f48724b = null;
                                    this.f48725c = null;
                                    this.f48726d = null;
                                    this.f48727e = null;
                                    this.f48732j = 5;
                                }
                            } else {
                                if (v2Var instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                r53.j<v52.c<? extends e>> jVar4 = fVar.Y;
                                v52.c.a aVar9 = new v52.c.a(null, 1, null);
                                this.f48733k = null;
                                this.f48723a = null;
                                this.f48724b = null;
                                this.f48732j = 9;
                            }
                        }
                        break;
                    }
                    return aVar;
                case 2:
                    o53.j0 j0Var = this.f48723a;
                    o13.r.b(obj);
                    j0VarJ = j0Var;
                    objC = obj;
                    v2Var = (v2) objC;
                    if (j0VarJ == null) {
                        v2Var2 = null;
                        if (!(v2Var instanceof v2.b)) {
                            cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var).f47386a;
                            if (v2Var2 instanceof v2.b) {
                                cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var2).f47386a;
                                if (cVar2 != null) {
                                    cVar.C(dVarArrF);
                                    Unit unit5 = Unit.INSTANCE;
                                }
                            } else {
                                if (v2Var2 instanceof v2.a) {
                                    String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Could not retrieve other DSW Strength exercises: ");
                                    i2.a aVar10 = i2.f36769a;
                                    a2 a2Var3 = a2.GENERAL;
                                    aVar10.getClass();
                                    i2.a.f(a2Var3, "WorkoutDetailsViewModel", strD3);
                                }
                                Unit unit6 = Unit.INSTANCE;
                            }
                            iVar = this.f48736n;
                            if (iVar != null) {
                                arrayList = new ArrayList();
                                l52.o.a(iVar, l52.h.PRE_ORDER, new a0.h(8, cVar, arrayList));
                                if (!arrayList.isEmpty()) {
                                    o53.j0 j0VarJ6 = ge1.b.j(b0Var, null, null, new C0949a(fVar, z14, arrayList, null), 3);
                                    this.f48733k = b0Var;
                                    this.f48723a = null;
                                    this.f48724b = null;
                                    this.f48725c = cVar;
                                    this.f48726d = arrayList;
                                    this.f48727e = null;
                                    this.f48732j = 4;
                                    objC2 = j0VarJ6.C(this);
                                }
                            }
                            bv.b.f21239a.getClass();
                            bv.b.a();
                            if (k1.f37122a.e()) {
                                o13.t tVar3 = k52.g.f102952a;
                                if (this.f48737o == m52.k.f116759t) {
                                    int i17 = f.J0;
                                    fVar.getClass();
                                    ge1.b.T(v1.a(fVar), null, null, new k(fVar, cVar, this.f48738p, null), 3);
                                }
                                return Unit.INSTANCE;
                            }
                            fVar.f48607v = cVar;
                            jVar = fVar.Y;
                            fVar.f48609x = null;
                            workoutDetailsDTO = fVar.f48605r;
                            if (workoutDetailsDTO != null) {
                                v52.c.a aVar11 = new v52.c.a(null, 1, null);
                                this.f48733k = null;
                                this.f48723a = null;
                                this.f48724b = null;
                                this.f48725c = null;
                                this.f48726d = null;
                                this.f48727e = null;
                                this.f48732j = 5;
                            } else {
                                v52.c.a aVar12 = new v52.c.a(null, 1, null);
                                this.f48733k = null;
                                this.f48723a = null;
                                this.f48724b = null;
                                this.f48725c = null;
                                this.f48726d = null;
                                this.f48727e = null;
                                this.f48732j = 5;
                            }
                        } else {
                            if (v2Var instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            r53.j<v52.c<? extends e>> jVar5 = fVar.Y;
                            v52.c.a aVar13 = new v52.c.a(null, 1, null);
                            this.f48733k = null;
                            this.f48723a = null;
                            this.f48724b = null;
                            this.f48732j = 9;
                        }
                        break;
                    } else {
                        this.f48733k = b0Var;
                        this.f48723a = null;
                        this.f48724b = v2Var;
                        this.f48732j = 3;
                        objAwait = j0VarJ.await(this);
                        break;
                    }
                    return aVar;
                case 3:
                    v2Var = this.f48724b;
                    o13.r.b(obj);
                    objAwait = obj;
                    v2Var2 = (v2) objAwait;
                    if (!(v2Var instanceof v2.b)) {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        r53.j<v52.c<? extends e>> jVar6 = fVar.Y;
                        v52.c.a aVar14 = new v52.c.a(null, 1, null);
                        this.f48733k = null;
                        this.f48723a = null;
                        this.f48724b = null;
                        this.f48732j = 9;
                        break;
                    } else {
                        cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var).f47386a;
                        if (v2Var2 instanceof v2.b) {
                            cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var2).f47386a;
                            if (cVar2 != null) {
                                cVar.C(dVarArrF);
                                Unit unit7 = Unit.INSTANCE;
                            }
                        } else {
                            if (v2Var2 instanceof v2.a) {
                                String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Could not retrieve other DSW Strength exercises: ");
                                i2.a aVar15 = i2.f36769a;
                                a2 a2Var4 = a2.GENERAL;
                                aVar15.getClass();
                                i2.a.f(a2Var4, "WorkoutDetailsViewModel", strD4);
                            }
                            Unit unit8 = Unit.INSTANCE;
                        }
                        iVar = this.f48736n;
                        if (iVar != null) {
                            arrayList = new ArrayList();
                            l52.o.a(iVar, l52.h.PRE_ORDER, new a0.h(8, cVar, arrayList));
                            if (!arrayList.isEmpty()) {
                                o53.j0 j0VarJ7 = ge1.b.j(b0Var, null, null, new C0949a(fVar, z14, arrayList, null), 3);
                                this.f48733k = b0Var;
                                this.f48723a = null;
                                this.f48724b = null;
                                this.f48725c = cVar;
                                this.f48726d = arrayList;
                                this.f48727e = null;
                                this.f48732j = 4;
                                objC2 = j0VarJ7.C(this);
                            }
                        }
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (k1.f37122a.e()) {
                            o13.t tVar4 = k52.g.f102952a;
                            if (this.f48737o == m52.k.f116759t) {
                                int i18 = f.J0;
                                fVar.getClass();
                                ge1.b.T(v1.a(fVar), null, null, new k(fVar, cVar, this.f48738p, null), 3);
                            }
                            return Unit.INSTANCE;
                        }
                        fVar.f48607v = cVar;
                        jVar = fVar.Y;
                        fVar.f48609x = null;
                        workoutDetailsDTO = fVar.f48605r;
                        if (workoutDetailsDTO != null) {
                            v52.c.a aVar16 = new v52.c.a(null, 1, null);
                            this.f48733k = null;
                            this.f48723a = null;
                            this.f48724b = null;
                            this.f48725c = null;
                            this.f48726d = null;
                            this.f48727e = null;
                            this.f48732j = 5;
                        } else {
                            v52.c.a aVar17 = new v52.c.a(null, 1, null);
                            this.f48733k = null;
                            this.f48723a = null;
                            this.f48724b = null;
                            this.f48725c = null;
                            this.f48726d = null;
                            this.f48727e = null;
                            this.f48732j = 5;
                        }
                        break;
                    }
                    return aVar;
                case 4:
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar4 = this.f48725c;
                    o13.r.b(obj);
                    cVar = cVar4;
                    objC2 = obj;
                    v2 v2Var3 = (v2) objC2;
                    if (v2Var3 instanceof v2.b) {
                        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) ((v2.b) v2Var3).f47386a;
                        if (dVarArr != null && cVar != null) {
                            cVar.C(dVarArr);
                            Unit unit9 = Unit.INSTANCE;
                        }
                    } else {
                        if (!(v2Var3 instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        a2 a2Var5 = a2.WORKOUTS;
                        String strN = fb1.c.n("Could not retrieve Translation For excluded exercises: ", ((v2.a) v2Var3).f47385c);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var5, "WorkoutDetailsViewModel", strN);
                        Unit unit10 = Unit.INSTANCE;
                    }
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    if (k1.f37122a.e()) {
                        o13.t tVar5 = k52.g.f102952a;
                        if (this.f48737o == m52.k.f116759t) {
                            int i19 = f.J0;
                            fVar.getClass();
                            ge1.b.T(v1.a(fVar), null, null, new k(fVar, cVar, this.f48738p, null), 3);
                        }
                        return Unit.INSTANCE;
                    }
                    fVar.f48607v = cVar;
                    jVar = fVar.Y;
                    fVar.f48609x = null;
                    workoutDetailsDTO = fVar.f48605r;
                    if (workoutDetailsDTO != null) {
                        v52.c.a aVar18 = new v52.c.a(null, 1, null);
                        this.f48733k = null;
                        this.f48723a = null;
                        this.f48724b = null;
                        this.f48725c = null;
                        this.f48726d = null;
                        this.f48727e = null;
                        this.f48732j = 5;
                        break;
                    } else {
                        v52.c.a aVar19 = new v52.c.a(null, 1, null);
                        this.f48733k = null;
                        this.f48723a = null;
                        this.f48724b = null;
                        this.f48725c = null;
                        this.f48726d = null;
                        this.f48727e = null;
                        this.f48732j = 5;
                        break;
                    }
                    return aVar;
                case 5:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 6:
                    l1VarG4 = this.f48731i;
                    cVar = this.f48730h;
                    workoutScheduleDTO = this.f48729g;
                    workoutDetailsDTO = this.f48728f;
                    jVar = this.f48727e;
                    o13.r.b(obj);
                    objA = obj;
                    bVar = new e.b(workoutDetailsDTO, workoutScheduleDTO, cVar, null, l1VarG4, null, (com.garmin.android.apps.connectmobile.workouts.data.model.y) objA, null, null, this.f48738p, 416, null);
                    this.f48733k = null;
                    this.f48723a = null;
                    this.f48724b = null;
                    this.f48725c = null;
                    this.f48726d = null;
                    this.f48727e = null;
                    this.f48728f = null;
                    this.f48729g = null;
                    this.f48730h = null;
                    this.f48731i = null;
                    this.f48732j = 7;
                    if (v52.d.a(jVar, bVar, this) != aVar) {
                        q53.w<v52.c<? extends d>> wVar2 = fVar.f48598k0;
                        d.a aVar20 = new d.a(fVar.I);
                        this.f48733k = null;
                        this.f48723a = null;
                        this.f48724b = null;
                        this.f48725c = null;
                        this.f48726d = null;
                        this.f48732j = 8;
                        break;
                    }
                    return aVar;
                case 7:
                    o13.r.b(obj);
                    q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                    d.a aVar21 = new d.a(fVar.I);
                    this.f48733k = null;
                    this.f48723a = null;
                    this.f48724b = null;
                    this.f48725c = null;
                    this.f48726d = null;
                    this.f48732j = 8;
                    break;
                case 8:
                case 9:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, x0 x0Var, l52.i<j0> iVar, m52.k kVar, z52.a aVar, boolean z14, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f48717b = fVar;
        this.f48718c = x0Var;
        this.f48719d = iVar;
        this.f48720e = kVar;
        this.f48721f = aVar;
        this.f48722g = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f48717b, this.f48718c, this.f48719d, this.f48720e, this.f48721f, this.f48722g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48716a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f48717b, this.f48718c, this.f48719d, this.f48720e, this.f48721f, this.f48722g, null);
            this.f48716a = 1;
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
