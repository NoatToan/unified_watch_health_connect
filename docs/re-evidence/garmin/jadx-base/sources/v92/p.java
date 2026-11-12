package v92;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f176461b;

    public /* synthetic */ p(r rVar, int i14) {
        this.f176460a = i14;
        this.f176461b = rVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f176460a;
        r rVar = this.f176461b;
        switch (i14) {
            case 0:
                int i15 = r.f176465l;
                rVar.G4();
                break;
            default:
                rVar.getClass();
                p92.y.f136664a.getClass();
                p92.y.a.a("ConsentFeatureViewModel", "fetchDeviceUploadConsent()");
                ge1.b.T(v1.a(rVar), null, null, new x(rVar, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
