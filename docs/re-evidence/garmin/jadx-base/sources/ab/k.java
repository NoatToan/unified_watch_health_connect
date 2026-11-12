package ab;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.media3.common.util.GlUtil;
import fa.v;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class k extends GLSurfaceView {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f2478l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f2479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SensorManager f2480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sensor f2481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f2482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f2483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f2484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f2485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Surface f2486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2489k;

    public final class a implements GLSurfaceView.Renderer, l.a, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f2490a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f2493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float[] f2494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float[] f2495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f2497h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f2491b = new float[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f2492c = new float[16];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float[] f2498i = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float[] f2499j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f2493d = fArr;
            float[] fArr2 = new float[16];
            this.f2494e = fArr2;
            float[] fArr3 = new float[16];
            this.f2495f = fArr3;
            this.f2490a = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f2497h = 3.1415927f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Long lD;
            synchronized (this) {
                Matrix.multiplyMM(this.f2499j, 0, this.f2493d, 0, this.f2495f, 0);
                Matrix.multiplyMM(this.f2498i, 0, this.f2494e, 0, this.f2499j, 0);
            }
            Matrix.multiplyMM(this.f2492c, 0, this.f2491b, 0, this.f2498i, 0);
            i iVar = this.f2490a;
            float[] fArr2 = this.f2492c;
            iVar.getClass();
            GLES20.glClear(16384);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e4) {
                fa.k.d("Failed to draw a frame", e4);
            }
            if (iVar.f2462a.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = iVar.f2471j;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    GlUtil.b();
                } catch (GlUtil.GlException e14) {
                    fa.k.d("Failed to draw a frame", e14);
                }
                if (iVar.f2463b.compareAndSet(true, false)) {
                    Matrix.setIdentityM(iVar.f2468g, 0);
                }
                long timestamp = iVar.f2471j.getTimestamp();
                v<Long> vVar = iVar.f2466e;
                synchronized (vVar) {
                    lD = vVar.d(timestamp, false);
                }
                Long l14 = lD;
                if (l14 != null) {
                    c cVar = iVar.f2465d;
                    float[] fArr3 = iVar.f2468g;
                    float[] fArrF = cVar.f2428c.f(l14.longValue());
                    if (fArrF != null) {
                        float[] fArr4 = cVar.f2427b;
                        float f14 = fArrF[0];
                        float f15 = -fArrF[1];
                        float f16 = -fArrF[2];
                        float length = Matrix.length(f14, f15, f16);
                        if (length != 0.0f) {
                            Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f14 / length, f15 / length, f16 / length);
                        } else {
                            Matrix.setIdentityM(fArr4, 0);
                        }
                        if (!cVar.f2429d) {
                            c.a(cVar.f2426a, cVar.f2427b);
                            cVar.f2429d = true;
                        }
                        Matrix.multiplyMM(fArr3, 0, cVar.f2426a, 0, cVar.f2427b, 0);
                    }
                }
                e eVarF = iVar.f2467f.f(timestamp);
                if (eVarF != null) {
                    g gVar = iVar.f2464c;
                    gVar.getClass();
                    if (g.b(eVarF)) {
                        gVar.f2449a = eVarF.f2439c;
                        gVar.f2450b = new g.a(eVarF.f2437a.f2441a[0]);
                        if (!eVarF.f2440d) {
                            new g.a(eVarF.f2438b.f2441a[0]);
                        }
                    }
                }
            }
            Matrix.multiplyMM(iVar.f2469h, 0, fArr2, 0, iVar.f2468g, 0);
            g gVar2 = iVar.f2464c;
            int i14 = iVar.f2470i;
            float[] fArr5 = iVar.f2469h;
            g.a aVar = gVar2.f2450b;
            if (aVar == null) {
                return;
            }
            int i15 = gVar2.f2449a;
            if (i15 == 1) {
                fArr = g.f2447j;
            } else {
                fArr = i15 == 2 ? g.f2448k : g.f2446i;
            }
            GLES20.glUniformMatrix3fv(gVar2.f2453e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(gVar2.f2452d, 1, false, fArr5, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i14);
            GLES20.glUniform1i(gVar2.f2456h, 0);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException unused) {
            }
            GLES20.glVertexAttribPointer(gVar2.f2454f, 3, 5126, false, 12, (Buffer) aVar.f2458b);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException unused2) {
            }
            GLES20.glVertexAttribPointer(gVar2.f2455g, 2, 5126, false, 8, (Buffer) aVar.f2459c);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException unused3) {
            }
            GLES20.glDrawArrays(aVar.f2460d, 0, aVar.f2457a);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException unused4) {
            }
        }

        @Override // ab.d.a
        public final synchronized void onOrientationChange(float[] fArr, float f14) {
            float[] fArr2 = this.f2493d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f15 = -f14;
            this.f2497h = f15;
            Matrix.setRotateM(this.f2494e, 0, -this.f2496g, (float) Math.cos(f15), (float) Math.sin(this.f2497h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i14, int i15) {
            GLES20.glViewport(0, 0, i14, i15);
            float f14 = i14 / i15;
            Matrix.perspectiveM(this.f2491b, 0, f14 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f14))) * 2.0d) : 90.0f, f14, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            k kVar = k.this;
            kVar.f2483e.post(new j(0, kVar, this.f2490a.b()));
        }
    }

    public interface b {
        void b();

        void onVideoSurfaceCreated(Surface surface);
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2479a = new CopyOnWriteArrayList<>();
        this.f2483e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f2480b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f2481c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f2484f = iVar;
        a aVar = new a(iVar);
        View.OnTouchListener lVar = new l(context, aVar, 25.0f);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f2482d = new d(windowManager.getDefaultDisplay(), lVar, aVar);
        this.f2487i = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z14 = this.f2487i && this.f2488j;
        Sensor sensor = this.f2481c;
        if (sensor == null || z14 == this.f2489k) {
            return;
        }
        d dVar = this.f2482d;
        SensorManager sensorManager = this.f2480b;
        if (z14) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.f2489k = z14;
    }

    public ab.a getCameraMotionListener() {
        return this.f2484f;
    }

    public za.f getVideoFrameMetadataListener() {
        return this.f2484f;
    }

    public Surface getVideoSurface() {
        return this.f2486h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2483e.post(new a0.c(this, 3));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f2488j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f2488j = true;
        a();
    }

    public void setDefaultStereoMode(int i14) {
        this.f2484f.f2472k = i14;
    }

    public void setUseSensorRotation(boolean z14) {
        this.f2487i = z14;
        a();
    }

    public k(Context context) {
        this(context, null);
    }
}
