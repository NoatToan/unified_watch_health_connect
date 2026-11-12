package eo1;

import c83.a0;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import com.garmin.android.apps.connectmobile.userprofile.model.m;
import com.garmin.android.apps.connectmobile.userprofile.model.p;
import com.garmin.android.apps.connectmobile.userprofile.model.r;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import java.util.Map;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\b2\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00110\u00030\u00022\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u00022\b\b\u0001\u0010\u0016\u001a\u00020\nH'¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\b2\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\u001c\u0010\u000fJ/\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u001d\u001a\u00020\u001bH'¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Leo1/a;", "", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/p;", "b", "()Lo53/i0;", "", "", "profileImageVersions", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "a", "(Ljava/util/List;)Lo53/i0;", "displayName", "f", "(Ljava/lang/String;Ljava/util/List;)Lo53/i0;", "userIdList", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "c", "(Ljava/util/List;Ljava/util/List;)Lo53/i0;", "socialProfileDTO", "", "g", "(Lcom/garmin/android/apps/connectmobile/userprofile/model/m;)Lo53/i0;", "imageVersions", "Lcom/garmin/android/apps/connectmobile/userprofile/model/r;", JWKParameterNames.RSA_EXPONENT, "privacyV2DTO", "d", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/r;)Lo53/i0;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/userprofile-service/socialProfile/v2")
    i0<a0<m>> a(@t("image-version") List<String> profileImageVersions);

    @f("/userprofile-service/socialProfile/image")
    i0<a0<p>> b();

    @f("/userprofile-service/socialProfile/v2/public/multiple/id")
    i0<a0<Map<Integer, l>>> c(@t("userId") List<String> userIdList, @t("image-version") List<String> profileImageVersions);

    @i83.p("/userprofile-service/socialProfile/v2/userInfoPrivacies/{displayName}")
    i0<a0<r>> d(@s("displayName") String displayName, @i83.a r privacyV2DTO);

    @f("/userprofile-service/socialProfile/v2/userInfoPrivacies/{displayName}")
    i0<a0<r>> e(@s("displayName") String displayName, @t("image-version") List<String> imageVersions);

    @f("/userprofile-service/socialProfile/v2/{displayName}")
    i0<a0<m>> f(@s("displayName") String displayName, @t("image-version") List<String> profileImageVersions);

    @i83.p("/userprofile-service/socialProfile/v2")
    i0<a0<Unit>> g(@i83.a m socialProfileDTO);
}
