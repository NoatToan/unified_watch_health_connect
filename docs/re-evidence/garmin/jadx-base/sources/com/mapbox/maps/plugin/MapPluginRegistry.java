package com.mapbox.maps.plugin;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapInitOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxConfigurationException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePlugin;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 J2\u00020\u0001:\u0002JKB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R$\u00102\u001a\u0002002\u0006\u00101\u001a\u0002008\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010@R\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/mapbox/maps/plugin/MapPluginRegistry;", "", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "mapDelegateProvider", "<init>", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "Lcom/mapbox/maps/MapView;", "mapView", "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "Lcom/mapbox/maps/plugin/Plugin;", "plugin", "", "createPlugin", "(Lcom/mapbox/maps/MapView;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/plugin/Plugin;)V", "T", "", TtmlNode.ATTR_ID, "getPlugin", "(Ljava/lang/String;)Ljava/lang/Object;", "removePlugin", "(Ljava/lang/String;)V", "onStart", "()V", "onStop", "onDestroy", "Landroid/view/MotionEvent;", "event", "", "onTouch", "(Landroid/view/MotionEvent;)Z", "onGenericMotionEvent", "", "width", "height", "onSizeChanged", "(II)V", "Lcom/mapbox/maps/CameraState;", "cameraState", "onCameraMove", "(Lcom/mapbox/maps/CameraState;)V", "Lcom/mapbox/maps/Style;", TtmlNode.TAG_STYLE, "onStyleChanged", "(Lcom/mapbox/maps/Style;)V", "onAttachedToWindow", "(Lcom/mapbox/maps/MapView;)V", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "Lcom/mapbox/maps/plugin/MapPluginRegistry$State;", "value", "mapState", "Lcom/mapbox/maps/plugin/MapPluginRegistry$State;", "setMapState", "(Lcom/mapbox/maps/plugin/MapPluginRegistry$State;)V", "Lo13/p;", "mapSize", "Lo13/p;", "", "Lcom/mapbox/maps/plugin/MapPlugin;", "plugins", "Ljava/util/Map;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/maps/plugin/MapCameraPlugin;", "cameraPlugins", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "gesturePlugins", "Lcom/mapbox/maps/plugin/MapStyleObserverPlugin;", "styleObserverPlugins", "Lcom/mapbox/maps/plugin/MapSizePlugin;", "mapSizePlugins", "Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePlugin;", "mapboxLifecyclePlugin", "Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePlugin;", "Companion", "State", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapPluginRegistry {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "MapPluginRegistry";
    private final CopyOnWriteArraySet<MapCameraPlugin> cameraPlugins;
    private final CopyOnWriteArraySet<GesturesPlugin> gesturePlugins;
    private final MapDelegateProvider mapDelegateProvider;
    private p<Integer, Integer> mapSize;
    private final CopyOnWriteArraySet<MapSizePlugin> mapSizePlugins;
    private State mapState;
    private MapboxLifecyclePlugin mapboxLifecyclePlugin;
    private final Map<String, MapPlugin> plugins;
    private final CopyOnWriteArraySet<MapStyleObserverPlugin> styleObserverPlugins;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/plugin/MapPluginRegistry$State;", "", "(Ljava/lang/String;I)V", "STARTED", "STOPPED", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        STARTED,
        STOPPED
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MapPluginRegistry(MapDelegateProvider mapDelegateProvider) {
        mapDelegateProvider.getClass();
        this.mapDelegateProvider = mapDelegateProvider;
        this.mapState = State.STOPPED;
        this.plugins = new LinkedHashMap();
        this.cameraPlugins = new CopyOnWriteArraySet<>();
        this.gesturePlugins = new CopyOnWriteArraySet<>();
        this.styleObserverPlugins = new CopyOnWriteArraySet<>();
        this.mapSizePlugins = new CopyOnWriteArraySet<>();
    }

    private final void setMapState(State state) {
        if (state != this.mapState) {
            this.mapState = state;
            int i14 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i14 == 1) {
                for (MapPlugin mapPlugin : this.plugins.values()) {
                    if (mapPlugin instanceof LifecyclePlugin) {
                        ((LifecyclePlugin) mapPlugin).onStart();
                    }
                }
                return;
            }
            if (i14 != 2) {
                return;
            }
            for (MapPlugin mapPlugin2 : this.plugins.values()) {
                if (mapPlugin2 instanceof LifecyclePlugin) {
                    ((LifecyclePlugin) mapPlugin2).onStop();
                }
            }
        }
    }

    public final void createPlugin(MapView mapView, MapInitOptions mapInitOptions, Plugin plugin) {
        mapInitOptions.getClass();
        plugin.getClass();
        MapPlugin plugin2 = plugin.getInstance();
        if (plugin2 == null) {
            throw new MapboxConfigurationException("MapPlugin instance is missing for " + plugin.getId() + '!');
        }
        if (this.plugins.containsKey(plugin.getId())) {
            MapPlugin mapPlugin = this.plugins.get(plugin.getId());
            if (mapPlugin != null) {
                mapPlugin.initialize();
                return;
            }
            return;
        }
        if ((plugin.getInstance() instanceof ViewPlugin) && mapView == null) {
            throw new InvalidViewPluginHostException("Cause: " + plugin2.getClass());
        }
        this.plugins.put(plugin.getId(), plugin2);
        plugin2.onDelegateProvider(this.mapDelegateProvider);
        if (plugin2 instanceof ViewPlugin) {
            ViewPlugin viewPlugin = (ViewPlugin) plugin2;
            mapView.getClass();
            View viewBind = viewPlugin.bind(mapView, mapInitOptions.getAttrs(), mapInitOptions.getMapOptions().getPixelRatio());
            mapView.addView(viewBind);
            viewPlugin.onPluginView(viewBind);
        }
        if (plugin2 instanceof ContextBinder) {
            ((ContextBinder) plugin2).bind(mapInitOptions.getContext(), mapInitOptions.getAttrs(), mapInitOptions.getMapOptions().getPixelRatio());
        }
        if (plugin2 instanceof MapSizePlugin) {
            this.mapSizePlugins.add(plugin2);
            p<Integer, Integer> pVar = this.mapSize;
            if (pVar != null) {
                ((MapSizePlugin) plugin2).onSizeChanged(pVar.f128594a.intValue(), pVar.f128595b.intValue());
            }
        }
        if (plugin2 instanceof MapCameraPlugin) {
            this.cameraPlugins.add((MapCameraPlugin) plugin2);
        }
        if (plugin2 instanceof GesturesPlugin) {
            this.gesturePlugins.add((GesturesPlugin) plugin2);
        }
        if (plugin2 instanceof MapStyleObserverPlugin) {
            this.styleObserverPlugins.add(plugin2);
        }
        if (plugin2 instanceof MapboxLifecyclePlugin) {
            this.mapboxLifecyclePlugin = (MapboxLifecyclePlugin) plugin2;
        }
        plugin2.initialize();
        if (this.mapState == State.STARTED && (plugin2 instanceof LifecyclePlugin)) {
            ((LifecyclePlugin) plugin2).onStart();
        }
    }

    public final <T> T getPlugin(String id3) {
        id3.getClass();
        return (T) this.plugins.get(id3);
    }

    public final void onAttachedToWindow(MapView mapView) {
        mapView.getClass();
        MapboxLifecyclePlugin mapboxLifecyclePlugin = this.mapboxLifecyclePlugin;
        if (mapboxLifecyclePlugin != null) {
            mapboxLifecyclePlugin.registerLifecycleObserver(mapView, mapView);
        }
    }

    public final void onCameraMove(CameraState cameraState) {
        cameraState.getClass();
        for (MapCameraPlugin mapCameraPlugin : this.cameraPlugins) {
            Point center = cameraState.getCenter();
            center.getClass();
            double zoom = cameraState.getZoom();
            double pitch = cameraState.getPitch();
            double bearing = cameraState.getBearing();
            EdgeInsets padding = cameraState.getPadding();
            padding.getClass();
            mapCameraPlugin.onCameraMove(center, zoom, pitch, bearing, padding);
        }
    }

    public final void onDestroy() {
        Iterator<Map.Entry<String, MapPlugin>> it = this.plugins.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cleanup();
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent event) {
        event.getClass();
        Iterator<T> it = this.gesturePlugins.iterator();
        while (true) {
            boolean z14 = false;
            while (it.hasNext()) {
                if (((GesturesPlugin) it.next()).onGenericMotionEvent(event) || z14) {
                    z14 = true;
                }
            }
            return z14;
        }
    }

    public final void onSizeChanged(int width, int height) {
        this.mapSize = new p<>(Integer.valueOf(width), Integer.valueOf(height));
        Iterator<MapSizePlugin> it = this.mapSizePlugins.iterator();
        while (it.hasNext()) {
            it.next().onSizeChanged(width, height);
        }
    }

    public final void onStart() {
        setMapState(State.STARTED);
    }

    public final void onStop() {
        setMapState(State.STOPPED);
    }

    public final void onStyleChanged(Style style) {
        style.getClass();
        Iterator<T> it = this.styleObserverPlugins.iterator();
        while (it.hasNext()) {
            ((MapStyleObserverPlugin) it.next()).onStyleChanged(style);
        }
    }

    public final boolean onTouch(MotionEvent event) {
        Iterator<T> it = this.gesturePlugins.iterator();
        while (true) {
            boolean z14 = false;
            while (it.hasNext()) {
                if (((GesturesPlugin) it.next()).onTouchEvent(event) || z14) {
                    z14 = true;
                }
            }
            return z14;
        }
    }

    public final void removePlugin(String id3) {
        id3.getClass();
        MapPlugin mapPlugin = this.plugins.get(id3);
        if (mapPlugin instanceof MapCameraPlugin) {
            this.cameraPlugins.remove(mapPlugin);
        } else if (mapPlugin instanceof GesturesPlugin) {
            this.gesturePlugins.remove(mapPlugin);
        } else if (mapPlugin instanceof MapStyleObserverPlugin) {
            this.styleObserverPlugins.remove(mapPlugin);
        } else if (mapPlugin instanceof MapSizePlugin) {
            this.mapSizePlugins.remove(mapPlugin);
        } else if (mapPlugin instanceof MapboxLifecyclePlugin) {
            this.mapboxLifecyclePlugin = null;
        }
        if (mapPlugin != null) {
            mapPlugin.cleanup();
        }
        this.plugins.remove(id3);
        MapboxLogger.logI(TAG, "Removed plugin: " + id3 + " from the Map.");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/plugin/MapPluginRegistry$Companion;", "", "()V", "TAG", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
