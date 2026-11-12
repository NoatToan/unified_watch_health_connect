package com.mapbox.maps.extension.compose.annotation.internal;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode;
import com.mapbox.maps.extension.compose.internal.MapNode;
import com.mapbox.maps.extension.compose.internal.StyleLifecycleAwareNode;
import com.mapbox.maps.extension.compose.style.internal.StyleSlotNode;
import e23.l;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b \u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH$¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/internal/BaseAnnotationNode;", "Lcom/mapbox/maps/extension/compose/internal/LayerPositionAwareNode;", "Lcom/mapbox/maps/extension/compose/internal/StyleLifecycleAwareNode;", "Lcom/mapbox/maps/MapboxStyleManager;", "mapboxStyleManager", "Lo53/b0;", "coroutineScope", "<init>", "(Lcom/mapbox/maps/MapboxStyleManager;Lo53/b0;)V", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "parent", "", "onAttached", "(Lcom/mapbox/maps/extension/compose/internal/MapNode;)V", "onMoved", "onClear", "()V", "onRemoved", "cleanUp", "", "isAttached", "Z", "()Z", "setAttached", "(Z)V", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseAnnotationNode extends StyleLifecycleAwareNode implements LayerPositionAwareNode {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "BaseAnnotationNode";
    private boolean isAttached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAnnotationNode(MapboxStyleManager mapboxStyleManager, b0 b0Var) {
        super(mapboxStyleManager, b0Var);
        mapboxStyleManager.getClass();
        b0Var.getClass();
    }

    public abstract void cleanUp();

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    public LayerPosition getRelativePositionInfo(MapNode mapNode) {
        return LayerPositionAwareNode.DefaultImpls.getRelativePositionInfo(this, mapNode);
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // com.mapbox.maps.extension.compose.internal.StyleLifecycleAwareNode, com.mapbox.maps.extension.compose.internal.MapNode
    public void onAttached(MapNode parent) {
        parent.getClass();
        MapboxLogger.logD(TAG, "[" + this + "] onAttached() called with: parent = " + parent);
        super.onAttached(parent);
        dispatchWhenReady(new AnonymousClass1(parent, this));
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onClear() {
        cleanUp();
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onMoved(MapNode parent) {
        parent.getClass();
        dispatchWhenReady(new C41811(parent));
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onRemoved(MapNode parent) {
        parent.getClass();
        cleanUp();
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    public void repositionCurrentNode(MapboxStyleManager mapboxStyleManager, MapNode mapNode) {
        LayerPositionAwareNode.DefaultImpls.repositionCurrentNode(this, mapboxStyleManager, mapNode);
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    public void setAttached(boolean z14) {
        this.isAttached = z14;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/internal/BaseAnnotationNode$Companion;", "", "()V", "TAG", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.internal.BaseAnnotationNode$onMoved$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/MapboxStyleManager;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41811 extends w implements l<MapboxStyleManager, Unit> {
        final /* synthetic */ MapNode $parent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41811(MapNode mapNode) {
            super(1);
            this.$parent = mapNode;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapboxStyleManager mapboxStyleManager) {
            mapboxStyleManager.getClass();
            BaseAnnotationNode.this.repositionCurrentNode(mapboxStyleManager, this.$parent);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapboxStyleManager mapboxStyleManager) {
            invoke2(mapboxStyleManager);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.internal.BaseAnnotationNode$onAttached$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mapboxStyleManager", "Lcom/mapbox/maps/MapboxStyleManager;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<MapboxStyleManager, Unit> {
        final /* synthetic */ MapNode $parent;
        final /* synthetic */ BaseAnnotationNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapNode mapNode, BaseAnnotationNode baseAnnotationNode) {
            super(1);
            this.$parent = mapNode;
            this.this$0 = baseAnnotationNode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(String str, String str2) {
            str.getClass();
            str2.getClass();
            MapboxLogger.logE(BaseAnnotationNode.TAG, "Failed to set slot property for layer " + str + ": " + str2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapboxStyleManager mapboxStyleManager) {
            mapboxStyleManager.getClass();
            if (this.$parent instanceof StyleSlotNode) {
                List<String> layerIds = this.this$0.getLayerIds();
                MapNode mapNode = this.$parent;
                for (final String str : layerIds) {
                    mapboxStyleManager.setStyleLayerProperty(str, "slot", new Value(((StyleSlotNode) mapNode).getSlotName())).onError(new Expected.Action() { // from class: com.mapbox.maps.extension.compose.annotation.internal.a
                        @Override // com.mapbox.bindgen.Expected.Action
                        public final void run(Object obj) {
                            BaseAnnotationNode.AnonymousClass1.invoke$lambda$1$lambda$0(str, (String) obj);
                        }
                    });
                }
            }
            this.this$0.repositionCurrentNode(mapboxStyleManager, this.$parent);
            this.this$0.setAttached(true);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapboxStyleManager mapboxStyleManager) {
            invoke2(mapboxStyleManager);
            return Unit.INSTANCE;
        }
    }
}
