package r92;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0012\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0013\u0010\u0011J>\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u000e\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u000e\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u000e\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001d\u0010\u001cJ>\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u000e\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001e\u0010\u001aJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001f\u0010\u0007J \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u0007J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0004H§@¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0004H§@¢\u0006\u0004\b%\u0010#J+\u0010)\u001a\b\u0012\u0004\u0012\u00020$0(2\b\b\u0001\u0010&\u001a\u00020$2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b)\u0010*J&\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,0\u00042\b\b\u0003\u0010+\u001a\u00020\u0015H§@¢\u0006\u0004\b-\u0010.J0\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,0\u00042\b\b\u0001\u0010/\u001a\u00020\u00022\b\b\u0003\u0010+\u001a\u00020\u0015H§@¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lr92/a;", "", "", "consentTypeId", "Lc83/a0;", "Ls92/c;", "d", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "consentFeature", "a", "childUserprofileId", "h", "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Ls92/h;", "requestBody", "", JWKParameterNames.RSA_MODULUS, "(Ls92/h;Lt13/d;)Ljava/lang/Object;", "f", "c", "passwordChallengeToken", "", "clientIndicator", "Ls92/d;", "Ls92/i;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLs92/d;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/lang/String;ZLs92/d;Lt13/d;)Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.OCT_KEY_VALUE, "j", "g", "Ls92/k;", "m", "(Lt13/d;)Ljava/lang/Object;", "Ls92/a;", "l", "accountDeviceSyncDTO", "xActor", "Lc83/d;", "o", "(Ls92/a;Ljava/lang/String;)Lc83/d;", "incompleteOnly", "", "p", "(ZLt13/d;)Ljava/lang/Object;", "childId", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;ZLt13/d;)Ljava/lang/Object;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    @i83.f("gdprconsent-service/feature/{consentFeature}")
    Object a(@s("consentFeature") String str, t13.d<? super a0<s92.c>> dVar);

    @o("gdprconsent-service/consent/revoke/{consentTypeId}/{clientIndicator}")
    Object b(@i83.i("passwordChallengeToken") String str, @s("consentTypeId") String str2, @s("clientIndicator") boolean z14, @i83.a s92.d dVar, t13.d<? super a0<s92.i>> dVar2);

    @o("gdprconsent-service/consent/managed-accounts/grant")
    Object c(@i83.a s92.h hVar, t13.d<? super a0<Unit>> dVar);

    @i83.f("gdprconsent-service/feature/consent/{consentTypeId}")
    Object d(@s("consentTypeId") String str, t13.d<? super a0<s92.c>> dVar);

    @i83.f("gdprconsent-service/feature/managed-accounts/{childUserId}/all")
    Object e(@s("childUserId") String str, @t("incompleteOnly") boolean z14, t13.d<? super a0<List<s92.c>>> dVar);

    @o("gdprconsent-service/consent/revoke")
    Object f(@i83.a s92.h hVar, t13.d<? super a0<Unit>> dVar);

    @o("gdprconsent-service/feature/optout/{consentFeature}")
    Object g(@s("consentFeature") String str, t13.d<? super a0<s92.c>> dVar);

    @i83.f("gdprconsent-service/feature/managed-accounts/{childUserprofileId}/{consentFeature}")
    Object h(@s("childUserprofileId") String str, @s("consentFeature") String str2, t13.d<? super a0<s92.c>> dVar);

    @o("gdprconsent-service/consent/managed-accounts/revoke/{consentTypeId}/{clientIndicator}")
    Object i(@s("consentTypeId") String str, @s("clientIndicator") boolean z14, @i83.a s92.d dVar, t13.d<? super a0<s92.i>> dVar2);

    @o("gdprconsent-service/feature/optin/{consentFeature}")
    Object j(@s("consentFeature") String str, t13.d<? super a0<s92.c>> dVar);

    @o("gdprconsent-service/consent/managed-accounts/revoke/{consentTypeId}/{clientIndicator}")
    Object k(@i83.i("passwordChallengeToken") String str, @s("consentTypeId") String str2, @s("clientIndicator") boolean z14, @i83.a s92.d dVar, t13.d<? super a0<s92.i>> dVar2);

    @i83.f("userpreference-service/account.deviceSync")
    Object l(t13.d<? super a0<s92.a>> dVar);

    @i83.f("gdprconsent-service/feature/data-sync/indicators")
    Object m(t13.d<? super a0<s92.k>> dVar);

    @o("gdprconsent-service/consent/grant")
    Object n(@i83.a s92.h hVar, t13.d<? super a0<Unit>> dVar);

    @p("userpreference-service/account.deviceSync")
    c83.d<s92.a> o(@i83.a s92.a accountDeviceSyncDTO, @i83.i("X-actor") String xActor);

    @i83.f("gdprconsent-service/feature/all")
    Object p(@t("incompleteOnly") boolean z14, t13.d<? super a0<List<s92.c>>> dVar);

    @o("gdprconsent-service/consent/revoke/{consentTypeId}/{clientIndicator}")
    Object q(@s("consentTypeId") String str, @s("clientIndicator") boolean z14, @i83.a s92.d dVar, t13.d<? super a0<s92.i>> dVar2);
}
