package ju0;

import c83.a0;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lju0/a;", "", "", "deviceId", "Lo53/i0;", "Lc83/a0;", "Lju0/q;", "c", "(Ljava/lang/String;)Lo53/i0;", "liveEventSharingSettingsDTO", "a", "(Ljava/lang/String;Lju0/q;)Lo53/i0;", "", "value", "garminGuid", "userId", "b", "(ZLjava/lang/String;Ljava/lang/String;)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.p("/device-service/deviceservice/device-info/settings/{deviceId}")
    i0<a0<q>> a(@s("deviceId") String deviceId, @i83.a q liveEventSharingSettingsDTO);

    @i83.o("/gdprconsent-service/event/shareLiveEvent/{value}")
    i0<a0<String>> b(@s("value") boolean value, @i83.i("GARMIN_GUID") String garminGuid, @i83.i("USER_ID") String userId);

    @i83.f("/device-service/deviceservice/device-info/settings/{deviceId}")
    i0<a0<q>> c(@s("deviceId") String deviceId);
}
