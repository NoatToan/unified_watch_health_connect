package zn2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\b¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lzn2/c;", "", "", "deviceId", "Lo53/i0;", "Lc83/a0;", "Lfo2/f;", "a", "(J)Lo53/i0;", "", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c {
    @i83.f("/device-service/deviceregistration/device/status/{device_id}")
    o53.i0<c83.a0<fo2.f>> a(@i83.s(encoded = true, value = "device_id") long deviceId);

    @i83.p("/device-service/deviceregistration/device/status/active/{device_id}")
    o53.i0<c83.a0<Unit>> b(@i83.s(encoded = true, value = "device_id") long deviceId);
}
