package com.mapbox.maps;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "T", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/bindgen/Value;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class ClickInteraction$Companion$layer$1 extends w implements q<Feature, FeaturesetFeatureId, Value, FeaturesetFeature<FeatureState>> {
    final /* synthetic */ String $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickInteraction$Companion$layer$1(String str) {
        super(3);
        this.$id = str;
    }

    @Override // e23.q
    public final FeaturesetFeature<FeatureState> invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value) {
        feature.getClass();
        value.getClass();
        return new FeaturesetFeature<>(featuresetFeatureId, new TypedFeaturesetDescriptor.Layer(this.$id), new FeatureState(value), feature);
    }
}
