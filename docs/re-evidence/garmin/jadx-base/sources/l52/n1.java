package l52;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$removeScheduleWorkoutFromTrainingPlan$2", f = "WorkoutsRepositoryImpl.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class n1 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f110319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f110320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(z zVar, long j8, long j14, t13.d<? super n1> dVar) {
        super(1, dVar);
        this.f110318b = zVar;
        this.f110319c = j8;
        this.f110320d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n1(this.f110318b, this.f110319c, this.f110320d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((n1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110317a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Unit>> i0VarW = this.f110318b.f110390a.w(this.f110319c, this.f110320d);
        this.f110317a = 1;
        Object objAwait = i0VarW.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
