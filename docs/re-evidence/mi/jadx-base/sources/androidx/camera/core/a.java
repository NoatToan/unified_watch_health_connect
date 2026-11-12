package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import defpackage.q4d;
import defpackage.u6d;
import defpackage.uzo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public final Image f1689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final C0012a[] f1690b;
    public final q4d c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    public static final class C0012a implements m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @GuardedBy("this")
        public final Image.Plane f1691a;

        public C0012a(Image.Plane plane) {
            this.f1691a = plane;
        }

        @Override // androidx.camera.core.m.a
        public synchronized int a() {
            return this.f1691a.getRowStride();
        }

        @Override // androidx.camera.core.m.a
        public synchronized int b() {
            return this.f1691a.getPixelStride();
        }

        @Override // androidx.camera.core.m.a
        public synchronized ByteBuffer getBuffer() {
            return this.f1691a.getBuffer();
        }
    }

    public a(Image image) {
        this.f1689a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f1690b = new C0012a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f1690b[i] = new C0012a(planes[i]);
            }
        } else {
            this.f1690b = new C0012a[0];
        }
        this.c = u6d.e(uzo.a(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.m
    public q4d H() {
        return this.c;
    }

    @Override // androidx.camera.core.m
    public synchronized void a0(Rect rect) {
        this.f1689a.setCropRect(rect);
    }

    @Override // androidx.camera.core.m, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1689a.close();
    }

    @Override // androidx.camera.core.m
    public synchronized int getFormat() {
        return this.f1689a.getFormat();
    }

    @Override // androidx.camera.core.m
    public synchronized int getHeight() {
        return this.f1689a.getHeight();
    }

    @Override // androidx.camera.core.m
    public synchronized int getWidth() {
        return this.f1689a.getWidth();
    }

    @Override // androidx.camera.core.m
    public synchronized Rect k0() {
        return this.f1689a.getCropRect();
    }

    @Override // androidx.camera.core.m
    public synchronized Image p0() {
        return this.f1689a;
    }

    @Override // androidx.camera.core.m
    public synchronized m.a[] x() {
        return this.f1690b;
    }
}
