package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ve3 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f36793b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f36792a = new HashMap();

    public interface a {
        void a(CameraCaptureSession cameraCaptureSession, int i, boolean z);
    }

    public void a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.f36792a.get(captureRequest);
        if (list2 == null) {
            this.f36792a.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f36792a.put(captureRequest, arrayList);
    }

    public final List<CameraCaptureSession.CaptureCallback> b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f36792a.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    public void c(a aVar) {
        this.f36793b = aVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    @RequiresApi(api = 24)
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            wd1.a(it.next(), cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.f36792a.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        a aVar = this.f36793b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.f36792a.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        a aVar = this.f36793b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
