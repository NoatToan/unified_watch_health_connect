package of0;

import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.BirthDateFragment;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.BirthDateFragment$displayAgeRestrictionDialog$1", f = "BirthDateFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f131671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BirthDateFragment f131672b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o0 o0Var, BirthDateFragment birthDateFragment, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f131671a = o0Var;
        this.f131672b = birthDateFragment;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f131671a, this.f131672b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f131671a.show(this.f131672b.getChildFragmentManager(), (String) null);
        return Unit.INSTANCE;
    }
}
