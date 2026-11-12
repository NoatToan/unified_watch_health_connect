package com.mapbox.maps.extension.compose.style.interactions.generated;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeatureStateKey;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import com.mapbox.maps.interactions.standard.generated.StandardBuildingsFeature;
import com.mapbox.maps.interactions.standard.generated.StandardBuildingsState;
import com.mapbox.maps.interactions.standard.generated.StandardPlaceLabelsFeature;
import com.mapbox.maps.interactions.standard.generated.StandardPlaceLabelsState;
import com.mapbox.maps.interactions.standard.generated.StandardPoiFeature;
import com.mapbox.maps.interactions.standard.generated.StandardPoiState;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JC\u0010\u0005\u001a\u00020\u0006\"\b\b\u0000\u0010\u0007*\u00020\b\"\u000e\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\n*\b\u0012\u0004\u0012\u0002H\u00070\u000b2\b\u0010\f\u001a\u0004\u0018\u0001H\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ$\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J1\u0010\u0011\u001a\u00020\u0006\"\b\b\u0000\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\u000b2\u0006\u0010\u0012\u001a\u0002H\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScopeImpl;", "Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;", "mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "(Lcom/mapbox/maps/MapboxMap;)V", "removeFeatureState", "Lcom/mapbox/common/Cancelable;", "FS", "Lcom/mapbox/maps/interactions/FeatureState;", "FSK", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "stateKey", "callback", "Lcom/mapbox/maps/FeatureStateOperationCallback;", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateKey;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "resetFeatureStates", "setFeatureState", RemoteConfigConstants.ResponseFieldKey.STATE, "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FeaturesetFeatureScopeImpl implements FeaturesetFeatureScope {
    private final MapboxMap mapboxMap;

    public FeaturesetFeatureScopeImpl(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        this.mapboxMap = mapboxMap;
    }

    @Override // com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope
    public <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK fsk, FeatureStateOperationCallback featureStateOperationCallback) {
        featuresetFeature.getClass();
        featureStateOperationCallback.getClass();
        return this.mapboxMap.removeFeatureState(featuresetFeature, fsk, featureStateOperationCallback);
    }

    @Override // com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope
    public <FS extends FeatureState> Cancelable resetFeatureStates(FeaturesetFeature<FS> featuresetFeature, FeatureStateOperationCallback featureStateOperationCallback) {
        featuresetFeature.getClass();
        featureStateOperationCallback.getClass();
        return this.mapboxMap.resetFeatureStates((TypedFeaturesetDescriptor<?, ?>) featuresetFeature.getDescriptor(), featureStateOperationCallback);
    }

    @Override // com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope
    public <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS fs3, FeatureStateOperationCallback featureStateOperationCallback) {
        featuresetFeature.getClass();
        fs3.getClass();
        featureStateOperationCallback.getClass();
        return this.mapboxMap.setFeatureState(featuresetFeature, fs3, featureStateOperationCallback);
    }

    @Override // com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope
    public void setStandardBuildingsState(StandardBuildingsFeature standardBuildingsFeature, l<? super StandardBuildingsState.Builder, Unit> lVar) {
        FeaturesetFeatureScope.DefaultImpls.setStandardBuildingsState(this, standardBuildingsFeature, lVar);
    }

    @Override // com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope
    public void setStandardPlaceLabelsState(StandardPlaceLabelsFeature standardPlaceLabelsFeature, l<? super StandardPlaceLabelsState.Builder, Unit> lVar) {
        FeaturesetFeatureScope.DefaultImpls.setStandardPlaceLabelsState(this, standardPlaceLabelsFeature, lVar);
    }

    @Override // com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope
    public void setStandardPoiState(StandardPoiFeature standardPoiFeature, l<? super StandardPoiState.Builder, Unit> lVar) {
        FeaturesetFeatureScope.DefaultImpls.setStandardPoiState(this, standardPoiFeature, lVar);
    }
}
