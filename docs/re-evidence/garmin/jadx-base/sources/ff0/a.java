package ff0;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJc\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0012\u0010\u0013Ja\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b0\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b0\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lff0/a;", "", "", "firstDay", "lastDay", "", "pageSize", "Lo53/i0;", "Lc83/a0;", "Lff0/g;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo53/i0;", "page", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "", "symptoms", "results", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lo53/i0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lo53/i0;", "detailId", "Lgf0/b;", "a", "(Ljava/lang/String;)Lo53/i0;", "", JWKParameterNames.RSA_EXPONENT, "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/ghs/ecg/v1/ecg/{detailId}")
    i0<a0<gf0.b>> a(@i83.s("detailId") String detailId);

    @i83.f("/ghs/ecg/v1/ecg/list/next?")
    i0<a0<g>> b(@i83.t("firstDay") String firstDay, @i83.t("lastDay") String lastDay, @i83.t("symptom") List<String> symptoms, @i83.t("result") List<String> results, @i83.t("page") String page);

    @i83.f("/ghs/ecg/v1/ecg/daily/next?")
    i0<a0<g>> c(@i83.t("firstDay") String firstDay, @i83.t("lastDay") String lastDay, @i83.t("page") String page);

    @i83.f("/ghs/ecg/v1/ecg/list?")
    i0<a0<g>> d(@i83.t("firstDay") String firstDay, @i83.t("lastDay") String lastDay, @i83.t("symptom") List<String> symptoms, @i83.t("result") List<String> results, @i83.t("pageSize") Integer pageSize);

    @i83.b("/ghs/ecg/v1/ecg/{detailId}")
    i0<a0<Unit>> e(@i83.s("detailId") String detailId);

    @i83.f("/ghs/ecg/v1/ecg/daily?")
    i0<a0<g>> f(@i83.t("firstDay") String firstDay, @i83.t("lastDay") String lastDay, @i83.t("pageSize") Integer pageSize);
}
