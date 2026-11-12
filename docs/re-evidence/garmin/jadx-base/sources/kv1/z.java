package kv1;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ljv1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.UserSettingsRepo$getAdaptiveCoachingWorkouts$2", f = "UserSettingsRepo.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends jv1.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f106807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, t13.d<? super z> dVar) {
        super(1, dVar);
        this.f106807b = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f106807b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends jv1.b>>> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106806a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<List<jv1.b>>> i0VarC = this.f106807b.f106803a.c();
        this.f106806a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
