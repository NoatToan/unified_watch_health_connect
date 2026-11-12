package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class ForwardingImageProxy implements ImageProxy {

    @GuardedBy("this")
    public final ImageProxy mImage;

    @GuardedBy("this")
    private final Set<OnImageCloseListener> mOnImageCloseListeners = new HashSet();

    public interface OnImageCloseListener {
        void onImageClose(ImageProxy image);
    }

    public ForwardingImageProxy(ImageProxy image) {
        this.mImage = image;
    }

    public synchronized void addOnImageCloseListener(OnImageCloseListener listener) {
        this.mOnImageCloseListeners.add(listener);
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.mImage.close();
        }
        notifyOnImageCloseListeners();
    }

    @Override // androidx.camera.core.ImageProxy
    @NonNull
    public synchronized Rect getCropRect() {
        return this.mImage.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getFormat() {
        return this.mImage.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getHeight() {
        return this.mImage.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    @ExperimentalGetImage
    public synchronized Image getImage() {
        return this.mImage.getImage();
    }

    @Override // androidx.camera.core.ImageProxy
    @NonNull
    public synchronized ImageInfo getImageInfo() {
        return this.mImage.getImageInfo();
    }

    @Override // androidx.camera.core.ImageProxy
    @NonNull
    public synchronized ImageProxy.PlaneProxy[] getPlanes() {
        return this.mImage.getPlanes();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getWidth() {
        return this.mImage.getWidth();
    }

    public void notifyOnImageCloseListeners() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.mOnImageCloseListeners);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((OnImageCloseListener) it2.next()).onImageClose(this);
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized void setCropRect(@Nullable Rect rect) {
        this.mImage.setCropRect(rect);
    }
}
