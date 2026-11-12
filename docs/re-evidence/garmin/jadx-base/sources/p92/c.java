package p92;

import androidx.lifecycle.z0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f136578b;

    public /* synthetic */ c(z0 z0Var, int i14) {
        this.f136577a = i14;
        this.f136578b = z0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f136577a;
        z0 z0Var = this.f136578b;
        switch (i14) {
            case 0:
                v92.j jVar = (v92.j) obj;
                o oVar = o.f136619a;
                y.f136664a.getClass();
                y.a.a("ConsentFeatureViewModel", "parentAction showDeviceUploadConsent = " + jVar);
                if (jVar != null && !jVar.f176411b) {
                    jVar.f176411b = true;
                    z0Var.onChanged(jVar.f176410a);
                }
                break;
            case 1:
                v92.k kVar = (v92.k) obj;
                o oVar2 = o.f136619a;
                if (kVar != null) {
                    z0Var.onChanged(kVar);
                }
                break;
            default:
                v92.j jVar2 = (v92.j) obj;
                o oVar3 = o.f136619a;
                y.f136664a.getClass();
                y.a.a("ConsentFeatureViewModel", "parentAction showConsent = " + jVar2);
                if (jVar2 != null && !jVar2.f176411b) {
                    jVar2.f176411b = true;
                    z0Var.onChanged(jVar2.f176410a);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
