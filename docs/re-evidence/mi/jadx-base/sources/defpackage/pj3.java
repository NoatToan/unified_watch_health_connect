package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class pj3 extends we3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f30455a;

    public pj3(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f30455a = captureCallback;
    }

    public static pj3 d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new pj3(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback e() {
        return this.f30455a;
    }
}
