package v12;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f174700b;

    public /* synthetic */ f(h hVar, int i14) {
        this.f174699a = i14;
        this.f174700b = hVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f174699a;
        h hVar = this.f174700b;
        switch (i14) {
            case 0:
                PrivacyType privacyType = (PrivacyType) obj;
                h.a aVar = h.f174703f;
                privacyType.getClass();
                hVar.u6().z4(new w.d(privacyType));
                return Unit.INSTANCE;
            default:
                x0 x0Var = (x0) obj;
                x0Var.getClass();
                return dh.b.B(hVar, x0Var.f4360c);
        }
    }
}
