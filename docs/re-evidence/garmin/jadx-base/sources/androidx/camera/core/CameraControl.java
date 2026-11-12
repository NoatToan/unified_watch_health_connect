package androidx.camera.core;

import b0.d0;
import b0.e0;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControl {
    ListenableFuture<Void> a(float f14);

    ListenableFuture<Void> b(float f14);

    ListenableFuture<Void> g(boolean z14);

    ListenableFuture<e0> l(d0 d0Var);

    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }

        public OperationCanceledException(String str, Throwable th3) {
            super(str, th3);
        }
    }
}
