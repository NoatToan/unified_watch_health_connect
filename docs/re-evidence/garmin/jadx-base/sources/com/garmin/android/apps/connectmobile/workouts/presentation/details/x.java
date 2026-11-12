package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$updateWorkout$1", f = "WorkoutDetailsViewModel.kt", l = {879}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f48832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WorkoutDetailsDTO f48833d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$updateWorkout$1$1", f = "WorkoutDetailsViewModel.kt", l = {881, 883, 887, 888, 892}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f48835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WorkoutDetailsDTO f48837d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, String str, WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f48835b = fVar;
            this.f48836c = str;
            this.f48837d = workoutDetailsDTO;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f48835b, this.f48836c, this.f48837d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0057  */
        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
        /* JADX WARN: Code duplicated, block: B:30:0x006b  */
        /* JADX WARN: Code duplicated, block: B:33:0x007a  */
        /* JADX WARN: Code duplicated, block: B:36:0x008a  */
        /* JADX WARN: Code duplicated, block: B:38:0x008e  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        
            if (v52.d.d(r10, r1, r9) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
        
            if (v52.d.d(r10, r1, r9) == r0) goto L40;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            String str;
            e eVar;
            r53.j<v52.c<? extends e>> jVar;
            e eVarK;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48834a;
            WorkoutDetailsDTO workoutDetailsDTO = this.f48837d;
            int i15 = 1;
            f fVar = this.f48835b;
            if (i14 == 0) {
                o13.r.b(obj);
                fVar.f48611z = this.f48836c;
                q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
                v52.c.b bVar = v52.c.b.f175759a;
                this.f48834a = 1;
                if (wVar.h(bVar, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        str = fVar.f48611z;
                        if (str == null) {
                            str = "";
                        }
                        workoutDetailsDTO.f48041b = str;
                        fVar.f48605r = workoutDetailsDTO;
                        eVar = (e) v52.d.b(fVar.Z);
                        if (eVar != null) {
                            jVar = fVar.Y;
                            eVarK = eVar.k(workoutDetailsDTO);
                            this.f48834a = 3;
                            if (v52.d.a(jVar, eVarK, this) != aVar) {
                                q53.w<v52.c<? extends d>> wVar2 = fVar.f48598k0;
                                d.v vVar = new d.v(true);
                                this.f48834a = 4;
                            }
                        } else {
                            q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                            d.v vVar2 = new d.v(true);
                            this.f48834a = 4;
                        }
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        q53.w<v52.c<? extends d>> wVar4 = fVar.f48598k0;
                        d.v vVar3 = new d.v(false, i15, null);
                        this.f48834a = 5;
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    o13.r.b(obj);
                    q53.w<v52.c<? extends d>> wVar5 = fVar.f48598k0;
                    d.v vVar4 = new d.v(true);
                    this.f48834a = 4;
                } else {
                    if (i14 != 4 && i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            }
            return Unit.INSTANCE;
            l52.y yVar = fVar.f48588b;
            this.f48834a = 2;
            obj = yVar.N(workoutDetailsDTO, this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    str = fVar.f48611z;
                    if (str == null) {
                        str = "";
                    }
                    workoutDetailsDTO.f48041b = str;
                    fVar.f48605r = workoutDetailsDTO;
                    eVar = (e) v52.d.b(fVar.Z);
                    if (eVar != null) {
                        jVar = fVar.Y;
                        eVarK = eVar.k(workoutDetailsDTO);
                        this.f48834a = 3;
                        if (v52.d.a(jVar, eVarK, this) != aVar) {
                            q53.w<v52.c<? extends d>> wVar6 = fVar.f48598k0;
                            d.v vVar5 = new d.v(true);
                            this.f48834a = 4;
                        }
                    } else {
                        q53.w<v52.c<? extends d>> wVar7 = fVar.f48598k0;
                        d.v vVar6 = new d.v(true);
                        this.f48834a = 4;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends d>> wVar8 = fVar.f48598k0;
                    d.v vVar7 = new d.v(false, i15, null);
                    this.f48834a = 5;
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f fVar, String str, WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f48831b = fVar;
        this.f48832c = str;
        this.f48833d = workoutDetailsDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f48831b, this.f48832c, this.f48833d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48830a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f48831b, this.f48832c, this.f48833d, null);
            this.f48830a = 1;
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
