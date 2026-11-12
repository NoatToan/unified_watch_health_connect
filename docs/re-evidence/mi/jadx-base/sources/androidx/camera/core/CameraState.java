package androidx.camera.core;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class CameraState {

    public enum ErrorType {
        RECOVERABLE,
        CRITICAL
    }

    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static abstract class a {
        public static a a(int i) {
            return b(i, null);
        }

        public static a b(int i, Throwable th) {
            return new c(i, th);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    public static CameraState a(Type type) {
        return b(type, null);
    }

    public static CameraState b(Type type, a aVar) {
        return new b(type, aVar);
    }

    public abstract a c();

    public abstract Type d();
}
