package i12;

import c83.a0;
import c83.d;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.settings.model.StepLengthDTO;
import com.garmin.android.apps.connectmobile.smartscale.model.e;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.k;
import i83.l;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import j12.h;
import j12.m;
import j12.n;
import java.util.List;
import o53.i0;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wi1.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\r2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H'¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\t0\u0004H'¢\u0006\u0004\b\u001a\u0010\fJ1\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\t0\u00042\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\u0004H'¢\u0006\u0004\b\u001f\u0010\fJ\u001b\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\u0004H'¢\u0006\u0004\b \u0010\fJ\u001b\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\u0004H'¢\u0006\u0004\b\"\u0010\fJ\u001b\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u0004H'¢\u0006\u0004\b$\u0010\fJ\u001b\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u0004H'¢\u0006\u0004\b%\u0010\fJ\u001b\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u0004H'¢\u0006\u0004\b&\u0010\fJ%\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u00042\b\b\u0001\u0010'\u001a\u00020\u001eH'¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u00042\b\b\u0001\u0010'\u001a\u00020\u001eH'¢\u0006\u0004\b*\u0010)J%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u00042\b\b\u0001\u0010'\u001a\u00020\u001eH'¢\u0006\u0004\b+\u0010)J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u00042\b\b\u0001\u0010'\u001a\u00020\u001eH'¢\u0006\u0004\b,\u0010)J%\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u00042\b\b\u0001\u0010-\u001a\u00020!H'¢\u0006\u0004\b.\u0010/J%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u00042\b\b\u0001\u0010-\u001a\u00020!H'¢\u0006\u0004\b0\u0010/J+\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u00042\u000e\b\u0001\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H'¢\u0006\u0004\b2\u0010\u001dJ\u001b\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u0004H'¢\u0006\u0004\b3\u0010\fJ\u001b\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\t0\u0004H'¢\u0006\u0004\b5\u0010\fJI\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\t0\u00042\b\b\u0001\u00106\u001a\u00020\r2\b\b\u0001\u00108\u001a\u0002072\b\b\u0001\u0010:\u001a\u0002092\u000e\b\u0001\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H'¢\u0006\u0004\b=\u0010>JB\u0010@\u001a\b\u0012\u0004\u0012\u00020<0\t2\b\b\u0001\u00106\u001a\u00020\r2\u000e\b\u0001\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0010\b\u0001\u0010?\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005H§@¢\u0006\u0004\b@\u0010AJ)\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C2\b\b\u0001\u00106\u001a\u00020\r2\b\b\u0001\u0010B\u001a\u00020\rH'¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0C2\b\b\u0001\u00106\u001a\u00020\rH'¢\u0006\u0004\bG\u0010H¨\u0006IÀ\u0006\u0003"}, d2 = {"Li12/b;", "", "", "unitId", "Lo53/i0;", "", "Lcom/garmin/android/apps/connectmobile/smartscale/model/e;", "x", "(J)Lo53/i0;", "Lc83/a0;", "Lj12/l;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Lo53/i0;", "", "displayName", "Lokhttp3/MultipartBody$Part;", "files", "Lj12/h;", "o", "(Ljava/lang/String;Ljava/util/List;)Lo53/i0;", "Lda1/a;", "flagImageDTO", "Lda1/b;", JWKParameterNames.RSA_MODULUS, "(Ljava/lang/String;Lda1/a;)Lo53/i0;", "Lrl0/a;", "j", "preferences", "d", "(Ljava/util/List;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/settings/model/StepLengthDTO;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "Lwi1/i;", JWKParameterNames.RSA_EXPONENT, "", "b", IntegerTokenConverter.CONVERTER_KEY, "s", "userStepLengthDTO", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Lcom/garmin/android/apps/connectmobile/settings/model/StepLengthDTO;)Lo53/i0;", "l", "h", "a", "userPushLengthDTO", "f", "(Lwi1/i;)Lo53/i0;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "userRole", "u", "c", "Lj12/n;", "g", "userDisplayName", "", "connectionsLimit", "", "displayMutedStatus", "imageVersions", "Lcom/garmin/android/apps/connectmobile/userprofile/model/q;", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;IZLjava/util/List;)Lo53/i0;", "fields", "p", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "todayCalendarDate", "Lc83/d;", "Lj12/m;", "w", "(Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "m", "(Ljava/lang/String;)Lc83/d;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @p("/userprofile-service/userprofile/step-length/running")
    i0<a0<Unit>> a(@i83.a StepLengthDTO userStepLengthDTO);

    @i83.b("/userprofile-service/userprofile/step-length/walking")
    i0<a0<Unit>> b();

    @p("/userprofile-service/userprofile/mobile/last-login-date")
    i0<a0<Unit>> c();

    @k({"Content-Type: application/json"})
    @p("/userpreference-service/emailPreferences")
    i0<a0<List<rl0.a>>> d(@i83.a List<rl0.a> preferences);

    @f("/userprofile-service/userprofile/push-length")
    i0<a0<i>> e();

    @o("/userprofile-service/userprofile/push-length")
    i0<a0<Unit>> f(@i83.a i userPushLengthDTO);

    @f("/userprofile-service/userprofile/user-info")
    i0<a0<n>> g();

    @o("/userprofile-service/userprofile/step-length/running")
    i0<a0<Unit>> h(@i83.a StepLengthDTO userStepLengthDTO);

    @i83.b("/userprofile-service/userprofile/step-length/running")
    i0<a0<Unit>> i();

    @f("/userpreference-service/emailPreferences")
    i0<a0<List<rl0.a>>> j();

    @f("/mobile-gateway/userProfile/v2/info/{userDisplayName}")
    i0<a0<q>> k(@s("userDisplayName") String userDisplayName, @t(MapboxMap.QFE_LIMIT) int connectionsLimit, @t("displayMutedStatus") boolean displayMutedStatus, @t("image-version") List<String> imageVersions);

    @p("/userprofile-service/userprofile/step-length/walking")
    i0<a0<Unit>> l(@i83.a StepLengthDTO userStepLengthDTO);

    @f("/mobile-gateway/userProfile/about/{userDisplayName}")
    d<String> m(@s("userDisplayName") String userDisplayName);

    @o("userprofile-service/socialProfile/{displayName}/image/flag")
    i0<a0<da1.b>> n(@s("displayName") String displayName, @i83.a da1.a flagImageDTO);

    @o("image-service/imageservice/upload/{displayName}")
    @l
    i0<List<h>> o(@s("displayName") String displayName, @i83.q List<MultipartBody.Part> files);

    @f("/mobile-gateway/userProfile/v3/info/{userDisplayName}")
    Object p(@s("userDisplayName") String str, @t("image-version") List<String> list, @t("fields") List<String> list2, t13.d<? super a0<q>> dVar);

    @p("/userprofile-service/userprofile/push-length")
    i0<a0<Unit>> q(@i83.a i userPushLengthDTO);

    @f("userprofile-service/userprofile/userProfileBase")
    i0<a0<j12.l>> r();

    @i83.b("/userprofile-service/userprofile/push-length")
    i0<a0<Unit>> s();

    @f("/userprofile-service/userprofile/step-length/walking")
    i0<a0<StepLengthDTO>> t();

    @o("/dashboard-service/userExperience")
    i0<a0<Unit>> u(@i83.a List<String> userRole);

    @f("/userprofile-service/userprofile/step-length/running")
    i0<a0<StepLengthDTO>> v();

    @f("/mobile-gateway/userProfile/stats/{userDisplayName}")
    d<m> w(@s("userDisplayName") String userDisplayName, @t("todayCalendarDate") String todayCalendarDate);

    @f("invite-service/device/{unitId}/users/invited")
    i0<List<e>> x(@s("unitId") long unitId);

    @o("/userprofile-service/userprofile/step-length/walking")
    i0<a0<Unit>> y(@i83.a StepLengthDTO userStepLengthDTO);
}
