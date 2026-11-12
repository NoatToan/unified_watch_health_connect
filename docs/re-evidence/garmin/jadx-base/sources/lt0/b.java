package lt0;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.p;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\b\u0010\u0006J'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u0002H'¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Llt0/b;", "", "Lo53/i0;", "Lc83/a0;", "", "a", "()Lo53/i0;", JWKParameterNames.RSA_EXPONENT, "b", "", "weeksAgo", "c", "(Ljava/lang/Integer;)Lo53/i0;", "", "d", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("/userprofile-service/userprofile/optional-feature/wellness-autoleaderboard/opt-in")
    i0<a0<String>> a();

    @i83.f("/challenge-service/challenge/active")
    i0<a0<String>> b();

    @i83.f("/autochallenge-service/autochallenge/previous")
    i0<a0<String>> c(@t("weeksAgo") Integer weeksAgo);

    @i83.f("/autochallenge-service/autochallenge/participation")
    i0<a0<Boolean>> d();

    @p("/userprofile-service/userprofile/optional-feature/wellness-autoleaderboard/opt-out")
    i0<a0<String>> e();
}
