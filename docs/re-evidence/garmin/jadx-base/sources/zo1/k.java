package zo1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideDetailsScreenKt$GroupRideDetailsModal$1$1", f = "GroupRideDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f206393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo1.h f206394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, yo1.h hVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f206393a = qVar;
        this.f206394b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f206393a, this.f206394b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        q qVar = this.f206393a;
        qVar.getClass();
        yo1.h hVar = this.f206394b;
        hVar.getClass();
        qVar.f206423j.k(null, hVar);
        return Unit.INSTANCE;
    }
}
