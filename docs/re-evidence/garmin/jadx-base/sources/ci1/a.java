package ci1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.ReOrderableWidgetActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class a implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReOrderableWidgetActivity f27659a;

    public a(ReOrderableWidgetActivity reOrderableWidgetActivity) {
        this.f27659a = reOrderableWidgetActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving device settings to GC ["), "].", a2Var, "ReOrderableWidgetActivity");
        boolean zA = bVar.a();
        int i14 = ReOrderableWidgetActivity.f43215i;
        ReOrderableWidgetActivity reOrderableWidgetActivity = this.f27659a;
        reOrderableWidgetActivity.displayFailedMessage(zA);
        reOrderableWidgetActivity.hideProgressOverlay();
        reOrderableWidgetActivity.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        ReOrderableWidgetActivity reOrderableWidgetActivity = this.f27659a;
        long j8 = reOrderableWidgetActivity.f43220e;
        if (j8 >= 0 && bVar.a(j8)) {
            bVar.n(reOrderableWidgetActivity, reOrderableWidgetActivity.f43220e, "ReOrderableWidgetActivity");
        }
        Toast.makeText(reOrderableWidgetActivity, reOrderableWidgetActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
        reOrderableWidgetActivity.hideProgressOverlay();
        reOrderableWidgetActivity.finish();
    }
}
