package wn1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\bH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\f\u001a\u00020\bH§@¢\u0006\u0004\b\u0012\u0010\u0010J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\bH§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0018\u0010\u0010J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0019\u001a\u00020\b2\b\b\u0001\u0010\u001a\u001a\u00020\bH§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\f\u001a\u00020\bH§@¢\u0006\u0004\b\u001e\u0010\u0010J*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\f\u001a\u00020\bH§@¢\u0006\u0004\b\u001f\u0010\u0017¨\u0006 À\u0006\u0003"}, d2 = {"Lwn1/s;", "", "Lcom/garmin/android/apps/connectmobile/smartscale/model/b;", "deviceInviteObject", "Lc83/a0;", "", "b", "(Lcom/garmin/android/apps/connectmobile/smartscale/model/b;Lt13/d;)Ljava/lang/Object;", "", "inviteId", "f", "(Lcom/garmin/android/apps/connectmobile/smartscale/model/b;JLt13/d;)Ljava/lang/Object;", "deviceID", "", "Lcom/garmin/android/apps/connectmobile/smartscale/model/e;", "c", "(JLt13/d;)Ljava/lang/Object;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/a;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/garmin/android/apps/connectmobile/smartscale/model/f;", "userInfo", "deviceInviteID", "d", "(Lcom/garmin/android/apps/connectmobile/smartscale/model/f;JLt13/d;)Ljava/lang/Object;", "h", "deviceId", "secondaryUserId", "a", "(JJLt13/d;)Ljava/lang/Object;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", JWKParameterNames.RSA_EXPONENT, "g", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface s {
    @i83.b("invite-service/device/{deviceId}/users/{secondaryUserId}")
    Object a(@i83.s("deviceId") long j8, @i83.s("secondaryUserId") long j14, t13.d<? super c83.a0<Unit>> dVar);

    @i83.o("invite-service/invite")
    Object b(@i83.a com.garmin.android.apps.connectmobile.smartscale.model.b bVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("invite-service/device/{deviceId}/users/invited")
    Object c(@i83.s("deviceId") long j8, t13.d<? super c83.a0<List<com.garmin.android.apps.connectmobile.smartscale.model.e>>> dVar);

    @i83.p("invite-service/invite/{inviteId}/accept")
    Object d(@i83.a com.garmin.android.apps.connectmobile.smartscale.model.f fVar, @i83.s("inviteId") long j8, t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.smartscale.model.a>> dVar);

    @i83.f("device-service/deviceservice/device-info/settings/{deviceId}")
    Object e(@i83.s("deviceId") long j8, t13.d<? super c83.a0<DeviceSettingsDTO>> dVar);

    @i83.p("invite-service/invite/{inviteId}")
    Object f(@i83.a com.garmin.android.apps.connectmobile.smartscale.model.b bVar, @i83.s("inviteId") long j8, t13.d<? super c83.a0<Unit>> dVar);

    @i83.p("device-service/deviceservice/device-info/settings/{deviceId}")
    Object g(@i83.a com.garmin.android.apps.connectmobile.smartscale.model.f fVar, @i83.s("deviceId") long j8, t13.d<? super c83.a0<DeviceSettingsDTO>> dVar);

    @i83.b("invite-service/invite/{inviteId}")
    Object h(@i83.s("inviteId") long j8, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("invite-service/device/{deviceId}/canAcceptMoreUsers")
    Object i(@i83.s("deviceId") long j8, t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.smartscale.model.a>> dVar);
}
