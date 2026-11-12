package defpackage;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.a;
import androidx.camera.core.m;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ha1 implements p5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ImageReader f19849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19850b = new Object();

    public ha1(ImageReader imageReader) {
        this.f19849a = imageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$0(p5d.a aVar) {
        aVar.a(this);
    }

    @Override // defpackage.p5d
    public Surface a() {
        Surface surface;
        synchronized (this.f19850b) {
            surface = this.f19849a.getSurface();
        }
        return surface;
    }

    @Override // defpackage.p5d
    public int b() {
        int imageFormat;
        synchronized (this.f19850b) {
            imageFormat = this.f19849a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.p5d
    public int c() {
        int maxImages;
        synchronized (this.f19850b) {
            maxImages = this.f19849a.getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.p5d
    public void close() {
        synchronized (this.f19850b) {
            this.f19849a.close();
        }
    }

    @Override // defpackage.p5d
    public void d(final p5d.a aVar, final Executor executor) {
        synchronized (this.f19850b) {
            this.f19849a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: fa1
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    this.f17583a.k(executor, aVar, imageReader);
                }
            }, y1f.a());
        }
    }

    @Override // defpackage.p5d
    public m e() {
        Image imageAcquireNextImage;
        synchronized (this.f19850b) {
            try {
                imageAcquireNextImage = this.f19849a.acquireNextImage();
            } catch (RuntimeException e) {
                if (!j(e)) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new a(imageAcquireNextImage);
        }
    }

    @Override // defpackage.p5d
    public m g() {
        Image imageAcquireLatestImage;
        synchronized (this.f19850b) {
            try {
                imageAcquireLatestImage = this.f19849a.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!j(e)) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new a(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.p5d
    public int getHeight() {
        int height;
        synchronized (this.f19850b) {
            height = this.f19849a.getHeight();
        }
        return height;
    }

    @Override // defpackage.p5d
    public int getWidth() {
        int width;
        synchronized (this.f19850b) {
            width = this.f19849a.getWidth();
        }
        return width;
    }

    @Override // defpackage.p5d
    public void h() {
        synchronized (this.f19850b) {
            this.f19849a.setOnImageAvailableListener(null, null);
        }
    }

    public final boolean j(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    public final /* synthetic */ void k(Executor executor, final p5d.a aVar, ImageReader imageReader) {
        executor.execute(new Runnable() { // from class: ga1
            @Override // java.lang.Runnable
            public final void run() {
                this.f18764a.lambda$setOnImageAvailableListener$0(aVar);
            }
        });
    }
}
