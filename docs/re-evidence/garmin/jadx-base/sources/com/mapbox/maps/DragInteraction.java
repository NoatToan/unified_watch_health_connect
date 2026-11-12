package com.mapbox.maps;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0019*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u0019B\u008d\u0001\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0016\u0010\u0017BE\b\u0012\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u000e\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/DragInteraction;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "T", "Lcom/mapbox/maps/MapInteraction;", "Lcom/mapbox/maps/FeaturesetDescriptor;", "featureset", "Lcom/mapbox/bindgen/Value;", "filter", "", "radius", "Lkotlin/Function2;", "Lcom/mapbox/maps/InteractionContext;", "", "onDragBegin", "Lkotlin/Function1;", "", "onDrag", "onDragEnd", "Lkotlin/Function3;", "Lcom/mapbox/geojson/Feature;", "Lcom/mapbox/maps/FeaturesetFeatureId;", "featuresetFeatureBuilder", "<init>", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Le23/p;Le23/l;Le23/l;Le23/q;)V", "(Le23/l;Le23/l;Le23/l;)V", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DragInteraction<T extends FeaturesetFeature<?>> extends MapInteraction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ DragInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d14, e23.p pVar, e23.l lVar, e23.l lVar2, q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(featuresetDescriptor, (i14 & 2) != 0 ? null : value, (i14 & 4) != 0 ? null : d14, pVar, lVar, lVar2, qVar);
    }

    public static final MapInteraction featureset(String str, String str2, Value value, Double d14, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
        return INSTANCE.featureset(str, str2, value, d14, pVar, lVar, lVar2);
    }

    public static final MapInteraction layer(String str, Value value, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
        return INSTANCE.layer(str, value, pVar, lVar, lVar2);
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0083\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017Jk\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JR\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/DragInteraction$Companion;", "", "<init>", "()V", "", TtmlNode.ATTR_ID, "importId", "Lcom/mapbox/bindgen/Value;", "filter", "", "radius", "Lkotlin/Function2;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/InteractionContext;", "", "onDragBegin", "Lkotlin/Function1;", "", "onDrag", "onDragEnd", "Lcom/mapbox/maps/MapInteraction;", "featureset", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Le23/p;Le23/l;Le23/l;)Lcom/mapbox/maps/MapInteraction;", "layer", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;Le23/p;Le23/l;Le23/l;)Lcom/mapbox/maps/MapInteraction;", "Lcom/mapbox/maps/DragInteraction;", "", "invoke", "(Le23/l;Le23/l;Le23/l;)Lcom/mapbox/maps/DragInteraction;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static /* synthetic */ MapInteraction featureset$default(Companion companion, String str, String str2, Value value, Double d14, e23.p pVar, e23.l lVar, e23.l lVar2, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str2 = null;
            }
            if ((i14 & 4) != 0) {
                value = null;
            }
            if ((i14 & 8) != 0) {
                d14 = null;
            }
            return companion.featureset(str, str2, value, d14, pVar, lVar, lVar2);
        }

        public static /* synthetic */ MapInteraction layer$default(Companion companion, String str, Value value, e23.p pVar, e23.l lVar, e23.l lVar2, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                value = null;
            }
            return companion.layer(str, value, pVar, lVar, lVar2);
        }

        public final MapInteraction featureset(String id3, String importId, Value filter, Double radius, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onDragBegin, e23.l<? super InteractionContext, Unit> onDrag, e23.l<? super InteractionContext, Unit> onDragEnd) {
            id3.getClass();
            onDragBegin.getClass();
            onDrag.getClass();
            onDragEnd.getClass();
            return new DragInteraction(new FeaturesetDescriptor(id3, importId, null), filter, radius, onDragBegin, onDrag, onDragEnd, new DragInteraction$Companion$featureset$1(id3, importId), null);
        }

        public final /* synthetic */ DragInteraction invoke(e23.l onDragBegin, e23.l onDrag, e23.l onDragEnd) {
            onDragBegin.getClass();
            onDrag.getClass();
            onDragEnd.getClass();
            return new DragInteraction(onDragBegin, onDrag, onDragEnd, null);
        }

        public final MapInteraction layer(String id3, Value filter, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onDragBegin, e23.l<? super InteractionContext, Unit> onDrag, e23.l<? super InteractionContext, Unit> onDragEnd) {
            id3.getClass();
            onDragBegin.getClass();
            onDrag.getClass();
            onDragEnd.getClass();
            return new DragInteraction(new FeaturesetDescriptor(null, null, id3), filter, null, onDragBegin, onDrag, onDragEnd, new DragInteraction$Companion$layer$1(id3), null);
        }

        private Companion() {
        }

        public final MapInteraction layer(String str, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
            str.getClass();
            pVar.getClass();
            lVar.getClass();
            lVar2.getClass();
            return layer$default(this, str, null, pVar, lVar, lVar2, 2, null);
        }

        public final MapInteraction featureset(String str, String str2, Value value, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
            str.getClass();
            pVar.getClass();
            lVar.getClass();
            lVar2.getClass();
            return featureset$default(this, str, str2, value, null, pVar, lVar, lVar2, 8, null);
        }

        public final MapInteraction featureset(String str, String str2, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
            str.getClass();
            pVar.getClass();
            lVar.getClass();
            lVar2.getClass();
            return featureset$default(this, str, str2, null, null, pVar, lVar, lVar2, 12, null);
        }

        public final MapInteraction featureset(String str, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
            str.getClass();
            pVar.getClass();
            lVar.getClass();
            lVar2.getClass();
            return featureset$default(this, str, null, null, null, pVar, lVar, lVar2, 14, null);
        }
    }

    public static final MapInteraction layer(String str, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
        return INSTANCE.layer(str, pVar, lVar, lVar2);
    }

    public static final MapInteraction featureset(String str, String str2, Value value, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
        return INSTANCE.featureset(str, str2, value, pVar, lVar, lVar2);
    }

    public static final MapInteraction featureset(String str, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
        return INSTANCE.featureset(str, pVar, lVar, lVar2);
    }

    public static final MapInteraction featureset(String str, String str2, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar, e23.l<? super InteractionContext, Unit> lVar, e23.l<? super InteractionContext, Unit> lVar2) {
        return INSTANCE.featureset(str, str2, pVar, lVar, lVar2);
    }

    public /* synthetic */ DragInteraction(e23.l lVar, e23.l lVar2, e23.l lVar3, p005kotlin.jvm.internal.j jVar) {
        this(lVar, lVar2, lVar3);
    }

    public /* synthetic */ DragInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d14, e23.p pVar, e23.l lVar, e23.l lVar2, q qVar, p005kotlin.jvm.internal.j jVar) {
        this(featuresetDescriptor, value, d14, pVar, lVar, lVar2, qVar);
    }

    private DragInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d14, final e23.p<? super T, ? super InteractionContext, Boolean> pVar, final e23.l<? super InteractionContext, Unit> lVar, final e23.l<? super InteractionContext, Unit> lVar2, final q<? super Feature, ? super FeaturesetFeatureId, ? super Value, ? extends T> qVar) {
        this.coreInteraction = new Interaction(featuresetDescriptor, value, InteractionType.DRAG, new InteractionHandler() { // from class: com.mapbox.maps.DragInteraction.1
            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature feature, InteractionContext context) {
                Feature feature2;
                context.getClass();
                if (((feature == null || (feature2 = feature.getFeature()) == null) ? null : feature2.geometry()) == null) {
                    return false;
                }
                e23.p<T, InteractionContext, Boolean> pVar2 = pVar;
                q<Feature, FeaturesetFeatureId, Value, T> qVar2 = qVar;
                Feature feature3 = feature.getFeature();
                feature3.getClass();
                FeaturesetFeatureId featuresetFeatureId = feature.getFeaturesetFeatureId();
                Value state = feature.getState();
                state.getClass();
                return ((Boolean) pVar2.invoke(qVar2.invoke(feature3, featuresetFeatureId, state), context)).booleanValue();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext context) {
                context.getClass();
                lVar.invoke(context);
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                context.getClass();
                lVar2.invoke(context);
            }
        }, d14);
    }

    private DragInteraction(final e23.l<? super InteractionContext, Boolean> lVar, final e23.l<? super InteractionContext, Unit> lVar2, final e23.l<? super InteractionContext, Unit> lVar3) {
        this.coreInteraction = new Interaction(null, null, InteractionType.DRAG, new InteractionHandler() { // from class: com.mapbox.maps.DragInteraction.2
            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature feature, InteractionContext context) {
                context.getClass();
                return lVar.invoke(context).booleanValue();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext context) {
                context.getClass();
                lVar2.invoke(context);
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                context.getClass();
                lVar3.invoke(context);
            }
        }, null);
    }
}
