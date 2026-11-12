package og1;

import android.content.Context;
import android.view.MenuItem;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Log1/b;", "Ld80/b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f131987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f131988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f131989c;

    public b(long j8, Context context, a aVar) {
        this.f131987a = j8;
        this.f131988b = context;
        this.f131989c = aVar;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        lj0.b bVar2 = lj0.b.f112951e;
        a aVar = this.f131989c;
        if (bVar != bVar2) {
            Toast.makeText(aVar.f131976a, R.string.txt_error_occurred, 0).show();
        }
        aVar.f131976a.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        l80.b bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
        long j8 = this.f131987a;
        if (j8 >= 0 && bVar.a(j8)) {
            bVar.n(this.f131988b, j8, "ActivityOptionsGCCalls");
        }
        a aVar2 = this.f131989c;
        ActivityOptionsActivity activityOptionsActivity = aVar2.f131976a;
        ActivityOptionsActivity activityOptionsActivity2 = aVar2.f131976a;
        Toast.makeText(activityOptionsActivity, activityOptionsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
        activityOptionsActivity2.f42535i = false;
        MenuItem menuItem = activityOptionsActivity2.f42536j;
        if (menuItem != null) {
            menuItem.setTitle(activityOptionsActivity2.getString(R.string.lbl_edit));
        }
        if (activityOptionsActivity2.f42532f != null) {
            com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a aVarFa = activityOptionsActivity2.fa();
            aVarFa.f42544e = false;
            aVarFa.notifyDataSetChanged();
        }
        if (activityOptionsActivity2.f42533g != null) {
            c cVarGa = activityOptionsActivity2.ga();
            cVarGa.f131993d = false;
            cVarGa.notifyDataSetChanged();
        }
        activityOptionsActivity2.hideProgressOverlay();
    }
}
