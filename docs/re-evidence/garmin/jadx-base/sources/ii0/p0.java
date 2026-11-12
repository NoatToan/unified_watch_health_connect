package ii0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.SearchFriendListKt$SearchFriendList$1$1", f = "SearchFriendList.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc.d<li0.d0> f93722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f93723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(zc.d<li0.d0> dVar, p1<Boolean> p1Var, t13.d<? super p0> dVar2) {
        super(2, dVar2);
        this.f93722a = dVar;
        this.f93723b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p0(this.f93722a, this.f93723b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        zc.d<li0.d0> dVar = this.f93722a;
        z0 z0Var = dVar.d().f196385a;
        z0.b bVar = z0.b.f196664b;
        this.f93723b.setValue(Boolean.valueOf(p005kotlin.jvm.internal.s.g(z0Var, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar)));
        return Unit.INSTANCE;
    }
}
