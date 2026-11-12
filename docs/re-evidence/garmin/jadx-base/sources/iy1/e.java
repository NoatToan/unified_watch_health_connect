package iy1;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.workouts.biz.WorkoutRepo$saveBenchmarkExercisesAsync$2", f = "WorkoutRepo.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f95838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f95839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f95838b = cVar;
        this.f95839c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f95838b, this.f95839c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95837a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Unit>> i0VarA = this.f95838b.f95833a.a(this.f95839c);
        this.f95837a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
