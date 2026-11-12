package zb0;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\tH'¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lzb0/c0;", "", "", "unitId", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "b", "(J)Lo53/i0;", "", "deviceSettingsJson", "", "a", "(JLjava/lang/String;)Lo53/i0;", "deviceId", "locationJson", "c", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c0 {
    @i83.k({"Content-Type: application/json"})
    @i83.p("device-service/deviceservice/device-info/settings/{unitId}")
    o53.i0<c83.a0<Unit>> a(@i83.s("unitId") long unitId, @i83.a String deviceSettingsJson);

    @i83.f("device-service/deviceservice/device-info/settings/{unitId}")
    o53.i0<c83.a0<DeviceSettingsDTO>> b(@i83.s("unitId") long unitId);

    @i83.k({"Content-Type: application/json"})
    @i83.p("devicesettings-service/deviceservice/device-info/settings/{deviceId}")
    o53.i0<c83.a0<Unit>> c(@i83.s("deviceId") long deviceId, @i83.a String locationJson);
}
