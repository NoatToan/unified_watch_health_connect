package androidx.camera.core;

import android.graphics.Matrix;
import android.media.Image;
import androidx.camera.core.impl.w2;
import b0.m0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f5427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0076a[] f5428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.f f5429c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    public static final class C0076a implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image.Plane f5430a;

        public C0076a(Image.Plane plane) {
            this.f5430a = plane;
        }

        @Override // androidx.camera.core.e.a
        public final ByteBuffer d() {
            return this.f5430a.getBuffer();
        }

        @Override // androidx.camera.core.e.a
        public final int e() {
            return this.f5430a.getRowStride();
        }

        @Override // androidx.camera.core.e.a
        public final int f() {
            return this.f5430a.getPixelStride();
        }
    }

    public a(Image image) {
        this.f5427a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f5428b = new C0076a[planes.length];
            for (int i14 = 0; i14 < planes.length; i14++) {
                this.f5428b[i14] = new C0076a(planes[i14]);
            }
        } else {
            this.f5428b = new C0076a[0];
        }
        this.f5429c = new b0.f(w2.f5840b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.e
    public final m0 A0() {
        return this.f5429c;
    }

    @Override // androidx.camera.core.e
    public final e.a[] A2() {
        return this.f5428b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f5427a.close();
    }

    @Override // androidx.camera.core.e
    public final int getFormat() {
        return this.f5427a.getFormat();
    }

    @Override // androidx.camera.core.e
    public final int getHeight() {
        return this.f5427a.getHeight();
    }

    @Override // androidx.camera.core.e
    public final Image getImage() {
        return this.f5427a;
    }

    @Override // androidx.camera.core.e
    public final int getWidth() {
        return this.f5427a.getWidth();
    }
}
