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
import androidx.annotation.AnyThread;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    private static final int m = 90;
    private static final float n = 0.1f;
    private static final float o = 100.0f;
    private static final float p = 25.0f;
    public static final float q = 3.1415927f;
    private final CopyOnWriteArrayList<VideoSurfaceListener> a;
    private final SensorManager b;

    @Nullable
    private final Sensor c;
    private final OrientationListener d;
    private final Handler e;
    private final TouchTracker f;
    private final e g;

    @Nullable
    private SurfaceTexture h;

    @Nullable
    private Surface i;
    private boolean j;
    private boolean k;
    private boolean l;

    public interface VideoSurfaceListener {
        void onVideoSurfaceCreated(Surface surface);

        void onVideoSurfaceDestroyed(Surface surface);
    }

    @VisibleForTesting
    public final class a implements GLSurfaceView.Renderer, TouchTracker.Listener, OrientationListener.Listener {
        private final e a;
        private final float[] d;
        private final float[] e;
        private final float[] f;
        private float g;
        private float h;
        private final float[] b = new float[16];
        private final float[] c = new float[16];
        private final float[] i = new float[16];
        private final float[] j = new float[16];

        public a(e scene) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.a = scene;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.h = 3.1415927f;
        }

        private float a(float aspect) {
            if (aspect > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) aspect))) * 2.0d);
            }
            return 90.0f;
        }

        @AnyThread
        private void b() {
            Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(this.h), (float) Math.sin(this.h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl) {
            synchronized (this) {
                Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
            }
            Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
            this.a.b(this.c, false);
        }

        @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
        @BinderThread
        public synchronized void onOrientationChange(float[] matrix, float deviceRoll) {
            float[] fArr = this.d;
            System.arraycopy(matrix, 0, fArr, 0, fArr.length);
            this.h = -deviceRoll;
            b();
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        @UiThread
        public synchronized void onScrollChange(PointF scrollOffsetDegrees) {
            this.g = scrollOffsetDegrees.y;
            b();
            Matrix.setRotateM(this.f, 0, -scrollOffsetDegrees.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        @UiThread
        public boolean onSingleTapUp(MotionEvent event) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl, int width, int height) {
            GLES20.glViewport(0, 0, width, height);
            float f = width / height;
            Matrix.perspectiveM(this.b, 0, a(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl, EGLConfig config) {
            SphericalGLSurfaceView.this.f(this.a.c());
        }
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Surface surface = this.i;
        if (surface != null) {
            Iterator<VideoSurfaceListener> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().onVideoSurfaceDestroyed(surface);
            }
        }
        g(this.h, surface);
        this.h = null;
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.h;
        Surface surface = this.i;
        Surface surface2 = new Surface(surfaceTexture);
        this.h = surfaceTexture;
        this.i = surface2;
        Iterator<VideoSurfaceListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onVideoSurfaceCreated(surface2);
        }
        g(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(final SurfaceTexture newSurfaceTexture) {
        this.e.post(new Runnable() { // from class: r77
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e(newSurfaceTexture);
            }
        });
    }

    private static void g(@Nullable SurfaceTexture oldSurfaceTexture, @Nullable Surface oldSurface) {
        if (oldSurfaceTexture != null) {
            oldSurfaceTexture.release();
        }
        if (oldSurface != null) {
            oldSurface.release();
        }
    }

    private void h() {
        boolean z = this.j && this.k;
        Sensor sensor = this.c;
        if (sensor == null || z == this.l) {
            return;
        }
        if (z) {
            this.b.registerListener(this.d, sensor, 0);
        } else {
            this.b.unregisterListener(this.d);
        }
        this.l = z;
    }

    public void addVideoSurfaceListener(VideoSurfaceListener listener) {
        this.a.add(listener);
    }

    public CameraMotionListener getCameraMotionListener() {
        return this.g;
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return this.g;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new Runnable() { // from class: q77
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.k = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.k = true;
        h();
    }

    public void removeVideoSurfaceListener(VideoSurfaceListener listener) {
        this.a.remove(listener);
    }

    public void setDefaultStereoMode(int stereoMode) {
        this.g.e(stereoMode);
    }

    public void setUseSensorRotation(boolean useSensorRotation) {
        this.j = useSensorRotation;
        h();
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new CopyOnWriteArrayList<>();
        this.e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) Assertions.checkNotNull(context.getSystemService("sensor"));
        this.b = sensorManager;
        Sensor defaultSensor = Util.SDK_INT >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        e eVar = new e();
        this.g = eVar;
        a aVar = new a(eVar);
        TouchTracker touchTracker = new TouchTracker(context, aVar, 25.0f);
        this.f = touchTracker;
        this.d = new OrientationListener(((WindowManager) Assertions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), touchTracker, aVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(touchTracker);
    }
}
