package mi2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.k;
import i83.o;
import i83.p;
import i83.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0011\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0007J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH'¢\u0006\u0004\b\u0011\u0010\u0010J3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\fH'¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\u0016\u0010\nJ)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\fH'¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\fH'¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\fH'¢\u0006\u0004\b\u001d\u0010\u001cJ3\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\fH'¢\u0006\u0004\b\u001e\u0010\u001cJ=\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\fH'¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0017\u001a\u00020\fH'¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0017\u001a\u00020\fH'¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H'¢\u0006\u0004\b$\u0010\nJ\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0017\u001a\u00020\fH'¢\u0006\u0004\b%\u0010\"J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010&\u001a\u00020\fH'¢\u0006\u0004\b'\u0010\"J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0017\u001a\u00020\fH'¢\u0006\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Lmi2/a;", "", "", "deviceId", "Lc83/d;", "Lcom/google/gson/JsonArray;", "d", "(J)Lc83/d;", "Lcom/google/gson/JsonObject;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Lc83/d;", "a", "", "todayDate", "displayName", "h", "(Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "f", "sport", "subSport", "p", "(JLjava/lang/String;Ljava/lang/String;)Lc83/d;", "getUserSettings", "params", "", "m", "(JLjava/lang/String;)Lc83/d;", JWKParameterNames.RSA_MODULUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "c", IntegerTokenConverter.CONVERTER_KEY, "b", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "o", "(Ljava/lang/String;)Lc83/d;", JWKParameterNames.RSA_EXPONENT, "g", "j", "date", "l", JWKParameterNames.OCT_KEY_VALUE, "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a {
    @k({"User-Agent: Android Dynamic Settings"})
    @f("/device-service/deviceservice/device-info/settings/{deviceId}")
    c83.d<JsonObject> a(@s("deviceId") long deviceId);

    @k({"x-http-method-override: PUT", "Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @o("/device-service/deviceservice/device-info/settings/{deviceId}/sport/{sport}/subsport/{subSport}")
    c83.d<Unit> b(@s("deviceId") long deviceId, @s("sport") String sport, @s("subSport") String subSport, @i83.a String params);

    @k({"Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @p("/wellness-service/wellness/wellness-goals/effective/floors-climbed/{todayDate}/{displayName}")
    c83.d<Unit> c(@s("todayDate") String todayDate, @s("displayName") String displayName, @i83.a String params);

    @k({"User-Agent: Android Dynamic Settings"})
    @f("/devicesettings-service/device/defaults/controls-menu/{deviceId}")
    c83.d<JsonArray> d(@s("deviceId") long deviceId);

    @k({"x-http-method-override: PUT", "Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @o("/userprofile-service/userprofile/step-length/walking")
    c83.d<Unit> e(@i83.a String params);

    @k({"User-Agent: Android Dynamic Settings"})
    @f("/wellness-service/wellness/wellness-goals/consolidated/steps/{todayDate}/{displayName}")
    c83.d<JsonObject> f(@s("todayDate") String todayDate, @s("displayName") String displayName);

    @k({"User-Agent: Android Dynamic Settings"})
    @i83.b("/userprofile-service/userprofile/step-length/walking")
    c83.d<Unit> g();

    @k({"User-Agent: Android Dynamic Settings"})
    @f("/userprofile-service/userprofile/user-settings")
    c83.d<JsonObject> getUserSettings();

    @k({"User-Agent: Android Dynamic Settings"})
    @f("/wellness-service/wellness/wellness-goals/effective/{todayDate}/{displayName}")
    c83.d<JsonArray> h(@s("todayDate") String todayDate, @s("displayName") String displayName);

    @k({"Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @p("/wellness-service/wellness/wellness-goals/consolidated/steps/{todayDate}/{displayName}")
    c83.d<Unit> i(@s("todayDate") String todayDate, @s("displayName") String displayName, @i83.a String params);

    @k({"Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @o("/userprofile-service/userprofile/step-length/walking")
    c83.d<Unit> j(@i83.a String params);

    @k({"Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @o("/biometric-service/criticalSwimSpeed")
    c83.d<Unit> k(@i83.a String params);

    @k({"Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @f("/biometric-service/criticalSwimSpeed/latest/{date}")
    c83.d<JsonObject> l(@s("date") String date);

    @k({"x-http-method-override: PUT", "Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @o("/device-service/deviceservice/device-info/settings/{deviceId}")
    c83.d<Unit> m(@s("deviceId") long deviceId, @i83.a String params);

    @k({"Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @p("/wellness-service/wellness/wellness-goals/effective/intensity-minutes/{todayDate}/{displayName}")
    c83.d<Unit> n(@s("todayDate") String todayDate, @s("displayName") String displayName, @i83.a String params);

    @k({"x-http-method-override: PUT", "Content-Type: application/json", "User-Agent: Android Dynamic Settings"})
    @o("/userprofile-service/userprofile/user-settings")
    c83.d<Unit> o(@i83.a String params);

    @k({"User-Agent: Android Dynamic Settings"})
    @f("/device-service/deviceservice/device-info/settings/{deviceId}/sport/{sport}/subsport/{subSport}")
    c83.d<JsonObject> p(@s("deviceId") long deviceId, @s("sport") String sport, @s("subSport") String subSport);

    @k({"User-Agent: Android Dynamic Settings"})
    @f("/userprofile-service/userprofile/step-length/walking")
    c83.d<JsonObject> q();
}
