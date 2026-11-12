package com.mapbox.common.geofencing;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.geojson.Feature;
import d53.n;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@MapboxExperimental
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/mapbox/common/geofencing/GeofenceState;", "Ljava/io/Serializable;", "feature", "Lcom/mapbox/geojson/Feature;", "timestamp", "Ljava/util/Date;", "(Lcom/mapbox/geojson/Feature;Ljava/util/Date;)V", "getFeature", "()Lcom/mapbox/geojson/Feature;", "getTimestamp", "()Ljava/util/Date;", "equals", "", "other", "", "hashCode", "", "toBuilder", "Lcom/mapbox/common/geofencing/GeofenceState$Builder;", "toString", "", "Builder", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeofenceState implements Serializable {
    private final Feature feature;
    private final Date timestamp;

    private GeofenceState(Feature feature, Date date) {
        this.feature = feature;
        this.timestamp = date;
    }

    public boolean equals(Object other) {
        if (!(other instanceof GeofenceState)) {
            return false;
        }
        GeofenceState geofenceState = (GeofenceState) other;
        return s.g(this.feature, geofenceState.feature) && s.g(this.timestamp, geofenceState.timestamp);
    }

    public final Feature getFeature() {
        return this.feature;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.feature, this.timestamp);
    }

    @MapboxExperimental
    public final Builder toBuilder() {
        return new Builder().setFeature(this.feature).setTimestamp(this.timestamp);
    }

    public String toString() {
        return n.c("\n        GeofenceState(\n            feature=" + this.feature + ",\n            timestamp=" + this.timestamp + "\n        )\n    ");
    }

    @MapboxExperimental
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/mapbox/common/geofencing/GeofenceState$Builder;", "", "()V", "<set-?>", "Lcom/mapbox/geojson/Feature;", "feature", "getFeature", "()Lcom/mapbox/geojson/Feature;", "setFeature", "(Lcom/mapbox/geojson/Feature;)V", "Ljava/util/Date;", "timestamp", "getTimestamp", "()Ljava/util/Date;", "setTimestamp", "(Ljava/util/Date;)V", "build", "Lcom/mapbox/common/geofencing/GeofenceState;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private Feature feature;
        private Date timestamp;

        @MapboxExperimental
        public final GeofenceState build() {
            Feature feature = this.feature;
            if (feature != null) {
                feature.getClass();
                return new GeofenceState(feature, this.timestamp, null);
            }
            h.s("Could not build an instance of GeofenceState through GeofenceState.Builder because feature was null.");
            return null;
        }

        public final Feature getFeature() {
            return this.feature;
        }

        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final Builder setFeature(Feature feature) {
            feature.getClass();
            this.feature = feature;
            return this;
        }

        /* JADX INFO: renamed from: setTimestamp, reason: collision with other method in class */
        public final /* synthetic */ void m130setTimestamp(Date date) {
            this.timestamp = date;
        }

        public final Builder setTimestamp(Date timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /* JADX INFO: renamed from: setFeature, reason: collision with other method in class */
        public final /* synthetic */ void m129setFeature(Feature feature) {
            this.feature = feature;
        }
    }

    public /* synthetic */ GeofenceState(Feature feature, Date date, j jVar) {
        this(feature, date);
    }
}
