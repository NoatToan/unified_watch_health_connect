package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.lhe;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(String str) {
            super(str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(String str, Throwable th) {
            super(str, th);
        }
    }

    lhe<Void> d(boolean z);
}
