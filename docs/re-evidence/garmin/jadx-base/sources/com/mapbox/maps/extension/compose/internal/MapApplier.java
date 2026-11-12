package com.mapbox.maps.extension.compose.internal;

import ch.qos.logback.classic.net.SyslogAppender;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.mapbox.common.LogConfiguration;
import com.mapbox.common.LoggingLevel;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLogger;
import com.nimbusds.jose.HeaderParameterNames;
import e23.p;
import i3.e5;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0000\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/mapbox/maps/extension/compose/internal/MapApplier;", "Lp3/a;", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "Lcom/mapbox/maps/MapView;", "mapView", "<init>", "(Lcom/mapbox/maps/MapView;)V", "", FirebaseAnalytics.Param.INDEX, "", "notifyMoveNextLayerPositionAwareNode", "(I)V", "", HeaderParameterNames.AUTHENTICATION_TAG, "printNodesTree", "(Ljava/lang/String;)V", "prefix", "node", "walkChildren", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/internal/MapNode;)V", "onClear", "()V", "instance", "insertBottomUp", "(ILcom/mapbox/maps/extension/compose/internal/MapNode;)V", "insertTopDown", Constants.MessagePayloadKeys.FROM, "to", "count", "move", "(III)V", "remove", "(II)V", "Lcom/mapbox/maps/MapView;", "getMapView", "()Lcom/mapbox/maps/MapView;", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapApplier extends a<MapNode> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "MapApplier";
    private final MapView mapView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapApplier(MapView mapView) {
        super(new RootMapNode());
        mapView.getClass();
        this.mapView = mapView;
    }

    private final void notifyMoveNextLayerPositionAwareNode(int index) {
        int size = getCurrent().getChildren().size();
        while (index < size) {
            if (getCurrent().getChildren().get(index) instanceof LayerPositionAwareNode) {
                getCurrent().getChildren().get(index).onMoved(getCurrent());
                return;
            }
            index++;
        }
    }

    private final void printNodesTree(String tag) {
        LoggingLevel loggingLevel = LogConfiguration.getLoggingLevel(tag);
        if (loggingLevel == null || loggingLevel.ordinal() > LoggingLevel.DEBUG.ordinal()) {
            return;
        }
        walkChildren$default(this, tag, null, getRoot(), 2, null);
    }

    public static /* synthetic */ void printNodesTree$default(MapApplier mapApplier, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = TAG;
        }
        mapApplier.printNodesTree(str);
    }

    private final void walkChildren(String tag, String prefix, MapNode node) {
        MapboxLogger.logD(tag, prefix + " - " + node);
        Iterator<T> it = node.getChildren().iterator();
        while (it.hasNext()) {
            walkChildren(tag, prefix + '\t', (MapNode) it.next());
        }
    }

    public static /* synthetic */ void walkChildren$default(MapApplier mapApplier, String str, String str2, MapNode mapNode, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = TAG;
        }
        if ((i14 & 2) != 0) {
            str2 = SyslogAppender.DEFAULT_STACKTRACE_PATTERN;
        }
        mapApplier.walkChildren(str, str2, mapNode);
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void apply(p pVar, Object obj) {
        super.apply(pVar, obj);
    }

    public final MapView getMapView() {
        return this.mapView;
    }

    @Override // p3.c
    public void insertBottomUp(int index, MapNode instance) {
        instance.getClass();
        MapboxLogger.logD(TAG, "insertBottomUp: " + index + ", " + instance);
        getCurrent().getChildren().add(index, instance);
        instance.onAttached(getCurrent());
        if (instance instanceof LayerPositionAwareNode) {
            notifyMoveNextLayerPositionAwareNode(index + 1);
        }
        printNodesTree("MapNodeInserted");
    }

    @Override // p3.c
    public void move(int from, int to3, int count) {
        StringBuilder sbJ = e5.j(from, to3, "move: ", ", ", ", ");
        sbJ.append(count);
        MapboxLogger.logD(TAG, sbJ.toString());
        move(getCurrent().getChildren(), from, to3, count);
        Iterator<T> it = getCurrent().getChildren().iterator();
        while (it.hasNext()) {
            ((MapNode) it.next()).onMoved(getCurrent());
        }
        printNodesTree("MapNodeMoved");
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void onBeginChanges() {
    }

    @Override // p3.a
    public void onClear() {
        MapboxLogger.logD(TAG, "onClear: current=" + getCurrent());
        Iterator<T> it = getRoot().getChildren().iterator();
        while (it.hasNext()) {
            ((MapNode) it.next()).onClear();
        }
        getRoot().getChildren().clear();
        printNodesTree("MapNodeCleared");
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void onEndChanges() {
    }

    @Override // p3.c
    public void remove(int index, int count) {
        MapboxLogger.logD(TAG, "remove: " + index + ", " + count);
        boolean z14 = false;
        for (int i14 = 0; i14 < count; i14++) {
            MapNode mapNode = getCurrent().getChildren().get(index + i14);
            mapNode.onRemoved(getCurrent());
            z14 |= mapNode instanceof LayerPositionAwareNode;
        }
        remove(getCurrent().getChildren(), index, count);
        if (z14) {
            notifyMoveNextLayerPositionAwareNode(index);
        }
        printNodesTree("MapNodeRemoved");
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void reuse() {
        super.reuse();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/compose/internal/MapApplier$Companion;", "", "()V", "TAG", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // p3.c
    public void insertTopDown(int index, MapNode instance) {
        instance.getClass();
    }
}
