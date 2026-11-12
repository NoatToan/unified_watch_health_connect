package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i14, String str, Throwable th3) {
        super(str, th3);
        this.mImageCaptureError = i14;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
