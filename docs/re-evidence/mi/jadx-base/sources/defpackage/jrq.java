package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.work.Data;

/* JADX INFO: loaded from: classes10.dex */
public class jrq implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SurfaceTexture f23075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Surface f23076b;
    public int c = b();
    public final Object d = new Object();
    public boolean e;

    public jrq(int i, int i2) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.c);
        this.f23075a = surfaceTexture;
        if (i != -1 && i2 != -1) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this.f23076b = new Surface(this.f23075a);
        this.f23075a.setOnFrameAvailableListener(this);
    }

    public void a() {
        synchronized (this.d) {
            while (!this.e) {
                try {
                    this.d.wait(10000L);
                    if (!this.e) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.e = false;
        }
        wza.a("before updateTexImage");
        this.f23075a.updateTexImage();
    }

    public final int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        wza.a("glBindTexture textureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        wza.a("glTexParameter");
        return i;
    }

    public Surface c() {
        return this.f23076b;
    }

    public int d() {
        return this.c;
    }

    public float[] e() {
        float[] fArr = new float[16];
        this.f23075a.getTransformMatrix(fArr);
        return fArr;
    }

    public void f() {
        Surface surface = this.f23076b;
        if (surface != null) {
            surface.release();
            this.f23076b = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    throw new RuntimeException("frameAvailable already set, frame could be dropped");
                }
                this.e = true;
                this.d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
