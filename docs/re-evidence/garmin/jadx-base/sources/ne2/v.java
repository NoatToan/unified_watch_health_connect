package ne2;

import android.graphics.Color;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.annotation.ClusterOptions;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class v {
    public static final void a(s sVar, n nVar, Long l14) {
        MapboxMap mapboxMapB0 = sVar.b0();
        if (mapboxMapB0 != null) {
            Float f14 = sVar.f125705w;
            nVar.a(mapboxMapB0, f14 != null ? Double.valueOf(f14.floatValue()) : null, new ls0.h(l14, 13, nVar, sVar));
        }
    }

    public static final void b(s sVar, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions) {
        cameraOptions.getClass();
        mapAnimationOptions.getClass();
        Long duration = mapAnimationOptions.getDuration();
        if (duration != null && duration.longValue() > 0) {
            MapboxMap mapboxMapB0 = sVar.b0();
            sVar.K0 = mapboxMapB0 != null ? CameraAnimationsUtils.easeTo(mapboxMapB0, cameraOptions, mapAnimationOptions, null) : null;
        } else {
            MapboxMap mapboxMapB1 = sVar.b0();
            if (mapboxMapB1 != null) {
                mapboxMapB1.setCamera(cameraOptions);
            }
        }
    }

    public static final ClusterOptions c(s sVar, int i14) {
        return new ClusterOptions(false, 0L, null, 20.0d, null, -1, null, 12.0d, null, 0L, 0L, i14 == 0 ? p13.w.c(new o13.p(0, Integer.valueOf(Color.rgb(18, 101, 194)))) : p13.w.c(new o13.p(0, Integer.valueOf(Color.rgb(211, 32, 32)))), null, 5975, null);
    }

    public static final void d(s sVar, int i14) {
        HashMap<Integer, StyleContract.StyleLayerExtension> map = sVar.I;
        if (map.get(Integer.valueOf(i14)) instanceof SymbolLayer) {
            StyleContract.StyleLayerExtension styleLayerExtension = map.get(Integer.valueOf(i14));
            styleLayerExtension.getClass();
            SymbolLayer symbolLayer = (SymbolLayer) styleLayerExtension;
            MapboxMap mapboxMapB0 = sVar.b0();
            if (mapboxMapB0 != null) {
                mapboxMapB0.getStyle(new u(symbolLayer, sVar, i14));
            }
        }
    }

    public static final void e(s sVar, CameraState cameraState) {
        com.garmin.android.library.mapsdkadapter.e eVarD;
        Point center;
        sVar.getClass();
        if (cameraState != null && (center = cameraState.getCenter()) != null) {
            sVar.X = p.e(center);
        }
        if (cameraState != null) {
            sVar.Y = Float.valueOf((float) cameraState.getZoom()).floatValue();
        }
        MapboxMap mapboxMapB0 = sVar.b0();
        if (mapboxMapB0 == null || (eVarD = p.d(mapboxMapB0)) == null) {
            return;
        }
        sVar.Z = eVarD;
    }

    public static /* synthetic */ void f(s sVar) {
        MapboxMap mapboxMapB0 = sVar.b0();
        e(sVar, mapboxMapB0 != null ? mapboxMapB0.getCameraState() : null);
    }
}
