package ya0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.CompanionDeviceLinkRouteKt$CompanionDeviceLinkRoute$1$1", f = "CompanionDeviceLinkRoute.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f195423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f195424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e23.a<Unit> aVar, x3<Boolean> x3Var, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f195423a = aVar;
        this.f195424b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f195423a, this.f195424b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (p005kotlin.jvm.internal.s.g(this.f195424b.getF182175a(), Boolean.TRUE)) {
            this.f195423a.invoke();
        }
        return Unit.INSTANCE;
    }
}
