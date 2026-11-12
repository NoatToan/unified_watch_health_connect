package ii0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.FriendListScreenKt$FriendListScreen$1$1", f = "FriendListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc.d<li0.d0> f93724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d<li0.d0> f93725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc.d<li0.d0> f93726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f93727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(zc.d<li0.d0> dVar, zc.d<li0.d0> dVar2, zc.d<li0.d0> dVar3, p1<Boolean> p1Var, t13.d<? super q> dVar4) {
        super(2, dVar4);
        this.f93724a = dVar;
        this.f93725b = dVar2;
        this.f93726c = dVar3;
        this.f93727d = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f93724a, this.f93725b, this.f93726c, this.f93727d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p1<Boolean> p1Var = this.f93727d;
        if (p1Var.getF182175a().booleanValue()) {
            zc.d<li0.d0> dVar = this.f93724a;
            if (dVar.d().f196390f || dVar.d().f196391g) {
                zc.d<li0.d0> dVar2 = this.f93725b;
                if (dVar2.d().f196390f || dVar2.d().f196391g) {
                    zc.d<li0.d0> dVar3 = this.f93726c;
                    if (dVar3.d().f196390f || dVar3.d().f196391g) {
                        p1Var.setValue(Boolean.FALSE);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
