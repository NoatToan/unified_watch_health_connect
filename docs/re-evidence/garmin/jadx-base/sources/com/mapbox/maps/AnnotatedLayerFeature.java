package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotatedLayerFeature implements Serializable {
    private final String featureId;
    private final String layerId;

    public static final class Builder {
        private String featureId;
        private String layerId;

        public AnnotatedLayerFeature build() {
            if (this.layerId != null) {
                return new AnnotatedLayerFeature(this.layerId, this.featureId);
            }
            x.l("layerId shouldn't be null");
            return null;
        }

        public Builder featureId(String str) {
            this.featureId = str;
            return this;
        }

        public Builder layerId(String str) {
            this.layerId = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private AnnotatedLayerFeature(String str, String str2) {
        this.layerId = str;
        this.featureId = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnnotatedLayerFeature.class != obj.getClass()) {
            return false;
        }
        AnnotatedLayerFeature annotatedLayerFeature = (AnnotatedLayerFeature) obj;
        return Objects.equals(this.layerId, annotatedLayerFeature.layerId) && Objects.equals(this.featureId, annotatedLayerFeature.featureId);
    }

    public String getFeatureId() {
        return this.featureId;
    }

    public String getLayerId() {
        return this.layerId;
    }

    public int hashCode() {
        return Objects.hash(this.layerId, this.featureId);
    }

    public Builder toBuilder() {
        return new Builder().layerId(this.layerId).featureId(this.featureId);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[layerId: ");
        com.google.protobuf.a.k(this.layerId, ", featureId: ", sb3);
        return com.google.protobuf.a.a(this.featureId, "]", sb3);
    }
}
