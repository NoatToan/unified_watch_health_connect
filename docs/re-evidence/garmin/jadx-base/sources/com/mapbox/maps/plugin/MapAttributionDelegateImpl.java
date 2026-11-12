package com.mapbox.maps.plugin;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.common.MapboxOptions;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.attribution.AttributionParser;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.mapbox.maps.plugin.attribution.Attribution;
import com.mapbox.maps.plugin.attribution.AttributionParserConfig;
import com.mapbox.maps.plugin.delegates.MapAttributionDelegate;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0017J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/plugin/MapAttributionDelegateImpl;", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "mapTelemetry", "Lcom/mapbox/maps/module/MapTelemetry;", "mapGeofencingConsent", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)V", "extraAttributions", "", "Lcom/mapbox/maps/plugin/attribution/Attribution;", "getExtraAttributions", "()Ljava/util/List;", "setExtraAttributions", "(Ljava/util/List;)V", "buildMapBoxFeedbackUrl", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "geofencingConsent", "parseAttributions", "config", "Lcom/mapbox/maps/plugin/attribution/AttributionParserConfig;", "telemetry", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapAttributionDelegateImpl implements MapAttributionDelegate {
    private static final String MAP_FEEDBACK_STYLE_URI_REGEX = "^(.*://[^:^/]*)/(.*)/(.*)";
    private static final String MAP_FEEDBACK_URL = "https://apps.mapbox.com/feedback";
    private List<Attribution> extraAttributions;
    private final MapGeofencingConsent mapGeofencingConsent;
    private final MapTelemetry mapTelemetry;
    private final MapboxMap mapboxMap;

    public MapAttributionDelegateImpl(MapboxMap mapboxMap, MapTelemetry mapTelemetry, MapGeofencingConsent mapGeofencingConsent) {
        mapboxMap.getClass();
        mapTelemetry.getClass();
        mapGeofencingConsent.getClass();
        this.mapboxMap = mapboxMap;
        this.mapTelemetry = mapTelemetry;
        this.mapGeofencingConsent = mapGeofencingConsent;
        this.extraAttributions = j0.f134944a;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapAttributionDelegate
    public String buildMapBoxFeedbackUrl(Context context) {
        context.getClass();
        Uri.Builder builderBuildUpon = Uri.parse(MAP_FEEDBACK_URL).buildUpon();
        CameraState cameraState = this.mapboxMap.getCameraState();
        Point center = cameraState.getCenter();
        builderBuildUpon.encodedFragment("/" + center.longitude() + IOUtils.DIR_SEPARATOR_UNIX + center.latitude() + IOUtils.DIR_SEPARATOR_UNIX + cameraState.getZoom() + IOUtils.DIR_SEPARATOR_UNIX + cameraState.getBearing() + IOUtils.DIR_SEPARATOR_UNIX + cameraState.getPitch());
        String packageName = context.getApplicationContext().getPackageName();
        if (packageName != null) {
            builderBuildUpon.appendQueryParameter("referrer", packageName);
        }
        builderBuildUpon.appendQueryParameter("access_token", MapboxOptions.getAccessToken());
        Style styleDeprecated = this.mapboxMap.getStyleDeprecated();
        if (styleDeprecated != null) {
            Pattern patternCompile = Pattern.compile(MAP_FEEDBACK_STYLE_URI_REGEX);
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(styleDeprecated.getStyleURI());
            matcher.getClass();
            if (matcher.find()) {
                builderBuildUpon.appendQueryParameter("owner", matcher.group(2)).appendQueryParameter(TtmlNode.ATTR_ID, matcher.group(3));
            }
        }
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapAttributionDelegate
    @MapboxExperimental
    /* JADX INFO: renamed from: geofencingConsent, reason: from getter */
    public MapGeofencingConsent getMapGeofencingConsent() {
        return this.mapGeofencingConsent;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapAttributionDelegate
    public List<Attribution> getExtraAttributions() {
        return this.extraAttributions;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapAttributionDelegate
    public List<Attribution> parseAttributions(Context context, AttributionParserConfig config) {
        context.getClass();
        config.getClass();
        Object[] array = this.mapboxMap.getAttributions().toArray(new String[0]);
        array.getClass();
        String[] strArr = (String[]) array;
        return h0.b1(new AttributionParser.Options(context).withCopyrightSign(config.getWithCopyrightSign()).withImproveMap(config.getWithImproveMap()).withTelemetryAttribution(config.getWithTelemetryAttribution()).withMapboxAttribution(config.getWithMapboxAttribution()).withMapboxPrivacyPolicy(config.getWithMapboxPrivacyPolicy()).withMapboxGeofencingConsent(config.getWithMapboxGeofencingConsent()).withAttributionData((String[]) Arrays.copyOf(strArr, strArr.length)).withExtraAttributions(getExtraAttributions()).build().getAttributions());
    }

    @Override // com.mapbox.maps.plugin.delegates.MapAttributionDelegate
    public void setExtraAttributions(List<Attribution> list) {
        list.getClass();
        this.extraAttributions = list;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapAttributionDelegate
    /* JADX INFO: renamed from: telemetry, reason: from getter */
    public MapTelemetry getMapTelemetry() {
        return this.mapTelemetry;
    }
}
