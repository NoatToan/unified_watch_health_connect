package ka;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.media.MediaDrm;
import android.os.VibratorManager;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    public static /* synthetic */ MultiResolutionStreamInfo e(int i14, int i15, String str) {
        return new MultiResolutionStreamInfo(i14, i15, str);
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent g(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* bridge */ /* synthetic */ VibratorManager i(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession k(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget l(kotlin.m mVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(mVar, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ void p() {
    }
}
