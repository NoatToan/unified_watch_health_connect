package fj1;

import c83.a0;
import gj1.h;
import i83.p;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u0004H'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lfj1/a;", "", "", "deviceId", "Lo53/i0;", "Lc83/a0;", "Lgj1/h;", "b", "(J)Lo53/i0;", "", "a", "Lgj1/d;", "primaryTrainingDeviceDTO", "d", "(Lgj1/d;)Lo53/i0;", "Lgj1/f;", "c", "()Lo53/i0;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @p("device-service/deviceservice/device-info/{deviceId}/primary-activity-tracker")
    i0<a0<Unit>> a(@s("deviceId") long deviceId);

    @i83.f("device-service/deviceservice/user-device/{deviceId}")
    i0<a0<h>> b(@s("deviceId") long deviceId);

    @i83.f("mobile-gateway/device-info/primary-training-device")
    i0<a0<gj1.f>> c();

    @p("userprofile-service/userprofile/user-settings/primary-training-device")
    i0<a0<Unit>> d(@i83.a gj1.d primaryTrainingDeviceDTO);
}
