package ig0;

import c83.a0;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fg0.k;
import fg0.n;
import fg0.o;
import i83.i;
import i83.p;
import i83.t;
import i83.y;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001Jë\u0001\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00160\u001a0\u00192\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\b\b\u0003\u0010\u0014\u001a\u00020\n2\b\b\u0003\u0010\u0015\u001a\u00020\f2\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\b\b\u0001\u0010\u0018\u001a\u00020\fH'¢\u0006\u0004\b\u001c\u0010\u001dJÇ\u0001\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00160\u001a0\u00192\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\b\b\u0003\u0010\u0014\u001a\u00020\n2\b\b\u0003\u0010\u0015\u001a\u00020\f2\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\b\b\u0001\u0010\u0018\u001a\u00020\fH'¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u001a0\u0019H'¢\u0006\u0004\b!\u0010\"J/\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001a0\u00192\b\b\u0001\u0010#\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020$H'¢\u0006\u0004\b'\u0010(J%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001a0\u00192\b\b\u0001\u0010)\u001a\u00020\u0002H'¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\b\b\u0001\u0010)\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010+¨\u0006-À\u0006\u0003"}, d2 = {"Lig0/a;", "", "", "eventType", "searchPhrase", "fromDate", "toDate", "", "poiLat", "poiLon", "", "withinMeters", "", "includeInPerson", "includeVirtual", "completionTargetDurationType", "completionTargetMaxValue", "completionTargetMinValue", "", "verifiedStatus", MapboxMap.QFE_LIMIT, "disableHtmlSanitization", "", "eventsProviders", "includeNst", "Lo53/i0;", "Lc83/a0;", "Lfg0/o;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;IZLjava/util/List;Z)Lo53/i0;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;IZLjava/util/List;Z)Lo53/i0;", "Lfg0/n;", "b", "()Lo53/i0;", "sig", "Lfg0/p;", "eventSearchResultDTO", "Lfg0/k;", "f", "(Ljava/lang/String;Lfg0/p;)Lo53/i0;", "url", "a", "(Ljava/lang/String;)Lo53/i0;", "c", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f
    i0<a0<k>> a(@y String url);

    @i83.f("calendar-service/race-events/providers")
    i0<a0<List<n>>> b();

    @i83.f
    i0<a0<o>> c(@y String url);

    @i83.f("/race-search/events/")
    i0<a0<List<o>>> d(@t("eventType") String eventType, @t("searchPhrase") String searchPhrase, @t("fromDate") String fromDate, @t("toDate") String toDate, @t("poiLat") Double poiLat, @t("poiLon") Double poiLon, @t("withinMeters") Integer withinMeters, @t("includeInPerson") boolean includeInPerson, @t("includeVirtual") boolean includeVirtual, @t("completionTargetDurationType") String completionTargetDurationType, @t("completionTargetMaxValue") Integer completionTargetMaxValue, @t("completionTargetMinValue") Integer completionTargetMinValue, @t("verifiedStatuses") String[] verifiedStatus, @t(MapboxMap.QFE_LIMIT) int limit, @t("disableHtmlSanitization") boolean disableHtmlSanitization, @t("eventsProviders") List<String> eventsProviders, @t("includeNst") boolean includeNst);

    @i83.f("/race-search/events")
    i0<a0<List<o>>> e(@t("eventType") String eventType, @t("searchPhrase") String searchPhrase, @t("fromDate") String fromDate, @t("toDate") String toDate, @t("includeInPerson") boolean includeInPerson, @t("includeVirtual") boolean includeVirtual, @t("completionTargetDurationType") String completionTargetDurationType, @t("completionTargetMaxValue") Integer completionTargetMaxValue, @t("completionTargetMinValue") Integer completionTargetMinValue, @t("verifiedStatuses") String[] verifiedStatus, @t(MapboxMap.QFE_LIMIT) int limit, @t("disableHtmlSanitization") boolean disableHtmlSanitization, @t("eventsProviders") List<String> eventsProviders, @t("includeNst") boolean includeNst);

    @p("calendar-service/event/discoverable/conversion")
    i0<a0<k>> f(@i("X-RaceEvent-Sig") String sig, @i83.a fg0.p eventSearchResultDTO);
}
