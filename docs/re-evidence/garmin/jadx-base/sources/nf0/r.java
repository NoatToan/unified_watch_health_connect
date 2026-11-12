package nf0;

import android.location.Location;
import androidx.lifecycle.y0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.OnboardingViewModel$getCurrentLocation$1", f = "OnboardingViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f125843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f125844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<Location> f125845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f125846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y0<Location> y0Var, o oVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f125845c = y0Var;
        this.f125846d = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f125845c, this.f125846d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125844b;
        if (i14 == 0) {
            o13.r.b(obj);
            mv0.e eVar = this.f125846d.f125822d;
            y0<Location> y0Var2 = this.f125845c;
            this.f125843a = y0Var2;
            this.f125844b = 1;
            obj = eVar.d("EcgOnboardingViewModel", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f125843a;
            o13.r.b(obj);
        }
        y0Var.j(obj);
        return Unit.INSTANCE;
    }
}
