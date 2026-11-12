package re0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0002H'¢\u0006\u0004\b\b\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0002H'¢\u0006\u0004\b\t\u0010\u0006JM\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\nH'¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00030\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u0013H'¢\u0006\u0004\b\u001f\u0010\u0017J%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00030\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u0013H'¢\u0006\u0004\b \u0010\u0017J%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\"\u0010\u0017J%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b$\u0010\u0017J/\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010&\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J9\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010)\u001a\u00020\n2\b\b\u0001\u0010&\u001a\u00020%H'¢\u0006\u0004\b*\u0010+J/\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010)\u001a\u00020\nH'¢\u0006\u0004\b-\u0010.J/\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010)\u001a\u00020\nH'¢\u0006\u0004\b/\u0010.J%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b1\u0010\u0017J/\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u00102\u001a\u000200H'¢\u0006\u0004\b3\u00104J+\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206050\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b7\u0010\u0017J/\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u00108\u001a\u00020\u0013H'¢\u0006\u0004\b:\u0010;J/\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010<\u001a\u00020\nH'¢\u0006\u0004\b>\u0010.J/\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u00108\u001a\u00020\u0013H'¢\u0006\u0004\b?\u0010;J/\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010<\u001a\u00020\nH'¢\u0006\u0004\b@\u0010.J%\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00030\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\bA\u0010\u0017¨\u0006BÀ\u0006\u0003"}, d2 = {"Lre0/n;", "", "Lo53/i0;", "Lc83/a0;", "Lue0/l;", "d", "()Lo53/i0;", "Lue0/k;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "u", "", "responseType", "subjectIdConnectUserId", "clientId", "codeChallenge", "codeChallengeMethod", "Lue0/f;", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "", "childId", "Lue0/b;", "p", "(J)Lo53/i0;", "Lue0/o;", "sendInviteBody", "Lue0/j;", "h", "(JLue0/o;)Lo53/i0;", "inviteId", "", "f", "g", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "b", "Ll20/r;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Ll20/a;", "userContactsDTO", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(JLl20/a;)Lo53/i0;", "uuid", JWKParameterNames.RSA_EXPONENT, "(JLjava/lang/String;Ll20/a;)Lo53/i0;", "", "c", "(JLjava/lang/String;)Lo53/i0;", "m", "Ltj1/e;", JWKParameterNames.OCT_KEY_VALUE, "contactsDTO", JWKParameterNames.RSA_MODULUS, "(JLtj1/e;)Lo53/i0;", "", "Lue0/h;", "a", "contactInfoPk", "Ltj1/r;", "j", "(JJ)Lo53/i0;", "token", "Lue0/g;", IntegerTokenConverter.CONVERTER_KEY, "l", "o", "s", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface n {
    @i83.f("managedaccount-gateway/device/child/{childUserId}/deviceregistration/devices")
    i0<c83.a0<List<ue0.h>>> a(@i83.s("childUserId") long childId);

    @i83.f("managedaccount-gateway/userprofile/child/{childUserId}/socialProfile/v2")
    i0<c83.a0<com.garmin.android.apps.connectmobile.userprofile.model.m>> b(@i83.s("childUserId") long childId);

    @i83.b("managedaccount-gateway/user-contact/child/{childUserId}/contacts/{uuid}")
    i0<c83.a0<Boolean>> c(@i83.s("childUserId") long childId, @i83.s("uuid") String uuid);

    @i83.f("/accountsharing-service/managed-accounts/admin-info")
    i0<c83.a0<ue0.l>> d();

    @i83.p("managedaccount-gateway/user-contact/child/{childUserId}/contacts/{uuid}")
    i0<c83.a0<l20.a>> e(@i83.s("childUserId") long childId, @i83.s("uuid") String uuid, @i83.a l20.a userContactsDTO);

    @i83.b("/accountsharing-service/account/delegation/invites/{inviteId}")
    i0<c83.a0<Unit>> f(@i83.s("inviteId") long inviteId);

    @i83.p("/accountsharing-service/account/delegation/invites/{inviteId}/accept")
    i0<c83.a0<Unit>> g(@i83.s("inviteId") long inviteId);

    @i83.o("/accountsharing-service/managed-accounts/{childUserId}/account-delegations")
    i0<c83.a0<ue0.j>> h(@i83.s("childUserId") long childId, @i83.a ue0.o sendInviteBody);

    @i83.o("managedaccount-gateway/user-contact/child/{childUserId}/feature/emergencyContact/confirmation/{token}/pending")
    i0<c83.a0<ue0.g>> i(@i83.s("childUserId") long childId, @i83.s("token") String token);

    @i83.f("managedaccount-gateway/user-contact/child/{childUserId}/feature/emergencyContact/confirmation/{contactInfoPk}/initialize")
    i0<c83.a0<tj1.r>> j(@i83.s("childUserId") long childId, @i83.s("contactInfoPk") long contactInfoPk);

    @i83.f("managedaccount-gateway/user-contact/child/{childUserId}/contacts/ECC")
    i0<c83.a0<tj1.e>> k(@i83.s("childUserId") long childId);

    @i83.f("managedaccount-gateway/user-contact/child/{childUserId}/feature/livetrack/confirmation/{contactInfoPk}/initialize")
    i0<c83.a0<tj1.r>> l(@i83.s("childUserId") long childId, @i83.s("contactInfoPk") long contactInfoPk);

    @i83.f("managedaccount-gateway/user-contact/child/{childUserId}/contacts/{uuid}")
    i0<c83.a0<l20.r>> m(@i83.s("childUserId") long childId, @i83.s("uuid") String uuid);

    @i83.p("managedaccount-gateway/user-contact/child/{childUserId}/contacts/ECC")
    i0<c83.a0<Unit>> n(@i83.s("childUserId") long childId, @i83.a tj1.e contactsDTO);

    @i83.o("managedaccount-gateway/user-contact/child/{childUserId}/feature/livetrack/confirmation/{token}/pending")
    i0<c83.a0<ue0.g>> o(@i83.s("childUserId") long childId, @i83.s("token") String token);

    @i83.f("/accountsharing-service/managed-accounts/{childUserId}/account-delegations")
    i0<c83.a0<ue0.b>> p(@i83.s("childUserId") long childId);

    @i83.f("/accountsharing-service/managed-accounts/group")
    i0<c83.a0<ue0.k>> q();

    @i83.o("managedaccount-gateway/user-contact/child/{childUserId}/contacts")
    i0<c83.a0<l20.a>> r(@i83.s("childUserId") long childId, @i83.a l20.a userContactsDTO);

    @i83.o("managedaccount-gateway/user-contact/child/{childUserId}/contacts/default")
    i0<c83.a0<Unit>> s(@i83.s("childUserId") long childId);

    @i83.f("managedaccount-gateway/user-contact/child/{childUserId}/contacts")
    i0<c83.a0<l20.r>> t(@i83.s("childUserId") long childId);

    @i83.f("/accountsharing-service/managed-accounts/withviewable")
    i0<c83.a0<ue0.k>> u();

    @i83.f("/accountsharing-service/managed-accounts/authorize")
    i0<c83.a0<ue0.f>> v(@i83.t("response_type") String responseType, @i83.t("subject_id_connect_user_id") String subjectIdConnectUserId, @i83.t("client_id") String clientId, @i83.t("code_challenge") String codeChallenge, @i83.t("code_challenge_method") String codeChallengeMethod);
}
