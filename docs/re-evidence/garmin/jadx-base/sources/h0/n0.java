package h0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements androidx.camera.core.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f80539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.camera.core.e.a[] f80542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0 f80543e;

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(Bitmap bitmap, Rect rect, int i14, Matrix matrix, long j8) {
        k7.h.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.e(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        this(byteBufferAllocateDirect, 4, bitmap.getWidth(), bitmap.getHeight(), rect, i14, matrix, j8);
    }

    @Override // androidx.camera.core.e
    public final b0.m0 A0() {
        m0 m0Var;
        synchronized (this.f80539a) {
            a();
            m0Var = this.f80543e;
        }
        return m0Var;
    }

    @Override // androidx.camera.core.e
    public final androidx.camera.core.e.a[] A2() {
        androidx.camera.core.e.a[] aVarArr;
        synchronized (this.f80539a) {
            a();
            androidx.camera.core.e.a[] aVarArr2 = this.f80542d;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    public final void a() {
        synchronized (this.f80539a) {
            k7.h.f(this.f80542d != null, "The image is closed.");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f80539a) {
            a();
            this.f80542d = null;
        }
    }

    @Override // androidx.camera.core.e
    public final int getFormat() {
        synchronized (this.f80539a) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.e
    public final int getHeight() {
        int i14;
        synchronized (this.f80539a) {
            a();
            i14 = this.f80541c;
        }
        return i14;
    }

    @Override // androidx.camera.core.e
    public final Image getImage() {
        synchronized (this.f80539a) {
            a();
        }
        return null;
    }

    @Override // androidx.camera.core.e
    public final int getWidth() {
        int i14;
        synchronized (this.f80539a) {
            a();
            i14 = this.f80540b;
        }
        return i14;
    }

    public n0(ByteBuffer byteBuffer, int i14, int i15, int i16, Rect rect, int i17, Matrix matrix, long j8) {
        this.f80539a = new Object();
        this.f80540b = i15;
        this.f80541c = i16;
        this.f80543e = new m0(j8, i17, matrix);
        byteBuffer.rewind();
        this.f80542d = new androidx.camera.core.e.a[]{new l0(i15 * i14, i14, byteBuffer)};
    }

    public n0(r0.k<Bitmap> kVar) {
        this(kVar.c(), kVar.b(), kVar.f(), kVar.g(), kVar.a().getTimestamp());
    }
}
