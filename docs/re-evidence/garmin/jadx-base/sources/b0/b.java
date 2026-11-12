package b0;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.o1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageReader f13850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13851b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13852c = true;

    public b(ImageReader imageReader) {
        this.f13850a = imageReader;
    }

    @Override // androidx.camera.core.impl.o1
    public final androidx.camera.core.e a() {
        Image imageAcquireNextImage;
        synchronized (this.f13851b) {
            try {
                imageAcquireNextImage = this.f13850a.acquireNextImage();
            } catch (RuntimeException e4) {
                if (!"ImageReaderContext is not initialized".equals(e4.getMessage())) {
                    throw e4;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireNextImage);
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final androidx.camera.core.e b() {
        Image imageAcquireLatestImage;
        synchronized (this.f13851b) {
            try {
                imageAcquireLatestImage = this.f13850a.acquireLatestImage();
            } catch (RuntimeException e4) {
                if (!"ImageReaderContext is not initialized".equals(e4.getMessage())) {
                    throw e4;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireLatestImage);
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final void c() {
        synchronized (this.f13851b) {
            this.f13852c = true;
            this.f13850a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final void close() {
        synchronized (this.f13851b) {
            this.f13850a.close();
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final void d(final o1.a aVar, final Executor executor) {
        synchronized (this.f13851b) {
            this.f13852c = false;
            this.f13850a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: b0.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    b bVar = this.f13838a;
                    Executor executor2 = executor;
                    o1.a aVar2 = aVar;
                    synchronized (bVar.f13851b) {
                        try {
                            if (!bVar.f13852c) {
                                executor2.execute(new ab.j(16, bVar, aVar2));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }, j0.p.a());
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final int f() {
        int imageFormat;
        synchronized (this.f13851b) {
            imageFormat = this.f13850a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.o1
    public final int g() {
        int maxImages;
        synchronized (this.f13851b) {
            maxImages = this.f13850a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.o1
    public final int getHeight() {
        int height;
        synchronized (this.f13851b) {
            height = this.f13850a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.o1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f13851b) {
            surface = this.f13850a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.o1
    public final int getWidth() {
        int width;
        synchronized (this.f13851b) {
            width = this.f13850a.getWidth();
        }
        return width;
    }
}
