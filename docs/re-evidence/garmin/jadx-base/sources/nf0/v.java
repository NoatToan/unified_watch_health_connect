package nf0;

import android.net.Uri;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.OnboardingViewModel$requestReloadECGOnboardingVideo$1", f = "OnboardingViewModel.kt", l = {306}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f125863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o oVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f125863c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f125863c, dVar);
        vVar.f125862b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f125862b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125861a;
        o oVar = this.f125863c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                oVar.f125824f.j(g3.a.c(g3.f35298f));
                y0<Integer> y0Var = oVar.f125832n;
                Integer numD = y0Var.d();
                y0Var.j(new Integer((numD != null ? numD.intValue() : 0) + 1));
                rd2.j jVar = rd2.f.a().f152045a;
                long j8 = oVar.f125821c;
                jVar.getClass();
                sd2.f fVarI = rd2.j.i(j8, null);
                String productNumber = fVarI != null ? fVarI.getProductNumber() : null;
                if (productNumber == null) {
                    o.H4(oVar);
                } else {
                    jf0.a aVar2 = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
                    this.f125862b = b0Var;
                    this.f125861a = 1;
                    obj = aVar2.g(productNumber, false, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            String str = (String) obj;
            if (str == null || d53.w.J(str)) {
                o.H4(oVar);
            } else {
                y0<g3<Uri>> y0Var2 = oVar.f125824f;
                g3.a aVar3 = g3.f35298f;
                Uri uri = Uri.parse(str);
                aVar3.getClass();
                y0Var2.j(g3.a.d(uri));
            }
        } catch (Exception e4) {
            a2 a2Var = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[requestReloadECGOnboardingVideo] error: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EcgOnboardingViewModel", strD);
            o.H4(oVar);
        }
        return Unit.INSTANCE;
    }
}
