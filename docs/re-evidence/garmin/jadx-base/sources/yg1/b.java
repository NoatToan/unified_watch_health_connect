package yg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.controlsmenu.ControlsMenuActivity;

/* JADX INFO: loaded from: classes10.dex */
public class b implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlsMenuActivity f196908a;

    public b(ControlsMenuActivity controlsMenuActivity) {
        this.f196908a = controlsMenuActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        if (bVar != lj0.b.f112951e) {
            Toast.makeText(this.f196908a, R.string.txt_error_occurred, 0).show();
        }
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        if (obj != null) {
            ControlsMenuActivity controlsMenuActivity = this.f196908a;
            controlsMenuActivity.f42880t.f33905x.clear();
            controlsMenuActivity.f42880t.f33905x = ((j) obj).f196933a;
            controlsMenuActivity.f42866e.a();
            controlsMenuActivity.f42867f.notifyDataSetChanged();
            controlsMenuActivity.ga();
            controlsMenuActivity.ca();
            controlsMenuActivity.ha();
        }
    }
}
