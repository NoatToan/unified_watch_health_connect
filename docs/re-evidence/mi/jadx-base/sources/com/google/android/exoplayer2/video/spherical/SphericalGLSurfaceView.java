package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import defpackage.arq;
import defpackage.mh3;
import defpackage.rk1;
import defpackage.vel;
import defpackage.wlq;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes4.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f8462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SensorManager f8463b;
    public final Sensor c;
    public final com.google.android.exoplayer2.video.spherical.a d;
    public final Handler e;
    public final com.google.android.exoplayer2.video.spherical.b f;
    public final vel g;
    public SurfaceTexture h;
    public Surface i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8464k;
    public boolean l;

    @VisibleForTesting
    public final class a implements GLSurfaceView.Renderer, com.google.android.exoplayer2.video.spherical.b.a, com.google.android.exoplayer2.video.spherical.a.InterfaceC0208a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final vel f8465a;
        public final float[] d;
        public final float[] e;
        public final float[] f;
        public float g;
        public float h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f8466b = new float[16];
        public final float[] c = new float[16];
        public final float[] i = new float[16];
        public final float[] j = new float[16];

        public a(vel velVar) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.f8465a = velVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.h = 3.1415927f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.a.InterfaceC0208a
        public synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.h = -f;
            d();
        }

        @Override // com.google.android.exoplayer2.video.spherical.b.a
        public synchronized void b(PointF pointF) {
            this.g = pointF.y;
            d();
            Matrix.setRotateM(this.f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public final float c(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d);
            }
            return 90.0f;
        }

        public final void d() {
            Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(this.h), (float) Math.sin(this.h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
            }
            Matrix.multiplyMM(this.c, 0, this.f8466b, 0, this.i, 0);
            this.f8465a.e(this.c, false);
        }

        @Override // com.google.android.exoplayer2.video.spherical.b.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f8466b, 0, c(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.g(this.f8465a.f());
        }
    }

    public interface b {
        void l(Surface surface);

        void n(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public void d(b bVar) {
        this.f8462a.add(bVar);
    }

    public final /* synthetic */ void e() {
        Surface surface = this.i;
        if (surface != null) {
            Iterator<b> it = this.f8462a.iterator();
            while (it.hasNext()) {
                it.next().l(surface);
            }
        }
        h(this.h, surface);
        this.h = null;
        this.i = null;
    }

    public final /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.h;
        Surface surface = this.i;
        Surface surface2 = new Surface(surfaceTexture);
        this.h = surfaceTexture;
        this.i = surface2;
        Iterator<b> it = this.f8462a.iterator();
        while (it.hasNext()) {
            it.next().n(surface2);
        }
        h(surfaceTexture2, surface);
    }

    public final void g(final SurfaceTexture surfaceTexture) {
        this.e.post(new Runnable() { // from class: a6n
            @Override // java.lang.Runnable
            public final void run() {
                this.f690a.f(surfaceTexture);
            }
        });
    }

    public mh3 getCameraMotionListener() {
        return this.g;
    }

    public arq getVideoFrameMetadataListener() {
        return this.g;
    }

    public Surface getVideoSurface() {
        return this.i;
    }

    public void i(b bVar) {
        this.f8462a.remove(bVar);
    }

    public final void j() {
        boolean z = this.j && this.f8464k;
        Sensor sensor = this.c;
        if (sensor == null || z == this.l) {
            return;
        }
        if (z) {
            this.f8463b.registerListener(this.d, sensor, 0);
        } else {
            this.f8463b.unregisterListener(this.d);
        }
        this.l = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new Runnable() { // from class: b6n
            @Override // java.lang.Runnable
            public final void run() {
                this.f3866a.e();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f8464k = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f8464k = true;
        j();
    }

    public void setDefaultStereoMode(int i) {
        this.g.h(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.j = z;
        j();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8462a = new CopyOnWriteArrayList<>();
        this.e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) rk1.e(context.getSystemService("sensor"));
        this.f8463b = sensorManager;
        Sensor defaultSensor = wlq.f38110a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        vel velVar = new vel();
        this.g = velVar;
        a aVar = new a(velVar);
        com.google.android.exoplayer2.video.spherical.b bVar = new com.google.android.exoplayer2.video.spherical.b(context, aVar, 25.0f);
        this.f = bVar;
        this.d = new com.google.android.exoplayer2.video.spherical.a(((WindowManager) rk1.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), bVar, aVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(bVar);
    }
}
