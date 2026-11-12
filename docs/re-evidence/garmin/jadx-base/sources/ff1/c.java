package ff1;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lef1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.running_tolerance.data.repository.RunningToleranceRepositoryImpl$getRunningTolerancePreferences$2", f = "RunningToleranceRepositoryImpl.kt", l = {49}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<ef1.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71123b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f71123b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f71123b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ef1.c>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71122a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<ef1.c>> i0VarC = this.f71123b.f71132a.c();
        this.f71122a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
