package com.mapbox.maps.plugin.attribution;

import com.mapbox.maps.MapboxExperimental;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/AttributionParserConfig;", "", "withImproveMap", "", "withCopyrightSign", "withTelemetryAttribution", "withMapboxAttribution", "withMapboxPrivacyPolicy", "withMapboxGeofencingConsent", "(ZZZZZZ)V", "getWithCopyrightSign", "()Z", "setWithCopyrightSign", "(Z)V", "getWithImproveMap", "setWithImproveMap", "getWithMapboxAttribution", "setWithMapboxAttribution", "getWithMapboxGeofencingConsent$annotations", "()V", "getWithMapboxGeofencingConsent", "setWithMapboxGeofencingConsent", "getWithMapboxPrivacyPolicy", "setWithMapboxPrivacyPolicy", "getWithTelemetryAttribution", "setWithTelemetryAttribution", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AttributionParserConfig {
    private boolean withCopyrightSign;
    private boolean withImproveMap;
    private boolean withMapboxAttribution;
    private boolean withMapboxGeofencingConsent;
    private boolean withMapboxPrivacyPolicy;
    private boolean withTelemetryAttribution;

    public /* synthetic */ AttributionParserConfig(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? true : z16, (i14 & 8) != 0 ? true : z17, (i14 & 16) != 0 ? true : z18, (i14 & 32) != 0 ? true : z19);
    }

    @MapboxExperimental
    public static /* synthetic */ void getWithMapboxGeofencingConsent$annotations() {
    }

    public final boolean getWithCopyrightSign() {
        return this.withCopyrightSign;
    }

    public final boolean getWithImproveMap() {
        return this.withImproveMap;
    }

    public final boolean getWithMapboxAttribution() {
        return this.withMapboxAttribution;
    }

    public final boolean getWithMapboxGeofencingConsent() {
        return this.withMapboxGeofencingConsent;
    }

    public final boolean getWithMapboxPrivacyPolicy() {
        return this.withMapboxPrivacyPolicy;
    }

    public final boolean getWithTelemetryAttribution() {
        return this.withTelemetryAttribution;
    }

    public final void setWithCopyrightSign(boolean z14) {
        this.withCopyrightSign = z14;
    }

    public final void setWithImproveMap(boolean z14) {
        this.withImproveMap = z14;
    }

    public final void setWithMapboxAttribution(boolean z14) {
        this.withMapboxAttribution = z14;
    }

    public final void setWithMapboxGeofencingConsent(boolean z14) {
        this.withMapboxGeofencingConsent = z14;
    }

    public final void setWithMapboxPrivacyPolicy(boolean z14) {
        this.withMapboxPrivacyPolicy = z14;
    }

    public final void setWithTelemetryAttribution(boolean z14) {
        this.withTelemetryAttribution = z14;
    }

    public AttributionParserConfig(boolean z14) {
        this(z14, false, false, false, false, false, 62, null);
    }

    public AttributionParserConfig(boolean z14, boolean z15) {
        this(z14, z15, false, false, false, false, 60, null);
    }

    public AttributionParserConfig(boolean z14, boolean z15, boolean z16) {
        this(z14, z15, z16, false, false, false, 56, null);
    }

    public AttributionParserConfig(boolean z14, boolean z15, boolean z16, boolean z17) {
        this(z14, z15, z16, z17, false, false, 48, null);
    }

    public AttributionParserConfig(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this(z14, z15, z16, z17, z18, false, 32, null);
    }

    public AttributionParserConfig(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.withImproveMap = z14;
        this.withCopyrightSign = z15;
        this.withTelemetryAttribution = z16;
        this.withMapboxAttribution = z17;
        this.withMapboxPrivacyPolicy = z18;
        this.withMapboxGeofencingConsent = z19;
    }

    public AttributionParserConfig() {
        this(false, false, false, false, false, false, 63, null);
    }
}
