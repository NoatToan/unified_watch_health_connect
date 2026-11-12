package com.mapbox.maps.extension.compose.style.interactions.generated;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeatureStateKey;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.standard.generated.StandardBuildingsFeature;
import com.mapbox.maps.interactions.standard.generated.StandardBuildingsState;
import com.mapbox.maps.interactions.standard.generated.StandardBuildingsStateKt;
import com.mapbox.maps.interactions.standard.generated.StandardPlaceLabelsFeature;
import com.mapbox.maps.interactions.standard.generated.StandardPlaceLabelsState;
import com.mapbox.maps.interactions.standard.generated.StandardPlaceLabelsStateKt;
import com.mapbox.maps.interactions.standard.generated.StandardPoiFeature;
import com.mapbox.maps.interactions.standard.generated.StandardPoiState;
import com.mapbox.maps.interactions.standard.generated.StandardPoiStateKt;
import e23.l;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p6.b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u0005*\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u0005*\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00028\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001d\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\u001f\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001f\u0010 \u0082\u0001\u0001!¨\u0006\""}, d2 = {"Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;", "", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "Lkotlin/Function1;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState$Builder;", "", "init", "setStandardPoiState", "(Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;Le23/l;)V", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsState$Builder;", "setStandardPlaceLabelsState", "(Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;Le23/l;)V", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsState$Builder;", "setStandardBuildingsState", "(Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;Le23/l;)V", "Lcom/mapbox/maps/interactions/FeatureState;", "FS", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/maps/FeatureStateOperationCallback;", "callback", "Lcom/mapbox/common/Cancelable;", "setFeatureState", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "FSK", "stateKey", "removeFeatureState", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateKey;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "resetFeatureStates", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScopeImpl;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface FeaturesetFeatureScope {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Cancelable removeFeatureState$default(FeaturesetFeatureScope featuresetFeatureScope, FeaturesetFeature featuresetFeature, FeatureStateKey featureStateKey, FeatureStateOperationCallback featureStateOperationCallback, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: removeFeatureState");
                return null;
            }
            if ((i14 & 1) != 0) {
                featureStateKey = null;
            }
            if ((i14 & 2) != 0) {
                featureStateOperationCallback = new b(21);
            }
            return featuresetFeatureScope.removeFeatureState(featuresetFeature, featureStateKey, featureStateOperationCallback);
        }

        public static /* synthetic */ Cancelable resetFeatureStates$default(FeaturesetFeatureScope featuresetFeatureScope, FeaturesetFeature featuresetFeature, FeatureStateOperationCallback featureStateOperationCallback, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: resetFeatureStates");
                return null;
            }
            if ((i14 & 1) != 0) {
                featureStateOperationCallback = new b(22);
            }
            return featuresetFeatureScope.resetFeatureStates(featuresetFeature, featureStateOperationCallback);
        }

        public static /* synthetic */ Cancelable setFeatureState$default(FeaturesetFeatureScope featuresetFeatureScope, FeaturesetFeature featuresetFeature, FeatureState featureState, FeatureStateOperationCallback featureStateOperationCallback, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: setFeatureState");
                return null;
            }
            if ((i14 & 2) != 0) {
                featureStateOperationCallback = new b(18);
            }
            return featuresetFeatureScope.setFeatureState(featuresetFeature, featureState, featureStateOperationCallback);
        }

        public static void setStandardBuildingsState(FeaturesetFeatureScope featuresetFeatureScope, StandardBuildingsFeature standardBuildingsFeature, l<? super StandardBuildingsState.Builder, Unit> lVar) {
            standardBuildingsFeature.getClass();
            lVar.getClass();
            featuresetFeatureScope.setFeatureState(standardBuildingsFeature, StandardBuildingsStateKt.StandardBuildingsState(lVar), new b(19));
        }

        public static void setStandardPlaceLabelsState(FeaturesetFeatureScope featuresetFeatureScope, StandardPlaceLabelsFeature standardPlaceLabelsFeature, l<? super StandardPlaceLabelsState.Builder, Unit> lVar) {
            standardPlaceLabelsFeature.getClass();
            lVar.getClass();
            featuresetFeatureScope.setFeatureState(standardPlaceLabelsFeature, StandardPlaceLabelsStateKt.StandardPlaceLabelsState(lVar), new b(17));
        }

        public static void setStandardPoiState(FeaturesetFeatureScope featuresetFeatureScope, StandardPoiFeature standardPoiFeature, l<? super StandardPoiState.Builder, Unit> lVar) {
            standardPoiFeature.getClass();
            lVar.getClass();
            featuresetFeatureScope.setFeatureState(standardPoiFeature, StandardPoiStateKt.StandardPoiState(lVar), new b(20));
        }
    }

    <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK fsk, FeatureStateOperationCallback featureStateOperationCallback);

    <FS extends FeatureState> Cancelable resetFeatureStates(FeaturesetFeature<FS> featuresetFeature, FeatureStateOperationCallback featureStateOperationCallback);

    <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS fs3, FeatureStateOperationCallback featureStateOperationCallback);

    void setStandardBuildingsState(StandardBuildingsFeature standardBuildingsFeature, l<? super StandardBuildingsState.Builder, Unit> lVar);

    void setStandardPlaceLabelsState(StandardPlaceLabelsFeature standardPlaceLabelsFeature, l<? super StandardPlaceLabelsState.Builder, Unit> lVar);

    void setStandardPoiState(StandardPoiFeature standardPoiFeature, l<? super StandardPoiState.Builder, Unit> lVar);
}
