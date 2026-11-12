package r31;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingViewModel$refreshOnboardingStateOnAppResume$1", f = "DeviceOnboardingViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f150023b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f150023b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f150023b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150022a;
        if (i14 == 0) {
            o13.r.b(obj);
            g gVar = this.f150023b;
            i31.b0 b0Var = gVar.f150013d;
            long j8 = gVar.f150010a;
            this.f150022a = 1;
            if (b0Var.a(j8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
