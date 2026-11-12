package cd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bm2.d f26831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f26832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l80.a f26833d = (l80.a) KoinJavaComponent.get(l80.a.class);

    public n() {
        i2.a(a2.DEVICES, "BaseNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "constructor");
    }

    public void a() {
        i2.a(a2.DEVICES, "BaseNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "checkForSoftwareUpdate");
        bm2.d dVar = this.f26831b;
        if (dVar != null) {
            this.f26833d.I(dVar, this.f26832c);
        }
    }

    public void b(Context context, bm2.d dVar, byte[] bArr) {
        i2.a(a2.DEVICES, "BaseNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "onGarminDeviceXmlRead");
        this.f26830a = context;
        this.f26831b = dVar;
        this.f26832c = bArr;
        a();
        c();
    }

    public void c() {
        if (!hb2.i.a(this.f26830a)) {
            i2.a(a2.DEVICES, "BaseNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "requestSync: network NOT available, NOT calling util to request sync");
        } else {
            p.b(this.f26831b, "BaseNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy");
            i2.a(a2.DEVICES, "BaseNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "requestSync: network available, calling util to request sync");
        }
    }
}
