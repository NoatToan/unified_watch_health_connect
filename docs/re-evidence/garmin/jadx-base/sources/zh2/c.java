package zh2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.snackbar.Snackbar;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzh2/c;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.androiddynamicsettings.app.presentationlayer.b f204805a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkCapabilities networkCapabilities;
        com.garmin.androiddynamicsettings.app.presentationlayer.b bVar = this.f204805a;
        if (bVar == null || context == null) {
            return;
        }
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        boolean z14 = false;
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(4))) {
            z14 = true;
        }
        bVar.f50696h = z14;
        if (z14) {
            Snackbar snackbar = bVar.f50694f;
            if (snackbar != null) {
                snackbar.dismiss();
                return;
            }
            return;
        }
        Snackbar snackbarMake = Snackbar.make(bVar.findViewById(R.id.app_container_frame), bVar.getString(R.string.settings_internet_lost_save_error), -1);
        bVar.f50694f = snackbarMake;
        if (snackbarMake != null) {
            snackbarMake.setBackgroundTint(a7.b.getColor(bVar, R.color.dsl_settings_color_dialog_background));
        }
        Snackbar snackbar2 = bVar.f50694f;
        if (snackbar2 != null) {
            snackbar2.setTextColor(a7.b.getColor(bVar, R.color.dsl_settings_color_dialog_text));
        }
        Snackbar snackbar3 = bVar.f50694f;
        if (snackbar3 != null) {
            snackbar3.show();
        }
    }
}
