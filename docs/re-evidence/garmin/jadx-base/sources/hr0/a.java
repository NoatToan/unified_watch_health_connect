package hr0;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fz0.c;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\tH'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lhr0/a;", "", "Lfz0/c;", "date", "Lo53/i0;", "Lc83/a0;", "Lir0/a;", "d", "(Lfz0/c;)Lo53/i0;", "", "a", "", "days", "Lir0/c;", "c", "(Lfz0/c;I)Lo53/i0;", "startDate", "endDate", "", "Lir0/f;", "f", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "b", "Lb22/f;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/mobile-gateway/snapshot/timeline/v2/forDate/{date}")
    i0<a0<String>> a(@s("date") c date);

    @f("/usersummary-service/stats/im/weekly/{startDate}/{endDate}")
    i0<a0<List<ir0.f>>> b(@s("startDate") c startDate, @s("endDate") c endDate);

    @f("/wellness-service/stats/hourly/im/{endDate}/{days}")
    i0<a0<ir0.c>> c(@s("endDate") c date, @s("days") int days);

    @f("/wellness-service/wellness/daily/im/{date}")
    i0<a0<ir0.a>> d(@s("date") c date);

    @f("/usersummary-service/v2/dailysummaries")
    i0<a0<b22.f>> e(@t("startDate") String startDate, @t("endDate") String endDate);

    @f("/usersummary-service/stats/im/daily/{startDate}/{endDate}")
    i0<a0<List<ir0.f>>> f(@s("startDate") c startDate, @s("endDate") c endDate);
}
