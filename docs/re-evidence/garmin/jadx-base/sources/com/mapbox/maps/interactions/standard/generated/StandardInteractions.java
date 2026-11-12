package com.mapbox.maps.interactions.standard.generated;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.FeaturesetDescriptor;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import e23.p;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\r\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aQ\u0010\r\u001a\u00020\f*\u00020\u000f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u0011\u001aQ\u0010\u0013\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u000e\u001aQ\u0010\u0013\u001a\u00020\f*\u00020\u000f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0011\u001aQ\u0010\u0015\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u000e\u001aQ\u0010\u0015\u001a\u00020\f*\u00020\u000f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/ClickInteraction$Companion;", "", "importId", "Lcom/mapbox/bindgen/Value;", "filter", "", "radius", "Lkotlin/Function2;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "Lcom/mapbox/maps/InteractionContext;", "", "onClick", "Lcom/mapbox/maps/MapInteraction;", "standardPoi", "(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Le23/p;)Lcom/mapbox/maps/MapInteraction;", "Lcom/mapbox/maps/LongClickInteraction$Companion;", "onLongClick", "(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Le23/p;)Lcom/mapbox/maps/MapInteraction;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;", "standardPlaceLabels", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;", "standardBuildings", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StandardInteractions {

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardBuildings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/bindgen/Value;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements q<Feature, FeaturesetFeatureId, Value, StandardBuildingsFeature> {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // e23.q
        public final StandardBuildingsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value) {
            feature.getClass();
            value.getClass();
            return new StandardBuildingsFeature(featuresetFeatureId, this.$importId, feature, new StandardBuildingsState(value));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardBuildings$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/bindgen/Value;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements q<Feature, FeaturesetFeatureId, Value, StandardBuildingsFeature> {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // e23.q
        public final StandardBuildingsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value) {
            feature.getClass();
            value.getClass();
            return new StandardBuildingsFeature(featuresetFeatureId, this.$importId, feature, new StandardBuildingsState(value));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardPlaceLabels$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/bindgen/Value;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42051 extends w implements q<Feature, FeaturesetFeatureId, Value, StandardPlaceLabelsFeature> {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42051(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // e23.q
        public final StandardPlaceLabelsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value) {
            feature.getClass();
            value.getClass();
            return new StandardPlaceLabelsFeature(featuresetFeatureId, this.$importId, feature, new StandardPlaceLabelsState(value));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardPlaceLabels$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/bindgen/Value;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42062 extends w implements q<Feature, FeaturesetFeatureId, Value, StandardPlaceLabelsFeature> {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42062(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // e23.q
        public final StandardPlaceLabelsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value) {
            feature.getClass();
            value.getClass();
            return new StandardPlaceLabelsFeature(featuresetFeatureId, this.$importId, feature, new StandardPlaceLabelsState(value));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardPoi$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/bindgen/Value;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42071 extends w implements q<Feature, FeaturesetFeatureId, Value, StandardPoiFeature> {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42071(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // e23.q
        public final StandardPoiFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value) {
            feature.getClass();
            value.getClass();
            return new StandardPoiFeature(featuresetFeatureId, this.$importId, feature, new StandardPoiState(value));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardPoi$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/bindgen/Value;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42082 extends w implements q<Feature, FeaturesetFeatureId, Value, StandardPoiFeature> {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42082(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // e23.q
        public final StandardPoiFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value) {
            feature.getClass();
            value.getClass();
            return new StandardPoiFeature(featuresetFeatureId, this.$importId, feature, new StandardPoiState(value));
        }
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, String str, Value value, Double d14, p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return new ClickInteraction(new FeaturesetDescriptor(StandardBuildings.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d14, pVar, new AnonymousClass1(str));
    }

    public static /* synthetic */ MapInteraction standardBuildings$default(ClickInteraction.Companion companion, String str, Value value, Double d14, p pVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            value = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardBuildings(companion, str, value, d14, (p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean>) pVar);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, String str, Value value, Double d14, p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return new ClickInteraction(new FeaturesetDescriptor(StandardPlaceLabels.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d14, pVar, new C42051(str));
    }

    public static /* synthetic */ MapInteraction standardPlaceLabels$default(ClickInteraction.Companion companion, String str, Value value, Double d14, p pVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            value = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardPlaceLabels(companion, str, value, d14, (p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean>) pVar);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, String str, Value value, Double d14, p<? super StandardPoiFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return new ClickInteraction(new FeaturesetDescriptor(StandardPoi.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d14, pVar, new C42071(str));
    }

    public static /* synthetic */ MapInteraction standardPoi$default(ClickInteraction.Companion companion, String str, Value value, Double d14, p pVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            value = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardPoi(companion, str, value, d14, (p<? super StandardPoiFeature, ? super InteractionContext, Boolean>) pVar);
    }

    public static /* synthetic */ MapInteraction standardBuildings$default(LongClickInteraction.Companion companion, String str, Value value, Double d14, p pVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            value = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardBuildings(companion, str, value, d14, (p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean>) pVar);
    }

    public static /* synthetic */ MapInteraction standardPlaceLabels$default(LongClickInteraction.Companion companion, String str, Value value, Double d14, p pVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            value = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardPlaceLabels(companion, str, value, d14, (p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean>) pVar);
    }

    public static /* synthetic */ MapInteraction standardPoi$default(LongClickInteraction.Companion companion, String str, Value value, Double d14, p pVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if ((i14 & 2) != 0) {
            value = null;
        }
        if ((i14 & 4) != 0) {
            d14 = null;
        }
        return standardPoi(companion, str, value, d14, (p<? super StandardPoiFeature, ? super InteractionContext, Boolean>) pVar);
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, String str, Value value, p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardBuildings$default(companion, str, value, (Double) null, pVar, 4, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, String str, Value value, p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPlaceLabels$default(companion, str, value, (Double) null, pVar, 4, (Object) null);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, String str, Value value, p<? super StandardPoiFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPoi$default(companion, str, value, (Double) null, pVar, 4, (Object) null);
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, String str, p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardBuildings$default(companion, str, (Value) null, (Double) null, pVar, 6, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, String str, p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPlaceLabels$default(companion, str, (Value) null, (Double) null, pVar, 6, (Object) null);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, String str, p<? super StandardPoiFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPoi$default(companion, str, (Value) null, (Double) null, pVar, 6, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardBuildings$default(companion, (String) null, (Value) null, (Double) null, pVar, 7, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPlaceLabels$default(companion, (String) null, (Value) null, (Double) null, pVar, 7, (Object) null);
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, p<? super StandardPoiFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPoi$default(companion, (String) null, (Value) null, (Double) null, pVar, 7, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, String str, Value value, p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardBuildings$default(companion, str, value, (Double) null, pVar, 4, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, String str, Value value, p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPlaceLabels$default(companion, str, value, (Double) null, pVar, 4, (Object) null);
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, String str, Value value, p<? super StandardPoiFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPoi$default(companion, str, value, (Double) null, pVar, 4, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, String str, p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardBuildings$default(companion, str, (Value) null, (Double) null, pVar, 6, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, String str, p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPlaceLabels$default(companion, str, (Value) null, (Double) null, pVar, 6, (Object) null);
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, String str, p<? super StandardPoiFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPoi$default(companion, str, (Value) null, (Double) null, pVar, 6, (Object) null);
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardBuildings$default(companion, (String) null, (Value) null, (Double) null, pVar, 7, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPlaceLabels$default(companion, (String) null, (Value) null, (Double) null, pVar, 7, (Object) null);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, p<? super StandardPoiFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return standardPoi$default(companion, (String) null, (Value) null, (Double) null, pVar, 7, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, String str, Value value, Double d14, p<? super StandardBuildingsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return new LongClickInteraction(new FeaturesetDescriptor(StandardBuildings.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d14, pVar, new AnonymousClass2(str));
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, String str, Value value, Double d14, p<? super StandardPlaceLabelsFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return new LongClickInteraction(new FeaturesetDescriptor(StandardPlaceLabels.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d14, pVar, new C42062(str));
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, String str, Value value, Double d14, p<? super StandardPoiFeature, ? super InteractionContext, Boolean> pVar) {
        companion.getClass();
        pVar.getClass();
        return new LongClickInteraction(new FeaturesetDescriptor(StandardPoi.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d14, pVar, new C42082(str));
    }
}
