package ui1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lui1/a1;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository$isExistingUser$newUserResult$1", f = "InReachSubscriptionRepository.kt", l = {147}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.l<t13.d<? super c83.a0<a1>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f171395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f171396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f171397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(l lVar, long j8, t13.d<? super v> dVar) {
        super(1, dVar);
        this.f171396b = lVar;
        this.f171397c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v(this.f171396b, this.f171397c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<a1>> dVar) {
        return ((v) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171395a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<a1>> i0VarE = this.f171396b.f171317c.e(this.f171397c);
        this.f171395a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
