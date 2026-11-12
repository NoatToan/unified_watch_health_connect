package androidx.camera.core;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
final class CameraClosedException extends RuntimeException {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraClosedException(String s, Throwable e) {
        super(s, e);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraClosedException(String s) {
        super(s);
    }
}
