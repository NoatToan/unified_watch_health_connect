package com.mapbox.maps.interactions;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.FeaturesetDescriptor;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u0013*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0003\u0013\u0014\u0015B\u0007\b\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH'¢\u0006\u0002\u0010\nJ'\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tH'¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H'¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "FS", "Lcom/mapbox/maps/interactions/FeatureState;", "FF", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "", "()V", "getFeatureState", "rawState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/maps/interactions/FeatureState;", "getFeaturesetFeature", "feature", "Lcom/mapbox/geojson/Feature;", "featureNamespace", "", "(Lcom/mapbox/geojson/Feature;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/maps/interactions/FeaturesetFeature;", "toFeaturesetDescriptor", "Lcom/mapbox/maps/FeaturesetDescriptor;", "Companion", "Featureset", "Layer", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class TypedFeaturesetDescriptor<FS extends FeatureState, FF extends FeaturesetFeature<FS>> {
    public static final String DEFAULT_IMPORT_ID = "basemap";

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor$Layer;", "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "layerId", "", "(Ljava/lang/String;)V", "getLayerId", "()Ljava/lang/String;", "equals", "", "other", "", "getFeatureState", "rawState", "Lcom/mapbox/bindgen/Value;", "getFeaturesetFeature", "feature", "Lcom/mapbox/geojson/Feature;", "featureNamespace", "hashCode", "", "toFeaturesetDescriptor", "Lcom/mapbox/maps/FeaturesetDescriptor;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Layer extends TypedFeaturesetDescriptor<FeatureState, FeaturesetFeature<FeatureState>> {
        private final String layerId;

        public Layer(String str) {
            str.getClass();
            this.layerId = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Layer.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            other.getClass();
            return s.g(this.layerId, ((Layer) other).layerId);
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeatureState getFeatureState(Value rawState) {
            rawState.getClass();
            return new FeatureState(rawState);
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeaturesetFeature<FeatureState> getFeaturesetFeature(Feature feature, String featureNamespace, Value rawState) {
            feature.getClass();
            rawState.getClass();
            String strId = feature.id();
            return strId != null ? new FeaturesetFeature<>(new FeaturesetFeatureId(strId, featureNamespace), this, getFeatureState(rawState), feature) : new FeaturesetFeature<>(null, this, getFeatureState(rawState), feature);
        }

        public final String getLayerId() {
            return this.layerId;
        }

        public int hashCode() {
            return this.layerId.hashCode();
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeaturesetDescriptor toFeaturesetDescriptor() {
            return new FeaturesetDescriptor(null, null, this.layerId);
        }
    }

    public abstract FS getFeatureState(Value rawState);

    public abstract FF getFeaturesetFeature(Feature feature, String featureNamespace, Value rawState);

    public abstract FeaturesetDescriptor toFeaturesetDescriptor();

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor$Featureset;", "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "featuresetId", "", "importId", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeaturesetId", "()Ljava/lang/String;", "getImportId", "equals", "", "other", "", "getFeatureState", "rawState", "Lcom/mapbox/bindgen/Value;", "getFeaturesetFeature", "feature", "Lcom/mapbox/geojson/Feature;", "featureNamespace", "hashCode", "", "toFeaturesetDescriptor", "Lcom/mapbox/maps/FeaturesetDescriptor;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Featureset extends TypedFeaturesetDescriptor<FeatureState, FeaturesetFeature<FeatureState>> {
        private final String featuresetId;
        private final String importId;

        public Featureset(String str, String str2) {
            str.getClass();
            this.featuresetId = str;
            this.importId = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Featureset.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            other.getClass();
            Featureset featureset = (Featureset) other;
            return s.g(this.featuresetId, featureset.featuresetId) && s.g(this.importId, featureset.importId);
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeatureState getFeatureState(Value rawState) {
            rawState.getClass();
            return new FeatureState(rawState);
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeaturesetFeature<FeatureState> getFeaturesetFeature(Feature feature, String featureNamespace, Value rawState) {
            feature.getClass();
            rawState.getClass();
            String strId = feature.id();
            return strId != null ? new FeaturesetFeature<>(new FeaturesetFeatureId(strId, featureNamespace), this, getFeatureState(rawState), feature) : new FeaturesetFeature<>(null, this, getFeatureState(rawState), feature);
        }

        public final String getFeaturesetId() {
            return this.featuresetId;
        }

        public final String getImportId() {
            return this.importId;
        }

        public int hashCode() {
            return Objects.hash(this.featuresetId, this.importId);
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeaturesetDescriptor toFeaturesetDescriptor() {
            return new FeaturesetDescriptor(this.featuresetId, this.importId, null);
        }

        public /* synthetic */ Featureset(String str, String str2, int i14, j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Featureset(String str) {
            this(str, null, 2, 0 == true ? 1 : 0);
            str.getClass();
        }
    }
}
