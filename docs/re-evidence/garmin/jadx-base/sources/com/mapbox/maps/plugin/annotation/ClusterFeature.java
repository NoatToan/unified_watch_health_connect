package com.mapbox.maps.plugin.annotation;

import com.mapbox.geojson.Feature;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/ClusterFeature;", "", "featuresetFeature", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;)V", "clusterId", "", "getClusterId", "()Ljava/lang/String;", "originalFeature", "Lcom/mapbox/geojson/Feature;", "getOriginalFeature", "()Lcom/mapbox/geojson/Feature;", "pointCount", "", "getPointCount", "()J", "pointCountAbbreviated", "getPointCountAbbreviated", "equals", "", "other", "hashCode", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ClusterFeature {
    private final String clusterId;
    private final FeaturesetFeature<FeatureState> featuresetFeature;
    private final Feature originalFeature;
    private final long pointCount;
    private final String pointCountAbbreviated;

    public ClusterFeature(FeaturesetFeature<FeatureState> featuresetFeature) {
        featuresetFeature.getClass();
        this.featuresetFeature = featuresetFeature;
        this.originalFeature = featuresetFeature.getOriginalFeature();
        String strOptString = featuresetFeature.getProperties().optString("cluster_id", "");
        strOptString.getClass();
        this.clusterId = strOptString;
        this.pointCount = featuresetFeature.getProperties().optLong("point_count", 0L);
        String strOptString2 = featuresetFeature.getProperties().optString("point_count_abbreviated", "");
        strOptString2.getClass();
        this.pointCountAbbreviated = strOptString2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ClusterFeature.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        ClusterFeature clusterFeature = (ClusterFeature) other;
        return s.g(this.featuresetFeature, clusterFeature.featuresetFeature) && s.g(this.originalFeature, clusterFeature.originalFeature) && s.g(this.clusterId, clusterFeature.clusterId) && this.pointCount == clusterFeature.pointCount && s.g(this.pointCountAbbreviated, clusterFeature.pointCountAbbreviated);
    }

    public final String getClusterId() {
        return this.clusterId;
    }

    public final Feature getOriginalFeature() {
        return this.originalFeature;
    }

    public final long getPointCount() {
        return this.pointCount;
    }

    public final String getPointCountAbbreviated() {
        return this.pointCountAbbreviated;
    }

    public int hashCode() {
        return Objects.hash(this.featuresetFeature, this.clusterId, Long.valueOf(this.pointCount), this.pointCountAbbreviated, this.originalFeature);
    }
}
