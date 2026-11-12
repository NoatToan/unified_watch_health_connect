package hg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.activityoptions.SportActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class n implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SportActivity f83718a;

    public n(SportActivity sportActivity) {
        this.f83718a = sportActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving activity options to GC ["), "].", a2Var, "SportActivity");
        lj0.b bVar2 = lj0.b.f112951e;
        SportActivity sportActivity = this.f83718a;
        if (bVar != bVar2) {
            Toast.makeText(sportActivity, R.string.txt_error_occurred, 0).show();
        }
        sportActivity.hideProgressOverlay();
        sportActivity.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        SportActivity sportActivity = this.f83718a;
        long j8 = sportActivity.f41690f;
        if (j8 >= 0 && bVar.a(j8)) {
            bVar.n(sportActivity, sportActivity.f41690f, "SportActivity");
        }
        Toast.makeText(sportActivity, sportActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
        sportActivity.hideProgressOverlay();
        sportActivity.finish();
    }
}
