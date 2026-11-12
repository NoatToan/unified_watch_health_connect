package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\nB\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lch1/h6;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "deviceUnitId", "(Landroid/content/Context;J)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h6 extends fb2.m<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27371g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27372f;

    static {
        new a(null);
        f27371g = View.generateViewId();
    }

    public h6(Context context, long j8) {
        super(context);
        this.f27372f = j8;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.m
    public final String s() {
        int iOrdinal = SupportedCapability.WIFI_SETUP.ordinal();
        long j8 = this.f27372f;
        boolean zI = km2.a.i(j8, null, iOrdinal);
        if (km2.a.i(j8, null, SupportedCapability.BASIC_MUSIC_CONTROLS.ordinal()) || km2.a.i(j8, null, SupportedCapability.ADVANCED_MUSIC_CONTROLS.ordinal())) {
            return this.f70343a.getString(R.string.lbl_wifi_and_music_field_description);
        }
        if (zI) {
            return this.f70343a.getString(R.string.lbl_wifi_field_description);
        }
        return null;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return f27371g;
    }

    @Override // fb2.m
    public final String u() {
        String string = this.f70343a.getString(R.string.smart_scale_device_settings_wifi_networks);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/h6$a;", "", "<init>", "()V", "", "DEFAULT_BUTTON_ID", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h6(Context context) {
        super(context);
    }
}
