package com.mapbox.maps.plugin.viewport.data;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.EdgeInsets;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB/\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions;", "", "padding", "Lcom/mapbox/maps/EdgeInsets;", "zoom", "", "bearing", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;", "pitch", "(Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;Ljava/lang/Double;)V", "getBearing", "()Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;", "getPadding", "()Lcom/mapbox/maps/EdgeInsets;", "getPitch", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getZoom", "equals", "", "other", "hashCode", "", "toBuilder", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions$Builder;", "toString", "", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FollowPuckViewportStateOptions {
    private final FollowPuckViewportStateBearing bearing;
    private final EdgeInsets padding;
    private final Double pitch;
    private final Double zoom;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions$Builder;", "", "()V", "bearing", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateBearing;", "padding", "Lcom/mapbox/maps/EdgeInsets;", "pitch", "", "Ljava/lang/Double;", "zoom", "options", "build", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions;", "(Ljava/lang/Double;)Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions$Builder;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private EdgeInsets padding;
        private Double zoom = Double.valueOf(16.35d);
        private FollowPuckViewportStateBearing bearing = FollowPuckViewportStateBearing.SyncWithLocationPuck.INSTANCE;
        private Double pitch = Double.valueOf(45.0d);

        public final Builder bearing(FollowPuckViewportStateBearing options) {
            this.bearing = options;
            return this;
        }

        public final FollowPuckViewportStateOptions build() {
            return new FollowPuckViewportStateOptions(this.padding, this.zoom, this.bearing, this.pitch, null);
        }

        public final Builder padding(EdgeInsets padding) {
            this.padding = padding;
            return this;
        }

        public final Builder pitch(Double pitch) {
            this.pitch = pitch;
            return this;
        }

        public final Builder zoom(Double zoom) {
            this.zoom = zoom;
            return this;
        }
    }

    private FollowPuckViewportStateOptions(EdgeInsets edgeInsets, Double d14, FollowPuckViewportStateBearing followPuckViewportStateBearing, Double d15) {
        this.padding = edgeInsets;
        this.zoom = d14;
        this.bearing = followPuckViewportStateBearing;
        this.pitch = d15;
    }

    public boolean equals(Object other) {
        if (!(other instanceof FollowPuckViewportStateOptions)) {
            return false;
        }
        FollowPuckViewportStateOptions followPuckViewportStateOptions = (FollowPuckViewportStateOptions) other;
        return s.g(this.padding, followPuckViewportStateOptions.padding) && Objects.equals(this.zoom, followPuckViewportStateOptions.zoom) && s.g(this.bearing, followPuckViewportStateOptions.bearing) && Objects.equals(this.pitch, followPuckViewportStateOptions.pitch);
    }

    public final FollowPuckViewportStateBearing getBearing() {
        return this.bearing;
    }

    public final EdgeInsets getPadding() {
        return this.padding;
    }

    public final Double getPitch() {
        return this.pitch;
    }

    public final Double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(this.padding, this.zoom, this.bearing, this.pitch);
    }

    public final Builder toBuilder() {
        return new Builder().padding(this.padding).zoom(this.zoom).bearing(this.bearing).pitch(this.pitch);
    }

    public String toString() {
        return "FollowPuckViewportStateOptions(padding=" + this.padding + ", zoom=" + this.zoom + ", bearing=" + this.bearing + ", pitch=" + this.pitch + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ FollowPuckViewportStateOptions(EdgeInsets edgeInsets, Double d14, FollowPuckViewportStateBearing followPuckViewportStateBearing, Double d15, j jVar) {
        this(edgeInsets, d14, followPuckViewportStateBearing, d15);
    }
}
