package com.mapbox.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.renderer.MapboxSurfaceRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\r\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0002\b\u001cJ!\u0010\u001d\u001a\u0004\u0018\u0001H\u001e\"\b\b\u0000\u0010\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020\u0016H\u0016J\b\u0010/\u001a\u00020\u0016H\u0016J\u0010\u00100\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u00101\u001a\u00020\u00162\u0006\u0010&\u001a\u0002022\u0006\u00103\u001a\u00020%H\u0016J\u0010\u00104\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u00105\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0010\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020,H\u0016J\u0010\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020=H\u0017J\n\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010>\u001a\u00020\u00162\u0006\u00109\u001a\u00020@H\u0016J\u0016\u0010A\u001a\u00020\u00162\u0006\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020,J\u0006\u0010D\u001a\u00020\u0016J\u0006\u0010E\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006F"}, d2 = {"Lcom/mapbox/maps/MapSurface;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "Lcom/mapbox/maps/MapControllable;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "surface", "Landroid/view/Surface;", "mapInitOptions", "Lcom/mapbox/maps/MapInitOptions;", "(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;)V", "renderer", "Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;", "mapController", "Lcom/mapbox/maps/MapController;", "(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;Lcom/mapbox/maps/MapController;)V", "mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "()Lcom/mapbox/maps/MapboxMap;", "getSurface", "()Landroid/view/Surface;", "addRendererSetupErrorListener", "", "rendererSetupErrorListener", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "addWidget", "widget", "Lcom/mapbox/maps/renderer/widget/Widget;", "getMapboxMapDeprecated", "getPlugin", "T", "Lcom/mapbox/maps/plugin/MapPlugin;", TtmlNode.ATTR_ID, "", "(Ljava/lang/String;)Lcom/mapbox/maps/plugin/MapPlugin;", "onDestroy", "onGenericMotionEvent", "", "event", "Landroid/view/MotionEvent;", "onLowMemory", "onResume", "onSizeChanged", "w", "", "h", "onStart", "onStop", "onTouchEvent", "queueEvent", "Ljava/lang/Runnable;", "needRender", "removeRendererSetupErrorListener", "removeWidget", "setMaximumFps", "fps", "setOnFpsChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setRenderThreadStatsRecorder", "renderThreadStatsRecorder", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "snapshot", "Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "surfaceChanged", "width", "height", "surfaceCreated", "surfaceDestroyed", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapSurface implements MapPluginProviderDelegate, MapControllable {
    private final Context context;
    private final MapController mapController;
    private final MapInitOptions mapInitOptions;
    private final MapboxSurfaceRenderer renderer;
    private final Surface surface;

    public MapSurface(Context context, Surface surface, MapInitOptions mapInitOptions) {
        context.getClass();
        surface.getClass();
        mapInitOptions.getClass();
        this.context = context;
        this.surface = surface;
        this.mapInitOptions = mapInitOptions;
        int antialiasingSampleCount = mapInitOptions.getAntialiasingSampleCount();
        ContextMode contextMode = mapInitOptions.getMapOptions().getContextMode();
        contextMode = contextMode == null ? ContextMode.UNIQUE : contextMode;
        contextMode.getClass();
        MapboxSurfaceRenderer mapboxSurfaceRenderer = new MapboxSurfaceRenderer(antialiasingSampleCount, contextMode, mapInitOptions.getMapName());
        this.renderer = mapboxSurfaceRenderer;
        MapController mapController = new MapController(mapboxSurfaceRenderer, mapInitOptions);
        MapController.initializePlugins$default(mapController, mapInitOptions, null, 2, null);
        this.mapController = mapController;
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.mapController.addRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void addWidget(Widget widget) {
        widget.getClass();
        this.mapController.addWidget(widget);
    }

    @Override // com.mapbox.maps.MapControllable
    /* JADX INFO: renamed from: getMapboxMap */
    public MapboxMap getMapboxMapDeprecated() {
        return this.mapController.getMapboxMapDeprecated();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate
    public <T extends MapPlugin> T getPlugin(String id3) {
        id3.getClass();
        return (T) this.mapController.getPlugin(id3);
    }

    public final Surface getSurface() {
        return this.surface;
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        this.mapController.onDestroy();
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent event) {
        event.getClass();
        return this.mapController.onGenericMotionEvent(event);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        this.mapController.onLowMemory();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onResume() {
        this.mapController.onResume();
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int w14, int h14) {
        this.mapController.onSizeChanged(w14, h14);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        this.mapController.onStart();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        this.mapController.onStop();
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onTouchEvent(MotionEvent event) {
        event.getClass();
        return this.mapController.onTouchEvent(event);
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable event, boolean needRender) {
        event.getClass();
        MapControllable.DefaultImpls.queueEvent$default(this.mapController, event, false, 2, null);
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.mapController.removeRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public boolean removeWidget(Widget widget) {
        widget.getClass();
        return this.mapController.removeWidget(widget);
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
    @MapboxExperimental
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        renderThreadStatsRecorder.getClass();
        this.mapController.setRenderThreadStatsRecorder(renderThreadStatsRecorder);
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(MapView.OnSnapshotReady listener) {
        listener.getClass();
        this.mapController.snapshot(listener);
    }

    public final void surfaceChanged(int width, int height) {
        this.renderer.surfaceChanged(this.surface, width, height);
        onSizeChanged(width, height);
    }

    public final void surfaceCreated() {
        Display defaultDisplay;
        this.renderer.surfaceCreated();
        WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
        this.mapController.setScreenRefreshRate$maps_sdk_release((windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 60 : (int) defaultDisplay.getRefreshRate());
    }

    public final void surfaceDestroyed() {
        this.renderer.surfaceDestroyed();
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return this.mapController.snapshot();
    }

    public /* synthetic */ MapSurface(Context context, Surface surface, MapInitOptions mapInitOptions, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, surface, (i14 & 4) != 0 ? new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null) : mapInitOptions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapSurface(Context context, Surface surface) {
        this(context, surface, (MapInitOptions) null, 4, (p005kotlin.jvm.internal.j) null);
        context.getClass();
        surface.getClass();
    }

    public MapSurface(Context context, Surface surface, MapInitOptions mapInitOptions, MapboxSurfaceRenderer mapboxSurfaceRenderer, MapController mapController) {
        context.getClass();
        surface.getClass();
        mapInitOptions.getClass();
        mapboxSurfaceRenderer.getClass();
        mapController.getClass();
        this.context = context;
        this.surface = surface;
        this.mapInitOptions = mapInitOptions;
        this.renderer = mapboxSurfaceRenderer;
        this.mapController = mapController;
    }
}
