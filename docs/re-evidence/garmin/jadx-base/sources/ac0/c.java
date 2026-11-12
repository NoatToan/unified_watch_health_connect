package ac0;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.devices.model.m;
import com.garmin.android.apps.connectmobile.devices.model.p;
import com.garmin.android.apps.connectmobile.devices.model.s;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.i;
import i83.k;
import i83.o;
import i83.t;
import java.util.List;
import o53.i0;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00050\u0004H'¢\u0006\u0004\b\u0013\u0010\u0010J:\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00110\u00050\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u00042\b\b\u0001\u0010\u001e\u001a\u00020\bH'¢\u0006\u0004\b \u0010!J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u00042\b\b\u0001\u0010\"\u001a\u00020\bH'¢\u0006\u0004\b#\u0010!J\u001b\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H'¢\u0006\u0004\b$\u0010\u0010J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u00042\b\b\u0001\u0010%\u001a\u00020\u0002H'¢\u0006\u0004\b'\u0010\u0007J/\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\u0002H'¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010(\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010\u0007J5\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00110\u00050\u00042\b\b\u0001\u0010-\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b/\u0010+J%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u00042\b\b\u0001\u00101\u001a\u000200H'¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H'¢\u0006\u0004\b4\u0010\u0010J \u00108\u001a\b\u0012\u0004\u0012\u0002070\u00052\b\b\u0001\u00106\u001a\u000205H§@¢\u0006\u0004\b8\u00109¨\u0006:À\u0006\u0003"}, d2 = {"Lac0/c;", "", "", "displayName", "Lo53/i0;", "Lc83/a0;", "h", "(Ljava/lang/String;)Lo53/i0;", "", "deviceId", "productNumber", "deviceDescription", "Lcom/garmin/android/apps/connectmobile/devices/model/l;", "l", "(JLjava/lang/String;Ljava/lang/String;)Lo53/i0;", "d", "()Lo53/i0;", "", "Lcom/garmin/android/apps/connectmobile/devices/model/m;", "j", "connectionType", "json", "", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "", "userId", "Lgc0/s;", "c", "(I)Lo53/i0;", "unitId", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceAppInfoDTO;", JWKParameterNames.OCT_KEY_VALUE, "(J)Lo53/i0;", "deviceVersionId", "f", JWKParameterNames.RSA_MODULUS, "partNumber", "Lcom/garmin/android/apps/connectmobile/devices/model/s;", IntegerTokenConverter.CONVERTER_KEY, "deviceUnitID", "rawJson", "o", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "m", "agentId", "Lr80/b;", "p", "Lcom/garmin/android/apps/connectmobile/devices/model/p;", "fitProductListJson", "b", "(Lcom/garmin/android/apps/connectmobile/devices/model/p;)Lo53/i0;", "a", "Lokhttp3/RequestBody;", "deviceXml", "Lokhttp3/ResponseBody;", JWKParameterNames.RSA_EXPONENT, "(Lokhttp3/RequestBody;Lt13/d;)Ljava/lang/Object;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c {
    @f("device-service/deviceregistration/devices")
    i0<a0<String>> a();

    @k({"Content-Type: application/json"})
    @o("/device-service/devicelist/devices/search")
    i0<a0<s>> b(@i83.a p fitProductListJson);

    @f("/device-service/userdevice/devices")
    i0<a0<List<gc0.s>>> c(@i("USER_ID") int userId);

    @f("/device-service/deviceregistration/devices/historical")
    i0<a0<String>> d();

    @o("/device-service/deviceregistration/accessory/.fit")
    Object e(@i83.a RequestBody requestBody, d<? super a0<ResponseBody>> dVar);

    @f("/device-service/deviceservice/app-info/device/version/{deviceVersionId}")
    i0<a0<DeviceAppInfoDTO>> f(@i83.s("deviceVersionId") long deviceVersionId);

    @i83.p("/device-service/bluetooth-connections/{device_id}/{connection_type}")
    Object g(@i83.s("device_id") String str, @i83.s("connection_type") String str2, @i83.a String str3, d<? super i0<a0<Unit>>> dVar);

    @f("device-service/deviceservice/device-info/active/{displayName}")
    i0<a0<String>> h(@i83.s("displayName") String displayName);

    @f("/device-service/devicelist/devices")
    i0<a0<s>> i(@t("partNumber") String partNumber);

    @f("/device-service/deviceregistration/devices/historical")
    i0<a0<List<m>>> j();

    @f("/device-service/deviceservice/app-info/device/{unitId}")
    i0<a0<DeviceAppInfoDTO>> k(@i83.s("unitId") long unitId);

    @k({"Content-Type: application/x-www-form-urlencoded; charset=utf-8"})
    @f("/device-service/deviceregistration/deviceType/general-info/{deviceId}")
    i0<a0<l>> l(@i83.s("deviceId") long deviceId, @t("productNumber") String productNumber, @t("deviceDescription") String deviceDescription);

    @f("/device-service/deviceregistration/devices/{deviceUnitID}")
    i0<a0<m>> m(@i83.s("deviceUnitID") String deviceUnitID);

    @f("/device-service/devicelist/devices")
    i0<a0<String>> n();

    @k({"Accept: application/json", "Content-Type: application/json; charset=utf-8"})
    @i83.p("/device-service/deviceservice/device-info/settings/{deviceUnitID}")
    i0<a0<String>> o(@i83.s("deviceUnitID") String deviceUnitID, @i83.a String rawJson);

    @f("/device-service/deviceservice/app-info")
    i0<a0<List<r80.b>>> p(@t("agentId") String agentId, @t("deviceId") String deviceId);
}
