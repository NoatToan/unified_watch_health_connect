package androidx.camera.video.internal.encoder;

/* JADX INFO: loaded from: classes.dex */
public class EncodeException extends Exception {
    public static final int ERROR_CODEC = 1;
    public static final int ERROR_UNKNOWN = 0;
    private final int mErrorType;

    public EncodeException(int i14, String str, Throwable th3) {
        super(str, th3);
        this.mErrorType = i14;
    }

    public int getErrorType() {
        return this.mErrorType;
    }
}
