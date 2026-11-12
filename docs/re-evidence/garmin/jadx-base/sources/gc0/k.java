package gc0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.w2;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76877a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f76878b;

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f76877a;
        y0 y0Var = this.f76878b;
        switch (i14) {
            case 0:
                int i15 = l.f76879m;
                ((Throwable) obj).getClass();
                y0Var.j(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                v2 v2Var = (v2) obj;
                int i16 = vj1.i.B;
                if (v2Var instanceof v2.b) {
                    y0Var.j(g3.a.e(g3.f35298f));
                } else if (v2Var instanceof v2.a) {
                    v2.a aVar = (v2.a) v2Var;
                    w2.b(aVar, a2.ONBOARDING, "EmergencyCallingViewModel", "Save ECC contacts error");
                    y0Var.j(g3.a.a(g3.f35298f, null, aVar.f47383a, null, null, 13));
                } else {
                    if (v2Var != null) {
                        u0.r();
                        return null;
                    }
                    a2 a2Var = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "EmergencyCallingViewModel", "ECC contacts model is null");
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(y0 y0Var, vj1.i iVar) {
        this.f76878b = y0Var;
    }
}
