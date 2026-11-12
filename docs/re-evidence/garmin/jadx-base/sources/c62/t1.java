package c62;

import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$fetchMSNWorkoutDetails$1", f = "WorkoutDetailsViewModel.kt", l = {338}, m = "invokeSuspend", v = 2)
public final class t1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24900d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$fetchMSNWorkoutDetails$1$1", f = "WorkoutDetailsViewModel.kt", l = {339, 342, 344, 349}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f24903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f24904d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, String str, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f24902b = fVar;
            this.f24903c = str;
            this.f24904d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f24902b, this.f24903c, this.f24904d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        
            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.z4(r7, r9, r2, r8) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            WorkoutDetailsDTO workoutDetailsDTO;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f24901a;
            String str = this.f24904d;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar = this.f24902b;
            if (i14 == 0) {
                o13.r.b(obj);
                l52.y yVar = fVar.f48588b;
                this.f24901a = 1;
                obj = yVar.t(this.f24903c, str, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                workoutDetailsDTO = fVar.f48605r;
                if (workoutDetailsDTO != null && (r9 = workoutDetailsDTO.D) != null) {
                    this.f24901a = 3;
                }
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                fVar.f48605r = (WorkoutDetailsDTO) ((v2.b) v2Var).f47386a;
                this.f24901a = 2;
                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar, this) != aVar) {
                    workoutDetailsDTO = fVar.f48605r;
                    if (workoutDetailsDTO != null) {
                        this.f24901a = 3;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar = fVar.Y;
                v52.c.a aVar2 = new v52.c.a(null, 1, null);
                this.f24901a = 4;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, String str, String str2, t13.d<? super t1> dVar) {
        super(2, dVar);
        this.f24898b = fVar;
        this.f24899c = str;
        this.f24900d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t1(this.f24898b, this.f24899c, this.f24900d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24897a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f24898b, this.f24899c, this.f24900d, null);
            this.f24897a = 1;
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
