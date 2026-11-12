package ta0;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f163249b;

    public /* synthetic */ c(x xVar, int i14) {
        this.f163248a = i14;
        this.f163249b = xVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f163248a) {
            case 0:
                x xVar = this.f163249b;
                xVar.getClass();
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceDiscoveryViewModel", "Fetching compatible devices");
                ge1.b.T(v1.a(xVar), null, null, new z(xVar, null), 3);
                break;
            case 1:
                this.f163249b.y4(l90.c.REJECT);
                break;
            default:
                this.f163249b.y4(l90.c.REJECT);
                break;
        }
        return Unit.INSTANCE;
    }
}
