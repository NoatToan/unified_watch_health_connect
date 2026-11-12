package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.InReachSubscriptionNavKt$inReachSubscriptionGraph$1$1$1$1", f = "InReachSubscriptionNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f26346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<wa0.c.b> f26347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(e23.a<Unit> aVar, p3.x3<wa0.c.b> x3Var, t13.d<? super m2> dVar) {
        super(2, dVar);
        this.f26346a = aVar;
        this.f26347b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m2(this.f26346a, this.f26347b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f26347b.getF182175a().f183771b) {
            this.f26346a.invoke();
        }
        return Unit.INSTANCE;
    }
}
