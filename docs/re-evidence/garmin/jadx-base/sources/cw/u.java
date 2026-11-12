package cw;

import c83.a0;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.biz.RepCountingRepo$updateExerciseSetList$2", f = "RepCountingRepo.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f55951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f55952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExerciseSetsDTO f55953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, long j8, ExerciseSetsDTO exerciseSetsDTO, t13.d<? super u> dVar) {
        super(1, dVar);
        this.f55951b = sVar;
        this.f55952c = j8;
        this.f55953d = exerciseSetsDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u(this.f55951b, this.f55952c, this.f55953d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((u) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55950a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<Unit>> i0VarA = this.f55951b.f55946a.a(this.f55952c, this.f55953d);
        this.f55950a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
