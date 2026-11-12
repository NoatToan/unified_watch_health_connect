package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$copyWorkout$1", f = "WorkoutDetailsViewModel.kt", l = {840, 843, 844, 847, 851}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f48685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f48686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f48687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Long l14, String str, f fVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f48685b = l14;
        this.f48686c = str;
        this.f48687d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f48685b, this.f48686c, this.f48687d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a A[PHI: r14
      0x005a: PHI (r14v8 java.lang.Object) = (r14v7 java.lang.Object), (r14v0 java.lang.Object) binds: [B:25:0x0057, B:14:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (v52.d.d(r1, r2, r13) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (v52.d.d(r14, r1, r13) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (v52.d.d(r14, r1, r13) == r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48684a;
        String str = this.f48686c;
        Long l14 = this.f48685b;
        int i15 = 1;
        f fVar = this.f48687d;
        WorkoutDetailsDTO workoutDetailsDTO = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i14 == 0) {
            o13.r.b(obj);
            if (l14 == null || str == null) {
                q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
                d.b bVar = new d.b(objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0);
                this.f48684a = 1;
            } else {
                q53.w<v52.c<? extends d>> wVar2 = fVar.f48598k0;
                v52.c.b bVar2 = v52.c.b.f175759a;
                this.f48684a = 2;
                if (wVar2.h(bVar2, this) != aVar) {
                    l52.y yVar = fVar.f48588b;
                    long jLongValue = l14.longValue();
                    this.f48684a = 3;
                    obj = yVar.T(jLongValue, str, this);
                    if (obj != aVar) {
                        v2Var = (v2) obj;
                        if (v2Var instanceof v2.b) {
                            i62.p pVar = i62.p.f91878a;
                            WorkoutDetailsDTO workoutDetailsDTO2 = (WorkoutDetailsDTO) ((v2.b) v2Var).f47386a;
                            String str2 = workoutDetailsDTO2.E;
                            Long l15 = new Long(workoutDetailsDTO2.f48040a);
                            pVar.getClass();
                            i62.p.a(l15, str2);
                            q53.w<v52.c<? extends d>> wVar3 = fVar.f48598k0;
                            d.b bVar3 = new d.b(workoutDetailsDTO2);
                            this.f48684a = 4;
                        } else {
                            if (!(v2Var instanceof v2.a)) {
                                u0.r();
                                return null;
                            }
                            q53.w<v52.c<? extends d>> wVar4 = fVar.f48598k0;
                            d.b bVar4 = new d.b(workoutDetailsDTO, i15, objArr3 == true ? 1 : 0);
                            this.f48684a = 5;
                        }
                    }
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        if (i14 == 2) {
            o13.r.b(obj);
            l52.y yVar2 = fVar.f48588b;
            long jLongValue2 = l14.longValue();
            this.f48684a = 3;
            obj = yVar2.T(jLongValue2, str, this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    i62.p pVar2 = i62.p.f91878a;
                    WorkoutDetailsDTO workoutDetailsDTO3 = (WorkoutDetailsDTO) ((v2.b) v2Var).f47386a;
                    String str3 = workoutDetailsDTO3.E;
                    Long l16 = new Long(workoutDetailsDTO3.f48040a);
                    pVar2.getClass();
                    i62.p.a(l16, str3);
                    q53.w<v52.c<? extends d>> wVar5 = fVar.f48598k0;
                    d.b bVar5 = new d.b(workoutDetailsDTO3);
                    this.f48684a = 4;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends d>> wVar6 = fVar.f48598k0;
                    d.b bVar6 = new d.b(workoutDetailsDTO, i15, objArr3 == true ? 1 : 0);
                    this.f48684a = 5;
                }
            }
            return aVar;
        }
        if (i14 == 3) {
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                i62.p pVar3 = i62.p.f91878a;
                WorkoutDetailsDTO workoutDetailsDTO4 = (WorkoutDetailsDTO) ((v2.b) v2Var).f47386a;
                String str4 = workoutDetailsDTO4.E;
                Long l17 = new Long(workoutDetailsDTO4.f48040a);
                pVar3.getClass();
                i62.p.a(l17, str4);
                q53.w<v52.c<? extends d>> wVar7 = fVar.f48598k0;
                d.b bVar7 = new d.b(workoutDetailsDTO4);
                this.f48684a = 4;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                q53.w<v52.c<? extends d>> wVar8 = fVar.f48598k0;
                d.b bVar8 = new d.b(workoutDetailsDTO, i15, objArr3 == true ? 1 : 0);
                this.f48684a = 5;
            }
        } else {
            if (i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
