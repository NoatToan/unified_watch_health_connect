package com.mapbox.maps.plugin.annotation;

import com.mapbox.maps.DragInteraction;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import e23.l;
import e23.p;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002H\u00040\u0015H\n¢\u0006\u0002\b\u0016"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/MapInteraction;", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "map", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class AnnotationManagerImpl$registerInteractions$dragInteraction$1<T> extends w implements p<String, Map<String, ? extends T>, MapInteraction> {
    final /* synthetic */ AnnotationManagerImpl<G, T, S, D, U, V, I, L> this$0;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\n¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"<anonymous>", "", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "selectedFeature", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "<anonymous parameter 1>", "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<FeaturesetFeature<FeatureState>, InteractionContext, Boolean> {
        final /* synthetic */ Map<String, T> $map;
        final /* synthetic */ AnnotationManagerImpl<G, T, S, D, U, V, I, L> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AnnotationManagerImpl<G, T, S, D, U, V, I, L> annotationManagerImpl, Map<String, ? extends T> map) {
            super(2);
            this.this$0 = annotationManagerImpl;
            this.$map = map;
        }

        @Override // e23.p
        public final Boolean invoke(FeaturesetFeature<FeatureState> featuresetFeature, InteractionContext interactionContext) {
            Annotation annotation;
            featuresetFeature.getClass();
            interactionContext.getClass();
            String strOptString = featuresetFeature.getProperties().optString(this.this$0.getAnnotationIdKey(), "");
            return (s.g(strOptString, "") || (annotation = (Annotation) this.$map.get(strOptString)) == null) ? Boolean.FALSE : Boolean.valueOf(this.this$0.startDragging(annotation));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationManagerImpl$registerInteractions$dragInteraction$1(AnnotationManagerImpl<G, T, S, D, U, V, I, L> annotationManagerImpl) {
        super(2);
        this.this$0 = annotationManagerImpl;
    }

    @Override // e23.p
    public final MapInteraction invoke(String str, Map<String, ? extends T> map) {
        str.getClass();
        map.getClass();
        return DragInteraction.Companion.layer$default(DragInteraction.INSTANCE, str, null, new AnonymousClass1(this.this$0, map), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0), 2, null);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\n¢\u0006\u0002\b\u0014"}, d2 = {"<anonymous>", "", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "it", "Lcom/mapbox/maps/InteractionContext;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements l<InteractionContext, Unit> {
        final /* synthetic */ AnnotationManagerImpl<G, T, S, D, U, V, I, L> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnnotationManagerImpl<G, T, S, D, U, V, I, L> annotationManagerImpl) {
            super(1);
            this.this$0 = annotationManagerImpl;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InteractionContext interactionContext) {
            interactionContext.getClass();
            this.this$0.drag();
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(InteractionContext interactionContext) {
            invoke2(interactionContext);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\n¢\u0006\u0002\b\u0014"}, d2 = {"<anonymous>", "", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "it", "Lcom/mapbox/maps/InteractionContext;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements l<InteractionContext, Unit> {
        final /* synthetic */ AnnotationManagerImpl<G, T, S, D, U, V, I, L> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AnnotationManagerImpl<G, T, S, D, U, V, I, L> annotationManagerImpl) {
            super(1);
            this.this$0 = annotationManagerImpl;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InteractionContext interactionContext) {
            interactionContext.getClass();
            this.this$0.stopDragging();
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(InteractionContext interactionContext) {
            invoke2(interactionContext);
            return Unit.INSTANCE;
        }
    }
}
