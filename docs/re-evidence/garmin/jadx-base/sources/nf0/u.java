package nf0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.samd.data.model.DeviceAppLaunchFailureException;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.OnboardingViewModel$launchEcgAppOnDevice$1", f = "OnboardingViewModel.kt", l = {159}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f125856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f125857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f125858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f125859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0<g3<Unit>> f125860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o oVar, y0<g3<Unit>> y0Var, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f125859d = oVar;
        this.f125860e = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f125859d, this.f125860e, dVar);
        uVar.f125858c = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String strA;
        Object objK;
        o53.b0 b0Var = (o53.b0) this.f125858c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125857b;
        y0<g3<Unit>> y0Var = this.f125860e;
        o oVar = this.f125859d;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = o.f125820q;
            oVar.getClass();
            ff0.i iVar = oVar.f125784a;
            long j8 = oVar.f125821c;
            strA = iVar.a(j8);
            a2 a2Var = a2.ONBOARDING;
            String strU = v.h.u(j8, "[launchEcgAppOnDevice] deviceUnitId= ", " macAddress=", strA);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EcgOnboardingViewModel", strU);
            if (strA != null) {
                this.f125858c = b0Var;
                this.f125856a = strA;
                this.f125857b = 1;
                objK = iVar.k(j8, strA, this);
                if (objK == aVar) {
                    return aVar;
                }
            } else {
                i2.a.f(a2Var, "EcgOnboardingViewModel", "[launchEcgAppOnDevice] invalid mac address");
                y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str = this.f125856a;
        o13.r.b(obj);
        strA = str;
        objK = obj;
        rf1.f fVar = (rf1.f) objK;
        if (fVar instanceof rf1.f.d) {
            a2 a2Var2 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "EcgOnboardingViewModel", "[launchEcgAppOnDevice] ECG app launched on device");
            y0Var.j(g3.a.e(g3.f35298f));
            int i16 = o.f125820q;
            oVar.getClass();
            x xVar = new x(strA, oVar);
            oVar.f125826h = xVar;
            da2.d.b().f58886a.b(xVar);
        } else if (fVar instanceof rf1.f.a) {
            a2 a2Var3 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "EcgOnboardingViewModel", "[launchEcgAppOnDevice] could not launch ");
            Exception exc = ((rf1.f.a) fVar).f152424a;
            if (exc != null) {
                i2.a.f(a2Var3, "EcgOnboardingViewModel", "[launchEcgAppOnDevice] error: " + exc);
            }
            y0Var.j(g3.a.a(g3.f35298f, null, exc, null, null, 13));
        } else if (fVar instanceof rf1.f.c) {
            a2 a2Var4 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var4, "EcgOnboardingViewModel", "[launchEcgAppOnDevice] device not connected");
            y0Var.j(g3.a.a(g3.f35298f, "Device not connected", new DeviceAppLaunchFailureException(rf1.a.DEVICE_NOT_CONNECTED), null, null, 12));
        } else {
            if (!(fVar instanceof rf1.f.b)) {
                u0.r();
                return null;
            }
            o.J4(oVar);
            a2 a2Var5 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var5, "EcgOnboardingViewModel", "[launchEcgAppOnDevice] ECG not supported by device");
            y0Var.j(g3.a.a(g3.f35298f, "ECG not supported by device", null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
