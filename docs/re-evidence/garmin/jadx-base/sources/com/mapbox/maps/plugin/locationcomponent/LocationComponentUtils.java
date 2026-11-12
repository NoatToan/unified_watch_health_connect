package com.mapbox.maps.plugin.locationcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import b7.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a\b\u0010\t\u001a\u00020\u0001H\u0007\u001a\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000f"}, d2 = {FirebaseAnalytics.Param.LOCATION, "Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPlugin;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "getLocationComponent", "(Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;)Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPlugin;", "createDefault2DPuck", "Lcom/mapbox/maps/plugin/LocationPuck2D;", "withBearing", "", "createLocationComponentPlugin", "getCompatDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "resId", "", "plugin-locationcomponent_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LocationComponentUtils {
    public static final LocationPuck2D createDefault2DPuck(boolean z14) {
        ImageHolder.Companion companion = ImageHolder.INSTANCE;
        return new LocationPuck2D(companion.from(R.drawable.mapbox_user_icon), z14 ? companion.from(R.drawable.mapbox_user_bearing_icon) : companion.from(R.drawable.mapbox_user_stroke_icon), z14 ? companion.from(R.drawable.mapbox_user_stroke_icon) : companion.from(R.drawable.mapbox_user_icon_shadow), null, 0.0f, 24, null);
    }

    public static /* synthetic */ LocationPuck2D createDefault2DPuck$default(boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        return createDefault2DPuck(z14);
    }

    public static final /* synthetic */ LocationComponentPlugin createLocationComponentPlugin() {
        return new LocationComponentPluginImpl();
    }

    private static final Drawable getCompatDrawable(Context context, int i14) {
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        return resources.getDrawable(i14, null);
    }

    public static final LocationComponentPlugin getLocationComponent(MapPluginProviderDelegate mapPluginProviderDelegate) {
        mapPluginProviderDelegate.getClass();
        MapPlugin plugin = mapPluginProviderDelegate.getPlugin(Plugin.MAPBOX_LOCATION_COMPONENT_PLUGIN_ID);
        plugin.getClass();
        return (LocationComponentPlugin) plugin;
    }

    public static final LocationPuck2D createDefault2DPuck() {
        return createDefault2DPuck$default(false, 1, null);
    }
}
