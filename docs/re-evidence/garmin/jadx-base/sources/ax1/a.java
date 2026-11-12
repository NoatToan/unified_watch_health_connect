package ax1;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import xw1.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b0\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00042\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0004H'¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u00070\u0006H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lax1/a;", "", "", "planId", "", "language", "Lo53/i0;", "Lc83/a0;", "Lxw1/d;", JWKParameterNames.RSA_EXPONENT, "(JLjava/lang/String;)Lo53/i0;", "", "Lxw1/p;", "d", "(Ljava/lang/String;)Lo53/i0;", "athletePlanId", "", "b", "(J)Lo53/i0;", "goal", "", "raceGoalTime", "lang", "Lxw1/h;", "c", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lo53/i0;", "a", "()Lo53/i0;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/atp/athlete/active")
    i0<a0<List<xw1.d>>> a();

    @o("/atp/athlete/quit")
    i0<a0<Unit>> b(@t("athletePlanId") long athletePlanId);

    @i83.f("/atp/setup/plans/change")
    i0<a0<List<xw1.h>>> c(@t("athletePlanId") long athletePlanId, @t("goal") String goal, @t("raceGoalTime") Integer raceGoalTime, @t("lang") String lang);

    @i83.f("/atp/types/")
    i0<a0<List<p>>> d(@t("lang") String language);

    @i83.f("/atp/athlete/plan")
    i0<a0<xw1.d>> e(@t("athletePlanId") long planId, @t("lang") String language);
}
