package re0;

import ch.qos.logback.core.joran.action.Action;
import com.nimbusds.jose.jwk.JWKParameterNames;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0011\u0010\u0010JW\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00030\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0017\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u0012H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lre0/a;", "", "Lo53/i0;", "Lc83/a0;", "Lue0/b;", "c", "()Lo53/i0;", "Lue0/o;", "sendInviteBody", "Lue0/j;", "a", "(Lue0/o;)Lo53/i0;", "", "inviteId", "", "b", "(J)Lo53/i0;", "d", "", "responseType", "subjectIdConnectUserId", "clientId", "codeChallenge", "codeChallengeMethod", Action.SCOPE_ATTRIBUTE, "Lue0/f;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2862a f152088a = C2862a.f152089a;

    /* JADX INFO: renamed from: re0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lre0/a$a;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2862a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C2862a f152089a = new C2862a();

        private C2862a() {
        }
    }

    @i83.o("/accountsharing-service/account/delegation/invites")
    i0<c83.a0<ue0.j>> a(@i83.a ue0.o sendInviteBody);

    @i83.b("/accountsharing-service/account/delegation/invites/{inviteId}")
    i0<c83.a0<Unit>> b(@i83.s("inviteId") long inviteId);

    @i83.f("/accountsharing-service/account/delegation/invites")
    i0<c83.a0<ue0.b>> c();

    @i83.p("/accountsharing-service/account/delegation/invites/{inviteId}/accept")
    i0<c83.a0<Unit>> d(@i83.s("inviteId") long inviteId);

    @i83.f("/accountsharing-service/account/delegation/authorize")
    i0<c83.a0<ue0.f>> e(@i83.t("response_type") String responseType, @i83.t("subject_id_connect_user_id") String subjectIdConnectUserId, @i83.t("client_id") String clientId, @i83.t("code_challenge") String codeChallenge, @i83.t("code_challenge_method") String codeChallengeMethod, @i83.t(Action.SCOPE_ATTRIBUTE) String scope);
}
