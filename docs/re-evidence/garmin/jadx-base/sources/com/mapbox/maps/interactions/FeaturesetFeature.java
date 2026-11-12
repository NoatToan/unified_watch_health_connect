package com.mapbox.maps.interactions;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeatureState;
import java.util.Objects;
import o13.l;
import o13.m;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B5\b\u0007\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "FS", "", "Lcom/mapbox/maps/FeaturesetFeatureId;", TtmlNode.ATTR_ID, "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "descriptor", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/geojson/Feature;", "originalFeature", "<init>", "(Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/geojson/Feature;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/mapbox/maps/FeaturesetFeatureId;", "getId", "()Lcom/mapbox/maps/FeaturesetFeatureId;", "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "getDescriptor", "()Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "Lcom/mapbox/maps/interactions/FeatureState;", "getState", "()Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/geojson/Feature;", "getOriginalFeature$sdk_base_release", "()Lcom/mapbox/geojson/Feature;", "Lcom/mapbox/geojson/Geometry;", "geometry", "Lcom/mapbox/geojson/Geometry;", "getGeometry", "()Lcom/mapbox/geojson/Geometry;", "Lorg/json/JSONObject;", "properties$delegate", "Lo13/l;", "getProperties", "()Lorg/json/JSONObject;", "properties", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class FeaturesetFeature<FS extends FeatureState> {
    private final TypedFeaturesetDescriptor<FS, ?> descriptor;
    private final Geometry geometry;
    private final FeaturesetFeatureId id;
    private final Feature originalFeature;

    /* JADX INFO: renamed from: properties$delegate, reason: from kotlin metadata */
    private final l properties;
    private final FS state;

    public FeaturesetFeature(FeaturesetFeatureId featuresetFeatureId, TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FS fs3, Feature feature) {
        typedFeaturesetDescriptor.getClass();
        fs3.getClass();
        feature.getClass();
        this.id = featuresetFeatureId;
        this.descriptor = typedFeaturesetDescriptor;
        this.state = fs3;
        this.originalFeature = feature;
        Geometry geometry = feature.geometry();
        geometry.getClass();
        this.geometry = geometry;
        this.properties = m.b(new FeaturesetFeature$properties$2(this));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        FeaturesetFeature featuresetFeature = (FeaturesetFeature) other;
        return s.g(this.descriptor, featuresetFeature.descriptor) && s.g(this.originalFeature, featuresetFeature.originalFeature) && s.g(this.state, featuresetFeature.state) && s.g(this.id, featuresetFeature.id);
    }

    public final TypedFeaturesetDescriptor<FS, ?> getDescriptor() {
        return this.descriptor;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public final FeaturesetFeatureId getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getOriginalFeature$sdk_base_release, reason: from getter */
    public final Feature getOriginalFeature() {
        return this.originalFeature;
    }

    public final JSONObject getProperties() {
        return (JSONObject) this.properties.getValue();
    }

    public final FS getState() {
        return this.state;
    }

    public int hashCode() {
        return Objects.hash(this.descriptor, this.originalFeature, this.state, this.id);
    }
}
