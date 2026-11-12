package ne2;

import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadedCallback;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import java.util.Objects;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements MapLoadedCallback, MapIdleCallback, CameraChangedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f125570b;

    public /* synthetic */ c(s sVar, int i14) {
        this.f125569a = i14;
        this.f125570b = sVar;
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        int i14 = this.f125569a;
        s sVar = this.f125570b;
        switch (i14) {
            case 1:
                mapIdle.getClass();
                if (!sVar.f50240a) {
                    v.f(sVar);
                    com.garmin.android.library.mapsdkadapter.f fVar = sVar.X;
                    com.garmin.android.library.mapsdkadapter.e eVar = sVar.Z;
                    Objects.toString(fVar);
                    Objects.toString(eVar);
                    s sVar2 = s.this;
                    int i15 = s.M0;
                    com.garmin.android.library.mapsdkadapter.i.g gVar = sVar2.f50255p;
                    if (gVar != null) {
                        gVar.onCameraIdle();
                    }
                }
                break;
            default:
                int i16 = s.M0;
                mapIdle.getClass();
                MapView mapView = sVar.f125704v;
                if (mapView != null) {
                    mapView.setVisibility(0);
                }
                break;
        }
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        cameraChanged.getClass();
        s sVar = this.f125570b;
        if (sVar.f50240a) {
            return;
        }
        MapboxMap mapboxMapB0 = sVar.b0();
        com.garmin.android.library.mapsdkadapter.e eVarD = mapboxMapB0 != null ? p.d(mapboxMapB0) : null;
        if (eVarD != null) {
            s sVar2 = s.this;
            int i14 = s.M0;
            com.garmin.android.library.mapsdkadapter.i.f fVar = sVar2.f50253n;
            if (fVar != null) {
                fVar.i(eVarD);
                Unit unit = Unit.INSTANCE;
            }
            v.e(sVar, cameraChanged.getCameraState());
        }
    }

    @Override // com.mapbox.maps.MapLoadedCallback
    public void run(MapLoaded mapLoaded) {
        mapLoaded.getClass();
        s sVar = s.this;
        int i14 = s.M0;
        com.garmin.android.library.mapsdkadapter.i.k kVar = sVar.f50256q;
        if (kVar != null) {
            kVar.onMapLoaded();
        }
    }
}
