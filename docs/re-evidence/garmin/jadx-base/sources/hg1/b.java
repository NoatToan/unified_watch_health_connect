package hg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.activityoptions.DisplayBacklightActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class b implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DisplayBacklightActivity f83674a;

    public b(DisplayBacklightActivity displayBacklightActivity) {
        this.f83674a = displayBacklightActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving activity options to GC ["), "].", a2Var, "DisplayBacklightActivity");
        lj0.b bVar2 = lj0.b.f112951e;
        DisplayBacklightActivity displayBacklightActivity = this.f83674a;
        if (bVar != bVar2) {
            Toast.makeText(displayBacklightActivity, R.string.txt_error_occurred, 0).show();
        }
        displayBacklightActivity.hideProgressOverlay();
        displayBacklightActivity.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        DisplayBacklightActivity displayBacklightActivity = this.f83674a;
        long j8 = displayBacklightActivity.f41626a;
        if (j8 >= 0 && bVar.a(j8)) {
            bVar.n(displayBacklightActivity, displayBacklightActivity.f41626a, "DisplayBacklightActivity");
        }
        Toast.makeText(displayBacklightActivity, displayBacklightActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
        displayBacklightActivity.hideProgressOverlay();
        displayBacklightActivity.finish();
    }
}
