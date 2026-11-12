package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f173946b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f173945a = new HashMap();

    public final void a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        HashMap map = this.f173945a;
        List list2 = (List) map.get(captureRequest);
        if (list2 == null) {
            map.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        map.put(captureRequest, arrayList);
    }

    public final List<CameraCaptureSession.CaptureCallback> b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = (List) this.f173945a.get(captureRequest);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j8) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j8);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i14) {
        Iterator it = this.f173945a.values().iterator();
        while (it.hasNext()) {
            Iterator it3 = ((List) it.next()).iterator();
            while (it3.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it3.next()).onCaptureSequenceAborted(cameraCaptureSession, i14);
            }
        }
        z0 z0Var = this.f173946b;
        if (z0Var != null) {
            z0Var.a();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i14, long j8) {
        Iterator it = this.f173945a.values().iterator();
        while (it.hasNext()) {
            Iterator it3 = ((List) it.next()).iterator();
            while (it3.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it3.next()).onCaptureSequenceCompleted(cameraCaptureSession, i14, j8);
            }
        }
        z0 z0Var = this.f173946b;
        if (z0Var != null) {
            z0Var.a();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j14) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j8, j14);
        }
    }
}
