package com.mapbox.maps.interactions.standard.generated;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeaturesetFeature;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsState;", TtmlNode.ATTR_ID, "Lcom/mapbox/maps/FeaturesetFeatureId;", "importId", "", "originalFeature", "Lcom/mapbox/geojson/Feature;", RemoteConfigConstants.ResponseFieldKey.STATE, "(Lcom/mapbox/maps/FeaturesetFeatureId;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsState;)V", Action.CLASS_ATTRIBUTE, "getClass", "()Ljava/lang/String;", "geometry", "Lcom/mapbox/geojson/Point;", "getGeometry", "()Lcom/mapbox/geojson/Point;", "name", "getName", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StandardPlaceLabelsFeature extends FeaturesetFeature<StandardPlaceLabelsState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardPlaceLabelsFeature(FeaturesetFeatureId featuresetFeatureId, String str, Feature feature, StandardPlaceLabelsState standardPlaceLabelsState) {
        super(featuresetFeatureId, new StandardPlaceLabels(str), standardPlaceLabelsState, feature);
        feature.getClass();
        standardPlaceLabelsState.getClass();
    }

    public final String getClass() {
        return getOriginalFeature().getStringProperty(Action.CLASS_ATTRIBUTE);
    }

    @Override // com.mapbox.maps.interactions.FeaturesetFeature
    public Point getGeometry() {
        Geometry geometry = super.getGeometry();
        geometry.getClass();
        return (Point) geometry;
    }

    public final String getName() {
        return getOriginalFeature().getStringProperty("name");
    }
}
