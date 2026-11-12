package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class RotationProvider {

    @Nullable
    @GuardedBy("mLock")
    public Executor mExecutor;

    @Nullable
    @GuardedBy("mLock")
    public Listener mListener;

    @NonNull
    @GuardedBy("mLock")
    @VisibleForTesting
    public final OrientationEventListener mOrientationListener;
    public final Object mLock = new Object();

    @VisibleForTesting
    public boolean mIgnoreCanDetectForTest = false;

    /* JADX INFO: renamed from: androidx.camera.view.RotationProvider$1, reason: invalid class name */
    public class AnonymousClass1 extends OrientationEventListener {
        private static final int INVALID_SURFACE_ROTATION = -1;
        private int mRotation;

        public AnonymousClass1(Context context) {
            super(context);
            this.mRotation = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            final int iOrientationToSurfaceRotation;
            Executor executor;
            final Listener listener;
            if (i == -1 || this.mRotation == (iOrientationToSurfaceRotation = RotationProvider.orientationToSurfaceRotation(i))) {
                return;
            }
            this.mRotation = iOrientationToSurfaceRotation;
            synchronized (RotationProvider.this.mLock) {
                RotationProvider rotationProvider = RotationProvider.this;
                executor = rotationProvider.mExecutor;
                listener = rotationProvider.mListener;
            }
            if (executor == null || listener == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.camera.view.h
                @Override // java.lang.Runnable
                public final void run() {
                    listener.onRotationChanged(iOrientationToSurfaceRotation);
                }
            });
        }
    }

    public interface Listener {
        void onRotationChanged(int i);
    }

    public RotationProvider(@NonNull Context context) {
        this.mOrientationListener = new AnonymousClass1(context);
    }

    @VisibleForTesting
    public static int orientationToSurfaceRotation(int i) {
        if (i >= 315 || i < 45) {
            return 0;
        }
        if (i >= 225) {
            return 1;
        }
        return i >= 135 ? 2 : 3;
    }

    public void clearListener() {
        synchronized (this.mLock) {
            this.mOrientationListener.disable();
            this.mExecutor = null;
            this.mListener = null;
        }
    }

    public boolean setListener(@NonNull Listener listener) {
        return setListener(CameraXExecutors.mainThreadExecutor(), listener);
    }

    public boolean setListener(@NonNull Executor executor, @NonNull Listener listener) {
        synchronized (this.mLock) {
            if (!this.mOrientationListener.canDetectOrientation() && !this.mIgnoreCanDetectForTest) {
                return false;
            }
            this.mExecutor = executor;
            this.mListener = listener;
            this.mOrientationListener.enable();
            return true;
        }
    }
}
