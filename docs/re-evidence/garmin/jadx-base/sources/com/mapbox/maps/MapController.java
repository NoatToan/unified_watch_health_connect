package com.mapbox.maps;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxOptions;
import com.mapbox.maps.assets.AssetManagerProvider;
import com.mapbox.maps.plugin.InvalidViewPluginHostException;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapPluginRegistry;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.annotation.AnnotationsUtils;
import com.mapbox.maps.plugin.attribution.AttributionUtils;
import com.mapbox.maps.plugin.compass.CompassUtils;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.gestures.GesturesUtils;
import com.mapbox.maps.plugin.lifecycle.LifecycleUtils;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentUtils;
import com.mapbox.maps.plugin.logo.LogoUtils;
import com.mapbox.maps.plugin.overlay.MapOverlayUtils;
import com.mapbox.maps.plugin.scalebar.ScaleBarUtils;
import com.mapbox.maps.plugin.viewport.ViewportUtils;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;
import d53.w;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0002efB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007BI\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0016J\u0018\u00102\u001a\u00020,2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u000206J\r\u0010$\u001a\u00020\u000fH\u0007¢\u0006\u0002\b7J\u0006\u00108\u001a\u00020\rJ!\u00109\u001a\u0004\u0018\u0001H:\"\b\b\u0000\u0010:*\u00020;2\u0006\u0010<\u001a\u00020=H\u0016¢\u0006\u0002\u0010>J\u001a\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u000104J\u0015\u0010A\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0000¢\u0006\u0002\bBJ\b\u0010C\u001a\u00020,H\u0016J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020,H\u0016J\b\u0010I\u001a\u00020,H\u0016J\u0018\u0010J\u001a\u00020,2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020LH\u0016J\b\u0010N\u001a\u00020,H\u0016J\b\u0010O\u001a\u00020,H\u0016J\u0010\u0010P\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016J\u0018\u0010Q\u001a\u00020,2\u0006\u0010F\u001a\u00020R2\u0006\u0010S\u001a\u00020EH\u0016J\u000e\u0010T\u001a\u00020,2\u0006\u0010<\u001a\u00020=J\u0010\u0010U\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010V\u001a\u00020E2\u0006\u00100\u001a\u000201H\u0016J\u0010\u0010W\u001a\u00020,2\u0006\u0010X\u001a\u00020LH\u0016J\u0010\u0010Y\u001a\u00020,2\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010\\\u001a\u00020,2\u0006\u0010]\u001a\u00020^H\u0016J\u0015\u0010_\u001a\u00020,2\u0006\u0010`\u001a\u00020LH\u0000¢\u0006\u0002\baJ\n\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0010\u0010b\u001a\u00020,2\u0006\u0010Z\u001a\u00020dH\u0016R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006g"}, d2 = {"Lcom/mapbox/maps/MapController;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "Lcom/mapbox/maps/MapControllable;", "renderer", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "mapInitOptions", "Lcom/mapbox/maps/MapInitOptions;", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/MapInitOptions;)V", "nativeObserver", "Lcom/mapbox/maps/NativeObserver;", "contextMode", "Lcom/mapbox/maps/ContextMode;", "nativeMap", "Lcom/mapbox/maps/NativeMapImpl;", "mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "pluginRegistry", "Lcom/mapbox/maps/plugin/MapPluginRegistry;", "onStyleLoadingFinishedListener", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/ContextMode;Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/plugin/MapPluginRegistry;Lcom/mapbox/maps/StyleDataLoadedCallback;)V", "_mapboxMap", "cameraChangedCoalescedCallback", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "getCameraChangedCoalescedCallback$annotations", "()V", "cancelableSubscriberSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/common/Cancelable;", "lifecycleState", "Lcom/mapbox/maps/MapController$LifecycleState;", "getLifecycleState$maps_sdk_release$annotations", "getLifecycleState$maps_sdk_release", "()Lcom/mapbox/maps/MapController$LifecycleState;", "setLifecycleState$maps_sdk_release", "(Lcom/mapbox/maps/MapController$LifecycleState;)V", "getMapboxMap", "()Lcom/mapbox/maps/MapboxMap;", "getRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxRenderer;", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/Style;", "styleDataLoadedCallback", "addRendererSetupErrorListener", "", "rendererSetupErrorListener", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "addWidget", "widget", "Lcom/mapbox/maps/renderer/widget/Widget;", "createPlugin", "mapView", "Lcom/mapbox/maps/MapView;", "plugin", "Lcom/mapbox/maps/plugin/Plugin;", "getMapboxMapDeprecated", "getNativeMap", "getPlugin", "T", "Lcom/mapbox/maps/plugin/MapPlugin;", TtmlNode.ATTR_ID, "", "(Ljava/lang/String;)Lcom/mapbox/maps/plugin/MapPlugin;", "initializePlugins", "options", "onAttachedToWindow", "onAttachedToWindow$maps_sdk_release", "onDestroy", "onGenericMotionEvent", "", "event", "Landroid/view/MotionEvent;", "onLowMemory", "onResume", "onSizeChanged", "w", "", "h", "onStart", "onStop", "onTouchEvent", "queueEvent", "Ljava/lang/Runnable;", "needRender", "removePlugin", "removeRendererSetupErrorListener", "removeWidget", "setMaximumFps", "fps", "setOnFpsChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setRenderThreadStatsRecorder", "renderThreadStatsRecorder", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "setScreenRefreshRate", "refreshRate", "setScreenRefreshRate$maps_sdk_release", "snapshot", "Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "Companion", "LifecycleState", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapController implements MapPluginProviderDelegate, MapControllable {
    private static final String PLUGIN_MISSING_TEMPLATE = "Add %s plugin dependency to the classpath take automatically load the plugin implementation.";
    public static final String TAG = "MapController";
    private static final String VIEW_HIERARCHY_MISSING_TEMPLATE = "%s plugin requires a View hierarchy to be injected, plugin is ignored.";
    private final MapboxMap _mapboxMap;
    private final CameraChangedCoalescedCallback cameraChangedCoalescedCallback;
    private final CopyOnWriteArraySet<Cancelable> cancelableSubscriberSet;
    private ContextMode contextMode;
    private LifecycleState lifecycleState;
    private final MapInitOptions mapInitOptions;
    private final NativeMapImpl nativeMap;
    private final NativeObserver nativeObserver;
    private final MapPluginRegistry pluginRegistry;
    private final MapboxRenderer renderer;
    private Style style;
    private final StyleDataLoadedCallback styleDataLoadedCallback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/MapController$LifecycleState;", "", "(Ljava/lang/String;I)V", "STATE_STOPPED", "STATE_STARTED", "STATE_DESTROYED", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum LifecycleState {
        STATE_STOPPED,
        STATE_STARTED,
        STATE_DESTROYED
    }

    public MapController(MapboxRenderer mapboxRenderer, MapInitOptions mapInitOptions) {
        mapboxRenderer.getClass();
        mapInitOptions.getClass();
        this.cancelableSubscriberSet = new CopyOnWriteArraySet<>();
        this.lifecycleState = LifecycleState.STATE_STOPPED;
        if (w.J(MapboxOptions.getAccessToken())) {
            throw new MapboxConfigurationException();
        }
        this.renderer = mapboxRenderer;
        this.mapInitOptions = mapInitOptions;
        this.contextMode = mapInitOptions.getMapOptions().getContextMode();
        MapboxLogger.logI(TAG, "Registering asset file source factory");
        new AssetManagerProvider().initialize(mapInitOptions.getContext().getAssets());
        MapProvider mapProvider = MapProvider.INSTANCE;
        NativeMapImpl nativeMapWrapper = mapProvider.getNativeMapWrapper(mapInitOptions, mapboxRenderer);
        this.nativeMap = nativeMapWrapper;
        NativeObserver nativeObserver = new NativeObserver(nativeMapWrapper);
        this.nativeObserver = nativeObserver;
        this._mapboxMap = mapProvider.getMapboxMap(nativeMapWrapper, nativeObserver, mapInitOptions.getMapOptions().getPixelRatio());
        getMapboxMapDeprecated().setRenderHandler$maps_sdk_release(mapboxRenderer.getRenderThread$maps_sdk_release().getRenderHandlerThread().getHandler());
        this.pluginRegistry = mapProvider.getMapPluginRegistry(getMapboxMapDeprecated(), this, mapProvider.getMapTelemetryInstance(mapInitOptions.getContext()), mapProvider.getMapGeofencingConsent());
        this.cameraChangedCoalescedCallback = new b(this);
        this.styleDataLoadedCallback = new b(this);
        mapboxRenderer.setMap(nativeMapWrapper);
        CameraOptions cameraOptions = mapInitOptions.getCameraOptions();
        if (cameraOptions != null) {
            getMapboxMapDeprecated().setCamera(cameraOptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MapController mapController, CameraChangedCoalesced cameraChangedCoalesced) {
        mapController.getClass();
        cameraChangedCoalesced.getClass();
        MapPluginRegistry mapPluginRegistry = mapController.pluginRegistry;
        CameraState cameraState = cameraChangedCoalesced.getCameraState();
        cameraState.getClass();
        mapPluginRegistry.onCameraMove(cameraState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MapController mapController, StyleDataLoaded styleDataLoaded) {
        mapController.getClass();
        styleDataLoaded.getClass();
        if (styleDataLoaded.getType() == StyleDataLoadedType.STYLE) {
            mapController.getMapboxMapDeprecated().getStyle(new a(mapController, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2$lambda$1(MapController mapController, Style style) {
        mapController.getClass();
        style.getClass();
        mapController.style = style;
        mapController.pluginRegistry.onStyleChanged(style);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(MapPluginRegistry mapPluginRegistry, CameraChangedCoalesced cameraChangedCoalesced) {
        mapPluginRegistry.getClass();
        cameraChangedCoalesced.getClass();
        CameraState cameraState = cameraChangedCoalesced.getCameraState();
        cameraState.getClass();
        mapPluginRegistry.onCameraMove(cameraState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addRendererSetupErrorListener$lambda$10(MapController mapController, RendererSetupErrorListener rendererSetupErrorListener) {
        mapController.getClass();
        rendererSetupErrorListener.getClass();
        mapController.renderer.getRenderThread$maps_sdk_release().getEglCore().addRendererStateListener$maps_sdk_release(rendererSetupErrorListener);
    }

    private static /* synthetic */ void getCameraChangedCoalescedCallback$annotations() {
    }

    public static /* synthetic */ void getLifecycleState$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void initializePlugins$default(MapController mapController, MapInitOptions mapInitOptions, MapView mapView, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            mapView = null;
        }
        mapController.initializePlugins(mapInitOptions, mapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSizeChanged$lambda$9(MapController mapController, int i14, int i15) {
        mapController.getClass();
        mapController.renderer.onSurfaceChanged(i14, i15);
        mapController.nativeMap.setSizeSet$maps_sdk_release(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRendererSetupErrorListener$lambda$11(MapController mapController, RendererSetupErrorListener rendererSetupErrorListener) {
        mapController.getClass();
        rendererSetupErrorListener.getClass();
        mapController.renderer.getRenderThread$maps_sdk_release().getEglCore().removeRendererStateListener$maps_sdk_release(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread().post(new c(this, rendererSetupErrorListener, 0));
    }

    @Override // com.mapbox.maps.MapControllable
    public void addWidget(Widget widget) {
        widget.getClass();
        if (this.contextMode != ContextMode.SHARED) {
            kg.f.n("Map view or map surface must be init with MapInitOptions.mapOptions.contextMode = ContextMode.SHARED when using widgets!");
            return;
        }
        widget.setTriggerRepaintAction$maps_sdk_release(new AnonymousClass1());
        this.renderer.getRenderThread$maps_sdk_release().addWidget(widget);
        this.renderer.scheduleRepaint();
    }

    public final void createPlugin(MapView mapView, Plugin plugin) {
        plugin.getClass();
        this.pluginRegistry.createPlugin(mapView, this.mapInitOptions, plugin);
    }

    /* JADX INFO: renamed from: getLifecycleState$maps_sdk_release, reason: from getter */
    public final LifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    @Override // com.mapbox.maps.MapControllable
    /* JADX INFO: renamed from: getMapboxMap, reason: from getter and merged with bridge method [inline-methods] */
    public MapboxMap getMapboxMapDeprecated() {
        return this._mapboxMap;
    }

    public final NativeMapImpl getNativeMap() {
        return this.nativeMap;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate
    public <T extends MapPlugin> T getPlugin(String id3) {
        id3.getClass();
        return (T) this.pluginRegistry.getPlugin(id3);
    }

    /* JADX INFO: renamed from: getRenderer$maps_sdk_release, reason: from getter */
    public final MapboxRenderer getRenderer() {
        return this.renderer;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x000d A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void initializePlugins(MapInitOptions options, MapView mapView) {
        MapPlugin mapPluginCreateLifecyclePlugin;
        options.getClass();
        for (Plugin plugin : options.getPlugins()) {
            try {
                String id3 = plugin.getId();
                switch (id3.hashCode()) {
                    case -2043316830:
                        if (id3.equals(Plugin.MAPBOX_LIFECYCLE_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = LifecycleUtils.createLifecyclePlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case -1778826934:
                        if (id3.equals(Plugin.MAPBOX_COMPASS_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = CompassUtils.createCompassPlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case -1553017881:
                        if (id3.equals(Plugin.MAPBOX_ANNOTATION_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = AnnotationsUtils.createAnnotationPlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case -245209278:
                        if (id3.equals(Plugin.MAPBOX_GESTURES_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = GesturesUtils.createGesturePlugin(options.getContext(), options.getAttrs(), options.getMapOptions().getPixelRatio());
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case -229667997:
                        if (id3.equals(Plugin.MAPBOX_LOGO_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = LogoUtils.createLogoPlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case 571477697:
                        if (id3.equals(Plugin.MAPBOX_SCALEBAR_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = ScaleBarUtils.createScaleBarPlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case 876236958:
                        if (id3.equals(Plugin.MAPBOX_VIEWPORT_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = ViewportUtils.createViewportPlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case 962011255:
                        if (id3.equals(Plugin.MAPBOX_ATTRIBUTION_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = AttributionUtils.createAttributionPlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case 1272100549:
                        if (id3.equals(Plugin.MAPBOX_MAP_OVERLAY_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = MapOverlayUtils.createOverlayPlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case 1380638813:
                        if (id3.equals(Plugin.MAPBOX_CAMERA_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = CameraAnimationsUtils.createCameraAnimationPlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    case 1896827019:
                        if (id3.equals(Plugin.MAPBOX_LOCATION_COMPONENT_PLUGIN_ID)) {
                            mapPluginCreateLifecyclePlugin = LocationComponentUtils.createLocationComponentPlugin();
                        } else {
                            mapPluginCreateLifecyclePlugin = plugin.getInstance();
                            if (mapPluginCreateLifecyclePlugin != null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                    default:
                        mapPluginCreateLifecyclePlugin = plugin.getInstance();
                        if (mapPluginCreateLifecyclePlugin != null) {
                            throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                        }
                        createPlugin(mapView, new Plugin.Custom(plugin.getId(), mapPluginCreateLifecyclePlugin));
                        if (!(plugin instanceof Plugin.Mapbox)) {
                            if (mapPluginCreateLifecyclePlugin instanceof CameraAnimationsPlugin) {
                                getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapPluginCreateLifecyclePlugin);
                            } else if (mapPluginCreateLifecyclePlugin instanceof GesturesPlugin) {
                                getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapPluginCreateLifecyclePlugin);
                            }
                        }
                        break;
                }
            } catch (InvalidViewPluginHostException unused) {
                MapboxLogger.logI(TAG, String.format(VIEW_HIERARCHY_MISSING_TEMPLATE, Arrays.copyOf(new Object[]{plugin}, 1)));
            } catch (NoClassDefFoundError unused2) {
                MapboxLogger.logI(TAG, String.format(PLUGIN_MISSING_TEMPLATE, Arrays.copyOf(new Object[]{plugin.getId()}, 1)));
            }
        }
    }

    public final void onAttachedToWindow$maps_sdk_release(MapView mapView) {
        mapView.getClass();
        this.pluginRegistry.onAttachedToWindow(mapView);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_DESTROYED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        this.pluginRegistry.onDestroy();
        this.nativeObserver.onDestroy();
        this.renderer.onDestroy();
        getMapboxMapDeprecated().onDestroy$maps_sdk_release();
        this.style = null;
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent event) {
        event.getClass();
        return this.pluginRegistry.onGenericMotionEvent(event);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        getMapboxMapDeprecated().reduceMemoryUse();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onResume() {
        this.renderer.onResume();
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int w14, int h14) {
        this.nativeMap.setSizeSet$maps_sdk_release(false);
        this.renderer.queueRenderEvent(new d(this, w14, h14, 0));
        this.pluginRegistry.onSizeChanged(w14, h14);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        String styleUri;
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_STARTED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        Style styleDeprecated = getMapboxMapDeprecated().getStyleDeprecated();
        if (styleDeprecated != null && !styleDeprecated.equals(this.style)) {
            this.style = styleDeprecated;
            this.pluginRegistry.onStyleChanged(styleDeprecated);
        }
        NativeObserver nativeObserver = this.nativeObserver;
        this.cancelableSubscriberSet.add(NativeObserver.subscribeCameraChangedCoalesced$default(nativeObserver, this.cameraChangedCoalescedCallback, null, 2, null));
        this.cancelableSubscriberSet.add(NativeObserver.subscribeStyleDataLoaded$default(nativeObserver, this.styleDataLoadedCallback, null, null, 6, null));
        this.renderer.onStart();
        if (!getMapboxMapDeprecated().getIsStyleLoadInitiated() && (styleUri = this.mapInitOptions.getStyleUri()) != null) {
            MapboxMap.loadStyle$default(getMapboxMapDeprecated(), styleUri, (Style.OnStyleLoaded) null, 2, (Object) null);
        }
        this.pluginRegistry.onStart();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_STOPPED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        Iterator<T> it = this.cancelableSubscriberSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableSubscriberSet.clear();
        this.renderer.onStop();
        this.pluginRegistry.onStop();
        MapProvider.INSTANCE.flushPendingEvents();
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onTouchEvent(MotionEvent event) {
        event.getClass();
        return this.pluginRegistry.onTouch(event);
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable event, boolean needRender) {
        event.getClass();
        MapboxRenderer mapboxRenderer = this.renderer;
        if (needRender) {
            mapboxRenderer.queueRenderEvent(event);
        } else {
            mapboxRenderer.queueNonRenderEvent(event);
        }
    }

    public final void removePlugin(String id3) {
        id3.getClass();
        this.pluginRegistry.removePlugin(id3);
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread().post(new c(this, rendererSetupErrorListener, 1));
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean removeWidget(Widget widget) {
        widget.getClass();
        boolean zRemoveWidget = this.renderer.getRenderThread$maps_sdk_release().removeWidget(widget);
        if (zRemoveWidget) {
            this.renderer.scheduleRepaint();
        }
        return zRemoveWidget;
    }

    public final void setLifecycleState$maps_sdk_release(LifecycleState lifecycleState) {
        lifecycleState.getClass();
        this.lifecycleState = lifecycleState;
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int fps) {
        this.renderer.setMaximumFps(fps);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener listener) {
        listener.getClass();
        this.renderer.setOnFpsChangedListener(listener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        renderThreadStatsRecorder.getClass();
        this.renderer.getRenderThread$maps_sdk_release().setRenderThreadStatsRecorder$maps_sdk_release(renderThreadStatsRecorder);
    }

    public final void setScreenRefreshRate$maps_sdk_release(int refreshRate) {
        if (refreshRate <= 0) {
            MapboxLogger.logE(TAG, "Screen refresh rate could not be <= 0! Setting max fps and fps counter will not work properly.");
        } else {
            this.renderer.getRenderThread$maps_sdk_release().setScreenRefreshRate(refreshRate);
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(MapView.OnSnapshotReady listener) {
        listener.getClass();
        this.renderer.snapshot(listener);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapController$addWidget$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MapController.this.getRenderer().scheduleRepaint();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return this.renderer.snapshot();
    }

    public MapController(MapboxRenderer mapboxRenderer, NativeObserver nativeObserver, MapInitOptions mapInitOptions, ContextMode contextMode, NativeMapImpl nativeMapImpl, MapboxMap mapboxMap, MapPluginRegistry mapPluginRegistry, StyleDataLoadedCallback styleDataLoadedCallback) {
        mapboxRenderer.getClass();
        nativeObserver.getClass();
        mapInitOptions.getClass();
        nativeMapImpl.getClass();
        mapboxMap.getClass();
        mapPluginRegistry.getClass();
        styleDataLoadedCallback.getClass();
        this.cancelableSubscriberSet = new CopyOnWriteArraySet<>();
        this.lifecycleState = LifecycleState.STATE_STOPPED;
        this.renderer = mapboxRenderer;
        this.nativeObserver = nativeObserver;
        this.mapInitOptions = mapInitOptions;
        this.contextMode = contextMode;
        this.nativeMap = nativeMapImpl;
        this._mapboxMap = mapboxMap;
        this.pluginRegistry = mapPluginRegistry;
        this.cameraChangedCoalescedCallback = new com.google.firebase.crashlytics.internal.common.i(mapPluginRegistry, 8);
        this.styleDataLoadedCallback = styleDataLoadedCallback;
    }
}
