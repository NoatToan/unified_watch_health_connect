package ew0;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingFinishSetupScreenKt$LifestyleLoggingFinishSetupScreen$2$1", f = "LifestyleLoggingFinishSetupScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f66193a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f66193a = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f66193a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        m mVar = this.f66193a;
        mVar.getClass();
        ge1.b.T(v1.a(mVar), null, null, new o(mVar, null), 3);
        return Unit.INSTANCE;
    }
}
