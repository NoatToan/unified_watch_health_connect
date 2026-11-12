package nq0;

import c83.a0;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.common.HttpHeaders;
import com.roomorama.caldroid.CaldroidFragment;
import i83.f;
import i83.p;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import tq0.c;
import tq0.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00060\u0005H'¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00060\u00052\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¢\u0006\u0004\b\u000f\u0010\u0010Ju\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00152\b\b\u0003\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lnq0/a;", "", "", "lang", "localeUnit", "Lo53/i0;", "Lc83/a0;", "Ltq0/d;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "", "Ltq0/f;", "b", "()Lo53/i0;", "preferences", "c", "(Ljava/util/List;)Lo53/i0;", "gender", HttpHeaders.AGE, NotificationConstants.KEY_DATA_MIME_TYPE, "field", "", CaldroidFragment.YEAR, CaldroidFragment.MONTH, "", "requireUserValue", "Ltq0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;)Lo53/i0;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("gcs-insights/api/demographics/compare")
    i0<a0<c>> a(@t("gender") String gender, @t(HttpHeaders.AGE) String age, @t(NotificationConstants.KEY_DATA_MIME_TYPE) String type, @t("field") String field, @t(CaldroidFragment.YEAR) int year, @t(CaldroidFragment.MONTH) int month, @t("requireUserValue") boolean requireUserValue, @t("localeUnit") String localeUnit, @t("lang") String lang);

    @f("userpreference-service/demographicComparisonPreferences")
    i0<a0<List<tq0.f>>> b();

    @p("userpreference-service/demographicComparisonPreferences")
    i0<a0<List<tq0.f>>> c(@i83.a List<tq0.f> preferences);

    @f("gcs-insights/api/demographics/selections")
    i0<a0<d>> d(@t("lang") String lang, @t("localeUnit") String localeUnit);
}
