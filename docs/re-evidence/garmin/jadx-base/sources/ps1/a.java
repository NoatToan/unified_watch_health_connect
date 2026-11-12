package ps1;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import qs1.b0;
import qs1.c;
import qs1.e;
import qs1.l;
import qs1.p;
import qs1.r;
import qs1.u;
import qs1.x;
import t13.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00132\b\b\u0003\u0010\u0017\u001a\u00020\u00132\b\b\u0003\u0010\u0018\u001a\u00020\u0013H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H§@¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0003\u0010\u0017\u001a\u00020\u00132\b\b\u0003\u0010\u0018\u001a\u00020\u0013H§@¢\u0006\u0004\b \u0010!J \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b\"\u0010#J \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b$\u0010#J4\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010'\u001a\u00020%H§@¢\u0006\u0004\b)\u0010*J \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b,\u0010#J \u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\b\b\u0001\u0010-\u001a\u00020\u001eH§@¢\u0006\u0004\b/\u0010#J \u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010-\u001a\u00020\u001eH§@¢\u0006\u0004\b0\u0010#J \u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010-\u001a\u00020\u001eH§@¢\u0006\u0004\b1\u0010#J \u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u00103\u001a\u000202H§@¢\u0006\u0004\b4\u00105J*\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u00106\u001a\u00020\u001eH§@¢\u0006\u0004\b8\u00109J*\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u00106\u001a\u00020\u001eH§@¢\u0006\u0004\b:\u00109J)\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00130>2\b\b\u0001\u0010<\u001a\u00020;2\b\b\u0001\u0010=\u001a\u00020;H'¢\u0006\u0004\b?\u0010@¨\u0006AÀ\u0006\u0003"}, d2 = {"Lps1/a;", "", "Lqs1/x;", "trailsFetchRequestDTO", "Lc83/a0;", "", "Lqs1/d;", "a", "(Lqs1/x;Lt13/d;)Ljava/lang/Object;", "Lqs1/o;", "searchRequest", "Lqs1/p;", IntegerTokenConverter.CONVERTER_KEY, "(Lqs1/o;Lt13/d;)Ljava/lang/Object;", "Lqs1/r;", "selectedSearchResultItem", "", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Lqs1/r;Lt13/d;)Ljava/lang/Object;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "province", "courseName", "locale", "unit", "Lqs1/e;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "j", "(Lt13/d;)Ljava/lang/Object;", "", "curatedCourseId", "l", "(JLjava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.RSA_EXPONENT, "(JLt13/d;)Ljava/lang/Object;", "p", "", "pageStart", "pageEnd", "Lqs1/c;", "o", "(JIILt13/d;)Ljava/lang/Object;", "Lqs1/l;", "m", "imageId", "", "c", "h", JWKParameterNames.OCT_KEY_VALUE, "Lqs1/b0;", "userSuggestion", "g", "(Lqs1/b0;Lt13/d;)Ljava/lang/Object;", "activityId", "Lqs1/u;", JWKParameterNames.RSA_MODULUS, "(JJLt13/d;)Ljava/lang/Object;", "b", "", "latitude", "longitude", "Lc83/d;", "d", "(DD)Lc83/d;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/curated-course/course/curated/search")
    Object a(@i83.a x xVar, d<? super a0<List<qs1.d>>> dVar);

    @f("/curated-course/trip/report/course/ownerMatch/{curatedCourseId}/{activityId}")
    Object b(@s("curatedCourseId") long j8, @s("activityId") long j14, d<? super a0<u>> dVar);

    @f("/curated-course/trip/report/image/{imageId}/rate")
    Object c(@s("imageId") long j8, d<? super a0<Boolean>> dVar);

    @f("/curated-course/course/curated/available")
    c83.d<String> d(@t("latitude") double latitude, @t("longitude") double longitude);

    @o("/curated-course/course/curated/favorite/{curatedCourseId}")
    Object e(@s("curatedCourseId") long j8, d<? super a0<Unit>> dVar);

    @f("/curated-course/course/curated/{countryCode}/{province}/{courseName}")
    Object f(@s(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) String str, @s("province") String str2, @s("courseName") String str3, @t("locale") String str4, @t("unit") String str5, d<? super a0<e>> dVar);

    @o("/curated-course/course/curated/suggestion")
    Object g(@i83.a b0 b0Var, d<? super a0<Unit>> dVar);

    @o("/curated-course/trip/report/image/{imageId}/rate")
    Object h(@s("imageId") long j8, d<? super a0<Unit>> dVar);

    @o("/trails-search/trails/search/bestMatches")
    Object i(@i83.a qs1.o oVar, d<? super a0<p>> dVar);

    @o("/curated-course/course/curated/search/favorite")
    Object j(d<? super a0<List<qs1.d>>> dVar);

    @i83.b("/curated-course/trip/report/image/{imageId}/rate")
    Object k(@s("imageId") long j8, d<? super a0<Unit>> dVar);

    @f("/curated-course/course/curated/{curatedCourseId}")
    Object l(@s("curatedCourseId") long j8, @t("locale") String str, @t("unit") String str2, d<? super a0<e>> dVar);

    @f("/curated-course/course/curated/usage/{curatedCourseId}")
    Object m(@s("curatedCourseId") long j8, d<? super a0<l>> dVar);

    @f("/curated-course/trip/report/course/match/{curatedCourseId}/{activityId}")
    Object n(@s("curatedCourseId") long j8, @s("activityId") long j14, d<? super a0<u>> dVar);

    @f("/curated-course/course/curated/images/{curatedCourseId}")
    Object o(@s("curatedCourseId") long j8, @t("pageStart") int i14, @t("pageEnd") int i15, d<? super a0<c>> dVar);

    @i83.b("/curated-course/course/curated/favorite/{curatedCourseId}")
    Object p(@s("curatedCourseId") long j8, d<? super a0<Unit>> dVar);

    @o("/trails-search/trails/search/selectedItem")
    Object q(@i83.a r rVar, d<? super a0<Unit>> dVar);
}
