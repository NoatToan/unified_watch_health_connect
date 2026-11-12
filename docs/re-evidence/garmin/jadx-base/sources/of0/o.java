package of0;

import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.IntroFragment;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.IntroFragment$showCannotCompleteDialog$1", f = "IntroFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f131695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntroFragment f131696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(o0 o0Var, IntroFragment introFragment, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f131695a = o0Var;
        this.f131696b = introFragment;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f131695a, this.f131696b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f131695a.show(this.f131696b.getChildFragmentManager(), (String) null);
        return Unit.INSTANCE;
    }
}
