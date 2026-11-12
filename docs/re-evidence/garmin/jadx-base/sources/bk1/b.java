package bk1;

import c83.a0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d20.d;
import hk1.g;
import hk1.h;
import hk1.o;
import i83.c;
import i83.e;
import i83.f;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ[\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH'¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\bH'¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00030\u00022\b\b\u0001\u0010\u001a\u001a\u00020\bH'¢\u0006\u0004\b\u001c\u0010\fJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00030\u00022\b\b\u0001\u0010\u001d\u001a\u00020\bH'¢\u0006\u0004\b\u001f\u0010\fJ!\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00030\u0002H'¢\u0006\u0004\b!\u0010\u0007J/\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u00022\b\b\u0001\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%¨\u0006&À\u0006\u0003"}, d2 = {"Lbk1/b;", "", "Lo53/i0;", "Lc83/a0;", "", "Lhk1/a0;", "f", "()Lo53/i0;", "", "token", "Ld20/d;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;)Lo53/i0;", "responseType", "clientId", "redirectUri", RemoteConfigConstants.ResponseFieldKey.STATE, "codeChallenge", "codeChallengeMethod", "Lhk1/a;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "verifier", "", "b", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "partnerClientId", "Lhk1/b;", "h", "consumerKey", "Lhk1/g;", "d", "Lhk1/h;", "g", "Lhk1/o;", "permission", "a", "(Ljava/lang/String;Lhk1/o;)Lo53/i0;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @p("partner-service/consumer/permissions/{consumerKey}")
    i0<a0<Unit>> a(@s("consumerKey") String consumerKey, @i83.a o permission);

    @i83.o("oauth-service/oauth/oauth_token")
    @e
    i0<a0<Unit>> b(@c("token") String token, @c("verifier") String verifier);

    @f("di-oauth2-service/authorize")
    i0<a0<hk1.a>> c(@t("response_type") String responseType, @t("client_id") String clientId, @t("redirect_uri") String redirectUri, @t(RemoteConfigConstants.ResponseFieldKey.STATE) String state, @t("code_challenge") String codeChallenge, @t("code_challenge_method") String codeChallengeMethod);

    @f("consumer-service/consumer/capabilitiesForUser/{consumerKey}")
    i0<a0<g>> d(@s("consumerKey") String consumerKey);

    @f("oauth-service/oauth/oauth_token")
    i0<a0<d>> e(@t("token") String token);

    @f("partner-service/user-partner-connection")
    i0<a0<List<hk1.a0>>> f();

    @f("partner-service/consumer/permissions")
    i0<a0<List<h>>> g();

    @i83.o("partner-service/user-partner-connection/validate-auth-code-request")
    @e
    i0<a0<hk1.b>> h(@c("partnerClientId") String partnerClientId);
}
