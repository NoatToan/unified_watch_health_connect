package com.mapbox.maps.extension.compose;

import android.content.Context;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapInitOptions;
import com.mapbox.maps.MapInitOptionsKt;
import com.mapbox.maps.MapOptions;
import com.mapbox.maps.plugin.Plugin;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;
import r1.q2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\fHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lcom/mapbox/maps/extension/compose/ComposeMapInitOptions;", "", "pixelRatio", "", "textureView", "", "antialiasingSampleCount", "", "mapName", "", "(FZILjava/lang/String;)V", "mapOptions", "Lcom/mapbox/maps/MapOptions;", "(Lcom/mapbox/maps/MapOptions;ZILjava/lang/String;)V", "getAntialiasingSampleCount", "()I", "getMapName", "()Ljava/lang/String;", "getMapOptions", "()Lcom/mapbox/maps/MapOptions;", "getTextureView", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "getMapInitOptions", "Lcom/mapbox/maps/MapInitOptions;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getMapInitOptions$extension_compose_release", "hashCode", "toString", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ComposeMapInitOptions {
    public static final int DEFAULT_ANTIALIASING_SAMPLE_COUNT = 1;
    private final int antialiasingSampleCount;
    private final String mapName;
    private final MapOptions mapOptions;
    private final boolean textureView;

    /* JADX WARN: Illegal instructions before constructor call */
    public ComposeMapInitOptions(float f14, boolean z14, int i14, String str) {
        str.getClass();
        MapOptions mapOptionsBuild = MapInitOptionsKt.applyDefaultParams(new MapOptions.Builder(), f14).build();
        mapOptionsBuild.getClass();
        this(mapOptionsBuild, z14, i14, str);
    }

    public static /* synthetic */ ComposeMapInitOptions copy$default(ComposeMapInitOptions composeMapInitOptions, MapOptions mapOptions, boolean z14, int i14, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            mapOptions = composeMapInitOptions.mapOptions;
        }
        if ((i15 & 2) != 0) {
            z14 = composeMapInitOptions.textureView;
        }
        if ((i15 & 4) != 0) {
            i14 = composeMapInitOptions.antialiasingSampleCount;
        }
        if ((i15 & 8) != 0) {
            str = composeMapInitOptions.mapName;
        }
        return composeMapInitOptions.copy(mapOptions, z14, i14, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MapOptions getMapOptions() {
        return this.mapOptions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getTextureView() {
        return this.textureView;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAntialiasingSampleCount() {
        return this.antialiasingSampleCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMapName() {
        return this.mapName;
    }

    public final ComposeMapInitOptions copy(MapOptions mapOptions, boolean textureView, int antialiasingSampleCount, String mapName) {
        mapOptions.getClass();
        mapName.getClass();
        return new ComposeMapInitOptions(mapOptions, textureView, antialiasingSampleCount, mapName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeMapInitOptions)) {
            return false;
        }
        ComposeMapInitOptions composeMapInitOptions = (ComposeMapInitOptions) other;
        return s.g(this.mapOptions, composeMapInitOptions.mapOptions) && this.textureView == composeMapInitOptions.textureView && this.antialiasingSampleCount == composeMapInitOptions.antialiasingSampleCount && s.g(this.mapName, composeMapInitOptions.mapName);
    }

    public final int getAntialiasingSampleCount() {
        return this.antialiasingSampleCount;
    }

    public final MapInitOptions getMapInitOptions$extension_compose_release(Context context) {
        context.getClass();
        return new MapInitOptions(context, this.mapOptions, h0.z0(MapInitOptions.INSTANCE.getDefaultPluginList(), u.m0(new Plugin[]{new Plugin.Mapbox(Plugin.MAPBOX_LIFECYCLE_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_LOGO_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_ATTRIBUTION_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_SCALEBAR_PLUGIN_ID), new Plugin.Mapbox(Plugin.MAPBOX_COMPASS_PLUGIN_ID)})), null, this.textureView, null, null, this.antialiasingSampleCount, this.mapName);
    }

    public final String getMapName() {
        return this.mapName;
    }

    public final MapOptions getMapOptions() {
        return this.mapOptions;
    }

    public final boolean getTextureView() {
        return this.textureView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = this.mapOptions.hashCode() * 31;
        boolean z14 = this.textureView;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return this.mapName.hashCode() + q2.d(this.antialiasingSampleCount, (iHashCode + r14) * 31, 31);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("ComposeMapInitOptions(mapOptions=");
        sb3.append(this.mapOptions);
        sb3.append(", textureView=");
        sb3.append(this.textureView);
        sb3.append(", antialiasingSampleCount=");
        sb3.append(this.antialiasingSampleCount);
        sb3.append(", mapName=");
        return a0.m(sb3, this.mapName, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ ComposeMapInitOptions(MapOptions mapOptions, boolean z14, int i14, String str, int i15, j jVar) {
        this(mapOptions, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? 1 : i14, (i15 & 8) != 0 ? "" : str);
    }

    public /* synthetic */ ComposeMapInitOptions(float f14, boolean z14, int i14, String str, int i15, j jVar) {
        this(f14, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? 1 : i14, (i15 & 8) != 0 ? "" : str);
    }

    public ComposeMapInitOptions(MapOptions mapOptions, boolean z14, int i14, String str) {
        mapOptions.getClass();
        str.getClass();
        this.mapOptions = mapOptions;
        this.textureView = z14;
        this.antialiasingSampleCount = i14;
        this.mapName = str;
    }
}
