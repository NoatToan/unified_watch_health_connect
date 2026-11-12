package xd2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0013J@\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0003H§@¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J6\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020!H§@¢\u0006\u0004\b\"\u0010#J@\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010\u001e\u001a\u00020!H§@¢\u0006\u0004\b$\u0010%JZ\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010'\u001a\u00020&2\b\b\u0001\u0010(\u001a\u00020&2\b\b\u0001\u0010)\u001a\u00020&2\u000e\b\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030*H§@¢\u0006\u0004\b-\u0010.J@\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010\u001e\u001a\u00020/H§@¢\u0006\u0004\b0\u00101J@\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u00102\u001a\u00020\u00032\b\b\u0001\u00104\u001a\u000203H§@¢\u0006\u0004\b6\u00107J6\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u000208H§@¢\u0006\u0004\b:\u0010;J<\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0001\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030*H§@¢\u0006\u0004\b>\u0010?J \u0010A\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010@\u001a\u00020\u0003H§@¢\u0006\u0004\bA\u0010B¨\u0006CÀ\u0006\u0003"}, d2 = {"Lxd2/z0;", "", "", "", "garminDeviceHeaders", "Lae2/q;", "livetrackSettingsDTO", "Lc83/a0;", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;Lae2/q;Lt13/d;)Ljava/lang/Object;", "Lae2/k0;", "requestDTO", "Lae2/b;", "l", "(Ljava/util/Map;Lae2/k0;Lt13/d;)Ljava/lang/Object;", "Lae2/m0;", "Lae2/l0;", "m", "(Ljava/util/Map;Lae2/m0;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.RSA_MODULUS, "publisherId", "publisherType", "Lae2/j0;", "c", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "sessionId", "j", "(Ljava/util/Map;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lae2/c0;", "request", "h", "(Ljava/util/Map;Lae2/c0;Lt13/d;)Ljava/lang/Object;", "Lae2/y;", "a", "(Ljava/util/Map;Lae2/y;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.RSA_EXPONENT, "(Ljava/util/Map;Ljava/lang/String;Lae2/y;Lt13/d;)Ljava/lang/Object;", "", "latitude", "longitude", "radiusMeters", "", "activityTypes", "Lae2/h;", "d", "(Ljava/util/Map;IIILjava/util/List;Lt13/d;)Ljava/lang/Object;", "Lae2/x;", "f", "(Ljava/util/Map;Ljava/lang/String;Lae2/x;Lt13/d;)Ljava/lang/Object;", "recipientSessionId", "", "lastMessageSeq", "Lae2/j;", "o", "(Ljava/util/Map;Ljava/lang/String;JLt13/d;)Ljava/lang/Object;", "Lae2/a0;", "Lae2/b0;", "g", "(Ljava/util/Map;Lae2/a0;Lt13/d;)Ljava/lang/Object;", "sessionIds", "Lae2/i;", "b", "(Ljava/util/Map;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "value", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface z0 {
    @i83.k({"Content-Type: application/json"})
    @i83.n("/tracker/livetrack/api/v1/sessions/")
    Object a(@i83.j Map<String, String> map, @i83.a ae2.y yVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("/tracker/grouptrack/api/v1/trackpoints/last")
    Object b(@i83.j Map<String, String> map, @i83.t("sessionId") List<String> list, t13.d<? super c83.a0<ae2.i>> dVar);

    @i83.f("/tracker/livetrack/api/v1/sessions")
    Object c(@i83.j Map<String, String> map, @i83.t("identifier") String str, @i83.t(NotificationConstants.KEY_DATA_MIME_TYPE) String str2, t13.d<? super c83.a0<ae2.j0>> dVar);

    @i83.f("/tracker/grouptrack/api/v1/sessions")
    Object d(@i83.j Map<String, String> map, @i83.t("lat") int i14, @i83.t("lon") int i15, @i83.t("radiusMeters") int i16, @i83.t("activityType") List<String> list, t13.d<? super c83.a0<ae2.h>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.n("/tracker/livetrack/api/v1/sessions/{sessionId}")
    Object e(@i83.j Map<String, String> map, @i83.s("sessionId") String str, @i83.a ae2.y yVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.n("/tracker/grouptrack/api/v1/sessions/{sessionId}")
    Object f(@i83.j Map<String, String> map, @i83.s("sessionId") String str, @i83.a ae2.x xVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.o("/tracker/grouptrack/api/v1/messages")
    Object g(@i83.j Map<String, String> map, @i83.a ae2.a0 a0Var, t13.d<? super c83.a0<ae2.b0>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.o("/tracker/livetrack/api/v1/trackpoints")
    Object h(@i83.j Map<String, String> map, @i83.a ae2.c0 c0Var, t13.d<? super c83.a0<Unit>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.n("/tracker/livetrack/api/v1/settings")
    Object i(@i83.j Map<String, String> map, @i83.a ae2.q qVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("/tracker/livetrack/api/v1/sessions/{sessionId}/shortUrl")
    Object j(@i83.j Map<String, String> map, @i83.s("sessionId") String str, t13.d<? super c83.a0<ae2.l0>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.n("tracker/livetrack/api/v1/sessions/all")
    Object k(@i83.t("privacyLevel") String str, t13.d<? super c83.a0<Unit>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.o("/tracker/gcm-gateway/api/v1/sessions")
    Object l(@i83.j Map<String, String> map, @i83.a ae2.k0 k0Var, t13.d<? super c83.a0<ae2.b>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.o("/tracker/livetrack/api/v1/sessions")
    Object m(@i83.j Map<String, String> map, @i83.a ae2.m0 m0Var, t13.d<? super c83.a0<ae2.l0>> dVar);

    @i83.k({"Content-Type: application/json"})
    @i83.o("/tracker/livetrack/api/v1/sessions/liveevent")
    Object n(@i83.j Map<String, String> map, @i83.a ae2.m0 m0Var, t13.d<? super c83.a0<ae2.l0>> dVar);

    @i83.f("/tracker/grouptrack/api/v1/messages")
    Object o(@i83.j Map<String, String> map, @i83.t("recipientSessionId") String str, @i83.t("lastMessageSeq") long j8, t13.d<? super c83.a0<ae2.j>> dVar);
}
