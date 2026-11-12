package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ke3 {

    @RequiresApi(23)
    public static class a {
        public static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    @OptIn(markerClass = {dj8.class})
    public static void a(CaptureRequest.Builder builder, Config config) {
        hk3 hk3VarD = hk3.a.e(config).d();
        for (Config.a<?> aVar : hk3VarD.h()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, hk3VarD.a(aVar));
            } catch (IllegalArgumentException unused) {
                zpe.c("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest b(e eVar, CameraDevice cameraDevice, Map<DeferrableSurface, Surface> map) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> listD = d(eVar.e(), map);
        if (listD.isEmpty()) {
            return null;
        }
        ye3 ye3VarC = eVar.c();
        CaptureRequest.Builder builderA = (eVar.g() == 5 && ye3VarC != null && (ye3VarC.d() instanceof TotalCaptureResult)) ? a.a(cameraDevice, (TotalCaptureResult) ye3VarC.d()) : cameraDevice.createCaptureRequest(eVar.g());
        a(builderA, eVar.d());
        Config configD = eVar.d();
        Config.a<Integer> aVar = e.h;
        if (configD.f(aVar)) {
            builderA.set(CaptureRequest.JPEG_ORIENTATION, (Integer) eVar.d().a(aVar));
        }
        Config configD2 = eVar.d();
        Config.a<Integer> aVar2 = e.i;
        if (configD2.f(aVar2)) {
            builderA.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) eVar.d().a(aVar2)).byteValue()));
        }
        Iterator<Surface> it = listD.iterator();
        while (it.hasNext()) {
            builderA.addTarget(it.next());
        }
        builderA.setTag(eVar.f());
        return builderA.build();
    }

    public static CaptureRequest c(e eVar, CameraDevice cameraDevice) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(eVar.g());
        a(builderCreateCaptureRequest, eVar.d());
        return builderCreateCaptureRequest.build();
    }

    public static List<Surface> d(List<DeferrableSurface> list, Map<DeferrableSurface, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
