package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g0 {
    private g0() {
    }

    public static void a(CaptureRequest.Builder builder, androidx.camera.core.impl.x0 x0Var) {
        a0.i iVarA = a0.i.a.c(x0Var).a();
        for (androidx.camera.core.impl.x0.a<?> aVar : iVarA.d()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.c();
            try {
                builder.set(key, iVarA.e(aVar));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
            }
        }
    }

    public static void b(CaptureRequest.Builder builder, int i14, y.u uVar) {
        Map mapUnmodifiableMap;
        if (i14 == 3 && uVar.f192964a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i14 != 4) {
                uVar.getClass();
            } else if (uVar.f192965b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest c(androidx.camera.core.impl.v0 v0Var, CameraDevice cameraDevice, HashMap map, boolean z14, y.u uVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<DeferrableSurface> list = v0Var.f5813a;
        int i14 = v0Var.f5815c;
        androidx.camera.core.impl.x0 x0Var = v0Var.f5814b;
        List listUnmodifiableList = Collections.unmodifiableList(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((DeferrableSurface) it.next());
            if (surface == null) {
                vb.h.s("DeferrableSurface not in configuredSurfaceMap");
                return null;
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        androidx.camera.core.impl.c0 c0Var = v0Var.f5820h;
        if (i14 == 5 && c0Var != null && (c0Var.g() instanceof TotalCaptureResult)) {
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) c0Var.g());
        } else if (i14 == 5) {
            builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z14 ? 1 : 2);
        } else {
            builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i14);
        }
        b(builderCreateCaptureRequest, i14, uVar);
        Range<Integer> rangeA = v0Var.a();
        if (!rangeA.equals(androidx.camera.core.impl.q2.f5715a)) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        rangeA.toString();
        Integer numE = e(v0Var);
        if (numE != null) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numE);
        }
        androidx.camera.core.impl.h hVar = androidx.camera.core.impl.v0.f5810i;
        if (x0Var.b(hVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) x0Var.e(hVar));
        }
        androidx.camera.core.impl.h hVar2 = androidx.camera.core.impl.v0.f5811j;
        if (x0Var.b(hVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) x0Var.e(hVar2)).byteValue()));
        }
        a(builderCreateCaptureRequest, x0Var);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it3.next());
        }
        builderCreateCaptureRequest.setTag(v0Var.f5819g);
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest d(androidx.camera.core.impl.v0 v0Var, CameraDevice cameraDevice, y.u uVar) throws CameraAccessException {
        int i14 = v0Var.f5815c;
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i14);
        b(builderCreateCaptureRequest, i14, uVar);
        Range<Integer> rangeA = v0Var.a();
        if (!rangeA.equals(androidx.camera.core.impl.q2.f5715a)) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        rangeA.toString();
        a(builderCreateCaptureRequest, v0Var.f5814b);
        return builderCreateCaptureRequest.build();
    }

    public static Integer e(androidx.camera.core.impl.v0 v0Var) {
        if (v0Var.c() == 1 || v0Var.d() == 1) {
            return 0;
        }
        if (v0Var.c() == 2) {
            return 2;
        }
        return v0Var.d() == 2 ? 1 : null;
    }
}
