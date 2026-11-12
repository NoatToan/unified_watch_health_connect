package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public class CameraUnavailableException extends Exception {
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_MAX_IN_USE = 5;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 6;
    public static final int CAMERA_UNKNOWN_ERROR = 0;
    private final int mReason;

    public CameraUnavailableException(int i14) {
        this.mReason = i14;
    }

    public int getReason() {
        return this.mReason;
    }

    public CameraUnavailableException(int i14, String str) {
        super(str);
        this.mReason = i14;
    }

    public CameraUnavailableException(int i14, String str, Throwable th3) {
        super(str, th3);
        this.mReason = i14;
    }

    public CameraUnavailableException(int i14, Throwable th3) {
        super(th3);
        this.mReason = i14;
    }
}
