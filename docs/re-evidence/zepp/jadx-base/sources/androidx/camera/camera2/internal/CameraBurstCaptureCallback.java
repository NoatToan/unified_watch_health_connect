package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class CameraBurstCaptureCallback extends CameraCaptureSession.CaptureCallback {
    public CaptureSequenceCallback mCaptureSequenceCallback = null;
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> mCallbackMap = new HashMap();

    public interface CaptureSequenceCallback {
        void onCaptureSequenceCompletedOrAborted(@NonNull CameraCaptureSession session, int sequenceId, boolean isAborted);
    }

    private List<CameraCaptureSession.CaptureCallback> getCallbacks(CaptureRequest request) {
        List<CameraCaptureSession.CaptureCallback> list = this.mCallbackMap.get(request);
        return list != null ? list : Collections.emptyList();
    }

    public void addCamera2Callbacks(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> captureCallbacks) {
        List<CameraCaptureSession.CaptureCallback> list = this.mCallbackMap.get(captureRequest);
        if (list == null) {
            this.mCallbackMap.put(captureRequest, captureCallbacks);
            return;
        }
        ArrayList arrayList = new ArrayList(captureCallbacks.size() + list.size());
        arrayList.addAll(captureCallbacks);
        arrayList.addAll(list);
        this.mCallbackMap.put(captureRequest, arrayList);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    @RequiresApi(api = 24)
    public void onCaptureBufferLost(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, @NonNull Surface surface, long frame) {
        Iterator<CameraCaptureSession.CaptureCallback> it2 = getCallbacks(request).iterator();
        while (it2.hasNext()) {
            it2.next().onCaptureBufferLost(session, request, surface, frame);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, @NonNull TotalCaptureResult result) {
        Iterator<CameraCaptureSession.CaptureCallback> it2 = getCallbacks(request).iterator();
        while (it2.hasNext()) {
            it2.next().onCaptureCompleted(session, request, result);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, @NonNull CaptureFailure failure) {
        Iterator<CameraCaptureSession.CaptureCallback> it2 = getCallbacks(request).iterator();
        while (it2.hasNext()) {
            it2.next().onCaptureFailed(session, request, failure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, @NonNull CaptureResult partialResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it2 = getCallbacks(request).iterator();
        while (it2.hasNext()) {
            it2.next().onCaptureProgressed(session, request, partialResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(@NonNull CameraCaptureSession session, int sequenceId) {
        CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(session, sequenceId, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession session, int sequenceId, long frameNumber) {
        CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(session, sequenceId, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, long timestamp, long frameNumber) {
        Iterator<CameraCaptureSession.CaptureCallback> it2 = getCallbacks(request).iterator();
        while (it2.hasNext()) {
            it2.next().onCaptureStarted(session, request, timestamp, frameNumber);
        }
    }

    public void setCaptureSequenceCallback(@NonNull CaptureSequenceCallback callback) {
        this.mCaptureSequenceCallback = callback;
    }
}
