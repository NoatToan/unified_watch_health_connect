package et1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailsMainScreenKt$TrailsBottomSheetMainScreen$4$2$1$3$1", f = "TrailsMainScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i3.a1 f65722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f65723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(i3.a1 a1Var, p3.p1<Boolean> p1Var, t13.d<? super n1> dVar) {
        super(2, dVar);
        this.f65722a = a1Var;
        this.f65723b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n1(this.f65722a, this.f65723b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (!this.f65722a.f87409a.f88996e.f()) {
            this.f65723b.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
