package nf0;

import android.net.Uri;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.OnboardingViewModel$fetchECGOnboardingVideo$1", f = "OnboardingViewModel.kt", l = {258}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f125839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f125840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f125841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f125842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f125842d = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f125842d, dVar);
        qVar.f125841c = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o oVar;
        g3<Uri> g3VarA;
        o53.b0 b0Var = (o53.b0) this.f125841c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125840b;
        o oVar2 = this.f125842d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                y0<g3<Uri>> y0Var = oVar2.f125824f;
                y0<g3<Uri>> y0Var2 = oVar2.f125824f;
                g3.a aVar2 = g3.f35298f;
                y0Var.j(g3.a.c(aVar2));
                rd2.j jVar = rd2.f.a().f152045a;
                long j8 = oVar2.f125821c;
                jVar.getClass();
                sd2.f fVarI = rd2.j.i(j8, null);
                String productNumber = fVarI != null ? fVarI.getProductNumber() : null;
                if (((u0) u0.f203782n6.get(productNumber)) == null || productNumber == null) {
                    y0Var2.j(g3.a.a(aVar2, "", null, null, null, 14));
                } else {
                    jf0.a aVar3 = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
                    this.f125841c = b0Var;
                    this.f125839a = oVar2;
                    this.f125840b = 1;
                    obj = aVar3.g(productNumber, (4 & 2) != 0, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oVar = this.f125839a;
            o13.r.b(obj);
            String str = (String) obj;
            y0<g3<Uri>> y0Var3 = oVar.f125824f;
            if (str == null || !(!d53.w.J(str))) {
                g3VarA = g3.a.a(g3.f35298f, "", null, null, null, 14);
            } else {
                g3.a aVar4 = g3.f35298f;
                Uri uri = Uri.parse(str);
                aVar4.getClass();
                g3VarA = g3.a.d(uri);
            }
            y0Var3.j(g3VarA);
        } catch (Exception e4) {
            a2 a2Var = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[fetchECGOnboardingVideo] error: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EcgOnboardingViewModel", strD);
            oVar2.f125824f.j(g3.a.a(g3.f35298f, null, e4, null, null, 13));
        }
        return Unit.INSTANCE;
    }
}
