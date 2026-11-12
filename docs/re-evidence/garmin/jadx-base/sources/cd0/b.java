package cd0;

import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import gg1.v0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f26760b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f26759a = i14;
        this.f26760b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26759a) {
            case 0:
                c cVar = this.f26760b;
                l80.b bVar = cVar.f26818f;
                long jC = cVar.c();
                if (jC <= 0) {
                    i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".disconnectDevice(shouldForgetDevice:true): ".concat(cVar.f26761g.toString()));
                    bVar.g(cVar.f26761g.f18886a);
                } else {
                    i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".disconnectDevice(shouldForgetDevice:true): " + jC);
                    bVar.t(jC);
                }
                break;
            case 1:
                this.f26760b.f26816d.e0();
                break;
            default:
                Intent intent = new Intent("android.intent.action.VIEW");
                StringBuilder sb3 = new StringBuilder();
                v0.T.getClass();
                sb3.append(v0.a.b().k());
                c cVar2 = this.f26760b;
                sb3.append(cVar2.f26813a.getString(R.string.invalid_unitid_help_url_path));
                intent.setData(Uri.parse(sb3.toString()));
                cVar2.f26813a.startActivity(intent);
                break;
        }
    }
}
