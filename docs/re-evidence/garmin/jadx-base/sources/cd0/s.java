package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class s implements bd0.v.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f26848a;

    public s(t tVar) {
        this.f26848a = tVar;
    }

    @Override // bd0.v.c
    public final void a() {
    }

    @Override // bd0.v.c
    public final void b(yl2.e eVar) {
        a2 a2Var = a2.DEVICES;
        StringBuilder sb3 = new StringBuilder("registerDevice: onFail: [");
        sb3.append(eVar != null ? eVar.name() : "");
        sb3.append("]");
        i2.f(a2Var, "EdgeNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", sb3.toString());
        i2.a(a2Var, "EdgeNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "registerDevice: END ****");
    }

    @Override // bd0.v.c
    public final void c() {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "EdgeNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "registerDevice: onSucceed");
        t tVar = this.f26848a;
        tVar.d();
        tVar.e();
        i2.a(a2Var, "EdgeNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "registerDevice: END ****");
    }
}
