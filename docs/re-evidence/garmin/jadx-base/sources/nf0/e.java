package nf0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.GHSAccountViewModel$checkMFAValid$1", f = "GHSAccountViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f125787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0<g3<Boolean>> f125788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, y0<g3<Boolean>> y0Var, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f125787c = dVar;
        this.f125788d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f125787c, this.f125788d, dVar);
        eVar.f125786b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f125786b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125785a;
        y0<g3<Boolean>> y0Var = this.f125788d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                d dVar = this.f125787c;
                this.f125786b = b0Var;
                this.f125785a = 1;
                obj = dVar.F4(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(bool));
        } catch (Exception e4) {
            a2 a2Var = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[checkMFAValid] ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GHSAccountViewModel", strD);
            y0Var.j(g3.a.a(g3.f35298f, null, e4, null, null, 13));
        }
        return Unit.INSTANCE;
    }
}
