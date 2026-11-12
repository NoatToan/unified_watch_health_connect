package androidx.camera.core;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i, String str, Throwable th) {
        super(str, th);
        this.mImageCaptureError = i;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
