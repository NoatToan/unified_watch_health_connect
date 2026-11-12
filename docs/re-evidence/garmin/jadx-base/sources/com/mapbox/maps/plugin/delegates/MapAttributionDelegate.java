package com.mapbox.maps.plugin.delegates;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.mapbox.maps.plugin.attribution.Attribution;
import com.mapbox.maps.plugin.attribution.AttributionParserConfig;
import java.util.List;
import o13.o;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&R0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "", "<anonymous parameter 0>", "", "Lcom/mapbox/maps/plugin/attribution/Attribution;", "extraAttributions", "getExtraAttributions", "()Ljava/util/List;", "setExtraAttributions", "(Ljava/util/List;)V", "buildMapBoxFeedbackUrl", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "geofencingConsent", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "parseAttributions", "config", "Lcom/mapbox/maps/plugin/attribution/AttributionParserConfig;", "telemetry", "Lcom/mapbox/maps/module/MapTelemetry;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapAttributionDelegate {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static List<Attribution> getExtraAttributions(MapAttributionDelegate mapAttributionDelegate) {
            return j0.f134944a;
        }

        public static void setExtraAttributions(MapAttributionDelegate mapAttributionDelegate, List<Attribution> list) {
            list.getClass();
            throw new o(null, 1, null);
        }
    }

    String buildMapBoxFeedbackUrl(Context context);

    MapGeofencingConsent geofencingConsent();

    List<Attribution> getExtraAttributions();

    List<Attribution> parseAttributions(Context context, AttributionParserConfig config);

    void setExtraAttributions(List<Attribution> list);

    MapTelemetry telemetry();
}
