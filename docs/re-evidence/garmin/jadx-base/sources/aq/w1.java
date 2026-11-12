package aq;

import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesViewModel$updateExerciseSetList$1", f = "EditExercisesViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class w1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f12280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExerciseSetsDTO f12282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x1 x1Var, long j8, ExerciseSetsDTO exerciseSetsDTO, t13.d<? super w1> dVar) {
        super(2, dVar);
        this.f12280b = x1Var;
        this.f12281c = j8;
        this.f12282d = exerciseSetsDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w1(this.f12280b, this.f12281c, this.f12282d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12279a;
        x1 x1Var = this.f12280b;
        if (i14 == 0) {
            o13.r.b(obj);
            cw.s sVar = x1Var.f12290a;
            this.f12279a = 1;
            sVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(sVar, new cw.u(sVar, this.f12281c, this.f12282d, null), this);
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
        x1Var.f12294e.m((com.garmin.android.apps.connectmobile.v2) obj);
        return Unit.INSTANCE;
    }
}
