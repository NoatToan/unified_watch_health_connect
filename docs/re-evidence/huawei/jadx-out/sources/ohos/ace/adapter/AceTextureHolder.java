package ohos.ace.adapter;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes46.dex */
public final class AceTextureHolder {
    private static final String LOG_TAG = "AceTextureHolder";
    private static final Map<Long, SurfaceTexture> surfaceTextureMap = new ConcurrentHashMap();
    private static final Map<Long, Surface> surfaceMap = new ConcurrentHashMap();

    public static SurfaceTexture getSurfaceTexture(long j) {
        ALog.i(LOG_TAG, "getSurfaceTexture");
        return surfaceTextureMap.get(Long.valueOf(j));
    }

    public static Surface getSurface(long j) {
        Map<Long, Surface> map = surfaceMap;
        Surface surface = map.get(Long.valueOf(j));
        if (surface == null || surface.isValid()) {
            return surface;
        }
        ALog.w(LOG_TAG, "getSurface returns an invalid(released) surface, remove it.");
        map.remove(Long.valueOf(j));
        return null;
    }

    public static void addSurface(long j, Surface surface) {
        if (surface != null && surface.isValid()) {
            surfaceMap.put(Long.valueOf(j), surface);
        } else {
            ALog.w(LOG_TAG, "addSurface with an invalid(released) surface, ignore it.");
        }
    }

    public static void removeSurface(long j) {
        surfaceMap.remove(Long.valueOf(j));
    }

    public static void addSurfaceTexture(long j, SurfaceTexture surfaceTexture) {
        ALog.i(LOG_TAG, "addSurfaceTexture");
        surfaceTextureMap.put(Long.valueOf(j), surfaceTexture);
    }

    public static void removeSurfaceTexture(long j) {
        ALog.i(LOG_TAG, "removeSurfaceTexture");
        surfaceTextureMap.remove(Long.valueOf(j));
    }
}
