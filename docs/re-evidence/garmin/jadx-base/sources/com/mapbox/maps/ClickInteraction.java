package com.mapbox.maps;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import e23.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0016*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u0016Be\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012 \u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0012\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/ClickInteraction;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "T", "Lcom/mapbox/maps/MapInteraction;", "Lcom/mapbox/maps/FeaturesetDescriptor;", "featureset", "Lcom/mapbox/bindgen/Value;", "filter", "", "radius", "Lkotlin/Function2;", "Lcom/mapbox/maps/InteractionContext;", "", "onClick", "Lkotlin/Function3;", "Lcom/mapbox/geojson/Feature;", "Lcom/mapbox/maps/FeaturesetFeatureId;", "featuresetFeatureBuilder", "<init>", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Le23/p;Le23/q;)V", "Lkotlin/Function1;", "(Le23/l;)V", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ClickInteraction<T extends FeaturesetFeature<?>> extends MapInteraction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public ClickInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d14, final e23.p<? super T, ? super InteractionContext, Boolean> pVar, final q<? super Feature, ? super FeaturesetFeatureId, ? super Value, ? extends T> qVar) {
        featuresetDescriptor.getClass();
        pVar.getClass();
        qVar.getClass();
        this.coreInteraction = new Interaction(featuresetDescriptor, value, InteractionType.CLICK, new InteractionHandler() { // from class: com.mapbox.maps.ClickInteraction.1
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
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                context.getClass();
            }
        }, d14);
    }

    public static final MapInteraction featureset(String str, String str2, Value value, Double d14, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
        return INSTANCE.featureset(str, str2, value, d14, pVar);
    }

    public static final MapInteraction layer(String str, Value value, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
        return INSTANCE.layer(str, value, pVar);
    }

    public static final ClickInteraction map(e23.l<? super InteractionContext, Boolean> lVar) {
        return INSTANCE.map(lVar);
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JO\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0016H\u0087\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/mapbox/maps/ClickInteraction$Companion;", "", "<init>", "()V", "", TtmlNode.ATTR_ID, "importId", "Lcom/mapbox/bindgen/Value;", "filter", "", "radius", "Lkotlin/Function2;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/InteractionContext;", "", "onClick", "Lcom/mapbox/maps/MapInteraction;", "featureset", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Le23/p;)Lcom/mapbox/maps/MapInteraction;", "layer", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Le23/p;)Lcom/mapbox/maps/MapInteraction;", "Lkotlin/Function1;", "Lcom/mapbox/maps/ClickInteraction;", "", "map", "(Le23/l;)Lcom/mapbox/maps/ClickInteraction;", "invoke", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static /* synthetic */ MapInteraction featureset$default(Companion companion, String str, String str2, Value value, Double d14, e23.p pVar, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str2 = null;
            }
            if ((i14 & 4) != 0) {
                value = null;
            }
            if ((i14 & 8) != 0) {
                d14 = null;
            }
            return companion.featureset(str, str2, value, d14, pVar);
        }

        public static /* synthetic */ MapInteraction layer$default(Companion companion, String str, Value value, Double d14, e23.p pVar, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                value = null;
            }
            if ((i14 & 4) != 0) {
                d14 = null;
            }
            return companion.layer(str, value, d14, pVar);
        }

        public final MapInteraction featureset(String id3, String importId, Value filter, Double radius, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
            id3.getClass();
            onClick.getClass();
            return new ClickInteraction(new FeaturesetDescriptor(id3, importId, null), filter, radius, onClick, new ClickInteraction$Companion$featureset$1(id3, importId));
        }

        public final MapInteraction layer(String id3, Value filter, Double radius, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
            id3.getClass();
            onClick.getClass();
            return new ClickInteraction(new FeaturesetDescriptor(null, null, id3), filter, radius, onClick, new ClickInteraction$Companion$layer$1(id3));
        }

        public final ClickInteraction map(e23.l<? super InteractionContext, Boolean> onClick) {
            onClick.getClass();
            return new ClickInteraction(onClick, null);
        }

        private Companion() {
        }

        public final MapInteraction featureset(String str, String str2, Value value, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
            str.getClass();
            pVar.getClass();
            return featureset$default(this, str, str2, value, null, pVar, 8, null);
        }

        public final MapInteraction layer(String str, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
            str.getClass();
            pVar.getClass();
            return layer$default(this, str, null, null, pVar, 6, null);
        }

        public final MapInteraction featureset(String str, String str2, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
            str.getClass();
            pVar.getClass();
            return featureset$default(this, str, str2, null, null, pVar, 12, null);
        }

        public final MapInteraction layer(String str, Value value, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
            str.getClass();
            pVar.getClass();
            return layer$default(this, str, value, null, pVar, 4, null);
        }

        public final MapInteraction featureset(String str, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
            str.getClass();
            pVar.getClass();
            return featureset$default(this, str, null, null, null, pVar, 14, null);
        }
    }

    public static final MapInteraction layer(String str, Value value, Double d14, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
        return INSTANCE.layer(str, value, d14, pVar);
    }

    public static final MapInteraction layer(String str, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
        return INSTANCE.layer(str, pVar);
    }

    public static final MapInteraction featureset(String str, String str2, Value value, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
        return INSTANCE.featureset(str, str2, value, pVar);
    }

    public static final MapInteraction featureset(String str, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
        return INSTANCE.featureset(str, pVar);
    }

    public static final MapInteraction featureset(String str, String str2, e23.p<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> pVar) {
        return INSTANCE.featureset(str, str2, pVar);
    }

    public /* synthetic */ ClickInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d14, e23.p pVar, q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(featuresetDescriptor, (i14 & 2) != 0 ? null : value, (i14 & 4) != 0 ? null : d14, pVar, qVar);
    }

    public /* synthetic */ ClickInteraction(e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(lVar);
    }

    private ClickInteraction(final e23.l<? super InteractionContext, Boolean> lVar) {
        this.coreInteraction = new Interaction(null, null, InteractionType.CLICK, new InteractionHandler() { // from class: com.mapbox.maps.ClickInteraction.2
            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature feature, InteractionContext context) {
                context.getClass();
                return lVar.invoke(context).booleanValue();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext context) {
                context.getClass();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                context.getClass();
            }
        }, null);
    }
}
