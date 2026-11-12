package com.mapbox.maps.renderer;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.mapbox.maps.ContextMode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0011\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/renderer/MapboxSurfaceHolderRenderer;", "Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;", "Landroid/view/SurfaceHolder$Callback;", "surfaceHolder", "Landroid/view/SurfaceHolder;", "antialiasingSampleCount", "", "contextMode", "Lcom/mapbox/maps/ContextMode;", "mapName", "", "(Landroid/view/SurfaceHolder;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V", "renderThread", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V", "surfaceChanged", "", "holder", "format", "width", "height", "surfaceCreated", "surfaceDestroyed", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxSurfaceHolderRenderer extends MapboxSurfaceRenderer implements SurfaceHolder.Callback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceHolderRenderer(SurfaceHolder surfaceHolder, int i14, ContextMode contextMode, String str) {
        super(i14, contextMode, str);
        surfaceHolder.getClass();
        contextMode.getClass();
        str.getClass();
        surfaceHolder.addCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        holder.getClass();
        Surface surface = holder.getSurface();
        surface.getClass();
        surfaceChanged(surface, width, height);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        holder.getClass();
        surfaceCreated();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        holder.getClass();
        surfaceDestroyed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceHolderRenderer(MapboxRenderThread mapboxRenderThread) {
        super(mapboxRenderThread);
        mapboxRenderThread.getClass();
    }
}
