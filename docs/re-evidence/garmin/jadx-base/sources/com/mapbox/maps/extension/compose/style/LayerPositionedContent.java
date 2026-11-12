package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.LayerPosition;
import e23.p;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B*\b\u0000\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\n\u0010\fJ(\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0011\u0010\u0010J(\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u0002HÀ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R1\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0017¨\u0006%"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/LayerPositionedContent;", "", "", "Lcom/mapbox/maps/LayerPosition;", "Lkotlin/Function0;", "", "Lcom/mapbox/maps/extension/compose/MapboxMapComposable;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "<init>", "(Ljava/util/Map;)V", "layerPosition", FirebaseAnalytics.Param.CONTENT, "(Lcom/mapbox/maps/LayerPosition;Le23/p;)V", "", "layerId", "aboveLayer", "(Ljava/lang/String;Le23/p;)V", "belowLayer", "", FirebaseAnalytics.Param.INDEX, "atIndex", "(ILe23/p;)V", "component1$extension_compose_release", "()Ljava/util/Map;", "component1", "copy", "(Ljava/util/Map;)Lcom/mapbox/maps/extension/compose/style/LayerPositionedContent;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getEntries$extension_compose_release", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class LayerPositionedContent {
    private final Map<LayerPosition, p<m, Integer, Unit>> entries;

    public /* synthetic */ LayerPositionedContent(Map map, int i14, j jVar) {
        this((i14 & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayerPositionedContent copy$default(LayerPositionedContent layerPositionedContent, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            map = layerPositionedContent.entries;
        }
        return layerPositionedContent.copy(map);
    }

    public final void aboveLayer(String layerId, p<? super m, ? super Integer, Unit> content) {
        layerId.getClass();
        content.getClass();
        layerPosition(new LayerPosition(layerId, null, null), content);
    }

    public final void atIndex(int index, p<? super m, ? super Integer, Unit> content) {
        content.getClass();
        layerPosition(new LayerPosition(null, null, Integer.valueOf(index)), content);
    }

    public final void belowLayer(String layerId, p<? super m, ? super Integer, Unit> content) {
        layerId.getClass();
        content.getClass();
        layerPosition(new LayerPosition(null, layerId, null), content);
    }

    public final Map<LayerPosition, p<m, Integer, Unit>> component1$extension_compose_release() {
        return this.entries;
    }

    public final LayerPositionedContent copy(Map<LayerPosition, p<m, Integer, Unit>> entries) {
        entries.getClass();
        return new LayerPositionedContent(entries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayerPositionedContent) && s.g(this.entries, ((LayerPositionedContent) other).entries);
    }

    public final Map<LayerPosition, p<m, Integer, Unit>> getEntries$extension_compose_release() {
        return this.entries;
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    public final void layerPosition(LayerPosition layerPosition, p<? super m, ? super Integer, Unit> content) {
        layerPosition.getClass();
        content.getClass();
        if (this.entries.containsKey(layerPosition)) {
            e.l("LayerPosition [", layerPosition, "] already has content.");
        } else {
            this.entries.put(layerPosition, content);
        }
    }

    public String toString() {
        return "LayerPositionedContent(entries=" + this.entries + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public LayerPositionedContent(Map<LayerPosition, p<m, Integer, Unit>> map) {
        map.getClass();
        this.entries = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayerPositionedContent() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
