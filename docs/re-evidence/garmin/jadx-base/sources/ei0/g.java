package ei0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lhi0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$acceptIncomingFollowingRequest$2", f = "FollowRepoImpl.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super c83.a0<hi0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f64218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, Long l14, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f64217b = eVar;
        this.f64218c = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f64217b, this.f64218c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<hi0.c>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64216a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c cVar = this.f64217b.f64197a;
        Long l14 = this.f64218c;
        o53.i0<c83.a0<hi0.c>> i0VarH = cVar.h(l14 != null ? l14.longValue() : -1L);
        this.f64216a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
