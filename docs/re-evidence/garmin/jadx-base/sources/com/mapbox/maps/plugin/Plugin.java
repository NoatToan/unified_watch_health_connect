package com.mapbox.maps.plugin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/plugin/Plugin;", "", TtmlNode.ATTR_ID, "", "instance", "Lcom/mapbox/maps/plugin/MapPlugin;", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/MapPlugin;)V", "getId", "()Ljava/lang/String;", "getInstance", "()Lcom/mapbox/maps/plugin/MapPlugin;", "equals", "", "other", "hashCode", "", "toString", "Companion", "Custom", "Mapbox", "Lcom/mapbox/maps/plugin/Plugin$Custom;", "Lcom/mapbox/maps/plugin/Plugin$Mapbox;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class Plugin {
    public static final String MAPBOX_ANNOTATION_PLUGIN_ID = "MAPBOX_ANNOTATION_PLUGIN_ID";
    public static final String MAPBOX_ATTRIBUTION_PLUGIN_ID = "MAPBOX_ATTRIBUTION_PLUGIN_ID";
    public static final String MAPBOX_CAMERA_PLUGIN_ID = "MAPBOX_CAMERA_PLUGIN_ID";
    public static final String MAPBOX_COMPASS_PLUGIN_ID = "MAPBOX_COMPASS_PLUGIN_ID";
    public static final String MAPBOX_GESTURES_PLUGIN_ID = "MAPBOX_GESTURES_PLUGIN_ID";
    public static final String MAPBOX_LIFECYCLE_PLUGIN_ID = "MAPBOX_LIFECYCLE_PLUGIN_ID";
    public static final String MAPBOX_LOCATION_COMPONENT_PLUGIN_ID = "MAPBOX_LOCATION_COMPONENT_PLUGIN_ID";
    public static final String MAPBOX_LOGO_PLUGIN_ID = "MAPBOX_LOGO_PLUGIN_ID";
    public static final String MAPBOX_MAP_OVERLAY_PLUGIN_ID = "MAPBOX_MAP_OVERLAY_PLUGIN_ID";
    public static final String MAPBOX_SCALEBAR_PLUGIN_ID = "MAPBOX_SCALEBAR_PLUGIN_ID";
    public static final String MAPBOX_VIEWPORT_PLUGIN_ID = "MAPBOX_VIEWPORT_PLUGIN_ID";
    private final String id;
    private final MapPlugin instance;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/Plugin$Custom;", "Lcom/mapbox/maps/plugin/Plugin;", TtmlNode.ATTR_ID, "", "instance", "Lcom/mapbox/maps/plugin/MapPlugin;", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/MapPlugin;)V", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Custom extends Plugin {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(String str, MapPlugin mapPlugin) {
            super(str, mapPlugin, null);
            str.getClass();
            mapPlugin.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/plugin/Plugin$Mapbox;", "Lcom/mapbox/maps/plugin/Plugin;", TtmlNode.ATTR_ID, "", "(Ljava/lang/String;)V", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Mapbox extends Plugin {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Mapbox(String str) {
            super(str, null, 0 == true ? 1 : 0);
            str.getClass();
        }
    }

    private Plugin(String str, MapPlugin mapPlugin) {
        this.id = str;
        this.instance = mapPlugin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && getClass().equals(other.getClass()) && s.g(((Plugin) other).id, this.id);
    }

    public final String getId() {
        return this.id;
    }

    public final MapPlugin getInstance() {
        return this.instance;
    }

    public int hashCode() {
        return this.id.hashCode() + 31;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("pluginId = ");
        sb3.append(this.id);
        sb3.append(", pluginInstance = ");
        MapPlugin mapPlugin = this.instance;
        sb3.append(mapPlugin != null ? mapPlugin.getClass() : null);
        return sb3.toString();
    }

    public /* synthetic */ Plugin(String str, MapPlugin mapPlugin, j jVar) {
        this(str, mapPlugin);
    }
}
