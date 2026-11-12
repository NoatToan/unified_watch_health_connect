package my2;

import com.google.firebase.messaging.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.t;
import i83.y;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001JA\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H'¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H'¢\u0006\u0004\b\u0013\u0010\u0012J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H'¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u001a2\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H'¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lmy2/r;", "", "", "deviceId", "", "libVersion", "", "headers", "Lc83/d;", "Lokhttp3/ResponseBody;", "a", "(JLjava/lang/String;Ljava/util/Map;)Lc83/d;", "messageId", "status", "g", "(JLjava/lang/String;Ljava/lang/String;)Lc83/d;", "url", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lc83/d;", "b", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "Lokhttp3/RequestBody;", "data", "c", "(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)Lc83/d;", "Lokhttp3/MultipartBody$Part;", "h", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lc83/d;", "deviceXml", "supportPartialUpdate", "bypassPhasedRollout", "f", "(Lokhttp3/RequestBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface r {
    @i83.f("/device-service/devicemessage/messages")
    c83.d<ResponseBody> a(@t("device_id") long deviceId, @i83.i("LibraryVersion") String libVersion, @i83.j Map<String, String> headers);

    @i83.k({"Accept: */*"})
    @i83.f
    c83.d<ResponseBody> b(@y String url, @i83.i("LibraryVersion") String libVersion, @i83.j Map<String, String> headers);

    @i83.o
    c83.d<ResponseBody> c(@y String url, @i83.a RequestBody data, @i83.j Map<String, String> headers);

    @i83.k({"Accept: */*"})
    @i83.f
    c83.d<ResponseBody> d(@y String url, @i83.i("LibraryVersion") String libVersion, @i83.j Map<String, String> headers);

    @i83.f
    c83.d<ResponseBody> e(@y String url, @i83.i("LibraryVersion") String libVersion);

    @i83.o("/device-service/softwareupdate/check")
    c83.d<ResponseBody> f(@i83.a RequestBody deviceXml, @t("delta") String supportPartialUpdate, @t("bypassPhasedRollout") String bypassPhasedRollout, @i83.i("LibraryVersion") String libVersion);

    @i83.p("/device-service/devicemessage/message/{message_id}")
    c83.d<ResponseBody> g(@i83.s(encoded = true, value = Constants.MessagePayloadKeys.MSGID_SERVER) long messageId, @t("status") String status, @i83.i("LibraryVersion") String libVersion);

    @i83.o
    @i83.l
    c83.d<ResponseBody> h(@y String url, @i83.q MultipartBody.Part data, @i83.j Map<String, String> headers);
}
