package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class o implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f125973a;

    public o(p pVar) {
        this.f125973a = pVar;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving device settings to GC ["), "].", a2Var, "BaseDeviceSettings");
        boolean zA = bVar.a();
        int i14 = p.f125974l;
        p pVar = this.f125973a;
        pVar.displayFailedMessage(zA);
        pVar.hideProgressOverlay();
        pVar.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        p pVar = this.f125973a;
        long j8 = pVar.f125976b;
        if (j8 >= 0 && bVar.a(j8)) {
            bVar.n(pVar, pVar.f125976b, "BaseDeviceSettings");
        }
        Toast.makeText(pVar, pVar.getText(R.string.msg_settings_saved_successfully), 0).show();
        pVar.hideProgressOverlay();
        pVar.finish();
    }
}
