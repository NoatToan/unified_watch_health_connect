package jm2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.perf.FirebasePerformance;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.h;
import i83.j;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.Map;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH'¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u000eH'¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u000eH'¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\bH'¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u001d\u001a\u00020\u000eH'¢\u0006\u0004\b\u001e\u0010\u0019J5\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH'¢\u0006\u0004\b\u001f\u0010 J3\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u000e2\b\b\u0001\u0010\"\u001a\u00020\u000bH'¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Ljm2/b;", "", "Lc83/d;", "Ljm2/a;", IntegerTokenConverter.CONVERTER_KEY, "()Lc83/d;", "", "deviceId", "Lcom/google/gson/JsonObject;", "a", "(J)Lc83/d;", "Lokhttp3/RequestBody;", "deviceXml", "", "", "headers", "Lokhttp3/ResponseBody;", "b", "(Lokhttp3/RequestBody;Ljava/util/Map;)Lc83/d;", "supportPartialUpdate", "c", "(Lokhttp3/RequestBody;Ljava/lang/String;)Lc83/d;", "enabled", "Ljava/lang/Void;", "d", "(JLjava/lang/String;)Lc83/d;", "json", "f", "(JLcom/google/gson/JsonObject;)Lc83/d;", "deleteGarminPay", "g", JWKParameterNames.RSA_EXPONENT, "(JLjava/util/Map;)Lc83/d;", "connectionType", "info", "h", "(JLjava/lang/String;Lokhttp3/RequestBody;)Lc83/d;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {
    @f("/device-service/deviceregistration/device/status/{device_id}")
    c83.d<JsonObject> a(@s(encoded = true, value = "device_id") long deviceId);

    @o("/device-service/deviceregistration/device")
    c83.d<ResponseBody> b(@i83.a RequestBody deviceXml, @j Map<String, String> headers);

    @o("/device-service/softwareupdate/check")
    c83.d<ResponseBody> c(@i83.a RequestBody deviceXml, @t("delta") String supportPartialUpdate);

    @h(hasBody = true, method = FirebasePerformance.HttpMethod.PUT, path = "/device-service/deviceservice/device-info/{device_id}/primary-activity-tracker")
    c83.d<Void> d(@s(encoded = true, value = "device_id") long deviceId, @i83.a String enabled);

    @p("/device-service/deviceregistration/reinitialize/{device_id}")
    c83.d<Void> e(@s(encoded = true, value = "device_id") long deviceId, @j Map<String, String> headers);

    @h(hasBody = true, method = FirebasePerformance.HttpMethod.PUT, path = "/device-service/deviceregistration/device/status/{device_id}")
    c83.d<Void> f(@s(encoded = true, value = "device_id") long deviceId, @i83.a JsonObject json);

    @i83.b("/device-service/deviceregistration/device/{device_id}")
    c83.d<Void> g(@s(encoded = true, value = "device_id") long deviceId, @t("deleteGarminPay") String deleteGarminPay);

    @p("/device-service/bluetooth-connections/{device_id}/{connection_type}")
    c83.d<Void> h(@s(encoded = true, value = "device_id") long deviceId, @s(encoded = true, value = "connection_type") String connectionType, @i83.a RequestBody info);

    @f("/device-service/devicelist/devices")
    c83.d<a> i();
}
