package ei0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lhi0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$declineIncomingFollowingRequest$2", f = "FollowRepoImpl.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super c83.a0<hi0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f64253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f64254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Long l14, boolean z14, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f64252b = eVar;
        this.f64253c = l14;
        this.f64254d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f64252b, this.f64253c, this.f64254d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<hi0.c>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64251a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c cVar = this.f64252b.f64197a;
        Long l14 = this.f64253c;
        o53.i0<c83.a0<hi0.c>> i0VarW = cVar.w(l14 != null ? l14.longValue() : -1L, this.f64254d);
        this.f64251a = 1;
        Object objAwait = i0VarW.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
