package com.mapbox.maps.extension.compose.style.interactions;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScope;
import com.mapbox.maps.extension.compose.style.interactions.generated.FeaturesetFeatureScopeImpl;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import e23.l;
import e23.p;
import e23.q;
import f4.s;
import f4.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0005¢\u0006\u0004\b\u000b\u0010\fJ_\u0010\u0019\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102$\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0012H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJS\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102$\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0012H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\b2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u001eH\u0004¢\u0006\u0004\b\u001f\u0010 J)\u0010\"\u001a\u00020\b2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u001eH\u0004¢\u0006\u0004\b\"\u0010 J_\u0010#\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102$\u0010!\u001a \u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0012H\u0004¢\u0006\u0004\b#\u0010\u001aJS\u0010$\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102$\u0010!\u001a \u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0012H\u0004¢\u0006\u0004\b$\u0010\u001dR.\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020'0&0%8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/interactions/BasicStyleInteractions;", "", "<init>", "()V", "Lcom/mapbox/maps/MapboxMap;", "map", "", "importId", "", "UpdateInteractions", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lp3/m;I)V", "BindToMap", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lp3/m;II)V", "featuresetId", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "", "radius", "Lkotlin/Function3;", "Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/InteractionContext;", "", "onClick", "clickInteractionFeatureset", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/Double;Le23/q;)V", "layerId", "clickInteractionLayer", "(Ljava/lang/String;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/Double;Le23/q;)V", "Lkotlin/Function2;", "clickInteractionMap", "(Le23/p;)V", "onLongClick", "longClickInteractionMap", "longClickInteractionFeatureset", "longClickInteractionLayer", "", "Lkotlin/Function1;", "Lcom/mapbox/maps/MapInteraction;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Ljava/util/List;", "getEntries", "()Ljava/util/List;", "featuresetFeatureScope", "Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;", "getFeaturesetFeatureScope", "()Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;", "setFeaturesetFeatureScope", "(Lcom/mapbox/maps/extension/compose/style/interactions/generated/FeaturesetFeatureScope;)V", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BasicStyleInteractions {
    public static final int $stable = 8;
    private final List<l<String, MapInteraction>> entries = new ArrayList();
    private FeaturesetFeatureScope featuresetFeatureScope;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$BindToMap$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<i0, h0> {
        final /* synthetic */ MapboxMap $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapboxMap mapboxMap) {
            super(1);
            this.$map = mapboxMap;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            BasicStyleInteractions.this.setFeaturesetFeatureScope(new FeaturesetFeatureScopeImpl(this.$map));
            final BasicStyleInteractions basicStyleInteractions = BasicStyleInteractions.this;
            return new h0() { // from class: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$BindToMap$1$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    basicStyleInteractions.setFeaturesetFeatureScope(null);
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$UpdateInteractions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41891 extends w implements l<i0, h0> {
        final /* synthetic */ s<Cancelable> $cancelables;
        final /* synthetic */ String $importId;
        final /* synthetic */ MapboxMap $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41891(s<Cancelable> sVar, MapboxMap mapboxMap, String str) {
            super(1);
            this.$cancelables = sVar;
            this.$map = mapboxMap;
            this.$importId = str;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            List<l<String, MapInteraction>> entries = BasicStyleInteractions.this.getEntries();
            s<Cancelable> sVar = this.$cancelables;
            MapboxMap mapboxMap = this.$map;
            String str = this.$importId;
            Iterator<T> it = entries.iterator();
            while (it.hasNext()) {
                sVar.add(mapboxMap.addInteraction((MapInteraction) ((l) it.next()).invoke(str)));
            }
            final s<Cancelable> sVar2 = this.$cancelables;
            return new h0() { // from class: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$UpdateInteractions$1$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    ListIterator listIterator = sVar2.listIterator();
                    while (true) {
                        z zVar = (z) listIterator;
                        if (!zVar.hasNext()) {
                            sVar2.clear();
                            return;
                        }
                        ((Cancelable) zVar.next()).cancel();
                    }
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$clickInteractionFeatureset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/MapInteraction;", "import", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41911 extends w implements l<String, MapInteraction> {
        final /* synthetic */ String $featuresetId;
        final /* synthetic */ Expression $filter;
        final /* synthetic */ String $importId;
        final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onClick;
        final /* synthetic */ Double $radius;
        final /* synthetic */ BasicStyleInteractions this$0;

        /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$clickInteractionFeatureset$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "feature", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C11651 extends w implements p<FeaturesetFeature<FeatureState>, InteractionContext, Boolean> {
            final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onClick;
            final /* synthetic */ BasicStyleInteractions this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11651(BasicStyleInteractions basicStyleInteractions, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
                super(2);
                this.this$0 = basicStyleInteractions;
                this.$onClick = qVar;
            }

            @Override // e23.p
            public final Boolean invoke(FeaturesetFeature<FeatureState> featuresetFeature, InteractionContext interactionContext) {
                featuresetFeature.getClass();
                interactionContext.getClass();
                FeaturesetFeatureScope featuresetFeatureScope = this.this$0.getFeaturesetFeatureScope();
                return Boolean.valueOf(featuresetFeatureScope != null ? this.$onClick.invoke(featuresetFeatureScope, featuresetFeature, interactionContext).booleanValue() : false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41911(String str, String str2, Expression expression, Double d14, BasicStyleInteractions basicStyleInteractions, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
            super(1);
            this.$featuresetId = str;
            this.$importId = str2;
            this.$filter = expression;
            this.$radius = d14;
            this.this$0 = basicStyleInteractions;
            this.$onClick = qVar;
        }

        @Override // e23.l
        public final MapInteraction invoke(String str) {
            ClickInteraction.Companion companion = ClickInteraction.INSTANCE;
            String str2 = this.$featuresetId;
            String str3 = this.$importId;
            if (str3 == null) {
                str3 = str;
            }
            return companion.featureset(str2, str3, this.$filter, this.$radius, new C11651(this.this$0, this.$onClick));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$clickInteractionLayer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/MapInteraction;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41921 extends w implements l<String, MapInteraction> {
        final /* synthetic */ Expression $filter;
        final /* synthetic */ String $layerId;
        final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onClick;
        final /* synthetic */ Double $radius;
        final /* synthetic */ BasicStyleInteractions this$0;

        /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$clickInteractionLayer$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "feature", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C11661 extends w implements p<FeaturesetFeature<FeatureState>, InteractionContext, Boolean> {
            final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onClick;
            final /* synthetic */ BasicStyleInteractions this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11661(BasicStyleInteractions basicStyleInteractions, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
                super(2);
                this.this$0 = basicStyleInteractions;
                this.$onClick = qVar;
            }

            @Override // e23.p
            public final Boolean invoke(FeaturesetFeature<FeatureState> featuresetFeature, InteractionContext interactionContext) {
                featuresetFeature.getClass();
                interactionContext.getClass();
                FeaturesetFeatureScope featuresetFeatureScope = this.this$0.getFeaturesetFeatureScope();
                return Boolean.valueOf(featuresetFeatureScope != null ? this.$onClick.invoke(featuresetFeatureScope, featuresetFeature, interactionContext).booleanValue() : false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41921(String str, Expression expression, Double d14, BasicStyleInteractions basicStyleInteractions, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
            super(1);
            this.$layerId = str;
            this.$filter = expression;
            this.$radius = d14;
            this.this$0 = basicStyleInteractions;
            this.$onClick = qVar;
        }

        @Override // e23.l
        public final MapInteraction invoke(String str) {
            return ClickInteraction.INSTANCE.layer(this.$layerId, this.$filter, this.$radius, new C11661(this.this$0, this.$onClick));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$clickInteractionMap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/MapInteraction;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41931 extends w implements l<String, MapInteraction> {
        final /* synthetic */ p<FeaturesetFeatureScope, InteractionContext, Boolean> $onClick;

        /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$clickInteractionMap$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C11671 extends w implements l<InteractionContext, Boolean> {
            final /* synthetic */ p<FeaturesetFeatureScope, InteractionContext, Boolean> $onClick;
            final /* synthetic */ BasicStyleInteractions this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11671(BasicStyleInteractions basicStyleInteractions, p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> pVar) {
                super(1);
                this.this$0 = basicStyleInteractions;
                this.$onClick = pVar;
            }

            @Override // e23.l
            public final Boolean invoke(InteractionContext interactionContext) {
                interactionContext.getClass();
                FeaturesetFeatureScope featuresetFeatureScope = this.this$0.getFeaturesetFeatureScope();
                return Boolean.valueOf(featuresetFeatureScope != null ? this.$onClick.invoke(featuresetFeatureScope, interactionContext).booleanValue() : false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41931(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> pVar) {
            super(1);
            this.$onClick = pVar;
        }

        @Override // e23.l
        public final MapInteraction invoke(String str) {
            return ClickInteraction.INSTANCE.map(new C11671(BasicStyleInteractions.this, this.$onClick));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$longClickInteractionFeatureset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/MapInteraction;", "import", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41941 extends w implements l<String, MapInteraction> {
        final /* synthetic */ String $featuresetId;
        final /* synthetic */ Expression $filter;
        final /* synthetic */ String $importId;
        final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onLongClick;
        final /* synthetic */ Double $radius;
        final /* synthetic */ BasicStyleInteractions this$0;

        /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$longClickInteractionFeatureset$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "feature", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C11681 extends w implements p<FeaturesetFeature<FeatureState>, InteractionContext, Boolean> {
            final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onLongClick;
            final /* synthetic */ BasicStyleInteractions this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11681(BasicStyleInteractions basicStyleInteractions, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
                super(2);
                this.this$0 = basicStyleInteractions;
                this.$onLongClick = qVar;
            }

            @Override // e23.p
            public final Boolean invoke(FeaturesetFeature<FeatureState> featuresetFeature, InteractionContext interactionContext) {
                featuresetFeature.getClass();
                interactionContext.getClass();
                FeaturesetFeatureScope featuresetFeatureScope = this.this$0.getFeaturesetFeatureScope();
                return Boolean.valueOf(featuresetFeatureScope != null ? this.$onLongClick.invoke(featuresetFeatureScope, featuresetFeature, interactionContext).booleanValue() : false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41941(String str, String str2, Expression expression, Double d14, BasicStyleInteractions basicStyleInteractions, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
            super(1);
            this.$featuresetId = str;
            this.$importId = str2;
            this.$filter = expression;
            this.$radius = d14;
            this.this$0 = basicStyleInteractions;
            this.$onLongClick = qVar;
        }

        @Override // e23.l
        public final MapInteraction invoke(String str) {
            LongClickInteraction.Companion companion = LongClickInteraction.INSTANCE;
            String str2 = this.$featuresetId;
            String str3 = this.$importId;
            if (str3 == null) {
                str3 = str;
            }
            return companion.featureset(str2, str3, this.$filter, this.$radius, new C11681(this.this$0, this.$onLongClick));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$longClickInteractionLayer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/MapInteraction;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41951 extends w implements l<String, MapInteraction> {
        final /* synthetic */ Expression $filter;
        final /* synthetic */ String $layerId;
        final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onLongClick;
        final /* synthetic */ Double $radius;
        final /* synthetic */ BasicStyleInteractions this$0;

        /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$longClickInteractionLayer$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "feature", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C11691 extends w implements p<FeaturesetFeature<FeatureState>, InteractionContext, Boolean> {
            final /* synthetic */ q<FeaturesetFeatureScope, FeaturesetFeature<FeatureState>, InteractionContext, Boolean> $onLongClick;
            final /* synthetic */ BasicStyleInteractions this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11691(BasicStyleInteractions basicStyleInteractions, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
                super(2);
                this.this$0 = basicStyleInteractions;
                this.$onLongClick = qVar;
            }

            @Override // e23.p
            public final Boolean invoke(FeaturesetFeature<FeatureState> featuresetFeature, InteractionContext interactionContext) {
                featuresetFeature.getClass();
                interactionContext.getClass();
                FeaturesetFeatureScope featuresetFeatureScope = this.this$0.getFeaturesetFeatureScope();
                return Boolean.valueOf(featuresetFeatureScope != null ? this.$onLongClick.invoke(featuresetFeatureScope, featuresetFeature, interactionContext).booleanValue() : false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41951(String str, Expression expression, Double d14, BasicStyleInteractions basicStyleInteractions, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> qVar) {
            super(1);
            this.$layerId = str;
            this.$filter = expression;
            this.$radius = d14;
            this.this$0 = basicStyleInteractions;
            this.$onLongClick = qVar;
        }

        @Override // e23.l
        public final MapInteraction invoke(String str) {
            return LongClickInteraction.INSTANCE.layer(this.$layerId, this.$filter, this.$radius, new C11691(this.this$0, this.$onLongClick));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$longClickInteractionMap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/MapInteraction;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41961 extends w implements l<String, MapInteraction> {
        final /* synthetic */ p<FeaturesetFeatureScope, InteractionContext, Boolean> $onLongClick;

        /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$longClickInteractionMap$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C11701 extends w implements l<InteractionContext, Boolean> {
            final /* synthetic */ p<FeaturesetFeatureScope, InteractionContext, Boolean> $onLongClick;
            final /* synthetic */ BasicStyleInteractions this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11701(BasicStyleInteractions basicStyleInteractions, p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> pVar) {
                super(1);
                this.this$0 = basicStyleInteractions;
                this.$onLongClick = pVar;
            }

            @Override // e23.l
            public final Boolean invoke(InteractionContext interactionContext) {
                interactionContext.getClass();
                FeaturesetFeatureScope featuresetFeatureScope = this.this$0.getFeaturesetFeatureScope();
                return Boolean.valueOf(featuresetFeatureScope != null ? this.$onLongClick.invoke(featuresetFeatureScope, interactionContext).booleanValue() : false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41961(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> pVar) {
            super(1);
            this.$onLongClick = pVar;
        }

        @Override // e23.l
        public final MapInteraction invoke(String str) {
            return LongClickInteraction.INSTANCE.map(new C11701(BasicStyleInteractions.this, this.$onLongClick));
        }
    }

    public static /* synthetic */ void clickInteractionFeatureset$default(BasicStyleInteractions basicStyleInteractions, String str, String str2, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: clickInteractionFeatureset");
            return;
        }
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            expression = null;
        }
        basicStyleInteractions.clickInteractionFeatureset(str, str2, expression, d14, qVar);
    }

    public static /* synthetic */ void clickInteractionLayer$default(BasicStyleInteractions basicStyleInteractions, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: clickInteractionLayer");
            return;
        }
        if ((i14 & 2) != 0) {
            expression = null;
        }
        basicStyleInteractions.clickInteractionLayer(str, expression, d14, qVar);
    }

    public static /* synthetic */ void longClickInteractionFeatureset$default(BasicStyleInteractions basicStyleInteractions, String str, String str2, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: longClickInteractionFeatureset");
            return;
        }
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            expression = null;
        }
        basicStyleInteractions.longClickInteractionFeatureset(str, str2, expression, d14, qVar);
    }

    public static /* synthetic */ void longClickInteractionLayer$default(BasicStyleInteractions basicStyleInteractions, String str, Expression expression, Double d14, q qVar, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: longClickInteractionLayer");
            return;
        }
        if ((i14 & 2) != 0) {
            expression = null;
        }
        basicStyleInteractions.longClickInteractionLayer(str, expression, d14, qVar);
    }

    public final void BindToMap(MapboxMap mapboxMap, String str, m mVar, int i14, int i15) {
        mapboxMap.getClass();
        o0 o0VarE = mVar.E(134101520);
        if ((i15 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        x1 x1Var = n.f135158a;
        UpdateInteractions(mapboxMap, str2, o0VarE, (i14 & 112) | 520);
        l0.a(Unit.INSTANCE, new AnonymousClass1(mapboxMap), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(mapboxMap, str2, i14, i15);
    }

    public final void UpdateInteractions(MapboxMap mapboxMap, String str, m mVar, int i14) {
        mapboxMap.getClass();
        o0 o0VarE = mVar.E(-934899378);
        x1 x1Var = n.f135158a;
        o0VarE.L(-492369756);
        Object objQ = o0VarE.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new s();
            o0VarE.K(objQ);
        }
        o0VarE.g0(false);
        l0.a(this.entries, new C41891((s) objQ, mapboxMap, str), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41902(mapboxMap, str, i14);
    }

    public final void clickInteractionFeatureset(String featuresetId, String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
        featuresetId.getClass();
        onClick.getClass();
        this.entries.add(new C41911(featuresetId, importId, filter, radius, this, onClick));
    }

    public final void clickInteractionLayer(String layerId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onClick) {
        layerId.getClass();
        onClick.getClass();
        this.entries.add(new C41921(layerId, filter, radius, this, onClick));
    }

    public final void clickInteractionMap(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> onClick) {
        onClick.getClass();
        this.entries.add(new C41931(onClick));
    }

    public final List<l<String, MapInteraction>> getEntries() {
        return this.entries;
    }

    public final FeaturesetFeatureScope getFeaturesetFeatureScope() {
        return this.featuresetFeatureScope;
    }

    public final void longClickInteractionFeatureset(String featuresetId, String importId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
        featuresetId.getClass();
        onLongClick.getClass();
        this.entries.add(new C41941(featuresetId, importId, filter, radius, this, onLongClick));
    }

    public final void longClickInteractionLayer(String layerId, Expression filter, Double radius, q<? super FeaturesetFeatureScope, ? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
        layerId.getClass();
        onLongClick.getClass();
        this.entries.add(new C41951(layerId, filter, radius, this, onLongClick));
    }

    public final void longClickInteractionMap(p<? super FeaturesetFeatureScope, ? super InteractionContext, Boolean> onLongClick) {
        onLongClick.getClass();
        this.entries.add(new C41961(onLongClick));
    }

    public final void setFeaturesetFeatureScope(FeaturesetFeatureScope featuresetFeatureScope) {
        this.featuresetFeatureScope = featuresetFeatureScope;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$UpdateInteractions$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41902 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $importId;
        final /* synthetic */ MapboxMap $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41902(MapboxMap mapboxMap, String str, int i14) {
            super(2);
            this.$map = mapboxMap;
            this.$importId = str;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            BasicStyleInteractions.this.UpdateInteractions(this.$map, this.$importId, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.interactions.BasicStyleInteractions$BindToMap$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $importId;
        final /* synthetic */ MapboxMap $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MapboxMap mapboxMap, String str, int i14, int i15) {
            super(2);
            this.$map = mapboxMap;
            this.$importId = str;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            BasicStyleInteractions.this.BindToMap(this.$map, this.$importId, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }
}
