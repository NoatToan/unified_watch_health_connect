package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$createWorkout$1", f = "WorkoutDetailsViewModel.kt", l = {1012, 1014, 1019, 1020, 1023}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f48688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f48689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f48692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WorkoutDetailsDTO f48693f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f48692e = fVar;
        this.f48693f = workoutDetailsDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f48692e, this.f48693f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[PHI: r5
      0x00b8: PHI (r5v5 java.lang.Object) = (r5v1 java.lang.Object), (r5v6 java.lang.Object) binds: [B:24:0x006d, B:37:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (v52.d.d(r4, r5, r12) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (v52.d.d(r13, r1, r12) == r0) goto L42;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objJ4;
        Object obj2;
        WorkoutDetailsDTO workoutDetailsDTO;
        e eVar;
        f fVar;
        int i14;
        r53.j<v52.c<? extends e>> jVar;
        e eVarC;
        int i15;
        Object obj3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f48691d;
        f fVar2 = this.f48692e;
        int i17 = 1;
        boolean z14 = false;
        p005kotlin.jvm.internal.j jVar2 = null;
        if (i16 == 0) {
            o13.r.b(obj);
            q53.w<v52.c<? extends d>> wVar = fVar2.f48598k0;
            v52.c.b bVar = v52.c.b.f175759a;
            this.f48691d = 1;
            if (wVar.h(bVar, this) != aVar) {
            }
            return aVar;
        }
        if (i16 == 1) {
            o13.r.b(obj);
        } else {
            if (i16 == 2) {
                o13.r.b(obj);
                objJ4 = ((o13.q) obj).f128597a;
                obj2 = objJ4;
                int i18 = o13.q.f128596b;
                if (obj2 instanceof o13.q.b) {
                    workoutDetailsDTO = (WorkoutDetailsDTO) obj2;
                    fVar2.E = false;
                    fVar2.f48605r = workoutDetailsDTO;
                    eVar = (e) v52.d.b(fVar2.Z);
                    if (eVar != null) {
                        jVar = fVar2.Y;
                        eVarC = eVar.C(workoutDetailsDTO, fVar2.I4(workoutDetailsDTO));
                        this.f48688a = obj2;
                        this.f48689b = fVar2;
                        this.f48690c = 0;
                        this.f48691d = 3;
                        if (v52.d.a(jVar, eVarC, this) != aVar) {
                            fVar = fVar2;
                            i15 = 0;
                            i14 = i15;
                            obj3 = obj2;
                            q53.w<v52.c<? extends d>> wVar2 = fVar.f48598k0;
                            d.c cVar = new d.c(true);
                            this.f48688a = obj3;
                            this.f48689b = null;
                            this.f48690c = i14;
                            this.f48691d = 4;
                        }
                    } else {
                        fVar = fVar2;
                        i14 = 0;
                        obj3 = obj2;
                        q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                        d.c cVar2 = new d.c(true);
                        this.f48688a = obj3;
                        this.f48689b = null;
                        this.f48690c = i14;
                        this.f48691d = 4;
                    }
                } else if (o13.q.b(obj2) != null) {
                    q53.w<v52.c<? extends d>> wVar4 = fVar2.f48598k0;
                    d.c cVar3 = new d.c(z14, i17, jVar2);
                    this.f48688a = obj2;
                    this.f48689b = null;
                    this.f48690c = 0;
                    this.f48691d = 5;
                }
                return aVar;
            }
            if (i16 == 3) {
                i15 = this.f48690c;
                fVar = this.f48689b;
                obj2 = this.f48688a;
                o13.r.b(obj);
                i14 = i15;
                obj3 = obj2;
                q53.w<v52.c<? extends d>> wVar5 = fVar.f48598k0;
                d.c cVar4 = new d.c(true);
                this.f48688a = obj3;
                this.f48689b = null;
                this.f48690c = i14;
                this.f48691d = 4;
            } else if (i16 == 4) {
                obj3 = this.f48688a;
                o13.r.b(obj);
                obj2 = obj3;
                if (o13.q.b(obj2) != null) {
                    q53.w<v52.c<? extends d>> wVar6 = fVar2.f48598k0;
                    d.c cVar5 = new d.c(z14, i17, jVar2);
                    this.f48688a = obj2;
                    this.f48689b = null;
                    this.f48690c = 0;
                    this.f48691d = 5;
                }
            } else {
                if (i16 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        WorkoutDetailsDTO workoutDetailsDTO2 = fVar2.f48605r;
        this.f48691d = 2;
        objJ4 = fVar2.J4(this.f48693f, workoutDetailsDTO2, this);
        if (objJ4 != aVar) {
            obj2 = objJ4;
            int i19 = o13.q.f128596b;
            if (obj2 instanceof o13.q.b) {
                if (o13.q.b(obj2) != null) {
                    q53.w<v52.c<? extends d>> wVar7 = fVar2.f48598k0;
                    d.c cVar6 = new d.c(z14, i17, jVar2);
                    this.f48688a = obj2;
                    this.f48689b = null;
                    this.f48690c = 0;
                    this.f48691d = 5;
                }
                return Unit.INSTANCE;
            }
            workoutDetailsDTO = (WorkoutDetailsDTO) obj2;
            fVar2.E = false;
            fVar2.f48605r = workoutDetailsDTO;
            eVar = (e) v52.d.b(fVar2.Z);
            if (eVar != null) {
                jVar = fVar2.Y;
                eVarC = eVar.C(workoutDetailsDTO, fVar2.I4(workoutDetailsDTO));
                this.f48688a = obj2;
                this.f48689b = fVar2;
                this.f48690c = 0;
                this.f48691d = 3;
                if (v52.d.a(jVar, eVarC, this) != aVar) {
                    fVar = fVar2;
                    i15 = 0;
                    i14 = i15;
                    obj3 = obj2;
                    q53.w<v52.c<? extends d>> wVar8 = fVar.f48598k0;
                    d.c cVar7 = new d.c(true);
                    this.f48688a = obj3;
                    this.f48689b = null;
                    this.f48690c = i14;
                    this.f48691d = 4;
                }
            } else {
                fVar = fVar2;
                i14 = 0;
                obj3 = obj2;
                q53.w<v52.c<? extends d>> wVar9 = fVar.f48598k0;
                d.c cVar8 = new d.c(true);
                this.f48688a = obj3;
                this.f48689b = null;
                this.f48690c = i14;
                this.f48691d = 4;
            }
        }
        return aVar;
    }
}
