package ew0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingOnboardingViewModel$initOnboarding$1", f = "LifestyleLoggingOnboardingViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f66255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f66256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f66256c = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f66256c, dVar);
        nVar.f66255b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        o53.b0 b0Var = (o53.b0) this.f66255b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f66254a;
        m mVar = this.f66256c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = mVar.f66241h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, l.a((l) value, true, false, 4)));
            a2 a2Var = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "LifestyleLoggingOnboardingViewModel", "Initializing onboarding with behaviours");
            rv0.a aVar2 = mVar.f66240g;
            this.f66255b = b0Var;
            this.f66254a = 1;
            obj = aVar2.i(g22.l.d(b63.o.INSTANCE), this);
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            i53.f fVarJ = i53.a.j((Iterable) ((v2.b) v2Var).f47386a);
            p2 p2Var2 = mVar.f66243j;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, fVarJ));
            p2 p2Var3 = mVar.f66241h;
            do {
                value4 = p2Var3.getValue();
            } while (!p2Var3.b(value4, l.a((l) value4, false, false, 2)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to get behaviours: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "LifestyleLoggingOnboardingViewModel", strD);
            p2 p2Var4 = mVar.f66241h;
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, l.a((l) value2, false, true, 4)));
        }
        return Unit.INSTANCE;
    }
}
