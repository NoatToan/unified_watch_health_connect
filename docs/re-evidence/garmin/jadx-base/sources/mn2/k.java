package mn2;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Collection;
import java.util.List;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH'¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u0005H'¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00170\u00060\u0005H'¢\u0006\u0004\b\u0018\u0010\u0016J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u001c\u0010\u0014¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lmn2/k;", "", "", "", "profileImageVersions", "Lq03/r;", "Lc83/a0;", "Lokhttp3/ResponseBody;", "a", "(Ljava/util/List;)Lq03/r;", "", "sandboxUser", "skipTnC", "Lsn2/b;", "b", "(ZZ)Lq03/r;", "", "deviceId", "Lon2/a;", JWKParameterNames.RSA_EXPONENT, "(JLt13/d;)Ljava/lang/Object;", "d", "()Lq03/r;", "", "f", "", "c", "(J)Lq03/r;", "g", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface k {
    @i83.f("/userprofile-service/socialProfile/v2")
    q03.r<a0<ResponseBody>> a(@i83.t("image-version") List<String> profileImageVersions);

    @i83.o("nfc-service/nfc/v2/providers/fitpay/account")
    q03.r<a0<sn2.b>> b(@i83.t("sandboxUser") boolean sandboxUser, @i83.t("skipTnC") boolean skipTnC);

    @i83.b("nfc-service/nfc/v2/providers/fitpay/device/{device_id}")
    q03.r<a0<Unit>> c(@i83.s(encoded = true, value = "device_id") long deviceId);

    @i83.f("nfc-service/nfc/v2/providers/fitpay/account")
    q03.r<a0<sn2.b>> d();

    @i83.o("nfc-service/nfc/v2/providers/fitpay/device/{device_id}")
    Object e(@i83.s(encoded = true, value = "device_id") long j8, t13.d<? super a0<on2.a>> dVar);

    @i83.f("nfc-service/nfc/v2/providers/fitpay/devices")
    q03.r<a0<Collection<on2.a>>> f();

    @i83.f("device-service/device/nfc/cardArtImageSize/{device_id}")
    Object g(@i83.s(encoded = true, value = "device_id") long j8, t13.d<? super a0<ResponseBody>> dVar);
}
