package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class r extends fb2.m<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27443f = View.generateViewId();

    public r(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF93293f() {
        return f27443f;
    }

    @Override // fb2.m
    public final String u() {
        return this.f70343a.getString(R.string.device_setting_autodisplay);
    }
}
