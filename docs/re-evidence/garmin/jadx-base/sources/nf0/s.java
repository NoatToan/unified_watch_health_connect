package nf0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.OnboardingViewModel$isEcgAppEnabledOnDevice$1", f = "OnboardingViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f125849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0<g3<Boolean>> f125850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o oVar, y0<g3<Boolean>> y0Var, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f125849c = oVar;
        this.f125850d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f125849c, this.f125850d, dVar);
        sVar.f125848b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objH;
        o53.b0 b0Var = (o53.b0) this.f125848b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125847a;
        y0<g3<Boolean>> y0Var = this.f125850d;
        o oVar = this.f125849c;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = o.f125820q;
            oVar.getClass();
            ff0.i iVar = oVar.f125784a;
            long j8 = oVar.f125821c;
            String strA = iVar.a(j8);
            a2 a2Var = a2.ONBOARDING;
            String strU = v.h.u(j8, "[isEcgAppEnabledOnDevice] deviceUnitId= ", " macAddress=", strA);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EcgOnboardingViewModel", strU);
            if (strA != null) {
                this.f125848b = b0Var;
                this.f125847a = 1;
                objH = iVar.h(j8, strA, this);
                if (objH == aVar) {
                    return aVar;
                }
            } else {
                i2.a.f(a2Var, "EcgOnboardingViewModel", "[isEcgAppEnabledOnDevice] invalid mac address");
                y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        objH = obj;
        rf1.f fVar = (rf1.f) objH;
        if (fVar instanceof rf1.f.d) {
            Boolean bool = (Boolean) ((rf1.f.d) fVar).f152427a;
            i2.f36769a.getClass();
            i2.a.b(a2.ONBOARDING, "EcgOnboardingViewModel", "[isEcgAppEnabledOnDevice] ECG app enabled check result=" + bool);
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(bool));
        } else if (fVar instanceof rf1.f.a) {
            Exception exc = ((rf1.f.a) fVar).f152424a;
            a2 a2Var2 = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "[isEcgAppEnabledOnDevice] error: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "EcgOnboardingViewModel", strD);
            y0Var.j(g3.a.a(g3.f35298f, null, exc, null, null, 13));
        } else if (fVar instanceof rf1.f.c) {
            a2 a2Var3 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "EcgOnboardingViewModel", "[isEcgAppEnabledOnDevice] device not connected");
            y0Var.j(g3.a.a(g3.f35298f, "Device not connected", new IllegalStateException(), null, null, 12));
        } else {
            if (!(fVar instanceof rf1.f.b)) {
                u0.r();
                return null;
            }
            o.J4(oVar);
            a2 a2Var4 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var4, "EcgOnboardingViewModel", "[isEcgAppEnabledOnDevice] ECG not supported by device");
            y0Var.j(g3.a.a(g3.f35298f, "ECG not supported by device", null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
