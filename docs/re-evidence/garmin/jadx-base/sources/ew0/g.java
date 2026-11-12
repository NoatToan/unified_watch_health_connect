package ew0;

import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingOnboardingCheckScreenKt$LifestyleLoggingOnboardingCheckScreen$3$1", f = "LifestyleLoggingOnboardingCheckScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<i> f66214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f66215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f66216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x3<i> x3Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f66214a = x3Var;
        this.f66215b = aVar;
        this.f66216c = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f66214a, this.f66215b, this.f66216c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Boolean bool = this.f66214a.getF182175a().f66223c;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (zBooleanValue) {
                this.f66215b.invoke();
            } else {
                if (zBooleanValue) {
                    u0.r();
                    return null;
                }
                this.f66216c.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
