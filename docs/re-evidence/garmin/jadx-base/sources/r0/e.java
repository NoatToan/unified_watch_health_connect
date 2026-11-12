package r0;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import b0.b0;
import b0.c1;
import b0.e1;
import b0.g1;
import com.google.android.gms.gcm.Task;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import j0.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import o13.u;

/* JADX INFO: loaded from: classes.dex */
public class e implements q, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f148707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f148708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0.d f148709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f148710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f148711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f148712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f148713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f148714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f148715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f148716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f148717k;

    @AutoValue
    public static abstract class a {
        public abstract androidx.concurrent.futures.b.a<Void> a();

        public abstract int b();

        public abstract int c();
    }

    public e(b0 b0Var, Map<t0.d.e, l> map) {
        this.f148711e = new AtomicBoolean(false);
        this.f148712f = new float[16];
        this.f148713g = new float[16];
        this.f148714h = new LinkedHashMap();
        this.f148715i = 0;
        this.f148716j = false;
        this.f148717k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f148708b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f148710d = handler;
        this.f148709c = new k0.d(handler);
        this.f148707a = new j();
        try {
            androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = v.h.class;
            try {
                try {
                    e(new at0.c(this, b0Var, map, aVar, 19), new ab2.a(9));
                    aVar.f6079a = "Init GlRenderer";
                } catch (Exception e4) {
                    e = e4;
                    try {
                        dVar.a(e);
                    } catch (RuntimeException e14) {
                        e = e14;
                        RuntimeException runtimeException = e;
                        release();
                        throw runtimeException;
                    }
                }
            } catch (Exception e15) {
                e = e15;
            }
            try {
                dVar.get();
            } catch (InterruptedException | ExecutionException e16) {
                Throwable cause = e16;
                cause = cause instanceof ExecutionException ? cause.getCause() : cause;
                if (!(cause instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", cause);
                }
                throw ((RuntimeException) cause);
            }
        } catch (RuntimeException e17) {
            e = e17;
        }
    }

    @Override // b0.d1
    public final void a(g1 g1Var) {
        if (this.f148711e.get()) {
            g1Var.d();
        } else {
            e(new l0.e(29, this, g1Var), new e1(g1Var, 1));
        }
    }

    @Override // b0.d1
    public final void b(c1 c1Var) throws IOException {
        if (this.f148711e.get()) {
            c1Var.close();
            return;
        }
        l0.e eVar = new l0.e(27, this, c1Var);
        Objects.requireNonNull(c1Var);
        e(eVar, new po.g(c1Var, 10));
    }

    @Override // r0.q
    public final ListenableFuture<Void> c(int i14, int i15) {
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = v.h.class;
        try {
            e(new l0.e(28, this, new r0.a(i14, i15, aVar)), new l0.g(aVar, 1));
            aVar.f6079a = "DefaultSurfaceProcessor#snapshot";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        return l0.j.f(dVar);
    }

    public final void d() {
        if (this.f148716j && this.f148715i == 0) {
            LinkedHashMap linkedHashMap = this.f148714h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((c1) it.next()).close();
            }
            Iterator it3 = this.f148717k.iterator();
            while (it3.hasNext()) {
                ((a) it3.next()).a().d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            j jVar = this.f148707a;
            if (jVar.f148726a.getAndSet(false)) {
                t0.d.c(jVar.f148728c);
                jVar.h();
            }
            this.f148708b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.f148709c.execute(new fh2.a(this, 23, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.f148717k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a().d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i14) {
        float[] fArr2 = (float[]) fArr.clone();
        j0.r.a(i14, fArr2);
        j0.r.b(fArr2);
        Size sizeI = v.i(size, i14);
        j jVar = this.f148707a;
        jVar.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeI.getHeight() * sizeI.getWidth() * 4);
        k7.h.b(byteBufferAllocateDirect.capacity() == (sizeI.getHeight() * sizeI.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        k7.h.b(byteBufferAllocateDirect.isDirect(), "ByteBuffer is not direct.");
        int[] iArr = t0.d.f161627a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        t0.d.b("glGenTextures");
        int i15 = iArr2[0];
        GLES20.glActiveTexture(33985);
        t0.d.b("glActiveTexture");
        GLES20.glBindTexture(3553, i15);
        t0.d.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeI.getWidth(), sizeI.getHeight(), 0, 6407, 5121, null);
        t0.d.b("glTexImage2D");
        GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        t0.d.b("glGenFramebuffers");
        int i16 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i16);
        t0.d.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i15, 0);
        t0.d.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        t0.d.b("glActiveTexture");
        GLES20.glBindTexture(36197, jVar.f148738m);
        t0.d.b("glBindTexture");
        jVar.f148734i = null;
        GLES20.glViewport(0, 0, sizeI.getWidth(), sizeI.getHeight());
        GLES20.glScissor(0, 0, sizeI.getWidth(), sizeI.getHeight());
        t0.d.f fVar = jVar.f148736k;
        fVar.getClass();
        if (fVar instanceof t0.d.g) {
            GLES20.glUniformMatrix4fv(((t0.d.g) fVar).f161646f, 1, false, fArr2, 0);
            t0.d.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        t0.d.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeI.getWidth(), sizeI.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        t0.d.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i15}, 0);
        t0.d.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i16}, 0);
        t0.d.b("glDeleteFramebuffers");
        int i17 = jVar.f148738m;
        GLES20.glActiveTexture(33984);
        t0.d.b("glActiveTexture");
        GLES20.glBindTexture(36197, i17);
        t0.d.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeI.getWidth(), sizeI.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.f(bitmapCreateBitmap, byteBufferAllocateDirect, sizeI.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void h(u<Surface, Size, float[]> uVar) {
        ArrayList arrayList = this.f148717k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (uVar == null) {
            f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapG = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (iC != aVar.c() || bitmapG == null) {
                        iC = aVar.c();
                        if (bitmapG != null) {
                            bitmapG.recycle();
                        }
                        bitmapG = g(uVar.f128606b, uVar.f128607c, iC);
                        iB = -1;
                    }
                    if (iB != aVar.b()) {
                        byteArrayOutputStream.reset();
                        iB = aVar.b();
                        bitmapG.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = uVar.f128605a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.k(byteArray, surface);
                    aVar.a().b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e4) {
            f(e4);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f148711e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f148712f;
        surfaceTexture.getTransformMatrix(fArr);
        u<Surface, Size, float[]> uVar = null;
        for (Map.Entry entry : this.f148714h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            c1 c1Var = (c1) entry.getKey();
            float[] fArr2 = this.f148713g;
            c1Var.i0(fArr2, fArr);
            if (c1Var.getFormat() == 34) {
                try {
                    this.f148707a.j(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException unused) {
                }
            } else {
                k7.h.f(c1Var.getFormat() == 256, "Unsupported format: " + c1Var.getFormat());
                k7.h.f(uVar == null, "Only one JPEG output is supported.");
                uVar = new u<>(surface, c1Var.getSize(), (float[]) fArr2.clone());
            }
        }
        try {
            h(uVar);
        } catch (RuntimeException e4) {
            f(e4);
        }
    }

    @Override // r0.q
    public final void release() {
        if (this.f148711e.getAndSet(true)) {
            return;
        }
        e(new po.g(this, 11), new ab2.a(9));
    }

    public e(b0 b0Var) {
        this(b0Var, Collections.EMPTY_MAP);
    }
}
