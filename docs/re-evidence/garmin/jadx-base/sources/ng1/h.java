package ng1;

import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.settings.devices.WeatherLocationSettings;

/* JADX INFO: loaded from: classes10.dex */
public class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f125938a;

    public h(j jVar) {
        this.f125938a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        j jVar = this.f125938a;
        jVar.startActivity(new Intent(jVar, (Class<?>) WeatherLocationSettings.class));
    }
}
