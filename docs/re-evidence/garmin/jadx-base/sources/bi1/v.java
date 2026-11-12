package bi1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbi1/v;", "", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$q;", "watchFaceEnum", "", "viewId", "", "resourceName", "<init>", "(Ljava/lang/String;ILcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$q;ILjava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum v {
    VVM3_DIGITAL_SUB_EYE(DeviceSettingsDTO.q.ANALOG_GENERIC_1, R.id.watch_style_1, "digitalsubeye"),
    VVM3_MODERN_CURVE(DeviceSettingsDTO.q.ANALOG_GENERIC_2, R.id.watch_style_2, "moderncurve"),
    VVM3_CURVE_SUB_EYE(DeviceSettingsDTO.q.ANALOG_GENERIC_3, R.id.watch_style_3, "curvesubeye"),
    VVM3_BIG_DATA_TITLE_VALUE(DeviceSettingsDTO.q.ANALOG_GENERIC_4, R.id.watch_style_4, "bigdata"),
    VVM3_ICON_VALUE(DeviceSettingsDTO.q.ANALOG_GENERIC_5, R.id.watch_style_5, "iconvalue"),
    VVM3_ANALOG_CURVY_SUB_EYE(DeviceSettingsDTO.q.ANALOG_GENERIC_6, R.id.watch_style_6, "analog");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceSettingsDTO.q f18096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18098c;

    v(DeviceSettingsDTO.q qVar, int i14, String str) {
        this.f18096a = qVar;
        this.f18097b = i14;
        this.f18098c = str;
    }
}
