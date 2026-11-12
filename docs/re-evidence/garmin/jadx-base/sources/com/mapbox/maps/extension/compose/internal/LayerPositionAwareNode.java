package com.mapbox.maps.extension.compose.internal;

import a73.f;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.maps.extension.compose.style.internal.StyleLayerPositionNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u0011\u001a\u00020\u000f*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/extension/compose/internal/LayerPositionAwareNode;", "", "isAttached", "", "()Z", "setAttached", "(Z)V", "getLayerIds", "", "", "getRelativePositionInfo", "Lcom/mapbox/maps/LayerPosition;", "parent", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "repositionCurrentNode", "", "Lcom/mapbox/maps/MapboxStyleManager;", "repositionLayersForCurrentNode", "layerPosition", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LayerPositionAwareNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/compose/internal/LayerPositionAwareNode$Companion;", "", "()V", "TAG", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = "LayerPositionAwareNode";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static LayerPosition getRelativePositionInfo(LayerPositionAwareNode layerPositionAwareNode, MapNode mapNode) {
            mapNode.getClass();
            List<MapNode> children = mapNode.getChildren();
            ArrayList arrayList = new ArrayList();
            for (Object obj : children) {
                if (obj instanceof LayerPositionAwareNode) {
                    arrayList.add(obj);
                }
            }
            int iIndexOf = arrayList.indexOf(layerPositionAwareNode);
            LayerPositionAwareNode layerPositionAwareNode2 = (LayerPositionAwareNode) h0.e0(iIndexOf - 1, arrayList);
            if (layerPositionAwareNode2 != null) {
                return new LayerPosition((String) h0.m0(layerPositionAwareNode2.getLayerIds()), null, null);
            }
            if (mapNode instanceof StyleLayerPositionNode) {
                return ((StyleLayerPositionNode) mapNode).getLayerPosition();
            }
            LayerPositionAwareNode layerPositionAwareNode3 = (LayerPositionAwareNode) h0.e0(iIndexOf + 1, arrayList);
            if (layerPositionAwareNode3 == null || !layerPositionAwareNode3.getIsAttached()) {
                return null;
            }
            return new LayerPosition(null, (String) h0.b0(layerPositionAwareNode3.getLayerIds()), null);
        }

        public static void repositionCurrentNode(LayerPositionAwareNode layerPositionAwareNode, MapboxStyleManager mapboxStyleManager, MapNode mapNode) {
            mapboxStyleManager.getClass();
            mapNode.getClass();
            repositionLayersForCurrentNode(layerPositionAwareNode, mapboxStyleManager, layerPositionAwareNode.getRelativePositionInfo(mapNode));
        }

        private static void repositionLayersForCurrentNode(LayerPositionAwareNode layerPositionAwareNode, MapboxStyleManager mapboxStyleManager, LayerPosition layerPosition) {
            MapboxLogger.logD("LayerPositionAwareNode", "[" + layerPositionAwareNode + "] repositionLayersForCurrentNode() called with: layerPosition = " + layerPosition);
            List<String> layerIds = layerPositionAwareNode.getLayerIds();
            if (layerIds.isEmpty()) {
                MapboxLogger.logW("LayerPositionAwareNode", "Cannot reposition layer for " + mapboxStyleManager + ", associatedLayers is empty.");
            }
            mapboxStyleManager.moveStyleLayer((String) h0.m0(layerIds), layerPosition).onError(new f(layerIds, 14, layerPosition, mapboxStyleManager));
            if (layerIds.size() > 1) {
                for (int size = layerIds.size() - 2; -1 < size; size--) {
                    mapboxStyleManager.moveStyleLayer(layerIds.get(size), new LayerPosition(null, layerIds.get(size + 1), null));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void repositionLayersForCurrentNode$lambda$1(List list, LayerPosition layerPosition, MapboxStyleManager mapboxStyleManager, String str) {
            list.getClass();
            mapboxStyleManager.getClass();
            str.getClass();
            MapboxLogger.logW("LayerPositionAwareNode", "Failed to move layer " + list + ".last() to " + layerPosition + ": " + str);
            MapboxLogger.logE("LayerPositionAwareNode", "Available layers in style:");
            List<StyleObjectInfo> styleLayers = mapboxStyleManager.getStyleManager().getStyleLayers();
            styleLayers.getClass();
            Iterator<T> it = styleLayers.iterator();
            while (it.hasNext()) {
                MapboxLogger.logE("LayerPositionAwareNode", "\t " + ((StyleObjectInfo) it.next()).getId());
            }
        }
    }

    List<String> getLayerIds();

    LayerPosition getRelativePositionInfo(MapNode parent);

    /* JADX INFO: renamed from: isAttached */
    boolean getIsAttached();

    void repositionCurrentNode(MapboxStyleManager mapboxStyleManager, MapNode mapNode);

    void setAttached(boolean z14);
}
