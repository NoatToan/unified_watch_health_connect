package gr1;

import c83.a0;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.garmin.android.apps.connectmobile.strava.StravaSegmentStatusDTO;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u0004H'¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u0004H'¢\u0006\u0004\b\u000f\u0010\fJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\nH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lgr1/a;", "", "", "callback", "Lo53/i0;", "Lc83/a0;", "c", "(Ljava/lang/String;)Lo53/i0;", "authorizationCode", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;", "a", "()Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/strava/StravaSegmentStatusDTO;", "b", "f", "stravaStatusDTO", "d", "(Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;)Lo53/i0;", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/partner-service/strava/user")
    i0<a0<StravaStatusDTO>> a();

    @i83.f("/partner-service/strava/device/status")
    i0<a0<StravaSegmentStatusDTO>> b();

    @i83.f("/partner-service/strava/oauth/authorizeurl")
    i0<a0<String>> c(@t("callback") String callback);

    @o("/partner-service/strava/user")
    i0<a0<StravaStatusDTO>> d(@i83.a StravaStatusDTO stravaStatusDTO);

    @o("/partner-service/strava/oauth/tokenexchange/{authorizationCode}")
    i0<a0<String>> e(@s("authorizationCode") String authorizationCode);

    @i83.f("/device-service/deviceregistration/compatibility/edge")
    i0<a0<StravaSegmentStatusDTO>> f();
}
