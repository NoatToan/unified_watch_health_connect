package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface ImageReaderProxy {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnImageAvailableListener {
        void onImageAvailable(@NonNull ImageReaderProxy imageReader);
    }

    @Nullable
    ImageProxy acquireLatestImage();

    @Nullable
    ImageProxy acquireNextImage();

    void clearOnImageAvailableListener();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    @Nullable
    Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(@NonNull OnImageAvailableListener listener, @NonNull Executor executor);
}
