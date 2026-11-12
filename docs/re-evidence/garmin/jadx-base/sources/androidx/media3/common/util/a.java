package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f8508g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f8509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f8510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f8511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLContext f8512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLSurface f8513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f8514f;

    /* JADX INFO: renamed from: androidx.media3.common.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0119a {
    }

    public a(Handler handler, InterfaceC0119a interfaceC0119a) {
        this.f8509a = handler;
        this.f8510b = new int[1];
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8509a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f8514f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public a(Handler handler) {
        this(handler, null);
    }
}
