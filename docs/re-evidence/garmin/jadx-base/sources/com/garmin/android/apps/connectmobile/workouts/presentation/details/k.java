package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import c62.l1;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import java.util.List;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$getBenchmarks$1", f = "WorkoutDetailsViewModel.kt", l = {802}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.c f48704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z52.a f48705d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$getBenchmarks$1$1", f = "WorkoutDetailsViewModel.kt", l = {803, 810, 820, 813, 826, 830}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r53.j f48706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WorkoutDetailsDTO f48707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WorkoutScheduleDTO f48708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.repcounting.model.c f48709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f48710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public l1 f48711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f48712g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f f48713h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.c f48714i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ z52.a f48715j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, z52.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f48713h = fVar;
            this.f48714i = cVar;
            this.f48715j = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f48713h, this.f48714i, this.f48715j, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0056  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:44:0x0100  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
        
            if (v52.d.d(r2, r3, r24) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
        
            if (r9.emit(r2, r24) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
        
            if (r2.emit(r4, r24) == r1) goto L41;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objI;
            v2 v2Var;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar;
            r53.j<v52.c<? extends e>> jVar;
            WorkoutDetailsDTO workoutDetailsDTO;
            WorkoutScheduleDTO workoutScheduleDTO;
            Object objA;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list;
            l1 l1Var;
            e.b bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48712g;
            f fVar = this.f48713h;
            switch (i14) {
                case 0:
                    o13.r.b(obj);
                    l52.y yVar = fVar.f48588b;
                    this.f48712g = 1;
                    objI = yVar.i(this);
                    if (objI != aVar) {
                        v2Var = (v2) objI;
                        if (!(v2Var instanceof v2.b)) {
                            List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list2 = (List) ((v2.b) v2Var).f47386a;
                            cVar = this.f48714i;
                            gl1.d.l0(cVar, list2);
                            fVar.f48607v = cVar;
                            jVar = fVar.Y;
                            fVar.f48609x = list2;
                            workoutDetailsDTO = fVar.f48605r;
                            if (workoutDetailsDTO == null || cVar == null) {
                                v52.c.a aVar2 = new v52.c.a(null, 1, null);
                                this.f48712g = 2;
                            } else {
                                workoutScheduleDTO = fVar.f48606t;
                                l1 l1VarG4 = fVar.G4(workoutDetailsDTO);
                                o52.c cVar2 = fVar.f48594h;
                                m52.k kVarR4 = fVar.R4(workoutDetailsDTO, Boolean.TRUE);
                                this.f48706a = jVar;
                                this.f48707b = workoutDetailsDTO;
                                this.f48708c = workoutScheduleDTO;
                                this.f48709d = cVar;
                                this.f48710e = list2;
                                this.f48711f = l1VarG4;
                                this.f48712g = 3;
                                objA = cVar2.a(kVarR4, this);
                                if (objA != aVar) {
                                    list = list2;
                                    l1Var = l1VarG4;
                                    bVar = new e.b(workoutDetailsDTO, workoutScheduleDTO, cVar, list, l1Var, null, (com.garmin.android.apps.connectmobile.workouts.data.model.y) objA, null, null, this.f48715j, 416, null);
                                    this.f48706a = null;
                                    this.f48707b = null;
                                    this.f48708c = null;
                                    this.f48709d = null;
                                    this.f48710e = null;
                                    this.f48711f = null;
                                    this.f48712g = 4;
                                    if (v52.d.a(jVar, bVar, this) != aVar) {
                                        q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
                                        d.a aVar3 = new d.a(fVar.I);
                                        this.f48712g = 5;
                                    }
                                }
                            }
                        } else {
                            if (v2Var instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            r53.j<v52.c<? extends e>> jVar2 = fVar.Y;
                            v52.c.a aVar4 = new v52.c.a(null, 1, null);
                            this.f48712g = 6;
                        }
                        break;
                    }
                    return aVar;
                case 1:
                    o13.r.b(obj);
                    objI = obj;
                    v2Var = (v2) objI;
                    if (!(v2Var instanceof v2.b)) {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        r53.j<v52.c<? extends e>> jVar3 = fVar.Y;
                        v52.c.a aVar5 = new v52.c.a(null, 1, null);
                        this.f48712g = 6;
                        break;
                    } else {
                        List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list3 = (List) ((v2.b) v2Var).f47386a;
                        cVar = this.f48714i;
                        gl1.d.l0(cVar, list3);
                        fVar.f48607v = cVar;
                        jVar = fVar.Y;
                        fVar.f48609x = list3;
                        workoutDetailsDTO = fVar.f48605r;
                        if (workoutDetailsDTO == null) {
                            v52.c.a aVar6 = new v52.c.a(null, 1, null);
                            this.f48712g = 2;
                        } else {
                            v52.c.a aVar7 = new v52.c.a(null, 1, null);
                            this.f48712g = 2;
                        }
                        break;
                    }
                    return aVar;
                case 2:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 3:
                    l1 l1Var2 = this.f48711f;
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list4 = this.f48710e;
                    cVar = this.f48709d;
                    workoutScheduleDTO = this.f48708c;
                    workoutDetailsDTO = this.f48707b;
                    jVar = this.f48706a;
                    o13.r.b(obj);
                    objA = obj;
                    l1Var = l1Var2;
                    list = list4;
                    bVar = new e.b(workoutDetailsDTO, workoutScheduleDTO, cVar, list, l1Var, null, (com.garmin.android.apps.connectmobile.workouts.data.model.y) objA, null, null, this.f48715j, 416, null);
                    this.f48706a = null;
                    this.f48707b = null;
                    this.f48708c = null;
                    this.f48709d = null;
                    this.f48710e = null;
                    this.f48711f = null;
                    this.f48712g = 4;
                    if (v52.d.a(jVar, bVar, this) != aVar) {
                        q53.w<v52.c<? extends d>> wVar2 = fVar.f48598k0;
                        d.a aVar8 = new d.a(fVar.I);
                        this.f48712g = 5;
                        break;
                    }
                    return aVar;
                case 4:
                    o13.r.b(obj);
                    q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                    d.a aVar9 = new d.a(fVar.I);
                    this.f48712g = 5;
                    break;
                case 5:
                case 6:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, z52.a aVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f48703b = fVar;
        this.f48704c = cVar;
        this.f48705d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f48703b, this.f48704c, this.f48705d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48702a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f48703b, this.f48704c, this.f48705d, null);
            this.f48702a = 1;
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
