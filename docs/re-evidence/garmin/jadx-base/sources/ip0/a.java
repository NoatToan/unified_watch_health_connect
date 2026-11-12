package ip0;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fz0.c;
import i83.f;
import i83.p;
import i83.s;
import java.util.List;
import jp0.b;
import jp0.d;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00060\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lip0/a;", "", "", "startDate", "endDate", "Lo53/i0;", "Lc83/a0;", "", "Ljp0/a;", "c", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "", "numOfWeeks", "Ljp0/f;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;I)Lo53/i0;", "Lfz0/c;", "date", "Ljp0/b;", "d", "(Lfz0/c;)Lo53/i0;", "Lop0/c;", "hydrationSettings", "a", "(Lfz0/c;Lop0/c;)Lo53/i0;", "Ljp0/d;", "hydrationData", "b", "(Ljp0/d;)Lo53/i0;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @p("/usersummary-service/usersummary/hydration/allData/{date}")
    i0<a0<b>> a(@s("date") c date, @i83.a op0.c hydrationSettings);

    @p("/usersummary-service/usersummary/hydration/log")
    i0<a0<b>> b(@i83.a d hydrationData);

    @f("usersummary-service/stats/hydration/daily/{startDate}/{endDate}")
    i0<a0<List<jp0.a>>> c(@s("startDate") String startDate, @s("endDate") String endDate);

    @f("/usersummary-service/usersummary/hydration/allData/{date}")
    i0<a0<b>> d(@s("date") c date);

    @f("usersummary-service/stats/hydration/weekly/{endDate}/{numOfWeeks}")
    i0<a0<List<jp0.f>>> e(@s("endDate") String endDate, @s("numOfWeeks") int numOfWeeks);
}
