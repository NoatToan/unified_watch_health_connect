package sz0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Luz0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsRepo$getInboxRequestCount$2", f = "NotificationsRepo.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.l<t13.d<? super c83.a0<uz0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f161393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(a0 a0Var, t13.d<? super e0> dVar) {
        super(1, dVar);
        this.f161393b = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e0(this.f161393b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<uz0.c>> dVar) {
        return ((e0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161392a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        vz0.d dVar = this.f161393b.f161326a;
        vz0.b.f180871b.getClass();
        o53.i0<c83.a0<uz0.c>> i0VarE = dVar.e(vz0.b.a.a(), p13.x.k("PREMIUM_FRIEND", "FRAMED_FRIEND"));
        this.f161392a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
