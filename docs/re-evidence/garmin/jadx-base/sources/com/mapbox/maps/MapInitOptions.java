package com.mapbox.maps;

import android.content.Context;
import android.util.AttributeSet;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.Plugin;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;
import r1.q2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b1\b\u0086\b\u0018\u0000 B2\u00020\u0001:\u0001BBk\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0002\u0010\u0014J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0012HÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003Jo\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001J\u0013\u0010>\u001a\u00020\f2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0012HÖ\u0001J\t\u0010A\u001a\u00020\u000eHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006C"}, d2 = {"Lcom/mapbox/maps/MapInitOptions;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "mapOptions", "Lcom/mapbox/maps/MapOptions;", "plugins", "", "Lcom/mapbox/maps/plugin/Plugin;", "cameraOptions", "Lcom/mapbox/maps/CameraOptions;", "textureView", "", "styleUri", "", "attrs", "Landroid/util/AttributeSet;", "antialiasingSampleCount", "", "mapName", "(Landroid/content/Context;Lcom/mapbox/maps/MapOptions;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;ZLjava/lang/String;Landroid/util/AttributeSet;ILjava/lang/String;)V", "getAntialiasingSampleCount", "()I", "setAntialiasingSampleCount", "(I)V", "getAttrs", "()Landroid/util/AttributeSet;", "setAttrs", "(Landroid/util/AttributeSet;)V", "getCameraOptions", "()Lcom/mapbox/maps/CameraOptions;", "setCameraOptions", "(Lcom/mapbox/maps/CameraOptions;)V", "getContext", "()Landroid/content/Context;", "getMapName", "()Ljava/lang/String;", "setMapName", "(Ljava/lang/String;)V", "getMapOptions", "()Lcom/mapbox/maps/MapOptions;", "setMapOptions", "(Lcom/mapbox/maps/MapOptions;)V", "getPlugins", "()Ljava/util/List;", "setPlugins", "(Ljava/util/List;)V", "getStyleUri", "getTextureView", "()Z", "setTextureView", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class MapInitOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<Plugin> defaultPluginList = x.k(new Plugin.Mapbox(Plugin.MAPBOX_CAMERA_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_GESTURES_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_COMPASS_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_LOGO_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_ATTRIBUTION_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_LOCATION_COMPONENT_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_SCALEBAR_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_ANNOTATION_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_LIFECYCLE_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_MAP_OVERLAY_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_VIEWPORT_PLUGIN_ID));
    private int antialiasingSampleCount;
    private AttributeSet attrs;
    private CameraOptions cameraOptions;
    private final Context context;
    private String mapName;
    private MapOptions mapOptions;
    private List<? extends Plugin> plugins;
    private final String styleUri;
    private boolean textureView;

    public /* synthetic */ MapInitOptions(Context context, MapOptions mapOptions, List list, CameraOptions cameraOptions, boolean z14, String str, AttributeSet attributeSet, int i14, String str2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? INSTANCE.getDefaultMapOptions(context) : mapOptions, (i15 & 4) != 0 ? defaultPluginList : list, (i15 & 8) != 0 ? null : cameraOptions, (i15 & 16) != 0 ? false : z14, (i15 & 32) != 0 ? Style.STANDARD : str, (i15 & 64) == 0 ? attributeSet : null, (i15 & 128) != 0 ? 1 : i14, (i15 & 256) != 0 ? "" : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MapInitOptions copy$default(MapInitOptions mapInitOptions, Context context, MapOptions mapOptions, List list, CameraOptions cameraOptions, boolean z14, String str, AttributeSet attributeSet, int i14, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            context = mapInitOptions.context;
        }
        if ((i15 & 2) != 0) {
            mapOptions = mapInitOptions.mapOptions;
        }
        if ((i15 & 4) != 0) {
            list = mapInitOptions.plugins;
        }
        if ((i15 & 8) != 0) {
            cameraOptions = mapInitOptions.cameraOptions;
        }
        if ((i15 & 16) != 0) {
            z14 = mapInitOptions.textureView;
        }
        if ((i15 & 32) != 0) {
            str = mapInitOptions.styleUri;
        }
        if ((i15 & 64) != 0) {
            attributeSet = mapInitOptions.attrs;
        }
        if ((i15 & 128) != 0) {
            i14 = mapInitOptions.antialiasingSampleCount;
        }
        if ((i15 & 256) != 0) {
            str2 = mapInitOptions.mapName;
        }
        int i16 = i14;
        String str3 = str2;
        String str4 = str;
        AttributeSet attributeSet2 = attributeSet;
        boolean z15 = z14;
        List list2 = list;
        return mapInitOptions.copy(context, mapOptions, list2, cameraOptions, z15, str4, attributeSet2, i16, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MapOptions getMapOptions() {
        return this.mapOptions;
    }

    public final List<Plugin> component3() {
        return this.plugins;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CameraOptions getCameraOptions() {
        return this.cameraOptions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getTextureView() {
        return this.textureView;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyleUri() {
        return this.styleUri;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getAntialiasingSampleCount() {
        return this.antialiasingSampleCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMapName() {
        return this.mapName;
    }

    public final MapInitOptions copy(Context context, MapOptions mapOptions, List<? extends Plugin> plugins, CameraOptions cameraOptions, boolean textureView, String styleUri, AttributeSet attrs, int antialiasingSampleCount, String mapName) {
        context.getClass();
        mapOptions.getClass();
        plugins.getClass();
        mapName.getClass();
        return new MapInitOptions(context, mapOptions, plugins, cameraOptions, textureView, styleUri, attrs, antialiasingSampleCount, mapName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapInitOptions)) {
            return false;
        }
        MapInitOptions mapInitOptions = (MapInitOptions) other;
        return s.g(this.context, mapInitOptions.context) && s.g(this.mapOptions, mapInitOptions.mapOptions) && s.g(this.plugins, mapInitOptions.plugins) && s.g(this.cameraOptions, mapInitOptions.cameraOptions) && this.textureView == mapInitOptions.textureView && s.g(this.styleUri, mapInitOptions.styleUri) && s.g(this.attrs, mapInitOptions.attrs) && this.antialiasingSampleCount == mapInitOptions.antialiasingSampleCount && s.g(this.mapName, mapInitOptions.mapName);
    }

    public final int getAntialiasingSampleCount() {
        return this.antialiasingSampleCount;
    }

    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final CameraOptions getCameraOptions() {
        return this.cameraOptions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getMapName() {
        return this.mapName;
    }

    public final MapOptions getMapOptions() {
        return this.mapOptions;
    }

    public final List<Plugin> getPlugins() {
        return this.plugins;
    }

    public final String getStyleUri() {
        return this.styleUri;
    }

    public final boolean getTextureView() {
        return this.textureView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public int hashCode() {
        int iB = u0.b((this.mapOptions.hashCode() + (this.context.hashCode() * 31)) * 31, 31, this.plugins);
        CameraOptions cameraOptions = this.cameraOptions;
        int iHashCode = (iB + (cameraOptions == null ? 0 : cameraOptions.hashCode())) * 31;
        boolean z14 = this.textureView;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iHashCode + r14) * 31;
        String str = this.styleUri;
        int iHashCode2 = (i14 + (str == null ? 0 : str.hashCode())) * 31;
        AttributeSet attributeSet = this.attrs;
        return this.mapName.hashCode() + q2.d(this.antialiasingSampleCount, (iHashCode2 + (attributeSet != null ? attributeSet.hashCode() : 0)) * 31, 31);
    }

    public final void setAntialiasingSampleCount(int i14) {
        this.antialiasingSampleCount = i14;
    }

    public final void setAttrs(AttributeSet attributeSet) {
        this.attrs = attributeSet;
    }

    public final void setCameraOptions(CameraOptions cameraOptions) {
        this.cameraOptions = cameraOptions;
    }

    public final void setMapName(String str) {
        str.getClass();
        this.mapName = str;
    }

    public final void setMapOptions(MapOptions mapOptions) {
        mapOptions.getClass();
        this.mapOptions = mapOptions;
    }

    public final void setPlugins(List<? extends Plugin> list) {
        list.getClass();
        this.plugins = list;
    }

    public final void setTextureView(boolean z14) {
        this.textureView = z14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("MapInitOptions(context=");
        sb3.append(this.context);
        sb3.append(", mapOptions=");
        sb3.append(this.mapOptions);
        sb3.append(", plugins=");
        sb3.append(this.plugins);
        sb3.append(", cameraOptions=");
        sb3.append(this.cameraOptions);
        sb3.append(", textureView=");
        sb3.append(this.textureView);
        sb3.append(", styleUri=");
        sb3.append(this.styleUri);
        sb3.append(", attrs=");
        sb3.append(this.attrs);
        sb3.append(", antialiasingSampleCount=");
        sb3.append(this.antialiasingSampleCount);
        sb3.append(", mapName=");
        return a0.m(sb3, this.mapName, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/MapInitOptions$Companion;", "", "()V", "defaultPluginList", "", "Lcom/mapbox/maps/plugin/Plugin;", "getDefaultPluginList", "()Ljava/util/List;", "getDefaultMapOptions", "Lcom/mapbox/maps/MapOptions;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final MapOptions getDefaultMapOptions(Context context) {
            context.getClass();
            MapOptions mapOptionsBuild = MapInitOptionsKt.applyDefaultParams(new MapOptions.Builder(), context).build();
            mapOptionsBuild.getClass();
            return mapOptionsBuild;
        }

        public final List<Plugin> getDefaultPluginList() {
            return MapInitOptions.defaultPluginList;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions) {
        this(context, mapOptions, null, null, false, null, null, 0, null, 508, null);
        context.getClass();
        mapOptions.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list) {
        this(context, mapOptions, list, null, false, null, null, 0, null, 504, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions) {
        this(context, mapOptions, list, cameraOptions, false, null, null, 0, null, 496, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z14) {
        this(context, mapOptions, list, cameraOptions, z14, null, null, 0, null, 480, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z14, String str) {
        this(context, mapOptions, list, cameraOptions, z14, str, null, 0, null, 448, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z14, String str, AttributeSet attributeSet) {
        this(context, mapOptions, list, cameraOptions, z14, str, attributeSet, 0, null, 384, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z14, String str, AttributeSet attributeSet, int i14) {
        this(context, mapOptions, list, cameraOptions, z14, str, attributeSet, i14, null, 256, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z14, String str, AttributeSet attributeSet, int i14, String str2) {
        context.getClass();
        mapOptions.getClass();
        list.getClass();
        str2.getClass();
        this.context = context;
        this.mapOptions = mapOptions;
        this.plugins = list;
        this.cameraOptions = cameraOptions;
        this.textureView = z14;
        this.styleUri = str;
        this.attrs = attributeSet;
        this.antialiasingSampleCount = i14;
        this.mapName = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context) {
        this(context, null, null, null, false, null, null, 0, null, 510, null);
        context.getClass();
    }
}
