package cd0;

import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import gg1.v0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f26786b;

    public /* synthetic */ e(g gVar, int i14) {
        this.f26785a = i14;
        this.f26786b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26785a) {
            case 0:
                g gVar = this.f26786b;
                l80.b bVar = gVar.f26818f;
                long jC = gVar.c();
                if (jC <= 0) {
                    i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".disconnectDevice(shouldForgetDevice:true): ".concat(gVar.f26796g.toString()));
                    bVar.g(gVar.f26796g.f18886a);
                } else {
                    i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".disconnectDevice(shouldForgetDevice:true): " + jC);
                    bVar.t(jC);
                }
                break;
            case 1:
                this.f26786b.f26816d.e0();
                break;
            default:
                Intent intent = new Intent("android.intent.action.VIEW");
                StringBuilder sb3 = new StringBuilder();
                v0.T.getClass();
                sb3.append(v0.a.b().k());
                g gVar2 = this.f26786b;
                sb3.append(gVar2.f26813a.getString(R.string.invalid_unitid_help_url_path));
                intent.setData(Uri.parse(sb3.toString()));
                gVar2.f26813a.startActivity(intent);
                break;
        }
    }
}
