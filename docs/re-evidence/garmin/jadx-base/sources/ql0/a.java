package ql0;

import c83.a0;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingSessionDTO;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.k;
import i83.n;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0001\u0010\u000b\u001a\u00020\bH'¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\r0\f2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\r0\f2\b\b\u0001\u0010\u000b\u001a\u00020\bH'¢\u0006\u0004\b \u0010\u0010J%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\r0\f2\b\b\u0001\u0010\u000b\u001a\u00020\bH'¢\u0006\u0004\b!\u0010\u0010¨\u0006\"À\u0006\u0003"}, d2 = {"Lql0/a;", "", "", "includeFavoriteSwings", "", "page", "perPage", "Lc83/d;", "", "d", "(ZII)Lc83/d;", "sessionId", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingSessionDTO;", "c", "(Ljava/lang/String;)Lo53/i0;", "deleted", "includeStats", "includeVirtualStats", "retired", JWKParameterNames.RSA_EXPONENT, "(ZZZZ)Lc83/d;", "validOnly", "g", "(Z)Lc83/d;", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/d;", "patchDTO", "", "a", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/golf/truswing/model/d;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingDTO;", "f", "b", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @k({"Content-Type: application/json-patch+json"})
    @n("swing-session/{sessionId}")
    i0<a0<Unit>> a(@s("sessionId") String sessionId, @i83.a com.garmin.android.apps.connectmobile.golf.truswing.model.d patchDTO);

    @i83.b("swing/{sessionId}")
    i0<a0<Unit>> b(@s("sessionId") String sessionId);

    @i83.f("swing-session/{sessionId}")
    i0<a0<SwingSessionDTO>> c(@s("sessionId") String sessionId);

    @i83.f("swing-session/player")
    c83.d<String> d(@t("include-favorite-swings") boolean includeFavoriteSwings, @t("page") int page, @t("per-page") int perPage);

    @i83.f("club/player")
    c83.d<String> e(@t("deleted") boolean deleted, @t("include-stats") boolean includeStats, @t("include-virtual-stats") boolean includeVirtualStats, @t("retired") boolean retired);

    @i83.f("swing/{sessionId}")
    i0<a0<SwingDTO>> f(@s("sessionId") String sessionId);

    @i83.f("club/types")
    c83.d<String> g(@t("validOnly") boolean validOnly);
}
