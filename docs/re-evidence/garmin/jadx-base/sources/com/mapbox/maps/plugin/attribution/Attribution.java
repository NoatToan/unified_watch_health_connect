package com.mapbox.maps.plugin.attribution;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/Attribution;", "", "title", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "titleAbbreviated", "getTitleAbbreviated", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Attribution {
    public static final String ABOUT_MAPS_URL = "https://www.mapbox.com/about/maps/";
    public static final String ABOUT_TELEMETRY_URL = "https://www.mapbox.com/telemetry/";
    public static final String GEOFENCING = "Mapbox Geofencing";
    public static final String GEOFENCING_URL_MARKER = "geofencing_url_marker";
    public static final String OSM = "OpenStreetMap";
    public static final String OSM_ABBR = "OSM";
    public static final String PRIVACY_POLICY = "Mapbox Privacy Policy";
    public static final String PRIVACY_POLICY_URL = "https://www.mapbox.com/legal/privacy#product-privacy-policy/";
    public static final String TELEMETRY_SETTINGS = "Mapbox Telemetry";
    private final String title;
    private final String url;

    public Attribution(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.url = str2;
    }

    public static /* synthetic */ Attribution copy$default(Attribution attribution, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = attribution.title;
        }
        if ((i14 & 2) != 0) {
            str2 = attribution.url;
        }
        return attribution.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Attribution copy(String title, String url) {
        title.getClass();
        url.getClass();
        return new Attribution(title, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Attribution)) {
            return false;
        }
        Attribution attribution = (Attribution) other;
        return s.g(this.title, attribution.title) && s.g(this.url, attribution.url);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleAbbreviated() {
        return s.g(this.title, OSM) ? OSM_ABBR : this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Attribution(title=");
        sb3.append(this.title);
        sb3.append(", url=");
        return a0.m(sb3, this.url, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
