package nf0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.OnboardingViewModel$setEcgOnboardingStatusCompleted$1", f = "OnboardingViewModel.kt", l = {244}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f125866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o oVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f125866c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f125866c, dVar);
        wVar.f125865b = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125864a;
        if (i14 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EcgOnboardingViewModel", "[setEcgOnboardingStatusCompleted] exit onboarding -> ECG completed");
            int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
            o oVar = this.f125866c;
            long j8 = oVar.f125821c;
            this.f125865b = null;
            this.f125864a = 1;
            if (oVar.f125830l.h(userProfilePk, j8, this) == aVar) {
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
