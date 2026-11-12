package ii0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.OthersFriendListScreenKt$OthersFriendListScreen$1$1", f = "OthersFriendListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc.d<p003ji0.m> f93667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d<p003ji0.m> f93668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f93669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(zc.d<p003ji0.m> dVar, zc.d<p003ji0.m> dVar2, p1<Boolean> p1Var, t13.d<? super l0> dVar3) {
        super(2, dVar3);
        this.f93667a = dVar;
        this.f93668b = dVar2;
        this.f93669c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f93667a, this.f93668b, this.f93669c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p1<Boolean> p1Var = this.f93669c;
        if (p1Var.getF182175a().booleanValue()) {
            zc.d<p003ji0.m> dVar = this.f93667a;
            if (dVar.d().f196390f || dVar.d().f196391g) {
                zc.d<p003ji0.m> dVar2 = this.f93668b;
                if (dVar2.d().f196390f || dVar2.d().f196391g) {
                    p1Var.setValue(Boolean.FALSE);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
