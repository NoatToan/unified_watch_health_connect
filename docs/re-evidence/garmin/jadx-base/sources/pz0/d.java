package pz0;

import c83.a0;
import com.garmin.android.apps.connectmobile.connections.model.ConnectionSearchResultDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import hi0.h;
import hi0.i;
import hi0.l;
import hi0.m;
import i83.k;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JC\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJI\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n0\t2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n0\t2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\n0\t2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u0007H'¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\t2\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b \u0010!J;\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\t2\u000e\b\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b#\u0010!J1\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000e0\n0\t2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b%\u0010\u0015¨\u0006&À\u0006\u0003"}, d2 = {"Lpz0/d;", "", "", "keyword", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "", "displayMutedStatus", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/connections/model/ConnectionSearchResultDTO;", "b", "(Ljava/lang/String;IIZ)Lo53/i0;", "", "imageVersions", "Lhi0/m;", "h", "(Ljava/lang/String;IILjava/util/List;)Lo53/i0;", "Lhi0/h;", "f", "(Ljava/util/List;)Lo53/i0;", "Lhi0/i;", "followingSuggestionRequestDTO", "d", "(Lhi0/i;Ljava/util/List;)Lo53/i0;", "displayName", "undo", "", "a", "(Ljava/lang/String;Z)Lo53/i0;", "emails", "c", "(Ljava/util/List;Ljava/util/List;)Lo53/i0;", "phones", "g", "Lhi0/l;", JWKParameterNames.RSA_EXPONENT, "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d {
    @o("/usersearch-service/following/removedSuggestion/{displayName}")
    i0<a0<Unit>> a(@s("displayName") String displayName, @t("undo") boolean undo);

    @k({"Content-Type: application/x-www-form-urlencoded; charset=UTF-8"})
    @o("/usersearch-service/search")
    @i83.e
    i0<a0<ConnectionSearchResultDTO>> b(@i83.c("keyword") String keyword, @i83.c(TtmlNode.START) int start, @i83.c(MapboxMap.QFE_LIMIT) int limit, @t("displayMutedStatus") boolean displayMutedStatus);

    @o("/usersearch-service/search/v3/emails?discover=true")
    i0<a0<m>> c(@i83.a List<String> emails, @t("image-version") List<String> imageVersions);

    @o("/usersearch-service/following/suggestions/pagination")
    i0<a0<h>> d(@i83.a i followingSuggestionRequestDTO, @t("image-version") List<String> imageVersions);

    @o("/usersearch-service/group-member/suggestions")
    i0<a0<List<l>>> e(@t("image-version") List<String> imageVersions);

    @k({"Content-Type: application/x-www-form-urlencoded; charset=UTF-8"})
    @o("/usersearch-service/following/suggestions")
    i0<a0<h>> f(@t("image-version") List<String> imageVersions);

    @o("/usersearch-service/search/v3/phones?discover=true")
    i0<a0<m>> g(@i83.a List<String> phones, @t("image-version") List<String> imageVersions);

    @k({"Content-Type: application/x-www-form-urlencoded; charset=UTF-8"})
    @o("/usersearch-service/search/v3")
    @i83.e
    i0<a0<m>> h(@i83.c("keyword") String keyword, @i83.c(TtmlNode.START) int start, @i83.c(MapboxMap.QFE_LIMIT) int limit, @t("image-version") List<String> imageVersions);
}
