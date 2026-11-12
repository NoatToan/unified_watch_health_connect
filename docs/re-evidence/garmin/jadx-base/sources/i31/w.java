package i31;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.IgnoreOnboardingPromptUseCase$invoke$1", f = "IgnoreOnboardingPromptUseCase.kt", l = {25}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f90768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d31.d f90769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, d31.d dVar, t13.d<? super w> dVar2) {
        super(2, dVar2);
        this.f90768b = xVar;
        this.f90769c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f90768b, this.f90769c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f90767a;
        if (i14 == 0) {
            o13.r.b(obj);
            x xVar = this.f90768b;
            b31.h hVar = xVar.f90770a;
            d31.c cVar = d31.c.IGNORED;
            long userProfilePk = xVar.f90771b.getUserProfilePk();
            this.f90767a = 1;
            if (hVar.b(userProfilePk, this.f90769c, cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ((o13.q) obj).getClass();
        }
        return Unit.INSTANCE;
    }
}
