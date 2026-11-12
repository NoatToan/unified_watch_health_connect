package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class QueriedFeature implements Serializable {
    private final Feature feature;
    private final FeaturesetFeatureId featuresetFeatureId;
    private final String source;
    private final String sourceLayer;
    private final Value state;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public QueriedFeature(Feature feature, String str, String str2, Value value, FeaturesetFeatureId featuresetFeatureId) {
        this.feature = feature;
        this.source = str;
        this.sourceLayer = str2;
        this.state = value;
        this.featuresetFeatureId = featuresetFeatureId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueriedFeature.class != obj.getClass()) {
            return false;
        }
        QueriedFeature queriedFeature = (QueriedFeature) obj;
        return Objects.equals(this.feature, queriedFeature.feature) && Objects.equals(this.source, queriedFeature.source) && Objects.equals(this.sourceLayer, queriedFeature.sourceLayer) && Objects.equals(this.state, queriedFeature.state) && Objects.equals(this.featuresetFeatureId, queriedFeature.featuresetFeatureId);
    }

    public Feature getFeature() {
        return this.feature;
    }

    public FeaturesetFeatureId getFeaturesetFeatureId() {
        return this.featuresetFeatureId;
    }

    public String getSource() {
        return this.source;
    }

    public String getSourceLayer() {
        return this.sourceLayer;
    }

    public Value getState() {
        return this.state;
    }

    public int hashCode() {
        return Objects.hash(this.feature, this.source, this.sourceLayer, this.state, this.featuresetFeatureId);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[feature: ");
        sb3.append(RecordUtils.fieldToString(this.feature));
        sb3.append(", source: ");
        com.google.protobuf.a.k(this.source, ", sourceLayer: ", sb3);
        com.google.protobuf.a.k(this.sourceLayer, ", state: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.state));
        sb3.append(", featuresetFeatureId: ");
        sb3.append(RecordUtils.fieldToString(this.featuresetFeatureId));
        sb3.append("]");
        return sb3.toString();
    }
}
