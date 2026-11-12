package fo;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListScreenKt$ActivitiesListScreen$1$2$4$1", f = "ActivitiesListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f72396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f72397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc.d<wo0.a> f72398c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, e23.a<Unit> aVar, zc.d<wo0.a> dVar, t13.d<? super n> dVar2) {
        super(2, dVar2);
        this.f72396a = qVar;
        this.f72397b = aVar;
        this.f72398c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f72396a, this.f72397b, this.f72398c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a0 a0Var = this.f72396a.f72411j;
        if (a0Var != null && a0Var.f72259c) {
            this.f72397b.invoke();
            this.f72398c.e();
        }
        return Unit.INSTANCE;
    }
}
