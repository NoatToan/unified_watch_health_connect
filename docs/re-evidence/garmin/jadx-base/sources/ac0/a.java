package ac0;

import c83.a0;
import i83.f;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lac0/a;", "", "", "", "compatibleProducts", "Lo53/i0;", "Lc83/a0;", "Lqv/a;", "c", "(Ljava/util/List;)Lo53/i0;", "", "deviceId", "fromDeviceId", "", "b", "(JJ)Lo53/i0;", "a", "(J)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/device-service/devicemessage/message/sensors/{deviceId}")
    i0<a0<Unit>> a(@s("deviceId") long deviceId);

    @o("/device-service/devicemessage/message/backupRestore/{deviceId}")
    i0<a0<Unit>> b(@s("deviceId") long deviceId, @t("fromDeviceId") long fromDeviceId);

    @f("devicesettings-service/backups")
    i0<a0<qv.a>> c(@t("compatibleProducts") List<Integer> compatibleProducts);
}
