package com.mapbox.maps.extension.compose.style.layers.internal;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode;
import com.mapbox.maps.extension.compose.internal.MapNode;
import com.mapbox.maps.extension.compose.internal.StyleLifecycleAwareNode;
import com.mapbox.maps.extension.compose.style.StyleImage;
import com.mapbox.maps.extension.compose.style.internal.StyleLayerPositionNode;
import com.mapbox.maps.extension.compose.style.internal.StyleSlotNode;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import e23.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k23.g;
import o13.p;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u0;
import p13.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u00020\u00102\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0005H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010\u0016J\u000f\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u0010\u0016J\u000f\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u0010\u0016J\u000f\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u0010H\u0002¢\u0006\u0004\b6\u0010\u0016J\u000f\u00107\u001a\u00020\u0010H\u0002¢\u0006\u0004\b7\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010:R0\u0010=\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020(0;j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020(`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010C\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bF\u0010H\"\u0004\bI\u0010JR,\u0010L\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00100K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "Lcom/mapbox/maps/extension/compose/internal/LayerPositionAwareNode;", "Lcom/mapbox/maps/extension/compose/internal/StyleLifecycleAwareNode;", "Lcom/mapbox/maps/MapboxMap;", "map", "", "layerType", "layerId", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState;", "sourceState", "Lo53/b0;", "coroutineScope", "<init>", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/style/sources/SourceState;Lo53/b0;)V", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "parent", "", "onAttached", "(Lcom/mapbox/maps/extension/compose/internal/MapNode;)V", "onMoved", "onRemoved", "onClear", "()V", "updateLayerId$extension_compose_release", "(Ljava/lang/String;)V", "updateLayerId", "updateSource$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/sources/SourceState;)V", "updateSource", "Lo13/p;", "modelInfo", "addModel$extension_compose_release", "(Lo13/p;)V", "addModel", "Lcom/mapbox/maps/extension/compose/style/StyleImage;", "styleImage", "addImage$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/StyleImage;)V", "addImage", "name", "Lcom/mapbox/bindgen/Value;", "value", "setProperty$extension_compose_release", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V", "setProperty", "", "getLayerIds", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "attachSource", "detachSource", "cleanUp", "cleanUpResources", "addLayer", "removeLayer", "Lcom/mapbox/maps/MapboxMap;", "Ljava/lang/String;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "parameters", "Ljava/util/HashMap;", "", "addedImages", "Ljava/util/List;", "addedModels", "parentNode", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "", "isAttached", "Z", "()Z", "setAttached", "(Z)V", "Lkotlin/reflect/KFunction2;", "setPropertyAction", "Lk23/g;", "getSetPropertyAction$extension_compose_release", "()Lk23/g;", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LayerNode extends StyleLifecycleAwareNode implements LayerPositionAwareNode {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "LayerNode";
    private final List<String> addedImages;
    private final List<String> addedModels;
    private boolean isAttached;
    private String layerId;
    private final String layerType;
    private final MapboxMap map;
    private final HashMap<String, Value> parameters;
    private MapNode parentNode;
    private final g<Unit> setPropertyAction;
    private SourceState sourceState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerNode(MapboxMap mapboxMap, String str, String str2, SourceState sourceState, b0 b0Var) {
        String sourceId;
        super(mapboxMap, b0Var);
        mapboxMap.getClass();
        str.getClass();
        str2.getClass();
        b0Var.getClass();
        this.map = mapboxMap;
        this.layerType = str;
        this.layerId = str2;
        this.sourceState = sourceState;
        HashMap<String, Value> mapD = u0.d(new p(TtmlNode.ATTR_ID, new Value(str2)), new p(NotificationConstants.KEY_DATA_MIME_TYPE, new Value(str)));
        SourceState sourceState2 = this.sourceState;
        if (sourceState2 != null && (sourceId = sourceState2.getSourceId()) != null) {
            mapD.put("source", new Value(sourceId));
        }
        this.parameters = mapD;
        this.addedImages = new ArrayList();
        this.addedModels = new ArrayList();
        this.setPropertyAction = new LayerNode$setPropertyAction$1(this);
    }

    private final void addLayer() {
        StringBuilder sb3 = new StringBuilder("Adding layer: ");
        sb3.append(this.parameters);
        sb3.append(", within parent: ");
        MapNode mapNode = this.parentNode;
        if (mapNode == null) {
            s.m("parentNode");
            throw null;
        }
        sb3.append(mapNode);
        MapboxLogger.logD(TAG, sb3.toString());
        MapNode mapNode2 = this.parentNode;
        if (mapNode2 == null) {
            s.m("parentNode");
            throw null;
        }
        if ((mapNode2 instanceof StyleSlotNode) || (mapNode2 instanceof StyleLayerPositionNode)) {
            dispatchWhenReady(new AnonymousClass1());
            return;
        }
        MapboxLogger.logD(TAG, "Adding persistent layer: " + this.parameters);
        MapNode mapNode3 = this.parentNode;
        if (mapNode3 == null) {
            s.m("parentNode");
            throw null;
        }
        LayerPosition relativePositionInfo = getRelativePositionInfo(mapNode3);
        MapboxLogger.logD(TAG, "Adding layer: " + this.parameters + ", with layer position: " + relativePositionInfo);
        int i14 = 1;
        this.map.addPersistentStyleLayer(new Value(this.parameters), relativePositionInfo).onError(new c(i14)).onValue(new d(this, i14));
        setAttached(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayer$lambda$4(String str) {
        str.getClass();
        MapboxLogger.logE(TAG, "Failed to add persistent layer: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayer$lambda$5(LayerNode layerNode, None none) {
        layerNode.getClass();
        none.getClass();
        MapboxLogger.logD(TAG, "Added persistent layer: " + layerNode.parameters);
        layerNode.attachSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachSource() {
        SourceState sourceState = this.sourceState;
        if (sourceState != null) {
            sourceState.attachToLayer$extension_compose_release(this.layerId, this.map);
        }
    }

    private final void cleanUp() {
        removeLayer();
        detachSource();
        cleanUpResources();
    }

    private final void cleanUpResources() {
        Iterator<T> it = this.addedImages.iterator();
        while (it.hasNext()) {
            this.map.removeStyleImage((String) it.next());
        }
        this.addedImages.clear();
        Iterator<T> it3 = this.addedModels.iterator();
        while (it3.hasNext()) {
            this.map.removeStyleModel((String) it3.next());
        }
        this.addedModels.clear();
    }

    private final void detachSource() {
        MapboxLogger.logD(TAG, "detaching Source: " + this);
        SourceState sourceState = this.sourceState;
        if (sourceState != null) {
            sourceState.detachFromLayer$extension_compose_release(this.layerId, this.map);
        }
    }

    private final void removeLayer() {
        MapboxLogger.logD(TAG, "Removing layer: " + this);
        String error = this.map.removeStyleLayer(this.layerId).getError();
        if (error != null) {
            MapboxLogger.logW(TAG, "Failed to remove " + this.layerType + " layer " + this.layerId + ": " + error);
        }
    }

    public final void addImage$extension_compose_release(StyleImage styleImage) {
        styleImage.getClass();
        dispatchWhenReady(new LayerNode$addImage$1(styleImage, this));
    }

    public final void addModel$extension_compose_release(p<String, String> modelInfo) {
        modelInfo.getClass();
        dispatchWhenReady(new LayerNode$addModel$1(modelInfo, this));
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    public List<String> getLayerIds() {
        return w.c(this.layerId);
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    public LayerPosition getRelativePositionInfo(MapNode mapNode) {
        return LayerPositionAwareNode.DefaultImpls.getRelativePositionInfo(this, mapNode);
    }

    public final g<Unit> getSetPropertyAction$extension_compose_release() {
        return this.setPropertyAction;
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // com.mapbox.maps.extension.compose.internal.StyleLifecycleAwareNode, com.mapbox.maps.extension.compose.internal.MapNode
    public void onAttached(MapNode parent) {
        parent.getClass();
        MapboxLogger.logD(TAG, "onAttached: parent=" + parent);
        super.onAttached(parent);
        if (parent instanceof StyleSlotNode) {
            this.parameters.put("slot", new Value(((StyleSlotNode) parent).getSlotName()));
        }
        this.parentNode = parent;
        addLayer();
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onClear() {
        cleanUp();
        super.onClear();
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onMoved(MapNode parent) {
        parent.getClass();
        MapboxLogger.logD(TAG, "onMoved");
        dispatchWhenReady(new C41991(parent));
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onRemoved(MapNode parent) {
        parent.getClass();
        MapboxLogger.logD(TAG, "onRemoved: parent=" + parent);
        cleanUp();
        super.onRemoved(parent);
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    public void repositionCurrentNode(MapboxStyleManager mapboxStyleManager, MapNode mapNode) {
        LayerPositionAwareNode.DefaultImpls.repositionCurrentNode(this, mapboxStyleManager, mapNode);
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    public void setAttached(boolean z14) {
        this.isAttached = z14;
    }

    public final void setProperty$extension_compose_release(String name, Value value) {
        name.getClass();
        value.getClass();
        StringBuilder sb3 = new StringBuilder("[");
        sn.a.t(sb3, this.layerType, "] settingProperty: property=", name, ", value=");
        sb3.append(value);
        sb3.append(" ...");
        MapboxLogger.logD(TAG, sb3.toString());
        if (getIsAttached()) {
            dispatchWhenReady(new LayerNode$setProperty$1(this, name, value));
        } else {
            MapboxLogger.logD(TAG, "setProperty() called before the layer is attached to the map.");
            this.parameters.put(name, value);
        }
    }

    public String toString() {
        return "LayerNode(layerType=" + this.layerType + ", parameters=" + this.parameters + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void updateLayerId$extension_compose_release(String layerId) {
        layerId.getClass();
        detachSource();
        removeLayer();
        this.layerId = layerId;
        this.parameters.put(TtmlNode.ATTR_ID, new Value(layerId));
        addLayer();
        attachSource();
    }

    public final void updateSource$extension_compose_release(SourceState sourceState) {
        sourceState.getClass();
        detachSource();
        removeLayer();
        this.sourceState = sourceState;
        this.parameters.put("source", new Value(sourceState.getSourceId()));
        addLayer();
        attachSource();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode$Companion;", "", "()V", "TAG", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.layers.internal.LayerNode$onMoved$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/MapboxStyleManager;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41991 extends p005kotlin.jvm.internal.w implements l<MapboxStyleManager, Unit> {
        final /* synthetic */ MapNode $parent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41991(MapNode mapNode) {
            super(1);
            this.$parent = mapNode;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapboxStyleManager mapboxStyleManager) {
            mapboxStyleManager.getClass();
            LayerNode.this.repositionCurrentNode(mapboxStyleManager, this.$parent);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapboxStyleManager mapboxStyleManager) {
            invoke2(mapboxStyleManager);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.layers.internal.LayerNode$addLayer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/MapboxStyleManager;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends p005kotlin.jvm.internal.w implements l<MapboxStyleManager, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(String str) {
            str.getClass();
            MapboxLogger.logE(LayerNode.TAG, "Failed to add layer: ".concat(str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(LayerNode layerNode, None none) {
            layerNode.getClass();
            none.getClass();
            MapboxLogger.logD(LayerNode.TAG, "Added layer: " + layerNode.parameters);
            layerNode.attachSource();
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapboxStyleManager mapboxStyleManager) {
            mapboxStyleManager.getClass();
            LayerNode layerNode = LayerNode.this;
            MapNode mapNode = layerNode.parentNode;
            if (mapNode == null) {
                s.m("parentNode");
                throw null;
            }
            LayerPosition relativePositionInfo = layerNode.getRelativePositionInfo(mapNode);
            MapboxLogger.logD(LayerNode.TAG, "Adding layer: " + LayerNode.this.parameters + ", with layer position: " + relativePositionInfo);
            mapboxStyleManager.addStyleLayer(new Value((HashMap<String, Value>) LayerNode.this.parameters), relativePositionInfo).onError(new c(0)).onValue(new d(LayerNode.this, 0));
            LayerNode.this.setAttached(true);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapboxStyleManager mapboxStyleManager) {
            invoke2(mapboxStyleManager);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LayerNode(MapboxMap mapboxMap, String str, String str2, SourceState sourceState, b0 b0Var, int i14, j jVar) {
        this(mapboxMap, str, str2, (i14 & 8) != 0 ? null : sourceState, b0Var);
    }
}
